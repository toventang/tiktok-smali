package com.ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
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
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.AudioRecordStartButton;
import com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.b;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.zhiliaoapp.musically.R;
import dmt.av.video.u;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class g extends com.bytedance.scene.j implements WeakHandler.IHandler, com.bytedance.jedi.arch.b, com.bytedance.o.a {
    public static final d J = new d((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f126897a = {new h.f.b.y(g.class, "mVideoPublishEditModel", "getMVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new h.f.b.y(g.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0)};
    public AVDmtTextView A;
    public j B;
    public AudioRecorderParam C;
    public volatile boolean D;
    public final WeakHandler E;
    public final int F;
    public final int G;
    public final int H;
    public final t I;
    private final h.h K;
    private final h.h L = h.i.a((h.f.a.a) u.f126926a);
    private final h.h M = h.i.a((h.f.a.a) q.f126922a);
    private int N = -1;
    private com.ss.android.ugc.tools.view.a.c O;
    private final h.h.d P;
    private final h.h Q;
    private final h.h R;
    private View S;
    private DmtStatusView T;
    private View U;
    private FrameLayout V;
    private ChooseVideoCoverView W;
    private View X;
    private ViewGroup Y;
    private LottieAnimationView Z;
    private CheckBox aa;
    private VEVideoCoverGeneratorImpl ab;
    private com.ss.android.ugc.aweme.shortvideo.widget.p ac;
    private androidx.lifecycle.t<Bitmap> ad;
    private androidx.lifecycle.t<Boolean> ae;
    private final p af;
    private final C3296g ag;
    private final com.bytedance.o.f ah;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.asve.editor.g f126898b;

    /* renamed from: c  reason: collision with root package name */
    public int f126899c = 1;

    /* renamed from: d  reason: collision with root package name */
    public float f126900d;

    /* renamed from: e  reason: collision with root package name */
    public final ValueAnimator f126901e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f126902f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f126903g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f126904h;

    /* renamed from: i  reason: collision with root package name */
    public Point f126905i;

    /* renamed from: j  reason: collision with root package name */
    final h.h.d f126906j;

    /* renamed from: k  reason: collision with root package name */
    public androidx.lifecycle.t<dmt.av.video.t> f126907k;

    /* renamed from: l  reason: collision with root package name */
    public View f126908l;
    public View t;
    public View u;
    public b v;
    public AudioRecordStartButton w;
    public boolean x;
    public boolean y;
    public View z;

    static final class r implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final r f126923a = new r();

        static {
            Covode.recordClassIndex(83262);
        }

        r() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(83244);
    }

    private final com.ss.android.ugc.aweme.editSticker.text.als.a F() {
        return (com.ss.android.ugc.aweme.editSticker.text.als.a) this.R.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.shortvideo.preview.a C() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.Q.getValue();
    }

    public final androidx.lifecycle.t<Long> a() {
        return (androidx.lifecycle.t) this.L.getValue();
    }

    public final androidx.lifecycle.t<Boolean> b() {
        return (androidx.lifecycle.t) this.M.getValue();
    }

    public final VideoPublishEditModel d() {
        return (VideoPublishEditModel) this.P.a(this, f126897a[0]);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class d {
        static {
            Covode.recordClassIndex(83248);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.ah;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    public final void a(boolean z2) {
        this.x = z2;
        F().d(z2);
    }

    public final void a(boolean z2, PrivacyCert privacyCert) {
        float f2;
        Integer num;
        com.ss.android.ugc.asve.editor.g gVar = this.f126898b;
        if (gVar != null) {
            View view = this.u;
            if (view == null) {
                h.f.b.l.a("mPlayView");
            }
            view.setVisibility(4);
            int i2 = 0;
            float f3 = 0.0f;
            if (z2) {
                this.C.setNeedDel(true);
                h.a(C(), this.C);
                AVDmtTextView aVDmtTextView = this.A;
                if (aVDmtTextView == null) {
                    h.f.b.l.a("tvMsg");
                }
                aVDmtTextView.setVisibility(4);
                View view2 = this.z;
                if (view2 == null) {
                    h.f.b.l.a("backView");
                }
                view2.setVisibility(4);
                LottieAnimationView lottieAnimationView = this.Z;
                if (lottieAnimationView == null) {
                    h.f.b.l.a("lottieAnimationView");
                }
                lottieAnimationView.a();
                LottieAnimationView lottieAnimationView2 = this.Z;
                if (lottieAnimationView2 == null) {
                    h.f.b.l.a("lottieAnimationView");
                }
                lottieAnimationView2.setVisibility(0);
                f2 = 0.0f;
            } else {
                this.f126903g = true;
                AudioRecorderParam audioRecorderParam = this.C;
                b bVar = this.v;
                if (bVar == null) {
                    h.f.b.l.a("audioRecordSeekBar");
                }
                audioRecorderParam.setMStack(bVar.getStack());
                if ((!this.C.getMStack().isEmpty()) && this.B != null && this.C.getAudioRecordIndex() < 0) {
                    h.a(C(), this.C);
                }
                f2 = d().voiceVolume;
                f3 = d().musicVolume;
            }
            a(f3, f2);
            bj.d("EditAudioRecordScene startRecording isRecording " + this.f126902f + " isRecord " + z2);
            if (z2) {
                if (this.f126905i != null) {
                    androidx.lifecycle.t<dmt.av.video.t> tVar = this.f126907k;
                    if (tVar == null) {
                        h.f.b.l.a("mPreviewControlOpLiveData");
                    }
                    Point point = this.f126905i;
                    if (point == null) {
                        h.f.b.l.b();
                    }
                    tVar.setValue(dmt.av.video.t.b((long) point.getY()));
                    b bVar2 = this.v;
                    if (bVar2 == null) {
                        h.f.b.l.a("audioRecordSeekBar");
                    }
                    Point point2 = this.f126905i;
                    if (point2 == null) {
                        h.f.b.l.b();
                    }
                    this.f126905i = bVar2.b(point2.getY());
                } else {
                    int k2 = gVar.k();
                    if (k2 >= 50) {
                        i2 = k2;
                    }
                    b bVar3 = this.v;
                    if (bVar3 == null) {
                        h.f.b.l.a("audioRecordSeekBar");
                    }
                    this.f126905i = bVar3.b(i2);
                }
                this.f126902f = true;
                j jVar = this.B;
                if (jVar != null) {
                    num = Integer.valueOf(jVar.f126933a.a(gVar.k() + 50, this.f126899c, privacyCert));
                } else {
                    num = null;
                }
                String str = d().creationId;
                h.f.b.l.b(str, "");
                com.ss.android.ugc.aweme.utils.e.a(str);
                if (num != null && num.intValue() == 0) {
                    String str2 = d().creationId;
                    h.f.b.l.b(str2, "");
                    com.ss.android.ugc.aweme.utils.e.b(str2);
                } else {
                    String str3 = d().creationId;
                    h.f.b.l.b(str3, "");
                    com.ss.android.ugc.aweme.utils.e.a(str3, num != null ? num.intValue() : Integer.MAX_VALUE, "");
                }
            }
            androidx.lifecycle.t<dmt.av.video.t> tVar2 = this.f126907k;
            if (tVar2 == null) {
                h.f.b.l.a("mPreviewControlOpLiveData");
            }
            tVar2.setValue(dmt.av.video.t.a());
            this.f126901e.start();
        }
    }

    public final void a(boolean z2, int i2, PrivacyCert privacyCert) {
        if (!z2) {
            androidx.lifecycle.t<dmt.av.video.t> tVar = this.f126907k;
            if (tVar == null) {
                h.f.b.l.a("mPreviewControlOpLiveData");
            }
            tVar.setValue(dmt.av.video.t.b());
        }
        com.ss.android.ugc.asve.editor.g gVar = this.f126898b;
        if (gVar != null) {
            gVar.w();
            a().setValue(Long.valueOf((long) gVar.k()));
        }
        this.f126901e.cancel();
        View view = this.u;
        if (view == null) {
            h.f.b.l.a("mPlayView");
        }
        view.setVisibility(0);
        if (this.x) {
            a(false);
            AudioRecordStartButton audioRecordStartButton = this.w;
            if (audioRecordStartButton == null) {
                h.f.b.l.a("audioRecordStartButton");
            }
            audioRecordStartButton.a();
        }
        if (this.y) {
            b(false);
            AudioRecordStartButton audioRecordStartButton2 = this.w;
            if (audioRecordStartButton2 == null) {
                h.f.b.l.a("audioRecordStartButton");
            }
            audioRecordStartButton2.b();
        }
        if (this.f126902f) {
            j jVar = this.B;
            if (jVar != null) {
                if (z2) {
                    Point point = this.f126905i;
                    if (point != null) {
                        point.setY(this.f126899c);
                    }
                    jVar.a(privacyCert);
                } else {
                    int a2 = (int) jVar.a(privacyCert);
                    if (i2 == -1) {
                        i2 = a2;
                    }
                    Point point2 = this.f126905i;
                    if (point2 != null) {
                        point2.setY(i2);
                    }
                    androidx.lifecycle.t<dmt.av.video.t> tVar2 = this.f126907k;
                    if (tVar2 == null) {
                        h.f.b.l.a("mPreviewControlOpLiveData");
                    }
                    tVar2.setValue(dmt.av.video.t.b((long) i2));
                    b bVar = this.v;
                    if (bVar == null) {
                        h.f.b.l.a("audioRecordSeekBar");
                    }
                    bVar.a(((float) i2) / ((float) this.f126899c));
                }
                String str = d().creationId;
                h.f.b.l.b(str, "");
                com.ss.android.ugc.aweme.utils.e.c(str);
                b bVar2 = this.v;
                if (bVar2 == null) {
                    h.f.b.l.a("audioRecordSeekBar");
                }
                bVar2.f126871b.invalidate();
            }
            this.f126902f = false;
            Point point3 = this.f126905i;
            if (point3 != null) {
                a().setValue(Long.valueOf((long) point3.getY()));
            }
        }
        this.f126903g = false;
        AudioRecorderParam audioRecorderParam = this.C;
        b bVar3 = this.v;
        if (bVar3 == null) {
            h.f.b.l.a("audioRecordSeekBar");
        }
        audioRecorderParam.setMStack(bVar3.getStack());
        if (this.C.getMStack().isEmpty()) {
            View view2 = this.z;
            if (view2 == null) {
                h.f.b.l.a("backView");
            }
            view2.setVisibility(8);
        } else {
            View view3 = this.z;
            if (view3 == null) {
                h.f.b.l.a("backView");
            }
            view3.setVisibility(0);
        }
        AVDmtTextView aVDmtTextView = this.A;
        if (aVDmtTextView == null) {
            h.f.b.l.a("tvMsg");
        }
        aVDmtTextView.setVisibility(0);
        LottieAnimationView lottieAnimationView = this.Z;
        if (lottieAnimationView == null) {
            h.f.b.l.a("lottieAnimationView");
        }
        lottieAnimationView.setVisibility(4);
        LottieAnimationView lottieAnimationView2 = this.Z;
        if (lottieAnimationView2 == null) {
            h.f.b.l.a("lottieAnimationView");
        }
        lottieAnimationView2.d();
    }

    /* access modifiers changed from: package-private */
    public static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f126909a;

        static {
            Covode.recordClassIndex(83249);
        }

        e(Runnable runnable) {
            this.f126909a = runnable;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f126909a.run();
            return h.z.f158842a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f126922a = new q();

        static {
            Covode.recordClassIndex(83261);
        }

        q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Boolean> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class u extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Long>> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f126926a = new u();

        static {
            Covode.recordClassIndex(83265);
        }

        u() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Long> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f126927a;

        static {
            Covode.recordClassIndex(83266);
        }

        v(Runnable runnable) {
            this.f126927a = runnable;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f126927a.run();
            return h.z.f158842a;
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
        this.f126904h = false;
        super.w();
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(83245);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.preview.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.ss.android.ugc.aweme.shortvideo.preview.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g.a.invoke():com.bytedance.als.b");
        }
    }

    private final void I() {
        com.ss.android.ugc.aweme.common.r.a("click_dub", E().f149193a);
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        this.f126901e.cancel();
        this.E.removeCallbacksAndMessages(null);
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.editSticker.text.als.a> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(83246);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.editSticker.text.als.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.editSticker.text.als.a invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g r0 = r2.this$0
                androidx.fragment.app.e r0 = com.bytedance.scene.ktx.c.b(r0)
                com.bytedance.als.ApiCenter r1 = com.bytedance.als.ApiCenter.a.a(r0)
                java.lang.Class<com.ss.android.ugc.aweme.editSticker.text.als.a> r0 = com.ss.android.ugc.aweme.editSticker.text.als.a.class
                com.bytedance.als.b r0 = r1.a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g.b.invoke():com.bytedance.als.b");
        }
    }

    private final void G() {
        w wVar = new w(this);
        this.B = new j();
        b.i.b(new v(wVar), com.ss.android.ugc.aweme.cw.g.a());
    }

    private final int H() {
        return ((dh.e(this.f42913m) - ((int) com.bytedance.common.utility.n.b(this.f42913m, 334.0f))) - dh.c(this.f42913m)) - dh.d(this.f42913m);
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f126910a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f126911b;

        static {
            Covode.recordClassIndex(83250);
        }

        f(g gVar, String str) {
            this.f126910a = gVar;
            this.f126911b = str;
        }

        public final void run() {
            this.f126910a.D = false;
            this.f126910a.E.sendEmptyMessage(this.f126910a.F);
            if (!h.m.p.c(this.f126911b, "df", false)) {
                com.ss.android.ugc.aweme.video.e.c(this.f126911b);
            }
            this.f126910a.E.sendEmptyMessage(this.f126910a.H);
        }
    }

    /* access modifiers changed from: package-private */
    public final void D() {
        AudioRecorderParam audioRecorderParam = this.C;
        b bVar = this.v;
        if (bVar == null) {
            h.f.b.l.a("audioRecordSeekBar");
        }
        audioRecorderParam.setMStack(bVar.getStack());
        if (b().getValue() != null) {
            AudioRecorderParam audioRecorderParam2 = this.C;
            Boolean value = b().getValue();
            if (value == null) {
                h.f.b.l.b();
            }
            audioRecorderParam2.setNeedOriginalSound(value.booleanValue());
        }
    }

    @Override // com.bytedance.scene.j
    public final void x() {
        super.x();
        bj.d("EditAudioRecordScene pauseRecord isRecording " + this.f126902f);
        if (this.f126902f) {
            a(this, false, 0, new PrivacyCert(new com.bytedance.bpea.basics.j("1074"), "Dubbing when editing a video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()}), 3);
        }
        this.f126904h = true;
    }

    public static final class c extends h.f.b.m implements h.f.a.a<EditAudioRecordViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(83247);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.EditAudioRecordViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.EditAudioRecordViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.EditAudioRecordViewModel invoke() {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_shortvideo_edit_audiorecord_EditAudioRecordScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_shortvideo_edit_audiorecord_EditAudioRecordScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g.c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_shortvideo_edit_audiorecord_EditAudioRecordScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.tools.f.b E() {
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("content_source", bl.b(d())).a("enter_from", "video_edit_page").a("shoot_way", d().mShootWay).a("creation_id", d().creationId).a("content_type", "video");
        h.f.b.l.b(a2, "");
        return a2;
    }

    /* access modifiers changed from: package-private */
    public static final class w implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f126928a;

        static {
            Covode.recordClassIndex(83267);
        }

        w(g gVar) {
            this.f126928a = gVar;
        }

        public final void run() {
            this.f126928a.E.sendEmptyMessage(this.f126928a.F);
            new File(dj.n).mkdirs();
            String str = dj.n + System.currentTimeMillis() + ".wav";
            if (!com.ss.android.ugc.aweme.port.in.g.a().o().c()) {
                String str2 = dj.n;
                h.f.b.l.b(str2, "");
                g.a(str2, this.f126928a.C.getAudioUrl());
            }
            if (this.f126928a.C.hasRecord()) {
                com.ss.android.ugc.aweme.video.e.c(this.f126928a.C.getAudioUrl(), str);
                j jVar = this.f126928a.B;
                if (jVar != null) {
                    VEAudioEncodeSettings a2 = new VEAudioEncodeSettings.a().a();
                    h.f.b.l.b(a2, "");
                    h.f.b.l.d(str, "");
                    h.f.b.l.d(a2, "");
                    jVar.f126933a.a(str, a2);
                }
                AudioRecorderParam audioRecorderParam = this.f126928a.C;
                j jVar2 = this.f126928a.B;
                if (jVar2 == null) {
                    h.f.b.l.b();
                }
                audioRecorderParam.setAudioUrl(jVar2.a());
            } else {
                com.ss.android.ugc.asve.editor.g gVar = this.f126928a.f126898b;
                if (gVar != null) {
                    new File(dj.n).mkdirs();
                    String str3 = dj.n + System.currentTimeMillis() + ".wav";
                    j jVar3 = this.f126928a.B;
                    if (jVar3 != null) {
                        int j2 = gVar.j();
                        VEAudioEncodeSettings a3 = new VEAudioEncodeSettings.a().a();
                        h.f.b.l.b(a3, "");
                        h.f.b.l.d(str3, "");
                        h.f.b.l.d(a3, "");
                        jVar3.f126933a.a(str3, a3, j2);
                    }
                    AudioRecorderParam audioRecorderParam2 = this.f126928a.C;
                    j jVar4 = this.f126928a.B;
                    if (jVar4 == null) {
                        h.f.b.l.b();
                    }
                    audioRecorderParam2.setAudioUrl(jVar4.a());
                }
            }
            this.f126928a.E.sendEmptyMessage(this.f126928a.G);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$g  reason: collision with other inner class name */
    public static final class C3296g extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f126912a;

        static {
            Covode.recordClassIndex(83251);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3296g(g gVar) {
            this.f126912a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            String audioUrl;
            String str = "";
            h.f.b.l.d(view, str);
            if (this.f126912a.D) {
                int id = view.getId();
                if (id == R.id.ewh) {
                    g gVar = this.f126912a;
                    if (gVar.f126902f || gVar.f126903g) {
                        g.a(gVar, false, 0, new PrivacyCert(new com.bytedance.bpea.basics.j("1068"), "Dubbing when editing a video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()}), 3);
                    }
                    com.ss.android.ugc.aweme.common.r.a("cancel_dub", gVar.E().f149193a);
                    gVar.D();
                    if (gVar.C.hasChange(gVar.d().veAudioRecorderParam)) {
                        a.C0731a aVar = new a.C0731a(gVar.f42913m);
                        aVar.a(R.string.axf).b(R.string.axk, (DialogInterface.OnClickListener) x.f126929a, false).a(R.string.axj, (DialogInterface.OnClickListener) new y(gVar), false);
                        aVar.a().b();
                        return;
                    }
                    gVar.a(gVar.d().musicVolume, gVar.d().voiceVolume);
                    gVar.a(gVar.C.getAudioUrl());
                    if (gVar.d().veAudioRecorderParam != null && gVar.d().veAudioRecorderParam.hasRecord() && gVar.d().veAudioRecorderParam.getAudioRecordIndex() == -2) {
                        com.ss.android.ugc.aweme.shortvideo.preview.a C = gVar.C();
                        AudioRecorderParam audioRecorderParam = gVar.d().veAudioRecorderParam;
                        h.f.b.l.b(audioRecorderParam, str);
                        h.a(C, audioRecorderParam);
                    }
                } else if (id == R.id.f6c) {
                    g gVar2 = this.f126912a;
                    if (gVar2.f126902f || gVar2.f126903g) {
                        g.a(gVar2, false, 0, new PrivacyCert(new com.bytedance.bpea.basics.j("1069"), "Dubbing when editing a video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()}), 3);
                    }
                    gVar2.D();
                    if (gVar2.B != null) {
                        gVar2.a(gVar2.d().musicVolume, gVar2.d().voiceVolume);
                        if (gVar2.C.getAudioRecordIndex() < 0 && gVar2.C.hasRecord()) {
                            h.a(gVar2.C(), gVar2.C);
                        }
                    }
                    if (gVar2.d().veAudioRecorderParam == null) {
                        gVar2.d().veAudioRecorderParam = new AudioRecorderParam();
                        audioUrl = str;
                    } else {
                        audioUrl = gVar2.d().veAudioRecorderParam.getAudioUrl();
                    }
                    gVar2.d().veAudioRecorderParam.copyFrom(gVar2.C);
                    if (h.m.p.c(audioUrl, "df", false)) {
                        gVar2.d().veAudioRecorderParam.setExtraUrl(audioUrl);
                    } else {
                        str = audioUrl;
                    }
                    com.ss.android.ugc.aweme.common.r.a("save_dub", gVar2.E().a("original_sound", gVar2.C.getNeedOriginalSound() ? 1 : 0).f149193a);
                    gVar2.a(str);
                    com.ss.android.ugc.gamora.editor.subtitle.e eVar = (com.ss.android.ugc.gamora.editor.subtitle.e) gVar2.f126906j.a(gVar2, g.f126897a[1]);
                    if (eVar != null && com.ss.android.ugc.aweme.shortvideo.subtitle.f.a(gVar2.d()) && eVar.h()) {
                        eVar.g();
                        eVar.f();
                    }
                } else if (id == R.id.fhv) {
                    g.a(this.f126912a, false, 0, new PrivacyCert(new com.bytedance.bpea.basics.j("1072"), "Dubbing when editing a video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()}), 3);
                } else if (id == R.id.qo) {
                    g gVar3 = this.f126912a;
                    if (gVar3.f126902f || gVar3.f126903g) {
                        g.a(gVar3, false, 0, new PrivacyCert(new com.bytedance.bpea.basics.j("1073"), "Dubbing when editing a video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()}), 3);
                    }
                    com.ss.android.ugc.aweme.common.r.a("delete_dub", gVar3.E().f149193a);
                    gVar3.C.setNeedDel(true);
                    h.a(gVar3.C(), gVar3.C);
                    b bVar = gVar3.v;
                    if (bVar == null) {
                        h.f.b.l.a("audioRecordSeekBar");
                    }
                    if (!bVar.f126871b.getMStack().empty()) {
                        Point pop = bVar.f126871b.getMStack().pop();
                        bVar.f126871b.invalidate();
                        if (pop != null) {
                            float x = ((float) pop.getX()) / ((float) gVar3.f126899c);
                            pop.setY(pop.getY() + 100);
                            if (pop.getY() > gVar3.f126899c) {
                                pop.setY(gVar3.f126899c);
                            }
                            j jVar = gVar3.B;
                            if (jVar != null) {
                                jVar.f126933a.a(pop.getX(), pop.getY());
                            }
                            gVar3.I.a(x, true);
                            b bVar2 = gVar3.v;
                            if (bVar2 == null) {
                                h.f.b.l.a("audioRecordSeekBar");
                            }
                            bVar2.a(x);
                            AudioRecorderParam audioRecorderParam2 = gVar3.C;
                            b bVar3 = gVar3.v;
                            if (bVar3 == null) {
                                h.f.b.l.a("audioRecordSeekBar");
                            }
                            audioRecorderParam2.setMStack(bVar3.getStack());
                            if (gVar3.C.getMStack().isEmpty()) {
                                View view2 = gVar3.z;
                                if (view2 == null) {
                                    h.f.b.l.a("backView");
                                }
                                view2.setVisibility(8);
                            }
                        }
                    }
                } else if (id == R.id.bzv && !this.f126912a.f126904h) {
                    this.f126912a.a(false, (PrivacyCert) null);
                }
            }
        }
    }

    public static final class h extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f126913a;

        static {
            Covode.recordClassIndex(83252);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(g gVar) {
            this.f126913a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            h.f.b.l.d(view, "");
            if (this.f126913a.y) {
                this.f126913a.b(false);
                g.b(this.f126913a).b();
                g.a(this.f126913a, false, 0, new PrivacyCert(new com.bytedance.bpea.basics.j("1070"), "Dubbing when editing a video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()}), 3);
                this.f126913a.c("click");
            } else if (!this.f126913a.f126904h) {
                this.f126913a.b(true);
                AudioRecordStartButton.a aVar = g.b(this.f126913a).f126846b;
                if (aVar == null) {
                    h.f.b.l.a("centerView");
                }
                aVar.f126850b.end();
                aVar.f126851c.start();
                this.f126913a.a(true, new PrivacyCert(new com.bytedance.bpea.basics.j("1064"), "Dubbing when editing a video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()}));
                this.f126913a.b("click");
            }
        }
    }

    public static final class i implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f126914a;

        static {
            Covode.recordClassIndex(83253);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(g gVar) {
            this.f126914a = gVar;
        }

        public final boolean onLongClick(View view) {
            if (this.f126914a.f126904h) {
                return true;
            }
            this.f126914a.a(true);
            AudioRecordStartButton b2 = g.b(this.f126914a);
            b2.f126848d.end();
            b2.f126847c.start();
            this.f126914a.a(true, new PrivacyCert(new com.bytedance.bpea.basics.j("1065"), "Dubbing when editing a video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()}));
            this.f126914a.b("long_press");
            return true;
        }
    }

    public static final class j implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f126915a;

        static {
            Covode.recordClassIndex(83254);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(g gVar) {
            this.f126915a = gVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent != null && ((motionEvent.getAction() == 3 || motionEvent.getAction() == 1) && this.f126915a.x)) {
                this.f126915a.a(false);
                g.b(this.f126915a).a();
                g.a(this.f126915a, false, 0, new PrivacyCert(new com.bytedance.bpea.basics.j("1071"), "Dubbing when editing a video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()}), 3);
                this.f126915a.c("long_press");
            }
            return false;
        }
    }

    static final class l implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.a f126917a;

        static {
            Covode.recordClassIndex(83256);
        }

        l(com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.a aVar) {
            this.f126917a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.i
        public final void a(List<Bitmap> list) {
            this.f126917a.a(list);
        }
    }

    public static final class p implements com.ss.android.ugc.tools.view.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f126921a;

        static {
            Covode.recordClassIndex(83260);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        p(g gVar) {
            this.f126921a = gVar;
        }

        @Override // com.ss.android.ugc.tools.view.a.a
        public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
            if (i2 != 4 || !this.f126921a.z()) {
                return false;
            }
            g.e(this.f126921a).performClick();
            return true;
        }
    }

    public static final class t implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f126925a;

        static {
            Covode.recordClassIndex(83264);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        t(g gVar) {
            this.f126925a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.i
        public final void a(float f2, boolean z) {
            int i2;
            long j2;
            long j3 = (long) (((float) this.f126925a.f126899c) * f2);
            com.ss.android.ugc.asve.editor.g gVar = this.f126925a.f126898b;
            if (gVar != null) {
                i2 = gVar.G();
            } else {
                i2 = 0;
            }
            int i3 = (int) (((float) i2) * f2);
            com.ss.android.ugc.asve.editor.g gVar2 = this.f126925a.f126898b;
            if (gVar2 != null) {
                j2 = (long) gVar2.s(i3);
            } else {
                j2 = 0;
            }
            this.f126925a.f126900d = f2;
            if (z) {
                this.f126925a.f126905i = null;
                g.f(this.f126925a).setValue(dmt.av.video.t.b(j2));
                g.f(this.f126925a).setValue(dmt.av.video.t.b());
                g.g(this.f126925a).setVisibility(0);
            } else {
                g.f(this.f126925a).setValue(dmt.av.video.t.a(j2));
                g.f(this.f126925a).setValue(dmt.av.video.t.b());
                g.g(this.f126925a).setVisibility(4);
            }
            this.f126925a.a().setValue(Long.valueOf(j3));
        }
    }

    static final class k implements c.b {

        /* renamed from: a  reason: collision with root package name */
        public static final k f126916a = new k();

        static {
            Covode.recordClassIndex(83255);
        }

        k() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c.b
        public final void a(String str) {
            com.ss.android.ugc.aweme.port.in.g.a().I().a(str);
        }
    }

    public static final /* synthetic */ b a(g gVar) {
        b bVar = gVar.v;
        if (bVar == null) {
            h.f.b.l.a("audioRecordSeekBar");
        }
        return bVar;
    }

    public static final /* synthetic */ AudioRecordStartButton b(g gVar) {
        AudioRecordStartButton audioRecordStartButton = gVar.w;
        if (audioRecordStartButton == null) {
            h.f.b.l.a("audioRecordStartButton");
        }
        return audioRecordStartButton;
    }

    public static final /* synthetic */ AVDmtTextView c(g gVar) {
        AVDmtTextView aVDmtTextView = gVar.A;
        if (aVDmtTextView == null) {
            h.f.b.l.a("tvMsg");
        }
        return aVDmtTextView;
    }

    public static final /* synthetic */ View d(g gVar) {
        View view = gVar.z;
        if (view == null) {
            h.f.b.l.a("backView");
        }
        return view;
    }

    public static final /* synthetic */ View e(g gVar) {
        View view = gVar.t;
        if (view == null) {
            h.f.b.l.a("mCancelView");
        }
        return view;
    }

    public static final /* synthetic */ androidx.lifecycle.t f(g gVar) {
        androidx.lifecycle.t<dmt.av.video.t> tVar = gVar.f126907k;
        if (tVar == null) {
            h.f.b.l.a("mPreviewControlOpLiveData");
        }
        return tVar;
    }

    public static final /* synthetic */ View g(g gVar) {
        View view = gVar.u;
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

    public final void c(String str) {
        com.ss.android.ugc.aweme.common.r.a("record_dub_end", E().a("enter_method", str).f149193a);
    }

    static final class z<T> implements androidx.core.g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f126931a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f126932b;

        static {
            Covode.recordClassIndex(83270);
        }

        z(g gVar, boolean z) {
            this.f126931a = gVar;
            this.f126932b = z;
        }

        @Override // androidx.core.g.a
        public final /* synthetic */ void a(Object obj) {
            if (this.f126932b) {
                View view = this.f126931a.f126908l;
                if (view == null) {
                    h.f.b.l.a("mSaveView");
                }
                view.setVisibility(0);
                g.e(this.f126931a).setVisibility(0);
                return;
            }
            com.bytedance.scene.group.b bVar = (com.bytedance.scene.group.b) this.f126931a.o;
            if (bVar != null) {
                bVar.d(this.f126931a);
            }
        }
    }

    public final void b(String str) {
        com.ss.android.ugc.aweme.common.r.a("record_dub_start", E().a("enter_method", str).f149193a);
    }

    static final class m<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f126918a;

        static {
            Covode.recordClassIndex(83257);
        }

        m(g gVar) {
            this.f126918a = gVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Long l2 = (Long) obj;
            if (l2 != null) {
                l2.longValue();
                b a2 = g.a(this.f126918a);
                int longValue = (int) l2.longValue();
                if (longValue < a2.f126877h - 1) {
                    Iterator<T> it = a2.f126871b.getMStack().iterator();
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
                    if (!this.f126918a.f126902f) {
                        AudioRecordStartButton b2 = g.b(this.f126918a);
                        b2.setAlpha(0.5f);
                        b2.setEnabled(false);
                        g.c(this.f126918a).setText(R.string.axe);
                        return;
                    }
                    return;
                }
                AudioRecordStartButton b3 = g.b(this.f126918a);
                b3.setAlpha(1.0f);
                b3.setEnabled(true);
                g.c(this.f126918a).setText(R.string.aya);
            }
        }
    }

    static final class n<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f126919a;

        static {
            Covode.recordClassIndex(83258);
        }

        n(g gVar) {
            this.f126919a = gVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                bool.booleanValue();
                if (bool.booleanValue()) {
                    this.f126919a.d().voiceVolume = this.f126919a.C.getVoiceVolume();
                } else {
                    this.f126919a.d().voiceVolume = 0.0f;
                }
                this.f126919a.C.setNeedOriginalSound(bool.booleanValue());
                if (this.f126919a.f126903g && !this.f126919a.f126902f) {
                    g gVar = this.f126919a;
                    gVar.a(-1.0f, gVar.d().voiceVolume);
                }
            }
        }
    }

    public final void b(boolean z2) {
        this.y = z2;
        F().d(z2);
    }

    public g(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.ah = fVar;
        h.k.c a2 = h.f.b.ab.a(EditAudioRecordViewModel.class);
        this.K = h.i.a((h.f.a.a) new c(this, a2, a2));
        ValueAnimator ofInt = ValueAnimator.ofInt(1, 10);
        h.f.b.l.b(ofInt, "");
        this.f126901e = ofInt;
        this.f126904h = true;
        this.P = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);
        this.Q = h.i.a(h.m.NONE, new a(this));
        this.f126906j = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.gamora.editor.subtitle.e.class);
        this.R = h.i.a(h.m.NONE, new b(this));
        this.C = new AudioRecorderParam();
        this.D = true;
        this.E = new WeakHandler(this);
        this.F = 1;
        this.G = 2;
        this.H = 4;
        this.I = new t(this);
        this.af = new p(this);
        this.ag = new C3296g(this);
    }

    private static boolean a(File file) {
        MethodCollector.i(5336);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(5336);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(5336);
        return delete;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        h.f.b.l.d(message, "");
        int i2 = message.what;
        if (i2 == this.F) {
            this.D = false;
            View view = this.U;
            if (view == null) {
                h.f.b.l.a("mLoadingStatusViewLayout");
            }
            view.setVisibility(0);
            DmtStatusView dmtStatusView = this.T;
            if (dmtStatusView == null) {
                h.f.b.l.a("mLoadingStatusView");
            }
            DmtStatusView.a a2 = DmtStatusView.a.a(this.f42913m);
            a2.f33605g = 1;
            dmtStatusView.setBuilder(a2);
            DmtStatusView dmtStatusView2 = this.T;
            if (dmtStatusView2 == null) {
                h.f.b.l.a("mLoadingStatusView");
            }
            dmtStatusView2.f();
        } else if (i2 == this.G) {
            this.D = true;
            DmtStatusView dmtStatusView3 = this.T;
            if (dmtStatusView3 == null) {
                h.f.b.l.a("mLoadingStatusView");
            }
            dmtStatusView3.a(true);
            View view2 = this.U;
            if (view2 == null) {
                h.f.b.l.a("mLoadingStatusViewLayout");
            }
            view2.setVisibility(8);
        } else if (i2 == this.H) {
            this.D = true;
            DmtStatusView dmtStatusView4 = this.T;
            if (dmtStatusView4 == null) {
                h.f.b.l.a("mLoadingStatusView");
            }
            dmtStatusView4.a(true);
            View view3 = this.U;
            if (view3 == null) {
                h.f.b.l.a("mLoadingStatusViewLayout");
            }
            view3.setVisibility(8);
            ((EditAudioRecordViewModel) this.K.getValue()).f126860b.setValue(false);
            com.ss.android.ugc.asve.editor.g gVar = this.f126898b;
            if (gVar != null) {
                gVar.a(true);
            }
            androidx.lifecycle.t<dmt.av.video.t> tVar = this.f126907k;
            if (tVar == null) {
                h.f.b.l.a("mPreviewControlOpLiveData");
            }
            tVar.setValue(dmt.av.video.t.a());
        }
    }

    static final class o implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f126920a;

        static {
            Covode.recordClassIndex(83259);
        }

        o(g gVar) {
            this.f126920a = gVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int i2;
            int i3;
            com.ss.android.ugc.asve.editor.g gVar = this.f126920a.f126898b;
            if (gVar != null) {
                this.f126920a.a().setValue(Long.valueOf((long) gVar.k()));
                g.a(this.f126920a).a(((float) gVar.k()) / ((float) gVar.j()));
                if (this.f126920a.f126902f) {
                    b a2 = g.a(this.f126920a);
                    int k2 = gVar.k();
                    Point point = this.f126920a.f126905i;
                    if (point != null) {
                        i2 = point.getX();
                    } else {
                        i2 = k2;
                    }
                    Iterator<T> it = a2.f126871b.getMStack().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i3 = -1;
                            break;
                        }
                        T next = it.next();
                        if (next.getX() >= i2 && k2 >= next.getX() && k2 <= next.getY() && (!h.f.b.l.a((Object) next, (Object) point))) {
                            i3 = next.getX();
                            break;
                        }
                    }
                    g.a(this.f126920a).f126871b.invalidate();
                    if (i3 == -1) {
                        Point point2 = this.f126920a.f126905i;
                        if (point2 != null) {
                            point2.setY(gVar.k());
                        }
                        g.a(this.f126920a).f126871b.invalidate();
                    } else {
                        Point point3 = this.f126920a.f126905i;
                        if (point3 != null) {
                            point3.setY(i3);
                        }
                        g.a(this.f126920a).f126871b.invalidate();
                        this.f126920a.a(false, i3, new PrivacyCert(new com.bytedance.bpea.basics.j("1066"), "Dubbing when editing a video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()}));
                    }
                } else {
                    this.f126920a.f126905i = null;
                }
                if (gVar.k() < this.f126920a.f126899c) {
                    return;
                }
                if (this.f126920a.f126902f) {
                    g.a(this.f126920a, true, 0, new PrivacyCert(new com.bytedance.bpea.basics.j("1067"), "Dubbing when editing a video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()}), 2);
                    return;
                }
                this.f126920a.f126901e.cancel();
                this.f126920a.I.a(0.0f, true);
                g.a(this.f126920a).a(0.0f);
                this.f126920a.C.setMStack(g.a(this.f126920a).getStack());
                if (this.f126920a.C.getMStack().isEmpty()) {
                    g.d(this.f126920a).setVisibility(8);
                } else {
                    g.d(this.f126920a).setVisibility(0);
                }
            }
        }
    }

    public final void c(boolean z2) {
        com.bytedance.scene.group.b bVar;
        if (z2 && (bVar = (com.bytedance.scene.group.b) this.o) != null) {
            bVar.e(this);
        }
        ViewGroup viewGroup = this.Y;
        if (viewGroup == null) {
            h.f.b.l.a("contentLayout");
        }
        com.ss.android.ugc.aweme.effect.s.a(viewGroup, z2, (int) com.bytedance.common.utility.n.b(this.f42913m, 282.0f), b(R.id.b_h), new z(this, z2));
        if (z2) {
            I();
            if (d().veAudioRecorderParam != null) {
                d().veAudioRecorderParam.setNeedDel(true);
                com.ss.android.ugc.aweme.shortvideo.preview.a C2 = C();
                AudioRecorderParam audioRecorderParam = d().veAudioRecorderParam;
                h.f.b.l.b(audioRecorderParam, "");
                h.a(C2, audioRecorderParam);
            } else {
                this.C = new AudioRecorderParam();
            }
            this.C.copyFrom(d().veAudioRecorderParam);
            if (this.C.getNeedOriginalSound()) {
                this.C.setVoiceVolume(d().voiceVolume);
            }
            this.f126905i = null;
            CheckBox checkBox = this.aa;
            if (checkBox == null) {
                h.f.b.l.a("checkBox");
            }
            checkBox.setChecked(this.C.getNeedOriginalSound());
            b().setValue(Boolean.valueOf(this.C.getNeedOriginalSound()));
            View view = this.u;
            if (view == null) {
                h.f.b.l.a("mPlayView");
            }
            view.setVisibility(0);
            this.I.a(0.0f, true);
            b bVar2 = this.v;
            if (bVar2 == null) {
                h.f.b.l.a("audioRecordSeekBar");
            }
            bVar2.setStack(this.C.getMStack());
            b bVar3 = this.v;
            if (bVar3 == null) {
                h.f.b.l.a("audioRecordSeekBar");
            }
            bVar3.a(0.0f);
            a().setValue(0L);
            if (this.C.getMStack().isEmpty()) {
                View view2 = this.z;
                if (view2 == null) {
                    h.f.b.l.a("backView");
                }
                view2.setVisibility(8);
            } else {
                View view3 = this.z;
                if (view3 == null) {
                    h.f.b.l.a("backView");
                }
                view3.setVisibility(0);
            }
            com.ss.android.ugc.tools.view.a.c cVar = this.O;
            if (cVar != null) {
                cVar.b(this.af);
            }
            G();
            if (d().veAudioEffectParam != null) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f42913m).a(R.string.ayn).a();
            }
            C().a(u.a.a(com.ss.android.ugc.aweme.themechange.base.c.a(true, false, false, false), ((int) com.bytedance.common.utility.n.b(this.f42913m, 52.0f)) + dh.c(this.f42913m), (int) com.bytedance.common.utility.n.b(this.f42913m, 282.0f), H(), com.ss.android.ugc.aweme.adaptation.a.f66177a.d(), false, false, 960));
            return;
        }
        View view4 = this.f126908l;
        if (view4 == null) {
            h.f.b.l.a("mSaveView");
        }
        view4.setVisibility(8);
        View view5 = this.t;
        if (view5 == null) {
            h.f.b.l.a("mCancelView");
        }
        view5.setVisibility(8);
        com.ss.android.ugc.tools.view.a.c cVar2 = this.O;
        if (cVar2 != null) {
            cVar2.c(this.af);
        }
        this.f126901e.cancel();
        com.ss.android.ugc.aweme.shortvideo.preview.a C3 = C();
        View view6 = this.f126908l;
        if (view6 == null) {
            h.f.b.l.a("mSaveView");
        }
        C3.a(u.a.a(androidx.core.content.b.c(view6.getContext(), R.color.a2), ((int) com.bytedance.common.utility.n.b(this.f42913m, 52.0f)) + dh.c(this.f42913m), (int) com.bytedance.common.utility.n.b(this.f42913m, 282.0f), H(), com.ss.android.ugc.aweme.adaptation.a.f66177a.d()));
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        MethodCollector.i(5324);
        super.a(bundle);
        this.f126907k = C().v();
        com.ss.android.ugc.asve.editor.g value = C().C().getValue();
        this.f126898b = value;
        if (value != null) {
            this.f126899c = value.j();
        }
        View b2 = b(R.id.f6c);
        if (b2 == null) {
            h.f.b.l.b();
        }
        this.f126908l = b2;
        View b3 = b(R.id.ewh);
        if (b3 == null) {
            h.f.b.l.b();
        }
        this.t = b3;
        View b4 = b(R.id.bzv);
        if (b4 == null) {
            h.f.b.l.b();
        }
        this.u = b4;
        View b5 = b(R.id.dx0);
        if (b5 == null) {
            h.f.b.l.b();
        }
        this.V = (FrameLayout) b5;
        View b6 = b(R.id.fhv);
        if (b6 == null) {
            h.f.b.l.b();
        }
        this.X = b6;
        View b7 = b(R.id.ae6);
        if (b7 == null) {
            h.f.b.l.b();
        }
        this.Y = (ViewGroup) b7;
        View b8 = b(R.id.e9r);
        if (b8 == null) {
            h.f.b.l.b();
        }
        this.w = (AudioRecordStartButton) b8;
        View b9 = b(R.id.qo);
        if (b9 == null) {
            h.f.b.l.b();
        }
        this.z = b9;
        View b10 = b(R.id.f2z);
        if (b10 == null) {
            h.f.b.l.b();
        }
        AVDmtTextView aVDmtTextView = (AVDmtTextView) b10;
        this.A = aVDmtTextView;
        if (aVDmtTextView == null) {
            h.f.b.l.a("tvMsg");
        }
        aVDmtTextView.b();
        View b11 = b(R.id.a2z);
        if (b11 == null) {
            h.f.b.l.b();
        }
        CheckBox checkBox = (CheckBox) b11;
        this.aa = checkBox;
        if (checkBox == null) {
            h.f.b.l.a("checkBox");
        }
        checkBox.setText("  " + c_(R.string.axg));
        Typeface a2 = com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33795a);
        if (a2 != null) {
            CheckBox checkBox2 = this.aa;
            if (checkBox2 == null) {
                h.f.b.l.a("checkBox");
            }
            checkBox2.setTypeface(a2);
        }
        View b12 = b(R.id.ci4);
        if (b12 == null) {
            h.f.b.l.b();
        }
        this.T = (DmtStatusView) b12;
        View b13 = b(R.id.ci6);
        if (b13 == null) {
            h.f.b.l.b();
        }
        this.U = b13;
        if (b13 == null) {
            h.f.b.l.a("mLoadingStatusViewLayout");
        }
        b13.setOnClickListener(r.f126923a);
        View b14 = b(R.id.cjk);
        if (b14 == null) {
            h.f.b.l.b();
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) b14;
        this.Z = lottieAnimationView;
        if (lottieAnimationView == null) {
            h.f.b.l.a("lottieAnimationView");
        }
        lottieAnimationView.setAnimation("tool_recording_dark_lottie.json");
        LottieAnimationView lottieAnimationView2 = this.Z;
        if (lottieAnimationView2 == null) {
            h.f.b.l.a("lottieAnimationView");
        }
        lottieAnimationView2.setRepeatCount(-1);
        com.ss.android.ugc.aweme.shortvideo.edit.c.a.a(this);
        View view = this.z;
        if (view == null) {
            h.f.b.l.a("backView");
        }
        view.setBackgroundResource(R.drawable.d1);
        Activity activity = this.f42913m;
        if (activity != null) {
            b bVar = new b((androidx.fragment.app.e) activity, this);
            this.v = bVar;
            int b15 = (int) com.bytedance.common.utility.n.b(this.f42913m, 16.0f);
            int b16 = (int) com.bytedance.common.utility.n.b(this.f42913m, 6.0f);
            int i2 = this.f126899c;
            t tVar = this.I;
            bVar.f126872c = b15;
            bVar.f126873d = b16;
            bVar.f126874e = ((int) com.bytedance.common.utility.n.b(this.f42913m, 4.0f)) * 5;
            bVar.f126877h = i2;
            bVar.f126878i = tVar;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.bottomMargin = b16;
            layoutParams.topMargin = b16;
            layoutParams.rightMargin = b15;
            layoutParams.leftMargin = b15;
            a aVar = bVar.f126871b;
            aVar.f126865a = Color.parseColor("#ccfe2c55");
            aVar.f126866b.setColor(aVar.f126865a);
            aVar.f126866b.setStyle(Paint.Style.FILL);
            aVar.f126867c = i2;
            aVar.f126868d = com.bytedance.common.utility.n.b(aVar.getContext(), 0.0f);
            bVar.addView(bVar.f126871b, layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(bVar.f126874e, -1);
            if (com.ss.android.ugc.aweme.tools.c.a(bVar.getContext())) {
                layoutParams2.addRule(21);
                layoutParams2.setMarginEnd(b15 - (bVar.f126874e / 2));
            } else {
                layoutParams2.leftMargin = b15 - (bVar.f126874e / 2);
            }
            bVar.f126870a.setImageDrawable(com.ss.android.ugc.tools.view.a.a(0, -1, 1, (int) com.bytedance.common.utility.n.b(bVar.getContext(), 2.0f)));
            bVar.f126870a.setPadding((int) (((float) bVar.f126874e) * 0.4f), 0, (int) (((float) bVar.f126874e) * 0.4f), 0);
            bVar.addView(bVar.f126870a, layoutParams2);
            bVar.f126870a.setOnTouchListener(new b.a(bVar));
            FrameLayout frameLayout = this.V;
            if (frameLayout == null) {
                h.f.b.l.a("seekLayout");
            }
            b bVar2 = this.v;
            if (bVar2 == null) {
                h.f.b.l.a("audioRecordSeekBar");
            }
            frameLayout.addView(bVar2, new FrameLayout.LayoutParams(-1, -1));
            View b17 = b(R.id.a61);
            if (b17 == null) {
                h.f.b.l.b();
            }
            this.W = (ChooseVideoCoverView) b17;
            if (this.f42913m instanceof com.ss.android.ugc.tools.view.a.c) {
                Activity activity2 = this.f42913m;
                if (activity2 != null) {
                    this.O = (com.ss.android.ugc.tools.view.a.c) activity2;
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
                    MethodCollector.o(5324);
                    throw nullPointerException;
                }
            }
            this.ae = C().h();
            this.ad = C().i();
            this.f126901e.setDuration(1000L);
            this.f126901e.setRepeatCount(-1);
            this.f126901e.addUpdateListener(new o(this));
            View view2 = this.f126908l;
            if (view2 == null) {
                h.f.b.l.a("mSaveView");
            }
            view2.setOnClickListener(this.ag);
            View view3 = this.t;
            if (view3 == null) {
                h.f.b.l.a("mCancelView");
            }
            view3.setOnClickListener(this.ag);
            View view4 = this.u;
            if (view4 == null) {
                h.f.b.l.a("mPlayView");
            }
            view4.setOnClickListener(this.ag);
            View view5 = this.X;
            if (view5 == null) {
                h.f.b.l.a("videoLayout");
            }
            view5.setOnClickListener(this.ag);
            View view6 = this.z;
            if (view6 == null) {
                h.f.b.l.a("backView");
            }
            view6.setOnClickListener(this.ag);
            AudioRecordStartButton audioRecordStartButton = this.w;
            if (audioRecordStartButton == null) {
                h.f.b.l.a("audioRecordStartButton");
            }
            audioRecordStartButton.setOnClickListener(new h(this));
            AudioRecordStartButton audioRecordStartButton2 = this.w;
            if (audioRecordStartButton2 == null) {
                h.f.b.l.a("audioRecordStartButton");
            }
            audioRecordStartButton2.setOnLongClickListener(new i(this));
            AudioRecordStartButton audioRecordStartButton3 = this.w;
            if (audioRecordStartButton3 == null) {
                h.f.b.l.a("audioRecordStartButton");
            }
            audioRecordStartButton3.setOnTouchListener(new j(this));
            a().observe(this, new m(this));
            b().observe(this, new n(this));
            CheckBox checkBox3 = this.aa;
            if (checkBox3 == null) {
                h.f.b.l.a("checkBox");
            }
            checkBox3.setOnCheckedChangeListener(new s(this));
            CheckBox checkBox4 = this.aa;
            if (checkBox4 == null) {
                h.f.b.l.a("checkBox");
            }
            checkBox4.setVisibility(8);
            VideoPublishEditModel d2 = d();
            if (d2.realHasOriginalSound() || d2.isFastImport) {
                CheckBox checkBox5 = this.aa;
                if (checkBox5 == null) {
                    h.f.b.l.a("checkBox");
                }
                checkBox5.setVisibility(0);
            }
            if (d2.editMusicSyncMode || d2.isDuet() || bp.b(d2) || d2.isStickPointMode) {
                CheckBox checkBox6 = this.aa;
                if (checkBox6 == null) {
                    h.f.b.l.a("checkBox");
                }
                checkBox6.setVisibility(8);
            }
            com.ss.android.ugc.asve.editor.g gVar = this.f126898b;
            if (gVar == null) {
                MethodCollector.o(5324);
                return;
            }
            ChooseVideoCoverView chooseVideoCoverView = this.W;
            if (chooseVideoCoverView == null) {
                h.f.b.l.a("mChooseVideoCoverView");
            }
            chooseVideoCoverView.a();
            ChooseVideoCoverView chooseVideoCoverView2 = this.W;
            if (chooseVideoCoverView2 == null) {
                h.f.b.l.a("mChooseVideoCoverView");
            }
            chooseVideoCoverView2.setLayoutManager(new WrapLinearLayoutManager((byte) 0));
            ChooseVideoCoverView chooseVideoCoverView3 = this.W;
            if (chooseVideoCoverView3 == null) {
                h.f.b.l.a("mChooseVideoCoverView");
            }
            int frameHeight = chooseVideoCoverView3.getFrameHeight();
            ChooseVideoCoverView chooseVideoCoverView4 = this.W;
            if (chooseVideoCoverView4 == null) {
                h.f.b.l.a("mChooseVideoCoverView");
            }
            int frameWidth = chooseVideoCoverView4.getFrameWidth();
            int ceil = (int) Math.ceil((double) (((float) (com.bytedance.common.utility.n.a(this.f42913m) - (h.g.a.a(com.bytedance.common.utility.n.b(this.f42913m, 16.0f)) * 2))) / (((float) frameWidth) * 1.0f)));
            ChooseVideoCoverView chooseVideoCoverView5 = this.W;
            if (chooseVideoCoverView5 == null) {
                h.f.b.l.a("mChooseVideoCoverView");
            }
            chooseVideoCoverView5.setCoverSize(ceil);
            Activity activity3 = this.f42913m;
            if (activity3 != null) {
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity3;
                ChooseVideoCoverView chooseVideoCoverView6 = this.W;
                if (chooseVideoCoverView6 == null) {
                    h.f.b.l.a("mChooseVideoCoverView");
                }
                this.ab = new VEVideoCoverGeneratorImpl(gVar, eVar, chooseVideoCoverView6.getCoverSize(), null, "ai_music");
                VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl = this.ab;
                if (vEVideoCoverGeneratorImpl == null) {
                    h.f.b.l.a("mEffectVideoCoverGenerator");
                }
                this.ac = new com.ss.android.ugc.aweme.shortvideo.widget.p(vEVideoCoverGeneratorImpl, frameWidth, frameHeight, ceil);
                if (d().isMvThemeVideoType()) {
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.a aVar2 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.a(frameWidth, frameHeight);
                    ChooseVideoCoverView chooseVideoCoverView7 = this.W;
                    if (chooseVideoCoverView7 == null) {
                        h.f.b.l.a("mChooseVideoCoverView");
                    }
                    chooseVideoCoverView7.setAdapter(aVar2);
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c cVar = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c();
                    cVar.f128780b = k.f126916a;
                    androidx.lifecycle.t<Boolean> tVar2 = this.ae;
                    if (tVar2 == null) {
                        h.f.b.l.a("firstFrameVisible");
                    }
                    cVar.f128791m = tVar2;
                    androidx.lifecycle.t<Bitmap> tVar3 = this.ad;
                    if (tVar3 == null) {
                        h.f.b.l.a("firstFrameBitmap");
                    }
                    cVar.f128790l = tVar3;
                    cVar.a(frameWidth, frameHeight).a(this.f42913m, this.f126898b, ceil, new l(aVar2));
                    ChooseVideoCoverView chooseVideoCoverView8 = this.W;
                    if (chooseVideoCoverView8 == null) {
                        h.f.b.l.a("mChooseVideoCoverView");
                    }
                    chooseVideoCoverView8.setAdapter(aVar2);
                    MethodCollector.o(5324);
                    return;
                }
                com.ss.android.ugc.aweme.shortvideo.widget.p pVar = this.ac;
                if (pVar == null) {
                    h.f.b.l.a("mSharedVideoCoverDataSource");
                }
                ChooseVideoCoverView.a aVar3 = new ChooseVideoCoverView.a(pVar, frameWidth, frameHeight);
                ChooseVideoCoverView chooseVideoCoverView9 = this.W;
                if (chooseVideoCoverView9 == null) {
                    h.f.b.l.a("mChooseVideoCoverView");
                }
                chooseVideoCoverView9.setAdapter(aVar3);
                MethodCollector.o(5324);
                return;
            }
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            MethodCollector.o(5324);
            throw nullPointerException2;
        }
        NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        MethodCollector.o(5324);
        throw nullPointerException3;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        j jVar = this.B;
        if (jVar != null) {
            jVar.f126933a.destory();
        }
        b.i.b(new e(new f(this, str)), com.ss.android.ugc.aweme.cw.g.a());
    }

    static final class x implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final x f126929a = new x();

        static {
            Covode.recordClassIndex(83268);
        }

        x() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    static final class s implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f126924a;

        static {
            Covode.recordClassIndex(83263);
        }

        s(g gVar) {
            this.f126924a = gVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f126924a.b().setValue(Boolean.valueOf(z));
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.asu, viewGroup, false);
        h.f.b.l.b(a2, "");
        this.S = a2;
        if (a2 == null) {
            h.f.b.l.a("parentLayout");
        }
        return a2;
    }

    static final class y implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f126930a;

        static {
            Covode.recordClassIndex(83269);
        }

        y(g gVar) {
            this.f126930a = gVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            g gVar = this.f126930a;
            AudioRecorderParam audioRecorderParam = gVar.d().veAudioRecorderParam;
            if (gVar.C.getAudioRecordIndex() >= 0 && gVar.C.hasRecord()) {
                gVar.C.setNeedDel(true);
                h.a(gVar.C(), gVar.C);
            }
            if (audioRecorderParam != null) {
                if (audioRecorderParam.getAudioRecordIndex() < 0 && audioRecorderParam.hasRecord()) {
                    h.a(gVar.C(), audioRecorderParam);
                }
                if (audioRecorderParam.getNeedOriginalSound()) {
                    gVar.d().voiceVolume = audioRecorderParam.getVoiceVolume();
                } else {
                    gVar.d().voiceVolume = 0.0f;
                }
            } else {
                gVar.d().voiceVolume = gVar.C.getVoiceVolume();
            }
            gVar.a(gVar.d().musicVolume, gVar.d().voiceVolume);
            gVar.a(gVar.C.getAudioUrl());
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
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    static /* synthetic */ void a(g gVar, boolean z2, int i2, PrivacyCert privacyCert, int i3) {
        if ((i3 & 1) != 0) {
            z2 = false;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        if ((i3 & 4) != 0) {
            privacyCert = null;
        }
        gVar.a(z2, i2, privacyCert);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
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
