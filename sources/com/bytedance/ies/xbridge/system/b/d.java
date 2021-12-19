package com.bytedance.ies.xbridge.system.b;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.system.a.d;
import com.bytedance.ies.xbridge.system.activity.GetPermissionActivity;
import com.bytedance.ies.xbridge.system.b.a.b.b;
import com.bytedance.ies.xbridge.system.c.e;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.agilelogger.ALog;
import f.a.d.f;
import h.f.b.ab;
import h.f.b.l;
import java.util.concurrent.Callable;

public final class d extends com.bytedance.ies.xbridge.system.a.d {

    /* renamed from: a  reason: collision with root package name */
    private final String f36466a;

    static {
        Covode.recordClassIndex(21872);
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f36467a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ContentResolver f36468b;

        static {
            Covode.recordClassIndex(21873);
        }

        a(e eVar, ContentResolver contentResolver) {
            this.f36467a = eVar;
            this.f36468b = contentResolver;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return Boolean.valueOf(b.a.a(this.f36467a, this.f36468b));
        }
    }

    public d() {
        String b2 = ab.a(d.class).b();
        this.f36466a = b2 == null ? "XRemoveCalendarEventMethod" : b2;
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d.a f36470a;

        static {
            Covode.recordClassIndex(21875);
        }

        c(d.a aVar) {
            this.f36470a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Throwable th) {
            this.f36470a.a("delete calendar failed with unknown error.");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d.a f36469a;

        static {
            Covode.recordClassIndex(21874);
        }

        b(d.a aVar) {
            this.f36469a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Boolean bool) {
            Boolean bool2 = bool;
            l.a((Object) bool2, "");
            if (bool2.booleanValue()) {
                this.f36469a.a(new com.bytedance.ies.xbridge.model.c.b(), "");
            } else {
                this.f36469a.a("delete calendar Failed.");
            }
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.system.b.d$d  reason: collision with other inner class name */
    public static final class C0885d extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f36471a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d.a f36472b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f36473c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ContentResolver f36474d;

        static {
            Covode.recordClassIndex(21876);
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent == null) {
                this.f36472b.a("have no permission");
                return;
            }
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != 1063370865) {
                    if (hashCode == 1627606181 && action.equals("GetPermissionActivity.permission_granted")) {
                        if (context != null) {
                            context.unregisterReceiver(this);
                        }
                        d.a(this.f36473c, this.f36472b, this.f36474d);
                        return;
                    }
                } else if (action.equals("GetPermissionActivity.permission_denied")) {
                    if (context != null) {
                        context.unregisterReceiver(this);
                    }
                    this.f36472b.a("user denied permission");
                    return;
                }
            }
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f36472b.a("unable to continue to next");
        }

        C0885d(d dVar, d.a aVar, e eVar, ContentResolver contentResolver) {
            this.f36471a = dVar;
            this.f36472b = aVar;
            this.f36473c = eVar;
            this.f36474d = contentResolver;
        }
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

    public static void a(e eVar, d.a aVar, ContentResolver contentResolver) {
        l.a((Object) f.a.ab.a((Callable) new a(eVar, contentResolver)).a(f.a.a.b.a.a()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new b(aVar), new c(aVar)), "");
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.system.b.d.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    @Override // com.bytedance.ies.xbridge.system.a.d
    public final void a(e eVar, d.a aVar, com.bytedance.ies.xbridge.e eVar2) {
        boolean z;
        boolean z2;
        l.c(eVar, "");
        l.c(aVar, "");
        l.c(eVar2, "");
        Context context = (Context) a(Context.class);
        if (context == null) {
            ALog.e(this.f36466a, "obtaining context, but got a null.");
            aVar.a("context is null!!");
            return;
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            ALog.e(this.f36466a, "obtaining content resolver but got a null.");
            aVar.a("contentResolver is null!!");
            return;
        }
        if (androidx.core.content.b.a(context, "android.permission.READ_CALENDAR") == 0) {
            z = true;
        } else {
            z = false;
        }
        if (androidx.core.content.b.a(context, "android.permission.WRITE_CALENDAR") == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((!z || !z2) && Build.VERSION.SDK_INT >= 23) {
            C0885d dVar = new C0885d(this, aVar, eVar, contentResolver);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("GetPermissionActivity.permission_denied");
            intentFilter.addAction("GetPermissionActivity.permission_granted");
            b(context, dVar, intentFilter);
            Intent intent = new Intent(context, GetPermissionActivity.class);
            intent.putExtra("permissions", new String[]{"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"});
            com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
            context.startActivity(intent);
            return;
        }
        a(eVar, aVar, contentResolver);
    }
}
