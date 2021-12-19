package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.table.cell.c;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.g;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.compliance.privacy.data.b;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Objects;

public final class f extends a {

    /* renamed from: a  reason: collision with root package name */
    public final PrivacySettingViewModel f77549a;

    /* renamed from: b  reason: collision with root package name */
    private final h f77550b = i.a((h.f.a.a) a.f77553a);

    /* renamed from: c  reason: collision with root package name */
    private final int f77551c = R.string.nf;

    /* renamed from: d  reason: collision with root package name */
    private final int f77552d = R.raw.icon_arrow_down_to_line;

    static {
        Covode.recordClassIndex(47990);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final o e() {
        return (o) this.f77550b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final int f() {
        return this.f77551c;
    }

    static final class a extends m implements h.f.a.a<o> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77553a = new a();

        static {
            Covode.recordClassIndex(47991);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ o invoke() {
            return b.a(0, "download");
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final Integer h() {
        return Integer.valueOf(this.f77552d);
    }

    public f(PrivacySettingViewModel privacySettingViewModel) {
        l.d(privacySettingViewModel, "");
        this.f77549a = privacySettingViewModel;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.a
    public final void a(Context context) {
        l.d(context, "");
        r.a("enter_download_permission", new d().a("enter_from", "privacy_and_safety_settings").a("is_private", com.ss.android.ugc.aweme.compliance.privacy.a.a.b() ? 1 : 0).f66730a);
        SmartRouter.buildRoute(context, "//setting/download").withParam("enter_from", "privacy_and_safety_setting").open(4);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.a, com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c
    public final void a(com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h hVar, int i2) {
        g gVar;
        Integer valueOf;
        l.d(hVar, "");
        super.a(hVar, i2);
        View view = hVar.itemView;
        l.b(view, "");
        c.b accessory = ((TuxTextCell) view.findViewById(R.id.bry)).getAccessory();
        Objects.requireNonNull(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Disclosure");
        c.f fVar = (c.f) accessory;
        View view2 = hVar.itemView;
        l.b(view2, "");
        Context context = view2.getContext();
        q b2 = b.b();
        if (!(b2 == null || (gVar = b2.f76685a) == null || (valueOf = Integer.valueOf(gVar.f76663a)) == null)) {
            if (valueOf.intValue() == 0) {
                fVar.a(context.getString(R.string.dm3));
                return;
            } else if (valueOf.intValue() == 3) {
                fVar.a(context.getString(R.string.dlu));
                return;
            }
        }
        fVar.a((CharSequence) null);
    }
}
