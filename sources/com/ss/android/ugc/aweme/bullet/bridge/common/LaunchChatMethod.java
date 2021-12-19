package com.ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.a;
import com.ss.android.ugc.aweme.login.c;
import h.f.b.l;
import java.util.Objects;
import org.json.JSONObject;

public final class LaunchChatMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    private final String f68990b = "launchChat";

    static {
        Covode.recordClassIndex(42539);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68990b;
    }

    static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LaunchChatMethod f68991a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f68992b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f68993c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ IMUser f68994d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f68995e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ BaseBridgeMethod.a f68996f;

        static {
            Covode.recordClassIndex(42540);
        }

        a(LaunchChatMethod launchChatMethod, String str, Context context, IMUser iMUser, int i2, BaseBridgeMethod.a aVar) {
            this.f68991a = launchChatMethod;
            this.f68992b = str;
            this.f68993c = context;
            this.f68994d = iMUser;
            this.f68995e = i2;
            this.f68996f = aVar;
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void a() {
            if (LaunchChatMethod.a(this.f68993c, this.f68994d, this.f68995e)) {
                this.f68996f.a((Object) 1);
            } else {
                this.f68996f.a(0, "open chat fail");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LaunchChatMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        String str;
        int i2;
        l.d(jSONObject, "");
        l.d(aVar, "");
        Context context = (Context) this.f32005a.c(Context.class);
        IMUser iMUser = new IMUser();
        iMUser.setUid(jSONObject.optString("uid"));
        iMUser.setNickName(jSONObject.optString("nick_name"));
        iMUser.setSignature(jSONObject.optString("alias"));
        iMUser.setFake(true);
        boolean optBoolean = jSONObject.optBoolean("is_author_service");
        if (optBoolean) {
            str = "message";
        } else {
            str = "";
        }
        if (optBoolean) {
            i2 = 12;
        } else {
            i2 = 0;
        }
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (!g2.isLogin()) {
            if (context != null && (context instanceof Activity)) {
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                c.a((Activity) context, str, "click_chat_button", new a(this, str, context, iMUser, i2, aVar));
            }
        } else if (a(context, iMUser, i2)) {
            aVar.a((Object) 1);
        } else {
            aVar.a(0, "open chat fail");
        }
    }

    public static boolean a(Context context, IMUser iMUser, int i2) {
        if (context == null) {
            return false;
        }
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        l.b(createIIMServicebyMonsterPlugin, "");
        if (!com.ss.android.ugc.aweme.im.a.a()) {
            return false;
        }
        createIIMServicebyMonsterPlugin.startChat(a.b.a(context, iMUser).a(i2).f103883a);
        return true;
    }
}
