/**
 * 自实现顺序线性表
 * V1.0
 */
public class ArrayList {

    private Object[] mDataList = null;
    private int size = 0;
    private int currentIndex = 0;

    public ArrayList() {
        size = 30;
        mDataList = new Object[size];
    }

    /**
     * 查看大小
     * 
     * @return
     */
    public int size() {
        return currentIndex;
    }

    /**
     * 判断是否为空
     * 
     * @return
     */
    public boolean isEmpty() {
        return currentIndex == 0;
    }

    /**
     * 添加元素
     * 
     * @param e
     * @return
     */
    public boolean add(Object e) {
        if (currentIndex >= size - 1) {
            System.out.println("表已装满，请重新创建表");
            return false;
        }
        mDataList[currentIndex] = e;
        currentIndex += 1;
        return true;
    }

    /**
     * 删除元素
     * 
     * @param o
     * @return
     */
    public boolean remove(Object o) {
        int index = indexOf(o); 
        if (index >= 0) {
            for (int i = index; i < currentIndex - 1; i++) {
                mDataList[i] = mDataList[i + 1];
            }
        } else {
            System.out.println("删除失败，没有找到对应元素。");
            return false;
        }
        currentIndex -= 1;
        return true;
    }

    /**
     * 情清空
     */
    public void clear() {
        currentIndex = 0;
    }

    /**
     * 获取元素
     * 
     * @param index
     * @return
     */
    public Object get(int index) {
        // if(index<size){
        // return mDataList[index];
        // }else{
        // System.out.println("数组越界");
        // return null;
        // }
        if (index < 0 && index >= currentIndex) {
            System.out.println("没有找到数据");
            return null;
        }
        return mDataList[index];
    }

    /**
     * 插入元素
     * 
     * @param index
     * @param element
     * @return 插入位置之前保存的元素
     */
    public Object set(int index, Object element) {
        if (index < 0 && index >= size) {
            System.out.println("数组越界");
            return null;
        }
        // if(index<=currentIndex){

        // }
        Object obj = mDataList[index];
        mDataList[index] = element;
        return obj;
    }

    /**
     * 查询元素位置
     * 
     * @param o
     * @return
     */
    public int indexOf(Object o) {
        for (int i = 0; i < currentIndex; i++) {
            if (mDataList[i] == o || mDataList.equals(o)) {
                return i;
            }
        }
        return -1;

    }

    /**
     * 显示所有数据
     */
    public void display() {
        // for (Object object : mDataList) {
        // System.out.println(object);
        // }
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(mDataList[i]);
        }

    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.display();
    }

}