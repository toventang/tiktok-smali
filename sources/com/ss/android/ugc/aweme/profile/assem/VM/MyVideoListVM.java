package com.ss.android.ugc.aweme.profile.assem.VM;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.t;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class MyVideoListVM extends AssemListViewModel<a, com.ss.android.ugc.aweme.profile.assem.powercell.a, Long> {
    public static final a o = new a((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    public String f116018k;

    /* renamed from: l  reason: collision with root package name */
    public String f116019l;

    /* renamed from: m  reason: collision with root package name */
    public final t<List<com.ss.android.ugc.aweme.profile.assem.powercell.a>> f116020m = new t<>();
    public Fragment n;
    private final h p = com.bytedance.assem.arch.a.c.a(this, ab.a(com.ss.android.ugc.aweme.profile.assem.a.b.class));

    /* access modifiers changed from: package-private */
    public static final class b extends h.c.b.a.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ MyVideoListVM this$0;

        static {
            Covode.recordClassIndex(74821);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(MyVideoListVM myVideoListVM, h.c.d dVar) {
            super(dVar);
            this.this$0 = myVideoListVM;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(0, (String) null, 0, this);
        }
    }

    static {
        Covode.recordClassIndex(74819);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(74820);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new a();
    }

    public static boolean j() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public final e k() {
        Fragment fragment = this.n;
        if (fragment != null) {
            return fragment.getActivity();
        }
        return null;
    }

    public final void a(List<com.ss.android.ugc.aweme.profile.assem.powercell.a> list) {
        this.f116020m.setValue(list);
    }

    static final class d extends m implements h.f.a.b<a, a> {
        final /* synthetic */ com.bytedance.ext_power_list.a $newListState;

        static {
            Covode.recordClassIndex(74824);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(com.bytedance.ext_power_list.a aVar) {
            super(1);
            this.$newListState = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            return a.a(aVar2, this.$newListState, 0, false, 6);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object a(h.c.d<? super com.bytedance.ies.powerlist.page.f<Long>> dVar) {
        return a(0, this.f116019l, 20, dVar);
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<a, z> {
        final /* synthetic */ MyVideoListVM this$0;

        static {
            Covode.recordClassIndex(74822);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(MyVideoListVM myVideoListVM) {
            super(1);
            this.this$0 = myVideoListVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            if (!aVar2.f116023b) {
                this.this$0.a((h.f.a.b) AnonymousClass1.f116021a);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final void a(com.bytedance.ext_power_list.a<com.ss.android.ugc.aweme.profile.assem.powercell.a> aVar) {
        l.d(aVar, "");
        a((h.f.a.b) new d(aVar));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    private static List<Aweme> b(List<? extends Aweme> list) {
        ITalentAdRevenueShareService e2 = TalentAdRevenueShareServiceImpl.e();
        if (list == 0 || e2 == null || e2.b() == null || e2.b().isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : list) {
            if (aweme != null) {
                if (aweme.getAwemeRawAd() != null) {
                    List<String> b2 = e2.b();
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd == null) {
                        l.b();
                    }
                    l.b(awemeRawAd, "");
                    if (b2.contains(awemeRawAd.getCreativeIdStr())) {
                    }
                }
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, h.c.d] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* synthetic */ Object a(Long l2, h.c.d<? super com.bytedance.ies.powerlist.page.f<Long>> dVar) {
        return a(l2.longValue(), this.f116019l, 20, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0086 A[Catch:{ Exception -> 0x00dc }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae A[Catch:{ Exception -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c3 A[Catch:{ Exception -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d7 A[Catch:{ Exception -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r10, java.lang.String r12, int r13, h.c.d<? super com.bytedance.ies.powerlist.page.f<java.lang.Long>> r14) {
        /*
        // Method dump skipped, instructions count: 231
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.assem.VM.MyVideoListVM.a(long, java.lang.String, int, h.c.d):java.lang.Object");
    }
}
