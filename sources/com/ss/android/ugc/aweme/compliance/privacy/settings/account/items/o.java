package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.table.cell.c;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.compliance.api.model.s;
import com.ss.android.ugc.aweme.compliance.privacy.data.b;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Objects;

public final class o extends a {

    /* renamed from: a  reason: collision with root package name */
    public final PrivacySettingViewModel f77603a;

    /* renamed from: b  reason: collision with root package name */
    private final h f77604b = i.a((h.f.a.a) a.f77607a);

    /* renamed from: c  reason: collision with root package name */
    private final int f77605c;

    /* renamed from: d  reason: collision with root package name */
    private final int f77606d;

    static {
        Covode.recordClassIndex(48015);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final com.ss.android.ugc.aweme.compliance.api.model.o e() {
        return (com.ss.android.ugc.aweme.compliance.api.model.o) this.f77604b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final int f() {
        return this.f77605c;
    }

    static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.compliance.api.model.o> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77607a = new a();

        static {
            Covode.recordClassIndex(48016);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.compliance.api.model.o invoke() {
            return b.a(0, "upvote");
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final Integer h() {
        return Integer.valueOf(this.f77606d);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i, com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final boolean d() {
        if (!super.d() || !com.ss.android.ugc.aweme.upvote.b.a.a()) {
            return false;
        }
        return true;
    }

    public o(PrivacySettingViewModel privacySettingViewModel) {
        int i2;
        int i3;
        l.d(privacySettingViewModel, "");
        this.f77603a = privacySettingViewModel;
        if (com.ss.android.ugc.aweme.upvote.b.a.b()) {
            i2 = R.string.f9k;
        } else {
            i2 = R.string.fdi;
        }
        this.f77605c = i2;
        if (com.ss.android.ugc.aweme.upvote.b.a.b()) {
            i3 = R.raw.icon_raising_star;
        } else {
            i3 = R.raw.icon_repost;
        }
        this.f77606d = i3;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.a
    public final void a(Context context) {
        l.d(context, "");
        r.a("enter_recommend_permission", new d().a("enter_from", "privacy_and_safety_settings").a("is_private", com.ss.android.ugc.aweme.compliance.privacy.a.a.b() ? 1 : 0).f66730a);
        SmartRouter.buildRoute(context, "aweme://recommend/settings").open();
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.a, com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c
    public final void a(com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h hVar, int i2) {
        s sVar;
        Integer valueOf;
        Integer valueOf2;
        l.d(hVar, "");
        super.a(hVar, i2);
        View view = hVar.itemView;
        l.b(view, "");
        c.b accessory = ((TuxTextCell) view.findViewById(R.id.bry)).getAccessory();
        Objects.requireNonNull(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Disclosure");
        c.f fVar = (c.f) accessory;
        q b2 = b.b();
        String str = null;
        if (!(b2 == null || (sVar = b2.f76691g) == null || (valueOf = Integer.valueOf(sVar.f76694a)) == null)) {
            if (valueOf.intValue() == 1) {
                valueOf2 = Integer.valueOf((int) R.string.dm3);
            } else if (valueOf.intValue() == 2) {
                valueOf2 = Integer.valueOf((int) R.string.dlu);
            }
            if (valueOf2 != null) {
                int intValue = valueOf2.intValue();
                View view2 = hVar.itemView;
                l.b(view2, "");
                str = view2.getContext().getString(intValue);
            }
        }
        fVar.a(str);
    }
}
