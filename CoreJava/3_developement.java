         //Java Collection's Framework
         /*
                 Framework consists of libaries. Libary is predefined methods and classes. Your code calls libaries but your code gets called by framework. 
                 Java Collection's framework consists of many interfaces and libaries that are used for problems such as grouping and doing operations on similar data.
                 Collection framework consists list, queue, set, map structures  ( map does not inherits the Collection interface contrary to others).
                 
                 //ArrayList
                 Arrays have fixed amount of element. Arrays are faster. Arrays hold primitive type variables.
                 ArrayLists hold reference-type variables. There are more predefined methods inside ArrayLists.
                 Inheritance relationship: ArrayList<List<Collection<Iterable.
                 
                 //LinkedList
                 Elements are NOT stored in contiguous locations, every element is a separate object with 2 parts, data and address of the next node.
                 ArrayList and LinkedList time complexity comparison:
                 Note: LinkedList has bigger space-complexity than ArrayList.
                 When adding to the head of the list: LinkedList is faster. When adding to the tail of the list: ArrayList is faster.
                 
                 //Set
                 Sets hold non-duplicate values not stored in insertion order. There are 2 extensions, TreeSet (ordered by value or alphabetically) and HashSet (non-ordered).
                 HashSet has O(1) time complexity for all search, add algorithms. HashSet has larger space complexity.
                 
                 //Map
                 Holds key and value pairs. Has O(1) complexity. In contrast to set, you need to give key for the values in map.
                 
                 Collections.sort(collection_name); //To sort a collection
                 
                 Example: Find character frequency of a sentence using a map:
         */
                  import java.util.*;
                  public class Main{
                           public static void main(String[] args){
                                    String sentence = new String("Hello Java");
                                    TreeMap<Character,Integer> frequency= new TreeMap<Character,Integer>();
                                    for(int i=0;i<sentence.length();i++){
                                             char c = sentence.charAt(i);
                                             if(frequency.containsKey(c)){
                                                      frequency.replace(c,frequency.get(c)+1);
                                             }else{
                                                      frequency.put(c,1);
                                    }
                           }
                                    for(Map.Entry<Character,Integer> entry: frequency.entrySet()){
                                             System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
                                    }   
                           }
         
         //Comparing your objects using Comparable interface. By doing this you can sort your objects by only one rule.
         
         class Player implements Comparable<Player>{
                  private String name;
                  private int id;
                  public Player(String name, int id){
                           this.name=name;
                           this.id=id;
                  }
                  @Override
                  public String toString(){
                           return id+name;
                  }
                  @Override
                  public int compareTo(Player player){ //We can override compareTo method as we pleased and sort our objects by this order
                           if(this.id<player.id){
                                    return -1;
                           }else if(this.id>player.id){
                                    return 1;
                           }
                           return 0;
                  }
         }
          public class Main{
                           public static void main(String[] args){
                                    ArrayList<Player> playerList = new ArrayList<Player>();
                                    playerList.add(new Player("player1",1));
                                    playerList.add(new Player("player2",2));
                                    Collection.sort(playerList);
                           }
          }                           
                           
         //If we want diferrent sorting rules applied to our objects when we sort them, we implement the Comparator interface.                           
         
          public class sortByDescending implements Comparator<String>{
                  @Override
                   public int compare(String s1, String s2){
                            return -o1.compareTo(o2);
                   }
          }                 
          
         public class Main{
                           public static void main(String[] args){
                                    ArrayList<Player> playerList = new ArrayList<Player>();
                                    playerList.add(new Player("player1",1));
                                    playerList.add(new Player("player2",2));
                                    Collection.sort(playerList,new sortByDescending());
                           }
          } 
           
         //synchronized
         /*
                  In the Multithreading concept, multiple threads try to access the shared resources at a time, and this might cause inconsistent results.
                  The "synchronized" keyword controls the access of multiple threads to any shared resource.
                  So in thread operations Vector is preferred instead ArrayList.
         */
         //stack
         // A stack data structure is a list that works as LIFO( last in first out).                       
         
         //enumeration                           
         /*
                 A structure for iterating collection elements. Similar to iterator.
                 Differences of enumeration and iterator: 
                  Iterator can remove the element during traversal of collection as it has remove() method.
                  Enumeration does not have remove() method.
                  Iterator is new Enumeration is legacy.
                  Iterator is used for HashMap, LinkedList, ArrayList, HashSet, TreeMap, TreeSet.
                  Enumeration is used for Vector and Hashtable.
                  Enumeration does not throw ConcurrentModificationException if Collection is modified during the traversal.
                  Iterator throws ConcurrentModificationException if a Collection is modified while iterating other than its own remove() method.
             
         */
                           Stack<String> stack = Stack<String>();
                           stack.push("J2EE");
                           stack.push("J2SE");
                           Enumerations<String> enum = stack.elements(); //Creating enum to traverse elements in stack
                           while(enum.hasMoreElements()){
                                    System.out.println(enum.nextElement());
                           }
                           stack.peek(); //Check the element at the top
                           stack.pop(); //Remove the top element
                           stack.empty();//Checks if empty and returns boolean
                           
         //Palindrom example with stack
         public Boolean isPalindrome(String sentence){                           
                  
          Stack<Character> charStack = new Stack<Character>();
          for(int i=0;i<sentence.length()/2;i++){
                  stack.push(sentence.charAt(i));
          }          
          for(int i=sentence.lengh()/2;i<sentence.length();i++){
                  if(sentence.charAt(i)!=stack.pop()){
                           return false;
                  }
          }  
          return true;
                  
         }        
         //LinkedList that implements Queue interface
          /*      
                  LinkedList is the only collection that implements 2 different collection interfaces. We saw LinkedList that implements List interface.
                  But LinkedList can also implement Queue's. Queue is a data structure that works FIFO (first in first out).
          */
           Queue<String> queue = new LinkedList<String>();
           queue.offer("J2EE"); //add
           queue.offer("J2SE");
           queue.peek();
           queue.isEmpty(); 
           queue.poll();//remove 
        
         //Priority Queue : All elements has priorities and if an element has greater priority, it goes to front.
        //Hospital Emergency example with priority queue
         public class Patient implements Comparable<Patient>{
                  private String name;
                  private String complaint;
                  private int priority;
                  public Patient(String name, String complaint){
                           this.name=name;
                           this.complaint=complaint;
                           complaint=complaint.toLowerCase();
                           if(complaint.equals("apandisit")){
                                    this.priority=1;
                           }else if(complaint.equals("burn")){
                                    this.priority=2;
                           }else{
                                    this.priority=3;
                           }
                  }
                  @Override
                  public String toString(){
                           String info=getName()+"has complaint: "+getComplaint+" with priority: "+getPriority;
                           return info;
                  }
                  @Override
                  public int compareTo(Patience patience){
                           if(this.priority>patience.priority){
                                    return -1;
                           }else if(this.priority<patience.priority){
                                    return 1;
                           }else{
                                    return 0;
                           }
                  }
         }
        //ListIterator vs iterator
        /*
            ListIterator is only used by structures that implements List interface.
            Iterator is used by all structures.
            Iterator can not remove or add an element, ListIterator can remove or add.
            ListIterator can go backwards with previous() and add elements with add() where iterator can not.
            
        */                   
                           
        public class Main{
                           public static void main(String[] args){
                                    Queue<Patient> emergency= PriorityQueue<Patient>();
                                    queue.offer(new Patient("Ben X","headache"));
                                    queue.offer(new Patient("May X","apandisit"));
                                    queue.offer(new Patient("Peter X","burn"));
                                    int i=1;
                                    while(emergency.isEmpty()!=true){
                                             System.out.println(i+". patient");
                                             System.out.println(emergency.poll());
                                             i++
                                    }
                           }
        }                   
                           
        //Iterating your objects                   
         public class Radio implements Iterable<String>{
                  private ArrayList<String> channelList = new ArrayList<String>();
                  public Radio(String[] channels){
                           for(String channel:channels){
                                    channelList.add(channel);
                           }
                  }
                  @Override
                  public Iterator<String> iterator(){
                           return channelList.iterator();
                  }
         }                  
         public class Main{
                  public static void main(String[] args){
                           String[] channels = {"ATV","BTV","CTV","DTV","ETV"};
                           Radio radio = new Radio(channels);
                           for(String str: radio){ //Only array or iterable can get iterated not object
                                    //So we implement iterable and override the iterator method
                                    System.out.println(str);
                           }
                  }
         }                  
                           
        //Creating custom iterable class
        public class RadioIterator implements Iterator<String>{
                 private int index=0;
                 @Override
                 public Boolean hasNext(){
                          if(index<chanelList.size()){
                                    return true;
                          }else{
                                    return false;
                          }
                 }
                 @Override
                 public String next(){
                          String value = channelList.get(index);
                          index++;
                          return value;
                 }
        }                   
         public class Radio implements Iterable<String>{
                  private ArrayList<String> channelList = new ArrayList<String>();
                  public Radio(String[] channels){
                           for(String channel:channels){
                                    channelList.add(channel);
                           }
                  }
                  @Override
                  public Iterator<String> iterator(){
                           return new RadioIterator();
                  }
         }                     
         
         public class Main{
                  public static void main(String[] args){
                           String[] channels = {"ATV","BTV","CTV","DTV","ETV"};
                           Radio radio = new Radio(channels);
                           Iterator<String> iterator = new Iterator<String>(); //We can iterate over our objects
                           while(iterator.hasNext()){
                                    System.out.println(iterator.next());
                           }
                  }
         } 
        //Exception Handling
        /*
                  //Exception
                  Exceptions are runtime incidents that disrupts the flow of events.
                  Exception handling is applied when there is an error possibility expected at runtime and
                  cannot be fixed by programming. These exceptions are caught and handled so our program do not crash.
                  Example for these exceptions: InputOutput, database connection, arithmetical exceptions.
                  Note: Do not apply exception handling when not needed, they are costly by performance.
                  //Error vs Exception:
                  Errors are serious problems that should not be tried to catch but should be fixed by programmers.
                  Exceptions are non-expected possible events that should be catched by programs.
                  Exception hierachy: Throwable>Error(>StackOverFlow,VirtualMachine,OutOfMemory(s)) and Exception.
                  Exception>IO,SQL,ClassNotFound(s),RunTime(>Arithmetic,NullPointer,NumberOfFormat,IndexOutOfBound).
                  //Checked Exception:
                  They do not derive from RunTimeExceptions, java compiler foresees that codes might throw these exceptions and warns us to catch.
                  Example: IOException and SQLException.
                  //Unchecked Exception:
                  They derive from RunTimeExceptions, java compiler do not foresee these exceptions.
                  Implementation of exception handling is programmers responsibility.
                  Example: ArithmeticException, NullPointerException.
                  
        */
        //Java I/O (Input/Output)
        //Multithreading and Concurrency
        //UI developement with Swing
        //JDBC and Mysql
