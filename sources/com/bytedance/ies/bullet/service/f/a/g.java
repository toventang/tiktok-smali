package com.bytedance.ies.bullet.service.f.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.f.a.b.a;
import com.bytedance.ies.bullet.service.f.a.b.d;
import com.bytedance.ies.bullet.service.f.a.b.h;
import com.bytedance.ies.bullet.service.f.a.b.m;
import com.bytedance.ies.bullet.service.f.a.b.o;
import h.a.n;
import java.util.Collection;
import java.util.List;

public class g extends b {
    public final d<Boolean> Q = new a("immersive_mode");
    public final d<Boolean> R = new a("use_webview_title", true);
    public final d<Boolean> S = new a("auto_play_bgm");
    public final d<Boolean> T = new a("enable_video_landscape", false);
    public final d<Boolean> U = new a("disable_save_image");
    public final d<Boolean> V = new a("hide_system_video_poster");
    public final h W = new h("ignore_cache_policy");
    public final d<String> X = new m("__status_bar", o.f32721f);

    static {
        Covode.recordClassIndex(19572);
    }

    @Override // com.bytedance.ies.bullet.service.f.a.b.q, com.bytedance.ies.bullet.service.f.a.b, com.bytedance.ies.bullet.service.f.a.c
    public List<d<?>> a() {
        return n.d((Collection) super.a(), (Iterable) n.b(this.Q, this.R, this.S, this.U, this.V, this.W, this.T, this.X));
    }
}
