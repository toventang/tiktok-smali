package com.ss.android.ugc.aweme.dependence.beauty;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static AbstractC1855a f79579a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f79580b = new a();

    /* renamed from: com.ss.android.ugc.aweme.dependence.beauty.a$a  reason: collision with other inner class name */
    public interface AbstractC1855a {
        static {
            Covode.recordClassIndex(49430);
        }

        void a(String str, String str2);

        void a(String str, Throwable th);

        void b(String str, String str2);

        void c(String str, String str2);

        void d(String str, String str2);
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(49429);
    }

    public static void a(String str) {
        AbstractC1855a aVar = f79579a;
        if (aVar != null) {
            aVar.b("BeautyLog", str);
        }
    }

    public static void b(String str) {
        AbstractC1855a aVar = f79579a;
        if (aVar != null) {
            aVar.c("BeautyLog", str);
        }
    }

    public static void c(String str) {
        AbstractC1855a aVar = f79579a;
        if (aVar != null) {
            aVar.d("BeautyLog", str);
        }
    }

    public static void a(Throwable th) {
        AbstractC1855a aVar = f79579a;
        if (aVar != null) {
            aVar.a("BeautyLog", th);
        } else if (th != null) {
            th.getMessage();
        }
    }
}
