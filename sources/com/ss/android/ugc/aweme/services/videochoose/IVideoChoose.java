package com.ss.android.ugc.aweme.services.videochoose;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

public interface IVideoChoose {

    public interface Callback {
        static {
            Covode.recordClassIndex(79878);
        }

        void onData(String str);
    }

    static {
        Covode.recordClassIndex(79877);
    }

    Fragment fragment();

    void loadData();
}
