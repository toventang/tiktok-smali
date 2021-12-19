package com.bytedance.ies.web.jsbridge2;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.ies.web.jsbridge2.ab;
import com.bytedance.ies.web.jsbridge2.ad;
import com.bytedance.ies.web.jsbridge2.ae;
import com.bytedance.ies.web.jsbridge2.e;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class h implements ae.a {

    /* renamed from: a  reason: collision with root package name */
    public final j f35651a;

    /* renamed from: b  reason: collision with root package name */
    public final ac f35652b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<e> f35653c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public final b f35654d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, c> f35655e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, e.b> f35656f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final List<w> f35657g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final Set<q> f35658h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f35659i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f35660j;

    static {
        Covode.recordClassIndex(21293);
    }

    /* access modifiers changed from: package-private */
    public final <T> void a(String str, T t) {
        this.f35654d.a(str, (Object) t);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, f<?, ?> fVar) {
        fVar.name = str;
        this.f35655e.put(str, fVar);
    }

    @Override // com.bytedance.ies.web.jsbridge2.ae.a
    public final void b() {
        ArrayList arrayList = new ArrayList();
        LinkedList<w> linkedList = new LinkedList(this.f35657g);
        this.f35657g.clear();
        for (w wVar : linkedList) {
            this.f35654d.b(wVar);
            arrayList.add(wVar.toString());
        }
        new TimeLineEvent.a().a(TimeLineEvent.b.o, (Object) arrayList).a(TimeLineEvent.b.aq, x.f35708g);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        for (e eVar : this.f35653c) {
            eVar.terminateActual();
        }
        this.f35653c.clear();
        this.f35655e.clear();
        this.f35656f.clear();
        this.f35652b.a(this);
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f35666a;

        /* renamed from: b  reason: collision with root package name */
        String f35667b;

        /* renamed from: c  reason: collision with root package name */
        JSONObject f35668c;

        static {
            Covode.recordClassIndex(21296);
        }

        private a(JSONObject jSONObject) {
            this.f35666a = true;
            this.f35668c = jSONObject;
        }

        /* synthetic */ a(JSONObject jSONObject, byte b2) {
            this(jSONObject);
        }

        private a(boolean z, String str) {
            this.f35666a = z;
            this.f35667b = str;
        }

        /* synthetic */ a(boolean z, String str, byte b2) {
            this(z, str);
        }
    }

    private void a(w wVar) {
        for (q qVar : this.f35658h) {
            qVar.a(wVar, 1);
        }
    }

    private static Type[] a(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, d dVar) {
        dVar.name = str;
        this.f35655e.put(str, dVar);
    }

    private Object a(String str, c cVar) {
        return this.f35651a.a(str, a(cVar)[0]);
    }

    /* access modifiers changed from: package-private */
    public final a a(final w wVar, g gVar) {
        c cVar = this.f35655e.get(wVar.f35692d);
        try {
            String str = gVar.f35647b;
            if (TextUtils.isEmpty(str) || TimeLineEvent.b.X.equals(str)) {
                String a2 = this.f35654d.a();
                if (!TextUtils.isEmpty(a2)) {
                    gVar.f35647b = a2;
                    new TimeLineEvent.a().a(TimeLineEvent.b.f35547a, a2).a(TimeLineEvent.b.aK, wVar.f35698j);
                }
            }
            if (cVar != null) {
                ai a3 = a(gVar.f35647b, cVar, wVar.f35698j);
                gVar.f35650e = a3;
                if (a3 == null) {
                    String str2 = TimeLineEvent.b.V;
                    if (TextUtils.isEmpty(gVar.f35647b) || TimeLineEvent.b.X.equals(gVar.f35647b)) {
                        str2 = TimeLineEvent.b.Y;
                    }
                    new TimeLineEvent.a().a(TimeLineEvent.b.f35550d, TimeLineEvent.b.V).a(TimeLineEvent.b.av, wVar.f35698j);
                    a(gVar.f35647b, wVar.f35692d, 1, str2, wVar.f35698j);
                    a(wVar);
                    throw new z(-1);
                }
                new TimeLineEvent.a().a(TimeLineEvent.b.aO, wVar.f35698j);
                if (cVar instanceof f) {
                    f fVar = (f) cVar;
                    Object invoke = fVar.invoke(a(wVar.f35693e, (c) fVar), gVar);
                    JSONObject a4 = aj.a(invoke);
                    if (a4 != null) {
                        return new a(a4, (byte) 0);
                    }
                    return new a(true, aj.a(this.f35651a, invoke), (byte) 0);
                } else if (cVar instanceof d) {
                    ((d) cVar).a(wVar, new ab(wVar.f35692d, a3, new ab.a() {
                        /* class com.bytedance.ies.web.jsbridge2.h.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(21295);
                        }

                        @Override // com.bytedance.ies.web.jsbridge2.ab.a
                        public final void a(String str) {
                            if (str != null && h.this.f35654d != null) {
                                h.this.f35654d.b(str, wVar);
                            }
                        }
                    }));
                    return new a(false, "", (byte) 0);
                }
            }
            e.b bVar = this.f35656f.get(wVar.f35692d);
            if (bVar != null) {
                final e a5 = bVar.a();
                a5.name = wVar.f35692d;
                ai a6 = a(gVar.f35647b, a5, wVar.f35698j);
                gVar.f35650e = a6;
                if (a6 == null) {
                    String str3 = TimeLineEvent.b.W;
                    if (TextUtils.isEmpty(gVar.f35647b) || TimeLineEvent.b.X.equals(gVar.f35647b)) {
                        str3 = TimeLineEvent.b.Z;
                    }
                    new TimeLineEvent.a().a(TimeLineEvent.b.f35550d, TimeLineEvent.b.W).a(TimeLineEvent.b.av, wVar.f35698j);
                    a(gVar.f35647b, wVar.f35692d, 1, str3, wVar.f35698j);
                    a(wVar);
                    a5.onDestroy();
                    throw new z(-1);
                }
                new TimeLineEvent.a().a(TimeLineEvent.b.aO, wVar.f35698j);
                this.f35653c.add(a5);
                a5.invokeActual(a(wVar.f35693e, (c) a5), gVar, new e.a() {
                    /* class com.bytedance.ies.web.jsbridge2.h.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(21294);
                    }

                    @Override // com.bytedance.ies.web.jsbridge2.e.a
                    public final void a(Throwable th) {
                        if (h.this.f35654d != null) {
                            h.this.f35654d.b(aj.a(th), wVar);
                            h.this.f35653c.remove(a5);
                        }
                    }

                    @Override // com.bytedance.ies.web.jsbridge2.e.a
                    public final void a(Object obj) {
                        if (h.this.f35654d != null) {
                            JSONObject a2 = aj.a(obj);
                            if (a2 != null) {
                                h.this.f35654d.b(a2, wVar);
                            } else {
                                h.this.f35654d.b(aj.a(h.this.f35651a, obj), wVar);
                            }
                            h.this.f35653c.remove(a5);
                        }
                    }

                    @Override // com.bytedance.ies.web.jsbridge2.e.a
                    public final void a(JSONObject jSONObject) {
                        if (h.this.f35654d != null) {
                            h.this.f35654d.b(jSONObject, wVar);
                            h.this.f35653c.remove(a5);
                        }
                    }
                });
                return new a(false, "", (byte) 0);
            }
            new TimeLineEvent.a().a(TimeLineEvent.b.f35550d, TimeLineEvent.b.Q).a(TimeLineEvent.b.av, wVar.f35698j);
            a(gVar.f35647b, wVar.f35692d, 2, TimeLineEvent.b.Q, wVar.f35698j);
            return null;
        } catch (ad.a e2) {
            k.a((Throwable) e2);
            new TimeLineEvent.a().a(TimeLineEvent.b.G, e2.getClass().getSimpleName()).a(TimeLineEvent.b.H, e2.getMessage()).a(TimeLineEvent.b.aw, wVar.f35698j);
            this.f35657g.add(wVar);
            return new a(false, "", (byte) 0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, e.b bVar) {
        this.f35656f.put(str, bVar);
    }

    h(l lVar, b bVar, ad adVar) {
        boolean z;
        this.f35654d = bVar;
        this.f35651a = lVar.f35676e;
        ac acVar = new ac(adVar, lVar.f35684m, lVar.n);
        this.f35652b = acVar;
        if (acVar.f35570b != null) {
            acVar.f35570b.f35594c.add(this);
        }
        acVar.f35571c = lVar.q;
        acVar.f35572d = lVar.r;
        this.f35658h = lVar.f35681j;
        this.f35659i = lVar.f35680i;
        this.f35660j = lVar.p;
        TimeLineEvent.a aVar = new TimeLineEvent.a();
        String str = TimeLineEvent.b.f35557k;
        if (adVar != null) {
            z = true;
        } else {
            z = false;
        }
        aVar.a(str, Boolean.valueOf(z)).a(TimeLineEvent.b.ap, lVar.s);
    }

    private ai a(String str, c cVar, List<TimeLineEvent> list) {
        if (!this.f35660j) {
            return this.f35652b.a(this.f35659i, str, cVar, list);
        }
        new TimeLineEvent.a().a(TimeLineEvent.b.f35547a, str).a(TimeLineEvent.b.w, cVar.getName()).a(TimeLineEvent.b.x, cVar.getClass().getSimpleName()).a(TimeLineEvent.b.y, cVar.getPermissionGroup()).a(TimeLineEvent.b.v, (Object) true).a(TimeLineEvent.b.z, ai.PRIVATE.toString()).a(TimeLineEvent.b.ax, list);
        return ai.PRIVATE;
    }

    private void a(String str, String str2, int i2, String str3, List<TimeLineEvent> list) {
        for (q qVar : this.f35658h) {
            qVar.a(str, str2, i2, str3, new al(x.f35708g, this.f35654d.f35638m, list));
        }
    }
}
