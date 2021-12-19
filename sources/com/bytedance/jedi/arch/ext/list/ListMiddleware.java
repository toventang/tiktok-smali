package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.aj;
import com.bytedance.jedi.arch.ext.list.a.e;
import com.bytedance.jedi.arch.ext.list.n;
import com.bytedance.jedi.arch.ext.list.o;
import com.bytedance.jedi.arch.w;
import com.bytedance.jedi.arch.x;
import f.a.t;
import h.ab;
import h.z;
import java.util.Collection;
import java.util.List;

public final class ListMiddleware<S extends af, T, P extends o> extends x<S, ListState<T, P>> implements e.b {

    /* renamed from: e  reason: collision with root package name */
    private final h.h<e.AnonymousClass1> f39407e;

    /* renamed from: f  reason: collision with root package name */
    private final h.f.a.b<S, t<h.p<List<T>, P>>> f39408f;

    /* renamed from: g  reason: collision with root package name */
    private final h.f.a.b<S, t<h.p<List<T>, P>>> f39409g;

    /* renamed from: h  reason: collision with root package name */
    private final h.f.a.m<List<? extends T>, List<? extends T>, List<T>> f39410h;

    /* renamed from: i  reason: collision with root package name */
    private final h.f.a.m<List<? extends T>, List<? extends T>, List<T>> f39411i;

    static {
        Covode.recordClassIndex(24192);
    }

    static final class e extends h.f.b.m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ ListMiddleware this$0;

        static {
            Covode.recordClassIndex(24199);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ListMiddleware listMiddleware) {
            super(0);
            this.this$0 = listMiddleware;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new com.bytedance.jedi.arch.ext.list.a.a(this) {
                /* class com.bytedance.jedi.arch.ext.list.ListMiddleware.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f39412a;

                static {
                    Covode.recordClassIndex(24200);
                }

                @Override // com.bytedance.jedi.arch.ext.list.a.a
                public final void a() {
                    this.f39412a.this$0.loadMore();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f39412a = r1;
                }

                @Override // com.bytedance.jedi.arch.ext.list.a.a
                public final void a(h.f.a.b<? super Integer, z> bVar) {
                    h.f.b.l.c(bVar, "");
                    this.f39412a.this$0.a(new a(bVar));
                }

                /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$e$1$a */
                static final class a extends h.f.b.m implements h.f.a.b<ListState<T, P>, z> {
                    final /* synthetic */ h.f.a.b $itemCountSupplier;

                    static {
                        Covode.recordClassIndex(24201);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    a(h.f.a.b bVar) {
                        super(1);
                        this.$itemCountSupplier = bVar;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(Object obj) {
                        ListState listState = (ListState) obj;
                        h.f.b.l.c(listState, "");
                        if (listState.getHasMore().f39447a) {
                            this.$itemCountSupplier.invoke(Integer.valueOf(listState.getList().size()));
                        }
                        return z.f158842a;
                    }
                }
            };
        }
    }

    public final void loadMore() {
        h.f.a.b<S, t<h.p<List<T>, P>>> bVar = this.f39409g;
        if (bVar != null) {
            a(new a(this, bVar, this.f39411i));
        }
    }

    public final void refresh() {
        a(new b(this, this.f39408f, this.f39410h));
    }

    @Override // com.bytedance.jedi.arch.ext.list.a.e.b
    public final void a(int i2) {
        this.f39407e.getValue().a(i2);
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.b<RECEIVER, z> {
        final /* synthetic */ c $listener;

        static {
            Covode.recordClassIndex(24208);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar) {
            super(1);
            this.$listener = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            h.f.b.l.c(obj, "");
            this.$listener.a().invoke(obj);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n extends h.f.b.m implements h.f.a.b<RECEIVER, z> {
        final /* synthetic */ c $listener;

        static {
            Covode.recordClassIndex(24211);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(c cVar) {
            super(1);
            this.$listener = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            h.f.b.l.c(obj, "");
            this.$listener.a().invoke(obj);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p extends h.f.b.m implements h.f.a.b<ListState<T, P>, ListState<T, P>> {
        final /* synthetic */ List $newList;
        final /* synthetic */ ListMiddleware this$0;

        static {
            Covode.recordClassIndex(24213);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(ListMiddleware listMiddleware, List list) {
            super(1);
            this.this$0 = listMiddleware;
            this.$newList = list;
        }

        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(Object obj) {
            ListState listState = (ListState) obj;
            h.f.b.l.c(listState, "");
            List list = this.$newList;
            return ListState.copy$default(listState, null, list, null, null, ListMiddleware.a(listState, list), 13, null);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<ListState<T, P>, z> {
        final /* synthetic */ Object $data;
        final /* synthetic */ int $position;
        final /* synthetic */ ListMiddleware this$0;

        static {
            Covode.recordClassIndex(24197);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ListMiddleware listMiddleware, int i2, Object obj) {
            super(1);
            this.this$0 = listMiddleware;
            this.$position = i2;
            this.$data = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            boolean z;
            ListState listState = (ListState) obj;
            h.f.b.l.c(listState, "");
            int i2 = this.$position;
            if (i2 < 0 || i2 >= listState.getList().size()) {
                z = false;
            } else {
                z = true;
            }
            if (!ab.f158655a || z) {
                List<? extends T> g2 = h.a.n.g((Collection) listState.getList());
                g2.add(this.$position, this.$data);
                this.this$0.a(g2);
                return z.f158842a;
            }
            throw new AssertionError("Assertion failed");
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.b<ListState<T, P>, z> {
        final /* synthetic */ List $data;
        final /* synthetic */ int $position;
        final /* synthetic */ ListMiddleware this$0;

        static {
            Covode.recordClassIndex(24198);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ListMiddleware listMiddleware, int i2, List list) {
            super(1);
            this.this$0 = listMiddleware;
            this.$position = i2;
            this.$data = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            boolean z;
            ListState listState = (ListState) obj;
            h.f.b.l.c(listState, "");
            int i2 = this.$position;
            if (i2 < 0 || i2 >= listState.getList().size()) {
                z = false;
            } else {
                z = true;
            }
            if (!ab.f158655a || z) {
                List<? extends T> g2 = h.a.n.g((Collection) listState.getList());
                g2.addAll(this.$position, this.$data);
                this.this$0.a(g2);
                return z.f158842a;
            }
            throw new AssertionError("Assertion failed");
        }
    }

    public final void a(List<? extends T> list) {
        h.f.b.l.c(list, "");
        b(new p(this, list));
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.f.b.m implements h.f.a.m<RECEIVER, P, z> {
        final /* synthetic */ h.f.a.m $onPayload;

        static {
            Covode.recordClassIndex(24204);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(h.f.a.m mVar) {
            super(2);
            this.$onPayload = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, Object obj2) {
            h.f.b.l.c(obj, "");
            h.f.b.l.c(obj2, "");
            this.$onPayload.invoke(obj, obj2);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.m<RECEIVER, List<? extends T>, z> {
        final /* synthetic */ boolean $force$inlined;
        final /* synthetic */ h.f.a.b $onSubmitFinish$inlined;
        final /* synthetic */ a $realAdapter;
        final /* synthetic */ com.bytedance.jedi.arch.h $subscriber$inlined;
        final /* synthetic */ boolean $uniqueOnly$inlined;
        final /* synthetic */ ListMiddleware this$0;

        static {
            Covode.recordClassIndex(24202);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar, ListMiddleware listMiddleware, com.bytedance.jedi.arch.h hVar, boolean z, boolean z2, h.f.a.b bVar) {
            super(2);
            this.$realAdapter = aVar;
            this.this$0 = listMiddleware;
            this.$subscriber$inlined = hVar;
            this.$uniqueOnly$inlined = z;
            this.$force$inlined = z2;
            this.$onSubmitFinish$inlined = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, Object obj2) {
            AnonymousClass1 r0;
            final com.bytedance.jedi.arch.g gVar = (com.bytedance.jedi.arch.g) obj;
            List<? extends T> list = (List) obj2;
            h.f.b.l.c(gVar, "");
            h.f.b.l.c(list, "");
            a aVar = this.$realAdapter;
            final h.f.a.b bVar = this.$onSubmitFinish$inlined;
            if (bVar != null) {
                r0 = new h.f.a.a<z>() {
                    /* class com.bytedance.jedi.arch.ext.list.ListMiddleware.f.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(24203);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* bridge */ /* synthetic */ z invoke() {
                        bVar.invoke(gVar);
                        return z.f158842a;
                    }
                };
            } else {
                r0 = null;
            }
            aVar.a(list, r0);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.m<RECEIVER, b, z> {
        final /* synthetic */ h.f.a.m $hasMore;

        static {
            Covode.recordClassIndex(24205);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(h.f.a.m mVar) {
            super(2);
            this.$hasMore = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, b bVar) {
            b bVar2 = bVar;
            h.f.b.l.c(obj, "");
            h.f.b.l.c(bVar2, "");
            this.$hasMore.invoke(obj, Boolean.valueOf(bVar2.f39447a));
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.f.b.m implements h.f.a.m<RECEIVER, b, z> {
        final /* synthetic */ h.f.a.m $empty;

        static {
            Covode.recordClassIndex(24206);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(h.f.a.m mVar) {
            super(2);
            this.$empty = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, b bVar) {
            b bVar2 = bVar;
            h.f.b.l.c(obj, "");
            h.f.b.l.c(bVar2, "");
            this.$empty.invoke(obj, Boolean.valueOf(bVar2.f39447a));
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.f.b.m implements h.f.a.m<RECEIVER, Throwable, z> {
        final /* synthetic */ c $listener;

        static {
            Covode.recordClassIndex(24207);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar) {
            super(2);
            this.$listener = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, Throwable th) {
            h.f.b.l.c(obj, "");
            h.f.b.l.c(th, "");
            this.$listener.b().invoke(obj, th);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.f.b.m implements h.f.a.m<RECEIVER, List<? extends T>, z> {
        final /* synthetic */ c $listener;

        static {
            Covode.recordClassIndex(24209);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(c cVar) {
            super(2);
            this.$listener = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, Object obj2) {
            h.f.b.l.c(obj, "");
            h.f.b.l.c(obj2, "");
            this.$listener.c().invoke(obj, obj2);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m extends h.f.b.m implements h.f.a.m<RECEIVER, Throwable, z> {
        final /* synthetic */ c $listener;

        static {
            Covode.recordClassIndex(24210);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(c cVar) {
            super(2);
            this.$listener = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, Throwable th) {
            h.f.b.l.c(obj, "");
            h.f.b.l.c(th, "");
            this.$listener.b().invoke(obj, th);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.f.b.m implements h.f.a.m<RECEIVER, List<? extends T>, z> {
        final /* synthetic */ c $listener;

        static {
            Covode.recordClassIndex(24212);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(c cVar) {
            super(2);
            this.$listener = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, Object obj2) {
            h.f.b.l.c(obj, "");
            h.f.b.l.c(obj2, "");
            this.$listener.c().invoke(obj, obj2);
            return z.f158842a;
        }
    }

    public static b a(ListState<T, P> listState, List<? extends T> list) {
        boolean isEmpty = list.isEmpty();
        if (isEmpty == listState.isEmpty().f39447a) {
            return listState.isEmpty();
        }
        return new b(isEmpty);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends h.f.b.m implements h.f.a.m<S, ListState<T, P>, z> {
        final /* synthetic */ h.f.a.b $actualLoadMore;
        final /* synthetic */ h.f.a.m $loadMoreStrategy;
        final /* synthetic */ ListMiddleware this$0;

        static {
            Covode.recordClassIndex(24193);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ListMiddleware listMiddleware, h.f.a.b bVar, h.f.a.m mVar) {
            super(2);
            this.this$0 = listMiddleware;
            this.$actualLoadMore = bVar;
            this.$loadMoreStrategy = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, Object obj2) {
            ListState listState = (ListState) obj2;
            h.f.b.l.c(obj, "");
            h.f.b.l.c(listState, "");
            if (listState.getHasMore().f39447a && !(listState.getLoadMore() instanceof w)) {
                this.this$0.a((t) this.$actualLoadMore.invoke(obj), new h.f.a.m<ListState<T, P>, com.bytedance.jedi.arch.a<? extends h.p<? extends List<? extends T>, ? extends P>>, ListState<T, P>>(this) {
                    /* class com.bytedance.jedi.arch.ext.list.ListMiddleware.a.AnonymousClass1 */
                    final /* synthetic */ a this$0;

                    static {
                        Covode.recordClassIndex(24194);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.f.a.m
                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                        ListState copy$default;
                        ListState listState = (ListState) obj;
                        com.bytedance.jedi.arch.a aVar = (com.bytedance.jedi.arch.a) obj2;
                        h.f.b.l.c(listState, "");
                        h.f.b.l.c(aVar, "");
                        h.p pVar = (h.p) aVar.a();
                        if (pVar != null) {
                            List list = (List) pVar.component1();
                            o oVar = (o) pVar.component2();
                            this.this$0.this$0.a(list.size(), (Throwable) null);
                            List list2 = (List) this.this$0.$loadMoreStrategy.invoke(listState.getList(), list);
                            b a2 = ListMiddleware.a(listState, list2);
                            if (oVar != null && (copy$default = ListState.copy$default(listState, oVar, list2, null, new aj(list), a2, 4, null)) != null) {
                                return copy$default;
                            }
                            ListState copy$default2 = ListState.copy$default(listState, null, list2, null, new aj(list), a2, 5, null);
                            if (copy$default2 != null) {
                                return copy$default2;
                            }
                        }
                        if (!(aVar instanceof com.bytedance.jedi.arch.f)) {
                            return ListState.copy$default(listState, null, null, null, new w(), null, 23, null);
                        }
                        com.bytedance.jedi.arch.f fVar = (com.bytedance.jedi.arch.f) aVar;
                        this.this$0.this$0.a(0, fVar.f39461a);
                        return ListState.copy$default(listState, null, null, null, new com.bytedance.jedi.arch.f(fVar.f39461a), null, 23, null);
                    }
                });
            }
            return z.f158842a;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.m<S, ListState<T, P>, z> {
        final /* synthetic */ h.f.a.b $actualRefresh;
        final /* synthetic */ h.f.a.m $refreshStrategy;
        final /* synthetic */ ListMiddleware this$0;

        static {
            Covode.recordClassIndex(24195);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ListMiddleware listMiddleware, h.f.a.b bVar, h.f.a.m mVar) {
            super(2);
            this.this$0 = listMiddleware;
            this.$actualRefresh = bVar;
            this.$refreshStrategy = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, Object obj2) {
            ListState listState = (ListState) obj2;
            h.f.b.l.c(obj, "");
            h.f.b.l.c(listState, "");
            if (!(listState.getRefresh() instanceof w)) {
                this.this$0.a((t) this.$actualRefresh.invoke(obj), new h.f.a.m<ListState<T, P>, com.bytedance.jedi.arch.a<? extends h.p<? extends List<? extends T>, ? extends P>>, ListState<T, P>>(this) {
                    /* class com.bytedance.jedi.arch.ext.list.ListMiddleware.b.AnonymousClass1 */
                    final /* synthetic */ b this$0;

                    static {
                        Covode.recordClassIndex(24196);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.f.a.m
                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                        ListState copy$default;
                        ListState listState = (ListState) obj;
                        com.bytedance.jedi.arch.a aVar = (com.bytedance.jedi.arch.a) obj2;
                        h.f.b.l.c(listState, "");
                        h.f.b.l.c(aVar, "");
                        h.p pVar = (h.p) aVar.a();
                        if (pVar != null) {
                            Object component1 = pVar.component1();
                            o oVar = (o) pVar.component2();
                            List list = (List) this.this$0.$refreshStrategy.invoke(listState.getList(), component1);
                            b a2 = ListMiddleware.a(listState, list);
                            if (oVar != null && (copy$default = ListState.copy$default(listState, oVar, list, new aj(component1), null, a2, 8, null)) != null) {
                                return copy$default;
                            }
                            ListState copy$default2 = ListState.copy$default(listState, null, list, new aj(component1), null, a2, 9, null);
                            if (copy$default2 != null) {
                                return copy$default2;
                            }
                        }
                        if (aVar instanceof com.bytedance.jedi.arch.f) {
                            return ListState.copy$default(listState, null, null, new com.bytedance.jedi.arch.f(((com.bytedance.jedi.arch.f) aVar).f39461a), null, null, 27, null);
                        }
                        return ListState.copy$default(listState, null, null, new w(), null, null, 27, null);
                    }
                });
            }
            return z.f158842a;
        }
    }

    public final void a(int i2, T t) {
        a(new c(this, i2, t));
    }

    public final void a(int i2, Throwable th) {
        h.h<e.AnonymousClass1> hVar = this.f39407e;
        if (hVar.isInitialized()) {
            hVar.getValue().a(i2, th);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super S extends com.bytedance.jedi.arch.af, ? extends f.a.t<h.p<java.util.List<T>, P extends com.bytedance.jedi.arch.ext.list.o>>> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super S extends com.bytedance.jedi.arch.af, ? extends f.a.t<h.p<java.util.List<T>, P extends com.bytedance.jedi.arch.ext.list.o>>> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.m<? super java.util.List<? extends T>, ? super java.util.List<? extends T>, ? extends java.util.List<? extends T>> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.m<? super java.util.List<? extends T>, ? super java.util.List<? extends T>, ? extends java.util.List<? extends T>> */
    /* JADX WARN: Multi-variable type inference failed */
    public ListMiddleware(h.f.a.b<? super S, ? extends t<h.p<List<T>, P>>> bVar, h.f.a.b<? super S, ? extends t<h.p<List<T>, P>>> bVar2, h.f.a.m<? super List<? extends T>, ? super List<? extends T>, ? extends List<? extends T>> mVar, h.f.a.m<? super List<? extends T>, ? super List<? extends T>, ? extends List<? extends T>> mVar2) {
        h.f.b.l.c(bVar, "");
        h.f.b.l.c(mVar, "");
        h.f.b.l.c(mVar2, "");
        this.f39408f = bVar;
        this.f39409g = bVar2;
        this.f39410h = mVar;
        this.f39411i = mVar2;
        this.f39407e = h.i.a((h.f.a.a) new e(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListMiddleware(h.f.a.b bVar, h.f.a.b bVar2, h.f.a.m mVar, h.f.a.m mVar2, int i2) {
        this(bVar, (i2 & 2) != 0 ? null : bVar2, (i2 & 4) != 0 ? n.b.f39458a : mVar, (i2 & 8) != 0 ? n.a.f39457a : mVar2);
    }

    public static /* synthetic */ void a(ListMiddleware listMiddleware, com.bytedance.jedi.arch.h hVar, a aVar, boolean z, c cVar, c cVar2, h.f.a.m mVar, h.f.a.m mVar2, int i2) {
        h.f.a.m mVar3 = mVar;
        a aVar2 = aVar;
        boolean z2 = z;
        c cVar3 = cVar;
        c cVar4 = cVar2;
        h.f.a.m mVar4 = null;
        if ((i2 & 2) != 0) {
            aVar2 = null;
        }
        if ((i2 & 8) != 0) {
            z2 = hVar.getUniqueOnlyGlobal();
        }
        if ((i2 & 16) != 0) {
            cVar3 = null;
        }
        if ((i2 & 32) != 0) {
            cVar4 = null;
        }
        if ((i2 & 64) != 0) {
            mVar3 = null;
        }
        if ((i2 & 128) == 0) {
            mVar4 = mVar2;
        }
        listMiddleware.subscribe(hVar, aVar2, false, z2, cVar3, cVar4, mVar3, mVar4, null, null);
    }

    public final <RECEIVER extends com.bytedance.jedi.arch.g> void subscribe(com.bytedance.jedi.arch.h<? extends RECEIVER> hVar, a<T> aVar, boolean z, boolean z2, c<T, RECEIVER> cVar, c<T, RECEIVER> cVar2, h.f.a.m<? super RECEIVER, ? super Boolean, z> mVar, h.f.a.m<? super RECEIVER, ? super Boolean, z> mVar2, h.f.a.b<? super RECEIVER, z> bVar, h.f.a.m<? super RECEIVER, ? super P, z> mVar3) {
        h.f.b.l.c(hVar, "");
        if (mVar3 != null) {
            a(hVar, d.f39448a, z2, z, new g(mVar3));
        }
        if (mVar != null) {
            a(hVar, e.f39449a, z2, z, new h(mVar));
        }
        if (mVar2 != null) {
            a(hVar, f.f39450a, z2, z, new i(mVar2));
        }
        if (cVar != null) {
            a(hVar, g.f39451a, z2, z, new j(cVar), new k(cVar), new l(cVar));
        }
        if (cVar2 != null) {
            a(hVar, h.f39452a, z2, z, new m(cVar2), new n(cVar2), new o(cVar2));
        }
        if (aVar != null) {
            a(hVar, i.f39453a, z2, z, new f(aVar, this, hVar, z2, z, bVar));
        }
    }
}
