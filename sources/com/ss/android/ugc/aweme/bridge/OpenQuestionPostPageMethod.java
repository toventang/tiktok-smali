package com.ss.android.ugc.aweme.bridge;

import android.content.Intent;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.util.l;
import h.a.n;
import h.f.b.l;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class OpenQuestionPostPageMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    private final String f68778b = "openPostPage";

    static {
        Covode.recordClassIndex(42357);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68778b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenQuestionPostPageMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    static final class a implements OnActivityResultCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.b f68779a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f68780b;

        static {
            Covode.recordClassIndex(42358);
        }

        a(k.b bVar, boolean z) {
            this.f68779a = bVar;
            this.f68780b = z;
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.bytedance.router.OnActivityResultCallback
        public final void onActivityResult(int i2, int i3, Intent intent) {
            Object a2;
            if (i2 == 10086 && i3 == -1 && (a2 = a(intent, "question_id")) != null) {
                String str = "";
                l.b(a2, str);
                String a3 = a(intent, "question_text");
                if (a3 != null) {
                    l.b(a3, str);
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    l.b(g2, str);
                    User curUser = g2.getCurUser();
                    k.b bVar = this.f68779a;
                    JSONObject jSONObject = new JSONObject();
                    IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                    l.b(g3, str);
                    if (g3.isLogin() && this.f68780b) {
                        jSONObject.put("is_need_refresh", true);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    l.b(curUser, str);
                    UrlModel avatarThumb = curUser.getAvatarThumb();
                    l.b(avatarThumb, str);
                    List<String> urlList = avatarThumb.getUrlList();
                    l.b(urlList, str);
                    if (n.a((List) urlList) >= 0) {
                        str = urlList.get(0);
                    }
                    jSONObject2.put("user_avatar_url", str);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("question_id", a2);
                    jSONObject3.put("question_text", a3);
                    jSONObject3.put("video_count", 0);
                    List<l.b> a4 = com.ss.android.ugc.aweme.util.l.a(a3);
                    if (a4 != null && !a4.isEmpty()) {
                        JSONArray jSONArray = new JSONArray();
                        for (T t : com.ss.android.ugc.aweme.util.l.a(a3)) {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("start", t.f142514a);
                            jSONObject4.put("end", t.f142515b);
                            jSONArray.put(jSONObject4);
                        }
                        jSONObject3.put("highlight_infos", jSONArray);
                    }
                    jSONObject2.put("question_info", jSONObject3);
                    jSONObject.put("question", jSONObject2);
                    a.a(bVar, jSONObject);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.c.c.a.k
    public final void a(JSONObject jSONObject, k.b bVar) {
        boolean z;
        h.f.b.l.d(jSONObject, "");
        h.f.b.l.d(bVar, "");
        try {
            String optString = jSONObject.optString("uid");
            String optString2 = jSONObject.optString("unique_id");
            String optString3 = jSONObject.optString("question_text");
            String optString4 = jSONObject.optString("avatar_url");
            String optString5 = jSONObject.optString("enter_method");
            boolean optBoolean = jSONObject.optBoolean("need_open_invite_panel");
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            if (!g2.isLogin()) {
                z = true;
            } else {
                z = false;
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(e(), "aweme://user/ask/");
            IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g3, "");
            User curUser = g3.getCurUser();
            h.f.b.l.b(curUser, "");
            SmartRoute withParam = buildRoute.withParam("uid", curUser.getUid());
            if (!((optString == null || optString.length() == 0) && (optString2 == null || optString2.length() == 0))) {
                User user = new User();
                user.setUniqueId(optString2);
                user.setUid(optString);
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(n.a(optString4));
                user.setAvatarThumb(urlModel);
                withParam.withParam("invited_users", n.d(user));
            }
            withParam.withParam("question", optString3).withParam("auto_invite", optBoolean).withParam("enter_from", "eoy_hub").withParam("enter_method", optString5).open(10086, new a(bVar, z));
        } catch (Exception e2) {
            a.a(bVar, e2);
        }
    }
}
