package com.ss.android.ugc.aweme.shortvideo.subtitle;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.property.ag;
import com.ss.android.ugc.aweme.property.av;
import com.ss.android.ugc.aweme.property.dg;
import com.ss.android.ugc.aweme.property.ef;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.shortvideo.subtitle.t;
import com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRecycleView;
import com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.ss.android.ugc.gamora.editor.subtitle.EditSubtitleViewModel;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.x;
import com.zhiliaoapp.musically.R;
import dmt.av.video.u;
import h.f.b.z;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class EditCaptionScene extends com.bytedance.scene.j implements com.bytedance.o.a, k, o {
    public static final c T = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f130853a = {new h.f.b.y(EditCaptionScene.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};
    public RelativeLayout A;
    public FrameLayout B;
    public TextView C;
    public TextView D;
    public LinearLayout E;
    public DmtStatusView F;
    public LinearLayout G;
    public AVDmtPanelRecycleView H;
    public View I;
    public ImageView J;
    public ImageView K;
    public TextView L;
    public TextView M;
    public ImageView N;
    public View O;
    public View P;
    public TuxTextView Q;
    final h.h R = h.i.a((h.f.a.a) new p(this));
    final ValueAnimator S;
    private long U;
    private com.ss.android.vesdk.x V;
    private long W;
    private volatile long X;
    private final h.h Y = h.i.a((h.f.a.a) new r(this));
    private com.ss.android.ugc.aweme.views.d Z;
    private View aa;
    private View ab;
    private final h.h ac = h.i.a(h.m.NONE, new a(this));
    private final h.h.d ad = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);
    private EditStickerViewModel ae;
    private int af;
    private final h.h ag = h.i.a((h.f.a.a) new s(this));
    private List<com.ss.android.ugc.aweme.sticker.data.h> ah;
    private String ai;
    private com.ss.android.ugc.aweme.shortvideo.s.a aj;
    private long ak;
    private com.ss.android.ugc.tools.view.a.c al;
    private final com.ss.android.ugc.tools.view.a.a am = new q(this);
    private final h.h an = h.i.a((h.f.a.a) new h(this));
    private com.ss.android.ugc.aweme.sticker.data.c ao;
    private final com.bytedance.o.f ap;

    /* renamed from: b  reason: collision with root package name */
    public h f130854b;

    /* renamed from: c  reason: collision with root package name */
    public final long f130855c = dg.a();

    /* renamed from: d  reason: collision with root package name */
    public float f130856d = 0.004f;

    /* renamed from: e  reason: collision with root package name */
    g f130857e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f130858f;

    /* renamed from: g  reason: collision with root package name */
    public HighLightLayoutManager f130859g;

    /* renamed from: h  reason: collision with root package name */
    public t f130860h;

    /* renamed from: i  reason: collision with root package name */
    public androidx.fragment.app.e f130861i;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.asve.editor.g f130862j;

    /* renamed from: k  reason: collision with root package name */
    public ViewGroup f130863k;

    /* renamed from: l  reason: collision with root package name */
    public com.ss.android.ugc.aweme.effect.a f130864l;
    public androidx.lifecycle.t<dmt.av.video.t> t;
    public SafeHandler u;
    public SafeHandler v;
    ArrayList<com.ss.android.ugc.aweme.sticker.data.h> w = new ArrayList<>();
    public ArrayList<com.ss.android.ugc.aweme.sticker.data.h> x;
    public boolean y;
    String z;

    static final class z<T> implements androidx.core.g.a {

        /* renamed from: a  reason: collision with root package name */
        public static final z f130902a = new z();

        static {
            Covode.recordClassIndex(85802);
        }

        z() {
        }

        @Override // androidx.core.g.a
        public final /* bridge */ /* synthetic */ void a(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(85765);
    }

    private final com.ss.android.ugc.aweme.shortvideo.preview.a N() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.ac.getValue();
    }

    public final EditSubtitleViewModel C() {
        return (EditSubtitleViewModel) this.an.getValue();
    }

    public final d a() {
        return (d) this.Y.getValue();
    }

    public final VideoPublishEditModel b() {
        return (VideoPublishEditModel) this.ad.a(this, f130853a[0]);
    }

    public final e d() {
        return (e) this.ag.getValue();
    }

    public static final class c {
        static {
            Covode.recordClassIndex(85776);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    public static final class i implements com.ss.android.ugc.aweme.effect.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditCaptionScene f130885a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f130886b;

        static {
            Covode.recordClassIndex(85782);
        }

        @Override // com.ss.android.ugc.aweme.effect.a
        public final long d() {
            return 0;
        }

        @Override // com.ss.android.ugc.aweme.effect.a
        public final boolean c() {
            return this.f130886b;
        }

        @Override // com.ss.android.ugc.aweme.effect.a
        public final long a() {
            long j2;
            com.ss.android.ugc.asve.editor.g gVar = this.f130885a.f130862j;
            if (gVar != null) {
                j2 = (long) gVar.k();
            } else {
                j2 = 0;
            }
            return a(j2);
        }

        @Override // com.ss.android.ugc.aweme.effect.a
        public final boolean b() {
            Integer num;
            long a2 = a();
            if (!this.f130886b) {
                com.ss.android.ugc.asve.editor.g gVar = this.f130885a.f130862j;
                if (gVar != null) {
                    num = Integer.valueOf(gVar.j());
                }
                return false;
            }
            num = 0;
            if (num == null || a2 != ((long) num.intValue())) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(EditCaptionScene editCaptionScene) {
            this.f130885a = editCaptionScene;
        }

        @Override // com.ss.android.ugc.aweme.effect.a
        public final void a(boolean z) {
            this.f130886b = z;
            com.ss.android.ugc.asve.editor.g gVar = this.f130885a.f130862j;
            if (gVar != null) {
                gVar.c(z);
            }
        }

        @Override // com.ss.android.ugc.aweme.effect.a
        public final long a(long j2) {
            if (!this.f130886b) {
                return j2;
            }
            com.ss.android.ugc.asve.editor.g gVar = this.f130885a.f130862j;
            if (gVar != null) {
                return ((long) gVar.j()) - j2;
            }
            return 0;
        }
    }

    @Override // com.bytedance.o.a
    public com.bytedance.o.f getDiContainer() {
        return this.ap;
    }

    static final class r extends h.f.b.m implements h.f.a.a<d> {
        final /* synthetic */ EditCaptionScene this$0;

        static {
            Covode.recordClassIndex(85791);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(EditCaptionScene editCaptionScene) {
            super(0);
            this.this$0 = editCaptionScene;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return new d();
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<e> {
        final /* synthetic */ EditCaptionScene this$0;

        static {
            Covode.recordClassIndex(85792);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(EditCaptionScene editCaptionScene) {
            super(0);
            this.this$0 = editCaptionScene;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            return new e();
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(85768);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene.a.invoke():com.bytedance.als.b");
        }
    }

    public final AVDmtPanelRecycleView D() {
        AVDmtPanelRecycleView aVDmtPanelRecycleView = this.H;
        if (aVDmtPanelRecycleView == null) {
            h.f.b.l.a("mRecyclerView");
        }
        return aVDmtPanelRecycleView;
    }

    public static final class t implements com.ss.android.vesdk.r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditCaptionScene f130896a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f130897b;

        static {
            Covode.recordClassIndex(85793);
        }

        static final class a implements VEListener.s {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ t f130898a;

            static {
                Covode.recordClassIndex(85794);
            }

            a(t tVar) {
                this.f130898a = tVar;
            }

            @Override // com.ss.android.vesdk.VEListener.s
            public final void a() {
                if (ag.a() && this.f130898a.f130896a.y) {
                    this.f130898a.f130896a.I();
                }
            }
        }

        t(EditCaptionScene editCaptionScene, int i2) {
            this.f130896a = editCaptionScene;
            this.f130897b = i2;
        }

        @Override // com.ss.android.vesdk.r
        public final void onCallback(int i2, int i3, float f2, String str) {
            if (i2 == 4116) {
                com.ss.android.ugc.aweme.df.e.a("receive prepare done event in backToPlayLayout");
                com.ss.android.ugc.asve.editor.g gVar = this.f130896a.f130862j;
                if (gVar != null) {
                    gVar.a(this.f130897b, x.f.EDITOR_SEEK_FLAG_LastSeek, new a(this));
                }
                com.ss.android.ugc.asve.editor.g gVar2 = this.f130896a.f130862j;
                if (gVar2 != null) {
                    gVar2.w();
                }
                com.ss.android.ugc.asve.editor.g gVar3 = this.f130896a.f130862j;
                if (gVar3 != null) {
                    gVar3.d(this);
                }
            }
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<EditSubtitleViewModel> {
        final /* synthetic */ EditCaptionScene this$0;

        static {
            Covode.recordClassIndex(85781);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(EditCaptionScene editCaptionScene) {
            super(0);
            this.this$0 = editCaptionScene;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditSubtitleViewModel invoke() {
            Activity activity = this.this$0.f42913m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            JediViewModel a2 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity).a(EditSubtitleViewModel.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<EditToolbarViewModel> {
        final /* synthetic */ EditCaptionScene this$0;

        static {
            Covode.recordClassIndex(85789);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(EditCaptionScene editCaptionScene) {
            super(0);
            this.this$0 = editCaptionScene;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditToolbarViewModel invoke() {
            Activity activity = this.this$0.f42913m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity).a(EditToolbarViewModel.class);
        }
    }

    private final int O() {
        androidx.fragment.app.e eVar = this.f130861i;
        if (eVar == null) {
            h.f.b.l.a("mActivity");
        }
        return (int) com.bytedance.common.utility.n.b(eVar, 52.0f);
    }

    private final int P() {
        androidx.fragment.app.e eVar = this.f130861i;
        if (eVar == null) {
            h.f.b.l.a("mActivity");
        }
        return (int) com.bytedance.common.utility.n.b(eVar, 282.0f);
    }

    public final void I() {
        androidx.lifecycle.t<dmt.av.video.t> tVar = this.t;
        if (tVar == null) {
            h.f.b.l.a("mPreviewControlOpLiveData");
        }
        tVar.setValue(dmt.av.video.t.a());
        View view = this.O;
        if (view == null) {
            h.f.b.l.a("mIvPlay");
        }
        view.setVisibility(8);
    }

    public final void J() {
        androidx.lifecycle.t<dmt.av.video.t> tVar = this.t;
        if (tVar == null) {
            h.f.b.l.a("mPreviewControlOpLiveData");
        }
        tVar.setValue(dmt.av.video.t.b());
        View view = this.O;
        if (view == null) {
            h.f.b.l.a("mIvPlay");
        }
        view.setVisibility(0);
    }

    @Override // com.bytedance.scene.j
    public final void o() {
        super.o();
        a aVar = C().f146931c;
        if (aVar != null) {
            aVar.g();
            aVar.h();
        }
    }

    public final class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private int f130883b;

        /* renamed from: c  reason: collision with root package name */
        private final String[] f130884c;

        static {
            Covode.recordClassIndex(85780);
        }

        public final void run() {
            TextView textView = EditCaptionScene.this.M;
            if (textView == null) {
                h.f.b.l.a("mLoadingHint");
            }
            String[] strArr = this.f130884c;
            int i2 = this.f130883b;
            this.f130883b = i2 + 1;
            textView.setText(strArr[i2]);
            this.f130883b %= 3;
            EditCaptionScene.a(EditCaptionScene.this).postDelayed(this, 5000);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public g() {
            com.ss.android.ugc.aweme.language.b currentI18nItem = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getCurrentI18nItem(EditCaptionScene.this.q());
            h.f.b.l.b(currentI18nItem, "");
            this.f130884c = new String[]{EditCaptionScene.this.a(R.string.xp, currentI18nItem.e()), EditCaptionScene.this.c_(R.string.xq), EditCaptionScene.this.c_(R.string.xr)};
        }
    }

    private final int Q() {
        androidx.fragment.app.e eVar = this.f130861i;
        if (eVar == null) {
            h.f.b.l.a("mActivity");
        }
        int e2 = (dh.e(eVar) - O()) - P();
        androidx.fragment.app.e eVar2 = this.f130861i;
        if (eVar2 == null) {
            h.f.b.l.a("mActivity");
        }
        int c2 = e2 - dh.c(eVar2);
        androidx.fragment.app.e eVar3 = this.f130861i;
        if (eVar3 == null) {
            h.f.b.l.a("mActivity");
        }
        return c2 - dh.d(eVar3);
    }

    private final void R() {
        SafeHandler safeHandler = this.u;
        if (safeHandler == null) {
            h.f.b.l.a("mSafeHandler");
        }
        safeHandler.removeCallbacksAndMessages(null);
        this.S.cancel();
        this.f130857e = null;
        SafeHandler safeHandler2 = this.v;
        if (safeHandler2 == null) {
            h.f.b.l.a("mTipsHandler");
        }
        safeHandler2.removeCallbacksAndMessages(null);
        DmtStatusView dmtStatusView = this.F;
        if (dmtStatusView == null) {
            h.f.b.l.a("mLoadingStatusView");
        }
        dmtStatusView.d();
        LinearLayout linearLayout = this.E;
        if (linearLayout == null) {
            h.f.b.l.a("mLoadingArea");
        }
        linearLayout.setVisibility(8);
    }

    public final boolean G() {
        String text;
        t tVar = this.f130860h;
        if (tVar == null) {
            h.f.b.l.a("mSubtitleAdapter");
        }
        if (tVar == null) {
            return false;
        }
        t tVar2 = this.f130860h;
        if (tVar2 == null) {
            h.f.b.l.a("mSubtitleAdapter");
        }
        int i2 = tVar2.f131007a;
        int i3 = -1;
        if (i2 == -1) {
            return false;
        }
        t tVar3 = this.f130860h;
        if (tVar3 == null) {
            h.f.b.l.a("mSubtitleAdapter");
        }
        com.ss.android.ugc.aweme.sticker.data.h hVar = (com.ss.android.ugc.aweme.sticker.data.h) h.a.n.b((List) tVar3.f131013g, i2);
        if (!(hVar == null || (text = hVar.getText()) == null)) {
            i3 = text.length();
        }
        a(i2, i3, "click_adjust_icon");
        return true;
    }

    public final class e implements Runnable {
        static {
            Covode.recordClassIndex(85778);
        }

        public final void run() {
            EditCaptionScene editCaptionScene;
            int K;
            if (EditCaptionScene.this.D().getAdapter() != null && (K = (editCaptionScene = EditCaptionScene.this).K()) >= 0) {
                t tVar = editCaptionScene.f130860h;
                if (tVar == null) {
                    h.f.b.l.a("mSubtitleAdapter");
                }
                if (tVar.f131007a != K) {
                    if (K == 0) {
                        editCaptionScene.f130856d = 0.004f;
                    } else {
                        editCaptionScene.f130856d = 400.0f;
                    }
                    t tVar2 = editCaptionScene.f130860h;
                    if (tVar2 == null) {
                        h.f.b.l.a("mSubtitleAdapter");
                    }
                    if (!TextUtils.isEmpty(tVar2.f131013g.get(K).getText()) || K == 0) {
                        HighLightLayoutManager highLightLayoutManager = editCaptionScene.f130859g;
                        if (highLightLayoutManager == null) {
                            h.f.b.l.a("mHighLightLayoutManager");
                        }
                        AVDmtPanelRecycleView aVDmtPanelRecycleView = editCaptionScene.H;
                        if (aVDmtPanelRecycleView == null) {
                            h.f.b.l.a("mRecyclerView");
                        }
                        highLightLayoutManager.a(aVDmtPanelRecycleView, new RecyclerView.s(), K);
                        t tVar3 = editCaptionScene.f130860h;
                        if (tVar3 == null) {
                            h.f.b.l.a("mSubtitleAdapter");
                        }
                        tVar3.a(K);
                    }
                }
            }
            EditCaptionScene.b(EditCaptionScene.this).post(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public e() {
        }
    }

    /* access modifiers changed from: package-private */
    public final void E() {
        if (!(!this.w.equals(this.ah))) {
            H();
        } else if (ef.a()) {
            androidx.fragment.app.e eVar = this.f130861i;
            if (eVar == null) {
                h.f.b.l.a("mActivity");
            }
            com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(eVar).b(R.string.xt), new v(this)).a().b().show();
        } else {
            androidx.fragment.app.e eVar2 = this.f130861i;
            if (eVar2 == null) {
                h.f.b.l.a("mActivity");
            }
            new a.C0731a(eVar2).b(R.string.xt).b(R.string.a9e, (DialogInterface.OnClickListener) null, false).a(R.string.x9, (DialogInterface.OnClickListener) new w(this), false).a().b().show();
        }
    }

    public final void F() {
        if (ef.a()) {
            androidx.fragment.app.e eVar = this.f130861i;
            if (eVar == null) {
                h.f.b.l.a("mActivity");
            }
            com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(eVar).a(R.string.f7u).b(R.string.f7s), new x(this)).a().b().show();
            return;
        }
        androidx.fragment.app.e eVar2 = this.f130861i;
        if (eVar2 == null) {
            h.f.b.l.a("mActivity");
        }
        new a.C0731a(eVar2).b(R.string.xk).b(R.string.ym, (DialogInterface.OnClickListener) new y(this), false).a(R.string.xm, (DialogInterface.OnClickListener) null, false).a().b().show();
    }

    public final void H() {
        a aVar = C().f146931c;
        if (aVar != null) {
            aVar.g();
        }
        SafeHandler safeHandler = this.u;
        if (safeHandler == null) {
            h.f.b.l.a("mSafeHandler");
        }
        safeHandler.removeCallbacksAndMessages(null);
        this.S.cancel();
        this.f130857e = null;
        SafeHandler safeHandler2 = this.v;
        if (safeHandler2 == null) {
            h.f.b.l.a("mTipsHandler");
        }
        safeHandler2.removeCallbacksAndMessages(null);
        C().a(false);
        if (b().captionStruct == null) {
            C().a((List<com.ss.android.ugc.aweme.sticker.data.h>) null);
        } else {
            C().a(b().captionStruct.getUtterances());
        }
        com.ss.android.vesdk.x xVar = this.V;
        if (xVar != null) {
            xVar.j();
        }
        this.V = null;
    }

    /* access modifiers changed from: package-private */
    public final int K() {
        long j2 = this.ak;
        com.ss.android.ugc.aweme.effect.a aVar = this.f130864l;
        if (aVar == null) {
            h.f.b.l.a("mCurrentPositionSource");
        }
        if (j2 == aVar.a()) {
            return -1;
        }
        com.ss.android.ugc.aweme.effect.a aVar2 = this.f130864l;
        if (aVar2 == null) {
            h.f.b.l.a("mCurrentPositionSource");
        }
        this.ak = aVar2.a();
        AVDmtPanelRecycleView aVDmtPanelRecycleView = this.H;
        if (aVDmtPanelRecycleView == null) {
            h.f.b.l.a("mRecyclerView");
        }
        if (aVDmtPanelRecycleView.getAdapter() == null) {
            return -1;
        }
        t tVar = this.f130860h;
        if (tVar == null) {
            h.f.b.l.a("mSubtitleAdapter");
        }
        ArrayList<com.ss.android.ugc.aweme.sticker.data.h> arrayList = tVar.f131013g;
        Iterator<com.ss.android.ugc.aweme.sticker.data.h> it = arrayList.iterator();
        while (it.hasNext()) {
            com.ss.android.ugc.aweme.sticker.data.h next = it.next();
            if (((int) next.getStartTime()) != 0 || ((int) next.getEndTime()) != this.af) {
                long startTime = next.getStartTime();
                long j3 = this.ak;
                if (startTime <= j3 && j3 < next.getEndTime()) {
                    return arrayList.indexOf(next);
                }
            }
        }
        return arrayList.size() - 1;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.subtitle.k
    public final void L() {
        R();
        FrameLayout frameLayout = this.B;
        if (frameLayout == null) {
            h.f.b.l.a("mContentLayout");
        }
        LinearLayout linearLayout = this.E;
        if (linearLayout == null) {
            h.f.b.l.a("mLoadingArea");
        }
        View view = this.aa;
        if (view == null) {
            h.f.b.l.a("mRetryView");
        }
        v vVar = new v(frameLayout, linearLayout, view);
        View view2 = this.aa;
        if (view2 == null) {
            h.f.b.l.a("mRetryView");
        }
        ((TextView) view2.findViewById(R.id.eea)).setOnClickListener(new ad(this, vVar));
        View view3 = this.aa;
        if (view3 == null) {
            h.f.b.l.a("mRetryView");
        }
        view3.findViewById(R.id.zi).setOnClickListener(new ae(this, vVar));
        vVar.c(new com.ss.android.ugc.aweme.da.b());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.subtitle.k
    public final void M() {
        R();
        SafeHandler safeHandler = this.u;
        if (safeHandler == null) {
            h.f.b.l.a("mSafeHandler");
        }
        safeHandler.removeCallbacksAndMessages(null);
        FrameLayout frameLayout = this.B;
        if (frameLayout == null) {
            h.f.b.l.a("mContentLayout");
        }
        LinearLayout linearLayout = this.E;
        if (linearLayout == null) {
            h.f.b.l.a("mLoadingArea");
        }
        View view = this.ab;
        if (view == null) {
            h.f.b.l.a("mExitView");
        }
        v vVar = new v(frameLayout, linearLayout, view);
        View view2 = this.ab;
        if (view2 == null) {
            h.f.b.l.a("mExitView");
        }
        view2.findViewById(R.id.a1p).setOnClickListener(new ab(this, vVar));
        vVar.c(new com.ss.android.ugc.aweme.da.b());
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        SafeHandler safeHandler = this.u;
        if (safeHandler == null) {
            h.f.b.l.a("mSafeHandler");
        }
        safeHandler.removeCallbacksAndMessages(null);
        this.S.cancel();
        this.f130857e = null;
        SafeHandler safeHandler2 = this.v;
        if (safeHandler2 == null) {
            h.f.b.l.a("mTipsHandler");
        }
        safeHandler2.removeCallbacksAndMessages(null);
        if (this.aj != null) {
            androidx.fragment.app.e eVar = this.f130861i;
            if (eVar == null) {
                h.f.b.l.a("mActivity");
            }
            com.ss.android.ugc.aweme.shortvideo.s.b.b(eVar);
            this.aj = null;
        }
        View view = this.O;
        if (view == null) {
            h.f.b.l.a("mIvPlay");
        }
        view.setVisibility(8);
        AVDmtPanelRecycleView aVDmtPanelRecycleView = this.H;
        if (aVDmtPanelRecycleView == null) {
            h.f.b.l.a("mRecyclerView");
        }
        aVDmtPanelRecycleView.i();
    }

    public final class d implements Runnable {
        static {
            Covode.recordClassIndex(85777);
        }

        public final void run() {
            int l2;
            int i2;
            if (!(!EditCaptionScene.this.D().isShown() || EditCaptionScene.this.D().getAdapter() == null || (l2 = EditCaptionScene.c(EditCaptionScene.this).l()) == -1)) {
                if (l2 == 0 || l2 == 1) {
                    View c2 = EditCaptionScene.c(EditCaptionScene.this).c(l2);
                    if (c2 != null) {
                        i2 = c2.getBottom();
                    } else {
                        i2 = 0;
                    }
                    if (i2 < ((int) com.bytedance.common.utility.n.b(EditCaptionScene.d(EditCaptionScene.this), 52.0f))) {
                        l2 = Math.min(l2 + 2, EditCaptionScene.c(EditCaptionScene.this).A() - 1);
                    }
                } else {
                    l2 = Math.min(l2 + 2, EditCaptionScene.c(EditCaptionScene.this).A() - 1);
                }
                if (!TextUtils.isEmpty(EditCaptionScene.e(EditCaptionScene.this).f131013g.get(l2).getText())) {
                    EditCaptionScene.e(EditCaptionScene.this).a(l2);
                }
            }
            EditCaptionScene.b(EditCaptionScene.this).post(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public d() {
        }
    }

    public final class HighLightLayoutManager extends LinearLayoutManager {
        static {
            Covode.recordClassIndex(85766);
        }

        public final class a extends androidx.recyclerview.widget.r {
            static {
                Covode.recordClassIndex(85767);
            }

            @Override // androidx.recyclerview.widget.r
            public final int c() {
                return -1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.r
            public final PointF c(int i2) {
                return HighLightLayoutManager.this.d(i2);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
                if (r0 == null) goto L_0x0010;
             */
            @Override // androidx.recyclerview.widget.r
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final float a(android.util.DisplayMetrics r3) {
                /*
                    r2 = this;
                    com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene$HighLightLayoutManager r0 = com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene.HighLightLayoutManager.this
                    com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene r0 = com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene.this
                    float r1 = r0.f130856d
                    if (r3 == 0) goto L_0x001a
                    int r0 = r3.densityDpi
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    if (r0 != 0) goto L_0x0013
                L_0x0010:
                    h.f.b.l.b()
                L_0x0013:
                    int r0 = r0.intValue()
                    float r0 = (float) r0
                    float r1 = r1 / r0
                    return r1
                L_0x001a:
                    r0 = 0
                    goto L_0x0010
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene.HighLightLayoutManager.a.a(android.util.DisplayMetrics):float");
            }

            public a(Context context) {
                super(context);
            }

            @Override // androidx.recyclerview.widget.r
            public final int a(int i2, int i3, int i4, int i5, int i6) {
                return (i4 - i2) + ((int) com.bytedance.common.utility.n.b(EditCaptionScene.d(EditCaptionScene.this), 52.0f));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public HighLightLayoutManager() {
            super(1, false);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
        public final void a(RecyclerView recyclerView, RecyclerView.s sVar, int i2) {
            Context context;
            if (recyclerView != null) {
                context = recyclerView.getContext();
            } else {
                context = null;
            }
            a aVar = new a(context);
            aVar.f3862g = i2;
            a(aVar);
        }
    }

    static final class j<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditCaptionScene f130887a;

        static {
            Covode.recordClassIndex(85783);
        }

        j(EditCaptionScene editCaptionScene) {
            this.f130887a = editCaptionScene;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            this.f130887a.x = null;
        }
    }

    static final class k<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditCaptionScene f130888a;

        static {
            Covode.recordClassIndex(85784);
        }

        k(EditCaptionScene editCaptionScene) {
            this.f130888a = editCaptionScene;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f130888a.G();
        }
    }

    public static final class m extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditCaptionScene f130890a;

        static {
            Covode.recordClassIndex(85786);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(EditCaptionScene editCaptionScene) {
            this.f130890a = editCaptionScene;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            String str;
            String str2 = "";
            h.f.b.l.d(view, str2);
            EditCaptionScene editCaptionScene = this.f130890a;
            TextView textView = editCaptionScene.C;
            if (textView == null) {
                h.f.b.l.a("mCancelView");
            }
            if (h.f.b.l.a(view, textView)) {
                editCaptionScene.E();
                return;
            }
            TextView textView2 = editCaptionScene.D;
            if (textView2 == null) {
                h.f.b.l.a("mSaveView");
            }
            if (h.f.b.l.a(view, textView2)) {
                SafeHandler safeHandler = editCaptionScene.u;
                if (safeHandler == null) {
                    h.f.b.l.a("mSafeHandler");
                }
                safeHandler.removeCallbacksAndMessages(null);
                editCaptionScene.S.cancel();
                editCaptionScene.f130857e = null;
                SafeHandler safeHandler2 = editCaptionScene.v;
                if (safeHandler2 == null) {
                    h.f.b.l.a("mTipsHandler");
                }
                safeHandler2.removeCallbacksAndMessages(null);
                editCaptionScene.C().a(true);
                VideoPublishEditModel b2 = editCaptionScene.b();
                h.f.b.l.d(b2, str2);
                com.ss.android.ugc.aweme.common.r.a("save_subtitle", bl.d(b2).f149193a);
                if (com.ss.android.ugc.tools.utils.d.a(editCaptionScene.C().f146929a.f6468a.getValue())) {
                    editCaptionScene.b().captionStruct = null;
                    editCaptionScene.C().a((List<com.ss.android.ugc.aweme.sticker.data.h>) null);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                T value = editCaptionScene.C().f146929a.f6468a.getValue();
                if (value == null) {
                    value = (T) h.a.z.INSTANCE;
                }
                arrayList.addAll(value);
                if (editCaptionScene.b().captionStruct == null) {
                    editCaptionScene.b().captionStruct = new com.ss.android.ugc.aweme.sticker.data.d(editCaptionScene.z, arrayList, com.ss.android.ugc.aweme.sticker.data.a.LEFT_BOTTOM.getValue(), null, null, 0, 48, null);
                    com.ss.android.ugc.aweme.sticker.data.d dVar = editCaptionScene.b().captionStruct;
                    if (dVar == null) {
                        h.f.b.l.b();
                    }
                    a aVar = editCaptionScene.C().f146931c;
                    if (!(aVar == null || (str = aVar.f130906d) == null)) {
                        str2 = str;
                    }
                    dVar.setTaskId(str2);
                } else {
                    com.ss.android.ugc.aweme.sticker.data.d dVar2 = editCaptionScene.b().captionStruct;
                    dVar2.setAudioUri(editCaptionScene.z);
                    dVar2.setUtterances(arrayList);
                }
                if (av.a() && (!arrayList.isEmpty())) {
                    ((EditToolbarViewModel) editCaptionScene.R.getValue()).c(true);
                    return;
                }
                return;
            }
            ImageView imageView = editCaptionScene.K;
            if (imageView == null) {
                h.f.b.l.a("mIvDelete");
            }
            if (h.f.b.l.a(view, imageView)) {
                androidx.fragment.app.e eVar = editCaptionScene.f130861i;
                if (eVar == null) {
                    h.f.b.l.a("mActivity");
                }
                new a.C0731a(eVar).b(R.string.x8).b(R.string.a9e, (DialogInterface.OnClickListener) null, false).a(R.string.asg, (DialogInterface.OnClickListener) new u(editCaptionScene), false).a().b().show();
                return;
            }
            ImageView imageView2 = editCaptionScene.N;
            if (imageView2 == null) {
                h.f.b.l.a("mIvEdit");
            }
            if (h.f.b.l.a(view, imageView2)) {
                editCaptionScene.G();
                return;
            }
            View view2 = editCaptionScene.P;
            if (view2 == null) {
                h.f.b.l.a("mFlPlay");
            }
            if (h.f.b.l.a(view, view2)) {
                View view3 = editCaptionScene.O;
                if (view3 == null) {
                    h.f.b.l.a("mIvPlay");
                }
                if (view3.getVisibility() == 0) {
                    editCaptionScene.I();
                } else {
                    editCaptionScene.J();
                }
            }
        }
    }

    public static final class n implements t.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditCaptionScene f130891a;

        static {
            Covode.recordClassIndex(85787);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        n(EditCaptionScene editCaptionScene) {
            this.f130891a = editCaptionScene;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.subtitle.t.a
        public final void a(int i2, int i3) {
            this.f130891a.a(i2, i3, "click_subtitle");
        }
    }

    public static final class o extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        public boolean f130892a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f130893b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ EditCaptionScene f130894c;

        static {
            Covode.recordClassIndex(85788);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        o(EditCaptionScene editCaptionScene) {
            this.f130894c = editCaptionScene;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            h.f.b.l.d(recyclerView, "");
            if (i2 != 0) {
                if (i2 == 1) {
                    if (this.f130894c.f130858f) {
                        this.f130892a = true;
                    }
                    this.f130894c.J();
                    this.f130893b = true;
                    EditCaptionScene.b(this.f130894c).post(this.f130894c.a());
                }
            } else if (this.f130893b) {
                this.f130893b = false;
                EditCaptionScene editCaptionScene = this.f130894c;
                SafeHandler safeHandler = editCaptionScene.u;
                if (safeHandler == null) {
                    h.f.b.l.a("mSafeHandler");
                }
                safeHandler.removeCallbacksAndMessages(editCaptionScene.a());
                int i3 = EditCaptionScene.e(this.f130894c).f131007a;
                if (i3 != -1) {
                    EditCaptionScene.c(this.f130894c).a(this.f130894c.D(), new RecyclerView.s(), i3);
                    androidx.lifecycle.t<dmt.av.video.t> tVar = this.f130894c.t;
                    if (tVar == null) {
                        h.f.b.l.a("mPreviewControlOpLiveData");
                    }
                    com.ss.android.ugc.aweme.effect.a aVar = this.f130894c.f130864l;
                    if (aVar == null) {
                        h.f.b.l.a("mCurrentPositionSource");
                    }
                    tVar.setValue(dmt.av.video.t.b(aVar.a(EditCaptionScene.e(this.f130894c).f131013g.get(i3).getStartTime() + 30)));
                }
                if (this.f130892a) {
                    this.f130892a = false;
                    this.f130894c.I();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ac implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditCaptionScene f130869a;

        static {
            Covode.recordClassIndex(85771);
        }

        ac(EditCaptionScene editCaptionScene) {
            this.f130869a = editCaptionScene;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130869a.F();
        }
    }

    public static final /* synthetic */ SafeHandler a(EditCaptionScene editCaptionScene) {
        SafeHandler safeHandler = editCaptionScene.v;
        if (safeHandler == null) {
            h.f.b.l.a("mTipsHandler");
        }
        return safeHandler;
    }

    public static final /* synthetic */ SafeHandler b(EditCaptionScene editCaptionScene) {
        SafeHandler safeHandler = editCaptionScene.u;
        if (safeHandler == null) {
            h.f.b.l.a("mSafeHandler");
        }
        return safeHandler;
    }

    public static final /* synthetic */ HighLightLayoutManager c(EditCaptionScene editCaptionScene) {
        HighLightLayoutManager highLightLayoutManager = editCaptionScene.f130859g;
        if (highLightLayoutManager == null) {
            h.f.b.l.a("mHighLightLayoutManager");
        }
        return highLightLayoutManager;
    }

    public static final /* synthetic */ androidx.fragment.app.e d(EditCaptionScene editCaptionScene) {
        androidx.fragment.app.e eVar = editCaptionScene.f130861i;
        if (eVar == null) {
            h.f.b.l.a("mActivity");
        }
        return eVar;
    }

    public static final /* synthetic */ t e(EditCaptionScene editCaptionScene) {
        t tVar = editCaptionScene.f130860h;
        if (tVar == null) {
            h.f.b.l.a("mSubtitleAdapter");
        }
        return tVar;
    }

    static final class ab implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditCaptionScene f130867a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f130868b;

        static {
            Covode.recordClassIndex(85770);
        }

        ab(EditCaptionScene editCaptionScene, v vVar) {
            this.f130867a = editCaptionScene;
            this.f130868b = vVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130868b.b(new com.ss.android.ugc.aweme.da.b());
            this.f130867a.H();
        }
    }

    static final class ad implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditCaptionScene f130870a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f130871b;

        static {
            Covode.recordClassIndex(85772);
        }

        ad(EditCaptionScene editCaptionScene, v vVar) {
            this.f130870a = editCaptionScene;
            this.f130871b = vVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130871b.b(new com.ss.android.ugc.aweme.da.b());
            this.f130870a.H();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {
        final /* synthetic */ EditCaptionScene this$0;

        static {
            Covode.recordClassIndex(85796);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(EditCaptionScene editCaptionScene) {
            super(1);
            this.this$0 = editCaptionScene;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.c(R.string.x9, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene.v.AnonymousClass1 */
                final /* synthetic */ v this$0;

                static {
                    Covode.recordClassIndex(85797);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    this.this$0.this$0.H();
                    return h.z.f158842a;
                }
            });
            bVar2.b(R.string.b80, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, h.z>) null);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class x extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {
        final /* synthetic */ EditCaptionScene this$0;

        static {
            Covode.recordClassIndex(85799);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(EditCaptionScene editCaptionScene) {
            super(1);
            this.this$0 = editCaptionScene;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.c(R.string.f7t, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene.x.AnonymousClass1 */
                final /* synthetic */ x this$0;

                static {
                    Covode.recordClassIndex(85800);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    this.this$0.this$0.H();
                    return h.z.f158842a;
                }
            });
            bVar2.b(R.string.f7r, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, h.z>) null);
            return h.z.f158842a;
        }
    }

    static final class ae implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditCaptionScene f130872a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f130873b;

        static {
            Covode.recordClassIndex(85773);
        }

        ae(EditCaptionScene editCaptionScene, v vVar) {
            this.f130872a = editCaptionScene;
            this.f130873b = vVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130873b.b(new com.ss.android.ugc.aweme.da.b());
            this.f130872a.a(true);
            a aVar = this.f130872a.C().f146931c;
            if (aVar != null) {
                aVar.f();
            }
            com.ss.android.ugc.aweme.common.r.a("retry_auto_subtitle", bl.d(this.f130872a.b()).f149193a);
        }
    }

    static final class l<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditCaptionScene f130889a;

        static {
            Covode.recordClassIndex(85785);
        }

        l(EditCaptionScene editCaptionScene) {
            this.f130889a = editCaptionScene;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            dmt.av.video.t tVar = (dmt.av.video.t) obj;
            if (tVar == null) {
                return;
            }
            if (tVar.f156954a == 0) {
                this.f130889a.f130858f = true;
                if (this.f130889a.D().getAdapter() != null) {
                    EditCaptionScene.b(this.f130889a).post(this.f130889a.d());
                    return;
                }
                return;
            }
            this.f130889a.f130858f = false;
            EditCaptionScene.b(this.f130889a).removeCallbacks(this.f130889a.d());
        }
    }

    static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ValueAnimator f130874a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditCaptionScene f130875b;

        static {
            Covode.recordClassIndex(85774);
        }

        b(ValueAnimator valueAnimator, EditCaptionScene editCaptionScene) {
            this.f130874a = valueAnimator;
            this.f130875b = editCaptionScene;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            final z.c cVar = new z.c();
            h.f.b.l.b(valueAnimator, "");
            int animatedFraction = (int) (valueAnimator.getAnimatedFraction() * ((float) this.f130874a.getDuration()));
            if (animatedFraction >= 0 && 6000 >= animatedFraction) {
                cVar.element = animatedFraction / 100;
            } else if (6000 <= animatedFraction && 10000 >= animatedFraction) {
                cVar.element = ((animatedFraction - 6000) / 200) + 60;
            } else {
                cVar.element = ((animatedFraction - 10000) / 300) + 80;
            }
            EditCaptionScene.a(this.f130875b).post(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f130876a;

                static {
                    Covode.recordClassIndex(85775);
                }

                {
                    this.f130876a = r1;
                }

                public final void run() {
                    TextView textView = this.f130876a.f130875b.L;
                    if (textView == null) {
                        h.f.b.l.a("mLoadingProgress");
                    }
                    textView.setText(this.f130876a.f130875b.t().getResources().getString(R.string.xi, Integer.valueOf(cVar.element)));
                }
            });
        }
    }

    public EditCaptionScene(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.ap = fVar;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(15400L);
        ofFloat.addUpdateListener(new b(ofFloat, this));
        this.S = ofFloat;
    }

    private final void b(List<com.ss.android.ugc.aweme.sticker.data.h> list) {
        this.ao = new com.ss.android.ugc.aweme.sticker.data.c(list);
        if (this.aj != null) {
            androidx.fragment.app.e eVar = this.f130861i;
            if (eVar == null) {
                h.f.b.l.a("mActivity");
            }
            com.ss.android.ugc.aweme.shortvideo.s.b.b(eVar);
            com.ss.android.ugc.aweme.shortvideo.s.b.b(this.aj);
            this.aj = null;
        }
        LinearLayout linearLayout = this.G;
        if (linearLayout == null) {
            h.f.b.l.a("mSubtitleLayout");
        }
        int i2 = 0;
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = this.G;
        if (linearLayout2 == null) {
            h.f.b.l.a("mSubtitleLayout");
        }
        linearLayout2.setAlpha(1.0f);
        TextView textView = this.D;
        if (textView == null) {
            h.f.b.l.a("mSaveView");
        }
        textView.setVisibility(0);
        TextView textView2 = this.C;
        if (textView2 == null) {
            h.f.b.l.a("mCancelView");
        }
        textView2.setVisibility(0);
        if (!list.isEmpty()) {
            this.w.clear();
            this.w.addAll(list);
            ArrayList<com.ss.android.ugc.aweme.sticker.data.h> a2 = c.a(list, this.af);
            t tVar = this.f130860h;
            if (tVar == null) {
                h.f.b.l.a("mSubtitleAdapter");
            }
            tVar.a(a2);
            int K2 = K();
            if (K2 != -1) {
                i2 = K2;
            }
            HighLightLayoutManager highLightLayoutManager = this.f130859g;
            if (highLightLayoutManager == null) {
                h.f.b.l.a("mHighLightLayoutManager");
            }
            AVDmtPanelRecycleView aVDmtPanelRecycleView = this.H;
            if (aVDmtPanelRecycleView == null) {
                h.f.b.l.a("mRecyclerView");
            }
            highLightLayoutManager.a(aVDmtPanelRecycleView, new RecyclerView.s(), i2);
            com.ss.android.ugc.asve.editor.g gVar = this.f130862j;
            if (gVar != null) {
                gVar.a(true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.subtitle.o
    public final void d(int i2) {
        t tVar = new t(this, i2);
        com.ss.android.ugc.asve.editor.g gVar = this.f130862j;
        if (gVar != null) {
            gVar.c(tVar);
        }
        com.ss.android.ugc.asve.editor.g gVar2 = this.f130862j;
        if (gVar2 != null) {
            gVar2.a(0, this.af, x.g.EDITOR_TIMERANGE_FLAG_BEFORE_SPEED);
        }
        com.ss.android.ugc.asve.editor.g gVar3 = this.f130862j;
        if (gVar3 != null) {
            gVar3.a(true);
        }
        AVDmtPanelRecycleView aVDmtPanelRecycleView = this.H;
        if (aVDmtPanelRecycleView == null) {
            h.f.b.l.a("mRecyclerView");
        }
        if (aVDmtPanelRecycleView.getAdapter() != null) {
            t tVar2 = this.f130860h;
            if (tVar2 == null) {
                h.f.b.l.a("mSubtitleAdapter");
            }
            ArrayList<com.ss.android.ugc.aweme.sticker.data.h> arrayList = tVar2.f131013g;
            int size = arrayList.size() - 1;
            Iterator<com.ss.android.ugc.aweme.sticker.data.h> it = arrayList.iterator();
            while (it.hasNext()) {
                com.ss.android.ugc.aweme.sticker.data.h next = it.next();
                if (((int) next.getStartTime()) != 0 || ((int) next.getEndTime()) != this.af) {
                    long j2 = (long) i2;
                    if (next.getStartTime() <= j2 && j2 <= next.getEndTime()) {
                        size = arrayList.indexOf(next);
                    }
                }
            }
            if (size >= 0) {
                t tVar3 = this.f130860h;
                if (tVar3 == null) {
                    h.f.b.l.a("mSubtitleAdapter");
                }
                if (!TextUtils.isEmpty(tVar3.f131013g.get(size).getText()) || size == 0) {
                    HighLightLayoutManager highLightLayoutManager = this.f130859g;
                    if (highLightLayoutManager == null) {
                        h.f.b.l.a("mHighLightLayoutManager");
                    }
                    androidx.fragment.app.e eVar = this.f130861i;
                    if (eVar == null) {
                        h.f.b.l.a("mActivity");
                    }
                    highLightLayoutManager.a(size, (int) com.bytedance.common.utility.n.b(eVar, 52.0f));
                    t tVar4 = this.f130860h;
                    if (tVar4 == null) {
                        h.f.b.l.a("mSubtitleAdapter");
                    }
                    tVar4.a(size);
                }
            }
        }
        if (ag.a() && !this.y) {
            J();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.subtitle.k
    public final void a(List<com.ss.android.ugc.aweme.sticker.data.h> list) {
        String str;
        long j2;
        int i2;
        h.f.b.l.d(list, "");
        a aVar = C().f146931c;
        if (aVar != null) {
            str = aVar.f130905c;
        } else {
            str = null;
        }
        this.z = str;
        b().mSubtitleMusicChangeChecker.getData(b());
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (arrayList.size() > 1) {
            h.a.n.a((List) arrayList, (Comparator) new aa());
        }
        C().a(arrayList);
        J();
        androidx.lifecycle.t<dmt.av.video.t> tVar = this.t;
        if (tVar == null) {
            h.f.b.l.a("mPreviewControlOpLiveData");
        }
        com.ss.android.ugc.aweme.effect.a aVar2 = this.f130864l;
        if (aVar2 == null) {
            h.f.b.l.a("mCurrentPositionSource");
        }
        if (aVar2.c()) {
            com.ss.android.ugc.asve.editor.g gVar = this.f130862j;
            if (gVar != null) {
                i2 = gVar.j();
            } else {
                i2 = 0;
            }
            j2 = (long) i2;
        } else {
            j2 = 0;
        }
        tVar.setValue(dmt.av.video.t.c(j2));
        a(false);
        ArrayList<com.ss.android.ugc.aweme.sticker.data.h> arrayList2 = new ArrayList<>();
        this.x = arrayList2;
        arrayList2.addAll(arrayList);
        b(arrayList);
        I();
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        int i2;
        super.a(bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity;
        this.f130861i = eVar;
        if (eVar == null) {
            h.f.b.l.a("mActivity");
        }
        Objects.requireNonNull(eVar, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
        this.al = (com.ss.android.ugc.tools.view.a.c) eVar;
        androidx.fragment.app.e eVar2 = this.f130861i;
        if (eVar2 == null) {
            h.f.b.l.a("mActivity");
        }
        JediViewModel a2 = com.bytedance.jedi.arch.t.a(eVar2).a(EditStickerViewModel.class);
        h.f.b.l.b(a2, "");
        this.ae = (EditStickerViewModel) a2;
        com.ss.android.ugc.asve.editor.g value = N().C().getValue();
        this.f130862j = value;
        if (value != null) {
            i2 = value.j();
        } else {
            i2 = 0;
        }
        this.af = i2;
        this.u = new SafeHandler(this);
        this.v = new SafeHandler(this);
        View c2 = c(R.id.dsp);
        h.f.b.l.b(c2, "");
        ViewGroup viewGroup = (ViewGroup) c2;
        this.f130863k = viewGroup;
        if (viewGroup == null) {
            h.f.b.l.a("mSubtitleView");
        }
        viewGroup.setVisibility(8);
        ViewGroup viewGroup2 = this.f130863k;
        if (viewGroup2 == null) {
            h.f.b.l.a("mSubtitleView");
        }
        View findViewById = viewGroup2.findViewById(R.id.au7);
        h.f.b.l.b(findViewById, "");
        this.A = (RelativeLayout) findViewById;
        ViewGroup viewGroup3 = this.f130863k;
        if (viewGroup3 == null) {
            h.f.b.l.a("mSubtitleView");
        }
        View findViewById2 = viewGroup3.findViewById(R.id.aeq);
        h.f.b.l.b(findViewById2, "");
        this.B = (FrameLayout) findViewById2;
        ViewGroup viewGroup4 = this.f130863k;
        if (viewGroup4 == null) {
            h.f.b.l.a("mSubtitleView");
        }
        View findViewById3 = viewGroup4.findViewById(R.id.ewf);
        h.f.b.l.b(findViewById3, "");
        this.C = (TextView) findViewById3;
        ViewGroup viewGroup5 = this.f130863k;
        if (viewGroup5 == null) {
            h.f.b.l.a("mSubtitleView");
        }
        View findViewById4 = viewGroup5.findViewById(R.id.f6c);
        h.f.b.l.b(findViewById4, "");
        this.D = (TextView) findViewById4;
        ViewGroup viewGroup6 = this.f130863k;
        if (viewGroup6 == null) {
            h.f.b.l.a("mSubtitleView");
        }
        View findViewById5 = viewGroup6.findViewById(R.id.chj);
        h.f.b.l.b(findViewById5, "");
        this.E = (LinearLayout) findViewById5;
        ViewGroup viewGroup7 = this.f130863k;
        if (viewGroup7 == null) {
            h.f.b.l.a("mSubtitleView");
        }
        View findViewById6 = viewGroup7.findViewById(R.id.ci4);
        h.f.b.l.b(findViewById6, "");
        this.F = (DmtStatusView) findViewById6;
        ViewGroup viewGroup8 = this.f130863k;
        if (viewGroup8 == null) {
            h.f.b.l.a("mSubtitleView");
        }
        View findViewById7 = viewGroup8.findViewById(R.id.eee);
        h.f.b.l.b(findViewById7, "");
        this.G = (LinearLayout) findViewById7;
        ViewGroup viewGroup9 = this.f130863k;
        if (viewGroup9 == null) {
            h.f.b.l.a("mSubtitleView");
        }
        View findViewById8 = viewGroup9.findViewById(R.id.djs);
        h.f.b.l.b(findViewById8, "");
        this.H = (AVDmtPanelRecycleView) findViewById8;
        ViewGroup viewGroup10 = this.f130863k;
        if (viewGroup10 == null) {
            h.f.b.l.a("mSubtitleView");
        }
        View findViewById9 = viewGroup10.findViewById(R.id.bg5);
        h.f.b.l.b(findViewById9, "");
        this.I = findViewById9;
        ViewGroup viewGroup11 = this.f130863k;
        if (viewGroup11 == null) {
            h.f.b.l.a("mSubtitleView");
        }
        View findViewById10 = viewGroup11.findViewById(R.id.bjf);
        h.f.b.l.b(findViewById10, "");
        this.J = (ImageView) findViewById10;
        ViewGroup viewGroup12 = this.f130863k;
        if (viewGroup12 == null) {
            h.f.b.l.a("mSubtitleView");
        }
        View findViewById11 = viewGroup12.findViewById(R.id.bjd);
        h.f.b.l.b(findViewById11, "");
        this.K = (ImageView) findViewById11;
        ViewGroup viewGroup13 = this.f130863k;
        if (viewGroup13 == null) {
            h.f.b.l.a("mSubtitleView");
        }
        View findViewById12 = viewGroup13.findViewById(R.id.ci1);
        h.f.b.l.b(findViewById12, "");
        this.L = (TextView) findViewById12;
        ViewGroup viewGroup14 = this.f130863k;
        if (viewGroup14 == null) {
            h.f.b.l.a("mSubtitleView");
        }
        View findViewById13 = viewGroup14.findViewById(R.id.chu);
        h.f.b.l.b(findViewById13, "");
        this.M = (TextView) findViewById13;
        ViewGroup viewGroup15 = this.f130863k;
        if (viewGroup15 == null) {
            h.f.b.l.a("mSubtitleView");
        }
        View findViewById14 = viewGroup15.findViewById(R.id.bje);
        h.f.b.l.b(findViewById14, "");
        this.N = (ImageView) findViewById14;
        LinearLayout linearLayout = this.E;
        if (linearLayout == null) {
            h.f.b.l.a("mLoadingArea");
        }
        View findViewById15 = linearLayout.findViewById(R.id.a1s);
        h.f.b.l.b(findViewById15, "");
        this.Q = (TuxTextView) findViewById15;
        if (ef.a()) {
            TuxTextView tuxTextView = this.Q;
            if (tuxTextView == null) {
                h.f.b.l.a("mLoadingCancelBtn");
            }
            tuxTextView.setText(R.string.f7q);
            TextView textView = this.C;
            if (textView == null) {
                h.f.b.l.a("mCancelView");
            }
            textView.setText(R.string.b9e);
        }
        this.Z = new m(this);
        View c3 = c(R.id.bzv);
        h.f.b.l.b(c3, "");
        this.O = c3;
        View c4 = c(R.id.b65);
        h.f.b.l.b(c4, "");
        this.P = c4;
        androidx.fragment.app.e eVar3 = this.f130861i;
        if (eVar3 == null) {
            h.f.b.l.a("mActivity");
        }
        LayoutInflater from = LayoutInflater.from(eVar3);
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 == null) {
            h.f.b.l.a("mLoadingArea");
        }
        View a3 = com.a.a(from, R.layout.b3e, linearLayout2, false);
        h.f.b.l.b(a3, "");
        this.aa = a3;
        androidx.fragment.app.e eVar4 = this.f130861i;
        if (eVar4 == null) {
            h.f.b.l.a("mActivity");
        }
        LayoutInflater from2 = LayoutInflater.from(eVar4);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 == null) {
            h.f.b.l.a("mLoadingArea");
        }
        View a4 = com.a.a(from2, R.layout.b3d, linearLayout3, false);
        h.f.b.l.b(a4, "");
        this.ab = a4;
        TextView textView2 = this.C;
        if (textView2 == null) {
            h.f.b.l.a("mCancelView");
        }
        com.ss.android.ugc.aweme.views.d dVar = this.Z;
        if (dVar == null) {
            h.f.b.l.a("debounceOnClickListener");
        }
        textView2.setOnClickListener(dVar);
        TextView textView3 = this.D;
        if (textView3 == null) {
            h.f.b.l.a("mSaveView");
        }
        com.ss.android.ugc.aweme.views.d dVar2 = this.Z;
        if (dVar2 == null) {
            h.f.b.l.a("debounceOnClickListener");
        }
        textView3.setOnClickListener(dVar2);
        ImageView imageView = this.J;
        if (imageView == null) {
            h.f.b.l.a("mIvFont");
        }
        com.ss.android.ugc.aweme.views.d dVar3 = this.Z;
        if (dVar3 == null) {
            h.f.b.l.a("debounceOnClickListener");
        }
        imageView.setOnClickListener(dVar3);
        ImageView imageView2 = this.K;
        if (imageView2 == null) {
            h.f.b.l.a("mIvDelete");
        }
        com.ss.android.ugc.aweme.views.d dVar4 = this.Z;
        if (dVar4 == null) {
            h.f.b.l.a("debounceOnClickListener");
        }
        imageView2.setOnClickListener(dVar4);
        ImageView imageView3 = this.N;
        if (imageView3 == null) {
            h.f.b.l.a("mIvEdit");
        }
        com.ss.android.ugc.aweme.views.d dVar5 = this.Z;
        if (dVar5 == null) {
            h.f.b.l.a("debounceOnClickListener");
        }
        imageView3.setOnClickListener(dVar5);
        View view = this.P;
        if (view == null) {
            h.f.b.l.a("mFlPlay");
        }
        com.ss.android.ugc.aweme.views.d dVar6 = this.Z;
        if (dVar6 == null) {
            h.f.b.l.a("debounceOnClickListener");
        }
        view.setOnClickListener(dVar6);
        DmtStatusView dmtStatusView = this.F;
        if (dmtStatusView == null) {
            h.f.b.l.a("mLoadingStatusView");
        }
        androidx.fragment.app.e eVar5 = this.f130861i;
        if (eVar5 == null) {
            h.f.b.l.a("mActivity");
        }
        DmtStatusView.a a5 = DmtStatusView.a.a(eVar5);
        a5.f33605g = 1;
        dmtStatusView.setBuilder(a5);
        if (this.f130861i == null) {
            h.f.b.l.a("mActivity");
        }
        this.f130859g = new HighLightLayoutManager();
        t tVar = new t(new ArrayList());
        this.f130860h = tVar;
        n nVar = new n(this);
        h.f.b.l.d(nVar, "");
        tVar.f131009c = nVar;
        AVDmtPanelRecycleView aVDmtPanelRecycleView = this.H;
        if (aVDmtPanelRecycleView == null) {
            h.f.b.l.a("mRecyclerView");
        }
        HighLightLayoutManager highLightLayoutManager = this.f130859g;
        if (highLightLayoutManager == null) {
            h.f.b.l.a("mHighLightLayoutManager");
        }
        aVDmtPanelRecycleView.setLayoutManager(highLightLayoutManager);
        t tVar2 = this.f130860h;
        if (tVar2 == null) {
            h.f.b.l.a("mSubtitleAdapter");
        }
        aVDmtPanelRecycleView.setAdapter(tVar2);
        aVDmtPanelRecycleView.b(new f((int) com.bytedance.common.utility.n.b(aVDmtPanelRecycleView.getContext(), 52.0f), (int) com.bytedance.common.utility.n.b(aVDmtPanelRecycleView.getContext(), 163.0f)));
        RecyclerView.f itemAnimator = aVDmtPanelRecycleView.getItemAnimator();
        Objects.requireNonNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((androidx.recyclerview.widget.ab) itemAnimator).f3953m = false;
        AVDmtPanelRecycleView aVDmtPanelRecycleView2 = this.H;
        if (aVDmtPanelRecycleView2 == null) {
            h.f.b.l.a("mRecyclerView");
        }
        aVDmtPanelRecycleView2.a(new o(this));
        androidx.fragment.app.e eVar6 = this.f130861i;
        if (eVar6 == null) {
            h.f.b.l.a("mActivity");
        }
        LayoutInflater from3 = LayoutInflater.from(eVar6);
        ViewGroup viewGroup16 = this.f130863k;
        if (viewGroup16 == null) {
            h.f.b.l.a("mSubtitleView");
        }
        View a6 = com.a.a(from3, R.layout.b3a, viewGroup16, false);
        Objects.requireNonNull(a6, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout4 = (LinearLayout) a6;
        ViewGroup viewGroup17 = this.f130863k;
        if (viewGroup17 == null) {
            h.f.b.l.a("mSubtitleView");
        }
        h hVar = new h(linearLayout4, viewGroup17, this, b(), N());
        this.f130854b = hVar;
        h.f.b.l.d(this, "");
        hVar.f130947c = this;
        this.f130864l = new i(this);
        EditStickerViewModel editStickerViewModel = this.ae;
        if (editStickerViewModel == null) {
            h.f.b.l.a("mEditStickerViewModel");
        }
        ((LiveData) editStickerViewModel.f146393a.getValue()).observe(this, new k(this));
        androidx.lifecycle.t<dmt.av.video.t> v2 = N().v();
        this.t = v2;
        if (v2 == null) {
            h.f.b.l.a("mPreviewControlOpLiveData");
        }
        v2.observe(this, new l(this));
        C().f146930b.a(this, new j(this));
        a aVar = C().f146931c;
        if (aVar != null) {
            h.f.b.l.d(this, "");
            aVar.f130908f = this;
        }
    }

    public final void b(boolean z2) {
        long j2;
        boolean z3;
        int i2;
        MethodCollector.i(2957);
        if (!z2) {
            TextView textView = this.D;
            if (textView == null) {
                h.f.b.l.a("mSaveView");
            }
            textView.setVisibility(4);
            TextView textView2 = this.C;
            if (textView2 == null) {
                h.f.b.l.a("mCancelView");
            }
            textView2.setVisibility(4);
            View view = this.O;
            if (view == null) {
                h.f.b.l.a("mIvPlay");
            }
            view.setVisibility(8);
        }
        FrameLayout frameLayout = this.B;
        if (frameLayout == null) {
            h.f.b.l.a("mContentLayout");
        }
        int P2 = P();
        ViewGroup viewGroup = this.f130863k;
        if (viewGroup == null) {
            h.f.b.l.a("mSubtitleView");
        }
        com.ss.android.ugc.aweme.effect.s.a(frameLayout, z2, P2, viewGroup, z.f130902a);
        if (z2) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.W = elapsedRealtime;
            this.X = elapsedRealtime;
            FrameLayout frameLayout2 = this.B;
            if (frameLayout2 == null) {
                h.f.b.l.a("mContentLayout");
            }
            View view2 = this.aa;
            if (view2 == null) {
                h.f.b.l.a("mRetryView");
            }
            frameLayout2.removeView(view2);
            FrameLayout frameLayout3 = this.B;
            if (frameLayout3 == null) {
                h.f.b.l.a("mContentLayout");
            }
            View view3 = this.ab;
            if (view3 == null) {
                h.f.b.l.a("mExitView");
            }
            frameLayout3.removeView(view3);
            this.f130856d = 0.004f;
            J();
            androidx.lifecycle.t<dmt.av.video.t> tVar = this.t;
            if (tVar == null) {
                h.f.b.l.a("mPreviewControlOpLiveData");
            }
            com.ss.android.ugc.aweme.effect.a aVar = this.f130864l;
            if (aVar == null) {
                h.f.b.l.a("mCurrentPositionSource");
            }
            if (aVar.c()) {
                com.ss.android.ugc.asve.editor.g gVar = this.f130862j;
                if (gVar != null) {
                    i2 = gVar.j();
                } else {
                    i2 = 0;
                }
                j2 = (long) i2;
            } else {
                j2 = 0;
            }
            tVar.setValue(dmt.av.video.t.c(j2));
            com.ss.android.ugc.tools.view.a.c cVar = this.al;
            if (cVar == null) {
                h.f.b.l.a("mListenableActivityRegistry");
            }
            cVar.b(this.am);
            com.ss.android.ugc.aweme.shortvideo.preview.a N2 = N();
            int a2 = com.ss.android.ugc.aweme.themechange.base.c.a(true, false, false, false);
            int O2 = O();
            androidx.fragment.app.e eVar = this.f130861i;
            if (eVar == null) {
                h.f.b.l.a("mActivity");
            }
            N2.a(u.a.a(a2, O2 + dh.c(eVar), P(), Q(), com.ss.android.ugc.aweme.adaptation.a.f66177a.d(), false, false, 960));
            if (b().mSubtitleMusicChangeChecker.hasChanged(b()) || (this.x == null && b().captionStruct == null)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                this.w.clear();
                C().a((List<com.ss.android.ugc.aweme.sticker.data.h>) null);
                b().captionStruct = null;
                a(true);
                this.w.clear();
                ImageView imageView = this.N;
                if (imageView == null) {
                    h.f.b.l.a("mIvEdit");
                }
                imageView.setVisibility(0);
                this.ai = null;
                this.ah = null;
                a aVar2 = C().f146931c;
                if (aVar2 != null) {
                    aVar2.h();
                    aVar2.f();
                    MethodCollector.o(2957);
                    return;
                }
                MethodCollector.o(2957);
                return;
            }
            com.ss.android.ugc.aweme.sticker.data.d dVar = b().captionStruct;
            if (dVar == null || dVar.getUtterances() == null) {
                List<com.ss.android.ugc.aweme.sticker.data.h> list = this.x;
                if (list == null) {
                    list = h.a.z.INSTANCE;
                }
                b(list);
                this.ah = null;
            } else {
                com.ss.android.ugc.aweme.sticker.data.d dVar2 = b().captionStruct;
                if (dVar2 == null) {
                    h.f.b.l.b();
                }
                List<com.ss.android.ugc.aweme.sticker.data.h> utterances = dVar2.getUtterances();
                if (utterances == null) {
                    h.f.b.l.b();
                }
                b(utterances);
                com.ss.android.ugc.aweme.sticker.data.d dVar3 = b().captionStruct;
                if (dVar3 == null) {
                    h.f.b.l.b();
                }
                List<com.ss.android.ugc.aweme.sticker.data.h> utterances2 = dVar3.getUtterances();
                if (utterances2 == null) {
                    h.f.b.l.b();
                }
                this.ah = utterances2;
            }
            a(false);
            I();
            C().a(this.w);
            MethodCollector.o(2957);
            return;
        }
        EditStickerViewModel editStickerViewModel = this.ae;
        if (editStickerViewModel == null) {
            h.f.b.l.a("mEditStickerViewModel");
        }
        editStickerViewModel.n().setValue(false);
        com.ss.android.ugc.tools.view.a.c cVar2 = this.al;
        if (cVar2 == null) {
            h.f.b.l.a("mListenableActivityRegistry");
        }
        cVar2.c(this.am);
        com.ss.android.ugc.aweme.shortvideo.preview.a N3 = N();
        androidx.fragment.app.e eVar2 = this.f130861i;
        if (eVar2 == null) {
            h.f.b.l.a("mActivity");
        }
        int c2 = androidx.core.content.b.c(eVar2, R.color.a2);
        int O3 = O();
        androidx.fragment.app.e eVar3 = this.f130861i;
        if (eVar3 == null) {
            h.f.b.l.a("mActivity");
        }
        N3.a(u.a.a(c2, O3 + dh.c(eVar3), P(), Q(), com.ss.android.ugc.aweme.adaptation.a.f66177a.d()));
        View view4 = this.O;
        if (view4 == null) {
            h.f.b.l.a("mIvPlay");
        }
        view4.setVisibility(8);
        MethodCollector.o(2957);
    }

    public final void a(boolean z2) {
        if (z2) {
            this.f130857e = new g();
            SafeHandler safeHandler = this.v;
            if (safeHandler == null) {
                h.f.b.l.a("mTipsHandler");
            }
            g gVar = this.f130857e;
            if (gVar == null) {
                h.f.b.l.b();
            }
            safeHandler.post(gVar);
            this.S.start();
            LinearLayout linearLayout = this.E;
            if (linearLayout == null) {
                h.f.b.l.a("mLoadingArea");
            }
            linearLayout.setVisibility(0);
            LinearLayout linearLayout2 = this.G;
            if (linearLayout2 == null) {
                h.f.b.l.a("mSubtitleLayout");
            }
            linearLayout2.setVisibility(8);
            DmtStatusView dmtStatusView = this.F;
            if (dmtStatusView == null) {
                h.f.b.l.a("mLoadingStatusView");
            }
            dmtStatusView.f();
            LinearLayout linearLayout3 = this.E;
            if (linearLayout3 == null) {
                h.f.b.l.a("mLoadingArea");
            }
            linearLayout3.findViewById(R.id.a1s).setOnClickListener(new ac(this));
            return;
        }
        this.S.cancel();
        this.f130857e = null;
        SafeHandler safeHandler2 = this.v;
        if (safeHandler2 == null) {
            h.f.b.l.a("mTipsHandler");
        }
        safeHandler2.removeCallbacksAndMessages(null);
        DmtStatusView dmtStatusView2 = this.F;
        if (dmtStatusView2 == null) {
            h.f.b.l.a("mLoadingStatusView");
        }
        dmtStatusView2.d();
        LinearLayout linearLayout4 = this.E;
        if (linearLayout4 == null) {
            h.f.b.l.a("mLoadingArea");
        }
        linearLayout4.setVisibility(8);
        LinearLayout linearLayout5 = this.G;
        if (linearLayout5 == null) {
            h.f.b.l.a("mSubtitleLayout");
        }
        linearLayout5.setVisibility(0);
        LinearLayout linearLayout6 = this.G;
        if (linearLayout6 == null) {
            h.f.b.l.a("mSubtitleLayout");
        }
        linearLayout6.setAlpha(1.0f);
    }

    public static final class f extends RecyclerView.h {

        /* renamed from: a  reason: collision with root package name */
        private final int f130880a;

        /* renamed from: b  reason: collision with root package name */
        private final int f130881b;

        static {
            Covode.recordClassIndex(85779);
        }

        public f(int i2, int i3) {
            this.f130880a = i2;
            this.f130881b = i3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
            RecyclerView.i layoutManager;
            h.f.b.l.d(rect, "");
            h.f.b.l.d(view, "");
            h.f.b.l.d(recyclerView, "");
            h.f.b.l.d(sVar, "");
            int d2 = RecyclerView.d(view);
            if (d2 == 0) {
                rect.top = this.f130880a;
            }
            RecyclerView.i layoutManager2 = recyclerView.getLayoutManager();
            if (layoutManager2 != null && Integer.valueOf(layoutManager2.A() - 1) != null && (layoutManager = recyclerView.getLayoutManager()) != null && d2 == layoutManager.A() - 1) {
                rect.bottom = this.f130881b;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class w implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditCaptionScene f130900a;

        static {
            Covode.recordClassIndex(85798);
        }

        w(EditCaptionScene editCaptionScene) {
            this.f130900a = editCaptionScene;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f130900a.H();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class y implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditCaptionScene f130901a;

        static {
            Covode.recordClassIndex(85801);
        }

        y(EditCaptionScene editCaptionScene) {
            this.f130901a = editCaptionScene;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f130901a.H();
        }
    }

    static final class u implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditCaptionScene f130899a;

        static {
            Covode.recordClassIndex(85795);
        }

        u(EditCaptionScene editCaptionScene) {
            this.f130899a = editCaptionScene;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f130899a.H();
            this.f130899a.w.clear();
        }
    }

    public static final class aa<T> implements Comparator {
        static {
            Covode.recordClassIndex(85769);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Long.valueOf(t.getStartTime()), Long.valueOf(t2.getStartTime()));
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.atg, viewGroup, false);
        h.f.b.l.b(a2, "");
        return a2;
    }

    static final class q implements com.ss.android.ugc.tools.view.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditCaptionScene f130895a;

        static {
            Covode.recordClassIndex(85790);
        }

        q(EditCaptionScene editCaptionScene) {
            this.f130895a = editCaptionScene;
        }

        @Override // com.ss.android.ugc.tools.view.a.a
        public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
            TextView textView;
            if (i2 != 4) {
                return false;
            }
            h hVar = this.f130895a.f130854b;
            if (hVar == null || !hVar.f130954j) {
                ViewGroup viewGroup = this.f130895a.f130863k;
                if (viewGroup == null) {
                    h.f.b.l.a("mSubtitleView");
                }
                if (viewGroup.isShown()) {
                    EditCaptionScene editCaptionScene = this.f130895a;
                    LinearLayout linearLayout = editCaptionScene.E;
                    if (linearLayout == null) {
                        h.f.b.l.a("mLoadingArea");
                    }
                    if (linearLayout.getVisibility() == 0) {
                        editCaptionScene.F();
                    } else {
                        editCaptionScene.E();
                    }
                }
            } else {
                h hVar2 = this.f130895a.f130854b;
                if (!(hVar2 == null || (textView = hVar2.f130950f) == null)) {
                    textView.performClick();
                }
            }
            return true;
        }
    }

    public final void a(int i2, int i3, String str) {
        boolean z2;
        h.f.b.l.d(str, "");
        if (ag.a()) {
            View view = this.O;
            if (view == null) {
                h.f.b.l.a("mIvPlay");
            }
            if (view.getVisibility() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.y = z2;
            androidx.lifecycle.t<dmt.av.video.t> tVar = this.t;
            if (tVar == null) {
                h.f.b.l.a("mPreviewControlOpLiveData");
            }
            tVar.setValue(dmt.av.video.t.b());
        } else {
            J();
        }
        com.ss.android.ugc.aweme.effect.a aVar = this.f130864l;
        if (aVar == null) {
            h.f.b.l.a("mCurrentPositionSource");
        }
        this.U = aVar.a();
        com.ss.android.ugc.asve.editor.g gVar = this.f130862j;
        if (gVar != null) {
            gVar.a(false);
        }
        bl.c(b(), str);
        h hVar = this.f130854b;
        if (hVar != null) {
            hVar.a(str);
        }
        ArrayList<com.ss.android.ugc.aweme.sticker.data.h> arrayList = this.w;
        t tVar2 = this.f130860h;
        if (tVar2 == null) {
            h.f.b.l.a("mSubtitleAdapter");
        }
        int a2 = h.a.n.a((List) arrayList, h.a.n.b((List) tVar2.f131013g, i2));
        com.ss.android.ugc.tools.utils.q.d("EditCaptionScene enterEditView showPos " + a2 + " selectIndex " + i3);
        h hVar2 = this.f130854b;
        if (hVar2 != null) {
            hVar2.a(this.w, a2, i3, (int) this.U);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.subtitle.o
    public final void a(boolean z2, int i2, List<com.ss.android.ugc.aweme.sticker.data.h> list) {
        h.f.b.l.d(list, "");
        if (z2) {
            this.w.clear();
            this.w.addAll(list);
            t tVar = this.f130860h;
            if (tVar == null) {
                h.f.b.l.a("mSubtitleAdapter");
            }
            tVar.a(c.a(this.w, this.af));
            t tVar2 = this.f130860h;
            if (tVar2 == null) {
                h.f.b.l.a("mSubtitleAdapter");
            }
            int a2 = h.a.n.a((List) tVar2.f131013g, h.a.n.b((List) this.w, i2));
            t tVar3 = this.f130860h;
            if (tVar3 == null) {
                h.f.b.l.a("mSubtitleAdapter");
            }
            if (a2 == -1) {
                a2 = 0;
            }
            tVar3.a(a2);
            ArrayList arrayList = new ArrayList();
            t tVar4 = this.f130860h;
            if (tVar4 == null) {
                h.f.b.l.a("mSubtitleAdapter");
            }
            ArrayList<com.ss.android.ugc.aweme.sticker.data.h> arrayList2 = tVar4.f131013g;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (arrayList2.get(i3).getText().length() > 0) {
                    com.ss.android.ugc.aweme.sticker.data.h hVar = arrayList2.get(i3);
                    h.f.b.l.b(hVar, "");
                    arrayList.add(new com.ss.android.ugc.aweme.sticker.data.h(hVar));
                }
            }
            C().a(arrayList);
            com.ss.android.ugc.asve.editor.g gVar = this.f130862j;
            if (gVar != null) {
                gVar.w();
            }
        }
        com.ss.android.ugc.aweme.common.r.a("save_edit_subtitle", bl.d(b()).a("is_changed", z2 ? 1 : 0).f149193a);
    }
}
