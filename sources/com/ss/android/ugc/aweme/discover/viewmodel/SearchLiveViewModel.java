package com.ss.android.ugc.aweme.discover.viewmodel;

import com.bytedance.assem.arch.a.c;
import com.bytedance.assem.arch.extensions.o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.jedi.viewmodel.f;
import com.ss.android.ugc.aweme.discover.model.SearchLiveList;
import h.c.b.a.k;
import h.c.d;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.r;
import h.z;
import kotlinx.coroutines.am;

public final class SearchLiveViewModel extends AssemViewModel<d> {

    /* renamed from: j  reason: collision with root package name */
    final h f82795j = c.a(this, a.f82796a);

    static {
        Covode.recordClassIndex(51576);
    }

    static final class a extends m implements h.f.a.a<com.bytedance.assem.arch.a.a<c>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f82796a = new a();

        static {
            Covode.recordClassIndex(51577);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.assem.arch.a.a<c> invoke() {
            return new b();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ d f() {
        return new d();
    }

    public static final class b extends k implements h.f.a.m<am, d<? super z>, Object> {
        final /* synthetic */ f $param;
        int label;
        final /* synthetic */ SearchLiveViewModel this$0;

        static {
            Covode.recordClassIndex(51578);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(SearchLiveViewModel searchLiveViewModel, f fVar, d dVar) {
            super(2, dVar);
            this.this$0 = searchLiveViewModel;
            this.$param = fVar;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new b(this.this$0, this.$param, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                try {
                    f fVar = this.$param;
                    this.label = 1;
                    obj = ((c) ((com.bytedance.assem.arch.a.a) this.this$0.f82795j.getValue()).a()).a(fVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (Exception e2) {
                    this.this$0.a(new h.f.a.b<d, d>() {
                        /* class com.ss.android.ugc.aweme.discover.viewmodel.SearchLiveViewModel.b.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(51580);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ d invoke(d dVar) {
                            l.d(dVar, "");
                            return d.a(new com.bytedance.assem.arch.extensions.h(e2));
                        }
                    });
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final SearchLiveList searchLiveList = (SearchLiveList) obj;
            this.this$0.a(new h.f.a.b<d, d>() {
                /* class com.ss.android.ugc.aweme.discover.viewmodel.SearchLiveViewModel.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(51579);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ d invoke(d dVar) {
                    l.d(dVar, "");
                    return d.a(new o(searchLiveList));
                }
            });
            return z.f158842a;
        }
    }
}
