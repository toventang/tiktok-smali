package androidx.browser.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.a.a;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.push.downgrade.d;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final android.support.a.b f1754a;

    /* renamed from: b  reason: collision with root package name */
    private final ComponentName f1755b;

    static {
        Covode.recordClassIndex(536);
    }

    public final boolean a() {
        try {
            return this.f1754a.a(0);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final e b() {
        AnonymousClass2 r3 = new a.AbstractBinderC0001a(null) {
            /* class androidx.browser.a.b.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f1757a = null;

            /* renamed from: c  reason: collision with root package name */
            private Handler f1759c = new Handler(Looper.getMainLooper());

            static {
                Covode.recordClassIndex(538);
            }

            @Override // android.support.a.a
            public final void a(final Bundle bundle) {
                if (this.f1757a != null) {
                    this.f1759c.post(new Runnable() {
                        /* class androidx.browser.a.b.AnonymousClass2.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(541);
                        }

                        public final void run() {
                        }
                    });
                }
            }

            @Override // android.support.a.a
            public final void a(final int i2, final Bundle bundle) {
                if (this.f1757a != null) {
                    this.f1759c.post(new Runnable() {
                        /* class androidx.browser.a.b.AnonymousClass2.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(539);
                        }

                        public final void run() {
                        }
                    });
                }
            }

            @Override // android.support.a.a
            public final void b(final String str, final Bundle bundle) {
                if (this.f1757a != null) {
                    this.f1759c.post(new Runnable() {
                        /* class androidx.browser.a.b.AnonymousClass2.AnonymousClass4 */

                        static {
                            Covode.recordClassIndex(542);
                        }

                        public final void run() {
                        }
                    });
                }
            }

            @Override // android.support.a.a
            public final void a(final String str, final Bundle bundle) {
                if (this.f1757a != null) {
                    this.f1759c.post(new Runnable() {
                        /* class androidx.browser.a.b.AnonymousClass2.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(540);
                        }

                        public final void run() {
                        }
                    });
                }
            }

            @Override // android.support.a.a
            public final void a(final int i2, final Uri uri, final boolean z, final Bundle bundle) {
                if (this.f1757a != null) {
                    this.f1759c.post(new Runnable() {
                        /* class androidx.browser.a.b.AnonymousClass2.AnonymousClass5 */

                        static {
                            Covode.recordClassIndex(543);
                        }

                        public final void run() {
                        }
                    });
                }
            }
        };
        try {
            if (!this.f1754a.a(r3)) {
                return null;
            }
            return new e(this.f1754a, r3, this.f1755b);
        } catch (RemoteException unused) {
            return null;
        }
    }

    b(android.support.a.b bVar, ComponentName componentName) {
        this.f1754a = bVar;
        this.f1755b = componentName;
    }

    public static boolean a(Context context, String str) {
        if (str == null) {
            return false;
        }
        final Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        try {
            return a(applicationContext, str, new d() {
                /* class androidx.browser.a.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(537);
                }

                public final void onServiceDisconnected(ComponentName componentName) {
                }

                @Override // androidx.browser.a.d
                public final void a(b bVar) {
                    bVar.a();
                    applicationContext.unbindService(this);
                }
            });
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean a(Context context, String str, d dVar) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        if (context == null || !(context instanceof Context)) {
            return context.bindService(intent, dVar, 33);
        }
        if (d.a(context, intent)) {
            return true;
        }
        return context.bindService(intent, dVar, 33);
    }
}
