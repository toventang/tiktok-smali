package com.ss.videoarch.a.d;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.videoarch.a.c;
import com.ss.videoarch.a.d.b;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.Normalizer;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.regex.Pattern;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static volatile long f154258e;

    /* renamed from: a  reason: collision with root package name */
    public final c f154259a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f154260b;

    /* renamed from: c  reason: collision with root package name */
    public String f154261c;

    /* renamed from: d  reason: collision with root package name */
    public volatile String f154262d;

    /* renamed from: f  reason: collision with root package name */
    private final ExecutorService f154263f;

    /* renamed from: g  reason: collision with root package name */
    private Context f154264g;

    /* renamed from: h  reason: collision with root package name */
    private Future f154265h;

    /* renamed from: i  reason: collision with root package name */
    private volatile AbstractC4104a f154266i;

    /* renamed from: j  reason: collision with root package name */
    private int f154267j = 600000;

    /* renamed from: com.ss.videoarch.a.d.a$a  reason: collision with other inner class name */
    public interface AbstractC4104a {
        static {
            Covode.recordClassIndex(102858);
        }

        void a(String str, String str2, com.ss.videoarch.a.a.a aVar, boolean z);
    }

    static {
        Covode.recordClassIndex(102854);
    }

    public final String c() {
        b();
        return this.f154262d;
    }

    public final void a() {
        this.f154266i = null;
        Future future = this.f154265h;
        if (future != null && !future.isDone()) {
            this.f154265h.cancel(true);
            this.f154265h = null;
        }
    }

    public final void b() {
        if (SystemClock.elapsedRealtime() - f154258e >= 300000) {
            this.f154263f.submit(new Runnable() {
                /* class com.ss.videoarch.a.d.a.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(102857);
                }

                public final void run() {
                    try {
                        InetAddress byName = InetAddress.getByName("whoami.akamai.net");
                        if (byName != null) {
                            a.this.f154262d = byName.getHostAddress();
                            a.f154258e = SystemClock.elapsedRealtime();
                            String str = a.this.f154262d;
                        }
                    } catch (UnknownHostException unused) {
                    }
                }
            });
        }
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("(^((([0-9A-Fa-f]{1,4}:){7}(([0-9A-Fa-f]{1,4}){1}|:))|(([0-9A-Fa-f]{1,4}:){6}((:[0-9A-Fa-f]{1,4}){1}|((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){5}((:[0-9A-Fa-f]{1,4}){1,2}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){4}((:[0-9A-Fa-f]{1,4}){1,3}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){3}((:[0-9A-Fa-f]{1,4}){1,4}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){2}((:[0-9A-Fa-f]{1,4}){1,5}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){1}((:[0-9A-Fa-f]{1,4}){1,6}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(:((:[0-9A-Fa-f]{1,4}){1,7}|(:[fF]{4}){0,1}:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:)))$)").matcher(Normalizer.normalize(str, Normalizer.Form.NFKC)).matches();
    }

    public static String b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        b d2 = d(str);
        return str.substring(d2.f154275a, d2.f154276b);
    }

    public static boolean c(String str) {
        if (str == null || str.length() < 7 || str.length() > 15 || "".equals(str)) {
            return false;
        }
        return Pattern.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str).find();
    }

    private static b d(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int indexOf = str.indexOf("://") + 3;
        int length = str.length();
        int i2 = indexOf;
        int i3 = -1;
        while (indexOf < length) {
            char charAt = str.charAt(indexOf);
            if (charAt == '#' || charAt == '/') {
                break;
            }
            if (charAt != ':') {
                if (charAt == '?') {
                    break;
                } else if (charAt == '@') {
                    i2 = indexOf + 1;
                }
            } else {
                i3 = indexOf;
            }
            indexOf++;
        }
        if (i3 == -1) {
            i3 = indexOf;
        }
        return new b(i2, i3, indexOf);
    }

    public static b a(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int indexOf = str.indexOf("://") + 3;
        int length = str.length();
        int i2 = indexOf;
        int i3 = -1;
        while (indexOf < length) {
            char charAt = str.charAt(indexOf);
            if (charAt == '#' || charAt == '/') {
                break;
            }
            if (charAt != ':') {
                if (charAt != ']') {
                    if (charAt == '?') {
                        break;
                    } else if (charAt == '@') {
                        i2 = indexOf + 1;
                    }
                } else if (!z) {
                }
                indexOf++;
            }
            i3 = indexOf;
            indexOf++;
        }
        if (i3 == -1) {
            i3 = indexOf;
        }
        return new b(i2, i3, indexOf);
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return null;
        }
        b d2 = d(str);
        boolean startsWith = str.startsWith("http");
        if (a(str2)) {
            str2 = com.a.a("[%s]", new Object[]{str2});
        }
        String str3 = str.substring(0, d2.f154275a) + str2;
        int i2 = d2.f154276b;
        if (d2.f154277c != -1) {
            str3 = str3 + str.substring(d2.f154276b, d2.f154277c);
            i2 = d2.f154277c;
        }
        if (!startsWith) {
            str3 = str3 + "/" + b(str);
        }
        return str3 + str.substring(i2);
    }

    public final void a(String str, List<String> list) {
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            if (allByName != null && allByName.length > 0) {
                InetAddress inetAddress = allByName[0];
                for (InetAddress inetAddress2 : allByName) {
                    String hostAddress = inetAddress2.getHostAddress();
                    if (list != null) {
                        list.add(hostAddress);
                    }
                }
                if (inetAddress != null) {
                    String hostAddress2 = inetAddress.getHostAddress();
                    if (inetAddress instanceof Inet6Address) {
                        hostAddress2 = com.a.a("[%s]", new Object[]{hostAddress2});
                    }
                    a(false, str, hostAddress2, null, true);
                    return;
                }
            }
            a(false, str, null, new com.ss.videoarch.a.a.a(-100010, "", null), true);
        } catch (UnknownHostException e2) {
            HashMap hashMap = new HashMap();
            hashMap.put("reason", "Unknown host name");
            hashMap.put("host", str);
            hashMap.put("exception", e2.toString());
            a(false, str, null, new com.ss.videoarch.a.a.a(-100010, "Unknown Host", hashMap), true);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f154275a;

        /* renamed from: b  reason: collision with root package name */
        public int f154276b;

        /* renamed from: c  reason: collision with root package name */
        public int f154277c;

        static {
            Covode.recordClassIndex(102859);
        }

        b(int i2, int i3, int i4) {
            this.f154275a = i2;
            this.f154276b = i3;
            this.f154277c = i4;
        }
    }

    public a(Context context, ExecutorService executorService, c cVar) {
        this.f154264g = context;
        this.f154263f = executorService;
        this.f154259a = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(final java.lang.String r13, final java.util.List<java.lang.String> r14, com.ss.videoarch.a.d.a.AbstractC4104a r15) {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.a.d.a.a(java.lang.String, java.util.List, com.ss.videoarch.a.d.a$a):void");
    }

    public final void a(boolean z, String str, String str2, com.ss.videoarch.a.a.a aVar, boolean z2) {
        AbstractC4104a aVar2;
        if (this.f154260b == z && (aVar2 = this.f154266i) != null) {
            if (z2 && str2 != null) {
                b.a aVar3 = new b.a();
                aVar3.f154283b = System.currentTimeMillis();
                aVar3.f154282a = str2;
                aVar3.f154284c = false;
                b.a().a(str, aVar3);
            }
            aVar2.a(str, str2, aVar, z2);
        }
    }
}
