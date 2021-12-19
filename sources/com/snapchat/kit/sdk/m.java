package com.snapchat.kit.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.snapchat.kit.sdk.a.a;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.snapchat.kit.sdk.core.networking.CompletionCallback;
import com.snapchat.kit.sdk.core.networking.FirebaseTokenManager;
import com.snapchat.kit.sdk.core.networking.RefreshAccessTokenResult;
import com.snapchat.kit.sdk.core.networking.l;
import com.snapchat.kit.sdk.core.security.SecureSharedPreferences;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class m implements AuthTokenManager, FirebaseTokenManager {

    /* renamed from: a  reason: collision with root package name */
    static final Set<String> f57343a = new HashSet<String>() {
        /* class com.snapchat.kit.sdk.m.AnonymousClass1 */

        static {
            Covode.recordClassIndex(35851);
        }

        {
            add("invalid_grant");
            add("invalid_request");
            add("invalid_scope");
            add("unsupported_grant_type");
        }
    };

    /* renamed from: b  reason: collision with root package name */
    final String f57344b;

    /* renamed from: c  reason: collision with root package name */
    final String f57345c;

    /* renamed from: d  reason: collision with root package name */
    final List<String> f57346d;

    /* renamed from: e  reason: collision with root package name */
    final com.snapchat.kit.sdk.core.controller.b f57347e;

    /* renamed from: f  reason: collision with root package name */
    final f f57348f;

    /* renamed from: g  reason: collision with root package name */
    final dagger.a<MetricQueue<ServerEvent>> f57349g;

    /* renamed from: h  reason: collision with root package name */
    final com.snapchat.kit.sdk.core.metrics.c.f f57350h;

    /* renamed from: i  reason: collision with root package name */
    com.snapchat.kit.sdk.a.a f57351i;

    /* renamed from: j  reason: collision with root package name */
    final KitPluginType f57352j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f57353k;

    /* renamed from: l  reason: collision with root package name */
    com.snapchat.kit.sdk.core.a.b f57354l;

    /* renamed from: m  reason: collision with root package name */
    public e f57355m;
    int n = 0;
    boolean o;
    private final Context p;
    private final OkHttpClient q;
    private final dagger.a<l> r;
    private final AtomicBoolean s = new AtomicBoolean(false);

    /* access modifiers changed from: package-private */
    public final void a(com.snapchat.kit.sdk.core.a.b bVar, String str, String str2) {
        if (bVar != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && TextUtils.equals(str2, bVar.getState()) && !TextUtils.isEmpty(bVar.getRedirectUri()) && !TextUtils.isEmpty(bVar.getCodeVerifier())) {
            this.n = 0;
            if (this.o) {
                b(bVar, str);
            } else {
                a(bVar, str);
            }
        } else if (this.o) {
            a(com.snapchat.kit.sdk.core.controller.a.INVALID_OAUTH_RESPONSE);
        } else {
            b();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(com.snapchat.kit.sdk.core.controller.a aVar) {
        this.f57349g.get().push(this.f57350h.a(false, true));
        this.f57347e.a(aVar);
    }

    @Override // com.snapchat.kit.sdk.core.networking.AuthTokenManager
    public final String getAccessToken() {
        return this.f57355m.c();
    }

    @Override // com.snapchat.kit.sdk.core.networking.AuthTokenManager
    public final boolean isUserLoggedIn() {
        return this.f57355m.f();
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class c extends Enum<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final int f57370a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f57371b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f57372c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f57373d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f57374e = 5;

        /* renamed from: f  reason: collision with root package name */
        public static final int f57375f = 6;

        /* renamed from: g  reason: collision with root package name */
        private static final /* synthetic */ int[] f57376g = {1, 2, 3, 4, 5, 6};

        public static int[] a() {
            return (int[]) f57376g.clone();
        }

        static {
            Covode.recordClassIndex(35861);
        }
    }

    static {
        Covode.recordClassIndex(35850);
    }

    @Override // com.snapchat.kit.sdk.core.networking.FirebaseTokenManager
    public final void startFirebaseTokenGrant() {
        this.o = true;
        a(new com.snapchat.kit.sdk.core.a.f());
    }

    @Override // com.snapchat.kit.sdk.core.networking.AuthTokenManager
    public final void startTokenGrant() {
        this.o = false;
        a(new com.snapchat.kit.sdk.core.a.f());
    }

    @Override // com.snapchat.kit.sdk.core.networking.AuthTokenManager
    public final void clearToken() {
        boolean f2 = this.f57355m.f();
        this.f57355m.g();
        if (f2) {
            this.f57347e.e();
        }
    }

    /* renamed from: com.snapchat.kit.sdk.m$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f57366a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0015 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0025 */
        static {
            /*
                r0 = 35858(0x8c12, float:5.0248E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                int[] r0 = com.snapchat.kit.sdk.m.c.a()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.snapchat.kit.sdk.m.AnonymousClass5.f57366a = r1
                r3 = 1
                int r0 = com.snapchat.kit.sdk.m.c.f57371b     // Catch:{ NoSuchFieldError -> 0x0015 }
                int r0 = r0 - r3
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                int[] r2 = com.snapchat.kit.sdk.m.AnonymousClass5.f57366a     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = com.snapchat.kit.sdk.m.c.f57370a     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1 - r3
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = com.snapchat.kit.sdk.m.AnonymousClass5.f57366a     // Catch:{ NoSuchFieldError -> 0x0025 }
                int r1 = com.snapchat.kit.sdk.m.c.f57373d     // Catch:{ NoSuchFieldError -> 0x0025 }
                int r1 = r1 - r3
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0025 }
            L_0x0025:
                int[] r2 = com.snapchat.kit.sdk.m.AnonymousClass5.f57366a     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = com.snapchat.kit.sdk.m.c.f57372c     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r1 - r3
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.m.AnonymousClass5.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f57349g.get().push(this.f57350h.a(false, false));
        this.f57347e.d();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:39|40) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a5, code lost:
        if (r5 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r6 = com.snapchat.kit.sdk.m.c.f57373d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f7, code lost:
        r7.s.set(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fc, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00ee */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a() {
        /*
        // Method dump skipped, instructions count: 253
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.m.a():int");
    }

    @Override // com.snapchat.kit.sdk.core.networking.AuthTokenManager
    public final boolean hasAccessToScope(String str) {
        return this.f57355m.a(str);
    }

    @Override // com.snapchat.kit.sdk.core.networking.AuthTokenManager
    public final void startTokenGrantWithOptions(com.snapchat.kit.sdk.core.a.f fVar) {
        this.o = false;
        a(fVar);
    }

    static class a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<m> f57367a;

        static {
            Covode.recordClassIndex(35859);
        }

        private a(m mVar) {
            this.f57367a = new WeakReference<>(mVar);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ Void doInBackground(Void[] voidArr) {
            m mVar = this.f57367a.get();
            if (mVar == null) {
                return null;
            }
            mVar.a();
            return null;
        }

        /* synthetic */ a(m mVar, byte b2) {
            this(mVar);
        }
    }

    @Override // com.snapchat.kit.sdk.core.networking.AuthTokenManager
    public final void refreshAccessToken(RefreshAccessTokenResult refreshAccessTokenResult) {
        new b(this, refreshAccessTokenResult, (byte) 0).execute(new Void[0]);
    }

    static class b extends AsyncTask<Void, Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<m> f57368a;

        /* renamed from: b  reason: collision with root package name */
        private final RefreshAccessTokenResult f57369b;

        static {
            Covode.recordClassIndex(35860);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ Void doInBackground(Void[] voidArr) {
            com.snapchat.kit.sdk.core.networking.b bVar;
            m mVar = this.f57368a.get();
            if (mVar == null) {
                return null;
            }
            int a2 = mVar.a();
            String accessToken = mVar.getAccessToken();
            if (a2 != c.f57374e || accessToken == null) {
                int i2 = AnonymousClass5.f57366a[a2 - 1];
                if (i2 == 1) {
                    bVar = com.snapchat.kit.sdk.core.networking.b.REVOKED_SESSION;
                } else if (i2 == 2) {
                    bVar = com.snapchat.kit.sdk.core.networking.b.NO_REFRESH_TOKEN;
                } else if (i2 == 3) {
                    bVar = com.snapchat.kit.sdk.core.networking.b.NETWORK_ERROR;
                } else if (i2 != 4) {
                    bVar = com.snapchat.kit.sdk.core.networking.b.UNKNOWN;
                } else {
                    bVar = com.snapchat.kit.sdk.core.networking.b.BUSY;
                }
                m.a(mVar, this.f57369b, false, null, bVar);
                return null;
            }
            m.a(mVar, this.f57369b, true, accessToken, null);
            return null;
        }

        private b(m mVar, RefreshAccessTokenResult refreshAccessTokenResult) {
            this.f57368a = new WeakReference<>(mVar);
            this.f57369b = refreshAccessTokenResult;
        }

        /* synthetic */ b(m mVar, RefreshAccessTokenResult refreshAccessTokenResult, byte b2) {
            this(mVar, refreshAccessTokenResult);
        }
    }

    private void a(com.snapchat.kit.sdk.core.a.f fVar) {
        if (!TextUtils.isEmpty(this.f57345c)) {
            List<String> list = this.f57346d;
            if (list == null || list.isEmpty()) {
                throw new IllegalStateException("Valid scopes must be set");
            }
            com.snapchat.kit.sdk.core.a.b a2 = h.a(this.f57344b, this.f57345c, this.f57346d, fVar, this.f57352j, this.f57353k, this.o);
            this.f57354l = a2;
            PackageManager packageManager = this.p.getPackageManager();
            String str = com.snapchat.kit.sdk.b.a.f57077a;
            if (this.n < 3 && com.snapchat.kit.sdk.b.b.a(packageManager, str)) {
                Context context = this.p;
                if (a(context, packageManager, str, a2.toUri("snapchat://", "oauth2", context.getPackageName(), null))) {
                    if (this.o) {
                        this.f57351i.a("authSnapchatForFirebase");
                    } else {
                        this.f57351i.a("authSnapchat");
                    }
                    this.f57349g.get().push(this.f57350h.a(fVar, this.o));
                    this.n++;
                    return;
                }
            }
            Uri uri = a2.toUri("https://accounts.snapchat.com/accounts", "/oauth2/auth", null, "snapkit_web");
            if (this.o) {
                this.f57351i.a("authWebForFirebase");
            } else {
                this.f57351i.a("authWeb");
            }
            a(uri, this.p);
            this.f57349g.get().push(this.f57350h.a(fVar, this.o));
            return;
        }
        throw new IllegalStateException("Redirect URL must be set!");
    }

    static void a(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    private static void a(Uri uri, Context context) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.setFlags(268435456);
            a(context, intent);
        } catch (Exception unused) {
        }
    }

    private void b(com.snapchat.kit.sdk.core.a.b bVar, String str) {
        this.f57351i.a(a.EnumC1273a.FIREBASE_TOKEN_GRANT);
        this.r.get().a(str, bVar.getRedirectUri(), bVar.getCodeVerifier(), new CompletionCallback<String>() {
            /* class com.snapchat.kit.sdk.m.AnonymousClass3 */

            static {
                Covode.recordClassIndex(35856);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.snapchat.kit.sdk.core.networking.CompletionCallback
            public final /* synthetic */ void onSuccess(String str) {
                String str2 = str;
                if (TextUtils.isEmpty(str2)) {
                    m.this.f57351i.a(a.EnumC1273a.FIREBASE_TOKEN_GRANT, false);
                    com.snapchat.kit.sdk.core.controller.a aVar = com.snapchat.kit.sdk.core.controller.a.FIREBASE_CUSTOM_TOKEN_FETCH_FAILURE;
                    aVar.errorDescription = "Token fetch request succeeded but response Token is Null or Empty";
                    m.this.a(aVar);
                    return;
                }
                m.this.f57351i.a(a.EnumC1273a.FIREBASE_TOKEN_GRANT, true);
                m mVar = m.this;
                mVar.f57349g.get().push(mVar.f57350h.a(true, true));
                com.snapchat.kit.sdk.core.controller.b bVar = mVar.f57347e;
                bVar.f57113b.post(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0044: INVOKE  
                      (wrap: android.os.Handler : 0x003d: IGET  (r1v3 android.os.Handler) = (r2v1 'bVar' com.snapchat.kit.sdk.core.controller.b) com.snapchat.kit.sdk.core.controller.b.b android.os.Handler)
                      (wrap: com.snapchat.kit.sdk.core.controller.b$5 : 0x0041: CONSTRUCTOR  (r0v6 com.snapchat.kit.sdk.core.controller.b$5) = (r2v1 'bVar' com.snapchat.kit.sdk.core.controller.b), (r5v1 'str2' java.lang.String) call: com.snapchat.kit.sdk.core.controller.b.5.<init>(com.snapchat.kit.sdk.core.controller.b, java.lang.String):void type: CONSTRUCTOR)
                     type: VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean in method: com.snapchat.kit.sdk.m.3.onSuccess(java.lang.String):void, file: classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0041: CONSTRUCTOR  (r0v6 com.snapchat.kit.sdk.core.controller.b$5) = (r2v1 'bVar' com.snapchat.kit.sdk.core.controller.b), (r5v1 'str2' java.lang.String) call: com.snapchat.kit.sdk.core.controller.b.5.<init>(com.snapchat.kit.sdk.core.controller.b, java.lang.String):void type: CONSTRUCTOR in method: com.snapchat.kit.sdk.m.3.onSuccess(java.lang.String):void, file: classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 18 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.snapchat.kit.sdk.core.controller.b, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 24 more
                    */
                /*
                    this = this;
                    java.lang.String r5 = (java.lang.String) r5
                    boolean r0 = android.text.TextUtils.isEmpty(r5)
                    if (r0 == 0) goto L_0x001e
                    com.snapchat.kit.sdk.m r0 = com.snapchat.kit.sdk.m.this
                    com.snapchat.kit.sdk.a.a r2 = r0.f57351i
                    com.snapchat.kit.sdk.a.a$a r1 = com.snapchat.kit.sdk.a.a.EnumC1273a.FIREBASE_TOKEN_GRANT
                    r0 = 0
                    r2.a(r1, r0)
                    com.snapchat.kit.sdk.core.controller.a r1 = com.snapchat.kit.sdk.core.controller.a.FIREBASE_CUSTOM_TOKEN_FETCH_FAILURE
                    java.lang.String r0 = "Token fetch request succeeded but response Token is Null or Empty"
                    r1.errorDescription = r0
                    com.snapchat.kit.sdk.m r0 = com.snapchat.kit.sdk.m.this
                    r0.a(r1)
                    return
                L_0x001e:
                    com.snapchat.kit.sdk.m r0 = com.snapchat.kit.sdk.m.this
                    com.snapchat.kit.sdk.a.a r1 = r0.f57351i
                    com.snapchat.kit.sdk.a.a$a r0 = com.snapchat.kit.sdk.a.a.EnumC1273a.FIREBASE_TOKEN_GRANT
                    r3 = 1
                    r1.a(r0, r3)
                    com.snapchat.kit.sdk.m r2 = com.snapchat.kit.sdk.m.this
                    dagger.a<com.snapchat.kit.sdk.core.metrics.MetricQueue<com.snapchat.kit.sdk.core.metrics.model.ServerEvent>> r0 = r2.f57349g
                    java.lang.Object r1 = r0.get()
                    com.snapchat.kit.sdk.core.metrics.MetricQueue r1 = (com.snapchat.kit.sdk.core.metrics.MetricQueue) r1
                    com.snapchat.kit.sdk.core.metrics.c.f r0 = r2.f57350h
                    com.snapchat.kit.sdk.core.metrics.model.ServerEvent r0 = r0.a(r3, r3)
                    r1.push(r0)
                    com.snapchat.kit.sdk.core.controller.b r2 = r2.f57347e
                    android.os.Handler r1 = r2.f57113b
                    com.snapchat.kit.sdk.core.controller.b$5 r0 = new com.snapchat.kit.sdk.core.controller.b$5
                    r0.<init>(r5)
                    r1.post(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.m.AnonymousClass3.onSuccess(java.lang.Object):void");
            }

            @Override // com.snapchat.kit.sdk.core.networking.CompletionCallback
            public final void onFailure(boolean z, int i2, String str) {
                m.this.f57351i.a(a.EnumC1273a.FIREBASE_TOKEN_GRANT, false);
                com.snapchat.kit.sdk.core.controller.a aVar = com.snapchat.kit.sdk.core.controller.a.FIREBASE_CUSTOM_TOKEN_FETCH_FAILURE;
                aVar.errorDescription = str;
                m.this.a(aVar);
            }
        });
    }

    private static Request a(RequestBody requestBody, String str) {
        return new Request.Builder().header("Content-Type", "application/x-www-form-urlencoded").url(com.a.a("%s%s", new Object[]{"https://accounts.snapchat.com", str})).post(requestBody).build();
    }

    private void a(com.snapchat.kit.sdk.core.a.b bVar, String str) {
        FormBody.Builder builder = new FormBody.Builder();
        builder.add("grant_type", "authorization_code");
        builder.add("code", str);
        builder.add("redirect_uri", bVar.getRedirectUri());
        builder.add("client_id", this.f57344b);
        builder.add("code_verifier", bVar.getCodeVerifier());
        Request a2 = a(builder.build(), "/accounts/oauth2/token");
        if (a2 == null) {
            b();
            return;
        }
        this.f57347e.c();
        this.f57351i.a(a.EnumC1273a.GRANT);
        this.q.newCall(a2).enqueue(new Callback() {
            /* class com.snapchat.kit.sdk.m.AnonymousClass2 */

            static {
                Covode.recordClassIndex(35852);
            }

            @Override // okhttp3.Callback
            public final void onFailure(Call call, IOException iOException) {
                m.a(new Runnable() {
                    /* class com.snapchat.kit.sdk.m.AnonymousClass2.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(35853);
                    }

                    public final void run() {
                        m.this.f57351i.a(a.EnumC1273a.GRANT, false);
                        m.this.b();
                    }
                });
            }

            @Override // okhttp3.Callback
            public final void onResponse(Call call, Response response) {
                if (!(!response.isSuccessful() || response.body() == null || response.body().charStream() == null)) {
                    com.snapchat.kit.sdk.core.a.a aVar = (com.snapchat.kit.sdk.core.a.a) m.this.f57348f.a(response.body().charStream(), com.snapchat.kit.sdk.core.a.a.class);
                    aVar.setLastUpdated(System.currentTimeMillis());
                    if (aVar.isComplete()) {
                        m.this.f57355m.a(aVar);
                        m.this.f57354l = null;
                        m.this.f57351i.a(a.EnumC1273a.GRANT, true);
                        m.a(new Runnable() {
                            /* class com.snapchat.kit.sdk.m.AnonymousClass2.AnonymousClass2 */

                            static {
                                Covode.recordClassIndex(35854);
                            }

                            public final void run() {
                                m mVar = m.this;
                                mVar.f57349g.get().push(mVar.f57350h.a(true, false));
                                com.snapchat.kit.sdk.core.controller.b bVar = mVar.f57347e;
                                bVar.f57113b.post(
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0020: INVOKE  
                                      (wrap: android.os.Handler : 0x0019: IGET  (r1v1 android.os.Handler) = (r2v1 'bVar' com.snapchat.kit.sdk.core.controller.b) com.snapchat.kit.sdk.core.controller.b.b android.os.Handler)
                                      (wrap: com.snapchat.kit.sdk.core.controller.b$3 : 0x001d: CONSTRUCTOR  (r0v4 com.snapchat.kit.sdk.core.controller.b$3) = (r2v1 'bVar' com.snapchat.kit.sdk.core.controller.b) call: com.snapchat.kit.sdk.core.controller.b.3.<init>(com.snapchat.kit.sdk.core.controller.b):void type: CONSTRUCTOR)
                                     type: VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean in method: com.snapchat.kit.sdk.m.2.2.run():void, file: classes9.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001d: CONSTRUCTOR  (r0v4 com.snapchat.kit.sdk.core.controller.b$3) = (r2v1 'bVar' com.snapchat.kit.sdk.core.controller.b) call: com.snapchat.kit.sdk.core.controller.b.3.<init>(com.snapchat.kit.sdk.core.controller.b):void type: CONSTRUCTOR in method: com.snapchat.kit.sdk.m.2.2.run():void, file: classes9.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                    	... 14 more
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.snapchat.kit.sdk.core.controller.b, state: GENERATED_AND_UNLOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                    	... 20 more
                                    */
                                /*
                                    this = this;
                                    com.snapchat.kit.sdk.m$2 r0 = com.snapchat.kit.sdk.m.AnonymousClass2.this
                                    com.snapchat.kit.sdk.m r4 = com.snapchat.kit.sdk.m.this
                                    dagger.a<com.snapchat.kit.sdk.core.metrics.MetricQueue<com.snapchat.kit.sdk.core.metrics.model.ServerEvent>> r0 = r4.f57349g
                                    java.lang.Object r3 = r0.get()
                                    com.snapchat.kit.sdk.core.metrics.MetricQueue r3 = (com.snapchat.kit.sdk.core.metrics.MetricQueue) r3
                                    com.snapchat.kit.sdk.core.metrics.c.f r2 = r4.f57350h
                                    r1 = 1
                                    r0 = 0
                                    com.snapchat.kit.sdk.core.metrics.model.ServerEvent r0 = r2.a(r1, r0)
                                    r3.push(r0)
                                    com.snapchat.kit.sdk.core.controller.b r2 = r4.f57347e
                                    android.os.Handler r1 = r2.f57113b
                                    com.snapchat.kit.sdk.core.controller.b$3 r0 = new com.snapchat.kit.sdk.core.controller.b$3
                                    r0.<init>()
                                    r1.post(r0)
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.m.AnonymousClass2.AnonymousClass2.run():void");
                            }
                        });
                        return;
                    }
                }
                m.a(new Runnable() {
                    /* class com.snapchat.kit.sdk.m.AnonymousClass2.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(35855);
                    }

                    public final void run() {
                        m.this.f57351i.a(a.EnumC1273a.GRANT, false);
                        m.this.b();
                    }
                });
            }
        });
    }

    private static boolean a(Context context, PackageManager packageManager, String str, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setPackage(str);
        intent.setFlags(268435456);
        if (intent.resolveActivity(packageManager) == null) {
            return false;
        }
        a(context, intent);
        return true;
    }

    static /* synthetic */ void a(m mVar, final RefreshAccessTokenResult refreshAccessTokenResult, final boolean z, final String str, final com.snapchat.kit.sdk.core.networking.b bVar) {
        a(new Runnable() {
            /* class com.snapchat.kit.sdk.m.AnonymousClass4 */

            static {
                Covode.recordClassIndex(35857);
            }

            public final void run() {
                if (z) {
                    refreshAccessTokenResult.onRefreshAccessTokenSuccess(str);
                } else {
                    refreshAccessTokenResult.onRefreshAccessTokenFailure(bVar);
                }
            }
        });
    }

    m(String str, String str2, List<String> list, Context context, SecureSharedPreferences secureSharedPreferences, l lVar, com.snapchat.kit.sdk.core.controller.b bVar, OkHttpClient okHttpClient, dagger.a<l> aVar, f fVar, dagger.a<MetricQueue<ServerEvent>> aVar2, com.snapchat.kit.sdk.core.metrics.c.f fVar2, dagger.a<MetricQueue<OpMetric>> aVar3, KitPluginType kitPluginType, boolean z) {
        this.f57344b = str;
        this.f57345c = str2;
        this.f57346d = list;
        this.p = context;
        this.f57347e = bVar;
        this.q = okHttpClient;
        this.r = aVar;
        this.f57348f = fVar;
        this.f57349g = aVar2;
        this.f57350h = fVar2;
        this.f57351i = new com.snapchat.kit.sdk.a.a(aVar3);
        e eVar = new e(secureSharedPreferences, lVar);
        this.f57355m = eVar;
        this.f57352j = kitPluginType;
        this.f57353k = z;
        if (eVar.a()) {
            new a(this, (byte) 0).execute(new Void[0]);
        }
    }
}
