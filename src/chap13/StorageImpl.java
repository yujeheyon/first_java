package chap13;

public class StorageImpl<T> implements Storage<T>
{
    private String name;
    private T[] students;

    public StorageImpl(String name, int capacity)
    {
        this.name = name;
        students = (T[]) (new Object[capacity]);
    }

    public String getName() { return name; }

    public T[] getStudents() { return students; }

    @Override
    public void add(T item, int index)
    {
        students[index] = item;
    }

    @Override
    public T get(int index)
    {
        return students[index];
    }
}
