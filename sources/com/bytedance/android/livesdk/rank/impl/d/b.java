package com.bytedance.android.livesdk.rank.impl.d;

import com.bytedance.android.live.core.f.r;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.chatroom.f.c;
import com.bytedance.android.livesdk.livesetting.rank.LiveHourlyRankLengthSetting;
import com.bytedance.android.livesdk.rank.api.model.h;
import com.bytedance.android.livesdk.rank.impl.api.model.e;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.aa;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Locale;

public class b {

    /* renamed from: g  reason: collision with root package name */
    private static b f20660g;

    /* renamed from: a  reason: collision with root package name */
    public e f20661a;

    /* renamed from: b  reason: collision with root package name */
    public e f20662b;

    /* renamed from: c  reason: collision with root package name */
    public e f20663c;

    /* renamed from: d  reason: collision with root package name */
    public List<h> f20664d;

    /* renamed from: e  reason: collision with root package name */
    public e f20665e;

    /* renamed from: f  reason: collision with root package name */
    public long f20666f;

    static {
        Covode.recordClassIndex(12217);
    }

    private b() {
    }

    public static b a() {
        MethodCollector.i(2407);
        if (f20660g == null) {
            synchronized (b.class) {
                try {
                    if (f20660g == null) {
                        f20660g = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2407);
                    throw th;
                }
            }
        }
        b bVar = f20660g;
        MethodCollector.o(2407);
        return bVar;
    }

    public final boolean a(int i2) {
        if (r.a(this.f20664d)) {
            return false;
        }
        long c2 = u.a().b().c();
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 < this.f20664d.size() && this.f20664d.get(i3).f20607a.getId() == c2) {
                return true;
            }
        }
        return false;
    }

    public static String a(int i2, String str) {
        int value = LiveHourlyRankLengthSetting.INSTANCE.getValue();
        if (i2 == 1) {
            return y.a((int) R.string.dt1, str);
        } else if (i2 >= 2 && i2 <= 3) {
            return y.a((int) R.string.eon, str);
        } else if (i2 >= 4 && i2 <= 10) {
            return y.a((int) R.string.e74, str);
        } else if (i2 >= 11 && i2 <= value) {
            return y.a((int) R.string.e76, str, Integer.valueOf(i2 - 1));
        } else if (i2 <= value) {
            return str;
        } else {
            return y.a((int) R.string.e72, str);
        }
    }

    public final String a(long j2, long j3) {
        String upperCase = aa.a(j3).toUpperCase(Locale.ENGLISH);
        e eVar = this.f20665e;
        if (eVar == null || eVar.f20644b == null || j3 < ((long) this.f20665e.f20644b.f20648a)) {
            return upperCase;
        }
        if (this.f20665e.f20645c != null) {
            if (this.f20665e.f20645c.f20637a && (j2 == 0 || j2 == u.a().b().c())) {
                return upperCase;
            }
            if (this.f20665e.f20645c.f20638b && this.f20666f >= ((long) this.f20665e.f20644b.f20648a)) {
                return upperCase;
            }
        }
        return this.f20665e.f20644b.f20649b;
    }

    public final String a(long j2, long j3, String str) {
        e eVar = this.f20662b;
        if (eVar == null || eVar.f20644b == null || j3 < ((long) this.f20662b.f20644b.f20648a)) {
            return str;
        }
        if (this.f20662b.f20645c == null || ((!this.f20662b.f20645c.f20637a || (j2 != 0 && j2 != u.a().b().c())) && !a(this.f20662b.f20645c.f20639c))) {
            return this.f20662b.f20644b.f20649b;
        }
        return str;
    }

    public final String a(long j2, long j3, int i2, com.bytedance.android.livesdk.model.message.c.b bVar) {
        String obj = c.a(bVar, "").toString();
        e eVar = this.f20663c;
        if (eVar == null || eVar.f20644b == null || j3 < ((long) this.f20663c.f20644b.f20648a)) {
            return obj;
        }
        if (this.f20663c.f20645c == null || ((!this.f20663c.f20645c.f20637a || (j2 != 0 && j2 != u.a().b().c())) && !a(this.f20663c.f20645c.f20639c))) {
            return a(i2, this.f20663c.f20644b.f20649b);
        }
        return obj;
    }
}
