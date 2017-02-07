/**
 * Created by ismail on 2017-02-07.
 */
public class OrdArray {
    private int maxSize;
    private long[] tab;
    private int numItems;

    public OrdArray(int maxSize){
        tab = new long[maxSize];
        numItems=0;
    }

    public void insert(long value) // put element into array
    {
        int j;
        for(j=0; j<numItems; j++) // find where it goes
            if(tab[j] > value) // (linear search)
                break;
        for(int k=numItems; k>j; k--) // move bigger ones up
            tab[k] = tab[k-1];
        tab[j] = value; // insert it
        numItems++; // increment size
    } // end insert()

    public void display(){
        for(long j : tab){
            System.out.println(j);
        }
    }

    public void merge(OrdArray s1, OrdArray s2)
    {
        int j=0, k=0;
        numItems = s1.numItems + s2.numItems;

        for(int d=0; d<numItems; d++)
        {
            if(j == s1.numItems)
            {         						// if s1 at end,
                tab[d] = s2.tab[k++];  			// finish s2
            }
            else if(k == s2.numItems)
            {      						 // if s2 at end,
                tab[d] = s1.tab[j++];       	 // finish s1
            }
            else if( s1.tab[j] < s2.tab[k] )
            { 								//if s1 smaller than s2
                tab[d] = s1.tab[j++];          	// copy s1 to d
            }
            else
            {                      	 // s1 larger or equal,
                tab[d] = s2.tab[k++];        // copy s2 to d
            }
        }
        return;
    }


}
