package com.ss.android.ugc.aweme.profile.edit;

import android.os.Message;
import android.text.TextUtils;
import androidx.fragment.app.e;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.a;
import com.bytedance.lobby.c;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ai;
import java.util.Map;

public final class InstagramPresenter implements WeakHandler.IHandler, a {

    /* renamed from: a  reason: collision with root package name */
    static final String f116066a = (Api.f66569d + "/aweme/v1/instagram/bind/");

    /* renamed from: h  reason: collision with root package name */
    private static final boolean f116067h = false;

    /* renamed from: b  reason: collision with root package name */
    public b f116068b;

    /* renamed from: c  reason: collision with root package name */
    public e f116069c;

    /* renamed from: d  reason: collision with root package name */
    public WeakHandler f116070d = new WeakHandler(this);

    /* renamed from: e  reason: collision with root package name */
    public IAccountUserService f116071e = b.g();

    /* renamed from: f  reason: collision with root package name */
    InstagramApi f116072f = ((InstagramApi) RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(InstagramApi.class));

    /* renamed from: g  reason: collision with root package name */
    public boolean f116073g;

    public interface InstagramApi {
        static {
            Covode.recordClassIndex(74878);
        }

        @t
        @g
        q<String> doPost(@ag String str, @f Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(74877);
    }

    @Override // com.bytedance.lobby.auth.a
    public final void a(AuthResult authResult) {
        String str;
        String str2 = "redirect_and_get_token";
        if (!authResult.f40147a) {
            this.f116068b.c(null);
            c cVar = authResult.f40149c;
            if (cVar != null) {
                str = cVar.getMessage();
                str2 = cVar.getErrorStage();
            } else {
                str = "Lobby failed and no error info available";
            }
            a(str, str2);
            return;
        }
        String string = authResult.f40156j.getString("code");
        if (f116067h) {
            authResult.f40156j.getString("code");
        }
        if (!TextUtils.isEmpty(string)) {
            ai.a(new f(this, string), "BoltsUtils");
            return;
        }
        this.f116068b.c(null);
        a("Authorization code is missing", str2);
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
            this.f116068b.c(user.getInsId());
            if (message.what == 6) {
                this.f116071e.updateInsId(user.getInsId());
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.base.d.c(this.f116071e.getCurUser()));
                r.a("social_account_unbind_success", new d().a("platform", "instagram").f66730a);
                return;
            } else if (message.what == 112) {
                this.f116071e.updateCurUser(user);
                r.a("social_account_bind_success", new d().a("platform", "instagram").f66730a);
                return;
            }
        }
        a("Failed to retrieve data from TikTok server", "sycn_user_info");
        this.f116068b.c(null);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2) {
        if (this.f116073g) {
            r.a("social_account_bind_failure", new d().a("platform", "instagram").a("error_desc", str).a("error_code", str2).f66730a);
        }
    }
}
