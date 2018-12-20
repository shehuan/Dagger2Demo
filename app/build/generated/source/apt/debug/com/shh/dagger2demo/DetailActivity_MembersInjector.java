// Generated by Dagger (https://google.github.io/dagger).
package com.shh.dagger2demo;

import com.shh.dagger2demo.models.Book;
import com.shh.dagger2demo.models.User;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class DetailActivity_MembersInjector implements MembersInjector<DetailActivity> {
  private final Provider<Book> book1AndBook2Provider;

  private final Provider<User> userProvider;

  public DetailActivity_MembersInjector(
      Provider<Book> book1AndBook2Provider, Provider<User> userProvider) {
    this.book1AndBook2Provider = book1AndBook2Provider;
    this.userProvider = userProvider;
  }

  public static MembersInjector<DetailActivity> create(
      Provider<Book> book1AndBook2Provider, Provider<User> userProvider) {
    return new DetailActivity_MembersInjector(book1AndBook2Provider, userProvider);
  }

  @Override
  public void injectMembers(DetailActivity instance) {
    injectBook1(instance, book1AndBook2Provider.get());
    injectBook2(instance, book1AndBook2Provider.get());
    injectUser(instance, userProvider.get());
  }

  public static void injectBook1(DetailActivity instance, Book book1) {
    instance.book1 = book1;
  }

  public static void injectBook2(DetailActivity instance, Book book2) {
    instance.book2 = book2;
  }

  public static void injectUser(DetailActivity instance, User user) {
    instance.user = user;
  }
}
