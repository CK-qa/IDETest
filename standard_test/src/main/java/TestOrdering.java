public enum TestOrdering {
    ;

    public static class OrderIncorrect {
        public Object createString() {
            return new Object() {
                @Override
                public int hashCode() {
                    return 42;
                }

                @Override
                public String toString() {
                    return "";
                }
            };
        }

        public Object createObject() {
            return new Object() {
                private String shouldBeOrderedLast() {
                    return "";
                }

                @Override
                public int hashCode() {
                    return 32;
                }
            };
        }
    }
}