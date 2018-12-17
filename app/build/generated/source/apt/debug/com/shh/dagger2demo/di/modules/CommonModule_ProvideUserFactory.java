// Generated by Dagger (https://google.github.io/dagger).
package com.shh.dagger2demo.di.modules;

import com.shh.dagger2demo.model.UserBean;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class CommonModule_ProvideUserFactory implements Factory<UserBean> {
  private final CommonModule module;

  public CommonModule_ProvideUserFactory(CommonModule module) {
    this.module = module;
  }

  @Override
  public UserBean get() {
    return provideInstance(module);
  }

  public static UserBean provideInstance(CommonModule module) {
    return proxyProvideUser(module);
  }

  public static CommonModule_ProvideUserFactory create(CommonModule module) {
    return new CommonModule_ProvideUserFactory(module);
  }

  public static UserBean proxyProvideUser(CommonModule instance) {
    return Preconditions.checkNotNull(
        instance.provideUser(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
