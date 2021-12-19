package com.ss.android.ugc.aweme.favorites.viewmodel;

import com.bytedance.assem.arch.extensions.o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.favorites.api.d;
import com.ss.android.ugc.aweme.favorites.api.e;
import com.ss.android.ugc.aweme.favorites.e.j;
import com.ss.android.ugc.aweme.favorites.e.k;
import f.a.d.f;
import f.a.d.g;
import f.a.t;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class VideoCollectionListViewModel extends AssemViewModel<e> {

    /* renamed from: j  reason: collision with root package name */
    private final h f90988j = com.bytedance.assem.arch.a.c.a(this, c.f90999a);

    static {
        Covode.recordClassIndex(57208);
    }

    public final com.bytedance.assem.arch.a.a<k> g() {
        return (com.bytedance.assem.arch.a.a) this.f90988j.getValue();
    }

    static final class c extends m implements h.f.a.a<com.bytedance.assem.arch.a.a<k>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f90999a = new c();

        static {
            Covode.recordClassIndex(57223);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.assem.arch.a.a<k> invoke() {
            return new j();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ e f() {
        return new e();
    }

    public final void a(boolean z) {
        b(new b(this, z));
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<e, z> {
        final /* synthetic */ boolean $firstPage;
        final /* synthetic */ VideoCollectionListViewModel this$0;

        static {
            Covode.recordClassIndex(57216);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VideoCollectionListViewModel videoCollectionListViewModel, boolean z) {
            super(1);
            this.this$0 = videoCollectionListViewModel;
            this.$firstPage = z;
        }

        public static final class a<T1, T2, R> implements f.a.d.c<e, com.ss.android.ugc.aweme.favorites.api.b, R> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f90997a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f90998b;

            static {
                Covode.recordClassIndex(57221);
            }

            public a(b bVar, List list) {
                this.f90997a = bVar;
                this.f90998b = list;
            }

            /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel$b$a$a  reason: collision with other inner class name */
            static final class C2198a extends m implements h.f.a.b<e, e> {
                final /* synthetic */ e $collections;
                final /* synthetic */ List $list;

                static {
                    Covode.recordClassIndex(57222);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2198a(List list, e eVar) {
                    super(1);
                    this.$list = list;
                    this.$collections = eVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ e invoke(e eVar) {
                    long j2;
                    boolean z;
                    l.d(eVar, "");
                    o oVar = new o(this.$list);
                    Long l2 = this.$collections.f90458b;
                    if (l2 != null) {
                        j2 = l2.longValue();
                    } else {
                        j2 = 0;
                    }
                    Boolean bool = this.$collections.f90459c;
                    if (bool != null) {
                        z = bool.booleanValue();
                    } else {
                        z = false;
                    }
                    return e.a(oVar, j2, z);
                }
            }

            @Override // f.a.d.c
            public final R a(e eVar, com.ss.android.ugc.aweme.favorites.api.b bVar) {
                List<d> list;
                d.a aVar;
                com.ss.android.ugc.aweme.favorites.api.b bVar2 = bVar;
                e eVar2 = eVar;
                R r = (R) new ArrayList();
                List list2 = this.f90998b;
                if (list2 != null && !list2.isEmpty()) {
                    r.addAll(this.f90998b);
                }
                if (!(bVar2.f90445a == null || (aVar = bVar2.f90445a.f90453e) == null || !aVar.f90455b)) {
                    r.add(new b(bVar2.f90445a, 1));
                }
                if ((!r.isEmpty()) && (list = eVar2.f90457a) != null && !list.isEmpty()) {
                    List<d> list3 = eVar2.f90457a;
                    ArrayList arrayList = new ArrayList(n.a((Iterable) list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new b(it.next(), 2));
                    }
                    r.addAll(arrayList);
                }
                this.f90997a.this$0.a(new C2198a(r, eVar2));
                return r;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            long j2;
            List<b> a2;
            t<com.ss.android.ugc.aweme.favorites.api.b> b2;
            e eVar2 = eVar;
            l.d(eVar2, "");
            if (this.$firstPage || eVar2.f91012c) {
                if (this.$firstPage || (eVar2.f91010a instanceof com.bytedance.assem.arch.extensions.t) || (eVar2.f91010a instanceof com.bytedance.assem.arch.extensions.h)) {
                    this.this$0.a(AnonymousClass1.f90994a);
                }
                if (this.$firstPage) {
                    j2 = 0;
                } else {
                    j2 = eVar2.f91011b;
                }
                if (this.$firstPage) {
                    a2 = h.a.z.INSTANCE;
                } else {
                    a2 = eVar2.f91010a.a();
                }
                t a3 = k.a.a(this.this$0.g().a(), j2);
                if (j2 == 0) {
                    b2 = this.this$0.g().a().a(1);
                } else {
                    b2 = t.b(new com.ss.android.ugc.aweme.favorites.api.b((byte) 0));
                    l.b(b2, "");
                }
                VideoCollectionListViewModel videoCollectionListViewModel = this.this$0;
                t a4 = a3.a(b2, new a(this, a2));
                l.a((Object) a4, "");
                f.a.b.b a5 = a4.b(f.a.h.a.b(f.a.k.a.f158006c)).a(AnonymousClass2.f90995a, new f(this) {
                    /* class com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel.b.AnonymousClass3 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f90996a;

                    static {
                        Covode.recordClassIndex(57219);
                    }

                    {
                        this.f90996a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        final Throwable th = (Throwable) obj;
                        this.f90996a.this$0.a(new h.f.a.b<e, e>() {
                            /* class com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel.b.AnonymousClass3.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(57220);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ e invoke(e eVar) {
                                e eVar2 = eVar;
                                l.d(eVar2, "");
                                Throwable th = th;
                                l.b(th, "");
                                return e.a(new com.bytedance.assem.arch.extensions.h(th), eVar2.f91011b, eVar2.f91012c);
                            }
                        });
                    }
                });
                l.b(a5, "");
                videoCollectionListViewModel.a(a5);
            }
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.b<e, z> {
        final /* synthetic */ String $excludeId;
        final /* synthetic */ boolean $firstPage;
        final /* synthetic */ VideoCollectionListViewModel this$0;

        static {
            Covode.recordClassIndex(57209);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VideoCollectionListViewModel videoCollectionListViewModel, boolean z, String str) {
            super(1);
            this.this$0 = videoCollectionListViewModel;
            this.$firstPage = z;
            this.$excludeId = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            long j2;
            final List<b> a2;
            e eVar2 = eVar;
            l.d(eVar2, "");
            if (this.$firstPage || eVar2.f91012c) {
                if (this.$firstPage || (eVar2.f91010a instanceof com.bytedance.assem.arch.extensions.t) || (eVar2.f91010a instanceof com.bytedance.assem.arch.extensions.h)) {
                    this.this$0.a(AnonymousClass1.f90989a);
                }
                if (this.$firstPage) {
                    j2 = 0;
                } else {
                    j2 = eVar2.f91011b;
                }
                if (this.$firstPage) {
                    a2 = h.a.z.INSTANCE;
                } else {
                    a2 = eVar2.f91010a.a();
                }
                VideoCollectionListViewModel videoCollectionListViewModel = this.this$0;
                f.a.b.b a3 = videoCollectionListViewModel.g().a().a(j2, this.$excludeId).d(new g(this) {
                    /* class com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel.a.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f90990a;

                    static {
                        Covode.recordClassIndex(57211);
                    }

                    {
                        this.f90990a = r1;
                    }

                    @Override // f.a.d.g
                    public final /* synthetic */ Object apply(Object obj) {
                        final e eVar = (e) obj;
                        l.d(eVar, "");
                        final ArrayList arrayList = new ArrayList();
                        List list = a2;
                        if (list != null && !list.isEmpty()) {
                            arrayList.addAll(a2);
                        }
                        List<d> list2 = eVar.f90457a;
                        if (list2 != null && !list2.isEmpty()) {
                            List<d> list3 = eVar.f90457a;
                            ArrayList arrayList2 = new ArrayList(n.a((Iterable) list3, 10));
                            Iterator<T> it = list3.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(new b(it.next(), 2));
                            }
                            arrayList.addAll(arrayList2);
                        }
                        this.f90990a.this$0.a(new h.f.a.b<e, e>() {
                            /* class com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel.a.AnonymousClass2.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(57212);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ e invoke(e eVar) {
                                long j2;
                                boolean z;
                                l.d(eVar, "");
                                o oVar = new o(arrayList);
                                Long l2 = eVar.f90458b;
                                if (l2 != null) {
                                    j2 = l2.longValue();
                                } else {
                                    j2 = 0;
                                }
                                Boolean bool = eVar.f90459c;
                                if (bool != null) {
                                    z = bool.booleanValue();
                                } else {
                                    z = false;
                                }
                                return e.a(oVar, j2, z);
                            }
                        });
                        return arrayList;
                    }
                }).b(f.a.h.a.b(f.a.k.a.f158006c)).a(AnonymousClass3.f90992a, new f(this) {
                    /* class com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel.a.AnonymousClass4 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f90993a;

                    static {
                        Covode.recordClassIndex(57214);
                    }

                    {
                        this.f90993a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        final Throwable th = (Throwable) obj;
                        this.f90993a.this$0.a(new h.f.a.b<e, e>() {
                            /* class com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel.a.AnonymousClass4.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(57215);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ e invoke(e eVar) {
                                e eVar2 = eVar;
                                l.d(eVar2, "");
                                Throwable th = th;
                                l.b(th, "");
                                return e.a(new com.bytedance.assem.arch.extensions.h(th), eVar2.f91011b, eVar2.f91012c);
                            }
                        });
                    }
                });
                l.b(a3, "");
                videoCollectionListViewModel.a(a3);
            }
            return z.f158842a;
        }
    }

    public final void a(boolean z, String str) {
        b(new a(this, z, str));
    }
}
