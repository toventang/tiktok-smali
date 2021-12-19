package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class bm {

    /* renamed from: a  reason: collision with root package name */
    public static final bm f94387a = new bm();

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<String, Boolean> f94388b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static HashMap<String, Boolean> f94389c = new HashMap<>();

    private bm() {
    }

    static {
        Covode.recordClassIndex(59952);
    }

    public static void a(String str) {
        if (str != null) {
            f94388b.put(str, true);
        }
    }

    public static boolean b(String str) {
        Boolean bool;
        if (str == null || (bool = f94388b.get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean c(String str) {
        Boolean bool;
        if (str == null || (bool = f94389c.get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static void a(String str, boolean z) {
        if (str != null) {
            f94389c.put(str, Boolean.valueOf(z));
        }
    }
}
