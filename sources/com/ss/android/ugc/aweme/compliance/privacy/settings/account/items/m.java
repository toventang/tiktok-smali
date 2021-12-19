package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h;
import com.ss.android.ugc.aweme.setting.services.f;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.zhiliaoapp.musically.R;
import f.a.ad;
import f.a.af;
import h.f.b.l;

public final class m extends h {

    /* renamed from: a  reason: collision with root package name */
    final Context f77593a;

    /* renamed from: b  reason: collision with root package name */
    public final PrivacySettingViewModel f77594b;

    /* renamed from: c  reason: collision with root package name */
    public final t<Boolean> f77595c;

    /* renamed from: d  reason: collision with root package name */
    public final t<Boolean> f77596d;

    static {
        Covode.recordClassIndex(48010);
    }

    public static void a(String str) {
        bj.a("PreUploadingItem ".concat(String.valueOf(str)));
    }

    static final class a<T> implements af {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f77597a;

        static {
            Covode.recordClassIndex(48011);
        }

        a(boolean z) {
            this.f77597a = z;
        }

        @Override // f.a.af
        public final void subscribe(ad<BaseResponse> adVar) {
            int i2;
            l.d(adVar, "");
            f fVar = f.f122672a;
            if (this.f77597a) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            adVar.a(fVar.a("enable_tiktok_preupload", i2));
        }
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f77598a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f77599b;

        static {
            Covode.recordClassIndex(48012);
        }

        b(m mVar, boolean z) {
            this.f77598a = mVar;
            this.f77599b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            m.a("request success use newStatus:" + this.f77599b);
            this.f77598a.f77595c.setValue(false);
            this.f77598a.f77596d.setValue(Boolean.valueOf(this.f77599b));
            m.a(true, this.f77599b);
        }
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f77600a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f77601b;

        static {
            Covode.recordClassIndex(48013);
        }

        c(m mVar, boolean z) {
            this.f77600a = mVar;
            this.f77601b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            m.a("request failed use originStatus:" + this.f77601b);
            this.f77600a.f77595c.setValue(false);
            this.f77600a.f77596d.setValue(Boolean.valueOf(this.f77601b));
            View view = this.f77600a.itemView;
            l.b(view, "");
            new com.bytedance.tux.g.b(view).e(R.string.dmn);
            m.a(false, this.f77601b);
        }
    }

    public static void a(boolean z, boolean z2) {
        a("mobPreUploadSwitch isSuccess:" + z + " isOpen:" + z2);
        r.a("click_pre_release", new d().a("status", z2 ? 1 : 0).a("reaction", Boolean.valueOf(z)).f66730a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(View view, PrivacySettingViewModel privacySettingViewModel, t<Boolean> tVar, t<Boolean> tVar2) {
        super(view);
        l.d(view, "");
        l.d(privacySettingViewModel, "");
        l.d(tVar, "");
        l.d(tVar2, "");
        this.f77594b = privacySettingViewModel;
        this.f77595c = tVar;
        this.f77596d = tVar2;
        this.f77593a = view.getContext();
    }
}
