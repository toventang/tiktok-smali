package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.q;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    private static volatile b f46924d;

    /* renamed from: a  reason: collision with root package name */
    final a f46925a;

    /* renamed from: b  reason: collision with root package name */
    public AccessToken f46926b;

    /* renamed from: c  reason: collision with root package name */
    public AtomicBoolean f46927c = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private final LocalBroadcastManager f46928e;

    /* renamed from: f  reason: collision with root package name */
    private Date f46929f = new Date(0);

    static {
        Covode.recordClassIndex(28558);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f46947a;

        /* renamed from: b  reason: collision with root package name */
        public int f46948b;

        /* renamed from: c  reason: collision with root package name */
        public Long f46949c;

        /* renamed from: d  reason: collision with root package name */
        public String f46950d;

        static {
            Covode.recordClassIndex(28563);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static b a() {
        MethodCollector.i(247);
        if (f46924d == null) {
            synchronized (b.class) {
                try {
                    if (f46924d == null) {
                        ae.a();
                        f46924d = new b(LocalBroadcastManager.getInstance(m.f48921g), new a());
                    }
                } catch (Throwable th) {
                    MethodCollector.o(247);
                    throw th;
                }
            }
        }
        b bVar = f46924d;
        MethodCollector.o(247);
        return bVar;
    }

    private static void c() {
        ae.a();
        Context context = m.f48921g;
        AccessToken accessToken = a().f46926b;
        AlarmManager alarmManager = (AlarmManager) a(context, "alarm");
        if (AccessToken.a() && accessToken.f46494a != null && alarmManager != null) {
            Intent intent = new Intent(context, CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, accessToken.f46494a.getTime(), PendingIntent.getBroadcast(context, 0, intent, 0));
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (this.f46926b != null) {
            Long valueOf = Long.valueOf(new Date().getTime());
            if (this.f46926b.f46499f.canExtendToken && valueOf.longValue() - this.f46929f.getTime() > 3600000 && valueOf.longValue() - this.f46926b.f46500g.getTime() > 86400000) {
                if (Looper.getMainLooper().equals(Looper.myLooper())) {
                    a(null);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        /* class com.facebook.b.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AccessToken.a f46930a = null;

                        static {
                            Covode.recordClassIndex(28559);
                        }

                        public final void run() {
                            if (!com.facebook.internal.a.b.a.a(this)) {
                                try {
                                    b.this.a(this.f46930a);
                                } catch (Throwable th) {
                                    com.facebook.internal.a.b.a.a(th, this);
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    public final void a(final AccessToken.a aVar) {
        final AccessToken accessToken = this.f46926b;
        if (accessToken == null) {
            if (aVar != null) {
                new j("No current access token to refresh");
            }
        } else if (this.f46927c.compareAndSet(false, true)) {
            this.f46929f = new Date();
            final HashSet hashSet = new HashSet();
            final HashSet hashSet2 = new HashSet();
            final HashSet hashSet3 = new HashSet();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final a aVar2 = new a((byte) 0);
            q qVar = new q(a(accessToken, new GraphRequest.b() {
                /* class com.facebook.b.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(28560);
                }

                @Override // com.facebook.GraphRequest.b
                public final void a(r rVar) {
                    JSONArray optJSONArray;
                    JSONObject jSONObject = rVar.f49017b;
                    if (!(jSONObject == null || (optJSONArray = jSONObject.optJSONArray("data")) == null)) {
                        atomicBoolean.set(true);
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                            if (optJSONObject != null) {
                                String optString = optJSONObject.optString("permission");
                                String optString2 = optJSONObject.optString("status");
                                if (!ad.a(optString) && !ad.a(optString2)) {
                                    String lowerCase = optString2.toLowerCase(Locale.US);
                                    if (lowerCase.equals("granted")) {
                                        hashSet.add(optString);
                                    } else if (lowerCase.equals("declined")) {
                                        hashSet2.add(optString);
                                    } else if (lowerCase.equals("expired")) {
                                        hashSet3.add(optString);
                                    }
                                }
                            }
                        }
                    }
                }
            }), b(accessToken, new GraphRequest.b() {
                /* class com.facebook.b.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(28561);
                }

                @Override // com.facebook.GraphRequest.b
                public final void a(r rVar) {
                    JSONObject jSONObject = rVar.f49017b;
                    if (jSONObject != null) {
                        aVar2.f46947a = jSONObject.optString("access_token");
                        aVar2.f46948b = jSONObject.optInt("expires_at");
                        aVar2.f46949c = Long.valueOf(jSONObject.optLong("data_access_expiration_time"));
                        aVar2.f46950d = jSONObject.optString("graph_domain", null);
                    }
                }
            }));
            qVar.a(new q.a() {
                /* class com.facebook.b.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(28562);
                }

                @Override // com.facebook.q.a
                public final void a() {
                    String str;
                    Set<String> set;
                    Set<String> set2;
                    Set<String> set3;
                    Date date;
                    Date date2;
                    try {
                        if (b.a().f46926b == null || b.a().f46926b.f46502i != accessToken.f46502i) {
                            if (aVar != null) {
                                new j("No current access token to refresh");
                            }
                        } else if (atomicBoolean.get() || aVar2.f46947a != null || aVar2.f46948b != 0) {
                            if (aVar2.f46947a != null) {
                                str = aVar2.f46947a;
                            } else {
                                str = accessToken.f46498e;
                            }
                            String str2 = accessToken.f46501h;
                            String str3 = accessToken.f46502i;
                            if (atomicBoolean.get()) {
                                set = hashSet;
                            } else {
                                set = accessToken.f46495b;
                            }
                            if (atomicBoolean.get()) {
                                set2 = hashSet2;
                            } else {
                                set2 = accessToken.f46496c;
                            }
                            if (atomicBoolean.get()) {
                                set3 = hashSet3;
                            } else {
                                set3 = accessToken.f46497d;
                            }
                            c cVar = accessToken.f46499f;
                            if (aVar2.f46948b != 0) {
                                date = new Date(((long) aVar2.f46948b) * 1000);
                            } else {
                                date = accessToken.f46494a;
                            }
                            Date date3 = new Date();
                            if (aVar2.f46949c != null) {
                                date2 = new Date(1000 * aVar2.f46949c.longValue());
                            } else {
                                date2 = accessToken.f46503j;
                            }
                            b.a().a(new AccessToken(str, str2, str3, set, set2, set3, cVar, date, date3, date2, aVar2.f46950d), true);
                            b.this.f46927c.set(false);
                            AccessToken.a aVar = aVar;
                        } else if (aVar != null) {
                            new j("Failed to refresh access token");
                        }
                    } finally {
                        b.this.f46927c.set(false);
                    }
                }
            });
            GraphRequest.b(qVar);
        } else if (aVar != null) {
            new j("Refresh already in progress");
        }
    }

    private static GraphRequest a(AccessToken accessToken, GraphRequest.b bVar) {
        return new GraphRequest(accessToken, "me/permissions", new Bundle(), s.GET, bVar);
    }

    private static GraphRequest b(AccessToken accessToken, GraphRequest.b bVar) {
        Bundle bundle = new Bundle();
        bundle.putString("grant_type", "fb_extend_sso_token");
        bundle.putString("client_id", accessToken.f46501h);
        return new GraphRequest(accessToken, "oauth/access_token", bundle, s.GET, bVar);
    }

    private b(LocalBroadcastManager localBroadcastManager, a aVar) {
        ae.a(localBroadcastManager, "localBroadcastManager");
        ae.a(aVar, "accessTokenCache");
        this.f46928e = localBroadcastManager;
        this.f46925a = aVar;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(253);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(253);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* access modifiers changed from: package-private */
    public final void a(AccessToken accessToken, AccessToken accessToken2) {
        ae.a();
        Intent intent = new Intent(m.f48921g, CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f46928e.sendBroadcast(intent);
    }

    /* access modifiers changed from: package-private */
    public final void a(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.f46926b;
        this.f46926b = accessToken;
        this.f46927c.set(false);
        this.f46929f = new Date(0);
        if (z) {
            if (accessToken != null) {
                this.f46925a.a(accessToken);
            } else {
                this.f46925a.b();
                ae.a();
                try {
                    ad.b(m.f48921g);
                } catch (Exception unused) {
                }
            }
        }
        if (!ad.a(accessToken2, accessToken)) {
            a(accessToken2, accessToken);
            c();
        }
    }
}
