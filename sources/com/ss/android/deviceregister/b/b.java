package com.ss.android.deviceregister.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.deviceregister.d.e;
import com.ss.android.ugc.aweme.bf.d;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f59432a;

    /* renamed from: b  reason: collision with root package name */
    public static e<SharedPreferences> f59433b = new e<SharedPreferences>() {
        /* class com.ss.android.deviceregister.b.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(36702);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.deviceregister.d.e
        public final /* bridge */ /* synthetic */ SharedPreferences a(Object[] objArr) {
            return d.a((Context) objArr[0], "ug_install_settings_pref", 0);
        }
    };

    static {
        Covode.recordClassIndex(36701);
    }
}
