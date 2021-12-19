package kotlinx.coroutines.flow.a;

import com.bytedance.covode.number.Covode;
import h.c.b.a.k;
import h.c.d;
import h.c.f;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import kotlinx.coroutines.a.e;
import kotlinx.coroutines.a.g;
import kotlinx.coroutines.a.h;
import kotlinx.coroutines.a.n;
import kotlinx.coroutines.a.o;
import kotlinx.coroutines.a.p;
import kotlinx.coroutines.a.q;
import kotlinx.coroutines.a.s;
import kotlinx.coroutines.a.u;
import kotlinx.coroutines.a.w;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.ao;
import kotlinx.coroutines.ar;

public abstract class a<T> {
    public final int capacity;
    public final f context;

    static {
        Covode.recordClassIndex(105630);
    }

    public String additionalToStringProps() {
        return "";
    }

    public Object collect(kotlinx.coroutines.flow.a<? super T> aVar, d<? super z> dVar) {
        return collect$suspendImpl(this, aVar, dVar);
    }

    /* access modifiers changed from: protected */
    public abstract Object collectTo(s<? super T> sVar, d<? super z> dVar);

    /* access modifiers changed from: protected */
    public abstract a<T> create(f fVar, int i2);

    private final int getProduceCapacity() {
        int i2 = this.capacity;
        if (i2 == -3) {
            return -2;
        }
        return i2;
    }

    public final m<s<? super T>, d<? super z>, Object> getCollectToFun$kotlinx_coroutines_core() {
        return new b(this, null);
    }

    public String toString() {
        return getClass().getSimpleName() + '[' + additionalToStringProps() + "context=" + this.context + ", capacity=" + this.capacity + ']';
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.flow.a.a$a  reason: collision with other inner class name */
    public static final class C4192a extends k implements m<am, d<? super z>, Object> {
        final /* synthetic */ kotlinx.coroutines.flow.a $collector;
        Object L$0;
        int label;
        private am p$;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(105631);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4192a(a aVar, kotlinx.coroutines.flow.a aVar2, d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
            this.$collector = aVar2;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            C4192a aVar = new C4192a(this.this$0, this.$collector, dVar);
            aVar.p$ = (am) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((C4192a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                am amVar = this.p$;
                kotlinx.coroutines.flow.a aVar = this.$collector;
                u<T> produceImpl = this.this$0.produceImpl(amVar);
                this.L$0 = amVar;
                this.label = 1;
                Object a2 = kotlinx.coroutines.flow.b.a(aVar, produceImpl, true, this);
                if (a2 != h.c.a.a.COROUTINE_SUSPENDED) {
                    a2 = z.f158842a;
                }
                if (a2 == obj2) {
                    return obj2;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends k implements m<s<? super T>, d<? super z>, Object> {
        Object L$0;
        int label;
        private s p$0;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(105632);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            b bVar = new b(this.this$0, dVar);
            bVar.p$0 = (s) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(Object obj, d<? super z> dVar) {
            return ((b) create(obj, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                s<? super T> sVar = this.p$0;
                a aVar2 = this.this$0;
                this.L$0 = sVar;
                this.label = 1;
                if (aVar2.collectTo(sVar, this) == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return z.f158842a;
        }
    }

    public u<T> produceImpl(am amVar) {
        h eVar;
        f fVar = this.context;
        int produceCapacity = getProduceCapacity();
        ao aoVar = ao.ATOMIC;
        m<s<? super T>, d<? super z>, Object> collectToFun$kotlinx_coroutines_core = getCollectToFun$kotlinx_coroutines_core();
        if (produceCapacity == -2) {
            eVar = new e(h.a.f158976a);
        } else if (produceCapacity == -1) {
            eVar = new o();
        } else if (produceCapacity == 0) {
            eVar = new w();
        } else if (produceCapacity != Integer.MAX_VALUE) {
            eVar = new e(produceCapacity);
        } else {
            eVar = new q();
        }
        kotlinx.coroutines.a.r rVar = new kotlinx.coroutines.a.r(ag.a(amVar, fVar), eVar);
        rVar.a(aoVar, rVar, collectToFun$kotlinx_coroutines_core);
        return rVar;
    }

    public a(f fVar, int i2) {
        this.context = fVar;
        this.capacity = i2;
    }

    public kotlinx.coroutines.a.f<T> broadcastImpl(am amVar, ao aoVar) {
        kotlinx.coroutines.a.f dVar;
        g gVar;
        f fVar = this.context;
        int produceCapacity = getProduceCapacity();
        m<s<? super T>, d<? super z>, Object> collectToFun$kotlinx_coroutines_core = getCollectToFun$kotlinx_coroutines_core();
        f a2 = ag.a(amVar, fVar);
        if (produceCapacity == -2) {
            dVar = new kotlinx.coroutines.a.d(h.a.f158976a);
        } else if (produceCapacity == -1) {
            dVar = new n();
        } else if (produceCapacity == 0) {
            throw new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
        } else if (produceCapacity != Integer.MAX_VALUE) {
            dVar = new kotlinx.coroutines.a.d(produceCapacity);
        } else {
            throw new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
        }
        if (aoVar.isLazy()) {
            gVar = new p(a2, dVar, collectToFun$kotlinx_coroutines_core);
        } else {
            gVar = new g(a2, dVar, true);
        }
        ((kotlinx.coroutines.a) gVar).a(aoVar, gVar, collectToFun$kotlinx_coroutines_core);
        return gVar;
    }

    public final a<T> update(f fVar, int i2) {
        f plus = fVar.plus(this.context);
        int i3 = this.capacity;
        if (i3 != -3) {
            if (i2 != -3) {
                if (i3 != -2) {
                    if (i2 != -2) {
                        if (i3 == -1 || i2 == -1) {
                            i2 = -1;
                        } else if (ar.f159021a && this.capacity < 0) {
                            throw new AssertionError();
                        } else if (!ar.f159021a || i2 >= 0) {
                            i2 += this.capacity;
                            if (i2 < 0) {
                                i2 = Integer.MAX_VALUE;
                            }
                        } else {
                            throw new AssertionError();
                        }
                    }
                }
            }
            i2 = i3;
        }
        if (!l.a(plus, this.context) || i2 != this.capacity) {
            return create(plus, i2);
        }
        return this;
    }

    static /* synthetic */ Object collect$suspendImpl(a aVar, kotlinx.coroutines.flow.a aVar2, d dVar) {
        Object a2 = an.a(new C4192a(aVar, aVar2, null), dVar);
        if (a2 == h.c.a.a.COROUTINE_SUSPENDED) {
            return a2;
        }
        return z.f158842a;
    }

    public static /* synthetic */ a update$default(a aVar, f fVar, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                fVar = h.c.g.INSTANCE;
            }
            if ((i3 & 2) != 0) {
                i2 = -3;
            }
            return aVar.update(fVar, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
    }
}
