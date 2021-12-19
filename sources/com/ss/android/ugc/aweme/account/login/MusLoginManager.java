package com.ss.android.ugc.aweme.account.login;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import java.util.HashMap;
import java.util.Map;
import l.b.d;
import l.b.e;
import l.b.o;

public final class MusLoginManager {

    /* renamed from: a  reason: collision with root package name */
    public static final String f63220a = "https://api-va.tiktokv.com";

    /* renamed from: b  reason: collision with root package name */
    private MusLoginApi f63221b = ((MusLoginApi) a.a(f63220a, MusLoginApi.class));

    public interface MusLoginApi {
        static {
            Covode.recordClassIndex(38965);
        }

        @o(a = "/aweme/v3/user/info/sync/")
        @e
        i<com.ss.android.ugc.aweme.account.login.b.a> syncUserInfo(@d Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(38964);
    }

    public final i<com.ss.android.ugc.aweme.account.login.b.a> a(HashMap<String, String> hashMap) {
        return this.f63221b.syncUserInfo(hashMap);
    }
}
