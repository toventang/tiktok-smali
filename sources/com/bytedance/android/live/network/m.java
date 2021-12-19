package com.bytedance.android.live.network;

import com.bytedance.android.live.network.a.a;
import com.bytedance.android.livesdk.livesetting.message.LiveMtPbRequestsSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c;
import com.bytedance.retrofit2.client.Request;
import h.f.b.l;
import h.h;
import h.i;
import h.q;
import h.r;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class m<T> implements c<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, a.EnumC0254a> f12131b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final h f12132c = i.a((h.f.a.a) b.f12136a);

    /* renamed from: d  reason: collision with root package name */
    public static final a f12133d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final a.EnumC0254a f12134a;

    /* renamed from: e  reason: collision with root package name */
    private final c<T> f12135e;

    public static final class a {
        static {
            Covode.recordClassIndex(6645);
        }

        public static JSONObject a() {
            return (JSONObject) m.f12132c.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static String a(Request request) {
            return request.getUrl() + ", " + request.getMethod();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<JSONObject> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f12136a = new b();

        static {
            Covode.recordClassIndex(6646);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ JSONObject invoke() {
            return a();
        }

        private static JSONObject a() {
            JSONObject jSONObject;
            try {
                jSONObject = q.m223constructorimpl(new JSONObject(LiveMtPbRequestsSetting.INSTANCE.getValue().getSwitches()));
            } catch (Throwable th) {
                jSONObject = q.m223constructorimpl(r.a(th));
            }
            JSONObject jSONObject2 = new JSONObject();
            if (q.m228isFailureimpl(jSONObject)) {
                jSONObject = jSONObject2;
            }
            return (JSONObject) jSONObject;
        }
    }

    @Override // com.bytedance.retrofit2.c
    public final Type a() {
        Type a2 = this.f12135e.a();
        l.b(a2, "");
        return a2;
    }

    static {
        Covode.recordClassIndex(6644);
    }

    @Override // com.bytedance.retrofit2.c
    public final <R> T a(com.bytedance.retrofit2.b<R> bVar) {
        l.d(bVar, "");
        Request request = bVar.request();
        Map<String, a.EnumC0254a> map = f12131b;
        l.b(request, "");
        map.put(a.a(request), this.f12134a);
        return this.f12135e.a(bVar);
    }

    public m(c<T> cVar, a.EnumC0254a aVar) {
        l.d(cVar, "");
        l.d(aVar, "");
        this.f12135e = cVar;
        this.f12134a = aVar;
    }
}
