// Generated by Dagger (https://google.github.io/dagger).
package com.shh.dagger2demo;

import com.shh.dagger2demo.models.BookBean;
import com.shh.dagger2demo.models.UserBean;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class SubDetailActivity_MembersInjector implements MembersInjector<SubDetailActivity> {
  private final Provider<BookBean> book1AndBook2Provider;

  private final Provider<UserBean> userProvider;

  public SubDetailActivity_MembersInjector(
      Provider<BookBean> book1AndBook2Provider, Provider<UserBean> userProvider) {
    this.book1AndBook2Provider = book1AndBook2Provider;
    this.userProvider = userProvider;
  }

  public static MembersInjector<SubDetailActivity> create(
      Provider<BookBean> book1AndBook2Provider, Provider<UserBean> userProvider) {
    return new SubDetailActivity_MembersInjector(book1AndBook2Provider, userProvider);
  }

  @Override
  public void injectMembers(SubDetailActivity instance) {
    injectBook1(instance, book1AndBook2Provider.get());
    injectBook2(instance, book1AndBook2Provider.get());
    injectUser(instance, userProvider.get());
  }

  public static void injectBook1(SubDetailActivity instance, BookBean book1) {
    instance.book1 = book1;
  }

  public static void injectBook2(SubDetailActivity instance, BookBean book2) {
    instance.book2 = book2;
  }

  public static void injectUser(SubDetailActivity instance, UserBean user) {
    instance.user = user;
  }
}