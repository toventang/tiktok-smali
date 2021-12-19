package com.twitter.sdk.android.core.internal;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.twitter.sdk.android.core.f;
import com.twitter.sdk.android.core.internal.b.b;
import com.twitter.sdk.android.core.internal.b.c;
import com.twitter.sdk.android.core.k;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

public final class l {

    /* renamed from: f  reason: collision with root package name */
    private static final Pattern f155975f = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: g  reason: collision with root package name */
    private static final String f155976g = Pattern.quote("/");

    /* renamed from: a  reason: collision with root package name */
    public final boolean f155977a;

    /* renamed from: b  reason: collision with root package name */
    public final String f155978b;

    /* renamed from: c  reason: collision with root package name */
    c f155979c;

    /* renamed from: d  reason: collision with root package name */
    b f155980d;

    /* renamed from: e  reason: collision with root package name */
    boolean f155981e;

    /* renamed from: h  reason: collision with root package name */
    private final ReentrantLock f155982h;

    /* renamed from: i  reason: collision with root package name */
    private final b f155983i;

    static {
        Covode.recordClassIndex(103638);
    }

    public final String a() {
        if (!this.f155977a) {
            return "";
        }
        String string = this.f155983i.a().getString("installation_uuid", null);
        if (string == null) {
            return c();
        }
        return string;
    }

    private String c() {
        this.f155982h.lock();
        try {
            String str = null;
            String string = this.f155983i.a().getString("installation_uuid", null);
            if (string == null) {
                String uuid = UUID.randomUUID().toString();
                if (uuid != null) {
                    str = f155975f.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
                }
                b bVar = this.f155983i;
                bVar.a(bVar.b().putString("installation_uuid", str));
                string = str;
            }
            return string;
        } finally {
            this.f155982h.unlock();
        }
    }

    public final synchronized b b() {
        b bVar;
        MethodCollector.i(11630);
        if (!this.f155981e) {
            c cVar = this.f155979c;
            b bVar2 = new b(cVar.f155960a.a().getString("advertising_id", ""), cVar.f155960a.a().getBoolean("limit_ad_tracking_enabled", false));
            if (c.b(bVar2)) {
                k.c().b();
                new Thread(new d(cVar, bVar2)).start();
            } else {
                bVar2 = cVar.a();
                cVar.a(bVar2);
            }
            this.f155980d = bVar2;
            this.f155981e = true;
        }
        bVar = this.f155980d;
        MethodCollector.o(11630);
        return bVar;
    }

    public l(Context context) {
        this(context, new c(context, "com.twitter.sdk.android.AdvertisingPreferences"));
    }

    private l(Context context, b bVar) {
        this(context, bVar, new c(context, bVar));
    }

    private l(Context context, b bVar, c cVar) {
        this.f155982h = new ReentrantLock();
        if (context != null) {
            this.f155978b = context.getPackageName();
            this.f155979c = cVar;
            this.f155983i = bVar;
            boolean a2 = g.a(context, "com.twitter.sdk.android.COLLECT_IDENTIFIERS_ENABLED", true);
            this.f155977a = a2;
            if (!a2) {
                f c2 = k.c();
                context.getPackageName();
                c2.b();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("appContext must not be null");
    }
}
