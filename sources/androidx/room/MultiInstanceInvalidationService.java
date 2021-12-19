package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import androidx.c.h;
import androidx.room.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;

public class MultiInstanceInvalidationService extends Service {

    /* renamed from: a  reason: collision with root package name */
    int f4228a;

    /* renamed from: b  reason: collision with root package name */
    final h<String> f4229b = new h<>();

    /* renamed from: c  reason: collision with root package name */
    final RemoteCallbackList<d> f4230c = new RemoteCallbackList<d>() {
        /* class androidx.room.MultiInstanceInvalidationService.AnonymousClass1 */

        static {
            Covode.recordClassIndex(1637);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.os.IInterface, java.lang.Object] */
        @Override // android.os.RemoteCallbackList
        public final /* synthetic */ void onCallbackDied(d dVar, Object obj) {
            MultiInstanceInvalidationService.this.f4229b.b(((Integer) obj).intValue());
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private final e.a f4231d = new e.a() {
        /* class androidx.room.MultiInstanceInvalidationService.AnonymousClass2 */

        static {
            Covode.recordClassIndex(1638);
        }

        @Override // androidx.room.e
        public final void a(d dVar, int i2) {
            synchronized (MultiInstanceInvalidationService.this.f4230c) {
                MultiInstanceInvalidationService.this.f4230c.unregister(dVar);
                MultiInstanceInvalidationService.this.f4229b.b(i2);
            }
        }

        @Override // androidx.room.e
        public final int a(d dVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f4230c) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i2 = multiInstanceInvalidationService.f4228a + 1;
                multiInstanceInvalidationService.f4228a = i2;
                if (MultiInstanceInvalidationService.this.f4230c.register(dVar, Integer.valueOf(i2))) {
                    MultiInstanceInvalidationService.this.f4229b.c(i2, str);
                    return i2;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f4228a--;
                return 0;
            }
        }

        @Override // androidx.room.e
        public final void a(int i2, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f4230c) {
                String a2 = MultiInstanceInvalidationService.this.f4229b.a(i2, null);
                if (a2 != null) {
                    int beginBroadcast = MultiInstanceInvalidationService.this.f4230c.beginBroadcast();
                    for (int i3 = 0; i3 < beginBroadcast; i3++) {
                        try {
                            int intValue = ((Integer) MultiInstanceInvalidationService.this.f4230c.getBroadcastCookie(i3)).intValue();
                            String a3 = MultiInstanceInvalidationService.this.f4229b.a(intValue, null);
                            if (i2 != intValue && a2.equals(a3)) {
                                try {
                                    MultiInstanceInvalidationService.this.f4230c.getBroadcastItem(i3).a(strArr);
                                } catch (RemoteException unused) {
                                }
                            }
                        } catch (Throwable th) {
                            MultiInstanceInvalidationService.this.f4230c.finishBroadcast();
                            throw th;
                        }
                    }
                    MultiInstanceInvalidationService.this.f4230c.finishBroadcast();
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(1636);
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    public IBinder onBind(Intent intent) {
        return this.f4231d;
    }
}
