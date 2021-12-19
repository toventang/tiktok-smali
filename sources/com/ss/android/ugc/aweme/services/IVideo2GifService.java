package com.ss.android.ugc.aweme.services;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.ss.android.ugc.aweme.shortvideo.cut.a.a.a;

public interface IVideo2GifService {

    public interface ConvertListener {
        static {
            Covode.recordClassIndex(79485);
        }

        void onConfigured(a aVar);

        void onDone(boolean z);

        void onStart();

        void onUpdateProgress(int i2);
    }

    static {
        Covode.recordClassIndex(79484);
    }

    void convert2Gif(VideoShare2GifEditContext videoShare2GifEditContext, ConvertListener convertListener);

    Fragment getGifCutVideoFragment(VideoShare2GifEditContext videoShare2GifEditContext);
}
