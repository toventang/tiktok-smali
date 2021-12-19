package com.ss.android.ugc.aweme.music.assem;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ag;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.i;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.experiment.fr;
import com.ss.android.ugc.aweme.music.assem.LegacyCommunicateViewModel;
import com.ss.android.ugc.aweme.music.assem.list.p;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.aq;
import com.ss.android.ugc.aweme.profile.ui.as;
import com.ss.android.ugc.aweme.profile.ui.cs;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;

public final class c extends cs implements h, com.ss.android.ugc.aweme.music.b, as {

    /* renamed from: a  reason: collision with root package name */
    private final h f111141a = RouteArgExtension.INSTANCE.navArg(this);

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f111142b;

    /* renamed from: c  reason: collision with root package name */
    private String f111143c;

    /* renamed from: d  reason: collision with root package name */
    private aq.b f111144d;

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f111145e;

    public static final class b extends m implements h.f.a.b<a, a> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(71332);
        }

        public b() {
            super(1);
        }

        public final a invoke(a aVar) {
            l.c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(71330);
    }

    private final LegacyCommunicateViewModel c() {
        return (LegacyCommunicateViewModel) this.f111142b.getValue();
    }

    public final OriginMusicArg a() {
        return (OriginMusicArg) this.f111141a.getValue();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cs
    public final void g() {
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cs
    public final void au_() {
        this.N = true;
        if (isAdded()) {
            c().f111105l = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f111145e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(71331);
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

    @Override // com.ss.android.ugc.aweme.profile.c.a
    public final void bM_() {
        if (ab_()) {
            c().a(LegacyCommunicateViewModel.a.f111106a);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.c.a
    public final boolean cb_() {
        p pVar = (p) com.bytedance.assem.arch.service.d.d(this, ab.a(p.class));
        if (pVar != null) {
            return pVar.D();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.music.b
    public final void f() {
        if (ab_()) {
            c().a(LegacyCommunicateViewModel.b.f111107a);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.as
    public final boolean k() {
        p pVar = (p) com.bytedance.assem.arch.service.d.d(this, ab.a(p.class));
        if (pVar != null) {
            return pVar.C();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.a.AbstractC1744a
    public final View m() {
        p pVar = (p) com.bytedance.assem.arch.service.d.d(this, ab.a(p.class));
        if (pVar != null) {
            return pVar.E();
        }
        return null;
    }

    public c() {
        h.k.c a2 = ab.a(LegacyCommunicateViewModel.class);
        this.f111142b = new com.bytedance.assem.arch.viewModel.b(a2, new a(a2), u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, b.INSTANCE);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.b
    public final /* synthetic */ b e() {
        String str;
        boolean z;
        boolean z2;
        OriginMusicArg a2 = a();
        String str2 = null;
        if (a2 != null) {
            str = a2.getUserId();
        } else {
            str = null;
        }
        OriginMusicArg a3 = a();
        if (a3 != null) {
            str2 = a3.getSecUserID();
        }
        OriginMusicArg a4 = a();
        if (a4 != null) {
            z = a4.isMe();
        } else {
            z = false;
        }
        OriginMusicArg a5 = a();
        if (a5 != null && a5.isMe() && fr.a().getEnablePin()) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            User curUser = g2.getCurUser();
            l.b(curUser, "");
            if (curUser.getAccountType() != 3) {
                z2 = true;
                return new b(str, str2, z, z2, false, null, 192);
            }
        }
        z2 = false;
        return new b(str, str2, z, z2, false, null, 192);
    }

    static final class e extends m implements h.f.a.b<b, b> {
        final /* synthetic */ boolean $isPrivateAccount;

        static {
            Covode.recordClassIndex(71340);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(boolean z) {
            super(1);
            this.$isPrivateAccount = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ b invoke(b bVar) {
            b bVar2 = bVar;
            if (bVar2 != null) {
                return b.a(bVar2, null, null, this.$isPrivateAccount, false, false, false, null, null, 251);
            }
            return null;
        }
    }

    static final class f extends m implements h.f.a.b<b, b> {
        final /* synthetic */ String $secUserId;
        final /* synthetic */ String $userId;

        static {
            Covode.recordClassIndex(71341);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(String str, String str2) {
            super(1);
            this.$userId = str;
            this.$secUserId = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ b invoke(b bVar) {
            b bVar2 = bVar;
            if (bVar2 != null) {
                return b.a(bVar2, this.$userId, this.$secUserId, false, false, false, false, null, null, 252);
            }
            return null;
        }
    }

    static final class g extends m implements h.f.a.b<b, b> {
        final /* synthetic */ boolean $isVisibleToUser;

        static {
            Covode.recordClassIndex(71342);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(boolean z) {
            super(1);
            this.$isVisibleToUser = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ b invoke(b bVar) {
            b bVar2 = bVar;
            if (bVar2 != null) {
                return b.a(bVar2, null, null, false, false, false, false, new com.bytedance.assem.arch.extensions.a(Boolean.valueOf(this.$isVisibleToUser)), null, 191);
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.music.b
    public final void a(aq.b bVar) {
        this.f111144d = bVar;
        if (isAdded()) {
            c().f111103j = bVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.music.b
    public final void b(String str) {
        this.f111143c = str;
        if (isAdded()) {
            c().f111104k = this.f111143c;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        c().f111103j = this.f111144d;
        c().f111105l = this.N;
        c().f111104k = this.f111143c;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.c$c  reason: collision with other inner class name */
    static final class C2845c extends m implements h.f.a.b<b, b> {
        final /* synthetic */ boolean $hidden;

        static {
            Covode.recordClassIndex(71333);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2845c(boolean z) {
            super(1);
            this.$hidden = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ b invoke(b bVar) {
            b bVar2 = bVar;
            if (bVar2 != null) {
                return b.a(bVar2, null, null, false, false, false, false, new com.bytedance.assem.arch.extensions.a(Boolean.valueOf(!this.$hidden)), null, 191);
            }
            return null;
        }
    }

    static final class d extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(71334);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.a(this.this$0, (h.f.a.b<? super i<com.bytedance.assem.arch.extensions.c>, z>) new h.f.a.b<i<com.bytedance.assem.arch.extensions.c>, z>(this) {
                /* class com.ss.android.ugc.aweme.music.assem.c.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(71335);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(i<com.bytedance.assem.arch.extensions.c> iVar) {
                    i<com.bytedance.assem.arch.extensions.c> iVar2 = iVar;
                    l.d(iVar2, "");
                    OriginMusicArg a2 = this.this$0.this$0.a();
                    if (a2 == null) {
                        a2 = new OriginMusicArg(false, null, null, 0, null, 31, null);
                    }
                    iVar2.a(a2);
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, AnonymousClass2.f111146a);
            assembler2.b(this.this$0, AnonymousClass3.f111147a);
            assembler2.b(this.this$0, AnonymousClass4.f111148a);
            assembler2.b(this.this$0, AnonymousClass5.f111149a);
            return z.f158842a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0107, code lost:
        if (r8.f25562a.containsKey(new com.bytedance.assem.arch.core.o(r2, null)) == false) goto L_0x0109;
     */
    @Override // com.ss.android.ugc.aweme.profile.ui.cs
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d_(boolean r15) {
        /*
        // Method dump skipped, instructions count: 353
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.assem.c.d_(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0111, code lost:
        if (r4.f25562a.containsKey(new com.bytedance.assem.arch.core.o(r2, null)) == false) goto L_0x0113;
     */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHiddenChanged(boolean r15) {
        /*
        // Method dump skipped, instructions count: 363
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.assem.c.onHiddenChanged(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0111, code lost:
        if (r4.f25562a.containsKey(new com.bytedance.assem.arch.core.o(r2, null)) == false) goto L_0x0113;
     */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setUserVisibleHint(boolean r15) {
        /*
        // Method dump skipped, instructions count: 363
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.assem.c.setUserVisibleHint(boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        com.bytedance.assem.arch.extensions.d.a(this, new d(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010c, code lost:
        if (r4.f25562a.containsKey(new com.bytedance.assem.arch.core.o(r2, null)) == false) goto L_0x010e;
     */
    @Override // com.ss.android.ugc.aweme.profile.ui.cs
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r15, java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 358
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.assem.c.a(java.lang.String, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.aq8, viewGroup, false);
    }
}
