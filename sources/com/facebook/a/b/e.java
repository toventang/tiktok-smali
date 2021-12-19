package com.facebook.a.b;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.a.b.a.f;
import com.facebook.a.e.b;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.internal.u;
import com.facebook.internal.w;
import com.facebook.m;
import com.facebook.r;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class e {

    /* renamed from: a  reason: collision with root package name */
    static final String f46673a = e.class.getCanonicalName();

    /* renamed from: f  reason: collision with root package name */
    private static e f46674f;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference<Activity> f46675b;

    /* renamed from: c  reason: collision with root package name */
    public Timer f46676c;

    /* renamed from: d  reason: collision with root package name */
    String f46677d = null;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f46678e = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(28442);
    }

    static /* synthetic */ String b() {
        if (com.facebook.internal.a.b.a.a(e.class)) {
            return null;
        }
        try {
            return f46673a;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, e.class);
            return null;
        }
    }

    static class a implements Callable<String> {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<View> f46684a;

        static {
            Covode.recordClassIndex(28447);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ String call() {
            MethodCollector.i(85);
            View view = this.f46684a.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                MethodCollector.o(85);
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            MethodCollector.o(85);
            return encodeToString;
        }

        a(View view) {
            this.f46684a = new WeakReference<>(view);
        }
    }

    public final void a() {
        if (!com.facebook.internal.a.b.a.a(this)) {
            try {
                final AnonymousClass1 r2 = new TimerTask() {
                    /* class com.facebook.a.b.e.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(28443);
                    }

                    public final void run() {
                        try {
                            Activity activity = (Activity) e.a(e.this).get();
                            View a2 = b.a(activity);
                            if (activity != null && a2 != null) {
                                String simpleName = activity.getClass().getSimpleName();
                                if (b.c()) {
                                    String str = "";
                                    if (u.a()) {
                                        com.facebook.a.b.a.e.a("UnityFacebookSDKPlugin", "CaptureViewHierarchy", str);
                                        return;
                                    }
                                    FutureTask futureTask = new FutureTask(new a(a2));
                                    e.b(e.this).post(futureTask);
                                    try {
                                        str = (String) futureTask.get(1, TimeUnit.SECONDS);
                                    } catch (Exception unused) {
                                        e.b();
                                    }
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("screenname", simpleName);
                                        jSONObject.put("screenshot", str);
                                        JSONArray jSONArray = new JSONArray();
                                        jSONArray.put(f.c(a2));
                                        jSONObject.put("view", jSONArray);
                                    } catch (JSONException unused2) {
                                        e.b();
                                    }
                                    String jSONObject2 = jSONObject.toString();
                                    e eVar = e.this;
                                    if (!com.facebook.internal.a.b.a.a(e.class)) {
                                        try {
                                            if (!com.facebook.internal.a.b.a.a(eVar)) {
                                                try {
                                                    m.c().execute(new Runnable(jSONObject2) {
                                                        /* class com.facebook.a.b.e.AnonymousClass3 */

                                                        /* renamed from: a  reason: collision with root package name */
                                                        final /* synthetic */ String f46682a;

                                                        static {
                                                            Covode.recordClassIndex(28445);
                                                        }

                                                        public final void run() {
                                                            if (!com.facebook.internal.a.b.a.a(this)) {
                                                                try {
                                                                    String b2 = ad.b("MD5", this.f46682a);
                                                                    AccessToken accessToken = com.facebook.b.a().f46926b;
                                                                    if (b2 == null || !b2.equals(e.e(e.this))) {
                                                                        String str = this.f46682a;
                                                                        ae.a();
                                                                        GraphRequest a2 = e.a(str, accessToken, m.f48915a, "app_indexing");
                                                                        e eVar = e.this;
                                                                        if (!com.facebook.internal.a.b.a.a(eVar) && a2 != null) {
                                                                            try {
                                                                                try {
                                                                                    JSONObject jSONObject = GraphRequest.a(a2).f49017b;
                                                                                    if (jSONObject != null) {
                                                                                        if ("true".equals(jSONObject.optString("success"))) {
                                                                                            w.a(com.facebook.u.APP_EVENTS, e.f46673a, "Successfully send UI component tree to server");
                                                                                            eVar.f46677d = b2;
                                                                                        }
                                                                                        if (jSONObject.has("is_app_indexing_enabled")) {
                                                                                            Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("is_app_indexing_enabled"));
                                                                                            if (!com.facebook.internal.a.b.a.a(b.class)) {
                                                                                                try {
                                                                                                    b.f46642e.set(valueOf.booleanValue());
                                                                                                } catch (Throwable th) {
                                                                                                    com.facebook.internal.a.b.a.a(th, b.class);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } catch (JSONException unused) {
                                                                                }
                                                                            } catch (Throwable th2) {
                                                                                com.facebook.internal.a.b.a.a(th2, eVar);
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (Throwable th3) {
                                                                    com.facebook.internal.a.b.a.a(th3, this);
                                                                }
                                                            }
                                                        }

                                                        {
                                                            this.f46682a = r2;
                                                        }
                                                    });
                                                } catch (Throwable th) {
                                                    com.facebook.internal.a.b.a.a(th, eVar);
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            com.facebook.internal.a.b.a.a(th2, e.class);
                                        }
                                    }
                                }
                            }
                        } catch (Exception unused3) {
                            e.b();
                        }
                    }
                };
                try {
                    m.c().execute(new Runnable() {
                        /* class com.facebook.a.b.e.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(28444);
                        }

                        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
                            com.facebook.a.b.e.b();
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
                            r0 = move-exception;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
                            com.facebook.internal.a.b.a.a(r0, r6);
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
                            return;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
                            return;
                         */
                        /* JADX WARNING: Failed to process nested try/catch */
                        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0037 */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void run() {
                            /*
                                r6 = this;
                                boolean r0 = com.facebook.internal.a.b.a.a(r6)
                                if (r0 == 0) goto L_0x0007
                                return
                            L_0x0007:
                                com.facebook.a.b.e r0 = com.facebook.a.b.e.this     // Catch:{ Exception -> 0x0037 }
                                java.util.Timer r0 = com.facebook.a.b.e.c(r0)     // Catch:{ Exception -> 0x0037 }
                                if (r0 == 0) goto L_0x0018
                                com.facebook.a.b.e r0 = com.facebook.a.b.e.this     // Catch:{ Exception -> 0x0037 }
                                java.util.Timer r0 = com.facebook.a.b.e.c(r0)     // Catch:{ Exception -> 0x0037 }
                                r0.cancel()     // Catch:{ Exception -> 0x0037 }
                            L_0x0018:
                                com.facebook.a.b.e r0 = com.facebook.a.b.e.this     // Catch:{ Exception -> 0x0037 }
                                com.facebook.a.b.e.d(r0)     // Catch:{ Exception -> 0x0037 }
                                com.facebook.a.b.e r1 = com.facebook.a.b.e.this     // Catch:{ Exception -> 0x0037 }
                                java.util.Timer r0 = new java.util.Timer     // Catch:{ Exception -> 0x0037 }
                                r0.<init>()     // Catch:{ Exception -> 0x0037 }
                                com.facebook.a.b.e.a(r1, r0)     // Catch:{ Exception -> 0x0037 }
                                com.facebook.a.b.e r0 = com.facebook.a.b.e.this     // Catch:{ Exception -> 0x0037 }
                                java.util.Timer r0 = com.facebook.a.b.e.c(r0)     // Catch:{ Exception -> 0x0037 }
                                java.util.TimerTask r1 = r2     // Catch:{ Exception -> 0x0037 }
                                r2 = 0
                                r4 = 1000(0x3e8, double:4.94E-321)
                                r0.scheduleAtFixedRate(r1, r2, r4)     // Catch:{ Exception -> 0x0037 }
                                return
                            L_0x0037:
                                com.facebook.a.b.e.b()     // Catch:{ all -> 0x003b }
                                goto L_0x0040
                            L_0x003b:
                                r0 = move-exception
                                com.facebook.internal.a.b.a.a(r0, r6)
                                return
                            L_0x0040:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.facebook.a.b.e.AnonymousClass2.run():void");
                        }
                    });
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, this);
            }
        }
    }

    public e(Activity activity) {
        this.f46675b = new WeakReference<>(activity);
        f46674f = this;
    }

    static /* synthetic */ WeakReference a(e eVar) {
        if (com.facebook.internal.a.b.a.a(e.class)) {
            return null;
        }
        try {
            return eVar.f46675b;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, e.class);
            return null;
        }
    }

    static /* synthetic */ Handler b(e eVar) {
        if (com.facebook.internal.a.b.a.a(e.class)) {
            return null;
        }
        try {
            return eVar.f46678e;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, e.class);
            return null;
        }
    }

    static /* synthetic */ Timer c(e eVar) {
        if (com.facebook.internal.a.b.a.a(e.class)) {
            return null;
        }
        try {
            return eVar.f46676c;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, e.class);
            return null;
        }
    }

    static /* synthetic */ String d(e eVar) {
        if (com.facebook.internal.a.b.a.a(e.class)) {
            return null;
        }
        try {
            eVar.f46677d = null;
            return null;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, e.class);
            return null;
        }
    }

    static /* synthetic */ String e(e eVar) {
        if (com.facebook.internal.a.b.a.a(e.class)) {
            return null;
        }
        try {
            return eVar.f46677d;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, e.class);
            return null;
        }
    }

    static /* synthetic */ Timer a(e eVar, Timer timer) {
        if (com.facebook.internal.a.b.a.a(e.class)) {
            return null;
        }
        try {
            eVar.f46676c = timer;
            return timer;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, e.class);
            return null;
        }
    }

    public static GraphRequest a(String str, AccessToken accessToken, String str2, String str3) {
        if (com.facebook.internal.a.b.a.a(e.class) || str == null) {
            return null;
        }
        try {
            GraphRequest a2 = GraphRequest.a(accessToken, com.a.a(Locale.US, "%s/app_indexing", new Object[]{str2}), (JSONObject) null, (GraphRequest.b) null);
            Bundle bundle = a2.f46548j;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("tree", str);
            bundle.putString("app_version", b.a());
            bundle.putString("platform", "android");
            bundle.putString("request_type", str3);
            if (str3.equals("app_indexing")) {
                bundle.putString("device_session_id", b.b());
            }
            a2.f46548j = bundle;
            a2.a((GraphRequest.b) new GraphRequest.b() {
                /* class com.facebook.a.b.e.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(28446);
                }

                @Override // com.facebook.GraphRequest.b
                public final void a(r rVar) {
                    w.a(com.facebook.u.APP_EVENTS, e.b(), "App index sent to FB!");
                }
            });
            return a2;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, e.class);
            return null;
        }
    }
}
