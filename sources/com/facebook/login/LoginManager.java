package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.AccessToken;
import com.facebook.FacebookActivity;
import com.facebook.Profile;
import com.facebook.h;
import com.facebook.internal.ae;
import com.facebook.internal.e;
import com.facebook.internal.g;
import com.facebook.internal.s;
import com.facebook.j;
import com.facebook.login.LoginClient;
import com.facebook.m;
import com.ss.android.ugc.aweme.bf.d;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class LoginManager {

    /* renamed from: d  reason: collision with root package name */
    private static final Set<String> f48831d = Collections.unmodifiableSet(new HashSet<String>() {
        /* class com.facebook.login.LoginManager.AnonymousClass2 */

        static {
            Covode.recordClassIndex(29443);
        }

        {
            add("ads_management");
            add("create_event");
            add("rsvp_event");
        }
    });

    /* renamed from: e  reason: collision with root package name */
    private static volatile LoginManager f48832e;

    /* renamed from: a  reason: collision with root package name */
    public d f48833a = d.NATIVE_WITH_FALLBACK;

    /* renamed from: b  reason: collision with root package name */
    public b f48834b = b.FRIENDS;

    /* renamed from: c  reason: collision with root package name */
    public String f48835c = "rerequest";

    /* renamed from: f  reason: collision with root package name */
    private final SharedPreferences f48836f;

    public static class a implements h {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f48840a;

        static {
            Covode.recordClassIndex(29445);
        }

        @Override // com.facebook.login.h
        public final Activity a() {
            return this.f48840a;
        }

        public a(Activity activity) {
            ae.a((Object) activity, "activity");
            this.f48840a = activity;
        }

        @Override // com.facebook.login.h
        public final void a(Intent intent, int i2) {
            this.f48840a.startActivityForResult(intent, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r5 == false) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r13, android.content.Intent r14, com.facebook.h<com.facebook.login.g> r15) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginManager.a(int, android.content.Intent, com.facebook.h):boolean");
    }

    public final void a(h hVar, LoginClient.Request request) {
        a(hVar.a(), request);
        e.a(e.b.Login.toRequestCode(), new e.a() {
            /* class com.facebook.login.LoginManager.AnonymousClass3 */

            static {
                Covode.recordClassIndex(29444);
            }

            @Override // com.facebook.internal.e.a
            public final boolean a(int i2, Intent intent) {
                return LoginManager.this.a(i2, intent, null);
            }
        });
        if (!b(hVar, request)) {
            j jVar = new j("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            a(hVar.a(), LoginClient.Result.a.ERROR, null, jVar, false, request);
            throw jVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static class b implements h {

        /* renamed from: a  reason: collision with root package name */
        private final s f48841a;

        static {
            Covode.recordClassIndex(29446);
        }

        @Override // com.facebook.login.h
        public final Activity a() {
            return this.f48841a.a();
        }

        b(s sVar) {
            ae.a(sVar, "fragment");
            this.f48841a = sVar;
        }

        @Override // com.facebook.login.h
        public final void a(Intent intent, int i2) {
            this.f48841a.a(intent, i2);
        }
    }

    public final void b() {
        AccessToken.a((AccessToken) null);
        Profile.a(null);
        a(false);
    }

    static {
        Covode.recordClassIndex(29441);
    }

    public static LoginManager a() {
        MethodCollector.i(9764);
        if (f48832e == null) {
            synchronized (LoginManager.class) {
                try {
                    if (f48832e == null) {
                        f48832e = new LoginManager();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9764);
                    throw th;
                }
            }
        }
        LoginManager loginManager = f48832e;
        MethodCollector.o(9764);
        return loginManager;
    }

    LoginManager() {
        ae.a();
        ae.a();
        this.f48836f = d.a(m.f48921g, "com.facebook.loginManager", 0);
        if (m.f48923i && g.a() != null) {
            a aVar = new a();
            ae.a();
            androidx.browser.a.b.a(m.f48921g, "com.android.chrome", aVar);
            ae.a();
            Context context = m.f48921g;
            ae.a();
            androidx.browser.a.b.a(context, m.f48921g.getPackageName());
        }
    }

    private void a(boolean z) {
        SharedPreferences.Editor edit = this.f48836f.edit();
        edit.putBoolean("express_login_allowed", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private static f f48842a;

        static {
            Covode.recordClassIndex(29447);
        }

        public static synchronized f a(Context context) {
            synchronized (c.class) {
                MethodCollector.i(9206);
                if (context == null) {
                    ae.a();
                    context = m.f48921g;
                    if (context == null) {
                        MethodCollector.o(9206);
                        return null;
                    }
                }
                if (f48842a == null) {
                    ae.a();
                    f48842a = new f(context, m.f48915a);
                }
                f fVar = f48842a;
                MethodCollector.o(9206);
                return fVar;
            }
        }
    }

    static boolean a(String str) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("publish") || str.startsWith("manage") || f48831d.contains(str)) {
            return true;
        }
        return false;
    }

    public final LoginClient.Request a(Collection<String> collection) {
        HashSet hashSet;
        d dVar = this.f48833a;
        if (collection == null) {
            hashSet = new HashSet();
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        b bVar = this.f48834b;
        String str = this.f48835c;
        ae.a();
        LoginClient.Request request = new LoginClient.Request(dVar, unmodifiableSet, bVar, str, m.f48915a, UUID.randomUUID().toString());
        request.f48816f = AccessToken.a();
        return request;
    }

    private static void a(Context context, LoginClient.Request request) {
        f a2 = c.a(context);
        if (a2 != null && request != null) {
            a2.a(request);
        }
    }

    private static boolean b(h hVar, LoginClient.Request request) {
        Intent intent = new Intent();
        ae.a();
        intent.setClass(m.f48921g, FacebookActivity.class);
        intent.setAction(request.f48811a.toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        ae.a();
        if (m.f48921g.getPackageManager().resolveActivity(intent, 0) == null) {
            return false;
        }
        try {
            hVar.a(intent, e.b.Login.toRequestCode());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    public final void a(com.facebook.e eVar, final h<g> hVar) {
        if (eVar instanceof e) {
            ((e) eVar).b(e.b.Login.toRequestCode(), new e.a() {
                /* class com.facebook.login.LoginManager.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(29442);
                }

                @Override // com.facebook.internal.e.a
                public final boolean a(int i2, Intent intent) {
                    return LoginManager.this.a(i2, intent, hVar);
                }
            });
            return;
        }
        throw new j("Unexpected CallbackManager, please use the provided Factory.");
    }

    public final void a(s sVar, Collection<String> collection) {
        a(new b(sVar), a(collection));
    }

    private static void a(Context context, LoginClient.Result.a aVar, Map<String, String> map, Exception exc, boolean z, LoginClient.Request request) {
        String str;
        f a2 = c.a(context);
        if (a2 != null) {
            if (request == null) {
                a2.a("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
                return;
            }
            HashMap hashMap = new HashMap();
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("try_login_activity", str);
            a2.a(request.f48815e, hashMap, aVar, map, exc);
        }
    }
}
