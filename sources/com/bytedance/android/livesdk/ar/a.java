package com.bytedance.android.livesdk.ar;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class a<STATE, EVENT, SIDE_EFFECT> {

    /* renamed from: b  reason: collision with root package name */
    public static final C0298a f14029b = new C0298a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final b<STATE, EVENT, SIDE_EFFECT> f14030a;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<STATE> f14031c;

    public static final class d<T, R extends T> {

        /* renamed from: b  reason: collision with root package name */
        public static final C0303a f14045b = new C0303a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public final Class<R> f14046a;

        /* renamed from: c  reason: collision with root package name */
        private final List<h.f.a.b<T, Boolean>> f14047c;

        static {
            Covode.recordClassIndex(7788);
        }

        /* renamed from: com.bytedance.android.livesdk.ar.a$d$a  reason: collision with other inner class name */
        public static final class C0303a {
            static {
                Covode.recordClassIndex(7789);
            }

            private C0303a() {
            }

            public /* synthetic */ C0303a(byte b2) {
                this();
            }

            public static <T, R extends T> d<T, R> a(Class<R> cls) {
                l.d(cls, "");
                return new d<>(cls, (byte) 0);
            }
        }

        static final class b extends m implements h.f.a.b<T, Boolean> {
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(7790);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.b
            public final /* synthetic */ Boolean invoke(Object obj) {
                l.d(obj, "");
                return Boolean.valueOf(this.this$0.f14046a.isInstance(obj));
            }
        }

        private d(Class<R> cls) {
            this.f14046a = cls;
            this.f14047c = n.c(new b(this));
        }

        public final boolean a(T t) {
            l.d(t, "");
            List<h.f.a.b<T, Boolean>> list = this.f14047c;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next().invoke(t)).booleanValue()) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ d(Class cls, byte b2) {
            this(cls);
        }
    }

    static {
        Covode.recordClassIndex(7780);
    }

    /* renamed from: com.bytedance.android.livesdk.ar.a$a  reason: collision with other inner class name */
    public static final class C0298a {
        static {
            Covode.recordClassIndex(7781);
        }

        private C0298a() {
        }

        public /* synthetic */ C0298a(byte b2) {
            this();
        }
    }

    public static abstract class e<STATE, EVENT, SIDE_EFFECT> {
        static {
            Covode.recordClassIndex(7791);
        }

        private e() {
        }

        /* renamed from: com.bytedance.android.livesdk.ar.a$e$a  reason: collision with other inner class name */
        public static final class C0304a<STATE, EVENT, SIDE_EFFECT> extends e<STATE, EVENT, SIDE_EFFECT> {

            /* renamed from: a  reason: collision with root package name */
            private final STATE f14048a;

            /* renamed from: b  reason: collision with root package name */
            private final EVENT f14049b;

            static {
                Covode.recordClassIndex(7792);
            }

            public final int hashCode() {
                int i2;
                STATE state = this.f14048a;
                int i3 = 0;
                if (state != null) {
                    i2 = state.hashCode();
                } else {
                    i2 = 0;
                }
                int i4 = i2 * 31;
                EVENT event = this.f14049b;
                if (event != null) {
                    i3 = event.hashCode();
                }
                return i4 + i3;
            }

            public final String toString() {
                return "Invalid(fromState=" + ((Object) this.f14048a) + ", event=" + ((Object) this.f14049b) + ")";
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0304a)) {
                    return false;
                }
                C0304a aVar = (C0304a) obj;
                if (!l.a((Object) this.f14048a, (Object) aVar.f14048a) || !l.a((Object) this.f14049b, (Object) aVar.f14049b)) {
                    return false;
                }
                return true;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0304a(STATE state, EVENT event) {
                super((byte) 0);
                l.d(state, "");
                l.d(event, "");
                this.f14048a = state;
                this.f14049b = event;
            }
        }

        public static final class b<STATE, EVENT, SIDE_EFFECT> extends e<STATE, EVENT, SIDE_EFFECT> {

            /* renamed from: a  reason: collision with root package name */
            final STATE f14050a;

            /* renamed from: b  reason: collision with root package name */
            public final STATE f14051b;

            /* renamed from: c  reason: collision with root package name */
            public final SIDE_EFFECT f14052c;

            /* renamed from: d  reason: collision with root package name */
            private final EVENT f14053d;

            static {
                Covode.recordClassIndex(7793);
            }

            public final int hashCode() {
                int i2;
                int i3;
                int i4;
                STATE state = this.f14050a;
                int i5 = 0;
                if (state != null) {
                    i2 = state.hashCode();
                } else {
                    i2 = 0;
                }
                int i6 = i2 * 31;
                EVENT event = this.f14053d;
                if (event != null) {
                    i3 = event.hashCode();
                } else {
                    i3 = 0;
                }
                int i7 = (i6 + i3) * 31;
                STATE state2 = this.f14051b;
                if (state2 != null) {
                    i4 = state2.hashCode();
                } else {
                    i4 = 0;
                }
                int i8 = (i7 + i4) * 31;
                SIDE_EFFECT side_effect = this.f14052c;
                if (side_effect != null) {
                    i5 = side_effect.hashCode();
                }
                return i8 + i5;
            }

            public final String toString() {
                return "Valid(fromState=" + ((Object) this.f14050a) + ", event=" + ((Object) this.f14053d) + ", toState=" + ((Object) this.f14051b) + ", sideEffect=" + ((Object) this.f14052c) + ")";
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                if (!l.a((Object) this.f14050a, (Object) bVar.f14050a) || !l.a((Object) this.f14053d, (Object) bVar.f14053d) || !l.a((Object) this.f14051b, (Object) bVar.f14051b) || !l.a((Object) this.f14052c, (Object) bVar.f14052c)) {
                    return false;
                }
                return true;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(STATE state, EVENT event, STATE state2, SIDE_EFFECT side_effect) {
                super((byte) 0);
                l.d(state, "");
                l.d(event, "");
                l.d(state2, "");
                this.f14050a = state;
                this.f14053d = event;
                this.f14051b = state2;
                this.f14052c = side_effect;
            }
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    public static final class c<STATE, EVENT, SIDE_EFFECT> {

        /* renamed from: a  reason: collision with root package name */
        public STATE f14040a = null;

        /* renamed from: b  reason: collision with root package name */
        public final LinkedHashMap<d<STATE, STATE>, b.C0299a<STATE, EVENT, SIDE_EFFECT>> f14041b = new LinkedHashMap<>(ag.a());

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<h.f.a.b<e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, z>> f14042c = new ArrayList<>(h.a.z.INSTANCE);

        static {
            Covode.recordClassIndex(7785);
        }

        /* JADX WARN: Unknown type variable: STATE in type: com.bytedance.android.livesdk.ar.a$b$a<STATE, EVENT, SIDE_EFFECT> */
        /* JADX WARN: Unknown type variable: EVENT in type: com.bytedance.android.livesdk.ar.a$b$a<STATE, EVENT, SIDE_EFFECT> */
        /* JADX WARN: Unknown type variable: SIDE_EFFECT in type: com.bytedance.android.livesdk.ar.a$b$a<STATE, EVENT, SIDE_EFFECT> */
        /* renamed from: com.bytedance.android.livesdk.ar.a$c$a  reason: collision with other inner class name */
        public final class C0301a<S extends STATE> {

            /* renamed from: a  reason: collision with root package name */
            public final b.C0299a<STATE, EVENT, SIDE_EFFECT> f14043a = new b.C0299a<>();

            static {
                Covode.recordClassIndex(7786);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            public C0301a() {
            }

            /* renamed from: com.bytedance.android.livesdk.ar.a$c$a$a  reason: collision with other inner class name */
            static final class C0302a extends m implements h.f.a.m<STATE, EVENT, b.C0299a.C0300a<? extends STATE, ? extends SIDE_EFFECT>> {
                final /* synthetic */ h.f.a.m $createTransitionTo;

                static {
                    Covode.recordClassIndex(7787);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0302a(h.f.a.m mVar) {
                    super(2);
                    this.$createTransitionTo = mVar;
                }

                @Override // h.f.a.m
                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    l.d(obj, "");
                    l.d(obj2, "");
                    return this.$createTransitionTo.invoke(obj, obj2);
                }
            }

            public final <E extends EVENT> void a(d<EVENT, ? extends E> dVar, h.f.a.m<? super S, ? super E, ? extends b.C0299a.C0300a<? extends STATE, ? extends SIDE_EFFECT>> mVar) {
                l.d(dVar, "");
                l.d(mVar, "");
                this.f14043a.f14037c.put(dVar, new C0302a(mVar));
            }

            public static b.C0299a.C0300a<STATE, SIDE_EFFECT> a(S s, STATE state, SIDE_EFFECT side_effect) {
                l.d(s, "");
                l.d(state, "");
                return new b.C0299a.C0300a<>(state, side_effect);
            }
        }

        public final <S extends STATE> void a(d<STATE, ? extends S> dVar, h.f.a.b<? super c<STATE, EVENT, SIDE_EFFECT>.C0301a, z> bVar) {
            l.d(dVar, "");
            l.d(bVar, "");
            LinkedHashMap<d<STATE, STATE>, b.C0299a<STATE, EVENT, SIDE_EFFECT>> linkedHashMap = this.f14041b;
            C0301a aVar = new C0301a();
            bVar.invoke(aVar);
            linkedHashMap.put(dVar, aVar.f14043a);
        }
    }

    private a(b<STATE, EVENT, SIDE_EFFECT> bVar) {
        this.f14030a = bVar;
        this.f14031c = new AtomicReference<>(bVar.f14032a);
    }

    private final b.C0299a<STATE, EVENT, SIDE_EFFECT> b(STATE state) {
        Map<d<STATE, STATE>, b.C0299a<STATE, EVENT, SIDE_EFFECT>> map = this.f14030a.f14033b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<d<STATE, STATE>, b.C0299a<STATE, EVENT, SIDE_EFFECT>> entry : map.entrySet()) {
            if (entry.getKey().a(state)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(entry2.getValue());
        }
        b.C0299a<STATE, EVENT, SIDE_EFFECT> aVar = (b.C0299a) n.h((List) arrayList);
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Missing definition for state " + state.getClass().getSimpleName() + '!').toString());
    }

    public final e<STATE, EVENT, SIDE_EFFECT> a(EVENT event) {
        e<STATE, EVENT, SIDE_EFFECT> aVar;
        MethodCollector.i(10388);
        l.d(event, "");
        synchronized (this) {
            try {
                STATE state = this.f14031c.get();
                l.b(state, "");
                Iterator<Map.Entry<d<EVENT, EVENT>, h.f.a.m<STATE, EVENT, b.C0299a.C0300a<STATE, SIDE_EFFECT>>>> it = b(state).f14037c.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        aVar = new e.C0304a<>(state, event);
                        break;
                    }
                    Map.Entry<d<EVENT, EVENT>, h.f.a.m<STATE, EVENT, b.C0299a.C0300a<STATE, SIDE_EFFECT>>> next = it.next();
                    h.f.a.m<STATE, EVENT, b.C0299a.C0300a<STATE, SIDE_EFFECT>> value = next.getValue();
                    if (next.getKey().a(event)) {
                        b.C0299a.C0300a<STATE, SIDE_EFFECT> invoke = value.invoke(state, event);
                        aVar = new e.b<>(state, event, invoke.f14038a, invoke.f14039b);
                        break;
                    }
                }
                if (aVar instanceof e.b) {
                    this.f14031c.set(((e.b) aVar).f14051b);
                }
            } finally {
                MethodCollector.o(10388);
            }
        }
        Iterator<T> it2 = this.f14030a.f14034c.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(aVar);
        }
        if (aVar instanceof e.b) {
            e.b bVar = (e.b) aVar;
            STATE state2 = bVar.f14050a;
            Iterator<T> it3 = b(state2).f14036b.iterator();
            while (it3.hasNext()) {
                it3.next().invoke(state2, event);
            }
            STATE state3 = bVar.f14051b;
            Iterator<T> it4 = b(state3).f14035a.iterator();
            while (it4.hasNext()) {
                it4.next().invoke(state3, event);
            }
        }
        return aVar;
    }

    public /* synthetic */ a(b bVar, byte b2) {
        this(bVar);
    }

    public static final class b<STATE, EVENT, SIDE_EFFECT> {

        /* renamed from: a  reason: collision with root package name */
        public final STATE f14032a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<d<STATE, STATE>, C0299a<STATE, EVENT, SIDE_EFFECT>> f14033b;

        /* renamed from: c  reason: collision with root package name */
        public final List<h.f.a.b<e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, z>> f14034c;

        static {
            Covode.recordClassIndex(7782);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l.a(this.f14032a, bVar.f14032a) && l.a(this.f14033b, bVar.f14033b) && l.a(this.f14034c, bVar.f14034c);
        }

        public final int hashCode() {
            STATE state = this.f14032a;
            int i2 = 0;
            int hashCode = (state != null ? state.hashCode() : 0) * 31;
            Map<d<STATE, STATE>, C0299a<STATE, EVENT, SIDE_EFFECT>> map = this.f14033b;
            int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
            List<h.f.a.b<e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, z>> list = this.f14034c;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode2 + i2;
        }

        public final String toString() {
            return "Graph(initialState=" + ((Object) this.f14032a) + ", stateDefinitions=" + this.f14033b + ", onTransitionListeners=" + this.f14034c + ")";
        }

        /* renamed from: com.bytedance.android.livesdk.ar.a$b$a  reason: collision with other inner class name */
        public static final class C0299a<STATE, EVENT, SIDE_EFFECT> {

            /* renamed from: a  reason: collision with root package name */
            public final List<h.f.a.m<STATE, EVENT, z>> f14035a = new ArrayList();

            /* renamed from: b  reason: collision with root package name */
            public final List<h.f.a.m<STATE, EVENT, z>> f14036b = new ArrayList();

            /* renamed from: c  reason: collision with root package name */
            public final LinkedHashMap<d<EVENT, EVENT>, h.f.a.m<STATE, EVENT, C0300a<STATE, SIDE_EFFECT>>> f14037c = new LinkedHashMap<>();

            static {
                Covode.recordClassIndex(7783);
            }

            /* renamed from: com.bytedance.android.livesdk.ar.a$b$a$a  reason: collision with other inner class name */
            public static final class C0300a<STATE, SIDE_EFFECT> {

                /* renamed from: a  reason: collision with root package name */
                public final STATE f14038a;

                /* renamed from: b  reason: collision with root package name */
                public final SIDE_EFFECT f14039b;

                static {
                    Covode.recordClassIndex(7784);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0300a)) {
                        return false;
                    }
                    C0300a aVar = (C0300a) obj;
                    return l.a(this.f14038a, aVar.f14038a) && l.a(this.f14039b, aVar.f14039b);
                }

                public final int hashCode() {
                    STATE state = this.f14038a;
                    int i2 = 0;
                    int hashCode = (state != null ? state.hashCode() : 0) * 31;
                    SIDE_EFFECT side_effect = this.f14039b;
                    if (side_effect != null) {
                        i2 = side_effect.hashCode();
                    }
                    return hashCode + i2;
                }

                public final String toString() {
                    return "TransitionTo(toState=" + ((Object) this.f14038a) + ", sideEffect=" + ((Object) this.f14039b) + ")";
                }

                public C0300a(STATE state, SIDE_EFFECT side_effect) {
                    l.d(state, "");
                    this.f14038a = state;
                    this.f14039b = side_effect;
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends h.f.a.b<? super com.bytedance.android.livesdk.ar.a$e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, h.z>> */
        /* JADX WARN: Multi-variable type inference failed */
        public b(STATE state, Map<d<STATE, STATE>, C0299a<STATE, EVENT, SIDE_EFFECT>> map, List<? extends h.f.a.b<? super e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, z>> list) {
            l.d(state, "");
            l.d(map, "");
            l.d(list, "");
            this.f14032a = state;
            this.f14033b = map;
            this.f14034c = list;
        }
    }
}
