package com.gyf.barlibrary;

import com.bytedance.covode.number.Covode;

public interface ImmersionOwner {
    static {
        Covode.recordClassIndex(34166);
    }

    boolean immersionBarEnabled();

    void initImmersionBar();

    void onInvisible();

    void onLazyAfterView();

    void onLazyBeforeView();

    void onVisible();
}
