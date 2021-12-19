package com.bytedance.bdturing;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class h implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    Activity f26497a;

    /* renamed from: b  reason: collision with root package name */
    private int f26498b = 1;

    static {
        Covode.recordClassIndex(15572);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    h(Activity activity) {
        this.f26497a = activity;
    }

    public final void onActivityResumed(Activity activity) {
        if (activity == this.f26497a) {
            this.f26498b++;
        }
    }

    public final void onActivityStopped(Activity activity) {
        if (activity == this.f26497a) {
            int i2 = this.f26498b - 1;
            this.f26498b = i2;
            if (i2 == 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("key", "background");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                e.a("turing_verify_sdk", jSONObject);
            }
        }
    }
}
