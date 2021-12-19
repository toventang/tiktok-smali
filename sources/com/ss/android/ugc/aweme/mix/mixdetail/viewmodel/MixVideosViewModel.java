package com.ss.android.ugc.aweme.mix.mixdetail.viewmodel;

import android.os.SystemClock;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.config.OptimizeAbility;
import com.bytedance.ies.powerlist.page.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.utils.fs;
import h.f.b.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class MixVideosViewModel extends AssemViewModel<d> {

    /* renamed from: j  reason: collision with root package name */
    public final String f110090j = "PLAYLIST_VIDEO_LIST";

    /* renamed from: k  reason: collision with root package name */
    public final String f110091k = "PLAYLIST_DETAIL";

    /* renamed from: l  reason: collision with root package name */
    public String f110092l = "";

    /* renamed from: m  reason: collision with root package name */
    public String f110093m = "";
    public Aweme n;
    public Aweme o;
    public boolean p;
    public boolean q;
    public long r;
    public long s;
    public String t = "";
    public String u = "";
    public String v = "";
    public String w = "";
    public long x = -1;
    private final h.h y = com.bytedance.assem.arch.a.c.a(this, q.f110125a);
    private final h.h z = h.i.a((h.f.a.a) new b(this));

    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f110099a = new d();

        static {
            Covode.recordClassIndex(70652);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f110100a = new e();

        static {
            Covode.recordClassIndex(70653);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final i f110107a = new i();

        static {
            Covode.recordClassIndex(70661);
        }

        i() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class m<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final m f110117a = new m();

        static {
            Covode.recordClassIndex(70671);
        }

        m() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final u f110128a = new u();

        static {
            Covode.recordClassIndex(70683);
        }

        u() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class w<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final w f110131a = new w();

        static {
            Covode.recordClassIndex(70688);
        }

        w() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(70640);
    }

    public final com.bytedance.ies.powerlist.page.config.b<Long> g() {
        return (com.bytedance.ies.powerlist.page.config.b) this.z.getValue();
    }

    static final class q extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.a.a<c>> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f110125a = new q();

        static {
            Covode.recordClassIndex(70679);
        }

        q() {
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

    public final List<Aweme> j() {
        return ((d) d().a()).f110141a;
    }

    public final String l() {
        String str;
        if (this.n == null || (str = this.v) == null) {
            return "";
        }
        return str;
    }

    public final String k() {
        Aweme aweme = this.n;
        if (aweme != null) {
            String authorUid = aweme.getAuthorUid();
            if (authorUid == null) {
                return "";
            }
            return authorUid;
        }
        String str = this.u;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final void m() {
        c(a.f110094a);
        this.v = "";
        this.u = "";
        this.n = null;
        this.q = false;
        this.p = false;
        this.s = 0;
        this.r = 0;
        this.f110093m = "";
        this.f110092l = "";
    }

    static final class b extends h.f.b.m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ MixVideosViewModel this$0;

        static {
            Covode.recordClassIndex(70647);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(MixVideosViewModel mixVideosViewModel) {
            super(0);
            this.this$0 = mixVideosViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            com.bytedance.ies.powerlist.page.config.c cVar = new com.bytedance.ies.powerlist.page.config.c();
            cVar.f34357b = false;
            cVar.f34356a = 4;
            if (com.ss.android.ugc.aweme.mix.mixdetail.b.a()) {
                cVar.f34364i = "mix_video_dialog_v2";
                cVar.f34359d = true;
                cVar.f34360e = true;
                cVar.f34363h = new OptimizeAbility(true, 16);
            }
            return new com.bytedance.ies.powerlist.page.config.b<Long>(this, cVar) {
                /* class com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f110096a;

                static {
                    Covode.recordClassIndex(70648);
                }

                @Override // com.bytedance.ies.powerlist.page.config.d
                public final void a(h.c.d<? super com.bytedance.ies.powerlist.page.f<Long>> dVar) {
                    Long l2;
                    h.f.b.l.d(dVar, "");
                    MixVideosViewModel mixVideosViewModel = this.f110096a.this$0;
                    h.f.b.l.d(dVar, "");
                    z.c cVar = new z.c();
                    cVar.element = g.f110157a;
                    if (!com.bytedance.common.utility.m.a(mixVideosViewModel.f110093m)) {
                        cVar.element = g.f110160d;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    mixVideosViewModel.i();
                    List<Aweme> list = ((d) mixVideosViewModel.d().a()).f110141a;
                    if (list == null) {
                        MixFeedApi.a.a().getMixVideos2(mixVideosViewModel.f110092l, mixVideosViewModel.f110093m, 0, cVar.element, mixVideosViewModel.k(), mixVideosViewModel.l()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new n(mixVideosViewModel, cVar, dVar, elapsedRealtime), new o(dVar));
                    } else if (list.isEmpty()) {
                        dVar.resumeWith(h.q.m223constructorimpl(f.a.a(h.a.z.INSTANCE)));
                    } else {
                        if (mixVideosViewModel.q || mixVideosViewModel.p) {
                            Long l3 = null;
                            if (mixVideosViewModel.q) {
                                l2 = Long.valueOf(mixVideosViewModel.s);
                            } else {
                                l2 = null;
                            }
                            if (mixVideosViewModel.p) {
                                l3 = Long.valueOf(mixVideosViewModel.r);
                            }
                            ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new com.ss.android.ugc.aweme.mix.mixdetail.viewholder.b(it.next()));
                            }
                            dVar.resumeWith(h.q.m223constructorimpl(f.a.a(l3, l2, arrayList)));
                        } else {
                            ArrayList arrayList2 = new ArrayList(h.a.n.a((Iterable) list, 10));
                            Iterator<T> it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(new com.ss.android.ugc.aweme.mix.mixdetail.viewholder.b(it2.next()));
                            }
                            dVar.resumeWith(h.q.m223constructorimpl(f.a.a(arrayList2)));
                        }
                        if (mixVideosViewModel.o != null) {
                            mixVideosViewModel.a(mixVideosViewModel.o);
                        }
                    }
                }

                {
                    this.f110096a = r1;
                }

                @Override // com.bytedance.ies.powerlist.page.config.d
                public final /* synthetic */ void a(h.c.d dVar, Object obj) {
                    ((Number) obj).longValue();
                    h.f.b.l.d(dVar, "");
                    MixVideosViewModel mixVideosViewModel = this.f110096a.this$0;
                    h.f.b.l.d(dVar, "");
                    int i2 = g.f110158b;
                    MixFeedApi.a.a().getMixVideos2(mixVideosViewModel.f110092l, "", mixVideosViewModel.r, i2, mixVideosViewModel.k(), mixVideosViewModel.l()).a(e.f110100a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f(mixVideosViewModel, i2, dVar), new g(dVar));
                }

                @Override // com.bytedance.ies.powerlist.page.config.d
                public final /* synthetic */ void b(h.c.d dVar, Object obj) {
                    ((Number) obj).longValue();
                    h.f.b.l.d(dVar, "");
                    MixVideosViewModel mixVideosViewModel = this.f110096a.this$0;
                    h.f.b.l.d(dVar, "");
                    int i2 = g.f110159c;
                    MixFeedApi.a.a().getMixVideos2(mixVideosViewModel.f110092l, "", mixVideosViewModel.s, i2, mixVideosViewModel.k(), mixVideosViewModel.l()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new j(mixVideosViewModel, i2, dVar), new k(dVar));
                }
            };
        }
    }

    public final void h() {
        h.f.b.l.b(MixFeedApi.a.a().manageMixFeed(MixFeedApi.b.MIXDELETE.getOperation(), this.f110092l, null, null, null, "").b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new s(this), new t(this)), "");
    }

    public final void i() {
        h.f.b.l.b(MixFeedApi.a.a().getMixDetail(k(), l(), this.f110092l).c(u.f110128a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new v(this, SystemClock.elapsedRealtime()), w.f110131a), "");
    }

    static final class t<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MixVideosViewModel f110127a;

        static {
            Covode.recordClassIndex(70682);
        }

        t(MixVideosViewModel mixVideosViewModel) {
            this.f110127a = mixVideosViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f110127a.a(false);
        }
    }

    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MixVideosViewModel f110097a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f110098b;

        static {
            Covode.recordClassIndex(70649);
        }

        public c(MixVideosViewModel mixVideosViewModel, int i2) {
            this.f110097a = mixVideosViewModel;
            this.f110098b = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final com.ss.android.ugc.aweme.mix.api.response.e eVar = (com.ss.android.ugc.aweme.mix.api.response.e) obj;
            this.f110097a.b(new h.f.a.b<d, h.z>(this) {
                /* class com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(70650);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(d dVar) {
                    h.f.b.l.d(dVar, "");
                    List<? extends Aweme> list = eVar.f109800a;
                    ArrayList arrayList = new ArrayList();
                    this.this$0.f110097a.r = eVar.f109803e;
                    this.this$0.f110097a.p = eVar.f109801b;
                    if (list != null) {
                        this.this$0.f110097a.a(new a(this, arrayList, list));
                    }
                    return h.z.f158842a;
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$c$1$a */
                static final class a extends h.f.b.m implements h.f.a.b<d, d> {
                    final /* synthetic */ List $list$inlined;
                    final /* synthetic */ List $prev$inlined;
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(70651);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    a(AnonymousClass1 r2, List list, List list2) {
                        super(1);
                        this.this$0 = r2;
                        this.$prev$inlined = list;
                        this.$list$inlined = list2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ d invoke(d dVar) {
                        ArrayList arrayList;
                        d dVar2 = dVar;
                        h.f.b.l.d(dVar2, "");
                        List<Aweme> list = dVar2.f110141a;
                        if (list != null) {
                            ArrayList arrayList2 = new ArrayList(h.a.n.a((Iterable) list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(it.next().getAid());
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList = h.a.z.INSTANCE;
                        }
                        List list2 = this.$prev$inlined;
                        List list3 = this.$list$inlined;
                        ArrayList arrayList3 = new ArrayList();
                        for (T t : list3) {
                            if (!arrayList.contains(t.getAid())) {
                                arrayList3.add(t);
                            }
                        }
                        list2.addAll(arrayList3);
                        return d.a(dVar2, MixVideosViewModel.a(this.$list$inlined, dVar2.f110141a), null, null, this.this$0.this$0.f110098b, false, 0, null, null, null, 502);
                    }
                }
            });
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MixVideosViewModel f110101a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f110102b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.c.d f110103c;

        static {
            Covode.recordClassIndex(70654);
        }

        f(MixVideosViewModel mixVideosViewModel, int i2, h.c.d dVar) {
            this.f110101a = mixVideosViewModel;
            this.f110102b = i2;
            this.f110103c = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final com.ss.android.ugc.aweme.mix.api.response.e eVar = (com.ss.android.ugc.aweme.mix.api.response.e) obj;
            this.f110101a.b(new h.f.a.b<d, h.z>(this) {
                /* class com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel.f.AnonymousClass1 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(70655);
                }

                {
                    this.this$0 = r2;
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$f$1$a */
                static final class a extends h.f.b.m implements h.f.a.b<d, d> {
                    final /* synthetic */ List $list$inlined;
                    final /* synthetic */ List $prev$inlined;
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(70656);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    a(AnonymousClass1 r2, List list, List list2) {
                        super(1);
                        this.this$0 = r2;
                        this.$prev$inlined = list;
                        this.$list$inlined = list2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ d invoke(d dVar) {
                        ArrayList arrayList;
                        d dVar2 = dVar;
                        h.f.b.l.d(dVar2, "");
                        List<Aweme> list = dVar2.f110141a;
                        if (list != null) {
                            ArrayList arrayList2 = new ArrayList(h.a.n.a((Iterable) list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(it.next().getAid());
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList = h.a.z.INSTANCE;
                        }
                        List list2 = this.$prev$inlined;
                        List list3 = this.$list$inlined;
                        ArrayList arrayList3 = new ArrayList();
                        for (T t : list3) {
                            if (!arrayList.contains(t.getAid())) {
                                arrayList3.add(t);
                            }
                        }
                        list2.addAll(arrayList3);
                        return d.a(dVar2, MixVideosViewModel.a(this.$prev$inlined, dVar2.f110141a), null, null, this.this$0.this$0.f110102b, false, 0, null, null, null, 502);
                    }
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(d dVar) {
                    h.f.b.l.d(dVar, "");
                    List<? extends Aweme> list = eVar.f109800a;
                    ArrayList<T> arrayList = new ArrayList();
                    this.this$0.f110101a.r = eVar.f109803e;
                    this.this$0.f110101a.p = eVar.f109801b;
                    if (list != null) {
                        this.this$0.f110101a.a(new a(this, arrayList, list));
                    }
                    if (this.this$0.f110101a.p) {
                        h.c.d dVar2 = this.this$0.f110103c;
                        Long valueOf = Long.valueOf(eVar.f109803e);
                        ArrayList arrayList2 = new ArrayList(h.a.n.a((Iterable) arrayList, 10));
                        for (T t : arrayList) {
                            arrayList2.add(new com.ss.android.ugc.aweme.mix.mixdetail.viewholder.b(t));
                        }
                        dVar2.resumeWith(h.q.m223constructorimpl(f.a.a(valueOf, null, arrayList2, 2)));
                    } else {
                        h.c.d dVar3 = this.this$0.f110103c;
                        ArrayList arrayList3 = new ArrayList(h.a.n.a((Iterable) arrayList, 10));
                        for (T t2 : arrayList) {
                            arrayList3.add(new com.ss.android.ugc.aweme.mix.mixdetail.viewholder.b(t2));
                        }
                        dVar3.resumeWith(h.q.m223constructorimpl(f.a.a(arrayList3)));
                    }
                    return h.z.f158842a;
                }
            });
        }
    }

    static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MixVideosViewModel f110105a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f110106b;

        static {
            Covode.recordClassIndex(70658);
        }

        h(MixVideosViewModel mixVideosViewModel, int i2) {
            this.f110105a = mixVideosViewModel;
            this.f110106b = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final com.ss.android.ugc.aweme.mix.api.response.e eVar = (com.ss.android.ugc.aweme.mix.api.response.e) obj;
            this.f110105a.b(new h.f.a.b<d, h.z>(this) {
                /* class com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel.h.AnonymousClass1 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(70659);
                }

                {
                    this.this$0 = r2;
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$h$1$a */
                static final class a extends h.f.b.m implements h.f.a.b<d, d> {
                    final /* synthetic */ List $list$inlined;
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(70660);
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
                    public final /* synthetic */ d invoke(d dVar) {
                        d dVar2 = dVar;
                        h.f.b.l.d(dVar2, "");
                        return d.a(dVar2, MixVideosViewModel.a(dVar2.f110141a, this.$list$inlined), null, null, this.this$0.this$0.f110106b, false, 0, null, null, null, 502);
                    }
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(d dVar) {
                    h.f.b.l.d(dVar, "");
                    List<? extends Aweme> list = eVar.f109800a;
                    this.this$0.f110105a.s = eVar.f109802c;
                    this.this$0.f110105a.q = eVar.f109801b;
                    if (list != null) {
                        this.this$0.f110105a.a(new a(this, list));
                    }
                    return h.z.f158842a;
                }
            });
        }
    }

    static final class j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MixVideosViewModel f110108a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f110109b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.c.d f110110c;

        static {
            Covode.recordClassIndex(70662);
        }

        j(MixVideosViewModel mixVideosViewModel, int i2, h.c.d dVar) {
            this.f110108a = mixVideosViewModel;
            this.f110109b = i2;
            this.f110110c = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final com.ss.android.ugc.aweme.mix.api.response.e eVar = (com.ss.android.ugc.aweme.mix.api.response.e) obj;
            this.f110108a.b(new h.f.a.b<d, h.z>(this) {
                /* class com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel.j.AnonymousClass1 */
                final /* synthetic */ j this$0;

                static {
                    Covode.recordClassIndex(70663);
                }

                {
                    this.this$0 = r2;
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$j$1$a */
                static final class a extends h.f.b.m implements h.f.a.b<d, d> {
                    final /* synthetic */ List $list$inlined;
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(70664);
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
                    public final /* synthetic */ d invoke(d dVar) {
                        d dVar2 = dVar;
                        h.f.b.l.d(dVar2, "");
                        return d.a(dVar2, MixVideosViewModel.a(dVar2.f110141a, this.$list$inlined), null, null, this.this$0.this$0.f110109b, false, 0, null, null, null, 502);
                    }
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(d dVar) {
                    h.f.b.l.d(dVar, "");
                    List<? extends Aweme> list = eVar.f109800a;
                    this.this$0.f110108a.s = eVar.f109802c;
                    this.this$0.f110108a.q = eVar.f109801b;
                    if (list != null) {
                        this.this$0.f110108a.a(new a(this, list));
                    }
                    List<? extends Aweme> list2 = eVar.f109800a;
                    if (this.this$0.f110108a.q) {
                        if (list2 != null) {
                            h.c.d dVar2 = this.this$0.f110110c;
                            Long valueOf = Long.valueOf(eVar.f109802c);
                            ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list2, 10));
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new com.ss.android.ugc.aweme.mix.mixdetail.viewholder.b(it.next()));
                            }
                            dVar2.resumeWith(h.q.m223constructorimpl(f.a.a(null, valueOf, arrayList, 1)));
                        }
                    } else if (list2 != null) {
                        h.c.d dVar3 = this.this$0.f110110c;
                        ArrayList arrayList2 = new ArrayList(h.a.n.a((Iterable) list2, 10));
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new com.ss.android.ugc.aweme.mix.mixdetail.viewholder.b(it2.next()));
                        }
                        dVar3.resumeWith(h.q.m223constructorimpl(f.a.a(arrayList2)));
                    }
                    return h.z.f158842a;
                }
            });
        }
    }

    static final class s<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MixVideosViewModel f110126a;

        static {
            Covode.recordClassIndex(70681);
        }

        s(MixVideosViewModel mixVideosViewModel) {
            this.f110126a = mixVideosViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (((com.ss.android.ugc.aweme.mix.api.response.b) obj).status_code == 0) {
                this.f110126a.a(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MixVideosViewModel f110129a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f110130b;

        static {
            Covode.recordClassIndex(70684);
        }

        v(MixVideosViewModel mixVideosViewModel, long j2) {
            this.f110129a = mixVideosViewModel;
            this.f110130b = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final com.ss.android.ugc.aweme.mix.api.response.d dVar = (com.ss.android.ugc.aweme.mix.api.response.d) obj;
            this.f110129a.b(new h.f.a.b<d, h.z>(this) {
                /* class com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel.v.AnonymousClass1 */
                final /* synthetic */ v this$0;

                static {
                    Covode.recordClassIndex(70685);
                }

                {
                    this.this$0 = r2;
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$v$1$a */
                static final class a extends h.f.b.m implements h.f.a.b<d, d> {
                    final /* synthetic */ com.ss.android.ugc.aweme.mix.model.d $it;

                    static {
                        Covode.recordClassIndex(70687);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    a(com.ss.android.ugc.aweme.mix.model.d dVar) {
                        super(1);
                        this.$it = dVar;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ d invoke(d dVar) {
                        d dVar2 = dVar;
                        h.f.b.l.d(dVar2, "");
                        return d.a(dVar2, null, null, null, 0, false, 0, this.$it, null, null, 447);
                    }
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(d dVar) {
                    h.f.b.l.d(dVar, "");
                    com.ss.android.ugc.aweme.mix.model.d dVar2 = dVar.f109798a;
                    if (dVar2 != null) {
                        this.this$0.f110129a.a(new a(dVar2));
                    }
                    if (this.this$0.f110129a.x > 0) {
                        fs.a(this.this$0.f110129a.w, this.this$0.f110129a.f110091k, this.this$0.f110129a.x, this.this$0.f110130b, SystemClock.elapsedRealtime(), com.ss.android.ugc.aweme.network.a.f.a(), new fs.a() {
                            /* class com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel.v.AnonymousClass1.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(70686);
                            }

                            @Override // com.ss.android.ugc.aweme.utils.fs.a
                            public final void a(String str, Map<String, String> map) {
                                h.f.b.l.d(str, "");
                                h.f.b.l.d(map, "");
                                com.ss.android.ugc.aweme.common.r.a(str, map);
                            }
                        });
                    }
                    return h.z.f158842a;
                }
            });
        }
    }

    public static final class y extends h.f.b.m implements h.f.a.b<d, h.z> {
        final /* synthetic */ MixVideosViewModel this$0;

        static {
            Covode.recordClassIndex(70690);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public y(MixVideosViewModel mixVideosViewModel) {
            super(1);
            this.this$0 = mixVideosViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(d dVar) {
            h.f.b.l.d(dVar, "");
            this.this$0.a(AnonymousClass1.f110132a);
            return h.z.f158842a;
        }
    }

    static final class a extends h.f.b.m implements h.f.a.b<d, d> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f110094a = new a();

        static {
            Covode.recordClassIndex(70641);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            return d.a(dVar2, null, null, null, 0, false, 0, null, null, null, 436);
        }
    }

    public static final class aa extends h.f.b.m implements h.f.a.b<d, d> {
        final /* synthetic */ com.ss.android.ugc.aweme.mix.model.d $mixStruct;

        static {
            Covode.recordClassIndex(70642);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public aa(com.ss.android.ugc.aweme.mix.model.d dVar) {
            super(1);
            this.$mixStruct = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            return d.a(dVar2, null, null, null, 0, false, 0, this.$mixStruct, null, null, 447);
        }
    }

    static final class ac extends h.f.b.m implements h.f.a.b<d, h.z> {
        final /* synthetic */ e $state;
        final /* synthetic */ MixVideosViewModel this$0;

        static {
            Covode.recordClassIndex(70644);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ac(MixVideosViewModel mixVideosViewModel, e eVar) {
            super(1);
            this.this$0 = mixVideosViewModel;
            this.$state = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(d dVar) {
            h.f.b.l.d(dVar, "");
            this.this$0.a(new h.f.a.b<d, d>(this) {
                /* class com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel.ac.AnonymousClass1 */
                final /* synthetic */ ac this$0;

                static {
                    Covode.recordClassIndex(70645);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ d invoke(d dVar) {
                    d dVar2 = dVar;
                    h.f.b.l.d(dVar2, "");
                    return d.a(dVar2, null, null, null, 0, false, 0, null, new com.bytedance.assem.arch.extensions.o(this.this$0.$state), null, 383);
                }
            });
            return h.z.f158842a;
        }
    }

    public static final class ad extends h.f.b.m implements h.f.a.b<d, d> {

        /* renamed from: a  reason: collision with root package name */
        public static final ad f110095a = new ad();

        static {
            Covode.recordClassIndex(70646);
        }

        ad() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            return d.a(dVar2, null, null, null, 0, true, 0, null, null, null, 495);
        }
    }

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f110104a;

        static {
            Covode.recordClassIndex(70657);
        }

        g(h.c.d dVar) {
            this.f110104a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f110104a.resumeWith(h.q.m223constructorimpl(f.a.a(new Exception(((Throwable) obj).getMessage()))));
        }
    }

    static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f110111a;

        static {
            Covode.recordClassIndex(70665);
        }

        k(h.c.d dVar) {
            this.f110111a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f110111a.resumeWith(h.q.m223constructorimpl(f.a.a(new Exception(((Throwable) obj).getMessage()))));
        }
    }

    static final class o<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f110123a;

        static {
            Covode.recordClassIndex(70677);
        }

        o(h.c.d dVar) {
            this.f110123a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f110123a.resumeWith(h.q.m223constructorimpl(f.a.a(new Exception(((Throwable) obj).getMessage()))));
        }
    }

    public static final class p extends h.f.b.m implements h.f.a.b<d, d> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f110124a = new p();

        static {
            Covode.recordClassIndex(70678);
        }

        p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            return d.a(dVar2, null, null, null, 0, false, 0, null, null, null, 495);
        }
    }

    public static final class x extends h.f.b.m implements h.f.a.b<d, d> {
        final /* synthetic */ Aweme $aweme$inlined;
        final /* synthetic */ MixVideosViewModel this$0;

        static {
            Covode.recordClassIndex(70689);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public x(MixVideosViewModel mixVideosViewModel, Aweme aweme) {
            super(1);
            this.this$0 = mixVideosViewModel;
            this.$aweme$inlined = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            return d.a(dVar2, null, new com.bytedance.assem.arch.extensions.a(this.$aweme$inlined), null, 0, false, 0, null, null, null, 509);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class z extends h.f.b.m implements h.f.a.b<d, d> {
        final /* synthetic */ Aweme $aweme$inlined;
        final /* synthetic */ MixVideosViewModel this$0;

        static {
            Covode.recordClassIndex(70692);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(MixVideosViewModel mixVideosViewModel, Aweme aweme) {
            super(1);
            this.this$0 = mixVideosViewModel;
            this.$aweme$inlined = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            return d.a(dVar2, null, new com.bytedance.assem.arch.extensions.a(this.$aweme$inlined), null, 0, false, 0, null, null, null, 509);
        }
    }

    public final void a(Aweme aweme) {
        if (aweme != null) {
            a(new z(this, aweme));
        }
    }

    public final int b(Aweme aweme) {
        int a2;
        h.f.b.l.d(aweme, "");
        List<Aweme> list = ((d) d().a()).f110141a;
        if (list == null || (a2 = a(list, aweme)) < 0) {
            return -1;
        }
        return a2;
    }

    public static final class ab extends h.f.b.m implements h.f.a.b<d, h.z> {
        final /* synthetic */ String $mixId;
        final /* synthetic */ String $name;

        static {
            Covode.recordClassIndex(70643);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ab(String str, String str2) {
            super(1);
            this.$mixId = str;
            this.$name = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(d dVar) {
            String str;
            PlayListInfo playListInfo;
            d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            List<Aweme> list = dVar2.f110141a;
            if (list != null) {
                for (Aweme aweme : list) {
                    PlayListInfo playListInfo2 = aweme.playlist_info;
                    if (playListInfo2 != null) {
                        str = playListInfo2.getMixId();
                    } else {
                        str = null;
                    }
                    if (h.m.p.a(str, this.$mixId, false) && (playListInfo = aweme.playlist_info) != null) {
                        playListInfo.setMixName(this.$name);
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    static final class n<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MixVideosViewModel f110118a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.c f110119b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.c.d f110120c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f110121d;

        static {
            Covode.recordClassIndex(70672);
        }

        n(MixVideosViewModel mixVideosViewModel, z.c cVar, h.c.d dVar, long j2) {
            this.f110118a = mixVideosViewModel;
            this.f110119b = cVar;
            this.f110120c = dVar;
            this.f110121d = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final com.ss.android.ugc.aweme.mix.api.response.e eVar = (com.ss.android.ugc.aweme.mix.api.response.e) obj;
            this.f110118a.b(new h.f.a.b<d, h.z>(this) {
                /* class com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel.n.AnonymousClass1 */
                final /* synthetic */ n this$0;

                static {
                    Covode.recordClassIndex(70673);
                }

                {
                    this.this$0 = r2;
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$n$1$a */
                static final class a extends h.f.b.m implements h.f.a.b<d, d> {
                    final /* synthetic */ List $list$inlined;
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(70675);
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
                    public final /* synthetic */ d invoke(d dVar) {
                        d dVar2 = dVar;
                        h.f.b.l.d(dVar2, "");
                        return d.a(dVar2, this.$list$inlined, null, null, this.this$0.this$0.f110119b.element, false, 0, null, null, null, 502);
                    }
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(d dVar) {
                    Long l2;
                    h.f.b.l.d(dVar, "");
                    List<? extends Aweme> list = eVar.f109800a;
                    if (this.this$0.f110119b.element == g.f110160d) {
                        this.this$0.f110118a.p = eVar.f109804f;
                        this.this$0.f110118a.q = eVar.f109805g;
                    } else if (this.this$0.f110119b.element == g.f110157a) {
                        this.this$0.f110118a.q = eVar.f109801b;
                    }
                    this.this$0.f110118a.r = eVar.f109803e;
                    this.this$0.f110118a.s = eVar.f109802c;
                    if (list != null) {
                        this.this$0.f110118a.a(new a(this, list));
                    }
                    List<? extends Aweme> list2 = eVar.f109800a;
                    if (list2 == null || list2.isEmpty()) {
                        this.this$0.f110120c.resumeWith(h.q.m223constructorimpl(f.a.a(h.a.z.INSTANCE)));
                        this.this$0.f110118a.a(AnonymousClass1.f110122a);
                    } else {
                        if (this.this$0.f110118a.q || this.this$0.f110118a.p) {
                            Long l3 = null;
                            if (this.this$0.f110118a.q) {
                                l2 = Long.valueOf(eVar.f109802c);
                            } else {
                                l2 = null;
                            }
                            if (this.this$0.f110118a.p) {
                                l3 = Long.valueOf(eVar.f109803e);
                            }
                            h.c.d dVar2 = this.this$0.f110120c;
                            ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list2, 10));
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new com.ss.android.ugc.aweme.mix.mixdetail.viewholder.b(it.next()));
                            }
                            dVar2.resumeWith(h.q.m223constructorimpl(f.a.a(l3, l2, arrayList)));
                        } else {
                            h.c.d dVar3 = this.this$0.f110120c;
                            ArrayList arrayList2 = new ArrayList(h.a.n.a((Iterable) list2, 10));
                            Iterator<T> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(new com.ss.android.ugc.aweme.mix.mixdetail.viewholder.b(it2.next()));
                            }
                            dVar3.resumeWith(h.q.m223constructorimpl(f.a.a(arrayList2)));
                        }
                        if (this.this$0.f110118a.n != null) {
                            this.this$0.f110118a.a(this.this$0.f110118a.n);
                        } else if (!list2.isEmpty()) {
                            this.this$0.f110118a.a((Aweme) list2.get(0));
                        }
                    }
                    return h.z.f158842a;
                }
            });
            if (this.f110118a.x > 0) {
                fs.a(this.f110118a.w, this.f110118a.f110090j, this.f110118a.x, this.f110121d, SystemClock.elapsedRealtime(), com.ss.android.ugc.aweme.network.a.f.a(), new fs.a() {
                    /* class com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel.n.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(70676);
                    }

                    @Override // com.ss.android.ugc.aweme.utils.fs.a
                    public final void a(String str, Map<String, String> map) {
                        h.f.b.l.d(str, "");
                        h.f.b.l.d(map, "");
                        com.ss.android.ugc.aweme.common.r.a(str, map);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r extends h.f.b.m implements h.f.a.b<d, d> {
        final /* synthetic */ boolean $result;

        static {
            Covode.recordClassIndex(70680);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(boolean z) {
            super(1);
            this.$result = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            return d.a(dVar2, null, null, new com.bytedance.assem.arch.extensions.a(Boolean.valueOf(this.$result)), 0, false, 0, null, null, null, 507);
        }
    }

    static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MixVideosViewModel f110112a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.c f110113b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f110114c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f110115d;

        static {
            Covode.recordClassIndex(70666);
        }

        l(MixVideosViewModel mixVideosViewModel, z.c cVar, z.e eVar, long j2) {
            this.f110112a = mixVideosViewModel;
            this.f110113b = cVar;
            this.f110114c = eVar;
            this.f110115d = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final T t = (T) ((com.ss.android.ugc.aweme.mix.api.response.e) obj);
            this.f110112a.b(new h.f.a.b<d, h.z>(this) {
                /* class com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel.l.AnonymousClass1 */
                final /* synthetic */ l this$0;

                static {
                    Covode.recordClassIndex(70667);
                }

                {
                    this.this$0 = r2;
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$l$1$a */
                static final class a extends h.f.b.m implements h.f.a.b<d, d> {
                    final /* synthetic */ List $list$inlined;
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(70668);
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
                    public final /* synthetic */ d invoke(d dVar) {
                        d dVar2 = dVar;
                        h.f.b.l.d(dVar2, "");
                        return d.a(dVar2, this.$list$inlined, null, null, this.this$0.this$0.f110113b.element, false, 0, null, null, null, 502);
                    }
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(d dVar) {
                    h.f.b.l.d(dVar, "");
                    List<? extends Aweme> list = t.f109800a;
                    if (this.this$0.f110113b.element == g.f110160d) {
                        this.this$0.f110112a.p = t.f109804f;
                        this.this$0.f110112a.q = t.f109805g;
                    } else if (this.this$0.f110113b.element == g.f110157a) {
                        this.this$0.f110112a.q = t.f109801b;
                    }
                    this.this$0.f110112a.r = t.f109803e;
                    this.this$0.f110112a.s = t.f109802c;
                    if (list != null) {
                        this.this$0.f110112a.a(new a(this, list));
                    }
                    return h.z.f158842a;
                }
            });
            List<? extends Aweme> list = t.f109800a;
            if (list == null || list.isEmpty()) {
                this.f110112a.a(AnonymousClass2.f110116a);
            }
            this.f110114c.element = t;
            if (this.f110112a.x > 0) {
                fs.a(this.f110112a.w, this.f110112a.f110090j, this.f110112a.x, this.f110115d, SystemClock.elapsedRealtime(), com.ss.android.ugc.aweme.network.a.f.a(), new fs.a() {
                    /* class com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel.l.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(70670);
                    }

                    @Override // com.ss.android.ugc.aweme.utils.fs.a
                    public final void a(String str, Map<String, String> map) {
                        h.f.b.l.d(str, "");
                        h.f.b.l.d(map, "");
                        com.ss.android.ugc.aweme.common.r.a(str, map);
                    }
                });
            }
        }
    }

    public final void a(e eVar) {
        h.f.b.l.d(eVar, "");
        b(new ac(this, eVar));
    }

    public final void a(boolean z2) {
        a(new r(z2));
    }

    public static List<Aweme> a(List<? extends Aweme> list, List<? extends Aweme> list2) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    private static int a(List<? extends Aweme> list, Aweme aweme) {
        String str;
        if (list != null) {
            int i2 = 0;
            for (Aweme aweme2 : list) {
                String aid = aweme2.getAid();
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (h.f.b.l.a((Object) aid, (Object) str)) {
                    return i2;
                }
                i2++;
            }
        }
        return -1;
    }

    public final void b(String str, String str2) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        int i2 = g.f110159c;
        MixFeedApi.a.a().getMixVideos2(this.f110092l, "", this.s, i2, k(), l()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new h(this, i2), i.f110107a);
    }

    public final void a(Aweme aweme, String str) {
        h.f.b.l.d(str, "");
        if (aweme != null) {
            this.n = aweme;
            this.f110093m = aweme.getAid().toString();
        }
        this.f110092l = str;
        g().f34367c.e();
    }

    public final void a(String str, String str2) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        z.c cVar = new z.c();
        cVar.element = g.f110157a;
        if (!com.bytedance.common.utility.m.a(this.f110093m)) {
            cVar.element = g.f110160d;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        i();
        z.e eVar = new z.e();
        eVar.element = null;
        MixFeedApi.a.a().getMixVideos2(this.f110092l, this.f110093m, 0, cVar.element, str, str2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new l(this, cVar, eVar, elapsedRealtime), m.f110117a);
    }
}
