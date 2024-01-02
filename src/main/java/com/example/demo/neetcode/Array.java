package main.java.com.example.demo.neetcode;

public class Array<E> {

    private E[] data;
    private int size;
    public Array(int capacity){
        data= (E[]) new Object[capacity];
        size=0;
    }
    public Array(){
        // use this to call another constructor in the same class:
        this(10);
    }
   // 获取数组中的元素个数
   public int getSize(){
        return size;
   }
    // 获取数组中的元素
    public E getElement(int index){
        if(index<0 || index>size)
            throw new IllegalArgumentException("index is not legitimate");
        return data[index];
    }
   // 获取数组容量
   public int getCapacity(){
       return data.length;
   }
   // 返回数组是否为空
    public boolean isEmpty(){
        return size==0;
    }
    // 向第index个位置插入一个新元素e
    public void add(int index,E e){
        if(index<0 || index>size)
            throw new IllegalArgumentException("index is not legitimate");
        if(size==data.length)
            reSize(2*data.length);
        for(int i=size-1;i>=index;i--){
            data[i+1]=data[i];
        }
        data[index]=e;
        size++;
    }
    // 从数组删除第index个元素
    public E remove(int index){
        if(index<0 || index>=size)
            throw new IllegalArgumentException("index is not legitimate");
        E ret=data[index];
        for(int i=index;i<size-1;i++){
            data[i]=data[i+1];
        }
        size--;
        if(size<=0.25*data.length)
            reSize(data.length/2);
        return ret;
    }
    // 添加一个元素到末尾
    public void add(E e){
        add(size,e);
    }



    // 删除第一个元素
    public E removeFirst(){
        return remove(0);
    }

    // 删除最后一个元素
    public E removeLast(){
        return remove(size-1);
    }

    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("length:"+data.length+", size:"+size);
        sb.append("[");
        for(int i=0;i<size;i++){
            sb.append(data[i]);
            if(i!=size-1){
                sb.append(",");
            }else {
                sb.append("]");
            }
        }
        return sb.toString();
    }

    private void reSize(int newCapacity){
        E[] arr= (E[]) new Object[newCapacity];
        for(int i=0;i<=size-1;i++){
            arr[i]=data[i];
        }
        data=arr;
    }


    public static void main(String[] args) {
        Array array=new Array();
        for(int i=0;i<=5;i++){
            array.add(i);
        }
        System.out.println(array);
        array.removeLast();
        System.out.println(array);
        array.removeFirst();
        System.out.println(array);
        array.add(2,8);
        System.out.println(array);
        array.removeLast();
        array.removeLast();
        array.removeLast();
        System.out.println(array);
    }
}
