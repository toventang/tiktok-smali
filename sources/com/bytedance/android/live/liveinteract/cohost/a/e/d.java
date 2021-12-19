package com.bytedance.android.live.liveinteract.cohost.a.e;

import com.bytedance.android.live.liveinteract.cohost.a.c.a;
import com.bytedance.android.live.liveinteract.platform.common.g.w;
import com.bytedance.android.livesdk.ap.b;
import com.bytedance.android.livesdk.ap.c;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveRandomLinkmicSetting;
import com.bytedance.android.livesdk.model.RandomLinkMicSetting;
import com.bytedance.android.livesdk.utils.q;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static int f10176a = 30;

    /* renamed from: b  reason: collision with root package name */
    private static int f10177b = 100;

    /* renamed from: c  reason: collision with root package name */
    private static int f10178c = 10;

    /* renamed from: d  reason: collision with root package name */
    private static int f10179d = 10;

    static {
        Covode.recordClassIndex(5348);
    }

    public static final boolean a() {
        if (a.f() && (System.currentTimeMillis() / 1000) - a.f10055l < ((long) f10177b)) {
            return true;
        }
        return false;
    }

    public static final boolean b() {
        e();
        if (d() > 0) {
            return true;
        }
        return false;
    }

    public static final long d() {
        Integer valueOf = Integer.valueOf(f10178c);
        b<List<Double>> bVar = com.bytedance.android.livesdk.ap.a.bY;
        l.b(bVar, "");
        q qVar = new q(valueOf, bVar.a());
        long j2 = 0;
        if (qVar.d() < f10178c) {
            return 0;
        }
        Double d2 = (Double) qVar.b();
        if (d2 != null) {
            j2 = (long) d2.doubleValue();
        }
        return (j2 + ((long) (f10176a * 60))) - (System.currentTimeMillis() / 1000);
    }

    public static final void c() {
        if (a()) {
            Integer valueOf = Integer.valueOf(f10178c);
            b<List<Double>> bVar = com.bytedance.android.livesdk.ap.a.bY;
            l.b(bVar, "");
            q qVar = new q(valueOf, bVar.a());
            double currentTimeMillis = (double) System.currentTimeMillis();
            Double.isNaN(currentTimeMillis);
            qVar.a(Double.valueOf(currentTimeMillis / 1000.0d));
            while (!qVar.e()) {
                double currentTimeMillis2 = (double) (System.currentTimeMillis() / 1000);
                Object c2 = qVar.c();
                l.b(c2, "");
                double doubleValue = ((Number) c2).doubleValue();
                Double.isNaN(currentTimeMillis2);
                if ((currentTimeMillis2 - doubleValue) / 60.0d <= ((double) f10179d)) {
                    break;
                }
                qVar.a();
            }
            b<List<Double>> bVar2 = com.bytedance.android.livesdk.ap.a.bY;
            l.b(bVar2, "");
            c.a(bVar2, qVar.f22351a);
            if (b()) {
                w.b();
            }
        }
    }

    private static final void e() {
        Integer num;
        int i2;
        RandomLinkMicSetting.DisconnectJudge disconnectJudge;
        RandomLinkMicSetting.DisconnectJudge disconnectJudge2;
        RandomLinkMicSetting value = LiveRandomLinkmicSetting.INSTANCE.getValue();
        Integer num2 = null;
        if (value != null) {
            num = Integer.valueOf(value.banTime);
        } else {
            num = null;
        }
        f10176a = num.intValue();
        RandomLinkMicSetting value2 = LiveRandomLinkmicSetting.INSTANCE.getValue();
        if (value2 != null) {
            num2 = Integer.valueOf(value2.disconnectTime);
        }
        f10177b = num2.intValue();
        RandomLinkMicSetting value3 = LiveRandomLinkmicSetting.INSTANCE.getValue();
        int i3 = 10;
        if (value3 == null || (disconnectJudge2 = value3.disconnectJudge) == null) {
            i2 = 10;
        } else {
            i2 = disconnectJudge2.frequency;
        }
        f10178c = i2;
        RandomLinkMicSetting value4 = LiveRandomLinkmicSetting.INSTANCE.getValue();
        if (!(value4 == null || (disconnectJudge = value4.disconnectJudge) == null)) {
            i3 = disconnectJudge.period;
        }
        f10179d = i3;
    }
}
