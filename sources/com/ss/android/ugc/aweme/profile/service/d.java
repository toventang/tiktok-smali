package com.ss.android.ugc.aweme.profile.service;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.utils.bo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.landpage.b;
import com.ss.android.ugc.aweme.profile.ui.d.a;
import org.json.JSONObject;

public interface d {
    static {
        Covode.recordClassIndex(75345);
    }

    void closeProfilePopUpWebPage(Activity activity);

    a createFakeUserProfileFragment();

    a createNewFakeUserProfileFragment();

    void feedLiveProfileAvatarOpen(Context context, Aweme aweme, int i2);

    com.ss.android.ugc.aweme.landpage.a getAdFlutterLandPageUtil();

    b getAdLynxLandPageUtil();

    JSONObject getExtJson(Context context, Aweme aweme, String str);

    void logFeedRawAdOpenUrlH5(Context context, Aweme aweme);

    void logFeedRawLynxAdOpenUrlH5(Context context, Aweme aweme);

    void onProfileWebPageHide(Context context, Aweme aweme, String str);

    void onProfileWebPageShow(Context context, Aweme aweme, String str);

    boolean openProfilePopUpWebPage(Context context, AwemeRawAd awemeRawAd, String str);

    boolean openProfilePopUpWebPageInSixTwoMode(Context context, Aweme aweme, String str);

    boolean openProfilePopUpWebPageInTwoExpandMode(Context context, Aweme aweme, String str);

    boolean openProfilePopUpWebPageInTwoMode(Context context, Aweme aweme, String str);

    boolean openProfilePopUpWebPageInTwoMode(Context context, Aweme aweme, String str, boolean z);

    boolean openTopViewLive(Context context, Aweme aweme, int i2, bo boVar);

    boolean shouldShowAdBrowser(Aweme aweme);

    boolean shouldShowBioEmail();

    boolean shouldShowBioUrl();

    boolean shouldShowFakeUserProfile(Aweme aweme);
}
