package com.ss.android.ugc.aweme.bs;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.f;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final f f68797a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static final String f68798b = "api_error_full_log";

    /* renamed from: c  reason: collision with root package name */
    public static final a f68799c = new a();

    /* renamed from: d  reason: collision with root package name */
    private static final String f68800d = "ApiErrorMonitor";

    /* renamed from: e  reason: collision with root package name */
    private static ArrayList<Integer> f68801e;

    /* renamed from: f  reason: collision with root package name */
    private static final ArrayList<String> f68802f = n.d("/service/1/update_token/", "/aweme/v1/aweme/detail/", "/aweme/v1/user/", "/aweme/v1/abtest/param/", "/aweme/v1/commerce/settings", "/aweme/v1/feed/", "/aweme/v1/settings/", "/aweme/v1/story/", "/aweme/v1/user/settings/", "/aweme/v1/im/cloud/token/", "/aweme/v1/upload/contacts/", "/aweme/v1/aweme/post/", "/aweme/v1/user/", "/aweme/v1/commit/follow/user/", "/aweme/v1/multi/aweme/detail/", "/aweme/v1/comment/publish/", "/aweme/v1/general/search/", "/passport/user/logout/", "/aweme/v1/commit/item/digg/", "/user/mobile/reset_password/", "/passport/auth/login/", "/aweme/v1/create/aweme/", "/aweme/v1/recommend/user/", "/aweme/v2/comment/list/", "/passport/mobile/login/", "/aweme/v1/user/follower/list/", "/aweme/v1/notice/count/", "/aweme/v1/friend/feed/", "/aweme/v1/aweme/stats/", "/aweme/v1/hot/search/list/", "/aweme/v1/recommend/challenge/");

    private a() {
    }

    static {
        Covode.recordClassIndex(42373);
    }

    public static ArrayList<Integer> a() {
        MethodCollector.i(4033);
        if (f68801e == null) {
            synchronized (f68799c) {
                try {
                    ArrayList<Integer> arrayList = f68801e;
                    if (arrayList != null) {
                        return arrayList;
                    }
                    f68801e = new ArrayList<>();
                    for (T t : f68802f) {
                        ArrayList<Integer> arrayList2 = f68801e;
                        if (arrayList2 == null) {
                            l.b();
                        }
                        arrayList2.add(Integer.valueOf(t.hashCode()));
                    }
                } finally {
                    MethodCollector.o(4033);
                }
            }
        }
        ArrayList<Integer> arrayList3 = f68801e;
        MethodCollector.o(4033);
        return arrayList3;
    }
}
