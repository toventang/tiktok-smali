package com.ss.android.ugc.awemepushlib.di.ies;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.ss.android.newmedia.d.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.awemepushlib.manager.MessageShowHandler;
import org.json.JSONException;
import org.json.JSONObject;

public class MessageHandler extends a {
    static {
        Covode.recordClassIndex(95062);
    }

    @Override // com.ss.android.newmedia.d.a
    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    @Override // com.ss.android.newmedia.d.a
    public final void a(Context context, String str) {
        String str2 = "context = [" + context + "], type = [1], obj = [" + str + "], from = [2], extra = [" + ((String) null) + "]";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("receive_time", new StringBuilder().append(System.currentTimeMillis()).toString());
            jSONObject.put("message", str2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        r.a("push_receive_in_mt", jSONObject);
        MessageShowHandler.a(context, 1, str, 2);
    }
}
