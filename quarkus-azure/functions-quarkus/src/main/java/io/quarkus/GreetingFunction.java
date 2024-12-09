package io.quarkus;

import io.quarkus.funqy.Funq;
import dk.rdpl.dih.common.model.Inventory;

public class GreetingFunction {

  @Funq
  public String greeting(Inventory name) {
    return name.getProductID();
  }

  @Funq("funqyHello")
  public String funqyHello() {
    return "hello funqy";
  }
}
