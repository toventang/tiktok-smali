package com.ss.android.ugc.aweme.cx;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.CountDownLatch;

public interface b {
    static {
        Covode.recordClassIndex(49142);
    }

    void a(ai aiVar, VideoPublishEditModel videoPublishEditModel, CountDownLatch countDownLatch);

    void a(Object obj, c cVar, CountDownLatch countDownLatch);

    void b(ai aiVar, VideoPublishEditModel videoPublishEditModel, CountDownLatch countDownLatch);
}
