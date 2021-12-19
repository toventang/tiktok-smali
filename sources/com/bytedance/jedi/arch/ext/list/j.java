package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.h;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class j {
    static {
        Covode.recordClassIndex(24252);
    }

    public static final <T, P extends o> List<T> a(IListState<T, P> iListState) {
        l.c(iListState, "");
        return ((ListState) iListState.getSubstate()).getList();
    }

    public static final <T, P extends o> com.bytedance.jedi.arch.a<List<T>> b(IListState<T, P> iListState) {
        l.c(iListState, "");
        return ((ListState) iListState.getSubstate()).getRefresh();
    }

    public static final <T, P extends o> com.bytedance.jedi.arch.a<List<T>> c(IListState<T, P> iListState) {
        l.c(iListState, "");
        return ((ListState) iListState.getSubstate()).getLoadMore();
    }

    public static final <T, P extends o> b d(IListState<T, P> iListState) {
        l.c(iListState, "");
        return ((ListState) iListState.getSubstate()).getHasMore();
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<RECEIVER, z> {
        final /* synthetic */ c $listener;

        static {
            Covode.recordClassIndex(24256);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(c cVar) {
            super(1);
            this.$listener = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            l.c(obj, "");
            this.$listener.a().invoke(obj);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.b<RECEIVER, z> {
        final /* synthetic */ c $listener;

        static {
            Covode.recordClassIndex(24259);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar) {
            super(1);
            this.$listener = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            l.c(obj, "");
            this.$listener.a().invoke(obj);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.m<RECEIVER, List<? extends T>, z> {
        final /* synthetic */ h.f.a.b $onSubmitFinish$inlined = null;
        final /* synthetic */ a $realAdapter;
        final /* synthetic */ h $this_doListSubscribe$inlined;
        final /* synthetic */ ListViewModel $viewModel$inlined;

        static {
            Covode.recordClassIndex(24253);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(a aVar, h hVar, ListViewModel listViewModel) {
            super(2);
            this.$realAdapter = aVar;
            this.$this_doListSubscribe$inlined = hVar;
            this.$viewModel$inlined = listViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, Object obj2) {
            AnonymousClass1 r0;
            final com.bytedance.jedi.arch.g gVar = (com.bytedance.jedi.arch.g) obj;
            List list = (List) obj2;
            l.c(gVar, "");
            l.c(list, "");
            a aVar = this.$realAdapter;
            final h.f.a.b bVar = this.$onSubmitFinish$inlined;
            if (bVar != null) {
                r0 = new h.f.a.a<z>() {
                    /* class com.bytedance.jedi.arch.ext.list.j.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(24254);
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
    public static final class b extends m implements h.f.a.m<RECEIVER, Throwable, z> {
        final /* synthetic */ c $listener;

        static {
            Covode.recordClassIndex(24255);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(2);
            this.$listener = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, Throwable th) {
            l.c(obj, "");
            l.c(th, "");
            this.$listener.b().invoke(obj, th);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.m<RECEIVER, List<? extends T>, z> {
        final /* synthetic */ c $listener;

        static {
            Covode.recordClassIndex(24257);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(2);
            this.$listener = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, Object obj2) {
            l.c(obj, "");
            l.c(obj2, "");
            this.$listener.c().invoke(obj, obj2);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.m<RECEIVER, Throwable, z> {
        final /* synthetic */ c $listener;

        static {
            Covode.recordClassIndex(24258);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(2);
            this.$listener = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, Throwable th) {
            l.c(obj, "");
            l.c(th, "");
            this.$listener.b().invoke(obj, th);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.m<RECEIVER, List<? extends T>, z> {
        final /* synthetic */ c $listener;

        static {
            Covode.recordClassIndex(24260);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar) {
            super(2);
            this.$listener = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, Object obj2) {
            l.c(obj, "");
            l.c(obj2, "");
            this.$listener.c().invoke(obj, obj2);
            return z.f158842a;
        }
    }
}
