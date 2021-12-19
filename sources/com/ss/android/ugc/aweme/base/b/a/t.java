package com.ss.android.ugc.aweme.base.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.main.ay;

/* access modifiers changed from: package-private */
public final class t implements ay {

    /* renamed from: a  reason: collision with root package name */
    private Context f68026a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f68027b;

    static {
        Covode.recordClassIndex(41901);
    }

    @Override // com.ss.android.ugc.aweme.main.ay
    public final void b() {
        SharedPreferences.Editor edit = this.f68027b.edit();
        edit.putBoolean("shouldCleanEffectsAtFirstLaunch", false);
        edit.apply();
    }

    @Override // com.ss.android.ugc.aweme.main.ay
    public final long c() {
        return this.f68027b.getLong("cleanEffectsLastTime", 0);
    }

    @Override // com.ss.android.ugc.aweme.main.ay
    public final boolean e() {
        return this.f68027b.getBoolean("hasShowUnloginContentLanguageDialog", false);
    }

    @Override // com.ss.android.ugc.aweme.main.ay
    public final boolean f() {
        return this.f68027b.getBoolean("isCheckContentLanguageDialogWhenFirstLaunch", false);
    }

    @Override // com.ss.android.ugc.aweme.main.ay
    public final void g() {
        SharedPreferences.Editor edit = this.f68027b.edit();
        edit.putBoolean("isCheckContentLanguageDialogWhenFirstLaunch", true);
        edit.apply();
    }

    @Override // com.ss.android.ugc.aweme.main.ay
    public final boolean d() {
        return this.f68027b.getBoolean("secondTabLastLandFollowTab", false);
    }

    @Override // com.ss.android.ugc.aweme.main.ay
    public final boolean a() {
        return this.f68027b.getBoolean("shouldCleanEffectsAtFirstLaunch", true);
    }

    public t(Context context) {
        this.f68026a = context;
        this.f68027b = d.a(context, "MainTabPreferences", 0);
    }

    @Override // com.ss.android.ugc.aweme.main.ay
    public final String a(String str) {
        return this.f68027b.getString("hasClickActivityDot", str);
    }

    @Override // com.ss.android.ugc.aweme.main.ay
    public final String d(String str) {
        return this.f68027b.getString("unloginContentLanguage", str);
    }

    @Override // com.ss.android.ugc.aweme.main.ay
    public final void a(long j2) {
        SharedPreferences.Editor edit = this.f68027b.edit();
        edit.putLong("cleanEffectsLastTime", j2);
        edit.apply();
    }

    @Override // com.ss.android.ugc.aweme.main.ay
    public final void b(String str) {
        SharedPreferences.Editor edit = this.f68027b.edit();
        edit.putString("hasClickActivityDot", str);
        edit.apply();
    }

    @Override // com.ss.android.ugc.aweme.main.ay
    public final void c(String str) {
        SharedPreferences.Editor edit = this.f68027b.edit();
        edit.putString("unloginContentLanguage", str);
        edit.apply();
    }

    @Override // com.ss.android.ugc.aweme.main.ay
    public final void a(boolean z) {
        SharedPreferences.Editor edit = this.f68027b.edit();
        edit.putBoolean("hasShowUnloginContentLanguageDialog", z);
        edit.apply();
    }
}
