package com.ss.android.ugc.aweme.favorites.viewmodel;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, com.ss.android.ugc.aweme.favorites.api.f> f91013a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final f f91014b = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(57231);
    }

    public static com.ss.android.ugc.aweme.favorites.api.f a(String str) {
        l.d(str, "");
        HashMap<String, com.ss.android.ugc.aweme.favorites.api.f> hashMap = f91013a;
        com.ss.android.ugc.aweme.favorites.api.f fVar = hashMap.get(str);
        hashMap.put(str, null);
        return fVar;
    }

    public static void a(String str, com.ss.android.ugc.aweme.favorites.api.f fVar) {
        l.d(str, "");
        l.d(fVar, "");
        f91013a.put(str, fVar);
    }
}
