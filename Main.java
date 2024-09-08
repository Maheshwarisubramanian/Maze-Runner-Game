package mazeRunner;

public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[][] triggers = {{5, 2}, {2, 5}};
        Maze maze = new Maze(6, 6, triggers);
        maze.putTreasure(2, 4);
        maze.putMonster(1, 2);
        maze.putMonster(2, 2);
        maze.putMonster(3, 2);
        maze.putMonster(4, 2);
        maze.putMonster(5, 2);

        int shortestPath = maze.shortestPath(5, 1);
        System.out.println("The shortest path is : " + shortestPath);

	}

}
