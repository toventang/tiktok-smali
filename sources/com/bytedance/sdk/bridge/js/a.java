package com.bytedance.sdk.bridge.js;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bridge.b.c;
import com.bytedance.sdk.bridge.d;
import com.bytedance.sdk.bridge.g;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f43877a = f43877a;

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentHashMap<String, List<com.bytedance.sdk.bridge.b.a>> f43878b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static final CopyOnWriteArrayList<c> f43879c = new CopyOnWriteArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public static final CopyOnWriteArrayList<String> f43880d = new CopyOnWriteArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public static final a f43881e = new a();

    /* renamed from: f  reason: collision with root package name */
    private static final ConcurrentHashMap<WeakReference<Object>, ConcurrentHashMap<String, com.bytedance.sdk.bridge.b.a>> f43882f = new ConcurrentHashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private static final ConcurrentHashMap<String, d> f43883g = new ConcurrentHashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private static final ConcurrentHashMap<WeakReference<Object>, CopyOnWriteArrayList<c>> f43884h = new ConcurrentHashMap<>();

    /* renamed from: i  reason: collision with root package name */
    private static final Handler f43885i = new Handler(Looper.getMainLooper());

    private a() {
    }

    static {
        Covode.recordClassIndex(26821);
    }

    public static void a() {
        Boolean bool;
        com.bytedance.sdk.bridge.a aVar = com.bytedance.sdk.bridge.c.f43852a;
        if (aVar != null) {
            bool = aVar.a();
        } else {
            bool = null;
        }
        if (!(!l.a((Object) bool, (Object) true))) {
            StringBuilder sb = new StringBuilder("--------- Current JsBridgeMethod --------\n");
            Collection<List<com.bytedance.sdk.bridge.b.a>> values = f43878b.values();
            l.a((Object) values, "");
            for (List<com.bytedance.sdk.bridge.b.a> list : values) {
                l.a((Object) list, "");
                for (T t : list) {
                    sb.append(t.f43840a).append(":").append(t.f43841b.f43858b).append("\n");
                }
            }
            String str = f43877a;
            String sb2 = sb.toString();
            l.a((Object) sb2, "");
            g.a(str, sb2);
        }
    }
}
