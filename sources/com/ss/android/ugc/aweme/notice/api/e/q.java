package com.ss.android.ugc.aweme.notice.api.e;

import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.al;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.net.b;
import com.ss.android.ugc.aweme.common.net.c;
import com.ss.android.ugc.aweme.common.net.k;
import com.ss.android.ugc.aweme.common.net.l;
import com.ss.android.ugc.aweme.common.net.m;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.notice.api.a.a;
import com.ss.android.ugc.aweme.notice.api.bean.f;
import com.ss.android.ugc.aweme.utils.WSHelperImpl;
import com.ss.android.websocket.a.a;
import com.ss.android.websocket.a.a.e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public class q implements al, i, j {

    /* renamed from: a  reason: collision with root package name */
    public static final String f112735a = "wss://frontier-va.tiktokv.com/ws/v2";

    /* renamed from: b  reason: collision with root package name */
    public static String f112736b;

    /* renamed from: c  reason: collision with root package name */
    public static String f112737c = "";

    /* renamed from: d  reason: collision with root package name */
    public static String f112738d = "ws:///ws/v2";

    /* renamed from: f  reason: collision with root package name */
    public static q f112739f = new q();

    /* renamed from: g  reason: collision with root package name */
    private static final String f112740g = q.class.getName();

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f112741e;

    /* renamed from: h  reason: collision with root package name */
    private boolean f112742h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f112743i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f112744j;

    /* renamed from: k  reason: collision with root package name */
    private long f112745k;

    /* renamed from: l  reason: collision with root package name */
    private final HashMap<f, Set<a>> f112746l = new HashMap<>();

    /* renamed from: m  reason: collision with root package name */
    private boolean f112747m;

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(383, new g(q.class, "onEvent", l.class, ThreadMode.POSTING, 0, false));
        hashMap.put(384, new g(q.class, "onEvent", c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(385, new g(q.class, "onEvent", com.ss.android.ugc.aweme.common.net.i.class, ThreadMode.POSTING, 0, false));
        hashMap.put(386, new g(q.class, "onEvent", m.class, ThreadMode.POSTING, 0, false));
        hashMap.put(387, new g(q.class, "onEvent", b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(388, new g(q.class, "onEvent", com.ss.android.ugc.aweme.common.net.j.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @r
    public void onEvent(b bVar) {
    }

    @Override // com.ss.android.ugc.aweme.al
    public final void a() {
        d();
    }

    @Override // com.ss.android.ugc.aweme.al
    public final void b() {
        d();
    }

    public static int c() {
        if (WSHelperImpl.e().c()) {
            return 1;
        }
        return 0;
    }

    static {
        Covode.recordClassIndex(72465);
    }

    private q() {
        if (com.ss.android.common.util.f.a(d.a())) {
            this.f112747m = Keva.getRepo("ab_repo_cold_boot").getBoolean("clear_red_point_cost", false);
        }
    }

    private static void d() {
        HashMap hashMap = new HashMap();
        hashMap.put("IsBackground", String.valueOf(c()));
        com.ss.android.ugc.d.a.c.a(new k(new com.ss.android.websocket.a.a.d(f112736b, new e(f112736b, 9000, 0, 4, new byte[]{0}, "", "", hashMap))));
    }

    public static void b(String str) {
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.common.net.a(new com.ss.android.websocket.a.a.a(str)));
    }

    @r
    public void onEvent(c cVar) {
        Activity j2;
        if (f.a.f68431a.c()) {
            a("netstate_change");
        } else if (!WSHelperImpl.e().c() && (j2 = com.bytedance.ies.ugc.appcontext.f.j()) != null) {
            j2.runOnUiThread(new s(j2));
        }
    }

    private static void d(String str) {
        com.ss.android.ugc.aweme.im.service.c iMErrorMonitor;
        com.ss.android.ugc.aweme.framework.a.a.a(4, "WsLancet", "1.1->recordWsConnect: ".concat(String.valueOf(str)));
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        if (createIIMServicebyMonsterPlugin != null && (iMErrorMonitor = createIIMServicebyMonsterPlugin.getIMErrorMonitor()) != null) {
            iMErrorMonitor.a(str);
        }
    }

    public final void a(String str) {
        if (this.f112747m) {
            b.i.b(new r(this, str), com.ss.android.ugc.aweme.cw.g.c());
        } else {
            a(this, str);
        }
    }

    @r
    public void onEvent(com.ss.android.ugc.aweme.common.net.i iVar) {
        com.ss.android.websocket.a.b.b bVar = iVar.f76475a;
        if (this.f112744j) {
            this.f112743i = false;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("total_duration", SystemClock.uptimeMillis() - this.f112745k);
                jSONObject.put("ws_connect_type", bVar.f151613c);
                com.bytedance.apm.b.a("aweme_long_connection_error_rate", 0, jSONObject);
            } catch (Exception unused) {
            }
        }
        this.f112744j = false;
    }

    @r
    public void onEvent(com.ss.android.ugc.aweme.common.net.j jVar) {
        com.ss.android.ugc.aweme.notice.api.bean.b bVar;
        Set<a> set;
        Object obj = jVar.f76476a.f151616c;
        if (!(!(obj instanceof com.ss.android.ugc.aweme.notice.api.bean.b) || (bVar = (com.ss.android.ugc.aweme.notice.api.bean.b) obj) == null || (set = this.f112746l.get(bVar.getType())) == null)) {
            for (a aVar : set) {
                aVar.a(bVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        d("find provider wssUrl=".concat(java.lang.String.valueOf(r3)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0188 A[SYNTHETIC, Splitter:B:51:0x0188] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 410
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notice.api.e.q.c(java.lang.String):void");
    }

    @r
    public void onEvent(l lVar) {
        com.ss.android.websocket.a.b.d dVar = lVar.f76478a;
        if (!this.f112743i && this.f112744j) {
            this.f112743i = true;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("total_duration", SystemClock.uptimeMillis() - this.f112745k);
                jSONObject.put("errorResponse", dVar.f151620b);
                jSONObject.put("ws_connect_type", dVar.f151621c);
                com.bytedance.apm.b.a("aweme_long_connection_error_rate", 1, jSONObject);
            } catch (Exception unused) {
            }
        }
        this.f112744j = false;
    }

    @r
    public void onEvent(m mVar) {
        com.ss.android.websocket.a.b.e eVar = mVar.f76479a;
        if ((eVar.f151623b == null || eVar.f151623b == a.EnumC4061a.CLOSED) && this.f112742h) {
            this.f112742h = false;
            a("ws_status_change");
        }
        if (eVar.f151623b == a.EnumC4061a.OPENING) {
            this.f112745k = SystemClock.uptimeMillis();
            this.f112744j = true;
        }
    }

    public static void a(q qVar, String str) {
        ac.a("1->realConnectMessageWS ".concat(String.valueOf(str)));
        qVar.c(str);
    }

    public final void a(com.ss.android.ugc.aweme.notice.api.bean.f fVar, com.ss.android.ugc.aweme.notice.api.a.a aVar) {
        Set<com.ss.android.ugc.aweme.notice.api.a.a> set = this.f112746l.get(fVar);
        if (set == null) {
            set = new HashSet<>();
            this.f112746l.put(fVar, set);
        }
        set.add(aVar);
    }
}
