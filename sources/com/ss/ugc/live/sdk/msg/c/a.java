package com.ss.ugc.live.sdk.msg.c;

import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.PayloadItem;
import com.ss.ugc.live.sdk.message.interfaces.IMessageClient;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import com.ss.ugc.live.sdk.msg.b.e;
import com.ss.ugc.live.sdk.msg.c.g;
import com.ss.ugc.live.sdk.msg.d.f;
import com.ss.ugc.live.sdk.msg.d.h;
import com.ss.ugc.live.sdk.msg.data.SdkUplinkPacket;
import h.f.b.l;
import h.n;
import h.w;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

public final class a implements h.a {

    /* renamed from: j  reason: collision with root package name */
    public static final int f154127j = 12345;

    /* renamed from: k  reason: collision with root package name */
    public static final int f154128k = 12346;

    /* renamed from: l  reason: collision with root package name */
    public static final int f154129l = 12347;

    /* renamed from: m  reason: collision with root package name */
    public static final int f154130m = 12348;
    public static final int n = 12349;
    public static final C4102a o = new C4102a((byte) 0);
    private static int r;

    /* renamed from: a  reason: collision with root package name */
    public HandlerThread f154131a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.ugc.live.sdk.msg.d.h f154132b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.ugc.live.sdk.msg.d.h f154133c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.ugc.live.sdk.msg.d.h f154134d;

    /* renamed from: e  reason: collision with root package name */
    public final e f154135e;

    /* renamed from: f  reason: collision with root package name */
    public final c f154136f;

    /* renamed from: g  reason: collision with root package name */
    public final com.ss.ugc.live.sdk.msg.a f154137g;

    /* renamed from: h  reason: collision with root package name */
    public final IMessageWsClient f154138h;

    /* renamed from: i  reason: collision with root package name */
    public final com.ss.ugc.live.sdk.msg.a.a f154139i;
    private g p;
    private final IMessageClient q;

    /* renamed from: com.ss.ugc.live.sdk.msg.c.a$a  reason: collision with other inner class name */
    public static final class C4102a {
        static {
            Covode.recordClassIndex(102802);
        }

        private C4102a() {
        }

        public /* synthetic */ C4102a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f154144a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.ugc.live.sdk.msg.d.f f154145b;

        static {
            Covode.recordClassIndex(102805);
        }

        d(d dVar, com.ss.ugc.live.sdk.msg.d.f fVar) {
            this.f154144a = dVar;
            this.f154145b = fVar;
        }

        public final void run() {
            this.f154144a.f154163j.a(this.f154145b);
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicLong f154142a;

        /* renamed from: b  reason: collision with root package name */
        private final long f154143b;

        static {
            Covode.recordClassIndex(102804);
        }

        c() {
            long nextLong = h.i.c.Default.nextLong(0, 10000);
            this.f154143b = nextLong;
            this.f154142a = new AtomicLong(nextLong);
        }
    }

    public static final class h extends HandlerThread {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f154152a;

        static {
            Covode.recordClassIndex(102809);
        }

        /* access modifiers changed from: protected */
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            this.f154152a.f154132b = new com.ss.ugc.live.sdk.msg.d.h(getLooper(), this.f154152a);
            this.f154152a.f154133c = new com.ss.ugc.live.sdk.msg.d.h(getLooper(), this.f154152a);
            this.f154152a.f154134d = new com.ss.ugc.live.sdk.msg.d.h(getLooper(), this.f154152a);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(a aVar, String str) {
            super(str);
            this.f154152a = aVar;
        }
    }

    static {
        Covode.recordClassIndex(102801);
        r = 12345;
        r = 12346;
        r = 12347;
        r = 12348;
        r = 12349;
        r = 12350;
    }

    final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final long f154140a;

        static {
            Covode.recordClassIndex(102803);
        }

        public final void run() {
            d a2 = a.this.f154135e.a(this.f154140a);
            if (a2 != null) {
                com.ss.ugc.live.sdk.msg.d.a.a(a.this.f154137g, "ws uplink timeout, serviceId: " + a2.f154160g + ", uniqueId: " + a2.f154159f);
                a2.a(new c(-2, "ws timeout", null, 4, null), g.WS_MSG_ORIGIN, a.this.f154138h.isWsConnected());
                a.this.a(a2);
            }
        }

        public b(long j2) {
            this.f154140a = j2;
        }
    }

    private final void a() {
        try {
            for (Map.Entry<Long, d> entry : this.f154135e.f154167a.entrySet()) {
                entry.getValue().a(new c(-4, "released", null, 4, null), this.p, this.f154138h.isWsConnected());
                a(entry.getValue());
            }
            this.f154135e.f154167a.clear();
            HandlerThread handlerThread = this.f154131a;
            if (handlerThread != null) {
                handlerThread.quit();
            }
        } catch (Throwable unused) {
        }
    }

    public static final class e implements com.ss.ugc.live.sdk.msg.b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f154146a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f154147b;

        static {
            Covode.recordClassIndex(102806);
        }

        @Override // com.ss.ugc.live.sdk.msg.b.c
        public final void a(com.ss.ugc.live.sdk.msg.d.f<com.ss.ugc.live.sdk.msg.b.f, ? extends Exception> fVar) {
            Message obtainMessage;
            l.c(fVar, "");
            this.f154147b.f154155b = fVar;
            com.ss.ugc.live.sdk.msg.d.h hVar = this.f154146a.f154133c;
            if (hVar != null && (obtainMessage = hVar.obtainMessage(a.f154130m, this.f154147b)) != null) {
                obtainMessage.sendToTarget();
            }
        }

        e(a aVar, d dVar) {
            this.f154146a = aVar;
            this.f154147b = dVar;
        }
    }

    public static final class f implements com.ss.ugc.live.sdk.msg.b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f154148a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f154149b;

        static {
            Covode.recordClassIndex(102807);
        }

        @Override // com.ss.ugc.live.sdk.msg.b.c
        public final void a(com.ss.ugc.live.sdk.msg.d.f<com.ss.ugc.live.sdk.msg.b.f, ? extends Exception> fVar) {
            Message obtainMessage;
            l.c(fVar, "");
            this.f154149b.f154155b = fVar;
            com.ss.ugc.live.sdk.msg.d.h hVar = this.f154148a.f154133c;
            if (hVar != null && (obtainMessage = hVar.obtainMessage(a.f154130m, this.f154149b)) != null) {
                obtainMessage.sendToTarget();
            }
        }

        f(a aVar, d dVar) {
            this.f154148a = aVar;
            this.f154149b = dVar;
        }
    }

    public static final class g implements com.ss.ugc.live.sdk.msg.b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f154150a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f154151b;

        static {
            Covode.recordClassIndex(102808);
        }

        @Override // com.ss.ugc.live.sdk.msg.b.c
        public final void a(com.ss.ugc.live.sdk.msg.d.f<com.ss.ugc.live.sdk.msg.b.f, ? extends Exception> fVar) {
            Message obtainMessage;
            l.c(fVar, "");
            this.f154151b.f154154a = fVar;
            com.ss.ugc.live.sdk.msg.d.h hVar = this.f154150a.f154133c;
            if (hVar != null && (obtainMessage = hVar.obtainMessage(a.f154129l, this.f154151b)) != null) {
                obtainMessage.sendToTarget();
            }
        }

        g(a aVar, d dVar) {
            this.f154150a = aVar;
            this.f154151b = dVar;
        }
    }

    public final void a(d dVar) {
        com.ss.ugc.live.sdk.msg.d.f<com.ss.ugc.live.sdk.msg.b.f, Exception> fVar;
        com.ss.ugc.live.sdk.msg.d.h hVar;
        com.ss.ugc.live.sdk.msg.d.a.a(this.f154137g, "uplink request finished, serviceId: " + dVar.f154160g + ", uniqueId: " + dVar.f154159f);
        this.f154135e.a(dVar);
        Runnable runnable = dVar.f154158e;
        if (!(runnable == null || (hVar = this.f154132b) == null)) {
            hVar.removeCallbacks(runnable);
        }
        dVar.f154157d.a(this.f154137g);
        try {
            fVar = dVar.b();
        } catch (Exception e2) {
            fVar = f.a.a(e2);
        }
        com.ss.ugc.live.sdk.msg.d.e.a(new d(dVar, fVar));
    }

    @Override // com.ss.ugc.live.sdk.msg.d.h.a
    public final void a(Message message) {
        byte[] bArr;
        if (message != null) {
            int i2 = message.what;
            if (i2 == f154127j) {
                Object obj = message.obj;
                if (obj != null) {
                    d dVar = (d) obj;
                    e eVar = this.f154135e;
                    l.c(dVar, "");
                    eVar.f154167a.put(Long.valueOf(dVar.f154159f), dVar);
                    g gVar = this.p;
                    boolean isWsConnected = this.f154138h.isWsConnected();
                    l.c(gVar, "");
                    f fVar = dVar.f154157d;
                    l.c(gVar, "");
                    fVar.f154172e = System.currentTimeMillis();
                    fVar.f154168a = gVar;
                    fVar.f154170c = isWsConnected;
                    if ((this.p == g.WS_MSG_ORIGIN || this.p == g.WS_ORIGIN) && this.f154138h.isWsConnected()) {
                        try {
                            com.ss.ugc.live.sdk.msg.d.a.a(this.f154137g, "send uplink packet by ws, serviceId: " + dVar.f154160g + ", uniqueId: " + dVar.f154159f);
                            SdkUplinkPacket a2 = dVar.a();
                            b bVar = new b(dVar.f154159f);
                            dVar.f154158e = bVar;
                            byte[] encode = a2.encode();
                            l.a((Object) encode, "");
                            Long l2 = a2.uniqueID;
                            l.a((Object) l2, "");
                            long longValue = l2.longValue();
                            Long l3 = a2.uniqueID;
                            l.a((Object) l3, "");
                            long longValue2 = l3.longValue();
                            l.c("pb", "");
                            l.c("uplink_im_gateway", "");
                            l.c(encode, "");
                            if (this.f154138h.isWsConnected()) {
                                this.f154138h.sendUplinkPacket(new PayloadItem("uplink_im_gateway", "pb", encode, new ArrayList(), longValue, longValue2));
                            }
                            com.ss.ugc.live.sdk.msg.a aVar = this.f154137g;
                            String str = "post ws timeout task, timeout: " + dVar.f154161h;
                            l.c(aVar, "");
                            l.c(str, "");
                            if (aVar.supportDebugInfo()) {
                                aVar.log("MessageManagerV2", str);
                            }
                            com.ss.ugc.live.sdk.msg.d.h hVar = this.f154132b;
                            if (hVar != null) {
                                hVar.postDelayed(bVar, dVar.f154161h);
                            }
                        } catch (Exception e2) {
                            a(dVar, dVar.f154160g, this.p, this.f154138h.isWsConnected(), e2);
                        }
                    } else if (this.p == g.WS_MSG_ORIGIN) {
                        try {
                            com.ss.ugc.live.sdk.msg.d.a.a(this.f154137g, "send uplink packet by uplink http, serviceId: " + dVar.f154160g + ", uniqueId: " + dVar.f154159f);
                            String a3 = this.f154139i.a();
                            l.c(a3, "");
                            com.ss.ugc.live.sdk.msg.b.e a4 = new e.a().b("application/protobuf").a(a3).a(dVar.a().encode()).a();
                            l.a((Object) a4, "");
                            this.q.a(a4, new g(this, dVar));
                        } catch (Exception e3) {
                            a(dVar, dVar.f154160g, this.p, this.f154138h.isWsConnected(), e3);
                        }
                    } else {
                        try {
                            com.ss.ugc.live.sdk.msg.d.a.a(this.f154137g, "send uplink packet by origin http, serviceId: " + dVar.f154160g + ", uniqueId: " + dVar.f154159f);
                            com.ss.ugc.live.sdk.msg.b.d dVar2 = dVar.f154162i.f154109a;
                            if (dVar2 == null) {
                                dVar2 = com.ss.ugc.live.sdk.msg.b.d.POST;
                            }
                            int i3 = b.f154153a[dVar2.ordinal()];
                            if (i3 == 1) {
                                this.q.a(dVar.f154162i, new e(this, dVar));
                            } else if (i3 == 2) {
                                this.q.b(dVar.f154162i, new f(this, dVar));
                            }
                        } catch (Exception e4) {
                            a(dVar, dVar.f154160g, this.p, this.f154138h.isWsConnected(), e4);
                        }
                    }
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            } else {
                String str2 = "server error";
                if (i2 == f154128k) {
                    Object obj2 = message.obj;
                    if (obj2 != null) {
                        PayloadItem payloadItem = (PayloadItem) obj2;
                        if (payloadItem == null) {
                            try {
                                bArr = new byte[1];
                            } catch (Exception e5) {
                                com.ss.ugc.live.sdk.msg.d.a.a(this.f154137g, "receive uplink packet by ws error");
                                JSONObject jSONObject = new JSONObject();
                                JSONObject jSONObject2 = new JSONObject();
                                String message2 = e5.getMessage();
                                if (message2 == null) {
                                    message2 = "Unknown exception";
                                }
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("error", message2);
                                jSONObject3.put("log_id", payloadItem.getLogId());
                                this.f154137g.monitor("uplink_receive_ws_packet_error", jSONObject, jSONObject2, jSONObject3);
                                com.ss.ugc.live.sdk.msg.d.a.a(this.f154137g, "receive ws uplink packet error: ".concat(String.valueOf(message2)));
                                return;
                            }
                        } else {
                            bArr = payloadItem.getPayload();
                            if (l.a((Object) com.ss.ugc.live.sdk.msg.d.g.a(payloadItem), (Object) "gzip")) {
                                bArr = com.ss.ugc.live.sdk.msg.d.c.a(bArr);
                                l.a((Object) bArr, "");
                            } else {
                                l.a((Object) bArr, "");
                            }
                        }
                        SdkUplinkPacket decode = SdkUplinkPacket.ADAPTER.decode(bArr);
                        com.ss.ugc.live.sdk.msg.d.a.a(this.f154137g, "receive uplink packet by ws, logId: " + com.ss.ugc.live.sdk.msg.d.g.a(decode));
                        e eVar2 = this.f154135e;
                        Long l4 = decode.uniqueID;
                        l.a((Object) l4, "");
                        d a5 = eVar2.a(l4.longValue());
                        if (a5 == null) {
                            Long l5 = decode.serviceID;
                            l.a((Object) l5, "");
                            long longValue3 = l5.longValue();
                            Long l6 = decode.uniqueID;
                            l.a((Object) l6, "");
                            a(longValue3, l6.longValue(), payloadItem.getLogId(), "receiveWSPayload");
                            return;
                        }
                        Integer num = decode.uplinkStrategy;
                        l.a((Object) num, "");
                        this.p = g.a.a(num.intValue());
                        Integer num2 = decode.statusCode;
                        if (num2 != null && num2.intValue() == 0) {
                            l.a((Object) decode, "");
                            a5.a(decode, g.WS_MSG_ORIGIN, this.f154138h.isWsConnected(), true);
                        } else {
                            Integer num3 = decode.statusCode;
                            l.a((Object) num3, "");
                            int intValue = num3.intValue();
                            String str3 = decode.statusMessage;
                            if (str3 != null) {
                                str2 = str3;
                            }
                            a5.a(new c(intValue, str2, null, 4, null), g.WS_MSG_ORIGIN, this.f154138h.isWsConnected());
                        }
                        a(a5);
                        return;
                    }
                    throw new w("null cannot be cast to non-null type");
                } else if (i2 == f154129l) {
                    Object obj3 = message.obj;
                    if (obj3 != null) {
                        d dVar3 = (d) obj3;
                        d a6 = this.f154135e.a(dVar3.f154159f);
                        if (a6 == null) {
                            a(dVar3.f154160g, dVar3.f154159f, 0, "receiveMsgHttpResult");
                            return;
                        }
                        try {
                            com.ss.ugc.live.sdk.msg.d.f<com.ss.ugc.live.sdk.msg.b.f, ? extends Exception> fVar2 = a6.f154154a;
                            if (fVar2 != null) {
                                if (fVar2 instanceof f.c) {
                                    SdkUplinkPacket decode2 = SdkUplinkPacket.ADAPTER.decode(((f.c) fVar2).f154188b.f154123d);
                                    com.ss.ugc.live.sdk.msg.d.a.a(this.f154137g, "receive uplink packet by msg http, logId: " + com.ss.ugc.live.sdk.msg.d.g.a(decode2));
                                    Integer num4 = decode2.uplinkStrategy;
                                    l.a((Object) num4, "");
                                    this.p = g.a.a(num4.intValue());
                                    Integer num5 = decode2.statusCode;
                                    if (num5 != null && num5.intValue() == 0) {
                                        l.a((Object) decode2, "");
                                        a6.a(decode2, g.WS_MSG_ORIGIN, this.f154138h.isWsConnected(), false);
                                    } else {
                                        Integer num6 = decode2.statusCode;
                                        l.a((Object) num6, "");
                                        int intValue2 = num6.intValue();
                                        String str4 = decode2.statusMessage;
                                        if (str4 != null) {
                                            str2 = str4;
                                        }
                                        a6.a(new c(intValue2, str2, null, 4, null), g.WS_MSG_ORIGIN, this.f154138h.isWsConnected());
                                    }
                                } else if (fVar2 instanceof f.b) {
                                    E e6 = ((f.b) fVar2).f154187b;
                                    com.ss.ugc.live.sdk.msg.d.a.a(this.f154137g, "receive uplink packet by msg error");
                                    a6.a(e6, g.WS_MSG_ORIGIN, this.f154138h.isWsConnected());
                                } else {
                                    throw new n();
                                }
                            }
                        } catch (Exception e7) {
                            a6.a(e7, g.WS_MSG_ORIGIN, this.f154138h.isWsConnected());
                        }
                        a(a6);
                        return;
                    }
                    throw new w("null cannot be cast to non-null type");
                } else if (i2 == f154130m) {
                    Object obj4 = message.obj;
                    if (obj4 != null) {
                        d dVar4 = (d) obj4;
                        com.ss.ugc.live.sdk.msg.d.a.a(this.f154137g, "receive uplink packet by origin http");
                        d a7 = this.f154135e.a(dVar4.f154159f);
                        if (a7 == null) {
                            a(dVar4.f154160g, dVar4.f154159f, 0, "receiveOriginHttpResult");
                            return;
                        }
                        try {
                            com.ss.ugc.live.sdk.msg.d.f<com.ss.ugc.live.sdk.msg.b.f, ? extends Exception> fVar3 = a7.f154155b;
                            if (fVar3 != null) {
                                if (fVar3 instanceof f.c) {
                                    V v = ((f.c) fVar3).f154188b;
                                    g gVar2 = g.ORIGIN;
                                    boolean isWsConnected2 = this.f154138h.isWsConnected();
                                    l.c(v, "");
                                    l.c(gVar2, "");
                                    a7.f154156c = v;
                                    f fVar4 = a7.f154157d;
                                    l.c(v, "");
                                    l.c(gVar2, "");
                                    fVar4.f154173f = System.currentTimeMillis();
                                    fVar4.f154169b = gVar2;
                                    fVar4.f154171d = isWsConnected2;
                                    fVar4.f154174g = true;
                                    fVar4.f154175h = v.f154120a;
                                    String str5 = v.f154121b;
                                    l.a((Object) str5, "");
                                    fVar4.f154176i = str5;
                                } else if (fVar3 instanceof f.b) {
                                    a7.a(((f.b) fVar3).f154187b, g.ORIGIN, this.f154138h.isWsConnected());
                                } else {
                                    throw new n();
                                }
                            }
                        } catch (Exception e8) {
                            a7.a(e8, g.ORIGIN, this.f154138h.isWsConnected());
                        }
                        a(a7);
                        return;
                    }
                    throw new w("null cannot be cast to non-null type");
                } else if (i2 == n) {
                    a();
                }
            }
        }
    }

    private final void a(long j2, long j3, long j4, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("receive_type", str);
        jSONObject.put("service_id", j2);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("log_id", j4);
        jSONObject3.put("unique_id", j3);
        this.f154137g.monitor("uplink_receive_request_no_item_found_error", jSONObject, jSONObject2, jSONObject3);
        com.ss.ugc.live.sdk.msg.d.a.a(this.f154137g, "no request item found");
    }

    public a(com.ss.ugc.live.sdk.msg.a aVar, IMessageWsClient iMessageWsClient, IMessageClient iMessageClient, com.ss.ugc.live.sdk.msg.a.a aVar2) {
        g gVar;
        l.c(aVar, "");
        l.c(iMessageWsClient, "");
        l.c(iMessageClient, "");
        l.c(aVar2, "");
        this.f154137g = aVar;
        this.f154138h = iMessageWsClient;
        this.q = iMessageClient;
        this.f154139i = aVar2;
        if (aVar2.b() && aVar2.c()) {
            gVar = g.WS_MSG_ORIGIN;
        } else if (aVar2.b()) {
            gVar = g.WS_ORIGIN;
        } else {
            gVar = g.ORIGIN;
        }
        this.p = gVar;
        this.f154135e = new e();
        this.f154136f = new c();
    }

    private final void a(long j2, g gVar, boolean z, Exception exc) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("service_id", j2);
        jSONObject.put("send_uplink_strategy", gVar.getStrategy(z));
        jSONObject.put("ws_connected", z);
        JSONObject jSONObject2 = new JSONObject();
        String message = exc.getMessage();
        if (message == null) {
            message = "Unknown exception";
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("error", message);
        this.f154137g.monitor("uplink_send_error", jSONObject, jSONObject2, jSONObject3);
        com.ss.ugc.live.sdk.msg.d.a.a(this.f154137g, "uplink send error, use strategy: " + gVar.getStrategy(z) + ", ws connect: " + z + ", error: " + message);
    }

    private final void a(d dVar, long j2, g gVar, boolean z, Exception exc) {
        dVar.a(new c(-5, "sendRequestError", null, 4, null), this.p, this.f154138h.isWsConnected());
        a(dVar);
        a(j2, gVar, z, exc);
    }
}
