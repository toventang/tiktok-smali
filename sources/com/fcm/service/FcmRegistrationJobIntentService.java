package com.fcm.service;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.push.f;
import com.fcm.FcmPushAdapter;
import com.fcm.a.a;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

public class FcmRegistrationJobIntentService extends e {
    static {
        Covode.recordClassIndex(30819);
    }

    @Override // androidx.core.app.f
    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    @Override // androidx.core.app.f
    public void onHandleWork(Intent intent) {
        String com_fcm_service_FcmRegistrationJobIntentService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = com_fcm_service_FcmRegistrationJobIntentService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "key_token");
        try {
            a.a(this, com_fcm_service_FcmRegistrationJobIntentService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("label", "get_token");
            jSONObject.put(StringSet.type, FcmPushAdapter.getFcmPush());
            jSONObject.put("token", com_fcm_service_FcmRegistrationJobIntentService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
            f.b();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static String com_fcm_service_FcmRegistrationJobIntentService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void enqueueWork(Context context, Intent intent) {
        enqueueWork(context, FcmRegistrationJobIntentService.class, 101, intent);
    }
}
