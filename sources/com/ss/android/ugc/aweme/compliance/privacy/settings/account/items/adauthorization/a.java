package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h;
import h.f.b.l;

public final class a extends h {

    /* renamed from: a  reason: collision with root package name */
    final Context f77506a;

    /* renamed from: b  reason: collision with root package name */
    public final PrivacySettingViewModel f77507b;

    static {
        Covode.recordClassIndex(47965);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.a$a  reason: collision with other inner class name */
    public static final class C1794a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f77508a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f77509b;

        static {
            Covode.recordClassIndex(47966);
        }

        @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.c
        public final void b() {
            this.f77508a.f77507b.f77455g.setValue(false);
            this.f77508a.f77507b.f77454f.setValue(Boolean.valueOf(!this.f77509b));
        }

        @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.c
        public final void c() {
            this.f77508a.f77507b.f77455g.setValue(true);
            this.f77508a.f77507b.f77454f.setValue(Boolean.valueOf(this.f77509b));
        }

        @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.c
        public final void a() {
            this.f77508a.f77507b.f77455g.setValue(false);
            this.f77508a.f77507b.f77454f.setValue(Boolean.valueOf(this.f77509b));
            com.ss.android.ugc.aweme.compliance.privacy.a.a.a(this.f77509b);
        }

        C1794a(a aVar, boolean z) {
            this.f77508a = aVar;
            this.f77509b = z;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view, PrivacySettingViewModel privacySettingViewModel) {
        super(view);
        l.d(view, "");
        l.d(privacySettingViewModel, "");
        this.f77507b = privacySettingViewModel;
        this.f77506a = view.getContext();
    }
}
