package com.zhiji.phonemall.ui.mine;

import com.zhiji.phonemall.base.MvpPresenter;
import com.zhiji.phonemall.base.MvpView;

/**
 * <pre>
 *     author : llj
 *     time   : 2017/08/03
 *     desc   :
 * </pre>
 */
public interface MineMvpPresenter<V extends MvpView> extends MvpPresenter<V> {
  void requestMineData();
}
