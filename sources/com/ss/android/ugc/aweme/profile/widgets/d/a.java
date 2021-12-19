package com.ss.android.ugc.aweme.profile.widgets.d;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.extensions.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.donation.DonationServiceImpl;
import com.ss.android.ugc.aweme.donation.IDonationService;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.views.DonationLinkView;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Map;

public final class a extends com.bytedance.assem.arch.d.a {

    /* renamed from: k  reason: collision with root package name */
    public static final b f117718k = new b((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public com.bytedance.tux.sheet.sheet.a f117719j;

    /* renamed from: l  reason: collision with root package name */
    private final i f117720l = new i(bQ_(), new C2991a(this, null));

    /* renamed from: m  reason: collision with root package name */
    private DonationLinkView f117721m;

    static {
        Covode.recordClassIndex(76207);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(76209);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final boolean u() {
        com.ss.android.ugc.aweme.profile.widgets.h.a.a aVar = (com.ss.android.ugc.aweme.profile.widgets.h.a.a) this.f117720l.getValue();
        if (aVar != null) {
            return aVar.f117878c;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.d.a$a  reason: collision with other inner class name */
    public static final class C2991a extends m implements h.f.a.a<com.ss.android.ugc.aweme.profile.widgets.h.a.a> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(76208);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2991a(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.widgets.h.a.a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.ss.android.ugc.aweme.profile.widgets.h.a.a.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.d.a.C2991a.invoke():java.lang.Object");
        }
    }

    static final class e extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends z>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76212);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends z> aVar) {
            this.this$0.a((ProfileNgoStruct) null);
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76211);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            T t;
            ProfileNgoStruct profileNgoStruct;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null || t.isBlock)) {
                a aVar3 = this.this$0;
                T t2 = aVar2.f25631b;
                if (t2 != null) {
                    profileNgoStruct = t2.getProfileNgoStruct();
                } else {
                    profileNgoStruct = null;
                }
                aVar3.a(profileNgoStruct);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        if (!(view instanceof DonationLinkView)) {
            view = null;
        }
        this.f117721m = (DonationLinkView) view;
        com.bytedance.assem.arch.service.d.a(this, ab.a(j.class), b.f117725a, new d(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), c.f117726a, new e(this));
    }

    public static final class c implements DonationLinkView.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117722a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f117723b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f117724c;

        static {
            Covode.recordClassIndex(76210);
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.views.DonationLinkView.b
        public final void a(int i2) {
            String str;
            androidx.fragment.app.i supportFragmentManager;
            com.bytedance.tux.sheet.sheet.a aVar = this.f117722a.f117719j;
            if (aVar != null) {
                aVar.dismiss();
            }
            Bundle bundle = new Bundle();
            if (this.f117722a.u()) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            bundle.putString("enter_from", str);
            bundle.putString("enter_method", "click");
            bundle.putBoolean("should_dim_bg", true);
            a aVar2 = this.f117722a;
            IDonationService b2 = DonationServiceImpl.b();
            String secUid = this.f117723b.getSecUid();
            l.b(secUid, "");
            aVar2.f117719j = b2.a(i2, secUid, bundle);
            r.a("click_link", this.f117724c);
            androidx.fragment.app.e b3 = com.bytedance.assem.arch.extensions.b.b(this.f117722a);
            if (b3 != null && (supportFragmentManager = b3.getSupportFragmentManager()) != null) {
                com.bytedance.tux.sheet.sheet.a aVar3 = this.f117722a.f117719j;
                if (aVar3 == null) {
                    l.b();
                }
                aVar3.show(supportFragmentManager, "DonationFragment");
            }
        }

        c(a aVar, User user, Map map) {
            this.f117722a = aVar;
            this.f117723b = user;
            this.f117724c = map;
        }
    }

    public final void a(ProfileNgoStruct profileNgoStruct) {
        boolean z;
        String str;
        String str2;
        DonationLinkView donationLinkView;
        String donationLink;
        if (com.ss.android.ugc.aweme.profile.experiment.j.a() || u()) {
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
        if (!u() && profileNgoStruct != null && (donationLink = profileNgoStruct.getDonationLink()) != null && donationLink.length() > 0) {
            r.a("show_link", map);
        }
        if (!(user == null || !z || (donationLinkView = this.f117721m) == null)) {
            c cVar = new c(this, user, map);
            l.d(cVar, "");
            if (profileNgoStruct != null && Integer.valueOf(profileNgoStruct.getId()) != null && !TextUtils.isEmpty(profileNgoStruct.getIconUrl()) && !TextUtils.isEmpty(profileNgoStruct.getName())) {
                donationLinkView.f117307b.setText(donationLinkView.getResources().getString(R.string.div, profileNgoStruct.getName()));
                donationLinkView.f117307b.setOnClickListener(new DonationLinkView.c(cVar, profileNgoStruct));
                donationLinkView.f117306a.setColorFilter(donationLinkView.getResources().getColor(DonationLinkView.f117304c));
                donationLinkView.f117307b.setTextColor(donationLinkView.getResources().getColor(DonationLinkView.f117304c));
                DonationLinkView donationLinkView2 = this.f117721m;
                if (donationLinkView2 != null) {
                    donationLinkView2.setVisibility(0);
                    return;
                }
                return;
            }
        }
        DonationLinkView donationLinkView3 = this.f117721m;
        if (donationLinkView3 != null) {
            donationLinkView3.setVisibility(8);
        }
    }
}
