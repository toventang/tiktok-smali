package com.bytedance.im.core.internal.utils;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.c.f;
import com.ss.android.ugc.aweme.bf.d;

public class s {

    /* renamed from: a  reason: collision with root package name */
    public static k f38859a;

    /* renamed from: b  reason: collision with root package name */
    public static k f38860b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile long f38861c;

    /* renamed from: d  reason: collision with root package name */
    private static s f38862d;

    static {
        Covode.recordClassIndex(23167);
    }

    public static void a(long j2) {
        long d2 = d();
        if (j2 <= d2) {
            f.b("imsdk", "SPUtils try to set invalid indexV2:" + j2 + ", local:" + d2, (Throwable) null);
            return;
        }
        f.b("imsdk", "SPUtils update indexV2:" + j2 + ", local:" + d2, (Throwable) null);
        f38859a.a(a("base_msg_index_v2"), Long.valueOf(j2));
    }

    static class a implements k {

        /* renamed from: a  reason: collision with root package name */
        private SharedPreferences f38863a;

        static {
            Covode.recordClassIndex(23168);
        }

        @Override // com.bytedance.im.core.internal.utils.k
        public final void a() {
            this.f38863a.edit().clear().commit();
        }

        @Override // com.bytedance.im.core.internal.utils.k
        public final int a(String str) {
            return this.f38863a.getInt(str, 0);
        }

        public a(String str) {
            this.f38863a = d.a(com.bytedance.im.core.a.d.a().f37561a, str, 0);
            f.b("imsdk", "DefaultSP constructor, spName:".concat(String.valueOf(str)), (Throwable) null);
        }

        @Override // com.bytedance.im.core.internal.utils.k
        public final boolean b(String str) {
            return this.f38863a.getBoolean(str, false);
        }

        @Override // com.bytedance.im.core.internal.utils.k
        public final String b(String str, String str2) {
            return this.f38863a.getString(str, str2);
        }

        @Override // com.bytedance.im.core.internal.utils.k
        public final long b(String str, Long l2) {
            return this.f38863a.getLong(str, l2.longValue());
        }

        @Override // com.bytedance.im.core.internal.utils.k
        public final void a(String str, int i2) {
            this.f38863a.edit().putInt(str, i2).commit();
        }

        @Override // com.bytedance.im.core.internal.utils.k
        public final Float b(String str, Float f2) {
            return Float.valueOf(this.f38863a.getFloat(str, f2.floatValue()));
        }

        @Override // com.bytedance.im.core.internal.utils.k
        public final void a(String str, Float f2) {
            this.f38863a.edit().putFloat(str, f2.floatValue()).commit();
        }

        @Override // com.bytedance.im.core.internal.utils.k
        public final void a(String str, Long l2) {
            this.f38863a.edit().putLong(str, l2.longValue()).commit();
        }

        @Override // com.bytedance.im.core.internal.utils.k
        public final void a(String str, String str2) {
            this.f38863a.edit().putString(str, str2).commit();
        }

        @Override // com.bytedance.im.core.internal.utils.k
        public final void a(String str, boolean z) {
            this.f38863a.edit().putBoolean(str, z).commit();
        }
    }

    static int b() {
        return f38859a.a(a("current_link_mode"));
    }

    public static int f() {
        return f38859a.a(a("im_reset_count"));
    }

    public static long g() {
        return f38859a.b("conversation_check_time", (Long) 0L);
    }

    public static void h() {
        f38859a.a(a("allow_conversation_pagination"), true);
    }

    public static boolean i() {
        return f38859a.b(a("allow_conversation_pagination"));
    }

    public static boolean l() {
        return f38859a.b(a("msg_flag_bits_updated"));
    }

    public static void m() {
        f38859a.a(a("msg_flag_bits_updated"), true);
    }

    public static void n() {
        f.b("imsdk", "SPUtils clear all", (Throwable) null);
        f38859a.a();
    }

    public static boolean c() {
        return f38859a.b(a("ever_use_recent_link"));
    }

    public static long e() {
        return f38859a.b(a("im_reset_time"), (Long) 0L);
    }

    public static long j() {
        return f38859a.b(a("conversation_box_delete_time"), (Long) 0L);
    }

    public static void k() {
        f38859a.a(a("conversation_box_delete_time"), (Long) 0L);
    }

    public static synchronized s a() {
        s sVar;
        synchronized (s.class) {
            MethodCollector.i(10058);
            long a2 = com.bytedance.im.core.a.d.a().f37562b.a();
            if (f38862d == null || a2 != f38861c) {
                synchronized (s.class) {
                    try {
                        if (f38862d == null || a2 != f38861c) {
                            f38862d = new s();
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(10058);
                        throw th;
                    }
                }
            }
            sVar = f38862d;
            MethodCollector.o(10058);
        }
        return sVar;
    }

    public static long d() {
        long b2 = f38859a.b(a("base_msg_index_v2"), (Long) -1L);
        f.b("imsdk", "SPUtils getBaseMsgIndexV2, result:".concat(String.valueOf(b2)), (Throwable) null);
        return b2;
    }

    private s() {
        String str;
        f38861c = com.bytedance.im.core.a.d.a().f37562b.a();
        if (com.bytedance.im.core.a.d.a().f37562b.g()) {
            str = "imsdk_" + f38861c;
        } else {
            str = "imsdk_sub_" + f38861c;
        }
        k a2 = com.bytedance.im.core.a.d.a().f37562b.a(str);
        if (a2 != null) {
            f38859a = a2;
        } else {
            f38859a = new a(str);
        }
        k a3 = com.bytedance.im.core.a.d.a().f37562b.a("imsdk_0");
        if (a3 != null) {
            f38860b = a3;
        } else {
            f38860b = new a("imsdk_0");
        }
        o();
    }

    private static void o() {
        if (com.bytedance.im.core.a.d.a().f37562b.a() > 0 && !f38859a.b(a(a("key_has_process_error")))) {
            int[] iArr = com.bytedance.im.core.a.d.a().b().s;
            for (int i2 : iArr) {
                long b2 = f38860b.b(a(i2, "msg_by_user_cursor"), (Long) -1L);
                long b3 = f38859a.b(a(i2, "msg_by_user_cursor"), (Long) -1L);
                f.b("imsdk", "processHistoryError imsdk0Curosr = " + b2 + " normalCurosr = " + b3, (Throwable) null);
                if (b3 == -1 && b2 > 0) {
                    f38859a.a(a(i2, "im_init"), f38860b.b(a(i2, "im_init")));
                    f38859a.a(a(i2, "msg_flag_bits_updated"), f38860b.b(a(i2, "msg_flag_bits_updated")));
                }
                if (b2 > b3) {
                    f38859a.a(a(i2, "msg_by_user_cursor"), Long.valueOf(b2));
                }
                long b4 = f38860b.b(a(i2, "im_init_page_cursor"), (Long) 0L);
                long b5 = f38859a.b(a(i2, "im_init_page_cursor"), (Long) 0L);
                f.b("imsdk", "processHistoryError imsdk0InitCurosr = " + b4 + " normalInitCurosr = " + b5, (Throwable) null);
                if (b4 > b5) {
                    f38859a.a(a(i2, "im_init_page_cursor"), Long.valueOf(b4));
                }
            }
            f38859a.a(a(a("key_has_process_error")), true);
        }
    }

    public static void c(String str) {
        f38860b.a(a("key_imsdk_settings"), str);
    }

    public static void b(long j2) {
        f38859a.a("conversation_check_time", Long.valueOf(j2));
    }

    public static void f(int i2) {
        f38859a.a(a("recover_version"), i2);
    }

    public static boolean g(int i2) {
        return f38859a.b(a(i2, "im_init"));
    }

    public static void h(int i2) {
        f38859a.a(a(i2, "im_init"), true);
    }

    public static long b(int i2) {
        String a2 = a(i2, "recent_conv_version");
        long b2 = f38859a.b(a2, (Long) -1L);
        f.b("imsdk", "SPUtils getRecentVersion, key:" + a2 + ", version:" + b2, (Throwable) null);
        return b2;
    }

    public static long c(int i2) {
        String a2 = a(i2, "cmd_index");
        long b2 = f38859a.b(a2, (Long) -1L);
        f.b("imsdk", "SPUtils getCmdIndex, key:" + a2 + ", index:" + b2, (Throwable) null);
        return b2;
    }

    public static long a(int i2) {
        String a2 = a(i2, "msg_by_user_cursor");
        long b2 = f38859a.b(a2, (Long) -1L);
        f.b("imsdk", "SPUtils getCursor, key:" + a2 + ", cursor:" + b2 + ", inbox:" + i2 + ", uid:" + f38861c, (Throwable) null);
        return b2;
    }

    public static long d(int i2) {
        String a2 = a(i2, "msg_by_user_cursor_in_recent");
        long b2 = f38859a.b(a2, (Long) -1L);
        f.b("imsdk", "SPUtils getMixCursorInRecentMode, key:" + a2 + ", cursor:" + b2, (Throwable) null);
        return b2;
    }

    public static boolean e(int i2) {
        String a2 = a(i2, "error_conv_version");
        int a3 = f38859a.a(a2) + 1;
        if (a3 <= 2) {
            f.b("imsdk", "SPUtils shouldIgnoreError, key:" + a2 + ", errorCount:" + a3 + ", return forbid", (Throwable) null);
            f38859a.a(a2, a3);
            return false;
        }
        f.b("imsdk", "SPUtils shouldIgnoreError, key:" + a2 + ", errorCount:" + a3 + ", return ignore", (Throwable) null);
        f38859a.a(a2, 0);
        return true;
    }

    public final synchronized void b(String str) {
        MethodCollector.i(10385);
        f38859a.a(a(0, "last_conversation_apply"), str);
        MethodCollector.o(10385);
    }

    public static String a(String str) {
        return com.bytedance.im.core.a.d.a().f37562b.a() + "_" + str;
    }

    public static void e(int i2, long j2) {
        f38859a.a(a(i2, "im_init_page_cursor"), Long.valueOf(j2));
    }

    public static void b(int i2, long j2) {
        String a2 = a(i2, "recent_conv_version");
        f38859a.a(a2, Long.valueOf(j2));
        f.b("imsdk", "SPUtils setRecentVersion, key:" + a2 + ", version:" + j2, (Throwable) null);
        if (j2 < 0) {
            f.b("imsdk", "SPUtils setRecentVersion=".concat(String.valueOf(j2)), new Throwable());
        }
    }

    public static void c(int i2, long j2) {
        String a2 = a(i2, "cmd_index");
        f38859a.a(a2, Long.valueOf(j2));
        f.b("imsdk", "SPUtils setCmdIndex, key:" + a2 + ", index:" + j2, (Throwable) null);
        if (j2 < 0) {
            f.b("imsdk", "SPUtils, setCmdIndex=".concat(String.valueOf(j2)), new Throwable());
        }
    }

    public static String a(int i2, String str) {
        if (i2 == 0) {
            return com.bytedance.im.core.a.d.a().f37562b.a() + "_" + str;
        }
        return com.bytedance.im.core.a.d.a().f37562b.a() + "_" + str + "_" + i2;
    }

    public static void d(int i2, long j2) {
        String a2 = a(i2, "msg_by_user_cursor_in_recent");
        f38859a.a(a2, Long.valueOf(j2));
        f.b("imsdk", "SPUtils setMixCursorInRecentMode, key:" + a2 + ", cursor:" + j2, (Throwable) null);
        if (j2 < 0) {
            f.b("imsdk", "SPUtils, setMixCursorInRecentMode=".concat(String.valueOf(j2)), new Throwable());
        }
    }

    public static void a(int i2, long j2) {
        String a2 = a(i2, "msg_by_user_cursor");
        f38859a.a(a2, Long.valueOf(j2));
        f.b("imsdk", "SPUtils setCursor, key:" + a2 + ", cursor:" + j2 + ", inbox:" + i2 + ", uid:" + f38861c, (Throwable) null);
        if (j2 < 0) {
            f.b("imsdk", "SPUtils setCursor=".concat(String.valueOf(j2)), new Throwable());
        }
    }

    public static void a(int i2, long j2, int i3) {
        String a2 = a(i2, "error_cursor");
        f38859a.a(a2, j2 + ":" + i3);
        f.b("imsdk", "SPUtils setErrorCursor, key:" + a2 + ", cursor:" + j2 + ", count:" + i3, (Throwable) null);
    }
}
