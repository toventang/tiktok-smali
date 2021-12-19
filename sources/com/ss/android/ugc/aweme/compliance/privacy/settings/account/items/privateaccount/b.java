package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.table.cell.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.CanQuitBusinessAccountApi;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.a;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.c;
import com.ss.android.ugc.aweme.metrics.ab;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.util.Objects;

public final class b extends com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c implements e.a, i {

    /* renamed from: a  reason: collision with root package name */
    public final PrivacySettingViewModel f77623a;

    /* renamed from: b  reason: collision with root package name */
    private final h f77624b = h.i.a((h.f.a.a) f.f77632a);

    /* renamed from: c  reason: collision with root package name */
    private boolean f77625c;

    static {
        Covode.recordClassIndex(48026);
    }

    public final o b() {
        return (o) this.f77624b.getValue();
    }

    static final class f extends m implements h.f.a.a<o> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f77632a = new f();

        static {
            Covode.recordClassIndex(48032);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ o invoke() {
            return com.ss.android.ugc.aweme.compliance.privacy.data.b.a(0, "private_account");
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c
    public final c.a a() {
        return new c(this);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i
    public final boolean c() {
        return com.ss.android.ugc.aweme.compliance.privacy.settings.a.a(b()).f77439a;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i
    public final boolean d() {
        return com.ss.android.ugc.aweme.compliance.privacy.settings.a.a(b()).f77440b;
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h $holder$inlined;
        final /* synthetic */ View $itemView$inlined;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(48027);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, View view, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h hVar) {
            super(0);
            this.this$0 = bVar;
            this.$itemView$inlined = view;
            this.$holder$inlined = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            o b2 = this.this$0.b();
            View view = this.$holder$inlined.itemView;
            l.b(view, "");
            Context context = view.getContext();
            l.b(context, "");
            com.ss.android.ugc.aweme.compliance.privacy.settings.a.a(b2, context);
            return z.f158842a;
        }
    }

    public final boolean e() {
        return l.a((Object) this.f77623a.f77452d.getValue(), (Object) true);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.b$b  reason: collision with other inner class name */
    static final class C1799b extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h $holder$inlined;
        final /* synthetic */ View $itemView$inlined;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(48028);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1799b(b bVar, View view, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h hVar) {
            super(0);
            this.this$0 = bVar;
            this.$itemView$inlined = view;
            this.$holder$inlined = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            int i2;
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h hVar = this.$holder$inlined;
            Objects.requireNonNull(hVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.PrivateAccountViewHolder");
            c cVar = (c) hVar;
            boolean e2 = this.this$0.e();
            if (com.ss.android.ugc.aweme.compliance.privacy.a.a.c()) {
                View view = cVar.itemView;
                l.b(view, "");
                new com.bytedance.tux.g.b(view).e(R.string.bup).b();
                com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", "Force private account: can't modify");
            } else {
                if (e2) {
                    String c2 = cVar.c();
                    l.d(c2, "");
                    r.a("private_account_on", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "privacy_and_safety_settings").a("enter_method", c2).f66730a);
                } else {
                    String c3 = cVar.c();
                    l.d(c3, "");
                    r.a("private_account_off", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "privacy_and_safety_settings").a("enter_method", c3).f66730a);
                }
                com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", "handlePrivateAccountClick - Start");
                View view2 = cVar.itemView;
                l.b(view2, "");
                Context context = view2.getContext();
                if (context != null) {
                    User e3 = com.ss.android.ugc.aweme.compliance.privacy.a.a.e();
                    if (c.a.a(e3) && !com.ss.android.ugc.aweme.compliance.privacy.a.a.b() && !cVar.b()) {
                        com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", "Pro account: open private account");
                        if (e3.getAccountType() == 3) {
                            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", "Business account: quit check, call /aweme/v1/ad/ba/quitcheck/");
                            t<BaseResponse> a2 = CanQuitBusinessAccountApi.a.f77615a.check().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
                            l.b(a2, "");
                            cVar.f77635a.a(a2.a(new c.C1800c(cVar, e3), new c.d(cVar)));
                        } else {
                            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", "Pro account but not business: showPrivacyDialog");
                            cVar.a(e3);
                        }
                    } else if (cVar.b()) {
                        ab.a("shield_off").b(StringSet.type, "account").f();
                        com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", "Personal account: close private account, showChangePrivacyAlert");
                        com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", "Close private account alert dialog: show");
                        r.a("show_private_account_pop_up", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "privacy_and_safety_settings").f66730a);
                        View view3 = cVar.itemView;
                        l.b(view3, "");
                        Context context2 = view3.getContext();
                        l.b(context2, "");
                        com.bytedance.tux.dialog.e eVar = new com.bytedance.tux.dialog.e(context2);
                        if (QnaService.a().enablePublicQna()) {
                            i2 = R.string.f5q;
                        } else {
                            i2 = R.string.abg;
                        }
                        ((com.bytedance.tux.dialog.e) eVar.b(i2).a(R.string.abd)).a(R.string.asg, new c.i(cVar)).a(new c.j(cVar)).a().b().show();
                    } else {
                        com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", "Personal account: open private account");
                        l.d(e3, "");
                        com.ss.android.ugc.aweme.setting.verification.c cVar2 = new com.ss.android.ugc.aweme.setting.verification.c();
                        t a3 = t.a(new a.C1798a(cVar2, e3)).a(f.a.e.b.a.f157191d, new a.b(cVar2)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
                        l.b(a3, "");
                        cVar.f77635a.a(a3.a(new c.e(cVar, context), c.f.f77646a));
                    }
                }
            }
            return true;
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f77628a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e f77629b;

        static {
            Covode.recordClassIndex(48030);
        }

        d(b bVar, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e eVar) {
            this.f77628a = bVar;
            this.f77629b = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.b.a(this.f77629b, this.f77628a);
        }
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f77630a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e f77631b;

        static {
            Covode.recordClassIndex(48031);
        }

        e(b bVar, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e eVar) {
            this.f77630a = bVar;
            this.f77631b = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.b.a(this.f77631b, this.f77630a);
        }
    }

    public static final class c implements c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f77626a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f77627b = R.layout.up;

        static {
            Covode.recordClassIndex(48029);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(b bVar) {
            this.f77626a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c.a
        public final com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h a(Context context, ViewGroup viewGroup) {
            l.d(context, "");
            l.d(viewGroup, "");
            View a2 = com.a.a(LayoutInflater.from(context), this.f77627b, viewGroup, false);
            l.b(a2, "");
            return new c(a2, this.f77626a.f77623a);
        }
    }

    public b(PrivacySettingViewModel privacySettingViewModel) {
        l.d(privacySettingViewModel, "");
        this.f77623a = privacySettingViewModel;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e.a
    public final void a(com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e eVar) {
        l.d(eVar, "");
        this.f77623a.f77452d.observe(eVar, new d(this, eVar));
        this.f77623a.f77453e.observe(eVar, new e(this, eVar));
    }

    static final class g extends m implements h.f.a.b<com.ss.android.ugc.aweme.app.f.c, com.ss.android.ugc.aweme.app.f.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f77633a = new g();

        static {
            Covode.recordClassIndex(48033);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.app.f.c invoke(com.ss.android.ugc.aweme.app.f.c cVar) {
            com.ss.android.ugc.aweme.app.f.c cVar2 = cVar;
            l.d(cVar2, "");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "Private account state");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "cur_value", Boolean.valueOf(com.ss.android.ugc.aweme.compliance.privacy.a.a.b()));
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "pro_account", Boolean.valueOf(c.a.a(com.ss.android.ugc.aweme.compliance.privacy.a.a.e())));
            return com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "force_private_account", Boolean.valueOf(com.ss.android.ugc.aweme.compliance.privacy.a.a.c()));
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c
    public final void a(com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h hVar, int i2) {
        int i3;
        View findViewById;
        l.d(hVar, "");
        View view = hVar.itemView;
        l.b(view, "");
        TuxTextCell tuxTextCell = (TuxTextCell) view.findViewById(R.id.bry);
        Context context = view.getContext();
        tuxTextCell.setTitle(context.getString(R.string.ev8));
        tuxTextCell.setSubtitle(context.getString(R.string.fr_));
        tuxTextCell.setCellEnabled(c());
        l.b(tuxTextCell, "");
        if (d()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        tuxTextCell.setVisibility(i3);
        if (!(tuxTextCell.getAccessory() instanceof c.j)) {
            Context context2 = tuxTextCell.getContext();
            l.b(context2, "");
            tuxTextCell.setAccessory(new c.j(context2));
        }
        tuxTextCell.setCellEnabled(c());
        tuxTextCell.setLoading(l.a((Object) this.f77623a.f77453e.getValue(), (Object) true));
        c.b accessory = tuxTextCell.getAccessory();
        Objects.requireNonNull(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
        c.e eVar = (c.e) accessory;
        eVar.c(e());
        eVar.f45439a = new a(this, view, hVar);
        eVar.a(new C1799b(this, view, hVar));
        if (this.f77623a.f77450b && !this.f77625c && (findViewById = tuxTextCell.findViewById(R.id.a3k)) != null) {
            this.f77625c = true;
            int c2 = androidx.core.content.b.c(findViewById.getContext(), R.color.gm);
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofObject = ObjectAnimator.ofObject(findViewById, "backgroundColor", new ArgbEvaluator(), -1, Integer.valueOf(c2));
            ofObject.setInterpolator(new LinearInterpolator());
            ofObject.setStartDelay(500);
            ofObject.setDuration(300L);
            ObjectAnimator ofObject2 = ObjectAnimator.ofObject(findViewById, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(c2), -1);
            ofObject2.setInterpolator(new LinearInterpolator());
            ofObject2.setStartDelay(800);
            ofObject2.setDuration(300L);
            animatorSet.playSequentially(ofObject, ofObject2);
            animatorSet.start();
        }
        com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", g.f77633a);
    }
}
