package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.NestedState;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.aj;
import com.bytedance.jedi.arch.ext.list.IListState;
import com.bytedance.jedi.arch.ext.list.a.e;
import com.bytedance.jedi.arch.ext.list.j;
import com.bytedance.jedi.arch.ext.list.n;
import com.bytedance.jedi.arch.ext.list.o;
import com.bytedance.jedi.arch.h;
import com.bytedance.jedi.arch.w;
import f.a.t;
import h.f.a.m;
import h.f.b.l;
import h.h;
import h.i;
import h.p;
import h.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class ListViewModel<T, P extends o, S extends IListState<T, P>> extends JediViewModel<S> implements e.b {

    /* renamed from: a  reason: collision with root package name */
    private final h.f.a.b<S, t<p<List<T>, P>>> f39413a;

    /* renamed from: b  reason: collision with root package name */
    private final m<List<? extends T>, List<? extends T>, List<T>> f39414b = n.b.f39458a;

    /* renamed from: c  reason: collision with root package name */
    private final m<List<? extends T>, List<? extends T>, List<T>> f39415c = n.a.f39457a;

    /* renamed from: d  reason: collision with root package name */
    private final h<d.AnonymousClass1> f39416d = i.a((h.f.a.a) new d(this));

    static {
        Covode.recordClassIndex(24215);
    }

    /* access modifiers changed from: protected */
    public abstract h.f.a.b<S, t<p<List<T>, P>>> g();

    /* access modifiers changed from: protected */
    public h.f.a.b<S, t<p<List<T>, P>>> h() {
        return this.f39413a;
    }

    /* access modifiers changed from: protected */
    public m<List<? extends T>, List<? extends T>, List<T>> i() {
        return this.f39414b;
    }

    /* access modifiers changed from: protected */
    public m<List<? extends T>, List<? extends T>, List<T>> j() {
        return this.f39415c;
    }

    static final class d extends h.f.b.m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ ListViewModel this$0;

        static {
            Covode.recordClassIndex(24221);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ListViewModel listViewModel) {
            super(0);
            this.this$0 = listViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new com.bytedance.jedi.arch.ext.list.a.a(this) {
                /* class com.bytedance.jedi.arch.ext.list.ListViewModel.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f39417a;

                static {
                    Covode.recordClassIndex(24222);
                }

                @Override // com.bytedance.jedi.arch.ext.list.a.a
                public final void a() {
                    this.f39417a.this$0.l();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f39417a = r1;
                }

                @Override // com.bytedance.jedi.arch.ext.list.a.a
                public final void a(h.f.a.b<? super Integer, z> bVar) {
                    l.c(bVar, "");
                    this.f39417a.this$0.b_(new a(bVar));
                }

                /* renamed from: com.bytedance.jedi.arch.ext.list.ListViewModel$d$1$a */
                static final class a extends h.f.b.m implements h.f.a.b<S, z> {
                    final /* synthetic */ h.f.a.b $itemCountSupplier;

                    static {
                        Covode.recordClassIndex(24223);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    a(h.f.a.b bVar) {
                        super(1);
                        this.$itemCountSupplier = bVar;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(Object obj) {
                        IListState iListState = (IListState) obj;
                        l.c(iListState, "");
                        if (((ListState) iListState.getSubstate()).getHasMore().f39447a) {
                            this.$itemCountSupplier.invoke(Integer.valueOf(((ListState) iListState.getSubstate()).getList().size()));
                        }
                        return z.f158842a;
                    }
                }
            };
        }
    }

    public final void k() {
        m<List<? extends T>, List<? extends T>, List<T>> i2 = i();
        h.f.a.b<S, t<p<List<T>, P>>> g2 = g();
        l.c(i2, "");
        l.c(g2, "");
        b_(new b(this, g2, i2));
    }

    public final void l() {
        h.f.a.b<S, t<p<List<T>, P>>> h2 = h();
        if (h2 != null) {
            m<List<? extends T>, List<? extends T>, List<T>> j2 = j();
            l.c(j2, "");
            l.c(h2, "");
            b_(new a(this, h2, j2));
        }
    }

    @Override // com.bytedance.jedi.arch.ext.list.a.e.b
    public final void a(int i2) {
        this.f39416d.getValue().a(i2);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends h.f.b.m implements h.f.a.b<S, z> {
        final /* synthetic */ h.f.a.b $loadMoreCall;
        final /* synthetic */ m $loadMoreStrategy;
        final /* synthetic */ ListViewModel this$0;

        static {
            Covode.recordClassIndex(24216);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ListViewModel listViewModel, h.f.a.b bVar, m mVar) {
            super(1);
            this.this$0 = listViewModel;
            this.$loadMoreCall = bVar;
            this.$loadMoreStrategy = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            IListState iListState = (IListState) obj;
            l.c(iListState, "");
            ListState listState = (ListState) iListState.getSubstate();
            if (listState.getHasMore().f39447a && !(listState.getLoadMore() instanceof w)) {
                this.this$0.a((t) this.$loadMoreCall.invoke(iListState), new m<S, com.bytedance.jedi.arch.a<? extends p<? extends List<? extends T>, ? extends P>>, S>(this) {
                    /* class com.bytedance.jedi.arch.ext.list.ListViewModel.a.AnonymousClass1 */
                    final /* synthetic */ a this$0;

                    static {
                        Covode.recordClassIndex(24217);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.f.a.m
                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                        NestedState newSubstate;
                        IListState iListState = (IListState) obj;
                        com.bytedance.jedi.arch.a aVar = (com.bytedance.jedi.arch.a) obj2;
                        l.c(iListState, "");
                        l.c(aVar, "");
                        p pVar = (p) aVar.a();
                        if (pVar != null) {
                            List list = (List) pVar.component1();
                            o oVar = (o) pVar.component2();
                            this.this$0.this$0.a(list.size(), (Throwable) null);
                            List list2 = (List) this.this$0.$loadMoreStrategy.invoke(((ListState) iListState.getSubstate()).getList(), list);
                            b a2 = ListViewModel.a((ListState) iListState.getSubstate(), list2);
                            if ((oVar == null || (newSubstate = iListState.newSubstate(ListState.copy$default((ListState) iListState.getSubstate(), oVar, list2, null, new aj(list), a2, 4, null))) == null) && (newSubstate = iListState.newSubstate(ListState.copy$default((ListState) iListState.getSubstate(), null, list2, null, new aj(list), a2, 5, null))) == null) {
                                throw new h.w("null cannot be cast to non-null type");
                            }
                        } else {
                            if (aVar instanceof com.bytedance.jedi.arch.f) {
                                com.bytedance.jedi.arch.f fVar = (com.bytedance.jedi.arch.f) aVar;
                                this.this$0.this$0.a(0, fVar.f39461a);
                                newSubstate = iListState.newSubstate(ListState.copy$default((ListState) iListState.getSubstate(), null, null, null, new com.bytedance.jedi.arch.f(fVar.f39461a), null, 23, null));
                            } else {
                                newSubstate = iListState.newSubstate(ListState.copy$default((ListState) iListState.getSubstate(), null, null, null, new w(), null, 23, null));
                            }
                            if (newSubstate == null) {
                                throw new h.w("null cannot be cast to non-null type");
                            }
                        }
                        return newSubstate;
                    }
                });
            }
            return z.f158842a;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<S, z> {
        final /* synthetic */ h.f.a.b $refreshCall;
        final /* synthetic */ m $refreshStrategy;
        final /* synthetic */ ListViewModel this$0;

        static {
            Covode.recordClassIndex(24218);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ListViewModel listViewModel, h.f.a.b bVar, m mVar) {
            super(1);
            this.this$0 = listViewModel;
            this.$refreshCall = bVar;
            this.$refreshStrategy = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            IListState iListState = (IListState) obj;
            l.c(iListState, "");
            if (!(((ListState) iListState.getSubstate()).getRefresh() instanceof w)) {
                this.this$0.a((t) this.$refreshCall.invoke(iListState), new m<S, com.bytedance.jedi.arch.a<? extends p<? extends List<? extends T>, ? extends P>>, S>(this) {
                    /* class com.bytedance.jedi.arch.ext.list.ListViewModel.b.AnonymousClass1 */
                    final /* synthetic */ b this$0;

                    static {
                        Covode.recordClassIndex(24219);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.f.a.m
                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                        NestedState newSubstate;
                        IListState iListState = (IListState) obj;
                        com.bytedance.jedi.arch.a aVar = (com.bytedance.jedi.arch.a) obj2;
                        l.c(iListState, "");
                        l.c(aVar, "");
                        p pVar = (p) aVar.a();
                        if (pVar != null) {
                            Object component1 = pVar.component1();
                            o oVar = (o) pVar.component2();
                            List list = (List) this.this$0.$refreshStrategy.invoke(((ListState) iListState.getSubstate()).getList(), component1);
                            b a2 = ListViewModel.a((ListState) iListState.getSubstate(), list);
                            if ((oVar == null || (newSubstate = iListState.newSubstate(ListState.copy$default((ListState) iListState.getSubstate(), oVar, list, new aj(component1), null, a2, 8, null))) == null) && (newSubstate = iListState.newSubstate(ListState.copy$default((ListState) iListState.getSubstate(), null, list, new aj(component1), null, a2, 9, null))) == null) {
                                throw new h.w("null cannot be cast to non-null type");
                            }
                        } else {
                            if (aVar instanceof com.bytedance.jedi.arch.f) {
                                newSubstate = iListState.newSubstate(ListState.copy$default((ListState) iListState.getSubstate(), null, null, new com.bytedance.jedi.arch.f(((com.bytedance.jedi.arch.f) aVar).f39461a), null, null, 27, null));
                            } else {
                                newSubstate = iListState.newSubstate(ListState.copy$default((ListState) iListState.getSubstate(), null, null, new w(), null, null, 27, null));
                            }
                            if (newSubstate == null) {
                                throw new h.w("null cannot be cast to non-null type");
                            }
                        }
                        return newSubstate;
                    }
                });
            }
            return z.f158842a;
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.b<S, S> {
        final /* synthetic */ List $list$inlined;
        final /* synthetic */ ListViewModel this$0;

        static {
            Covode.recordClassIndex(24224);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ListViewModel listViewModel, List list) {
            super(1);
            this.this$0 = listViewModel;
            this.$list$inlined = list;
        }

        public final S invoke(S s) {
            l.c(s, "");
            ((ListState) s.getSubstate()).getList();
            List list = this.$list$inlined;
            NestedState newSubstate = s.newSubstate(ListState.copy$default((ListState) s.getSubstate(), null, list, null, null, ListViewModel.a((ListState) s.getSubstate(), list), 13, null));
            if (newSubstate != null) {
                return (S) ((IListState) newSubstate);
            }
            throw new h.w("null cannot be cast to non-null type");
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<S, z> {
        final /* synthetic */ h.f.a.b $predicate;
        final /* synthetic */ h.f.a.b $reducer;
        final /* synthetic */ ListViewModel this$0;

        static {
            Covode.recordClassIndex(24220);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ListViewModel listViewModel, h.f.a.b bVar, h.f.a.b bVar2) {
            super(1);
            this.this$0 = listViewModel;
            this.$predicate = bVar;
            this.$reducer = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            IListState iListState = (IListState) obj;
            l.c(iListState, "");
            List<T> list = ((ListState) iListState.getSubstate()).getList();
            h.f.a.b bVar = this.$predicate;
            Iterator<T> it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!((Boolean) bVar.invoke(it.next())).booleanValue()) {
                    i2++;
                } else if (i2 != -1) {
                    List g2 = h.a.n.g((Collection) ((ListState) iListState.getSubstate()).getList());
                    g2.set(i2, this.$reducer.invoke(g2.get(i2)));
                    ListViewModel listViewModel = this.this$0;
                    l.c(g2, "");
                    listViewModel.c(new e(listViewModel, g2));
                }
            }
            return z.f158842a;
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.b<S, S> {
        final /* synthetic */ h.f.a.b $reducer;
        final /* synthetic */ ListViewModel this$0;

        static {
            Covode.recordClassIndex(24225);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ListViewModel listViewModel, h.f.a.b bVar) {
            super(1);
            this.this$0 = listViewModel;
            this.$reducer = bVar;
        }

        public final S invoke(S s) {
            l.c(s, "");
            List list = (List) this.$reducer.invoke(((ListState) s.getSubstate()).getList());
            NestedState newSubstate = s.newSubstate(ListState.copy$default((ListState) s.getSubstate(), null, list, null, null, ListViewModel.a((ListState) s.getSubstate(), list), 13, null));
            if (newSubstate != null) {
                return (S) ((IListState) newSubstate);
            }
            throw new h.w("null cannot be cast to non-null type");
        }
    }

    public static b a(ListState<T, P> listState, List<? extends T> list) {
        boolean isEmpty = list.isEmpty();
        if (isEmpty == listState.isEmpty().f39447a) {
            return listState.isEmpty();
        }
        return new b(isEmpty);
    }

    public final void a(int i2, Throwable th) {
        h<d.AnonymousClass1> hVar = this.f39416d;
        if (hVar.isInitialized()) {
            hVar.getValue().a(i2, th);
        }
    }

    public final void a(h.f.a.b<? super T, Boolean> bVar, h.f.a.b<? super T, ? extends T> bVar2) {
        l.c(bVar, "");
        l.c(bVar2, "");
        b_(new c(this, bVar, bVar2));
    }

    public static /* synthetic */ void a(ListViewModel listViewModel, com.bytedance.jedi.arch.h hVar, a aVar, c cVar, c cVar2, int i2) {
        c cVar3 = null;
        if ((i2 & 2) != 0) {
            aVar = null;
        }
        if ((i2 & 4) != 0) {
            cVar = null;
        }
        if ((i2 & 8) == 0) {
            cVar3 = cVar2;
        }
        l.c(hVar, "");
        if (listViewModel != null) {
            if (cVar != null) {
                h.a.a(hVar, listViewModel, k.f39454a, (ah) null, new j.b(cVar), new j.c(cVar), new j.d(cVar), 2);
            }
            if (cVar3 != null) {
                h.a.a(hVar, listViewModel, l.f39455a, (ah) null, new j.e(cVar3), new j.f(cVar3), new j.g(cVar3), 2);
            }
            if (aVar != null) {
                f.a.b.b unused = hVar.selectSubscribe(listViewModel, m.f39456a, new ah(), new j.a(aVar, hVar, listViewModel));
                return;
            }
            return;
        }
        throw new h.w("null cannot be cast to non-null type");
    }
}
