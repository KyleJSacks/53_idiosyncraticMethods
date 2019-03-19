/**
  Represent accumulating data from the elements in a
  List_inArraySlots that are of a particular type.
 */

public class Accumulator {

    /**
      @return the concatenation of all the Strings
      in the \list that begin with \prefix,
      each followed by a space.
     */
    public static String catElementsStartingWith(
        List_inArraySlots list
      , String prefix
      ) {
        String result = "";

        for( int el = 0; el < list.size(); el++)
            //result += // dummy for incremental development
                      //list.get( el) + " ";

            /* 3.  Stumbling block 0
               Java protects a programmer against applying a method to
               elements in list when some elements of the list might
               omit support for a particular operation.

               This protection is implemented by the compiler (compiler? JVM?)
               The following code violates the restriction:
              */
            //if ((list.get(el)).startsWith("pi")) result += list.get(el) + " ";
            /*
             predicted error message: object may not have method startsWith

             actual error message: Accumulator.java:31: error: cannot find symbol

             */


            /* 4.  Workaround 0
               A programmer should expect there to be a way to
               work around the stumbling block, because
               the JVM (compiler? JVM?)
               knows the type of an element.

               Java's instanceof operator identifies the type
               of an element to the JVM(compiler? JVM?).
             */
			//if (list.get(el) instanceof String){
			//	if ((list.get(el)).startsWith("pi")) result += list.get(el) + " ";
			//}

            /* 5.  Stumbling block 1
               However, use of the operator alone is insufficient,
               because the compiler (compiler? JVM?)
               objects to the following code that adds use of
               the operator to the code from Stumbling block 0:
             */

            // [code that illustrates the use of the operator]

            /*
             predicted error message: Accumulator.java: error: cannot find symbol

             actual error message: Accumulator.java:50: error: cannot find symbol
             */


            /* 6. Workaround 1
               Programmers use Java's casting operator
               to tell the compiler(compiler? JVM?)
               that code uses a subclass's method on an object,
               even though the reference to the object is stored
               in a super-class variable.
             */


            /* 7. Stumbling block 2
               However, use of this operator alone is insufficient,
               because the JVM (compiler? JVM?)
               objects to the following code that adds use of
               the operator to the code from Stumbling block 0:
             */

			
			//	if (((String)(list.get(el))).startsWith("pi")) result += list.get(el) + " ";
			

            /*
             predicted error message: cannot cast(incompatible type) to string

             actual error message:
             */


            /* 8. Workaround 2
               A programmer can combine use of both operators
               to apply a method to exactly those
               elements in the list that support the method.
             */

			if (list.get(el) instanceof String){
				if (((String)(list.get(el))).startsWith("pi")) result += list.get(el) + " ";
			}

        return result;
    }


    /**
      @return a list of each of the Double elements
      from the \list whose value is "finite".
     */
     public static List_inArraySlots finites(
         List_inArraySlots list
       ) {
			List_inArraySlots result; 

			for( int el = 0; el < list.size(); el++){	
			if (list.get(el) instanceof Double){
				if (((Double)(list.get(el))).isInfinite()) result.add(list.get(el));
			}}
			return result;
     }
}
