package com.bytedance.jedi.ext.adapter.a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ext.list.IListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.bytedance.jedi.arch.g;
import com.bytedance.jedi.arch.h;
import com.bytedance.jedi.ext.adapter.a.a;
import com.bytedance.jedi.ext.adapter.a.a.m;
import com.bytedance.jedi.ext.adapter.a.a.o;
import com.bytedance.jedi.ext.adapter.a.d;
import com.bytedance.jedi.ext.adapter.a.f;
import h.z;
import java.util.Arrays;
import java.util.List;

public class g<T, DEC extends d<T>, RECEIVER extends com.bytedance.jedi.arch.g> extends a<T, DEC, RECEIVER, g<T, DEC, RECEIVER>> {
    public ListViewModel<T, ?, ?> q;
    h.f.a.a<z> r = new m(this);

    static {
        Covode.recordClassIndex(24414);
    }

    static final class c extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ ListViewModel $it;

        static {
            Covode.recordClassIndex(24419);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ListViewModel listViewModel) {
            super(0);
            this.$it = listViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$it.l();
            return z.f158842a;
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.g$g  reason: collision with other inner class name */
    static final class C0971g extends h.f.b.m implements h.f.a.m<RECEIVER, List<? extends T>, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(24423);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0971g(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* renamed from: com.bytedance.jedi.ext.adapter.a.g$g$a */
        static final class a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ h.f.a.b $it;
            final /* synthetic */ com.bytedance.jedi.arch.g $this_selectSubscribe$inlined;

            static {
                Covode.recordClassIndex(24424);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h.f.a.b bVar, com.bytedance.jedi.arch.g gVar) {
                super(0);
                this.$it = bVar;
                this.$this_selectSubscribe$inlined = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* bridge */ /* synthetic */ z invoke() {
                this.$it.invoke(this.$this_selectSubscribe$inlined);
                return z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, Object obj2) {
            a aVar;
            com.bytedance.jedi.arch.g gVar = (com.bytedance.jedi.arch.g) obj;
            List<? extends T> list = (List) obj2;
            h.f.b.l.c(gVar, "");
            h.f.b.l.c(list, "");
            com.bytedance.jedi.ext.adapter.a<T, ?, ?> aVar2 = this.this$0.n;
            h.f.a.b<? super RECEIVER, z> bVar = this.this$0.f39583m;
            if (bVar != null) {
                aVar = new a(bVar, gVar);
            } else {
                aVar = null;
            }
            aVar2.a(list, aVar);
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(24431);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ListViewModel<T, ?, ?> listViewModel = this.this$0.q;
            if (listViewModel != null) {
                listViewModel.k();
            }
            return z.f158842a;
        }
    }

    static final class a extends h.f.b.m implements h.f.a.b<ViewGroup, e> {
        final /* synthetic */ h.f.a.m $loadingCreator;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(24415);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h.f.a.m mVar, g gVar) {
            super(1);
            this.$loadingCreator = mVar;
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ e invoke(ViewGroup viewGroup) {
            h.f.b.l.c(viewGroup, "");
            return this.$loadingCreator.invoke(viewGroup, new h.f.a.a<z>(this) {
                /* class com.bytedance.jedi.ext.adapter.a.g.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(24416);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    this.this$0.this$0.o.f39655d.c(244);
                    return z.f158842a;
                }
            });
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<ViewGroup, c> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(24417);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ c invoke(ViewGroup viewGroup) {
            h.f.b.l.c(viewGroup, "");
            return this.this$0.f39578h.invoke(viewGroup, new h.f.a.a<z>(this) {
                /* class com.bytedance.jedi.ext.adapter.a.g.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(24418);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* bridge */ /* synthetic */ z invoke() {
                    this.this$0.this$0.r.invoke();
                    return z.f158842a;
                }
            });
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<RECEIVER, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(24420);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            h.f.a.b<RECEIVER, z> a2;
            h.f.b.l.c(obj, "");
            com.bytedance.jedi.arch.ext.list.c<T, RECEIVER> cVar = this.this$0.f39580j;
            if (!(cVar == null || (a2 = cVar.a()) == null)) {
                a2.invoke(obj);
            }
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<RECEIVER, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(24427);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            h.f.a.b<RECEIVER, z> a2;
            h.f.b.l.c(obj, "");
            com.bytedance.jedi.arch.ext.list.c<T, RECEIVER> cVar = this.this$0.f39579i;
            if (!(cVar == null || (a2 = cVar.a()) == null)) {
                a2.invoke(obj);
            }
            return z.f158842a;
        }
    }

    public final DEC a(RecyclerView recyclerView) {
        h.f.a.b<? super ViewGroup, ? extends RecyclerView.ViewHolder> bVar;
        h.f.a.b<? super ViewGroup, ? extends RecyclerView.ViewHolder> bVar2;
        h.f.a.b<? super ViewGroup, ? extends RecyclerView.ViewHolder> bVar3;
        h.f.a.b<? super ViewGroup, ? extends RecyclerView.ViewHolder> bVar4;
        View view;
        View view2;
        View view3;
        View view4;
        f.c cVar;
        h.f.b.l.c(recyclerView, "");
        ListViewModel<T, ?, ?> listViewModel = this.q;
        if (listViewModel != null) {
            com.bytedance.jedi.arch.h<RECEIVER> hVar = this.p;
            f.a.b.b unused = hVar.selectSubscribe(listViewModel, h.f39665a, new ah(), new h(this));
            f.a.b.b unused2 = hVar.selectSubscribe(listViewModel, j.f39667a, new ah(), new i(this));
            h.a.a(hVar, listViewModel, k.f39668a, (ah) null, new k(this, listViewModel), new j(this), new l(this), 2);
            h.a.a(hVar, listViewModel, l.f39669a, (ah) null, new e(this), new d(this), new f(this), 2);
            f.a.b.b unused3 = hVar.selectSubscribe(listViewModel, i.f39666a, new ah(), new C0971g(this));
            DEC dec = this.o;
            f.b bVar5 = null;
            if (!(this.f39571a == null || (view4 = dec.f39653b.f39608a) == (view3 = this.f39571a))) {
                dec.f39653b.f39608a = view3;
                com.bytedance.jedi.ext.adapter.a.a.k kVar = dec.f39653b;
                if (view3 != null) {
                    cVar = new f.c(view3);
                } else {
                    cVar = null;
                }
                kVar.f39609b = cVar;
                if (dec.f39657f.f39649a != null) {
                    if (view3 == null) {
                        dec.notifyItemRemoved(0);
                    } else {
                        dec.a(dec.f39653b, view4, view3, 0);
                    }
                }
            }
            if (!(this.f39573c == null || (view2 = dec.f39654c.f39608a) == (view = this.f39573c))) {
                dec.f39654c.f39608a = view;
                com.bytedance.jedi.ext.adapter.a.a.k kVar2 = dec.f39653b;
                if (view != null) {
                    bVar5 = new f.b(view);
                }
                kVar2.f39609b = bVar5;
                if (dec.f39657f.f39649a != null) {
                    if (view == null) {
                        if (dec.f39652a.getItemCount() == 0) {
                            int f2 = dec.f39656e.f();
                            if (f2 != -1) {
                                dec.notifyItemRemoved(f2);
                            }
                        } else {
                            dec.notifyItemRemoved(dec.f39653b.c() + dec.f39652a.getItemCount());
                        }
                    } else if (dec.f39652a.getItemCount() == 0) {
                        int f3 = dec.f39656e.f();
                        if (f3 != -1) {
                            dec.a(dec.f39654c, view2, view, f3);
                        }
                    } else {
                        dec.a(dec.f39654c, view2, view, dec.f39653b.c() + dec.f39652a.getItemCount());
                    }
                }
            }
            if (!(this.f39572b == null || (bVar4 = dec.f39653b.f39609b) == (bVar3 = this.f39572b))) {
                dec.f39653b.f39609b = bVar3;
                if (dec.f39657f.f39649a != null) {
                    if (bVar3 == null) {
                        dec.notifyItemRemoved(0);
                    } else {
                        dec.a(dec.f39653b, bVar4, bVar3, 0);
                    }
                }
            }
            if (!(this.f39574d == null || (bVar2 = dec.f39654c.f39609b) == (bVar = this.f39574d))) {
                dec.f39654c.f39609b = bVar;
                if (dec.f39657f.f39649a != null) {
                    if (bVar == null) {
                        if (dec.f39652a.getItemCount() == 0) {
                            int f4 = dec.f39656e.f();
                            if (f4 != -1) {
                                dec.notifyItemRemoved(f4);
                            }
                        } else {
                            dec.notifyItemRemoved(dec.f39653b.c() + dec.f39652a.getItemCount());
                        }
                    } else if (dec.f39652a.getItemCount() == 0) {
                        int f5 = dec.f39656e.f();
                        if (f5 != -1) {
                            dec.a(dec.f39654c, bVar2, bVar, f5);
                        }
                    } else {
                        dec.a(dec.f39654c, bVar2, bVar, dec.f39653b.c() + dec.f39652a.getItemCount());
                    }
                }
            }
            dec.b(this.f39575e);
            int[] iArr = this.f39577g;
            dec.a(Arrays.copyOf(iArr, iArr.length));
            if (this.f39575e != 241) {
                ListViewModel<T, ?, ?> listViewModel2 = this.q;
                if (listViewModel2 != null) {
                    dec.f39655d.f39637i = new c(listViewModel2);
                    if (dec.f39655d.f39636h == 241) {
                        dec.b(242);
                    }
                }
                h.f.a.m mVar = this.f39576f;
                if (mVar == null) {
                    if (this.f39575e == 242) {
                        mVar = a.C0966a.f39587a;
                    } else {
                        mVar = a.b.f39592a;
                    }
                }
                a aVar = new a(mVar, this);
                h.f.b.l.c(aVar, "");
                h.f.a.b<? super ViewGroup, ? extends e> bVar6 = dec.f39655d.f39633e;
                if (bVar6 == null || bVar6 != aVar) {
                    dec.f39655d.f39633e = aVar;
                    if (dec.f39657f.f39649a != null && dec.f39655d.g()) {
                        m.a.a(dec.f39655d);
                        dec.notifyItemRemoved(dec.f39652a.getItemCount() + dec.f39653b.c() + dec.f39654c.c());
                        dec.notifyItemInserted(dec.f39652a.getItemCount() + dec.f39653b.c() + dec.f39654c.c());
                        o.a(dec.f39655d);
                    }
                }
            }
            if (h.a.i.a(this.f39577g, 1)) {
                b bVar7 = new b(this);
                h.f.b.l.c(bVar7, "");
                h.f.a.b<? super ViewGroup, ? extends c> bVar8 = dec.f39656e.f39620e;
                if (bVar8 == null || bVar8 != bVar7) {
                    dec.f39656e.f39620e = bVar7;
                    dec.a();
                }
            }
            recyclerView.setAdapter(dec);
            return this.o;
        }
        throw new IllegalArgumentException("realAdapter does not provide viewModel, please specify one".toString());
    }

    static final class l extends h.f.b.m implements h.f.a.m<RECEIVER, List<? extends T>, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(24430);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, Object obj2) {
            h.f.a.m<RECEIVER, List<? extends T>, z> c2;
            h.f.b.l.c(obj, "");
            h.f.b.l.c(obj2, "");
            com.bytedance.jedi.arch.ext.list.c<T, RECEIVER> cVar = this.this$0.f39579i;
            if (!(cVar == null || (c2 = cVar.c()) == null)) {
                c2.invoke(obj, obj2);
            }
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.m<RECEIVER, Throwable, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(24421);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, Throwable th) {
            h.f.a.m<RECEIVER, Throwable, z> b2;
            h.f.b.l.c(obj, "");
            h.f.b.l.c(th, "");
            o oVar = this.this$0.o.f39655d;
            if (oVar.g()) {
                oVar.b(244);
                if (oVar.f()) {
                    oVar.f39638j.f39642b = true;
                }
            }
            com.bytedance.jedi.arch.ext.list.c<T, RECEIVER> cVar = this.this$0.f39580j;
            if (!(cVar == null || (b2 = cVar.b()) == null)) {
                b2.invoke(obj, th);
            }
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.m<RECEIVER, List<? extends T>, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(24422);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, Object obj2) {
            h.f.a.m<RECEIVER, List<? extends T>, z> c2;
            h.f.b.l.c(obj, "");
            h.f.b.l.c(obj2, "");
            DEC dec = this.this$0.o;
            if (dec.f39655d.f39635g != 243) {
                dec.c(241);
            }
            com.bytedance.jedi.arch.ext.list.c<T, RECEIVER> cVar = this.this$0.f39580j;
            if (!(cVar == null || (c2 = cVar.c()) == null)) {
                c2.invoke(obj, obj2);
            }
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<RECEIVER, com.bytedance.jedi.arch.ext.list.b, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(24425);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, com.bytedance.jedi.arch.ext.list.b bVar) {
            int i2;
            com.bytedance.jedi.arch.ext.list.b bVar2 = bVar;
            h.f.b.l.c(obj, "");
            h.f.b.l.c(bVar2, "");
            DEC dec = this.this$0.o;
            if (!bVar2.f39447a) {
                i2 = 243;
            } else {
                i2 = 241;
            }
            dec.c(i2);
            h.f.a.m<? super RECEIVER, ? super Boolean, z> mVar = this.this$0.f39581k;
            if (mVar != null) {
                mVar.invoke(obj, Boolean.valueOf(bVar2.f39447a));
            }
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<RECEIVER, Throwable, z> {
        final /* synthetic */ ListViewModel $viewModel;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(24428);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(g gVar, ListViewModel listViewModel) {
            super(2);
            this.this$0 = gVar;
            this.$viewModel = listViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, Throwable th) {
            h.f.a.m<RECEIVER, Throwable, z> b2;
            h.f.b.l.c(obj, "");
            h.f.b.l.c(th, "");
            this.this$0.p.withState(this.$viewModel, new h.f.a.b<IListState<T, ? extends com.bytedance.jedi.arch.ext.list.o>, z>(this) {
                /* class com.bytedance.jedi.ext.adapter.a.g.k.AnonymousClass1 */
                final /* synthetic */ k this$0;

                static {
                    Covode.recordClassIndex(24429);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(Object obj) {
                    boolean z;
                    IListState iListState = (IListState) obj;
                    h.f.b.l.c(iListState, "");
                    if (((ListState) iListState.getSubstate()).getList().isEmpty()) {
                        DEC dec = this.this$0.this$0.o;
                        if (dec.f39656e.g()) {
                            if (dec.f39656e.f39623h == 241) {
                                z = true;
                            } else {
                                z = false;
                            }
                            dec.f39656e.b(243);
                            if (dec.f39657f.f39649a != null && z) {
                                dec.notifyDataSetChanged();
                            }
                        }
                    }
                    return z.f158842a;
                }
            });
            com.bytedance.jedi.arch.ext.list.c<T, RECEIVER> cVar = this.this$0.f39579i;
            if (!(cVar == null || (b2 = cVar.b()) == null)) {
                b2.invoke(obj, th);
            }
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<RECEIVER, com.bytedance.jedi.arch.ext.list.b, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(24426);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, com.bytedance.jedi.arch.ext.list.b bVar) {
            boolean z;
            com.bytedance.jedi.arch.ext.list.b bVar2 = bVar;
            h.f.b.l.c(obj, "");
            h.f.b.l.c(bVar2, "");
            DEC dec = this.this$0.o;
            boolean z2 = bVar2.f39447a;
            if (dec.f39656e.g()) {
                int i2 = 241;
                if (dec.f39656e.f39623h == 241) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z3 = !z2;
                com.bytedance.jedi.ext.adapter.a.a.g gVar = dec.f39656e;
                if (z2) {
                    i2 = 242;
                }
                gVar.b(i2);
                if (!(dec.f39657f.f39649a == null || z == z3)) {
                    dec.notifyDataSetChanged();
                }
            }
            h.f.a.m<? super RECEIVER, ? super Boolean, z> mVar = this.this$0.f39582l;
            if (mVar != null) {
                mVar.invoke(obj, Boolean.valueOf(bVar2.f39447a));
            }
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(com.bytedance.jedi.ext.adapter.a<T, ?, ?> aVar, DEC dec, com.bytedance.jedi.arch.h<? extends RECEIVER> hVar) {
        super(aVar, dec, hVar);
        h.f.b.l.c(aVar, "");
        h.f.b.l.c(dec, "");
        h.f.b.l.c(hVar, "");
    }
}
