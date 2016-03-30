public class MissingNumber {
    public int missingNumber(int [] nums) {
    int largest = 0;
    //calcualte the space that we need to prepare for the hash table
    for(int i = 0 ; i < nums.length ; i++){
        largest = Math.max(largest,nums[i]);
    }

    int count[] = new int[largest+1];

    for(int i = 0 ; i < nums.length ; i++){
        count[nums[i]]++;
    }
    int ans = 0;
    for(int i = 0; i < count.length; i++){
        if(count[i] == 0){
            ans = i;
            break;
        }else
            ans = count.length;// special case that the last element is missing
      }
      return ans;
  }
}
