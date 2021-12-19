package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import java.util.List;

public interface c {
    static {
        Covode.recordClassIndex(84698);
    }

    void a();

    void a(long j2, long j3);

    void a(ShortVideoContext shortVideoContext, MediaState mediaState);

    void a(ShortVideoContext shortVideoContext, MvImageChooseAdapter.MyMediaModel myMediaModel);

    void a(ShortVideoContext shortVideoContext, MvImageChooseAdapter.b bVar, String str);

    void a(ShortVideoContext shortVideoContext, String str);

    void a(ShortVideoContext shortVideoContext, List<? extends MvImageChooseAdapter.MyMediaModel> list, MvImageChooseAdapter.b bVar, String str);

    void a(ShortVideoContext shortVideoContext, boolean z);

    void b(ShortVideoContext shortVideoContext, boolean z);
}
