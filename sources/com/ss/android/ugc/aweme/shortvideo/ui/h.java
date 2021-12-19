package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.g;
import h.f.b.l;
import java.util.HashMap;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f131856a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<String, g> f131857b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static HashMap<String, String> f131858c = new HashMap<>();

    private h() {
    }

    public static void a() {
        f131857b.clear();
        f131858c.clear();
    }

    static {
        Covode.recordClassIndex(86380);
    }

    public static g b(String str) {
        l.d(str, "");
        return f131857b.get(str);
    }

    public static String c(String str) {
        l.d(str, "");
        return f131858c.get(str);
    }

    public static boolean d(String str) {
        l.d(str, "");
        return f131857b.containsKey(str);
    }

    public static void a(String str) {
        l.d(str, "");
        f131857b.put(str, null);
    }

    public static void a(String str, g gVar, String str2) {
        l.d(str, "");
        if (gVar != null) {
            gVar.setMusicPriority(-1);
        }
        f131857b.put(str, gVar);
        f131858c.put(str, str2);
    }
}
