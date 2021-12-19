package com.bytedance.sdk.bridge;

import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bridge.api.BridgeService;
import com.bytedance.sdk.bridge.b.a;
import com.bytedance.sdk.bridge.b.c;
import h.a.n;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    static final String f43867a = f43867a;

    /* renamed from: b  reason: collision with root package name */
    static final ConcurrentHashMap<String, List<a>> f43868b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    static final CopyOnWriteArrayList<c> f43869c = new CopyOnWriteArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public static final f f43870d = new f();

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentHashMap<String, d> f43871e = new ConcurrentHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private static final BridgeService f43872f = ((BridgeService) com.bytedance.news.common.service.manager.c.a(BridgeService.class));

    /* renamed from: g  reason: collision with root package name */
    private static volatile boolean f43873g = true;

    /* renamed from: h  reason: collision with root package name */
    private static final HashMap<String, Class<?>> f43874h = new HashMap<>();

    private f() {
    }

    static {
        Covode.recordClassIndex(26818);
    }

    public static a a(List<a> list, i iVar) {
        if (iVar != null || list == null || !(!list.isEmpty())) {
            T t = null;
            if (list != null) {
                for (T t2 : list) {
                    if (l.a(t2.f43843d, iVar)) {
                        return t2;
                    }
                    if (t2.f43843d == null) {
                        t = t2;
                    }
                }
            }
            return t;
        }
        Boolean b2 = c.f43852a.b();
        l.a((Object) b2, "");
        if (b2.booleanValue()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size).f43842c) {
                    return list.get(size);
                }
            }
        }
        return (a) n.i((List) list);
    }
}
