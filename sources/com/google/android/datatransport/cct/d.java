package com.google.android.datatransport.cct;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.cct.a.c;
import com.google.android.datatransport.cct.a.d;
import com.google.android.datatransport.cct.a.e;
import com.google.android.datatransport.cct.a.f;
import com.google.android.datatransport.cct.a.g;
import com.google.android.datatransport.cct.a.h;
import com.google.android.datatransport.cct.a.j;
import com.google.android.datatransport.cct.a.k;
import com.google.android.datatransport.cct.a.l;
import com.google.android.datatransport.cct.a.m;
import com.google.android.datatransport.cct.a.n;
import com.google.android.datatransport.cct.a.o;
import com.google.android.datatransport.cct.a.p;
import com.google.android.datatransport.cct.a.q;
import com.google.android.datatransport.cct.a.r;
import com.google.android.datatransport.cct.a.t;
import com.google.android.datatransport.cct.a.u;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.backends.m;
import com.google.android.datatransport.runtime.h;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;

final class d implements m {

    /* renamed from: a  reason: collision with root package name */
    final URL f49365a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.firebase.a.a f49366b = new com.google.firebase.a.a.a().a(e.class, new l()).a(h.class, new r()).a(f.class, new n()).a(g.class, new p()).a(com.google.android.datatransport.cct.a.d.class, new c()).a(j.class, new u()).a();

    /* renamed from: c  reason: collision with root package name */
    private final ConnectivityManager f49367c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.datatransport.runtime.d.a f49368d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.android.datatransport.runtime.d.a f49369e;

    /* renamed from: f  reason: collision with root package name */
    private final int f49370f;

    static {
        Covode.recordClassIndex(30892);
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    private static URL a(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException("Invalid url: ".concat(String.valueOf(str)), e2);
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.m
    public final com.google.android.datatransport.runtime.h a(com.google.android.datatransport.runtime.h hVar) {
        int type;
        int subtype;
        NetworkInfo a2 = a(this.f49367c);
        h.a a3 = hVar.h().a("sdk-version", Build.VERSION.SDK_INT).a("model", Build.MODEL).a("hardware", Build.HARDWARE).a("device", Build.DEVICE).a("product", Build.PRODUCT).a("os-uild", Build.ID).a("manufacturer", Build.MANUFACTURER).a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        h.a a4 = a3.a("tz-offset", (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000));
        if (a2 == null) {
            type = t.c.zzs.zza();
        } else {
            type = a2.getType();
        }
        h.a a5 = a4.a("net-type", type);
        if (a2 == null) {
            subtype = t.b.zza.zza();
        } else {
            subtype = a2.getSubtype();
            if (subtype == -1) {
                subtype = t.b.zzu.zza();
            } else if (t.b.zza(subtype) == null) {
                subtype = 0;
            }
        }
        return a5.a("mobile-subtype", subtype).b();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        com.google.android.datatransport.runtime.a.a.a("CctTransportBackend");
        r1 = new com.google.android.datatransport.cct.d.b(400, null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0170, code lost:
        r9.close();
        r5.close();
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2786);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0179, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x017a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x017b, code lost:
        r9.close();
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2786);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0181, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x0166 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.datatransport.cct.d.b a(com.google.android.datatransport.cct.d.a r16) {
        /*
        // Method dump skipped, instructions count: 400
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.cct.d.a(com.google.android.datatransport.cct.d$a):com.google.android.datatransport.cct.d$b");
    }

    @Override // com.google.android.datatransport.runtime.backends.m
    public final com.google.android.datatransport.runtime.backends.g a(com.google.android.datatransport.runtime.backends.f fVar) {
        o.a a2;
        HashMap hashMap = new HashMap();
        for (com.google.android.datatransport.runtime.h hVar : fVar.a()) {
            String a3 = hVar.a();
            if (!hashMap.containsKey(a3)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(hVar);
                hashMap.put(a3, arrayList);
            } else {
                ((List) hashMap.get(a3)).add(hVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            com.google.android.datatransport.runtime.h hVar2 = (com.google.android.datatransport.runtime.h) ((List) entry.getValue()).get(0);
            q.a a4 = new h.a().a(Integer.MIN_VALUE).a(com.google.android.datatransport.cct.a.b.zza).a(this.f49369e.a()).b(this.f49368d.a()).a(new f.a().a(m.b.zzb).a(new d.a().a(Integer.MIN_VALUE).a(hVar2.a("sdk-version")).a(hVar2.c("model")).b(hVar2.c("hardware")).c(hVar2.c("device")).d(hVar2.c("product")).e(hVar2.c("os-uild")).f(hVar2.c("manufacturer")).g(hVar2.c("fingerprint")).a()).a());
            try {
                a4.a(Integer.valueOf((String) entry.getKey()).intValue());
            } catch (NumberFormatException unused) {
                a4.a((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (com.google.android.datatransport.runtime.h hVar3 : (List) entry.getValue()) {
                com.google.android.datatransport.runtime.g c2 = hVar3.c();
                com.google.android.datatransport.b bVar = c2.f49447a;
                if (bVar.equals(com.google.android.datatransport.b.a("proto"))) {
                    a2 = new g.a().a(Integer.MIN_VALUE).a(c2.f49448b);
                } else if (bVar.equals(com.google.android.datatransport.b.a("json"))) {
                    a2 = new g.a().a(Integer.MIN_VALUE).a(new String(c2.f49448b, Charset.forName("UTF-8")));
                } else {
                    com.google.android.datatransport.runtime.a.a.a("CctTransportBackend");
                    com.a.a("Received event of unsupported encoding %s. Skipping...", new Object[]{bVar});
                }
                a2.a(hVar3.d()).b(hVar3.e()).c(hVar3.b("tz-offset")).a(new j.a().a(t.c.zza(hVar3.a("net-type"))).a(t.b.zza(hVar3.a("mobile-subtype"))).a());
                if (hVar3.b() != null) {
                    a2.a(hVar3.b().intValue());
                }
                arrayList3.add(a2.a());
            }
            a4.a(arrayList3);
            arrayList2.add(a4.a());
        }
        e eVar = new e(arrayList2);
        URL url = this.f49365a;
        String str = null;
        if (fVar.b() != null) {
            try {
                String str2 = new String(fVar.b(), Charset.forName("UTF-8"));
                if (str2.startsWith("1$")) {
                    String[] split = str2.substring(2).split(Pattern.quote("\\"), 2);
                    if (split.length == 2) {
                        String str3 = split[0];
                        if (!str3.isEmpty()) {
                            String str4 = split[1];
                            if (str4.isEmpty()) {
                                str4 = null;
                            }
                            a aVar = new a(str3, str4);
                            if (aVar.f49305g != null) {
                                str = aVar.f49305g;
                            }
                            if (aVar.f49304f != null) {
                                url = a(aVar.f49304f);
                            }
                        } else {
                            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
                        }
                    } else {
                        throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
                    }
                } else {
                    throw new IllegalArgumentException("Version marker missing from extras");
                }
            } catch (IllegalArgumentException unused2) {
                return com.google.android.datatransport.runtime.backends.g.d();
            }
        }
        try {
            b bVar2 = (b) com.google.android.datatransport.runtime.b.b.a(5, new a(url, eVar, str), new b(this), c.f49364a);
            if (bVar2.f49374a == 200) {
                return new com.google.android.datatransport.runtime.backends.b(g.a.OK, bVar2.f49376c);
            }
            int i2 = bVar2.f49374a;
            if (i2 >= 500 || i2 == 404) {
                return com.google.android.datatransport.runtime.backends.g.c();
            }
            return com.google.android.datatransport.runtime.backends.g.d();
        } catch (IOException unused3) {
            com.google.android.datatransport.runtime.a.a.a("CctTransportBackend");
            return com.google.android.datatransport.runtime.backends.g.c();
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(2756);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.c.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(2756);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final URL f49371a;

        /* renamed from: b  reason: collision with root package name */
        final k f49372b;

        /* renamed from: c  reason: collision with root package name */
        final String f49373c;

        static {
            Covode.recordClassIndex(30893);
        }

        a(URL url, k kVar, String str) {
            this.f49371a = url;
            this.f49372b = kVar;
            this.f49373c = str;
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        final int f49374a;

        /* renamed from: b  reason: collision with root package name */
        final URL f49375b;

        /* renamed from: c  reason: collision with root package name */
        final long f49376c;

        static {
            Covode.recordClassIndex(30894);
        }

        b(int i2, URL url, long j2) {
            this.f49374a = i2;
            this.f49375b = url;
            this.f49376c = j2;
        }
    }

    d(Context context, com.google.android.datatransport.runtime.d.a aVar, com.google.android.datatransport.runtime.d.a aVar2) {
        this.f49367c = (ConnectivityManager) a(context, "connectivity");
        this.f49365a = a(a.f49298a);
        this.f49368d = aVar2;
        this.f49369e = aVar;
        this.f49370f = 40000;
    }
}
