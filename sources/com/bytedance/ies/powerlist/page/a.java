package com.bytedance.ies.powerlist.page;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.i;
import h.f.a.q;
import h.f.b.ab;
import h.f.b.i;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final Map<d, q<i, e, Object, i>> f34342c;

    /* renamed from: d  reason: collision with root package name */
    public static final C0764a f34343d = new C0764a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final i f34344a;

    /* renamed from: b  reason: collision with root package name */
    public final i f34345b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f34344a, aVar.f34344a) && l.a(this.f34345b, aVar.f34345b);
    }

    public final int hashCode() {
        i iVar = this.f34344a;
        int i2 = 0;
        int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        i iVar2 = this.f34345b;
        if (iVar2 != null) {
            i2 = iVar2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "BiDirectionPageState(prev=" + this.f34344a + ", next=" + this.f34345b + ")";
    }

    /* renamed from: com.bytedance.ies.powerlist.page.a$a  reason: collision with other inner class name */
    public static final class C0764a {
        static {
            Covode.recordClassIndex(20518);
        }

        private C0764a() {
        }

        public /* synthetic */ C0764a(byte b2) {
            this();
        }
    }

    static final /* synthetic */ class b extends i implements q<i, e, Object, i> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34348a = new b();

        static {
            Covode.recordClassIndex(20519);
        }

        b() {
            super(3);
        }

        @Override // h.f.b.c, h.k.b
        public final String getName() {
            return "onLoading";
        }

        @Override // h.f.b.c
        public final String getSignature() {
            return "onLoading(Lcom/bytedance/ies/powerlist/page/PageType;Ljava/lang/Object;)Lcom/bytedance/ies/powerlist/page/PowerPageEvent;";
        }

        @Override // h.f.b.c
        public final h.k.d getOwner() {
            return ab.a(i.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ i invoke(i iVar, e eVar, Object obj) {
            i iVar2 = iVar;
            e eVar2 = eVar;
            l.c(iVar2, "");
            l.c(eVar2, "");
            l.c(eVar2, "");
            if (iVar2.a(eVar2)) {
                return new i.d(iVar2.f34399a, eVar2);
            }
            return iVar2;
        }
    }

    static final /* synthetic */ class c extends h.f.b.i implements q<i, e, Object, i> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f34349a = new c();

        static {
            Covode.recordClassIndex(20520);
        }

        c() {
            super(3);
        }

        @Override // h.f.b.c, h.k.b
        public final String getName() {
            return "onLoaded";
        }

        @Override // h.f.b.c
        public final String getSignature() {
            return "onLoaded(Lcom/bytedance/ies/powerlist/page/PageType;Ljava/lang/Object;)Lcom/bytedance/ies/powerlist/page/PowerPageEvent;";
        }

        @Override // h.f.b.c
        public final h.k.d getOwner() {
            return ab.a(i.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ i invoke(i iVar, e eVar, Object obj) {
            i iVar2 = iVar;
            e eVar2 = eVar;
            l.c(iVar2, "");
            l.c(eVar2, "");
            l.c(eVar2, "");
            if (iVar2.a(eVar2)) {
                return new i.c(iVar2.f34399a, eVar2);
            }
            return iVar2;
        }
    }

    static final /* synthetic */ class d extends h.f.b.i implements q<i, e, Object, i> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f34350a = new d();

        static {
            Covode.recordClassIndex(20521);
        }

        d() {
            super(3);
        }

        @Override // h.f.b.c, h.k.b
        public final String getName() {
            return "onError";
        }

        @Override // h.f.b.c
        public final String getSignature() {
            return "onError(Lcom/bytedance/ies/powerlist/page/PageType;Ljava/lang/Object;)Lcom/bytedance/ies/powerlist/page/PowerPageEvent;";
        }

        @Override // h.f.b.c
        public final h.k.d getOwner() {
            return ab.a(i.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ i invoke(i iVar, e eVar, Object obj) {
            i iVar2 = iVar;
            e eVar2 = eVar;
            l.c(iVar2, "");
            l.c(eVar2, "");
            l.c(eVar2, "");
            if (!iVar2.a(eVar2)) {
                return iVar2;
            }
            e eVar3 = iVar2.f34399a;
            if (!(obj instanceof Exception)) {
                obj = null;
            }
            Exception exc = (Exception) obj;
            if (exc == null) {
                exc = new Exception();
            }
            return new i.b(eVar3, exc, eVar2);
        }
    }

    static final /* synthetic */ class e extends h.f.b.i implements q<i, e, Object, i> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f34351a = new e();

        static {
            Covode.recordClassIndex(20522);
        }

        e() {
            super(3);
        }

        @Override // h.f.b.c, h.k.b
        public final String getName() {
            return "onEnd";
        }

        @Override // h.f.b.c
        public final String getSignature() {
            return "onEnd(Lcom/bytedance/ies/powerlist/page/PageType;Ljava/lang/Object;)Lcom/bytedance/ies/powerlist/page/PowerPageEvent;";
        }

        @Override // h.f.b.c
        public final h.k.d getOwner() {
            return ab.a(i.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ i invoke(i iVar, e eVar, Object obj) {
            i iVar2 = iVar;
            e eVar2 = eVar;
            l.c(iVar2, "");
            l.c(eVar2, "");
            l.c(eVar2, "");
            if (iVar2.a(eVar2)) {
                return new i.a(iVar2.f34399a, eVar2);
            }
            return iVar2;
        }
    }

    public /* synthetic */ a() {
        this(new i.e(e.Prev, (byte) 0), new i.e(e.Next, (byte) 0));
    }

    static {
        Covode.recordClassIndex(20517);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(d.Loading, b.f34348a);
        linkedHashMap.put(d.Loaded, c.f34349a);
        linkedHashMap.put(d.Error, d.f34350a);
        linkedHashMap.put(d.End, e.f34351a);
        f34342c = linkedHashMap;
    }

    private a(i iVar, i iVar2) {
        l.c(iVar, "");
        l.c(iVar2, "");
        this.f34344a = iVar;
        this.f34345b = iVar2;
    }

    public final a a(d dVar, e eVar, Object obj) {
        l.c(dVar, "");
        l.c(eVar, "");
        q<i, e, Object, i> qVar = f34342c.get(dVar);
        if (qVar == null) {
            return this;
        }
        i invoke = qVar.invoke(this.f34344a, eVar, obj);
        i invoke2 = qVar.invoke(this.f34345b, eVar, obj);
        l.c(invoke, "");
        l.c(invoke2, "");
        return new a(invoke, invoke2);
    }
}
