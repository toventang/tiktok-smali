package com.bytedance.android.live.broadcast.e;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f7847a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final List<String> f7848b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public static boolean f7849c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f7850d = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(3884);
    }

    public static void a(String str) {
        l.d(str, "");
        List<String> list = f7848b;
        if (!list.contains(str)) {
            list.add(str);
        }
        f7847a.put("webview_banner", list.toString());
    }

    public static void b(String str) {
        l.d(str, "");
        List<String> list = f7848b;
        list.remove(str);
        f7847a.put("webview_banner", list.toString());
    }
}
