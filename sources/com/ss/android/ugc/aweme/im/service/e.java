package com.ss.android.ugc.aweme.im.service;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.al;
import com.ss.android.ugc.aweme.im.service.a.c;
import com.ss.android.ugc.aweme.im.service.model.i;
import h.f.a.a;
import java.util.Map;

public interface e {
    static {
        Covode.recordClassIndex(66529);
    }

    boolean canShowInnerNotification();

    boolean enableIM();

    boolean enableSendPic();

    void enterDetailActivity(Context context, String str, String str2, String str3, int i2, int i3, String str4, View view, Bundle bundle);

    void feedbackIm(String str, String str2);

    ViewGroup getCurrentDecorView(Activity activity);

    String getEnterFrom();

    d getFamiliarProxy();

    i getIMSetting();

    String getLastWsConnectUrl();

    IIMunder16Proxy getUnder16Proxy();

    boolean isEnableShowTeenageTip();

    boolean isNeedToContinuePlayInAct();

    void monitorMsgSendStatus(Map<String, String> map);

    void openNotificationSetting(Context context, String str);

    void openUrl(Context context, String str, boolean z);

    void popCaptcha(Activity activity, int i2, c cVar);

    void putSecUidToMap(String str, String str2);

    void registerAppStateCallback(al alVar);

    void registerWsListener(com.bytedance.common.wschannel.app.e eVar);

    void sendShareOverEvent(String str, int i2);

    void setIMAwemeProvider(b bVar);

    void setNeedToContinueToPlay(boolean z);

    void setSharePlayer(Object... objArr);

    Dialog showShareCompleteTipsDialog(Activity activity, String str, a aVar, a aVar2);

    void updateApk(Context context);
}
