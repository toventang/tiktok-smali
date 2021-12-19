package com.ss.android.ugc.aweme.bp;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.gson.a.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f68738a = "GraphicMMT.ini";

    /* renamed from: b  reason: collision with root package name */
    private static String f68739b = "GMTManager";

    /* renamed from: com.ss.android.ugc.aweme.bp.a$a  reason: collision with other inner class name */
    public static class C1553a {
        @c(a = "enable_on_release")

        /* renamed from: a  reason: collision with root package name */
        public boolean f68740a;
        @c(a = "gmt_config")

        /* renamed from: b  reason: collision with root package name */
        public int f68741b = 273;
        @c(a = "gmt_dump_threshold")

        /* renamed from: c  reason: collision with root package name */
        public int f68742c = 300;
        @c(a = "gmt_record_threshold")

        /* renamed from: d  reason: collision with root package name */
        public int f68743d = 1048576;

        static {
            Covode.recordClassIndex(42329);
        }
    }

    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final C1553a f68744a = null;

        static {
            Covode.recordClassIndex(42330);
        }
    }

    static {
        Covode.recordClassIndex(42328);
    }

    public static boolean a() {
        Context a2;
        if (Build.VERSION.SDK_INT >= 23 && (a2 = d.a()) != null && a2.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b() {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bp.a.b():int");
    }
}
