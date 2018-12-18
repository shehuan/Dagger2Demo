// Generated by Dagger (https://google.github.io/dagger).
package com.shh.dagger2demo;

import com.shh.dagger2demo.models.FlowerBean;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<FlowerBean> flower1Provider;

  public MainActivity_MembersInjector(Provider<FlowerBean> flower1Provider) {
    this.flower1Provider = flower1Provider;
  }

  public static MembersInjector<MainActivity> create(Provider<FlowerBean> flower1Provider) {
    return new MainActivity_MembersInjector(flower1Provider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectFlower1(instance, flower1Provider.get());
  }

  public static void injectFlower1(MainActivity instance, FlowerBean flower1) {
    instance.flower1 = flower1;
  }
}
