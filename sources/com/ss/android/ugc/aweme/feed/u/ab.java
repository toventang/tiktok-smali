package com.ss.android.ugc.aweme.feed.u;

import androidx.core.g.e;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.feed.api.FeedActionApi;
import java.util.HashMap;
import java.util.concurrent.Callable;

final /* synthetic */ class ab implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final aa f93969a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f93970b;

    static {
        Covode.recordClassIndex(59766);
    }

    ab(aa aaVar, Object[] objArr) {
        this.f93969a = aaVar;
        this.f93970b = objArr;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        aa aaVar = this.f93969a;
        HashMap hashMap = (HashMap) this.f93970b[0];
        aaVar.f93968a = Integer.parseInt((String) hashMap.get(StringSet.type));
        FeedActionApi.f91922a.diggItem(hashMap).get();
        return e.a(hashMap.get("aweme_id"), Integer.valueOf(Integer.parseInt((String) hashMap.get(StringSet.type))));
    }
}
