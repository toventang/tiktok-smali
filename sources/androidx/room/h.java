package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.c.b;
import androidx.room.d;
import androidx.room.e;
import androidx.room.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    Context f4299a;

    /* renamed from: b  reason: collision with root package name */
    final String f4300b;

    /* renamed from: c  reason: collision with root package name */
    int f4301c;

    /* renamed from: d  reason: collision with root package name */
    final g f4302d;

    /* renamed from: e  reason: collision with root package name */
    final g.b f4303e;

    /* renamed from: f  reason: collision with root package name */
    e f4304f;

    /* renamed from: g  reason: collision with root package name */
    final Executor f4305g;

    /* renamed from: h  reason: collision with root package name */
    final d f4306h = new d.a() {
        /* class androidx.room.h.AnonymousClass1 */

        static {
            Covode.recordClassIndex(1664);
        }

        @Override // androidx.room.d
        public final void a(final String[] strArr) {
            h.this.f4305g.execute(new Runnable() {
                /* class androidx.room.h.AnonymousClass1.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(1665);
                }

                public final void run() {
                    b bVar;
                    g gVar = h.this.f4302d;
                    String[] strArr = strArr;
                    synchronized (gVar.f4282g) {
                        Iterator<Map.Entry<g.b, g.c>> it = gVar.f4282g.iterator();
                        while (it.hasNext()) {
                            Map.Entry<g.b, g.c> next = it.next();
                            if (!next.getKey().a()) {
                                g.c value = next.getValue();
                                if (value.f4296b.length == 1) {
                                    int length = strArr.length;
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= length) {
                                            break;
                                        } else if (strArr[i2].equalsIgnoreCase(value.f4296b[0])) {
                                            Set<String> set = value.f4298d;
                                            if (set != null) {
                                                bVar = set;
                                            }
                                        } else {
                                            i2++;
                                        }
                                    }
                                } else {
                                    b bVar2 = new b();
                                    for (String str : strArr) {
                                        String[] strArr2 = value.f4296b;
                                        int length2 = strArr2.length;
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 >= length2) {
                                                break;
                                            }
                                            String str2 = strArr2[i3];
                                            if (str2.equalsIgnoreCase(str)) {
                                                bVar2.add(str2);
                                                break;
                                            }
                                            i3++;
                                        }
                                    }
                                    int size = bVar2.size();
                                    bVar = bVar2;
                                    if (size <= 0) {
                                    }
                                }
                                value.f4297c.a(bVar);
                            }
                        }
                    }
                }
            });
        }
    };

    /* renamed from: i  reason: collision with root package name */
    final AtomicBoolean f4307i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    final ServiceConnection f4308j;

    /* renamed from: k  reason: collision with root package name */
    final Runnable f4309k;

    /* renamed from: l  reason: collision with root package name */
    final Runnable f4310l;

    /* renamed from: m  reason: collision with root package name */
    private final Runnable f4311m;

    static {
        Covode.recordClassIndex(1663);
    }

    h(Context context, String str, g gVar, Executor executor) {
        AnonymousClass2 r4 = new ServiceConnection() {
            /* class androidx.room.h.AnonymousClass2 */

            static {
                Covode.recordClassIndex(1666);
            }

            public final void onServiceDisconnected(ComponentName componentName) {
                h.this.f4305g.execute(h.this.f4310l);
                h.this.f4304f = null;
                h.this.f4299a = null;
            }

            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                e aVar;
                h hVar = h.this;
                if (iBinder == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof e)) {
                        aVar = new e.a.C0063a(iBinder);
                    } else {
                        aVar = (e) queryLocalInterface;
                    }
                }
                hVar.f4304f = aVar;
                h.this.f4305g.execute(h.this.f4309k);
            }
        };
        this.f4308j = r4;
        this.f4309k = new Runnable() {
            /* class androidx.room.h.AnonymousClass3 */

            static {
                Covode.recordClassIndex(1667);
            }

            public final void run() {
                try {
                    e eVar = h.this.f4304f;
                    if (eVar != null) {
                        h hVar = h.this;
                        hVar.f4301c = eVar.a(hVar.f4306h, h.this.f4300b);
                        h.this.f4302d.a(h.this.f4303e);
                    }
                } catch (RemoteException unused) {
                }
            }
        };
        this.f4310l = new Runnable() {
            /* class androidx.room.h.AnonymousClass4 */

            static {
                Covode.recordClassIndex(1668);
            }

            public final void run() {
                h.this.f4302d.b(h.this.f4303e);
            }
        };
        this.f4311m = new Runnable() {
            /* class androidx.room.h.AnonymousClass5 */

            static {
                Covode.recordClassIndex(1669);
            }

            public final void run() {
                h.this.f4302d.b(h.this.f4303e);
                try {
                    e eVar = h.this.f4304f;
                    if (eVar != null) {
                        eVar.a(h.this.f4306h, h.this.f4301c);
                    }
                } catch (RemoteException unused) {
                }
                if (h.this.f4299a != null) {
                    h.this.f4299a.unbindService(h.this.f4308j);
                    h.this.f4299a = null;
                }
            }
        };
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        this.f4299a = applicationContext;
        this.f4300b = str;
        this.f4302d = gVar;
        this.f4305g = executor;
        this.f4303e = new g.b(gVar.f4277b) {
            /* class androidx.room.h.AnonymousClass6 */

            static {
                Covode.recordClassIndex(1670);
            }

            /* access modifiers changed from: package-private */
            @Override // androidx.room.g.b
            public final boolean a() {
                return true;
            }

            @Override // androidx.room.g.b
            public final void a(Set<String> set) {
                if (!h.this.f4307i.get()) {
                    try {
                        h.this.f4304f.a(h.this.f4301c, (String[]) set.toArray(new String[0]));
                    } catch (RemoteException unused) {
                    }
                }
            }
        };
        Intent intent = new Intent(this.f4299a, MultiInstanceInvalidationService.class);
        Context context2 = this.f4299a;
        if (context2 == null || !(context2 instanceof Context)) {
            context2.bindService(intent, r4, 1);
        } else if (!com.ss.android.ugc.aweme.push.downgrade.d.a(context2, intent)) {
            context2.bindService(intent, r4, 1);
        }
    }
}
