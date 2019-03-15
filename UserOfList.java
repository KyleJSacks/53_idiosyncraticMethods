/**
 Test list features.
 */
public class UserOfList {
//<<<<<<< HEAD
    private static List_inArraySlots list;
    
    public static void main( String[] args ) {
        list = new List_inArraySlots();

         System.out.println( "number of elements: " + list.size() );
         System.out.println( "empty list: " + list);

        // Populate the list with diverse elements.
         list.add("important");
         System.out.println( "number of elements: " + list.size() );
         System.out.println( "added string: " + list);
		 
         list.add(true);
         System.out.println( "number of elements: " + list.size() );
         System.out.println( "added string: " + list);

         list.add(17);
         System.out.println( "number of elements: " + list.size() );
         System.out.println( "added int: " + list);

         list.add(1.618);
         System.out.println( "number of elements: " + list.size() );
         System.out.println( "added double: " + list);

         // Add enough elements that expansion is expected
         for( int elemIndex = list.size(); elemIndex < 15; elemIndex++ ) {

             if( list.size() == 10) System.out.println( "expansion expected");

             list.add(-elemIndex);
             System.out.println( "number of elements: " + list.size() );
         }
         System.out.println("result of expanded list: "
              + list.size() + " elements:");
         System.out.println( list + System.lineSeparator());
         
         // test get()
         for( int index = list.size() - 1; index >= 0; index--)
             System.out.println( index
                                + ": "
                                + list.get(index)
                                );

	 System.out.println(System.lineSeparator());
	 //HW53
	 List_inArraySlots list2 = new List_inArraySlots();
	 list2.add(3.14);
	 list2.add("piazza");
	 list2.add(6.28);
	 list2.add("pi");
	 list2.add(Double.POSITIVE_INFINITY);
	 list2.add("tau");
	 list2.add("pizza");
	 list2.add(1e4);
	 list2.add(Double.NEGATIVE_INFINITY);
	 Accumulator.catElementsStartingWith(list2, "pi");
    }//test
}//=======

