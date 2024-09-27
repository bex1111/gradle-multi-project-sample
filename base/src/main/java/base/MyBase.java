package base;

import common.RepositoryImpl;

public abstract class MyBase implements MyInterface {

  @Override
  public void doSomeProcess() {
    System.out.println("called doSomeProcess in Base");
    RepositoryImpl.findName();
  }


}
