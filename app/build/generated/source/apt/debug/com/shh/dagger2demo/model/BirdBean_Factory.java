// Generated by Dagger (https://google.github.io/dagger).
package com.shh.dagger2demo.model;

import dagger.internal.Factory;

public final class BirdBean_Factory implements Factory<BirdBean> {
  private static final BirdBean_Factory INSTANCE = new BirdBean_Factory();

  @Override
  public BirdBean get() {
    return provideInstance();
  }

  public static BirdBean provideInstance() {
    return new BirdBean();
  }

  public static BirdBean_Factory create() {
    return INSTANCE;
  }

  public static BirdBean newBirdBean() {
    return new BirdBean();
  }
}
