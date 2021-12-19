package com.ss.android.ugc.aweme.util;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.aweme.ug.c;
import com.ss.android.ugc.aweme.user.e;
import com.ss.android.ugc.aweme.user.f;
import com.ss.android.ugc.aweme.util.a.a;
import java.util.Calendar;
import java.util.concurrent.Callable;

public final /* synthetic */ class t implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static final Callable f142554a = new t();

    static {
        Covode.recordClassIndex(93227);
    }

    private t() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (!a.c()) {
            int i2 = a.a().getInt("many_days_viewed_count", 0);
            c a2 = UgCommonServiceImpl.j().a();
            int i3 = i2 + 1;
            if (i3 == 1) {
                a2.a("F1", null, null);
                a2.b("F1", null, null);
            } else if (i3 == 10) {
                a2.a("F10", null, null);
                a2.b("F10", null, null);
            }
            a.b().putInt("many_days_viewed_count", i3).apply();
            if (i3 >= 30 && !a.a().getBoolean("has_reported_viewed_30_many_days", false)) {
                if (d.i()) {
                    a2.c("af_vvfinish_allday30");
                }
                a.b().putBoolean("has_reported_viewed_30_many_days", true).apply();
                a2.a("F30", null, null);
                a2.b("F30", null, null);
            }
            if (i3 >= 50 && !a.c()) {
                if (d.i()) {
                    a2.c("af_vvfinish_allday50");
                }
                a.b().putBoolean("has_reported_viewed_50_many_days", true).apply();
                a2.a("F50", null, null);
                a2.b("F50", null, null);
            }
        }
        if (d.i() || d.e()) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(System.currentTimeMillis());
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            String sb = new StringBuilder().append(instance.getTimeInMillis()).toString();
            String string = a.a().getString("current_data", "");
            int i4 = a.a().getInt("one_day_viewed_count", 0);
            if (!TextUtils.equals(sb, string)) {
                a.a(0);
                a.b().putString("current_data", sb).apply();
                i4 = 0;
            }
            int i5 = i4 + 1;
            a.a(i5);
            c a3 = UgCommonServiceImpl.j().a();
            if (d.e() && i5 >= 10 && !a.a().getBoolean("has_reported_viewed_10_one_day", false)) {
                a3.c("af_vvfinish_aday10");
                a.b().putBoolean("has_reported_viewed_10_one_day", true).apply();
            }
            if (d.e() && i5 >= 20 && !a.a().getBoolean("has_reported_viewed_20_one_day", false)) {
                a3.c("af_vvfinish_aday20");
                a.b().putBoolean("has_reported_viewed_20_one_day", true).apply();
            }
            if (f.a(e.f142364k.a()) && d.e() && i5 >= 10 && !a.a().getBoolean("has_reported_viewed_10_one_day_login", false)) {
                a3.c("af_vvfinish_aday10_login");
                a.b().putBoolean("has_reported_viewed_10_one_day_login", true).apply();
            }
            if (f.a(e.f142364k.a()) && d.e() && i5 >= 20 && !a.a().getBoolean("has_reported_viewed_20_one_day_login", false)) {
                a3.c("af_vvfinish_aday20_login");
                a.b().putBoolean("has_reported_viewed_20_one_day_login", true).apply();
            }
            if (f.a(e.f142364k.a()) && d.e() && i5 >= 30 && !a.a().getBoolean("has_reported_viewed_30_one_day_login", false)) {
                a3.c("af_vvfinish_aday30_login");
                a.b().putBoolean("has_reported_viewed_30_one_day_login", true).apply();
            }
            if (f.a(e.f142364k.a()) && d.e() && i5 >= 50 && !a.a().getBoolean("has_reported_viewed_50_one_day_login", false)) {
                a3.c("af_vvfinish_aday50_login");
                a.b().putBoolean("has_reported_viewed_50_one_day_login", true).apply();
            }
            if (i5 >= 30 && !a.a().getBoolean("has_reported_viewed_30_one_day", false)) {
                a3.c("af_vvfinish_aday30");
                a.b().putBoolean("has_reported_viewed_30_one_day", true).apply();
            }
            if (i5 >= 50 && !a.a().getBoolean("has_reported_viewed_50_one_day", false)) {
                a3.c("af_vvfinish_aday50");
                a.b().putBoolean("has_reported_viewed_50_one_day", true).apply();
            }
        }
        return null;
    }
}
