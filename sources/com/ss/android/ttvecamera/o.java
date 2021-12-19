package com.ss.android.ttvecamera;

import android.util.Log;
import com.bytedance.covode.number.Covode;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static String f61855a = "VESDK-";

    /* renamed from: b  reason: collision with root package name */
    public static byte f61856b = 3;

    /* renamed from: c  reason: collision with root package name */
    public static volatile b f61857c = new a();

    /* renamed from: d  reason: collision with root package name */
    private static String f61858d = "monitorInfo";

    public interface b {
        static {
            Covode.recordClassIndex(38020);
        }

        void Log(byte b2, String str, String str2);
    }

    static class a implements b {
        static {
            Covode.recordClassIndex(38019);
        }

        @Override // com.ss.android.ttvecamera.o.b
        public final void Log(byte b2, String str, String str2) {
        }

        a() {
        }
    }

    public static String a() {
        return Log.getStackTraceString(new Throwable());
    }

    static {
        Covode.recordClassIndex(38018);
    }

    public static void a(String str, String str2) {
        if ((f61856b & 4) != 0) {
            f61857c.Log((byte) 4, f61855a + str, str2);
        }
    }

    public static void b(String str, String str2) {
        if ((f61856b & 8) != 0) {
            f61857c.Log((byte) 8, f61855a + str, str2);
        }
    }

    public static void c(String str, String str2) {
        if ((f61856b & 2) != 0) {
            f61857c.Log((byte) 2, f61855a + str, str2);
        }
    }

    public static void d(String str, String str2) {
        if ((f61856b & 1) != 0) {
            f61857c.Log((byte) 1, f61855a + str, str2);
        }
    }
}
