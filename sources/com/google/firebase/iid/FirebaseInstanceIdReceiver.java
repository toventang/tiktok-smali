package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import androidx.legacy.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.concurrent.ExecutorService;

public final class FirebaseInstanceIdReceiver extends a {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f54382a = g.a();

    static {
        Covode.recordClassIndex(33763);
    }

    private static BroadcastReceiver.PendingResult a(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver) {
        boolean a2;
        try {
            if ("com.google.firebase.iid.FirebaseInstanceIdReceiver".equals(firebaseInstanceIdReceiver.getClass().getName())) {
                try {
                    a2 = SettingsManager.a().a("fire_base_receiver_opt", true);
                } catch (Throwable unused) {
                }
                if (a2) {
                    return null;
                }
            }
            return firebaseInstanceIdReceiver.goAsync();
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        a bVar;
        Intent intent2;
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if ((parcelableExtra instanceof Intent) && (intent2 = (Intent) parcelableExtra) != null) {
                intent = intent2;
            }
            intent.setComponent(null);
            intent.setPackage(context.getPackageName());
            int i2 = Build.VERSION.SDK_INT;
            if ("google.com/iid".equals(a(intent, "from"))) {
                bVar = new t(this.f54382a);
            } else {
                bVar = new b(context, this.f54382a);
            }
            bVar.a(intent).a(this.f54382a, new p(isOrderedBroadcast(), a(this)));
        }
    }
}
