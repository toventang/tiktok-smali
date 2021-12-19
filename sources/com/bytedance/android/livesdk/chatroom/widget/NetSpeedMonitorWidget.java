package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ag.a;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorNetworkMonitorDurationSetting;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class NetSpeedMonitorWidget extends LiveRecyclableWidget implements com.bytedance.ies.xbridge.e.d, au {

    /* renamed from: g  reason: collision with root package name */
    public static final b f16588g = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f16589a;

    /* renamed from: b  reason: collision with root package name */
    public int f16590b;

    /* renamed from: c  reason: collision with root package name */
    final h.h f16591c = h.i.a((h.f.a.a) new l(this));

    /* renamed from: d  reason: collision with root package name */
    final h.h f16592d = h.i.a((h.f.a.a) f.f16607a);

    /* renamed from: e  reason: collision with root package name */
    public NetworkUtils.h f16593e = a(y.e());

    /* renamed from: f  reason: collision with root package name */
    public NetworkUtils.h f16594f = a(y.e());

    /* renamed from: h  reason: collision with root package name */
    private final h.h f16595h = h.i.a((h.f.a.a) new k(this));

    /* renamed from: i  reason: collision with root package name */
    private final h.h f16596i = h.i.a((h.f.a.a) g.f16608a);

    /* renamed from: j  reason: collision with root package name */
    private final h.h f16597j = h.i.a((h.f.a.a) h.f16609a);

    /* renamed from: k  reason: collision with root package name */
    private final h.h f16598k = h.i.a((h.f.a.a) i.f16610a);

    /* renamed from: l  reason: collision with root package name */
    private final a.AbstractC0288a f16599l = new j(this);

    static final class a {

        /* renamed from: c  reason: collision with root package name */
        public static final C0332a f16600c = new C0332a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        long f16601a;

        /* renamed from: b  reason: collision with root package name */
        long f16602b;

        static {
            Covode.recordClassIndex(9196);
        }

        /* renamed from: com.bytedance.android.livesdk.chatroom.widget.NetSpeedMonitorWidget$a$a  reason: collision with other inner class name */
        public static final class C0332a {
            static {
                Covode.recordClassIndex(9197);
            }

            private C0332a() {
            }

            public /* synthetic */ C0332a(byte b2) {
                this();
            }
        }
    }

    static {
        Covode.recordClassIndex(9195);
    }

    private final com.bytedance.android.livesdk.ag.a c() {
        return (com.bytedance.android.livesdk.ag.a) this.f16598k.getValue();
    }

    public final Handler a() {
        return (Handler) this.f16596i.getValue();
    }

    public final c b() {
        return (c) this.f16597j.getValue();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bh3;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(9198);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f16607a = new f();

        static {
            Covode.recordClassIndex(9203);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a();
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f16609a = new h();

        static {
            Covode.recordClassIndex(9205);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new c();
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<com.bytedance.android.livesdk.ag.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f16610a = new i();

        static {
            Covode.recordClassIndex(9206);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.livesdk.ag.a invoke() {
            return new com.bytedance.android.livesdk.ag.a();
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<d> {
        final /* synthetic */ NetSpeedMonitorWidget this$0;

        static {
            Covode.recordClassIndex(9209);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(NetSpeedMonitorWidget netSpeedMonitorWidget) {
            super(0);
            this.this$0 = netSpeedMonitorWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return new d();
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<e> {
        final /* synthetic */ NetSpeedMonitorWidget this$0;

        static {
            Covode.recordClassIndex(9210);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(NetSpeedMonitorWidget netSpeedMonitorWidget) {
            super(0);
            this.this$0 = netSpeedMonitorWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            return new e();
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f16608a = new g();

        static {
            Covode.recordClassIndex(9204);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        com.bytedance.android.livesdk.ag.a c2 = c();
        c2.b(this.f16599l);
        c2.a();
        a().removeCallbacksAndMessages(null);
        com.bytedance.ies.xbridge.e.b.b("anchor_center_net_quality_request", this);
    }

    public final class d implements Runnable {
        static {
            Covode.recordClassIndex(9200);
        }

        static final class a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(9201);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar) {
                super(0);
                this.this$0 = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                c b2 = NetSpeedMonitorWidget.this.b();
                int i2 = NetSpeedMonitorWidget.this.f16589a;
                b2.f16603a = System.currentTimeMillis();
                b.a.a("livesdk_netspeed_stuck_show").a().a("net_speed", c.a(i2)).b();
                return z.f158842a;
            }
        }

        public final void run() {
            NetSpeedMonitorWidget.this.b();
            b.a.a("livesdk_netspeed_show").a().a("net_speed", c.a(NetSpeedMonitorWidget.this.f16589a)).b();
            a aVar = (a) NetSpeedMonitorWidget.this.f16592d.getValue();
            int i2 = NetSpeedMonitorWidget.this.f16589a;
            a aVar2 = new a(this);
            h.f.b.l.d(aVar2, "");
            if (i2 != 3) {
                aVar.f16602b = 0;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (aVar.f16602b == 0) {
                    aVar.f16602b = currentTimeMillis;
                }
                if (currentTimeMillis - aVar.f16602b >= 9000 && currentTimeMillis - aVar.f16601a >= TimeUnit.MINUTES.toMillis(1)) {
                    aVar.f16601a = currentTimeMillis;
                    aVar.f16602b = 0;
                    Context e2 = y.e();
                    if (!(e2 == null && (e2 = y.e()) == null)) {
                        ao.a(e2, e2.getString(R.string.egm), 0);
                    }
                    aVar2.invoke();
                }
            }
            NetSpeedMonitorWidget.this.a().postDelayed(this, 3000);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public d() {
        }
    }

    public final class e implements Runnable {
        static {
            Covode.recordClassIndex(9202);
        }

        public final void run() {
            NetSpeedMonitorWidget.this.b();
            b.a.a("livesdk_anchor_change_netspeed_show").a().a("net_speed", c.a(NetSpeedMonitorWidget.this.f16589a)).b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public e() {
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        com.bytedance.ies.xbridge.e.b.a("anchor_center_net_quality_request", this);
    }

    /* access modifiers changed from: package-private */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public long f16603a;

        /* renamed from: b  reason: collision with root package name */
        public long f16604b;

        static {
            Covode.recordClassIndex(9199);
        }

        static String a(int i2) {
            return i2 != 2 ? i2 != 3 ? "good" : "stuck" : "bad";
        }

        static String a(NetworkUtils.h hVar) {
            int i2 = t.f16672a[hVar.ordinal()];
            if (i2 == 1) {
                return "3g";
            }
            if (i2 == 2) {
                return "4g";
            }
            if (i2 != 3) {
                return "none";
            }
            return "wifi";
        }
    }

    private static NetworkUtils.h a(Context context) {
        if (com.ss.android.ugc.aweme.lancet.j.f107228g != NetworkUtils.h.NONE && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107228g;
        }
        NetworkUtils.h networkType = NetworkUtils.getNetworkType(context);
        com.ss.android.ugc.aweme.lancet.j.f107228g = networkType;
        return networkType;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        com.bytedance.android.livesdk.ag.a c2 = c();
        c2.a(this.context);
        c2.a(this.f16599l);
        a().postDelayed((d) this.f16595h.getValue(), 3000);
    }

    @Override // com.bytedance.ies.xbridge.e.d
    public final void a(com.bytedance.ies.xbridge.e.c cVar) {
        h.f.b.l.d(cVar, "");
        if (h.f.b.l.a((Object) cVar.f35926a, (Object) "anchor_center_net_quality_request")) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("room_id", String.valueOf(com.bytedance.android.livesdk.ab.e.i()));
            jSONObject.put("quality", this.f16589a);
            com.bytedance.ies.xbridge.e.b.a(new com.bytedance.ies.xbridge.e.a("anchor_center_net_quality_changed", currentTimeMillis, new com.bytedance.ies.xbridge.model.a.a.d(jSONObject)));
        }
    }

    static final class j implements a.AbstractC0288a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NetSpeedMonitorWidget f16611a;

        static {
            Covode.recordClassIndex(9207);
        }

        j(NetSpeedMonitorWidget netSpeedMonitorWidget) {
            this.f16611a = netSpeedMonitorWidget;
        }

        @Override // com.bytedance.android.livesdk.ag.a.AbstractC0288a
        public final void a(NetworkUtils.h hVar) {
            if (hVar != NetworkUtils.h.NONE) {
                c b2 = this.f16611a.b();
                NetworkUtils.h hVar2 = this.f16611a.f16594f;
                h.f.b.l.b(hVar2, "");
                h.f.b.l.b(hVar, "");
                int i2 = this.f16611a.f16589a;
                AnonymousClass1 r3 = new h.f.a.a<z>(this) {
                    /* class com.bytedance.android.livesdk.chatroom.widget.NetSpeedMonitorWidget.j.AnonymousClass1 */
                    final /* synthetic */ j this$0;

                    static {
                        Covode.recordClassIndex(9208);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        this.this$0.f16611a.a().postDelayed((e) this.this$0.f16611a.f16591c.getValue(), 9000);
                        return z.f158842a;
                    }
                };
                h.f.b.l.d(hVar2, "");
                h.f.b.l.d(hVar, "");
                h.f.b.l.d(r3, "");
                if (System.currentTimeMillis() - b2.f16603a < ((long) LiveAnchorNetworkMonitorDurationSetting.INSTANCE.getValue()) * 1000) {
                    h.f.b.l.d(hVar2, "");
                    h.f.b.l.d(hVar, "");
                    b.a.a("livesdk_anchor_change_network").a().a("before_net_status", c.a(hVar2)).a("after_net_status", c.a(hVar)).a("before_net_speed", c.a(i2)).b();
                    b2.f16604b = System.currentTimeMillis();
                    r3.invoke();
                }
                this.f16611a.f16594f = hVar;
            }
            this.f16611a.f16593e = hVar;
        }
    }
}
