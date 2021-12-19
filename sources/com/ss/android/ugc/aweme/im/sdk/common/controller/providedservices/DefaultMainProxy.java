package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.al;
import com.ss.android.ugc.aweme.friends.model.RecommendContact;
import com.ss.android.ugc.aweme.im.service.IIMunder16Proxy;
import com.ss.android.ugc.aweme.im.service.a.a;
import com.ss.android.ugc.aweme.im.service.a.b;
import com.ss.android.ugc.aweme.im.service.a.c;
import com.ss.android.ugc.aweme.im.service.d;
import com.ss.android.ugc.aweme.im.service.e;
import com.ss.android.ugc.aweme.im.service.model.i;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.a.m;
import h.z;
import java.util.HashMap;
import java.util.Map;

public class DefaultMainProxy implements e {
    static {
        Covode.recordClassIndex(65493);
    }

    public void bindRecommendContactItemView(RecyclerView.ViewHolder viewHolder, RecommendContact recommendContact, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public boolean canShowInnerNotification() {
        return false;
    }

    public boolean checkIMInsertRecommendContact() {
        return false;
    }

    public void checkPluginAndLoadLibrary(Context context, boolean z, String str, a aVar) {
    }

    public boolean checkShowPushNotificationGuide(Context context) {
        return false;
    }

    public void connectWS() {
    }

    public RecyclerView.ViewHolder createRecommendContactItemView(ViewGroup viewGroup, m<RecommendContact, Integer, z> mVar) {
        return null;
    }

    public RecyclerView.ViewHolder createRecommendViewHolder(Context context, HashMap<String, Boolean> hashMap, Object obj, b<User> bVar) {
        return null;
    }

    public void downloadPdf(Context context, String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public boolean enableIM() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public boolean enableSendPic() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public void enterDetailActivity(Context context, String str, String str2, String str3, int i2, int i3, String str4, View view, Bundle bundle) {
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public void feedbackIm(String str, String str2) {
    }

    public int getAssociativeEmoji() {
        return 0;
    }

    public Activity getCurrentActivity() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public ViewGroup getCurrentDecorView(Activity activity) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public String getEnterFrom() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public d getFamiliarProxy() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public String getLastWsConnectUrl() {
        return "";
    }

    public int getRecommendContactPosition() {
        return -1;
    }

    public String getToReportId() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public IIMunder16Proxy getUnder16Proxy() {
        return null;
    }

    public boolean is2Entrance() {
        return false;
    }

    public boolean isCheckPlugin() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public boolean isEnableShowTeenageTip() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public boolean isNeedToContinuePlayInAct() {
        return false;
    }

    public void logIMShareHeadShow() {
    }

    public void logIMShareHeadShow(Map<String, String> map) {
    }

    public void makePhoneCall(Activity activity, String str, String str2, String str3, String str4) {
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public void monitorMsgSendStatus(Map<String, String> map) {
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public void openNotificationSetting(Context context, String str) {
    }

    public void openPrivacyReminder(Context context) {
    }

    public void openUrl(Context context, Uri uri, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public void openUrl(Context context, String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public void popCaptcha(Activity activity, int i2, c cVar) {
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public void putSecUidToMap(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public void registerAppStateCallback(al alVar) {
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public void registerWsListener(com.bytedance.common.wschannel.app.e eVar) {
    }

    public void saveLogPb(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public void sendShareOverEvent(String str, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public void setIMAwemeProvider(com.ss.android.ugc.aweme.im.service.b bVar) {
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public void setNeedToContinueToPlay(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public void setSharePlayer(Object... objArr) {
    }

    public void showPushNotification(String str) {
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public Dialog showShareCompleteTipsDialog(Activity activity, String str, h.f.a.a aVar, h.f.a.a aVar2) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public void updateApk(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.im.service.e
    public i getIMSetting() {
        return i.a();
    }
}
