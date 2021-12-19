package com.fcm.service;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.c.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.push.f;
import com.fcm.FcmPushAdapter;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.google.firebase.messaging.b;

public class SSGcmListenerService extends FirebaseMessagingService {
    static {
        Covode.recordClassIndex(30820);
    }

    @Override // com.google.firebase.messaging.d, com.google.firebase.messaging.FirebaseMessagingService
    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        super.onNewToken(str);
        sendToken(str);
    }

    private void sendToken(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                Intent intent = new Intent(this, FcmRegistrationJobIntentService.class);
                intent.putExtra("key_token", str);
                FcmRegistrationJobIntentService.enqueueWork(this, intent);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        try {
            if (remoteMessage.f54597b == null) {
                Bundle bundle = remoteMessage.f54596a;
                a aVar = new a();
                for (String str : bundle.keySet()) {
                    Object a2 = b.a.a(bundle, str);
                    if (a2 instanceof String) {
                        String str2 = (String) a2;
                        if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                            aVar.put(str, str2);
                        }
                    }
                }
                remoteMessage.f54597b = aVar;
            }
            f.c().a(remoteMessage.f54597b.get(f.b().a()), FcmPushAdapter.getFcmPush());
        } catch (Exception e2) {
            e2.getMessage();
        }
    }
}
