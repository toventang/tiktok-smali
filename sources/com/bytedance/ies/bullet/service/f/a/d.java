package com.bytedance.ies.bullet.service.f.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.f.a.b.c;
import com.bytedance.ies.bullet.service.f.a.b.h;
import com.bytedance.ies.bullet.service.f.a.b.m;
import com.bytedance.ies.bullet.service.f.a.b.o;
import com.bytedance.ies.bullet.service.f.a.c.a;
import com.bytedance.ies.bullet.service.f.a.c.f;
import h.a.n;
import java.util.Collection;
import java.util.List;

public class d extends b {
    public final com.bytedance.ies.bullet.service.f.a.b.d<String> Q;
    public final com.bytedance.ies.bullet.service.f.a.b.d<String> R;
    public final com.bytedance.ies.bullet.service.f.a.b.d<String> S;
    public final com.bytedance.ies.bullet.service.f.a.b.d<Boolean> T;
    public final com.bytedance.ies.bullet.service.f.a.b.d<Boolean> U;
    public final com.bytedance.ies.bullet.service.f.a.b.d<String> V;
    public final com.bytedance.ies.bullet.service.f.a.b.d<Boolean> W;
    public final com.bytedance.ies.bullet.service.f.a.b.d<Boolean> X;
    public final com.bytedance.ies.bullet.service.f.a.b.d<Boolean> Y;
    public final com.bytedance.ies.bullet.service.f.a.b.d<String> Z;
    public final com.bytedance.ies.bullet.service.f.a.b.d<String> aa;
    public final com.bytedance.ies.bullet.service.f.a.b.d<String> ab;
    public final com.bytedance.ies.bullet.service.f.a.b.d<String> ac;
    public final h ad;
    public final com.bytedance.ies.bullet.service.f.a.b.d<Boolean> ae;
    public final com.bytedance.ies.bullet.service.f.a.b.d<Boolean> af;
    public final com.bytedance.ies.bullet.service.f.a.b.d<Integer> ag;
    public final com.bytedance.ies.bullet.service.f.a.b.d<Integer> ah;
    public final com.bytedance.ies.bullet.service.f.a.b.d<Boolean> ai;
    public final h aj;
    public final com.bytedance.ies.bullet.service.f.a.b.d<Integer> ak;
    public final com.bytedance.ies.bullet.service.f.a.b.d<Integer> al;
    public final com.bytedance.ies.bullet.service.f.a.b.d<String> am;
    public final com.bytedance.ies.bullet.service.f.a.b.d<Boolean> an;
    public final com.bytedance.ies.bullet.service.f.a.b.d<Float> ao;
    public final com.bytedance.ies.bullet.service.f.a.b.d<Boolean> ap;
    public final com.bytedance.ies.bullet.service.f.a.b.d<String> aq;
    public final com.bytedance.ies.bullet.service.f.a.b.d<Boolean> ar;
    private final List<com.bytedance.ies.bullet.service.f.a.b.d<?>> at;

    static {
        Covode.recordClassIndex(19569);
    }

    @Override // com.bytedance.ies.bullet.service.f.a.b.q, com.bytedance.ies.bullet.service.f.a.b, com.bytedance.ies.bullet.service.f.a.c
    public List<com.bytedance.ies.bullet.service.f.a.b.d<?>> a() {
        return this.at;
    }

    public d() {
        a aVar = new a((byte) 0);
        this.Q = aVar;
        f fVar = new f((byte) 0);
        this.R = fVar;
        m mVar = new m("group", o.f32721f, "default_lynx_group");
        this.S = mVar;
        com.bytedance.ies.bullet.service.f.a.b.a aVar2 = new com.bytedance.ies.bullet.service.f.a.b.a("share_group", true);
        this.T = aVar2;
        com.bytedance.ies.bullet.service.f.a.b.a aVar3 = new com.bytedance.ies.bullet.service.f.a.b.a("enable_canvas", false);
        this.U = aVar3;
        m mVar2 = new m("initial_data", o.f32721f);
        this.V = mVar2;
        com.bytedance.ies.bullet.service.f.a.b.a aVar4 = new com.bytedance.ies.bullet.service.f.a.b.a("ui_running_mode", true);
        this.W = aVar4;
        com.bytedance.ies.bullet.service.f.a.b.a aVar5 = new com.bytedance.ies.bullet.service.f.a.b.a("cache_script", true);
        this.X = aVar5;
        com.bytedance.ies.bullet.service.f.a.b.a aVar6 = new com.bytedance.ies.bullet.service.f.a.b.a("decode_script_sync", true);
        this.Y = aVar6;
        m mVar3 = new m("a_surl", o.f32721f);
        this.Z = mVar3;
        m mVar4 = new m("durl", o.f32721f);
        this.aa = mVar4;
        m mVar5 = new m("surl", o.f32721f);
        this.ab = mVar5;
        m mVar6 = new m("post_url", o.f32721f);
        this.ac = mVar6;
        h hVar = new h("dynamic", 0);
        this.ad = hVar;
        com.bytedance.ies.bullet.service.f.a.b.a aVar7 = new com.bytedance.ies.bullet.service.f.a.b.a("force_h5");
        this.ae = aVar7;
        com.bytedance.ies.bullet.service.f.a.b.a aVar8 = new com.bytedance.ies.bullet.service.f.a.b.a("use_gecko_first");
        this.af = aVar8;
        m mVar7 = new m("preset_width", o.f32717b);
        this.ag = mVar7;
        m mVar8 = new m("preset_height", o.f32717b);
        this.ah = mVar8;
        com.bytedance.ies.bullet.service.f.a.b.a aVar9 = new com.bytedance.ies.bullet.service.f.a.b.a("preset_safe_point", false);
        this.ai = aVar9;
        h hVar2 = new h("thread_strategy", 0);
        this.aj = hVar2;
        m mVar9 = new m("lynxview_width", o.f32717b);
        this.ak = mVar9;
        m mVar10 = new m("lynxview_height", o.f32717b);
        this.al = mVar10;
        m mVar11 = new m("preloadFonts", o.f32721f);
        this.am = mVar11;
        com.bytedance.ies.bullet.service.f.a.b.a aVar10 = new com.bytedance.ies.bullet.service.f.a.b.a("close_by_back", true);
        this.an = aVar10;
        c cVar = new c("font_scale", (byte) 0);
        this.ao = cVar;
        com.bytedance.ies.bullet.service.f.a.b.a aVar11 = new com.bytedance.ies.bullet.service.f.a.b.a("enable_font_scale");
        this.ap = aVar11;
        m mVar12 = new m("res_url", o.f32721f);
        this.aq = mVar12;
        com.bytedance.ies.bullet.service.f.a.b.a aVar12 = new com.bytedance.ies.bullet.service.f.a.b.a("create_view_async");
        this.ar = aVar12;
        this.at = n.d((Collection) super.a(), (Iterable) n.b(aVar, fVar, mVar, mVar2, aVar4, aVar5, aVar6, aVar7, mVar3, mVar5, mVar6, hVar, mVar7, mVar8, aVar9, hVar2, mVar4, mVar9, mVar10, aVar2, mVar11, aVar8, aVar10, aVar3, cVar, aVar11, mVar12, aVar12));
    }
}
