package com.bytedance.common.wschannel.channel.a.a;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.m;
import com.bytedance.common.wschannel.c.b;
import com.bytedance.common.wschannel.c.b.a;
import com.bytedance.common.wschannel.channel.a.a.b.a;
import com.bytedance.common.wschannel.channel.a.a.b.c;
import com.bytedance.common.wschannel.l;
import com.bytedance.common.wschannel.server.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import k.i;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.ws.RealWebSocket;

final class b implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public c f27052a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f27053b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f27054c;

    /* renamed from: d  reason: collision with root package name */
    public d f27055d;

    /* renamed from: e  reason: collision with root package name */
    public a f27056e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f27057f;

    /* renamed from: g  reason: collision with root package name */
    public com.bytedance.common.wschannel.c.a f27058g;

    /* renamed from: h  reason: collision with root package name */
    public com.bytedance.common.wschannel.c.b f27059h;

    /* renamed from: i  reason: collision with root package name */
    private final Context f27060i;

    /* renamed from: j  reason: collision with root package name */
    private final C0583b f27061j;

    /* renamed from: k  reason: collision with root package name */
    private OkHttpClient f27062k;

    /* renamed from: l  reason: collision with root package name */
    private int f27063l;

    /* renamed from: m  reason: collision with root package name */
    private Request f27064m;
    private Map<String, Object> n;
    private c o;

    /* access modifiers changed from: package-private */
    public interface d {
        static {
            Covode.recordClassIndex(15991);
        }

        void a(String str);

        void a(String str, int i2, String str2);

        void a(i iVar);

        void a(Response response);

        void b(String str);

        void c(String str);
    }

    static {
        Covode.recordClassIndex(15973);
    }

    public final void d() {
        c cVar = this.f27052a;
        if (cVar != null) {
            cVar.a();
        }
    }

    private void i() {
        a aVar = this.f27056e;
        if (aVar != null) {
            aVar.b("normal close");
        }
    }

    public final void c() {
        d();
        this.f27054c.removeMessages(1);
    }

    /* access modifiers changed from: package-private */
    public final synchronized int e() {
        int i2;
        MethodCollector.i(9221);
        i2 = this.f27063l;
        MethodCollector.o(9221);
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        if (e() == 4) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.f27054c.removeMessages(2);
        this.f27054c.removeMessages(1);
        this.f27054c.removeMessages(3);
        this.f27054c.removeMessages(5);
        c();
        h();
    }

    public final void g() {
        d dVar;
        Request request = this.f27064m;
        if (!(request == null || (dVar = this.f27055d) == null)) {
            dVar.a(request.url().toString(), 3, "heatbeat timeout");
        }
        Pair<String, Long> a2 = this.f27052a.a(null);
        b();
        i();
        a(0, (String) a2.first, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b$b  reason: collision with other inner class name */
    public static final class C0583b {

        /* renamed from: a  reason: collision with root package name */
        public Context f27104a;

        /* renamed from: b  reason: collision with root package name */
        public List<String> f27105b;

        /* renamed from: c  reason: collision with root package name */
        public OkHttpClient f27106c;

        /* renamed from: d  reason: collision with root package name */
        public com.bytedance.common.wschannel.channel.a.a.a.b f27107d;

        /* renamed from: e  reason: collision with root package name */
        public com.bytedance.common.wschannel.c.a f27108e;

        static {
            Covode.recordClassIndex(15982);
        }

        public final String toString() {
            return "Config{mHeartBeatPolicy=" + this.f27108e + ", mContext=" + this.f27104a + ", wsUrls=" + this.f27105b + ", mOkHttpClient=" + this.f27106c + ", mRetryPolicy=" + this.f27107d + '}';
        }

        C0583b(Context context, List<String> list, OkHttpClient okHttpClient, com.bytedance.common.wschannel.channel.a.a.a.b bVar, com.bytedance.common.wschannel.c.a aVar) {
            this.f27104a = context;
            this.f27105b = list;
            this.f27106c = okHttpClient;
            this.f27107d = bVar;
            this.f27108e = aVar;
        }
    }

    private boolean h() {
        int e2 = e();
        if (!(e2 == 3 || e2 == 2 || e2 == 5)) {
            this.f27058g.c();
            a aVar = this.f27056e;
            if (aVar != null) {
                this.f27054c.sendMessageDelayed(this.f27054c.obtainMessage(6, aVar), 1000);
                if (e2 == 4) {
                    this.f27056e.close(1000, "normal close");
                    a(6);
                    return false;
                }
                this.f27056e.cancel();
                a(3);
                if (e2 != 1) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        a(new Runnable() {
            /* class com.bytedance.common.wschannel.channel.a.a.b.AnonymousClass3 */

            static {
                Covode.recordClassIndex(15976);
            }

            public final void run() {
                b.this.f27053b = true;
                b.this.b();
            }
        });
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        Context f27076a;

        /* renamed from: b  reason: collision with root package name */
        List<String> f27077b;

        /* renamed from: c  reason: collision with root package name */
        OkHttpClient f27078c;

        /* renamed from: d  reason: collision with root package name */
        com.bytedance.common.wschannel.channel.a.a.a.b f27079d;

        /* renamed from: e  reason: collision with root package name */
        com.bytedance.common.wschannel.c.a f27080e;

        static {
            Covode.recordClassIndex(15981);
        }

        a(Context context) {
            this.f27076a = context;
        }
    }

    class c extends com.bytedance.common.wschannel.channel.a.a.b.c {
        static {
            Covode.recordClassIndex(15983);
        }

        private c() {
        }

        @Override // com.bytedance.common.wschannel.channel.a.a.b.c
        public final void a(final com.bytedance.common.wschannel.channel.a.a.b.b bVar) {
            b.this.a(new Runnable() {
                /* class com.bytedance.common.wschannel.channel.a.a.b.c.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(15990);
                }

                public final void run() {
                    if (bVar == b.this.f27056e) {
                        if (b.this.f27059h.f27024b.get()) {
                            com.bytedance.common.wschannel.c.b bVar = b.this.f27059h;
                            bVar.f27024b.set(false);
                            bVar.f27027e.removeCallbacks(bVar.f27028f);
                            return;
                        }
                        b.this.f27058g.a();
                    }
                }
            });
        }

        @Override // com.bytedance.common.wschannel.channel.a.a.b.c
        public final void a(final String str) {
            b.this.a(new Runnable() {
                /* class com.bytedance.common.wschannel.channel.a.a.b.c.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(15986);
                }

                public final void run() {
                    if (b.this.f27055d != null) {
                        b.this.f27055d.c(str);
                    }
                }
            });
        }

        @Override // com.bytedance.common.wschannel.channel.a.a.b.c
        public final void a(final i iVar) {
            b.this.a(new Runnable() {
                /* class com.bytedance.common.wschannel.channel.a.a.b.c.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(15985);
                }

                public final void run() {
                    if (b.this.f27055d != null) {
                        b.this.f27055d.a(iVar);
                    }
                }
            });
        }

        /* synthetic */ c(b bVar, byte b2) {
            this();
        }

        @Override // com.bytedance.common.wschannel.channel.a.a.b.c
        public final void a(final com.bytedance.common.wschannel.channel.a.a.b.b bVar, final Response response) {
            b.this.a(new Runnable() {
                /* class com.bytedance.common.wschannel.channel.a.a.b.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(15984);
                }

                public final void run() {
                    if (b.this.f27056e == bVar) {
                        b.this.a(4);
                        b.this.c();
                        b.this.f27058g.a(response);
                        if (b.this.f27055d != null) {
                            b.this.f27055d.a(response);
                        }
                    }
                }
            });
        }

        @Override // com.bytedance.common.wschannel.channel.a.a.b.c
        public final void a(com.bytedance.common.wschannel.channel.a.a.b.b bVar, int i2, String str) {
            super.a(bVar, i2, str);
            b.this.a(new Runnable() {
                /* class com.bytedance.common.wschannel.channel.a.a.b.c.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(15987);
                }

                public final void run() {
                    b.this.a(6);
                }
            });
        }

        @Override // com.bytedance.common.wschannel.channel.a.a.b.c
        public final void b(final com.bytedance.common.wschannel.channel.a.a.b.b bVar, final int i2, final String str) {
            final String a2 = b.a(bVar);
            b.this.a(new Runnable() {
                /* class com.bytedance.common.wschannel.channel.a.a.b.c.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(15988);
                }

                public final void run() {
                    if (b.this.f27056e == bVar) {
                        b.this.a(3);
                        b.this.f27056e = null;
                        b.this.f27058g.c();
                        if (b.this.f27055d != null) {
                            b.this.f27055d.b(a2);
                        }
                        if (b.this.f27057f) {
                            b.this.f27057f = false;
                            b.this.a(b.this.f27052a.b());
                        } else if (!b.this.f27053b) {
                            Pair<String, Long> a2 = b.this.f27052a.a(null);
                            b.this.a(((Long) a2.second).longValue(), (String) a2.first, true);
                        }
                    }
                }
            });
        }

        @Override // com.bytedance.common.wschannel.channel.a.a.b.c
        public final void a(final com.bytedance.common.wschannel.channel.a.a.b.b bVar, Throwable th, Response response) {
            final String str;
            final String a2 = b.a(bVar);
            final int a3 = b.a(response);
            if (a3 == 0) {
                str = "success";
            } else if (a3 == 404) {
                str = "uri not found";
            } else if (a3 == 409) {
                str = "fpid not registered";
            } else if (a3 == 410) {
                str = "invalid device id";
            } else if (a3 == 411) {
                str = "appid not registered";
            } else if (a3 == 412) {
                str = "websocket protocol not support";
            } else if (a3 == 413) {
                str = "the device already connected";
            } else if (a3 == 414) {
                str = "server can't accept more connection,try again later";
            } else if (a3 == 415) {
                str = "device was blocked";
            } else if (a3 == 416) {
                str = "parameter error";
            } else if (a3 == 417) {
                str = "authentication failed";
            } else if (a3 == 510) {
                str = "server internal error";
            } else if (a3 == 511) {
                str = "server is busy，try again later";
            } else if (a3 == 512) {
                str = "server is shutting down";
            } else if (a3 == 513) {
                str = "auth server is error";
            } else if (a3 == 514) {
                str = "auth return error";
            } else {
                str = "";
            }
            if (m.a(str)) {
                if (m.a(th.getMessage())) {
                    str = Log.getStackTraceString(th);
                } else {
                    str = th.getMessage();
                }
            }
            final Pair<String, Long> a4 = b.this.f27052a.a(response);
            if (response != null) {
                try {
                    response.close();
                } catch (Throwable unused) {
                }
            }
            b.this.a(new Runnable() {
                /* class com.bytedance.common.wschannel.channel.a.a.b.c.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(15989);
                }

                public final void run() {
                    if (b.this.f27055d != null) {
                        b.this.f27055d.a(a2, a3, str);
                    }
                    if (b.this.f27057f) {
                        b.this.f27057f = false;
                        b.this.a(b.this.f27052a.b());
                    } else if (b.this.f27056e == bVar) {
                        int i2 = a3;
                        if (i2 <= 0 || i2 == 414 || i2 == 511 || i2 == 512 || i2 == 513) {
                            b.this.f27058g.c();
                            b.this.a(((Long) a4.second).longValue(), (String) a4.first, false);
                            return;
                        }
                        b.this.a(2);
                        b.this.d();
                    }
                }
            });
        }
    }

    public final void a(Runnable runnable) {
        this.f27054c.post(runnable);
    }

    public static int a(Response response) {
        if (response == null) {
            return -1;
        }
        try {
            return Integer.parseInt(response.header("Handshake-Status"));
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String a(WebSocket webSocket) {
        Request request;
        HttpUrl url;
        if (webSocket == null || (request = webSocket.request()) == null || (url = request.url()) == null) {
            return "";
        }
        return url.toString();
    }

    private b(C0583b bVar) {
        this.f27063l = 3;
        this.n = new ConcurrentHashMap();
        this.f27054c = new WeakHandler(Looper.myLooper(), this);
        this.o = new c(this, (byte) 0);
        this.f27061j = bVar;
        this.f27060i = bVar.f27104a;
        this.f27062k = bVar.f27106c;
        com.bytedance.common.wschannel.c.a aVar = bVar.f27108e;
        this.f27058g = aVar;
        if (aVar == null) {
            this.f27058g = new com.bytedance.common.wschannel.c.b.b(new a.C0581a((byte) 0));
        }
        this.f27058g.a(new com.bytedance.common.wschannel.c.c() {
            /* class com.bytedance.common.wschannel.channel.a.a.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15974);
            }

            @Override // com.bytedance.common.wschannel.c.c
            public final void a() {
                b.this.g();
            }

            @Override // com.bytedance.common.wschannel.c.c
            public final void b() {
                b bVar = b.this;
                bVar.f27054c.post(new Runnable() {
                    /* class com.bytedance.common.wschannel.channel.a.a.b.AnonymousClass6 */

                    static {
                        Covode.recordClassIndex(15979);
                    }

                    public final void run() {
                        try {
                            if (b.this.f27056e != null) {
                                b.this.f27056e.d();
                            }
                        } catch (Throwable unused) {
                        }
                        b.this.f27058g.b();
                    }
                });
            }
        }, this.f27054c);
        this.f27059h = new com.bytedance.common.wschannel.c.b(new b.a() {
            /* class com.bytedance.common.wschannel.channel.a.a.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(15975);
            }

            @Override // com.bytedance.common.wschannel.c.b.a
            public final void a() {
                b.this.g();
            }
        }, this.f27054c);
    }

    public final synchronized void a(int i2) {
        MethodCollector.i(9222);
        this.f27063l = i2;
        MethodCollector.o(9222);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        com.bytedance.common.wschannel.c.a.a aVar;
        if (message != null) {
            int i2 = message.what;
            if (i2 == 1) {
                if (!f()) {
                    this.f27054c.removeMessages(1);
                    this.f27054c.removeMessages(2);
                    a((String) message.obj);
                }
            } else if (i2 == 2) {
                try {
                    this.f27054c.removeMessages(2);
                    this.f27054c.removeMessages(1);
                    this.f27061j.f27105b = (List) message.obj;
                    this.f27053b = false;
                    this.f27052a = new c(this.f27061j.f27105b, this.f27061j.f27107d);
                    c();
                    a(this.f27052a.b());
                } catch (Throwable unused) {
                }
            } else if (i2 == 3) {
                this.f27054c.removeMessages(2);
                this.f27054c.removeMessages(1);
                if (!f()) {
                    c();
                    if (!h.a(this.f27060i)) {
                        return;
                    }
                    if (h()) {
                        c cVar = this.f27052a;
                        if (cVar != null) {
                            a(cVar.b());
                            return;
                        }
                        return;
                    }
                    this.f27057f = true;
                }
            } else if (i2 == 5) {
                if (((Boolean) message.obj).booleanValue()) {
                    aVar = com.bytedance.common.wschannel.c.a.a.STATE_FOREGROUND;
                } else {
                    aVar = com.bytedance.common.wschannel.c.a.a.STATE_BACKGROUND;
                }
                com.bytedance.common.wschannel.c.b bVar = this.f27059h;
                if (!bVar.f27024b.get() && bVar.f27023a == com.bytedance.common.wschannel.c.a.a.STATE_BACKGROUND && aVar == com.bytedance.common.wschannel.c.a.a.STATE_FOREGROUND) {
                    try {
                        if (bVar.f27025c != null) {
                            bVar.f27025c.d();
                            bVar.f27024b.set(true);
                            bVar.f27027e.removeCallbacks(bVar.f27028f);
                            bVar.f27027e.postDelayed(bVar.f27028f, 5000);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                bVar.f27023a = aVar;
            } else if (i2 == 7) {
                try {
                    this.f27054c.removeMessages(2);
                    this.f27054c.removeMessages(1);
                    this.f27061j.f27105b = (List) message.obj;
                    this.f27053b = false;
                    this.f27052a = new c(this.f27061j.f27105b, this.f27061j.f27107d);
                    c();
                    if (h()) {
                        a(this.f27052a.b());
                    } else {
                        this.f27057f = true;
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public final void a(String str) {
        String str2;
        if (!h.a(this.f27060i)) {
            a(str, 1, "network error", true);
            return;
        }
        int e2 = e();
        if (e2 != 4 && e2 != 1) {
            try {
                if (this.f27062k == null) {
                    this.f27062k = new OkHttpClient.Builder().protocols(Collections.singletonList(Protocol.HTTP_1_1)).build();
                }
                Map<String, Object> map = this.n;
                String str3 = "";
                if (!TextUtils.isEmpty(str) && map != null) {
                    String lowerCase = com.bytedance.common.wschannel.e.d.a(String.valueOf(map.get("fpid")) + String.valueOf(map.get("app_key")) + String.valueOf(map.get("device_id")) + "f8a69f1719916z").toLowerCase();
                    Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        if (entry != null && !TextUtils.isEmpty(entry.getKey())) {
                            if (entry.getValue() == null) {
                                str2 = str3;
                            } else {
                                str2 = entry.getValue().toString();
                            }
                            String key = entry.getKey();
                            if (!m.a("app_key", key) && !m.a(key, "extra")) {
                                if (m.a("app_version", key)) {
                                    buildUpon.appendQueryParameter("version_code", str2);
                                } else {
                                    buildUpon.appendQueryParameter(key, str2);
                                }
                            }
                        }
                    }
                    String str4 = (String) map.get("extra");
                    int i2 = 2;
                    if (!m.a(str4)) {
                        String[] split = str4.split("&");
                        for (String str5 : split) {
                            if (!TextUtils.isEmpty(str5)) {
                                String[] split2 = str5.split("=");
                                if (split2.length == 2) {
                                    buildUpon.appendQueryParameter(split2[0], split2[1]);
                                }
                            }
                        }
                    }
                    buildUpon.appendQueryParameter("access_key", lowerCase);
                    h.a b2 = h.b(this.f27060i);
                    if (b2 == null || b2 == h.a.NONE) {
                        i2 = 0;
                    } else if (b2 == h.a.WIFI) {
                        i2 = 1;
                    } else if (b2 != h.a.MOBILE_2G) {
                        if (b2 == h.a.MOBILE_3G) {
                            i2 = 3;
                        } else {
                            i2 = 4;
                        }
                    }
                    buildUpon.appendQueryParameter("ne", String.valueOf(i2));
                    str3 = buildUpon.build().toString();
                }
                if (!m.a(str3)) {
                    i();
                    Request request = this.f27064m;
                    if (request == null || !str3.equals(request.url().toString())) {
                        this.f27064m = new Request.Builder().addHeader("Sec-Websocket-Protocol", "pbbp").url(str3).build();
                    }
                    a(1);
                    com.bytedance.common.wschannel.channel.a.a.b.a aVar = new com.bytedance.common.wschannel.channel.a.a.b.a(this.f27064m, l.a(this.f27060i).f27243a.a("key_io_limit_size", 102400), this.o, new Random());
                    this.f27056e = aVar;
                    OkHttpClient okHttpClient = this.f27062k;
                    Request build = aVar.f27084b.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", aVar.f27085c).header("Sec-WebSocket-Version", "13").build();
                    aVar.f27086d = Internal.instance.newWebSocketCall(okHttpClient, build);
                    aVar.f27086d.enqueue(new Callback(build) {
                        /* class com.bytedance.common.wschannel.channel.a.a.b.a.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ Request f27095a;

                        static {
                            Covode.recordClassIndex(15994);
                        }

                        {
                            this.f27095a = r2;
                        }

                        @Override // okhttp3.Callback
                        public final void onFailure(Call call, IOException iOException) {
                            a.this.a(iOException, (Response) null);
                        }

                        @Override // okhttp3.Callback
                        public final void onResponse(Call call, Response response) {
                            try {
                                a aVar = a.this;
                                if (response.code() == 101) {
                                    String header = response.header("Connection");
                                    if ("Upgrade".equalsIgnoreCase(header)) {
                                        String header2 = response.header("Upgrade");
                                        if ("websocket".equalsIgnoreCase(header2)) {
                                            String header3 = response.header("Sec-WebSocket-Accept");
                                            String base64 = i.encodeUtf8(aVar.f27085c + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
                                            if (base64.equals(header3)) {
                                                StreamAllocation streamAllocation = Internal.instance.streamAllocation(call);
                                                streamAllocation.noNewStreams();
                                                RealWebSocket.Streams newWebSocketStreams = streamAllocation.connection().newWebSocketStreams(streamAllocation);
                                                try {
                                                    if (a.this.f27083a != null) {
                                                        a.this.f27083a.a(a.this, response);
                                                    }
                                                    a.this.a("OkHttp WebSocket " + this.f27095a.url().redact(), newWebSocketStreams);
                                                    streamAllocation.connection().socket().setSoTimeout(0);
                                                    a.this.a();
                                                } catch (Exception e2) {
                                                    a.this.a(e2, (Response) null);
                                                }
                                            } else {
                                                throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + base64 + "' but was '" + header3 + "'");
                                            }
                                        } else {
                                            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + header2 + "'");
                                        }
                                    } else {
                                        throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + header + "'");
                                    }
                                } else {
                                    throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + " " + response.message() + "'");
                                }
                            } catch (ProtocolException e3) {
                                a.this.a(e3, response);
                                Util.closeQuietly(response);
                            }
                        }
                    });
                    this.f27059h.f27025c = this.f27056e;
                    d dVar = this.f27055d;
                    if (dVar != null) {
                        dVar.a(str3);
                    }
                }
            } catch (Throwable th) {
                d dVar2 = this.f27055d;
                if (dVar2 != null) {
                    dVar2.a(str, 4, Log.getStackTraceString(th));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Map<String, Object> map) {
        if (map != null) {
            map.remove("channel_id");
            this.n.putAll(map);
        }
    }

    /* synthetic */ b(C0583b bVar, byte b2) {
        this(bVar);
    }

    public final void a(long j2, String str, boolean z) {
        this.f27054c.removeMessages(1);
        if (!h.a(this.f27060i)) {
            a(str, 1, "network error", z);
        } else if (!this.f27053b) {
            if (j2 == -1 || m.a(str)) {
                Bundle bundle = new Bundle();
                bundle.putString("method", "tryReconnect");
                bundle.putLong("interval", j2);
                a(str, 2, "retry failed", z);
                str = this.f27052a.b();
            } else {
                a(5);
            }
            Message message = new Message();
            message.what = 1;
            message.obj = str;
            this.f27054c.sendMessageDelayed(message, j2);
        }
    }

    private void a(String str, int i2, String str2, boolean z) {
        a(2);
        d();
        d dVar = this.f27055d;
        if (dVar != null && z) {
            dVar.a(str, i2, str2);
        }
    }
}
