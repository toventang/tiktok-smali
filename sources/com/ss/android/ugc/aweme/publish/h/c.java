package com.ss.android.ugc.aweme.publish.h;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.publish.d;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.shortvideo.ab.m;
import com.ss.android.ugc.aweme.shortvideo.ab.n;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.publish.aa;
import com.ss.android.ugc.aweme.shortvideo.ui.cj;
import com.ss.android.ugc.aweme.shortvideo.ui.r;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.ad;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.nio.ByteBuffer;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private final h f118802a = i.a((h.f.a.a) a.f118803a);

    static {
        Covode.recordClassIndex(77157);
    }

    static final class a extends m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f118803a = new a();

        static {
            Covode.recordClassIndex(77158);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b();
        }
    }

    @Override // com.ss.android.ugc.aweme.publish.d
    public final com.ss.android.ugc.aweme.publish.c a() {
        return (b) this.f118802a.getValue();
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ h.f.a.b $failureCallback;
        final /* synthetic */ VideoPublishEditModel $model;
        final /* synthetic */ int $saveFrom = 1;
        final /* synthetic */ h.f.a.b $successCallback;

        static {
            Covode.recordClassIndex(77159);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VideoPublishEditModel videoPublishEditModel, h.f.a.b bVar, h.f.a.b bVar2) {
            super(0);
            this.$model = videoPublishEditModel;
            this.$successCallback = bVar;
            this.$failureCallback = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            final com.ss.android.ugc.aweme.draft.model.c a2 = cj.a(this.$model);
            l.b(a2, "");
            cr.a().q = a2.r();
            n.a(new m.c(a2, this.$saveFrom, this.$model, new IDraftService.DraftSaveListener(this) {
                /* class com.ss.android.ugc.aweme.publish.h.c.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f118804a;

                static {
                    Covode.recordClassIndex(77160);
                }

                @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
                public final void onDraftSaveSuccess() {
                    g.a().c().a(a2, true);
                    com.ss.android.ugc.aweme.port.in.c.D.d().a().b(a2);
                    Application application = com.ss.android.ugc.aweme.port.in.c.f115622a;
                    l.b(application, "");
                    if (application != null) {
                        new com.ss.android.ugc.aweme.shortvideo.publish.z(application, new aa(application, this.f118804a.$model)).a(a2);
                    }
                    this.f118804a.$successCallback.invoke(a2);
                }

                @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
                public final void onDraftSaveFailed(DraftSaveResult draftSaveResult) {
                    l.d(draftSaveResult, "");
                    this.f118804a.$failureCallback.invoke(draftSaveResult);
                }

                {
                    this.f118804a = r1;
                }
            }));
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.publish.d
    public final void a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        r.a(videoPublishEditModel);
    }

    @Override // com.ss.android.ugc.aweme.publish.d
    public final void a(VideoPublishEditModel videoPublishEditModel, h.f.a.b<? super com.ss.android.ugc.aweme.draft.model.c, z> bVar, h.f.a.b<? super DraftSaveResult, z> bVar2) {
        int i2;
        l.d(videoPublishEditModel, "");
        l.d(bVar, "");
        l.d(bVar2, "");
        Application application = com.ss.android.ugc.aweme.port.in.c.f115622a;
        l.b(application, "");
        b bVar3 = new b(videoPublishEditModel, bVar, bVar2);
        if (!videoPublishEditModel.isMultiVideoEdit()) {
            bVar3.invoke();
        } else if (com.ss.android.ugc.tools.utils.i.a(videoPublishEditModel.multiEditVideoRecordData.coverImagePath)) {
            bVar3.invoke();
        } else {
            MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
            l.b(curMultiEditVideoRecordData, "");
            VERecordData a2 = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.a(curMultiEditVideoRecordData);
            MultiEditVideoRecordData curMultiEditVideoRecordData2 = videoPublishEditModel.getCurMultiEditVideoRecordData();
            l.b(curMultiEditVideoRecordData2, "");
            Pair<Integer, Integer> playInOutTime = curMultiEditVideoRecordData2.getPlayInOutTime();
            l.b(playInOutTime, "");
            a2.a(((Number) playInOutTime.first).longValue() * 1000, ((Number) playInOutTime.second).longValue() * 1000);
            int i3 = (int) (videoPublishEditModel.mVideoCoverStartTm * 1000.0f);
            if (videoPublishEditModel.isUseTimeReverseEffect()) {
                int intValue = ((Number) playInOutTime.second).intValue();
                Object obj = playInOutTime.first;
                l.b(obj, "");
                i2 = (intValue - ((Number) obj).intValue()) - i3;
            } else {
                i2 = i3;
            }
            int dimensionPixelOffset = application.getResources().getDimensionPixelOffset(R.dimen.j6);
            VEUtils.getVideoThumb(a2, i2, dimensionPixelOffset, (int) (((float) dimensionPixelOffset) / ((((float) videoPublishEditModel.videoWidth()) * 1.0f) / ((float) videoPublishEditModel.videoHeight()))), false, new C3043c(videoPublishEditModel, application, bVar3));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.h.c$c  reason: collision with other inner class name */
    static final class C3043c implements ad {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f118806a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f118807b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f118808c;

        static {
            Covode.recordClassIndex(77161);
        }

        C3043c(VideoPublishEditModel videoPublishEditModel, Context context, h.f.a.a aVar) {
            this.f118806a = videoPublishEditModel;
            this.f118807b = context;
            this.f118808c = aVar;
        }

        @Override // com.ss.android.vesdk.ad
        public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
            MethodCollector.i(12007);
            l.d(byteBuffer, "");
            Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
            EffectTextModel effectTextModel = this.f118806a.getCoverPublishModel().getEffectTextModel();
            l.b(createBitmap, "");
            Bitmap mergeCoverText = effectTextModel.mergeCoverText(createBitmap);
            androidx.core.graphics.drawable.b a2 = androidx.core.graphics.drawable.d.a(this.f118807b.getResources(), mergeCoverText);
            l.b(a2, "");
            a2.a(com.bytedance.common.utility.n.b(com.ss.android.ugc.aweme.port.in.c.f115622a, 4.0f));
            if (TextUtils.isEmpty(this.f118806a.multiEditVideoRecordData.coverImagePath)) {
                this.f118806a.multiEditVideoRecordData.coverImagePath = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a();
            }
            String str = this.f118806a.multiEditVideoRecordData.coverImagePath;
            l.b(str, "");
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a(mergeCoverText, str);
            this.f118808c.invoke();
            MethodCollector.o(12007);
            return false;
        }
    }
}
