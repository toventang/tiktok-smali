package com.ss.android.ugc.aweme.services;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;

public interface IAccountHelperService {
    static {
        Covode.recordClassIndex(79456);
    }

    void AppsFlyerUtilsTrackLoginSuccess(String str);

    void appendCommonParams(StringBuilder sb);

    void friendUploadToken(String str, String str2, String str3);

    UrlModel getLoginViewBanner();

    String getLoginViewTitleForMoneyGrowth();

    String getUserApi();

    void loadWebViewUrl(String str, WebView webView);

    void recommendAppUponAuth(Context context, String str);

    String selfUserApi();

    String userPermissionApi();
}
