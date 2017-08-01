import java.util.HashMap;
import java.util.Map;

/**
 * Created by dmg01 on 7/14/2017.
 */
public class Board {
    public static Map<String, Space> gameBoard = new HashMap<String, Space>();

    public static void setGameBoard(String spaceName, Space gameSpace){
        gameBoard.put(spaceName, gameSpace);
    }

    public static Space getSpace(String spaceName){
        return gameBoard.get(spaceName);
    }

    public void setBoard(){
        String[] connections = new String[6];
        Space gameSpace;

        connections[0] = ("B");
        connections[1] = ("D");
        connections[2] = ("Z");
        gameSpace = new Space("A",connections, 0,1);      // Create Space Object
        setGameBoard("A",gameSpace);                       // Create a 'Map' entry for the Key="Space" and the object=gameSpace

        connections = new String[6];
        connections[0] = ("A");
        connections[1] = ("C");
        connections[2] = ("D");
        connections[3] = ("Z");
        gameSpace = new Space("B",connections, 999,1);      // Create Space Object
        setGameBoard("B",gameSpace);                       // Create a 'Map' entry for the Key="Space" and the object=gameSpace

        connections = new String[6];
        connections[0] = ("B");
        connections[1] = ("E");
        connections[2] = ("I");
        connections[3] = ("Z");
        gameSpace = new Space("C",connections, 999,1);      // Create Space Object
        setGameBoard("C",gameSpace);                       // Create a 'Map' entry for the Key="Space" and the object=gameSpace

        connections = new String[6];
        connections[0] = ("A");
        connections[1] = ("B");
        connections[2] = ("E");
        connections[3] = ("F");
        connections[4] = ("G");
        connections[5] = ("Z");
        gameSpace = new Space("D",connections, 999,1);      // Create Space Object
        setGameBoard("D",gameSpace);                       // Create a 'Map' entry for the Key="Space" and the object=gameSpace

        connections = new String[6];
        connections[0] = ("C");
        connections[1] = ("D");
        connections[2] = ("H");
        connections[3] = ("Z");
        gameSpace = new Space("E",connections, 999,1);      // Create Space Object
        setGameBoard("E",gameSpace);                       // Create a 'Map' entry for the Key="Space" and the object=gameSpace

        connections = new String[6];
        connections[0] = ("D");
        connections[1] = ("G");
        connections[2] = ("Z");
        gameSpace = new Space("F",connections, 999,1);      // Create Space Object
        setGameBoard("F",gameSpace);                       // Create a 'Map' entry for the Key="Space" and the object=gameSpace

        connections = new String[6];
        connections[0] = ("D");
        connections[1] = ("F");
        connections[2] = ("H");
        connections[3] = ("Z");
        gameSpace = new Space("G",connections, 999,1);      // Create Space Object
        setGameBoard("G",gameSpace);                       // Create a 'Map' entry for the Key="Space" and the object=gameSpace

        connections = new String[6];
        connections[0] = ("E");
        connections[1] = ("G");
        connections[2] = ("K");
        connections[3] = ("Z");
        gameSpace = new Space("H",connections, 999,1);      // Create Space Object
        setGameBoard("H",gameSpace);                       // Create a 'Map' entry for the Key="Space" and the object=gameSpace

        // ------------------------------

        connections = new String[6];
        connections[0] = ("C");
        connections[1] = ("J");
        connections[2] = ("Z");
        gameSpace = new Space("I",connections, 999,1);      // Create Space Object
        setGameBoard("I",gameSpace);                       // Create a 'Map' entry for the Key="Space" and the object=gameSpace

        connections = new String[6];
        connections[0] = ("I");
        connections[1] = ("K");
        connections[2] = ("Z");
        gameSpace = new Space("J",connections, 999,1);      // Create Space Object
        setGameBoard("J",gameSpace);                       // Create a 'Map' entry for the Key="Space" and the object=gameSpace

        connections = new String[6];
        connections[0] = ("H");
        connections[1] = ("J");
        connections[2] = ("L");
        connections[3] = ("Z");
        gameSpace = new Space("K",connections, 999,1);      // Create Space Object
        setGameBoard("K",gameSpace);                       // Create a 'Map' entry for the Key="Space" and the object=gameSpace

        // ------------------------------

        connections = new String[6];
        connections[0] = ("K");
        connections[1] = ("M");
        connections[2] = ("Z");
        gameSpace = new Space("L",connections, 999,1);      // Create Space Object
        setGameBoard("L",gameSpace);                       // Create a 'Map' entry for the Key="Space" and the object=gameSpace

        connections = new String[6];
        connections[0] = ("L");
        connections[1] = ("Z");
        gameSpace = new Space("M",connections, 999,1);      // Create Space Object
        setGameBoard("M",gameSpace);                       // Create a 'Map' entry for the Key="Space" and the object=gameSpace
    }
}
