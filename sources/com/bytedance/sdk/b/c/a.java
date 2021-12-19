package com.bytedance.sdk.b.c;

import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(26649);
    }

    public static void a(String str) {
        com.bytedance.sdk.b.a.a g2 = com.bytedance.sdk.b.a.g();
        if (g2 != null) {
            g2.a("[INFO]-[" + str + "]");
        }
    }

    public static void b(String str) {
        com.bytedance.sdk.b.a.a g2 = com.bytedance.sdk.b.a.g();
        if (g2 != null) {
            g2.a("[DEBUG]-[" + str + "]");
        }
    }

    public static void c(String str) {
        com.bytedance.sdk.b.a.a g2 = com.bytedance.sdk.b.a.g();
        if (g2 != null) {
            g2.a("[WARNING]-[" + str + "]");
        }
    }

    public static void d(String str) {
        com.bytedance.sdk.b.a.a g2 = com.bytedance.sdk.b.a.g();
        if (g2 != null) {
            g2.a("[ERROR]-[" + str + "]");
        }
    }
}
