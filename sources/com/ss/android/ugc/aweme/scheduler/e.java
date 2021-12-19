package com.ss.android.ugc.aweme.scheduler;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.c.a.s;
import com.ss.android.ugc.aweme.common.ad;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory;
import com.ss.android.ugc.aweme.scheduler.i;
import com.ss.android.ugc.aweme.settings.m;
import com.ss.android.ugc.aweme.settings.o;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.shortvideo.ee;
import com.ss.android.ugc.aweme.shortvideo.et;
import com.ss.android.ugc.aweme.shortvideo.j;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.publish.ah;
import com.ss.android.ugc.aweme.shortvideo.publish.d;
import com.ss.android.ugc.aweme.shortvideo.publish.k;
import com.ss.android.ugc.aweme.shortvideo.publish.p;
import com.ss.android.ugc.aweme.shortvideo.publish.q;
import com.ss.android.ugc.aweme.shortvideo.publish.y;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.shortvideo.v.f;
import com.ss.android.ugc.aweme.shortvideo.v.h;
import com.ss.android.ugc.aweme.shortvideo.x;
import com.ss.android.ugc.tools.f.b;
import h.a.n;
import h.f.b.l;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class e {
    static {
        Covode.recordClassIndex(78740);
    }

    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public f f120852a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i.a f120853b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ IPublishServiceFactory f120854c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f120855d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f120856e;

        static {
            Covode.recordClassIndex(78741);
        }

        @Override // com.ss.android.ugc.aweme.scheduler.c
        public final void a() {
            d();
        }

        @Override // com.ss.android.ugc.aweme.scheduler.c
        public final void b() {
            f fVar = this.f120852a;
            if (fVar != null) {
                fVar.i();
            }
        }

        @Override // com.ss.android.ugc.aweme.scheduler.c
        public final void c() {
            f fVar = this.f120852a;
            if (fVar != null) {
                fVar.j();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.scheduler.e$a$a  reason: collision with other inner class name */
        public static final class C3126a implements x<ai> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f120857a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ k f120858b;

            static {
                Covode.recordClassIndex(78742);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.x
            public final void onParallelPublishCancel() {
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.x
            public final void onParallelPublishPause() {
                this.f120858b.onStageUpdate("STAGE_SYNTHETIC_PAUSE", new ah.a(new y.a("")), this.f120857a.f120853b.f120917f);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.x
            public final void onParallelPublishResume() {
                this.f120858b.onStageUpdate("STAGE_SYNTHETIC_RESUME", new ah.a(new y.a("")), this.f120857a.f120853b.f120917f);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.x
            public final void onSynthetiseSuccess(String str) {
                l.d(str, "");
                this.f120858b.onStageUpdate("STAGE_SYNTHETIC", new ah.a(new y.a(str)), null);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.x
            public final void onError(et etVar) {
                boolean z;
                boolean z2;
                l.d(etVar, "");
                l.d(etVar, "");
                Throwable cause = etVar.getCause();
                if ((!(cause instanceof ee) || ((ee) cause).getCode() != -66666) && (!(cause instanceof com.ss.android.ugc.aweme.shortvideo.upload.y) || ((com.ss.android.ugc.aweme.shortvideo.upload.y) cause).getErrorCode() != -39993)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    this.f120858b.onFinish(d.a.f129782a, null);
                } else {
                    bj.b("PublishScheduler | PublishFailed: " + s.b(etVar));
                    if (this.f120857a.f120853b.f120917f.f129879h == 0) {
                        etVar.setRecover(true);
                    }
                    int i2 = this.f120857a.f120853b.f120917f.f129879h;
                    BaseShortVideoContext baseShortVideoContext = this.f120857a.f120853b.f120917f.f129882k;
                    q qVar = this.f120857a.f120853b.f120917f;
                    l.d(baseShortVideoContext, "");
                    l.d(qVar, "");
                    if (i2 == 0) {
                        a(((VideoPublishEditModel) baseShortVideoContext).creationId, false, qVar);
                    }
                    this.f120858b.onFinish(new d.b(new p("", "", etVar.isUserNetworkBad(), etVar.getCause(), Boolean.valueOf(etVar.isRecover()))), null);
                    ad a2 = c.t.a(this.f120857a.f120853b.f120917f.f129882k);
                    if (c.t.a(a2)) {
                        c.t.a(null, a2, "", 20016);
                    }
                    g.a().o().k().a("publish", "PublishScheduler | PublishFailed: " + s.b(etVar));
                    if (!(etVar.getCause() instanceof com.ss.android.ugc.aweme.publish.d.a)) {
                        z2 = false;
                        com.ss.android.ugc.aweme.port.in.l.f115658a.k().getPublishXService().reportPublishFailure(etVar, z2);
                    }
                }
                z2 = true;
                com.ss.android.ugc.aweme.port.in.l.f115658a.k().getPublishXService().reportPublishFailure(etVar, z2);
            }

            C3126a(a aVar, k kVar) {
                this.f120857a = aVar;
                this.f120858b = kVar;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.x
            public final void onProgressUpdate(int i2, boolean z) {
                this.f120858b.onProgress(i2, Boolean.valueOf(z));
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.x
            public final void onSuccess(ai aiVar, boolean z) {
                String str;
                String str2;
                l.d(aiVar, "");
                if (this.f120857a.f120853b.f120917f.f129879h == 0) {
                    BaseShortVideoContext baseShortVideoContext = this.f120857a.f120853b.f120917f.f129882k;
                    Objects.requireNonNull(baseShortVideoContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
                    c.r.a(aiVar, baseShortVideoContext.getVideoLength());
                    aiVar.setVideoCoverPath((String) n.h((List) this.f120857a.f120853b.f120917f.f129881j));
                }
                this.f120858b.onFinish(new d.c(aiVar), Boolean.valueOf(z));
                int i2 = this.f120857a.f120853b.f120917f.f129879h;
                BaseShortVideoContext baseShortVideoContext2 = this.f120857a.f120853b.f120917f.f129882k;
                l.d(baseShortVideoContext2, "");
                if (!(aiVar == null || aiVar.mSaveModel == null)) {
                    AVUploadSaveModel aVUploadSaveModel = aiVar.mSaveModel;
                    l.b(aVUploadSaveModel, "");
                    if (aVUploadSaveModel.isSaveLocal()) {
                        com.ss.android.ugc.aweme.shortvideo.a a2 = c.x.a(aiVar);
                        if (a2 != null) {
                            str = a2.aid;
                            l.b(str, "");
                        } else {
                            str = "";
                        }
                        if (i2 != 0 || !(baseShortVideoContext2 instanceof VideoPublishEditModel)) {
                            str2 = "";
                        } else {
                            str2 = bl.a((VideoPublishEditModel) baseShortVideoContext2);
                        }
                        r.a("download_publish_finish", new b().a("scene_id", 1004).a("group_id", str).a("content_type", str2).a("download_type", "self").a("download_method", "download_with_publish").f149193a);
                    }
                }
                int i3 = this.f120857a.f120853b.f120917f.f129879h;
                BaseShortVideoContext baseShortVideoContext3 = this.f120857a.f120853b.f120917f.f129882k;
                String str3 = this.f120857a.f120853b.f120917f.f129872a;
                q qVar = this.f120857a.f120853b.f120917f;
                l.d(baseShortVideoContext3, "");
                l.d(str3, "");
                l.d(qVar, "");
                com.ss.android.ugc.aweme.common.s sVar = new com.ss.android.ugc.aweme.common.s();
                if (i3 == 0) {
                    VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext3;
                    sVar.a("bitrate", String.valueOf(com.ss.android.ugc.aweme.property.b.c())).a("duration", String.valueOf(videoPublishEditModel.getVideoLength())).a("resolution", String.valueOf(videoPublishEditModel.videoWidth()) + "x" + videoPublishEditModel.videoHeight()).a("shoot_way", str3);
                    a(videoPublishEditModel.creationId, true, qVar);
                }
                c.t.b(this.f120857a.f120853b.f120917f.f129882k);
            }

            private static void a(String str, boolean z, q qVar) {
                if (qVar.f129875d) {
                    b a2 = new b().a("is_success", z ? 1 : 0);
                    if (str == null) {
                        str = "";
                    }
                    r.a("publish_retry_status", a2.a("creation_id", str).a("is_story", qVar.f129883l ? 1 : 0).f149193a);
                }
            }
        }

        private final void d() {
            x<ai> a2;
            int i2 = this.f120853b.f120917f.f129874c;
            if (i2 == 0) {
                if (!this.f120853b.f120917f.f129883l && (a2 = this.f120854c.a(this.f120853b.f120917f.f129879h, this.f120853b.f120917f.f129882k)) != null) {
                    h.b(new f(a2), this.f120856e);
                }
                e();
                f fVar = this.f120852a;
                if (fVar != null) {
                    fVar.a(this.f120853b.f120917f.f129882k);
                    return;
                }
                return;
            }
            f fVar2 = this.f120852a;
            if (fVar2 != null) {
                fVar2.a(this.f120853b.f120917f.f129882k, i2);
            }
        }

        private final void e() {
            String str;
            if (o.a()) {
                if (this.f120853b.f120917f.f129882k instanceof VideoPublishEditModel) {
                    BaseShortVideoContext baseShortVideoContext = this.f120853b.f120917f.f129882k;
                    Objects.requireNonNull(baseShortVideoContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
                    str = baseShortVideoContext.getDraftPrimaryKey();
                } else {
                    str = null;
                }
                h.d("setRecoverKey ".concat(String.valueOf(str)));
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (m.a()) {
                    g.a().o().l().b(str);
                } else {
                    g.a().o().l().a(str);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.scheduler.c
        public final void a(com.ss.android.ugc.aweme.shortvideo.publish.a.a aVar) {
            l.d(aVar, "");
            f fVar = this.f120852a;
            if (fVar != null) {
                fVar.a(aVar);
            }
        }

        @Override // com.ss.android.ugc.aweme.scheduler.c
        public final void a(k kVar) {
            l.d(kVar, "");
            h hVar = new h();
            boolean z = false;
            hVar.f132493a.put("split_video_count", 0);
            hVar.f132493a.put("is_shoutouts", Boolean.valueOf(this.f120853b.f120917f.f129877f));
            BaseShortVideoContext baseShortVideoContext = this.f120853b.f120917f.f129882k;
            TTStoryUploadModel tTStoryUploadModel = null;
            if (!(baseShortVideoContext instanceof VideoPublishEditModel)) {
                baseShortVideoContext = null;
            }
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
            if (videoPublishEditModel != null) {
                tTStoryUploadModel = videoPublishEditModel.ttStoryUploadModel;
            }
            Map<String, Object> map = hVar.f132493a;
            if (tTStoryUploadModel != null) {
                z = true;
            }
            map.put("is_story", Boolean.valueOf(z));
            this.f120852a = this.f120854c.a(this.f120853b.f120917f.f129874c, this.f120855d, this.f120853b.f120917f.f129879h, this.f120853b.f120917f.f129878g, this.f120853b.f120917f.f129872a, this.f120853b.f120917f.f129875d, hVar, new C3126a(this, kVar));
            g.a().o().k().a("initPublisher", "publisher type is " + this.f120852a);
            d();
        }

        a(i.a aVar, IPublishServiceFactory iPublishServiceFactory, j jVar, String str) {
            this.f120853b = aVar;
            this.f120854c = iPublishServiceFactory;
            this.f120855d = jVar;
            this.f120856e = str;
        }
    }
}
