package com.ss.android.ugc.aweme.story.publish;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.story.IStoryPublishAnimateListener;
import com.ss.android.ugc.aweme.services.story.IStoryPublishService;
import com.ss.android.ugc.aweme.services.story.StoryCoverExtractConfig;
import com.ss.android.ugc.aweme.shortvideo.publish.k;
import com.ss.android.ugc.aweme.shortvideo.publish.x;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class h implements IStoryPublishService {

    /* renamed from: a  reason: collision with root package name */
    public static final h f138142a = new h();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IStoryPublishService f138143b;

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
    public final boolean addCallback(String str, k kVar) {
        l.d(str, "");
        l.d(kVar, "");
        return this.f138143b.addCallback(str, kVar);
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
    public final void addPublishAnimateListener(IStoryPublishAnimateListener iStoryPublishAnimateListener) {
        l.d(iStoryPublishAnimateListener, "");
        this.f138143b.addPublishAnimateListener(iStoryPublishAnimateListener);
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
    public final void getCover(String str, StoryCoverExtractConfig storyCoverExtractConfig, b<? super Bitmap, z> bVar) {
        l.d(str, "");
        l.d(storyCoverExtractConfig, "");
        l.d(bVar, "");
        this.f138143b.getCover(str, storyCoverExtractConfig, bVar);
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
    public final x getState(String str) {
        l.d(str, "");
        return this.f138143b.getState(str);
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
    public final boolean isPublishing(Context context) {
        l.d(context, "");
        return this.f138143b.isPublishing(context);
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
    public final boolean isStoryPublishing() {
        return this.f138143b.isStoryPublishing();
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
    public final boolean removeCallback(String str, k kVar) {
        l.d(str, "");
        l.d(kVar, "");
        return this.f138143b.removeCallback(str, kVar);
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
    public final void removePublishAnimateListener(IStoryPublishAnimateListener iStoryPublishAnimateListener) {
        l.d(iStoryPublishAnimateListener, "");
        this.f138143b.removePublishAnimateListener(iStoryPublishAnimateListener);
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
    public final void removePublishTask(String str) {
        l.d(str, "");
        this.f138143b.removePublishTask(str);
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
    public final boolean retryPublish(String str) {
        l.d(str, "");
        return this.f138143b.retryPublish(str);
    }

    static {
        Covode.recordClassIndex(90338);
    }

    private h() {
        IStoryPublishService a2 = StoryPublishServiceImpl.a();
        l.b(a2, "");
        this.f138143b = a2;
    }
}
