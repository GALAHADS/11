import java.util.HashMap;
import java.util.Iterator;

public class XHashSet<T> implements XSet<T>{

    private HashMap<T,Boolean> map = new HashMap<T,Boolean>();

    @Override
    public boolean add(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public boolean remove(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public boolean contains(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public XSet<T> union(XSet<T> other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'union'");
    }

    @Override
    public XSet<T> intersection(XSet<T> other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'intersection'");
    }

    @Override
    public XSet<T> difference(XSet<T> other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'difference'");
    }

    @Override
    public XSet<T> symmetricDifference(XSet<T> other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'symmetricDifference'");
    }

    @Override
    public boolean isSubsetOf(XSet<T> other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isSubsetOf'");
    }

    @Override
    public boolean isSupersetOf(XSet<T> other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isSupersetOf'");
    }

    @Override
    public XSet<T> copy() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'copy'");
    }


    public static void main(String[] args) {
        XSet<Integer> set = new XHashSet<>();

set.add(10);
set.add(20);
set.add(10); // 중복 허용 안 됨

System.out.println(set.contains(10)); // 출력: true
System.out.println(set.contains(30)); // 출력: false
System.out.println(set.size()); // 출력: 2

set.remove(10);
System.out.println(set.contains(10)); // 출력: false
XSet<Integer> setA = new XHashSet<>();
setA.add(1);
setA.add(2);

XSet<Integer> setB = new XHashSet<>();
setB.add(2);
setB.add(3);

XSet<Integer> unionSet = setA.union(setB);
System.out.println(unionSet.size()); // 출력: 3 (1,2,3)

XSet<Integer> intersectionSet = setA.intersection(setB);
System.out.println(intersectionSet.size()); // 출력: 1 (2)

XSet<Integer> differenceSet = setA.difference(setB);
System.out.println(differenceSet.size()); // 출력: 1 (1)


        
    }
    
}
