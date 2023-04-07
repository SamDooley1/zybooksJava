add()

add(element) 
  //Create space for and add the element at the end of the list.

// List originally empty
valsList.add(31); // List now: 31 
valsList.add(41); // List now: 31 41




get()

get(index)
  //Returns the element at the specified list location known as the index. Indices start at 0.

// List originally: 31 41 59. Assume x is an int. 
x = valsList.get(0);  // Assigns 31 to x
x = valsList.get(1);  // Assigns 41
x = valsList.get(2);  // Assigns 59
x = valsList.get(3);  // Error: No such element

set()

set(index, element)
  //Replaces the element at the specified position in this list with the specified element.
  
// List originally: 31 41 59 
valsList.set(1, 119);  // List now 31 119 59




size()
  
size()
  //Returns the number of list elements.
  
// List originally: 31 41 59. Assume x is an int. 
x = valsList.size();  // Assigns x with 3  
