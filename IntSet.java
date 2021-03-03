import java.util.*;

class IntSet
{
  public static boolean isMember(int x,Set<Integer> num)
  {
    return num.contains(x);
  }

  public static int Size(Set<Integer> num)
  {
    return num.size();
  }

  public static boolean isSubset(Set<Integer> num,Set<Integer> test)
  {
    return num.containsAll(test);
  }

  public static Set<Integer> getComplement(Set<Integer> num,Set<Integer> test)
  {
    Set<Integer> ans=new HashSet<Integer>();
    Integer myarray[]=new Integer[num.size()];
    num.toArray(myarray);
    for(int i=0;i<myarray.length;i++)
    {
      if(!test.contains(myarray[i]))
      	ans.add(myarray[i]);
    }
    return ans;
  }

 public static Set<Integer> Union(Set<Integer> num,Set<Integer> test)
  {
    Set<Integer> ans=new HashSet<Integer>();
    ans.addAll(num);
    ans.addAll(test);
    return ans;
  }
  
  public static void main(String...arg)
  {    
    Set<Integer> num=new HashSet<Integer>();
    Scanner sc=new Scanner(System.in);
    Integer value,choice,flag=1;
    System.out.println("Enter 6 Values in Set ");
    for(int i=0;i<6;i++)
    {
      value=sc.nextInt();
      num.add(value);
    }
    Set<Integer> unm=Collections.unmodifiableSet(num);
    while(flag==1)
    {
      System.out.println("1: isMember ");
      
      System.out.println("2: Size ");
      System.out.println("3: isSubset ");
      System.out.println("4: getComplement ");
      System.out.println("5: union ");
      System.out.println("6: Exit ");
      System.out.println("Enter Choice : ");
      choice=sc.nextInt();
      switch(choice)
      {
        case 1:System.out.println("Enter Number to be Searched : ");
               Integer x=sc.nextInt();
               System.out.println(isMember(x,unm));
               break;
        case 2:System.out.println(Size(unm));
               break;
        case 3:Set<Integer> test1=new HashSet<Integer>();
               System.out.println("Enter 3 Value in New Set ");
               Integer newValue;
               for(int i=0;i<3;i++)
               {
                 newValue=sc.nextInt();
                 test1.add(newValue);
               }
               System.out.println(isSubset(unm,test1));
               break;
        case 4:Set<Integer> test2=new HashSet<Integer>();
               System.out.println("Enter 3 Value in New Set ");
               Integer compValue;
               for(int i=0;i<3;i++)
               {
                 compValue=sc.nextInt();
                 test2.add(compValue);
               }
               System.out.println(getComplement(unm,test2));
               break;
        case 5:Set<Integer> test3=new HashSet<Integer>();
               System.out.println("Enter 3 Value in New Set ");
               Integer unionValue;
               for(int i=0;i<3;i++)
               {
                 unionValue=sc.nextInt();
                 test3.add(unionValue);
               }
               System.out.println(Union(unm,test3));
               break;
        case 6 : flag=0;
        	   break;
        default:System.out.println("Invalid Choice."); 
      }
    }
  }
} 

