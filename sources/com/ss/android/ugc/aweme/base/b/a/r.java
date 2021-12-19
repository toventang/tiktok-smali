package com.ss.android.ugc.aweme.base.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.a;

final class r implements a {

    /* renamed from: a  reason: collision with root package name */
    private Context f68022a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f68023b;

    static {
        Covode.recordClassIndex(41899);
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.a
    public final long a() {
        return this.f68023b.getLong("last_unlock_time", 0);
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.a
    public final long b() {
        return this.f68023b.getLong("last_append_video_time", 0);
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.a
    public final long c() {
        return this.f68023b.getLong("today_video_play_time", 0);
    }

    public r(Context context) {
        this.f68022a = context;
        this.f68023b = d.a(context, "aweme-app", 0);
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.a
    public final void a(long j2) {
        SharedPreferences.Editor edit = this.f68023b.edit();
        edit.putLong("last_unlock_time", j2);
        edit.apply();
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.a
    public final void b(long j2) {
        SharedPreferences.Editor edit = this.f68023b.edit();
        edit.putLong("last_append_video_time", j2);
        edit.apply();
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.a
    public final void c(long j2) {
        SharedPreferences.Editor edit = this.f68023b.edit();
        edit.putLong("today_video_play_time", j2);
        edit.apply();
    }
}
