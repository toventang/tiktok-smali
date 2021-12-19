package com.ss.android.ugc.aweme.im.sdk.chat.ui.base;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.ies.im.core.api.c.a;
import com.bytedance.im.core.a.e;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.analysis.c;
import com.ss.android.ugc.aweme.base.component.AnalysisActivityComponent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.f;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.g;
import com.ss.android.ugc.aweme.im.sdk.common.controller.h.b.b;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.HashMap;

public class b extends com.bytedance.ies.foundation.activity.a implements c {

    /* renamed from: e  reason: collision with root package name */
    public static final a f101190e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private AnalysisActivityComponent f101191a;

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.im.sdk.chat.ui.c.a f101192b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f101193c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.sdk.chat.data.a f101194d;

    static {
        Covode.recordClassIndex(64738);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f101193c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public View _$_findCachedViewById(int i2) {
        if (this.f101193c == null) {
            this.f101193c = new HashMap();
        }
        View view = (View) this.f101193c.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f101193c.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64739);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public b() {
        com.ss.android.ugc.aweme.im.sdk.common.controller.h.b.b.f102324a.a("chat_room");
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void finish() {
        BaseChatPanel baseChatPanel;
        com.ss.android.ugc.aweme.im.sdk.chat.ui.c.a aVar = this.f101192b;
        if (!(aVar == null || (baseChatPanel = aVar.f101195e) == null)) {
            baseChatPanel.h();
        }
        super.finish();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public void onBackPressed() {
        com.ss.android.ugc.aweme.im.sdk.chat.ui.c.a aVar = this.f101192b;
        if (aVar != null) {
            aVar.c();
        }
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        super.onPause();
        AnalysisActivityComponent analysisActivityComponent = this.f101191a;
        if (analysisActivityComponent != null) {
            analysisActivityComponent.a();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        super.onResume();
        AnalysisActivityComponent analysisActivityComponent = this.f101191a;
        if (analysisActivityComponent != null) {
            analysisActivityComponent.f68042a = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.analysis.c
    public final Analysis F() {
        Analysis labelName = new Analysis().setLabelName("chat");
        l.b(labelName, "");
        return labelName;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        super.onDestroy();
        com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.f102188b = "";
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.f102189c != null) {
            com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.f102189c.clear();
        }
        this.f101191a = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f4, code lost:
        if (com.ss.android.ugc.aweme.im.sdk.chat.b.c.a.a(r6) != false) goto L_0x00c8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bB_() {
        /*
        // Method dump skipped, instructions count: 255
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.b.bB_():void");
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        BaseChatPanel baseChatPanel;
        super.onWindowFocusChanged(z);
        com.ss.android.ugc.aweme.im.sdk.chat.ui.c.a aVar = this.f101192b;
        if (aVar != null && (baseChatPanel = aVar.f101195e) != null) {
            baseChatPanel.o = z;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        l.d(str, "");
        com.ss.android.ugc.aweme.im.sdk.chat.ui.c.a aVar = this.f101192b;
        if (aVar != null) {
            l.d(str, "");
            BaseChatPanel baseChatPanel = aVar.f101195e;
            if (baseChatPanel != null) {
                baseChatPanel.a(str);
            }
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.b, com.bytedance.ies.powerpage.a
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        bB_();
        boolean z = false;
        if (intent != null) {
            z = intent.getBooleanExtra("back_to_chat_room", false);
        }
        a(!z);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onSaveInstanceState(Bundle bundle) {
        l.d(bundle, "");
        super.onSaveInstanceState(bundle);
        com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar = this.f101194d;
        if (aVar != null) {
            bundle.putSerializable("key_session_info", aVar);
        }
    }

    private final void a(boolean z) {
        i supportFragmentManager = getSupportFragmentManager();
        Fragment a2 = supportFragmentManager.a("chat_room_fragment");
        if (a2 == null || z) {
            a2 = new com.ss.android.ugc.aweme.im.sdk.chat.ui.c.a();
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_session_info", this.f101194d);
            a2.setArguments(bundle);
        }
        this.f101192b = (com.ss.android.ugc.aweme.im.sdk.chat.ui.c.a) a2;
        n a3 = supportFragmentManager.a();
        l.b(a3, "");
        a3.b(R.id.b94, a2, "chat_room_fragment").c();
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.ies.im.core.api.b.a().a(a.EnumC0747a.ENTER_CHAT_ROOM);
        if (bundle != null) {
            getIntent().putExtras(bundle);
        }
        Window window = getWindow();
        l.b(window, "");
        window.getDecorView().setBackgroundResource(R.drawable.aq9);
        com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.f();
        setContentView(R.layout.a48);
        bB_();
        a(false);
        this.f101191a = new AnalysisActivityComponent(this);
        b.a aVar = com.ss.android.ugc.aweme.im.sdk.common.controller.h.b.b.f102324a;
        View findViewById = findViewById(R.id.b94);
        l.b(findViewById, "");
        aVar.a(findViewById, "chat_room");
    }

    private static com.ss.android.ugc.aweme.im.service.model.a a(com.ss.android.ugc.aweme.im.service.model.a aVar) {
        String enterFromForMob;
        IMUser imUser;
        String uid;
        IMUser imUser2;
        String uid2;
        String enterMethodForMob;
        IMContact imContact = aVar.getImContact();
        IMConversation iMConversation = null;
        if (imContact != null) {
            if (imContact instanceof IMConversation) {
                iMConversation = imContact;
            }
            IMConversation iMConversation2 = iMConversation;
            if (iMConversation2 == null || iMConversation2.getConversationType() != e.a.f37582b) {
                IMUser a2 = f.a(imContact);
                if (a2 != null) {
                    aVar.setImUser(a2);
                }
            } else {
                aVar.setSessionId(iMConversation2.getConversationId());
                aVar.setChatType(3);
            }
        }
        int i2 = 2;
        if (aVar.getEnterFrom() == 6 && ((enterMethodForMob = aVar.getEnterMethodForMob()) == null || enterMethodForMob.length() == 0)) {
            aVar.setEnterMethodForMob("share_toast");
        } else if (aVar.getEnterFrom() == 2 && ((enterFromForMob = aVar.getEnterFromForMob()) == null || enterFromForMob.length() == 0)) {
            aVar.setEnterMethodForMob("stranger_message_box");
        }
        if (aVar.getChatType() == -1) {
            IMUser imUser3 = aVar.getImUser();
            if (aVar.getEnterFrom() == 2) {
                i2 = 1;
            } else if (imUser3 == null || imUser3.getCommerceUserLevel() <= 0) {
                i2 = 0;
            }
            aVar.setChatType(i2);
        }
        if (aVar.getChatType() != 3) {
            if (aVar.getImUser() == null) {
                IMUser a3 = g.a(String.valueOf(b.a.c(aVar.getSessionId())), com.ss.android.ugc.aweme.im.sdk.common.controller.e.c.a(aVar.getSessionId()));
                if (a3 == null) {
                    com.ss.android.ugc.aweme.im.service.m.a.e("BaseChatRoomActivity", "ChatRoomActivity.start user = null");
                    h.f.a.b<Boolean, z> routerCallback = aVar.getRouterCallback();
                    if (routerCallback != null) {
                        routerCallback.invoke(false);
                    }
                    return aVar;
                }
                try {
                    String uid3 = a3.getUid();
                    l.b(uid3, "");
                    Long.parseLong(uid3);
                    aVar.setImUser(a3);
                } catch (Exception unused) {
                    com.ss.android.ugc.aweme.im.service.m.a.e("BaseChatRoomActivity", "ChatRoomActivity.start uid is invalid: " + a3.getUid());
                    h.f.a.b<Boolean, z> routerCallback2 = aVar.getRouterCallback();
                    if (routerCallback2 != null) {
                        routerCallback2.invoke(false);
                    }
                    return aVar;
                }
            }
            String shareUserId = aVar.getShareUserId();
            if (!((shareUserId != null && shareUserId.length() != 0) || (imUser2 = aVar.getImUser()) == null || (uid2 = imUser2.getUid()) == null)) {
                aVar.setShareUserId(uid2);
            }
            String sessionId = aVar.getSessionId();
            if (!((sessionId != null && sessionId.length() != 0) || (imUser = aVar.getImUser()) == null || (uid = imUser.getUid()) == null || uid.length() == 0)) {
                aVar.setSessionId(b.a.b(uid));
            }
        }
        return aVar;
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        com.ss.android.ugc.aweme.im.sdk.chat.ui.c.a aVar = this.f101192b;
        if (aVar != null) {
            aVar.onActivityResult(i2, i3, intent);
        }
    }
}
