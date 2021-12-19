package com.ss.android.ugc.aweme.profile.widgets.b;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.commerce.k;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;
import com.ss.android.ugc.aweme.experiment.fs;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.tab.MusProfileNavigator;
import com.ss.android.ugc.aweme.profile.ui.SwipableViewPager;
import com.ss.android.ugc.aweme.profile.ui.aq;
import com.ss.android.ugc.aweme.profile.ui.au;
import com.ss.android.ugc.aweme.profile.ui.cr;
import com.ss.android.ugc.aweme.profile.ui.cs;
import com.ss.android.ugc.aweme.profile.ui.v2.ac;
import com.ss.android.ugc.aweme.profile.ui.v2.y;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import com.ss.android.ugc.aweme.utils.ho;
import com.ss.android.ugc.aweme.utils.in;
import h.a.n;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class i extends a implements r {
    public k A;
    public com.ss.android.ugc.aweme.profile.effect.e B;
    public boolean C;
    public boolean D;
    public boolean E;
    private aq.a F = new c(this);
    public au x;
    public au y;
    public cs z;

    static {
        Covode.recordClassIndex(76129);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.b.a
    public final boolean F() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.profile.widgets.b.a
    public final aq.a E() {
        return this.F;
    }

    static final class a implements aq.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f117668a;

        static {
            Covode.recordClassIndex(76130);
        }

        a(i iVar) {
            this.f117668a = iVar;
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.aq.b
        public final void a() {
            this.f117668a.D();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.b.r
    public final int U() {
        return y().getTabCount();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.b.r
    public final List<Aweme> V() {
        au auVar = this.x;
        if (auVar != null) {
            return auVar.C();
        }
        return null;
    }

    private String W() {
        ac acVar = (ac) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
        if (acVar != null) {
            return acVar.f117250h;
        }
        return null;
    }

    public final String O() {
        ac acVar = (ac) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
        if (acVar != null) {
            return acVar.f117246d;
        }
        return null;
    }

    public final String P() {
        ac acVar = (ac) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
        if (acVar != null) {
            return acVar.f117247e;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.b.a
    public final String u() {
        ac acVar = (ac) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
        if (acVar != null) {
            return acVar.f117245c;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.b.a
    public final User v() {
        com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
        if (iVar != null) {
            return iVar.f117705a;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.b.a
    public final String w() {
        ac acVar = (ac) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
        if (acVar != null) {
            return acVar.f117243a;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.b.a
    public final String x() {
        ac acVar = (ac) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
        if (acVar != null) {
            return acVar.f117244b;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.b.a
    public final boolean J() {
        androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this);
        if (b2 != null) {
            if (!(b2 instanceof f.c) && !com.ss.android.ugc.aweme.profile.service.h.f116622a.isDetailActivity(b2)) {
                return com.ss.android.ugc.aweme.profile.service.h.f116622a.isUserProfileActivity(b2);
            }
            if (!ScrollSwitchStateManager.a.a(b2).b("page_feed")) {
                return true;
            }
        }
        return false;
    }

    public final void Q() {
        List<Integer> list = this.f117652l;
        if (list != null && !list.isEmpty()) {
            a(v());
            MusProfileNavigator y2 = y();
            SwipableViewPager z2 = z();
            List<Integer> list2 = this.f117652l;
            if (list2 == null) {
                l.b();
            }
            list2.contains(3);
            y2.a((ViewPager) z2, false, (MusProfileNavigator.a) this);
            G();
            cr<cs> crVar = this.n;
            if (crVar != null) {
                crVar.notifyDataSetChanged();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.b.r
    public final void R() {
        if (in.b(v(), false)) {
            c(true);
            au auVar = this.x;
            if (auVar != null) {
                auVar.n();
            }
            au auVar2 = this.y;
            if (auVar2 != null) {
                auVar2.n();
                return;
            }
            return;
        }
        au auVar3 = this.x;
        if (auVar3 != null) {
            auVar3.k();
        }
        au auVar4 = this.y;
        if (auVar4 != null) {
            auVar4.k();
        }
    }

    @Override // com.bytedance.assem.arch.core.a
    public final void j() {
        List<Integer> list;
        super.j();
        if (this.C && (list = this.f117652l) != null) {
            boolean contains = list.contains(16);
            int i2 = 1;
            if (contains) {
                String O = O();
                String w = w();
                User v = v();
                if (v != null && v.getFollowStatus() == 0) {
                    i2 = 0;
                }
                y.a(O, w, (Integer) 0, Integer.valueOf(i2), P());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.b.a
    public final boolean C() {
        int i2;
        a(true, true);
        if (fs.f90079c && this.f117651k != null) {
            int i3 = this.o;
            List<cs> list = this.f117651k;
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            if (i3 < i2) {
                List<cs> list2 = this.f117651k;
                if (list2 == null) {
                    l.b();
                }
                if (list2.get(this.o) instanceof aq) {
                    List<cs> list3 = this.f117651k;
                    if (list3 == null) {
                        l.b();
                    }
                    cs csVar = list3.get(this.o);
                    Objects.requireNonNull(csVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.IAwemeListFragment");
                    aq aqVar = (aq) csVar;
                    if (aqVar != null) {
                        aqVar.w();
                    }
                }
            }
        }
        return false;
    }

    public final void T() {
        List<Integer> list;
        String str;
        if (this.f117652l == null || ((list = this.f117652l) != null && list.size() == 0)) {
            r.a("profile_tab_show", v.a(Integer.valueOf(y().getTabCount()), "tab_cnt"), v.a("", "tab_name"));
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<Integer> list2 = this.f117652l;
        if (list2 != null) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (intValue == 0) {
                    str = UGCMonitor.TYPE_POST;
                } else if (intValue == 1) {
                    str = "like";
                } else if (intValue == 3) {
                    str = "ost";
                } else if (intValue == 6) {
                    str = "effect";
                } else if (intValue == 14) {
                    str = "private_post";
                } else if (intValue != 16) {
                    str = "no matched";
                } else {
                    str = "user_shop";
                }
                arrayList.add(str);
            }
        }
        r.a("profile_tab_show", v.a(Integer.valueOf(y().getTabCount()), "tab_cnt"), v.a(n.a(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 63), "tab_name"));
    }

    public final void S() {
        k kVar;
        com.ss.android.ugc.aweme.profile.effect.e eVar;
        User v;
        cs csVar;
        boolean z2;
        User v2;
        GeneralPermission generalPermission;
        au auVar;
        boolean b2;
        boolean z3;
        User v3;
        au auVar2;
        boolean b3;
        boolean z4;
        User v4;
        int i2 = this.o;
        cr<cs> crVar = this.n;
        boolean z5 = true;
        if (crVar != null && i2 == crVar.e(1) && (auVar2 = this.y) != null && auVar2.cb_()) {
            au auVar3 = this.y;
            if (auVar3 == null) {
                l.b();
            }
            if (v() == null) {
                b3 = this.D;
            } else {
                b3 = in.b(v(), false);
            }
            auVar3.d_(b3);
            au auVar4 = this.y;
            if (auVar4 == null) {
                l.b();
            }
            if (v() == null || (v4 = v()) == null || !v4.isBlocked()) {
                z4 = false;
            } else {
                z4 = true;
            }
            auVar4.c(z4);
            au auVar5 = this.y;
            if (auVar5 == null) {
                l.b();
            }
            auVar5.bM_();
        }
        int i3 = this.o;
        cr<cs> crVar2 = this.n;
        if (crVar2 != null && i3 == crVar2.e(0) && (auVar = this.x) != null && auVar.cb_()) {
            au auVar6 = this.x;
            if (auVar6 == null) {
                l.b();
            }
            if (v() == null) {
                b2 = this.D;
            } else {
                b2 = in.b(v(), false);
            }
            auVar6.d_(b2);
            au auVar7 = this.x;
            if (auVar7 == null) {
                l.b();
            }
            if (v() == null || (v3 = v()) == null || !v3.isBlocked()) {
                z3 = false;
            } else {
                z3 = true;
            }
            auVar7.c(z3);
            au auVar8 = this.x;
            if (auVar8 == null) {
                l.b();
            }
            auVar8.bM_();
        }
        int i4 = this.o;
        cr<cs> crVar3 = this.n;
        if (crVar3 != null && i4 == crVar3.e(3) && (csVar = this.z) != null && csVar.cb_()) {
            User v5 = v();
            if (v5 == null || (generalPermission = v5.getGeneralPermission()) == null || generalPermission.getOriginalList() != 1) {
                cs csVar2 = this.z;
                if (csVar2 == null) {
                    l.b();
                }
                csVar2.d_(in.b(v(), false));
                cs csVar3 = this.z;
                if (csVar3 == null) {
                    l.b();
                }
                if (v() == null || (v2 = v()) == null || !v2.isBlocked()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                csVar3.c(z2);
                cs csVar4 = this.z;
                if (csVar4 == null) {
                    l.b();
                }
                csVar4.bM_();
            } else {
                cs csVar5 = this.z;
                if (!(csVar5 instanceof com.ss.android.ugc.aweme.music.b)) {
                    csVar5 = null;
                }
                com.ss.android.ugc.aweme.music.b bVar = (com.ss.android.ugc.aweme.music.b) csVar5;
                if (bVar != null) {
                    bVar.f();
                    return;
                }
                return;
            }
        }
        int i5 = this.o;
        cr<cs> crVar4 = this.n;
        if (crVar4 != null && i5 == crVar4.e(6) && (eVar = this.B) != null && eVar.cb_()) {
            com.ss.android.ugc.aweme.profile.effect.e eVar2 = this.B;
            if (eVar2 == null) {
                l.b();
            }
            eVar2.d_(in.b(v(), false));
            com.ss.android.ugc.aweme.profile.effect.e eVar3 = this.B;
            if (eVar3 == null) {
                l.b();
            }
            if (v() == null || (v = v()) == null || !v.isBlocked()) {
                z5 = false;
            }
            eVar3.c(z5);
            com.ss.android.ugc.aweme.profile.effect.e eVar4 = this.B;
            if (eVar4 == null) {
                l.b();
            }
            eVar4.bM_();
        }
        int i6 = this.o;
        cr<cs> crVar5 = this.n;
        if (crVar5 != null && i6 == crVar5.e(16) && v() != null && (kVar = this.A) != null) {
            kVar.bM_();
        }
    }

    static final class b implements aq.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f117669a;

        static {
            Covode.recordClassIndex(76131);
        }

        b(i iVar) {
            this.f117669a = iVar;
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.aq.c
        public final void a(boolean z) {
            this.f117669a.e(z);
        }
    }

    public static final class c implements aq.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f117670a;

        static {
            Covode.recordClassIndex(76132);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(i iVar) {
            this.f117670a = iVar;
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.aq.a
        public final void a(int i2) {
            if (this.f117670a.f117653m != null) {
                DampScrollableLayout dampScrollableLayout = this.f117670a.f117653m;
                if (dampScrollableLayout == null) {
                    l.b();
                }
                dampScrollableLayout.setCanScrollUp(true);
            }
            if (i2 == 0) {
                this.f117670a.A().c(false);
                this.f117670a.A().a(false);
            }
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.aq.a
        public final void a(boolean z, int i2) {
            User v;
            if (this.f117670a.f117653m != null) {
                DampScrollableLayout dampScrollableLayout = this.f117670a.f117653m;
                if (dampScrollableLayout == null) {
                    l.b();
                }
                dampScrollableLayout.setCanScrollUp(true);
            }
            if (i2 == 0) {
                this.f117670a.A().c(true);
                if (!z && com.ss.android.ugc.aweme.profile.experiment.k.b() && (v = this.f117670a.v()) != null && v.getFollowerCount() < 1000 && v.getAccountType() != 2 && v.getAccountType() != 3) {
                    if (!com.ss.android.ugc.aweme.profile.experiment.k.c()) {
                        this.f117670a.E = true;
                        if (v.getTabType() == 0 || in.b(v, false)) {
                            ((com.ss.android.ugc.aweme.profile.widgets.recommend.user.b) com.bytedance.assem.arch.service.d.b(this.f117670a, ab.a(com.ss.android.ugc.aweme.profile.widgets.recommend.user.b.class))).a();
                            this.f117670a.E = false;
                        }
                    }
                    ((com.ss.android.ugc.aweme.profile.widgets.recommend.user.b) com.bytedance.assem.arch.service.d.b(this.f117670a, ab.a(com.ss.android.ugc.aweme.profile.widgets.recommend.user.b.class))).b();
                }
                this.f117670a.A().a(true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.b.a
    public final void c(int i2) {
        super.c(i2);
        S();
    }

    public final void e(boolean z2) {
        b(!z2);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.b.r
    public final void a(String str) {
        au auVar = this.y;
        if (auVar != null) {
            auVar.b(str);
        }
        au auVar2 = this.x;
        if (auVar2 != null) {
            auVar2.b(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.b.r
    public final void b(String str) {
        au auVar = this.x;
        if (auVar != null) {
            auVar.a(str, false);
        }
        au auVar2 = this.y;
        if (auVar2 != null) {
            auVar2.a(str, false);
        }
    }

    static final class g extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends z>, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(76136);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends z> aVar) {
            if (!(aVar == null || this.this$0.ar_() == null || !this.this$0.f25594h)) {
                this.this$0.S();
            }
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.i$i  reason: collision with other inner class name */
    static final class C2988i extends m implements h.f.a.b<Aweme, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(76138);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2988i(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Aweme aweme) {
            User user;
            Aweme aweme2 = aweme;
            i iVar = this.this$0;
            if (aweme2 != null) {
                user = aweme2.getAuthor();
            } else {
                user = null;
            }
            iVar.D = in.b(user, false);
            return z.f158842a;
        }
    }

    static final class j extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(76139);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            if (aVar2 != null) {
                this.this$0.C = aVar2.f25631b.booleanValue();
                i iVar = this.this$0;
                iVar.a(iVar.C);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.tab.MusProfileNavigator.a, com.ss.android.ugc.aweme.profile.widgets.b.a
    public final void b(int i2) {
        super.b(i2);
        if (this.E && i2 == 0) {
            ((com.ss.android.ugc.aweme.profile.widgets.recommend.user.b) com.bytedance.assem.arch.service.d.b(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.recommend.user.b.class))).a();
            this.E = false;
        }
    }

    public final void c(boolean z2) {
        au auVar = this.y;
        if (auVar != null) {
            auVar.d_(z2);
        }
        au auVar2 = this.x;
        if (auVar2 != null) {
            auVar2.d_(z2);
        }
        cs csVar = this.z;
        if (csVar != null) {
            csVar.d_(z2);
        }
        com.ss.android.ugc.aweme.profile.effect.e eVar = this.B;
        if (eVar != null) {
            eVar.d_(z2);
        }
    }

    public final void d(boolean z2) {
        au auVar = this.y;
        if (auVar != null) {
            auVar.b(z2);
        }
        au auVar2 = this.x;
        if (auVar2 != null) {
            auVar2.b(z2);
        }
        com.ss.android.ugc.aweme.profile.effect.e eVar = this.B;
        if (eVar != null) {
            eVar.b(z2);
        }
    }

    static final class e extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends z>, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(76134);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends z> aVar) {
            if (aVar != null) {
                DampScrollableLayout dampScrollableLayout = this.this$0.f117653m;
                if (dampScrollableLayout != null) {
                    dampScrollableLayout.a();
                }
                au auVar = this.this$0.y;
                if (auVar != null) {
                    auVar.B();
                }
                au auVar2 = this.this$0.x;
                if (auVar2 != null) {
                    auVar2.B();
                }
                this.this$0.D = false;
                this.this$0.z().setCurrentItem(0, false);
            }
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends z>, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(76133);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends z> aVar) {
            if (aVar != null) {
                DampScrollableLayout dampScrollableLayout = this.this$0.f117653m;
                if (dampScrollableLayout != null) {
                    dampScrollableLayout.a();
                }
                au auVar = this.this$0.y;
                if (auVar != null) {
                    auVar.B();
                }
                au auVar2 = this.this$0.x;
                if (auVar2 != null) {
                    auVar2.B();
                }
                com.ss.android.ugc.aweme.profile.effect.e eVar = this.this$0.B;
                if (eVar != null) {
                    eVar.f116310c = true;
                    eVar.a().c(EffectProfileListViewModel.b.f116276a);
                }
                this.this$0.z().setCurrentItem(0, false);
                this.this$0.d(true);
                au auVar3 = this.this$0.x;
                if (auVar3 != null) {
                    auVar3.f();
                }
                au auVar4 = this.this$0.y;
                if (auVar4 != null) {
                    auVar4.f();
                }
                com.ss.android.ugc.aweme.profile.effect.e eVar2 = this.this$0.B;
                if (eVar2 != null) {
                    eVar2.c();
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.b.a, com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        super.b(view);
        y().setVisibility(8);
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), j.f117671a, new g(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class), n.f117675a, new h(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), o.f117676a, new C2988i(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), p.f117677a, new j(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), q.f117678a, new d(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), k.f117672a, new e(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), l.f117673a, m.f117674a, new f(this));
    }

    static final class h extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(76137);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            Boolean bool;
            Boolean bool2;
            boolean z;
            String str;
            int i2;
            if (aVar != null) {
                List<Integer> list = this.this$0.f117652l;
                com.ss.android.ugc.aweme.profile.widgets.common.g gVar = null;
                if (list != null) {
                    bool = Boolean.valueOf(list.contains(16));
                } else {
                    bool = null;
                }
                com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
                boolean z2 = true;
                if (iVar == null || !iVar.f117707c) {
                    this.this$0.B();
                    i iVar2 = this.this$0;
                    iVar2.a(iVar2.w(), this.this$0.x());
                    au auVar = this.this$0.y;
                    if (auVar != null) {
                        auVar.a(this.this$0.v());
                    }
                    au auVar2 = this.this$0.x;
                    if (auVar2 != null) {
                        auVar2.a(this.this$0.v());
                    }
                    this.this$0.Q();
                    List<Integer> list2 = this.this$0.f117652l;
                    if (list2 != null) {
                        bool2 = Boolean.valueOf(list2.contains(16));
                    } else {
                        bool2 = null;
                    }
                    if (l.a((Object) bool, (Object) false) && l.a((Object) bool2, (Object) true)) {
                        String O = this.this$0.O();
                        String w = this.this$0.w();
                        User v = this.this$0.v();
                        if (v == null || v.getFollowStatus() != 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        y.a(O, w, (Integer) 0, Integer.valueOf(i2), this.this$0.P());
                    }
                    i iVar3 = this.this$0;
                    iVar3.c(in.b(iVar3.v(), false));
                    i iVar4 = this.this$0;
                    User v2 = iVar4.v();
                    if (v2 != null) {
                        z = v2.isBlock();
                    } else {
                        z = false;
                    }
                    iVar4.d(z);
                    this.this$0.S();
                    User v3 = this.this$0.v();
                    if (v3 != null) {
                        str = v3.getUid();
                    } else {
                        str = null;
                    }
                    if (!TextUtils.equals(str, this.this$0.w())) {
                        j.a.a((com.ss.android.ugc.aweme.profile.widgets.common.j) com.bytedance.assem.arch.service.d.a(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class)), null, 3);
                    } else {
                        com.ss.android.ugc.aweme.profile.widgets.common.i iVar5 = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
                        if (iVar5 != null) {
                            gVar = iVar5.f117709e;
                        }
                        if (gVar == com.ss.android.ugc.aweme.profile.widgets.common.g.CHANGE_TAB) {
                            i iVar6 = this.this$0;
                            iVar6.b(iVar6.v());
                        }
                        if (in.b(this.this$0.v(), false)) {
                            this.this$0.y().setScrollable(false);
                            this.this$0.z().setScrollable(false);
                        }
                        i iVar7 = this.this$0;
                        User v4 = iVar7.v();
                        if (!(v4 == null || v4.getGeneralPermission() == null)) {
                            GeneralPermission generalPermission = v4.getGeneralPermission();
                            String str2 = "";
                            l.b(generalPermission, str2);
                            if (!TextUtils.isEmpty(generalPermission.getProfileToast())) {
                                com.ss.android.ugc.aweme.tux.a.i.a aVar2 = new com.ss.android.ugc.aweme.tux.a.i.a(iVar7.ar_());
                                GeneralPermission generalPermission2 = v4.getGeneralPermission();
                                l.b(generalPermission2, str2);
                                aVar2.a(generalPermission2.getProfileToast()).a();
                                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "others_homepage");
                                if (v4.getGeneralPermission() != null) {
                                    GeneralPermission generalPermission3 = v4.getGeneralPermission();
                                    l.b(generalPermission3, str2);
                                    int followToastType = generalPermission3.getFollowToastType();
                                    if (followToastType == 1) {
                                        str2 = "ban";
                                    } else if (followToastType == 2) {
                                        str2 = "suspend";
                                    } else if (followToastType == 3) {
                                        str2 = "viewmodeA";
                                    } else if (followToastType == 4) {
                                        str2 = "viewmodeB";
                                    }
                                }
                                r.a("show_punish_toast", a2.a("show_type", str2).f66730a);
                            }
                        }
                        i iVar8 = this.this$0;
                        User v5 = iVar8.v();
                        if (v5 != null && v5.isShowFavoriteList()) {
                            z2 = false;
                        }
                        iVar8.e(z2);
                        this.this$0.H();
                        com.ss.android.ugc.aweme.profile.widgets.follow.c cVar = (com.ss.android.ugc.aweme.profile.widgets.follow.c) com.bytedance.assem.arch.service.d.c(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.widgets.follow.c.class));
                        if (cVar != null) {
                            cVar.a(this.this$0.v());
                        }
                        this.this$0.T();
                    }
                } else {
                    au auVar3 = this.this$0.x;
                    if (auVar3 != null) {
                        auVar3.E();
                    }
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.b.a
    public final void e(int i2) {
        String str;
        boolean z2 = false;
        boolean z3 = true;
        if (i2 == 0) {
            if (this.x == null) {
                au a2 = a(0, 1);
                this.x = a2;
                if (a2 == null) {
                    l.b();
                }
                a2.a(this.F);
                au auVar = this.x;
                if (auVar == null) {
                    l.b();
                }
                if (this.o != I()) {
                    z3 = false;
                }
                auVar.d(z3);
                au auVar2 = this.x;
                if (auVar2 == null) {
                    l.b();
                }
                auVar2.c(ho.a(0));
                au auVar3 = this.x;
                if (auVar3 == null) {
                    l.b();
                }
                auVar3.c_(u());
                au auVar4 = this.x;
                if (auVar4 == null) {
                    l.b();
                }
                auVar4.b(W());
            }
            au auVar5 = this.x;
            if (auVar5 == null) {
                l.b();
            }
            auVar5.a(w(), x());
            a((cs) this.x, (Integer) 0);
            if (this.x == null) {
                l.b();
            }
            com.ss.android.ugc.aweme.profile.f.l.a(com.ss.android.ugc.aweme.profile.f.l.d(), "others_homepage");
        } else if (i2 != 12) {
            int i3 = 2;
            if (i2 == 2) {
                if (this.y == null) {
                    au a3 = a(1, 2);
                    this.y = a3;
                    if (a3 == null) {
                        l.b();
                    }
                    a3.a(this.F);
                    au auVar6 = this.y;
                    if (auVar6 == null) {
                        l.b();
                    }
                    int i4 = this.o;
                    if (!I()) {
                        i3 = 1;
                    }
                    if (i4 == i3) {
                        z2 = true;
                    }
                    auVar6.d(z2);
                    au auVar7 = this.y;
                    if (auVar7 == null) {
                        l.b();
                    }
                    auVar7.c(ho.a(1));
                    au auVar8 = this.y;
                    if (auVar8 == null) {
                        l.b();
                    }
                    auVar8.c_(u());
                    au auVar9 = this.y;
                    if (auVar9 == null) {
                        l.b();
                    }
                    auVar9.b(W());
                }
                au auVar10 = this.y;
                if (auVar10 == null) {
                    l.b();
                }
                auVar10.a(w(), x());
                au auVar11 = this.y;
                if (auVar11 == null) {
                    l.b();
                }
                auVar11.J = new b(this);
                a((cs) this.y, (Integer) 1);
            } else if (i2 == 3) {
                if (this.z == null) {
                    cs a4 = a.a((a) this);
                    this.z = a4;
                    if (a4 == null) {
                        l.b();
                    }
                    a4.c(ho.a(3));
                }
                cs csVar = this.z;
                String str2 = null;
                if (!(csVar instanceof com.ss.android.ugc.aweme.music.b)) {
                    csVar = null;
                }
                com.ss.android.ugc.aweme.music.b bVar = (com.ss.android.ugc.aweme.music.b) csVar;
                if (bVar != null) {
                    bVar.a(new a(this));
                    User v = v();
                    if (v != null) {
                        str = v.getUniqueId();
                    } else {
                        str = null;
                    }
                    if (TextUtils.isEmpty(str)) {
                        User v2 = v();
                        if (v2 != null) {
                            str2 = v2.getShortId();
                        }
                    } else {
                        User v3 = v();
                        if (v3 != null) {
                            str2 = v3.getUniqueId();
                        }
                    }
                    bVar.b(str2);
                    cs csVar2 = this.z;
                    if (csVar2 == null) {
                        l.b();
                    }
                    csVar2.a(w(), x());
                }
                a(this.z, (Integer) 3);
            } else if (i2 == 4) {
                if (this.B == null) {
                    com.ss.android.ugc.aweme.profile.effect.e M = M();
                    this.B = M;
                    if (M == null) {
                        l.b();
                    }
                    M.c(ho.a(6));
                }
                com.ss.android.ugc.aweme.profile.effect.e eVar = this.B;
                if (eVar == null) {
                    l.b();
                }
                eVar.a(w(), x());
                a((cs) this.B, (Integer) 6);
            }
        } else {
            if (this.A == null) {
                Bundle bundle = new Bundle();
                bundle.putString("sec_user_id", x());
                bundle.putString("author_id", w());
                bundle.putBoolean("is_my_profile", false);
                bundle.putString("enter_from", O());
                bundle.putString("show_window_source", P());
                User v4 = v();
                if (v4 != null) {
                    bundle.putInt("follow_status", v4.getFollowStatus());
                }
                this.A = k.c.a(bundle);
            }
            a((cs) this.A, (Integer) 16);
        }
    }

    static final class f extends m implements h.f.a.m<String, String, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(76135);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(i iVar) {
            super(2);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, String str2) {
            this.this$0.a(str, str2);
            return z.f158842a;
        }
    }

    private final au a(int i2, int i3) {
        Fragment fragment;
        androidx.fragment.app.i childFragmentManager;
        Fragment a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) this);
        if (a2 == null || (childFragmentManager = a2.getChildFragmentManager()) == null) {
            fragment = null;
        } else {
            fragment = childFragmentManager.a(this.f117650j + i3);
        }
        au auVar = (au) fragment;
        if (auVar != null) {
            return auVar;
        }
        au a3 = au.a(-1, i2, w(), x(), false, true, new Bundle());
        l.b(a3, "");
        return a3;
    }

    public final void a(String str, String str2) {
        String str3;
        cs csVar = this.z;
        if (csVar != null) {
            csVar.a(str, str2);
        }
        cs csVar2 = this.z;
        String str4 = null;
        if (!(csVar2 instanceof com.ss.android.ugc.aweme.music.b)) {
            csVar2 = null;
        }
        com.ss.android.ugc.aweme.music.b bVar = (com.ss.android.ugc.aweme.music.b) csVar2;
        if (bVar != null) {
            User v = v();
            if (v != null) {
                str3 = v.getUniqueId();
            } else {
                str3 = null;
            }
            if (TextUtils.isEmpty(str3)) {
                User v2 = v();
                if (v2 != null) {
                    str4 = v2.getShortId();
                }
            } else {
                User v3 = v();
                if (v3 != null) {
                    str4 = v3.getUniqueId();
                }
            }
            bVar.b(str4);
        }
        com.ss.android.ugc.aweme.profile.effect.e eVar = this.B;
        if (eVar != null) {
            eVar.a(str, str2);
        }
        au auVar = this.y;
        if (auVar != null) {
            auVar.a(str, str2);
        }
        au auVar2 = this.x;
        if (auVar2 != null) {
            auVar2.a(str, str2);
        }
        k kVar = this.A;
        if (kVar != null) {
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            kVar.a(str, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.b.r
    public final void a(boolean z2, boolean z3) {
        int i2;
        if (this.f117651k != null) {
            int i3 = this.o;
            List<cs> list = this.f117651k;
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            if (i3 < i2) {
                List<cs> list2 = this.f117651k;
                if (list2 == null) {
                    l.b();
                }
                if (list2.get(this.o) instanceof aq) {
                    List<cs> list3 = this.f117651k;
                    if (list3 == null) {
                        l.b();
                    }
                    cs csVar = list3.get(this.o);
                    Objects.requireNonNull(csVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.IAwemeListFragment");
                    aq aqVar = (aq) csVar;
                    if (aqVar != null) {
                        if (z2) {
                            aqVar.a(false, z3);
                        } else {
                            aqVar.y();
                        }
                    }
                }
            }
        }
    }
}
