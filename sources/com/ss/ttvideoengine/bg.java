package com.ss.ttvideoengine;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ttvideoengine.j.p;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class bg {

    /* renamed from: a  reason: collision with root package name */
    private static bg f152343a;

    /* renamed from: b  reason: collision with root package name */
    private static int f152344b = -1;

    /* renamed from: c  reason: collision with root package name */
    private static int f152345c = 100;

    /* renamed from: d  reason: collision with root package name */
    private ConcurrentHashMap<String, a> f152346d = new ConcurrentHashMap<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public p f152347a;

        /* renamed from: b  reason: collision with root package name */
        public long f152348b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f152349c;

        static {
            Covode.recordClassIndex(101520);
        }
    }

    static {
        Covode.recordClassIndex(101519);
    }

    public static bg a() {
        MethodCollector.i(12157);
        if (f152343a == null) {
            synchronized (bg.class) {
                try {
                    if (f152343a == null) {
                        f152343a = new bg();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12157);
                    throw th;
                }
            }
        }
        bg bgVar = f152343a;
        MethodCollector.o(12157);
        return bgVar;
    }

    public static void a(int i2) {
        f152344b = i2;
    }

    public static void b(int i2) {
        f152345c = i2;
    }

    public final synchronized void b(String str, String str2) {
        MethodCollector.i(12808);
        if (this.f152346d != null) {
            String c2 = c(str, str2);
            if (TextUtils.isEmpty(c2)) {
                MethodCollector.o(12808);
                return;
            }
            this.f152346d.remove(c2);
        }
        MethodCollector.o(12808);
    }

    public final synchronized a a(String str, String str2) {
        MethodCollector.i(12806);
        if (this.f152346d != null) {
            String c2 = c(str, str2);
            if (TextUtils.isEmpty(c2)) {
                MethodCollector.o(12806);
                return null;
            }
            a aVar = this.f152346d.get(c2);
            if (aVar != null) {
                int i2 = f152344b;
                if (i2 <= 0) {
                    if (aVar.f152347a != null) {
                        i2 = (aVar.f152347a.a(3) + 3600) - 300;
                    } else {
                        i2 = 3600;
                    }
                }
                if (SystemClock.elapsedRealtime() - aVar.f152348b > ((long) (i2 * 1000))) {
                    aVar.f152349c = true;
                } else {
                    aVar.f152349c = false;
                }
                MethodCollector.o(12806);
                return aVar;
            }
        }
        MethodCollector.o(12806);
        return null;
    }

    private static String c(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        String str8 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String[] split = str2.split("[?]");
        if (split.length >= 2) {
            String[] split2 = split[1].split("&");
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            for (String str9 : split2) {
                if (str9.indexOf("codec_type") == 0) {
                    str8 = str9.substring(11);
                } else if (str9.indexOf("CodecType") == 0) {
                    str8 = str9.substring(10);
                } else if (str9.indexOf("Codec") == 0) {
                    str8 = str9.substring(6);
                } else if (str9.indexOf("format_type") == 0) {
                    str3 = str9.substring(12);
                } else if (str9.indexOf("FormatType") == 0) {
                    str3 = str9.substring(11);
                } else if (str9.indexOf("Format") == 0) {
                    str3 = str9.substring(7);
                } else if (str9.indexOf("ptoken") == 0) {
                    str4 = str9.substring(7);
                } else if (str9.indexOf("PToken") == 0) {
                    str4 = str9.substring(7);
                } else if (str9.indexOf("ssl") == 0) {
                    str5 = str9.substring(4);
                } else if (str9.indexOf("Ssl") == 0) {
                    str5 = str9.substring(4);
                } else if (str9.indexOf("HDRDefinition") == 0) {
                    str6 = str9.substring(14);
                } else if (str9.indexOf("FileType") == 0) {
                    str7 = str9.substring(9);
                }
            }
        } else {
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
        }
        sb.append(str);
        if (!TextUtils.isEmpty(str8)) {
            sb.append(com.a.a("/%s", new Object[]{str8}));
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append(com.a.a("/%s", new Object[]{str3}));
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append(com.a.a("/%s", new Object[]{str4}));
        }
        if (!TextUtils.isEmpty(str5)) {
            sb.append(com.a.a("/%s", new Object[]{str5}));
        }
        if (!TextUtils.isEmpty(str6)) {
            sb.append(com.a.a("/%s", new Object[]{"hdr_".concat(String.valueOf(str6))}));
        }
        if (!TextUtils.isEmpty(str7)) {
            sb.append(com.a.a("/%s", new Object[]{str7}));
        }
        return sb.toString();
    }

    public final synchronized void a(String str, String str2, a aVar) {
        MethodCollector.i(12571);
        String c2 = c(str, str2);
        if (TextUtils.isEmpty(c2)) {
            MethodCollector.o(12571);
            return;
        }
        this.f152346d.put(c2, aVar);
        if (this.f152346d.size() > f152345c) {
            long j2 = Long.MAX_VALUE;
            String str3 = null;
            for (Map.Entry<String, a> entry : this.f152346d.entrySet()) {
                a value = entry.getValue();
                if (value.f152348b < j2) {
                    j2 = value.f152348b;
                    str3 = entry.getKey();
                }
            }
            if (str3 != null) {
                this.f152346d.remove(str3);
            }
        }
        MethodCollector.o(12571);
    }

    public final synchronized void a(String str, String str2, p pVar) {
        MethodCollector.i(12158);
        if (!(this.f152346d == null || str == null)) {
            if (str2 != null) {
                a aVar = new a();
                aVar.f152347a = pVar;
                aVar.f152348b = SystemClock.elapsedRealtime();
                a(str, str2, aVar);
                MethodCollector.o(12158);
                return;
            }
        }
        MethodCollector.o(12158);
    }
}
