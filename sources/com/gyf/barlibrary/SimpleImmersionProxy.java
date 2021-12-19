package com.gyf.barlibrary;

import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

public class SimpleImmersionProxy {
    private Fragment mFragment;
    private boolean mIsActivityCreated;
    private SimpleImmersionOwner mSimpleImmersionOwner;

    static {
        Covode.recordClassIndex(34173);
    }

    public boolean isUserVisibleHint() {
        Fragment fragment = this.mFragment;
        if (fragment != null) {
            return fragment.getUserVisibleHint();
        }
        return false;
    }

    private void setImmersionBar() {
        Fragment fragment = this.mFragment;
        if (fragment != null && this.mIsActivityCreated && fragment.getUserVisibleHint() && this.mSimpleImmersionOwner.immersionBarEnabled()) {
            this.mSimpleImmersionOwner.initImmersionBar();
        }
    }

    public void onDestroy() {
        Fragment fragment = this.mFragment;
        if (!(fragment == null || fragment.getActivity() == null || !this.mSimpleImmersionOwner.immersionBarEnabled())) {
            ImmersionBar.with(this.mFragment).destroy();
        }
        this.mFragment = null;
        this.mSimpleImmersionOwner = null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        setImmersionBar();
    }

    public void setUserVisibleHint(boolean z) {
        setImmersionBar();
    }

    public void onActivityCreated(Bundle bundle) {
        this.mIsActivityCreated = true;
        setImmersionBar();
    }

    public void onHiddenChanged(boolean z) {
        Fragment fragment = this.mFragment;
        if (fragment != null) {
            fragment.setUserVisibleHint(!z);
        }
    }

    public SimpleImmersionProxy(Fragment fragment) {
        this.mFragment = fragment;
        if (fragment instanceof SimpleImmersionOwner) {
            this.mSimpleImmersionOwner = (SimpleImmersionOwner) fragment;
            return;
        }
        throw new IllegalArgumentException("please implement SimpleImmersionOwner in your Fragment");
    }
}
