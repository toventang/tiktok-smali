package com.ss.android.ugc.aweme.profile.service;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.f.a;
import com.ss.android.ugc.aweme.profile.experiment.f;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.aq;

public interface e {
    static {
        Covode.recordClassIndex(75346);
    }

    void checkToTransformMusDraft();

    aq createAwemeListFragment(int i2, int i3, String str, String str2, boolean z, boolean z2, boolean z3);

    a createMyProfileFragment();

    void enterMyFavorites(Activity activity, Bundle bundle);

    f getBulletABHelper();

    boolean needShowSafeInfoNotice();

    void onFeedStop();

    boolean shouldShowI18nRecommendUserDialogOnMyPrifile();

    void startThirdSocialActivity(Context context, User user, int i2);

    void switchToBioUrl(Activity activity, String str);
}
