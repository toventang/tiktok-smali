package com.ss.android.ugc.aweme.ftc.components.cutmusic;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ac;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.v;
import com.ss.android.ugc.aweme.df.r;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.KTVView;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.b;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.f;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.k;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.gamora.editor.s;
import com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.x;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.u;
import h.z;
import java.util.Objects;

public final class c extends com.bytedance.scene.j implements View.OnTouchListener, com.bytedance.jedi.arch.b, com.bytedance.o.a {
    public static final b D = new b((byte) 0);
    public final VEListener.s A = new o(this);
    final l B = new l(this);
    public boolean C;
    private TextView E;
    private ImageView F;
    private FrameLayout G;
    private View H;
    private float I;
    private float J;
    private AbstractC2362c K;
    private FTCEditMusicCutViewModel L;
    private final h.h M = h.i.a(h.m.NONE, new a(this));
    private final m N = new m(this);
    private final com.bytedance.o.f O;

    /* renamed from: a  reason: collision with root package name */
    public ImageView f97780a;

    /* renamed from: b  reason: collision with root package name */
    public KTVView f97781b;

    /* renamed from: c  reason: collision with root package name */
    TextView f97782c;

    /* renamed from: d  reason: collision with root package name */
    TextView f97783d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.cutmusic.b f97784e;

    /* renamed from: f  reason: collision with root package name */
    public RelativeLayout f97785f;

    /* renamed from: g  reason: collision with root package name */
    public s f97786g;

    /* renamed from: h  reason: collision with root package name */
    public VideoPublishEditModel f97787h;

    /* renamed from: i  reason: collision with root package name */
    int f97788i;

    /* renamed from: j  reason: collision with root package name */
    public int f97789j;

    /* renamed from: k  reason: collision with root package name */
    public int f97790k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f97791l;
    public boolean t;
    public int u;
    public int v;
    public final Handler w = new Handler(Looper.getMainLooper());
    com.ss.android.ugc.tools.view.a.c x;
    public d y;
    public EditStickerViewModel z;

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.c$c  reason: collision with other inner class name */
    public interface AbstractC2362c {
        static {
            Covode.recordClassIndex(62141);
        }

        void a();
    }

    public interface d {
        static {
            Covode.recordClassIndex(62142);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(62138);
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a b() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.M.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class b {
        static {
            Covode.recordClassIndex(62140);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.O;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62139);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.preview.a invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.ftc.components.cutmusic.c r0 = r2.this$0
                androidx.fragment.app.e r0 = com.bytedance.scene.ktx.c.b(r0)
                com.bytedance.als.ApiCenter r1 = com.bytedance.als.ApiCenter.a.a(r0)
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r0 = com.ss.android.ugc.aweme.shortvideo.preview.a.class
                com.bytedance.als.b r0 = r1.a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.cutmusic.c.a.invoke():com.bytedance.als.b");
        }
    }

    static final class o implements VEListener.s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f97803a;

        static {
            Covode.recordClassIndex(62154);
        }

        o(c cVar) {
            this.f97803a = cVar;
        }

        @Override // com.ss.android.vesdk.VEListener.s
        public final void a() {
            com.ss.android.ugc.asve.editor.g value = this.f97803a.b().C().getValue();
            if (value != null) {
                value.t();
            }
        }
    }

    public final void D() {
        AbstractC2362c cVar = this.K;
        if (cVar != null) {
            cVar.a();
        }
        com.ss.android.ugc.tools.view.a.c cVar2 = this.x;
        if (cVar2 != null) {
            cVar2.c(this.B);
        }
    }

    public final VideoPublishEditModel a() {
        VideoPublishEditModel videoPublishEditModel = this.f97787h;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("mModel");
        }
        return videoPublishEditModel;
    }

    /* access modifiers changed from: package-private */
    public final int d() {
        com.ss.android.ugc.asve.editor.g value = b().C().getValue();
        if (value == null) {
            h.f.b.l.b();
        }
        return value.j();
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f97792a;

        static {
            Covode.recordClassIndex(62143);
        }

        e(c cVar) {
            this.f97792a = cVar;
        }

        public final void run() {
            MethodCollector.i(3826);
            RelativeLayout relativeLayout = this.f97792a.f97785f;
            if (relativeLayout == null) {
                h.f.b.l.a("slideContainer");
            }
            relativeLayout.addView(c.a(this.f97792a));
            c.a(this.f97792a).post(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.ftc.components.cutmusic.c.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f97793a;

                static {
                    Covode.recordClassIndex(62144);
                }

                {
                    this.f97793a = r1;
                }

                public final void run() {
                    if (this.f97793a.f97792a.f97789j == 0) {
                        c.a(this.f97793a.f97792a).setX(c.b(this.f97793a.f97792a).getX() - ((float) (c.a(this.f97793a.f97792a).getWidth() / 2)));
                    } else {
                        double d2 = (double) this.f97793a.f97792a.f97789j;
                        Double.isNaN(d2);
                        double width = (double) c.b(this.f97793a.f97792a).getWidth();
                        Double.isNaN(width);
                        double d3 = d2 * 1.0d * width;
                        double d4 = (double) this.f97793a.f97792a.u;
                        Double.isNaN(d4);
                        c.a(this.f97793a.f97792a).setX((c.b(this.f97793a.f97792a).getX() + ((float) ((int) (d3 / d4)))) - ((float) (c.a(this.f97793a.f97792a).getWidth() / 2)));
                    }
                    c.b(this.f97793a.f97792a).setLength(this.f97793a.f97792a.C());
                    c.a(this.f97793a.f97792a).setOnTouchListener(this.f97793a.f97792a);
                }
            });
            MethodCollector.o(3826);
        }
    }

    public static final class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f97802a;

        static {
            Covode.recordClassIndex(62152);
        }

        public final void run() {
            com.ss.android.ugc.asve.editor.g value = this.f97802a.b().C().getValue();
            if (value != null) {
                int k2 = value.k();
                int i2 = this.f97802a.v;
                if (k2 < i2) {
                    c.c(this.f97802a).b((((float) k2) * 1.0f) / ((float) i2));
                }
                this.f97802a.w.post(this);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(c cVar) {
            this.f97802a = cVar;
        }
    }

    public final int C() {
        if (this.f97788i >= this.u) {
            KTVView kTVView = this.f97781b;
            if (kTVView == null) {
                h.f.b.l.a("mKTVView");
            }
            return kTVView.getWidth();
        }
        KTVView kTVView2 = this.f97781b;
        if (kTVView2 == null) {
            h.f.b.l.a("mKTVView");
        }
        double width = (double) kTVView2.getWidth();
        Double.isNaN(width);
        double d2 = 1.0d * width;
        double d3 = (double) this.f97788i;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        double d5 = (double) this.u;
        Double.isNaN(d5);
        return (int) (d4 / d5);
    }

    private final int E() {
        if (this.f97788i >= this.u) {
            KTVView kTVView = this.f97781b;
            if (kTVView == null) {
                h.f.b.l.a("mKTVView");
            }
            return (int) (((1.0f * ((float) kTVView.getWidth())) * 15000.0f) / ((float) this.u));
        }
        KTVView kTVView2 = this.f97781b;
        if (kTVView2 == null) {
            h.f.b.l.a("mKTVView");
        }
        double width = (double) kTVView2.getWidth();
        Double.isNaN(width);
        double d2 = 1.0d * width;
        double d3 = (double) this.f97788i;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        double d5 = (double) this.u;
        Double.isNaN(d5);
        return (int) (d4 / d5);
    }

    public static final class i implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f97797a;

        static {
            Covode.recordClassIndex(62148);
        }

        @Override // com.ss.android.ugc.aweme.ftc.components.cutmusic.c.d
        public final void a() {
            int min;
            com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
            com.ss.android.ugc.asve.editor.g value = this.f97797a.b().C().getValue();
            if (value != null) {
                h.f.b.l.b(value, "");
                if (cVar == null || cVar.getShootDuration() <= 0) {
                    min = Math.min(15000, value.j());
                } else if (Math.abs(value.j() - cVar.getShootDuration()) >= 1000) {
                    min = cVar.getShootDuration();
                } else {
                    min = value.j();
                }
                int min2 = Math.min(min, value.j());
                com.ss.android.ugc.aweme.shortvideo.preview.a b2 = this.f97797a.b();
                int i2 = this.f97797a.f97789j;
                c.c(this.f97797a);
                dmt.av.video.s a2 = dmt.av.video.s.a(i2, min2, false);
                h.f.b.l.b(a2, "");
                b2.a(a2);
                int a3 = value.a(0, x.f.EDITOR_SEEK_FLAG_LastSeek, this.f97797a.A);
                if (a3 != 0) {
                    bj.b("onPlayMusic seek error: ".concat(String.valueOf(a3)));
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(c cVar) {
            this.f97797a = cVar;
        }
    }

    static final class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f97804a;

        static {
            Covode.recordClassIndex(62155);
        }

        p(c cVar) {
            this.f97804a = cVar;
        }

        public final void run() {
            c cVar = this.f97804a;
            double d2 = (double) cVar.f97789j;
            Double.isNaN(d2);
            double d3 = d2 * 1.0d;
            KTVView kTVView = cVar.f97781b;
            if (kTVView == null) {
                h.f.b.l.a("mKTVView");
            }
            double width = (double) kTVView.getWidth();
            Double.isNaN(width);
            double d4 = d3 * width;
            double d5 = (double) cVar.u;
            Double.isNaN(d5);
            int i2 = (int) (d4 / d5);
            ImageView imageView = cVar.f97780a;
            if (imageView == null) {
                h.f.b.l.a("mSlide");
            }
            KTVView kTVView2 = cVar.f97781b;
            if (kTVView2 == null) {
                h.f.b.l.a("mKTVView");
            }
            float x = kTVView2.getX() + ((float) i2);
            ImageView imageView2 = cVar.f97780a;
            if (imageView2 == null) {
                h.f.b.l.a("mSlide");
            }
            imageView.setX(x - ((float) (imageView2.getWidth() / 2)));
            KTVView kTVView3 = cVar.f97781b;
            if (kTVView3 == null) {
                h.f.b.l.a("mKTVView");
            }
            kTVView3.setStart(i2);
            KTVView kTVView4 = cVar.f97781b;
            if (kTVView4 == null) {
                h.f.b.l.a("mKTVView");
            }
            kTVView4.setLength(cVar.C());
            TextView textView = cVar.f97782c;
            if (textView == null) {
                h.f.b.l.a("mTextViewTimeStart");
            }
            textView.setText(r.a(cVar.f97789j));
            com.ss.android.ugc.aweme.shortvideo.cutmusic.b bVar = cVar.f97784e;
            if (bVar == null) {
                h.f.b.l.a("cutMusicLayout");
            }
            bVar.setSoundLoopSelected(cVar.f97791l);
            VideoPublishEditModel videoPublishEditModel = cVar.f97787h;
            if (videoPublishEditModel == null) {
                h.f.b.l.a("mModel");
            }
            if (bp.c(videoPublishEditModel)) {
                com.ss.android.ugc.aweme.shortvideo.cutmusic.b bVar2 = cVar.f97784e;
                if (bVar2 == null) {
                    h.f.b.l.a("cutMusicLayout");
                }
                bVar2.setSoundLoopClickable(false);
            }
        }
    }

    public static final class h implements AbstractC2362c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f97796a;

        static {
            Covode.recordClassIndex(62147);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x008e  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00a4  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00dc  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00f8  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0101  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0139  */
        @Override // com.ss.android.ugc.aweme.ftc.components.cutmusic.c.AbstractC2362c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
            // Method dump skipped, instructions count: 357
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.cutmusic.c.h.a():void");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(c cVar) {
            this.f97796a = cVar;
        }
    }

    public static final class f implements f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f97794a;

        static {
            Covode.recordClassIndex(62145);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(c cVar) {
            this.f97794a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a
        public final void a(float f2) {
            c cVar = this.f97794a;
            cVar.f97789j = (int) (f2 * ((float) cVar.u));
            d dVar = this.f97794a.y;
            if (dVar != null) {
                dVar.a();
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a
        public final void b(float f2) {
            c.c(this.f97794a).setTimeBubble((int) (f2 * ((float) this.f97794a.u)));
        }
    }

    public static final class g implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f97795a;

        static {
            Covode.recordClassIndex(62146);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(c cVar) {
            this.f97795a = cVar;
        }
    }

    public static final class l implements com.ss.android.ugc.tools.view.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f97801a;

        static {
            Covode.recordClassIndex(62151);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        l(c cVar) {
            this.f97801a = cVar;
        }

        @Override // com.ss.android.ugc.tools.view.a.a
        public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
            if (i2 != 4) {
                return false;
            }
            c cVar = this.f97801a;
            cVar.f97789j = cVar.f97790k;
            com.ss.android.ugc.aweme.shortvideo.cutmusic.b bVar = cVar.f97784e;
            if (bVar == null) {
                h.f.b.l.a("cutMusicLayout");
            }
            bVar.a((((float) cVar.f97789j) * 1.0f) / ((float) cVar.u));
            com.ss.android.ugc.aweme.shortvideo.cutmusic.b bVar2 = cVar.f97784e;
            if (bVar2 == null) {
                h.f.b.l.a("cutMusicLayout");
            }
            bVar2.setTimeBubble(cVar.f97789j);
            cVar.f97791l = cVar.t;
            cVar.D();
            return true;
        }
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f97800a;

        static {
            Covode.recordClassIndex(62150);
        }

        k(c cVar) {
            this.f97800a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f97800a.D();
        }
    }

    public static final /* synthetic */ ImageView a(c cVar) {
        ImageView imageView = cVar.f97780a;
        if (imageView == null) {
            h.f.b.l.a("mSlide");
        }
        return imageView;
    }

    public static final /* synthetic */ KTVView b(c cVar) {
        KTVView kTVView = cVar.f97781b;
        if (kTVView == null) {
            h.f.b.l.a("mKTVView");
        }
        return kTVView;
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.cutmusic.b c(c cVar) {
        com.ss.android.ugc.aweme.shortvideo.cutmusic.b bVar = cVar.f97784e;
        if (bVar == null) {
            h.f.b.l.a("cutMusicLayout");
        }
        return bVar;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    public static final class j implements k.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f97798a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.c f97799b;

        static {
            Covode.recordClassIndex(62149);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.k.a
        public final void a(com.ss.android.ugc.aweme.shortvideo.d dVar) {
            this.f97798a.C = false;
            this.f97798a.a(true);
            this.f97798a.a(dVar, this.f97799b.getDuration(), this.f97798a.a().mMusicStart);
        }

        j(c cVar, com.ss.android.ugc.aweme.shortvideo.c cVar2) {
            this.f97798a = cVar;
            this.f97799b = cVar2;
        }
    }

    public c(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.O = fVar;
    }

    private final void b(boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        KTVView kTVView = this.f97781b;
        if (kTVView == null) {
            h.f.b.l.a("mKTVView");
        }
        int i7 = 0;
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        kTVView.setVisibility(i2);
        TextView textView = this.f97782c;
        if (textView == null) {
            h.f.b.l.a("mTextViewTimeStart");
        }
        if (z2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
        TextView textView2 = this.f97783d;
        if (textView2 == null) {
            h.f.b.l.a("mTextViewTotalTime");
        }
        if (z2) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        textView2.setVisibility(i4);
        com.ss.android.ugc.aweme.shortvideo.cutmusic.b bVar = this.f97784e;
        if (bVar == null) {
            h.f.b.l.a("cutMusicLayout");
        }
        if (z2) {
            i5 = 8;
        } else {
            i5 = 0;
        }
        bVar.setVisibility(i5);
        ImageView imageView = this.f97780a;
        if (imageView == null) {
            h.f.b.l.a("mSlide");
        }
        if (!z2) {
            i7 = 8;
        }
        imageView.setVisibility(i7);
        if (this.f97784e == null) {
            h.f.b.l.a("cutMusicLayout");
        }
        d();
        if (this.f97787h == null) {
            h.f.b.l.a("mModel");
        }
        TextView textView3 = this.E;
        if (textView3 == null) {
            h.f.b.l.a("mCutMusicTips");
        }
        int d2 = d();
        VideoPublishEditModel videoPublishEditModel = this.f97787h;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("mModel");
        }
        if (d2 > videoPublishEditModel.mCurMusicLength + 1000) {
            i6 = R.string.a9x;
        } else {
            i6 = R.string.bdh;
        }
        textView3.setText(c_(i6));
        com.ss.android.ugc.aweme.utils.d.a("tool_performance_show_music_wave", new com.ss.android.ugc.tools.f.b().a("scene", "EditMusicCutScene").a("status", !z2 ? 1 : 0).f149193a);
    }

    public final void a(boolean z2) {
        if (z2) {
            View view = this.H;
            if (view == null) {
                h.f.b.l.a("mDragLayout");
            }
            if (view.getVisibility() != 0) {
                View view2 = this.H;
                if (view2 == null) {
                    h.f.b.l.a("mDragLayout");
                }
                view2.setVisibility(0);
                View view3 = this.H;
                if (view3 == null) {
                    h.f.b.l.a("mDragLayout");
                }
                view3.setAlpha(0.0f);
                View view4 = this.H;
                if (view4 == null) {
                    h.f.b.l.a("mDragLayout");
                }
                view4.animate().alpha(1.0f).setDuration(200).start();
                this.w.post(this.N);
                return;
            }
            return;
        }
        View view5 = this.H;
        if (view5 == null) {
            h.f.b.l.a("mDragLayout");
        }
        if (view5.getVisibility() != 4) {
            View view6 = this.H;
            if (view6 == null) {
                h.f.b.l.a("mDragLayout");
            }
            view6.setVisibility(4);
            this.w.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0299, code lost:
        if (r1 == null) goto L_0x029b;
     */
    @Override // com.bytedance.scene.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.os.Bundle r9) {
        /*
        // Method dump skipped, instructions count: 718
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.cutmusic.c.a(android.os.Bundle):void");
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
        View a2 = com.a.a(layoutInflater, R.layout.ats, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) a2;
        this.G = frameLayout;
        if (frameLayout == null) {
            h.f.b.l.a("mParentLayout");
        }
        return frameLayout;
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        MethodCollector.i(4827);
        h.f.b.l.d(view, "");
        super.a(view, bundle);
        LayoutInflater from = LayoutInflater.from(this.f42913m);
        FrameLayout frameLayout = this.G;
        if (frameLayout == null) {
            h.f.b.l.a("mParentLayout");
        }
        View a2 = com.a.a(from, R.layout.aep, frameLayout, false);
        h.f.b.l.b(a2, "");
        this.H = a2;
        FrameLayout frameLayout2 = this.G;
        if (frameLayout2 == null) {
            h.f.b.l.a("mParentLayout");
        }
        View view2 = this.H;
        if (view2 == null) {
            h.f.b.l.a("mDragLayout");
        }
        frameLayout2.addView(view2);
        MethodCollector.o(4827);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        h.f.b.l.d(view, "");
        h.f.b.l.d(motionEvent, "");
        int action = motionEvent.getAction();
        if (action != 0) {
            int i2 = 0;
            if (action == 1) {
                ImageView imageView = this.f97780a;
                if (imageView == null) {
                    h.f.b.l.a("mSlide");
                }
                float x2 = imageView.getX();
                KTVView kTVView = this.f97781b;
                if (kTVView == null) {
                    h.f.b.l.a("mKTVView");
                }
                float x3 = x2 - kTVView.getX();
                ImageView imageView2 = this.f97780a;
                if (imageView2 == null) {
                    h.f.b.l.a("mSlide");
                }
                int width = (int) (x3 + ((float) (imageView2.getWidth() / 2)));
                if (width >= 0) {
                    i2 = width;
                }
                double d2 = (double) i2;
                Double.isNaN(d2);
                double d3 = d2 * 1.0d;
                KTVView kTVView2 = this.f97781b;
                if (kTVView2 == null) {
                    h.f.b.l.a("mKTVView");
                }
                double width2 = (double) kTVView2.getWidth();
                Double.isNaN(width2);
                double d4 = d3 / width2;
                double d5 = (double) this.u;
                Double.isNaN(d5);
                this.f97789j = (int) (d4 * d5);
                d dVar = this.y;
                if (dVar != null) {
                    dVar.a();
                }
            } else if (action == 2) {
                float rawX = this.J + (motionEvent.getRawX() - this.I);
                KTVView kTVView3 = this.f97781b;
                if (kTVView3 == null) {
                    h.f.b.l.a("mKTVView");
                }
                float x4 = kTVView3.getX();
                ImageView imageView3 = this.f97780a;
                if (imageView3 == null) {
                    h.f.b.l.a("mSlide");
                }
                if (rawX < x4 - ((float) (imageView3.getWidth() / 2))) {
                    KTVView kTVView4 = this.f97781b;
                    if (kTVView4 == null) {
                        h.f.b.l.a("mKTVView");
                    }
                    float x5 = kTVView4.getX();
                    ImageView imageView4 = this.f97780a;
                    if (imageView4 == null) {
                        h.f.b.l.a("mSlide");
                    }
                    rawX = x5 - ((float) (imageView4.getWidth() / 2));
                }
                KTVView kTVView5 = this.f97781b;
                if (kTVView5 == null) {
                    h.f.b.l.a("mKTVView");
                }
                float x6 = rawX - kTVView5.getX();
                ImageView imageView5 = this.f97780a;
                if (imageView5 == null) {
                    h.f.b.l.a("mSlide");
                }
                float width3 = x6 + ((float) (imageView5.getWidth() / 2));
                KTVView kTVView6 = this.f97781b;
                if (kTVView6 == null) {
                    h.f.b.l.a("mKTVView");
                }
                if (width3 >= ((float) (kTVView6.getWidth() - E()))) {
                    KTVView kTVView7 = this.f97781b;
                    if (kTVView7 == null) {
                        h.f.b.l.a("mKTVView");
                    }
                    float x7 = kTVView7.getX();
                    ImageView imageView6 = this.f97780a;
                    if (imageView6 == null) {
                        h.f.b.l.a("mSlide");
                    }
                    float width4 = x7 - ((float) (imageView6.getWidth() / 2));
                    KTVView kTVView8 = this.f97781b;
                    if (kTVView8 == null) {
                        h.f.b.l.a("mKTVView");
                    }
                    rawX = (width4 + ((float) kTVView8.getWidth())) - ((float) E());
                }
                if (rawX < 0.0f) {
                    rawX = 0.0f;
                }
                ImageView imageView7 = this.f97780a;
                if (imageView7 == null) {
                    h.f.b.l.a("mSlide");
                }
                imageView7.animate().x(rawX).setDuration(0).start();
                ImageView imageView8 = this.f97780a;
                if (imageView8 == null) {
                    h.f.b.l.a("mSlide");
                }
                float x8 = imageView8.getX();
                ImageView imageView9 = this.f97780a;
                if (imageView9 == null) {
                    h.f.b.l.a("mSlide");
                }
                float width5 = x8 + ((float) (imageView9.getWidth() / 2));
                KTVView kTVView9 = this.f97781b;
                if (kTVView9 == null) {
                    h.f.b.l.a("mKTVView");
                }
                int x9 = (int) (width5 - kTVView9.getX());
                KTVView kTVView10 = this.f97781b;
                if (kTVView10 == null) {
                    h.f.b.l.a("mKTVView");
                }
                kTVView10.setStart(x9);
                KTVView kTVView11 = this.f97781b;
                if (kTVView11 == null) {
                    h.f.b.l.a("mKTVView");
                }
                kTVView11.setLength(C());
                TextView textView = this.f97782c;
                if (textView == null) {
                    h.f.b.l.a("mTextViewTimeStart");
                }
                ImageView imageView10 = this.f97780a;
                if (imageView10 == null) {
                    h.f.b.l.a("mSlide");
                }
                double x10 = (double) imageView10.getX();
                Double.isNaN(x10);
                double d6 = 1.0d * x10;
                KTVView kTVView12 = this.f97781b;
                if (kTVView12 == null) {
                    h.f.b.l.a("mKTVView");
                }
                double x11 = (double) kTVView12.getX();
                Double.isNaN(x11);
                double d7 = d6 - x11;
                ImageView imageView11 = this.f97780a;
                if (imageView11 == null) {
                    h.f.b.l.a("mSlide");
                }
                double width6 = (double) (imageView11.getWidth() / 2);
                Double.isNaN(width6);
                double d8 = d7 + width6;
                KTVView kTVView13 = this.f97781b;
                if (kTVView13 == null) {
                    h.f.b.l.a("mKTVView");
                }
                double width7 = (double) kTVView13.getWidth();
                Double.isNaN(width7);
                double d9 = d8 / width7;
                int i3 = this.u;
                double d10 = (double) i3;
                Double.isNaN(d10);
                int i4 = (int) (d9 * d10);
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i4 <= i3) {
                    i2 = i4;
                }
                textView.setText(r.a(i2));
            }
        } else {
            this.I = motionEvent.getRawX();
            ImageView imageView12 = this.f97780a;
            if (imageView12 == null) {
                h.f.b.l.a("mSlide");
            }
            this.J = imageView12.getX();
        }
        return true;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    static final class n extends h.f.b.m implements q<com.bytedance.jedi.arch.i, Integer, u<? extends com.ss.android.ugc.aweme.shortvideo.d, ? extends Integer, ? extends Integer>, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62153);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(c cVar) {
            super(3);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Integer num, u<? extends com.ss.android.ugc.aweme.shortvideo.d, ? extends Integer, ? extends Integer> uVar) {
            Integer num2 = num;
            u<? extends com.ss.android.ugc.aweme.shortvideo.d, ? extends Integer, ? extends Integer> uVar2 = uVar;
            h.f.b.l.d(iVar, "");
            if (num2 != null) {
                int intValue = num2.intValue();
                c cVar = this.this$0;
                cVar.f97788i = intValue;
                com.ss.android.ugc.aweme.shortvideo.cutmusic.k.f126400f.f126407e = cVar.f97788i;
            }
            if (uVar2 != null) {
                this.this$0.a((com.ss.android.ugc.aweme.shortvideo.d) uVar2.getFirst(), ((Number) uVar2.getSecond()).intValue(), ((Number) uVar2.getThird()).intValue());
                this.this$0.f97789j = ((Number) uVar2.getThird()).intValue();
                c cVar2 = this.this$0;
                cVar2.f97790k = cVar2.f97789j;
                this.this$0.a().mMusicStart = this.this$0.f97789j;
                this.this$0.f97791l = false;
                c cVar3 = this.this$0;
                cVar3.t = cVar3.f97791l;
                this.this$0.a().isSoundLoop = Boolean.valueOf(this.this$0.f97791l);
                d dVar = this.this$0.y;
                if (dVar != null) {
                    dVar.a();
                }
            }
            return z.f158842a;
        }
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.d dVar, int i2, int i3) {
        bj.a("SoundLoop, EditMusicCutScene.updateMusicWaveData musicLength = " + i2 + " videoLength = " + this.f97788i);
        this.v = i2;
        b(true);
        if (dVar == null || !k.b.a(dVar.getMusicWavePointArray())) {
            b(true);
            return;
        }
        com.ss.android.ugc.aweme.shortvideo.cutmusic.k.b(dVar);
        com.ss.android.ugc.aweme.shortvideo.cutmusic.k.f126400f.a(dVar, (long) this.f97788i, (long) i2);
        b(false);
        if (i3 == 0) {
            com.ss.android.ugc.aweme.shortvideo.cutmusic.b bVar = this.f97784e;
            if (bVar == null) {
                h.f.b.l.a("cutMusicLayout");
            }
            bVar.a();
        } else {
            com.ss.android.ugc.aweme.shortvideo.cutmusic.b bVar2 = this.f97784e;
            if (bVar2 == null) {
                h.f.b.l.a("cutMusicLayout");
            }
            bVar2.a((((float) i3) * 1.0f) / ((float) i2));
            com.ss.android.ugc.aweme.shortvideo.cutmusic.b bVar3 = this.f97784e;
            if (bVar3 == null) {
                h.f.b.l.a("cutMusicLayout");
            }
            bVar3.setTimeBubble(i3);
        }
        com.ss.android.ugc.aweme.shortvideo.cutmusic.b bVar4 = this.f97784e;
        if (bVar4 == null) {
            h.f.b.l.a("cutMusicLayout");
        }
        bVar4.setOnScreenMaxWavePointCount(com.ss.android.ugc.aweme.shortvideo.cutmusic.k.f126400f.a((long) this.f97788i));
        com.ss.android.ugc.aweme.shortvideo.cutmusic.b bVar5 = this.f97784e;
        if (bVar5 == null) {
            h.f.b.l.a("cutMusicLayout");
        }
        bVar5.setAudioWaveViewData(dVar);
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
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
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
