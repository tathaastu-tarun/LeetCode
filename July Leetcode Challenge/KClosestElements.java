import java.util.List;
import java.util.*;
class KClosestElements
{
  public List<Integer> findClosestElements(int arr[],int x, int k)
  {
    List<Integer> lst = new ArrayList<>();
    int low =0,high = arr.length-1;
    
    while(high-low <=k)
    {
      if(Math.abs(arr[low]-x) > Math.abs(arr[high]-x))
         low++;
      else
         high--;
    }
  
         
    for(int i=low;i<=high;i++)
    {
      lst.add(arr[i]);
    }
     
    return lst;
     
  }
}