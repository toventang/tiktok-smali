package com.bytedance.provider;

import com.bytedance.covode.number.Covode;
import com.bytedance.provider.c;
import com.bytedance.provider.d;
import com.bytedance.provider.impl.c;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.l.k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

public class g {

    /* renamed from: d  reason: collision with root package name */
    public static final ConcurrentHashMap<String, CopyOnWriteArraySet<b<?>>> f42000d = new ConcurrentHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public static final a f42001e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Map<a<?>, b<?>> f42002a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final List<d> f42003b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public d f42004c = com.bytedance.provider.impl.c.f42017b;

    /* renamed from: f  reason: collision with root package name */
    private final d f42005f;

    public static final class a {
        static {
            Covode.recordClassIndex(25679);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public d a() {
        d dVar = this.f42004c;
        l.c(dVar, "");
        this.f42004c = com.bytedance.provider.impl.c.f42017b;
        return dVar;
    }

    static {
        Covode.recordClassIndex(25678);
    }

    public void b() {
        String str;
        this.f42003b.clear();
        for (Map.Entry<a<?>, b<?>> entry : this.f42002a.entrySet()) {
            b<?> value = entry.getValue();
            h a2 = value.a();
            if (a2 != null) {
                str = a2.getSourceId();
            } else {
                str = null;
            }
            a(str, value);
        }
        this.f42002a.clear();
    }

    static final class b extends m implements h.f.a.b<T, T> {
        final /* synthetic */ h $data$inlined;

        static {
            Covode.recordClassIndex(25680);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h hVar) {
            super(1);
            this.$data$inlined = hVar;
        }

        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(Object obj) {
            l.c(obj, "");
            return this.$data$inlined;
        }
    }

    static final class c extends m implements h.f.a.b<T, T> {
        final /* synthetic */ h $data$inlined;
        final /* synthetic */ a $key$inlined;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(25681);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar, h hVar, a aVar) {
            super(1);
            this.this$0 = gVar;
            this.$data$inlined = hVar;
            this.$key$inlined = aVar;
        }

        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(Object obj) {
            l.c(obj, "");
            return this.$data$inlined;
        }
    }

    public g(d dVar) {
        l.c(dVar, "");
        this.f42005f = dVar;
    }

    static final class d<T> implements f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f42006a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f42007b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f42008c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f42009d;

        static {
            Covode.recordClassIndex(25682);
        }

        d(c cVar, g gVar, h hVar, a aVar) {
            this.f42006a = cVar;
            this.f42007b = gVar;
            this.f42008c = hVar;
            this.f42009d = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            h hVar = (h) obj;
            g.a(this.f42006a.f41993b, this.f42006a);
            if (hVar != null) {
                CopyOnWriteArraySet<b<?>> copyOnWriteArraySet = g.f42000d.get(hVar.getSourceId());
                if (copyOnWriteArraySet == null) {
                    copyOnWriteArraySet = new CopyOnWriteArraySet<>();
                }
                copyOnWriteArraySet.add(this.f42006a);
                g.f42000d.put(hVar.getSourceId(), copyOnWriteArraySet);
            }
        }
    }

    static final class e extends m implements h.f.a.b<d, d> {
        final /* synthetic */ z.e $lastScope;
        final /* synthetic */ d $scope;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(25683);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(g gVar, z.e eVar, d dVar) {
            super(1);
            this.this$0 = gVar;
            this.$lastScope = eVar;
            this.$scope = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            l.c(dVar2, "");
            T t = (T) dVar2.a();
            if (!l.a((Object) t, (Object) this.this$0)) {
                this.$lastScope.element = t;
                return this.$scope.a().f42004c;
            }
            throw new IllegalStateException(("encounter circular scope attachment : " + this.this$0 + " => " + ((Object) this.$lastScope.element) + " => " + this.this$0).toString());
        }
    }

    private static <T extends h> a<T> b(String str, Class<T> cls) {
        return new a<>(str, cls);
    }

    public static void a(String str, b<?> bVar) {
        if (str != null) {
            ConcurrentHashMap<String, CopyOnWriteArraySet<b<?>>> concurrentHashMap = f42000d;
            CopyOnWriteArraySet<b<?>> copyOnWriteArraySet = concurrentHashMap.get(str);
            if (copyOnWriteArraySet != null) {
                copyOnWriteArraySet.remove(bVar);
                if (!copyOnWriteArraySet.isEmpty()) {
                    return;
                }
            }
            concurrentHashMap.remove(str);
        }
    }

    public final <T extends h> b<T> a(String str, Class<T> cls) {
        l.c(str, "");
        l.c(cls, "");
        a b2 = b(str, cls);
        g gVar = this;
        while (!gVar.f42002a.containsKey(b2) && (!l.a(gVar, c.b.f42020f))) {
            gVar = gVar.f42004c.a();
        }
        Object obj = gVar.f42002a.get(b2);
        if (!(obj instanceof b)) {
            obj = null;
        }
        return (b) obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.provider.g */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(d dVar, d.a aVar) {
        g a2;
        l.c(dVar, "");
        l.c(aVar, "");
        d dVar2 = this.f42004c;
        if (dVar2 != null && (!l.a(dVar2, dVar))) {
            if ((!l.a(dVar2, com.bytedance.provider.impl.c.f42017b)) && (a2 = dVar2.a()) != null) {
                a2.a();
            }
            this.f42004c = dVar;
            l.c(dVar, "");
            z.e eVar = new z.e();
            eVar.element = this;
            k.a(dVar, new e(this, eVar, dVar));
        }
    }

    public final <T extends h> void a(String str, T t, Class<T> cls) {
        l.c(str, "");
        l.c(t, "");
        l.c(cls, "");
        a<?> b2 = b(str, cls);
        b<?> bVar = this.f42002a.get(b2);
        if (!(bVar instanceof b)) {
            bVar = null;
        }
        b<?> bVar2 = bVar;
        if (bVar2 != null) {
            bVar2.a(new b(t));
            return;
        }
        c cVar = new c(t);
        this.f42002a.put(b2, cVar);
        cVar.a(new c(this, t, b2));
        d dVar = new d(cVar, this, t, b2);
        l.c(dVar, "");
        cVar.f41992a.d(new c.a(dVar));
    }
}
