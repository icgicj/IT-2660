class Main {
  public static void main(String[] args) {
    String[] vertices = {
      "Liberal Arts",
      "Student Services",
      "Health Careers & Sciences",
      "Health Technologies Center",
      "Recreation Center",
      "Technology Learning Center",
      "Business & Technology",
      "Theatre"
    };

    int[][] edges = {
      {0, 1},  // Liberal Arts <-> Student Services
      {1, 2},  // Student Services <-> Health Careers & Sciences
      {1, 3},  // Student Services <-> Health Technologies Center
      {2, 3},  // Health Careers & Sciences <-> Health Technologies Center
      {3, 4},  // Health Technologies Center <-> Recreation Center
      {4, 5},  // Recreation Center <-> Technology Learning Center
      {5, 6},  // Technology Learning Center <-> Business & Technology
      {6, 7},  // Business & Technology <-> Theatre
    };

    Graph<String> graph = new UnweightedGraph<>(vertices, edges);
    
    UnweightedGraph<String>.SearchTree dfs = graph.dfs(graph.getIndex("Business & Technology"));

    dfs.printPath(graph.getIndex("Health Technologies Center"));
    dfs.printPath(graph.getIndex("Student Services"));
    dfs.printPath(graph.getIndex("Recreation Center"));
    
    dfs.printTree();
    //Please let me know what to improve on next time regarding edges. Thank you!
  }
}
