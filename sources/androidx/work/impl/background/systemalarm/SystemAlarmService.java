package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.p;
import androidx.work.g;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.impl.utils.f;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import java.util.HashMap;

public class SystemAlarmService extends p implements e.b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4631a = g.a("SystemAlarmService");

    /* renamed from: b  reason: collision with root package name */
    private e f4632b;

    static {
        Covode.recordClassIndex(1826);
    }

    @Override // androidx.lifecycle.p
    public void onCreate() {
        super.onCreate();
        e eVar = new e(this);
        this.f4632b = eVar;
        if (eVar.f4661i != null) {
            g.a();
        } else {
            eVar.f4661i = this;
        }
    }

    @Override // androidx.lifecycle.p
    public void onDestroy() {
        super.onDestroy();
        e eVar = this.f4632b;
        eVar.f4656d.b(eVar);
        eVar.f4655c.f4671a.shutdownNow();
        eVar.f4661i = null;
    }

    @Override // androidx.work.impl.background.systemalarm.e.b
    public final void a() {
        g.a();
        HashMap hashMap = new HashMap();
        synchronized (f.f4790a) {
            hashMap.putAll(f.f4790a);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                a.a("WakeLock held for %s", new Object[]{hashMap.get(wakeLock)});
                g.a();
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.p
    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        super.onStartCommand(intent, i2, i3);
        if (intent == null) {
            return 3;
        }
        this.f4632b.a(intent, i3);
        return 3;
    }
}
