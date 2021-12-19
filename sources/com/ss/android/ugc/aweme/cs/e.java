package com.ss.android.ugc.aweme.cs;

import android.content.Context;
import b.i;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f79021a = File.separator;

    static {
        Covode.recordClassIndex(49051);
    }

    public static class c {
        @com.google.gson.a.c(a = "enabled")

        /* renamed from: a  reason: collision with root package name */
        public boolean f79036a;
        @com.google.gson.a.c(a = "enable_exception_path")

        /* renamed from: b  reason: collision with root package name */
        boolean f79037b;
        @com.google.gson.a.c(a = "watch")

        /* renamed from: c  reason: collision with root package name */
        List<d> f79038c;
        @com.google.gson.a.c(a = "downgrade")

        /* renamed from: d  reason: collision with root package name */
        List<d> f79039d;

        static {
            Covode.recordClassIndex(49054);
        }

        public c() {
            this.f79036a = false;
            this.f79037b = false;
            this.f79038c = new ArrayList();
            this.f79039d = null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("enabled=").append(this.f79036a);
            List<d> list = this.f79038c;
            if (list != null && list.size() > 0) {
                for (d dVar : this.f79038c) {
                    sb.append(dVar.toString());
                }
            }
            List<d> list2 = this.f79039d;
            if (list2 != null && list2.size() > 0) {
                for (d dVar2 : this.f79039d) {
                    sb.append(dVar2.toString());
                }
            }
            return sb.toString();
        }

        public c(byte b2) {
            this.f79036a = false;
            this.f79037b = false;
            ArrayList arrayList = new ArrayList();
            this.f79038c = arrayList;
            this.f79039d = null;
            arrayList.add(new d());
        }
    }

    /* access modifiers changed from: package-private */
    public enum a {
        INTERNAL,
        EXTERNAL,
        ROOT;

        static {
            Covode.recordClassIndex(49052);
        }
    }

    /* access modifiers changed from: package-private */
    public enum b {
        BELONG,
        EXACT,
        REGEXP;

        static {
            Covode.recordClassIndex(49053);
        }
    }

    public static class d {
        @com.google.gson.a.c(a = "path")

        /* renamed from: a  reason: collision with root package name */
        String f79041a = "/(sdcard|storage)/.+.(jpg|jpeg|png|webp|gif|bmp|mp4|flv|mpg|mpeg|mov|webm|avi|wmv)";
        @com.google.gson.a.c(a = "mounted")

        /* renamed from: b  reason: collision with root package name */
        int f79042b = a.ROOT.ordinal();
        @com.google.gson.a.c(a = "operate")

        /* renamed from: c  reason: collision with root package name */
        int f79043c = 4;
        @com.google.gson.a.c(a = "rule")

        /* renamed from: d  reason: collision with root package name */
        int f79044d = b.REGEXP.ordinal();
        @com.google.gson.a.c(a = "pass_reg_exp")

        /* renamed from: e  reason: collision with root package name */
        String f79045e = "/.*(/aweme|/tt_video|com.ss.android.ugc.aweme|com.bytedance.realx).*";

        static {
            Covode.recordClassIndex(49055);
        }

        public final String toString() {
            return "[path=" + this.f79041a + " mounted=" + this.f79042b + " operate=" + this.f79043c + " rule=" + this.f79044d + " passRegExp=" + this.f79045e + "]";
        }
    }

    public static boolean a(c cVar) {
        if (cVar == null) {
            return false;
        }
        return cVar.f79037b;
    }

    private static File a(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107194b != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        com.ss.android.ugc.aweme.lancet.d.f107194b = cacheDir;
        return cacheDir;
    }

    private static File b(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107193a != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107193a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        com.ss.android.ugc.aweme.lancet.d.f107193a = externalCacheDir;
        return externalCacheDir;
    }

    public static String a(Throwable th) {
        if (th == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null && stackTrace.length > 0) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (!(stackTraceElement == null || stackTraceElement.getClassName() == null || stackTraceElement.getMethodName() == null)) {
                    sb.append(stackTraceElement.getClassName()).append('.').append(stackTraceElement.getMethodName()).append(':').append(stackTraceElement.getLineNumber()).append('#');
                }
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static boolean b(String str, c cVar) {
        return a(str, cVar);
    }

    public static boolean c(String str, c cVar) {
        return d(str, cVar);
    }

    private static boolean d(String str, c cVar) {
        if (cVar == null || !cVar.f79036a) {
            return false;
        }
        return a(str, cVar.f79039d);
    }

    private static boolean a(d dVar, String str) {
        if (str == null || dVar == null || (dVar.f79045e != null && Pattern.compile(dVar.f79045e).matcher(str).matches())) {
            return false;
        }
        return true;
    }

    private static boolean a(File file, File file2) {
        try {
            String canonicalPath = file.getCanonicalPath();
            if (canonicalPath != null) {
                return canonicalPath.contains(file2.getCanonicalPath());
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean a(String str, c cVar) {
        if (cVar == null || !cVar.f79036a) {
            return false;
        }
        return a(str, cVar.f79038c);
    }

    private static boolean a(String str, List<d> list) {
        Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
        if (!(a2 == null || str == null || a(a2) == null || a(a2).getParentFile() == null || list == null || list.size() <= 0)) {
            for (d dVar : list) {
                if (!(dVar == null || (dVar.f79043c & 4) == 0 || dVar.f79041a == null)) {
                    if (dVar.f79044d != b.REGEXP.ordinal()) {
                        if (dVar.f79042b == a.INTERNAL.ordinal()) {
                            if (a(a2) == null || a(a2).getParent() == null) {
                                return false;
                            }
                            if (!dVar.f79041a.startsWith(a(a2).getParent())) {
                                dVar.f79041a = a(a2).getParent() + dVar.f79041a;
                            }
                        } else if (dVar.f79042b == a.EXTERNAL.ordinal()) {
                            if (b(a2) == null || b(a2).getParent() == null) {
                                return false;
                            }
                            if (!dVar.f79041a.startsWith(b(a2).getParent())) {
                                dVar.f79041a = b(a2).getParent() + dVar.f79041a;
                            }
                        }
                    }
                    if (dVar.f79044d == b.BELONG.ordinal()) {
                        if (f79021a.equals(dVar.f79041a) && (str.startsWith("/system/") || str.startsWith("/sys/") || str.startsWith("/data/") || str.startsWith("/vendor/") || str.startsWith("/product/") || (a2.getPackageName() != null && str.contains(File.separator + a2.getPackageName() + File.separator)))) {
                            return false;
                        }
                        if (a(new File(str), new File(dVar.f79041a))) {
                            return a(dVar, str);
                        }
                    }
                    if (dVar.f79044d == b.EXACT.ordinal() && str.equals(dVar.f79041a)) {
                        return a(dVar, str);
                    }
                    if (dVar.f79044d == b.REGEXP.ordinal() && Pattern.compile(dVar.f79041a).matcher(str).matches()) {
                        return a(dVar, str);
                    }
                }
            }
        }
        return false;
    }

    public static void a(File file, Throwable th, String str, boolean z) {
        a(file, th, str, z, null);
    }

    public static void a(File file, Throwable th, String str, boolean z, String str2) {
        if (file != null && file.getAbsolutePath() != null) {
            i.b(new f(th, str2, file, str, z), i.f4824a);
        }
    }
}
