public interface Interface extends ParentInterface {

    /**
     * Implement this interface to make your own tester for whether a node
     * should be involved in the comparison or not. For example, you could
     * ignore all "notes" nodes with the following tester:
     * <pre>
     *
     * {@code
     * new IgnoreTester() {
     *     public boolean ignore(Node node) {
     *        return node.getNodeName().equals("notes") &&
     *               node instanceof Element;
     *    }
     * }
     * }
     * </pre>
     */
    void function_2();
    
}