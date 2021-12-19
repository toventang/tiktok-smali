package com.ss.android.ugc.aweme.discover.lynx.spark;

import com.bytedance.android.alog.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.a.h;
import com.bytedance.lynx.hybrid.k;
import com.lynx.react.bridge.JavaOnlyMap;
import h.a.n;
import h.f.b.l;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONObject;

public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f81606b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final h f81607a;

    static {
        Covode.recordClassIndex(50707);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50708);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static d a(h hVar) {
            l.d(hVar, "");
            return new d(hVar);
        }
    }

    public final void b() {
        this.f81607a.destroy();
    }

    public final k a() {
        h hVar = this.f81607a;
        Objects.requireNonNull(hVar, "null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
        return (k) hVar;
    }

    public d(h hVar) {
        l.d(hVar, "");
        this.f81607a = hVar;
    }

    public final void a(String str, JSONObject jSONObject) {
        l.d(str, "");
        l.d(jSONObject, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
        Iterator<String> keys = jSONObject.keys();
        l.b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            javaOnlyMap2.put(next, jSONObject.opt(next));
        }
        javaOnlyMap.put("data", javaOnlyMap2);
        this.f81607a.a(str, n.a(javaOnlyMap));
        c.a(1, "SparkInfo", "sendEventToFe by spark:" + str + " and params" + jSONObject + " and final data： " + javaOnlyMap);
    }
}
