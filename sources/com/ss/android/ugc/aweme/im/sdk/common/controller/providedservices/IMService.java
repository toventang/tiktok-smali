package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.h;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.di.ImEntranceService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.g;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.a.b.a.a;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity;
import com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.SessionListNavArg;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.b;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.f;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.l;
import com.ss.android.ugc.aweme.im.sdk.common.controller.k.d;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.aa;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.m;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b;
import com.ss.android.ugc.aweme.im.sdk.notification.a.c;
import com.ss.android.ugc.aweme.im.sdk.relations.ui.activity.RelationSelectActivity;
import com.ss.android.ugc.aweme.im.sdk.u16.data.ImUnder16Manger;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.m.a;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.NoticePushMessage;
import com.ss.android.ugc.aweme.im.service.model.a;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.g;
import h.f.b.l;
import h.f.b.z;
import h.m.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;
import org.greenrobot.eventbus.EventBus;

public final class IMService implements IIMService {
    public static final Companion Companion = new Companion(null);
    public static IIMService inst;

    static {
        Covode.recordClassIndex(65496);
    }

    public static final IIMService get() {
        return Companion.get();
    }

    public static final IIMService inst() {
        return Companion.inst();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void cacheRecentShareContact(IMContact iMContact) {
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final boolean isIMAvailable() {
        return true;
    }

    public final void showNoticePush(NoticePushMessage noticePushMessage) {
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(65497);
        }

        private Companion() {
        }

        public final IIMService get() {
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            l.b(createIIMServicebyMonsterPlugin, "");
            return createIIMServicebyMonsterPlugin;
        }

        public final IIMService inst() {
            if (IMService.inst == null) {
                IMService.inst = get();
                a.a("follow_status", "IMService.inst: IMService not initialized");
            }
            return IMService.inst;
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void clearIMNotification() {
        c.b();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final com.ss.android.ugc.aweme.im.service.g.c getDurationPerfMon() {
        return com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.a.f102292a;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final com.ss.android.ugc.aweme.im.service.c getIMErrorMonitor() {
        return m.f102425a;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void refreshLoginState() {
        b.e();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void ensureIMState() {
        com.bytedance.ies.im.core.api.b.a().b();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final com.ss.android.ugc.aweme.im.service.j.a getFamiliarService() {
        return IMServiceProvider.INSTANCE.getFamiliarService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final com.ss.android.websocket.a.c.b getImParser() {
        return new d();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final com.ss.android.ugc.aweme.im.service.e.a getInboxAdapterService() {
        return IMServiceProvider.INSTANCE.getInboxAdapterService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final com.ss.android.ugc.aweme.im.service.d.a getMessagingGeckoUtils() {
        return new com.ss.android.ugc.aweme.im.sdk.common.controller.f.a();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final com.ss.android.ugc.aweme.im.service.j.b getRelationService() {
        return IMServiceProvider.INSTANCE.getRelationService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final com.ss.android.ugc.aweme.im.service.j.c getShareService() {
        return IMServiceProvider.INSTANCE.getShareService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final com.ss.android.ugc.aweme.im.service.j.d getSystemEmojiService() {
        return IMServiceProvider.INSTANCE.getSystemSmallEmojiService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final boolean isNotificationMessageQueueEmpty() {
        return c.c();
    }

    public final void prePostUnread() {
        l.a.a().f();
    }

    public IMService() {
        ImEntranceService.a().init(this);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final int getFriendsCount() {
        h.f.b.l.b(com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a(), "");
        return com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.k();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final boolean isMtInnerPushEnabled() {
        n a2 = n.a();
        h.f.b.l.b(a2, "");
        return a2.k();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final boolean isNeedToContinuePlayInAct() {
        return b.b().isNeedToContinuePlayInAct();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void onBlockUserSuccessEvent() {
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.im.service.b.a());
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void resetLoginState() {
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a()) {
            com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.c();
        }
        b.e();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final List<IMUser> getAllFollowIMUsers() {
        h.f.b.l.b(f.a(), "");
        com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a();
        List<IMUser> c2 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.c(com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.f());
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final List<IMUser> getAllFriends() {
        h.f.b.l.b(f.a(), "");
        com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a();
        List<IMUser> c2 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.c(com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.c());
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void switchLocale() {
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.e.l.f102264i != null && com.ss.android.ugc.aweme.im.sdk.common.controller.e.l.f102265j) {
            com.ss.android.ugc.aweme.im.sdk.common.controller.e.l lVar = com.ss.android.ugc.aweme.im.sdk.common.controller.e.l.f102264i;
            if (lVar != null) {
                lVar.f102270d = true;
            }
            a.c("SessionListManager", "switchLocal set mSortIMAtNext true");
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final List<IMUser> getRecentIMUsers() {
        h.f.b.l.b(f.a(), "");
        ArrayList arrayList = new ArrayList();
        List<h> arrayList2 = new ArrayList(a.C0745a.a().a());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            ai lastMessage = hVar.getLastMessage();
            long c2 = b.a.c(hVar.getConversationId());
            if (hVar.getConversationType() != e.a.f37581a || lastMessage == null || lastMessage.getMsgType() == 15 || c2 <= 0) {
                it.remove();
            }
        }
        if (arrayList2.size() > 10) {
            arrayList2 = arrayList2.subList(0, 10);
        }
        for (h hVar2 : arrayList2) {
            IMUser c3 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.c.c(hVar2);
            if (c3 != null) {
                c3.setType(1);
                arrayList.add(c3);
            }
        }
        h.f.b.l.b(arrayList, "");
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void setNeedToContinuePlayInAct(boolean z) {
        com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().setNeedToContinueToPlay(z);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final String getIMContactConversationId(IMContact iMContact) {
        h.f.b.l.d(iMContact, "");
        return com.ss.android.ugc.aweme.im.sdk.common.controller.e.e.a(iMContact);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void registerLifeCycle(Application application) {
        h.f.b.l.d(application, "");
        application.registerActivityLifecycleCallbacks(com.ss.android.ugc.aweme.im.sdk.common.controller.e.a.f102225a);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void showIMNotification(boolean z) {
        if (!z) {
            com.ss.android.ugc.aweme.im.sdk.notification.a.e.f102841b.a(0L);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final boolean startChat(com.ss.android.ugc.aweme.im.service.model.a aVar) {
        h.f.b.l.d(aVar, "");
        ChatRoomActivity.a.a(aVar);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void updateIMUserFollowStatus(IMUser iMUser) {
        bz unused = i.a(bs.f159054a, bf.f159041b, null, new IMService$updateIMUserFollowStatus$1(this, iMUser, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void setKeyMtInnerPushSwitchOn(boolean z) {
        n a2 = n.a();
        h.f.b.l.b(a2, "");
        a2.f102428a.edit().putBoolean("key_mt_inner_push_switch_on", z).apply();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void updateChatUserSetting(int i2) {
        com.ss.android.ugc.aweme.im.sdk.privacy.data.a.a aVar;
        n a2 = n.a();
        h.f.b.l.b(a2, "");
        com.ss.android.ugc.aweme.im.sdk.privacy.data.a.a l2 = a2.l();
        if (l2 != null) {
            aVar = com.ss.android.ugc.aweme.im.sdk.privacy.data.a.a.copy$default(l2, i2, 0, 0, 4, null);
        } else {
            aVar = null;
        }
        a2.a(aVar);
    }

    public final void updateContactName(IMUser iMUser) {
        IMUser a2;
        if (iMUser != null && (a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.a(iMUser.getUid(), iMUser.getSecUid())) != null) {
            iMUser.setContactName(a2.getContactName());
        }
    }

    public static IIMService createIIMServicebyMonsterPlugin(boolean z) {
        MethodCollector.i(6937);
        Object a2 = com.ss.android.ugc.b.a(IIMService.class, z);
        if (a2 != null) {
            IIMService iIMService = (IIMService) a2;
            MethodCollector.o(6937);
            return iIMService;
        }
        if (com.ss.android.ugc.b.by == null) {
            synchronized (IIMService.class) {
                try {
                    if (com.ss.android.ugc.b.by == null) {
                        com.ss.android.ugc.b.by = new IMService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6937);
                    throw th;
                }
            }
        }
        IMService iMService = (IMService) com.ss.android.ugc.b.by;
        MethodCollector.o(6937);
        return iMService;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final String getConversationId(String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.f();
        Long valueOf = Long.valueOf(str);
        h.f.b.l.b(valueOf, "");
        String a2 = b.a.a(valueOf.longValue());
        if (a2 == null) {
            return "";
        }
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final String getIMContactUserId(IMContact iMContact) {
        h.f.b.l.d(iMContact, "");
        h.f.b.l.d(iMContact, "");
        if (iMContact instanceof IMUser) {
            return ((IMUser) iMContact).getUid();
        }
        if (!(iMContact instanceof IMConversation)) {
            return null;
        }
        IMConversation iMConversation = (IMConversation) iMContact;
        if (iMConversation.getConversationType() == e.a.f37581a) {
            return String.valueOf(b.a.c(iMConversation.getConversationId()));
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final Intent getSessionListActivityIntent(Context context) {
        h.f.b.l.d(context, "");
        if (!com.ss.android.ugc.aweme.inbox.b.b.b()) {
            return com.bytedance.ies.powerpage.d.f34436a.a(context, SessionListFragment.class, null);
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.ss.android.ugc.aweme.splash.SplashActivity");
        intent.setFlags(67108864);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
        return intent;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void openSessionListActivity(Context context) {
        h.f.b.l.d(context, "");
        if (com.ss.android.ugc.aweme.inbox.b.b.b()) {
            SmartRouter.buildRoute(context, "//chat/center").open();
        } else {
            com.bytedance.ies.powerpage.d.a(com.bytedance.ies.powerpage.d.f34436a, context, SessionListFragment.class, null, 0, 28);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void updateIMUser(IMUser iMUser) {
        if (iMUser == null) {
            com.ss.android.ugc.aweme.im.service.m.a.a("follow_status", "IMService.updateSimpleUser user = null");
            return;
        }
        if (iMUser.isBlock()) {
            iMUser.setFollowStatus(0);
        }
        bz unused = i.a(bs.f159054a, bf.f159041b, null, new IMService$updateIMUser$1(this, iMUser, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void storeFollowStatus(FollowStatus followStatus) {
        h.f.b.l.d(followStatus, "");
        Keva a2 = com.ss.android.ugc.aweme.im.sdk.chat.feature.a.c.a.a.a();
        long currentTimeMillis = System.currentTimeMillis();
        h.f.b.l.d(followStatus, "");
        h.f.b.l.d(a2, "");
        if (followStatus.followStatus == 1 || followStatus.followStatus == 4) {
            String str = followStatus.userId;
            h.f.b.l.b(str, "");
            if (!a2.contains("key_single_follow_status".concat(String.valueOf(str)))) {
                a2.storeBoolean("key_single_follow_status".concat(String.valueOf(str)), true);
            }
        } else if (followStatus.followStatus == 2) {
            String str2 = followStatus.userId;
            h.f.b.l.b(str2, "");
            com.ss.android.ugc.aweme.im.sdk.chat.feature.a.c.a.a.a(str2, a2, currentTimeMillis);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void processMessagingDeepLink(Fragment fragment) {
        SessionListNavArg sessionListNavArg;
        int i2;
        int i3;
        h.f.b.l.d(fragment, "");
        h.f.b.l.d(fragment, "");
        Bundle arguments = fragment.getArguments();
        String str = null;
        if (arguments == null) {
            sessionListNavArg = null;
        } else {
            h.f.b.l.b(arguments, "");
            String string = arguments.getString("enter_from");
            String string2 = arguments.getString("enter_method");
            Integer valueOf = Integer.valueOf(arguments.getInt("message_cnt"));
            String string3 = arguments.getString("notice_type");
            String string4 = arguments.getString("im_group_invite_id");
            String string5 = arguments.getString("conversation_id");
            String string6 = arguments.getString("is_member_request", "0");
            h.f.b.l.b(string6, "");
            Integer e2 = p.e(string6);
            int i4 = 0;
            if (e2 != null) {
                i2 = e2.intValue();
            } else {
                i2 = 0;
            }
            Integer valueOf2 = Integer.valueOf(i2);
            String string7 = arguments.getString("chat_type", "0");
            h.f.b.l.b(string7, "");
            Integer e3 = p.e(string7);
            if (e3 != null) {
                i3 = e3.intValue();
            } else {
                i3 = 0;
            }
            Integer valueOf3 = Integer.valueOf(i3);
            String string8 = arguments.getString("message_preview_enabled", "0");
            h.f.b.l.b(string8, "");
            Integer e4 = p.e(string8);
            if (e4 != null) {
                i4 = e4.intValue();
            }
            sessionListNavArg = new SessionListNavArg(string, string2, valueOf, string3, string4, string5, valueOf2, valueOf3, Integer.valueOf(i4));
        }
        com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.e eVar = new com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.e();
        androidx.fragment.app.e requireActivity = fragment.requireActivity();
        h.f.b.l.b(requireActivity, "");
        eVar.a(requireActivity, sessionListNavArg);
        androidx.fragment.app.e requireActivity2 = fragment.requireActivity();
        h.f.b.l.b(requireActivity2, "");
        com.ss.android.ugc.aweme.im.sdk.group.a.b bVar = new com.ss.android.ugc.aweme.im.sdk.group.a.b(requireActivity2);
        if (sessionListNavArg != null) {
            str = sessionListNavArg.getJumpedFromInviteId();
        }
        bVar.a(str);
    }

    public final IMUser getIMUserFromUid(String str, String str2) {
        return com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.a(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final View getDmEntranceView(Context context, String str) {
        h.f.b.l.d(str, "");
        if (context == null) {
            return null;
        }
        return com.ss.android.ugc.aweme.im.sdk.common.ui.a.b.a(context, str);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final List<IMUser> searchFollowIMUser(List<? extends IMUser> list, String str) {
        List<IMUser> a2 = f.a().a(list, str, false);
        h.f.b.l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final Dialog commentReply(Context context, com.ss.android.ugc.aweme.im.service.model.h hVar) {
        a.b bVar = new a.b(context);
        bVar.f100973b = hVar;
        bVar.f100975d = new com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.a.b.b.a(hVar, context);
        bVar.f100974c = com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.a.b.b.b.f100978a;
        com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.a.b.a.a aVar = new com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.a.b.a.a(bVar, (byte) 0);
        aVar.show();
        return aVar;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void onNewNoticeArrived(int i2, Bundle bundle) {
        h.f.b.l.d(bundle, "");
        if (i2 == 1) {
            aa.a();
        } else if (i2 == 3) {
            aa.a();
        } else if (i2 == 4) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.im.sdk.common.data.model.a());
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void openBaMessageSettingActivity(Context context, String str) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(str, "");
        SmartRouter.buildRoute(context, "//setting/ba/message_setting").withParam("enter_from", str).open();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void enterChooseContact(Context context, Bundle bundle) {
        h.f.b.l.d(context, "");
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        h.f.b.l.b(createIUserServicebyMonsterPlugin, "");
        if (!createIUserServicebyMonsterPlugin.isLogin()) {
            com.ss.android.ugc.aweme.login.c.a((Activity) context, "chat_list", "button");
        } else {
            RelationSelectActivity.a.a(context, bundle);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void enterCreateChatPage(Context context, Bundle bundle) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(bundle, "");
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.utils.i.a()) {
            bundle.putSerializable("member_select_config", new b.d(null, null, null, null, 15, null));
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a("notification_page");
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a();
        }
        enterChooseContact(context, bundle);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void showGroupChatGuideBubble(Context context, View view) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(view, "");
        Keva repo = Keva.getRepo("im_session_group_repo");
        if (!repo.getBoolean("im_key_guide_show", false)) {
            view.post(new IMService$showGroupChatGuideBubble$1(context, view, repo));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void handleGroupInvite(Activity activity, String str) {
        h.f.b.l.d(activity, "");
        h.f.b.l.d(str, "");
        com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.g gVar = new com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.g(activity, str);
        if (!com.ss.android.ugc.aweme.im.service.c.b.a() || in.d()) {
            gVar.a();
            return;
        }
        String obj = com.ss.android.ugc.aweme.emoji.utils.a.b().toString();
        g.a aVar = new g.a(gVar, obj);
        h.f.b.l.d(obj, "");
        h.f.b.l.d(aVar, "");
        if (ImUnder16Manger.f103780h.get(obj) == null) {
            ImUnder16Manger.f103780h.put(obj, new CopyOnWriteArrayList<>());
        }
        CopyOnWriteArrayList<com.ss.android.ugc.aweme.im.service.g> copyOnWriteArrayList = ImUnder16Manger.f103780h.get(obj);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(aVar);
        }
        if (h.f.b.l.a((Object) com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b(), (Object) obj) && ImUnder16Manger.f103774b) {
            aVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void openSessionListActivity(Context context, Bundle bundle) {
        h.f.b.l.d(context, "");
        if (com.ss.android.ugc.aweme.inbox.b.b.b()) {
            SmartRouter.buildRoute(context, "//chat/center").withParam(bundle).open();
        } else {
            com.bytedance.ies.powerpage.d.a(com.bytedance.ies.powerpage.d.f34436a, context, SessionListFragment.class, bundle, 0, 24);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final String getEntranceButtonText(Context context, String str) {
        h.f.b.l.d(context, "");
        Keva a2 = com.ss.android.ugc.aweme.im.sdk.chat.feature.a.c.a.a.a();
        h.f.b.l.d(context, "");
        h.f.b.l.d(a2, "");
        String string = context.getResources().getString(R.string.d3z);
        h.f.b.l.b(string, "");
        if (str != null) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(a2, "");
            if (a2.contains("key_single_follow_status".concat(String.valueOf(str)))) {
                com.ss.android.ugc.aweme.im.sdk.chat.feature.a.c.a.a.a(str, a2, System.currentTimeMillis());
                a2.erase("key_single_follow_status".concat(String.valueOf(str)));
            }
            if (a2.contains("key_double_follow_time_stamp".concat(String.valueOf(str)))) {
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = a2.getLong("key_double_follow_time_stamp".concat(String.valueOf(str)), -1);
                if (j2 != -1 && currentTimeMillis - j2 < 86400000) {
                    if (com.ss.android.ugc.aweme.im.service.c.d.a() == 4 || com.ss.android.ugc.aweme.im.service.c.d.a() == 5 || com.ss.android.ugc.aweme.im.service.c.d.a() == 6) {
                        String string2 = context.getResources().getString(R.string.c_m, "👋");
                        h.f.b.l.b(string2, "");
                        return string2;
                    } else if (com.ss.android.ugc.aweme.im.service.c.d.a() != 2 && com.ss.android.ugc.aweme.im.service.c.d.a() != 3) {
                        return string;
                    } else {
                        String string3 = context.getResources().getString(R.string.c_l);
                        h.f.b.l.b(string3, "");
                        return string3;
                    }
                }
            }
        }
        String string4 = context.getResources().getString(R.string.d3z);
        h.f.b.l.b(string4, "");
        return string4;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void setHighlightText(TextView textView, String str, String str2) {
        h.f.b.l.d(textView, "");
        h.f.b.l.d(str2, "");
        com.ss.android.ugc.aweme.im.sdk.relations.b.e.a(textView, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void setInnerPushSwitch(String str, int i2, boolean z) {
        h.f.b.l.d(str, "");
        com.ss.android.ugc.aweme.im.sdk.notification.a.e.f102841b.a(str, i2, z);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void saveChatUserSetting(int i2, int i3, int i4) {
        n a2 = n.a();
        h.f.b.l.b(a2, "");
        a2.a(new com.ss.android.ugc.aweme.im.sdk.privacy.data.a.a(i2, i3, i4));
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void initialize(Application application, com.ss.android.ugc.aweme.im.service.a aVar, com.ss.android.ugc.aweme.im.service.e eVar) {
        long j2;
        h.f.b.l.d(application, "");
        h.f.b.l.d(eVar, "");
        inst = this;
        if (aVar != null) {
            String str = aVar.f103819e;
            h.f.b.l.b(str, "");
            com.ss.android.ugc.aweme.im.sdk.common.controller.d.a.f102220b = str;
            String str2 = aVar.f103816b;
            h.f.b.l.b(str2, "");
            com.ss.android.ugc.aweme.im.sdk.common.controller.d.a.f102219a = str2;
            String str3 = aVar.f103817c;
            h.f.b.l.b(str3, "");
            com.ss.android.ugc.aweme.im.sdk.common.controller.d.a.f102221c = str3;
        }
        com.ss.android.ugc.aweme.im.sdk.common.controller.e.b bVar = com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.f102232e;
        h.f.b.l.d(application, "");
        h.f.b.l.d(eVar, "");
        if (!com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.f102231d) {
            com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.f102231d = true;
            com.ss.android.ugc.aweme.im.service.m.a.c("AwemeImManager", "init");
            com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.f102230c = aVar;
            com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.f102229b = eVar;
            if (!com.ss.android.ugc.aweme.im.service.c.g.c()) {
                application.registerActivityLifecycleCallbacks(com.ss.android.ugc.aweme.im.sdk.common.controller.e.a.f102225a);
            }
            if (!EventBus.a().a(bVar)) {
                EventBus.a(EventBus.a(), bVar);
            }
            if (((Boolean) com.ss.android.ugc.aweme.im.service.c.g.f103839a.getValue()).booleanValue()) {
                j2 = 5000;
            } else if (((Boolean) com.ss.android.ugc.aweme.im.service.c.g.f103840b.getValue()).booleanValue()) {
                j2 = 8000;
            } else {
                j2 = 10;
            }
            bz unused = i.a(com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.f102228a, null, null, new b.a(j2, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void tryShowingChatPrivacyPanel(String str, androidx.fragment.app.i iVar, com.ss.android.ugc.aweme.im.service.h.a aVar) {
        n a2;
        com.ss.android.ugc.aweme.im.sdk.privacy.data.a.a l2;
        h.f.b.l.d(str, "");
        h.f.b.l.d(iVar, "");
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.a.b.a() == 0) {
            return;
        }
        if ((!h.f.b.l.a((Object) str, (Object) "notification_page") || com.ss.android.ugc.aweme.im.sdk.common.controller.a.b.a() == 2) && (l2 = (a2 = n.a()).l()) != null) {
            Integer valueOf = Integer.valueOf(l2.getChatSettingsPanel());
            if (valueOf.intValue() == 1 && 1 != 0 && valueOf != null) {
                valueOf.intValue();
                if (a2.f102428a.getLong("chat_user_setting_last_open", 0) < System.currentTimeMillis() - 86400000 && a2.m() < 3) {
                    valueOf.intValue();
                    a2.f102428a.edit().putLong("chat_user_setting_last_open", System.currentTimeMillis()).commit();
                    a2.f102428a.edit().putInt("chat_user_setting_open_count", a2.m() + 1).commit();
                    z.e eVar = new z.e();
                    eVar.element = null;
                    a.C1112a aVar2 = new a.C1112a();
                    com.ss.android.ugc.aweme.im.sdk.privacy.b.b.a aVar3 = new com.ss.android.ugc.aweme.im.sdk.privacy.b.b.a();
                    Bundle bundle = new Bundle();
                    bundle.putInt("chat_set_extra", l2.getChatSet());
                    bundle.putString("enter_from_extra", str);
                    bundle.putInt("user_type_extra", l2.getChatUserType());
                    bundle.putInt("open_count_extra", a2.m());
                    aVar3.setArguments(bundle);
                    aVar3.f102921a = new IMService$tryShowingChatPrivacyPanel$$inlined$run$lambda$1(aVar3, eVar, l2, a2, str, aVar, iVar);
                    eVar.element = (T) aVar2.a(aVar3).a(1).a(new IMService$tryShowingChatPrivacyPanel$$inlined$run$lambda$2(l2, a2, str, aVar, iVar)).f45299a;
                    eVar.element.show(iVar, "Chat Privacy Panel");
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0054 A[SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void showIMSnackbar(android.content.Context r10, android.view.View r11, com.ss.android.ugc.aweme.im.service.model.j r12) {
        /*
        // Method dump skipped, instructions count: 397
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService.showIMSnackbar(android.content.Context, android.view.View, com.ss.android.ugc.aweme.im.service.model.j):void");
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final String convertSearchKeyword(String str, String str2, String str3, String str4) {
        String a2 = com.ss.android.ugc.aweme.im.sdk.relations.b.a.a(str, str2, str3, str4);
        h.f.b.l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void shareSingleMsg(Context context, IMContact iMContact, SharePackage sharePackage, com.ss.android.ugc.aweme.base.c<Boolean> cVar) {
        h.f.b.l.d(cVar, "");
        if (sharePackage != null) {
            if (TextUtils.equals(sharePackage.f124590d, "web")) {
                com.ss.android.ugc.aweme.im.sdk.share.b.b.a.a(Collections.singletonList(iMContact), (String) null, sharePackage, (BaseContent) null, com.ss.android.ugc.aweme.im.sdk.common.controller.b.a.a(), (String) null, (com.ss.android.ugc.aweme.im.sdk.share.b.a.a) null);
            } else {
                com.ss.android.ugc.aweme.im.sdk.share.b.b.a.a(Collections.singletonList(iMContact), (String) null, sharePackage, (BaseContent) null, (String) null, (String) null, (com.ss.android.ugc.aweme.im.sdk.share.b.a.a) null);
            }
            if (cVar != null) {
                cVar.a(true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        if (r0 == null) goto L_0x0074;
     */
    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void showReplyFragment(android.view.View r7, androidx.fragment.app.i r8, android.os.Bundle r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService.showReplyFragment(android.view.View, androidx.fragment.app.i, android.os.Bundle, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void showDmInputViewDialogFragment(androidx.fragment.app.i iVar, String str, Aweme aweme, String str2, com.ss.android.ugc.aweme.im.service.l.a aVar) {
        h.f.b.l.d(iVar, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(aweme, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(iVar, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(aweme, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(aVar, "");
        com.ss.android.ugc.aweme.im.sdk.chat.feature.story.a aVar2 = new com.ss.android.ugc.aweme.im.sdk.chat.feature.story.a();
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", str);
        bundle.putSerializable("bindAweme", aweme);
        bundle.putString("bindInputText", str2);
        aVar2.setArguments(bundle);
        aVar2.f101050a = aVar;
        try {
            aVar2.show(iVar, "StoryDmDialogFragment");
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public final void startSelectChatMsg(Context context, String str, IMUser iMUser, int i2, String str2) {
        Integer num;
        int i3;
        if (i2 == 1) {
            if (TextUtils.isEmpty(str2)) {
                com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.c.a(str);
            }
            if (!TextUtils.isEmpty(str)) {
                HashMap<String, Integer> hashMap = com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.c.f101018b;
                if (hashMap != null) {
                    num = hashMap.get(str);
                } else {
                    num = null;
                }
                a.C2643a a2 = a.b.a(context, iMUser);
                if (num != null) {
                    i3 = num.intValue();
                } else {
                    i3 = 0;
                }
                a.C2643a a3 = a2.b(i3).a(str);
                a3.f103883a.setSelectMsgType(i2);
                a3.f103883a.setEnterSelectChatMsgActivity(true);
                ChatRoomActivity.a.a(a3.f103883a);
            }
        }
    }
}
