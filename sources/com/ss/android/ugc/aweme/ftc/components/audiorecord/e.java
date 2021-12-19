package com.ss.android.ugc.aweme.ftc.components.audiorecord;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCAudioRecordStartButton;
import com.ss.android.ugc.aweme.ftc.components.audiorecord.b;
import com.ss.android.ugc.aweme.property.bt;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c;
import com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.x;
import com.zhiliaoapp.musically.R;
import dmt.av.video.u;
import h.z;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class e extends com.bytedance.scene.j implements WeakHandler.IHandler, com.bytedance.jedi.arch.b, com.bytedance.o.a {
    public static final c F = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f97717a = {new h.f.b.y(e.class, "mVideoPublishEditModel", "getMVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};
    public f A;
    public AudioRecorderParam B;
    public volatile boolean C;
    public final WeakHandler D;
    public final s E;
    private final h.h G = h.i.a((h.f.a.a) t.f97746a);
    private final h.h H = h.i.a((h.f.a.a) p.f97742a);
    private com.ss.android.ugc.tools.view.a.c I;
    private final h.h.d J;
    private final h.h K;
    private final h.h L;
    private View M;
    private DmtStatusView N;
    private View O;
    private FrameLayout P;
    private ChooseVideoCoverView Q;
    private View R;
    private ViewGroup S;
    private LottieAnimationView T;
    private CheckBox U;
    private VEVideoCoverGeneratorImpl V;
    private com.ss.android.ugc.aweme.shortvideo.widget.p W;
    private androidx.lifecycle.t<Bitmap> X;
    private androidx.lifecycle.t<Boolean> Y;
    private final o Z;
    private final f aa;
    private final com.bytedance.o.f ab;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.asve.editor.g f97718b;

    /* renamed from: c  reason: collision with root package name */
    public int f97719c = 1;

    /* renamed from: d  reason: collision with root package name */
    public float f97720d;

    /* renamed from: e  reason: collision with root package name */
    public final ValueAnimator f97721e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f97722f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f97723g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f97724h;

    /* renamed from: i  reason: collision with root package name */
    public Point f97725i;

    /* renamed from: j  reason: collision with root package name */
    public androidx.lifecycle.t<dmt.av.video.t> f97726j;

    /* renamed from: k  reason: collision with root package name */
    public View f97727k;

    /* renamed from: l  reason: collision with root package name */
    public View f97728l;
    public View t;
    public b u;
    public FTCAudioRecordStartButton v;
    public boolean w;
    public boolean x;
    public View y;
    public AVDmtTextView z;

    static final class q implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final q f97743a = new q();

        static {
            Covode.recordClassIndex(62096);
        }

        q() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(62079);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.shortvideo.preview.a C() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.K.getValue();
    }

    public final androidx.lifecycle.t<Long> a() {
        return (androidx.lifecycle.t) this.G.getValue();
    }

    public final androidx.lifecycle.t<Boolean> b() {
        return (androidx.lifecycle.t) this.H.getValue();
    }

    public final VideoPublishEditModel d() {
        return (VideoPublishEditModel) this.J.a(this, f97717a[0]);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class c {
        static {
            Covode.recordClassIndex(62082);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.ab;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    public final void a(boolean z2) {
        com.bytedance.scene.group.b bVar;
        if (z2 && (bVar = (com.bytedance.scene.group.b) this.o) != null) {
            bVar.e(this);
        }
        ViewGroup viewGroup = this.S;
        if (viewGroup == null) {
            h.f.b.l.a("contentLayout");
        }
        com.ss.android.ugc.aweme.effect.s.a(viewGroup, z2, (int) com.bytedance.common.utility.n.b(this.f42913m, 282.0f), b(R.id.b_h), new y(this, z2));
        if (z2) {
            if (d().veAudioRecorderParam != null) {
                d().veAudioRecorderParam.setNeedDel(true);
                com.ss.android.ugc.aweme.shortvideo.preview.a C2 = C();
                AudioRecorderParam audioRecorderParam = d().veAudioRecorderParam;
                h.f.b.l.b(audioRecorderParam, "");
                com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.h.a(C2, audioRecorderParam);
            } else {
                this.B = new AudioRecorderParam();
            }
            this.B.copyFrom(d().veAudioRecorderParam);
            if (this.B.getNeedOriginalSound()) {
                this.B.setVoiceVolume(d().voiceVolume);
            }
            this.f97725i = null;
            CheckBox checkBox = this.U;
            if (checkBox == null) {
                h.f.b.l.a("checkBox");
            }
            checkBox.setChecked(this.B.getNeedOriginalSound());
            b().setValue(Boolean.valueOf(this.B.getNeedOriginalSound()));
            View view = this.t;
            if (view == null) {
                h.f.b.l.a("mPlayView");
            }
            view.setVisibility(0);
            this.E.a(0.0f, true);
            b bVar2 = this.u;
            if (bVar2 == null) {
                h.f.b.l.a("audioRecordSeekBar");
            }
            bVar2.setStack(this.B.getMStack());
            b bVar3 = this.u;
            if (bVar3 == null) {
                h.f.b.l.a("audioRecordSeekBar");
            }
            bVar3.a(0.0f);
            a().setValue(0L);
            if (this.B.getMStack().isEmpty()) {
                View view2 = this.y;
                if (view2 == null) {
                    h.f.b.l.a("backView");
                }
                view2.setVisibility(8);
            } else {
                View view3 = this.y;
                if (view3 == null) {
                    h.f.b.l.a("backView");
                }
                view3.setVisibility(0);
            }
            com.ss.android.ugc.tools.view.a.c cVar = this.I;
            if (cVar != null) {
                cVar.b(this.Z);
            }
            E();
            if (d().veAudioEffectParam != null) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f42913m).a(R.string.ayn).a();
            }
            C().a(u.a.a(com.ss.android.ugc.aweme.themechange.base.c.a(true, false, false, false), ((int) com.bytedance.common.utility.n.b(this.f42913m, 52.0f)) + dh.c(this.f42913m), (int) com.bytedance.common.utility.n.b(this.f42913m, 282.0f), F(), com.ss.android.ugc.aweme.adaptation.a.f66177a.d(), false, false, 960));
            return;
        }
        View view4 = this.f97727k;
        if (view4 == null) {
            h.f.b.l.a("mSaveView");
        }
        view4.setVisibility(8);
        View view5 = this.f97728l;
        if (view5 == null) {
            h.f.b.l.a("mCancelView");
        }
        view5.setVisibility(8);
        com.ss.android.ugc.tools.view.a.c cVar2 = this.I;
        if (cVar2 != null) {
            cVar2.c(this.Z);
        }
        this.f97721e.cancel();
        com.ss.android.ugc.aweme.shortvideo.preview.a C3 = C();
        View view6 = this.f97727k;
        if (view6 == null) {
            h.f.b.l.a("mSaveView");
        }
        C3.a(u.a.a(androidx.core.content.b.c(view6.getContext(), R.color.a2), ((int) com.bytedance.common.utility.n.b(this.f42913m, 52.0f)) + dh.c(this.f42913m), (int) com.bytedance.common.utility.n.b(this.f42913m, 282.0f), F(), com.ss.android.ugc.aweme.adaptation.a.f66177a.d()));
    }

    public final void a(boolean z2, int i2) {
        androidx.lifecycle.t<dmt.av.video.t> tVar = this.f97726j;
        if (tVar == null) {
            h.f.b.l.a("mPreviewControlOpLiveData");
        }
        tVar.setValue(dmt.av.video.t.b());
        com.ss.android.ugc.asve.editor.g gVar = this.f97718b;
        if (gVar != null) {
            gVar.w();
            a().setValue(Long.valueOf((long) gVar.k()));
        }
        this.f97721e.cancel();
        View view = this.t;
        if (view == null) {
            h.f.b.l.a("mPlayView");
        }
        view.setVisibility(0);
        if (this.w) {
            this.w = false;
            FTCAudioRecordStartButton fTCAudioRecordStartButton = this.v;
            if (fTCAudioRecordStartButton == null) {
                h.f.b.l.a("audioRecordStartButton");
            }
            fTCAudioRecordStartButton.a();
        }
        if (this.x) {
            this.x = false;
            FTCAudioRecordStartButton fTCAudioRecordStartButton2 = this.v;
            if (fTCAudioRecordStartButton2 == null) {
                h.f.b.l.a("audioRecordStartButton");
            }
            fTCAudioRecordStartButton2.b();
        }
        if (this.f97722f) {
            f fVar = this.A;
            if (fVar != null) {
                if (z2) {
                    Point point = this.f97725i;
                    if (point != null) {
                        point.setY(this.f97719c);
                    }
                    fVar.f97753a.a(null);
                } else {
                    int a2 = (int) fVar.f97753a.a(null);
                    if (i2 == -1) {
                        i2 = a2;
                    }
                    Point point2 = this.f97725i;
                    if (point2 != null) {
                        point2.setY(i2);
                    }
                    androidx.lifecycle.t<dmt.av.video.t> tVar2 = this.f97726j;
                    if (tVar2 == null) {
                        h.f.b.l.a("mPreviewControlOpLiveData");
                    }
                    tVar2.setValue(dmt.av.video.t.b((long) i2));
                    b bVar = this.u;
                    if (bVar == null) {
                        h.f.b.l.a("audioRecordSeekBar");
                    }
                    bVar.a(((float) i2) / ((float) this.f97719c));
                }
                b bVar2 = this.u;
                if (bVar2 == null) {
                    h.f.b.l.a("audioRecordSeekBar");
                }
                bVar2.f97697b.invalidate();
            }
            this.f97722f = false;
            Point point3 = this.f97725i;
            if (point3 != null) {
                a().setValue(Long.valueOf((long) point3.getY()));
            }
        }
        this.f97723g = false;
        AudioRecorderParam audioRecorderParam = this.B;
        b bVar3 = this.u;
        if (bVar3 == null) {
            h.f.b.l.a("audioRecordSeekBar");
        }
        audioRecorderParam.setMStack(bVar3.getStack());
        if (this.B.getMStack().isEmpty()) {
            View view2 = this.y;
            if (view2 == null) {
                h.f.b.l.a("backView");
            }
            view2.setVisibility(8);
        } else {
            View view3 = this.y;
            if (view3 == null) {
                h.f.b.l.a("backView");
            }
            view3.setVisibility(0);
        }
        AVDmtTextView aVDmtTextView = this.z;
        if (aVDmtTextView == null) {
            h.f.b.l.a("tvMsg");
        }
        aVDmtTextView.setVisibility(0);
        LottieAnimationView lottieAnimationView = this.T;
        if (lottieAnimationView == null) {
            h.f.b.l.a("lottieAnimationView");
        }
        lottieAnimationView.setVisibility(4);
        LottieAnimationView lottieAnimationView2 = this.T;
        if (lottieAnimationView2 == null) {
            h.f.b.l.a("lottieAnimationView");
        }
        lottieAnimationView2.d();
    }

    /* access modifiers changed from: package-private */
    public static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f97729a;

        static {
            Covode.recordClassIndex(62083);
        }

        d(Runnable runnable) {
            this.f97729a = runnable;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f97729a.run();
            return z.f158842a;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f97742a = new p();

        static {
            Covode.recordClassIndex(62095);
        }

        p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Boolean> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class t extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Long>> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f97746a = new t();

        static {
            Covode.recordClassIndex(62099);
        }

        t() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Long> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f97747a;

        static {
            Covode.recordClassIndex(62100);
        }

        u(Runnable runnable) {
            this.f97747a = runnable;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f97747a.run();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final com.bytedance.jedi.arch.v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        this.f97724h = false;
        super.w();
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        this.f97721e.cancel();
        this.D.removeCallbacksAndMessages(null);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(62080);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.preview.a invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.ftc.components.audiorecord.e r0 = r2.this$0
                androidx.fragment.app.e r0 = com.bytedance.scene.ktx.c.b(r0)
                com.bytedance.als.ApiCenter r1 = com.bytedance.als.ApiCenter.a.a(r0)
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r0 = com.ss.android.ugc.aweme.shortvideo.preview.a.class
                com.bytedance.als.b r0 = r1.a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.audiorecord.e.a.invoke():com.bytedance.als.b");
        }
    }

    private final void E() {
        v vVar = new v(this);
        this.A = new f();
        b.i.b(new u(vVar), com.ss.android.ugc.aweme.cw.g.a());
    }

    private final int F() {
        return ((dh.e(this.f42913m) - ((int) com.bytedance.common.utility.n.b(this.f42913m, 334.0f))) - dh.c(this.f42913m)) - dh.d(this.f42913m);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.e$e  reason: collision with other inner class name */
    public static final class RunnableC2357e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f97730a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f97731b;

        static {
            Covode.recordClassIndex(62084);
        }

        RunnableC2357e(e eVar, String str) {
            this.f97730a = eVar;
            this.f97731b = str;
        }

        public final void run() {
            this.f97730a.C = false;
            this.f97730a.D.sendEmptyMessage(1);
            if (!h.m.p.c(this.f97731b, "df", false)) {
                com.ss.android.ugc.aweme.video.e.c(this.f97731b);
            }
            this.f97730a.D.sendEmptyMessage(4);
        }
    }

    /* access modifiers changed from: package-private */
    public final void D() {
        AudioRecorderParam audioRecorderParam = this.B;
        b bVar = this.u;
        if (bVar == null) {
            h.f.b.l.a("audioRecordSeekBar");
        }
        audioRecorderParam.setMStack(bVar.getStack());
        Boolean value = b().getValue();
        if (value != null) {
            AudioRecorderParam audioRecorderParam2 = this.B;
            h.f.b.l.b(value, "");
            audioRecorderParam2.setNeedOriginalSound(value.booleanValue());
        }
    }

    @Override // com.bytedance.scene.j
    public final void x() {
        super.x();
        if (this.f97722f) {
            new PrivacyCert(new com.bytedance.bpea.basics.j("1085"), "Dubbing when editing a video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()});
            a(this, false, 0, 3);
        }
        this.f97724h = true;
    }

    public static final class b extends h.f.b.m implements h.f.a.a<FTCEditAudioRecordViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(62081);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.$this_hostViewModel
                com.bytedance.scene.j r5 = r0.o
                h.k.c r0 = r6.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                h.f.b.l.b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.s.a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.$viewModelClass$inlined     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                h.f.b.l.b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.$viewModelClass     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ftc_components_audiorecord_FTCEditAudioRecordScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.$this_hostViewModel
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.c.b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a
                androidx.lifecycle.ad r1 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r6.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ftc_components_audiorecord_FTCEditAudioRecordScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.audiorecord.e.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ftc_components_audiorecord_FTCEditAudioRecordScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f97748a;

        static {
            Covode.recordClassIndex(62101);
        }

        v(e eVar) {
            this.f97748a = eVar;
        }

        public final void run() {
            this.f97748a.D.sendEmptyMessage(1);
            new File(dj.n).mkdirs();
            String str = dj.n + System.currentTimeMillis() + ".wav";
            String str2 = dj.n;
            h.f.b.l.b(str2, "");
            e.a(str2, this.f97748a.B.getAudioUrl());
            if (this.f97748a.B.hasRecord()) {
                com.ss.android.ugc.aweme.video.e.c(this.f97748a.B.getAudioUrl(), str);
                f fVar = this.f97748a.A;
                if (fVar != null) {
                    VEAudioEncodeSettings a2 = new VEAudioEncodeSettings.a().a();
                    h.f.b.l.b(a2, "");
                    h.f.b.l.d(str, "");
                    h.f.b.l.d(a2, "");
                    fVar.f97753a.a(str, a2);
                }
                AudioRecorderParam audioRecorderParam = this.f97748a.B;
                f fVar2 = this.f97748a.A;
                if (fVar2 == null) {
                    h.f.b.l.b();
                }
                audioRecorderParam.setAudioUrl(fVar2.a());
            } else {
                com.ss.android.ugc.asve.editor.g gVar = this.f97748a.f97718b;
                if (gVar != null) {
                    new File(dj.n).mkdirs();
                    String str3 = dj.n + System.currentTimeMillis() + ".wav";
                    f fVar3 = this.f97748a.A;
                    if (fVar3 != null) {
                        int j2 = gVar.j();
                        VEAudioEncodeSettings a3 = new VEAudioEncodeSettings.a().a();
                        h.f.b.l.b(a3, "");
                        h.f.b.l.d(str3, "");
                        h.f.b.l.d(a3, "");
                        fVar3.f97753a.a(str3, a3, j2);
                    }
                    AudioRecorderParam audioRecorderParam2 = this.f97748a.B;
                    f fVar4 = this.f97748a.A;
                    if (fVar4 == null) {
                        h.f.b.l.b();
                    }
                    audioRecorderParam2.setAudioUrl(fVar4.a());
                }
            }
            this.f97748a.D.sendEmptyMessage(2);
        }
    }

    public static final class f extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f97732a;

        static {
            Covode.recordClassIndex(62085);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(e eVar) {
            this.f97732a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            String audioUrl;
            String str = "";
            h.f.b.l.d(view, str);
            if (this.f97732a.C) {
                int id = view.getId();
                if (id == R.id.ewh) {
                    e eVar = this.f97732a;
                    if (eVar.f97722f || eVar.f97723g) {
                        new PrivacyCert(new com.bytedance.bpea.basics.j("1079"), "Dubbing when editing a video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()});
                        e.a(eVar, false, 0, 3);
                    }
                    eVar.D();
                    if (eVar.B.hasChange(eVar.d().veAudioRecorderParam)) {
                        a.C0731a aVar = new a.C0731a(eVar.f42913m);
                        aVar.a(R.string.axf).b(R.string.axk, (DialogInterface.OnClickListener) w.f97749a, false).a(R.string.axj, (DialogInterface.OnClickListener) new x(eVar), false);
                        aVar.a().b();
                        return;
                    }
                    eVar.a(eVar.d().musicVolume, eVar.d().voiceVolume);
                    eVar.a(eVar.B.getAudioUrl());
                    if (eVar.d().veAudioRecorderParam != null && eVar.d().veAudioRecorderParam.hasRecord() && eVar.d().veAudioRecorderParam.getAudioRecordIndex() == -2) {
                        com.ss.android.ugc.aweme.shortvideo.preview.a C = eVar.C();
                        AudioRecorderParam audioRecorderParam = eVar.d().veAudioRecorderParam;
                        h.f.b.l.b(audioRecorderParam, str);
                        com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.h.a(C, audioRecorderParam);
                    }
                } else if (id == R.id.f6c) {
                    e eVar2 = this.f97732a;
                    if (eVar2.f97722f || eVar2.f97723g) {
                        new PrivacyCert(new com.bytedance.bpea.basics.j("1080"), "Dubbing when editing a video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()});
                        e.a(eVar2, false, 0, 3);
                    }
                    eVar2.D();
                    if (eVar2.A != null) {
                        eVar2.a(eVar2.d().musicVolume, eVar2.d().voiceVolume);
                        if (eVar2.B.getAudioRecordIndex() < 0 && eVar2.B.hasRecord()) {
                            com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.h.a(eVar2.C(), eVar2.B);
                        }
                    }
                    if (eVar2.d().veAudioRecorderParam == null) {
                        eVar2.d().veAudioRecorderParam = new AudioRecorderParam();
                        audioUrl = str;
                    } else {
                        audioUrl = eVar2.d().veAudioRecorderParam.getAudioUrl();
                    }
                    eVar2.d().veAudioRecorderParam.copyFrom(eVar2.B);
                    if (h.m.p.c(audioUrl, "df", false)) {
                        eVar2.d().veAudioRecorderParam.setExtraUrl(audioUrl);
                    } else {
                        str = audioUrl;
                    }
                    eVar2.B.getNeedOriginalSound();
                    eVar2.a(str);
                } else if (id == R.id.fhv) {
                    e eVar3 = this.f97732a;
                    new PrivacyCert(new com.bytedance.bpea.basics.j("1083"), "Dubbing when editing a video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()});
                    e.a(eVar3, false, 0, 3);
                } else if (id == R.id.qo) {
                    e eVar4 = this.f97732a;
                    if (eVar4.f97722f || eVar4.f97723g) {
                        new PrivacyCert(new com.bytedance.bpea.basics.j("1084"), "Dubbing when editing a video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()});
                        e.a(eVar4, false, 0, 3);
                    }
                    eVar4.B.setNeedDel(true);
                    com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.h.a(eVar4.C(), eVar4.B);
                    b bVar = eVar4.u;
                    if (bVar == null) {
                        h.f.b.l.a("audioRecordSeekBar");
                    }
                    if (!bVar.f97697b.getMStack().empty()) {
                        Point pop = bVar.f97697b.getMStack().pop();
                        bVar.f97697b.invalidate();
                        if (pop != null) {
                            float x = ((float) pop.getX()) / ((float) eVar4.f97719c);
                            pop.setY(pop.getY() + 100);
                            if (pop.getY() > eVar4.f97719c) {
                                pop.setY(eVar4.f97719c);
                            }
                            f fVar = eVar4.A;
                            if (fVar != null) {
                                fVar.f97753a.a(pop.getX(), pop.getY());
                            }
                            eVar4.E.a(x, true);
                            b bVar2 = eVar4.u;
                            if (bVar2 == null) {
                                h.f.b.l.a("audioRecordSeekBar");
                            }
                            bVar2.a(x);
                            AudioRecorderParam audioRecorderParam2 = eVar4.B;
                            b bVar3 = eVar4.u;
                            if (bVar3 == null) {
                                h.f.b.l.a("audioRecordSeekBar");
                            }
                            audioRecorderParam2.setMStack(bVar3.getStack());
                            if (eVar4.B.getMStack().isEmpty()) {
                                View view2 = eVar4.y;
                                if (view2 == null) {
                                    h.f.b.l.a("backView");
                                }
                                view2.setVisibility(8);
                            }
                        }
                    }
                } else if (id == R.id.bzv) {
                    this.f97732a.b(false);
                }
            }
        }
    }

    public static final class g extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f97733a;

        static {
            Covode.recordClassIndex(62086);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(e eVar) {
            this.f97733a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            h.f.b.l.d(view, "");
            if (this.f97733a.x) {
                this.f97733a.x = false;
                e.b(this.f97733a).b();
                e eVar = this.f97733a;
                new PrivacyCert(new com.bytedance.bpea.basics.j("1081"), "Dubbing when editing a video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()});
                e.a(eVar, false, 0, 3);
            } else if (!this.f97733a.f97724h) {
                this.f97733a.x = true;
                FTCAudioRecordStartButton.a aVar = e.b(this.f97733a).f97674b;
                if (aVar == null) {
                    h.f.b.l.a("centerView");
                }
                aVar.f97678b.end();
                aVar.f97679c.start();
                e eVar2 = this.f97733a;
                new PrivacyCert(new com.bytedance.bpea.basics.j("1075"), "Dubbing when editing a video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()});
                eVar2.b(true);
            }
        }
    }

    static final class k implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.a f97737a;

        static {
            Covode.recordClassIndex(62090);
        }

        k(com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.a aVar) {
            this.f97737a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.i
        public final void a(List<Bitmap> list) {
            this.f97737a.a(list);
        }
    }

    public static final class o implements com.ss.android.ugc.tools.view.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f97741a;

        static {
            Covode.recordClassIndex(62094);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        o(e eVar) {
            this.f97741a = eVar;
        }

        @Override // com.ss.android.ugc.tools.view.a.a
        public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
            if (i2 != 4 || !this.f97741a.z()) {
                return false;
            }
            e.e(this.f97741a).performClick();
            return true;
        }
    }

    public static final class s implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f97745a;

        static {
            Covode.recordClassIndex(62098);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        s(e eVar) {
            this.f97745a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.ftc.components.audiorecord.g
        public final void a(float f2, boolean z) {
            int i2;
            long j2;
            long j3 = (long) (((float) this.f97745a.f97719c) * f2);
            com.ss.android.ugc.asve.editor.g gVar = this.f97745a.f97718b;
            if (gVar != null) {
                i2 = gVar.G();
            } else {
                i2 = 0;
            }
            int i3 = (int) (((float) i2) * f2);
            com.ss.android.ugc.asve.editor.g gVar2 = this.f97745a.f97718b;
            if (gVar2 != null) {
                j2 = (long) gVar2.s(i3);
            } else {
                j2 = 0;
            }
            this.f97745a.f97720d = f2;
            if (z) {
                this.f97745a.f97725i = null;
                e.f(this.f97745a).setValue(dmt.av.video.t.b(j2));
                e.f(this.f97745a).setValue(dmt.av.video.t.b());
                e.g(this.f97745a).setVisibility(0);
            } else {
                e.f(this.f97745a).setValue(dmt.av.video.t.a(j2));
                e.f(this.f97745a).setValue(dmt.av.video.t.b());
                e.g(this.f97745a).setVisibility(4);
            }
            this.f97745a.a().setValue(Long.valueOf(j3));
        }
    }

    static final class j implements c.b {

        /* renamed from: a  reason: collision with root package name */
        public static final j f97736a = new j();

        static {
            Covode.recordClassIndex(62089);
        }

        j() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c.b
        public final void a(String str) {
            com.ss.android.ugc.aweme.port.in.g.a().I().a(str);
        }
    }

    public static final /* synthetic */ b a(e eVar) {
        b bVar = eVar.u;
        if (bVar == null) {
            h.f.b.l.a("audioRecordSeekBar");
        }
        return bVar;
    }

    public static final /* synthetic */ FTCAudioRecordStartButton b(e eVar) {
        FTCAudioRecordStartButton fTCAudioRecordStartButton = eVar.v;
        if (fTCAudioRecordStartButton == null) {
            h.f.b.l.a("audioRecordStartButton");
        }
        return fTCAudioRecordStartButton;
    }

    public static final /* synthetic */ AVDmtTextView c(e eVar) {
        AVDmtTextView aVDmtTextView = eVar.z;
        if (aVDmtTextView == null) {
            h.f.b.l.a("tvMsg");
        }
        return aVDmtTextView;
    }

    public static final /* synthetic */ View d(e eVar) {
        View view = eVar.y;
        if (view == null) {
            h.f.b.l.a("backView");
        }
        return view;
    }

    public static final /* synthetic */ View e(e eVar) {
        View view = eVar.f97728l;
        if (view == null) {
            h.f.b.l.a("mCancelView");
        }
        return view;
    }

    public static final /* synthetic */ androidx.lifecycle.t f(e eVar) {
        androidx.lifecycle.t<dmt.av.video.t> tVar = eVar.f97726j;
        if (tVar == null) {
            h.f.b.l.a("mPreviewControlOpLiveData");
        }
        return tVar;
    }

    public static final /* synthetic */ View g(e eVar) {
        View view = eVar.t;
        if (view == null) {
            h.f.b.l.a("mPlayView");
        }
        return view;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class h implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f97734a;

        static {
            Covode.recordClassIndex(62087);
        }

        h(e eVar) {
            this.f97734a = eVar;
        }

        public final boolean onLongClick(View view) {
            this.f97734a.w = true;
            FTCAudioRecordStartButton b2 = e.b(this.f97734a);
            b2.f97676d.end();
            b2.f97675c.start();
            e eVar = this.f97734a;
            new PrivacyCert(new com.bytedance.bpea.basics.j("1076"), "Dubbing when editing a video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()});
            eVar.b(true);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class y<T> implements androidx.core.g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f97751a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f97752b;

        static {
            Covode.recordClassIndex(62104);
        }

        y(e eVar, boolean z) {
            this.f97751a = eVar;
            this.f97752b = z;
        }

        @Override // androidx.core.g.a
        public final /* synthetic */ void a(Object obj) {
            if (this.f97752b) {
                View view = this.f97751a.f97727k;
                if (view == null) {
                    h.f.b.l.a("mSaveView");
                }
                view.setVisibility(0);
                e.e(this.f97751a).setVisibility(0);
                return;
            }
            com.bytedance.scene.group.b bVar = (com.bytedance.scene.group.b) this.f97751a.o;
            if (bVar != null) {
                bVar.d(this.f97751a);
            }
        }
    }

    static final class l<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f97738a;

        static {
            Covode.recordClassIndex(62091);
        }

        l(e eVar) {
            this.f97738a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Long l2 = (Long) obj;
            if (l2 != null) {
                l2.longValue();
                b a2 = e.a(this.f97738a);
                int longValue = (int) l2.longValue();
                if (longValue < a2.f97703h - 1) {
                    Iterator<T> it = a2.f97697b.getMStack().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (longValue >= next.getX() && longValue < next.getY()) {
                            longValue = next.getX();
                            break;
                        }
                    }
                }
                if (-1 != longValue) {
                    if (!this.f97738a.f97722f) {
                        FTCAudioRecordStartButton b2 = e.b(this.f97738a);
                        b2.setAlpha(0.5f);
                        b2.setEnabled(false);
                        e.c(this.f97738a).setText(R.string.axe);
                        return;
                    }
                    return;
                }
                FTCAudioRecordStartButton b3 = e.b(this.f97738a);
                b3.setAlpha(1.0f);
                b3.setEnabled(true);
                e.c(this.f97738a).setText(R.string.aya);
            }
        }
    }

    static final class m<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f97739a;

        static {
            Covode.recordClassIndex(62092);
        }

        m(e eVar) {
            this.f97739a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                bool.booleanValue();
                if (bool.booleanValue()) {
                    this.f97739a.d().voiceVolume = this.f97739a.B.getVoiceVolume();
                } else {
                    this.f97739a.d().voiceVolume = 0.0f;
                }
                this.f97739a.B.setNeedOriginalSound(bool.booleanValue());
                if (this.f97739a.f97723g && !this.f97739a.f97722f) {
                    e eVar = this.f97739a;
                    eVar.a(-1.0f, eVar.d().voiceVolume);
                }
            }
        }
    }

    public e(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.ab = fVar;
        ValueAnimator ofInt = ValueAnimator.ofInt(1, 10);
        h.f.b.l.b(ofInt, "");
        this.f97721e = ofInt;
        this.f97724h = true;
        this.J = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);
        this.K = h.i.a(h.m.NONE, new a(this));
        h.k.c a2 = h.f.b.ab.a(FTCEditAudioRecordViewModel.class);
        this.L = h.i.a((h.f.a.a) new b(this, a2, a2));
        this.B = new AudioRecorderParam();
        this.C = true;
        this.D = new WeakHandler(this);
        this.E = new s(this);
        this.Z = new o(this);
        this.aa = new f(this);
    }

    private static boolean a(File file) {
        MethodCollector.i(4726);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(4726);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(4726);
        return delete;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        h.f.b.l.d(message, "");
        int i2 = message.what;
        if (i2 == 1) {
            this.C = false;
            View view = this.O;
            if (view == null) {
                h.f.b.l.a("mLoadingStatusViewLayout");
            }
            view.setVisibility(0);
            DmtStatusView dmtStatusView = this.N;
            if (dmtStatusView == null) {
                h.f.b.l.a("mLoadingStatusView");
            }
            DmtStatusView.a a2 = DmtStatusView.a.a(this.f42913m);
            a2.f33605g = 1;
            dmtStatusView.setBuilder(a2);
            DmtStatusView dmtStatusView2 = this.N;
            if (dmtStatusView2 == null) {
                h.f.b.l.a("mLoadingStatusView");
            }
            dmtStatusView2.f();
        } else if (i2 == 2) {
            this.C = true;
            DmtStatusView dmtStatusView3 = this.N;
            if (dmtStatusView3 == null) {
                h.f.b.l.a("mLoadingStatusView");
            }
            dmtStatusView3.a(true);
            View view2 = this.O;
            if (view2 == null) {
                h.f.b.l.a("mLoadingStatusViewLayout");
            }
            view2.setVisibility(8);
        } else if (i2 == 4) {
            this.C = true;
            DmtStatusView dmtStatusView4 = this.N;
            if (dmtStatusView4 == null) {
                h.f.b.l.a("mLoadingStatusView");
            }
            dmtStatusView4.a(true);
            View view3 = this.O;
            if (view3 == null) {
                h.f.b.l.a("mLoadingStatusViewLayout");
            }
            view3.setVisibility(8);
            ((FTCEditAudioRecordViewModel) this.L.getValue()).f97687a.setValue(false);
            com.ss.android.ugc.asve.editor.g gVar = this.f97718b;
            if (gVar != null) {
                gVar.a(true);
            }
            androidx.lifecycle.t<dmt.av.video.t> tVar = this.f97726j;
            if (tVar == null) {
                h.f.b.l.a("mPreviewControlOpLiveData");
            }
            tVar.setValue(dmt.av.video.t.a());
        }
    }

    static final class n implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f97740a;

        static {
            Covode.recordClassIndex(62093);
        }

        n(e eVar) {
            this.f97740a = eVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int i2;
            int i3;
            com.ss.android.ugc.asve.editor.g gVar = this.f97740a.f97718b;
            if (gVar != null) {
                this.f97740a.a().setValue(Long.valueOf((long) gVar.k()));
                e.a(this.f97740a).a(((float) gVar.k()) / ((float) gVar.j()));
                if (this.f97740a.f97722f) {
                    b a2 = e.a(this.f97740a);
                    int k2 = gVar.k();
                    Point point = this.f97740a.f97725i;
                    if (point != null) {
                        i2 = point.getX();
                    } else {
                        i2 = k2;
                    }
                    Iterator<T> it = a2.f97697b.getMStack().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i3 = -1;
                            break;
                        }
                        T next = it.next();
                        int x = next.getX();
                        if (i2 <= x && k2 >= x && k2 <= next.getY() && (!h.f.b.l.a((Object) next, (Object) point))) {
                            i3 = next.getX();
                            break;
                        }
                    }
                    e.a(this.f97740a).f97697b.invalidate();
                    if (i3 == -1) {
                        Point point2 = this.f97740a.f97725i;
                        if (point2 != null) {
                            point2.setY(gVar.k());
                        }
                        e.a(this.f97740a).f97697b.invalidate();
                    } else {
                        Point point3 = this.f97740a.f97725i;
                        if (point3 != null) {
                            point3.setY(i3);
                        }
                        e.a(this.f97740a).f97697b.invalidate();
                        e eVar = this.f97740a;
                        new PrivacyCert(new com.bytedance.bpea.basics.j("1077"), "Dubbing when editing a video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()});
                        eVar.a(false, i3);
                    }
                } else {
                    this.f97740a.f97725i = null;
                }
                if (gVar.k() < this.f97740a.f97719c) {
                    return;
                }
                if (this.f97740a.f97722f) {
                    e eVar2 = this.f97740a;
                    new PrivacyCert(new com.bytedance.bpea.basics.j("1078"), "Dubbing when editing a video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()});
                    e.a(eVar2, true, 0, 2);
                    return;
                }
                this.f97740a.f97721e.cancel();
                this.f97740a.E.a(0.0f, true);
                e.a(this.f97740a).a(0.0f);
                this.f97740a.B.setMStack(e.a(this.f97740a).getStack());
                if (this.f97740a.B.getMStack().isEmpty()) {
                    e.d(this.f97740a).setVisibility(8);
                } else {
                    e.d(this.f97740a).setVisibility(0);
                }
            }
        }
    }

    public final void b(boolean z2) {
        float f2;
        com.ss.android.ugc.asve.editor.g gVar = this.f97718b;
        if (gVar != null) {
            View view = this.t;
            if (view == null) {
                h.f.b.l.a("mPlayView");
            }
            view.setVisibility(4);
            int i2 = 0;
            float f3 = 0.0f;
            if (z2) {
                this.B.setNeedDel(true);
                com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.h.a(C(), this.B);
                AVDmtTextView aVDmtTextView = this.z;
                if (aVDmtTextView == null) {
                    h.f.b.l.a("tvMsg");
                }
                aVDmtTextView.setVisibility(4);
                View view2 = this.y;
                if (view2 == null) {
                    h.f.b.l.a("backView");
                }
                view2.setVisibility(4);
                LottieAnimationView lottieAnimationView = this.T;
                if (lottieAnimationView == null) {
                    h.f.b.l.a("lottieAnimationView");
                }
                lottieAnimationView.a();
                LottieAnimationView lottieAnimationView2 = this.T;
                if (lottieAnimationView2 == null) {
                    h.f.b.l.a("lottieAnimationView");
                }
                lottieAnimationView2.setVisibility(0);
                f2 = 0.0f;
            } else {
                this.f97723g = true;
                AudioRecorderParam audioRecorderParam = this.B;
                b bVar = this.u;
                if (bVar == null) {
                    h.f.b.l.a("audioRecordSeekBar");
                }
                audioRecorderParam.setMStack(bVar.getStack());
                if ((!this.B.getMStack().isEmpty()) && this.A != null && this.B.getAudioRecordIndex() < 0) {
                    com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.h.a(C(), this.B);
                }
                f2 = d().voiceVolume;
                f3 = d().musicVolume;
            }
            a(f3, f2);
            if (z2) {
                if (this.f97725i != null) {
                    androidx.lifecycle.t<dmt.av.video.t> tVar = this.f97726j;
                    if (tVar == null) {
                        h.f.b.l.a("mPreviewControlOpLiveData");
                    }
                    Point point = this.f97725i;
                    if (point == null) {
                        h.f.b.l.b();
                    }
                    tVar.setValue(dmt.av.video.t.b((long) point.getY()));
                    b bVar2 = this.u;
                    if (bVar2 == null) {
                        h.f.b.l.a("audioRecordSeekBar");
                    }
                    Point point2 = this.f97725i;
                    if (point2 == null) {
                        h.f.b.l.b();
                    }
                    this.f97725i = bVar2.b(point2.getY());
                } else {
                    int k2 = gVar.k();
                    if (k2 >= 50) {
                        i2 = k2;
                    }
                    b bVar3 = this.u;
                    if (bVar3 == null) {
                        h.f.b.l.a("audioRecordSeekBar");
                    }
                    this.f97725i = bVar3.b(i2);
                }
                this.f97722f = true;
                f fVar = this.A;
                if (fVar != null) {
                    int i3 = this.f97719c;
                    fVar.f97753a.a(gVar.k() + 50, i3, (PrivacyCert) null);
                }
            }
            androidx.lifecycle.t<dmt.av.video.t> tVar2 = this.f97726j;
            if (tVar2 == null) {
                h.f.b.l.a("mPreviewControlOpLiveData");
            }
            tVar2.setValue(dmt.av.video.t.a());
            this.f97721e.start();
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        x.a aVar;
        MethodCollector.i(4716);
        super.a(bundle);
        this.f97726j = C().v();
        com.ss.android.ugc.asve.editor.g value = C().C().getValue();
        this.f97718b = value;
        if (value != null) {
            this.f97719c = value.j();
        }
        View b2 = b(R.id.f6c);
        if (b2 == null) {
            h.f.b.l.b();
        }
        this.f97727k = b2;
        View b3 = b(R.id.ewh);
        if (b3 == null) {
            h.f.b.l.b();
        }
        this.f97728l = b3;
        View b4 = b(R.id.bzv);
        if (b4 == null) {
            h.f.b.l.b();
        }
        this.t = b4;
        View b5 = b(R.id.dx0);
        if (b5 == null) {
            h.f.b.l.b();
        }
        this.P = (FrameLayout) b5;
        View b6 = b(R.id.fhv);
        if (b6 == null) {
            h.f.b.l.b();
        }
        this.R = b6;
        View b7 = b(R.id.ae6);
        if (b7 == null) {
            h.f.b.l.b();
        }
        this.S = (ViewGroup) b7;
        View b8 = b(R.id.e9r);
        if (b8 == null) {
            h.f.b.l.b();
        }
        this.v = (FTCAudioRecordStartButton) b8;
        View b9 = b(R.id.qo);
        if (b9 == null) {
            h.f.b.l.b();
        }
        this.y = b9;
        View b10 = b(R.id.f2z);
        if (b10 == null) {
            h.f.b.l.b();
        }
        AVDmtTextView aVDmtTextView = (AVDmtTextView) b10;
        this.z = aVDmtTextView;
        if (aVDmtTextView == null) {
            h.f.b.l.a("tvMsg");
        }
        aVDmtTextView.b();
        View b11 = b(R.id.a2z);
        if (b11 == null) {
            h.f.b.l.b();
        }
        CheckBox checkBox = (CheckBox) b11;
        this.U = checkBox;
        if (checkBox == null) {
            h.f.b.l.a("checkBox");
        }
        checkBox.setText("  " + c_(R.string.axg));
        View b12 = b(R.id.ci4);
        if (b12 == null) {
            h.f.b.l.b();
        }
        this.N = (DmtStatusView) b12;
        View b13 = b(R.id.ci6);
        if (b13 == null) {
            h.f.b.l.b();
        }
        this.O = b13;
        if (b13 == null) {
            h.f.b.l.a("mLoadingStatusViewLayout");
        }
        b13.setOnClickListener(q.f97743a);
        View b14 = b(R.id.cjk);
        if (b14 == null) {
            h.f.b.l.b();
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) b14;
        this.T = lottieAnimationView;
        if (lottieAnimationView == null) {
            h.f.b.l.a("lottieAnimationView");
        }
        lottieAnimationView.setAnimation("tool_recording_dark_lottie.json");
        LottieAnimationView lottieAnimationView2 = this.T;
        if (lottieAnimationView2 == null) {
            h.f.b.l.a("lottieAnimationView");
        }
        lottieAnimationView2.setRepeatCount(-1);
        com.ss.android.ugc.aweme.shortvideo.edit.c.a.a(this);
        View view = this.y;
        if (view == null) {
            h.f.b.l.a("backView");
        }
        view.setBackgroundResource(R.drawable.d1);
        Activity activity = this.f42913m;
        if (activity != null) {
            b bVar = new b((androidx.fragment.app.e) activity, this);
            this.u = bVar;
            int b15 = (int) com.bytedance.common.utility.n.b(this.f42913m, 16.0f);
            int b16 = (int) com.bytedance.common.utility.n.b(this.f42913m, 6.0f);
            int i2 = this.f97719c;
            s sVar = this.E;
            bVar.f97698c = b15;
            bVar.f97699d = b16;
            bVar.f97700e = ((int) com.bytedance.common.utility.n.b(this.f42913m, 4.0f)) * 5;
            bVar.f97703h = i2;
            bVar.f97704i = sVar;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.bottomMargin = b16;
            layoutParams.topMargin = b16;
            layoutParams.rightMargin = b15;
            layoutParams.leftMargin = b15;
            a aVar2 = bVar.f97697b;
            aVar2.f97691a = Color.parseColor("#ccfe2c55");
            aVar2.f97692b.setColor(aVar2.f97691a);
            aVar2.f97692b.setStyle(Paint.Style.FILL);
            aVar2.f97693c = i2;
            aVar2.f97694d = com.bytedance.common.utility.n.b(aVar2.getContext(), 0.0f);
            bVar.addView(bVar.f97697b, layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(bVar.f97700e, -1);
            if (com.ss.android.ugc.aweme.tools.c.a(bVar.getContext())) {
                layoutParams2.addRule(21);
                layoutParams2.setMarginEnd(b15 - (bVar.f97700e / 2));
            } else {
                layoutParams2.leftMargin = b15 - (bVar.f97700e / 2);
            }
            bVar.f97696a.setImageDrawable(com.ss.android.ugc.tools.view.a.a(0, -1, 1, (int) com.bytedance.common.utility.n.b(bVar.getContext(), 2.0f)));
            bVar.f97696a.setPadding((int) (((float) bVar.f97700e) * 0.4f), 0, (int) (((float) bVar.f97700e) * 0.4f), 0);
            bVar.addView(bVar.f97696a, layoutParams2);
            bVar.f97696a.setOnTouchListener(new b.a(bVar));
            FrameLayout frameLayout = this.P;
            if (frameLayout == null) {
                h.f.b.l.a("seekLayout");
            }
            b bVar2 = this.u;
            if (bVar2 == null) {
                h.f.b.l.a("audioRecordSeekBar");
            }
            frameLayout.addView(bVar2, new FrameLayout.LayoutParams(-1, -1));
            View b17 = b(R.id.a61);
            if (b17 == null) {
                h.f.b.l.b();
            }
            this.Q = (ChooseVideoCoverView) b17;
            if (this.f42913m instanceof com.ss.android.ugc.tools.view.a.c) {
                Activity activity2 = this.f42913m;
                if (activity2 != null) {
                    this.I = (com.ss.android.ugc.tools.view.a.c) activity2;
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
                    MethodCollector.o(4716);
                    throw nullPointerException;
                }
            }
            this.Y = C().h();
            this.X = C().i();
            this.f97721e.setDuration(1000L);
            this.f97721e.setRepeatCount(-1);
            this.f97721e.addUpdateListener(new n(this));
            View view2 = this.f97727k;
            if (view2 == null) {
                h.f.b.l.a("mSaveView");
            }
            view2.setOnClickListener(this.aa);
            View view3 = this.f97728l;
            if (view3 == null) {
                h.f.b.l.a("mCancelView");
            }
            view3.setOnClickListener(this.aa);
            View view4 = this.t;
            if (view4 == null) {
                h.f.b.l.a("mPlayView");
            }
            view4.setOnClickListener(this.aa);
            View view5 = this.R;
            if (view5 == null) {
                h.f.b.l.a("videoLayout");
            }
            view5.setOnClickListener(this.aa);
            View view6 = this.y;
            if (view6 == null) {
                h.f.b.l.a("backView");
            }
            view6.setOnClickListener(this.aa);
            FTCAudioRecordStartButton fTCAudioRecordStartButton = this.v;
            if (fTCAudioRecordStartButton == null) {
                h.f.b.l.a("audioRecordStartButton");
            }
            fTCAudioRecordStartButton.setOnClickListener(new g(this));
            FTCAudioRecordStartButton fTCAudioRecordStartButton2 = this.v;
            if (fTCAudioRecordStartButton2 == null) {
                h.f.b.l.a("audioRecordStartButton");
            }
            fTCAudioRecordStartButton2.setOnLongClickListener(new h(this));
            FTCAudioRecordStartButton fTCAudioRecordStartButton3 = this.v;
            if (fTCAudioRecordStartButton3 == null) {
                h.f.b.l.a("audioRecordStartButton");
            }
            fTCAudioRecordStartButton3.setOnTouchListener(new i(this));
            a().observe(this, new l(this));
            b().observe(this, new m(this));
            CheckBox checkBox2 = this.U;
            if (checkBox2 == null) {
                h.f.b.l.a("checkBox");
            }
            checkBox2.setOnCheckedChangeListener(new r(this));
            com.ss.android.ugc.asve.editor.g gVar = this.f97718b;
            if (gVar == null) {
                MethodCollector.o(4716);
                return;
            }
            ChooseVideoCoverView chooseVideoCoverView = this.Q;
            if (chooseVideoCoverView == null) {
                h.f.b.l.a("mChooseVideoCoverView");
            }
            chooseVideoCoverView.a();
            ChooseVideoCoverView chooseVideoCoverView2 = this.Q;
            if (chooseVideoCoverView2 == null) {
                h.f.b.l.a("mChooseVideoCoverView");
            }
            chooseVideoCoverView2.setLayoutManager(new WrapLinearLayoutManager((byte) 0));
            ChooseVideoCoverView chooseVideoCoverView3 = this.Q;
            if (chooseVideoCoverView3 == null) {
                h.f.b.l.a("mChooseVideoCoverView");
            }
            int frameHeight = chooseVideoCoverView3.getFrameHeight();
            ChooseVideoCoverView chooseVideoCoverView4 = this.Q;
            if (chooseVideoCoverView4 == null) {
                h.f.b.l.a("mChooseVideoCoverView");
            }
            int frameWidth = chooseVideoCoverView4.getFrameWidth();
            int ceil = (int) Math.ceil((double) (((float) (com.bytedance.common.utility.n.a(this.f42913m) - (h.g.a.a(com.bytedance.common.utility.n.b(this.f42913m, 16.0f)) * 2))) / (((float) frameWidth) * 1.0f)));
            ChooseVideoCoverView chooseVideoCoverView5 = this.Q;
            if (chooseVideoCoverView5 == null) {
                h.f.b.l.a("mChooseVideoCoverView");
            }
            chooseVideoCoverView5.setCoverSize(ceil);
            if (bt.a()) {
                aVar = x.a.GET_FRAMES_MODE_NORMAL;
            } else {
                aVar = x.a.GET_FRAMES_MODE_NOEFFECT;
            }
            Activity activity3 = this.f42913m;
            if (activity3 != null) {
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity3;
                ChooseVideoCoverView chooseVideoCoverView6 = this.Q;
                if (chooseVideoCoverView6 == null) {
                    h.f.b.l.a("mChooseVideoCoverView");
                }
                this.V = new VEVideoCoverGeneratorImpl(gVar, eVar, chooseVideoCoverView6.getCoverSize(), aVar, "ai_music");
                VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl = this.V;
                if (vEVideoCoverGeneratorImpl == null) {
                    h.f.b.l.a("mEffectVideoCoverGenerator");
                }
                this.W = new com.ss.android.ugc.aweme.shortvideo.widget.p(vEVideoCoverGeneratorImpl, frameWidth, frameHeight, ceil);
                if (d().isMvThemeVideoType()) {
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.a aVar3 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.a(frameWidth, frameHeight);
                    ChooseVideoCoverView chooseVideoCoverView7 = this.Q;
                    if (chooseVideoCoverView7 == null) {
                        h.f.b.l.a("mChooseVideoCoverView");
                    }
                    chooseVideoCoverView7.setAdapter(aVar3);
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c cVar = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c();
                    cVar.f128780b = j.f97736a;
                    androidx.lifecycle.t<Boolean> tVar = this.Y;
                    if (tVar == null) {
                        h.f.b.l.a("firstFrameVisible");
                    }
                    cVar.f128791m = tVar;
                    androidx.lifecycle.t<Bitmap> tVar2 = this.X;
                    if (tVar2 == null) {
                        h.f.b.l.a("firstFrameBitmap");
                    }
                    cVar.f128790l = tVar2;
                    cVar.a(frameWidth, frameHeight).a(this.f42913m, this.f97718b, ceil, new k(aVar3));
                    ChooseVideoCoverView chooseVideoCoverView8 = this.Q;
                    if (chooseVideoCoverView8 == null) {
                        h.f.b.l.a("mChooseVideoCoverView");
                    }
                    chooseVideoCoverView8.setAdapter(aVar3);
                    MethodCollector.o(4716);
                    return;
                }
                com.ss.android.ugc.aweme.shortvideo.widget.p pVar = this.W;
                if (pVar == null) {
                    h.f.b.l.a("mSharedVideoCoverDataSource");
                }
                ChooseVideoCoverView.a aVar4 = new ChooseVideoCoverView.a(pVar, frameWidth, frameHeight);
                ChooseVideoCoverView chooseVideoCoverView9 = this.Q;
                if (chooseVideoCoverView9 == null) {
                    h.f.b.l.a("mChooseVideoCoverView");
                }
                chooseVideoCoverView9.setAdapter(aVar4);
                MethodCollector.o(4716);
                return;
            }
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            MethodCollector.o(4716);
            throw nullPointerException2;
        }
        NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        MethodCollector.o(4716);
        throw nullPointerException3;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        f fVar = this.A;
        if (fVar != null) {
            fVar.f97753a.destory();
        }
        b.i.b(new d(new RunnableC2357e(this, str)), com.ss.android.ugc.aweme.cw.g.a());
    }

    static final class w implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final w f97749a = new w();

        static {
            Covode.recordClassIndex(62102);
        }

        w() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    static final class r implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f97744a;

        static {
            Covode.recordClassIndex(62097);
        }

        r(e eVar) {
            this.f97744a = eVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f97744a.b().setValue(Boolean.valueOf(z));
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class i implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f97735a;

        static {
            Covode.recordClassIndex(62088);
        }

        i(e eVar) {
            this.f97735a = eVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent != null && ((motionEvent.getAction() == 3 || motionEvent.getAction() == 1) && this.f97735a.w)) {
                this.f97735a.w = false;
                e.b(this.f97735a).a();
                e eVar = this.f97735a;
                new PrivacyCert(new com.bytedance.bpea.basics.j("1082"), "Dubbing when editing a video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()});
                e.a(eVar, false, 0, 3);
            }
            return false;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.atl, viewGroup, false);
        h.f.b.l.b(a2, "");
        this.M = a2;
        if (a2 == null) {
            h.f.b.l.a("parentLayout");
        }
        return a2;
    }

    static final class x implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f97750a;

        static {
            Covode.recordClassIndex(62103);
        }

        x(e eVar) {
            this.f97750a = eVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            e eVar = this.f97750a;
            AudioRecorderParam audioRecorderParam = eVar.d().veAudioRecorderParam;
            if (eVar.B.getAudioRecordIndex() >= 0 && eVar.B.hasRecord()) {
                eVar.B.setNeedDel(true);
                com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.h.a(eVar.C(), eVar.B);
            }
            if (audioRecorderParam != null) {
                if (audioRecorderParam.getAudioRecordIndex() < 0 && audioRecorderParam.hasRecord()) {
                    com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.h.a(eVar.C(), audioRecorderParam);
                }
                if (audioRecorderParam.getNeedOriginalSound()) {
                    eVar.d().voiceVolume = audioRecorderParam.getVoiceVolume();
                } else {
                    eVar.d().voiceVolume = 0.0f;
                }
            } else {
                eVar.d().voiceVolume = eVar.B.getVoiceVolume();
            }
            eVar.a(eVar.d().musicVolume, eVar.d().voiceVolume);
            eVar.a(eVar.B.getAudioUrl());
        }
    }

    public static void a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                File[] listFiles = file.listFiles();
                for (File file2 : listFiles) {
                    h.f.b.l.b(file2, "");
                    String path = file2.getPath();
                    h.f.b.l.b(path, "");
                    if (!h.m.p.c(path, "df", false) && !path.equals(str2)) {
                        a(file2);
                    }
                }
            }
        }
    }

    public final void a(float f2, float f3) {
        if (d().isStitchMode()) {
            if (d().isMuted) {
                com.ss.android.ugc.gamora.editor.f.a.a(0.0f, f2, d(), C());
            } else {
                com.ss.android.ugc.gamora.editor.f.a.a(f3, f2, d(), C());
            }
        } else if ((d().isFastImport || d().hasOriginalSound()) && !d().isMuted) {
            if (f3 != -1.0f) {
                com.ss.android.ugc.aweme.shortvideo.preview.a C2 = C();
                VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(f3);
                h.f.b.l.b(ofVoice, "");
                C2.a(ofVoice);
            }
            if (d().mMusicPath != null && f2 != -1.0f) {
                com.ss.android.ugc.aweme.shortvideo.preview.a C3 = C();
                VEVolumeChangeOp ofMusic = VEVolumeChangeOp.ofMusic(f2);
                h.f.b.l.b(ofMusic, "");
                C3.a(ofMusic);
            }
        } else if (f2 != -1.0f) {
            com.ss.android.ugc.aweme.shortvideo.preview.a C4 = C();
            VEVolumeChangeOp ofMusic2 = VEVolumeChangeOp.ofMusic(f2);
            h.f.b.l.b(ofMusic2, "");
            C4.a(ofMusic2);
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    static /* synthetic */ void a(e eVar, boolean z2, int i2, int i3) {
        if ((i3 & 1) != 0) {
            z2 = false;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        eVar.a(z2, i2);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
