package com.ss.android.ugc.aweme.story.publish;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.story.IStoryPublishAnimateListener;
import com.ss.android.ugc.aweme.services.story.IStoryPublishService;
import com.ss.android.ugc.aweme.services.story.StoryCoverExtractConfig;
import com.ss.android.ugc.aweme.services.story.event.ScheduleInfo;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.p.c;
import com.ss.android.ugc.aweme.shortvideo.publish.q;
import com.ss.android.ugc.aweme.shortvideo.publish.x;
import com.ss.android.ugc.aweme.story.edit.business.shared.f.d;
import com.ss.android.ugc.b;
import h.a.n;
import h.c.b.a.k;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import java.util.Objects;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class StoryPublishServiceImpl implements IStoryPublishService {
    static {
        Covode.recordClassIndex(90278);
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
    public final boolean isStoryPublishing() {
        return com.ss.android.ugc.aweme.story.publish.a.a.b();
    }

    public static IStoryPublishService a() {
        MethodCollector.i(1911);
        Object a2 = b.a(IStoryPublishService.class, false);
        if (a2 != null) {
            IStoryPublishService iStoryPublishService = (IStoryPublishService) a2;
            MethodCollector.o(1911);
            return iStoryPublishService;
        }
        if (b.ep == null) {
            synchronized (IStoryPublishService.class) {
                try {
                    if (b.ep == null) {
                        b.ep = new StoryPublishServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1911);
                    throw th;
                }
            }
        }
        StoryPublishServiceImpl storyPublishServiceImpl = (StoryPublishServiceImpl) b.ep;
        MethodCollector.o(1911);
        return storyPublishServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
    public final void addPublishAnimateListener(IStoryPublishAnimateListener iStoryPublishAnimateListener) {
        l.d(iStoryPublishAnimateListener, "");
        l.d(iStoryPublishAnimateListener, "");
        d.f137440a.add(iStoryPublishAnimateListener);
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
    public final x getState(String str) {
        l.d(str, "");
        return com.ss.android.ugc.aweme.story.publish.a.a.b(str);
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
    public final void removePublishAnimateListener(IStoryPublishAnimateListener iStoryPublishAnimateListener) {
        l.d(iStoryPublishAnimateListener, "");
        l.d(iStoryPublishAnimateListener, "");
        d.f137440a.remove(iStoryPublishAnimateListener);
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
    public final void removePublishTask(String str) {
        l.d(str, "");
        com.ss.android.ugc.aweme.shortvideo.p.d.a(c.f129554a).e();
        bz unused = i.a(an.a(bf.f159041b), null, null, new a(str, null), 3);
    }

    static final class a extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ String $scheduleId;
        int label;

        static {
            Covode.recordClassIndex(90279);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, h.c.d dVar) {
            super(2, dVar);
            this.$scheduleId = str;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new a(this.$scheduleId, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            BaseShortVideoContext baseShortVideoContext;
            String str;
            if (this.label == 0) {
                r.a(obj);
                q c2 = com.ss.android.ugc.aweme.story.publish.a.a.c(this.$scheduleId);
                VideoPublishEditModel videoPublishEditModel = null;
                if (c2 != null) {
                    baseShortVideoContext = c2.f129882k;
                } else {
                    baseShortVideoContext = null;
                }
                if (baseShortVideoContext instanceof VideoPublishEditModel) {
                    videoPublishEditModel = baseShortVideoContext;
                }
                VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                if (!(videoPublishEditModel2 == null || (str = videoPublishEditModel2.sessionId) == null)) {
                    l.b(str, "");
                    com.ss.android.ugc.aweme.draft.model.c a2 = com.ss.android.ugc.aweme.story.draft.b.a(str);
                    if (a2 != null) {
                        com.ss.android.ugc.aweme.story.draft.b.a(a2);
                        com.ss.android.ugc.aweme.draft.model.d.g(a2);
                    }
                }
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
    public final boolean isPublishing(Context context) {
        l.d(context, "");
        IAVPublishService publishService = AVExternalServiceImpl.a().publishService();
        if ((!publishService.isParallelPublishEnabled() || publishService.isParallelPublishTaskFinished()) && !isStoryPublishing()) {
            cr.a();
            if (cr.h()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
    public final boolean retryPublish(String str) {
        l.d(str, "");
        com.ss.android.ugc.aweme.story.publish.a.c d2 = com.ss.android.ugc.aweme.story.publish.a.a.d(str);
        if (d2 != null) {
            d2.f138093e.putBoolean("publish_retry", true);
        }
        boolean a2 = com.ss.android.ugc.aweme.story.publish.a.a.a(str);
        if (a2) {
            l.d(str, "");
            com.ss.android.ugc.aweme.story.publish.a.c cVar = com.ss.android.ugc.aweme.story.publish.a.a.f138046d.get(str);
            if (cVar != null) {
                com.ss.android.ugc.aweme.story.publish.a.a.a(new com.ss.android.ugc.aweme.story.publish.foreground.a(n.a(new ScheduleInfo(cVar.f138092d, cVar.f138093e))), str, false);
            }
        }
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
    public final boolean addCallback(String str, com.ss.android.ugc.aweme.shortvideo.publish.k kVar) {
        l.d(str, "");
        l.d(kVar, "");
        return com.ss.android.ugc.aweme.story.publish.a.a.a(kVar, str, true);
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
    public final boolean removeCallback(String str, com.ss.android.ugc.aweme.shortvideo.publish.k kVar) {
        l.d(str, "");
        l.d(kVar, "");
        return com.ss.android.ugc.aweme.story.publish.a.a.a(kVar, str);
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
    public final void getCover(String str, StoryCoverExtractConfig storyCoverExtractConfig, h.f.a.b<? super Bitmap, z> bVar) {
        boolean z;
        l.d(str, "");
        l.d(storyCoverExtractConfig, "");
        l.d(bVar, "");
        q c2 = com.ss.android.ugc.aweme.story.publish.a.a.c(str);
        if (c2 != null && (c2.f129882k instanceof VideoPublishEditModel)) {
            BaseShortVideoContext baseShortVideoContext = c2.f129882k;
            if (!(baseShortVideoContext instanceof VideoPublishEditModel)) {
                baseShortVideoContext = null;
            }
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
            if (!(videoPublishEditModel == null || videoPublishEditModel.ttStoryUploadModel == null)) {
                BaseShortVideoContext baseShortVideoContext2 = c2.f129882k;
                Objects.requireNonNull(baseShortVideoContext2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
                VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) baseShortVideoContext2;
                TTStoryUploadModel tTStoryUploadModel = videoPublishEditModel2.ttStoryUploadModel;
                if (tTStoryUploadModel == null || tTStoryUploadModel.getContentType() != 2) {
                    z = false;
                } else {
                    z = true;
                }
                EditPreviewInfo previewInfo = videoPublishEditModel2.getPreviewInfo();
                l.b(previewInfo, "");
                com.ss.android.ugc.aweme.story.edit.model.a.a(previewInfo, z, storyCoverExtractConfig, bVar);
                return;
            }
        }
        bVar.invoke(null);
    }
}
