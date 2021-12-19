package com.facebook.a.e;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.ae;
import com.facebook.m;

/* access modifiers changed from: package-private */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public String f46759a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f46760b;

    static {
        Covode.recordClassIndex(28487);
    }

    public final void a() {
        ae.a();
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(m.f48921g).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f46759a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f46760b);
        edit.apply();
    }

    public final String toString() {
        String str;
        if (this.f46760b) {
            str = "Applink";
        } else {
            str = "Unclassified";
        }
        if (this.f46759a != null) {
            return str + "(" + this.f46759a + ")";
        }
        return str;
    }

    k(String str, boolean z) {
        this.f46759a = str;
        this.f46760b = z;
    }
}
