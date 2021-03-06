package com.zhiji.phonemall.di.component;

import com.zhiji.phonemall.di.module.ActivityModule;
import com.zhiji.phonemall.di.scope.PerActivity;
import com.zhiji.phonemall.ui.cart.CartFragment;
import com.zhiji.phonemall.ui.category.CategoryFragment;
import com.zhiji.phonemall.ui.home.HomeFragment;
import com.zhiji.phonemall.ui.main.MainActivity;
import com.zhiji.phonemall.ui.mine.MineFragment;
import com.zhiji.phonemall.ui.splash.SplashActivity;
import dagger.Component;

/**
 * <pre>
 *     author : llj
 *     time   : 2017/07/26
 *     desc   :
 * </pre>
 */
@PerActivity
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

  void inject(SplashActivity splashActivity);

  void inject(MainActivity mainActivity);
  void inject(HomeFragment homeFragment);
  void inject(CategoryFragment categoryFragment);
  void inject(CartFragment cartFragment);
  void inject(MineFragment mineFragment);
}
