package com.toutiao.proxyserver.e;

import com.bytedance.covode.number.Covode;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static a f154828a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f154829b;

    static {
        Covode.recordClassIndex(103124);
    }

    public static String a(Throwable th) {
        if (th == null) {
            return "";
        }
        Throwable th2 = th;
        while (!(th2 instanceof UnknownHostException)) {
            th2 = th2.getCause();
            if (th2 == null) {
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                return stringWriter.toString();
            }
        }
        return "UnknownHostException";
    }

    public static void a(String str, String str2, String str3) {
        a aVar = f154828a;
        if (aVar != null && f154829b) {
            aVar.a(str, str2, str3);
        }
    }

    public static void b(String str, String str2, String str3) {
        a aVar = f154828a;
        if (aVar != null && f154829b) {
            aVar.b(str, str2, str3);
        }
    }

    public static void c(String str, String str2, String str3) {
        a aVar = f154828a;
        if (aVar != null && f154829b) {
            aVar.c(str, str2, str3);
        }
    }

    public static void d(String str, String str2, String str3) {
        a aVar = f154828a;
        if (aVar != null && f154829b) {
            aVar.d(str, str2, str3);
        }
    }
}
