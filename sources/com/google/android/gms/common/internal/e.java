package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.c.g;
import com.a;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.c.b;
import com.google.android.gms.common.c.c;
import com.google.android.gms.common.util.h;
import com.zhiliaoapp.musically.R;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final g<String, String> f50403a = new g<>();

    static {
        Covode.recordClassIndex(31399);
    }

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            b a2 = c.f50295a.a(context);
            return a2.f50294a.getPackageManager().getApplicationLabel(b.a(a2.f50294a.getPackageManager(), packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String a(Context context, int i2) {
        Resources resources = context.getResources();
        if (i2 == 1) {
            return resources.getString(R.string.ao2);
        }
        if (i2 == 2) {
            return resources.getString(R.string.ao9);
        }
        if (i2 == 3) {
            return resources.getString(R.string.anz);
        }
        if (i2 == 5) {
            return a(context, "common_google_play_services_invalid_account_title");
        }
        if (i2 == 7) {
            return a(context, "common_google_play_services_network_error_title");
        }
        if (i2 == 17) {
            return a(context, "common_google_play_services_sign_in_failed_title");
        }
        if (i2 != 20) {
            return null;
        }
        return a(context, "common_google_play_services_restricted_profile_title");
    }

    public static String a(Context context, String str) {
        MethodCollector.i(11259);
        g<String, String> gVar = f50403a;
        synchronized (gVar) {
            try {
                String str2 = gVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources c2 = com.google.android.gms.common.g.c(context);
                if (c2 == null) {
                    MethodCollector.o(11259);
                    return null;
                }
                int identifier = c2.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    String valueOf = String.valueOf(str);
                    if (valueOf.length() != 0) {
                        "Missing resource: ".concat(valueOf);
                    } else {
                        new String("Missing resource: ");
                    }
                    MethodCollector.o(11259);
                    return null;
                }
                String string = c2.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    String valueOf2 = String.valueOf(str);
                    if (valueOf2.length() != 0) {
                        "Got empty resource: ".concat(valueOf2);
                    } else {
                        new String("Got empty resource: ");
                    }
                    MethodCollector.o(11259);
                    return null;
                }
                gVar.put(str, string);
                MethodCollector.o(11259);
                return string;
            } finally {
                MethodCollector.o(11259);
            }
        }
    }

    public static String b(Context context, int i2) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i2 == 1) {
            return resources.getString(R.string.ao1, a2);
        } else if (i2 != 2) {
            if (i2 == 3) {
                return resources.getString(R.string.any, a2);
            } else if (i2 == 5) {
                return a(context, "common_google_play_services_invalid_account_text", a2);
            } else {
                if (i2 == 7) {
                    return a(context, "common_google_play_services_network_error_text", a2);
                }
                if (i2 == 9) {
                    return resources.getString(R.string.ao6, a2);
                } else if (i2 == 20) {
                    return a(context, "common_google_play_services_restricted_profile_text", a2);
                } else {
                    switch (i2) {
                        case 16:
                            return a(context, "common_google_play_services_api_unavailable_text", a2);
                        case 17:
                            return a(context, "common_google_play_services_sign_in_failed_text", a2);
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            return resources.getString(R.string.ao_, a2);
                        default:
                            return resources.getString(R.string.ao5, a2);
                    }
                }
            }
        } else if (h.b(context)) {
            return resources.getString(R.string.aoa);
        } else {
            return resources.getString(R.string.ao8, a2);
        }
    }

    public static String a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a2 = a(context, str);
        if (a2 == null) {
            a2 = resources.getString(R.string.ao5);
        }
        return a.a(resources.getConfiguration().locale, a2, new Object[]{str2});
    }
}
