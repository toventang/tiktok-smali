package com.ss.android.ugc.aweme.profile.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.o;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import f.a.t;
import h.a.n;
import h.a.z;
import h.f.a.m;
import h.f.b.l;
import h.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class EffectProfileListViewModel extends CommonListViewModel<com.ss.android.ugc.aweme.sticker.model.g, EffectProfileState> implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f116268a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private boolean f116269b;

    /* renamed from: c  reason: collision with root package name */
    private String f116270c;

    /* renamed from: d  reason: collision with root package name */
    private String f116271d;

    /* renamed from: e  reason: collision with root package name */
    private final h.f.a.b<EffectProfileState, t<p<List<com.ss.android.ugc.aweme.sticker.model.g>, o>>> f116272e = new f(this);

    /* renamed from: f  reason: collision with root package name */
    private final h.f.a.b<EffectProfileState, t<p<List<com.ss.android.ugc.aweme.sticker.model.g>, o>>> f116273f = new c(this);

    /* renamed from: g  reason: collision with root package name */
    private final m<List<? extends com.ss.android.ugc.aweme.sticker.model.g>, List<? extends com.ss.android.ugc.aweme.sticker.model.g>, List<com.ss.android.ugc.aweme.sticker.model.g>> f116274g = g.f116280a;

    /* renamed from: k  reason: collision with root package name */
    private final m<List<? extends com.ss.android.ugc.aweme.sticker.model.g>, List<? extends com.ss.android.ugc.aweme.sticker.model.g>, List<com.ss.android.ugc.aweme.sticker.model.g>> f116275k = d.f116278a;

    static {
        Covode.recordClassIndex(75053);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75054);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    public final h.f.a.b<EffectProfileState, t<p<List<com.ss.android.ugc.aweme.sticker.model.g>, o>>> a() {
        return this.f116272e;
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    public final h.f.a.b<EffectProfileState, t<p<List<com.ss.android.ugc.aweme.sticker.model.g>, o>>> b() {
        return this.f116273f;
    }

    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    public final m<List<? extends com.ss.android.ugc.aweme.sticker.model.g>, List<? extends com.ss.android.ugc.aweme.sticker.model.g>, List<com.ss.android.ugc.aweme.sticker.model.g>> i() {
        return this.f116274g;
    }

    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    public final m<List<? extends com.ss.android.ugc.aweme.sticker.model.g>, List<? extends com.ss.android.ugc.aweme.sticker.model.g>, List<com.ss.android.ugc.aweme.sticker.model.g>> j() {
        return this.f116275k;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new EffectProfileState(null, null, 3, null);
    }

    public final String m() {
        if (this.f116269b) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            String curUserId = g2.getCurUserId();
            l.b(curUserId, "");
            return curUserId;
        }
        String str = this.f116270c;
        if (str == null) {
            return "";
        }
        return str;
    }

    static final class f extends h.f.b.m implements h.f.a.b<EffectProfileState, t<p<? extends List<? extends com.ss.android.ugc.aweme.sticker.model.g>, ? extends o>>> {
        final /* synthetic */ EffectProfileListViewModel this$0;

        static {
            Covode.recordClassIndex(75060);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(EffectProfileListViewModel effectProfileListViewModel) {
            super(1);
            this.this$0 = effectProfileListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends com.ss.android.ugc.aweme.sticker.model.g>, ? extends o>> invoke(EffectProfileState effectProfileState) {
            l.d(effectProfileState, "");
            t<R> d2 = g.a(this.this$0.m(), 0).d(AnonymousClass1.f116279a);
            l.b(d2, "");
            return d2;
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.b<EffectProfileState, EffectProfileState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f116276a = new b();

        static {
            Covode.recordClassIndex(75055);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EffectProfileState invoke(EffectProfileState effectProfileState) {
            EffectProfileState effectProfileState2 = effectProfileState;
            l.d(effectProfileState2, "");
            return EffectProfileState.copy$default(effectProfileState2, null, new ListState(new o(false, 0), z.INSTANCE, null, null, null, 28, null), 1, null);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<EffectProfileState, t<p<? extends List<? extends com.ss.android.ugc.aweme.sticker.model.g>, ? extends o>>> {
        final /* synthetic */ EffectProfileListViewModel this$0;

        static {
            Covode.recordClassIndex(75056);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(EffectProfileListViewModel effectProfileListViewModel) {
            super(1);
            this.this$0 = effectProfileListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends com.ss.android.ugc.aweme.sticker.model.g>, ? extends o>> invoke(EffectProfileState effectProfileState) {
            EffectProfileState effectProfileState2 = effectProfileState;
            l.d(effectProfileState2, "");
            t<R> d2 = g.a(this.this$0.m(), (long) effectProfileState2.getSubstate().getPayload().f39460b).d(AnonymousClass1.f116277a);
            l.b(d2, "");
            return d2;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<EffectProfileState, h.z> {
        final /* synthetic */ Aweme $aweme;
        final /* synthetic */ h.f.a.b $callback;

        static {
            Covode.recordClassIndex(75059);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Aweme aweme, h.f.a.b bVar) {
            super(1);
            this.$aweme = aweme;
            this.$callback = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(EffectProfileState effectProfileState) {
            EffectProfileState effectProfileState2 = effectProfileState;
            l.d(effectProfileState2, "");
            Iterator<com.ss.android.ugc.aweme.sticker.model.g> it = effectProfileState2.getSubstate().getList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.$callback.invoke(null);
                    break;
                }
                com.ss.android.ugc.aweme.sticker.model.g next = it.next();
                if (!(next.relatedAweme == null || this.$aweme == null)) {
                    Aweme aweme = next.relatedAweme;
                    l.b(aweme, "");
                    if (l.a((Object) aweme.getAid(), (Object) this.$aweme.getAid())) {
                        this.$callback.invoke(next);
                        break;
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements m<List<? extends com.ss.android.ugc.aweme.sticker.model.g>, List<? extends com.ss.android.ugc.aweme.sticker.model.g>, List<? extends com.ss.android.ugc.aweme.sticker.model.g>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f116280a = new g();

        static {
            Covode.recordClassIndex(75062);
        }

        g() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ List<? extends com.ss.android.ugc.aweme.sticker.model.g> invoke(List<? extends com.ss.android.ugc.aweme.sticker.model.g> list, List<? extends com.ss.android.ugc.aweme.sticker.model.g> list2) {
            l.d(list, "");
            l.d(list2, "");
            return list2;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.effect.h
    public final void a(Aweme aweme, h.f.a.b<? super com.ss.android.ugc.aweme.sticker.model.g, h.z> bVar) {
        l.d(bVar, "");
        b_(new e(aweme, bVar));
    }

    static final class d extends h.f.b.m implements m<List<? extends com.ss.android.ugc.aweme.sticker.model.g>, List<? extends com.ss.android.ugc.aweme.sticker.model.g>, List<? extends com.ss.android.ugc.aweme.sticker.model.g>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f116278a = new d();

        static {
            Covode.recordClassIndex(75058);
        }

        d() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ List<? extends com.ss.android.ugc.aweme.sticker.model.g> invoke(List<? extends com.ss.android.ugc.aweme.sticker.model.g> list, List<? extends com.ss.android.ugc.aweme.sticker.model.g> list2) {
            List<? extends com.ss.android.ugc.aweme.sticker.model.g> list3 = list;
            List<? extends com.ss.android.ugc.aweme.sticker.model.g> list4 = list2;
            l.d(list3, "");
            l.d(list4, "");
            return n.d((Collection) list3, (Iterable) list4);
        }
    }

    public final void a(boolean z, String str, String str2) {
        this.f116269b = z;
        this.f116270c = str;
        this.f116271d = str2;
    }
}
