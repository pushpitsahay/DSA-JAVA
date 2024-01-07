// https://leetcode.com/problems/design-hashset/
class MyHashSet{
    HashSet<Integer> set=new HashSet<>();

    public MyHashSet(){
    }
    public void add(int key){
        set.add(key);
    }
    public void remove(int key){
        set.remove(key);
    }
    public boolean contains(int key){
        if(set.contains(key)) return true;
        else return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
