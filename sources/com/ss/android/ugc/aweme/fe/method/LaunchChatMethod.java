package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.a;
import com.ss.android.ugc.aweme.login.c;
import h.f.b.l;
import java.util.Objects;
import org.json.JSONObject;

public final class LaunchChatMethod extends BaseCommonJavaMethod implements au {
    static {
        Covode.recordClassIndex(57295);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LaunchChatMethod f91078a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f91079b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ IMUser f91080c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f91081d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ BaseCommonJavaMethod.a f91082e;

        static {
            Covode.recordClassIndex(57296);
        }

        a(LaunchChatMethod launchChatMethod, String str, IMUser iMUser, int i2, BaseCommonJavaMethod.a aVar) {
            this.f91078a = launchChatMethod;
            this.f91079b = str;
            this.f91080c = iMUser;
            this.f91081d = i2;
            this.f91082e = aVar;
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void a() {
            if (LaunchChatMethod.a(this.f91078a.getActContext(), this.f91080c, this.f91081d)) {
                BaseCommonJavaMethod.a aVar = this.f91082e;
                if (aVar != null) {
                    aVar.a((Object) 1);
                    return;
                }
                return;
            }
            BaseCommonJavaMethod.a aVar2 = this.f91082e;
            if (aVar2 != null) {
                aVar2.a(0, "open chat fail");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        String str;
        int i2;
        if (jSONObject != null) {
            IMUser iMUser = new IMUser();
            iMUser.setUid(jSONObject.optString("uid"));
            iMUser.setNickName(jSONObject.optString("nick_name"));
            iMUser.setSignature(jSONObject.optString("alias"));
            iMUser.setFake(true);
            if (jSONObject.optBoolean("is_author_service")) {
                str = "message";
                i2 = 12;
            } else {
                str = "";
                i2 = 0;
            }
            IAccountUserService g2 = b.g();
            l.b(g2, "");
            if (!g2.isLogin()) {
                Context actContext = getActContext();
                if (actContext != null && (actContext instanceof Activity)) {
                    Objects.requireNonNull(actContext, "null cannot be cast to non-null type android.app.Activity");
                    c.a((Activity) actContext, str, "click_chat_button", new a(this, str, iMUser, i2, aVar));
                }
            } else if (a(getActContext(), iMUser, i2)) {
                if (aVar != null) {
                    aVar.a((Object) 1);
                }
            } else if (aVar != null) {
                aVar.a(0, "open chat fail");
            }
        } else if (aVar != null) {
            aVar.a(0, "no params found");
        }
    }

    public static boolean a(Context context, IMUser iMUser, int i2) {
        if (context == null) {
            return false;
        }
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        l.b(createIIMServicebyMonsterPlugin, "");
        if (!com.ss.android.ugc.aweme.im.a.a() || createIIMServicebyMonsterPlugin == null) {
            return false;
        }
        createIIMServicebyMonsterPlugin.startChat(a.b.a(context, iMUser).a(i2).f103883a);
        return true;
    }
}
