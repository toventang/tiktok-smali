package com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.donation.DonationServiceImpl;
import com.ss.android.ugc.aweme.donation.IDonationService;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.i;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Map;

public final class n extends i {
    public com.bytedance.tux.sheet.sheet.a o;
    public Map<String, String> p;

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final b f117637a = new b();

        static {
            Covode.recordClassIndex(76088);
        }

        b() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(76086);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.i
    public final com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a B() {
        return com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a.Supporting;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.i
    public final View A() {
        return a(R.string.div, R.raw.icon_heart_grid, b.f117637a);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.i, com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.core.a
    public final void f() {
        super.f();
        com.bytedance.assem.arch.service.d.a(this, ab.a(j.class), o.f117638a, new c(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), p.f117639a, new d(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.c.class), q.f117640a, new e(this));
    }

    static final class d extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends z>, z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(76090);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(n nVar) {
            super(1);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends z> aVar) {
            this.this$0.a((ProfileNgoStruct) null);
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends Integer>, z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(76091);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(n nVar) {
            super(1);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends Integer> aVar) {
            com.bytedance.assem.arch.extensions.a<? extends Integer> aVar2 = aVar;
            if (aVar2 != null && aVar2.f25631b.intValue() == com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a.Supporting.getId()) {
                r.a("show_link", this.this$0.p);
            }
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(76089);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(n nVar) {
            super(1);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            T t;
            ProfileNgoStruct profileNgoStruct;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null || t.isBlock)) {
                n nVar = this.this$0;
                T t2 = aVar2.f25631b;
                if (t2 != null) {
                    profileNgoStruct = t2.getProfileNgoStruct();
                } else {
                    profileNgoStruct = null;
                }
                nVar.a(profileNgoStruct);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f117633a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProfileNgoStruct f117634b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ User f117635c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Map f117636d;

        static {
            Covode.recordClassIndex(76087);
        }

        a(n nVar, ProfileNgoStruct profileNgoStruct, User user, Map map) {
            this.f117633a = nVar;
            this.f117634b = profileNgoStruct;
            this.f117635c = user;
            this.f117636d = map;
        }

        public final void onClick(View view) {
            String str;
            androidx.fragment.app.i supportFragmentManager;
            ClickAgent.onClick(view);
            com.bytedance.tux.sheet.sheet.a aVar = this.f117633a.o;
            if (aVar != null) {
                aVar.dismiss();
            }
            Bundle bundle = new Bundle();
            if (this.f117633a.v()) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            bundle.putString("enter_from", str);
            bundle.putString("enter_method", "click");
            bundle.putBoolean("should_dim_bg", true);
            n nVar = this.f117633a;
            IDonationService b2 = DonationServiceImpl.b();
            int id = this.f117634b.getId();
            String secUid = this.f117635c.getSecUid();
            l.b(secUid, "");
            nVar.o = b2.a(id, secUid, bundle);
            r.a("click_link", this.f117636d);
            androidx.fragment.app.e b3 = com.bytedance.assem.arch.extensions.b.b(this.f117633a);
            if (b3 != null && (supportFragmentManager = b3.getSupportFragmentManager()) != null) {
                com.bytedance.tux.sheet.sheet.a aVar2 = this.f117633a.o;
                if (aVar2 == null) {
                    l.b();
                }
                aVar2.show(supportFragmentManager, "DonationFragment");
            }
        }
    }

    public final void a(ProfileNgoStruct profileNgoStruct) {
        boolean z;
        String str;
        String str2;
        String donationLink;
        if (com.ss.android.ugc.aweme.profile.experiment.j.a() || v()) {
            z = true;
        } else {
            z = false;
        }
        com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this, ab.a(j.class));
        User user = null;
        if (iVar != null) {
            user = iVar.f117705a;
        }
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "others_homepage");
        if (profileNgoStruct == null || (str = profileNgoStruct.getDonationLink()) == null) {
            str = "";
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("link", str);
        if (user == null || (str2 = user.getUid()) == null) {
            str2 = "";
        }
        Map<String, String> map = a3.a("author_id", str2).a("link_type", "nonprofit").f66730a;
        l.b(map, "");
        if (!v() && profileNgoStruct != null && (donationLink = profileNgoStruct.getDonationLink()) != null && donationLink.length() > 0) {
            this.p = map;
        }
        if (user == null || !z || profileNgoStruct == null || Integer.valueOf(profileNgoStruct.getId()) == null || TextUtils.isEmpty(profileNgoStruct.getIconUrl()) || TextUtils.isEmpty(profileNgoStruct.getName())) {
            z();
            return;
        }
        a(new a(this, profileNgoStruct, user, map));
        String string = w().getResources().getString(R.string.div, profileNgoStruct.getName());
        l.b(string, "");
        b(string);
        y();
    }
}
