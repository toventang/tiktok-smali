package com.google.firebase.analytics.connector.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.util.b;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f54273a = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: b  reason: collision with root package name */
    public static final List<String> f54274b = Arrays.asList("_r", "_dbg");

    /* renamed from: c  reason: collision with root package name */
    public static final List<String> f54275c = Arrays.asList(b.a(AppMeasurement.a.f51672a, AppMeasurement.a.f51673b));

    /* renamed from: d  reason: collision with root package name */
    public static final List<String> f54276d = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* renamed from: e  reason: collision with root package name */
    private static final Set<String> f54277e = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* renamed from: f  reason: collision with root package name */
    private static final List<String> f54278f = Arrays.asList("auto", "app", "am");

    static {
        Covode.recordClassIndex(33699);
    }

    public static boolean a(String str) {
        if (!f54278f.contains(str)) {
            return true;
        }
        return false;
    }
}
