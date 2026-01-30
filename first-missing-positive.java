class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet <Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int i;
        for(i=1;i<set.size()+1;i++)
        {
            if(!set.contains(i)){
                break;
            }
        }
        return i;
    }
}