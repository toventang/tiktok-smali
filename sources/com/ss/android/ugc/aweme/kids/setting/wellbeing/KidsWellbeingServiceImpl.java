package com.ss.android.ugc.aweme.kids.setting.wellbeing;

import android.content.IntentFilter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.kids.common.response.KidsVideoPlaytimeReminder;
import com.ss.android.ugc.aweme.kids.common.response.KidsWellbeingSetting;
import com.ss.android.ugc.aweme.kids.experiment.abmock.a.d;
import com.ss.android.ugc.aweme.kids.setting.api.IKidsWellbeingService;
import com.ss.android.ugc.aweme.kids.setting.wellbeing.a;
import com.ss.android.ugc.b;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public final class KidsWellbeingServiceImpl implements IKidsWellbeingService {

    /* renamed from: a  reason: collision with root package name */
    private final h f107122a = i.a((h.f.a.a) a.f107123a);

    static {
        Covode.recordClassIndex(68527);
    }

    private final b d() {
        return (b) this.f107122a.getValue();
    }

    static final class a extends m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f107123a = new a();

        static {
            Covode.recordClassIndex(68528);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            if (d.a.a() != 0) {
                return new b();
            }
            return null;
        }
    }

    public static IKidsWellbeingService c() {
        MethodCollector.i(7920);
        Object a2 = b.a(IKidsWellbeingService.class, false);
        if (a2 != null) {
            IKidsWellbeingService iKidsWellbeingService = (IKidsWellbeingService) a2;
            MethodCollector.o(7920);
            return iKidsWellbeingService;
        }
        if (b.bZ == null) {
            synchronized (IKidsWellbeingService.class) {
                try {
                    if (b.bZ == null) {
                        b.bZ = new KidsWellbeingServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7920);
                    throw th;
                }
            }
        }
        KidsWellbeingServiceImpl kidsWellbeingServiceImpl = (KidsWellbeingServiceImpl) b.bZ;
        MethodCollector.o(7920);
        return kidsWellbeingServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.api.IKidsWellbeingService
    public final void a() {
        List<KidsVideoPlaytimeReminder> playtimeReminder;
        b d2 = d();
        if (d2 != null && !d2.f107131c) {
            d2.f107131c = true;
            c b2 = d2.b();
            b2.f107146b = Long.valueOf(System.currentTimeMillis());
            if (b2.f107149e.compareAndSet(false, true)) {
                SimpleDateFormat simpleDateFormat = b2.f107148d;
                Calendar instance = Calendar.getInstance();
                l.b(instance, "");
                String format = simpleDateFormat.format(instance.getTime());
                l.b(format, "");
                a.C2751a.a(format);
            }
            b.a(d2.f107130b, d2.f107133e, new IntentFilter("android.intent.action.TIME_TICK"));
            KidsWellbeingSetting kidsWellbeingSetting = d2.f107129a;
            if (!(kidsWellbeingSetting == null || (playtimeReminder = kidsWellbeingSetting.getPlaytimeReminder()) == null)) {
                d2.a(playtimeReminder);
            }
            d2.d();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.api.IKidsWellbeingService
    public final void b() {
        b d2 = d();
        if (d2 != null && d2.f107131c) {
            d2.f107131c = false;
            c b2 = d2.b();
            Long l2 = b2.f107146b;
            if (l2 != null) {
                b2.f107145a += (System.currentTimeMillis() - l2.longValue()) / 1000;
                a.C2751a.a(b2.f107145a);
            }
            b2.f107146b = null;
            d2.f107130b.unregisterReceiver(d2.f107133e);
            d2.c();
            Runnable runnable = d2.f107132d;
            if (runnable != null) {
                d2.a().removeCallbacks(runnable);
            }
            d2.f107132d = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.api.IKidsWellbeingService
    public final void a(KidsWellbeingSetting kidsWellbeingSetting) {
        b d2;
        if (kidsWellbeingSetting != null && (d2 = d()) != null) {
            l.d(kidsWellbeingSetting, "");
            c b2 = d2.b();
            String string = a.C2751a.a().getString("last_update_date", "");
            l.b(string, "");
            SimpleDateFormat simpleDateFormat = b2.f107148d;
            Calendar instance = Calendar.getInstance();
            l.b(instance, "");
            String format = simpleDateFormat.format(instance.getTime());
            if (l.a((Object) string, (Object) format)) {
                b2.f107145a = 0;
                if (!(!l.a(d2.f107129a, kidsWellbeingSetting))) {
                    return;
                }
            } else {
                l.b(format, "");
                a.C2751a.a(format);
                a.C2751a.a(0);
                b2.f107145a = 0;
            }
            d2.f107129a = kidsWellbeingSetting;
            if (d2.f107131c) {
                d2.c();
                List<KidsVideoPlaytimeReminder> playtimeReminder = kidsWellbeingSetting.getPlaytimeReminder();
                if (playtimeReminder != null) {
                    d2.a(playtimeReminder);
                }
            }
        }
    }
}
