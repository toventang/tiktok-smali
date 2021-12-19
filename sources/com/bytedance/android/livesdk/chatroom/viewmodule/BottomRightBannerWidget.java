package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.net.Uri;
import android.os.Build;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.b.f;
import com.bytedance.android.live.banner.InRoomBannerManager;
import com.bytedance.android.live.core.f.j;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.u.g;
import com.bytedance.android.live.u.h;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.chatroom.e.b;
import com.bytedance.android.livesdk.j.ba;
import com.bytedance.android.livesdk.j.bl;
import com.bytedance.android.livesdk.j.cq;
import com.bytedance.android.livesdk.j.cz;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.eb;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.j.o;
import com.bytedance.android.livesdk.j.p;
import com.bytedance.android.livesdk.livesetting.banner.InteractEnsureLazyLoadBannerWebviewSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMtMockLandscapeSetting;
import com.bytedance.android.livesdk.model.message.ag;
import com.bytedance.android.livesdk.model.message.bi;
import com.bytedance.android.livesdk.model.message.c;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.ac;
import com.bytedance.android.livesdk.util.rxutils.autodispose.e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import f.a.ab;
import f.a.b.a;
import h.z;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public class BottomRightBannerWidget extends LiveRecyclableWidget implements b.a, au {

    /* renamed from: a  reason: collision with root package name */
    d.f f16246a;

    /* renamed from: b  reason: collision with root package name */
    Room f16247b;

    /* renamed from: c  reason: collision with root package name */
    boolean f16248c;

    /* renamed from: d  reason: collision with root package name */
    d f16249d;

    /* renamed from: e  reason: collision with root package name */
    c f16250e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16251f;

    /* renamed from: g  reason: collision with root package name */
    boolean f16252g;

    /* renamed from: h  reason: collision with root package name */
    boolean f16253h;

    /* renamed from: i  reason: collision with root package name */
    boolean f16254i = false;

    /* renamed from: j  reason: collision with root package name */
    private b f16255j;

    /* renamed from: k  reason: collision with root package name */
    private bp f16256k;

    /* renamed from: l  reason: collision with root package name */
    private final a f16257l = new a();

    /* renamed from: m  reason: collision with root package name */
    private boolean f16258m;
    private boolean n = false;

    static {
        Covode.recordClassIndex(9003);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final void a(Throwable th) {
        br.a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bgn;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final String g() {
        return getClass().getName();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16260a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 9005(0x232d, float:1.2619E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.live.base.model.user.b$a[] r0 = com.bytedance.android.live.base.model.user.b.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget.AnonymousClass2.f16260a = r2
                com.bytedance.android.live.base.model.user.b$a r0 = com.bytedance.android.live.base.model.user.b.a.Login     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget.AnonymousClass2.f16260a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.live.base.model.user.b$a r0 = com.bytedance.android.live.base.model.user.b.a.Logout     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget.AnonymousClass2.f16260a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.android.live.base.model.user.b$a r0 = com.bytedance.android.live.base.model.user.b.a.Update     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget.AnonymousClass2.<clinit>():void");
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void onPause() {
        super.onPause();
        if (this.f16249d != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("foreground", false);
                jSONObject.put(StringSet.type, "app");
                jSONObject.put("args", jSONObject2);
                this.f16249d.a(this.f16246a, "H5_appStateChange", jSONObject);
                this.f16249d.a(this.f16246a, "container_disappear", new JSONObject());
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void onResume() {
        super.onResume();
        if (this.f16249d != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("foreground", true);
                jSONObject.put(StringSet.type, "app");
                jSONObject.put("args", jSONObject2);
                this.f16249d.a(this.f16246a, "H5_appStateChange", jSONObject);
                this.f16249d.a(this.f16246a, "container_appear", new JSONObject());
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        this.f16255j.b();
        a aVar = this.f16257l;
        if (aVar != null) {
            aVar.a();
        }
        this.dataChannel.b(o.class, (Object) false);
        this.dataChannel.b(p.class, (Object) false);
        this.f16256k = null;
        d dVar = this.f16249d;
        if (dVar != null) {
            dVar.a(this.f16246a);
        }
        this.f16246a = null;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        boolean a2 = a();
        if (getView() != null && (getView().getLayoutParams() instanceof RelativeLayout.LayoutParams) && ((RelativeLayout.LayoutParams) getView().getLayoutParams()).getRules()[10] == -1) {
            if (a2) {
                hide();
                com.bytedance.android.live.broadcast.e.a.b("task_banner");
            } else {
                d.f fVar = this.f16246a;
                if (!(fVar == null || fVar.f14313a == null || this.f16246a.f14313a.getVisibility() != 0)) {
                    show();
                }
            }
            this.dataChannel.b(p.class, Boolean.valueOf(isShowing()));
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        boolean z;
        d.f fVar;
        if (this.f16252g || this.f16253h || this.f16258m) {
            z = false;
        } else {
            z = true;
        }
        if (getView() != null) {
            if (!z || (fVar = this.f16246a) == null || fVar.f14313a == null || this.f16246a.f14313a.getVisibility() != 0) {
                hide();
            } else {
                show();
            }
            d.f fVar2 = this.f16246a;
            if (fVar2 != null && fVar2.f14313a != null && this.f16246a.f14313a.getVisibility() == 0) {
                this.dataChannel.b(p.class, Boolean.valueOf(z));
            }
        }
    }

    private void d() {
        MethodCollector.i(5819);
        if (this.n) {
            MethodCollector.o(5819);
            return;
        }
        this.n = true;
        d webViewManager = ((f) com.bytedance.android.live.t.a.a(f.class)).webViewManager();
        this.f16249d = webViewManager;
        try {
            this.f16246a = webViewManager.a(com.bytedance.android.livesdk.utils.p.a(this.context), new d.e() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(9004);
                }

                @Override // com.bytedance.android.livesdk.browser.c.d.e
                public final void a(WebView webView, String str) {
                    String str2;
                    BottomRightBannerWidget bottomRightBannerWidget = BottomRightBannerWidget.this;
                    if (bottomRightBannerWidget.isViewValid() && webView != null) {
                        bottomRightBannerWidget.show();
                        bottomRightBannerWidget.b();
                        webView.setVisibility(0);
                        if (bottomRightBannerWidget.isShowing()) {
                            bottomRightBannerWidget.dataChannel.b(p.class, (Object) true);
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (bottomRightBannerWidget.f16250e != null) {
                                jSONObject.put("data", com.bytedance.android.livesdk.util.a.a(bottomRightBannerWidget.f16250e.f19404a.f19412b));
                                jSONObject.put(StringSet.type, "init");
                                bottomRightBannerWidget.f16249d.a(bottomRightBannerWidget.f16246a, "H5_roomStatusChange", jSONObject);
                                for (com.bytedance.android.livesdk.model.i iVar : bottomRightBannerWidget.f16250e.f19404a.f19412b) {
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("banner_id", String.valueOf(iVar.f19071a));
                                    hashMap.put("request_page", "bottomright");
                                    com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_live_banner_show").a((Map<String, String>) hashMap).a(bottomRightBannerWidget.dataChannel);
                                    if (bottomRightBannerWidget.f16248c) {
                                        str2 = "live_take_detail";
                                    } else {
                                        str2 = "live_detail";
                                    }
                                    a2.d(str2).b();
                                }
                                if (!bottomRightBannerWidget.f16254i) {
                                    bottomRightBannerWidget.dataChannel.c(bl.class, false);
                                } else if (bottomRightBannerWidget.isShowing()) {
                                    bottomRightBannerWidget.dataChannel.c(bl.class, true);
                                }
                            }
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                    }
                    com.bytedance.android.live.broadcast.e.a.a("activity_banner");
                }
            });
        } catch (Throwable th) {
            com.bytedance.android.live.core.c.a.a("BottomRightBannerWidget", th);
        }
        if (this.f16246a != null) {
            if (Build.VERSION.SDK_INT <= 19) {
                this.f16246a.f14313a.setLayerType(1, null);
            }
            this.f16246a.f14313a.setBackgroundColor(0);
            this.f16246a.f14313a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            if (((ViewGroup) getView()).getChildCount() == 0) {
                ((ViewGroup) Objects.requireNonNull(getView())).addView(this.f16246a.f14313a);
            }
            this.f16246a.f14313a.setVisibility(4);
        }
        MethodCollector.o(5819);
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        if (this.dataChannel == null) {
            return false;
        }
        Boolean bool = (Boolean) this.dataChannel.b(com.bytedance.android.livesdk.j.a.class);
        Boolean bool2 = (Boolean) this.dataChannel.b(eb.class);
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        if (bool2 == null || !bool2.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.b.a
    public final void a(c cVar) {
        if (h.d()) {
            androidx.core.d.c.a(j.a(), new g(this, cVar), this, 3000);
        } else {
            b(cVar);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object... objArr) {
        if (!InteractEnsureLazyLoadBannerWebviewSetting.INSTANCE.getValue() && !h.d()) {
            d();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        d.f fVar = this.f16246a;
        if (fVar != null && fVar.f14313a != null) {
            this.f16246a.f14313a.setFocusable(!z);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(com.bytedance.android.live.liveinteract.api.b.h hVar) {
        com.bytedance.android.live.core.c.a.a(3, "BottomRightBannerWidget", "notify H5 link status , " + hVar.f9995a);
        d.f fVar = this.f16246a;
        if (fVar == null || fVar.f14314b == null || this.f16246a.f14314b.a() == null) {
            com.bytedance.android.live.core.c.a.a(6, "BottomRightBannerWidget", "notify H5 link status ,but web not available");
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("status", hVar.f9995a);
                this.f16246a.f14314b.a().a("H5_linkMicStatusChanged", jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
                com.bytedance.android.live.core.c.a.b("BottomRightBannerWidget", "notify H5 link status error", e2);
            }
        }
        return z.f158842a;
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.b.a
    public final void a(ag agVar) {
        if (InteractEnsureLazyLoadBannerWebviewSetting.INSTANCE.getValue() || h.d()) {
            d();
        }
        if (isViewValid() && agVar != null && this.f16246a != null) {
            ((ac) ab.a(agVar.f19130a).a(f.a.h.a.b(f.a.k.a.f158006c)).c(i.f16508a).c(new j(this)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a((f.a.ac) WidgetExtendsKt.autoDispose(this))).a(new k(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(c cVar) {
        if (!isViewValid() || cVar == null || cVar.f19404a == null || com.bytedance.common.utility.h.a(cVar.f19404a.f19412b)) {
            this.dataChannel.b(o.class, (Object) false);
            d.f fVar = this.f16246a;
            if (fVar != null) {
                fVar.f14313a.setVisibility(8);
                return;
            }
            return;
        }
        if (InteractEnsureLazyLoadBannerWebviewSetting.INSTANCE.getValue() || h.d()) {
            d();
        }
        this.dataChannel.b(o.class, (Object) true);
        d.f fVar2 = this.f16246a;
        if (fVar2 != null) {
            fVar2.f14313a.setVisibility(4);
        }
        this.f16250e = cVar;
        Uri.Builder appendQueryParameter = Uri.parse(this.f16255j.a(cVar.f19404a.f19411a)).buildUpon().appendQueryParameter("request_page", "bottomright").appendQueryParameter("room_id", String.valueOf(this.f16247b.getId())).appendQueryParameter("anchor_id", String.valueOf(this.f16247b.getOwner().getId())).appendQueryParameter("user_id", String.valueOf(u.a().b().c()));
        if (this.f16249d != null) {
            g.a(new h(this, appendQueryParameter), this);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.b.a
    public final void a(bi biVar) {
        if (InteractEnsureLazyLoadBannerWebviewSetting.INSTANCE.getValue() || h.d()) {
            d();
        }
        Boolean bool = (Boolean) this.dataChannel.b(o.class);
        if (bool == null || !bool.booleanValue()) {
            d.f fVar = this.f16246a;
            if (fVar != null) {
                fVar.f14313a.setVisibility(4);
                if (isShowing()) {
                    this.dataChannel.b(p.class, (Object) true);
                }
            }
            this.dataChannel.b(o.class, (Object) true);
        }
        Uri parse = Uri.parse(biVar.f19331f);
        if (this.f16249d != null && this.f16246a != null && parse != null) {
            this.f16249d.a(this.f16246a, parse.buildUpon().appendQueryParameter("request_page", "bottomright").appendQueryParameter("room_id", String.valueOf(this.f16247b.getId())).appendQueryParameter("anchor_id", String.valueOf(this.f16247b.getOwner().getId())).appendQueryParameter("user_id", String.valueOf(u.a().b().c())).toString());
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object... objArr) {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        if (this.f16251f) {
            layoutParams.width = -1;
            layoutParams.height = -1;
        } else {
            layoutParams.width = y.d(R.dimen.zi);
            layoutParams.height = y.d(R.dimen.zh);
        }
        getView().setLayoutParams(layoutParams);
        d.f fVar = this.f16246a;
        if (fVar != null) {
            fVar.f14313a.setVisibility(4);
        }
        this.dataChannel.b(p.class, (Object) false);
        this.f16248c = ((Boolean) this.dataChannel.b(ee.class)).booleanValue();
        if (this.dataChannel.b(df.class) != null) {
            this.f16247b = (Room) this.dataChannel.b(df.class);
            a aVar = this.f16257l;
            if (aVar != null) {
                aVar.a();
            }
            if ((getView().getLayoutParams() instanceof RelativeLayout.LayoutParams) && !LiveMtMockLandscapeSetting.INSTANCE.getValue()) {
                this.dataChannel.b((m) this, cz.class, (h.f.a.b) new a(this));
            }
            this.dataChannel.b((m) this, com.bytedance.android.livesdk.aq.c.class, (h.f.a.b) new b(this));
            this.dataChannel.b((m) this, com.bytedance.android.livesdk.aq.a.class, (h.f.a.b) new m(this));
            this.dataChannel.a((m) this, com.bytedance.android.live.n.ab.class, (h.f.a.b) new n(this));
            com.bytedance.android.livesdk.chatroom.e.b bVar = new com.bytedance.android.livesdk.chatroom.e.b(this.f16247b, this.f16248c);
            this.f16255j = bVar;
            bVar.a((b.a) this);
            ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) InRoomBannerManager.a(Long.valueOf(this.f16247b.getId())).a(WidgetExtendsKt.autoDispose(this))).a(new o(this), new p(this));
            this.dataChannel.a((m) this, ba.class, (h.f.a.b) new q(this)).a((m) this, cq.class, (h.f.a.b) new r(this)).a((m) this, com.bytedance.android.live.liveinteract.api.h.class, (h.f.a.b) new s(this)).a((m) this, com.bytedance.android.livesdk.j.b.class, (h.f.a.b) new t(this)).a((m) this, com.bytedance.android.livesdk.j.c.class, (h.f.a.b) new c(this)).a((m) this, com.bytedance.android.live.liveinteract.api.b.i.class, (h.f.a.b) new d(this));
            this.f16257l.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.event.c.class).d(new l(this)));
            ((com.bytedance.android.livesdk.util.rxutils.autodispose.y) u.a().b().h().c().a(e.f16502a).a(e.a(this))).a(new f(this));
        }
    }
}
