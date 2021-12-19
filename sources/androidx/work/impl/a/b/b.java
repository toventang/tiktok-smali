package androidx.work.impl.a.b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.g;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper;

public final class b extends c<Boolean> {

    /* renamed from: b  reason: collision with root package name */
    private static final String f4528b = g.a("BatteryNotLowTracker");

    static {
        Covode.recordClassIndex(1776);
    }

    @Override // androidx.work.impl.a.b.c
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.a.b.d
    public final /* synthetic */ Object b() {
        Intent b2 = b(this.f4533a, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (b2 == null) {
            g.a();
            return null;
        }
        boolean z = false;
        int intExtra = b2.getIntExtra("plugged", 0);
        int intExtra2 = b2.getIntExtra("status", -1);
        float intExtra3 = ((float) b2.getIntExtra("level", -1)) / ((float) b2.getIntExtra("scale", -1));
        if (intExtra != 0 || intExtra2 == 1 || intExtra3 > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public b(Context context) {
        super(context);
    }

    @Override // androidx.work.impl.a.b.c
    public final void a(Intent intent) {
        if (intent.getAction() != null) {
            g.a();
            a.a("Received %s", new Object[]{intent.getAction()});
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.BATTERY_OKAY")) {
                a((Object) true);
            } else if (action.equals("android.intent.action.BATTERY_LOW")) {
                a((Object) false);
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
                com.bytedance.c.a.a.a.b.a(securityException, "Register Receiver Exception");
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
                com.bytedance.c.a.a.a.b.a(securityException, "Register Receiver Exception");
                return null;
            }
        }
    }
}
