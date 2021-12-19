package com.ss.android.ugc.aweme.feed.api;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.retrofit2.c.a;
import com.ss.android.ugc.aweme.net.interceptor.FeedRetryInterceptorTTNet;
import java.util.ArrayList;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f91944a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(57895);
    }

    public static List<a> a() {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.equals(d.s, "local_test")) {
            arrayList.add(new ComplianceEncryptCheckInterceptor());
        }
        arrayList.add(new FeedRetryInterceptorTTNet());
        arrayList.add(new DetectInterceptor());
        arrayList.add(new FetchNetworkInfoInterceptor());
        return arrayList;
    }
}
