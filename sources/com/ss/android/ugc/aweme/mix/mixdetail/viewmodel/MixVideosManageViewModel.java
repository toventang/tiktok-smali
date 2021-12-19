package com.ss.android.ugc.aweme.mix.mixdetail.viewmodel;

import android.app.Activity;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.f;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class MixVideosManageViewModel extends AssemViewModel<a> implements com.ss.android.ugc.aweme.mix.b {

    /* renamed from: j  reason: collision with root package name */
    public String f110070j = "";

    /* renamed from: k  reason: collision with root package name */
    public String f110071k;

    /* renamed from: l  reason: collision with root package name */
    public String f110072l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f110073m;
    private final h.h n = com.bytedance.assem.arch.a.c.a(this, l.f110084a);
    private final h.h o = h.i.a((h.f.a.a) new d(this));

    static {
        Covode.recordClassIndex(70615);
    }

    @Override // com.ss.android.ugc.aweme.mix.b
    public final String b() {
        return "manage_video";
    }

    public final com.bytedance.ies.powerlist.page.config.b<Long> h() {
        return (com.bytedance.ies.powerlist.page.config.b) this.o.getValue();
    }

    @Override // com.ss.android.ugc.aweme.mix.b
    public final String a() {
        return this.f110070j;
    }

    static final class l extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.a.a<c>> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f110084a = new l();

        static {
            Covode.recordClassIndex(70632);
        }

        l() {
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
    public final /* synthetic */ a f() {
        return new a();
    }

    public final String g() {
        String str = this.f110071k;
        if (str == null) {
            h.f.b.l.a("mMixId");
        }
        return str;
    }

    static final class d extends h.f.b.m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ MixVideosManageViewModel this$0;

        static {
            Covode.recordClassIndex(70619);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(MixVideosManageViewModel mixVideosManageViewModel) {
            super(0);
            this.this$0 = mixVideosManageViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            com.bytedance.ies.powerlist.page.config.c cVar = new com.bytedance.ies.powerlist.page.config.c();
            cVar.f34357b = false;
            cVar.f34356a = 4;
            return new com.bytedance.ies.powerlist.page.config.b<Long>(this, cVar) {
                /* class com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f110074a;

                static {
                    Covode.recordClassIndex(70620);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
                    if (r1 != null) goto L_0x003c;
                 */
                @Override // com.bytedance.ies.powerlist.page.config.d
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void a(h.c.d<? super com.bytedance.ies.powerlist.page.f<java.lang.Long>> r14) {
                    /*
                    // Method dump skipped, instructions count: 108
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel.d.AnonymousClass1.a(h.c.d):void");
                }

                {
                    this.f110074a = r1;
                }

                @Override // com.bytedance.ies.powerlist.page.config.d
                public final /* synthetic */ void b(h.c.d dVar, Object obj) {
                    long longValue = ((Number) obj).longValue();
                    h.f.b.l.d(dVar, "");
                    MixVideosManageViewModel mixVideosManageViewModel = this.f110074a.this$0;
                    h.f.b.l.d(dVar, "");
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    h.f.b.l.b(g2, "");
                    User curUser = g2.getCurUser();
                    int i2 = g.f110159c;
                    z.e eVar = new z.e();
                    eVar.element = null;
                    MixFeedApi a2 = MixFeedApi.a.a();
                    String str = mixVideosManageViewModel.f110071k;
                    if (str == null) {
                        h.f.b.l.a("mMixId");
                    }
                    h.f.b.l.b(curUser, "");
                    String uid = curUser.getUid();
                    h.f.b.l.b(uid, "");
                    String secUid = curUser.getSecUid();
                    h.f.b.l.b(secUid, "");
                    a2.getMixVideos2(str, "", longValue, i2, uid, secUid).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new h(mixVideosManageViewModel, dVar, eVar), new i(dVar));
                }
            };
        }
    }

    public final void a(boolean z) {
        a(new o(z));
    }

    public static final class a extends h.f.b.m implements h.f.a.b<a, a> {
        final /* synthetic */ z.e $result;

        static {
            Covode.recordClassIndex(70616);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(z.e eVar) {
            super(1);
            this.$result = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            return a.a(aVar2, null, this.$result.element, null, null, null, null, this.$result.element, 61);
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.b<a, a> {
        final /* synthetic */ z.e $result;
        final /* synthetic */ List $totalSelectedVideos$inlined;
        final /* synthetic */ List $videos$inlined;
        final /* synthetic */ MixVideosManageViewModel this$0;

        static {
            Covode.recordClassIndex(70617);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(z.e eVar, MixVideosManageViewModel mixVideosManageViewModel, List list, List list2) {
            super(1);
            this.$result = eVar;
            this.this$0 = mixVideosManageViewModel;
            this.$videos$inlined = list;
            this.$totalSelectedVideos$inlined = list2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            return a.a(aVar2, this.$result.element, null, null, null, null, this.$totalSelectedVideos$inlined, null, 94);
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.b<a, a> {
        final /* synthetic */ z.e $addedList$inlined;
        final /* synthetic */ z.e $index$inlined;
        final /* synthetic */ List $list$inlined;
        final /* synthetic */ ArrayList $newAddedList$inlined;
        final /* synthetic */ ArrayList $newDeleteList$inlined;
        final /* synthetic */ List $result$inlined;
        final /* synthetic */ a $state$inlined;
        final /* synthetic */ MixVideosManageViewModel this$0;

        static {
            Covode.recordClassIndex(70621);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(List list, List list2, z.e eVar, a aVar, z.e eVar2, ArrayList arrayList, ArrayList arrayList2, MixVideosManageViewModel mixVideosManageViewModel) {
            super(1);
            this.$result$inlined = list;
            this.$list$inlined = list2;
            this.$index$inlined = eVar;
            this.$state$inlined = aVar;
            this.$addedList$inlined = eVar2;
            this.$newAddedList$inlined = arrayList;
            this.$newDeleteList$inlined = arrayList2;
            this.this$0 = mixVideosManageViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            return a.a(aVar2, this.$result$inlined, this.$newDeleteList$inlined, this.$newAddedList$inlined, null, null, null, null, 120);
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.b<a, a> {
        final /* synthetic */ z.e $index$inlined;
        final /* synthetic */ List $list$inlined;
        final /* synthetic */ List $result$inlined;
        final /* synthetic */ a $state$inlined;
        final /* synthetic */ MixVideosManageViewModel this$0;

        static {
            Covode.recordClassIndex(70622);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(List list, List list2, z.e eVar, a aVar, MixVideosManageViewModel mixVideosManageViewModel) {
            super(1);
            this.$result$inlined = list;
            this.$list$inlined = list2;
            this.$index$inlined = eVar;
            this.$state$inlined = aVar;
            this.this$0 = mixVideosManageViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            return a.a(aVar2, null, null, null, null, new com.bytedance.assem.arch.extensions.a(true), this.$result$inlined, null, 79);
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.b<a, a> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f110075a = new g();

        static {
            Covode.recordClassIndex(70623);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            return a.a(aVar2, null, null, null, null, new com.bytedance.assem.arch.extensions.a(true), null, null, 111);
        }
    }

    static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f110079a;

        static {
            Covode.recordClassIndex(70627);
        }

        i(h.c.d dVar) {
            this.f110079a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            h.c.d dVar = this.f110079a;
            Objects.requireNonNull(th, "null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
            dVar.resumeWith(h.q.m223constructorimpl(f.a.a((Exception) th)));
        }
    }

    static final class j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MixVideosManageViewModel f110080a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.c.d f110081b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f110082c;

        static {
            Covode.recordClassIndex(70628);
        }

        j(MixVideosManageViewModel mixVideosManageViewModel, h.c.d dVar, z.e eVar) {
            this.f110080a = mixVideosManageViewModel;
            this.f110081b = dVar;
            this.f110082c = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final T t = (T) ((com.ss.android.ugc.aweme.mix.api.response.e) obj);
            this.f110080a.b(new h.f.a.b<a, h.z>(this) {
                /* class com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel.j.AnonymousClass1 */
                final /* synthetic */ j this$0;

                static {
                    Covode.recordClassIndex(70629);
                }

                {
                    this.this$0 = r2;
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel$j$1$a */
                static final class a extends h.f.b.m implements h.f.a.b<a, a> {
                    final /* synthetic */ List $list$inlined;
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(70630);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    a(AnonymousClass1 r2, List list) {
                        super(1);
                        this.this$0 = r2;
                        this.$list$inlined = list;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ a invoke(a aVar) {
                        a aVar2 = aVar;
                        h.f.b.l.d(aVar2, "");
                        return a.a(aVar2, this.$list$inlined, null, null, null, null, null, null, 126);
                    }
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(a aVar) {
                    h.f.b.l.d(aVar, "");
                    List<? extends Aweme> list = t.f109800a;
                    this.this$0.f110080a.f110073m = t.f109801b;
                    if (list != null) {
                        this.this$0.f110080a.a(new a(this, list));
                        h.c.d dVar = this.this$0.f110081b;
                        Long valueOf = Long.valueOf(t.f109802c);
                        ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new com.ss.android.ugc.aweme.mix.mixdetail.viewholder.b(it.next()));
                        }
                        dVar.resumeWith(h.q.m223constructorimpl(f.a.a(null, valueOf, arrayList, 1)));
                    }
                    return h.z.f158842a;
                }
            });
            this.f110082c.element = t;
        }
    }

    static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f110083a;

        static {
            Covode.recordClassIndex(70631);
        }

        k(h.c.d dVar) {
            this.f110083a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            h.c.d dVar = this.f110083a;
            Objects.requireNonNull(th, "null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
            dVar.resumeWith(h.q.m223constructorimpl(f.a.a((Exception) th)));
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<a, a> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f110085a = new m();

        static {
            Covode.recordClassIndex(70633);
        }

        m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            return a.a(aVar2, null, null, null, null, new com.bytedance.assem.arch.extensions.a(true), null, null, 111);
        }
    }

    public static final class n extends h.f.b.m implements h.f.a.b<a, a> {
        final /* synthetic */ String $id$inlined;
        final /* synthetic */ z.e $list$inlined;
        final /* synthetic */ z.e $result$inlined;
        final /* synthetic */ MixVideosManageViewModel this$0;

        static {
            Covode.recordClassIndex(70634);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(z.e eVar, z.e eVar2, MixVideosManageViewModel mixVideosManageViewModel, String str) {
            super(1);
            this.$list$inlined = eVar;
            this.$result$inlined = eVar2;
            this.this$0 = mixVideosManageViewModel;
            this.$id$inlined = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            return a.a(aVar2, null, this.$result$inlined.element, null, null, null, null, this.$result$inlined.element, 61);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.b<a, a> {
        final /* synthetic */ ArrayList $newRemove;

        static {
            Covode.recordClassIndex(70636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(ArrayList arrayList) {
            super(1);
            this.$newRemove = arrayList;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            return a.a(aVar2, null, null, null, null, null, null, this.$newRemove, 63);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.b<a, a> {
        final /* synthetic */ z.e $result;

        static {
            Covode.recordClassIndex(70637);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(z.e eVar) {
            super(1);
            this.$result = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            return a.a(aVar2, null, null, this.$result.element, null, null, null, null, 123);
        }
    }

    public static final class s<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MixVideosManageViewModel f110088a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f110089b;

        static {
            Covode.recordClassIndex(70639);
        }

        public s(MixVideosManageViewModel mixVideosManageViewModel, Activity activity) {
            this.f110088a = mixVideosManageViewModel;
            this.f110089b = activity;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            new com.bytedance.tux.g.b(this.f110089b).e(R.string.g21).b();
        }
    }

    static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MixVideosManageViewModel f110076a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.c.d f110077b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f110078c;

        static {
            Covode.recordClassIndex(70624);
        }

        h(MixVideosManageViewModel mixVideosManageViewModel, h.c.d dVar, z.e eVar) {
            this.f110076a = mixVideosManageViewModel;
            this.f110077b = dVar;
            this.f110078c = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            T t = (T) ((com.ss.android.ugc.aweme.mix.api.response.e) obj);
            this.f110076a.d().a();
            List<? extends Aweme> list = t.f109800a;
            this.f110076a.f110073m = t.f109801b;
            this.f110076a.b(new a(list, this, t));
            this.f110078c.element = t;
        }

        static final class a extends h.f.b.m implements h.f.a.b<a, h.z> {
            final /* synthetic */ List $newData;
            final /* synthetic */ com.ss.android.ugc.aweme.mix.api.response.e $response$inlined;
            final /* synthetic */ h this$0;

            static {
                Covode.recordClassIndex(70625);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List list, h hVar, com.ss.android.ugc.aweme.mix.api.response.e eVar) {
                super(1);
                this.$newData = list;
                this.this$0 = hVar;
                this.$response$inlined = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(a aVar) {
                a aVar2 = aVar;
                h.f.b.l.d(aVar2, "");
                List<Aweme> list = aVar2.f110133a;
                final z.e eVar = new z.e();
                eVar.element = (T) new ArrayList();
                if (list != null) {
                    eVar.element.addAll(h.a.n.k(list));
                    T t = eVar.element;
                    List list2 = this.$newData;
                    com.ss.android.ugc.aweme.feed.adapter.j.a(t, list2 != null ? h.a.n.k(list2) : null);
                }
                this.this$0.f110076a.a(new h.f.a.b<a, a>() {
                    /* class com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel.h.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(70626);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ a invoke(a aVar) {
                        a aVar2 = aVar;
                        h.f.b.l.d(aVar2, "");
                        return a.a(aVar2, eVar.element, null, null, null, null, null, null, 126);
                    }
                });
                if (this.this$0.f110076a.f110073m) {
                    h.c.d dVar = this.this$0.f110077b;
                    Long valueOf = Long.valueOf(this.$response$inlined.f109802c);
                    List<T> list3 = this.$newData;
                    if (list3 == null) {
                        h.f.b.l.b();
                    }
                    ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list3, 10));
                    for (T t2 : list3) {
                        arrayList.add(new com.ss.android.ugc.aweme.mix.mixdetail.viewholder.b(t2));
                    }
                    dVar.resumeWith(h.q.m223constructorimpl(f.a.a(null, valueOf, arrayList, 1)));
                } else {
                    this.this$0.f110077b.resumeWith(h.q.m223constructorimpl(f.a.a(h.a.z.INSTANCE)));
                }
                return h.z.f158842a;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.f.b.m implements h.f.a.b<a, a> {
        final /* synthetic */ boolean $event;

        static {
            Covode.recordClassIndex(70635);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(boolean z) {
            super(1);
            this.$event = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            ArrayList arrayList = null;
            if (!this.$event) {
                List<Aweme> list = aVar2.f110133a;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList(h.a.n.a((Iterable) list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(it.next().getAid());
                    }
                    ArrayList arrayList3 = arrayList2;
                    List<String> list2 = aVar2.f110134b;
                    if (list2 != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (T t : list2) {
                            if (!arrayList3.contains(t)) {
                                arrayList4.add(t);
                            }
                        }
                        arrayList = arrayList4;
                    }
                }
            } else {
                arrayList = aVar2.f110134b;
            }
            return a.a(aVar2, null, arrayList, null, new com.bytedance.assem.arch.extensions.a(Boolean.valueOf(this.$event)), null, null, null, 117);
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.b<a, a> {
        final /* synthetic */ List $totalSelectedVideos$inlined;
        final /* synthetic */ List $videos$inlined;
        final /* synthetic */ MixVideosManageViewModel this$0;

        static {
            Covode.recordClassIndex(70618);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(MixVideosManageViewModel mixVideosManageViewModel, List list, List list2) {
            super(1);
            this.this$0 = mixVideosManageViewModel;
            this.$videos$inlined = list;
            this.$totalSelectedVideos$inlined = list2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            MixVideosManageViewModel mixVideosManageViewModel = this.this$0;
            List<Aweme> list = this.$videos$inlined;
            a aVar3 = (a) mixVideosManageViewModel.d().a();
            List<String> list2 = aVar3.f110135c;
            z.e eVar = new z.e();
            eVar.element = (T) new ArrayList();
            if (list2 != null) {
                eVar.element.addAll(h.a.n.k(list2));
                T t = eVar.element;
                ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
                for (Aweme aweme : list) {
                    arrayList.add(aweme.getAid());
                }
                t.addAll(0, arrayList);
            }
            int size = eVar.element.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int i4 = i3 - i2;
                Object obj = eVar.element.get(i4);
                h.f.b.l.b(obj, "");
                List<String> list3 = aVar3.f110134b;
                if (list3 != null && list3.contains(obj)) {
                    eVar.element.remove(i4);
                    i2++;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            List<String> list4 = aVar3.f110139g;
            if (list4 != null) {
                for (String str : list4) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (h.f.b.l.a((Object) str, (Object) ((Aweme) it.next()).getAid())) {
                                break;
                            }
                        } else {
                            arrayList2.add(str);
                            break;
                        }
                    }
                }
            }
            mixVideosManageViewModel.a(new p(arrayList2));
            mixVideosManageViewModel.a(new q(eVar));
            return a.a(aVar2, null, null, null, null, new com.bytedance.assem.arch.extensions.a(true), null, null, 111);
        }
    }

    public static final class r<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MixVideosManageViewModel f110086a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f110087b;

        static {
            Covode.recordClassIndex(70638);
        }

        public r(MixVideosManageViewModel mixVideosManageViewModel, Activity activity) {
            this.f110086a = mixVideosManageViewModel;
            this.f110087b = activity;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 8 out of bounds for length 8
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(java.lang.Object r12) {
            /*
            // Method dump skipped, instructions count: 138
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel.r.accept(java.lang.Object):void");
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.b
    public final void a(int i2, int i3) {
        if (i2 != i3) {
            List<Aweme> list = ((a) d().a()).f110133a;
            if (list != null) {
                Collections.swap(list, i2, i3);
            }
            a(m.f110085a);
        }
    }

    public final void a(String str, String str2, String str3) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(str3, "");
        this.f110071k = str;
        this.f110072l = str2;
        this.f110070j = str3;
    }
}
