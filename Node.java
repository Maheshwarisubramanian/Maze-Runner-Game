package mazeRunner;

public class Node {

	
	int row, column, steps; // Position and steps taken to reach this node
    Node previous; // Previous node in the path

    public Node(int row, int column, int steps, Node previous) 
    {
        this.row = row;
        this.column = column;
        this.steps = steps;
        this.previous = previous;
    }
	

}
