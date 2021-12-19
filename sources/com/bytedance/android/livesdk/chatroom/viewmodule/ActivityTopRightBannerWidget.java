package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.net.Uri;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.j;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.e;
import com.bytedance.android.live.u.h;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.chatroom.e.a;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.LiveBannerExperiment;
import com.bytedance.android.livesdk.livesetting.banner.InteractEnsureLazyLoadBannerWebviewSetting;
import com.bytedance.android.livesdk.model.message.ag;
import com.bytedance.android.livesdk.model.message.c;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.ac;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.google.gson.o;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import f.a.ab;
import f.a.d.g;
import h.f.b.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class ActivityTopRightBannerWidget extends LiveRecyclableWidget implements a.AbstractC0326a, au {

    /* renamed from: g  reason: collision with root package name */
    public static final a f16227g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Room f16228a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16229b;

    /* renamed from: c  reason: collision with root package name */
    com.bytedance.android.livesdk.model.message.c f16230c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.livesdk.browser.c.d f16231d;

    /* renamed from: e  reason: collision with root package name */
    public d.f f16232e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f16233f = LiveBannerExperiment.isNewBannerEnable();

    /* renamed from: h  reason: collision with root package name */
    private com.bytedance.android.livesdk.chatroom.e.a f16234h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f16235i = true;

    /* renamed from: j  reason: collision with root package name */
    private boolean f16236j = true;

    /* renamed from: k  reason: collision with root package name */
    private boolean f16237k;

    static {
        Covode.recordClassIndex(8992);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final void a(Throwable th) {
        br.a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bgk;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(8993);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ActivityTopRightBannerWidget f16239a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.model.message.c f16240b;

        static {
            Covode.recordClassIndex(8995);
        }

        c(ActivityTopRightBannerWidget activityTopRightBannerWidget, com.bytedance.android.livesdk.model.message.c cVar) {
            this.f16239a = activityTopRightBannerWidget;
            this.f16240b = cVar;
        }

        public final void run() {
            this.f16239a.b(this.f16240b);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void hide() {
        this.f16236j = false;
        super.hide();
    }

    private final void b() {
        this.f16236j = false;
        View view = getView();
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final String g() {
        return getClass().getName();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void show() {
        if (this.f16235i) {
            super.show();
        } else {
            this.f16236j = true;
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        d.f fVar = this.f16232e;
        if (fVar != null) {
            fVar.a("container_disappear", new JSONObject());
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        d.f fVar = this.f16232e;
        if (fVar != null) {
            fVar.a("container_appear", new JSONObject());
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        resetAnim();
        com.bytedance.android.livesdk.chatroom.e.a aVar = this.f16234h;
        if (aVar == null) {
            l.a("mPresenter");
        }
        aVar.b();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.b(com.bytedance.android.livesdk.j.a.class, (Object) false);
        }
        com.bytedance.android.livesdk.browser.c.d dVar = this.f16231d;
        if (dVar != null) {
            dVar.a(this.f16232e);
        }
        this.f16232e = null;
    }

    private final void a() {
        WebView webView;
        d.f fVar;
        MethodCollector.i(5734);
        if (this.f16237k) {
            MethodCollector.o(5734);
            return;
        }
        this.f16237k = true;
        this.f16231d = ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager();
        ViewGroup viewGroup = null;
        try {
            androidx.fragment.app.e a2 = p.a(this.context);
            if (a2 != null) {
                com.bytedance.android.livesdk.browser.c.d dVar = this.f16231d;
                if (dVar != null) {
                    fVar = dVar.a(a2, new b(this));
                } else {
                    fVar = null;
                }
                this.f16232e = fVar;
            }
        } catch (Throwable th) {
            com.bytedance.android.live.core.c.a.a("MicRoomBannerWidget", th);
        }
        d.f fVar2 = this.f16232e;
        if (fVar2 == null || (webView = fVar2.f14313a) == null) {
            MethodCollector.o(5734);
            return;
        }
        webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        webView.setBackgroundColor(0);
        View view = getView();
        if (!(view instanceof ViewGroup)) {
            view = null;
        }
        ViewGroup viewGroup2 = (ViewGroup) view;
        if (viewGroup2 != null) {
            if (viewGroup2.getChildCount() == 0) {
                View view2 = getView();
                if (view2 instanceof ViewGroup) {
                    viewGroup = view2;
                }
                ViewGroup viewGroup3 = viewGroup;
                if (viewGroup3 != null) {
                    viewGroup3.addView(webView);
                    MethodCollector.o(5734);
                    return;
                }
            }
            MethodCollector.o(5734);
            return;
        }
        MethodCollector.o(5734);
    }

    static final class d<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final d f16241a = new d();

        static {
            Covode.recordClassIndex(8996);
        }

        d() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            o oVar = (o) obj;
            l.d(oVar, "");
            return e.a.f9628b.a((com.google.gson.l) oVar);
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ActivityTopRightBannerWidget f16243a;

        static {
            Covode.recordClassIndex(8998);
        }

        f(ActivityTopRightBannerWidget activityTopRightBannerWidget) {
            this.f16243a = activityTopRightBannerWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            com.bytedance.android.livesdk.browser.c.d dVar = this.f16243a.f16231d;
            if (dVar != null) {
                dVar.a(this.f16243a.f16232e, "H5_roomStatusChange", jSONObject);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.a.AbstractC0326a
    public final void a(int i2) {
        if (i2 == 0) {
            this.f16235i = true;
            if (this.f16236j) {
                super.show();
                return;
            }
            return;
        }
        this.f16235i = false;
        super.hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (!InteractEnsureLazyLoadBannerWebviewSetting.INSTANCE.getValue() && !h.d()) {
            a();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        boolean z;
        WebView webView;
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.b(df.class);
        } else {
            room = null;
        }
        this.f16228a = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (bool = (Boolean) dataChannel2.b(ee.class)) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        this.f16229b = z;
        d.f fVar = this.f16232e;
        if (!(fVar == null || (webView = fVar.f14313a) == null)) {
            webView.setVisibility(4);
        }
        b();
        com.bytedance.android.livesdk.chatroom.e.a aVar = new com.bytedance.android.livesdk.chatroom.e.a();
        this.f16234h = aVar;
        aVar.a((a.AbstractC0326a) this);
    }

    static final class e<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ActivityTopRightBannerWidget f16242a;

        static {
            Covode.recordClassIndex(8997);
        }

        e(ActivityTopRightBannerWidget activityTopRightBannerWidget) {
            this.f16242a = activityTopRightBannerWidget;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            String str;
            Long l2;
            Long l3;
            String str2;
            l.d(obj, "");
            String a2 = com.bytedance.android.livesdk.ab.e.a();
            String d2 = com.bytedance.android.livesdk.ab.e.d();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.type, "refresh");
            jSONObject.put("data", obj);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("enter_from_merge", a2);
            jSONObject2.put("enter_method", d2);
            if (this.f16242a.f16229b) {
                str = "live_take_detail";
            } else {
                str = "live_detail";
            }
            jSONObject2.put("event_page", str);
            Room room = this.f16242a.f16228a;
            String str3 = null;
            if (room != null) {
                l2 = Long.valueOf(room.getId());
            } else {
                l2 = null;
            }
            jSONObject2.put("room_id", String.valueOf(l2));
            Room room2 = this.f16242a.f16228a;
            if (room2 != null) {
                l3 = Long.valueOf(room2.getOwnerUserId());
            } else {
                l3 = null;
            }
            jSONObject2.put("anchor_id", String.valueOf(l3));
            Room room3 = this.f16242a.f16228a;
            if (room3 != null) {
                str2 = room3.getRequestId();
            } else {
                str2 = null;
            }
            jSONObject2.put("request_id", str2);
            Room room4 = this.f16242a.f16228a;
            if (room4 != null) {
                str3 = room4.getLog_pb();
            }
            jSONObject2.put("log_pb", str3);
            jSONObject.put("log", jSONObject2);
            return jSONObject;
        }
    }

    public final void b(com.bytedance.android.livesdk.model.message.c cVar) {
        Long l2;
        User owner;
        WebView webView;
        c.a aVar = cVar.f19408e;
        if (!this.isViewValid || aVar == null || com.bytedance.common.utility.h.a(aVar.f19412b)) {
            a(false, 8);
            return;
        }
        if (InteractEnsureLazyLoadBannerWebviewSetting.INSTANCE.getValue() || h.d()) {
            a();
        }
        this.f16230c = cVar;
        a(true, 0);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.c(com.bytedance.android.livesdk.j.c.class, true);
        }
        d.f fVar = this.f16232e;
        if (!(fVar == null || (webView = fVar.f14313a) == null)) {
            webView.setVisibility(4);
        }
        b();
        com.bytedance.android.livesdk.chatroom.e.a aVar2 = this.f16234h;
        if (aVar2 == null) {
            l.a("mPresenter");
        }
        String str = aVar.f19411a;
        l.b(str, "");
        Uri.Builder buildUpon = Uri.parse(aVar2.a(str)).buildUpon();
        buildUpon.appendQueryParameter("request_page", "bottomright");
        Room room = this.f16228a;
        Long l3 = null;
        if (room != null) {
            l2 = Long.valueOf(room.getId());
        } else {
            l2 = null;
        }
        buildUpon.appendQueryParameter("room_id", String.valueOf(l2));
        Room room2 = this.f16228a;
        if (!(room2 == null || (owner = room2.getOwner()) == null)) {
            l3 = Long.valueOf(owner.getId());
        }
        buildUpon.appendQueryParameter("anchor_id", String.valueOf(l3));
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        l.b(b2, "");
        buildUpon.appendQueryParameter("user_id", String.valueOf(b2.c()));
        com.bytedance.android.livesdk.browser.c.d dVar = this.f16231d;
        if (dVar != null) {
            dVar.a(this.f16232e, buildUpon.toString());
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.a.AbstractC0326a
    public final void a(ag agVar) {
        if (InteractEnsureLazyLoadBannerWebviewSetting.INSTANCE.getValue() || h.d()) {
            a();
        }
        if (this.isViewValid && agVar != null && this.f16232e != null) {
            ((ac) ab.a(agVar.f19130a).a(f.a.h.a.b(f.a.k.a.f158006c)).c(d.f16241a).c(new e(this)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a((f.a.ac) WidgetExtendsKt.autoDispose(this))).a(new f(this));
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.a.AbstractC0326a
    public final void a(com.bytedance.android.livesdk.model.message.c cVar) {
        l.d(cVar, "");
        if (h.d()) {
            androidx.core.d.c.a(j.a(), new c(this, cVar), this, 5000);
        } else {
            b(cVar);
        }
    }

    private final void a(boolean z, int i2) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.b(com.bytedance.android.livesdk.j.a.class, Boolean.valueOf(z));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.c(com.bytedance.android.livesdk.j.b.class, Boolean.valueOf(z));
        }
        if (i2 == 0) {
            show();
        } else {
            hide();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements d.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ActivityTopRightBannerWidget f16238a;

        static {
            Covode.recordClassIndex(8994);
        }

        b(ActivityTopRightBannerWidget activityTopRightBannerWidget) {
            this.f16238a = activityTopRightBannerWidget;
        }

        @Override // com.bytedance.android.livesdk.browser.c.d.e
        public final void a(WebView webView, String str) {
            float f2;
            float f3;
            ActivityTopRightBannerWidget activityTopRightBannerWidget = this.f16238a;
            if (activityTopRightBannerWidget.isViewValid()) {
                if (webView != null) {
                    webView.setVisibility(0);
                    if (activityTopRightBannerWidget.f16233f) {
                        f2 = 148.0f;
                    } else {
                        f2 = 168.0f;
                    }
                    int a2 = y.a(f2);
                    if (activityTopRightBannerWidget.f16233f) {
                        f3 = 40.0f;
                    } else {
                        f3 = 54.0f;
                    }
                    webView.setLayoutParams(new FrameLayout.LayoutParams(a2, y.a(f3)));
                }
                activityTopRightBannerWidget.show();
                try {
                    if (activityTopRightBannerWidget.f16230c != null) {
                        JSONObject jSONObject = new JSONObject();
                        com.bytedance.android.livesdk.model.message.c cVar = activityTopRightBannerWidget.f16230c;
                        if (cVar == null) {
                            l.b();
                        }
                        c.a aVar = cVar.f19408e;
                        l.b(aVar, "");
                        jSONObject.put("data", com.bytedance.android.livesdk.util.a.a(aVar.f19412b));
                        jSONObject.put(StringSet.type, "init");
                        com.bytedance.android.livesdk.browser.c.d dVar = activityTopRightBannerWidget.f16231d;
                        if (dVar != null) {
                            dVar.a(activityTopRightBannerWidget.f16232e, "H5_roomStatusChange", jSONObject);
                        }
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.a.AbstractC0326a
    public final void a(SparseBooleanArray sparseBooleanArray, boolean z) {
        l.d(sparseBooleanArray, "");
        if (getView() != null) {
            boolean z2 = false;
            if (sparseBooleanArray.get(0) || sparseBooleanArray.get(2)) {
                z2 = true;
            }
            com.bytedance.android.livesdk.chatroom.g.e.a(this.context, getView(), !z2, z);
        }
    }
}
