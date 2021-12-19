package com.ss.android.ugc.aweme.i18n.xbridge.b.a;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.bo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class l implements IHostUserDepend {

    /* renamed from: a  reason: collision with root package name */
    private IHostUserDepend.a f99983a;

    public enum a {
        LOGGEDIN,
        CANCELLED;

        static {
            Covode.recordClassIndex(63733);
        }
    }

    static {
        Covode.recordClassIndex(63732);
    }

    static final class c implements bo.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IHostUserDepend.b f99986a;

        static {
            Covode.recordClassIndex(63735);
        }

        c(IHostUserDepend.b bVar) {
            this.f99986a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.bo.a
        public final void a() {
            this.f99986a.a();
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getSecUid() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        if (g2 != null) {
            return g2.getCurSecUserId();
        }
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getUserId() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        if (g2 != null) {
            return g2.getCurUserId();
        }
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final boolean hasLogin() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        if (g2 != null) {
            return g2.isLogin();
        }
        return false;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getBoundPhone() {
        User curUser;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        if (g2 == null || (curUser = g2.getCurUser()) == null) {
            return null;
        }
        return curUser.getBindPhone();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getNickname() {
        User curUser;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        if (g2 == null || (curUser = g2.getCurUser()) == null) {
            return null;
        }
        return curUser.getNickname();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getAvatarURL() {
        User curUser;
        UrlModel avatarMedium;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        if (g2 == null || (curUser = g2.getCurUser()) == null || (avatarMedium = curUser.getAvatarMedium()) == null || avatarMedium.getUrlList() == null) {
            return null;
        }
        List<String> urlList = avatarMedium.getUrlList();
        h.f.b.l.b(urlList, "");
        if (!urlList.isEmpty()) {
            return avatarMedium.getUrlList().get(0);
        }
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getUniqueID() {
        User curUser;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        if (g2 == null || (curUser = g2.getCurUser()) == null) {
            return "";
        }
        if (TextUtils.isEmpty(curUser.getUniqueId())) {
            return curUser.getShortId();
        }
        return curUser.getUniqueId();
    }

    public final void a(a aVar) {
        if (aVar == a.CANCELLED) {
            IHostUserDepend.a aVar2 = this.f99983a;
            if (aVar2 != null) {
                aVar2.b();
            }
        } else {
            IHostUserDepend.a aVar3 = this.f99983a;
            if (aVar3 != null) {
                aVar3.a();
            }
        }
        this.f99983a = null;
    }

    static final class b implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f99985a;

        static {
            Covode.recordClassIndex(63734);
        }

        b(l lVar) {
            this.f99985a = lVar;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i3 != 1) {
                this.f99985a.a(a.CANCELLED);
            } else {
                this.f99985a.a(a.LOGGEDIN);
            }
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final void logout(Activity activity, IHostUserDepend.b bVar, Map<String, String> map) {
        h.f.b.l.d(activity, "");
        h.f.b.l.d(bVar, "");
        com.ss.android.ugc.aweme.account.b.b().logout("", "user_logout", new c(bVar));
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final void login(Activity activity, IHostUserDepend.a aVar, Map<String, String> map) {
        Set<Map.Entry<String, String>> entrySet;
        h.f.b.l.d(activity, "");
        h.f.b.l.d(aVar, "");
        this.f99983a = aVar;
        Bundle bundle = new Bundle();
        if (!(map == null || (entrySet = map.entrySet()) == null)) {
            for (T t : entrySet) {
                bundle.putString((String) t.getKey(), (String) t.getValue());
            }
        }
        bo b2 = com.ss.android.ugc.aweme.account.b.b();
        IAccountService.d dVar = new IAccountService.d();
        dVar.f62404d = bundle;
        dVar.f62401a = activity;
        dVar.f62407g = true;
        dVar.f62405e = new b(this);
        b2.showLoginAndRegisterView(dVar.a());
    }
}
