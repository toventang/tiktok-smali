package com.bytedance.assem.jedi_vm.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import f.a.aa;
import f.a.d.f;
import f.a.l.b;
import f.a.t;
import h.f.b.ab;
import h.f.b.l;
import h.k.d;
import h.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a<S> implements e<S> {

    /* renamed from: a  reason: collision with root package name */
    final b<S> f25732a;

    /* renamed from: b  reason: collision with root package name */
    final C0543a<S> f25733b = new C0543a<>();

    /* renamed from: c  reason: collision with root package name */
    private final f.a.b.a f25734c;

    /* renamed from: d  reason: collision with root package name */
    private final b<z> f25735d;

    /* renamed from: e  reason: collision with root package name */
    private final t<S> f25736e;

    static {
        Covode.recordClassIndex(15013);
    }

    @Override // com.bytedance.assem.jedi_vm.a.e
    public final t<S> a() {
        return this.f25736e;
    }

    @Override // com.bytedance.assem.jedi_vm.a.e
    public final S b() {
        S i2 = this.f25732a.i();
        if (i2 == null) {
            l.a();
        }
        return i2;
    }

    /* renamed from: com.bytedance.assem.jedi_vm.a.a$a  reason: collision with other inner class name */
    static final class C0543a<S> {

        /* renamed from: a  reason: collision with root package name */
        private final LinkedList<h.f.a.b<S, z>> f25738a = new LinkedList<>();

        /* renamed from: b  reason: collision with root package name */
        private LinkedList<h.f.a.b<S, S>> f25739b = new LinkedList<>();

        static {
            Covode.recordClassIndex(15016);
        }

        public final synchronized h.f.a.b<S, z> a() {
            MethodCollector.i(9335);
            if (this.f25738a.isEmpty()) {
                MethodCollector.o(9335);
                return null;
            }
            h.f.a.b<S, z> removeFirst = this.f25738a.removeFirst();
            MethodCollector.o(9335);
            return removeFirst;
        }

        public final synchronized List<h.f.a.b<S, S>> b() {
            MethodCollector.i(9337);
            if (this.f25739b.isEmpty()) {
                MethodCollector.o(9337);
                return null;
            }
            LinkedList<h.f.a.b<S, S>> linkedList = this.f25739b;
            this.f25739b = new LinkedList<>();
            MethodCollector.o(9337);
            return linkedList;
        }

        public final synchronized void a(h.f.a.b<? super S, z> bVar) {
            MethodCollector.i(8938);
            l.c(bVar, "");
            this.f25738a.add(bVar);
            MethodCollector.o(8938);
        }

        public final synchronized void b(h.f.a.b<? super S, ? extends S> bVar) {
            MethodCollector.i(9137);
            l.c(bVar, "");
            this.f25739b.add(bVar);
            MethodCollector.o(9137);
        }
    }

    @Override // com.bytedance.assem.jedi_vm.a.e
    public final void a(h.f.a.b<? super S, z> bVar) {
        l.c(bVar, "");
        this.f25733b.a(bVar);
        this.f25735d.onNext(z.f158842a);
    }

    @Override // com.bytedance.assem.jedi_vm.a.e
    public final void b(h.f.a.b<? super S, ? extends S> bVar) {
        l.c(bVar, "");
        this.f25733b.b(bVar);
        this.f25735d.onNext(z.f158842a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.l.b<S> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.jedi_vm.a.e
    public final void c(h.f.a.b<? super S, ? extends S> bVar) {
        l.c(bVar, "");
        this.f25732a.onNext(bVar.invoke(b()));
    }

    public a(S s, aa aaVar) {
        l.c(s, "");
        l.c(aaVar, "");
        b<S> a2 = b.a((Object) s);
        l.a((Object) a2, "");
        this.f25732a = a2;
        f.a.b.a aVar = new f.a.b.a();
        this.f25734c = aVar;
        b<z> bVar = new b<>();
        l.a((Object) bVar, "");
        this.f25735d = bVar;
        t<S> c2 = a2.c();
        l.a((Object) c2, "");
        this.f25736e = c2;
        f.a.b.b a3 = bVar.a(aaVar).a(new f<z>(this) {
            /* class com.bytedance.assem.jedi_vm.a.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f25737a;

            static {
                Covode.recordClassIndex(15014);
            }

            {
                this.f25737a = r1;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: f.a.l.b<S> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(z zVar) {
                a aVar = this.f25737a;
                while (true) {
                    h.f.a.b<S, z> a2 = aVar.f25733b.a();
                    List<h.f.a.b<S, S>> b2 = aVar.f25733b.b();
                    if (b2 != null) {
                        Object b3 = aVar.b();
                        Iterator<T> it = b2.iterator();
                        while (it.hasNext()) {
                            b3 = it.next().invoke(b3);
                        }
                        aVar.f25732a.onNext(b3);
                    }
                    if (a2 != null) {
                        a2.invoke((S) aVar.b());
                    } else {
                        return;
                    }
                }
            }
        }, new b(new h.f.a.b<Throwable, z>(this) {
            /* class com.bytedance.assem.jedi_vm.a.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(15015);
            }

            @Override // h.f.b.c, h.k.b
            public final String getName() {
                return "handleError";
            }

            @Override // h.f.b.c
            public final String getSignature() {
                return "handleError(Ljava/lang/Throwable;)V";
            }

            @Override // h.f.b.c
            public final d getOwner() {
                return ab.a(a.class);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Throwable th) {
                Throwable th2 = th;
                l.c(th2, "");
                while (true) {
                    if (th2 == null) {
                        break;
                    } else if (th2.getCause() != null) {
                        th2 = th2.getCause();
                    } else if (th2 != null) {
                        throw th2;
                    }
                }
                return z.f158842a;
            }
        }));
        l.a((Object) a3, "");
        aVar.a(a3);
    }
}
