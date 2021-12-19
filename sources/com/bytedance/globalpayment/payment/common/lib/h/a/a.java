package com.bytedance.globalpayment.payment.common.lib.h.a;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.l;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.payment.common.lib.b.b;
import com.bytedance.globalpayment.payment.common.lib.b.c;
import com.bytedance.globalpayment.payment.common.lib.b.d;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.lancet.j;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class a implements com.bytedance.globalpayment.payment.common.lib.h.b.a {

    /* renamed from: a  reason: collision with root package name */
    private com.bytedance.globalpayment.payment.common.lib.b.a f30577a;

    static {
        Covode.recordClassIndex(17725);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b.a
    public final com.bytedance.globalpayment.payment.common.lib.b.a c() {
        return this.f30577a;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b.a
    public final boolean a() {
        return this.f30577a.f30515j;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b.a
    public final Context b() {
        return this.f30577a.f30506a;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b.a
    public final c d() {
        return this.f30577a.q;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b.a
    public final com.bytedance.globalpayment.payment.common.lib.f.a e() {
        return this.f30577a.f30507b;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b.a
    public final String g() {
        return this.f30577a.n;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b.a
    public final Map<String, String> f() {
        HashMap hashMap = new HashMap();
        AppLog.getSSIDs(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("sdk_version_code", "1");
        hashMap2.put("sdk_version_name", "1.0");
        String str = (String) hashMap.get("install_id");
        if (!m.a(str)) {
            hashMap2.put("iid", str);
        }
        String str2 = (String) hashMap.get("device_id");
        if (!m.a(str2)) {
            hashMap2.put("device_id", str2);
        }
        Application application = this.f30577a.f30506a;
        if (TextUtils.isEmpty(j.f107222a) || !j.b() || j.c()) {
            j.f107222a = l.a(l.a(application));
        }
        String str3 = j.f107222a;
        if (!m.a(str3)) {
            hashMap2.put("ac", str3);
        }
        String str4 = this.f30577a.f30507b.f30561e;
        if (str4 != null) {
            hashMap2.put("channel", str4);
        }
        hashMap2.put("aid", String.valueOf(this.f30577a.f30507b.f30557a));
        hashMap2.put("app_name", this.f30577a.f30507b.f30562f);
        hashMap2.put("version_code", String.valueOf(this.f30577a.f30507b.f30559c));
        hashMap2.put("version_name", this.f30577a.f30507b.f30558b);
        hashMap2.put("update_version_code", String.valueOf(this.f30577a.f30507b.f30560d));
        hashMap2.put("device_type", Build.MODEL);
        hashMap2.put("device_brand", Build.BRAND);
        hashMap2.put("device_manufacturer", Build.MANUFACTURER);
        hashMap2.put("language", Locale.getDefault().getLanguage());
        hashMap2.put("os_api", String.valueOf(Build.VERSION.SDK_INT));
        try {
            String str5 = Build.VERSION.RELEASE;
            if (str5 != null && str5.length() > 10) {
                str5 = str5.substring(0, 10);
            }
            hashMap2.put("os_version", str5);
        } catch (Exception unused) {
        }
        hashMap2.put("os", "android");
        hashMap2.put("package", this.f30577a.f30506a.getPackageName());
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        if (timeZone != null) {
            hashMap2.put("tz_offset", String.valueOf(timeZone.getOffset(System.currentTimeMillis()) / 1000));
            hashMap2.put("tz_name", timeZone.getID());
        }
        String language = Locale.getDefault().getLanguage();
        if (!m.a(language)) {
            hashMap2.put("language", language);
        }
        String country = Locale.getDefault().getCountry();
        if (!m.a(country)) {
            hashMap2.put("region", country.toLowerCase());
        }
        com.bytedance.globalpayment.payment.common.lib.d.a aVar = this.f30577a.f30511f;
        if (aVar != null) {
            hashMap2.put("app_region", aVar.name());
        }
        return hashMap2;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b.a
    public final void a(com.bytedance.globalpayment.payment.common.lib.b.a aVar) {
        if (aVar != null) {
            if (this.f30577a == null) {
                this.f30577a = aVar;
            }
            com.bytedance.globalpayment.payment.common.lib.b.a aVar2 = this.f30577a;
            if (aVar2.f30506a == null && aVar.f30506a != null) {
                aVar2.f30506a = aVar.f30506a;
            }
            if (aVar2.f30507b == null && aVar.f30507b != null) {
                aVar2.f30507b = aVar.f30507b;
            }
            if (aVar2.f30508c == null && aVar.f30508c != null) {
                aVar2.f30508c = aVar.f30508c;
            }
            if (TextUtils.isEmpty(aVar2.f30509d) && !TextUtils.isEmpty(aVar.f30509d)) {
                aVar2.f30509d = aVar.f30509d;
            }
            if (TextUtils.isEmpty(aVar2.f30510e) && !TextUtils.isEmpty(aVar.f30510e)) {
                aVar2.f30510e = aVar.f30510e;
            }
            if (aVar2.f30511f == null && aVar.f30511f != null) {
                aVar2.f30511f = aVar.f30511f;
            }
            if (TextUtils.isEmpty(aVar2.f30512g) && !TextUtils.isEmpty(aVar.f30512g)) {
                aVar2.f30512g = aVar.f30512g;
            }
            if (!aVar2.f30513h && aVar.f30513h) {
                aVar2.f30513h = true;
            }
            if (!aVar2.f30514i && aVar.f30514i) {
                aVar2.f30514i = true;
            }
            if (!aVar2.f30515j && aVar.f30515j) {
                aVar2.f30515j = true;
            }
            if (TextUtils.isEmpty(aVar2.f30516k) && !TextUtils.isEmpty(aVar.f30516k)) {
                aVar2.f30516k = aVar.f30516k;
            }
            if (TextUtils.isEmpty(aVar2.f30517l) && !TextUtils.isEmpty(aVar.f30517l)) {
                aVar2.f30517l = aVar.f30517l;
            }
            if (aVar2.f30518m == null && aVar.f30518m != null) {
                aVar2.f30518m = aVar.f30518m;
            }
            if (aVar2.o == null && aVar.o != null) {
                aVar2.o = aVar.o;
            }
            if (TextUtils.isEmpty(aVar2.n) && !TextUtils.isEmpty(aVar.n)) {
                aVar2.n = aVar.n;
            }
            if (aVar2.p == null) {
                aVar2.p = aVar.p;
            } else {
                b bVar = aVar2.p;
                b bVar2 = aVar.p;
                if (bVar2 != null) {
                    if (!((bVar.f30532a != null && bVar.f30533b != null && bVar.f30534c != null) || bVar2.f30532a == null || bVar2.f30533b == null || bVar2.f30534c == null)) {
                        bVar.f30532a = bVar2.f30532a;
                        bVar.f30533b = bVar2.f30533b;
                        bVar.f30534c = bVar2.f30534c;
                    }
                    if (TextUtils.isEmpty(bVar.f30535d) && !TextUtils.isEmpty(bVar2.f30535d)) {
                        bVar.f30535d = bVar2.f30535d;
                    }
                    if (bVar.f30536e == null) {
                        bVar.f30536e = bVar2.f30536e;
                    } else {
                        d dVar = bVar.f30536e;
                        d dVar2 = bVar2.f30536e;
                        if (dVar2 != null && TextUtils.isEmpty(dVar.f30555a) && !TextUtils.isEmpty(dVar2.f30555a)) {
                            dVar.f30555a = dVar2.f30555a;
                        }
                    }
                    if (TextUtils.isEmpty(bVar.f30537f) && !TextUtils.isEmpty(bVar2.f30537f)) {
                        bVar.f30537f = bVar2.f30537f;
                    }
                    if (TextUtils.isEmpty(bVar.f30538g) && !TextUtils.isEmpty(bVar2.f30538g)) {
                        bVar.f30538g = bVar2.f30538g;
                    }
                }
            }
            if (aVar2.q == null) {
                aVar2.q = aVar.q;
            } else {
                c cVar = aVar2.q;
                c cVar2 = aVar.q;
                if (TextUtils.isEmpty(cVar.f30540b) && !TextUtils.isEmpty(cVar2.f30540b)) {
                    cVar.f30540b = cVar2.f30540b;
                }
                if (TextUtils.isEmpty(cVar.f30539a) && !TextUtils.isEmpty(cVar2.f30539a)) {
                    cVar.f30539a = cVar2.f30539a;
                }
                if (cVar.f30541c == 0 && cVar2.f30541c != 0) {
                    cVar.f30541c = cVar2.f30541c;
                }
                if (TextUtils.isEmpty(cVar.f30542d) && !TextUtils.isEmpty(cVar2.f30542d)) {
                    cVar.f30542d = cVar2.f30542d;
                }
                if (cVar.f30543e == null && cVar2.f30543e != null) {
                    cVar.f30543e = cVar2.f30543e;
                }
                cVar.f30544f = cVar2.f30544f;
                if (!cVar.f30545g && cVar2.f30545g) {
                    cVar.f30545g = true;
                }
                if (!cVar.f30546h && cVar2.f30546h) {
                    cVar.f30546h = true;
                }
            }
            if (aVar2.r == null && aVar.r != null) {
                aVar2.r = aVar.r;
            }
        }
    }
}
