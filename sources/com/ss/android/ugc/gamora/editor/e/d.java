package com.ss.android.ugc.gamora.editor.e;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.internal.main.l;
import com.ss.android.ugc.aweme.filter.repository.internal.main.r;
import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel;
import com.ss.android.ugc.aweme.property.aj;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.dg;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.utils.bz;
import com.ss.android.ugc.aweme.utils.fa;
import com.ss.android.ugc.aweme.utils.hk;
import com.ss.android.ugc.gamora.editor.e.a;
import com.ss.android.ugc.gamora.editor.filter.a;
import com.ss.android.ugc.gamora.editor.gesture.EditGestureViewModel;
import com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.ss.android.vesdk.VECherEffectParam;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.filterparam.VEComposerFilterParam;
import com.ss.android.vesdk.x;
import com.zhiliaoapp.musically.R;
import dmt.av.video.CompileProbeViewModel;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.VEPreviewParams;
import dmt.av.video.u;
import h.f.a.q;
import h.f.a.r;
import h.f.b.z;
import h.z;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public final class d extends com.ss.android.ugc.aweme.shortvideo.preview.b<c> implements c {

    /* renamed from: m  reason: collision with root package name */
    public static final f f145827m = new f((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    final h.h f145828j = h.i.a((h.f.a.a) new g(this));

    /* renamed from: k  reason: collision with root package name */
    public FilterBean f145829k;

    /* renamed from: l  reason: collision with root package name */
    final h.h f145830l = h.i.a((h.f.a.a) new o(this));
    private final h.h n = h.i.a(h.m.NONE, new a(this));
    private final h.h o = h.i.a(h.m.NONE, new b(this));
    private final h.h p = h.i.a(h.m.NONE, new c(this));
    private final h.h q = h.i.a(h.m.NONE, new C3887d(this));
    private final h.h r = h.i.a(h.m.NONE, new e(this));
    private final h.h s;
    private final boolean t;
    private boolean u;
    private final h.h v;
    private final Map<String, Integer> w;
    private final t<z> x;
    private final VEPreviewParams y;

    static {
        Covode.recordClassIndex(95807);
    }

    /* access modifiers changed from: package-private */
    public final EditGestureViewModel ac() {
        return (EditGestureViewModel) this.n.getValue();
    }

    /* access modifiers changed from: package-private */
    public final FTCEditInfoStickerViewModel ad() {
        return (FTCEditInfoStickerViewModel) this.o.getValue();
    }

    /* access modifiers changed from: package-private */
    public final EditStickerViewModel ae() {
        return (EditStickerViewModel) this.p.getValue();
    }

    /* access modifiers changed from: package-private */
    public final FTCEditStickerViewModel af() {
        return (FTCEditStickerViewModel) this.q.getValue();
    }

    /* access modifiers changed from: package-private */
    public final EditInfoStickerViewModel ag() {
        return (EditInfoStickerViewModel) this.r.getValue();
    }

    public final VideoPublishEditModel ah() {
        return (VideoPublishEditModel) this.s.getValue();
    }

    public static final class f {
        static {
            Covode.recordClassIndex(95813);
        }

        private f() {
        }

        public /* synthetic */ f(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.b
    public final boolean W() {
        return this.u;
    }

    @Override // com.ss.android.ugc.gamora.editor.e.c
    public final LiveData<z> X() {
        return this.x;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.b, com.bytedance.als.j
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.gamora.editor.e.c
    public final VideoPublishEditModel Y() {
        return ah();
    }

    @Override // com.ss.android.ugc.gamora.editor.e.c
    public final void Z() {
        this.x.setValue(z.f158842a);
    }

    static final class n extends h.f.b.m implements h.f.a.a<VideoPublishEditModel> {
        final /* synthetic */ com.bytedance.o.f $diContainer;

        static {
            Covode.recordClassIndex(95825);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(com.bytedance.o.f fVar) {
            super(0);
            this.$diContainer = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ VideoPublishEditModel invoke() {
            Object a2 = this.$diContainer.a((Type) VideoPublishEditModel.class, (String) null);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<EditGestureViewModel> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(95808);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.gesture.EditGestureViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.gesture.EditGestureViewModel invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.gamora.editor.e.d r0 = r2.this$0
                androidx.fragment.app.e r0 = r0.T()
                com.bytedance.jedi.arch.s r1 = com.bytedance.jedi.arch.t.a(r0)
                java.lang.Class<com.ss.android.ugc.gamora.editor.gesture.EditGestureViewModel> r0 = com.ss.android.ugc.gamora.editor.gesture.EditGestureViewModel.class
                com.bytedance.jedi.arch.JediViewModel r0 = r1.a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.e.d.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<FTCEditInfoStickerViewModel> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(95809);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.gamora.editor.e.d r0 = r2.this$0
                androidx.fragment.app.e r0 = r0.T()
                com.bytedance.jedi.arch.s r1 = com.bytedance.jedi.arch.t.a(r0)
                java.lang.Class<com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel> r0 = com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel.class
                com.bytedance.jedi.arch.JediViewModel r0 = r1.a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.e.d.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<EditStickerViewModel> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(95810);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.gamora.editor.e.d r0 = r2.this$0
                androidx.fragment.app.e r0 = r0.T()
                com.bytedance.jedi.arch.s r1 = com.bytedance.jedi.arch.t.a(r0)
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel> r0 = com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel.class
                com.bytedance.jedi.arch.JediViewModel r0 = r1.a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.e.d.c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.e.d$d  reason: collision with other inner class name */
    public static final class C3887d extends h.f.b.m implements h.f.a.a<FTCEditStickerViewModel> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(95811);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3887d(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.gamora.editor.e.d r0 = r2.this$0
                androidx.fragment.app.e r0 = r0.T()
                com.bytedance.jedi.arch.s r1 = com.bytedance.jedi.arch.t.a(r0)
                java.lang.Class<com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel> r0 = com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel.class
                com.bytedance.jedi.arch.JediViewModel r0 = r1.a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.e.d.C3887d.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<EditInfoStickerViewModel> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(95812);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.gamora.editor.e.d r0 = r2.this$0
                androidx.fragment.app.e r0 = r0.T()
                com.bytedance.jedi.arch.s r1 = com.bytedance.jedi.arch.t.a(r0)
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel> r0 = com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel.class
                com.bytedance.jedi.arch.JediViewModel r0 = r1.a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.e.d.e.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<CompileProbeViewModel> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(95814);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CompileProbeViewModel invoke() {
            return ae.a(this.this$0.T(), (ad.b) null).a(CompileProbeViewModel.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.b
    public final dmt.av.video.b.j aa() {
        dmt.av.video.b.j a2 = dmt.av.video.b.m.a(ah().videoEditorType, this.f129607a.f129652f);
        a2.x = new h(this);
        return a2;
    }

    static final class k extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(95819);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.aweme.filter.c.a value = this.this$0.f129608b.getValue();
            if (value != null) {
                if (!value.f95495c) {
                    this.this$0.d().a(value.f95494b, this.this$0.f129607a.f129647a.invoke().booleanValue());
                } else {
                    this.this$0.a(value.f95494b, value.f95496d);
                }
            }
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<a> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(95826);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            SurfaceView cA_ = this.this$0.cA_();
            com.ss.android.ugc.asve.editor.g b2 = this.this$0.d().b();
            if (b2 == null) {
                h.f.b.l.b();
            }
            return new a(cA_, b2, new q<Float, Float, Float, z>(this.this$0) {
                /* class com.ss.android.ugc.gamora.editor.e.d.o.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(95827);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // h.f.a.q
                public final /* synthetic */ z invoke(Float f2, Float f3, Float f4) {
                    float floatValue = f2.floatValue();
                    float floatValue2 = f3.floatValue();
                    float floatValue3 = f4.floatValue();
                    d dVar = (d) this.receiver;
                    dVar.ae().c(new EditStickerViewModel.x(floatValue, floatValue2, floatValue3));
                    dVar.ae().a(floatValue, floatValue2, floatValue3);
                    dVar.ae().c(new EditStickerViewModel.y(floatValue, floatValue2, floatValue3));
                    dVar.ae().c(new EditStickerViewModel.w(floatValue, floatValue2, floatValue3));
                    dVar.ac().c(new EditGestureViewModel.e(floatValue, floatValue2, floatValue3));
                    if (com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
                        dVar.ad().c(new FTCEditInfoStickerViewModel.e(floatValue, floatValue2, floatValue3));
                        dVar.af().c(new FTCEditStickerViewModel.i(floatValue, floatValue2, floatValue3));
                    } else {
                        dVar.ag().c(new EditInfoStickerViewModel.h(floatValue, floatValue2, floatValue3));
                        dVar.ae().a(floatValue, floatValue2, floatValue3);
                    }
                    return z.f158842a;
                }
            }, new h.f.a.b<Float, z>(this.this$0) {
                /* class com.ss.android.ugc.gamora.editor.e.d.o.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(95828);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(Float f2) {
                    float floatValue = f2.floatValue();
                    d dVar = (d) this.receiver;
                    dVar.ac().c(new EditGestureViewModel.a(floatValue));
                    if (com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
                        dVar.ad().c(new FTCEditInfoStickerViewModel.a(floatValue));
                        dVar.af().c(new FTCEditStickerViewModel.a(floatValue));
                    } else {
                        dVar.ag().c(new EditInfoStickerViewModel.a(floatValue));
                        dVar.ae().c(new EditStickerViewModel.a(floatValue));
                    }
                    return z.f158842a;
                }
            }, new r<Integer, Integer, Integer, Integer, z>(this.this$0) {
                /* class com.ss.android.ugc.gamora.editor.e.d.o.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(95829);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // h.f.a.r
                public final /* synthetic */ z a(Integer num, Integer num2, Integer num3, Integer num4) {
                    ((d) this.receiver).a(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
                    return z.f158842a;
                }
            });
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.filter.a> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(95816);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.filter.a invoke() {
            com.ss.android.ugc.aweme.filter.repository.internal.main.l a2 = l.a.a(this.this$0.f129607a.f129650d.invoke());
            com.ss.android.ugc.aweme.filter.repository.a.n value = this.this$0.U().getValue();
            com.ss.android.ugc.aweme.filter.repository.a.k value2 = this.this$0.V().getValue();
            if (value == null || h.f.b.l.a(value.getClass(), a2.getClass()) || value2 == null) {
                return null;
            }
            return new com.ss.android.ugc.gamora.editor.filter.a(com.ss.android.ugc.aweme.filter.repository.internal.main.m.a(a2, new com.ss.android.ugc.aweme.filter.repository.a.k() {
                /* class com.ss.android.ugc.gamora.editor.e.d.i.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(95817);
                }

                @Override // com.ss.android.ugc.aweme.filter.repository.a.k
                public final float a(FilterBean filterBean) {
                    h.f.b.l.d(filterBean, "");
                    return 0.8f;
                }
            }), com.ss.android.ugc.aweme.filter.repository.internal.main.m.a(value, value2));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.b, com.bytedance.als.j
    public final void onStart() {
        com.ss.android.ugc.asve.editor.g cC_;
        com.ss.android.ugc.asve.editor.g cC_2;
        if (aj.a() && es.k(ah()) && (cC_ = cC_()) != null) {
            x.j f2 = cC_.f();
            if (f2 == null) {
                f2 = x.j.ERROR;
            }
            if (f2.getValue() < x.j.PREPARED.getValue()) {
                com.ss.android.ugc.asve.editor.g cC_3 = cC_();
                if (cC_3 != null) {
                    cC_3.q();
                }
                if (!ah().editMusicSyncMode && (cC_2 = cC_()) != null) {
                    cC_2.I();
                }
            }
        }
        super.onStart();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.b
    public final void ab() {
        b.a.f132249a.step("av_video_edit", "VEEditor init start");
        super.ab();
        if (this.y.veCherEffectParam != null) {
            VECherEffectParam vECherEffectParam = this.y.veCherEffectParam;
            h.f.b.l.b(vECherEffectParam, "");
            if (vECherEffectParam.getMatrix() != null) {
                com.ss.android.ugc.asve.editor.g b2 = d().b();
                VECherEffectParam vECherEffectParam2 = this.y.veCherEffectParam;
                h.f.b.l.b(vECherEffectParam2, "");
                b2.a(vECherEffectParam2);
            }
        }
        if (d() instanceof dmt.av.video.b.o) {
            d().b().a(0, 1, this.y.mMusicVolume);
        } else if (d() instanceof dmt.av.video.b.p) {
            d().b().a(0, 1, this.y.mMusicVolume);
        } else if (d() instanceof dmt.av.video.b.n) {
            d().b().a(0, 0, this.y.mVolume);
        } else if (this.y.mAudioPaths != null && this.y.mAudioPaths.length == 1) {
            d().b().a(0, 0, this.y.mVolume);
        }
        if (this.y.isFastImport || this.y.isCutSameType) {
            d().b().a(d().b().a().f151435j, d().b().a().f151436k, this.y.mVolume);
        }
        b.a.f132249a.step("av_video_edit", "VEEditor init end");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.b, com.bytedance.als.j
    public final void onCreate() {
        StitchParams stitchParams;
        super.onCreate();
        A().observe(this, new j(this));
        if (ah().isMusic() == 1 && (ah().recordMode == 0 || ah().mIsFromDraft)) {
            VEPreviewMusicParams vEPreviewMusicParams = new VEPreviewMusicParams();
            vEPreviewMusicParams.f156736a = ah().mMusicPath;
            vEPreviewMusicParams.f156737b = ah().mMusicStart;
            vEPreviewMusicParams.n = ah().recordBgmDelay;
            if (ah().loudnessBalanceParam != null) {
                vEPreviewMusicParams.o = ah().loudnessBalanceParam.getBgmLoudness();
                vEPreviewMusicParams.p = ah().loudnessBalanceParam.getPeakLoudness();
                vEPreviewMusicParams.q = ah().loudnessBalanceParam.getAvgLoudness();
            }
            String str = ah().mMusicPath;
            h.f.b.l.d(ah(), "");
            vEPreviewMusicParams.f156738c = fa.a(str);
            if (cr.a().f125295a != null) {
                com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
                if (cVar == null) {
                    h.f.b.l.b();
                }
                if (cVar.getShootDuration() > 0) {
                    int i2 = vEPreviewMusicParams.f156738c;
                    com.ss.android.ugc.aweme.shortvideo.c cVar2 = cr.a().f125295a;
                    if (cVar2 == null) {
                        h.f.b.l.b();
                    }
                    if (Math.abs(i2 - cVar2.getShootDuration()) >= 1000) {
                        com.ss.android.ugc.aweme.shortvideo.c cVar3 = cr.a().f125295a;
                        if (cVar3 == null) {
                            h.f.b.l.b();
                        }
                        vEPreviewMusicParams.f156739d = cVar3.getShootDuration();
                        vEPreviewMusicParams.f156740e = ah().musicVolume;
                        vEPreviewMusicParams.f156741f = ah().musicId;
                        vEPreviewMusicParams.f156742g = ah().previewStartTime;
                        vEPreviewMusicParams.f156744i = ah().isFastImport;
                        Boolean bool = ah().isSoundLoop;
                        h.f.b.l.b(bool, "");
                        vEPreviewMusicParams.f156747l = bool.booleanValue();
                        if (ah().isStitchMode() && (stitchParams = ah().getStitchParams()) != null && stitchParams.isPGCMusic() && stitchParams.getMusicStart() >= 0) {
                            long duration = stitchParams.getDuration();
                            vEPreviewMusicParams.f156745j = 0;
                            vEPreviewMusicParams.f156746k = (int) duration;
                        }
                        a(vEPreviewMusicParams);
                    }
                }
            }
            vEPreviewMusicParams.f156739d = vEPreviewMusicParams.f156738c;
            vEPreviewMusicParams.f156740e = ah().musicVolume;
            vEPreviewMusicParams.f156741f = ah().musicId;
            vEPreviewMusicParams.f156742g = ah().previewStartTime;
            vEPreviewMusicParams.f156744i = ah().isFastImport;
            Boolean bool2 = ah().isSoundLoop;
            h.f.b.l.b(bool2, "");
            vEPreviewMusicParams.f156747l = bool2.booleanValue();
            long duration2 = stitchParams.getDuration();
            vEPreviewMusicParams.f156745j = 0;
            vEPreviewMusicParams.f156746k = (int) duration2;
            a(vEPreviewMusicParams);
        } else if (bz.a(ah()) && cr.a().f125295a == null) {
            VEPreviewMusicParams vEPreviewMusicParams2 = new VEPreviewMusicParams();
            vEPreviewMusicParams2.f156748m = true;
            a(vEPreviewMusicParams2);
        }
        if (ah().isMusic() == 1 && ah().recordMode == 1) {
            ah().mMusicPath = null;
        }
        com.ss.android.ugc.gamora.editor.filter.a aVar = (com.ss.android.ugc.gamora.editor.filter.a) this.v.getValue();
        if (aVar != null) {
            k kVar = new k(this);
            h.f.b.l.d(kVar, "");
            String str2 = aVar.f145849a.get(com.ss.android.ugc.aweme.port.in.g.a().r().h().b());
            if (str2 != null && !aVar.f145850b.getBoolean("Edit_Filter_Data_Has_Migrated_".concat(String.valueOf(str2)), false)) {
                new com.ss.android.ugc.aweme.filter.b(a.d.f145854a, new a.e(str2)).a(new a.b(aVar, str2, kVar), a.c.f145853a);
            }
        }
        j().observe(this, new l(this));
        if (hk.a(ah().mSelectedFilterId) || hk.a(ah().mSelectedFilterResId)) {
            b(new com.ss.android.ugc.aweme.filter.c.a(true, es.a(ah(), com.ss.android.ugc.aweme.port.in.g.a().r().d())));
        }
        t<u> E = E();
        E.observe(this, new m(this));
        E.observe(this, new dmt.av.video.e());
        AudioRecorderParam veAudioRecordParam = this.y.getVeAudioRecordParam();
        if (veAudioRecordParam != null && !TextUtils.isEmpty(veAudioRecordParam.getAudioUrl())) {
            h.f.b.l.b(veAudioRecordParam, "");
            com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.h.a(this, veAudioRecordParam);
        }
    }

    static final class h implements VEListener.v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f145831a;

        static {
            Covode.recordClassIndex(95815);
        }

        h(d dVar) {
            this.f145831a = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x032d, code lost:
            if (r3 == com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult.State.CANCEL) goto L_0x032f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x03c9, code lost:
            if (r10 != null) goto L_0x03cb;
         */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x03d4  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x0473  */
        @Override // com.ss.android.vesdk.VEListener.v
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
            // Method dump skipped, instructions count: 1673
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.e.d.h.a():void");
        }
    }

    public static final class p implements com.ss.android.ugc.aweme.filter.repository.a.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.asve.editor.g f145835a;

        static {
            Covode.recordClassIndex(95830);
        }

        p(com.ss.android.ugc.asve.editor.g gVar) {
            this.f145835a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.filter.repository.a.k
        public final float a(FilterBean filterBean) {
            h.f.b.l.d(filterBean, "");
            float c2 = com.ss.android.ugc.aweme.filter.repository.internal.utils.a.c(filterBean);
            if (c2 != 0.0f) {
                return c2;
            }
            com.ss.android.ugc.asve.editor.g gVar = this.f145835a;
            String filterFolder = filterBean.getFilterFolder();
            h.f.b.l.b(filterFolder, "");
            return gVar.c(filterFolder);
        }
    }

    static final class j<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f145832a;

        static {
            Covode.recordClassIndex(95818);
        }

        j(d dVar) {
            this.f145832a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f145832a.d().a((com.ss.android.ugc.aweme.shortvideo.edit.b.b) obj, "");
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.b
    public final com.ss.android.ugc.aweme.filter.repository.a.n a(String str) {
        h.f.b.l.d(str, "");
        if (com.ss.android.ugc.aweme.filter.b.b.a()) {
            return r.a.a(str);
        }
        return l.a.a(str);
    }

    static final class l<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f145833a;

        static {
            Covode.recordClassIndex(95820);
        }

        l(d dVar) {
            this.f145833a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.filter.c.a aVar = (com.ss.android.ugc.aweme.filter.c.a) obj;
            if (aVar != null) {
                FilterBean filterBean = aVar.f95494b;
                if (this.f145833a.f145829k == null) {
                    this.f145833a.f145829k = filterBean;
                } else if (filterBean != null) {
                    FilterBean filterBean2 = this.f145833a.f145829k;
                    if (filterBean2 == null) {
                        h.f.b.l.b();
                    }
                    if (filterBean2.getId() != filterBean.getId()) {
                        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("enter_from", "video_edit_page").a("creation_id", this.f145833a.ah().creationId).a("shoot_way", this.f145833a.ah().mShootWay).a("draft_id", this.f145833a.ah().draftId).a("filter_id", filterBean.getId()).a("filter_name", filterBean.getEnName());
                        com.ss.android.ugc.aweme.filter.repository.a.n value = this.f145833a.U().getValue();
                        if (value == null) {
                            h.f.b.l.b();
                        }
                        h.f.b.l.b(value, "");
                        com.ss.android.ugc.aweme.filter.repository.a.n nVar = value;
                        com.ss.android.ugc.aweme.filter.repository.a.k value2 = this.f145833a.V().getValue();
                        if (value2 == null) {
                            h.f.b.l.b();
                        }
                        h.f.b.l.b(value2, "");
                        com.ss.android.ugc.tools.f.b a3 = a2.a("value", Float.valueOf(com.ss.android.ugc.aweme.filter.c.a(filterBean, nVar, value2)));
                        if (this.f145833a.ah().draftId != 0) {
                            a3.a("draft_id", this.f145833a.ah().draftId);
                        }
                        if (!TextUtils.isEmpty(this.f145833a.ah().newDraftId)) {
                            a3.a("new_draft_id", this.f145833a.ah().newDraftId);
                        }
                        com.ss.android.ugc.aweme.common.r.a("adjust_filter_complete", a3.f149193a);
                        this.f145833a.f145829k = filterBean;
                    }
                }
            }
        }
    }

    static final class m<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f145834a;

        static {
            Covode.recordClassIndex(95821);
        }

        m(d dVar) {
            this.f145834a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            float f2;
            int i2;
            int i3;
            int e2;
            u uVar = (u) obj;
            if (uVar != null) {
                final z.a aVar = new z.a();
                int i4 = 0;
                aVar.element = false;
                final z.a aVar2 = new z.a();
                aVar2.element = false;
                final int i5 = uVar.f156966k;
                if (uVar.f156965j == 1) {
                    aVar.element = false;
                    aVar2.element = false;
                } else if (uVar.f156965j == 0) {
                    aVar.element = true;
                    aVar2.element = uVar.f156961f;
                }
                a aVar3 = (a) this.f145834a.f145830l.getValue();
                boolean z = aVar.element;
                int i6 = uVar.f156958c;
                int i7 = uVar.f156959d;
                int i8 = uVar.f156960e;
                Boolean bool = uVar.f156964i;
                AnonymousClass1 r1 = new h.f.a.b<b, h.z>(this) {
                    /* class com.ss.android.ugc.gamora.editor.e.d.m.AnonymousClass1 */
                    final /* synthetic */ m this$0;

                    static {
                        Covode.recordClassIndex(95822);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ h.z invoke(b bVar) {
                        b bVar2 = bVar;
                        h.f.b.l.d(bVar2, "");
                        AnonymousClass1 r0 = new h.f.a.a<h.z>(this) {
                            /* class com.ss.android.ugc.gamora.editor.e.d.m.AnonymousClass1.AnonymousClass1 */
                            final /* synthetic */ AnonymousClass1 this$0;

                            static {
                                Covode.recordClassIndex(95823);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // h.f.a.a
                            public final /* synthetic */ h.z invoke() {
                                if (!aVar.element) {
                                    VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = this.this$0.this$0.f145834a.d().f156778e;
                                    if (vEEditorAutoStartStopArbiter == null) {
                                        h.f.b.l.b();
                                    }
                                    vEEditorAutoStartStopArbiter.a(true, false);
                                    com.ss.android.ugc.asve.editor.g b2 = this.this$0.this$0.f145834a.d().b();
                                    if (b2 != null) {
                                        b2.b(i5);
                                    }
                                    androidx.fragment.app.e T = this.this$0.this$0.f145834a.T();
                                    if (T instanceof VEVideoPublishEditActivity) {
                                        ((VEVideoPublishEditActivity) T).b(i5);
                                    }
                                } else {
                                    androidx.fragment.app.e T2 = this.this$0.this$0.f145834a.T();
                                    if (T2 instanceof VEVideoPublishEditActivity) {
                                        ((VEVideoPublishEditActivity) T2).b(androidx.core.content.b.c(this.this$0.this$0.f145834a.T(), R.color.a2));
                                    }
                                }
                                return h.z.f158842a;
                            }
                        };
                        h.f.b.l.d(r0, "");
                        bVar2.f145823a = r0;
                        AnonymousClass2 r02 = new h.f.a.a<h.z>(this) {
                            /* class com.ss.android.ugc.gamora.editor.e.d.m.AnonymousClass1.AnonymousClass2 */
                            final /* synthetic */ AnonymousClass1 this$0;

                            static {
                                Covode.recordClassIndex(95824);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // h.f.a.a
                            public final /* synthetic */ h.z invoke() {
                                if (aVar.element) {
                                    com.ss.android.ugc.asve.editor.g b2 = this.this$0.this$0.f145834a.d().b();
                                    if (b2 != null) {
                                        b2.b(i5);
                                    }
                                    VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = this.this$0.this$0.f145834a.d().f156778e;
                                    if (vEEditorAutoStartStopArbiter == null) {
                                        h.f.b.l.b();
                                    }
                                    vEEditorAutoStartStopArbiter.a(false, aVar2.element);
                                }
                                return h.z.f158842a;
                            }
                        };
                        h.f.b.l.d(r02, "");
                        bVar2.f145824b = r02;
                        return h.z.f158842a;
                    }
                };
                h.f.b.l.d(r1, "");
                b bVar = new b();
                r1.invoke(bVar);
                bVar.f145823a.invoke();
                dh.e(aVar3.f145807c);
                int width = aVar3.f145809e.getWidth();
                dh.c(aVar3.f145807c);
                VESize b2 = aVar3.f145810f.b();
                int i9 = b2.height;
                int i10 = b2.width;
                float f3 = (float) i9;
                float f4 = ((float) i10) / f3;
                if (i8 > i9) {
                    ViewGroup.LayoutParams layoutParams = aVar3.f145809e.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (z) {
                        i4 = (((((dh.e(aVar3.f145807c) - i6) - i7) - i9) / 2) + i6) - marginLayoutParams.topMargin;
                        e2 = 0;
                    } else {
                        e2 = (((((dh.e(aVar3.f145807c) - i6) - i7) - i9) / 2) + i6) - marginLayoutParams.topMargin;
                    }
                    aVar3.a(i4, e2);
                    aVar3.f145812h.invoke(Float.valueOf((float) e2));
                } else {
                    if (z) {
                        f2 = (float) i8;
                    } else {
                        f2 = f3;
                        f3 = (float) i8;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
                    h.f.b.l.b(ofFloat, "");
                    ofFloat.setDuration(300L);
                    ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                    ofFloat.addUpdateListener(new a.C3885a(aVar3, z, i9, i10, f4, width, i6));
                    ofFloat.addListener(new a.b(bVar));
                    ofFloat.start();
                    if (!dg.a(i10, i9)) {
                        if (!z) {
                            ViewGroup.LayoutParams layoutParams2 = aVar3.f145809e.getLayoutParams();
                            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            aVar3.f145805a = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin - i6;
                            i3 = -aVar3.f145805a;
                            i2 = 0;
                        } else {
                            i2 = -aVar3.f145805a;
                            i3 = 0;
                        }
                        aVar3.a(i2, i3);
                    }
                }
                if (bool != null) {
                    aVar3.f145810f.a(bool.booleanValue());
                } else {
                    aVar3.f145810f.a(z);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.b
    public final void c(com.ss.android.ugc.aweme.filter.c.a aVar) {
        boolean z;
        String filterFolder;
        if (aVar != null) {
            if (!aVar.f95495c) {
                FilterBean filterBean = aVar.f95494b;
                if (filterBean == null || !com.ss.android.ugc.aweme.filter.repository.internal.utils.a.a(filterBean)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    int j2 = d().j();
                    FilterBean filterBean2 = d().B;
                    if (filterBean2 != null) {
                        this.w.remove(filterBean2.getFilterFolder());
                        String filterFolder2 = filterBean2.getFilterFolder();
                        FilterBean filterBean3 = aVar.f95494b;
                        if (filterBean3 != null && (filterFolder = filterBean3.getFilterFolder()) != null) {
                            Integer num = this.w.get(filterFolder);
                            if (num != null) {
                                int intValue = num.intValue();
                                com.ss.android.ugc.asve.editor.g value = C().getValue();
                                if (value != null) {
                                    if (intValue == 1) {
                                        h.f.b.l.b(filterFolder2, "");
                                        a(value, filterFolder, filterFolder2, 1.0f, j2);
                                    } else if (intValue == 2) {
                                        h.f.b.l.b(filterFolder2, "");
                                        a(value, filterFolder2, filterFolder, 0.0f, j2);
                                    }
                                }
                            }
                            this.w.remove(filterFolder);
                        } else {
                            return;
                        }
                    }
                    if (!this.w.keySet().isEmpty()) {
                        Object[] array = this.w.keySet().toArray(new String[0]);
                        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                        VEComposerFilterParam vEComposerFilterParam = new VEComposerFilterParam();
                        vEComposerFilterParam.autoDump = true;
                        vEComposerFilterParam.removeComposerNodes((String[]) array);
                        d().b().a(j2, vEComposerFilterParam);
                        this.w.clear();
                    }
                }
                d().a(aVar.f95494b, this.f129607a.f129647a.invoke().booleanValue());
                FilterBean filterBean4 = aVar.f95494b;
                if (filterBean4 != null) {
                    ah().mSelectedFilterResId = filterBean4.getResId();
                    ah().mSelectedFilterId = String.valueOf(filterBean4.getId());
                    ah().mSelectedFilterLabel = filterBean4.getEnName();
                } else {
                    ah().mSelectedFilterResId = null;
                }
                FilterBean filterBean5 = d().B;
                if (filterBean5 != null) {
                    Map<String, Integer> map = this.w;
                    String filterFolder3 = filterBean5.getFilterFolder();
                    h.f.b.l.b(filterFolder3, "");
                    map.put(filterFolder3, 3);
                }
            } else if (aVar.f95494b != null) {
                a(aVar.f95494b, aVar.f95496d);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(com.bytedance.o.f fVar, VEPreviewParams vEPreviewParams, h.f.a.b<? super com.ss.android.ugc.aweme.shortvideo.preview.d, h.z> bVar) {
        super(fVar, vEPreviewParams, bVar, (byte) 0);
        boolean z;
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(vEPreviewParams, "");
        boolean z2 = false;
        this.y = vEPreviewParams;
        this.s = h.i.a((h.f.a.a) new n(fVar));
        if (ah().videoEditorType == 6) {
            z = true;
        } else {
            z = false;
        }
        this.t = z;
        this.u = (!z || !vEPreviewParams.recordData.isMultiEditRetake) ? true : z2;
        this.v = h.i.a((h.f.a.a) new i(this));
        this.w = new LinkedHashMap();
        this.x = new t<>();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a, com.ss.android.ugc.aweme.shortvideo.preview.b
    public final void a(FilterBean filterBean, FilterBean filterBean2, float f2) {
        com.ss.android.ugc.asve.editor.g value;
        if (filterBean != null && filterBean2 != null && (value = C().getValue()) != null) {
            if (this.f129607a.f129647a.invoke().booleanValue()) {
                p pVar = new p(value);
                h.f.b.l.b(value, "");
                com.ss.android.ugc.aweme.filter.repository.a.n value2 = k().getValue();
                if (value2 == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(value2, "");
                float a2 = com.ss.android.ugc.aweme.filter.c.a(filterBean, value2, pVar);
                com.ss.android.ugc.aweme.filter.repository.a.n value3 = k().getValue();
                if (value3 == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(value3, "");
                a(value, filterBean, filterBean2, f2, a2, com.ss.android.ugc.aweme.filter.c.a(filterBean2, value3, pVar));
                return;
            }
            h.f.b.l.b(value, "");
            a(value, filterBean, filterBean2, f2, 0.0f, 0.0f);
        }
    }

    public final void a(int i2, int i3, int i4, int i5) {
        ViewGroup.LayoutParams layoutParams = cB_().getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = i2;
        layoutParams2.topMargin = i3;
        layoutParams2.width = i4;
        layoutParams2.height = i5;
        cB_().setLayoutParams(layoutParams2);
    }

    private static void a(com.ss.android.ugc.asve.editor.g gVar, String str, String str2, float f2, int i2) {
        VEComposerFilterParam vEComposerFilterParam = new VEComposerFilterParam();
        vEComposerFilterParam.autoDump = true;
        vEComposerFilterParam.updateMultiComposerNodes(new String[]{str, str2}, new String[]{"leftSlidePosition", "rightSlidePosition"}, new float[]{f2, f2});
        gVar.a(i2, vEComposerFilterParam);
    }

    private final void a(com.ss.android.ugc.asve.editor.g gVar, FilterBean filterBean, FilterBean filterBean2, float f2, float f3, float f4) {
        float f5;
        float f6;
        if (filterBean != null && filterBean2 != null) {
            boolean a2 = com.ss.android.ugc.aweme.filter.repository.internal.utils.a.a(filterBean);
            boolean a3 = com.ss.android.ugc.aweme.filter.repository.internal.utils.a.a(filterBean2);
            if (!a2 || !a3) {
                if (f2 < 0.0f) {
                    f5 = Math.abs(f2);
                } else {
                    f5 = 1.0f - f2;
                }
                if (f3 == 0.0f || f4 == 0.0f) {
                    gVar.a(filterBean.getFilterFolder(), filterBean2.getFilterFolder(), f5);
                } else {
                    gVar.a(filterBean.getFilterFolder(), filterBean2.getFilterFolder(), f5, f3, f4);
                }
            } else {
                String filterFolder = filterBean.getFilterFolder();
                String filterFolder2 = filterBean2.getFilterFolder();
                if (f2 < 0.0f) {
                    f6 = Math.abs(f2);
                } else {
                    f6 = 1.0f - f2;
                }
                if (Math.abs(f2) <= 0.05f) {
                    if (f2 <= 0.0f) {
                        f6 = 0.0f;
                    } else {
                        f6 = 1.0f;
                    }
                }
                int j2 = d().j();
                if (f6 == 0.0f) {
                    if (this.w.containsKey(filterFolder)) {
                        h.f.b.l.b(filterFolder, "");
                        h.f.b.l.b(filterFolder2, "");
                        a(gVar, filterFolder, filterFolder2, 0.0f, j2);
                        VEComposerFilterParam vEComposerFilterParam = new VEComposerFilterParam();
                        vEComposerFilterParam.autoDump = true;
                        vEComposerFilterParam.removeComposerNodes(new String[]{filterBean.getFilterFolder()});
                        gVar.a(j2, vEComposerFilterParam);
                        this.w.remove(filterFolder2);
                    }
                } else if (f6 != 1.0f) {
                    if (!this.w.containsKey(filterFolder)) {
                        VEComposerFilterParam vEComposerFilterParam2 = new VEComposerFilterParam();
                        vEComposerFilterParam2.autoDump = true;
                        vEComposerFilterParam2.appendComposerNodesWithTag(new String[]{filterFolder + ":leftSlidePosition:0"}, new String[]{""});
                        gVar.a(j2, vEComposerFilterParam2);
                        vEComposerFilterParam2.updateMultiComposerNodes(new String[]{filterFolder}, new String[]{com.ss.android.ugc.aweme.filter.repository.internal.utils.a.b(filterBean)}, new float[]{f3});
                        gVar.a(j2, vEComposerFilterParam2);
                        Map<String, Integer> map = this.w;
                        h.f.b.l.b(filterFolder, "");
                        map.put(filterFolder, 1);
                    }
                    if (!this.w.containsKey(filterFolder2)) {
                        VEComposerFilterParam vEComposerFilterParam3 = new VEComposerFilterParam();
                        vEComposerFilterParam3.autoDump = true;
                        vEComposerFilterParam3.appendComposerNodesWithTag(new String[]{filterFolder2 + ":rightSlidePosition:1"}, new String[]{""});
                        gVar.a(j2, vEComposerFilterParam3);
                        vEComposerFilterParam3.updateMultiComposerNodes(new String[]{filterFolder2}, new String[]{com.ss.android.ugc.aweme.filter.repository.internal.utils.a.b(filterBean2)}, new float[]{f4});
                        gVar.a(j2, vEComposerFilterParam3);
                        Map<String, Integer> map2 = this.w;
                        h.f.b.l.b(filterFolder2, "");
                        map2.put(filterFolder2, 2);
                    }
                    h.f.b.l.b(filterFolder, "");
                    h.f.b.l.b(filterFolder2, "");
                    a(gVar, filterFolder, filterFolder2, f6, j2);
                } else if (this.w.containsKey(filterFolder2)) {
                    h.f.b.l.b(filterFolder, "");
                    h.f.b.l.b(filterFolder2, "");
                    a(gVar, filterFolder, filterFolder2, 1.0f, j2);
                    VEComposerFilterParam vEComposerFilterParam4 = new VEComposerFilterParam();
                    vEComposerFilterParam4.autoDump = true;
                    vEComposerFilterParam4.removeComposerNodes(new String[]{filterBean2.getFilterFolder()});
                    gVar.a(j2, vEComposerFilterParam4);
                    this.w.remove(filterFolder2);
                }
            }
        }
    }
}
