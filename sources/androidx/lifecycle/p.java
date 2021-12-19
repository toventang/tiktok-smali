package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;

public class p extends Service implements m {

    /* renamed from: a  reason: collision with root package name */
    private final z f3540a = new z(this);

    static {
        Covode.recordClassIndex(1332);
    }

    @Override // androidx.lifecycle.m
    public i getLifecycle() {
        return this.f3540a.f3567a;
    }

    public void onCreate() {
        this.f3540a.a(i.a.ON_CREATE);
        super.onCreate();
    }

    public void onDestroy() {
        z zVar = this.f3540a;
        zVar.a(i.a.ON_STOP);
        zVar.a(i.a.ON_DESTROY);
        super.onDestroy();
    }

    public IBinder onBind(Intent intent) {
        this.f3540a.a(i.a.ON_START);
        return null;
    }

    public void onStart(Intent intent, int i2) {
        this.f3540a.a(i.a.ON_START);
        super.onStart(intent, i2);
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        return super.onStartCommand(intent, i2, i3);
    }
}
