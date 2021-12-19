package com.bytedance.push.i;

import android.content.Context;
import android.os.Looper;
import com.bytedance.common.utility.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.k.b;
import com.bytedance.push.settings.AliveOnlineSettings;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.settings.h;
import org.json.JSONException;
import org.json.JSONObject;

public final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f42203a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f42204b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f42205c;

    static {
        Covode.recordClassIndex(25789);
    }

    public final void run() {
        JSONObject jSONObject = this.f42203a;
        if (jSONObject != null) {
            if (!jSONObject.has("sdk_key_PushSDK") || (jSONObject = this.f42203a.optJSONObject("sdk_key_PushSDK")) != null) {
                if (this.f42205c) {
                    Context context = this.f42204b;
                    try {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                        jSONObject2.remove("ttpush_is_notify_service_stick");
                        jSONObject2.remove("ttpush_i18n_allow_push_daemon_monitor");
                        jSONObject2.remove("ttpush_is_close_alarm_wakeup");
                        jSONObject2.remove("ttpush_allow_push_job_service");
                        a(context, jSONObject2);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                } else {
                    a(this.f42204b, jSONObject);
                }
            } else if (b.f42229a) {
                throw new IllegalArgumentException("settings missing sdk_key_PushSDK");
            }
        }
    }

    private void a(final Context context, final JSONObject jSONObject) {
        AnonymousClass1 r2 = new Runnable() {
            /* class com.bytedance.push.i.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(25790);
            }

            public final void run() {
                ((AliveOnlineSettings) h.a(context, AliveOnlineSettings.class)).updateSettings(context, jSONObject);
                ((PushOnlineSettings) h.a(context, PushOnlineSettings.class)).updateSettings(context, jSONObject);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            e.a(r2);
        } else {
            r2.run();
        }
    }

    public g(Context context, JSONObject jSONObject, boolean z) {
        this.f42204b = context;
        this.f42203a = jSONObject;
        this.f42205c = z;
    }
}
