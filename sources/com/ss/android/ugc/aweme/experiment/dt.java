package com.ss.android.ugc.aweme.experiment;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.abmock.b;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.bh.a;
import h.h;
import h.i;
import h.m;

public final class dt {

    /* renamed from: a  reason: collision with root package name */
    public static final dt f89841a = new dt();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f89842b = true;

    /* renamed from: c  reason: collision with root package name */
    private static final h f89843c = i.a(m.SYNCHRONIZED, a.f89844a);

    public static final boolean a() {
        return ((Boolean) f89843c.getValue()).booleanValue();
    }

    private dt() {
    }

    static {
        Covode.recordClassIndex(56429);
    }

    static final class a extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f89844a = new a();

        static {
            Covode.recordClassIndex(56430);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            String[] stringArray;
            boolean z = true;
            if (Keva.getRepo("is_gms_async_bind", 1).getBoolean("async_bind_enable", false)) {
                if (!TextUtils.isEmpty(com.ss.android.ugc.aweme.bh.a.f68681a) && (stringArray = Keva.getRepo("is_gms_async_bind", 1).getStringArray("ignore_activities", null)) != null) {
                    int length = stringArray.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (TextUtils.equals(stringArray[i2], com.ss.android.ugc.aweme.bh.a.f68681a)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    public static void b() {
        Keva repo = Keva.getRepo("is_gms_async_bind", 1);
        repo.storeBoolean("async_bind_enable", b.a().a(true, "gms_client_service_async_bind", false));
        repo.storeStringArray("ignore_activities", (String[]) SettingsManager.a().a("async_binder_ignore_activity_settings", String[].class, a.AbstractC1550a.f68682a));
    }
}
