package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashSet;

public final class be {

    /* renamed from: a  reason: collision with root package name */
    static final HashSet<String> f94339a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    public static final be f94340b = new be();

    /* renamed from: c  reason: collision with root package name */
    private static final HashSet<String> f94341c = new HashSet<>();

    private be() {
    }

    static {
        Covode.recordClassIndex(59930);
    }

    public static void a(String str) {
        l.d(str, "");
        f94341c.add(str);
    }

    public static boolean b(String str) {
        l.d(str, "");
        return f94341c.contains(str);
    }

    public static boolean c(String str) {
        l.d(str, "");
        return f94339a.contains(str);
    }
}
