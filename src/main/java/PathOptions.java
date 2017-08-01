import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by dmg01 on 7/13/2017.
 */
public class PathOptions {
    Queue<String> nodeQueue = new LinkedList();
    List<String> processedNodes = new ArrayList<String>();

    public int nodeDriver(String currentPosition, String target){                        // Driver method to iterate through all nodes of the given board
        nodeQueue.add(currentPosition);                                                     // Adds the initial node to the Queue
        while ( !nodeQueue.isEmpty()) {
            currentPosition = nodeQueue.remove();                                           // Read and remove the next Queue entry
            if (!processedNodes.contains(currentPosition)){                                 // Check to only process each node one time only
                findShortestPath(currentPosition, target);
                processedNodes.add(new String(currentPosition));
                System.out.println("     Node Processed : " + currentPosition);
            }
        }
        Space nodeSpace = Board.getSpace(target);                                           // Re-Instantiate the target node object
        return nodeSpace.getNodeDistance();                                                 // Return the shortest path value from the target node object
    }

    public void findShortestPath(String startingNode, String findShortestTarget){        // Find the Shortest Path method
        Space nodeSpace = Board.getSpace(startingNode);                                     // Re-Instantiate the current space object being processed
        String[] findShortestEdgeConnections = nodeSpace.getConnectionsx();                 // Retrieve the connecting nodes to this current node being processed
        String findShortestCurrentPosition;
        int startingNodeDistance;
        int toNodeDistance;
        int endingNodeDistance;

        startingNodeDistance = nodeSpace.getNodeDistance();                                 // Retrieve the node base distance for this current node being processed

        for (int x=0; x<findShortestEdgeConnections.length; x++){                           // Loop through the connecting nodes
            findShortestCurrentPosition = findShortestEdgeConnections[x];                      // Retrieve the connecting node name
            if (!findShortestCurrentPosition.equals("Z")){                                     // Check for the end of the connections

                System.out.println("Checking Edge " + findShortestCurrentPosition);

                if (!processedNodes.contains(findShortestCurrentPosition)){                    // Verify that this connecting node has not already been processed
                    Space connectingNodeSpace = Board.getSpace(findShortestCurrentPosition);   // Re-Instantiate the connecting node object
                    toNodeDistance = connectingNodeSpace.getEdgeDistance();                    // Retrieve the "To Node" distance
                    endingNodeDistance = connectingNodeSpace.getNodeDistance();                // Retrieve the "Ending Node" distance

                    if ( ( startingNodeDistance + toNodeDistance ) < endingNodeDistance ){              // Update the smaller distance between existing and
                        connectingNodeSpace.setNodeDistance((startingNodeDistance + toNodeDistance));   // Base-Node-Distance + the Edge Distance
                    }
                    if (!findShortestCurrentPosition.equals(findShortestTarget)){              // Verify that the connecting node being processed is not the target
                        if (!processedNodes.contains(findShortestCurrentPosition)) {           // Verify that the connecting node being processed has not already been processed
                            nodeQueue.add(findShortestCurrentPosition);                           // Add this connecting node to the "Nodes-To-Be-Processed" Queue
                        }
                    }
                }
            } else {
                return;
            }
        }
    }
}
