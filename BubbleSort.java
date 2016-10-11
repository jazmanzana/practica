/* https://en.wikipedia.org/wiki/Bubble_sort

Worst case performance 	        O(n^2)
Best case performance 	        O(n)
Average case performance 	O(n^2)
Worst case space complexity 	O(1) auxiliary

*/


public class BubbleSort{

public static void BubbleSort( int [ ] num )
{
     int j;
     boolean flag = true;   // set flag to true to begin first pass
     int temp;   //holding variable

     while ( flag )
     {
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < num.length -1;  j++ )
            {
                   if ( num[ j ] < num[j+1] )   // change to > for ascending sort
                   {
                           temp = num[ j ];                //swap elements
                           num[ j ] = num[ j+1 ];
                           num[ j+1 ] = temp;
                           flag = true;              //shows a swap occurred 
                  }
            }
      }
} 

}
