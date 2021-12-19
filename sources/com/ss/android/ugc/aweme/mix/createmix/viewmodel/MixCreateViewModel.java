package com.ss.android.ugc.aweme.mix.createmix.viewmodel;

import android.text.TextUtils;
import com.bytedance.assem.arch.extensions.n;
import com.bytedance.assem.arch.extensions.o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class MixCreateViewModel extends AssemViewModel<a> implements com.ss.android.ugc.aweme.mix.b {
    public static final a n = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public String f109869j = "";

    /* renamed from: k  reason: collision with root package name */
    public String f109870k = "";

    /* renamed from: l  reason: collision with root package name */
    public String f109871l = "";

    /* renamed from: m  reason: collision with root package name */
    public Aweme f109872m;
    private final h.h o = com.bytedance.assem.arch.a.c.a(this, b.f109873a);

    static {
        Covode.recordClassIndex(70395);
    }

    @Override // com.ss.android.ugc.aweme.mix.b
    public final String b() {
        return "create_playlist";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(70396);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.b
    public final String a() {
        return this.f109870k;
    }

    static final class b extends m implements h.f.a.a<com.bytedance.assem.arch.a.a<com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.c>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f109873a = new b();

        static {
            Covode.recordClassIndex(70397);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.assem.arch.a.a<com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.c> invoke() {
            return new com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.b();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ a f() {
        return new a();
    }

    public final boolean h() {
        return ((a) d().a()).f109894k;
    }

    public final void i() {
        b(new h(this));
    }

    public final String g() {
        String str = ((a) d().a()).f109888e;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final void a(b bVar) {
        l.d(bVar, "");
        a(new c(bVar));
    }

    public final void b(String str) {
        l.d(str, "");
        c(new g(str));
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<a, a> {
        final /* synthetic */ b $enum;

        static {
            Covode.recordClassIndex(70398);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(1);
            this.$enum = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            return a.a(aVar2, null, null, null, null, null, new com.bytedance.assem.arch.extensions.a(this.$enum), null, null, null, null, false, 2015);
        }
    }

    static final class d extends m implements h.f.a.b<a, a> {
        final /* synthetic */ boolean $flag;

        static {
            Covode.recordClassIndex(70399);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(boolean z) {
            super(1);
            this.$flag = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            return a.a(aVar2, null, null, null, null, null, null, null, null, null, null, this.$flag, 1023);
        }
    }

    static final class e extends m implements h.f.a.b<a, a> {
        final /* synthetic */ String $mixId;

        static {
            Covode.recordClassIndex(70400);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(1);
            this.$mixId = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            return a.a(aVar2, null, null, null, null, null, null, null, null, this.$mixId, null, false, 1791);
        }
    }

    public static final class f extends m implements h.f.a.b<a, a> {
        final /* synthetic */ List $date;

        static {
            Covode.recordClassIndex(70401);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(List list) {
            super(1);
            this.$date = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            return a.a(aVar2, null, null, this.$date, null, null, null, null, null, null, null, false, 2043);
        }
    }

    static final class g extends m implements h.f.a.b<a, a> {
        final /* synthetic */ String $mixName;

        static {
            Covode.recordClassIndex(70402);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(String str) {
            super(1);
            this.$mixName = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            return a.a(aVar2, null, null, null, null, this.$mixName, null, null, null, null, null, false, 2031);
        }
    }

    public final void a(String str) {
        l.d(str, "");
        a(new e(str));
        this.f109869j = str;
    }

    public final void a(boolean z) {
        a(new d(z));
    }

    static final class h extends m implements h.f.a.b<a, z> {
        final /* synthetic */ MixCreateViewModel this$0;

        static {
            Covode.recordClassIndex(70403);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(MixCreateViewModel mixCreateViewModel) {
            super(1);
            this.this$0 = mixCreateViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(a aVar) {
            final a aVar2 = aVar;
            l.d(aVar2, "");
            final String str = null;
            if (aVar2.f109894k) {
                if (!(aVar2.f109890g instanceof n)) {
                    this.this$0.c(AnonymousClass1.f109874a);
                    List<Aweme> list = aVar2.f109886c;
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            T next = it.next();
                            if (next.getCommerceVideoAuthInfo() != null) {
                                com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo = next.getCommerceVideoAuthInfo();
                                l.b(commerceVideoAuthInfo, "");
                                if (commerceVideoAuthInfo.getDarkPostStatus() == 1) {
                                    this.this$0.a(AnonymousClass3.f109876a);
                                    break;
                                }
                            }
                        }
                    }
                    List<Aweme> list2 = aVar2.f109886c;
                    if (list2 != null) {
                        ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list2, 10));
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().getAid());
                        }
                        str = h.a.n.a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62);
                    }
                    MixCreateViewModel mixCreateViewModel = this.this$0;
                    f.a.b.b a2 = MixFeedApi.a.a().manageMixFeed(MixFeedApi.b.MIXCREATE.getOperation(), aVar2.f109892i, "[" + str + ']', "", "null", aVar2.f109888e).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f(this) {
                        /* class com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel.h.AnonymousClass4 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ h f109877a;

                        static {
                            Covode.recordClassIndex(70408);
                        }

                        {
                            this.f109877a = r1;
                        }

                        @Override // f.a.d.f
                        public final /* synthetic */ void accept(Object obj) {
                            List<Aweme> list;
                            final com.ss.android.ugc.aweme.mix.api.response.b bVar = (com.ss.android.ugc.aweme.mix.api.response.b) obj;
                            this.f109877a.this$0.a(new h.f.a.b<a, a>() {
                                /* class com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel.h.AnonymousClass4.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(70409);
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // h.f.a.b
                                public final /* synthetic */ a invoke(a aVar) {
                                    a aVar2 = aVar;
                                    l.d(aVar2, "");
                                    return a.a(aVar2, null, null, null, null, null, null, new o(bVar), null, null, null, false, 1983);
                                }
                            });
                            if (!TextUtils.isEmpty(str) && (list = aVar2.f109886c) != null) {
                                com.ss.android.ugc.aweme.mix.a.a.a(bVar.f109797a, list.size(), this.f109877a.this$0.f109870k, this.f109877a.this$0.f109871l);
                            }
                        }
                    }, new f.a.d.f(this) {
                        /* class com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel.h.AnonymousClass5 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ h f109880a;

                        static {
                            Covode.recordClassIndex(70410);
                        }

                        {
                            this.f109880a = r1;
                        }

                        @Override // f.a.d.f
                        public final /* synthetic */ void accept(Object obj) {
                            final Throwable th = (Throwable) obj;
                            this.f109880a.this$0.a(new h.f.a.b<a, a>() {
                                /* class com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel.h.AnonymousClass5.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(70411);
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // h.f.a.b
                                public final /* synthetic */ a invoke(a aVar) {
                                    a aVar2 = aVar;
                                    l.d(aVar2, "");
                                    Throwable th = th;
                                    l.b(th, "");
                                    return a.a(aVar2, null, null, null, null, null, null, new com.bytedance.assem.arch.extensions.h(th), null, null, null, false, 1983);
                                }
                            });
                        }
                    });
                    l.b(a2, "");
                    mixCreateViewModel.a(a2);
                }
            } else if (!(aVar2.f109891h instanceof n)) {
                this.this$0.c(AnonymousClass6.f109881a);
                List<Aweme> list3 = aVar2.f109886c;
                if (list3 != null) {
                    Iterator<T> it3 = list3.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        T next2 = it3.next();
                        if (next2.getCommerceVideoAuthInfo() != null) {
                            com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo2 = next2.getCommerceVideoAuthInfo();
                            l.b(commerceVideoAuthInfo2, "");
                            if (commerceVideoAuthInfo2.getDarkPostStatus() == 1) {
                                this.this$0.a(AnonymousClass7.f109882a);
                                break;
                            }
                        }
                    }
                }
                List<Aweme> list4 = aVar2.f109886c;
                if (list4 != null) {
                    ArrayList arrayList2 = new ArrayList(h.a.n.a((Iterable) list4, 10));
                    Iterator<T> it4 = list4.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(it4.next().getAid());
                    }
                    str = h.a.n.a(arrayList2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62);
                }
                MixCreateViewModel mixCreateViewModel2 = this.this$0;
                f.a.b.b a3 = MixFeedApi.a.a().manageMixFeed(MixFeedApi.b.VIDEOADD.getOperation(), aVar2.f109892i, "", "[" + str + ']', "null", aVar2.f109888e).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f(this) {
                    /* class com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel.h.AnonymousClass8 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ h f109883a;

                    static {
                        Covode.recordClassIndex(70414);
                    }

                    {
                        this.f109883a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        final com.ss.android.ugc.aweme.mix.api.response.b bVar = (com.ss.android.ugc.aweme.mix.api.response.b) obj;
                        this.f109883a.this$0.a(new h.f.a.b<a, a>() {
                            /* class com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel.h.AnonymousClass8.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(70415);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ a invoke(a aVar) {
                                a aVar2 = aVar;
                                l.d(aVar2, "");
                                return a.a(aVar2, null, null, null, null, null, null, null, new o(bVar), null, null, false, 1919);
                            }
                        });
                    }
                }, new f.a.d.f(this) {
                    /* class com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel.h.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ h f109875a;

                    static {
                        Covode.recordClassIndex(70405);
                    }

                    {
                        this.f109875a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        final Throwable th = (Throwable) obj;
                        this.f109875a.this$0.a(new h.f.a.b<a, a>() {
                            /* class com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel.h.AnonymousClass2.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(70406);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ a invoke(a aVar) {
                                a aVar2 = aVar;
                                l.d(aVar2, "");
                                Throwable th = th;
                                l.b(th, "");
                                return a.a(aVar2, null, null, null, null, null, null, null, new com.bytedance.assem.arch.extensions.h(th), null, null, false, 1919);
                            }
                        });
                    }
                });
                l.b(a3, "");
                mixCreateViewModel2.a(a3);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.b
    public final void a(int i2, int i3) {
        List<Aweme> list;
        if (i2 != i3 && (list = ((a) d().a()).f109886c) != null) {
            Collections.swap(list, i2, i3);
        }
    }
}
