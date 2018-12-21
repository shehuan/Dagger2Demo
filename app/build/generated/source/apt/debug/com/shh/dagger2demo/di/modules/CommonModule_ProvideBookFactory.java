// Generated by Dagger (https://google.github.io/dagger).
package com.shh.dagger2demo.di.modules;

import com.shh.dagger2demo.models.Book;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class CommonModule_ProvideBookFactory implements Factory<Book> {
  private final CommonModule module;

  public CommonModule_ProvideBookFactory(CommonModule module) {
    this.module = module;
  }

  @Override
  public Book get() {
    return provideInstance(module);
  }

  public static Book provideInstance(CommonModule module) {
    return proxyProvideBook(module);
  }

  public static CommonModule_ProvideBookFactory create(CommonModule module) {
    return new CommonModule_ProvideBookFactory(module);
  }

  public static Book proxyProvideBook(CommonModule instance) {
    return Preconditions.checkNotNull(
        instance.provideBook(), "Cannot return null from a non-@Nullable @Provides method");
  }
}