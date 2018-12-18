// Generated by Dagger (https://google.github.io/dagger).
package com.shh.dagger2demo.di.modules;

import com.shh.dagger2demo.models.BookBean;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class MainModule_ProvideBook1Factory implements Factory<BookBean> {
  private final MainModule module;

  public MainModule_ProvideBook1Factory(MainModule module) {
    this.module = module;
  }

  @Override
  public BookBean get() {
    return provideInstance(module);
  }

  public static BookBean provideInstance(MainModule module) {
    return proxyProvideBook1(module);
  }

  public static MainModule_ProvideBook1Factory create(MainModule module) {
    return new MainModule_ProvideBook1Factory(module);
  }

  public static BookBean proxyProvideBook1(MainModule instance) {
    return Preconditions.checkNotNull(
        instance.provideBook1(), "Cannot return null from a non-@Nullable @Provides method");
  }
}