package com.bytedance.android.livesdk.service.animation;

import com.bytedance.android.livesdk.gift.model.n;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f21176b;

    /* renamed from: a  reason: collision with root package name */
    public Map<n, com.bytedance.android.livesdk.gift.a.a> f21177a = new HashMap();

    static {
        Covode.recordClassIndex(12496);
    }

    private a() {
    }

    public static a a() {
        if (f21176b == null) {
            f21176b = new a();
        }
        return f21176b;
    }
}
