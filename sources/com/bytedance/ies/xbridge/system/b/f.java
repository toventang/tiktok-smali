package com.bytedance.ies.xbridge.system.b;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.system.a.f;
import com.bytedance.ies.xbridge.system.activity.GetPermissionActivity;
import com.bytedance.ies.xbridge.system.c.g;
import com.bytedance.ies.xbridge.system.c.h;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.agilelogger.ALog;
import f.a.ab;
import h.f.b.l;
import h.p;
import java.util.concurrent.Callable;

public final class f extends com.bytedance.ies.xbridge.system.a.f {

    /* renamed from: a  reason: collision with root package name */
    public final String f36475a = "XSetCalendarEventMethod";

    static {
        Covode.recordClassIndex(21878);
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f36476a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f36477b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ContentResolver f36478c;

        static {
            Covode.recordClassIndex(21879);
        }

        a(f fVar, g gVar, ContentResolver contentResolver) {
            this.f36476a = fVar;
            this.f36477b = gVar;
            this.f36478c = contentResolver;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return this.f36476a.a(this.f36477b, this.f36478c);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f.a f36480a;

        static {
            Covode.recordClassIndex(21881);
        }

        c(f.a aVar) {
            this.f36480a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Throwable th) {
            this.f36480a.a(0, "Cannot create calendar event.");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f<p<? extends com.bytedance.ies.xbridge.system.b.a.a.a, ? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f.a f36479a;

        static {
            Covode.recordClassIndex(21880);
        }

        b(f.a aVar) {
            this.f36479a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(p<? extends com.bytedance.ies.xbridge.system.b.a.a.a, ? extends String> pVar) {
            p<? extends com.bytedance.ies.xbridge.system.b.a.a.a, ? extends String> pVar2 = pVar;
            if (((com.bytedance.ies.xbridge.system.b.a.a.a) pVar2.getFirst()).getValue() == com.bytedance.ies.xbridge.system.b.a.a.a.Success.getValue()) {
                f.a aVar = this.f36479a;
                h hVar = new h();
                hVar.f36512a = (String) pVar2.getSecond();
                aVar.a(hVar, "");
                return;
            }
            this.f36479a.a(((com.bytedance.ies.xbridge.system.b.a.a.a) pVar2.getFirst()).getValue(), "Cannot create calendar event. fail code = " + ((com.bytedance.ies.xbridge.system.b.a.a.a) pVar2.getFirst()).getValue());
        }
    }

    public static final class d extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f36481a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f.a f36482b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f36483c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f36484d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ContentResolver f36485e;

        static {
            Covode.recordClassIndex(21882);
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent == null) {
                this.f36482b.a((f.a) 0, "have no permission");
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
                        this.f36481a.a(this.f36483c, this.f36482b, this.f36485e);
                        return;
                    }
                } else if (action.equals("GetPermissionActivity.permission_denied")) {
                    if (context != null) {
                        context.unregisterReceiver(this);
                    }
                    ALog.d(this.f36481a.f36475a, "user denied permission");
                    this.f36482b.a((f.a) 0, "user denied permission");
                    return;
                }
            }
            if (context != null) {
                context.unregisterReceiver(this);
            }
            ALog.d(this.f36481a.f36475a, "something unknown happend");
            this.f36482b.a((f.a) 0, "unable to continue to next");
        }

        d(f fVar, f.a aVar, g gVar, e eVar, ContentResolver contentResolver) {
            this.f36481a = fVar;
            this.f36482b = aVar;
            this.f36483c = gVar;
            this.f36484d = eVar;
            this.f36485e = contentResolver;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b9, code lost:
        if (h.f.b.l.a((java.lang.Object) r2.f36451g, (java.lang.Object) com.bytedance.ies.xbridge.system.b.a.b.a.f36458g) != false) goto L_0x00bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h.p<com.bytedance.ies.xbridge.system.b.a.a.a, java.lang.String> a(com.bytedance.ies.xbridge.system.c.g r10, android.content.ContentResolver r11) {
        /*
        // Method dump skipped, instructions count: 488
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.system.b.f.a(com.bytedance.ies.xbridge.system.c.g, android.content.ContentResolver):h.p");
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.system.b.f.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    public final void a(g gVar, f.a aVar, ContentResolver contentResolver) {
        l.a((Object) ab.a((Callable) new a(this, gVar, contentResolver)).a(f.a.a.b.a.a()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new b(aVar), new c(aVar)), "");
    }

    @Override // com.bytedance.ies.xbridge.system.a.f
    public final void a(g gVar, f.a aVar, e eVar) {
        boolean z;
        boolean z2;
        l.c(gVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        Context context = (Context) a(Context.class);
        if (context == null) {
            aVar.a((f.a) 0, "context is null!!!!");
            ALog.e(this.f36475a, "obtain context, however context == null");
            return;
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            aVar.a((f.a) 0, "contentResolver is null!!!!");
            ALog.e(this.f36475a, "obtain contentResolver, however contentResolver == null");
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
        if ((!z || !z2) && Build.VERSION.SDK_INT > 23) {
            d dVar = new d(this, aVar, gVar, eVar, contentResolver);
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
        a(gVar, aVar, contentResolver);
    }
}
