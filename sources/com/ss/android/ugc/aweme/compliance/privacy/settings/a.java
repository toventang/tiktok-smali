package com.ss.android.ugc.aweme.compliance.privacy.settings;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.ss.android.ugc.aweme.compliance.api.model.p;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f77438a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(47904);
    }

    public static boolean b() {
        boolean c2 = GuestModeServiceImpl.d().c();
        if (!com.ss.android.ugc.aweme.compliance.privacy.a.a.d() && !c2) {
            return false;
        }
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            Boolean enableDownloadTtData = iESSettingsProxy.getEnableDownloadTtData();
            l.b(enableDownloadTtData, "");
            if (enableDownloadTtData.booleanValue() || c2) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a() {
        if (com.ss.android.ugc.aweme.compliance.api.a.g().a() || GuestModeServiceImpl.d().c()) {
            return true;
        }
        return false;
    }

    private static C1789a a(int i2) {
        boolean z = false;
        boolean z2 = true;
        if (i2 != 1) {
            if (i2 != 2) {
                z = true;
            } else {
                z2 = false;
            }
        }
        return new C1789a(z, z2);
    }

    public static C1789a b(o oVar) {
        int i2;
        if (oVar != null) {
            i2 = oVar.getShowType();
        } else {
            i2 = 0;
        }
        return a(i2);
    }

    public static C1789a a(o oVar) {
        int i2;
        if (oVar != null) {
            i2 = oVar.getShowType();
        } else {
            i2 = 0;
        }
        return a(i2);
    }

    public static C1789a a(p pVar) {
        int i2;
        if (pVar != null) {
            i2 = pVar.getShowType();
        } else {
            i2 = 0;
        }
        return a(i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.a$a  reason: collision with other inner class name */
    public static final class C1789a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f77439a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f77440b;

        static {
            Covode.recordClassIndex(47905);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1789a)) {
                return false;
            }
            C1789a aVar = (C1789a) obj;
            return this.f77439a == aVar.f77439a && this.f77440b == aVar.f77440b;
        }

        public final int hashCode() {
            boolean z = this.f77439a;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = i3 * 31;
            if (!this.f77440b) {
                i2 = 0;
            }
            return i6 + i2;
        }

        public final String toString() {
            return "RestrictionViewStatus(isEnabled=" + this.f77439a + ", isVisible=" + this.f77440b + ")";
        }

        public C1789a(boolean z, boolean z2) {
            this.f77439a = z;
            this.f77440b = z2;
        }
    }

    public static boolean a(o oVar, Context context) {
        l.d(context, "");
        if (oVar == null || oVar.getShowType() != 1) {
            return true;
        }
        if (oVar.getResType() != 2 || !(context instanceof Activity)) {
            return false;
        }
        new b((Activity) context).e(R.string.brr).b();
        return false;
    }

    public static boolean a(p pVar, Context context) {
        l.d(context, "");
        if (pVar == null || pVar.getShowType() != 1) {
            return true;
        }
        if (pVar.getResType() != 2 || !(context instanceof Activity)) {
            return false;
        }
        new b((Activity) context).e(R.string.brr).b();
        return false;
    }
}
