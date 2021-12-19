package com.ss.android.ugc.aweme.metrics.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final String f109539a;

    /* renamed from: b  reason: collision with root package name */
    private final String f109540b;

    /* renamed from: c  reason: collision with root package name */
    private final String f109541c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f109542d;

    static {
        Covode.recordClassIndex(70119);
    }

    c(String str, String str2, String str3, Context context) {
        this.f109539a = str;
        this.f109540b = str2;
        this.f109541c = str3;
        this.f109542d = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str = this.f109539a;
        String str2 = this.f109540b;
        String str3 = this.f109541c;
        Context context = this.f109542d;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", str);
        jSONObject.put("label", str2);
        jSONObject.put("session_id", str3);
        jSONObject.put("scene", "low_retain");
        jSONObject.put("local_time", System.currentTimeMillis() / 1000);
        AppLog.recordMiscLog(context, "app_perf", jSONObject);
        return null;
    }
}
