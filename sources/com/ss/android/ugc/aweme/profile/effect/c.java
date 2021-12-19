package com.ss.android.ugc.aweme.profile.effect;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.bytedance.jedi.arch.i;
import com.bytedance.jedi.arch.q;
import com.bytedance.widget.Widget;
import com.bytedance.widget.c;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.detail.operators.ad;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class c implements aa {

    /* renamed from: a  reason: collision with root package name */
    public boolean f116290a;

    /* renamed from: b  reason: collision with root package name */
    public final EffectProfileListViewModel f116291b;

    /* renamed from: c  reason: collision with root package name */
    private q f116292c;

    /* renamed from: d  reason: collision with root package name */
    private androidx.fragment.app.e f116293d;

    public static final class a extends m implements h.f.a.b<i, z> {
        public static final a INSTANCE = new a();

        static {
            Covode.recordClassIndex(75076);
        }

        public a() {
            super(1);
        }

        @Override // h.f.a.b
        public final void invoke(i iVar) {
        }
    }

    public static final class b extends m implements h.f.a.m<i, Throwable, z> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(75077);
        }

        public b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* bridge */ /* synthetic */ z invoke(i iVar, Throwable th) {
            invoke(iVar, th);
            return z.f158842a;
        }

        public final void invoke(i iVar, Throwable th) {
            l.c(th, "");
        }
    }

    static {
        Covode.recordClassIndex(75075);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean cannotLoadLatest() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean cannotLoadMore() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean deleteItem(String str) {
        l.d(str, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final int getPageType(int i2) {
        return i2 + 10000;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean isDataEmpty() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void unInit() {
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.c$c  reason: collision with other inner class name */
    public static final class C2968c implements com.bytedance.jedi.arch.ext.list.c<com.ss.android.ugc.aweme.sticker.model.g, i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f116294a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f116295b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f116296c;

        /* renamed from: d  reason: collision with root package name */
        private final h.f.a.b<i, z> f116297d;

        /* renamed from: e  reason: collision with root package name */
        private final h.f.a.m<i, Throwable, z> f116298e;

        /* renamed from: f  reason: collision with root package name */
        private final h.f.a.m<i, List<? extends com.ss.android.ugc.aweme.sticker.model.g>, z> f116299f;

        static {
            Covode.recordClassIndex(75078);
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.b<i, z> a() {
            return this.f116297d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<i, Throwable, z> b() {
            return this.f116298e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<i, List<? extends com.ss.android.ugc.aweme.sticker.model.g>, z> c() {
            return this.f116299f;
        }

        public C2968c(h.f.a.b bVar, h.f.a.m mVar, h.f.a.m mVar2) {
            this.f116294a = bVar;
            this.f116295b = mVar;
            this.f116296c = mVar2;
            this.f116297d = bVar;
            this.f116298e = mVar;
            this.f116299f = mVar2;
        }
    }

    public static final class d implements com.bytedance.jedi.arch.ext.list.c<com.ss.android.ugc.aweme.sticker.model.g, i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f116300a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f116301b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f116302c;

        /* renamed from: d  reason: collision with root package name */
        private final h.f.a.b<i, z> f116303d;

        /* renamed from: e  reason: collision with root package name */
        private final h.f.a.m<i, Throwable, z> f116304e;

        /* renamed from: f  reason: collision with root package name */
        private final h.f.a.m<i, List<? extends com.ss.android.ugc.aweme.sticker.model.g>, z> f116305f;

        static {
            Covode.recordClassIndex(75079);
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.b<i, z> a() {
            return this.f116303d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<i, Throwable, z> b() {
            return this.f116304e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<i, List<? extends com.ss.android.ugc.aweme.sticker.model.g>, z> c() {
            return this.f116305f;
        }

        public d(h.f.a.b bVar, h.f.a.m mVar, h.f.a.m mVar2) {
            this.f116300a = bVar;
            this.f116301b = mVar;
            this.f116302c = mVar2;
            this.f116303d = bVar;
            this.f116304e = mVar;
            this.f116305f = mVar2;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final /* bridge */ /* synthetic */ Object getViewModel() {
        return this.f116291b;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean isLoading() {
        return this.f116290a;
    }

    public c(EffectProfileListViewModel effectProfileListViewModel) {
        this.f116291b = effectProfileListViewModel;
    }

    static final class f extends m implements h.f.a.b<i, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.common.e.c $listview;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(75082);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar, com.ss.android.ugc.aweme.common.e.c cVar2) {
            super(1);
            this.this$0 = cVar;
            this.$listview = cVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(i iVar) {
            i iVar2 = iVar;
            l.d(iVar2, "");
            iVar2.withState(this.this$0.f116291b, new h.f.a.b<EffectProfileState, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.effect.c.f.AnonymousClass1 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(75083);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(EffectProfileState effectProfileState) {
                    l.d(effectProfileState, "");
                    this.this$0.$listview.aO_();
                    this.this$0.this$0.f116290a = true;
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void bindView(ad adVar) {
        l.d(adVar, "");
        EffectProfileListViewModel effectProfileListViewModel = this.f116291b;
        if (effectProfileListViewModel != null) {
            q qVar = this.f116292c;
            if (qVar == null) {
                l.a("jediView");
            }
            ListViewModel.a(effectProfileListViewModel, qVar, (com.bytedance.jedi.arch.ext.list.a) null, new C2968c(a.INSTANCE, b.INSTANCE, new e(this, adVar)), new d(new f(this, adVar), new h(this, adVar), new g(this, adVar)), 242);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean init(Fragment fragment) {
        l.d(fragment, "");
        if (this.f116291b == null) {
            return false;
        }
        androidx.fragment.app.e activity = fragment.getActivity();
        if (activity == null) {
            l.b();
        }
        this.f116293d = activity;
        this.f116292c = new EffectProfileDetailJediWidget();
        com.bytedance.widget.c a2 = c.a.a(fragment, fragment.getView());
        q qVar = this.f116292c;
        if (qVar == null) {
            l.a("jediView");
        }
        Objects.requireNonNull(qVar, "null cannot be cast to non-null type com.bytedance.widget.Widget");
        a2.a((Widget) qVar);
        return true;
    }

    static final class e extends m implements h.f.a.m<i, List<? extends com.ss.android.ugc.aweme.sticker.model.g>, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.common.e.c $listview;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(75080);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar, com.ss.android.ugc.aweme.common.e.c cVar2) {
            super(2);
            this.this$0 = cVar;
            this.$listview = cVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(i iVar, List<? extends com.ss.android.ugc.aweme.sticker.model.g> list) {
            i iVar2 = iVar;
            l.d(iVar2, "");
            l.d(list, "");
            iVar2.withState(this.this$0.f116291b, new h.f.a.b<EffectProfileState, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.effect.c.e.AnonymousClass1 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(75081);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(EffectProfileState effectProfileState) {
                    EffectProfileState effectProfileState2 = effectProfileState;
                    l.d(effectProfileState2, "");
                    com.bytedance.jedi.arch.ext.list.b bVar = effectProfileState2.getSubstate().getPayload().f39459a;
                    List<com.ss.android.ugc.aweme.sticker.model.g> list = effectProfileState2.getSubstate().getList();
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        Aweme aweme = it.next().relatedAweme;
                        if (aweme != null) {
                            arrayList.add(aweme);
                        }
                    }
                    this.this$0.$listview.a(arrayList, bVar.f39447a);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.m<i, List<? extends com.ss.android.ugc.aweme.sticker.model.g>, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.common.e.c $listview;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(75084);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar, com.ss.android.ugc.aweme.common.e.c cVar2) {
            super(2);
            this.this$0 = cVar;
            this.$listview = cVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(i iVar, List<? extends com.ss.android.ugc.aweme.sticker.model.g> list) {
            i iVar2 = iVar;
            l.d(iVar2, "");
            l.d(list, "");
            iVar2.withState(this.this$0.f116291b, new h.f.a.b<EffectProfileState, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.effect.c.g.AnonymousClass1 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(75085);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(EffectProfileState effectProfileState) {
                    EffectProfileState effectProfileState2 = effectProfileState;
                    l.d(effectProfileState2, "");
                    com.bytedance.jedi.arch.ext.list.b bVar = effectProfileState2.getSubstate().getPayload().f39459a;
                    List<com.ss.android.ugc.aweme.sticker.model.g> list = effectProfileState2.getSubstate().getList();
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        Aweme aweme = it.next().relatedAweme;
                        if (aweme != null) {
                            arrayList.add(aweme);
                        }
                    }
                    this.this$0.$listview.b(arrayList, bVar.f39447a);
                    return z.f158842a;
                }
            });
            this.this$0.f116290a = false;
            return z.f158842a;
        }
    }

    static final class h extends m implements h.f.a.m<i, Throwable, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.common.e.c $listview;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(75086);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar, com.ss.android.ugc.aweme.common.e.c cVar2) {
            super(2);
            this.this$0 = cVar;
            this.$listview = cVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(i iVar, Throwable th) {
            Throwable th2 = th;
            l.d(iVar, "");
            l.d(th2, "");
            this.$listview.c(new Exception(th2));
            this.this$0.f116290a = false;
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        EffectProfileListViewModel effectProfileListViewModel;
        l.d(bVar, "");
        if (i2 == 1) {
            EffectProfileListViewModel effectProfileListViewModel2 = this.f116291b;
            if (effectProfileListViewModel2 != null) {
                effectProfileListViewModel2.k();
            }
        } else if (i2 == 4 && (effectProfileListViewModel = this.f116291b) != null) {
            effectProfileListViewModel.l();
        }
    }
}
