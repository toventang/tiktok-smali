package com.ss.android.ugc.aweme.services.story;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.publish.k;
import com.ss.android.ugc.aweme.shortvideo.publish.x;
import h.f.a.b;
import h.z;

public interface IStoryPublishService {
    static {
        Covode.recordClassIndex(79822);
    }

    boolean addCallback(String str, k kVar);

    void addPublishAnimateListener(IStoryPublishAnimateListener iStoryPublishAnimateListener);

    void getCover(String str, StoryCoverExtractConfig storyCoverExtractConfig, b<? super Bitmap, z> bVar);

    x getState(String str);

    boolean isPublishing(Context context);

    boolean isStoryPublishing();

    boolean removeCallback(String str, k kVar);

    void removePublishAnimateListener(IStoryPublishAnimateListener iStoryPublishAnimateListener);

    void removePublishTask(String str);

    boolean retryPublish(String str);
}
