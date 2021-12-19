package com.bytedance.assem.arch.core;

import android.os.Looper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.aa;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.assem.arch.extensions.j;
import com.bytedance.assem.arch.extensions.k;
import com.bytedance.assem.arch.service.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.w;
import h.z;
import java.util.LinkedHashMap;
import java.util.Map;

public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f25561b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Map<o, c> f25562a;

    /* renamed from: c  reason: collision with root package name */
    private final Map<o, t<? extends com.bytedance.assem.arch.service.a>> f25563c;

    /* renamed from: d  reason: collision with root package name */
    private final e f25564d;

    static {
        Covode.recordClassIndex(14883);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(14884);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ e() {
        this(null);
    }

    public final void a() {
        this.f25562a.clear();
        this.f25563c.clear();
    }

    static final class b<T> implements u<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f25565a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f25566b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f25567c;

        static {
            Covode.recordClassIndex(14885);
        }

        b(h.f.a.b bVar, m mVar, h.f.a.b bVar2) {
            this.f25565a = bVar;
            this.f25566b = mVar;
            this.f25567c = bVar2;
        }

        @Override // androidx.lifecycle.u
        public final void onChanged(T t) {
            h.f.a.b bVar = this.f25567c;
            if (bVar != null) {
                bVar.invoke(t);
            }
        }
    }

    public e(e eVar) {
        this.f25564d = eVar;
        this.f25562a = new LinkedHashMap();
        this.f25563c = new LinkedHashMap();
    }

    public final <DATA extends com.bytedance.assem.arch.service.a> DATA a(Class<? extends com.bytedance.assem.arch.service.b<DATA>> cls) {
        l.c(cls, "");
        o oVar = new o(cls, null);
        for (e eVar = this; eVar != null; eVar = eVar.f25564d) {
            if (eVar.f25563c.containsKey(oVar)) {
                t<? extends com.bytedance.assem.arch.service.a> tVar = eVar.f25563c.get(oVar);
                DATA data = tVar != null ? (DATA) ((com.bytedance.assem.arch.service.a) tVar.getValue()) : null;
                if (!(data instanceof com.bytedance.assem.arch.service.a)) {
                    return null;
                }
                return data;
            }
        }
        return null;
    }

    public final <SERVICE extends com.bytedance.assem.arch.service.b<?>> SERVICE b(Class<SERVICE> cls, String str) {
        l.c(cls, "");
        o oVar = new o(cls, null);
        for (e eVar = this; eVar != null; eVar = eVar.f25564d) {
            if (eVar.f25562a.containsKey(oVar)) {
                c cVar = eVar.f25562a.get(oVar);
                if (cVar != null) {
                    return (SERVICE) ((com.bytedance.assem.arch.service.b) cVar);
                }
                throw new w("null cannot be cast to non-null type");
            }
        }
        return null;
    }

    public final <SERVICE extends c> SERVICE a(Class<SERVICE> cls, String str) {
        l.c(cls, "");
        o oVar = new o(cls, null);
        for (e eVar = this; eVar != null; eVar = eVar.f25564d) {
            if (eVar.f25562a.containsKey(oVar)) {
                c cVar = eVar.f25562a.get(oVar);
                if (cVar != null) {
                    return (SERVICE) cVar;
                }
                throw new w("null cannot be cast to non-null type");
            }
        }
        return null;
    }

    public final void b(Class<?> cls, c cVar) {
        l.c(cls, "");
        l.c(cVar, "");
        o oVar = new o(cls, null);
        this.f25562a.remove(oVar);
        new StringBuilder("realUnregister: clazz = ").append(cls).append(", assemService = ").append(cVar).append(", mapSize = ").append(this.f25562a.size()).append(", serviceIdentifierMap=").append(this.f25562a);
        if (cVar instanceof com.bytedance.assem.arch.service.b) {
            this.f25563c.remove(oVar);
        }
    }

    public final <SERVICE extends c> void a(o oVar, SERVICE service) {
        l.c(oVar, "");
        l.c(service, "");
        Class<?> cls = oVar.f25591a;
        if (l.a(cls, c.class) || l.a(cls, com.bytedance.assem.arch.service.b.class)) {
            throw new IllegalArgumentException("{" + cls + " - " + service + "}: AssemService or AssemObservableService can't be registered directly, use subclass instead");
        }
        new StringBuilder("realRegister: clazz = ").append(cls).append(", assemService = ").append(service).append(", mapSize = ").append(this.f25562a.size()).append(", serviceIdentifierMap=").append(this.f25562a);
        if (this.f25562a.containsKey(oVar) && service != this.f25562a.get(oVar)) {
            if (!j.f25646a) {
                this.f25562a.remove(oVar);
                this.f25563c.remove(oVar);
                k kVar = j.f25647b;
                if (kVar != null) {
                    kVar.a("(service=" + cls + ", serviceKey =" + ((String) null) + ") has been already registered on service store. the service real instance is " + service + ", the registered service real instance is " + this.f25562a.get(oVar) + ", currentMap info is " + this.f25562a + "\",", new IllegalStateException());
                }
            } else {
                throw new IllegalStateException("(service=" + cls + ", serviceKey =" + ((String) null) + ") has been already registered on service store. the service real instance is " + service + ", the registered service real instance is " + this.f25562a.get(oVar));
            }
        }
        this.f25562a.put(oVar, service);
        if (service instanceof com.bytedance.assem.arch.service.b) {
            com.bytedance.assem.arch.service.a e2 = ((com.bytedance.assem.arch.service.b) service).e();
            t<? extends com.bytedance.assem.arch.service.a> tVar = this.f25563c.get(oVar);
            if (tVar == null) {
                tVar = new t<>();
                this.f25563c.put(oVar, tVar);
            }
            if (tVar.getValue() != null) {
                return;
            }
            if (l.a(Looper.getMainLooper(), Looper.myLooper())) {
                tVar.setValue(e2);
            } else if (tVar instanceof t) {
                tVar.postValue(e2);
            }
        }
    }

    public final void a(Class<?> cls, c cVar) {
        l.c(cls, "");
        l.c(cVar, "");
        if (l.a(cls, c.class) || l.a(cls, com.bytedance.assem.arch.service.b.class)) {
            throw new IllegalArgumentException("{" + cls + " - " + cVar + "}: AssemService or AssemObservableService can't be registered directly, use subclass instead");
        }
        o oVar = new o(cls, null);
        new StringBuilder("realRegister: clazz = ").append(cls).append(", assemService = ").append(cVar).append(", mapSize = ").append(this.f25562a.size()).append(", serviceIdentifierMap=").append(this.f25562a);
        if (this.f25562a.containsKey(oVar) && cVar != this.f25562a.get(oVar)) {
            if (!j.f25646a) {
                this.f25562a.remove(oVar);
                this.f25563c.remove(oVar);
                k kVar = j.f25647b;
                if (kVar != null) {
                    kVar.a("(service=" + cls + ", serviceKey =" + ((String) null) + ") has been already registered on service store. the service real instance is " + cVar + ", the registered service real instance is " + this.f25562a.get(oVar) + ", currentMap info is " + this.f25562a, new IllegalStateException());
                }
            } else {
                throw new IllegalStateException("(service=" + cls + ", serviceKey =" + ((String) null) + ") has been already registered on service store. the service real instance is " + cVar + ", the registered service real instance is " + this.f25562a.get(oVar));
            }
        }
        this.f25562a.put(oVar, cVar);
        if (cVar instanceof com.bytedance.assem.arch.service.b) {
            com.bytedance.assem.arch.service.a e2 = ((com.bytedance.assem.arch.service.b) cVar).e();
            t<? extends com.bytedance.assem.arch.service.a> tVar = this.f25563c.get(oVar);
            if (tVar == null) {
                tVar = new t<>();
                this.f25563c.put(oVar, tVar);
            }
            if (tVar.getValue() != null) {
                return;
            }
            if (l.a(Looper.getMainLooper(), Looper.myLooper())) {
                tVar.setValue(e2);
            } else if (tVar instanceof t) {
                tVar.postValue(e2);
            }
        }
    }

    public final <DATA extends com.bytedance.assem.arch.service.a> boolean a(Class<? extends com.bytedance.assem.arch.service.b<DATA>> cls, h.f.a.b<? super DATA, ? extends DATA> bVar) {
        c cVar;
        l.c(cls, "");
        l.c(bVar, "");
        Object obj = null;
        o oVar = new o(cls, null);
        for (e eVar = this; eVar != null; eVar = eVar.f25564d) {
            if (eVar.f25562a.containsKey(oVar)) {
                Map<o, t<? extends com.bytedance.assem.arch.service.a>> map = eVar.f25563c;
                if (!map.containsKey(oVar)) {
                    return true;
                }
                t<? extends com.bytedance.assem.arch.service.a> tVar = map.get(oVar);
                if (tVar == null) {
                    tVar = new t<>();
                    map.put(oVar, tVar);
                }
                Object value = tVar.getValue();
                if (value == null && (cVar = eVar.f25562a.get(oVar)) != null && (cVar instanceof com.bytedance.assem.arch.service.b)) {
                    value = ((com.bytedance.assem.arch.service.b) cVar).e();
                }
                if (value instanceof com.bytedance.assem.arch.service.a) {
                    obj = value;
                }
                Object invoke = bVar.invoke(obj);
                if (value == null || value.equals(invoke)) {
                    return true;
                }
                if (l.a(Looper.getMainLooper(), Looper.myLooper())) {
                    tVar.setValue(invoke);
                    return true;
                } else if (!(tVar instanceof t)) {
                    return true;
                } else {
                    tVar.postValue(invoke);
                    return true;
                }
            }
        }
        return false;
    }

    public final <DATA extends com.bytedance.assem.arch.service.a, T> void a(m mVar, Class<? extends com.bytedance.assem.arch.service.b<DATA>> cls, h.f.a.b<? super DATA, ? extends T> bVar, h.f.a.b<? super T, z> bVar2) {
        l.c(mVar, "");
        l.c(cls, "");
        l.c(bVar, "");
        o oVar = new o(cls, null);
        for (e eVar = this; eVar != null; eVar = eVar.f25564d) {
            if (eVar.f25562a.containsKey(oVar)) {
                Map<o, t<? extends com.bytedance.assem.arch.service.a>> map = eVar.f25563c;
                t<? extends com.bytedance.assem.arch.service.a> tVar = map.get(oVar);
                if (map.containsKey(oVar) && tVar == null) {
                    tVar = new t<>();
                    map.put(oVar, tVar);
                }
                if ((tVar instanceof LiveData) && tVar != null) {
                    aa.a(tVar, new f(bVar)).observe(mVar, new b(bVar, mVar, bVar2));
                    return;
                }
                return;
            }
        }
    }
}
