package base;

import common.Repository;
import common.FeriRepositoryImpl;

public abstract class Main {


  public static void main(String[] args) {
    System.out.println("Called aggregator");
    Repository repository=new FeriRepositoryImpl();
    System.out.println(repository.findName());
    System.out.println("Finish aggregation");
  }


}
