package com.ss.android.ugc.aweme.im.sdk.chat.ui.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.im.core.a.e;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.SelectChatMsgActivity;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.login.c;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import h.f.a.m;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;

public final class ChatRoomActivity extends a implements ActivityStack.b, i, j {

    /* renamed from: a  reason: collision with root package name */
    public static String f101146a;

    /* renamed from: b  reason: collision with root package name */
    public static h.f.a.b<? super Boolean, z> f101147b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f101148c = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private Dialog f101149f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f101150g;

    /* renamed from: h  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.sdk.chat.b.c.j f101151h = new com.ss.android.ugc.aweme.im.sdk.chat.b.c.j();

    /* renamed from: i  reason: collision with root package name */
    private HashMap f101152i;

    static {
        Covode.recordClassIndex(64706);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.b, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f101152i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.b, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f101152i == null) {
            this.f101152i = new HashMap();
        }
        View view = (View) this.f101152i.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f101152i.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.utils.ActivityStack.b
    public final void b() {
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(245, new g(ChatRoomActivity.class, "onEvent", com.ss.android.ugc.aweme.im.sdk.chat.data.b.b.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.b, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.b, com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64707);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(com.ss.android.ugc.aweme.im.service.model.a aVar) {
            Intent intent;
            boolean z;
            String str;
            int followStatus;
            String uid;
            h.f.a.b<Boolean, z> routerCallback;
            h.f.a.b<Boolean, z> routerCallback2;
            l.d(aVar, "");
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            l.b(createIUserServicebyMonsterPlugin, "");
            if (!createIUserServicebyMonsterPlugin.isLogin()) {
                if (aVar.getContext() instanceof Activity) {
                    Activity activity = (Activity) aVar.getContext();
                    String enterFromForMob = aVar.getEnterFromForMob();
                    if (enterFromForMob == null) {
                        enterFromForMob = "chat";
                    }
                    String enterMethodForMob = aVar.getEnterMethodForMob();
                    if (enterMethodForMob == null) {
                        enterMethodForMob = "enter_chat";
                    }
                    c.a(activity, enterFromForMob, enterMethodForMob);
                }
                if (!(aVar.getRouterCallback() == null || (routerCallback2 = aVar.getRouterCallback()) == null)) {
                    routerCallback2.invoke(false);
                }
                return false;
            } else if (com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().isEnableShowTeenageTip()) {
                if (!(aVar.getRouterCallback() == null || (routerCallback = aVar.getRouterCallback()) == null)) {
                    routerCallback.invoke(false);
                }
                return false;
            } else {
                com.ss.android.ugc.aweme.im.sdk.chat.b.b.b.a(aVar);
                if (aVar.getEnterSelectChatMsgActivity()) {
                    intent = new Intent(aVar.getContext(), SelectChatMsgActivity.class);
                } else {
                    intent = new Intent(aVar.getContext(), ChatRoomActivity.class);
                    ChatRoomActivity.f101146a = aVar.getThirdAppName();
                    ChatRoomActivity.f101147b = aVar.getRouterCallback();
                }
                String sessionId = aVar.getSessionId();
                if (sessionId == null || p.a((CharSequence) sessionId)) {
                    z = true;
                } else {
                    z = false;
                }
                String str2 = null;
                if (z) {
                    IMContact imContact = aVar.getImContact();
                    if (!(imContact instanceof IMConversation)) {
                        imContact = null;
                    }
                    IMConversation iMConversation = (IMConversation) imContact;
                    if (iMConversation != null && iMConversation.getConversationType() == e.a.f37582b) {
                        IMContact imContact2 = aVar.getImContact();
                        if (!(imContact2 instanceof IMConversation)) {
                            imContact2 = null;
                        }
                        IMConversation iMConversation2 = (IMConversation) imContact2;
                        if (iMConversation2 != null) {
                            str2 = iMConversation2.getConversationId();
                        }
                        aVar.setSessionId(str2);
                    }
                    IMUser imUser = aVar.getImUser();
                    if (imUser != null && (uid = imUser.getUid()) != null && !p.a((CharSequence) uid) && aVar.getChatType() == 0) {
                        aVar.setSessionId(b.a.b(uid));
                    }
                }
                intent.addFlags(268435456);
                intent.putExtra("key_enter_chat_params", aVar);
                String sessionId2 = aVar.getSessionId();
                if (!(sessionId2 == null || p.a((CharSequence) sessionId2) || sessionId2 == null)) {
                    boolean unused = com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.a.f102292a.a(new com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.c(sessionId2), false);
                }
                if (aVar.getContext() != null) {
                    Context context = aVar.getContext();
                    if (context != null) {
                        a(context, intent);
                    }
                } else {
                    a(d.a(), intent);
                }
                if (aVar.getKeepEnterFrom()) {
                    str = "1";
                } else {
                    str = "0";
                }
                com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.b("keep_enter_from", str);
                if (!aVar.getNoEvent()) {
                    if (aVar.getImUser() == null) {
                        followStatus = -1;
                    } else {
                        IMUser imUser2 = aVar.getImUser();
                        if (imUser2 == null) {
                            l.b();
                        }
                        followStatus = imUser2.getFollowStatus();
                    }
                    int chatType = aVar.getChatType();
                    if (chatType == 1) {
                        com.ss.android.ugc.aweme.im.sdk.chat.a.e.a(aVar, "stranger", (String) null, followStatus, (com.bytedance.ies.im.core.api.b.a) null, (m) null, 52);
                    } else if (chatType != 3) {
                        com.ss.android.ugc.aweme.im.sdk.chat.a.e.a(aVar, "private", followStatus);
                    } else {
                        com.ss.android.ugc.aweme.im.sdk.chat.a.e.a(aVar, "group", (String) null, 0, (com.bytedance.ies.im.core.api.b.a) null, (m) null, 60);
                    }
                }
                com.ss.android.ugc.aweme.cc.c.a("im_chat_room");
                return true;
            }
        }

        private static void a(Context context, Intent intent) {
            com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
            context.startActivity(intent);
        }
    }

    @Override // com.ss.android.ugc.aweme.utils.ActivityStack.b
    public final void a() {
        Dialog dialog = this.f101149f;
        if (dialog != null && dialog.isShowing()) {
            com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().sendShareOverEvent(getClass().getSimpleName(), 3);
            Dialog dialog2 = this.f101149f;
            if (dialog2 == null) {
                l.b();
            }
            dialog2.dismiss();
            this.f101149f = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.b, com.bytedance.ies.foundation.activity.a
    public final void finish() {
        super.finish();
        if (this.f101150g) {
            SmartRouter.buildRoute(d.a(), "aweme://main").withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION").addFlags(67108864).open();
        }
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.b, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity", "onResume", true);
        super.onResume();
        h.f.a.b<? super Boolean, z> bVar = f101147b;
        if (bVar != null) {
            bVar.invoke(true);
            f101147b = null;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.b, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        String str;
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        ActivityStack.removeAppBackGroundListener(this);
        this.f101151h.b();
        long c2 = this.f101151h.c();
        if (c2 > 86400000) {
            HashMap hashMap = new HashMap();
            hashMap.put("tag", " start: " + this.f101151h.f100218a + " leave: " + this.f101151h.f100219b + " duration: " + c2);
            com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b("leave_chat_duration", hashMap);
        }
        com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar = this.f101194d;
        if (aVar != null) {
            String conversationId = aVar.getConversationId();
            int chatType = aVar.getChatType();
            if (chatType == 0) {
                str = "private";
            } else if (chatType == 1) {
                str = "stranger";
            } else if (chatType != 3) {
                str = "";
            } else {
                str = "group";
            }
            androidx.c.a aVar2 = new androidx.c.a();
            aVar2.put("conversation_id", conversationId);
            aVar2.put("chat_type", str);
            aVar2.put("duration", String.valueOf(c2));
            r.a("leave_chat", aVar2);
        }
    }

    public final void onEnterAnimationComplete() {
        Boolean bool;
        String singleChatFromUserId;
        boolean z;
        super.onEnterAnimationComplete();
        com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar = this.f101194d;
        if (aVar != null && aVar.isSingleChat()) {
            com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar2 = this.f101194d;
            String str = null;
            if (aVar2 == null || (singleChatFromUserId = aVar2.getSingleChatFromUserId()) == null) {
                bool = null;
            } else {
                Keva a2 = com.ss.android.ugc.aweme.im.sdk.chat.feature.a.c.a.a.a();
                l.d(singleChatFromUserId, "");
                l.d(a2, "");
                if (!a2.contains("key_double_follow_time_stamp".concat(String.valueOf(singleChatFromUserId))) || a2.getLong("key_double_follow_time_stamp".concat(String.valueOf(singleChatFromUserId)), -1) == -1) {
                    z = false;
                } else {
                    a2.storeLong("key_double_follow_time_stamp".concat(String.valueOf(singleChatFromUserId)), -1);
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            if (l.a((Object) bool, (Object) true)) {
                com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar3 = this.f101194d;
                if (aVar3 != null) {
                    str = aVar3.getSingleChatFromUserId();
                }
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.im.service.b.c(str));
                if (com.ss.android.ugc.aweme.im.service.c.d.e()) {
                    a(com.ss.android.ugc.aweme.im.sdk.common.controller.c.e.a());
                }
            }
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f101153a = new b();

        static {
            Covode.recordClassIndex(64708);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f101154a);
            baseActivityViewModel2.config(AnonymousClass2.f101155a);
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.b, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity", "onCreate", true);
        activityConfiguration(b.f101153a);
        super.onCreate(bundle);
        ActivityStack.addAppBackGroundListener(this);
        this.f101151h.a();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity", "onCreate", false);
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onEvent(com.ss.android.ugc.aweme.im.sdk.chat.data.b.b bVar) {
        l.d(bVar, "");
        com.ss.android.ugc.aweme.im.service.m.a.b("ChatRoomActivity", "MessageRvScrollToBottomEvent from=" + bVar.f100242a);
        com.ss.android.ugc.aweme.im.service.m.a.b("ChatRoomActivity", "showShareCompleteTipsDialog thirdAppName=" + f101146a);
        if (!TextUtils.isEmpty(f101146a) && !isFinishing()) {
            this.f101149f = com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().showShareCompleteTipsDialog(this, f101146a, null, null);
            f101146a = null;
            this.f101150g = true;
        }
    }
}
