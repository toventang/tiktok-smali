package com.bytedance.frameworks.baselib.network.http.d.a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.a;
import com.bytedance.frameworks.baselib.network.http.d.a.a.b;
import com.bytedance.frameworks.baselib.network.http.d.a.b.d;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.CipherSuite;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.TlsVersion;
import org.json.JSONObject;

public final class k {
    long A = 0;
    Protocol B = null;
    boolean C = false;
    boolean D = false;
    String E = "";
    Socket F;
    Headers G;
    String H = "";
    int I = 0;
    List<m> J = new ArrayList();
    d K = d.IDLE;
    String L = "";
    int M = -1;
    p N = p.UNKNOWN;
    String O = "";
    boolean P = false;
    boolean Q = false;
    List<d> R;
    int S = 0;
    b.a T = b.a.UNKNOWN;
    CopyOnWriteArrayList<String> U = new CopyOnWriteArrayList<>();
    String V = "";

    /* renamed from: a  reason: collision with root package name */
    long f29248a = -1;

    /* renamed from: b  reason: collision with root package name */
    long f29249b = -1;

    /* renamed from: c  reason: collision with root package name */
    long f29250c = -1;

    /* renamed from: d  reason: collision with root package name */
    long f29251d = -1;

    /* renamed from: e  reason: collision with root package name */
    long f29252e = -1;

    /* renamed from: f  reason: collision with root package name */
    long f29253f = -1;

    /* renamed from: g  reason: collision with root package name */
    long f29254g = -1;

    /* renamed from: h  reason: collision with root package name */
    long f29255h = -1;

    /* renamed from: i  reason: collision with root package name */
    long f29256i = -1;

    /* renamed from: j  reason: collision with root package name */
    long f29257j = -1;

    /* renamed from: k  reason: collision with root package name */
    long f29258k = -1;

    /* renamed from: l  reason: collision with root package name */
    long f29259l = -1;

    /* renamed from: m  reason: collision with root package name */
    long f29260m = -1;
    long n = -1;
    long o = -1;
    long p = -1;
    long q = -1;
    long r = -1;
    List<Pair<InetSocketAddress, Integer>> s = new ArrayList();
    Proxy.Type t = Proxy.Type.DIRECT;
    c u = c.HANDSHAKE_UNKNOWN;
    TlsVersion v;
    CipherSuite w;
    long x = 0;
    Headers y;
    int z = -1;

    static {
        Covode.recordClassIndex(17085);
    }

    private static long a(long j2, long j3) {
        if (j3 == -1 || j2 == -1) {
            return -1;
        }
        return j2 - j3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.k$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29261a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f29262b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0087 */
        static {
            /*
            // Method dump skipped, instructions count: 147
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.d.a.k.AnonymousClass1.<clinit>():void");
        }
    }

    private static long a(String str) {
        String[] split = str.split("=");
        if (split.length != 2) {
            return -1;
        }
        try {
            long parseLong = Long.parseLong(split[1]);
            if (parseLong < 0) {
                return -1;
            }
            return parseLong;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0342 A[LOOP:3: B:102:0x033c->B:104:0x0342, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x04a3 A[LOOP:5: B:133:0x049d->B:135:0x04a3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x04d3  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x04db  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x04df A[PHI: r3 r4 
      PHI: (r3v9 com.bytedance.frameworks.baselib.network.http.d.a.q) = (r3v6 com.bytedance.frameworks.baselib.network.http.d.a.q), (r3v10 com.bytedance.frameworks.baselib.network.http.d.a.q), (r3v11 com.bytedance.frameworks.baselib.network.http.d.a.q), (r3v6 com.bytedance.frameworks.baselib.network.http.d.a.q), (r3v6 com.bytedance.frameworks.baselib.network.http.d.a.q), (r3v6 com.bytedance.frameworks.baselib.network.http.d.a.q) binds: [B:137:0x04c9, B:142:0x04db, B:141:0x04d6, B:140:0x04d3, B:139:0x04d0, B:138:0x04cd] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v11 com.bytedance.frameworks.baselib.network.http.d.a.r) = (r4v8 com.bytedance.frameworks.baselib.network.http.d.a.r), (r4v12 com.bytedance.frameworks.baselib.network.http.d.a.r), (r4v13 com.bytedance.frameworks.baselib.network.http.d.a.r), (r4v14 com.bytedance.frameworks.baselib.network.http.d.a.r), (r4v15 com.bytedance.frameworks.baselib.network.http.d.a.r), (r4v16 com.bytedance.frameworks.baselib.network.http.d.a.r) binds: [B:137:0x04c9, B:142:0x04db, B:141:0x04d6, B:140:0x04d3, B:139:0x04d0, B:138:0x04cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x04e1  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0527  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0315  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(android.content.Context r18) {
        /*
        // Method dump skipped, instructions count: 1350
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.d.a.k.a(android.content.Context):java.lang.String");
    }

    public final void a(a aVar, Context context) {
        boolean z2;
        aVar.f28913a = this.E;
        aVar.f28922j = a(this.f29250c, this.f29249b);
        aVar.f28923k = a(this.f29253f, this.f29251d);
        aVar.f28924l = a(this.f29254g, this.f29253f);
        aVar.f28925m = a(this.f29256i, this.f29255h) + a(this.f29258k, this.f29257j);
        aVar.n = -1;
        aVar.o = a(this.f29260m, this.f29256i);
        if (this.f29251d != -1 || this.q == -1) {
            z2 = false;
        } else {
            z2 = true;
        }
        aVar.p = z2;
        aVar.q = -1;
        aVar.r = a(this.p, this.f29248a);
        aVar.s = this.x;
        aVar.t = this.A;
        aVar.y = a(context);
        aVar.u = -1;
        Headers headers = this.y;
        if (headers != null) {
            aVar.B = headers.toString();
            aVar.s += this.y.byteCount();
        }
        Headers headers2 = this.G;
        if (headers2 != null) {
            aVar.C = headers2.toString();
            aVar.t += this.G.byteCount();
        }
        aVar.K = this.H;
        aVar.E = -1;
        aVar.D = -1;
        aVar.F = -1;
    }

    private static void a(String str, JSONObject jSONObject, long j2) {
        String[] split;
        HashMap hashMap = new HashMap();
        n nVar = new n();
        if (!TextUtils.isEmpty(str) && (split = str.split(",")) != null) {
            for (String str2 : split) {
                String[] split2 = str2.split(";");
                if (split2 != null && !TextUtils.isEmpty(split2[0]) && !TextUtils.isEmpty(split2[1])) {
                    hashMap.put(split2[0], split2[1]);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String trim = ((String) entry.getKey()).trim();
            String trim2 = ((String) entry.getValue()).trim();
            if (trim.equalsIgnoreCase("cdn-cache")) {
                nVar.f29267a = true;
                String[] split3 = trim2.split("=");
                if (split3.length != 2 || !split3[1].equalsIgnoreCase("hit")) {
                    nVar.f29268b = false;
                } else {
                    nVar.f29268b = true;
                }
            } else if (trim.equalsIgnoreCase("edge")) {
                nVar.f29269c = a(trim2);
            } else if (trim.equalsIgnoreCase("origin")) {
                nVar.f29270d = a(trim2);
            } else if (trim.equalsIgnoreCase("inner")) {
                nVar.f29271e = a(trim2);
            } else if (!TextUtils.isEmpty(trim)) {
                jSONObject.put(trim, a(trim2));
            }
        }
        if (nVar.f29267a && nVar.f29268b) {
            jSONObject.put("edge", nVar.f29269c);
            jSONObject.put("cdn-cache", "hit");
            if (j2 != -1 && j2 > nVar.f29269c) {
                nVar.f29272f = j2 - nVar.f29269c;
            }
            jSONObject.put("rtt", nVar.f29272f);
        } else if (nVar.f29267a) {
            jSONObject.put("edge", nVar.f29269c);
            jSONObject.put("cdn-cache", "miss");
            if (nVar.f29270d > nVar.f29271e) {
                jSONObject.put("origin", nVar.f29270d - nVar.f29271e);
            } else {
                jSONObject.put("origin", -1);
            }
            jSONObject.put("inner", nVar.f29271e);
            if (j2 != -1 && j2 > nVar.f29270d + nVar.f29269c) {
                nVar.f29272f = (j2 - nVar.f29270d) - nVar.f29269c;
            }
            jSONObject.put("rtt", nVar.f29272f);
        } else {
            jSONObject.put("inner", nVar.f29271e);
            if (j2 != -1 && j2 > nVar.f29271e) {
                nVar.f29272f = j2 - nVar.f29271e;
            }
            jSONObject.put("rtt", nVar.f29272f);
        }
    }
}
