package androidx.work.impl.a.b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.work.g;
import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper;

public final class a extends c<Boolean> {

    /* renamed from: b  reason: collision with root package name */
    private static final String f4527b = g.a("BatteryChrgTracker");

    static {
        Covode.recordClassIndex(1775);
    }

    @Override // androidx.work.impl.a.b.c
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    @Override // androidx.work.impl.a.b.d
    public final /* synthetic */ Object b() {
        int intExtra;
        Intent b2 = b(this.f4533a, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (b2 == null) {
            g.a();
            return null;
        }
        boolean z = true;
        if (Build.VERSION.SDK_INT < 23 ? b2.getIntExtra("plugged", 0) == 0 : !((intExtra = b2.getIntExtra("status", -1)) == 2 || intExtra == 5)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public a(Context context) {
        super(context);
    }

    @Override // androidx.work.impl.a.b.c
    public final void a(Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            g.a();
            com.a.a("Received %s", new Object[]{action});
            action.hashCode();
            switch (action.hashCode()) {
                case -1886648615:
                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        a((Object) false);
                        return;
                    }
                    return;
                case -54942926:
                    if (action.equals("android.os.action.DISCHARGING")) {
                        a((Object) false);
                        return;
                    }
                    return;
                case 948344062:
                    if (action.equals("android.os.action.CHARGING")) {
                        a((Object) true);
                        return;
                    }
                    return;
                case 1019184907:
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        a((Object) true);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    private static Intent a(Context context, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(null, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(null, intentFilter);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    private static Intent b(Context context, IntentFilter intentFilter) {
        SecurityException securityException;
        com.ss.android.ugc.aweme.lancet.receiver.a.a(com.bytedance.ies.ugc.appcontext.g.a());
        try {
            return a(context, intentFilter);
        } catch (Exception unused) {
            try {
                return ReceiverRegisterLancetHelper.registerReceiver(null, intentFilter);
            } catch (SecurityException e2) {
                securityException = e2;
                b.a(securityException, "Register Receiver Exception");
                return null;
            } catch (IllegalArgumentException e3) {
                String message = e3.getMessage();
                securityException = e3;
                if (message != null) {
                    boolean contains = e3.getMessage().contains("regist too many Broadcast Receivers");
                    securityException = e3;
                    if (contains) {
                        throw e3;
                    }
                }
                b.a(securityException, "Register Receiver Exception");
                return null;
            }
        }
    }
}
