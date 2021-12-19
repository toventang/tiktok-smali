package com.ss.android.ugc.aweme.kids.setting.wellbeing;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.g;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.kids.common.response.KidsVideoPlaytimeReminder;
import com.ss.android.ugc.aweme.kids.common.response.KidsWellbeingSetting;
import com.ss.android.ugc.aweme.kids.experiment.abmock.a.d;
import com.ss.android.ugc.aweme.kids.setting.wellbeing.a;
import com.ss.android.ugc.aweme.utils.cg;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class b implements i, j {

    /* renamed from: a  reason: collision with root package name */
    KidsWellbeingSetting f107129a;

    /* renamed from: b  reason: collision with root package name */
    final Application f107130b = g.a();

    /* renamed from: c  reason: collision with root package name */
    boolean f107131c;

    /* renamed from: d  reason: collision with root package name */
    Runnable f107132d;

    /* renamed from: e  reason: collision with root package name */
    final a f107133e = new a(this);

    /* renamed from: f  reason: collision with root package name */
    private final h f107134f = h.i.a((h.f.a.a) C2752b.f107139a);

    /* renamed from: g  reason: collision with root package name */
    private final h f107135g = h.i.a((h.f.a.a) e.f107143a);

    /* renamed from: h  reason: collision with root package name */
    private KidsVideoPlaytimeReminder f107136h;

    /* renamed from: i  reason: collision with root package name */
    private Runnable f107137i;

    static {
        Covode.recordClassIndex(68533);
    }

    /* access modifiers changed from: package-private */
    public final Handler a() {
        return (Handler) this.f107134f.getValue();
    }

    public final c b() {
        return (c) this.f107135g.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(72, new org.greenrobot.eventbus.g(b.class, "onSnoozeEvent", e.class, ThreadMode.BACKGROUND, 0, false));
        return hashMap;
    }

    static final class e extends m implements h.f.a.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f107143a = new e();

        static {
            Covode.recordClassIndex(68538);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.wellbeing.b$b  reason: collision with other inner class name */
    static final class C2752b extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2752b f107139a = new C2752b();

        static {
            Covode.recordClassIndex(68535);
        }

        C2752b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f107141a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f107142b;

        static {
            Covode.recordClassIndex(68537);
        }

        d(b bVar, long j2) {
            this.f107141a = bVar;
            this.f107142b = j2;
        }

        public final void run() {
            b bVar = this.f107141a;
            int a2 = d.a.a();
            if (a2 == 1) {
                bVar.a("day", false, bVar.e());
            } else if (a2 == 2) {
                bVar.a("day", true, bVar.e());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        Runnable runnable = this.f107137i;
        if (runnable != null) {
            a().removeCallbacks(runnable);
        }
        this.f107137i = null;
        this.f107136h = null;
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f107140a;

        static {
            Covode.recordClassIndex(68536);
        }

        c(b bVar) {
            this.f107140a = bVar;
        }

        public final void run() {
            b bVar = this.f107140a;
            bVar.b();
            if (c.a()) {
                int a2 = d.a.a();
                if (a2 == 1) {
                    bVar.a("night", false, bVar.f());
                } else if (a2 == 2) {
                    bVar.a("night", true, bVar.f());
                }
                c b2 = bVar.b();
                a.C2751a.a().storeLong("nighttime_reminder_display_time", System.currentTimeMillis());
                b2.f107147c = null;
            }
        }
    }

    public b() {
        cg.a(this);
    }

    /* access modifiers changed from: package-private */
    public final Bundle e() {
        String str;
        String imageUrl;
        Bundle bundle = new Bundle();
        KidsVideoPlaytimeReminder kidsVideoPlaytimeReminder = this.f107136h;
        String str2 = null;
        if (kidsVideoPlaytimeReminder != null) {
            str2 = kidsVideoPlaytimeReminder.getTitle();
        }
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        bundle.putString("key_title", str2);
        KidsVideoPlaytimeReminder kidsVideoPlaytimeReminder2 = this.f107136h;
        if (kidsVideoPlaytimeReminder2 == null || (str = kidsVideoPlaytimeReminder2.getSubtitle()) == null) {
            str = str3;
        }
        bundle.putString("key_description", str);
        KidsVideoPlaytimeReminder kidsVideoPlaytimeReminder3 = this.f107136h;
        if (!(kidsVideoPlaytimeReminder3 == null || (imageUrl = kidsVideoPlaytimeReminder3.getImageUrl()) == null)) {
            str3 = imageUrl;
        }
        bundle.putString("key_image_url", str3);
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if (this.f107132d == null) {
            c b2 = b();
            if (c.a()) {
                Long l2 = b2.f107147c;
                if (l2 != null || (System.currentTimeMillis() - a.C2751a.a().getLong("nighttime_reminder_display_time", 0) >= 21600000 && (l2 = Long.valueOf(b2.f107145a + 5)) != null)) {
                    long longValue = l2.longValue() - b().f107145a;
                    if (longValue > 0) {
                        c cVar = new c(this);
                        a().postDelayed(cVar, longValue * 1000);
                        this.f107132d = cVar;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Bundle f() {
        String str;
        com.ss.android.ugc.aweme.kids.common.response.b bedTimeReminder;
        String str2;
        com.ss.android.ugc.aweme.kids.common.response.b bedTimeReminder2;
        com.ss.android.ugc.aweme.kids.common.response.b bedTimeReminder3;
        Bundle bundle = new Bundle();
        KidsWellbeingSetting kidsWellbeingSetting = this.f107129a;
        String str3 = null;
        if (!(kidsWellbeingSetting == null || (bedTimeReminder3 = kidsWellbeingSetting.getBedTimeReminder()) == null)) {
            str3 = bedTimeReminder3.f105905e;
        }
        String str4 = "";
        if (str3 == null) {
            str3 = str4;
        }
        bundle.putString("key_title", str3);
        KidsWellbeingSetting kidsWellbeingSetting2 = this.f107129a;
        if (kidsWellbeingSetting2 == null || (bedTimeReminder2 = kidsWellbeingSetting2.getBedTimeReminder()) == null || (str = bedTimeReminder2.f105906f) == null) {
            str = str4;
        }
        bundle.putString("key_description", str);
        KidsWellbeingSetting kidsWellbeingSetting3 = this.f107129a;
        if (!(kidsWellbeingSetting3 == null || (bedTimeReminder = kidsWellbeingSetting3.getBedTimeReminder()) == null || (str2 = bedTimeReminder.f105903c) == null)) {
            str4 = str2;
        }
        bundle.putString("key_image_url", str4);
        return bundle;
    }

    public static final class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f107138a;

        static {
            Covode.recordClassIndex(68534);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(b bVar) {
            this.f107138a = bVar;
        }

        public final void onReceive(Context context, Intent intent) {
            c b2 = this.f107138a.b();
            Long l2 = b2.f107146b;
            if (l2 != null) {
                b2.f107145a += (System.currentTimeMillis() - l2.longValue()) / 1000;
                a.C2751a.a(b2.f107145a);
            }
            b2.f107146b = Long.valueOf(System.currentTimeMillis());
        }
    }

    @r(a = ThreadMode.BACKGROUND)
    public final void onSnoozeEvent(e eVar) {
        l.d(eVar, "");
        c b2 = b();
        b2.f107147c = Long.valueOf(b2.f107145a + 900);
        d();
    }

    /* access modifiers changed from: package-private */
    public final void a(List<KidsVideoPlaytimeReminder> list) {
        long j2 = b().f107145a;
        for (KidsVideoPlaytimeReminder kidsVideoPlaytimeReminder : list) {
            this.f107136h = kidsVideoPlaytimeReminder;
            Integer threshold = kidsVideoPlaytimeReminder.getThreshold();
            if (threshold != null) {
                long intValue = (long) (threshold.intValue() * 60);
                if (j2 < intValue) {
                    d dVar = new d(this, j2);
                    a().postDelayed(dVar, (intValue - j2) * 1000);
                    this.f107137i = dVar;
                    return;
                }
            }
        }
        this.f107136h = null;
    }

    private static Intent b(Application application, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return application.registerReceiver(broadcastReceiver, intentFilter);
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
    public static android.content.Intent a(android.app.Application r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = b(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.setting.wellbeing.b.a(android.app.Application, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, boolean z, Bundle bundle) {
        String str2;
        SmartRoute buildRoute = SmartRouter.buildRoute(this.f107130b, "//kids/wellbeing/reminder");
        if (z) {
            str2 = "full";
        } else {
            str2 = "half";
        }
        buildRoute.withParam("key_view_style", str2).withParam("key_type", str).withParam(bundle).open();
    }
}
