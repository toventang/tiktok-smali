package com.ss.android.ugc.aweme.account.login.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.f;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static f f63500a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static final b f63501b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static HashMap<String, List<PhoneCountryData>> f63502c = new HashMap<>();

    public static final class a extends com.google.gson.b.a<List<? extends PhoneCountryData>> {
        static {
            Covode.recordClassIndex(39148);
        }

        a() {
        }
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(39147);
    }

    public static final boolean b() {
        try {
            if (((HashMap) SettingsManager.a().a("choose_phone_country_list", HashMap.class)) != null) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final PhoneCountryCodeResponse a() {
        HashMap hashMap;
        try {
            if (f63502c.isEmpty() && (hashMap = (HashMap) SettingsManager.a().a("choose_phone_country_list", HashMap.class)) != null) {
                for (String str : hashMap.keySet()) {
                    List list = (List) hashMap.get(str);
                    if (list != null) {
                        l.b(list, "");
                        List<PhoneCountryData> list2 = (List) f63500a.a(f63500a.b(list), new a().type);
                        HashMap<String, List<PhoneCountryData>> hashMap2 = f63502c;
                        l.b(str, "");
                        l.b(list2, "");
                        hashMap2.put(str, list2);
                    }
                }
            }
            return new PhoneCountryCodeResponse(f63502c);
        } catch (Throwable unused) {
            return new PhoneCountryCodeResponse(f63502c);
        }
    }
}
