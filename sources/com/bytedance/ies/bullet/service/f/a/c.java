package com.bytedance.ies.bullet.service.f.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.f.a.b.d;
import com.bytedance.ies.bullet.service.f.a.b.m;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.service.f.a.c.h;
import h.a.n;
import java.util.List;

public class c extends q {
    public final d<Uri> P = new m("fallback_url", h.f32750a);

    static {
        Covode.recordClassIndex(19495);
    }

    @Override // com.bytedance.ies.bullet.service.f.a.b.q
    public List<d<?>> a() {
        return n.a(this.P);
    }
}
