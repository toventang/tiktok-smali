package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.google.android.datatransport.f;
import com.google.android.gms.c.h;
import com.google.android.gms.c.k;
import com.google.android.gms.common.util.a.b;
import com.google.firebase.analytics.connector.a;
import com.google.firebase.iid.ap;
import com.google.firebase.iid.x;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FirebaseMessagingService extends d {
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);

    public static int com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }

    @Override // com.google.firebase.messaging.d
    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    static {
        Covode.recordClassIndex(33873);
    }

    /* access modifiers changed from: package-private */
    public long getAckTimeoutMillis() {
        return TimeUnit.SECONDS.toMillis(1);
    }

    public static Bundle com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    private String getMessageId(Intent intent) {
        String com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "google.message_id");
        if (com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra == null) {
            return com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "message_id");
        }
        return com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.firebase.messaging.d
    public Intent getStartCommandIntent(Intent intent) {
        return ap.a().f54422c.poll();
    }

    @Override // com.google.firebase.messaging.d
    public boolean handleIntentOnMainThread(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        handleNotificationOpen(intent);
        return true;
    }

    private h<Void> ackMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return k.a((Object) null);
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", str);
        x a2 = x.a(this);
        return a2.a(new x.c(a2.a(), bundle));
    }

    private boolean alreadyReceivedMessage(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        } else {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Received duplicate message: ".concat(valueOf);
            } else {
                str2 = new String("Received duplicate message: ");
            }
            com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_LogLancet_d("FirebaseMessaging", str2);
            return true;
        }
    }

    private void dispatchMessage(Intent intent) {
        Bundle com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
        if (com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null) {
            com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = new Bundle();
        }
        com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.remove("androidx.content.wakelockid");
        if (o.a(com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras)) {
            o oVar = new o(com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras);
            b bVar = new b("Firebase-Messaging-Network-Io");
            l.a a2 = l.a(o.FIXED);
            a2.f79174c = 1;
            a2.f79178g = bVar;
            ExecutorService a3 = g.a(a2.a());
            try {
                if (!new c(this, oVar, a3).a()) {
                    a3.shutdown();
                    if (n.a(intent)) {
                        n.a("_nf", intent);
                    }
                } else {
                    return;
                }
            } finally {
                a3.shutdown();
            }
        }
        onMessageReceived(new RemoteMessage(com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras));
    }

    private void handleMessageIntent(Intent intent) {
        String com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "google.message_id");
        h<Void> ackMessage = ackMessage(com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
        if (!alreadyReceivedMessage(com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra)) {
            passMessageIntentToSdk(intent);
        }
        try {
            k.a(ackMessage, getAckTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            String valueOf = String.valueOf(e2);
            com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_LogLancet_w("FirebaseMessaging", new StringBuilder(String.valueOf(valueOf).length() + 20).append("Message ack failed: ").append(valueOf).toString());
        }
    }

    private void handleNotificationOpen(Intent intent) {
        a aVar;
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_LogLancet_e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (n.a(intent)) {
            if ("1".equals(n.a(intent, "google.c.a.tc")) && (aVar = (a) com.google.firebase.b.d().a(a.class)) != null) {
                String a2 = n.a(intent, "google.c.a.c_id");
                aVar.a("fcm", "_ln", a2);
                Bundle bundle = new Bundle();
                bundle.putString("source", "Firebase");
                bundle.putString("medium", "notification");
                bundle.putString("campaign", a2);
                aVar.a("fcm", "_cmp", bundle);
            }
            n.a("_no", intent);
        }
    }

    @Override // com.google.firebase.messaging.d
    public void handleIntent(Intent intent) {
        String str;
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            handleMessageIntent(intent);
        } else if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(action)) {
            if (n.a(intent)) {
                n.a("_nd", intent);
            }
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            onNewToken(com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "token"));
        } else {
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                str = "Unknown intent action: ".concat(valueOf);
            } else {
                str = new String("Unknown intent action: ");
            }
            com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_LogLancet_d("FirebaseMessaging", str);
        }
    }

    private void passMessageIntentToSdk(Intent intent) {
        String str;
        String com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "message_type");
        if (com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra == null) {
            com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = "gcm";
        }
        com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra.hashCode();
        char c2 = 65535;
        switch (com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra.hashCode()) {
            case -2062414158:
                if (com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra.equals("deleted_messages")) {
                    c2 = 0;
                    break;
                }
                break;
            case 102161:
                if (com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra.equals("gcm")) {
                    c2 = 1;
                    break;
                }
                break;
            case 814694033:
                if (com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra.equals("send_error")) {
                    c2 = 2;
                    break;
                }
                break;
            case 814800675:
                if (com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra.equals("send_event")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                onDeletedMessages();
                return;
            case 1:
                if (n.a(intent)) {
                    n.a(intent, (f<String>) null);
                }
                if (intent != null && !n.b(intent) && n.a()) {
                    com.google.android.datatransport.g gVar = FirebaseMessaging.f54592b;
                    if (gVar != null) {
                        n.a(intent, gVar.a("FCM_CLIENT_EVENT_LOGGING", com.google.android.datatransport.b.a("json"), j.f54615a));
                    } else {
                        com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_LogLancet_e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                    }
                }
                dispatchMessage(intent);
                return;
            case 2:
                onSendError(getMessageId(intent), new q(com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "error")));
                return;
            case 3:
                onMessageSent(com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "google.message_id"));
                return;
            default:
                String valueOf = String.valueOf(com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
                if (valueOf.length() != 0) {
                    str = "Received message with unknown type: ".concat(valueOf);
                } else {
                    str = new String("Received message with unknown type: ");
                }
                com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_LogLancet_w("FirebaseMessaging", str);
                return;
        }
    }

    public static String com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
