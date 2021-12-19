package com.ss.android.ugc.aweme.services;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.t;
import com.google.c.h.a.q;
import com.ss.android.http.a.b.d;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class ApiNetworkServiceForAccount implements IApiNetworkServiceForAccount {
    private AccountApi mApi = ((AccountApi) a.a(Api.f66569d, AccountApi.class));

    public interface AccountApi {
        static {
            Covode.recordClassIndex(79421);
        }

        @h
        b<String> doGet(@ag String str);

        @t
        @g
        b<String> doPost(@ag String str, @f Map<String, String> map);

        @t
        @g
        q<UserResponse> postUserResponse(@ag String str, @f Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(79420);
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount
    public void executeGetForCheck(String str) {
        Api.a(this.mApi.doGet(str).execute().f42630b, str);
    }

    public static IApiNetworkServiceForAccount createIApiNetworkServiceForAccountbyMonsterPlugin(boolean z) {
        MethodCollector.i(8817);
        Object a2 = com.ss.android.ugc.b.a(IApiNetworkServiceForAccount.class, z);
        if (a2 != null) {
            IApiNetworkServiceForAccount iApiNetworkServiceForAccount = (IApiNetworkServiceForAccount) a2;
            MethodCollector.o(8817);
            return iApiNetworkServiceForAccount;
        }
        if (com.ss.android.ugc.b.dn == null) {
            synchronized (IApiNetworkServiceForAccount.class) {
                try {
                    if (com.ss.android.ugc.b.dn == null) {
                        com.ss.android.ugc.b.dn = new ApiNetworkServiceForAccount();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8817);
                    throw th;
                }
            }
        }
        ApiNetworkServiceForAccount apiNetworkServiceForAccount = (ApiNetworkServiceForAccount) com.ss.android.ugc.b.dn;
        MethodCollector.o(8817);
        return apiNetworkServiceForAccount;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount
    public User executeGetJSONObject(String str) {
        T t = this.mApi.doGet(str).execute().f42630b;
        JSONObject jSONObject = new JSONObject((String) t);
        Api.a(jSONObject, t, str);
        return (User) GsonHolder.c().b().a(jSONObject.opt("user").toString(), User.class);
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount
    public UserResponse executePostJSONObjectForUserResponse(String str, List<d> list) {
        HashMap hashMap = new HashMap();
        if (!com.ss.android.ugc.aweme.base.utils.d.a(list)) {
            for (d dVar : list) {
                hashMap.put(dVar.f59532a, dVar.f59533b);
            }
            com.ss.android.common.applog.q.b(hashMap, true);
        }
        return this.mApi.postUserResponse(str, hashMap).get();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount
    public void registerNotice(String str, int i2) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("phone_number", str);
        }
        hashMap.put("login_type", String.valueOf(i2));
        com.ss.android.common.applog.q.b(hashMap, true);
        Api.a(this.mApi.doPost(Api.f66573h, hashMap).execute().f42630b, Api.f66573h);
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount
    public User executePostJSONObjectForUser(String str, List<d> list) {
        HashMap hashMap = new HashMap();
        if (!com.ss.android.ugc.aweme.base.utils.d.a(list)) {
            for (d dVar : list) {
                hashMap.put(dVar.f59532a, dVar.f59533b);
            }
            com.ss.android.common.applog.q.b(hashMap, true);
        }
        T t = this.mApi.doPost(str, hashMap).execute().f42630b;
        JSONObject jSONObject = new JSONObject((String) t);
        Api.a(jSONObject, t, str);
        return (User) GsonHolder.c().b().a(jSONObject.opt("user").toString(), User.class);
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount
    public AvatarUri uploadAvatar(String str, int i2, String str2, List<d> list) {
        if (list == null) {
            return (AvatarUri) Api.a(str, i2, str2, AvatarUri.class, "data");
        }
        return (AvatarUri) Api.a(str, i2, str2, AvatarUri.class, "data", list);
    }
}
