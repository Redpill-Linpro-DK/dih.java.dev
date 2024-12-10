package io.quarkus;

import io.quarkus.funqy.Funq;

public class DihFunction {

  @Funq("ping")
  public String ping() {
    return "pong";
  }

}
