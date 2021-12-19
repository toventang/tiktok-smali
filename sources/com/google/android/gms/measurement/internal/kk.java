package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.ap;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* access modifiers changed from: package-private */
public abstract class kk {

    /* renamed from: a  reason: collision with root package name */
    String f52008a;

    /* renamed from: b  reason: collision with root package name */
    int f52009b;

    /* renamed from: c  reason: collision with root package name */
    Boolean f52010c;

    /* renamed from: d  reason: collision with root package name */
    Boolean f52011d;

    /* renamed from: e  reason: collision with root package name */
    Long f52012e;

    /* renamed from: f  reason: collision with root package name */
    Long f52013f;

    static {
        Covode.recordClassIndex(32368);
    }

    /* access modifiers changed from: package-private */
    public abstract int a();

    /* access modifiers changed from: package-private */
    public abstract boolean b();

    /* access modifiers changed from: package-private */
    public abstract boolean c();

    kk(String str, int i2) {
        this.f52008a = str;
        this.f52009b = i2;
    }

    static Boolean a(double d2, ap.d dVar) {
        try {
            return a(new BigDecimal(d2), dVar, Math.ulp(d2));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean a(long j2, ap.d dVar) {
        try {
            return a(new BigDecimal(j2), dVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean a(Boolean bool, boolean z) {
        boolean z2;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    static Boolean a(String str, ap.d dVar) {
        if (!jv.a(str)) {
            return null;
        }
        try {
            return a(new BigDecimal(str), dVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean a(String str, ap.f fVar, eb ebVar) {
        String str2;
        List<String> list;
        r.a(fVar);
        String str3 = null;
        if (str == null || !fVar.a() || fVar.b() == ap.f.a.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (fVar.b() == ap.f.a.IN_LIST) {
            if (fVar.d() == 0) {
                return null;
            }
        } else if (!fVar.c()) {
            return null;
        }
        ap.f.a b2 = fVar.b();
        boolean z = fVar.zzf;
        if (z || b2 == ap.f.a.REGEXP || b2 == ap.f.a.IN_LIST) {
            str2 = fVar.zze;
        } else {
            str2 = fVar.zze.toUpperCase(Locale.ENGLISH);
        }
        if (fVar.d() == 0) {
            list = null;
        } else {
            list = fVar.zzg;
            if (!z) {
                ArrayList arrayList = new ArrayList(list.size());
                for (String str4 : list) {
                    arrayList.add(str4.toUpperCase(Locale.ENGLISH));
                }
                list = Collections.unmodifiableList(arrayList);
            }
        }
        if (b2 == ap.f.a.REGEXP) {
            str3 = str2;
        }
        return a(str, b2, z, str2, list, str3, ebVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0075, code lost:
        if (r3 != null) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean a(java.math.BigDecimal r10, com.google.android.gms.internal.measurement.ap.d r11, double r12) {
        /*
        // Method dump skipped, instructions count: 256
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.kk.a(java.math.BigDecimal, com.google.android.gms.internal.measurement.ap$d, double):java.lang.Boolean");
    }

    private static Boolean a(String str, ap.f.a aVar, boolean z, String str2, List<String> list, String str3, eb ebVar) {
        int i2;
        if (str == null) {
            return null;
        }
        if (aVar == ap.f.a.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && aVar != ap.f.a.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (kg.f51998a[aVar.ordinal()]) {
            case 1:
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 66;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, i2).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (ebVar != null) {
                        ebVar.f51471f.a("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return Boolean.valueOf(str.equals(str2));
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }
}
