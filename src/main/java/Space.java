/**
 * Created by dmg01 on 7/14/2017.
 */
public class Space {
    private String spaceName;
    private String connectionsx[] = new String[6];
    private int nodeDistance;
    private int edgeDistance;

    public Space(String spaceName, String[] connectionsx, int nodeDistance, int edgeDistance) {
        this.spaceName = spaceName;                 // Name of this node
        this.connectionsx = connectionsx;           // Array of nodes that are touching to this node
        this.nodeDistance = nodeDistance;           // Current distance count up to this node
        this.edgeDistance = edgeDistance;           // Edge Distance
    }

    public String[] getConnectionsx() {
        return connectionsx;
    }

    public int getNodeDistance() {
        return nodeDistance;
    }

    public void setNodeDistance(int nodeDistance) {
        this.nodeDistance = nodeDistance;
    }

    public int getEdgeDistance() {
        return edgeDistance;
    }
}
