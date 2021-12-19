package com.ss.android.ugc.aweme.bridge;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import h.a.n;
import h.f.b.l;
import java.util.List;
import org.json.JSONObject;

public final class GetEOYUserInfoMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f68774b = true;

    /* renamed from: c  reason: collision with root package name */
    public static final a f68775c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private final String f68776d = "getEOYUserInfo";

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42354);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68776d;
    }

    static {
        Covode.recordClassIndex(42353);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetEOYUserInfoMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.c.c.a.k
    public final void a(JSONObject jSONObject, k.b bVar) {
        boolean z;
        String str;
        List<String> urlList;
        String str2 = "";
        l.d(jSONObject, str2);
        l.d(bVar, str2);
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("firstToHub", f68774b);
            f68774b = false;
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, str2);
            if (!g2.isLogin()) {
                a.a(bVar, jSONObject2);
            }
            Context e2 = e();
            String str3 = null;
            if (e2 == null) {
                a.a(bVar, (Throwable) null);
                return;
            }
            IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g3, str2);
            jSONObject2.put("hasLoggedIn", g3.isLogin());
            if (androidx.core.content.b.a(e2, "android.permission.READ_CONTACTS") == 0) {
                z = true;
            } else {
                z = false;
            }
            jSONObject2.put("hasContactPermission", z);
            JSONObject jSONObject3 = new JSONObject();
            IAccountUserService g4 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g4, str2);
            User curUser = g4.getCurUser();
            l.b(curUser, str2);
            jSONObject3.put("userID", curUser.getUid());
            jSONObject3.put("secUserID", curUser.getSecUid());
            jSONObject3.put("uniqueID", curUser.getUniqueId());
            jSONObject3.put("nickname", curUser.getNickname());
            UrlModel avatarThumb = curUser.getAvatarThumb();
            if (avatarThumb == null || (urlList = avatarThumb.getUrlList()) == null) {
                str = null;
            } else {
                if (n.a((List) urlList) >= 0) {
                    str2 = urlList.get(0);
                }
                str = str2;
            }
            jSONObject3.put("avatarURL", str);
            ProfileBadgeStruct profileBadge = curUser.getProfileBadge();
            if (profileBadge != null && profileBadge.getShouldShow()) {
                str3 = profileBadge.getUrl();
            }
            jSONObject3.put("frameURL", str3);
            jSONObject2.put("userInfo", jSONObject3);
            a.a(bVar, jSONObject2);
        } catch (Exception e3) {
            a.a(bVar, e3);
        }
    }
}
