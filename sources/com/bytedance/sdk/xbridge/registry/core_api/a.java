package com.bytedance.sdk.xbridge.registry.core_api;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.protocol.c;
import com.bytedance.sdk.xbridge.protocol.c.g;
import com.bytedance.sdk.xbridge.protocol.impl.b.d;
import com.bytedance.sdk.xbridge.protocol.impl.lynx.LynxBridgeDelegateModule;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.n;
import h.a.ag;
import h.f.b.l;
import h.p;
import java.util.Iterator;
import org.json.JSONObject;

public final class a {

    /* renamed from: c */
    public static AbstractC1074a f44052c;

    /* renamed from: d */
    public static boolean f44053d;

    /* renamed from: e */
    public static boolean f44054e;

    /* renamed from: f */
    public static final b f44055f = new b((byte) 0);

    /* renamed from: a */
    public final c f44056a = new c();

    /* renamed from: b */
    public e f44057b;

    /* renamed from: com.bytedance.sdk.xbridge.registry.core_api.a$a */
    public interface AbstractC1074a {
        static {
            Covode.recordClassIndex(26920);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(26919);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(26921);
        }

        private b() {
        }

        public static boolean a() {
            return a.f44053d;
        }

        public static boolean b() {
            return a.f44054e;
        }

        public static void c() {
            AbstractC1074a aVar = a.f44052c;
            if (aVar != null) {
                aVar.a();
            }
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final g b() {
        return this.f44056a.f43954a.f43921c;
    }

    public final com.bytedance.sdk.xbridge.protocol.a a() {
        c cVar = this.f44056a;
        if (cVar != null) {
            return cVar.f43954a;
        }
        return null;
    }

    public final void c() {
        Object obj;
        e eVar = this.f44057b;
        if (eVar != null) {
            eVar.f44077a.clear();
        }
        l.c(this, "");
        Iterator it = ag.e(b.f44059a).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (l.a(((p) obj).getSecond(), this)) {
                break;
            }
        }
        p pVar = (p) obj;
        if (pVar != null) {
            b.f44059a.remove(pVar.getFirst());
        }
        com.bytedance.sdk.xbridge.registry.core_api.d.b.a(b.f44059a.values());
    }

    public final void a(com.bytedance.sdk.xbridge.protocol.impl.a.b bVar) {
        l.c(bVar, "");
        c cVar = this.f44056a;
        l.c(bVar, "");
        if (cVar.f43954a.f43925g == null) {
            cVar.f43954a.f43925g = bVar;
        }
    }

    public final void a(n nVar, String str) {
        l.c(nVar, "");
        c cVar = this.f44056a;
        l.c(nVar, "");
        com.bytedance.sdk.xbridge.protocol.impl.lynx.b bVar = new com.bytedance.sdk.xbridge.protocol.impl.lynx.b(cVar.f43954a);
        l.c(nVar, "");
        nVar.a(bVar.f44031a, LynxBridgeDelegateModule.class, bVar.f44032b);
        cVar.f43954a.f43923e = str;
    }

    public final void a(String str, com.bytedance.sdk.xbridge.registry.core_api.a.c cVar) {
        l.c(str, "");
        l.c(cVar, "");
        if (this.f44057b == null) {
            this.f44057b = new e();
        }
        e eVar = this.f44057b;
        if (eVar != null) {
            l.c(str, "");
            l.c(cVar, "");
            eVar.f44077a.put(str, cVar);
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        l.c(str, "");
        c cVar = this.f44056a;
        l.c(str, "");
        Iterator<T> it = cVar.f43954a.f43924f.iterator();
        while (it.hasNext()) {
            it.next().a(str, jSONObject);
        }
    }

    public final void a(View view, String str, boolean z) {
        l.c(view, "");
        AbstractC1074a aVar = f44052c;
        if (aVar != null) {
            aVar.a();
        }
        boolean z2 = view instanceof WebView;
        if ((z2 && f44053d) || (((view instanceof LynxView) && f44054e) || z)) {
            l.c(view, "");
            l.c(this, "");
            b.f44059a.put(Integer.valueOf(view.hashCode()), this);
            com.bytedance.sdk.xbridge.registry.core_api.d.b.a(b.f44059a.values());
            c cVar = this.f44056a;
            l.c(view, "");
            if (view instanceof LynxView) {
                cVar.f43954a.f43922d = (LynxView) view;
                cVar.a(new com.bytedance.sdk.xbridge.protocol.impl.lynx.a(cVar.f43954a));
            } else if (z2) {
                cVar.f43954a.f43921c = new com.bytedance.sdk.xbridge.protocol.impl.b.a((WebView) view);
                cVar.a(new d(cVar.f43954a));
                if (z) {
                    cVar.a(new com.bytedance.sdk.xbridge.protocol.impl.b.c(cVar.f43954a));
                    cVar.a(new com.bytedance.sdk.xbridge.protocol.impl.b.b(cVar.f43954a));
                }
            }
            Iterator<T> it = cVar.f43954a.f43924f.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            cVar.f43954a.f43923e = str;
        }
    }
}
