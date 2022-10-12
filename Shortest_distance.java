public static class Node {
    int value;
    List<Node> children;
        
    public Node(int value) {
        this.value = value;
    }
        
    public void addChild(Node n) {
        if (this.children == null) this.children = new LinkedList<Node>();
        this.children.add(n);
    }
}
    
public static List<Node> shortestPath(Node a, Node b) {
    if (a == null || b == null) return null;
    if (a == b) return null;
        
    Queue<Node> toVisit = new LinkedList<Node>();
    HashMap<Node, Node> parents = new HashMap<Node, Node>();
    toVisit.add(a);
    parents.put(a, null);
        
    while (!toVisit.isEmpty()) {
        Node curr = toVisit.remove();
            
        if (curr == b) break;
            
        if (curr.children == null) continue;
            
        // Add all the children to the queue
        for (Node n : curr.children) {
            if (!parents.containsKey(n)) {
                toVisit.add(n);
                parents.put(n, curr);
            }
        }
    }
    
    if (parents.get(b) == null) return null;
    List<Node> out = new LinkedList<Node>();
    Node n = b;
    while (n != null) {
        out.add(0, n);
        n = parents.get(n);
    }
        
    return out;
}