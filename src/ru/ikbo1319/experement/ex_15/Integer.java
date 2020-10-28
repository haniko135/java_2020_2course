package ru.ikbo1319.experement.ex_15;

public class Integer {
    private int[] arr;
    private int size;

    public Integer(int s) {
        this.arr = new int[s];
    }

    public int getIndex(int i) {      //certain array element
        return arr[i];
    }

    public int getSize() {
        return size;
    }

    public void add(int k){
        if(size == arr.length-1){
            int[] temp = arr;
            arr = new int[size + 6];
            System.arraycopy(temp, 0, arr, 0, size);
        }
        else {
            arr[size++] = k;
        }
    }

    public void delete(int i){
        int[] result = new int[size-1];
        for (int j = 0, l = 0; j < size; j++){
            if (j == i){
                continue;
            }
            result[l++] = arr[j];
        }
        this.arr = result;
        size--;
    }

    public int getNum(int key){
        for(int i = 0; i < size; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public double middle(){
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += arr[i];
        }
        return (double)sum / size;
    }

    public int searchMax(){
        int max = arr[0];
        for (int i = 1; i < size; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public int searchMin(){
        int min = arr[0];
        for (int i = 1; i < size; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

}
;