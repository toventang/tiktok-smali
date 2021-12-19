package com.ttnet.org.chromium.net;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ttnet.org.chromium.base.ApplicationStatus;
import com.ttnet.org.chromium.base.ThreadUtils;
import com.ttnet.org.chromium.base.f;
import java.io.IOException;

public class HttpNegotiateAuthenticator {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ boolean f155363b = true;

    /* renamed from: a  reason: collision with root package name */
    Bundle f155364a;

    /* renamed from: c  reason: collision with root package name */
    private final String f155365c;

    /* access modifiers changed from: package-private */
    public native void nativeSetResult(long j2, int i2, String str);

    static class c {

        /* renamed from: a  reason: collision with root package name */
        public long f155372a;

        /* renamed from: b  reason: collision with root package name */
        public AccountManager f155373b;

        /* renamed from: c  reason: collision with root package name */
        public Bundle f155374c;

        /* renamed from: d  reason: collision with root package name */
        public String f155375d;

        /* renamed from: e  reason: collision with root package name */
        public Account f155376e;

        static {
            Covode.recordClassIndex(103376);
        }

        c() {
        }
    }

    static {
        Covode.recordClassIndex(103372);
    }

    static HttpNegotiateAuthenticator create(String str) {
        return new HttpNegotiateAuthenticator(str);
    }

    private HttpNegotiateAuthenticator(String str) {
        if (f155363b || !TextUtils.isEmpty(str)) {
            this.f155365c = str;
            return;
        }
        throw new AssertionError();
    }

    class a implements AccountManagerCallback<Account[]> {

        /* renamed from: b  reason: collision with root package name */
        private final c f155367b;

        static {
            Covode.recordClassIndex(103373);
        }

        @Override // android.accounts.AccountManagerCallback
        public final void run(AccountManagerFuture<Account[]> accountManagerFuture) {
            MethodCollector.i(10884);
            try {
                Account[] result = accountManagerFuture.getResult();
                if (result.length == 0) {
                    f.b("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ", new Object[0]);
                    HttpNegotiateAuthenticator.this.nativeSetResult(this.f155367b.f155372a, -341, null);
                    MethodCollector.o(10884);
                } else if (result.length > 1) {
                    f.b("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: Found %d accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.", Integer.valueOf(result.length));
                    HttpNegotiateAuthenticator.this.nativeSetResult(this.f155367b.f155372a, -341, null);
                    MethodCollector.o(10884);
                } else if (HttpNegotiateAuthenticator.a(com.ttnet.org.chromium.base.c.f155223a, "android.permission.USE_CREDENTIALS", true)) {
                    f.c("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: USE_CREDENTIALS permission not granted. Aborting authentication.", new Object[0]);
                    HttpNegotiateAuthenticator.this.nativeSetResult(this.f155367b.f155372a, -343, null);
                    MethodCollector.o(10884);
                } else {
                    this.f155367b.f155376e = result[0];
                    this.f155367b.f155373b.getAuthToken(this.f155367b.f155376e, this.f155367b.f155375d, this.f155367b.f155374c, true, (AccountManagerCallback<Bundle>) new b(this.f155367b), new Handler(ThreadUtils.a().getLooper()));
                    MethodCollector.o(10884);
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
                f.b("net_auth", "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e2);
                HttpNegotiateAuthenticator.this.nativeSetResult(this.f155367b.f155372a, -9, null);
                MethodCollector.o(10884);
            }
        }

        public a(c cVar) {
            this.f155367b = cVar;
        }
    }

    class b implements AccountManagerCallback<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        public final c f155368a;

        static {
            Covode.recordClassIndex(103374);
        }

        @Override // android.accounts.AccountManagerCallback
        public final void run(AccountManagerFuture<Bundle> accountManagerFuture) {
            MethodCollector.i(10887);
            int i2 = 0;
            try {
                Bundle result = accountManagerFuture.getResult();
                if (result.containsKey("intent")) {
                    final Context context = com.ttnet.org.chromium.base.c.f155223a;
                    b(context, new BroadcastReceiver() {
                        /* class com.ttnet.org.chromium.net.HttpNegotiateAuthenticator.b.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(103375);
                        }

                        public final void onReceive(Context context, Intent intent) {
                            context.unregisterReceiver(this);
                            b.this.f155368a.f155373b.getAuthToken(b.this.f155368a.f155376e, b.this.f155368a.f155375d, b.this.f155368a.f155374c, true, (AccountManagerCallback<Bundle>) new b(b.this.f155368a), (Handler) null);
                        }
                    }, new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
                    MethodCollector.o(10887);
                    return;
                }
                HttpNegotiateAuthenticator httpNegotiateAuthenticator = HttpNegotiateAuthenticator.this;
                c cVar = this.f155368a;
                httpNegotiateAuthenticator.f155364a = result.getBundle("spnegoContext");
                switch (result.getInt("spnegoResult", 1)) {
                    case 0:
                        break;
                    case 1:
                    default:
                        i2 = -9;
                        break;
                    case 2:
                        i2 = -3;
                        break;
                    case 3:
                        i2 = -342;
                        break;
                    case 4:
                        i2 = -320;
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        i2 = -338;
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        i2 = -339;
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        i2 = -341;
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        i2 = -344;
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        i2 = -329;
                        break;
                }
                httpNegotiateAuthenticator.nativeSetResult(cVar.f155372a, i2, result.getString("authtoken"));
                MethodCollector.o(10887);
            } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
                f.b("net_auth", "ERR_UNEXPECTED: Error while attempting to obtain a token.", e2);
                HttpNegotiateAuthenticator.this.nativeSetResult(this.f155368a.f155372a, -9, null);
                MethodCollector.o(10887);
            }
        }

        public b(c cVar) {
            this.f155368a = cVar;
        }

        private static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            try {
                return context.registerReceiver(broadcastReceiver, intentFilter);
            } catch (Exception e2) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                }
                throw e2;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
            r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
            if (r0 != false) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
            r2 = move-exception;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
            com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
            r0 = r2.getMessage();
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
            if (r0 != null) goto L_0x0018;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static android.content.Intent b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
            /*
                android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
                com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
                android.content.Intent r0 = a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
                return r0
            L_0x000c:
                android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
                return r0
            L_0x0011:
                r2 = move-exception
                java.lang.String r0 = r2.getMessage()
                if (r0 == 0) goto L_0x0027
                java.lang.String r1 = r2.getMessage()
                java.lang.String r0 = "regist too many Broadcast Receivers"
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L_0x0025
                goto L_0x0027
            L_0x0025:
                throw r2
            L_0x0026:
                r2 = move-exception
            L_0x0027:
                java.lang.String r0 = "Register Receiver Exception"
                com.bytedance.c.a.a.a.b.a(r2, r0)
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.HttpNegotiateAuthenticator.b.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
        }
    }

    static boolean a(Context context, String str, boolean z) {
        if ((!z || Build.VERSION.SDK_INT < 23) && context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void getNextAuthToken(long j2, String str, String str2, boolean z) {
        boolean z2;
        MethodCollector.i(11060);
        if (f155363b || str != null) {
            Context context = com.ttnet.org.chromium.base.c.f155223a;
            c cVar = new c();
            cVar.f155375d = "SPNEGO:HOSTBASED:".concat(String.valueOf(str));
            cVar.f155373b = AccountManager.get(context);
            cVar.f155372a = j2;
            String[] strArr = {"SPNEGO"};
            cVar.f155374c = new Bundle();
            if (str2 != null) {
                cVar.f155374c.putString("incomingAuthToken", str2);
            }
            if (this.f155364a != null) {
                cVar.f155374c.putBundle("spnegoContext", this.f155364a);
            }
            cVar.f155374c.putBoolean("canDelegate", z);
            Activity activity = ApplicationStatus.f155104c;
            String str3 = "android.permission.GET_ACCOUNTS";
            if (activity != null) {
                if (Build.VERSION.SDK_INT < 23) {
                    z2 = true;
                    str3 = "android.permission.MANAGE_ACCOUNTS";
                } else {
                    z2 = false;
                }
                if (a(context, str3, z2)) {
                    f.c("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: %s permission not granted. Aborting authentication", str3);
                    nativeSetResult(cVar.f155372a, -343, null);
                    MethodCollector.o(11060);
                    return;
                }
                cVar.f155373b.getAuthTokenByFeatures(this.f155365c, cVar.f155375d, strArr, activity, null, cVar.f155374c, new b(cVar), new Handler(ThreadUtils.a().getLooper()));
                MethodCollector.o(11060);
            } else if (a(context, str3, true)) {
                f.c("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: GET_ACCOUNTS permission not granted. Aborting authentication.", new Object[0]);
                nativeSetResult(cVar.f155372a, -343, null);
                MethodCollector.o(11060);
            } else {
                AccountManager accountManager = cVar.f155373b;
                String str4 = this.f155365c;
                a aVar = new a(cVar);
                Handler handler = new Handler(ThreadUtils.a().getLooper());
                Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(accountManager, new Object[]{str4, strArr, aVar, handler}, 102502, "android.accounts.AccountManagerFuture", false, null);
                if (((Boolean) a2.first).booleanValue()) {
                    Object obj = a2.second;
                    MethodCollector.o(11060);
                    return;
                }
                com.bytedance.helios.sdk.a.a(accountManager.getAccountsByTypeAndFeatures(str4, strArr, aVar, handler), accountManager, new Object[]{str4, strArr, aVar, handler}, 102502, "com_ttnet_org_chromium_net_HttpNegotiateAuthenticator_android_accounts_AccountManager_getAccountsByTypeAndFeatures(Landroid/accounts/AccountManager;Ljava/lang/String;[Ljava/lang/String;Landroid/accounts/AccountManagerCallback;Landroid/os/Handler;)Landroid/accounts/AccountManagerFuture;");
                MethodCollector.o(11060);
            }
        } else {
            AssertionError assertionError = new AssertionError();
            MethodCollector.o(11060);
            throw assertionError;
        }
    }
}
