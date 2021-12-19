package com.ss.android.ugc.aweme.profile.edit;

import android.os.Message;
import android.text.TextUtils;
import androidx.fragment.app.e;
import com.bytedance.apm.b;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.a;
import com.bytedance.lobby.auth.c;
import com.bytedance.lobby.internal.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.utils.ai;

public final class h implements WeakHandler.IHandler, a {

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f116118e = false;

    /* renamed from: a  reason: collision with root package name */
    protected c f116119a;

    /* renamed from: b  reason: collision with root package name */
    protected e f116120b;

    /* renamed from: c  reason: collision with root package name */
    public WeakHandler f116121c = new WeakHandler(this);

    /* renamed from: d  reason: collision with root package name */
    public boolean f116122d;

    static {
        Covode.recordClassIndex(74906);
    }

    public final void a() {
        this.f116122d = true;
        c.a aVar = new c.a(this.f116120b);
        aVar.f40170a = "twitter";
        aVar.f40172c = this;
        c a2 = aVar.a();
        d.a();
        d.a(a2);
    }

    @Override // com.bytedance.lobby.auth.a
    public final void a(AuthResult authResult) {
        String str;
        if (authResult.f40147a) {
            ai.a(new i(this, authResult.f40151e, authResult.f40156j.getString("username"), authResult.f40152f, authResult.f40153g), "BoltsUtils");
            return;
        }
        com.bytedance.lobby.c cVar = authResult.f40149c;
        if (authResult.f40149c != null) {
            str = authResult.f40149c.getMessage();
        } else {
            str = "";
        }
        this.f116119a.d(null);
        if (!(cVar == null || TextUtils.equals(str, "Authorization failed, request was canceled.") || TextUtils.equals(str, "Failed to get authorization, bundle incomplete"))) {
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement stackTraceElement : cVar.getStackTrace()) {
                sb.append(stackTraceElement.toString());
            }
            sb.append(cVar.getMessage());
            String sb2 = sb.toString();
            com.bytedance.ies.ugc.appcontext.d.a();
            if (com.ss.android.ugc.trill.main.login.a.a()) {
                b.a("aweme_thirdparty_login_error_rate", 0, com.ss.android.ugc.trill.main.login.a.a("twitter").a("app_language", SettingServiceImpl.v().h()).a("platform", "twitter").a("errorDesc", String.valueOf(sb2)).a("errorUrl", "").a());
            }
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) cVar);
            a(cVar.getMessage(), cVar.getErrorStage());
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        User user;
        if (!(message.obj instanceof Exception) && message.obj != null) {
            if (message.obj instanceof UserResponse) {
                user = ((UserResponse) message.obj).getUser();
            } else {
                user = (User) message.obj;
            }
            if (message.what == 112) {
                com.ss.android.ugc.aweme.account.b.g().updateCurUser(user);
                if (this.f116122d) {
                    this.f116119a.d(user.getTwitterName());
                    r.a("social_account_bind_success", new com.ss.android.ugc.aweme.app.f.d().a("platform", "twitter").f66730a);
                } else {
                    this.f116119a.d(null);
                    r.a("social_account_unbind_success", new com.ss.android.ugc.aweme.app.f.d().a("platform", "twitter").f66730a);
                }
                com.bytedance.ies.ugc.appcontext.d.a();
                if (com.ss.android.ugc.trill.main.login.a.a()) {
                    b.a("aweme_thirdparty_login_error_rate", 1, com.ss.android.ugc.trill.main.login.a.a("twitter").a("app_language", SettingServiceImpl.v().h()).a("platform", "twitter").a());
                    return;
                }
                return;
            }
        }
        a("Failed to retrieve data from TikTok server", "sycn_user_info");
        this.f116119a.d(null);
    }

    public final void a(String str, String str2) {
        if (this.f116122d) {
            r.a("social_account_bind_failure", new com.ss.android.ugc.aweme.app.f.d().a("platform", "twitter").a("error_desc", str).a("error_code", str2).f66730a);
        }
    }
}
