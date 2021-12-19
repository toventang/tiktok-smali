package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e;
import com.ss.android.ugc.aweme.setting.services.f;
import com.ss.android.ugc.aweme.setting.ui.bv;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class j extends a implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public final PrivacySettingViewModel f77568a;

    /* renamed from: b  reason: collision with root package name */
    private final h f77569b = i.a((h.f.a.a) b.f77573a);

    /* renamed from: c  reason: collision with root package name */
    private final int f77570c = R.string.nh;

    /* renamed from: d  reason: collision with root package name */
    private final int f77571d = R.raw.icon_heart;

    static {
        Covode.recordClassIndex(47998);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final o e() {
        return (o) this.f77569b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final int f() {
        return this.f77570c;
    }

    static final class b extends m implements h.f.a.a<o> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f77573a = new b();

        static {
            Covode.recordClassIndex(48000);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ o invoke() {
            return com.ss.android.ugc.aweme.compliance.privacy.data.b.a(0, "favorite");
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final Integer h() {
        return Integer.valueOf(this.f77571d);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i, com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final boolean d() {
        boolean f2 = f.f122672a.f();
        if (!super.d() || f2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e.a
    public final void a(e eVar) {
        l.d(eVar, "");
        this.f77568a.f77451c.observe(eVar, a.f77572a);
    }

    public j(PrivacySettingViewModel privacySettingViewModel) {
        l.d(privacySettingViewModel, "");
        this.f77568a = privacySettingViewModel;
    }

    static final class a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77572a = new a();

        static {
            Covode.recordClassIndex(47999);
        }

        a() {
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num;
            com.ss.android.ugc.aweme.compliance.api.model.h hVar;
            q qVar = (q) obj;
            s sVar = s.a.f66880a;
            l.b(sVar, "");
            aj<Integer> c2 = sVar.c();
            l.b(c2, "");
            if (qVar == null || (hVar = qVar.f76687c) == null) {
                num = null;
            } else {
                num = Integer.valueOf(hVar.f76667a);
            }
            c2.b(num);
            c.a(new bv());
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.a
    public final void a(Context context) {
        l.d(context, "");
        r.a("enter_liked_permission", new d().a("enter_from", "privacy_and_safety_settings").f66730a);
        SmartRouter.buildRoute(context, "//mylikelistcontrol/setting").open(7);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0040  */
    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.a, com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h r7, int r8) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.j.a(com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h, int):void");
    }
}
