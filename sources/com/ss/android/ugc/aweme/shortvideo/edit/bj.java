package com.ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.als.dsl.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.bytedance.o.n;
import com.bytedance.o.p;
import com.ss.android.ugc.aweme.experiment.eq;
import com.ss.android.ugc.aweme.infoSticker.i;
import com.ss.android.ugc.aweme.property.bu;
import com.ss.android.ugc.aweme.setting.q;
import com.ss.android.ugc.aweme.shortvideo.cut.v;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.bg;
import dmt.av.video.VEPreviewParams;
import dmt.av.video.b.s;
import h.f.b.l;
import h.f.b.m;
import h.k.g;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public final class bj {
    static {
        Covode.recordClassIndex(83298);
    }

    static final class c extends m implements h.f.a.b<n, z> {
        final /* synthetic */ VEVideoPublishEditActivity $this_bindComponents;

        static {
            Covode.recordClassIndex(83301);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
            super(1);
            this.$this_bindComponents = vEVideoPublishEditActivity;
        }

        public static final class a extends p<VEVideoPublishEditActivity> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f126976a;

            static {
                Covode.recordClassIndex(83302);
            }

            public a(c cVar) {
                this.f126976a = cVar;
            }

            @Override // com.bytedance.o.p
            public final VEVideoPublishEditActivity get(f fVar) {
                l.d(fVar, "");
                return this.f126976a.$this_bindComponents;
            }
        }

        public static final class b extends p<VideoPublishEditModel> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f126977a;

            static {
                Covode.recordClassIndex(83303);
            }

            public b(c cVar) {
                this.f126977a = cVar;
            }

            @Override // com.bytedance.o.p
            public final VideoPublishEditModel get(f fVar) {
                l.d(fVar, "");
                return this.f126977a.$this_bindComponents.f126706k;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.bj$c$c  reason: collision with other inner class name */
        public static final class C3297c extends p<i> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f126978a;

            static {
                Covode.recordClassIndex(83304);
            }

            public C3297c(c cVar) {
                this.f126978a = cVar;
            }

            @Override // com.bytedance.o.p
            public final i get(f fVar) {
                l.d(fVar, "");
                return this.f126978a.$this_bindComponents.f126707l;
            }
        }

        public static final class d extends p<bq> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f126979a;

            static {
                Covode.recordClassIndex(83305);
            }

            public d(c cVar) {
                this.f126979a = cVar;
            }

            @Override // com.bytedance.o.p
            public final bq get(f fVar) {
                l.d(fVar, "");
                VideoPublishEditModel videoPublishEditModel = this.f126979a.$this_bindComponents.f126706k;
                l.b(videoPublishEditModel, "");
                return br.a(videoPublishEditModel);
            }
        }

        public static final class e extends p<androidx.lifecycle.m> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f126980a;

            static {
                Covode.recordClassIndex(83306);
            }

            public e(c cVar) {
                this.f126980a = cVar;
            }

            @Override // com.bytedance.o.p
            public final androidx.lifecycle.m get(f fVar) {
                l.d(fVar, "");
                return this.f126980a.$this_bindComponents;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(n nVar) {
            n nVar2 = nVar;
            l.d(nVar2, "");
            l.b(nVar2.a(VEVideoPublishEditActivity.class, (String) null, (p) new a(this)), "");
            l.b(nVar2.a(VideoPublishEditModel.class, (String) null, (p) new b(this)), "");
            l.b(nVar2.a(i.class, (String) null, (p) new C3297c(this)), "");
            l.b(nVar2.a(bq.class, (String) null, (p) new d(this)), "");
            l.b(nVar2.a(androidx.lifecycle.m.class, (String) null, (p) new e(this)), "");
            return z.f158842a;
        }
    }

    public static final class a extends p<com.ss.android.ugc.gamora.editor.e.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f126973a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VEVideoPublishEditActivity f126974b;

        static {
            Covode.recordClassIndex(83299);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.e.d get(f fVar) {
            l.d(fVar, "");
            return bj.a(this.f126974b, fVar);
        }

        public a(com.bytedance.als.dsl.d dVar, VEVideoPublishEditActivity vEVideoPublishEditActivity) {
            this.f126973a = dVar;
            this.f126974b = vEVideoPublishEditActivity;
        }
    }

    static final class b extends m implements h.f.a.b<e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f126975a = new b();

        static {
            Covode.recordClassIndex(83300);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f6462a = com.ss.android.ugc.aweme.setting.i.f.a();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<com.ss.android.ugc.aweme.shortvideo.preview.d, z> {
        final /* synthetic */ VEVideoPublishEditActivity $this_tiktokEditPreviewComponent;

        static final class a extends m implements h.f.a.a<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f126982a = new a();

            static {
                Covode.recordClassIndex(83311);
            }

            a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Boolean invoke() {
                return true;
            }
        }

        static {
            Covode.recordClassIndex(83307);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
            super(1);
            this.$this_tiktokEditPreviewComponent = vEVideoPublishEditActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.shortvideo.preview.d dVar) {
            com.ss.android.ugc.aweme.shortvideo.preview.d dVar2 = dVar;
            l.d(dVar2, "");
            AnonymousClass1 r0 = AnonymousClass1.f126981a;
            l.d(r0, "");
            dVar2.f129647a = r0;
            AnonymousClass2 r1 = new h.f.a.a<Boolean>(this.$this_tiktokEditPreviewComponent) {
                /* class com.ss.android.ugc.aweme.shortvideo.edit.bj.d.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(83309);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ Boolean invoke() {
                    boolean z;
                    VEVideoPublishEditActivity vEVideoPublishEditActivity = (VEVideoPublishEditActivity) this.receiver;
                    boolean z2 = true;
                    boolean z3 = !q.a();
                    if (!vEVideoPublishEditActivity.o || !q.a()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean z4 = vEVideoPublishEditActivity.n;
                    vEVideoPublishEditActivity.n = false;
                    if (!vEVideoPublishEditActivity.f126708m || (!z3 && !z && !z4)) {
                        z2 = false;
                    }
                    return Boolean.valueOf(z2);
                }
            };
            l.d(r1, "");
            dVar2.f129649c = r1;
            g gVar = bk.f126983a;
            l.d(gVar, "");
            dVar2.f129650d = gVar;
            AnonymousClass3 r12 = new h.f.a.a<com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g>(c.a.a()) {
                /* class com.ss.android.ugc.aweme.shortvideo.edit.bj.d.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(83310);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g invoke() {
                    return c.a.c();
                }
            };
            l.d(r12, "");
            dVar2.f129651e = r12;
            dVar2.f129653g = false;
            s sVar = dVar2.f129652f;
            sVar.f156865b = 3;
            sVar.a(a.f126982a);
            sVar.f156867d = bu.a();
            sVar.f156869f = eq.a();
            return z.f158842a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.ss.android.ugc.gamora.editor.e.d a(com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity r7, com.bytedance.o.f r8) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.bj.a(com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity, com.bytedance.o.f):com.ss.android.ugc.gamora.editor.e.d");
    }

    private static final bg a(VEPreviewParams vEPreviewParams, VideoPublishEditModel videoPublishEditModel) {
        if (vEPreviewParams.getEditorHandler() <= 0 || vEPreviewParams.getEditorModel() == null) {
            return null;
        }
        if (vEPreviewParams.isFastImport && vEPreviewParams.mVideoPaths.length == 1) {
            EditVideoSegment editVideoSegment = videoPublishEditModel.getPreviewInfo().getVideoList().get(0);
            VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
            if (videoCutInfo != null) {
                if (videoCutInfo.getEnd() - videoCutInfo.getStart() == editVideoSegment.getVideoFileInfo().getDuration()) {
                    com.ss.android.ugc.tools.utils.q.a("single video import without cut");
                }
            }
            return null;
        }
        bg bgVar = new bg(vEPreviewParams.mVideoPaths);
        bgVar.f151088e = vEPreviewParams.mVTrimIn;
        bgVar.f151089f = vEPreviewParams.mVTrimOut;
        float[] speedArray = vEPreviewParams.getSpeedArray();
        if (speedArray != null) {
            l.b(speedArray, "");
            if (speedArray.length != 0) {
                ArrayList arrayList = new ArrayList(speedArray.length);
                for (float f2 : speedArray) {
                    arrayList.add(Double.valueOf((double) f2));
                }
                bgVar.f151092i = h.a.n.d((Collection<Double>) arrayList);
            }
        }
        int[] rotateArray = vEPreviewParams.getRotateArray();
        if (rotateArray != null) {
            l.b(rotateArray, "");
            if (rotateArray.length != 0) {
                ArrayList arrayList2 = new ArrayList(rotateArray.length);
                for (int i2 : rotateArray) {
                    arrayList2.add(v.a.a(i2));
                }
                Object[] array = arrayList2.toArray(new ROTATE_DEGREE[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                bgVar.f151094k = (ROTATE_DEGREE[]) array;
            }
        }
        return bgVar;
    }
}
