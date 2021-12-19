package com.ss.android.ugc.aweme.flowfeed.utils;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, b> f96180a = new HashMap();

    static {
        Covode.recordClassIndex(60930);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f96181a = new c();

        static {
            Covode.recordClassIndex(60931);
        }
    }

    public final b a(String str) {
        if (this.f96180a.isEmpty()) {
            return null;
        }
        return this.f96180a.get(str);
    }

    public final void a(String str, b bVar) {
        this.f96180a.put(str, bVar);
    }
}
