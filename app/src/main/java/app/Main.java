package app;


import common.FeriRepositoryImpl;
import common.Repository;

public class Main {

  public static void main(String[] args) {
    System.out.println("Called app");
    Repository repository=new FeriRepositoryImpl();
    System.out.println(repository.findName());
    System.out.println("Finish app");
  }
}
