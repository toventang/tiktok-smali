package com.ss.android.ugc.aweme.account.agegate.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.c;
import com.google.gson.f;
import com.ss.android.ugc.aweme.account.agegate.model.SetEmailResponse;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import java.util.HashMap;

public class Api {
    static {
        Covode.recordClassIndex(38549);
    }

    public static i<SetEmailResponse> emailForExportVideo(String str) {
        return i.b(new a(str), i.f4824a);
    }

    static final /* synthetic */ SetEmailResponse lambda$emailForExportVideo$0$Api(String str) {
        String str2 = c.a.f43087a + "api-va.tiktokv.com/tiktok/v1/kids/user/email/";
        HashMap hashMap = new HashMap();
        hashMap.put("email", str);
        return (SetEmailResponse) new f().a(NetworkProxyAccount.f65195b.a(str2, hashMap), SetEmailResponse.class);
    }
}
