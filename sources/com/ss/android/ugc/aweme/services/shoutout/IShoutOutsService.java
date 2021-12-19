package com.ss.android.ugc.aweme.services.shoutout;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shoutouts.d;
import com.ss.android.ugc.aweme.shoutouts.i;

public interface IShoutOutsService {
    static {
        Covode.recordClassIndex(79795);
    }

    int getAuthorCount();

    boolean getInFollowingTab();

    boolean getInMainTab();

    i getShoutOutSettingsModel();

    boolean getUseShoutoutAuthor();

    boolean isShoutoutPostDialog(Object obj);

    void publishShoutOuts(e eVar, Object obj);

    void setAuthorCount(int i2);

    void setInFollowingTab(boolean z);

    void setInMainTab(boolean z);

    void setUseShoutoutAuthor(boolean z);

    void startDownLoadVideo(e eVar, String str, ShoutoutVideoDownloadListener shoutoutVideoDownloadListener);

    void startShoutoutsPublishActivity(Activity activity, Intent intent);

    void startShoutoutsPublishActivityFromDL(Activity activity, Uri uri);

    void startShoutoutsPublishActivityFromNative(Activity activity, d dVar);

    void startShoutoutsPublishSyncActivity(Activity activity, String str, String str2, String str3);
}
