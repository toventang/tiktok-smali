package com.ss.android.ugc.aweme.services.external.ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;

public interface IVideo2GifUIService {
    static {
        Covode.recordClassIndex(79702);
    }

    IVideoChoose toMusVideoChooseFragment(e eVar, Fragment fragment, IVideoChoose.Callback callback, Integer num);

    Fragment video2GifFragment(VideoShare2GifEditContext videoShare2GifEditContext);
}
