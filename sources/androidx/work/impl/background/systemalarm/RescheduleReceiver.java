package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.g;
import androidx.work.impl.f;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4630a = g.a("RescheduleReceiver");

    static {
        Covode.recordClassIndex(1825);
    }

    private static BroadcastReceiver.PendingResult a(RescheduleReceiver rescheduleReceiver) {
        boolean a2;
        try {
            if ("com.google.firebase.iid.FirebaseInstanceIdReceiver".equals(rescheduleReceiver.getClass().getName())) {
                try {
                    a2 = SettingsManager.a().a("fire_base_receiver_opt", true);
                } catch (Throwable unused) {
                }
                if (a2) {
                    return null;
                }
            }
            return rescheduleReceiver.goAsync();
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemalarm.RescheduleReceiver.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    public void onReceive(Context context, Intent intent) {
        g.a();
        a.a("Received intent %s", new Object[]{intent});
        if (Build.VERSION.SDK_INT >= 23) {
            f b2 = f.b();
            if (b2 == null) {
                g.a();
                return;
            }
            BroadcastReceiver.PendingResult a2 = a(this);
            synchronized (f.f4698l) {
                b2.f4707i = a2;
                if (b2.f4706h) {
                    b2.f4707i.finish();
                    b2.f4707i = null;
                }
            }
            return;
        }
        Intent intent2 = new Intent(context, SystemAlarmService.class);
        intent2.setAction("ACTION_RESCHEDULE");
        a(context, intent2);
    }
}
