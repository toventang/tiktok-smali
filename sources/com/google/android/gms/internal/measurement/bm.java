package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import androidx.core.content.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class bm implements bi {

    /* renamed from: b  reason: collision with root package name */
    private static bm f50711b;

    /* renamed from: a  reason: collision with root package name */
    final Context f50712a;

    /* renamed from: c  reason: collision with root package name */
    private final ContentObserver f50713c;

    static {
        Covode.recordClassIndex(31679);
    }

    private bm() {
    }

    public static synchronized void a() {
        Context context;
        synchronized (bm.class) {
            MethodCollector.i(8909);
            bm bmVar = f50711b;
            if (!(bmVar == null || (context = bmVar.f50712a) == null || bmVar.f50713c == null)) {
                context.getContentResolver().unregisterContentObserver(f50711b.f50713c);
            }
            f50711b = null;
            MethodCollector.o(8909);
        }
    }

    private bm(Context context) {
        this.f50712a = context;
        bo boVar = new bo();
        this.f50713c = boVar;
        context.getContentResolver().registerContentObserver(bb.f50681a, true, boVar);
    }

    static bm a(Context context) {
        bm bmVar;
        bm bmVar2;
        MethodCollector.i(8619);
        synchronized (bm.class) {
            try {
                if (f50711b == null) {
                    if (c.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        bmVar2 = new bm(context);
                    } else {
                        bmVar2 = new bm();
                    }
                    f50711b = bmVar2;
                }
                bmVar = f50711b;
            } finally {
                MethodCollector.o(8619);
            }
        }
        return bmVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String a(String str) {
        if (this.f50712a == null) {
            return null;
        }
        try {
            return (String) bk.a(new bl(this, str));
        } catch (IllegalStateException | SecurityException unused) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Unable to read GServices for: ".concat(valueOf);
            } else {
                new String("Unable to read GServices for: ");
            }
            return null;
        }
    }
}
