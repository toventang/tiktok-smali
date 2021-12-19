package com.ss.android.ugc.aweme.profile.service;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.f.a;
import com.ss.android.ugc.aweme.profile.experiment.f;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.aq;
import h.f.b.l;

public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final b f116618a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ e f116619b = h.f116622a.bridgeService();

    @Override // com.ss.android.ugc.aweme.profile.service.e
    public final void checkToTransformMusDraft() {
        this.f116619b.checkToTransformMusDraft();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.e
    public final aq createAwemeListFragment(int i2, int i3, String str, String str2, boolean z, boolean z2, boolean z3) {
        return this.f116619b.createAwemeListFragment(i2, i3, str, str2, z, z2, z3);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.e
    public final a createMyProfileFragment() {
        return this.f116619b.createMyProfileFragment();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.e
    public final void enterMyFavorites(Activity activity, Bundle bundle) {
        l.d(activity, "");
        l.d(bundle, "");
        this.f116619b.enterMyFavorites(activity, bundle);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.e
    public final f getBulletABHelper() {
        return this.f116619b.getBulletABHelper();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.e
    public final boolean needShowSafeInfoNotice() {
        return this.f116619b.needShowSafeInfoNotice();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.e
    public final void onFeedStop() {
        this.f116619b.onFeedStop();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.e
    public final boolean shouldShowI18nRecommendUserDialogOnMyPrifile() {
        return this.f116619b.shouldShowI18nRecommendUserDialogOnMyPrifile();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.e
    public final void startThirdSocialActivity(Context context, User user, int i2) {
        l.d(context, "");
        l.d(user, "");
        this.f116619b.startThirdSocialActivity(context, user, i2);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.e
    public final void switchToBioUrl(Activity activity, String str) {
        this.f116619b.switchToBioUrl(activity, str);
    }

    static {
        Covode.recordClassIndex(75343);
    }

    private b() {
    }
}
