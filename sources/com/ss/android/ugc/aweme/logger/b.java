package com.ss.android.ugc.aweme.logger;

import com.bytedance.covode.number.Covode;
import com.ss.android.common.c.a;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f109012a;

    static {
        Covode.recordClassIndex(69800);
    }

    b(JSONObject jSONObject) {
        this.f109012a = jSONObject;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        a.a("first_feed_show_time_v3", this.f109012a);
        return null;
    }
}
