package com.bytedance.android.livesdkapi.n;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class a implements com.ss.android.ugc.d.a.b {

    /* renamed from: d  reason: collision with root package name */
    public static final C0507a f23292d = new C0507a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final b f23293a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f23294b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f23295c;

    public interface b {
        static {
            Covode.recordClassIndex(13847);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(13845);
    }

    /* renamed from: com.bytedance.android.livesdkapi.n.a$a  reason: collision with other inner class name */
    public static final class C0507a {
        static {
            Covode.recordClassIndex(13846);
        }

        private C0507a() {
        }

        public /* synthetic */ C0507a(byte b2) {
            this();
        }

        public static Map<String, String> a(JSONObject jSONObject) {
            HashMap hashMap = new HashMap();
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                l.b(keys, "");
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string = jSONObject.getString(next);
                    l.b(string, "");
                    hashMap.put(next, string);
                }
            }
            return hashMap;
        }
    }

    public a(b bVar, Bundle bundle, Map<String, String> map) {
        l.d(bVar, "");
        l.d(bundle, "");
        l.d(map, "");
        this.f23293a = bVar;
        this.f23294b = bundle;
        this.f23295c = map;
    }
}
