package com.bytedance.push.settings.storage;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.i;
import com.ss.android.common.util.f;
import java.util.concurrent.ConcurrentHashMap;

public final class h implements i {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap<String, i> f42350a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap<String, i> f42351b = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(25868);
    }

    @Override // com.bytedance.push.settings.i
    public final i a(Context context, boolean z, String str) {
        i iVar;
        if (z) {
            ConcurrentHashMap<String, i> concurrentHashMap = f42351b;
            i iVar2 = concurrentHashMap.get(str);
            if (iVar2 != null) {
                return iVar2;
            }
            if (PushProvider.f42318c || f.a(context)) {
                iVar = new c(context, str);
            } else {
                iVar = new d(context, str);
            }
            concurrentHashMap.put(str, iVar);
            return iVar;
        }
        ConcurrentHashMap<String, i> concurrentHashMap2 = f42350a;
        i iVar3 = concurrentHashMap2.get(str);
        if (iVar3 != null) {
            return iVar3;
        }
        g gVar = new g(context, str);
        concurrentHashMap2.put(str, gVar);
        return gVar;
    }
}
