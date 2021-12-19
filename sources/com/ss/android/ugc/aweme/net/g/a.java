package com.ss.android.ugc.aweme.net.g;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.u;
import h.f.b.l;
import h.f.b.z;
import h.h;
import h.i;
import h.m;
import h.m.p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final Map<String, Long> f112331a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    static long f112332b;

    /* renamed from: c  reason: collision with root package name */
    static int f112333c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f112334d = new a();

    /* renamed from: e  reason: collision with root package name */
    private static final h f112335e = i.a(m.NONE, e.f112344a);

    /* renamed from: f  reason: collision with root package name */
    private static final h f112336f = i.a(m.NONE, b.f112341a);

    /* renamed from: g  reason: collision with root package name */
    private static final h f112337g = i.a(m.NONE, C2869a.f112340a);

    /* renamed from: h  reason: collision with root package name */
    private static final h f112338h = i.a((h.f.a.a) d.f112343a);

    /* renamed from: i  reason: collision with root package name */
    private static final Runnable f112339i = c.f112342a;

    public static int a() {
        return ((Number) f112335e.getValue()).intValue();
    }

    private static String[] c() {
        return (String[]) f112337g.getValue();
    }

    private static Handler d() {
        return (Handler) f112338h.getValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.net.g.a$a  reason: collision with other inner class name */
    static final class C2869a extends h.f.b.m implements h.f.a.a<String[]> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2869a f112340a = new C2869a();

        static {
            Covode.recordClassIndex(72181);
        }

        C2869a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String[] invoke() {
            return com.ss.android.ugc.aweme.net.d.c.a();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f112341a = new b();

        static {
            Covode.recordClassIndex(72182);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            return Long.valueOf((long) (a.a() << 1));
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f112343a = new d();

        static {
            Covode.recordClassIndex(72184);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            HandlerThread handlerThread = new HandlerThread("RepeatRequestQuicklyMob");
            handlerThread.start();
            return new Handler(handlerThread.getLooper());
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f112344a = new e();

        static {
            Covode.recordClassIndex(72185);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(com.bytedance.ies.abmock.b.a().a(true, "repeat_request_quickly_time_limit", 0));
        }
    }

    static void b() {
        f112332b = System.currentTimeMillis();
        d().postDelayed(f112339i, ((Number) f112336f.getValue()).longValue());
    }

    static {
        Covode.recordClassIndex(72180);
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final c f112342a = new c();

        static {
            Covode.recordClassIndex(72183);
        }

        c() {
        }

        public final void run() {
            long currentTimeMillis = System.currentTimeMillis() - ((long) a.a());
            if (a.f112332b <= currentTimeMillis || a.f112333c >= 3) {
                a.f112333c = 0;
                Iterator<Map.Entry<String, Long>> it = a.f112331a.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue().longValue() < currentTimeMillis) {
                        it.remove();
                    }
                }
                if (!a.f112331a.isEmpty()) {
                    a.b();
                    return;
                }
                return;
            }
            a.f112333c++;
            a.b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f112345a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Request f112346b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f112347c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f112348d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f112349e;

        static {
            Covode.recordClassIndex(72186);
        }

        f(z.e eVar, Request request, long j2, String str, String str2) {
            this.f112345a = eVar;
            this.f112346b = request;
            this.f112347c = j2;
            this.f112348d = str;
            this.f112349e = str2;
        }

        public final void run() {
            T t = this.f112345a.element;
            l.b(t, "");
            String path = this.f112346b.getPath();
            l.b(path, "");
            String method = this.f112346b.getMethod();
            l.b(method, "");
            long j2 = this.f112347c;
            String str = this.f112348d;
            l.b(str, "");
            String str2 = this.f112349e;
            Long l2 = a.f112331a.get(t);
            if (l2 != null) {
                long longValue = j2 - l2.longValue();
                if (longValue < ((long) a.a())) {
                    com.bytedance.apm.b.a("repeat_request_quickly", new JSONObject().put("limitTime", a.a()).put("urlPath", path).put("method", method).put("activityName", str2), new JSONObject().put("passTime", (int) longValue), new JSONObject().put("logId", str));
                }
            }
            a.f112331a.put(t, Long.valueOf(j2));
            a.b();
        }
    }

    public static boolean a(Request request) {
        l.d(request, "");
        if (a() == 0 || h.a.i.a(c(), request.getPath())) {
            return true;
        }
        if (l.a((Object) "GET", (Object) request.getMethod())) {
            return false;
        }
        if (!l.a((Object) "POST", (Object) request.getMethod())) {
            return true;
        }
        String mimeType = request.getBody().mimeType();
        l.b(mimeType, "");
        if (p.a((CharSequence) mimeType, (CharSequence) "application/x-www-form-urlencoded", false) || p.a((CharSequence) mimeType, (CharSequence) "application/json", false)) {
            return false;
        }
        return true;
    }

    public static void a(Request request, u<?> uVar, long j2, String str) {
        TypedOutput body;
        String md5Stub;
        l.d(request, "");
        l.d(uVar, "");
        l.d(str, "");
        for (com.bytedance.retrofit2.client.b bVar : uVar.f42629a.f42476d) {
            l.b(bVar, "");
            if (l.a((Object) "x-tt-logid", (Object) bVar.f42471a)) {
                String str2 = bVar.f42472b;
                z.e eVar = new z.e();
                eVar.element = (T) request.getUrl();
                if (!(!l.a((Object) request.getMethod(), (Object) "POST") || (body = request.getBody()) == null || (md5Stub = body.md5Stub()) == null)) {
                    eVar.element = (T) (((String) eVar.element) + "&postbodymd5=" + md5Stub);
                }
                d().post(new f(eVar, request, j2, str2, str));
                return;
            }
        }
    }
}
