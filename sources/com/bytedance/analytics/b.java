package com.bytedance.analytics;

import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.analytics.a;
import com.bytedance.analytics.page.d;
import com.bytedance.analytics.page.g;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f6550a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static String f6551b;

    static {
        Covode.recordClassIndex(3150);
    }

    private b() {
    }

    public static final void a(a aVar) {
        l.d(aVar, "");
        if (TextUtils.isEmpty(aVar.f6503b)) {
            throw new Exception("id attribute in PageObject can not be null");
        } else if (TextUtils.isEmpty(aVar.f6504c)) {
            throw new Exception("name attribute in PageObject can not be null");
        } else if (aVar.f6505d == a.c.Fragment && aVar.f6506e == null) {
            throw new Exception("Fragment page,fragment attribute in PageObject can not be null");
        } else {
            g.a(aVar);
        }
    }

    public static final void a(com.bytedance.analytics.page.b bVar) {
        l.d(bVar, "");
        a.C0087a aVar = new a.C0087a();
        aVar.a(bVar.ac_());
        aVar.b(bVar.bp_());
        aVar.f6522g = bVar.c();
        if (bVar instanceof Activity) {
            aVar.a(a.c.Activity);
        } else if (bVar instanceof Fragment) {
            aVar.a(a.c.Fragment);
            aVar.f6519d = new WeakReference<>(bVar);
            if (bVar instanceof d) {
                aVar.f6520e = true;
                String ad_ = ((d) bVar).ad_();
                l.d(ad_, "");
                aVar.f6521f = ad_;
            }
        }
        a(aVar.a());
    }
}
