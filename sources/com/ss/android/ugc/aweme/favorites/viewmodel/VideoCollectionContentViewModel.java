package com.ss.android.ugc.aweme.favorites.viewmodel;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.assem.arch.extensions.o;
import com.bytedance.assem.arch.extensions.t;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.favorites.e.j;
import com.ss.android.ugc.aweme.favorites.e.k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class VideoCollectionContentViewModel extends AssemViewModel<d> {

    /* renamed from: k  reason: collision with root package name */
    public static final a f90974k = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public String f90975j;

    /* renamed from: l  reason: collision with root package name */
    private final h f90976l = com.bytedance.assem.arch.a.c.a(this, f.f90987a);

    static {
        Covode.recordClassIndex(57184);
    }

    public final com.bytedance.assem.arch.a.a<k> g() {
        return (com.bytedance.assem.arch.a.a) this.f90976l.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57185);
        }

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel$a$a  reason: collision with other inner class name */
        public static final class C2197a implements ad.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f90977a;

            static {
                Covode.recordClassIndex(57186);
            }

            C2197a(String str) {
                this.f90977a = str;
            }

            @Override // androidx.lifecycle.ad.b
            public final <T extends ac> T a(Class<T> cls) {
                l.d(cls, "");
                if (AssemViewModel.class.isAssignableFrom(cls)) {
                    return cls.getConstructor(String.class).newInstance(this.f90977a);
                }
                throw new IllegalArgumentException("Custom ViewModel must be a subclass of VideoCollectionContentViewModel.");
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static ad.b a(String str) {
            l.d(str, "");
            return new C2197a(str);
        }
    }

    static final class f extends m implements h.f.a.a<com.bytedance.assem.arch.a.a<k>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f90987a = new f();

        static {
            Covode.recordClassIndex(57206);
        }

        f() {
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
    public final /* synthetic */ d f() {
        return new d();
    }

    public VideoCollectionContentViewModel() {
    }

    public final void a(boolean z) {
        a(new e(z));
    }

    public final void b(boolean z) {
        b(new c(this, z));
    }

    public final void c(boolean z) {
        b(new b(this, z));
    }

    public final void d(boolean z) {
        b(new d(this, z));
    }

    public VideoCollectionContentViewModel(String str) {
        l.d(str, "");
        this.f90975j = str;
    }

    static final class b extends m implements h.f.a.b<d, z> {
        final /* synthetic */ boolean $firstPage;
        final /* synthetic */ VideoCollectionContentViewModel this$0;

        static {
            Covode.recordClassIndex(57187);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VideoCollectionContentViewModel videoCollectionContentViewModel, boolean z) {
            super(1);
            this.this$0 = videoCollectionContentViewModel;
            this.$firstPage = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(d dVar) {
            long j2;
            d dVar2 = dVar;
            l.d(dVar2, "");
            if (this.$firstPage || dVar2.f91009c) {
                if (this.$firstPage || (dVar2.f91007a instanceof t) || (dVar2.f91007a instanceof com.bytedance.assem.arch.extensions.h)) {
                    this.this$0.a(AnonymousClass1.f90978a);
                }
                if (this.$firstPage) {
                    j2 = 0;
                } else {
                    j2 = dVar2.f91008b;
                }
                VideoCollectionContentViewModel videoCollectionContentViewModel = this.this$0;
                f.a.b.b a2 = videoCollectionContentViewModel.g().a().a(j2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new f.a.d.f(this) {
                    /* class com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.b.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f90979a;

                    static {
                        Covode.recordClassIndex(57189);
                    }

                    {
                        this.f90979a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        final com.ss.android.ugc.aweme.favorites.api.c cVar = (com.ss.android.ugc.aweme.favorites.api.c) obj;
                        this.f90979a.this$0.a(new h.f.a.b<d, d>(this) {
                            /* class com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.b.AnonymousClass2.AnonymousClass1 */
                            final /* synthetic */ AnonymousClass2 this$0;

                            static {
                                Covode.recordClassIndex(57190);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ d invoke(d dVar) {
                                Long l2;
                                List<a> a2;
                                d dVar2 = dVar;
                                l.d(dVar2, "");
                                ALog.d("Collections", "get videos in allfavorites: cursor = " + dVar2.f91008b + ", maxCursor = " + cVar.f90447b);
                                Long l3 = cVar.f90447b;
                                long j2 = dVar2.f91008b;
                                long j3 = 0;
                                if (l3 != null && l3.longValue() == j2 && ((l2 = cVar.f90447b) == null || l2.longValue() != 0)) {
                                    return dVar2;
                                }
                                if (this.this$0.f90979a.$firstPage) {
                                    a2 = h.a.z.INSTANCE;
                                } else {
                                    a2 = dVar2.f91007a.a();
                                    if (a2 == null) {
                                        a2 = h.a.z.INSTANCE;
                                    }
                                }
                                ArrayList arrayList = new ArrayList();
                                boolean z = false;
                                if (a2 != null && !a2.isEmpty()) {
                                    arrayList.addAll(a2);
                                }
                                List<Aweme> list = cVar.f90446a;
                                if (list != null && !list.isEmpty()) {
                                    List<Aweme> list2 = cVar.f90446a;
                                    ArrayList arrayList2 = new ArrayList(n.a((Iterable) list2, 10));
                                    Iterator<T> it = list2.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(new a(it.next(), 0));
                                    }
                                    arrayList.addAll(arrayList2);
                                }
                                o oVar = new o(arrayList);
                                Long l4 = cVar.f90447b;
                                if (l4 != null) {
                                    j3 = l4.longValue();
                                }
                                Boolean bool = cVar.f90448c;
                                if (bool != null) {
                                    z = bool.booleanValue();
                                }
                                return new d(oVar, j3, z);
                            }
                        });
                    }
                }, new f.a.d.f(this) {
                    /* class com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.b.AnonymousClass3 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f90980a;

                    static {
                        Covode.recordClassIndex(57191);
                    }

                    {
                        this.f90980a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        final Throwable th = (Throwable) obj;
                        this.f90980a.this$0.a(new h.f.a.b<d, d>() {
                            /* class com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.b.AnonymousClass3.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(57192);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ d invoke(d dVar) {
                                d dVar2 = dVar;
                                l.d(dVar2, "");
                                Throwable th = th;
                                l.b(th, "");
                                return d.a(new com.bytedance.assem.arch.extensions.h(th), dVar2.f91008b, dVar2.f91009c);
                            }
                        });
                    }
                });
                l.b(a2, "");
                videoCollectionContentViewModel.a(a2);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<d, z> {
        final /* synthetic */ boolean $firstPage;
        final /* synthetic */ VideoCollectionContentViewModel this$0;

        static {
            Covode.recordClassIndex(57193);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VideoCollectionContentViewModel videoCollectionContentViewModel, boolean z) {
            super(1);
            this.this$0 = videoCollectionContentViewModel;
            this.$firstPage = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(d dVar) {
            long j2;
            d dVar2 = dVar;
            l.d(dVar2, "");
            if (this.$firstPage || dVar2.f91009c) {
                if (this.$firstPage || (dVar2.f91007a instanceof t) || (dVar2.f91007a instanceof com.bytedance.assem.arch.extensions.h)) {
                    this.this$0.a(AnonymousClass1.f90981a);
                }
                if (this.$firstPage) {
                    j2 = 0;
                } else {
                    j2 = dVar2.f91008b;
                }
                VideoCollectionContentViewModel videoCollectionContentViewModel = this.this$0;
                f.a.b.b a2 = videoCollectionContentViewModel.g().a().b(j2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new f.a.d.f(this) {
                    /* class com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.c.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f90982a;

                    static {
                        Covode.recordClassIndex(57195);
                    }

                    {
                        this.f90982a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        final com.ss.android.ugc.aweme.favorites.api.c cVar = (com.ss.android.ugc.aweme.favorites.api.c) obj;
                        this.f90982a.this$0.a(new h.f.a.b<d, d>(this) {
                            /* class com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.c.AnonymousClass2.AnonymousClass1 */
                            final /* synthetic */ AnonymousClass2 this$0;

                            static {
                                Covode.recordClassIndex(57196);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ d invoke(d dVar) {
                                Long l2;
                                List<a> a2;
                                d dVar2 = dVar;
                                l.d(dVar2, "");
                                ALog.d("Collections", "get videos in candidate: cursor = " + dVar2.f91008b + ", maxCursor = " + cVar.f90447b);
                                Long l3 = cVar.f90447b;
                                long j2 = dVar2.f91008b;
                                long j3 = 0;
                                if (l3 != null && l3.longValue() == j2 && ((l2 = cVar.f90447b) == null || l2.longValue() != 0)) {
                                    return dVar2;
                                }
                                if (this.this$0.f90982a.$firstPage) {
                                    a2 = h.a.z.INSTANCE;
                                } else {
                                    a2 = dVar2.f91007a.a();
                                    if (a2 == null) {
                                        a2 = h.a.z.INSTANCE;
                                    }
                                }
                                ArrayList arrayList = new ArrayList();
                                boolean z = false;
                                if (a2 != null && !a2.isEmpty()) {
                                    arrayList.addAll(a2);
                                }
                                List<Aweme> list = cVar.f90446a;
                                if (list != null && !list.isEmpty()) {
                                    List<Aweme> list2 = cVar.f90446a;
                                    ArrayList arrayList2 = new ArrayList(n.a((Iterable) list2, 10));
                                    Iterator<T> it = list2.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(new a(it.next(), 1));
                                    }
                                    arrayList.addAll(arrayList2);
                                }
                                o oVar = new o(arrayList);
                                Long l4 = cVar.f90447b;
                                if (l4 != null) {
                                    j3 = l4.longValue();
                                }
                                Boolean bool = cVar.f90448c;
                                if (bool != null) {
                                    z = bool.booleanValue();
                                }
                                return new d(oVar, j3, z);
                            }
                        });
                    }
                }, new f.a.d.f(this) {
                    /* class com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.c.AnonymousClass3 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f90983a;

                    static {
                        Covode.recordClassIndex(57197);
                    }

                    {
                        this.f90983a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        final Throwable th = (Throwable) obj;
                        this.f90983a.this$0.a(new h.f.a.b<d, d>() {
                            /* class com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.c.AnonymousClass3.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(57198);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ d invoke(d dVar) {
                                d dVar2 = dVar;
                                l.d(dVar2, "");
                                Throwable th = th;
                                l.b(th, "");
                                return d.a(new com.bytedance.assem.arch.extensions.h(th), dVar2.f91008b, dVar2.f91009c);
                            }
                        });
                    }
                });
                l.b(a2, "");
                videoCollectionContentViewModel.a(a2);
            }
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<d, z> {
        final /* synthetic */ boolean $firstPage;
        final /* synthetic */ VideoCollectionContentViewModel this$0;

        static {
            Covode.recordClassIndex(57199);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VideoCollectionContentViewModel videoCollectionContentViewModel, boolean z) {
            super(1);
            this.this$0 = videoCollectionContentViewModel;
            this.$firstPage = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(d dVar) {
            long j2;
            d dVar2 = dVar;
            l.d(dVar2, "");
            String str = this.this$0.f90975j;
            if (str != null && (this.$firstPage || dVar2.f91009c)) {
                if (this.$firstPage || (dVar2.f91007a instanceof t) || (dVar2.f91007a instanceof com.bytedance.assem.arch.extensions.h)) {
                    this.this$0.a(AnonymousClass1.f90984a);
                }
                if (this.$firstPage) {
                    j2 = 0;
                } else {
                    j2 = dVar2.f91008b;
                }
                VideoCollectionContentViewModel videoCollectionContentViewModel = this.this$0;
                f.a.b.b a2 = videoCollectionContentViewModel.g().a().a(str, j2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new f.a.d.f(this) {
                    /* class com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.d.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ d f90985a;

                    static {
                        Covode.recordClassIndex(57201);
                    }

                    {
                        this.f90985a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        final com.ss.android.ugc.aweme.favorites.api.c cVar = (com.ss.android.ugc.aweme.favorites.api.c) obj;
                        this.f90985a.this$0.a(new h.f.a.b<d, d>(this) {
                            /* class com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.d.AnonymousClass2.AnonymousClass1 */
                            final /* synthetic */ AnonymousClass2 this$0;

                            static {
                                Covode.recordClassIndex(57202);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ d invoke(d dVar) {
                                Long l2;
                                List<a> a2;
                                int i2;
                                d dVar2 = dVar;
                                l.d(dVar2, "");
                                ALog.d("Collections", "get videos in collection: cursor = " + dVar2.f91008b + ", maxCursor = " + cVar.f90447b);
                                Long l3 = cVar.f90447b;
                                long j2 = dVar2.f91008b;
                                long j3 = 0;
                                if (l3 != null && l3.longValue() == j2 && ((l2 = cVar.f90447b) == null || l2.longValue() != 0)) {
                                    return dVar2;
                                }
                                if (this.this$0.f90985a.$firstPage) {
                                    a2 = h.a.z.INSTANCE;
                                } else {
                                    a2 = dVar2.f91007a.a();
                                    if (a2 == null) {
                                        a2 = h.a.z.INSTANCE;
                                    }
                                }
                                boolean z = false;
                                if (!(a2 instanceof Collection) || !a2.isEmpty()) {
                                    Iterator<T> it = a2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (it.next().f91002b != 0) {
                                                i2 = 0;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                i2 = 1;
                                int i3 = i2 ^ 1;
                                ArrayList arrayList = new ArrayList();
                                if (a2 != null && !a2.isEmpty()) {
                                    arrayList.addAll(a2);
                                }
                                List<Aweme> list = cVar.f90446a;
                                if (list != null && !list.isEmpty()) {
                                    List<Aweme> list2 = cVar.f90446a;
                                    ArrayList arrayList2 = new ArrayList(n.a((Iterable) list2, 10));
                                    Iterator<T> it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(new a(it2.next(), i3));
                                    }
                                    arrayList.addAll(arrayList2);
                                }
                                o oVar = new o(arrayList);
                                Long l4 = cVar.f90447b;
                                if (l4 != null) {
                                    j3 = l4.longValue();
                                }
                                Boolean bool = cVar.f90448c;
                                if (bool != null) {
                                    z = bool.booleanValue();
                                }
                                return new d(oVar, j3, z);
                            }
                        });
                    }
                }, new f.a.d.f(this) {
                    /* class com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.d.AnonymousClass3 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ d f90986a;

                    static {
                        Covode.recordClassIndex(57203);
                    }

                    {
                        this.f90986a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        final Throwable th = (Throwable) obj;
                        this.f90986a.this$0.a(new h.f.a.b<d, d>() {
                            /* class com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.d.AnonymousClass3.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(57204);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ d invoke(d dVar) {
                                d dVar2 = dVar;
                                l.d(dVar2, "");
                                Throwable th = th;
                                l.b(th, "");
                                return d.a(new com.bytedance.assem.arch.extensions.h(th), dVar2.f91008b, dVar2.f91009c);
                            }
                        });
                    }
                });
                l.b(a2, "");
                videoCollectionContentViewModel.a(a2);
            }
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.b<d, d> {
        final /* synthetic */ boolean $inManage;

        static {
            Covode.recordClassIndex(57205);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(boolean z) {
            super(1);
            this.$inManage = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:9:0x003b */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v1, types: [h.a.z] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.ArrayList] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.ss.android.ugc.aweme.favorites.viewmodel.d invoke(com.ss.android.ugc.aweme.favorites.viewmodel.d r6) {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.favorites.viewmodel.d r6 = (com.ss.android.ugc.aweme.favorites.viewmodel.d) r6
                java.lang.String r0 = ""
                h.f.b.l.d(r6, r0)
                com.bytedance.assem.arch.extensions.f<java.util.List<com.ss.android.ugc.aweme.favorites.viewmodel.a>> r0 = r6.f91007a
                java.lang.Object r2 = r0.a()
                java.util.List r2 = (java.util.List) r2
                if (r2 == 0) goto L_0x0039
                java.util.ArrayList r1 = new java.util.ArrayList
                r0 = 10
                int r0 = h.a.n.a(r2, r0)
                r1.<init>(r0)
                java.util.Iterator r4 = r2.iterator()
            L_0x0020:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x003b
                java.lang.Object r0 = r4.next()
                com.ss.android.ugc.aweme.favorites.viewmodel.a r0 = (com.ss.android.ugc.aweme.favorites.viewmodel.a) r0
                com.ss.android.ugc.aweme.favorites.viewmodel.a r3 = new com.ss.android.ugc.aweme.favorites.viewmodel.a
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f91001a
                boolean r0 = r5.$inManage
                r3.<init>(r2, r0)
                r1.add(r3)
                goto L_0x0020
            L_0x0039:
                h.a.z r1 = h.a.z.INSTANCE
            L_0x003b:
                com.bytedance.assem.arch.extensions.o r0 = new com.bytedance.assem.arch.extensions.o
                r0.<init>(r1)
                com.ss.android.ugc.aweme.favorites.viewmodel.d r0 = com.ss.android.ugc.aweme.favorites.viewmodel.d.a(r6, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel.e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public static final class g extends m implements h.f.a.b<d, d> {
        final /* synthetic */ a $aweme;

        static {
            Covode.recordClassIndex(57207);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(a aVar) {
            super(1);
            this.$aweme = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            List list;
            d dVar2 = dVar;
            l.d(dVar2, "");
            List<a> a2 = dVar2.f91007a.a();
            if (a2 != null) {
                list = new ArrayList(n.a((Iterable) a2, 10));
                for (T t : a2) {
                    if (l.a(t.f91001a, this.$aweme.f91001a)) {
                        t = (T) this.$aweme;
                    }
                    list.add(t);
                }
            } else {
                list = h.a.z.INSTANCE;
            }
            return d.a(new o(list), dVar2.f91008b, dVar2.f91009c);
        }
    }
}
