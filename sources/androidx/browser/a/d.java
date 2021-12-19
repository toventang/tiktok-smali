package androidx.browser.a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.support.a.b;
import com.bytedance.covode.number.Covode;

public abstract class d implements ServiceConnection {
    static {
        Covode.recordClassIndex(546);
    }

    public abstract void a(b bVar);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b aVar;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                aVar = new b.a.C0003a(iBinder);
            } else {
                aVar = (b) queryLocalInterface;
            }
        }
        a(new b(aVar, componentName) {
            /* class androidx.browser.a.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(547);
            }
        });
    }
}
