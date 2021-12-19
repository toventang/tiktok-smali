package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.aw;
import com.ss.android.ugc.aweme.feed.model.AnchorLynxModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.lego.q;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.f.a.b;
import h.z;
import java.util.List;
import java.util.Map;

public interface IMainService {

    public interface DownLoadFinishListener {
        static {
            Covode.recordClassIndex(79470);
        }

        void doAfterDownLoad(int i2, Boolean bool);
    }

    static {
        Covode.recordClassIndex(79469);
    }

    c avMusicApply(MusicModel musicModel);

    boolean checkIsMinAppVersionNotSatisfied(Activity activity, String str, String str2);

    void downloadStickerHelper(String str, String str2, Activity activity, boolean z, DownLoadFinishListener downLoadFinishListener);

    w getAmeActivityResumeRunTask(Activity activity);

    r getAnchorListRequest();

    String getApiUrlPrefix();

    Class<? extends Activity> getAppLinkHandlerActivityClass(boolean z);

    int getAppVersionCode();

    Intent getAwemeWebIntent(Context context, Uri uri, Boolean bool, Boolean bool2);

    w getCookieMonitorTask();

    Class<? extends Activity> getDeepLinkHandlerActivityClass(boolean z);

    List<aw> getDeeplinkCommands();

    Long getFeedCount(Integer num);

    String getFeedOrder(Aweme aweme, Integer num);

    w getFetchImUnder16RequestTask();

    Class[] getFixFragmentManagerWhiteList();

    Fragment getFollowFragmentCache();

    int getLauncherIconRes();

    w getLegoRequestTask();

    Class<? extends Activity> getMainActivityClass();

    Intent getMainActivityIntent(Context context);

    q getMainInflate();

    w getPreloadInstanceTask();

    Fragment getRecommendFragmentCache();

    w getRegisterStorageTask();

    String getSecurityUrl(String str);

    Map<String, Object> getSettings(List<String> list);

    w getShareCacheRegisterTask();

    Class<? extends Activity> getSplashActivityClass();

    Intent handleAmeWebViewBrowserForDeeplink(Context context, Uri uri, Boolean bool, Boolean bool2);

    boolean handleLiveSchema(String str);

    void initLegoInflate();

    Context interceptActivityAttachBaseContext(Context context);

    boolean isAppHot();

    boolean isAwemeAppDataEmpty();

    boolean isContainsKeyWithLruEntries();

    boolean isDeepLinkHandlerActivity(Context context);

    boolean isLimitAdTrackingEnabled();

    boolean isMainPage(Context context);

    boolean isOnFollowPage(Activity activity);

    boolean isReplaceAwemeCache();

    boolean isUseJediAwemelistFragment();

    Fragment obtainFriendTabFragment();

    Fragment obtainMainPageFragment();

    boolean openAdOpenUrl(Context context, String str, boolean z);

    boolean openAdTestUrl(Context context, String str, int i2);

    boolean openAdWebUrl(Context context, String str, String str2);

    void openDeepLinkActivity(Context context, String str);

    boolean openSystemBrowser(Context context, String str);

    void pendingDeepLinkLog(b<Boolean, z> bVar);

    void restartApp(Bundle bundle);

    boolean shouldChangeToHandle(String str);

    boolean shouldShowCommerceTagOnFeed(Aweme aweme, Integer num);

    void showAdPopUpWebPageWidget(Context context, AwemeRawAd awemeRawAd, Integer num, Integer num2, String str, String str2, Boolean bool, String str3, Aweme aweme, AnchorLynxModel anchorLynxModel);

    boolean startAdsAppActivity(Context context, String str, String str2);

    void startBulletActivity(Context context, String str, String str2, Bundle bundle);

    void startVideoPlayActivity(Context context, String str, String str2, boolean z, String str3, String str4, String str5, String str6, float f2);

    void trackAppsFlyerEvent(String str, String str2);

    boolean tryShowIllegalUsernameDialog(String str, Runnable runnable, Runnable runnable2);

    void updateIMUserFollowStatus(User user);
}
