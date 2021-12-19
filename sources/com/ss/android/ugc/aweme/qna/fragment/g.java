package com.ss.android.ugc.aweme.qna.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ad;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.c.b;
import com.ss.android.ugc.aweme.qna.ui.QnaRecyclerView;
import com.ss.android.ugc.aweme.qna.vm.QnaAnswersTabViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaBannerViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaSelectedPageViewModel;
import com.ss.android.ugc.aweme.service.EOYServiceImpl;
import com.ss.android.ugc.aweme.service.IEOYService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.ThreadMode;

public final class g extends a implements com.bytedance.assem.arch.viewModel.h, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    public static final e n = new e((byte) 0);

    /* renamed from: i  reason: collision with root package name */
    public View f119422i;

    /* renamed from: j  reason: collision with root package name */
    public QnaAnswersTabViewModel f119423j;

    /* renamed from: k  reason: collision with root package name */
    public com.ss.android.ugc.aweme.qna.ui.l f119424k;

    /* renamed from: l  reason: collision with root package name */
    public String f119425l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f119426m;
    private final com.bytedance.assem.arch.viewModel.b o;
    private final com.bytedance.assem.arch.viewModel.b p;
    private SparseArray q;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.qna.vm.f, com.ss.android.ugc.aweme.qna.vm.f> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(77555);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.qna.vm.f invoke(com.ss.android.ugc.aweme.qna.vm.f fVar) {
            h.f.b.l.c(fVar, "");
            return fVar;
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.qna.vm.h, com.ss.android.ugc.aweme.qna.vm.h> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(77557);
        }

        public d() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.qna.vm.h invoke(com.ss.android.ugc.aweme.qna.vm.h hVar) {
            h.f.b.l.c(hVar, "");
            return hVar;
        }
    }

    static {
        Covode.recordClassIndex(77553);
    }

    private final QnaBannerViewModel j() {
        return (QnaBannerViewModel) this.o.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.qna.fragment.a
    public final View a(int i2) {
        if (this.q == null) {
            this.q = new SparseArray();
        }
        View view = (View) this.q.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.q.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.qna.fragment.a
    public final void br_() {
        SparseArray sparseArray = this.q;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.qna.fragment.a
    public final int c() {
        return R.string.f45;
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.a
    public final String d() {
        return "answers";
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final androidx.lifecycle.m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.d getReceiverForHostVM() {
        return null;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new org.greenrobot.eventbus.g(g.class, "onVideoEvent", ag.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.qna.fragment.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    public static final class e {
        static {
            Covode.recordClassIndex(77558);
        }

        private e() {
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.tiktok.proxy.f
    public final androidx.lifecycle.m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.h
    public final com.bytedance.tiktok.proxy.d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.h<com.bytedance.tiktok.proxy.d> getActualReceiverHolder() {
        return this;
    }

    static final class f extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(77559);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.i();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.a
    public final void f() {
        if (this.f119423j != null) {
            i();
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<w, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(77562);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        static final class a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ w $fetchAnswersSuccess$inlined;
            final /* synthetic */ i this$0;

            static {
                Covode.recordClassIndex(77563);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(i iVar, w wVar) {
                super(0);
                this.this$0 = iVar;
                this.$fetchAnswersSuccess$inlined = wVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.this$0.i();
                return z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(w wVar) {
            w wVar2 = wVar;
            h.f.b.l.d(wVar2, "");
            if (this.this$0.f119425l != null) {
                g gVar = this.this$0;
                gVar.a((a) wVar2, (w) gVar.g(), (View) v.Answers, (v) this.this$0.h(), (boolean) this.this$0.f119425l, (String) ((h.f.a.a<z>) new a(this, wVar2)), (h.f.a.a) false);
            }
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, User, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(77569);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        static final class a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ o this$0;

            static {
                Covode.recordClassIndex(77570);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(o oVar) {
                super(0);
                this.this$0 = oVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.this$0.i();
                return z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.tiktok.proxy.d dVar, User user) {
            LiveData<com.ss.android.ugc.aweme.qna.g.b<w>> liveData;
            com.ss.android.ugc.aweme.qna.g.b<w> value;
            T t;
            User user2 = user;
            h.f.b.l.d(dVar, "");
            if (user2 != null) {
                this.this$0.f119425l = in.a(user2, false);
                QnaAnswersTabViewModel qnaAnswersTabViewModel = this.this$0.f119423j;
                if (!(qnaAnswersTabViewModel == null || (liveData = qnaAnswersTabViewModel.f119620c) == null || (value = liveData.getValue()) == null || (t = value.f119462b) == null)) {
                    g gVar = this.this$0;
                    gVar.a((a) t, (w) gVar.g(), (View) v.Answers, (v) this.this$0.h(), (boolean) this.this$0.f119425l, (String) ((h.f.a.a<z>) new a(this)), (h.f.a.a) false);
                }
            }
            return z.f158842a;
        }
    }

    public final View g() {
        View view = this.f119422i;
        if (view == null) {
            h.f.b.l.a("answerTabLayout");
        }
        return view;
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(77554);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(77556);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public final boolean h() {
        String str = ((a) this).f119407f;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        return TextUtils.equals(str, g2.getCurUserId());
    }

    public final void i() {
        String lastRecordedSecUid;
        String str = ((a) this).f119407f;
        if (str != null) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            if (h()) {
                h.f.b.l.b(g2, "");
                str = g2.getCurUserId();
            }
            boolean h2 = h();
            h.f.b.l.b(g2, "");
            if (h2) {
                lastRecordedSecUid = g2.getCurSecUserId();
            } else {
                lastRecordedSecUid = g2.getLastRecordedSecUid();
            }
            QnaAnswersTabViewModel qnaAnswersTabViewModel = this.f119423j;
            if (qnaAnswersTabViewModel != null) {
                h.f.b.l.b(str, "");
                h.f.b.l.b(lastRecordedSecUid, "");
                qnaAnswersTabViewModel.a(str, lastRecordedSecUid, this.f119425l, this.f119426m);
            }
        }
    }

    public g() {
        com.bytedance.assem.arch.viewModel.b bVar;
        com.bytedance.assem.arch.viewModel.b bVar2;
        i.a aVar = i.a.f25718a;
        h.k.c a2 = ab.a(QnaBannerViewModel.class);
        a aVar2 = new a(a2);
        b bVar3 = b.INSTANCE;
        if (h.f.b.l.a(aVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.a((androidx.lifecycle.m) this, true), u.a((androidx.lifecycle.ag) this, true), u.c.f25670a, bVar3, u.a((Fragment) this, true), u.b((Fragment) this, true));
        } else if (aVar == null || h.f.b.l.a(aVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((androidx.lifecycle.ag) this, false), u.c.f25670a, bVar3, u.a((Fragment) this, false), u.b((Fragment) this, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.o = bVar;
        i.a aVar3 = i.a.f25718a;
        h.k.c a3 = ab.a(QnaSelectedPageViewModel.class);
        c cVar = new c(a3);
        d dVar = d.INSTANCE;
        if (h.f.b.l.a(aVar3, i.a.f25718a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, true), u.a((androidx.lifecycle.ag) this, true), u.c.f25670a, dVar, u.a((Fragment) this, true), u.b((Fragment) this, true));
        } else if (aVar3 == null || h.f.b.l.a(aVar3, i.d.f25721a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((androidx.lifecycle.ag) this, false), u.c.f25670a, dVar, u.a((Fragment) this, false), u.b((Fragment) this, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.p = bVar2;
        cg.a(this);
    }

    static final class p extends h.f.b.m implements h.f.a.b<BaseFragmentViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f119427a = new p();

        static {
            Covode.recordClassIndex(77571);
        }

        p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            h.f.b.l.d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(AnonymousClass1.f119428a);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.qna.fragment.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(p.f119427a);
    }

    static final class j extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.qna.vm.d, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(77564);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.qna.vm.d dVar) {
            com.ss.android.ugc.aweme.qna.vm.d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            String str = dVar2.f119669a;
            String str2 = dVar2.f119670b;
            Context requireContext = this.this$0.requireContext();
            h.f.b.l.b(requireContext, "");
            g.a(str, str2, requireContext, this.this$0.h());
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.qna.vm.a, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(77565);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.qna.vm.a aVar) {
            com.ss.android.ugc.aweme.qna.vm.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            this.this$0.a(aVar2.f119660a, aVar2.f119661b, this.this$0.h());
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.qna.vm.c, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(77566);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.qna.vm.c cVar) {
            com.ss.android.ugc.aweme.qna.vm.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            g gVar = this.this$0;
            gVar.a(cVar2, gVar.h());
            return z.f158842a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ View $view;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(77573);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(g gVar, View view) {
            super(1);
            this.this$0 = gVar;
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            h.f.b.l.d(assembler2, "");
            assembler2.b(this.this$0, new h.f.a.b<com.bytedance.assem.arch.core.q, z>(this) {
                /* class com.ss.android.ugc.aweme.qna.fragment.g.q.AnonymousClass1 */
                final /* synthetic */ q this$0;

                static {
                    Covode.recordClassIndex(77574);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.q qVar) {
                    com.bytedance.assem.arch.core.q qVar2 = qVar;
                    h.f.b.l.d(qVar2, "");
                    qVar2.f25599e = this.this$0.$view.findViewById(R.id.dqk);
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.qna.a.a.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.qna.a.a();
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.g$g  reason: collision with other inner class name */
    static final class C3083g extends h.f.b.m implements h.f.a.b<List<? extends com.ss.android.ugc.aweme.qna.model.f>, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(77560);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3083g(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends com.ss.android.ugc.aweme.qna.model.f> list) {
            List<? extends com.ss.android.ugc.aweme.qna.model.f> list2 = list;
            h.f.b.l.d(list2, "");
            com.ss.android.ugc.aweme.qna.ui.l lVar = this.this$0.f119424k;
            if (lVar == null) {
                h.f.b.l.a("answersTabAdapter");
            }
            ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            lVar.a(arrayList);
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.qna.vm.b, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(77567);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.qna.vm.b bVar) {
            com.ss.android.ugc.aweme.qna.vm.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            ArrayList arrayList = new ArrayList();
            if (bVar2.f119666e) {
                if (bVar2.f119663b) {
                    String string = this.this$0.requireContext().getString(R.string.f56);
                    h.f.b.l.b(string, "");
                    arrayList.add(new f(string, 0, c.UNTRANSLATE));
                } else {
                    String string2 = this.this$0.requireContext().getString(R.string.gkc);
                    h.f.b.l.b(string2, "");
                    arrayList.add(new f(string2, 0, c.TRANSLATE));
                }
            }
            String string3 = this.this$0.requireContext().getString(R.string.f57);
            h.f.b.l.b(string3, "");
            arrayList.add(new f(string3, 0, c.VIEW_ANSWERS));
            b.a.a(bVar2.f119662a, this.this$0.h());
            QnaAnswersTabViewModel qnaAnswersTabViewModel = this.this$0.f119423j;
            if (qnaAnswersTabViewModel != null) {
                this.this$0.a(arrayList, qnaAnswersTabViewModel, bVar2);
            }
            return z.f158842a;
        }
    }

    @org.greenrobot.eventbus.r
    public final void onVideoEvent(ag agVar) {
        h.f.b.l.d(agVar, "");
        if (agVar.f93450a == 2) {
            Object obj = agVar.f93451b;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            if (AwemeService.b().b(str) != null) {
                QnaAnswersTabViewModel qnaAnswersTabViewModel = this.f119423j;
                if (qnaAnswersTabViewModel != null) {
                    h.f.b.l.d(str, "");
                    qnaAnswersTabViewModel.f119618a.a(str);
                }
                String str2 = ((a) this).f119407f;
                if (str2 != null) {
                    QnaBannerViewModel j2 = j();
                    Long g2 = h.m.p.g(str2);
                    IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                    h.f.b.l.b(g3, "");
                    String lastRecordedSecUid = g3.getLastRecordedSecUid();
                    h.f.b.l.b(lastRecordedSecUid, "");
                    j2.a(g2, lastRecordedSecUid);
                }
            }
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<e, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(77568);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            QnaAnswersTabViewModel qnaAnswersTabViewModel;
            e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            b.a.a(eVar2.f119417a.f119662a, eVar2.f119418b, this.this$0.h());
            int i2 = h.f119429a[eVar2.f119418b.ordinal()];
            int i3 = 0;
            if (i2 == 1) {
                QnaAnswersTabViewModel qnaAnswersTabViewModel2 = this.this$0.f119423j;
                if (qnaAnswersTabViewModel2 != null) {
                    String str = eVar2.f119417a.f119662a;
                    h.f.b.l.d(str, "");
                    com.ss.android.ugc.aweme.qna.d.c cVar = qnaAnswersTabViewModel2.f119618a;
                    h.f.b.l.d(str, "");
                    cVar.f119307e.add(str);
                    cVar.a(h.a.z.INSTANCE, false, null);
                    int size = cVar.f119305c.size();
                    if (size >= 0) {
                        while (true) {
                            if (!h.f.b.l.a((Object) String.valueOf(cVar.f119305c.get(i3).f119220a), (Object) str)) {
                                if (i3 == size) {
                                    break;
                                }
                                i3++;
                            } else {
                                String str2 = cVar.f119305c.get(i3).f119221b;
                                if (str2 != null) {
                                    cVar.f119308f.a(new com.ss.android.ugc.aweme.qna.d.l(str, new com.ss.android.ugc.aweme.qna.d.a(h.a.n.a(new com.ss.android.ugc.aweme.qna.d.k(str2)), SettingServiceImpl.v().h())), cVar);
                                }
                            }
                        }
                    }
                }
            } else if (i2 == 2) {
                QnaAnswersTabViewModel qnaAnswersTabViewModel3 = this.this$0.f119423j;
                if (qnaAnswersTabViewModel3 != null) {
                    String str3 = eVar2.f119417a.f119662a;
                    h.f.b.l.d(str3, "");
                    com.ss.android.ugc.aweme.qna.d.c cVar2 = qnaAnswersTabViewModel3.f119618a;
                    h.f.b.l.d(str3, "");
                    cVar2.f119306d.remove(str3);
                    cVar2.a(h.a.z.INSTANCE, false, null);
                }
            } else if (i2 == 3 && (qnaAnswersTabViewModel = this.this$0.f119423j) != null) {
                qnaAnswersTabViewModel.a(eVar2.f119417a.f119662a, "click_answer");
            }
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, Boolean, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(77561);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.tiktok.proxy.d dVar, Boolean bool) {
            Boolean bool2 = bool;
            h.f.b.l.d(dVar, "");
            if (bool2 != null) {
                bool2.booleanValue();
                this.this$0.f119426m = !bool2.booleanValue();
            }
            return z.f158842a;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, com.bytedance.assem.arch.extensions.a<? extends a>, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(77575);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.tiktok.proxy.d dVar, com.bytedance.assem.arch.extensions.a<? extends a> aVar) {
            T t;
            com.bytedance.assem.arch.extensions.a<? extends a> aVar2 = aVar;
            h.f.b.l.d(dVar, "");
            if (aVar2 != null) {
                t = aVar2.f25631b;
            } else {
                t = null;
            }
            if (t instanceof g) {
                this.this$0.e();
                EOYServiceImpl.b().b("qa_others_profile");
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LiveData<com.ss.android.ugc.aweme.qna.g.b<e>> liveData;
        t<com.ss.android.ugc.aweme.qna.g.b<com.ss.android.ugc.aweme.qna.vm.b>> tVar;
        LiveData<com.ss.android.ugc.aweme.qna.g.b<com.ss.android.ugc.aweme.qna.vm.c>> liveData2;
        LiveData<com.ss.android.ugc.aweme.qna.g.b<com.ss.android.ugc.aweme.qna.vm.a>> liveData3;
        LiveData<com.ss.android.ugc.aweme.qna.g.b<com.ss.android.ugc.aweme.qna.vm.d>> liveData4;
        LiveData<com.ss.android.ugc.aweme.qna.g.b<w>> liveData5;
        LiveData<com.ss.android.ugc.aweme.qna.g.b<List<com.ss.android.ugc.aweme.qna.model.f>>> liveData6;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("isSelf")) {
            IEOYService b2 = EOYServiceImpl.b();
            View view2 = this.f119422i;
            if (view2 == null) {
                h.f.b.l.a("answerTabLayout");
            }
            if (!(view2 instanceof ViewGroup)) {
                view2 = null;
            }
            if (b2.a((ViewGroup) view2, "qa_others_profile")) {
                View view3 = this.f119422i;
                if (view3 == null) {
                    h.f.b.l.a("answerTabLayout");
                }
                View findViewById = view3.findViewById(R.id.l2);
                h.f.b.l.b(findViewById, "");
                Resources system = Resources.getSystem();
                h.f.b.l.a((Object) system, "");
                com.bytedance.tux.h.i.b(findViewById, null, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 40.0f, system.getDisplayMetrics()))), null, null, false, 29);
            }
        }
        com.bytedance.assem.arch.extensions.d.a(this, new q(this, view));
        View view4 = this.f119422i;
        if (view4 == null) {
            h.f.b.l.a("answerTabLayout");
        }
        ((TuxStatusView) view4.findViewById(R.id.dew)).a();
        this.f119423j = (QnaAnswersTabViewModel) new ad(this).a(QnaAnswersTabViewModel.class);
        View view5 = this.f119422i;
        if (view5 == null) {
            h.f.b.l.a("answerTabLayout");
        }
        h.f.b.l.b(requireContext(), "");
        QnaRecyclerView qnaRecyclerView = (QnaRecyclerView) view5.findViewById(R.id.l2);
        h.f.b.l.b(qnaRecyclerView, "");
        RecyclerView.f itemAnimator = qnaRecyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f3833l = 0;
        }
        QnaAnswersTabViewModel qnaAnswersTabViewModel = this.f119423j;
        Objects.requireNonNull(qnaAnswersTabViewModel, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qna.vm.QnaViewHolderClickDelegate");
        this.f119424k = new com.ss.android.ugc.aweme.qna.ui.l(qnaAnswersTabViewModel);
        qnaRecyclerView.setLayoutManager(new LinearLayoutManager());
        com.ss.android.ugc.aweme.qna.ui.l lVar = this.f119424k;
        if (lVar == null) {
            h.f.b.l.a("answersTabAdapter");
        }
        qnaRecyclerView.setAdapter(lVar);
        com.ss.android.ugc.aweme.qna.ui.l lVar2 = this.f119424k;
        if (lVar2 == null) {
            h.f.b.l.a("answersTabAdapter");
        }
        qnaRecyclerView.a(a(qnaRecyclerView, lVar2, new f(this)));
        QnaAnswersTabViewModel qnaAnswersTabViewModel2 = this.f119423j;
        if (!(qnaAnswersTabViewModel2 == null || (liveData6 = qnaAnswersTabViewModel2.f119619b) == null)) {
            liveData6.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new C3083g(this)));
        }
        QnaAnswersTabViewModel qnaAnswersTabViewModel3 = this.f119423j;
        if (!(qnaAnswersTabViewModel3 == null || (liveData5 = qnaAnswersTabViewModel3.f119620c) == null)) {
            liveData5.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new i(this)));
        }
        QnaAnswersTabViewModel qnaAnswersTabViewModel4 = this.f119423j;
        if (!(qnaAnswersTabViewModel4 == null || (liveData4 = qnaAnswersTabViewModel4.f119657i) == null)) {
            liveData4.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new j(this)));
        }
        QnaAnswersTabViewModel qnaAnswersTabViewModel5 = this.f119423j;
        if (!(qnaAnswersTabViewModel5 == null || (liveData3 = qnaAnswersTabViewModel5.f119658j) == null)) {
            liveData3.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new k(this)));
        }
        QnaAnswersTabViewModel qnaAnswersTabViewModel6 = this.f119423j;
        if (!(qnaAnswersTabViewModel6 == null || (liveData2 = qnaAnswersTabViewModel6.f119659k) == null)) {
            liveData2.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new l(this)));
        }
        QnaAnswersTabViewModel qnaAnswersTabViewModel7 = this.f119423j;
        if (!(qnaAnswersTabViewModel7 == null || (tVar = qnaAnswersTabViewModel7.f119621d) == null)) {
            tVar.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new m(this)));
        }
        QnaAnswersTabViewModel qnaAnswersTabViewModel8 = this.f119423j;
        if (!(qnaAnswersTabViewModel8 == null || (liveData = qnaAnswersTabViewModel8.f119622e) == null)) {
            liveData.observe(getViewLifecycleOwner(), new com.ss.android.ugc.aweme.qna.g.a(new n(this)));
        }
        f.a.a(this, j(), j.f119431a, com.bytedance.assem.arch.viewModel.l.c(), new o(this), 4);
        if (!h()) {
            f.a.a(this, j(), i.f119430a, (com.bytedance.assem.arch.viewModel.k) null, new h(this), 6);
        }
        f.a.a(this, (QnaSelectedPageViewModel) this.p.getValue(), k.f119432a, (com.bytedance.assem.arch.viewModel.k) null, new r(this), 6);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.arb, viewGroup, false);
        h.f.b.l.b(a2, "");
        this.f119422i = a2;
        if (a2 == null) {
            h.f.b.l.a("answerTabLayout");
        }
        return a2;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j> void a(AssemViewModel<S> assemViewModel, com.bytedance.assem.arch.viewModel.k<S> kVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.q<A, B>> kVar3, h.f.a.b<? super Throwable, z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.r<A, B, C>> kVar4, h.f.a.b<? super Throwable, z> bVar, h.f.a.r<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, com.bytedance.assem.arch.viewModel.k<s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, z> bVar, h.f.a.s<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(kVar5, "");
        h.f.b.l.d(sVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
