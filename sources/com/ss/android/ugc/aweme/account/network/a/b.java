package com.ss.android.ugc.aweme.account.network.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.d;
import com.ss.android.g;
import com.ss.android.h;
import com.ss.android.ugc.aweme.a;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class b implements d {
    static {
        Covode.recordClassIndex(40096);
    }

    @Override // com.bytedance.sdk.a.d
    public final h a(String str, Map<String, String> map, String str2, String str3, List<g> list) {
        l.d(str, "");
        l.d(str3, "");
        return null;
    }

    @Override // com.bytedance.sdk.a.d
    public final int a(Context context, Throwable th) {
        l.d(context, "");
        l.d(th, "");
        return a.b().a(context, th);
    }

    @Override // com.bytedance.sdk.a.d
    public final h a(String str, List<g> list) {
        l.d(str, "");
        l.d(list, "");
        return NetworkProxyAccount.f65195b.a(Integer.MAX_VALUE, str, list);
    }

    @Override // com.bytedance.sdk.a.d
    public final h a(String str, Map<String, String> map, List<g> list) {
        l.d(str, "");
        l.d(map, "");
        l.d(list, "");
        return NetworkProxyAccount.f65195b.a(Integer.MAX_VALUE, str, map, list);
    }
}
