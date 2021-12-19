package com.bytedance.platform.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.platform.b.c;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private Thread f41902a;

    /* renamed from: b  reason: collision with root package name */
    private Runnable f41903b;

    /* renamed from: c  reason: collision with root package name */
    private ThreadPoolExecutor f41904c;

    static {
        Covode.recordClassIndex(25596);
    }

    public final void run() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("poolName", ((c) this.f41904c).a());
            jSONObject.put("poolInfo", this.f41904c.toString());
            jSONObject.put("threadName", this.f41902a.getName());
            jSONObject.put("stack", b.a(this.f41902a.getStackTrace()));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public a(ThreadPoolExecutor threadPoolExecutor, Thread thread, Runnable runnable) {
        this.f41904c = threadPoolExecutor;
        this.f41902a = thread;
        this.f41903b = runnable;
    }
}
