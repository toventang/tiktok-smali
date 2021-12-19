package com.ss.android.ugc.aweme.social.widget.card.rec.vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerlist.page.f;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.widget.card.a.b;
import com.ss.android.ugc.aweme.social.widget.card.rec.d;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import h.p;
import h.q;
import h.r;
import h.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.cu;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.z;

public class SocialCardVM extends ac implements com.ss.android.ugc.aweme.friends.g {
    private List<? extends com.bytedance.ies.powerlist.b.a> A;
    private List<? extends com.bytedance.ies.powerlist.b.a> B;
    private final List<com.bytedance.ies.powerlist.b.a> C;
    private final com.ss.android.ugc.aweme.arch.widgets.base.c<List<com.bytedance.ies.powerlist.b.a>> D;
    private final com.ss.android.ugc.aweme.arch.widgets.base.c<Integer> E;

    /* renamed from: a  reason: collision with root package name */
    public final am f133909a;

    /* renamed from: b  reason: collision with root package name */
    public final f.a.b.a f133910b = new f.a.b.a();

    /* renamed from: c  reason: collision with root package name */
    public d.a f133911c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.social.widget.card.a.g f133912d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.social.widget.card.j f133913e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, String> f133914f;

    /* renamed from: g  reason: collision with root package name */
    public com.bytedance.ies.powerlist.page.config.c f133915g;

    /* renamed from: h  reason: collision with root package name */
    public int f133916h;

    /* renamed from: i  reason: collision with root package name */
    public int f133917i;

    /* renamed from: j  reason: collision with root package name */
    public final Set<String> f133918j;

    /* renamed from: k  reason: collision with root package name */
    public final Set<String> f133919k;

    /* renamed from: l  reason: collision with root package name */
    public List<? extends com.bytedance.ies.powerlist.b.a> f133920l;

    /* renamed from: m  reason: collision with root package name */
    public final LiveData<List<com.bytedance.ies.powerlist.b.a>> f133921m;
    public final com.ss.android.ugc.aweme.arch.widgets.base.c<Integer> n;
    public final LiveData<Integer> o;
    public final com.ss.android.ugc.aweme.arch.widgets.base.c<p<Boolean, Integer>> p;
    public final LiveData<p<Boolean, Integer>> q;
    public final LiveData<Integer> r;
    public final t<com.ss.android.ugc.aweme.social.widget.card.permission.c> s;
    public final LiveData<com.ss.android.ugc.aweme.social.widget.card.permission.c> t;
    public final h.h u;
    public final com.ss.android.ugc.aweme.social.widget.card.a.i v;
    private final z w;
    private final h.h x = h.i.a((h.f.a.a) new n(this));
    private final com.ss.android.ugc.aweme.social.widget.card.a.h y;
    private final h.h z;

    /* access modifiers changed from: package-private */
    public static final class b extends h.c.b.a.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SocialCardVM this$0;

        static {
            Covode.recordClassIndex(87606);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SocialCardVM socialCardVM, h.c.d dVar) {
            super(dVar);
            this.this$0 = socialCardVM;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.d(this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.c.b.a.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SocialCardVM this$0;

        static {
            Covode.recordClassIndex(87607);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SocialCardVM socialCardVM, h.c.d dVar) {
            super(dVar);
            this.this$0 = socialCardVM;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.c(this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.c.b.a.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SocialCardVM this$0;

        static {
            Covode.recordClassIndex(87608);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SocialCardVM socialCardVM, h.c.d dVar) {
            super(dVar);
            this.this$0 = socialCardVM;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a((com.ss.android.ugc.aweme.social.widget.card.a.f) null, this);
        }
    }

    static {
        Covode.recordClassIndex(87604);
    }

    public final com.ss.android.ugc.aweme.social.widget.card.rec.d a() {
        return (com.ss.android.ugc.aweme.social.widget.card.rec.d) this.x.getValue();
    }

    public final com.ss.android.ugc.aweme.social.widget.card.a.b b() {
        return (com.ss.android.ugc.aweme.social.widget.card.a.b) this.z.getValue();
    }

    public final boolean a(User user) {
        if (this.f133918j.contains(user.getUid())) {
            return false;
        }
        Set<String> set = this.f133918j;
        String uid = user.getUid();
        h.f.b.l.b(uid, "");
        set.add(uid);
        return true;
    }

    public final void a(Integer num, Integer num2) {
        if (num != null) {
            int intValue = num.intValue();
            int i2 = this.f133916h;
            if (intValue >= 0 && i2 > intValue) {
                this.f133916h = num.intValue();
            }
        }
        if (num2 != null) {
            int intValue2 = num2.intValue();
            int i3 = this.f133917i;
            if (intValue2 >= 0 && i3 > intValue2 && i3 > 0) {
                this.f133917i = num2.intValue();
            }
        }
    }

    public final void a(com.bytedance.ies.powerlist.b.a aVar) {
        h.f.b.l.d(aVar, "");
        if (aVar instanceof com.ss.android.ugc.aweme.social.widget.card.permission.c) {
            com.ss.android.ugc.aweme.social.widget.card.permission.c cVar = (com.ss.android.ugc.aweme.social.widget.card.permission.c) aVar;
            String name = cVar.f133825a.name();
            if (!this.f133919k.contains(name)) {
                this.f133919k.add(name);
                b().a(cVar.f133825a);
                com.ss.android.ugc.aweme.social.widget.card.c.b.a(cVar.f133825a, this.f133914f);
            }
        } else if (aVar instanceof com.ss.android.ugc.aweme.social.widget.card.rec.cell.a) {
            com.ss.android.ugc.aweme.social.widget.card.rec.cell.a aVar2 = (com.ss.android.ugc.aweme.social.widget.card.rec.cell.a) aVar;
            User user = aVar2.f133855a;
            if (!this.f133919k.contains(user.getUid()) && user.isShould_write_impr()) {
                Set<String> set = this.f133919k;
                String uid = user.getUid();
                h.f.b.l.b(uid, "");
                set.add(uid);
                com.ss.android.ugc.aweme.social.widget.card.c.c.b(aVar2.f133855a, this.C.indexOf(aVar), this.f133914f);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.g
    public final void a(com.ss.android.ugc.aweme.recommend.f fVar) {
        h.f.b.l.d(fVar, "");
        Object obj = null;
        if (fVar == com.ss.android.ugc.aweme.recommend.f.CONTACT && com.ss.android.ugc.aweme.friends.service.a.f97047a.d().c()) {
            List<? extends com.bytedance.ies.powerlist.b.a> list = this.A;
            ArrayList arrayList = new ArrayList();
            for (T t2 : list) {
                if (t2 instanceof com.ss.android.ugc.aweme.social.widget.card.permission.c) {
                    arrayList.add(t2);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((com.ss.android.ugc.aweme.social.widget.card.permission.c) next).f133825a == com.ss.android.ugc.aweme.social.widget.card.a.f.CONTACT) {
                    obj = next;
                    break;
                }
            }
            com.ss.android.ugc.aweme.social.widget.card.permission.c cVar = (com.ss.android.ugc.aweme.social.widget.card.permission.c) obj;
            if (cVar != null) {
                a(cVar);
            }
        } else if (fVar == com.ss.android.ugc.aweme.recommend.f.FACEBOOK && com.ss.android.ugc.aweme.friends.service.a.f97047a.g().b()) {
            List<? extends com.bytedance.ies.powerlist.b.a> list2 = this.A;
            ArrayList arrayList2 = new ArrayList();
            for (T t3 : list2) {
                if (t3 instanceof com.ss.android.ugc.aweme.social.widget.card.permission.c) {
                    arrayList2.add(t3);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((com.ss.android.ugc.aweme.social.widget.card.permission.c) next2).f133825a == com.ss.android.ugc.aweme.social.widget.card.a.f.FACEBOOK) {
                    obj = next2;
                    break;
                }
            }
            com.ss.android.ugc.aweme.social.widget.card.permission.c cVar2 = (com.ss.android.ugc.aweme.social.widget.card.permission.c) obj;
            if (cVar2 != null) {
                a(cVar2);
            }
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.social.widget.card.a.b> {
        final /* synthetic */ SocialCardVM this$0;

        static {
            Covode.recordClassIndex(87617);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(SocialCardVM socialCardVM) {
            super(0);
            this.this$0 = socialCardVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.social.widget.card.a.b invoke() {
            return b.a.a(this.this$0.v.f133750a);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.social.widget.card.rec.d> {
        final /* synthetic */ SocialCardVM this$0;

        static {
            Covode.recordClassIndex(87620);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(SocialCardVM socialCardVM) {
            super(0);
            this.this$0 = socialCardVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.social.widget.card.rec.d invoke() {
            return new com.ss.android.ugc.aweme.social.widget.card.rec.d(this.this$0.v.f133750a);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ SocialCardVM this$0;

        static {
            Covode.recordClassIndex(87618);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(SocialCardVM socialCardVM) {
            super(0);
            this.this$0 = socialCardVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            com.bytedance.ies.powerlist.page.config.c cVar = this.this$0.f133915g;
            if (cVar == null) {
                h.f.b.l.a("pageConfigBuilder");
            }
            return new com.bytedance.ies.powerlist.page.config.b<Integer>(this, cVar) {
                /* class com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM.m.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ m f133922a;

                static {
                    Covode.recordClassIndex(87619);
                }

                @Override // com.bytedance.ies.powerlist.page.config.d
                public final void a(h.c.d<? super com.bytedance.ies.powerlist.page.f<Integer>> dVar) {
                    h.f.b.l.d(dVar, "");
                    this.f133922a.this$0.a(dVar);
                }

                {
                    this.f133922a = r1;
                }

                @Override // com.bytedance.ies.powerlist.page.config.d
                public final /* synthetic */ void b(h.c.d dVar, Object obj) {
                    ((Number) obj).intValue();
                    h.f.b.l.d(dVar, "");
                    SocialCardVM socialCardVM = this.f133922a.this$0;
                    bz unused = kotlinx.coroutines.i.a(socialCardVM.f133909a, null, null, new j(socialCardVM, dVar, null), 3);
                }
            };
        }
    }

    @Override // androidx.lifecycle.ac
    public void onCleared() {
        super.onCleared();
        this.w.a((CancellationException) null);
        this.f133910b.dispose();
        com.ss.android.ugc.aweme.friends.service.a.f97047a.b(this);
    }

    private final void c() {
        List<com.ss.android.ugc.aweme.social.widget.card.permission.c> list;
        boolean z2;
        com.bytedance.ies.powerlist.b.a aVar;
        boolean z3;
        com.ss.android.ugc.aweme.social.widget.card.a.b b2 = b();
        com.ss.android.ugc.aweme.social.widget.card.a.f[] values = com.ss.android.ugc.aweme.social.widget.card.a.f.values();
        boolean z4 = false;
        for (com.ss.android.ugc.aweme.social.widget.card.a.f fVar : values) {
            Boolean bool = b2.f133730d.get(fVar);
            if (com.ss.android.ugc.aweme.social.widget.card.e.b(fVar) || !b2.c(fVar)) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (bool != null && (!h.f.b.l.a(bool, Boolean.valueOf(z3)))) {
                b2.f133730d.put(fVar, Boolean.valueOf(z3));
                z4 = true;
            }
        }
        if (z4) {
            Iterator<T> it = b2.f133729c.iterator();
            while (it.hasNext()) {
                it.next().get();
            }
        }
        com.ss.android.ugc.aweme.social.widget.card.a.g gVar = this.f133912d;
        if (gVar != null) {
            Set<com.ss.android.ugc.aweme.social.widget.card.a.f> keySet = gVar.f133742a.keySet();
            ArrayList arrayList = new ArrayList();
            for (T t2 : keySet) {
                Boolean bool2 = b().f133730d.get(t2);
                if (bool2 != null && bool2.booleanValue()) {
                    arrayList.add(t2);
                }
            }
            ArrayList<com.ss.android.ugc.aweme.social.widget.card.a.f> arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(h.a.n.a((Iterable) arrayList2, 10));
            for (com.ss.android.ugc.aweme.social.widget.card.a.f fVar2 : arrayList2) {
                com.ss.android.ugc.aweme.social.widget.card.a.a aVar2 = gVar.f133742a.get(fVar2);
                if (aVar2 == null) {
                    h.f.b.l.b();
                }
                com.ss.android.ugc.aweme.social.widget.card.a.a aVar3 = aVar2;
                h.f.b.l.d(fVar2, "");
                h.f.b.l.d(aVar3, "");
                int i2 = com.ss.android.ugc.aweme.social.widget.card.f.f133791d[fVar2.ordinal()];
                if (i2 == 1) {
                    aVar = new com.ss.android.ugc.aweme.social.widget.card.permission.a(aVar3);
                } else if (i2 == 2) {
                    aVar = new com.ss.android.ugc.aweme.social.widget.card.permission.b(aVar3);
                } else {
                    throw new h.n();
                }
                arrayList3.add(aVar);
            }
            list = arrayList3;
        } else {
            list = h.a.z.INSTANCE;
        }
        ArrayList arrayList4 = new ArrayList(h.a.n.a((Iterable) list, 10));
        for (com.ss.android.ugc.aweme.social.widget.card.permission.c cVar : list) {
            arrayList4.add(cVar.f133825a);
        }
        if (this.y == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        a(this, null, list, null, z2, 5);
        com.ss.android.ugc.aweme.friends.service.a.f97047a.a(this);
    }

    public static final /* synthetic */ d.a a(SocialCardVM socialCardVM) {
        d.a aVar = socialCardVM.f133911c;
        if (aVar == null) {
            h.f.b.l.a("queryParams");
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ h.c.d $continuation;
        int label;
        final /* synthetic */ SocialCardVM this$0;

        static {
            Covode.recordClassIndex(87615);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(SocialCardVM socialCardVM, h.c.d dVar, h.c.d dVar2) {
            super(2, dVar2);
            this.this$0 = socialCardVM;
            this.$continuation = dVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new k(this.this$0, this.$continuation, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((k) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                bz unused = kotlinx.coroutines.i.a(this.this$0.f133909a, null, null, new h.f.a.m<am, h.c.d<? super h.z>, Object>(this, null) {
                    /* class com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM.k.AnonymousClass1 */
                    int label;
                    final /* synthetic */ k this$0;

                    static {
                        Covode.recordClassIndex(87616);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.c.b.a.a
                    public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                        h.f.b.l.d(dVar, "");
                        return 

                        public final Object b(h.c.d<? super p<? extends com.bytedance.ies.powerlist.page.f<Integer>, ? extends List<? extends com.bytedance.ies.powerlist.b.a>>> dVar) {
                            d.a aVar = this.f133911c;
                            if (aVar == null) {
                                h.f.b.l.a("queryParams");
                            }
                            if (aVar.f133859a < aVar.f133861c && aVar.f133862d) {
                                return kotlinx.coroutines.i.a(bf.f159041b, new a(this, null), dVar);
                            }
                            if (this.f133911c == null) {
                                h.f.b.l.a("queryParams");
                            }
                            return v.a(f.a.a(h.a.z.INSTANCE), this.f133920l);
                        }

                        /* access modifiers changed from: package-private */
                        public static final class e extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super List<? extends User>>, Object> {
                            final /* synthetic */ com.ss.android.ugc.aweme.social.widget.card.a.f $type;
                            int label;
                            final /* synthetic */ SocialCardVM this$0;

                            static {
                                Covode.recordClassIndex(87609);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            e(SocialCardVM socialCardVM, com.ss.android.ugc.aweme.social.widget.card.a.f fVar, h.c.d dVar) {
                                super(2, dVar);
                                this.this$0 = socialCardVM;
                                this.$type = fVar;
                            }

                            @Override // h.c.b.a.a
                            public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                                h.f.b.l.d(dVar, "");
                                return new e(this.this$0, this.$type, dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // h.f.a.m
                            public final Object invoke(am amVar, h.c.d<? super List<? extends User>> dVar) {
                                return ((e) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
                            }

                            @Override // h.c.b.a.a
                            public final Object invokeSuspend(Object obj) {
                                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                                int i2 = this.label;
                                if (i2 == 0) {
                                    r.a(obj);
                                    int i3 = b.f133924a[this.$type.ordinal()];
                                    if (i3 == 1) {
                                        SocialCardVM socialCardVM = this.this$0;
                                        this.label = 1;
                                        obj = socialCardVM.c(this);
                                        if (obj == aVar) {
                                            return aVar;
                                        }
                                        return obj;
                                    } else if (i3 == 2) {
                                        SocialCardVM socialCardVM2 = this.this$0;
                                        this.label = 2;
                                        obj = socialCardVM2.d(this);
                                        if (obj == aVar) {
                                            return aVar;
                                        }
                                    } else {
                                        throw new h.n();
                                    }
                                } else if (i2 == 1) {
                                    r.a(obj);
                                    return obj;
                                } else if (i2 == 2) {
                                    r.a(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                return obj;
                            }
                        }

                        static final class j extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
                            final /* synthetic */ h.c.d $continuation;
                            int label;
                            final /* synthetic */ SocialCardVM this$0;

                            static {
                                Covode.recordClassIndex(87614);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            j(SocialCardVM socialCardVM, h.c.d dVar, h.c.d dVar2) {
                                super(2, dVar2);
                                this.this$0 = socialCardVM;
                                this.$continuation = dVar;
                            }

                            @Override // h.c.b.a.a
                            public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                                h.f.b.l.d(dVar, "");
                                return new j(this.this$0, this.$continuation, dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // h.f.a.m
                            public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
                                return ((j) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
                            }

                            @Override // h.c.b.a.a
                            public final Object invokeSuspend(Object obj) {
                                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                                int i2 = this.label;
                                if (i2 == 0) {
                                    r.a(obj);
                                    SocialCardVM socialCardVM = this.this$0;
                                    this.label = 1;
                                    obj = socialCardVM.b(this);
                                    if (obj == aVar) {
                                        return aVar;
                                    }
                                } else if (i2 == 1) {
                                    r.a(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                p pVar = (p) obj;
                                Object component1 = pVar.component1();
                                List list = (List) pVar.component2();
                                h.c.d dVar = this.$continuation;
                                if (dVar != null) {
                                    dVar.resumeWith(q.m223constructorimpl(component1));
                                }
                                SocialCardVM.a(this.this$0, list, null, null, false, 14);
                                return h.z.f158842a;
                            }
                        }

                        private void a(com.ss.android.ugc.aweme.social.widget.card.permission.c cVar) {
                            boolean z2;
                            boolean z3;
                            h.f.b.l.d(cVar, "");
                            com.ss.android.ugc.aweme.social.widget.card.a.g gVar = this.f133912d;
                            if (gVar != null) {
                                z2 = gVar.f133743b;
                            } else {
                                z2 = false;
                            }
                            com.ss.android.ugc.aweme.social.widget.card.a.g gVar2 = this.f133912d;
                            if (gVar2 != null) {
                                z3 = gVar2.f133744c;
                            } else {
                                z3 = false;
                            }
                            List g2 = h.a.n.g((Collection) this.A);
                            List g3 = h.a.n.g((Collection) this.B);
                            int indexOf = g2.indexOf(cVar);
                            int size = g2.size();
                            if (indexOf >= 0 && size > indexOf) {
                                if (z2) {
                                    bz unused = kotlinx.coroutines.i.a(this.f133909a, null, null, new f(this, cVar, g2, indexOf, z3, g3, null), 3);
                                    return;
                                }
                                g2.remove(indexOf);
                                com.ss.android.ugc.aweme.social.widget.card.j jVar = this.f133913e;
                                if (jVar != null) {
                                    jVar.a(cVar.f133825a, com.ss.android.ugc.aweme.social.widget.card.a.e.ON_AUTHORIZE, null);
                                }
                                a(this, null, g2, null, false, 13);
                            }
                        }

                        public final void b(com.bytedance.ies.powerlist.b.a aVar) {
                            h.f.b.l.d(aVar, "");
                            if (aVar instanceof com.ss.android.ugc.aweme.social.widget.card.permission.c) {
                                com.ss.android.ugc.aweme.social.widget.card.permission.c cVar = (com.ss.android.ugc.aweme.social.widget.card.permission.c) aVar;
                                b().b(cVar.f133825a);
                                com.ss.android.ugc.aweme.social.widget.card.j jVar = this.f133913e;
                                if (jVar != null) {
                                    jVar.a(cVar.f133825a, com.ss.android.ugc.aweme.social.widget.card.a.e.ON_DELETE, null);
                                }
                                com.ss.android.ugc.aweme.social.widget.card.c.b.b(cVar.f133825a, this.f133914f);
                                a(aVar, this.A, new g(this));
                            } else if (aVar instanceof com.ss.android.ugc.aweme.social.widget.card.rec.cell.a) {
                                if (a(aVar, this.f133920l, new h(this)) == null) {
                                    a(aVar, this.B, new i(this));
                                }
                                com.ss.android.ugc.aweme.social.widget.card.c.c.a(((com.ss.android.ugc.aweme.social.widget.card.rec.cell.a) aVar).f133855a, this.C.indexOf(aVar), this.f133914f);
                            }
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
                        /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object c(h.c.d<? super java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>> r7) {
                            /*
                            // Method dump skipped, instructions count: 126
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM.c(h.c.d):java.lang.Object");
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
                        /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object d(h.c.d<? super java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>> r6) {
                            /*
                            // Method dump skipped, instructions count: 122
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM.d(h.c.d):java.lang.Object");
                        }

                        /* access modifiers changed from: package-private */
                        public static final class f extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
                            final /* synthetic */ List $authorizeMutableList;
                            final /* synthetic */ com.ss.android.ugc.aweme.social.widget.card.permission.c $item;
                            final /* synthetic */ int $permissionIndex;
                            final /* synthetic */ List $permissionMutableList;
                            final /* synthetic */ boolean $shouldInsert;
                            private /* synthetic */ Object L$0;
                            int label;
                            final /* synthetic */ SocialCardVM this$0;

                            static {
                                Covode.recordClassIndex(87610);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            f(SocialCardVM socialCardVM, com.ss.android.ugc.aweme.social.widget.card.permission.c cVar, List list, int i2, boolean z, List list2, h.c.d dVar) {
                                super(2, dVar);
                                this.this$0 = socialCardVM;
                                this.$item = cVar;
                                this.$permissionMutableList = list;
                                this.$permissionIndex = i2;
                                this.$shouldInsert = z;
                                this.$authorizeMutableList = list2;
                            }

                            @Override // h.c.b.a.a
                            public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                                h.f.b.l.d(dVar, "");
                                f fVar = new f(this.this$0, this.$item, this.$permissionMutableList, this.$permissionIndex, this.$shouldInsert, this.$authorizeMutableList, dVar);
                                fVar.L$0 = obj;
                                return fVar;
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // h.f.a.m
                            public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
                                return ((f) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
                            }

                            /* JADX WARNING: Removed duplicated region for block: B:29:0x0073 A[Catch:{ all -> 0x00df }] */
                            /* JADX WARNING: Removed duplicated region for block: B:38:0x009c A[Catch:{ all -> 0x00df }] */
                            /* JADX WARNING: Removed duplicated region for block: B:45:0x00c9 A[Catch:{ all -> 0x00df }] */
                            /* JADX WARNING: Removed duplicated region for block: B:52:0x00ee  */
                            @Override // h.c.b.a.a
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                                /*
                                // Method dump skipped, instructions count: 252
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM.f.invokeSuspend(java.lang.Object):java.lang.Object");
                            }
                        }

                        /* access modifiers changed from: package-private */
                        public static final class a extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super p<? extends com.bytedance.ies.powerlist.page.f<Integer>, ? extends List<? extends com.bytedance.ies.powerlist.b.a>>>, Object> {
                            Object L$0;
                            int label;
                            final /* synthetic */ SocialCardVM this$0;

                            static {
                                Covode.recordClassIndex(87605);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            a(SocialCardVM socialCardVM, h.c.d dVar) {
                                super(2, dVar);
                                this.this$0 = socialCardVM;
                            }

                            @Override // h.c.b.a.a
                            public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                                h.f.b.l.d(dVar, "");
                                return new a(this.this$0, dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // h.f.a.m
                            public final Object invoke(am amVar, h.c.d<? super p<? extends com.bytedance.ies.powerlist.page.f<Integer>, ? extends List<? extends com.bytedance.ies.powerlist.b.a>>> dVar) {
                                return ((a) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
                            }

                            @Override // h.c.b.a.a
                            public final Object invokeSuspend(Object obj) {
                                p pVar;
                                List<? extends com.bytedance.ies.powerlist.b.a> list;
                                Exception e2;
                                Object obj2 = obj;
                                MethodCollector.i(13464);
                                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                                int i2 = this.label;
                                if (i2 == 0) {
                                    r.a(obj2);
                                    synchronized (this.this$0) {
                                        try {
                                            list = this.this$0.f133920l;
                                        } finally {
                                            MethodCollector.o(13464);
                                        }
                                    }
                                    try {
                                        com.ss.android.ugc.aweme.social.widget.card.rec.d a2 = this.this$0.a();
                                        d.a a3 = SocialCardVM.a(this.this$0);
                                        this.L$0 = list;
                                        this.label = 1;
                                        obj2 = a2.a(a3, this);
                                        if (obj2 == aVar) {
                                            return aVar;
                                        }
                                    } catch (Exception e3) {
                                        e2 = e3;
                                        this.this$0.a(R.string.mr);
                                        pVar = v.a(f.a.a(e2), list);
                                        MethodCollector.o(13464);
                                        return pVar;
                                    }
                                } else if (i2 == 1) {
                                    list = (List) this.L$0;
                                    try {
                                        r.a(obj2);
                                    } catch (Exception e4) {
                                        e2 = e4;
                                        this.this$0.a(R.string.mr);
                                        pVar = v.a(f.a.a(e2), list);
                                        MethodCollector.o(13464);
                                        return pVar;
                                    }
                                } else {
                                    IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    MethodCollector.o(13464);
                                    throw illegalStateException;
                                }
                                RecommendList recommendList = (RecommendList) ((RecommendList) obj2).checkValid();
                                h.f.b.l.b(recommendList, "");
                                recommendList.getUserList().size();
                                List<User> userList = recommendList.getUserList();
                                h.f.b.l.b(userList, "");
                                ArrayList arrayList = new ArrayList();
                                for (T t : userList) {
                                    T t2 = t;
                                    SocialCardVM socialCardVM = this.this$0;
                                    h.f.b.l.b(t2, "");
                                    if (socialCardVM.a((User) t2)) {
                                        arrayList.add(t);
                                    }
                                }
                                ArrayList<User> arrayList2 = arrayList;
                                ArrayList arrayList3 = new ArrayList(h.a.n.a((Iterable) arrayList2, 10));
                                for (User user : arrayList2) {
                                    h.f.b.l.b(user, "");
                                    arrayList3.add(new com.ss.android.ugc.aweme.social.widget.card.rec.cell.a(user));
                                }
                                List g2 = h.a.n.g((Collection) list);
                                g2.addAll(arrayList3);
                                SocialCardVM socialCardVM2 = this.this$0;
                                d.a a4 = SocialCardVM.a(socialCardVM2);
                                int cursor = recommendList.getCursor();
                                boolean hasMore = recommendList.hasMore();
                                int i3 = a4.f133860b;
                                int i4 = a4.f133861c;
                                String str = a4.f133863e;
                                String str2 = a4.f133864f;
                                int i5 = a4.f133865g;
                                h.f.b.l.d(str, "");
                                socialCardVM2.f133911c = new d.a(cursor, i3, i4, hasMore, str, str2, i5);
                                if (!recommendList.hasMore()) {
                                    pVar = v.a(f.a.a(h.a.z.INSTANCE), g2);
                                } else {
                                    pVar = v.a(f.a.a(null, h.c.b.a.b.a(recommendList.getCursor()), null, 5), g2);
                                }
                                MethodCollector.o(13464);
                                return pVar;
                            }
                        }

                        public SocialCardVM(com.ss.android.ugc.aweme.social.widget.card.a.i iVar) {
                            int i2;
                            int i3;
                            Map<com.ss.android.ugc.aweme.social.widget.card.a.f, com.ss.android.ugc.aweme.social.widget.card.a.a> map;
                            h.f.b.l.d(iVar, "");
                            this.v = iVar;
                            z a2 = cu.a();
                            this.w = a2;
                            this.f133909a = an.a(o.f159148a.plus(a2));
                            com.ss.android.ugc.aweme.social.widget.card.a.h hVar = iVar.f133752c;
                            this.y = hVar;
                            com.ss.android.ugc.aweme.social.widget.card.a.g gVar = iVar.f133751b;
                            this.f133912d = gVar;
                            this.f133913e = iVar.f133754e;
                            this.f133914f = iVar.f133753d;
                            this.z = h.i.a((h.f.a.a) new l(this));
                            if (gVar != null) {
                                i2 = gVar.f133745d;
                            } else {
                                i2 = 0;
                            }
                            this.f133916h = i2;
                            this.f133918j = new LinkedHashSet();
                            this.f133919k = new LinkedHashSet();
                            this.f133920l = h.a.z.INSTANCE;
                            this.A = h.a.z.INSTANCE;
                            this.B = h.a.z.INSTANCE;
                            this.C = new ArrayList();
                            com.ss.android.ugc.aweme.arch.widgets.base.c<List<com.bytedance.ies.powerlist.b.a>> cVar = new com.ss.android.ugc.aweme.arch.widgets.base.c<>();
                            this.D = cVar;
                            this.f133921m = cVar;
                            com.ss.android.ugc.aweme.arch.widgets.base.c<Integer> cVar2 = new com.ss.android.ugc.aweme.arch.widgets.base.c<>();
                            this.n = cVar2;
                            this.o = cVar2;
                            com.ss.android.ugc.aweme.arch.widgets.base.c<p<Boolean, Integer>> cVar3 = new com.ss.android.ugc.aweme.arch.widgets.base.c<>();
                            this.p = cVar3;
                            this.q = cVar3;
                            com.ss.android.ugc.aweme.arch.widgets.base.c<Integer> cVar4 = new com.ss.android.ugc.aweme.arch.widgets.base.c<>();
                            this.E = cVar4;
                            this.r = cVar4;
                            com.ss.android.ugc.aweme.arch.widgets.base.c cVar5 = new com.ss.android.ugc.aweme.arch.widgets.base.c();
                            this.s = cVar5;
                            this.t = cVar5;
                            c();
                            if (hVar != null) {
                                int i4 = hVar.f133748c;
                                if (gVar == null || (map = gVar.f133742a) == null) {
                                    i3 = 0;
                                } else {
                                    i3 = map.size();
                                }
                                int size = (i4 - i3) - this.A.size();
                                this.f133911c = new d.a(Math.min(size, hVar.f133747b), size, false, (String) null, (String) null, iVar.f133750a, 57);
                            } else {
                                this.f133911c = new d.a(0, 0, false, (String) null, (String) null, 0, 122);
                            }
                            this.f133915g = new com.bytedance.ies.powerlist.page.config.c();
                            if (hVar != null && hVar.f133746a == com.ss.android.ugc.aweme.social.widget.card.a.a.RECTANGLE) {
                                com.bytedance.ies.powerlist.page.config.c cVar6 = this.f133915g;
                                if (cVar6 == null) {
                                    h.f.b.l.a("pageConfigBuilder");
                                }
                                cVar6.a(LoadingFooterCell.class);
                            }
                            this.u = h.i.a((h.f.a.a) new m(this));
                        }

                        public final bz a(h.c.d<? super com.bytedance.ies.powerlist.page.f<Integer>> dVar) {
                            return kotlinx.coroutines.i.a(this.f133909a, null, null, new k(this, dVar, null), 3);
                        }

                        public final void a(int i2) {
                            this.E.postValue(Integer.valueOf(i2));
                        }

                        /* access modifiers changed from: package-private */
                        public static final class g extends h.f.b.m implements h.f.a.m<Integer, List<com.bytedance.ies.powerlist.b.a>, h.z> {
                            final /* synthetic */ SocialCardVM this$0;

                            static {
                                Covode.recordClassIndex(87611);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            g(SocialCardVM socialCardVM) {
                                super(2);
                                this.this$0 = socialCardVM;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // h.f.a.m
                            public final /* synthetic */ h.z invoke(Integer num, List<com.bytedance.ies.powerlist.b.a> list) {
                                int intValue = num.intValue();
                                List<com.bytedance.ies.powerlist.b.a> list2 = list;
                                h.f.b.l.d(list2, "");
                                list2.remove(intValue);
                                SocialCardVM.a(this.this$0, null, list2, null, false, 13);
                                return h.z.f158842a;
                            }
                        }

                        /* access modifiers changed from: package-private */
                        public static final class h extends h.f.b.m implements h.f.a.m<Integer, List<com.bytedance.ies.powerlist.b.a>, h.z> {
                            final /* synthetic */ SocialCardVM this$0;

                            static {
                                Covode.recordClassIndex(87612);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            h(SocialCardVM socialCardVM) {
                                super(2);
                                this.this$0 = socialCardVM;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // h.f.a.m
                            public final /* synthetic */ h.z invoke(Integer num, List<com.bytedance.ies.powerlist.b.a> list) {
                                User user;
                                int intValue = num.intValue();
                                List<com.bytedance.ies.powerlist.b.a> list2 = list;
                                h.f.b.l.d(list2, "");
                                SocialCardVM socialCardVM = this.this$0;
                                socialCardVM.a(Integer.valueOf(socialCardVM.f133916h - 1), Integer.valueOf(this.this$0.f133917i - 1));
                                com.bytedance.ies.powerlist.b.a remove = list2.remove(intValue);
                                if (!(remove instanceof com.ss.android.ugc.aweme.social.widget.card.rec.cell.a)) {
                                    remove = null;
                                }
                                com.ss.android.ugc.aweme.social.widget.card.rec.cell.a aVar = (com.ss.android.ugc.aweme.social.widget.card.rec.cell.a) remove;
                                if (!(aVar == null || (user = aVar.f133855a) == null)) {
                                    this.this$0.a();
                                    String uid = user.getUid();
                                    h.f.b.l.b(uid, "");
                                    String secUid = user.getSecUid();
                                    h.f.b.l.b(secUid, "");
                                    com.ss.android.ugc.aweme.social.widget.card.rec.d.a(uid, secUid);
                                }
                                SocialCardVM.a(this.this$0, list2, null, null, false, 14);
                                return h.z.f158842a;
                            }
                        }

                        /* access modifiers changed from: package-private */
                        public static final class i extends h.f.b.m implements h.f.a.m<Integer, List<com.bytedance.ies.powerlist.b.a>, h.z> {
                            final /* synthetic */ SocialCardVM this$0;

                            static {
                                Covode.recordClassIndex(87613);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            i(SocialCardVM socialCardVM) {
                                super(2);
                                this.this$0 = socialCardVM;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // h.f.a.m
                            public final /* synthetic */ h.z invoke(Integer num, List<com.bytedance.ies.powerlist.b.a> list) {
                                User user;
                                int intValue = num.intValue();
                                List<com.bytedance.ies.powerlist.b.a> list2 = list;
                                h.f.b.l.d(list2, "");
                                com.bytedance.ies.powerlist.b.a remove = list2.remove(intValue);
                                if (!(remove instanceof com.ss.android.ugc.aweme.social.widget.card.rec.cell.a)) {
                                    remove = null;
                                }
                                com.ss.android.ugc.aweme.social.widget.card.rec.cell.a aVar = (com.ss.android.ugc.aweme.social.widget.card.rec.cell.a) remove;
                                if (!(aVar == null || (user = aVar.f133855a) == null)) {
                                    this.this$0.a();
                                    String uid = user.getUid();
                                    h.f.b.l.b(uid, "");
                                    String secUid = user.getSecUid();
                                    h.f.b.l.b(secUid, "");
                                    com.ss.android.ugc.aweme.social.widget.card.rec.d.a(uid, secUid);
                                }
                                SocialCardVM.a(this.this$0, null, null, list2, false, 11);
                                return h.z.f158842a;
                            }
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
                        /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
                        /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object a(com.ss.android.ugc.aweme.social.widget.card.a.f r7, h.c.d<? super java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>> r8) {
                            /*
                                r6 = this;
                                boolean r0 = r8 instanceof com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM.d
                                if (r0 == 0) goto L_0x0050
                                r5 = r8
                                com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM$d r5 = (com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM.d) r5
                                int r0 = r5.label
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r1
                                if (r0 == 0) goto L_0x0050
                                int r0 = r5.label
                                int r0 = r0 - r1
                                r5.label = r0
                            L_0x0013:
                                java.lang.Object r2 = r5.result
                                h.c.a.a r4 = h.c.a.a.COROUTINE_SUSPENDED
                                int r0 = r5.label
                                r3 = 1
                                if (r0 == 0) goto L_0x002f
                                if (r0 != r3) goto L_0x0056
                                java.lang.Object r0 = r5.L$0
                                com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM r0 = (com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM) r0
                                h.r.a(r2)
                            L_0x0025:
                                com.ss.android.ugc.aweme.social.widget.card.j r1 = r0.f133913e
                                if (r1 == 0) goto L_0x002e
                                com.ss.android.ugc.aweme.social.widget.card.k r0 = com.ss.android.ugc.aweme.social.widget.card.k.NORMAL
                                r1.a(r0)
                            L_0x002e:
                                return r2
                            L_0x002f:
                                h.r.a(r2)
                                com.ss.android.ugc.aweme.social.widget.card.j r1 = r6.f133913e
                                if (r1 == 0) goto L_0x003b
                                com.ss.android.ugc.aweme.social.widget.card.k r0 = com.ss.android.ugc.aweme.social.widget.card.k.LOADING
                                r1.a(r0)
                            L_0x003b:
                                kotlinx.coroutines.ah r2 = kotlinx.coroutines.bf.f159041b
                                com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM$e r1 = new com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM$e
                                r0 = 0
                                r1.<init>(r6, r7, r0)
                                r5.L$0 = r6
                                r5.label = r3
                                java.lang.Object r2 = kotlinx.coroutines.i.a(r2, r1, r5)
                                if (r2 != r4) goto L_0x004e
                                return r4
                            L_0x004e:
                                r0 = r6
                                goto L_0x0025
                            L_0x0050:
                                com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM$d r5 = new com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM$d
                                r5.<init>(r6, r8)
                                goto L_0x0013
                            L_0x0056:
                                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r0)
                                throw r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM.a(com.ss.android.ugc.aweme.social.widget.card.a.f, h.c.d):java.lang.Object");
                        }

                        private static h.z a(com.bytedance.ies.powerlist.b.a aVar, List<? extends com.bytedance.ies.powerlist.b.a> list, h.f.a.m<? super Integer, ? super List<com.bytedance.ies.powerlist.b.a>, h.z> mVar) {
                            int indexOf = list.indexOf(aVar);
                            if (indexOf == -1) {
                                return null;
                            }
                            mVar.invoke(Integer.valueOf(indexOf), h.a.n.g((Collection) list));
                            return h.z.f158842a;
                        }

                        private final void a(List<? extends com.bytedance.ies.powerlist.b.a> list, List<? extends com.bytedance.ies.powerlist.b.a> list2, List<? extends com.bytedance.ies.powerlist.b.a> list3, boolean z2) {
                            if (list != null) {
                                this.f133920l = h.a.n.k(list);
                            }
                            if (list2 != null) {
                                this.A = h.a.n.k(list2);
                            }
                            if (list3 != null) {
                                this.B = h.a.n.k(list3);
                            }
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(this.f133920l);
                            int size = arrayList.size();
                            int i2 = this.f133916h;
                            if (i2 >= 0 && size > i2) {
                                arrayList.addAll(i2, this.A);
                            } else {
                                arrayList.addAll(this.A);
                            }
                            int size2 = arrayList.size();
                            int i3 = this.f133917i;
                            if (i3 >= 0 && size2 > i3) {
                                arrayList.addAll(i3, this.B);
                            } else {
                                arrayList.addAll(this.B);
                            }
                            if (this.v.f133755f && arrayList.size() > 0) {
                                arrayList.add(0, new com.ss.android.ugc.aweme.social.widget.card.a(-1));
                            }
                            this.C.clear();
                            this.C.addAll(arrayList);
                            arrayList.size();
                            if (z2) {
                                this.C.size();
                                com.ss.android.ugc.aweme.social.widget.card.j jVar = this.f133913e;
                                if (jVar != null) {
                                    jVar.d(this.C.size());
                                }
                                this.D.postValue(this.C);
                            }
                        }

                        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM */
                        /* JADX WARN: Multi-variable type inference failed */
                        static /* synthetic */ void a(SocialCardVM socialCardVM, List list, List list2, List list3, boolean z2, int i2) {
                            if ((i2 & 1) != 0) {
                                list = null;
                            }
                            if ((i2 & 2) != 0) {
                                list2 = null;
                            }
                            if ((i2 & 4) != 0) {
                                list3 = null;
                            }
                            if ((i2 & 8) != 0) {
                                z2 = true;
                            }
                            socialCardVM.a(list, list2, list3, z2);
                        }
                    }
