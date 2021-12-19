package com.ss.android.ugc.aweme.notice.api.e;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.a;
import com.bytedance.common.wschannel.app.e;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.q;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.common.f;
import com.ss.android.ugc.aweme.common.net.h;
import com.ss.android.ugc.aweme.common.net.k;
import com.ss.android.ugc.aweme.common.net.m;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.utils.WSHelperImpl;
import com.ss.android.websocket.a.a;
import com.ss.android.websocket.internal.proto.Frame;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class t implements i, j {

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f112751h = true;

    /* renamed from: i  reason: collision with root package name */
    public static t f112752i;

    /* renamed from: j  reason: collision with root package name */
    public static final a f112753j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public volatile String f112754a;

    /* renamed from: b  reason: collision with root package name */
    public final l f112755b;

    /* renamed from: c  reason: collision with root package name */
    public String f112756c;

    /* renamed from: d  reason: collision with root package name */
    public final e f112757d;

    /* renamed from: e  reason: collision with root package name */
    public final List<e> f112758e;

    /* renamed from: f  reason: collision with root package name */
    public final List<ae> f112759f;

    /* renamed from: g  reason: collision with root package name */
    public final ConcurrentHashMap<m, z> f112760g;

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(350, new g(t.class, "onSendWs", k.class, ThreadMode.POSTING, 0, false));
        hashMap.put(351, new g(t.class, "onOpenWs", h.class, ThreadMode.POSTING, 0, false));
        hashMap.put(352, new g(t.class, "onCloseWs", com.ss.android.ugc.aweme.common.net.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72469);
        }

        private a() {
        }

        public final synchronized t a() {
            t tVar;
            MethodCollector.i(8171);
            if (t.f112752i == null) {
                t.f112752i = new t((byte) 0);
            }
            tVar = t.f112752i;
            if (tVar == null) {
                l.b();
            }
            MethodCollector.o(8171);
            return tVar;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f112762a;

        static {
            Covode.recordClassIndex(72471);
        }

        c(t tVar) {
            this.f112762a = tVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f112762a.a();
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(72468);
    }

    private t() {
        this.f112754a = "unknown";
        this.f112755b = new l();
        this.f112756c = "";
        this.f112757d = new b(this);
        this.f112758e = Collections.synchronizedList(new ArrayList());
        this.f112759f = Collections.synchronizedList(new ArrayList());
        this.f112760g = new ConcurrentHashMap<>();
    }

    public final void a() {
        if (com.ss.android.ugc.aweme.notice.api.ab.c.c()) {
            f.c("WsChannelBridge", "innerOpen ignored by reversing ws");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(new ArrayList());
        if (arrayList.isEmpty()) {
            arrayList.add(q.f112736b);
        }
        HashMap hashMap = new HashMap();
        int i2 = 0;
        q.b(hashMap, false);
        hashMap.remove("mac_address");
        Context a2 = d.a();
        if (com.ss.android.ugc.aweme.lancet.j.f107228g == NetworkUtils.h.NONE || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107228g = NetworkUtils.getNetworkType(a2);
        }
        NetworkUtils.h hVar = com.ss.android.ugc.aweme.lancet.j.f107228g;
        if (hVar == NetworkUtils.h.WIFI) {
            i2 = 1;
        } else if (hVar == NetworkUtils.h.MOBILE_2G) {
            i2 = 2;
        } else if (hVar == NetworkUtils.h.MOBILE_3G) {
            i2 = 3;
        } else if (hVar == NetworkUtils.h.MOBILE_4G) {
            i2 = 4;
        }
        hashMap.put("ne", String.valueOf(i2));
        hashMap.put("is_background", String.valueOf(q.c()));
        hashMap.put("em", this.f112754a);
        String b2 = SettingServiceImpl.v().a(d.a()).b();
        l.b(b2, "");
        if (!TextUtils.isEmpty(b2)) {
            hashMap.put("language", b2);
        }
        a.C0580a a3 = a.C0580a.a(1239108);
        a3.f27007f = "e1bd35ec9db7b8d846de66ed140b1ad9";
        a3.f27005d = 9;
        a3.f27004c = AppLog.getAppId();
        a3.f27006e = WSHelperImpl.e().b();
        a3.f27008g = AppLog.getServerDeviceId();
        a3.f27009h = AppLog.getInstallId();
        com.bytedance.common.wschannel.a a4 = a3.a(arrayList).a(hashMap).a();
        a4.f26996d.put("sid", AppLog.getSessionKey());
        com.bytedance.common.wschannel.j.a(a4);
    }

    public /* synthetic */ t(byte b2) {
        this();
    }

    public static final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f112761a;

        static {
            Covode.recordClassIndex(72470);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(t tVar) {
            this.f112761a = tVar;
        }

        @Override // com.bytedance.common.wschannel.app.e
        public final void a(WsChannelMsg wsChannelMsg) {
            if (com.ss.android.ugc.aweme.notice.api.ab.c.c()) {
                f.c("WsChannelBridge", "onReceiveMsg ignored by reversing ws");
                return;
            }
            if (wsChannelMsg != null) {
                com.ss.android.websocket.a.b.c cVar = new com.ss.android.websocket.a.b.c(this.f112761a.f112756c, wsChannelMsg.a(), this.f112761a.f112755b.a(new v(wsChannelMsg)));
                cVar.f151617d = wsChannelMsg.f27298g;
                cVar.f151618e = Integer.valueOf(wsChannelMsg.f27297f).intValue();
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.common.net.j(cVar));
            }
            for (e eVar : this.f112761a.f112758e) {
                eVar.a(wsChannelMsg);
            }
            if (wsChannelMsg != null) {
                z zVar = this.f112761a.f112760g.get(new m(wsChannelMsg.f27297f, wsChannelMsg.f27298g));
                if (zVar != null) {
                    zVar.a(wsChannelMsg);
                }
            }
        }

        @Override // com.bytedance.common.wschannel.app.e
        public final void a(com.bytedance.common.wschannel.b.b bVar, JSONObject jSONObject) {
            a.EnumC4061a aVar;
            if (com.ss.android.ugc.aweme.notice.api.ab.c.c()) {
                f.c("WsChannelBridge", "onReceiveConnectEvent ignored by reversing ws");
            } else if (bVar != null && jSONObject != null) {
                SocketState a2 = SocketState.a(jSONObject);
                com.ss.android.ugc.aweme.im.service.m.a.b("WsConnectionReportManager", "onConnectEvent connectionState: " + bVar.f27017b.name());
                com.ss.android.ugc.aweme.im.service.m.a.b("WsConnectionReportManager", "onConnectEvent socketState: ".concat(String.valueOf(a2)));
                com.bytedance.common.wschannel.b.c cVar = bVar.f27017b;
                if (cVar != null) {
                    int i2 = y.f112770a[cVar.ordinal()];
                    if (i2 == 1) {
                        x.f112768b = SystemClock.uptimeMillis();
                    } else if (i2 != 3) {
                        if (i2 == 4) {
                            l.b(a2, "");
                            x.a(0, a2);
                            x.f112767a = true;
                        }
                    } else if (a2.f27267a == 0 && x.f112767a) {
                        if (TextUtils.equals(" is not in freshly constructed state...", a2.f27272f) || TextUtils.equals(" internet is down, skip...", a2.f27272f)) {
                            l.b(a2, "");
                            x.a(2, a2);
                        } else {
                            l.b(a2, "");
                            x.a(1, a2);
                        }
                        x.f112767a = false;
                    }
                }
                SocketState a3 = SocketState.a(jSONObject);
                String jSONObject2 = jSONObject.toString();
                l.b(jSONObject2, "");
                com.bytedance.common.wschannel.b.c cVar2 = bVar.f27017b;
                if (cVar2 != null) {
                    int i3 = u.f112763a[cVar2.ordinal()];
                    if (i3 == 1) {
                        t tVar = this.f112761a;
                        String str = a3.f27269c;
                        l.b(str, "");
                        tVar.f112756c = str;
                        aVar = a.EnumC4061a.CONNECTED;
                        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.common.net.i(new com.ss.android.websocket.a.b.b(a3.f27269c, jSONObject2, a3.f27271e)));
                    } else if (i3 == 2) {
                        aVar = a.EnumC4061a.CLOSED;
                        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.common.net.b(new com.ss.android.websocket.a.b.a(a3.f27269c, jSONObject2)));
                    } else if (i3 == 3) {
                        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.common.net.l(new com.ss.android.websocket.a.b.d(a3.f27269c, a3.f27272f, a3.f27271e)));
                    } else if (i3 == 4) {
                        aVar = a.EnumC4061a.OPENING;
                    }
                    if (aVar != null) {
                        com.ss.android.ugc.d.a.c.a(new m(new com.ss.android.websocket.a.b.e(a3.f27269c, aVar)));
                    }
                }
                for (e eVar : this.f112761a.f112758e) {
                    eVar.a(bVar, jSONObject);
                }
                List<ae> list = this.f112761a.f112759f;
                l.b(list, "");
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    it.next().a(new w(bVar, jSONObject));
                }
            }
        }
    }

    @r
    public final void onOpenWs(h hVar) {
        l.d(hVar, "");
        if (f112751h) {
            b.i.b(new c(this), com.ss.android.ugc.aweme.cw.g.a());
        } else {
            a();
        }
    }

    @r
    public final void onCloseWs(com.ss.android.ugc.aweme.common.net.a aVar) {
        MethodCollector.i(7638);
        l.d(aVar, "");
        com.ss.android.ugc.d.a.c.a(new m(new com.ss.android.websocket.a.b.e(this.f112756c, a.EnumC4061a.CLOSING)));
        com.bytedance.common.wschannel.j.b();
        WsConstants.remove(1239108);
        com.bytedance.common.wschannel.j.f27227d.remove(1239108);
        synchronized (com.bytedance.common.wschannel.j.f27224a) {
            try {
                if (com.bytedance.common.wschannel.j.f27229f != null && !com.bytedance.common.wschannel.j.f27229f.f27235a) {
                    com.bytedance.common.wschannel.j.f27229f.f27236b.remove(1239108);
                }
            } catch (Throwable th) {
                MethodCollector.o(7638);
                throw th;
            }
        }
        com.bytedance.common.wschannel.j.a();
        com.bytedance.common.wschannel.j.f27225b.a(com.bytedance.common.wschannel.j.f27226c, 1239108);
        MethodCollector.o(7638);
    }

    @r
    public final void onSendWs(k kVar) {
        l.d(kVar, "");
        com.ss.android.websocket.a.a.d dVar = kVar.f76477a;
        if (dVar.f151598b != null) {
            WsChannelMsg.a a2 = WsChannelMsg.a.a(1239108);
            com.ss.android.websocket.a.a.e eVar = dVar.f151598b;
            l.b(eVar, "");
            a2.f27307a = eVar.f151602d;
            com.ss.android.websocket.a.a.e eVar2 = dVar.f151598b;
            l.b(eVar2, "");
            a2.f27313g = eVar2.f151601c;
            com.ss.android.websocket.a.a.e eVar3 = dVar.f151598b;
            l.b(eVar3, "");
            a2.f27309c = eVar3.f151604f;
            com.ss.android.websocket.a.a.e eVar4 = dVar.f151598b;
            l.b(eVar4, "");
            a2.f27308b = eVar4.f151603e;
            com.ss.android.websocket.a.a.e eVar5 = dVar.f151598b;
            l.b(eVar5, "");
            a2.f27310d = eVar5.f151600b;
            com.ss.android.websocket.a.a.e eVar6 = dVar.f151598b;
            l.b(eVar6, "");
            a2.f27311e = eVar6.f151605g;
            com.ss.android.websocket.a.a.e eVar7 = dVar.f151598b;
            l.b(eVar7, "");
            a2.f27312f = eVar7.f151606h;
            com.ss.android.websocket.a.a.e eVar8 = dVar.f151598b;
            l.b(eVar8, "");
            new Frame.ExtendedEntry("", "");
            Map<String, String> map = eVar8.f151607i;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    a2.a(entry.getKey(), entry.getValue());
                }
            }
            WsChannelMsg a3 = a2.a();
            com.bytedance.common.wschannel.j.b();
            if (a3.f27304m <= 0) {
                throw new IllegalArgumentException("illegal channelId");
            } else if (a3.f27297f <= 0) {
                throw new IllegalArgumentException("illegal service");
            } else if (a3.f27298g <= 0) {
                throw new IllegalArgumentException("illegal method");
            } else if (a3.a() != null) {
                if (com.bytedance.common.wschannel.j.f27229f != null && !com.bytedance.common.wschannel.j.f27229f.f27235a) {
                    com.bytedance.common.wschannel.j.a();
                }
                com.bytedance.common.wschannel.j.f27225b.a(com.bytedance.common.wschannel.j.f27226c, a3);
            } else {
                throw new IllegalArgumentException("illegal payload");
            }
        }
    }

    public final void a(m mVar, z zVar) {
        l.d(mVar, "");
        l.d(zVar, "");
        this.f112760g.put(mVar, zVar);
    }
}
