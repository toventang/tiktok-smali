package com.bytedance.platform.b.a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private Runnable f41910a;

    /* renamed from: b  reason: collision with root package name */
    private ThreadPoolExecutor f41911b;

    static {
        Covode.recordClassIndex(25598);
    }

    public final void run() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("poolName", ((com.bytedance.platform.b.c) this.f41911b).a());
            jSONObject.put("poolInfo", this.f41911b.toString());
            jSONObject.put("task", this.f41910a.toString());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public c(ThreadPoolExecutor threadPoolExecutor, Runnable runnable) {
        this.f41910a = runnable;
        this.f41911b = threadPoolExecutor;
    }
}
