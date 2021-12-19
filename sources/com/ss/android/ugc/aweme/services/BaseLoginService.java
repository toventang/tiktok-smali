package com.ss.android.ugc.aweme.services;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.bean.d;
import com.ss.android.ugc.aweme.account.login.s;
import com.ss.android.ugc.aweme.account.m.a;
import com.ss.android.ugc.aweme.account.m.b;
import com.ss.android.ugc.aweme.account.util.q;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bo;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.cw.g;
import h.f.b.l;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public abstract class BaseLoginService implements au, bo {
    private boolean mKeepCallback;
    private IAccountService.c mLoginParam;
    private IAccountService.c mPlatformParam;

    static {
        Covode.recordClassIndex(79426);
    }

    public bo keepCallback() {
        this.mKeepCallback = true;
        return this;
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public String getLoginMobEnterFrom() {
        return s.f63679b;
    }

    @Override // com.ss.android.ugc.aweme.bo
    public String getLoginMobEnterMethod() {
        return s.f63678a;
    }

    public IAccountService.c getLoginParam() {
        return this.mLoginParam;
    }

    private void computeNumOfUidsOnDevice() {
        g.c().execute(new BaseLoginService$$Lambda$0(this));
    }

    @Override // com.ss.android.ugc.aweme.bo
    public List<d> getAllSupportedLoginPlatform() {
        return Collections.singletonList(new d("Phone", 2131231098, "mobile"));
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        IAccountService.c cVar = this.mLoginParam;
        if (cVar != null && (cVar.f62394a instanceof m)) {
            ((m) this.mLoginParam.f62394a).getLifecycle().b(this);
        }
        this.mLoginParam = null;
        this.mPlatformParam = null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$computeNumOfUidsOnDevice$0$BaseLoginService() {
        Keva repo = Keva.getRepo("uid_recorder", 0);
        String[] stringArray = repo.getStringArray("logged_in_uids", new String[20]);
        int i2 = repo.getInt("num_of_logged_in_uids", 0);
        try {
            String secUid = cj.f().getSecUid();
            if (!TextUtils.isEmpty(secUid) && !containsInArray(stringArray, Math.min(i2, 20), secUid)) {
                stringArray[i2 % 20] = secUid;
                repo.storeStringArray("logged_in_uids", stringArray);
                repo.storeInt("num_of_logged_in_uids", i2 + 1);
            }
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.bo
    public void showLoginView(IAccountService.c cVar) {
        this.mLoginParam = cVar;
        s.f63678a = cVar.f62397d.getString("enter_method", "");
        s.f63679b = cVar.f62397d.getString("enter_from", "");
        if (!this.mKeepCallback && (cVar.f62394a instanceof m)) {
            ((m) cVar.f62394a).getLifecycle().a(this);
        }
        this.mKeepCallback = false;
    }

    @Override // com.ss.android.ugc.aweme.bo
    public void showLoginAndRegisterView(IAccountService.c cVar) {
        this.mLoginParam = cVar;
        if (!cVar.f62397d.getBoolean("is_multi_account", false) && !q.d().getBoolean("account_terminal_app_has_logged_out", true)) {
            q.d(true);
            String str = a.f65142b;
            c cVar2 = new c();
            cVar2.a(StringSet.type, "auto_logout");
            if (!TextUtils.isEmpty(str)) {
                cVar2.a("error_desc", str);
            }
            JSONObject a2 = cVar2.a();
            l.b(a2, "");
            b.a("monitor_account_business", 1, a2);
        }
        a.f65141a = "OpenLogin";
        if (!this.mKeepCallback && (cVar.f62394a instanceof m)) {
            ((m) cVar.f62394a).getLifecycle().a(this);
        }
        this.mKeepCallback = false;
    }

    @Override // com.ss.android.ugc.aweme.bo
    public void logout(String str, String str2) {
        logout(str, str2, null);
    }

    @Override // com.ss.android.ugc.aweme.bo
    public void loginByPlatform(IAccountService.c cVar, d dVar) {
        this.mPlatformParam = cVar;
        s.f63678a = cVar.f62397d.getString("enter_method", "");
        s.f63679b = cVar.f62397d.getString("enter_from", "");
        if (!this.mKeepCallback && (cVar.f62394a instanceof m)) {
            ((m) cVar.f62394a).getLifecycle().a(this);
        }
        this.mKeepCallback = false;
    }

    public void notifyProgress(int i2, int i3, String str) {
        IAccountService.c cVar = this.mLoginParam;
        if (cVar != null && cVar.f62399f != null) {
            this.mLoginParam.f62399f.a(i2, i3);
        }
    }

    private boolean containsInArray(String[] strArr, int i2, String str) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (TextUtils.equals(strArr[i3], str)) {
                return true;
            }
        }
        return false;
    }

    public void returnResult(int i2, int i3, Object obj) {
        IAccountService.c cVar = this.mLoginParam;
        if (!(cVar == null || cVar.f62398e == null)) {
            this.mLoginParam.f62398e.onResult(i2, i3, obj);
            this.mLoginParam = null;
        }
        IAccountService.c cVar2 = this.mPlatformParam;
        if (cVar2 != null && cVar2.f62398e != null) {
            this.mPlatformParam.f62398e.onResult(i2, i3, obj);
            this.mPlatformParam = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        if (android.text.TextUtils.equals(r14, "user_logout") != false) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072 A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0096 A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0097 A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099 A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    @Override // com.ss.android.ugc.aweme.bo
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void logout(java.lang.String r13, java.lang.String r14, com.ss.android.ugc.aweme.bo.a r15) {
        /*
        // Method dump skipped, instructions count: 225
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.BaseLoginService.logout(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.bo$a):void");
    }
}
