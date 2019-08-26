package com.wudi;

public class GB_Text {
    public static void mergeSort(int array[],int lift,int right){
        //终止条件
        if(lift>=right){
            return;
        }
        int mid=(right+lift)/2;
        mergeSort(array,lift,mid);
        mergeSort(array,mid+1,right);
        //合并
        merge(array,lift,mid,right);
    }
    public static void merge(int array[],int lift,int mid,int right){
        int help[]=new int[right-lift+1];
        int i=0;
        int p1=lift;
        int p2=mid+1;
        //两部分还有数据
        while (p1<=mid&&p2<=right){
            if(lift<=(mid+1)){
                help[i++]=array[p1++];
            }else {
                help[i++]=array[p2++];
            }
        }
        if(p1<=mid){
            help[i++]=array[p1++];
        }else {
            help[i++]=array[p2++];
        }
        for (int j=0;j<help.length;j++){
            array[j]=help[j];
        }

    }

    public static void main(String[] args) {
        int array[]={2, 0, 5, 4, 7, 9, 3, 6, 1, 10, 8};
        int lift;
        int right;
    }
}
