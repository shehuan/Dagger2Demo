// Generated by Dagger (https://google.github.io/dagger).
package com.shh.dagger2demo.di.components;

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.shh.dagger2demo.App;
import com.shh.dagger2demo.App_MembersInjector;
import com.shh.dagger2demo.DetailFragment;
import com.shh.dagger2demo.DetailFragment_MembersInjector;
import com.shh.dagger2demo.MainActivity;
import com.shh.dagger2demo.MainActivity_MembersInjector;
import com.shh.dagger2demo.di.modules.DetailFragmentModule_ProvideBookFactory;
import com.shh.dagger2demo.di.modules.MainActivityModule_ProvideFlowerFactory;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;

public final class DaggerAppComponent implements AppComponent {
  private Provider<MainActivitySubcomponent.Builder> mainActivitySubcomponentBuilderProvider;

  private Provider<DetailFragmentSubcomponent.Builder> detailFragmentSubcomponentBuilderProvider;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  private Map<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
      getMapOfClassOfAndProviderOfFactoryOf() {
    return Collections
        .<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
            singletonMap(MainActivity.class, (Provider) mainActivitySubcomponentBuilderProvider);
  }

  private DispatchingAndroidInjector<Activity> getDispatchingAndroidInjectorOfActivity() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf());
  }

  private Map<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
      getMapOfClassOfAndProviderOfFactoryOf2() {
    return Collections
        .<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
            singletonMap(
                DetailFragment.class, (Provider) detailFragmentSubcomponentBuilderProvider);
  }

  private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf2());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.mainActivitySubcomponentBuilderProvider =
        new Provider<MainActivitySubcomponent.Builder>() {
          @Override
          public MainActivitySubcomponent.Builder get() {
            return new MainActivitySubcomponentBuilder();
          }
        };
    this.detailFragmentSubcomponentBuilderProvider =
        new Provider<DetailFragmentSubcomponent.Builder>() {
          @Override
          public DetailFragmentSubcomponent.Builder get() {
            return new DetailFragmentSubcomponentBuilder();
          }
        };
  }

  @Override
  public void inject(App app) {
    injectApp(app);
  }

  private App injectApp(App instance) {
    App_MembersInjector.injectDispatchingActivityInjector(
        instance, getDispatchingAndroidInjectorOfActivity());
    App_MembersInjector.injectDispatchingFragmentInjector(
        instance, getDispatchingAndroidInjectorOfFragment());
    return instance;
  }

  public static final class Builder {
    private Builder() {}

    public AppComponent build() {
      return new DaggerAppComponent(this);
    }
  }

  private final class MainActivitySubcomponentBuilder extends MainActivitySubcomponent.Builder {
    private MainActivity seedInstance;

    @Override
    public MainActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(MainActivity.class.getCanonicalName() + " must be set");
      }
      return new MainActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(MainActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MainActivitySubcomponentImpl implements MainActivitySubcomponent {
    private MainActivitySubcomponentImpl(MainActivitySubcomponentBuilder builder) {}

    @Override
    public void inject(MainActivity arg0) {
      injectMainActivity(arg0);
    }

    private MainActivity injectMainActivity(MainActivity instance) {
      MainActivity_MembersInjector.injectFlower1(
          instance, MainActivityModule_ProvideFlowerFactory.proxyProvideFlower());
      return instance;
    }
  }

  private final class DetailFragmentSubcomponentBuilder extends DetailFragmentSubcomponent.Builder {
    private DetailFragment seedInstance;

    @Override
    public DetailFragmentSubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(DetailFragment.class.getCanonicalName() + " must be set");
      }
      return new DetailFragmentSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(DetailFragment arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class DetailFragmentSubcomponentImpl implements DetailFragmentSubcomponent {
    private DetailFragmentSubcomponentImpl(DetailFragmentSubcomponentBuilder builder) {}

    @Override
    public void inject(DetailFragment arg0) {
      injectDetailFragment(arg0);
    }

    private DetailFragment injectDetailFragment(DetailFragment instance) {
      DetailFragment_MembersInjector.injectBook1(
          instance, DetailFragmentModule_ProvideBookFactory.proxyProvideBook());
      return instance;
    }
  }
}
