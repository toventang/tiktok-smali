package com.adm.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.f;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

public class ADMMessageHandlerJob extends ADMMessageHandlerJobBase {
    private static long sLastSendTokenTimeStamp;
    private static String sLastToken;
    private Handler mHandler;

    static {
        Covode.recordClassIndex(2052);
    }

    /* access modifiers changed from: protected */
    public void onUnregistered(Context context, String str) {
    }

    public static Bundle com_adm_push_ADMMessageHandlerJob_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public static Context com_adm_push_ADMMessageHandlerJob_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    /* access modifiers changed from: package-private */
    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final Context f4954a;

        static {
            Covode.recordClassIndex(2053);
        }

        a(Context context) {
            super(Looper.getMainLooper());
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            this.f4954a = applicationContext;
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 == 1) {
                try {
                    String str = (String) message.obj;
                    if (!TextUtils.isEmpty(str)) {
                        f.b().a(this.f4954a, AdmPushAdapter.getAdmPush(), str);
                    } else {
                        f.d().a(AdmPushAdapter.getAdmPush(), 102, "0", "token is empty");
                    }
                } catch (Throwable th) {
                    if (f.a().a()) {
                        th.getMessage();
                    }
                }
            } else if (i2 == 2) {
                try {
                    String str2 = (String) message.obj;
                    f.b();
                    AdmPushAdapter.getAdmPush();
                    f.d().a(AdmPushAdapter.getAdmPush(), 102, (String) message.obj, "ADMMessageHandlerJob.AdmHandler return ERROR when register");
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("label", "onRegistrationError");
                        jSONObject.put(StringSet.type, AdmPushAdapter.getAdmPush());
                        jSONObject.put("errorId", str2);
                        f.b();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private Handler getHandler(Context context) {
        if (this.mHandler == null) {
            this.mHandler = new a(com_adm_push_ADMMessageHandlerJob_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context));
        }
        return this.mHandler;
    }

    /* access modifiers changed from: protected */
    public void onRegistrationError(Context context, String str) {
        getHandler(context).obtainMessage(2, str).sendToTarget();
    }

    /* access modifiers changed from: protected */
    public void onRegistered(Context context, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - sLastSendTokenTimeStamp >= InteractFirstFrameTimeOutDurationSetting.DEFAULT || !m.a(str, sLastToken)) {
            sLastSendTokenTimeStamp = currentTimeMillis;
            sLastToken = str;
            sendToken(context, str);
        }
    }

    private void sendToken(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                f.d().a(AdmPushAdapter.getAdmPush(), 102, "0", "ADMMessageHandlerJob token is empty");
            } else {
                getHandler(context).obtainMessage(1, str).sendToTarget();
            }
        } catch (Throwable th) {
            if (f.a().a()) {
                Log.getStackTraceString(th);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMessage(Context context, Intent intent) {
        Bundle com_adm_push_ADMMessageHandlerJob_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras;
        if (intent != null && (com_adm_push_ADMMessageHandlerJob_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = com_adm_push_ADMMessageHandlerJob_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent)) != null) {
            try {
                f.c().a(com_adm_push_ADMMessageHandlerJob_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.getString("payload"), AdmPushAdapter.getAdmPush());
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
    }
}
