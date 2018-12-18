// Generated by Dagger (https://google.github.io/dagger).
package com.shh.dagger2demo.di.modules;

import com.shh.dagger2demo.models.FlowerBean;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class MainActivityModule_ProvideFlowerFactory implements Factory<FlowerBean> {
  private static final MainActivityModule_ProvideFlowerFactory INSTANCE =
      new MainActivityModule_ProvideFlowerFactory();

  @Override
  public FlowerBean get() {
    return provideInstance();
  }

  public static FlowerBean provideInstance() {
    return proxyProvideFlower();
  }

  public static MainActivityModule_ProvideFlowerFactory create() {
    return INSTANCE;
  }

  public static FlowerBean proxyProvideFlower() {
    return Preconditions.checkNotNull(
        MainActivityModule.provideFlower(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
