package com.ss.android.ugc.aweme.bullet.module.ad;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.f.a.b.a;
import com.bytedance.ies.bullet.service.f.a.b.m;
import com.bytedance.ies.bullet.service.f.a.b.o;
import com.bytedance.ies.bullet.service.f.a.d;
import h.a.n;
import java.util.Collection;
import java.util.List;

public final class h extends d {
    public final a at = new a("is_lynx_landing_page", false);
    public final com.bytedance.ies.bullet.service.f.a.b.d<String> au = new m("lynx_channel_name", o.f32721f);
    public final com.bytedance.ies.bullet.service.f.a.b.d<String> av = new m("bundle_render_type", o.f32721f);
    public final com.bytedance.ies.bullet.service.f.a.b.d<Integer> aw = new m("bundle_lynx_landing_style", o.f32717b);
    public final com.bytedance.ies.bullet.service.f.a.b.d<String> ax = new m("bundle_native_site_ad_info", o.f32721f);
    public final com.bytedance.ies.bullet.service.f.a.b.d<String> ay = new m("bundle_native_site_app_data", o.f32721f);

    static {
        Covode.recordClassIndex(42772);
    }

    public final String b() {
        String b2 = this.au.b();
        if (b2 == null) {
            return "";
        }
        return b2;
    }

    @Override // com.bytedance.ies.bullet.service.f.a.b.q, com.bytedance.ies.bullet.service.f.a.b, com.bytedance.ies.bullet.service.f.a.d, com.bytedance.ies.bullet.service.f.a.c
    public final List<com.bytedance.ies.bullet.service.f.a.b.d<?>> a() {
        return n.d((Collection) super.a(), (Iterable) n.b(this.at, this.au, this.av, this.aw, this.ax, this.ay));
    }
}
