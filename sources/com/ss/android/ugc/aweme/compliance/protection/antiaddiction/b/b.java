package com.ss.android.ugc.aweme.compliance.protection.antiaddiction.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.compliance.protection.antiaddiction.a;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.compliance.protection.antiaddiction.a.a f77922a = new com.ss.android.ugc.aweme.compliance.protection.antiaddiction.a.a();

    /* renamed from: b  reason: collision with root package name */
    private final int f77923b = 60000;

    static {
        Covode.recordClassIndex(48302);
    }

    @Override // com.ss.android.ugc.aweme.compliance.protection.antiaddiction.a, com.ss.android.ugc.aweme.compliance.protection.antiaddiction.d
    public final boolean a(long j2, long j3) {
        com.ss.android.ugc.aweme.compliance.protection.antiaddiction.a.a aVar = this.f77922a;
        long a2 = com.ss.android.ugc.aweme.compliance.protection.antiaddiction.a.a.a();
        if (a2 >= 0) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j2);
            instance.set(11, aVar.f77904a);
            instance.set(12, aVar.f77905b);
            instance.set(13, 0);
            long timeInMillis = instance.getTimeInMillis();
            long longValue = SharePrefCache.inst().getLastHintToastTime().c().longValue();
            Calendar instance2 = Calendar.getInstance();
            instance2.setTimeInMillis(longValue);
            new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(instance2.getTime());
            if (longValue >= timeInMillis || j2 < timeInMillis) {
                timeInMillis = longValue;
            } else {
                SharePrefCache.inst().getLastHintToastTime().b(Long.valueOf(timeInMillis));
                aVar.f77906c = 0;
            }
            if (j2 - timeInMillis > a2 && j3 > com.ss.android.ugc.aweme.compliance.protection.antiaddiction.a.a.a() && com.ss.android.ugc.aweme.compliance.protection.antiaddiction.a.a.a() > 0) {
                com.ss.android.ugc.aweme.compliance.protection.antiaddiction.a.a aVar2 = this.f77922a;
                SharePrefCache.inst().getLastHintToastTime().b(Long.valueOf(System.currentTimeMillis()));
                aVar2.f77906c++;
                com.ss.android.ugc.aweme.compliance.protection.antiaddiction.b.a().f77916f = String.valueOf((com.ss.android.ugc.aweme.compliance.protection.antiaddiction.a.a.a() * ((long) this.f77922a.f77906c)) / 60000);
            }
        }
        return false;
    }
}
