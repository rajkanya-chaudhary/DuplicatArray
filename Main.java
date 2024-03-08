import java.util.*;
import java.util.Stream.*;
class Product
{
 int id;
 String name;
 float price;
 public Product(int id,String name,float price)
 {
  this.id = id;
  this.name=name;
  this.price = price;
}
}
class Main
{

 public static void main(String arg[])
 {
  List<Product>li = new ArrayList<Product>();
  li.add(new Product(1,"HP",25000f));
  li.add(new Product(1,"Dell",30000f));
  li.add(new Product(1,"Lenevo",28000f));
  li.add(new Product(1,"Sony",28000f));
  li.add(new Product(1,"Apple",90000f));
 /* // max 
//  Product p = li.stream().max((product1,product2)->product1.price>product2.price?1:-1).get();
 // System.out.println("max number " + p.price);
// min
// Product d = li.stream().max((product1,product2)->product1.price<product2.price?1:-1).get();
 // System.out.println("min Amount " + d.price);
   // count number of product based on the filter
  long count=li.stream().filter(product->product.price<30000).count();
  System.out.println(count);
*/
  
// convert product List int set
 Set<Float> p = li.stream().filter(product->product.price<30000)
  .map(product->product.price).collect(Collectors.toSet());
  System.out.println(p);



}
}