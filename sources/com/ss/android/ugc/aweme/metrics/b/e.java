package com.ss.android.ugc.aweme.metrics.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f109547a = true;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f109548b = true;

    public static class a implements Callable {

        /* renamed from: a  reason: collision with root package name */
        private String f109549a;

        /* renamed from: b  reason: collision with root package name */
        private JSONObject f109550b;

        static {
            Covode.recordClassIndex(70122);
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            r.a(this.f109549a, this.f109550b);
            a.a(this.f109549a, this.f109550b);
            return null;
        }

        public a(String str, JSONObject jSONObject) {
            this.f109549a = str;
            this.f109550b = jSONObject;
        }
    }

    static {
        Covode.recordClassIndex(70121);
    }
}
