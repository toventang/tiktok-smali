package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.g;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.utils.b;
import com.a;
import com.bytedance.covode.number.Covode;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4629a = g.a("ConstrntProxyUpdtRecvr");

    static {
        Covode.recordClassIndex(1824);
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            g.a();
            a.a("Ignoring unknown action %s", new Object[]{str});
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
        boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
        boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
        boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
        g.a();
        a.a("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)});
        b.a(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
        b.a(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
        b.a(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
        b.a(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
    }
}
