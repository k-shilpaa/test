package com.shilp.exercise;

public class Ex10 {
    public static void main(String[] args) {
        String[] names={"hi","hello","bye"};
        int[] nums={1,2,3};
        Ex10 obj=new Ex10();
        boolean result=obj.arraySearch(names,"hi");
        boolean result1=obj.arraySearchInt(nums,1);
        System.out.println(result);
        System.out.println(result1);

    }
    public boolean arraySearch(String[] names,String key) {
        for (int i = 0; i < names.length; i++) {
            if (key.equals(names[i])) {
                return true;
            }
            }
        return false;
        }

        public boolean arraySearchInt(int[] nums,int key){
        for (int i=0;i< nums.length;i++){
            if (key==nums[i]){
                return true;
            }
        }
        return false;


        }


    }


