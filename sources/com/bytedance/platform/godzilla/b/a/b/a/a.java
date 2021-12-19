package com.bytedance.platform.godzilla.b.a.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.b.a.a.a.b;
import com.bytedance.platform.godzilla.b.a.a.a.c;
import com.bytedance.platform.godzilla.d.d;
import com.bytedance.platform.godzilla.d.g;
import java.lang.reflect.Method;
import java.util.Map;

public final class a extends c {

    /* renamed from: e  reason: collision with root package name */
    private String f41968e;

    static {
        Covode.recordClassIndex(25634);
    }

    public final void a() {
        Object b2;
        b bVar = new b(this.f41968e, this);
        try {
            Class<?> cls = Class.forName("android.os.ServiceManager");
            Object a2 = d.a(cls, "getService", bVar.f41970a);
            if (a2 != null && (b2 = com.bytedance.platform.godzilla.d.a.b(cls, "sCache")) != null && (b2 instanceof Map)) {
                bVar.f41971b.a(a2);
                ((Map) b2).put(bVar.f41970a, g.a(a2, bVar.f41971b));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: com.bytedance.platform.godzilla.b.a.b.a.a$a  reason: collision with other inner class name */
    static class C1029a extends b {

        /* renamed from: a  reason: collision with root package name */
        private c f41969a;

        static {
            Covode.recordClassIndex(25635);
        }

        C1029a(c cVar) {
            this.f41969a = cVar;
        }

        @Override // com.bytedance.platform.godzilla.b.a.a.a.b
        public final Object a(Object obj, Method method, Object[] objArr) {
            return super.a(obj, method, objArr);
        }

        @Override // com.bytedance.platform.godzilla.b.a.a.a.b
        public final Object a(Object obj, Method method, Object[] objArr, Object obj2) {
            return g.a(this.f41969a.f41963c, this.f41969a);
        }
    }

    public a(String str, c cVar) {
        this.f41968e = str;
        this.f41962b.put("queryLocalInterface", new C1029a(cVar));
    }
}
