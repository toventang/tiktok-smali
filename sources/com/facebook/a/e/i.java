package com.facebook.a.e;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.ae;
import com.facebook.m;
import java.util.UUID;

final class i {

    /* renamed from: a  reason: collision with root package name */
    public Long f46751a;

    /* renamed from: b  reason: collision with root package name */
    public Long f46752b;

    /* renamed from: c  reason: collision with root package name */
    public int f46753c;

    /* renamed from: d  reason: collision with root package name */
    Long f46754d;

    /* renamed from: e  reason: collision with root package name */
    public k f46755e;

    /* renamed from: f  reason: collision with root package name */
    public UUID f46756f;

    static {
        Covode.recordClassIndex(28485);
    }

    public final long a() {
        Long l2 = this.f46754d;
        if (l2 == null) {
            return 0;
        }
        return l2.longValue();
    }

    public final long b() {
        Long l2;
        if (this.f46751a == null || (l2 = this.f46752b) == null) {
            return 0;
        }
        return l2.longValue() - this.f46751a.longValue();
    }

    public final void c() {
        ae.a();
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(m.f48921g).edit();
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", this.f46751a.longValue());
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", this.f46752b.longValue());
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f46753c);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f46756f.toString());
        edit.apply();
        k kVar = this.f46755e;
        if (kVar != null) {
            kVar.a();
        }
    }

    public i(Long l2, Long l3) {
        this(l2, l3, UUID.randomUUID());
    }

    private i(Long l2, Long l3, UUID uuid) {
        this.f46751a = l2;
        this.f46752b = l3;
        this.f46756f = uuid;
    }
}
