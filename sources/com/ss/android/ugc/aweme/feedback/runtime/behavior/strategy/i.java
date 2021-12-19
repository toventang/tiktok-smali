package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.BehaviorType;
import com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel;
import com.ss.android.ugc.aweme.utils.dg;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public abstract class i extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f95423a = new b((byte) 0);

    static {
        Covode.recordClassIndex(60441);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(60443);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f95424a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f95425b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f95426c;

        /* renamed from: d  reason: collision with root package name */
        public final long f95427d;

        /* renamed from: e  reason: collision with root package name */
        public final long f95428e;

        /* renamed from: f  reason: collision with root package name */
        public final a f95429f;

        /* renamed from: g  reason: collision with root package name */
        public final List<PublishBehaviorModel> f95430g;

        static {
            Covode.recordClassIndex(60444);
        }

        public static abstract class a {

            /* renamed from: a  reason: collision with root package name */
            public final String f95431a;

            static {
                Covode.recordClassIndex(60445);
            }

            /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$c$a$a  reason: collision with other inner class name */
            public static final class C2292a extends a {

                /* renamed from: b  reason: collision with root package name */
                public static final C2292a f95432b = new C2292a();

                private C2292a() {
                    super("Cancel", (byte) 0);
                }

                static {
                    Covode.recordClassIndex(60446);
                }
            }

            public static abstract class b extends a {
                static {
                    Covode.recordClassIndex(60447);
                }

                private b() {
                    super("Failed", (byte) 0);
                }

                public /* synthetic */ b(byte b2) {
                    this();
                }

                /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$c$a$b$b  reason: collision with other inner class name */
                public static final class C2294b extends b {

                    /* renamed from: b  reason: collision with root package name */
                    public final String f95435b;

                    static {
                        Covode.recordClassIndex(60449);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C2294b(String str) {
                        super((byte) 0);
                        l.d(str, "");
                        this.f95435b = str;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$c$a$b$c  reason: collision with other inner class name */
                public static final class C2295c extends b {

                    /* renamed from: b  reason: collision with root package name */
                    public final String f95436b;

                    static {
                        Covode.recordClassIndex(60450);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C2295c(String str) {
                        super((byte) 0);
                        l.d(str, "");
                        this.f95436b = str;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$c$a$b$a  reason: collision with other inner class name */
                public static final class C2293a extends b {

                    /* renamed from: b  reason: collision with root package name */
                    public final String f95433b;

                    /* renamed from: c  reason: collision with root package name */
                    public final String f95434c;

                    static {
                        Covode.recordClassIndex(60448);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C2293a(String str, String str2) {
                        super((byte) 0);
                        l.d(str, "");
                        l.d(str2, "");
                        this.f95433b = str;
                        this.f95434c = str2;
                    }
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$c$a$c  reason: collision with other inner class name */
            public static final class C2296c extends a {

                /* renamed from: b  reason: collision with root package name */
                public static final C2296c f95437b = new C2296c();

                private C2296c() {
                    super("Success", (byte) 0);
                }

                static {
                    Covode.recordClassIndex(60451);
                }
            }

            private a(String str) {
                this.f95431a = str;
            }

            public /* synthetic */ a(String str, byte b2) {
                this(str);
            }
        }

        private final a a() {
            T t;
            PublishBehaviorModel publishBehaviorModel;
            if (this.f95425b) {
                return new a.b.C2293a(this.f95430g.get(0).code, this.f95430g.get(0).stage);
            }
            if (!this.f95424a) {
                return a.C2292a.f95432b;
            }
            Iterator<T> it = this.f95430g.iterator();
            while (true) {
                t = null;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                T t2 = next;
                if (l.a((Object) t2.stage, (Object) "CA") && t2.type == BehaviorType.SUCCESS) {
                    if (next != null) {
                        return a.C2296c.f95437b;
                    }
                }
            }
            List<PublishBehaviorModel> list = this.f95430g;
            ListIterator<PublishBehaviorModel> listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    publishBehaviorModel = null;
                    break;
                }
                publishBehaviorModel = listIterator.previous();
                if (publishBehaviorModel.type == BehaviorType.FAILED) {
                    break;
                }
            }
            PublishBehaviorModel publishBehaviorModel2 = publishBehaviorModel;
            if (publishBehaviorModel2 == null) {
                a.b.C2295c a2 = a("SN", b.f95438a);
                if (a2 != null) {
                    return a2;
                }
                a.b.C2295c a3 = a("AK", C2297c.f95439a);
                if (a3 != null) {
                    return a3;
                }
                a.b.C2295c a4 = a("UP", d.f95440a);
                if (a4 != null) {
                    return a4;
                }
                a.b.C2295c a5 = a("CA", e.f95441a);
                if (a5 != null) {
                    return a5;
                }
                return new a.b.C2294b("UNKNOW");
            } else if (!l.a((Object) publishBehaviorModel2.stage, (Object) "UP") || !l.a((Object) publishBehaviorModel2.code, (Object) "-39995")) {
                return new a.b.C2293a(publishBehaviorModel2.code, publishBehaviorModel2.stage);
            } else {
                Iterator<T> it2 = this.f95430g.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next2 = it2.next();
                    T t3 = next2;
                    if (l.a((Object) t3.stage, (Object) "SN") && t3.type == BehaviorType.FAILED) {
                        t = next2;
                        break;
                    }
                }
                T t4 = t;
                if (t4 == null) {
                    return new a.b.C2294b("CONFLICT");
                }
                return new a.b.C2293a(t4.code, t4.stage);
            }
        }

        /* access modifiers changed from: package-private */
        public static final class b extends m implements h.f.a.b<PublishBehaviorModel, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f95438a = new b();

            static {
                Covode.recordClassIndex(60452);
            }

            b() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ Boolean invoke(PublishBehaviorModel publishBehaviorModel) {
                boolean z;
                PublishBehaviorModel publishBehaviorModel2 = publishBehaviorModel;
                l.d(publishBehaviorModel2, "");
                if (!l.a((Object) publishBehaviorModel2.stage, (Object) "SN") || publishBehaviorModel2.type != BehaviorType.START) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$c$c  reason: collision with other inner class name */
        public static final class C2297c extends m implements h.f.a.b<PublishBehaviorModel, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final C2297c f95439a = new C2297c();

            static {
                Covode.recordClassIndex(60453);
            }

            C2297c() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ Boolean invoke(PublishBehaviorModel publishBehaviorModel) {
                boolean z;
                PublishBehaviorModel publishBehaviorModel2 = publishBehaviorModel;
                l.d(publishBehaviorModel2, "");
                if (!l.a((Object) publishBehaviorModel2.stage, (Object) "SN") || publishBehaviorModel2.type != BehaviorType.START) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        /* access modifiers changed from: package-private */
        public static final class d extends m implements h.f.a.b<PublishBehaviorModel, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final d f95440a = new d();

            static {
                Covode.recordClassIndex(60454);
            }

            d() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ Boolean invoke(PublishBehaviorModel publishBehaviorModel) {
                boolean z;
                PublishBehaviorModel publishBehaviorModel2 = publishBehaviorModel;
                l.d(publishBehaviorModel2, "");
                if (!l.a((Object) publishBehaviorModel2.stage, (Object) "AK") || publishBehaviorModel2.type != BehaviorType.SUCCESS) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        /* access modifiers changed from: package-private */
        public static final class e extends m implements h.f.a.b<PublishBehaviorModel, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final e f95441a = new e();

            static {
                Covode.recordClassIndex(60455);
            }

            e() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ Boolean invoke(PublishBehaviorModel publishBehaviorModel) {
                boolean z;
                PublishBehaviorModel publishBehaviorModel2 = publishBehaviorModel;
                l.d(publishBehaviorModel2, "");
                if (!l.a((Object) publishBehaviorModel2.stage, (Object) "UP") || publishBehaviorModel2.type != BehaviorType.SUCCESS) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        public final void a(int i2) {
            Iterator<T> it = this.f95430g.iterator();
            while (it.hasNext()) {
                it.next().idIndex = i2;
            }
        }

        public c(String str, List<PublishBehaviorModel> list) {
            boolean z;
            l.d(str, "");
            l.d(list, "");
            this.f95430g = list;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (l.a((Object) next.stage, (Object) "CP")) {
                    if (next != null) {
                        z = true;
                    }
                }
            }
            z = false;
            this.f95424a = z;
            this.f95425b = l.a((Object) str, (Object) "-1");
            this.f95426c = l.a((Object) str, (Object) "-2");
            this.f95427d = ((PublishBehaviorModel) n.g((List) this.f95430g)).timeStamp;
            this.f95428e = ((PublishBehaviorModel) n.i((List) this.f95430g)).timeStamp;
            this.f95429f = a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
            if (r3 == null) goto L_0x0055;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i.c.a.b.C2295c a(java.lang.String r9, h.f.a.b<? super com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel, java.lang.Boolean> r10) {
            /*
                r8 = this;
                java.util.List<com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel> r0 = r8.f95430g
                java.util.Iterator r2 = r0.iterator()
            L_0x0006:
                boolean r0 = r2.hasNext()
                r7 = 0
                if (r0 == 0) goto L_0x0059
                java.lang.Object r1 = r2.next()
                java.lang.Object r0 = r10.invoke(r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x0006
            L_0x001d:
                r6 = 1
                r0 = 0
                if (r1 == 0) goto L_0x0057
                r5 = 1
            L_0x0022:
                java.util.List<com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel> r0 = r8.f95430g
                java.util.Iterator r4 = r0.iterator()
            L_0x0028:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x0055
                java.lang.Object r3 = r4.next()
                r2 = r3
                com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel r2 = (com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel) r2
                java.lang.String r0 = r2.stage
                boolean r0 = h.f.b.l.a(r0, r9)
                if (r0 == 0) goto L_0x0028
                com.ss.android.ugc.aweme.shortvideo.model.BehaviorType r1 = r2.type
                com.ss.android.ugc.aweme.shortvideo.model.BehaviorType r0 = com.ss.android.ugc.aweme.shortvideo.model.BehaviorType.SUCCESS
                if (r1 == r0) goto L_0x0049
                com.ss.android.ugc.aweme.shortvideo.model.BehaviorType r1 = r2.type
                com.ss.android.ugc.aweme.shortvideo.model.BehaviorType r0 = com.ss.android.ugc.aweme.shortvideo.model.BehaviorType.FAILED
                if (r1 != r0) goto L_0x0028
            L_0x0049:
                if (r3 == 0) goto L_0x0055
            L_0x004b:
                if (r5 == 0) goto L_0x005b
                if (r6 != 0) goto L_0x005b
                com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$c$a$b$c r0 = new com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$c$a$b$c
                r0.<init>(r9)
                return r0
            L_0x0055:
                r6 = 0
                goto L_0x004b
            L_0x0057:
                r5 = 0
                goto L_0x0022
            L_0x0059:
                r1 = r7
                goto L_0x001d
            L_0x005b:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i.c.a(java.lang.String, h.f.a.b):com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$c$a$b$c");
        }
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final long b() {
        return TimeUnit.HOURS.toMillis(24);
    }

    /* access modifiers changed from: protected */
    public final List<c> e() {
        List<c> a2;
        List<c> d2;
        d d3 = d();
        List<c> list = d3.f95443b;
        List<c> list2 = d3.f95444c;
        List<c> list3 = d3.f95445d;
        List d4 = n.d((List) list2, 4);
        if (d4.isEmpty()) {
            a2 = n.d((List) list3, 4);
        } else {
            a2 = a(list3, d4);
        }
        if (!d4.isEmpty()) {
            d2 = a(list, d4);
        } else if (!a2.isEmpty()) {
            d2 = a(list, a2);
        } else {
            d2 = n.d((List) list, 4);
        }
        return n.d((Collection) n.d((Collection) d4, (Iterable) a2), (Iterable) d2);
    }

    /* access modifiers changed from: protected */
    public final d d() {
        Object obj;
        Object obj2;
        ArrayList arrayList;
        ArrayList arrayList2;
        List<PublishBehaviorModel> list;
        List<PublishBehaviorModel> list2;
        List<com.ss.android.ugc.aweme.runtime.behavior.c> a2 = com.ss.android.ugc.aweme.feedback.runtime.behavior.b.a("publish", System.currentTimeMillis() - b());
        ArrayList arrayList3 = new ArrayList(n.a((Iterable) a2, 10));
        Iterator<T> it = a2.iterator();
        while (it.hasNext()) {
            arrayList3.add(dg.a(it.next().f120725d, PublishBehaviorModel.class));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayList3) {
            String str = ((PublishBehaviorModel) obj3).publishId;
            Object obj4 = linkedHashMap.get(str);
            if (obj4 == null) {
                obj4 = new ArrayList();
                linkedHashMap.put(str, obj4);
            }
            ((List) obj4).add(obj3);
        }
        ArrayList arrayList4 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList4.add(new c((String) entry.getKey(), n.a((Iterable) entry.getValue(), (Comparator) new a())));
        }
        List a3 = n.a((Iterable) arrayList4, (Comparator) new f());
        Iterator it2 = a3.iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((c) obj2).f95425b) {
                break;
            }
        }
        c cVar = (c) obj2;
        if (cVar == null || (list2 = cVar.f95430g) == null) {
            arrayList = z.INSTANCE;
        } else {
            ArrayList arrayList5 = new ArrayList(n.a((Iterable) list2, 10));
            for (T t : list2) {
                arrayList5.add(new c(t.publishId, n.a((Object) t)));
            }
            arrayList = arrayList5;
        }
        Iterator it3 = a3.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (((c) next).f95426c) {
                obj = next;
                break;
            }
        }
        c cVar2 = (c) obj;
        if (cVar2 == null || (list = cVar2.f95430g) == null) {
            arrayList2 = z.INSTANCE;
        } else {
            ArrayList arrayList6 = new ArrayList(n.a((Iterable) list, 10));
            for (T t2 : list) {
                arrayList6.add(new c(t2.publishId, n.a((Object) t2)));
            }
            arrayList2 = arrayList6;
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj5 : a3) {
            c cVar3 = (c) obj5;
            if (!cVar3.f95425b && !cVar3.f95426c && cVar3.f95424a) {
                arrayList7.add(obj5);
            }
        }
        ArrayList arrayList8 = arrayList7;
        ArrayList arrayList9 = new ArrayList();
        for (Object obj6 : a3) {
            c cVar4 = (c) obj6;
            if (!cVar4.f95425b && !cVar4.f95426c && !cVar4.f95424a) {
                arrayList9.add(obj6);
            }
        }
        return new d(arrayList2, arrayList, arrayList8, arrayList9);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final boolean a(String str) {
        l.d(str, "");
        if (str.hashCode() == -235365105 && str.equals("publish")) {
            return true;
        }
        return false;
    }

    protected static List<List<c>> a(List<c> list) {
        c cVar;
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        for (T t : list) {
            if (!e.a(t.f95429f, (arrayList2 == null || (cVar = (c) n.h((List) arrayList2)) == null) ? null : cVar.f95429f)) {
                if (arrayList2 != null) {
                    arrayList.add(arrayList2);
                }
                arrayList2 = new ArrayList();
                arrayList2.add(t);
            } else if (arrayList2 != null) {
                arrayList2.add(t);
            }
        }
        if (arrayList2 != null) {
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    static final class e extends m implements h.f.a.m<c.a, c.a, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f95446a = new e();

        static {
            Covode.recordClassIndex(60457);
        }

        e() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ Boolean invoke(c.a aVar, c.a aVar2) {
            return Boolean.valueOf(a(aVar, aVar2));
        }

        public static boolean a(c.a aVar, c.a aVar2) {
            l.d(aVar, "");
            if (aVar2 == null) {
                return false;
            }
            if (l.a(aVar, aVar2)) {
                return true;
            }
            return l.a((Object) aVar.f95431a, (Object) aVar2.f95431a);
        }
    }

    public static final class a<T> implements Comparator {
        static {
            Covode.recordClassIndex(60442);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Long.valueOf(t.timeStamp), Long.valueOf(t2.timeStamp));
        }
    }

    public static final class f<T> implements Comparator {
        static {
            Covode.recordClassIndex(60458);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Long.valueOf(t.f95427d), Long.valueOf(t2.f95427d));
        }
    }

    private static List<c> a(List<c> list, List<c> list2) {
        if (list2.isEmpty() || list.isEmpty()) {
            return z.INSTANCE;
        }
        return a(list, ((c) n.g((List) list2)).f95427d, ((c) n.i((List) list)).f95428e, 2);
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final List<c> f95442a;

        /* renamed from: b  reason: collision with root package name */
        public final List<c> f95443b;

        /* renamed from: c  reason: collision with root package name */
        public final List<c> f95444c;

        /* renamed from: d  reason: collision with root package name */
        public final List<c> f95445d;

        static {
            Covode.recordClassIndex(60456);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return l.a(this.f95442a, dVar.f95442a) && l.a(this.f95443b, dVar.f95443b) && l.a(this.f95444c, dVar.f95444c) && l.a(this.f95445d, dVar.f95445d);
        }

        public final int hashCode() {
            List<c> list = this.f95442a;
            int i2 = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            List<c> list2 = this.f95443b;
            int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
            List<c> list3 = this.f95444c;
            int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
            List<c> list4 = this.f95445d;
            if (list4 != null) {
                i2 = list4.hashCode();
            }
            return hashCode3 + i2;
        }

        public final String toString() {
            return "Publishes(events=" + this.f95442a + ", checkFailed=" + this.f95443b + ", clickPublish=" + this.f95444c + ", unClickPublish=" + this.f95445d + ")";
        }

        public d(List<c> list, List<c> list2, List<c> list3, List<c> list4) {
            l.d(list, "");
            l.d(list2, "");
            l.d(list3, "");
            l.d(list4, "");
            this.f95442a = list;
            this.f95443b = list2;
            this.f95444c = list3;
            this.f95445d = list4;
        }
    }

    private static List<c> a(List<c> list, long j2, long j3, int i2) {
        Iterator<c> it = list.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().f95427d <= j2) {
                i3++;
            } else if (i3 != -1) {
                ListIterator<c> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    } else if (listIterator.previous().f95428e < j3) {
                        int nextIndex = listIterator.nextIndex();
                        if (nextIndex != -1) {
                            return list.subList(Math.max(0, i3 - 2), Math.min(list.size() - 1, nextIndex + 2) + 1);
                        }
                    }
                }
                return z.INSTANCE;
            }
        }
        return z.INSTANCE;
    }
}
