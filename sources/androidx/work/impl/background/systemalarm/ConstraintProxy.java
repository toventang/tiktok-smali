package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.g;
import com.a;
import com.bytedance.covode.number.Covode;

abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4628a = g.a("ConstraintProxy");

    ConstraintProxy() {
    }

    static {
        Covode.recordClassIndex(1819);
    }

    public static class BatteryChargingProxy extends ConstraintProxy {
        static {
            Covode.recordClassIndex(1820);
        }

        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        static {
            Covode.recordClassIndex(1821);
        }

        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        static {
            Covode.recordClassIndex(1822);
        }

        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        static {
            Covode.recordClassIndex(1823);
        }

        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public void onReceive(Context context, Intent intent) {
        g.a();
        a.a("onReceive : %s", new Object[]{intent});
        a(context, b.a(context));
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemalarm.ConstraintProxy.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
