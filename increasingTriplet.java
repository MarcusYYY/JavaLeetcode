public class increasingTriplet{
    public boolean increasingTriplet(int [] nums){
    if(nums == null || nums.length == 0)
        return false;
    int small = Integer.MAX_VALUE, large = Integer.MIN_VALUE;

    for(int num : nums){
        if(num <= small){
            small = num;
        }else if(num <= large){
            large = num;
        }else
            return true;
       }
    }
}

