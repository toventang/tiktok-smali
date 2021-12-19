package com.ss.android.ugc.aweme.im.service;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.g.c;
import com.ss.android.ugc.aweme.im.service.j.a;
import com.ss.android.ugc.aweme.im.service.j.d;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.h;
import com.ss.android.ugc.aweme.im.service.model.j;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.websocket.a.c.b;
import java.util.List;

public interface IIMService {
    static {
        Covode.recordClassIndex(66491);
    }

    void cacheRecentShareContact(IMContact iMContact);

    void clearIMNotification();

    Dialog commentReply(Context context, h hVar);

    String convertSearchKeyword(String str, String str2, String str3, String str4);

    void ensureIMState();

    void enterChooseContact(Context context, Bundle bundle);

    void enterCreateChatPage(Context context, Bundle bundle);

    List<IMUser> getAllFollowIMUsers();

    List<IMUser> getAllFriends();

    String getConversationId(String str);

    View getDmEntranceView(Context context, String str);

    c getDurationPerfMon();

    String getEntranceButtonText(Context context, String str);

    a getFamiliarService();

    int getFriendsCount();

    String getIMContactConversationId(IMContact iMContact);

    String getIMContactUserId(IMContact iMContact);

    c getIMErrorMonitor();

    b getImParser();

    com.ss.android.ugc.aweme.im.service.e.a getInboxAdapterService();

    com.ss.android.ugc.aweme.im.service.d.a getMessagingGeckoUtils();

    List<IMUser> getRecentIMUsers();

    com.ss.android.ugc.aweme.im.service.j.b getRelationService();

    Intent getSessionListActivityIntent(Context context);

    com.ss.android.ugc.aweme.im.service.j.c getShareService();

    d getSystemEmojiService();

    void handleGroupInvite(Activity activity, String str);

    void initialize(Application application, a aVar, e eVar);

    boolean isIMAvailable();

    boolean isMtInnerPushEnabled();

    boolean isNeedToContinuePlayInAct();

    boolean isNotificationMessageQueueEmpty();

    void onBlockUserSuccessEvent();

    void onNewNoticeArrived(int i2, Bundle bundle);

    void openBaMessageSettingActivity(Context context, String str);

    void openSessionListActivity(Context context);

    void openSessionListActivity(Context context, Bundle bundle);

    void processMessagingDeepLink(Fragment fragment);

    void refreshLoginState();

    void registerLifeCycle(Application application);

    void resetLoginState();

    void saveChatUserSetting(int i2, int i3, int i4);

    List<IMUser> searchFollowIMUser(List<? extends IMUser> list, String str);

    void setHighlightText(TextView textView, String str, String str2);

    void setInnerPushSwitch(String str, int i2, boolean z);

    void setKeyMtInnerPushSwitchOn(boolean z);

    void setNeedToContinuePlayInAct(boolean z);

    void shareSingleMsg(Context context, IMContact iMContact, SharePackage sharePackage, com.ss.android.ugc.aweme.base.c<Boolean> cVar);

    void showDmInputViewDialogFragment(i iVar, String str, Aweme aweme, String str2, com.ss.android.ugc.aweme.im.service.l.a aVar);

    void showGroupChatGuideBubble(Context context, View view);

    void showIMNotification(boolean z);

    void showIMSnackbar(Context context, View view, j jVar);

    void showReplyFragment(View view, i iVar, Bundle bundle, String str);

    boolean startChat(com.ss.android.ugc.aweme.im.service.model.a aVar);

    void startSelectChatMsg(Context context, String str, IMUser iMUser, int i2, String str2);

    void storeFollowStatus(FollowStatus followStatus);

    void switchLocale();

    void tryShowingChatPrivacyPanel(String str, i iVar, com.ss.android.ugc.aweme.im.service.h.a aVar);

    void updateChatUserSetting(int i2);

    void updateIMUser(IMUser iMUser);

    void updateIMUserFollowStatus(IMUser iMUser);
}
