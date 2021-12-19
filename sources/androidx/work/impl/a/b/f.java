package androidx.work.impl.a.b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.g;
import com.a;
import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper;

public final class f extends c<Boolean> {

    /* renamed from: b  reason: collision with root package name */
    private static final String f4543b = g.a("StorageNotLowTracker");

    static {
        Covode.recordClassIndex(1783);
    }

    @Override // androidx.work.impl.a.b.c
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.a.b.d
    public final /* synthetic */ Object b() {
        Intent b2 = b(this.f4533a, a());
        if (b2 == null || b2.getAction() == null) {
            return true;
        }
        String action = b2.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return false;
        }
        if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return null;
        }
        return true;
    }

    public f(Context context) {
        super(context);
    }

    @Override // androidx.work.impl.a.b.c
    public final void a(Intent intent) {
        if (intent.getAction() != null) {
            g.a();
            a.a("Received %s", new Object[]{intent.getAction()});
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                a((Object) false);
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                a((Object) true);
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
