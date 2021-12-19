package com.ss.android.ugc.aweme.compliance.protection.antiaddiction;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.cn;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static String f77934a;

    /* renamed from: b  reason: collision with root package name */
    public static final f f77935b = new f();

    /* renamed from: c  reason: collision with root package name */
    private static final h f77936c = i.a((h.f.a.a) a.f77937a);

    private f() {
    }

    static {
        Covode.recordClassIndex(48310);
    }

    public static final String b() {
        try {
            String a2 = SettingsManager.a().a("anti_addiction_pop_up_text", "");
            l.b(a2, "");
            return a2;
        } catch (Throwable unused) {
            return e.f77932a;
        }
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77937a = new a();

        static {
            Covode.recordClassIndex(48311);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            Integer antiAddictionDayTime = iESSettingsProxy.getAntiAddictionDayTime();
            IESSettingsProxy iESSettingsProxy2 = c.f99077a.f99078b;
            l.b(iESSettingsProxy2, "");
            Integer antiAddictionNightTime = iESSettingsProxy2.getAntiAddictionNightTime();
            String b2 = f.b();
            if (antiAddictionDayTime == null || antiAddictionNightTime == null || antiAddictionDayTime.intValue() <= 0 || antiAddictionNightTime.intValue() <= 0 || TextUtils.isEmpty(b2)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final boolean a() {
        if (cn.f89703a) {
            return ((Boolean) f77936c.getValue()).booleanValue();
        }
        IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
        l.b(iESSettingsProxy, "");
        Integer antiAddictionDayTime = iESSettingsProxy.getAntiAddictionDayTime();
        IESSettingsProxy iESSettingsProxy2 = c.f99077a.f99078b;
        l.b(iESSettingsProxy2, "");
        Integer antiAddictionNightTime = iESSettingsProxy2.getAntiAddictionNightTime();
        String b2 = b();
        if (antiAddictionDayTime == null || antiAddictionNightTime == null || antiAddictionDayTime.intValue() <= 0 || antiAddictionNightTime.intValue() <= 0 || TextUtils.isEmpty(b2)) {
            return false;
        }
        return true;
    }
}
