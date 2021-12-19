package com.ss.android.ugc.aweme.relation.viewmodel;

import android.os.Bundle;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.assem.arch.extensions.i;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.recommend.j;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.LinkedHashSet;
import java.util.Set;

public final class RecFriendsListViewModel extends AssemListViewModel<b, j, a> {

    /* renamed from: k  reason: collision with root package name */
    public final Set<String> f120498k = new LinkedHashSet();

    /* renamed from: l  reason: collision with root package name */
    private final i f120499l = new i(true, new a(this, null));

    /* renamed from: m  reason: collision with root package name */
    private final Set<String> f120500m = new LinkedHashSet();
    private final h n = h.i.a((h.f.a.a) g.f120501a);
    private final com.bytedance.assem.arch.a.a<com.ss.android.ugc.aweme.relation.api.c> o;

    /* access modifiers changed from: package-private */
    public static final class b extends h.c.b.a.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RecFriendsListViewModel this$0;

        static {
            Covode.recordClassIndex(78442);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RecFriendsListViewModel recFriendsListViewModel, h.c.d dVar) {
            super(dVar);
            this.this$0 = recFriendsListViewModel;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a((a) null, (h.c.d<? super com.bytedance.ies.powerlist.page.f<a>>) this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.c.b.a.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RecFriendsListViewModel this$0;

        static {
            Covode.recordClassIndex(78443);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(RecFriendsListViewModel recFriendsListViewModel, h.c.d dVar) {
            super(dVar);
            this.this$0 = recFriendsListViewModel;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(null, null, this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.c.b.a.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RecFriendsListViewModel this$0;

        static {
            Covode.recordClassIndex(78444);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(RecFriendsListViewModel recFriendsListViewModel, h.c.d dVar) {
            super(dVar);
            this.this$0 = recFriendsListViewModel;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.c(null, this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.c.b.a.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RecFriendsListViewModel this$0;

        static {
            Covode.recordClassIndex(78445);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(RecFriendsListViewModel recFriendsListViewModel, h.c.d dVar) {
            super(dVar);
            this.this$0 = recFriendsListViewModel;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.b((a) null, this);
        }
    }

    static {
        Covode.recordClassIndex(78440);
    }

    private com.ss.android.ugc.aweme.relation.recommend.f j() {
        return (com.ss.android.ugc.aweme.relation.recommend.f) this.f120499l.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ com.bytedance.assem.arch.viewModel.j f() {
        return new b();
    }

    static final class g extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f120501a = new g();

        static {
            Covode.recordClassIndex(78447);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (com.ss.android.ugc.aweme.relation.b.d() || com.ss.android.ugc.aweme.relation.b.c()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.relation.recommend.f> {
        final /* synthetic */ String $identify;
        final /* synthetic */ AssemViewModel $this_hierarchyData;

        static {
            Covode.recordClassIndex(78441);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AssemViewModel assemViewModel, String str) {
            super(0);
            this.$this_hierarchyData = assemViewModel;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, com.ss.android.ugc.aweme.relation.recommend.f] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.relation.recommend.f invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.$this_hierarchyData
                com.bytedance.assem.arch.core.d r0 = r0.f25687d
                if (r0 == 0) goto L_0x0018
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.$this_hierarchyData
                com.bytedance.assem.arch.core.d r2 = r0.f25687d
                if (r2 != 0) goto L_0x000f
                h.f.b.l.a()
            L_0x000f:
                java.lang.Class<com.ss.android.ugc.aweme.relation.recommend.f> r1 = com.ss.android.ugc.aweme.relation.recommend.f.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.a(r1, r0)
                return r0
            L_0x0018:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r0 = "HierarchyData has not inject to "
                r1.<init>(r0)
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.$this_hierarchyData
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r0 = ", you can't get hierarchyData"
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel.a.invoke():java.lang.Object");
        }
    }

    static final class f extends m implements h.f.a.b<b, b> {
        final /* synthetic */ com.bytedance.ext_power_list.a $newListState;

        static {
            Covode.recordClassIndex(78446);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(com.bytedance.ext_power_list.a aVar) {
            super(1);
            this.$newListState = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ b invoke(b bVar) {
            l.d(bVar, "");
            com.bytedance.ext_power_list.a aVar = this.$newListState;
            l.d(aVar, "");
            return new b(aVar);
        }
    }

    public static void a(String str) {
        l.d(str, "");
        com.ss.android.ugc.aweme.relation.c.d.a("follow_rec", str);
    }

    public static void a(androidx.fragment.app.e eVar) {
        if (eVar != null) {
            ((SocialRecFlowModel) ae.a(eVar, (ad.b) null).a(SocialRecFlowModel.class)).f120503b.postValue(new Bundle());
        }
    }

    public RecFriendsListViewModel(com.bytedance.assem.arch.a.a<com.ss.android.ugc.aweme.relation.api.c> aVar) {
        l.d(aVar, "");
        this.o = aVar;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object a(h.c.d<? super com.bytedance.ies.powerlist.page.f<a>> dVar) {
        this.f120500m.clear();
        return a(new a(true, 0), dVar);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final void a(com.bytedance.ext_power_list.a<j> aVar) {
        l.d(aVar, "");
        a((h.f.a.b) new f(aVar));
    }

    public static void a(User user, u.a aVar) {
        String str;
        l.d(aVar, "");
        u o2 = new u().a("version_update").o("");
        o2.f109596a = u.c.CARD;
        o2.f109597b = aVar;
        u a2 = o2.a(user);
        if (user != null) {
            str = user.getRequestId();
        } else {
            str = null;
        }
        a2.s(str).f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(com.ss.android.ugc.aweme.relation.viewmodel.a r7, h.c.d<? super com.bytedance.ies.powerlist.page.f<com.ss.android.ugc.aweme.relation.viewmodel.a>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel.b
            if (r0 == 0) goto L_0x0048
            r5 = r8
            com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel$b r5 = (com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel.b) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0048
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L_0x0013:
            java.lang.Object r4 = r5.result
            h.c.a.a r3 = h.c.a.a.COROUTINE_SUSPENDED
            int r0 = r5.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 == r1) goto L_0x0056
            if (r0 != r2) goto L_0x004e
            h.r.a(r4)
        L_0x0024:
            return r4
        L_0x0025:
            h.r.a(r4)
            h.h r0 = r6.n
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x003f
            r5.label = r1
            java.lang.Object r4 = r6.b(r7, r5)
            if (r4 != r3) goto L_0x0059
            return r3
        L_0x003f:
            r5.label = r2
            java.lang.Object r4 = r6.c(r7, r5)
            if (r4 != r3) goto L_0x0024
            return r3
        L_0x0048:
            com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel$b r5 = new com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel$b
            r5.<init>(r6, r8)
            goto L_0x0013
        L_0x004e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L_0x0056:
            h.r.a(r4)
        L_0x0059:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel.a(com.ss.android.ugc.aweme.relation.viewmodel.a, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0079 A[Catch:{ Exception -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0091 A[Catch:{ Exception -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b2 A[Catch:{ Exception -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(com.ss.android.ugc.aweme.relation.viewmodel.a r9, h.c.d<? super com.bytedance.ies.powerlist.page.f<com.ss.android.ugc.aweme.relation.viewmodel.a>> r10) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel.b(com.ss.android.ugc.aweme.relation.viewmodel.a, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(com.ss.android.ugc.aweme.relation.viewmodel.a r15, h.c.d<? super com.bytedance.ies.powerlist.page.f<com.ss.android.ugc.aweme.relation.viewmodel.a>> r16) {
        /*
        // Method dump skipped, instructions count: 280
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel.c(com.ss.android.ugc.aweme.relation.viewmodel.a, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0083 A[Catch:{ Exception -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b A[Catch:{ Exception -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d4 A[Catch:{ Exception -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.util.ArrayList<com.ss.android.ugc.aweme.relation.recommend.j> r11, com.ss.android.ugc.aweme.relation.viewmodel.a r12, h.c.d<? super com.bytedance.ies.powerlist.page.f<com.ss.android.ugc.aweme.relation.viewmodel.a>> r13) {
        /*
        // Method dump skipped, instructions count: 228
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel.a(java.util.ArrayList, com.ss.android.ugc.aweme.relation.viewmodel.a, h.c.d):java.lang.Object");
    }
}
