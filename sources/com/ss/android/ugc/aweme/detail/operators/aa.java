package com.ss.android.ugc.aweme.detail.operators;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.u.x;

public interface aa {

    public interface a {
        static {
            Covode.recordClassIndex(49617);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(49618);
        }

        void bindPreLoadView(x xVar);

        void setPreLoad(boolean z);
    }

    static {
        Covode.recordClassIndex(49616);
    }

    void bindView(ad adVar);

    boolean cannotLoadLatest();

    boolean cannotLoadMore();

    boolean deleteItem(String str);

    int getPageType(int i2);

    Object getViewModel();

    boolean init(Fragment fragment);

    boolean isDataEmpty();

    boolean isLoading();

    void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z);

    void unInit();
}
