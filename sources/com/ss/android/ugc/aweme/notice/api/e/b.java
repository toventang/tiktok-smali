package com.ss.android.ugc.aweme.notice.api.e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.abmock.i;
import com.ss.android.ugc.aweme.notice.api.helper.WSHelper;
import com.ss.android.ugc.aweme.utils.WSHelperImpl;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f112715a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final i f112716b;

    private b() {
    }

    static String a() {
        String[] a2 = com.ss.android.ugc.aweme.notice.api.c.a.a.a();
        if (a2.length == 0) {
            return "";
        }
        return a2[0];
    }

    static final class a implements i {

        /* renamed from: a  reason: collision with root package name */
        public static final a f112717a = new a();

        static {
            Covode.recordClassIndex(72450);
        }

        a() {
        }

        @Override // com.bytedance.ies.abmock.i
        public final void a() {
            WSHelper e2;
            String a2 = b.a();
            if (!TextUtils.isEmpty(a2) && (e2 = WSHelperImpl.e()) != null) {
                e2.a(a2);
            }
        }
    }

    static {
        Covode.recordClassIndex(72449);
        a aVar = a.f112717a;
        f112716b = aVar;
        SettingsManager.a().a(aVar);
    }
}
