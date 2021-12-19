package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.c.h;
import com.google.android.gms.common.util.k;
import java.util.concurrent.ExecutorService;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f54450a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static av f54451b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f54452c;

    /* renamed from: d  reason: collision with root package name */
    private final ExecutorService f54453d;

    static {
        Covode.recordClassIndex(33798);
    }

    @Override // com.google.firebase.iid.a
    public final h<Integer> a(Intent intent) {
        boolean z;
        String a2 = a(intent, "gcm.rawData64");
        boolean z2 = false;
        if (a2 != null) {
            intent.putExtra("rawData", Base64.decode(a2, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = this.f54452c;
        if (!k.e() || context.getApplicationInfo().targetSdkVersion < 26) {
            z = false;
        } else {
            z = true;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z2 = true;
        }
        if (!z || z2) {
            return com.google.android.gms.c.k.a(this.f54453d, new c(context, intent)).b(this.f54453d, new d(context, intent));
        }
        return a(context, intent);
    }

    public b(Context context, ExecutorService executorService) {
        this.f54452c = context;
        this.f54453d = executorService;
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    static h<Integer> a(Context context, Intent intent) {
        return a(context, "com.google.firebase.MESSAGING_EVENT").a(intent).a(g.f54460a, e.f54458a);
    }

    private static av a(Context context, String str) {
        av avVar;
        MethodCollector.i(13444);
        synchronized (f54450a) {
            try {
                if (f54451b == null) {
                    f54451b = new av(context, str);
                }
                avVar = f54451b;
            } finally {
                MethodCollector.o(13444);
            }
        }
        return avVar;
    }
}
