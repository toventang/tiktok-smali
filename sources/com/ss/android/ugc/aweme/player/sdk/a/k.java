package com.ss.android.ugc.aweme.player.sdk.a;

import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.player.sdk.a.e;
import java.util.HashMap;
import org.json.JSONObject;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    int f115264a;

    /* renamed from: b  reason: collision with root package name */
    int f115265b;

    static {
        Covode.recordClassIndex(74031);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final HashMap<String, Object> f115266a = new HashMap<>();

        static {
            Covode.recordClassIndex(74032);
        }

        public final synchronized JSONObject a() {
            JSONObject jSONObject;
            MethodCollector.i(2910);
            try {
                jSONObject = new JSONObject(this.f115266a);
                MethodCollector.o(2910);
            } catch (Exception e2) {
                e2.printStackTrace();
                MethodCollector.o(2910);
                return null;
            }
            return jSONObject;
        }

        public final a a(String str, Integer num) {
            this.f115266a.put(str, num);
            return this;
        }
    }

    private void a() {
        if (e.a.f115120a.f115119a != null) {
            new a().a("prepare_hash", Integer.valueOf(this.f115264a)).a("start_hash", Integer.valueOf(this.f115265b)).a();
        }
    }

    public final void a(Surface surface) {
        if (surface != null) {
            this.f115265b = surface.hashCode();
        }
        if (this.f115264a != this.f115265b) {
            a();
        }
    }
}
