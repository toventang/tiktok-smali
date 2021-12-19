package com.adm.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.amazon.device.messaging.ADMMessageReceiver;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.f;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

public class ADMMessageHandler extends ADMMessageHandlerBase {
    private static long sLastSendTokenTimeStamp;
    private static String sLastToken;
    public static boolean sSupportJobIntent = true;
    private Handler mHandler;

    /* access modifiers changed from: protected */
    public void onUnregistered(String str) {
    }

    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    public static class Receiver extends ADMMessageReceiver {
        static {
            Covode.recordClassIndex(2050);
        }

        public Receiver() {
            super(ADMMessageHandler.class);
            if (ADMMessageHandler.sSupportJobIntent) {
                registerJobServiceClass(ADMMessageHandlerJob.class, 1);
            }
        }
    }

    static {
        Covode.recordClassIndex(2049);
        try {
            Class.forName("com.amazon.device.messaging.ADMMessageHandlerJobBase");
        } catch (Throwable unused) {
        }
    }

    private Handler getHandler() {
        if (this.mHandler == null) {
            this.mHandler = new a(getApplicationContext());
        }
        return this.mHandler;
    }

    public static Bundle com_adm_push_ADMMessageHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void onRegistrationError(String str) {
        getHandler().obtainMessage(2, str).sendToTarget();
    }

    /* access modifiers changed from: package-private */
    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final Context f4953a;

        static {
            Covode.recordClassIndex(2051);
        }

        a(Context context) {
            super(Looper.getMainLooper());
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            this.f4953a = applicationContext;
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 == 1) {
                try {
                    String str = (String) message.obj;
                    if (!TextUtils.isEmpty(str)) {
                        f.b().a(this.f4953a, AdmPushAdapter.getAdmPush(), str);
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
                    f.d().a(AdmPushAdapter.getAdmPush(), 102, (String) message.obj, "ADMMessageHandler.AdmHandler return ERROR when register");
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

    /* access modifiers changed from: protected */
    public void onRegistered(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - sLastSendTokenTimeStamp >= InteractFirstFrameTimeOutDurationSetting.DEFAULT || !m.a(str, sLastToken)) {
            sLastSendTokenTimeStamp = currentTimeMillis;
            sLastToken = str;
            sendToken(str);
        }
    }

    private void sendToken(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                f.d().a(AdmPushAdapter.getAdmPush(), 102, "0", "ADMMessageHandler token is empty");
            } else {
                getHandler().obtainMessage(1, str).sendToTarget();
            }
        } catch (Throwable th) {
            if (f.a().a()) {
                Log.getStackTraceString(th);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMessage(Intent intent) {
        Bundle com_adm_push_ADMMessageHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras;
        if (intent != null && (com_adm_push_ADMMessageHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = com_adm_push_ADMMessageHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent)) != null) {
            try {
                f.c().a(com_adm_push_ADMMessageHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.getString("payload"), AdmPushAdapter.getAdmPush());
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
    }

    public void onStart(Intent intent, int i2) {
        if (intent == null) {
            intent = new Intent();
            intent.setAction("");
        }
        ADMMessageHandler.super.onStart(intent, i2);
    }
}
