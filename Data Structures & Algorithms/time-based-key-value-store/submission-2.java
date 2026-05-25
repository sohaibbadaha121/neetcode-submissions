class TimeMap {
    private Map<String , List<Box<Integer,String>>> store;
    public TimeMap() {
        store = new HashMap<>() ;
    }
    
    public void set(String key, String value, int timestamp) {
        store.computeIfAbsent(key, k -> new ArrayList<>()).add(new Box<>(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        List<Box<Integer,String>> vaules = store.getOrDefault(key, new ArrayList<>());
        int l = 0 ;
        int r = vaules.size() - 1 ;
        String result = "" ;
        while(l<=r){
            int m = (l+r) / 2 ;
            if(vaules.get(m).getKey()<=timestamp){
                result = vaules.get(m).getValue();
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        return result ;
    }
      private static class Box<K, V> {
        private final K key;
        private final V value;

        public Box(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}
