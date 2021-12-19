package com.ss.android.ugc.aweme.ecommerce.track;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public abstract class a {

    /* renamed from: m  reason: collision with root package name */
    public static final C2113a f87522m = new C2113a((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    public final LinkedHashMap<String, Object> f87523k = new LinkedHashMap<>();

    /* renamed from: l  reason: collision with root package name */
    public final String f87524l;

    static {
        Covode.recordClassIndex(55016);
    }

    /* access modifiers changed from: protected */
    public abstract HashMap<String, Object> a();

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.track.a$a  reason: collision with other inner class name */
    public static final class C2113a {
        static {
            Covode.recordClassIndex(55017);
        }

        private C2113a() {
        }

        public /* synthetic */ C2113a(byte b2) {
            this();
        }
    }

    public final void d() {
        i.b(new b(this), i.f4824a);
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f87525a;

        static {
            Covode.recordClassIndex(55018);
        }

        b(a aVar) {
            this.f87525a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            try {
                HashMap<String, Object> a2 = this.f87525a.a();
                if (a2 != null) {
                    this.f87525a.f87523k.putAll(a2);
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, Object> entry : this.f87525a.f87523k.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                r.a(this.f87525a.f87524l, jSONObject);
                return z.f158842a;
            } catch (Throwable unused) {
                return 0;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f87526a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f87527b;

        static {
            Covode.recordClassIndex(55019);
        }

        c(a aVar, Map map) {
            this.f87526a = aVar;
            this.f87527b = map;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            try {
                HashMap<String, Object> a2 = this.f87526a.a();
                if (a2 == null) {
                    a2 = new HashMap<>();
                }
                JSONObject jSONObject = new JSONObject();
                a2.putAll(this.f87527b);
                for (Map.Entry<String, Object> entry : a2.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                r.a(this.f87526a.f87524l, jSONObject);
                return z.f158842a;
            } catch (Throwable unused) {
                return 0;
            }
        }
    }

    public final void c(Map<String, ? extends Object> map) {
        l.d(map, "");
        i.b(new c(this, map), i.f4824a);
    }

    public a(String str) {
        l.d(str, "");
        this.f87524l = str;
    }
}
