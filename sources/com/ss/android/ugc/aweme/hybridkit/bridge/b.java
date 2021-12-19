package com.ss.android.ugc.aweme.hybridkit.bridge;

import android.content.Context;
import android.util.ArrayMap;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.lynx.hybrid.b.a.c;
import com.lynx.tasm.LynxView;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final h f99743a = i.a((h.f.a.a) C2448b.f99750a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f99744b = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(63583);
        }

        public static ArrayMap<View, com.bytedance.ies.bullet.c.e.a.b> a() {
            return (ArrayMap) b.f99743a.getValue();
        }

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.hybridkit.bridge.b$a$b  reason: collision with other inner class name */
        public static final class C2446b extends com.bytedance.lynx.hybrid.b.a.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k f99748a;

            static {
                Covode.recordClassIndex(63585);
            }

            @Override // com.bytedance.lynx.hybrid.b.a.b
            public final void a() {
                this.f99748a.a();
            }

            /* renamed from: com.ss.android.ugc.aweme.hybridkit.bridge.b$a$b$a  reason: collision with other inner class name */
            public static final class C2447a implements k.b {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f99749a;

                static {
                    Covode.recordClassIndex(63586);
                }

                C2447a(c cVar) {
                    this.f99749a = cVar;
                }

                @Override // com.bytedance.ies.bullet.c.c.a.k.b
                public final void a(JSONObject jSONObject) {
                    l.d(jSONObject, "");
                    this.f99749a.a(1, "success", jSONObject);
                }

                @Override // com.bytedance.ies.bullet.c.c.a.k.b
                public final void a(int i2, String str) {
                    l.d(str, "");
                    this.f99749a.a(i2, str, null);
                }

                @Override // com.bytedance.ies.bullet.c.c.a.k.b
                public final void a(int i2, String str, JSONObject jSONObject) {
                    l.d(str, "");
                    l.d(jSONObject, "");
                    this.f99749a.a(i2, str, jSONObject);
                }
            }

            C2446b(k kVar) {
                this.f99748a = kVar;
            }

            @Override // com.bytedance.lynx.hybrid.b.a.b
            public final void a(String str, String str2, c cVar) {
                JSONObject jSONObject;
                l.d(str, "");
                l.d(str2, "");
                l.d(cVar, "");
                try {
                    jSONObject = new JSONObject(str2);
                } catch (Exception unused) {
                    if (l.a((Object) p.b((CharSequence) str2).toString(), (Object) "")) {
                        jSONObject = new JSONObject();
                    } else {
                        cVar.a(-1, "params illegal, params = ".concat(String.valueOf(str2)), null);
                        return;
                    }
                }
                this.f99748a.a(jSONObject, new C2447a(cVar));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.hybridkit.bridge.b$a$a  reason: collision with other inner class name */
        public static final class C2445a extends d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f99745a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f99746b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ com.bytedance.lynx.hybrid.b.b f99747c;

            static {
                Covode.recordClassIndex(63584);
            }

            @Override // com.bytedance.ies.bullet.c.c.i
            public final com.bytedance.ies.bullet.service.f.a.b.b b() {
                if (this.f99746b instanceof LynxView) {
                    return com.bytedance.ies.bullet.service.f.a.b.b.LYNX;
                }
                return com.bytedance.ies.bullet.service.f.a.b.b.WEB;
            }

            @Override // com.ss.android.ugc.aweme.hybridkit.bridge.d, com.bytedance.ies.bullet.c.c.i
            public final void onEvent(com.bytedance.ies.bullet.c.c.a.p pVar) {
                l.d(pVar, "");
                this.f99747c.a(pVar.a(), (JSONObject) pVar.b());
            }

            C2445a(Context context, View view, com.bytedance.lynx.hybrid.b.b bVar) {
                this.f99745a = context;
                this.f99746b = view;
                this.f99747c = bVar;
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.hybridkit.bridge.b$b  reason: collision with other inner class name */
    static final class C2448b extends m implements h.f.a.a<ArrayMap<View, com.bytedance.ies.bullet.c.e.a.b>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2448b f99750a = new C2448b();

        static {
            Covode.recordClassIndex(63587);
        }

        C2448b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ArrayMap<View, com.bytedance.ies.bullet.c.e.a.b> invoke() {
            return new ArrayMap(8);
        }
    }

    static {
        Covode.recordClassIndex(63582);
    }
}
