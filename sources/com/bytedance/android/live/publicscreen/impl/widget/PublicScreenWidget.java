package com.bytedance.android.live.publicscreen.impl.widget;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.gift.o;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.live.publicscreen.a.j;
import com.bytedance.android.live.publicscreen.impl.e.h;
import com.bytedance.android.live.publicscreen.impl.view.WarningInfoView;
import com.bytedance.android.live.publicscreen.impl.widget.b.c;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.aq.e;
import com.bytedance.android.livesdk.chatroom.behavior.ScrollHeaderBehavior;
import com.bytedance.android.livesdk.chatroom.behavior.SuctionBottomBehavior;
import com.bytedance.android.livesdk.chatroom.c.al;
import com.bytedance.android.livesdk.chatroom.c.p;
import com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager;
import com.bytedance.android.livesdk.chatroom.viewmodule.br;
import com.bytedance.android.livesdk.chatroom.widget.LiveMessageRecyclerView;
import com.bytedance.android.livesdk.event.d;
import com.bytedance.android.livesdk.j.ab;
import com.bytedance.android.livesdk.j.ah;
import com.bytedance.android.livesdk.j.ax;
import com.bytedance.android.livesdk.j.az;
import com.bytedance.android.livesdk.j.be;
import com.bytedance.android.livesdk.j.cb;
import com.bytedance.android.livesdk.j.cq;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.di;
import com.bytedance.android.livesdk.j.dy;
import com.bytedance.android.livesdk.j.ed;
import com.bytedance.android.livesdk.j.t;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenConfigSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenDebugEnabledSetting;
import com.bytedance.android.livesdk.model.message.bw;
import com.bytedance.android.livesdk.utils.ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import f.a.b.b;
import h.f.b.l;
import h.z;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public abstract class PublicScreenWidget extends LiveRecyclableWidget implements h.a, au {

    /* renamed from: a  reason: collision with root package name */
    private TextView f12505a;

    /* renamed from: b  reason: collision with root package name */
    private View f12506b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12507c = LivePublicScreenDebugEnabledSetting.INSTANCE.getValue();

    /* renamed from: d  reason: collision with root package name */
    protected LiveMessageRecyclerView f12508d;

    /* renamed from: e  reason: collision with root package name */
    WarningInfoView f12509e;

    /* renamed from: f  reason: collision with root package name */
    protected SmoothLinearLayoutManager f12510f;

    /* renamed from: g  reason: collision with root package name */
    h f12511g;

    /* renamed from: h  reason: collision with root package name */
    public int f12512h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f12513i = 0;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12514j = false;

    /* renamed from: k  reason: collision with root package name */
    boolean f12515k;

    /* renamed from: l  reason: collision with root package name */
    boolean f12516l;

    /* renamed from: m  reason: collision with root package name */
    boolean f12517m;
    a n;
    p o;
    String p;
    public com.bytedance.android.live.publicscreen.impl.f.a q;
    public Room r;
    c s;
    p t;
    private a u = a.NORMAL;
    private boolean v = false;
    private boolean w;
    private View x;
    private b y;
    private com.bytedance.android.live.publicscreen.impl.widget.a.c z;

    static {
        Covode.recordClassIndex(6885);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final void a(Throwable th) {
        br.a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bbz;
    }

    /* access modifiers changed from: protected */
    public void i() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public boolean needRecycle() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            a(a.FOCUS, false);
            this.f12514j = false;
            int m2 = this.f12510f.m();
            int i2 = this.f12513i;
            if (m2 > i2) {
                g(this.f12512h - (m2 - i2));
                this.f12513i = m2;
            }
        }
        if (motionEvent.getAction() == 1 && (!this.f12508d.canScrollVertically(1))) {
            a(a.NORMAL, false);
        }
        return false;
    }

    public final void a(p pVar) {
        if (getView() == null || !isViewValid() || getContext() == null) {
            this.t = pVar;
            return;
        }
        int dimension = (int) getContext().getResources().getDimension(R.dimen.vz);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getView().getLayoutParams();
        if (pVar.f15136a == 0) {
            this.o = pVar;
            if (pVar.f15137b instanceof Integer) {
                int intValue = ((Integer) pVar.f15137b).intValue();
                if (pVar.f15138c) {
                    int dimension2 = (int) getContext().getResources().getDimension(R.dimen.ws);
                    intValue += dimension2;
                    dimension += dimension2;
                }
                int intValue2 = ((Integer) this.dataChannel.b(ax.class)).intValue();
                if (intValue2 <= 0) {
                    intValue2 = n.b(getContext());
                    com.bytedance.android.live.core.c.a.a(5, "AbsInteractionFragment.adjustTextMessage", "failed to obtain iaHeight");
                }
                int i2 = (intValue2 - intValue) - layoutParams.bottomMargin;
                String str = "iaHeight:" + intValue2 + " height:" + i2 + " topMargin:" + intValue + " bottomMargin:" + layoutParams.bottomMargin;
                if (i2 < 200) {
                    i2 = Math.max((int) n.b(getContext(), 160.0f), 200);
                    str = str + " fallback_height: " + i2;
                }
                layoutParams.height = i2;
                a("pk_on", str);
                this.dataChannel.b(t.class, Integer.valueOf(i2));
            }
        } else if (pVar.f15136a == 1) {
            this.o = null;
            layoutParams.height = (int) n.b(getContext(), 220.0f);
            a("pk_off", "height:" + layoutParams.height);
            this.dataChannel.b(t.class, (Object) 0);
            this.dataChannel.b(ab.class, (Object) true);
        }
        l();
        getView().setLayoutParams(layoutParams);
        be beVar = new be();
        beVar.f18256a = layoutParams.height + layoutParams.bottomMargin + dimension;
        this.dataChannel.c(o.class, Integer.valueOf(beVar.f18256a));
        this.dataChannel.c(ed.class, new al(layoutParams.height + layoutParams.bottomMargin));
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.h.a
    public final void a(com.bytedance.android.live.publicscreen.a.d.h hVar) {
        if (hVar instanceof k) {
            if (this.s.itemView.getTranslationY() == 0.0f && this.s.itemView.getVisibility() == 0) {
                this.s.a(this.f12511g.f12348m, hVar, Collections.EMPTY_LIST);
            } else {
                this.z.a((com.bytedance.android.live.publicscreen.a.f.a) this.s, hVar, Collections.EMPTY_LIST);
            }
        }
        if (this.s.itemView.getVisibility() != 0) {
            this.s.itemView.setVisibility(0);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.h.a
    public final void c() {
        this.x.setVisibility(0);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.h.a
    public final void d() {
        this.x.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z n() {
        this.f12508d.clearFocus();
        return z.f158842a;
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final String g() {
        return getClass().getName();
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.h.a
    public final void h() {
        WarningInfoView warningInfoView = this.f12509e;
        if (warningInfoView != null) {
            warningInfoView.setVisibility(8);
            this.p = "";
        }
    }

    /* access modifiers changed from: protected */
    public final void k() {
        if (this.u == a.NORMAL) {
            a(a.NORMAL, true);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void m() {
        d(this.n.getItemCount() - 1);
    }

    @Override // com.bytedance.android.widget.Widget
    public void onResume() {
        super.onResume();
        p pVar = this.t;
        if (pVar != null) {
            a(pVar);
        }
    }

    private int j() {
        h hVar = this.f12511g;
        if (hVar == null || hVar.f12339d == null) {
            return 1;
        }
        return this.f12511g.f12339d.f15791d;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        this.dataChannel.b(this);
        a("onUnload");
        h hVar = this.f12511g;
        if (hVar != null) {
            hVar.b();
        }
        b bVar = this.y;
        if (bVar != null) {
            bVar.dispose();
            this.y = null;
        }
        this.t = null;
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12520a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 6888(0x1ae8, float:9.652E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.live.liveinteract.api.b.n[] r0 = com.bytedance.android.live.liveinteract.api.b.n.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget.AnonymousClass3.f12520a = r2
                com.bytedance.android.live.liveinteract.api.b.n r0 = com.bytedance.android.live.liveinteract.api.b.n.GRID_FIX     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget.AnonymousClass3.f12520a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.live.liveinteract.api.b.n r0 = com.bytedance.android.live.liveinteract.api.b.n.GRID     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget.AnonymousClass3.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public enum a {
        NORMAL,
        FOCUS;

        static {
            Covode.recordClassIndex(6889);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.h.a
    public final void f() {
        if (this.f12511g.c()) {
            this.f12506b.animate().alpha(1.0f).start();
        } else {
            this.f12506b.animate().alpha(0.0f).start();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void o() {
        b.a.a("livesdk_new_message_click").f("click").a(this.dataChannel).a("admin_type", ac.a(this.r, this.dataChannel)).b();
        if (isViewValid()) {
            a(a.NORMAL, false);
            this.s.itemView.animate().withLayer().translationY((float) (-this.s.itemView.getHeight())).setDuration(50).start();
        }
    }

    /* access modifiers changed from: package-private */
    public final void l() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getView().getLayoutParams();
        if (this.f12517m) {
            com.bytedance.android.live.liveinteract.api.b.m mVar = (com.bytedance.android.live.liveinteract.api.b.m) this.dataChannel.b(com.bytedance.android.live.liveinteract.api.au.class);
            if (mVar == null || (mVar.f10000a != com.bytedance.android.live.liveinteract.api.b.n.FLOATING_FIX && (mVar.f10000a != com.bytedance.android.live.liveinteract.api.b.n.FLOATING || mVar.f10001b <= 0))) {
                if (e()) {
                    marginLayoutParams.rightMargin = y.d(R.dimen.wv);
                } else {
                    marginLayoutParams.rightMargin = y.a(8.0f);
                }
                this.dataChannel.a(az.class, (Object) false);
            } else {
                if (mVar.f10000a == com.bytedance.android.live.liveinteract.api.b.n.FLOATING_FIX) {
                    marginLayoutParams.rightMargin = y.d(R.dimen.wy);
                } else {
                    marginLayoutParams.rightMargin = y.d(R.dimen.wx);
                }
                this.dataChannel.a(az.class, (Object) true);
            }
        } else if (this.w) {
            marginLayoutParams.rightMargin = y.d(R.dimen.wx);
            this.dataChannel.a(az.class, (Object) true);
        } else if (this.f12515k || this.f12516l) {
            marginLayoutParams.rightMargin = y.d(R.dimen.ww);
            this.dataChannel.a(az.class, (Object) true);
        } else if (e()) {
            marginLayoutParams.rightMargin = y.d(R.dimen.wv);
            this.dataChannel.a(az.class, (Object) false);
        } else {
            marginLayoutParams.rightMargin = y.a(8.0f);
            this.dataChannel.a(az.class, (Object) false);
        }
        getView().setLayoutParams(marginLayoutParams);
        com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.event.m(marginLayoutParams.rightMargin));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ff, code lost:
        if (r1.getLinkMicInfo() != null) goto L_0x00e5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0114  */
    @Override // com.bytedance.android.live.publicscreen.impl.e.h.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
        // Method dump skipped, instructions count: 301
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget.b():void");
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.h.a
    public final void a() {
        this.n.notifyItemRangeRemoved(0, 70);
    }

    public final void a(a aVar) {
        a(aVar, false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(Integer num) {
        f(num.intValue());
        return z.f158842a;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.h.a
    public final void d(int i2) {
        this.f12508d.d(i2);
        this.f12513i = i2;
    }

    private <T> void a(Class<T> cls) {
        com.bytedance.android.livesdk.an.a.a().a((Class) cls).a(getAutoUnbindTransformer()).d(new i(this));
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.h.a
    public final void c(int i2) {
        this.n.notifyItemRemoved(i2);
        if (i2 != this.n.getItemCount()) {
            a aVar = this.n;
            aVar.notifyItemRangeChanged(i2, aVar.getItemCount() - i2);
        }
    }

    /* access modifiers changed from: protected */
    public final void f(int i2) {
        if (getView() != null) {
            ((ViewGroup.MarginLayoutParams) getView().getLayoutParams()).height = i2;
        }
    }

    public void onEvent(com.bytedance.android.live.liveinteract.api.b.k kVar) {
        this.u = a.NORMAL;
        a(a.NORMAL, false);
        this.n.notifyDataSetChanged();
        this.w = kVar.f9998a;
        this.f12517m = kVar.f9999b;
        l();
    }

    private void a(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "TEXT_MESSAGE_WIDGET_STATUS");
        hashMap.put("reason", str);
        if (isShowing()) {
            str2 = "visible";
        } else {
            str2 = "gone";
        }
        hashMap.put("view_status", str2);
        com.bytedance.android.livesdk.ab.i.b().b("ttlive_msg", hashMap);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.h.a
    public final void b(int i2) {
        this.f12510f.f15815a = (float) j();
        this.n.notifyItemInserted(i2);
        g(this.f12512h + 1);
        if (this.f12512h >= 300) {
            this.u = a.NORMAL;
            g(0);
            this.f12510f.f15815a = 1.0f;
            d(this.n.getItemCount() - 1);
        }
        if (a.NORMAL == this.u || this.f12514j) {
            this.f12514j = true;
            d(this.n.getItemCount() - 1);
        }
    }

    /* access modifiers changed from: package-private */
    public final void e(int i2) {
        int a2;
        if (getView() != null) {
            int d2 = y.d(R.dimen.yy);
            if (i2 <= 0) {
                a2 = 0;
            } else {
                a2 = y.a(8.0f) + i2;
            }
            int i3 = d2 + a2;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getView().getLayoutParams();
            int i4 = layoutParams.bottomMargin;
            if (i2 != -1) {
                layoutParams.height = y.d(R.dimen.x_) - i2;
            }
            getView().setLayoutParams(layoutParams);
            ValueAnimator ofInt = ValueAnimator.ofInt(i4, i3);
            ofInt.setDuration(300L);
            ofInt.addUpdateListener(new n(this, layoutParams));
            ofInt.start();
        }
    }

    public final void g(int i2) {
        String str;
        if (isViewValid()) {
            if (a.NORMAL == this.u || i2 <= 0) {
                this.f12505a.setVisibility(4);
                this.f12512h = 0;
                return;
            }
            this.f12512h = i2;
            if (i2 < 100) {
                str = String.valueOf(i2);
            } else {
                str = "99+";
            }
            this.f12505a.setText(this.context.getResources().getString(R.string.gln, str));
            if (this.f12505a.getVisibility() != 0) {
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                translateAnimation.setDuration(100);
                this.f12505a.startAnimation(translateAnimation);
            }
            this.f12505a.setVisibility(0);
        }
    }

    public void onEvent(com.bytedance.android.live.publicscreen.a.b.a aVar) {
        bw bwVar = aVar.f12174a;
        if (bwVar != null && "6".equals(bwVar.f19381j)) {
            this.dataChannel.c(ah.class, new d(bwVar.f19380i));
            h hVar = this.f12511g;
            if (!(hVar == null || hVar.y == null)) {
                for (int i2 = 0; i2 < hVar.f12345j.size(); i2++) {
                    com.bytedance.android.live.publicscreen.a.d.h hVar2 = hVar.f12345j.get(i2);
                    if ((hVar2 instanceof k) && bwVar == ((k) hVar2).f12190d) {
                        hVar.b(i2);
                        ((h.a) hVar.y).d(hVar.f12345j.size() - 1);
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(Boolean bool) {
        if (bool.booleanValue()) {
            this.f12508d.b(this.n.getItemCount() - 1);
            this.dataChannel.b(ab.class, (Object) false);
        }
        return z.f158842a;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object... objArr) {
        com.bytedance.android.live.publicscreen.impl.f.a aVar = new com.bytedance.android.live.publicscreen.impl.f.a();
        this.q = aVar;
        DataChannel dataChannel = this.dataChannel;
        l.d(dataChannel, "");
        aVar.f12368c = dataChannel;
        this.n = new a();
        this.x = findViewById(R.id.ejp);
        this.f12508d = (LiveMessageRecyclerView) findViewById(R.id.clw);
        this.f12505a = (TextView) findViewById(R.id.clv);
        this.f12509e = (WarningInfoView) findViewById(R.id.flv);
        this.f12506b = findViewById(R.id.bh1);
        this.z = new com.bytedance.android.live.publicscreen.impl.widget.a.c();
        View findViewById = findViewById(R.id.b7_);
        this.s = new c(findViewById);
        ScrollHeaderBehavior scrollHeaderBehavior = (ScrollHeaderBehavior) ((CoordinatorLayout.e) this.f12508d.getLayoutParams()).f2100a;
        if (scrollHeaderBehavior != null) {
            scrollHeaderBehavior.f15047a = new b(this);
        }
        SuctionBottomBehavior suctionBottomBehavior = (SuctionBottomBehavior) ((CoordinatorLayout.e) findViewById.getLayoutParams()).f2100a;
        if (suctionBottomBehavior != null) {
            if (LivePublicScreenConfigSetting.getValue().f15790c == 1) {
                suctionBottomBehavior.f15051b = true;
            } else if (LivePublicScreenConfigSetting.getValue().f15790c == 2) {
                suctionBottomBehavior.f15051b = false;
            }
        }
        if (this.f12507c) {
            this.f12506b.setVisibility(0);
            this.f12506b.setAlpha(0.0f);
        } else {
            this.f12506b.setVisibility(8);
        }
        this.f12510f = new SmoothLinearLayoutManager();
        if (LivePublicScreenConfigSetting.getValue().f15790c != 0) {
            this.f12510f.a(true);
        }
        this.f12510f.f15815a = 1.0f;
        this.f12510f.f15816b = true;
        this.f12508d.setLayoutManager(this.f12510f);
        this.f12508d.setItemAnimator(null);
        this.f12508d.a(new u((int) n.b(this.context, 4.0f)));
        this.f12508d.setDisableAllowIntercept(false);
        this.f12508d.setAdapter(this.n);
        l.d(this.f12508d, "");
        this.f12508d.a(new RecyclerView.n() {
            /* class com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget.AnonymousClass1 */

            static {
                Covode.recordClassIndex(6886);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2) {
                super.a(recyclerView, i2);
                if (i2 == 1) {
                    PublicScreenWidget.this.f12514j = false;
                } else if (i2 == 0 && PublicScreenWidget.this.f12514j) {
                    PublicScreenWidget.this.a(a.NORMAL);
                }
                com.bytedance.android.live.publicscreen.impl.f.a aVar = PublicScreenWidget.this.q;
                String a2 = ac.a(PublicScreenWidget.this.r, PublicScreenWidget.this.dataChannel);
                l.d(a2, "");
                if (i2 == 1) {
                    aVar.a(true, a2);
                } else {
                    aVar.a(false, a2);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2, int i3) {
                super.a(recyclerView, i2, i3);
                if (!recyclerView.canScrollVertically(1)) {
                    PublicScreenWidget.this.a(a.NORMAL);
                } else if (!PublicScreenWidget.this.f12514j) {
                    int m2 = PublicScreenWidget.this.f12510f.m();
                    if (m2 > PublicScreenWidget.this.f12513i) {
                        PublicScreenWidget publicScreenWidget = PublicScreenWidget.this;
                        publicScreenWidget.g(publicScreenWidget.f12512h - (m2 - PublicScreenWidget.this.f12513i));
                        PublicScreenWidget.this.f12513i = m2;
                    }
                } else {
                    return;
                }
                com.bytedance.android.live.publicscreen.impl.f.a aVar = PublicScreenWidget.this.q;
                if (aVar.f12367b) {
                    aVar.f12366a += i3;
                }
            }
        });
        this.f12508d.setOnTouchListener(new c(this));
        this.f12508d.setOnFlingListener(new RecyclerView.l() {
            /* class com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget.AnonymousClass2 */

            static {
                Covode.recordClassIndex(6887);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.l
            public final boolean a(int i2, int i3) {
                if (i3 != 0) {
                    return false;
                }
                if (!PublicScreenWidget.this.f12508d.canScrollVertically(1)) {
                    PublicScreenWidget.this.a(a.NORMAL);
                    return false;
                }
                PublicScreenWidget.this.a(a.FOCUS);
                int m2 = PublicScreenWidget.this.f12510f.m();
                if (m2 <= PublicScreenWidget.this.f12513i) {
                    return false;
                }
                PublicScreenWidget publicScreenWidget = PublicScreenWidget.this;
                publicScreenWidget.g(publicScreenWidget.f12512h - (m2 - PublicScreenWidget.this.f12513i));
                PublicScreenWidget.this.f12513i = m2;
                return false;
            }
        });
        this.f12505a.setOnClickListener(new m(this));
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object... objArr) {
        boolean z2;
        this.f12509e.setVisibility(8);
        i();
        if (this.dataChannel.b(com.bytedance.android.live.publicscreen.a.i.class) != null) {
            this.f12511g = (h) this.dataChannel.b(com.bytedance.android.live.publicscreen.a.i.class);
        } else if (this.dataChannel.b(di.class) != null) {
            this.f12511g = new h();
        } else {
            return;
        }
        this.f12511g.a((h.a) this);
        this.dataChannel.a(com.bytedance.android.live.publicscreen.a.i.class, this.f12511g);
        Room room = (Room) this.dataChannel.b(df.class);
        this.r = room;
        if (room != null) {
            if (room.getStreamType() == com.bytedance.android.livesdkapi.depend.model.live.i.THIRD_PARTY) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.v = z2;
            if (this.f12511g.f12348m.f12203g) {
                e(((Integer) this.dataChannel.b(e.class)).intValue());
                this.dataChannel.a((m) this, e.class, (h.f.a.b) new o(this));
            }
        }
        a(com.bytedance.android.live.publicscreen.a.b.a.class);
        a(com.bytedance.android.live.liveinteract.api.b.k.class);
        this.dataChannel.a((Object) this, ab.class, (h.f.a.b) new p(this)).b((m) this, com.bytedance.android.livesdk.j.p.class, (h.f.a.b) new q(this)).b((m) this, com.bytedance.android.livesdk.aq.c.class, (h.f.a.b) new r(this)).a((Object) this, com.bytedance.android.live.liveinteract.api.t.class, (h.f.a.b) new s(this)).a((m) this, com.bytedance.android.live.liveinteract.api.h.class, (h.f.a.b) new t(this)).a((m) this, cq.class, (h.f.a.b) new d(this)).a(dy.class, (h.f.a.b) new e(this)).a(cb.class, (h.f.a.b) new f(this)).a(com.bytedance.android.live.liveinteract.api.au.class, (h.f.a.b) new g(this));
        g(0);
        a("onLoad");
        this.dataChannel.c(j.class);
        this.n.f12524a = this.f12511g.f12348m;
        this.z.f12173a = this.f12511g.f12348m;
        a aVar = this.n;
        aVar.a(com.bytedance.android.live.publicscreen.impl.model.p.class, (com.bytedance.android.live.publicscreen.a.a.a) new com.bytedance.android.live.publicscreen.impl.widget.a.d());
        aVar.a(com.bytedance.android.live.publicscreen.impl.model.chat.a.class, (com.bytedance.android.live.publicscreen.a.a.a) new com.bytedance.android.live.publicscreen.impl.widget.a.b());
        aVar.a(com.bytedance.android.live.publicscreen.a.d.j.class, (com.bytedance.android.live.publicscreen.a.a.a) new com.bytedance.android.live.publicscreen.impl.widget.a.a());
        aVar.a(k.class, (com.bytedance.android.live.publicscreen.a.a.a) new com.bytedance.android.live.publicscreen.impl.widget.a.c());
        List<com.bytedance.android.live.publicscreen.a.e.e> onRegistryReadyListeners = ((com.bytedance.android.live.publicscreen.a.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.publicscreen.a.e.class)).getOnRegistryReadyListeners();
        if (!onRegistryReadyListeners.isEmpty()) {
            for (com.bytedance.android.live.publicscreen.a.e.e eVar : onRegistryReadyListeners) {
                eVar.a(this.n);
            }
        }
        this.n.a(this.f12511g.f12345j);
        this.n.notifyDataSetChanged();
        this.f12508d.postDelayed(new h(this), 100);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.h.a
    public final void a(int i2) {
        this.f12510f.f15815a = (float) j();
        this.n.notifyItemChanged(i2);
        if (a.NORMAL == this.u || this.f12514j) {
            this.f12514j = true;
            d(this.n.getItemCount() - 1);
        }
    }

    private void a(a aVar, boolean z2) {
        if (this.u != aVar || z2) {
            this.u = aVar;
            if (a.NORMAL == aVar) {
                g(0);
                this.f12510f.f15815a = 1.0f;
                d(this.n.getItemCount() - 1);
            }
        }
    }

    public static void a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "on_adjust_text_message_widget");
        hashMap.put("adjust_reason", str);
        if (str2 != null) {
            hashMap.put("adjust_param", str2);
        }
        com.bytedance.android.livesdk.ab.i.b().a("ttlive_room", hashMap);
    }
}
