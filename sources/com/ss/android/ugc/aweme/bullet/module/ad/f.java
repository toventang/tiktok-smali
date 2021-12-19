package com.ss.android.ugc.aweme.bullet.module.ad;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.lynx.a;
import com.ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;
import com.ss.android.ugc.aweme.bullet.business.b;
import h.f.a.m;
import h.f.b.l;
import h.z;
import org.json.JSONObject;

public final class f extends a.AbstractC0689a {

    /* renamed from: a  reason: collision with root package name */
    public final b f69369a;

    static {
        Covode.recordClassIndex(42770);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.a, com.bytedance.ies.bullet.kit.lynx.a.AbstractC0689a
    public final void a(com.bytedance.ies.bullet.kit.lynx.b bVar, Context context, m<Object, ? super Throwable, z> mVar) {
        l.d(bVar, "");
        l.d(context, "");
        l.d(mVar, "");
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.a, com.bytedance.ies.bullet.kit.lynx.a.AbstractC0689a
    public final void c(com.bytedance.ies.bullet.kit.lynx.b bVar) {
        l.d(bVar, "");
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.a, com.bytedance.ies.bullet.kit.lynx.a.AbstractC0689a
    public final void d(com.bytedance.ies.bullet.kit.lynx.b bVar) {
        l.d(bVar, "");
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.a, com.bytedance.ies.bullet.kit.lynx.a.AbstractC0689a
    public final void e(com.bytedance.ies.bullet.kit.lynx.b bVar) {
        l.d(bVar, "");
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.a, com.bytedance.ies.bullet.kit.lynx.a.AbstractC0689a
    public final void f(com.bytedance.ies.bullet.kit.lynx.b bVar) {
        l.d(bVar, "");
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.a, com.bytedance.ies.bullet.kit.lynx.a.AbstractC0689a
    public final void a(com.bytedance.ies.bullet.kit.lynx.b bVar) {
        l.d(bVar, "");
        AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.f69369a.a(AdLynxStatBusiness.class);
        if (adLynxStatBusiness != null) {
            adLynxStatBusiness.f69206a = false;
            adLynxStatBusiness.f69207b = false;
            adLynxStatBusiness.f69209d.clear();
            adLynxStatBusiness.b();
        }
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.a, com.bytedance.ies.bullet.kit.lynx.a.AbstractC0689a
    public final void b(com.bytedance.ies.bullet.kit.lynx.b bVar) {
        l.d(bVar, "");
        AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.f69369a.a(AdLynxStatBusiness.class);
        if (adLynxStatBusiness != null) {
            adLynxStatBusiness.a();
        }
    }

    public f(com.bytedance.ies.bullet.c.e.a.b bVar, b bVar2) {
        l.d(bVar, "");
        l.d(bVar2, "");
        this.f69369a = bVar2;
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.a, com.bytedance.ies.bullet.kit.lynx.a.AbstractC0689a
    public final void a(com.bytedance.ies.bullet.kit.lynx.b bVar, String str) {
        l.d(bVar, "");
        AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.f69369a.a(AdLynxStatBusiness.class);
        if (adLynxStatBusiness != null) {
            adLynxStatBusiness.a(str);
        }
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.a, com.bytedance.ies.bullet.kit.lynx.a.AbstractC0689a
    public final void a(com.bytedance.ies.bullet.kit.lynx.b bVar, JSONObject jSONObject) {
        l.d(bVar, "");
        AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.f69369a.a(AdLynxStatBusiness.class);
        if (adLynxStatBusiness != null) {
            long j2 = -1;
            if (jSONObject != null) {
                j2 = jSONObject.optLong("first_page_layout", -1);
            }
            adLynxStatBusiness.f69208c = j2;
        }
    }
}
