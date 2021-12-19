package com.bytedance.android.livesdk.chatroom.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.gift.o;
import com.bytedance.android.live.gift.s;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.an;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.au;
import com.bytedance.android.livesdk.c;
import com.bytedance.android.livesdk.chatroom.viewmodule.EndWidget;
import com.bytedance.android.livesdk.chatroom.widget.DefinitionSelectionWidget;
import com.bytedance.android.livesdk.chatroom.widget.LockScreenWidget;
import com.bytedance.android.livesdk.chatroom.widget.MessageBlockWidget;
import com.bytedance.android.livesdk.chatroom.widget.OrientationChangeWidget;
import com.bytedance.android.livesdk.chatroom.widget.SplitScreenWidget;
import com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidget;
import com.bytedance.android.livesdk.event.g;
import com.bytedance.android.livesdk.j.aa;
import com.bytedance.android.livesdk.j.al;
import com.bytedance.android.livesdk.j.ba;
import com.bytedance.android.livesdk.j.bc;
import com.bytedance.android.livesdk.j.be;
import com.bytedance.android.livesdk.j.k;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreloadFirstScreenFrameSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractStartFetchingMessageStyleSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.ShowAudienceDefinitionSelectionSetting;
import com.bytedance.android.livesdk.util.rxutils.autodispose.e;
import com.bytedance.android.widget.Widget;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import f.a.b.b;
import f.a.t;
import h.z;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class at extends a {
    private static final int N = y.a(48.0f);
    View H;
    boolean I;
    boolean J;
    boolean K;
    private long L;
    private b M;
    private com.bytedance.android.livesdk.chatroom.b O;
    private SwitchDefinitionTipsWidget P;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.ui.a
    public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2) {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.ui.a
    public final boolean h() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.ui.a
    public final com.bytedance.android.livesdk.chatroom.b d() {
        return this.O;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.ui.a
    public final boolean f() {
        E();
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onPause() {
        D();
        super.onPause();
    }

    static {
        Covode.recordClassIndex(8798);
    }

    /* access modifiers changed from: package-private */
    public final void D() {
        b bVar = this.M;
        if (bVar != null && !bVar.isDisposed()) {
            this.M.dispose();
        }
    }

    /* access modifiers changed from: package-private */
    public final void E() {
        boolean z = !this.I;
        this.I = z;
        if (!z) {
            e();
        } else {
            D();
        }
        a(0);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z F() {
        if (this.P == null) {
            this.P = (SwitchDefinitionTipsWidget) this.f15836m.load(R.id.egr, SwitchDefinitionTipsWidget.class);
        }
        this.P.show();
        return z.f158842a;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.ui.a
    public final void c() {
        super.c();
        a.a().a(g.class).d(new ay(this));
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment, com.bytedance.android.livesdk.chatroom.ui.a
    public final void onResume() {
        e();
        a(1);
        View view = this.H;
        if (view != null) {
            view.postDelayed(new ax(this), 300);
        }
        super.onResume();
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        D();
        this.M = t.b(5000, TimeUnit.MILLISECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new bf(this), aw.f15917a);
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment, com.bytedance.android.livesdk.chatroom.ui.a
    public final void onDestroy() {
        D();
        super.onDestroy();
        HashMap hashMap = new HashMap();
        hashMap.put("room_orientation", "landscape");
        hashMap.put("duration", String.valueOf(System.currentTimeMillis() - this.L));
        b.a.a("livesdk_transverse_screen_duration").a((Map<String, String>) hashMap).b("live").c("click").d("live_landscape").a(this.f15831h).b();
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.android.livesdk.chatroom.ui.a
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(com.bytedance.android.livesdkapi.f.a aVar) {
        if (isViewValid() && aVar.f23199b == 3) {
            this.f15831h.c(com.bytedance.android.live.gift.b.class);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(3);
        boolean z = false;
        sparseBooleanArray.put(0, this.I);
        sparseBooleanArray.put(1, this.J);
        sparseBooleanArray.put(2, this.K);
        g gVar = new g();
        gVar.f17192a = sparseBooleanArray;
        gVar.f17193b = i2;
        if (i2 == 1 && this.J) {
            z = true;
        }
        gVar.f17194c = z;
        a.a().a(gVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.ui.a
    public final void a(boolean z) {
        if (z && !this.I) {
            this.I = true;
            D();
            a(0);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment, com.bytedance.android.livesdk.chatroom.ui.a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getContext() != null) {
            if (this.f15831h != null && !((Boolean) this.f15831h.b(bc.class)).booleanValue()) {
                be beVar = new be();
                if (this.I || this.J || this.K) {
                    beVar.f18256a = y.a(124.0f);
                } else {
                    beVar.f18256a = y.a(168.0f);
                }
                if (this.f15831h != null) {
                    this.f15831h.c(o.class, Integer.valueOf(beVar.f18256a));
                }
            }
            be beVar2 = new be();
            beVar2.f18256a = (int) getResources().getDimension(R.dimen.x8);
            if (this.f15831h != null) {
                this.f15831h.c(al.class, beVar2);
            }
        }
        e();
        this.L = System.currentTimeMillis();
        ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) a.a().a(com.bytedance.android.livesdkapi.f.a.class).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(e.a((Fragment) this))).a(new az(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.ui.a
    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.f15836m.load(R.id.a4g, (Widget) new OrientationChangeWidget(), false);
        this.f15836m.load(R.id.cim, (Widget) new LockScreenWidget(), false);
        if (ShowAudienceDefinitionSelectionSetting.INSTANCE.isEnable()) {
            this.f15836m.load(R.id.egq, (Widget) new DefinitionSelectionWidget(), false);
        }
        if (this.f15831h != null && ((Boolean) this.f15831h.b(aa.class)).booleanValue()) {
            this.f15836m.load(R.id.tr, (Widget) new MessageBlockWidget(), false);
        }
        this.f15836m.load(SplitScreenWidget.class);
        if (this.f15831h != null) {
            this.f15831h.a((m) this, s.class, (h.f.a.b) new ba(this));
        }
        if (this.f15831h != null) {
            this.f15831h.a((m) this, au.class, bb.f15937a).a((m) this, an.class, (h.f.a.b) new bc(this)).a((m) this, c.class, (h.f.a.b) new bd(this)).a((m) this, k.class, (h.f.a.b) new be(this));
        }
        if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() == 1 && InteractStartFetchingMessageStyleSetting.INSTANCE.getValue() == 1) {
            this.p = new EndWidget();
            this.f15836m.load(R.id.awq, this.p);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.i(2948);
        this.H = com.a.a(LayoutInflater.from(getContext()), R.layout.b9d, viewGroup, false);
        com.bytedance.android.livesdk.chatroom.b bVar = new com.bytedance.android.livesdk.chatroom.b(this.H);
        this.O = bVar;
        bVar.f14941b.addView(bVar.f14947h, new ViewGroup.LayoutParams(-1, -1));
        int d2 = y.d(R.dimen.wo);
        bVar.f14941b.addView(bVar.f14942c, new FrameLayout.LayoutParams(d2, -1, 5));
        bVar.f14942c.setTranslationX((float) d2);
        bVar.f14942c.setVisibility(8);
        bVar.f14946g.setBackgroundColor(Color.parseColor("#003B4050"));
        this.H = this.O.f14940a;
        if (this.f15831h != null) {
            this.f15831h.a(com.bytedance.android.livesdk.t.class, this.O);
            this.f15831h.b((m) this, com.bytedance.android.livesdk.s.class, (h.f.a.b) new au(this)).a((m) this, ba.class, (h.f.a.b) new av(this));
        }
        View view = this.H;
        MethodCollector.o(2948);
        return view;
    }
}
