class SingletonObject {
   private SingletonObject() {
      System.out.println("In a private constructor");
   }
   public static SingletonObject getObject() {
      // we can call this constructor
      if (ref == null)
         ref = new SingletonObject();
      return ref;
   }
   private static SingletonObject ref;
}
public class PrivateConstructorDemo {
   public static void main(String args[]) {
      SingletonObject sObj = SingletonObject.getObject();
   }
}
