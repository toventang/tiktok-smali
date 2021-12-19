package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Arrays;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f50414a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static i f50415b;

    /* access modifiers changed from: protected */
    public abstract boolean a(a aVar, ServiceConnection serviceConnection);

    /* access modifiers changed from: protected */
    public abstract void b(a aVar, ServiceConnection serviceConnection);

    /* access modifiers changed from: protected */
    public static final class a {

        /* renamed from: f  reason: collision with root package name */
        private static final Uri f50416f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

        /* renamed from: a  reason: collision with root package name */
        public final String f50417a;

        /* renamed from: b  reason: collision with root package name */
        public final ComponentName f50418b = null;

        /* renamed from: c  reason: collision with root package name */
        public final int f50419c;

        /* renamed from: d  reason: collision with root package name */
        private final String f50420d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f50421e;

        public final String toString() {
            String str = this.f50420d;
            if (str == null) {
                return this.f50418b.flattenToString();
            }
            return str;
        }

        static {
            Covode.recordClassIndex(31405);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f50420d, this.f50417a, this.f50418b, Integer.valueOf(this.f50419c), Boolean.valueOf(this.f50421e)});
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!p.a(this.f50420d, aVar.f50420d) || !p.a(this.f50417a, aVar.f50417a) || !p.a(this.f50418b, aVar.f50418b) || this.f50419c != aVar.f50419c || this.f50421e != aVar.f50421e) {
                return false;
            }
            return true;
        }

        public final Intent a(Context context) {
            Intent component;
            MethodCollector.i(10651);
            if (this.f50420d != null) {
                if (this.f50421e) {
                    Bundle bundle = new Bundle();
                    bundle.putString("serviceActionBundleKey", this.f50420d);
                    Bundle call = context.getContentResolver().call(f50416f, "serviceIntentCall", (String) null, bundle);
                    if (call == null || (component = (Intent) call.getParcelable("serviceResponseIntentKey")) == null) {
                        String valueOf = String.valueOf(this.f50420d);
                        if (valueOf.length() != 0) {
                            "Dynamic lookup for intent failed for action: ".concat(valueOf);
                        } else {
                            new String("Dynamic lookup for intent failed for action: ");
                        }
                    }
                }
                component = new Intent(this.f50420d).setPackage(this.f50417a);
            } else {
                component = new Intent().setComponent(this.f50418b);
            }
            MethodCollector.o(10651);
            return component;
        }

        public a(String str, String str2, int i2, boolean z) {
            this.f50420d = r.a(str);
            this.f50417a = r.a(str2);
            this.f50419c = i2;
            this.f50421e = z;
        }
    }

    static {
        Covode.recordClassIndex(31404);
    }

    public static i a(Context context) {
        synchronized (f50414a) {
            if (f50415b == null) {
                Context applicationContext = context.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                    if (applicationContext == null) {
                        applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                    }
                }
                f50415b = new ag(applicationContext);
            }
        }
        return f50415b;
    }

    public final void a(String str, String str2, int i2, ServiceConnection serviceConnection, boolean z) {
        b(new a(str, str2, i2, z), serviceConnection);
    }
}
