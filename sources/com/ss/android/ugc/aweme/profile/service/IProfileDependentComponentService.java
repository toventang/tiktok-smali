package com.ss.android.ugc.aweme.profile.service;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.o.d;
import com.ss.android.e.c;
import com.ss.android.http.a.b.e;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.n.o;
import com.ss.android.ugc.aweme.profile.d.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.r;
import f.a.ab;
import f.a.t;
import h.f.a.b;
import h.f.a.s;
import h.z;

public interface IProfileDependentComponentService {
    static {
        Covode.recordClassIndex(75341);
    }

    d adUtilsService();

    <T> T apiExecuteGetJSONObject(int i2, String str, Class<T> cls, String str2, e eVar, boolean z, String str3);

    <T> T apiExecuteGetJSONObject(String str, Class<T> cls, String str2, boolean z, String str3);

    e bridgeService();

    RecyclerView buildBaseRecyclerView(RecyclerView recyclerView, o oVar);

    boolean canIM();

    g favoritesMobUtilsService();

    b<Boolean, z> getNotificationManagerHandleSystemCamera();

    s<Activity, Fragment, Integer, String, String, z> getStartCameraActivity();

    void gotoCropActivity(Activity activity, String str, boolean z, float f2, int i2, int i3, int i4, int i5, int i6);

    void gotoCropActivity(Fragment fragment, String str, boolean z, float f2, int i2, int i3, int i4, int i5, int i6);

    String hexDigest(String str);

    boolean isDetailActivity(Activity activity);

    boolean isEnableSettingDiskManager();

    boolean isUserProfileActivity(Activity activity);

    void logShowProfileDiskManagerGuideView();

    a mainAnimViewModel(androidx.fragment.app.e eVar);

    t<Boolean> needShowDiskManagerGuideView();

    d newLiveBlurProcessor(int i2, float f2, c.a aVar);

    com.ss.android.ugc.aweme.live.e.c newLivePlayHelper(Runnable runnable, com.ss.android.ugc.aweme.live.e.b bVar);

    boolean onAntiCrawlerEvent(String str);

    ab<BaseResponse> setPrivateSettingItem(String str, int i2);

    boolean shouldDoCaptcha(Exception exc);

    boolean shouldUseRecyclerPartialUpdate();

    void showCaptchaDialog(i iVar, com.ss.android.ugc.aweme.base.api.a.b.a aVar, com.ss.android.ugc.aweme.captcha.a aVar2);

    void startDiskManagerActivity(Context context);

    void startDownloadControlSettingActivity(Activity activity, int i2);

    void startHeaderDetailActivity(Activity activity, Bundle bundle);

    void startHeaderDetailActivity(Activity activity, View view, User user, boolean z);

    void startHeaderDetailActivity(Activity activity, View view, User user, boolean z, boolean z2);

    void startHeaderDetailActivity(Activity activity, View view, String str, User user);

    void watchFromProfile(Context context, User user, boolean z, r rVar);

    void watchLiveMob(Context context, User user, String str, String str2);
}
