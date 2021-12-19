package com.ss.android.ugc.aweme.shortvideo.vechoosecover;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.publish.f.h;
import com.ss.android.ugc.aweme.settings.i;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.r;
import com.ss.android.ugc.aweme.shortvideo.publish.s;
import com.ss.android.ugc.aweme.shortvideo.publish.u;
import com.ss.android.ugc.aweme.shortvideo.upload.y;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import com.ss.android.ugc.tools.utils.q;
import com.ss.ttuploader.UploadEventManager;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3435a f132515a = new C3435a((byte) 0);

    static {
        Covode.recordClassIndex(86734);
    }

    public abstract void a(AbstractImageUploader abstractImageUploader, com.ss.android.ugc.aweme.publish.f.e eVar);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.a$a  reason: collision with other inner class name */
    public static final class C3435a {
        static {
            Covode.recordClassIndex(86735);
        }

        private C3435a() {
        }

        public /* synthetic */ C3435a(byte b2) {
            this();
        }
    }

    public static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ Object $args;
        final /* synthetic */ c $resolveMonitorMetricsBuilder$1;

        static {
            Covode.recordClassIndex(86739);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(Object obj, c cVar) {
            super(0);
            this.$args = obj;
            this.$resolveMonitorMetricsBuilder$1 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            JSONObject a2;
            Object obj = this.$args;
            if (obj instanceof VideoPublishEditModel) {
                a2 = this.$resolveMonitorMetricsBuilder$1.invoke((VideoPublishEditModel) obj).a(s.SUCCESS).a();
            } else {
                a2 = new ar().a();
            }
            if (i.a()) {
                g.a().I().a("upload_cover_text_image_suc_rate", 0, a2);
            }
            g.a().I().a("aweme_movie_publish_error_rate_parallel", 0, a2);
        }
    }

    public static com.ss.android.ugc.aweme.publish.b.a.a<h> a(h hVar) {
        return new b(hVar);
    }

    public static final class b extends com.ss.android.ugc.aweme.publish.b.a.a<h> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f132516b;

        static {
            Covode.recordClassIndex(86736);
        }

        b(h hVar) {
            this.f132516b = hVar;
            if (hVar != null) {
                hVar.f118766h = "";
            } else {
                hVar = null;
            }
            b(hVar);
        }
    }

    public static final class c extends m implements h.f.a.b<VideoPublishEditModel, com.ss.android.ugc.aweme.publish.g.b> {
        final /* synthetic */ boolean $isRetryPublish;
        final /* synthetic */ String $publishId;

        static {
            Covode.recordClassIndex(86737);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, boolean z) {
            super(1);
            this.$publishId = str;
            this.$isRetryPublish = z;
        }

        /* renamed from: a */
        public final com.ss.android.ugc.aweme.publish.g.b invoke(VideoPublishEditModel videoPublishEditModel) {
            l.d(videoPublishEditModel, "");
            ar arVar = new ar();
            l.b(arVar, "");
            return new com.ss.android.ugc.aweme.publish.g.b(arVar).a(this.$publishId).a(videoPublishEditModel).a(r.COVER_TEXT_UPLOAD).a(u.VIDEO).a().b().a(this.$isRetryPublish);
        }
    }

    public static final class d extends m implements h.f.a.m<Throwable, String, z> {
        final /* synthetic */ Object $args;
        final /* synthetic */ c $resolveMonitorMetricsBuilder$1;

        static {
            Covode.recordClassIndex(86738);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Object obj, c cVar) {
            super(2);
            this.$args = obj;
            this.$resolveMonitorMetricsBuilder$1 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Throwable th, String str) {
            a(th, str);
            return z.f158842a;
        }

        public final void a(Throwable th, String str) {
            JSONObject a2;
            l.d(th, "");
            l.d(str, "");
            if (this.$args instanceof VideoPublishEditModel) {
                File file = new File(str);
                a2 = this.$resolveMonitorMetricsBuilder$1.invoke((VideoPublishEditModel) this.$args).a(new com.ss.android.ugc.aweme.publish.g.b.c(th, str)).a(s.FAILED).a("file_exist", Boolean.valueOf(file.exists())).a("file_size", Long.valueOf(file.length())).a("file_path", str).a();
            } else {
                a2 = new ar().a();
            }
            if (i.a()) {
                g.a().I().a("upload_cover_text_image_suc_rate", 1, a2);
            }
            g.a().I().a("aweme_movie_publish_error_rate_parallel", 1, a2);
        }
    }

    public static final class f extends com.ss.android.ugc.aweme.publish.b.a.a<h> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f132517b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.publish.f.e f132518c;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ h f132519i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ e f132520j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ String f132521k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Object f132522l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ d f132523m;

        static {
            Covode.recordClassIndex(86740);
        }

        public f(a aVar, com.ss.android.ugc.aweme.publish.f.e eVar, h hVar, e eVar2, String str, Object obj, d dVar) {
            this.f132517b = aVar;
            this.f132518c = eVar;
            this.f132519i = hVar;
            this.f132520j = eVar2;
            this.f132521k = str;
            this.f132522l = obj;
            this.f132523m = dVar;
            try {
                final AbstractImageUploader a2 = com.ss.android.ugc.aweme.uploader.factory.a.a(eVar);
                try {
                    a2.a(new AbstractImageUploader.a(this) {
                        /* class com.ss.android.ugc.aweme.shortvideo.vechoosecover.a.f.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ f f132524a;

                        static {
                            Covode.recordClassIndex(86741);
                        }

                        {
                            this.f132524a = r1;
                        }

                        @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader.a
                        public final void a(int i2, long j2, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
                            String str;
                            JSONArray popAllEvents;
                            if (i2 == a2.a()) {
                                a2.d();
                                f fVar = this.f132524a;
                                h hVar = fVar.f132519i;
                                if (hVar != null) {
                                    hVar.f118766h = imageUploadInfo.getMImageToskey();
                                } else {
                                    hVar = null;
                                }
                                fVar.b(hVar);
                                this.f132524a.f132520j.a();
                                return;
                            }
                            boolean z = true;
                            if (i2 == a2.b()) {
                                a2.d();
                                File file = new File(this.f132524a.f132521k);
                                if (file.exists() && file.length() != 0) {
                                    z = false;
                                }
                                StringBuilder sb = new StringBuilder("video type: ");
                                if (this.f132524a.f132522l instanceof VideoPublishEditModel) {
                                    str = "video";
                                } else {
                                    str = "photomovie";
                                }
                                q.a("CoverInfoUploader", sb.append(str).toString());
                                if (z && (this.f132524a.f132522l instanceof VideoPublishEditModel)) {
                                    EffectTextModel effectTextModel = ((VideoPublishEditModel) this.f132524a.f132522l).getCoverPublishModel().getEffectTextModel();
                                    StringBuilder append = new StringBuilder("hasCoverText: ").append(effectTextModel.getHasCoverText()).append(", isCoverTextValid: ").append(effectTextModel.isCoverTextValid()).append(", coverTextInfo: ").append(effectTextModel.getTextSticker()).append(", model: ");
                                    VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.f132524a.f132522l;
                                    l.d(videoPublishEditModel, "");
                                    q.a("CoverInfoUploader", append.append("isMV: " + videoPublishEditModel.isMvThemeVideoType() + ", isDraft: " + videoPublishEditModel.mIsFromDraft + ", draftId: " + videoPublishEditModel.draftId + ", newDraftId: " + videoPublishEditModel.newDraftId).toString());
                                }
                                StringBuilder append2 = new StringBuilder("cover text image upload failed ... error code : ").append(Long.valueOf(imageUploadInfo.getMErrorCode())).append(',').append("image info: path=").append(this.f132524a.f132521k).append("&exist=").append(file.exists()).append("&length=").append(file.length()).append(", error msg : ");
                                if (com.ss.android.ugc.aweme.uploader.f.a()) {
                                    popAllEvents = new JSONArray();
                                } else {
                                    popAllEvents = UploadEventManager.instance.popAllEvents();
                                    l.b(popAllEvents, "");
                                }
                                q.a("CoverInfoUploader", append2.append(popAllEvents).toString());
                                y yVar = new y(new com.ss.android.ugc.aweme.uploader.g(imageUploadInfo.getMEncryptionImageTosKey(), imageUploadInfo.getMImageToskey(), imageUploadInfo.getMImageToskey(), imageUploadInfo.getMProgress(), imageUploadInfo.getMErrorCode(), imageUploadInfo.getMExtra(), "", imageUploadInfo.getMMetaInfo(), 8));
                                this.f132524a.a((Throwable) yVar);
                                this.f132524a.f132523m.a(yVar, this.f132524a.f132521k);
                            } else if (i2 == 1) {
                                this.f132524a.a((int) j2);
                            }
                        }
                    });
                    aVar.a(a2, eVar);
                    a2.a(new String[]{str});
                    boolean n = g.a().w().n();
                    a2.a(n);
                    q.a("CoverImageFuture enableBoe:".concat(String.valueOf(n)));
                    a2.c();
                } catch (Exception e2) {
                    a2.d();
                    throw e2;
                }
            } catch (Throwable th) {
                q.a(th);
                dVar.a(th, str);
                a(th);
            }
        }
    }
}
