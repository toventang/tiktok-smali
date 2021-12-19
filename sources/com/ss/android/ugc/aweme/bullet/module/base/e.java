package com.ss.android.ugc.aweme.bullet.module.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.f.a.b.a;
import com.bytedance.ies.bullet.service.f.a.b.d;
import com.bytedance.ies.bullet.service.f.a.b.h;
import com.bytedance.ies.bullet.service.f.a.b.m;
import com.bytedance.ies.bullet.service.f.a.b.o;
import com.bytedance.ies.bullet.service.f.a.g;
import h.a.n;
import java.util.Collection;
import java.util.List;

public class e extends g {
    private final d<String> Y = new m("bundle_origin_url", o.f32721f);
    private final d<String> Z = new m("aweme_id", o.f32721f);
    final a aF = new a("show_not_official_content_warning");
    final a aG = new a("from_notification");
    final a aH = new a("bundle_auto_play_audio");
    final a aI = new a("use_webview_title");
    public final d<String> aJ = new m("bundle_web_title", o.f32721f);
    public final a aK = new a("is_from_lynx_land_page", false);
    public final d<String> aL = new m("second_page_preload_channel_name", o.f32721f);
    private final d<String> aa = new m("group_id", o.f32721f);
    private final d<String> ab = new m("enter_from", o.f32721f);
    private final d<String> ac = new m("preload_channel_name", o.f32721f);
    private final d<String> ad = new m("preload_scene", o.f32721f);
    private final h ae = new h("preload_web_status");
    private final d<String> af = new m("add_common", o.f32721f);
    private final a ag = new a("control_request_url");
    private final a ah = new a("safeTemplate");
    private final a ai = new a("bundle_nav_bar_status_padding");
    private final h aj = new h("preload_is_web_url");

    static {
        Covode.recordClassIndex(42809);
    }

    public final String f() {
        String b2 = this.Z.b();
        if (b2 == null) {
            return "";
        }
        return b2;
    }

    public final String g() {
        String b2 = this.ab.b();
        if (b2 == null) {
            return "";
        }
        return b2;
    }

    public final String h() {
        String b2 = this.aa.b();
        if (b2 == null) {
            return "";
        }
        return b2;
    }

    public final String i() {
        String b2 = this.ac.b();
        if (b2 == null) {
            return "";
        }
        return b2;
    }

    public final String j() {
        String b2 = this.ad.b();
        if (b2 == null) {
            return "";
        }
        return b2;
    }

    public final String m() {
        String b2 = this.Y.b();
        if (b2 == null) {
            return "";
        }
        return b2;
    }

    public final int k() {
        Integer num = (Integer) this.ae.b();
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int l() {
        Integer num = (Integer) this.aj.b();
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final boolean n() {
        Boolean bool = (Boolean) this.ai.b();
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.ies.bullet.service.f.a.b.q, com.bytedance.ies.bullet.service.f.a.b, com.bytedance.ies.bullet.service.f.a.c, com.bytedance.ies.bullet.service.f.a.g
    public List<d<?>> a() {
        return n.d((Collection) super.a(), (Iterable) n.b(this.Y, this.Z, this.aa, this.ac, this.ad, this.ae, this.ab, this.ag, this.aG, this.aH, this.ah, this.af, this.aF, this.O, this.ai, this.aj, this.aI, this.aJ, this.V, this.aK, this.aL, this.v));
    }
}
