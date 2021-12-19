package com.ss.a.a;

import com.bytedance.covode.number.Covode;

public abstract class a implements b {

    /* renamed from: a  reason: collision with root package name */
    protected static a f58156a;

    /* renamed from: b  reason: collision with root package name */
    protected static volatile boolean f58157b;

    static {
        Covode.recordClassIndex(36147);
    }

    public a() {
        f58156a = this;
    }

    public static void a(a aVar) {
        f58156a = aVar;
    }

    public static void b(String str, String str2) {
        a aVar = f58156a;
        if (aVar != null) {
            aVar.h(str, str2);
        } else if (f58157b) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void c(String str, String str2) {
        a aVar = f58156a;
        if (aVar != null) {
            aVar.i(str, str2);
        } else if (f58157b) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void d(String str, String str2) {
        a aVar = f58156a;
        if (aVar != null) {
            aVar.j(str, str2);
        } else if (f58157b) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void e(String str, String str2) {
        a aVar = f58156a;
        if (aVar != null) {
            aVar.k(str, str2);
        } else if (f58157b) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void f(String str, String str2) {
        a aVar = f58156a;
        if (aVar != null) {
            aVar.a(2, str, str2);
        } else if (f58157b) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void a(String str, String str2) {
        a aVar = f58156a;
        if (aVar != null) {
            aVar.g(str, str2);
        } else if (f58157b) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void b(String str, Throwable th) {
        a aVar = f58156a;
        if (aVar != null) {
            aVar.d(str, th);
        } else if (f58157b) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void a(String str, Throwable th) {
        a aVar = f58156a;
        if (aVar != null) {
            aVar.c(str, th);
        } else if (f58157b) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void a(int i2, String str, StackTraceElement[] stackTraceElementArr) {
        a aVar = f58156a;
        if (aVar != null) {
            aVar.b(i2, str, stackTraceElementArr);
        } else if (f58157b) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void b(String str, String str2, Throwable th) {
        a aVar = f58156a;
        if (aVar != null) {
            aVar.d(str, str2, th);
        } else if (f58157b) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void a(String str, String str2, Throwable th) {
        a aVar = f58156a;
        if (aVar != null) {
            aVar.c(str, str2, th);
        } else if (f58157b) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }
}
