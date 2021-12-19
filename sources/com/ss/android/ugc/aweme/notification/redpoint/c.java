package com.ss.android.ugc.aweme.notification.redpoint;

import android.text.TextUtils;
import b.i;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.utils.in;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class c {

    /* renamed from: b  reason: collision with root package name */
    private static c f113796b;

    /* renamed from: a  reason: collision with root package name */
    HashMap<Long, Integer> f113797a = new HashMap<>();

    static {
        Covode.recordClassIndex(73179);
    }

    public static c a() {
        MethodCollector.i(692);
        if (f113796b == null) {
            synchronized (c.class) {
                try {
                    if (f113796b == null) {
                        f113796b = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(692);
                    throw th;
                }
            }
        }
        c cVar = f113796b;
        MethodCollector.o(692);
        return cVar;
    }

    public final int a(String str) {
        try {
            Integer num = this.f113797a.get(Long.valueOf(Long.parseLong(str)));
            if (num == null) {
                return 0;
            }
            return num.intValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final void a(List<String> list, String str) {
        if (!in.d() && !b.a((Collection) list)) {
            MultiUserNoticeApi.f113786a.getMultiUserNoticeCount(TextUtils.join(",", list)).a(new d(this, str), i.f4824a, null);
        }
    }
}
