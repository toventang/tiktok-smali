package com.ss.android.ugc.aweme.bullet.module.ad;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.f.a.b;
import com.bytedance.ies.bullet.service.f.a.b.a;
import com.bytedance.ies.bullet.service.f.a.b.d;
import com.bytedance.ies.bullet.service.f.a.b.h;
import com.bytedance.ies.bullet.service.f.a.b.j;
import com.bytedance.ies.bullet.service.f.a.b.m;
import com.bytedance.ies.bullet.service.f.a.b.o;
import h.a.n;
import java.util.Collection;
import java.util.List;

public final class c extends b {
    public final j Q = new j("bundle_real_ad_id", (byte) 0);
    public final h R = new h("ad_system_origin");
    public final d<String> S = new m("bundle_open_url", o.f32721f);
    public final d<String> T = new m("bundle_web_url", o.f32721f);
    public final d<String> U = new m("bundle_ad_quick_app_url", o.f32721f);
    public final d<String> V = new m("ad_type", o.f32721f);
    public final d<String> W = new m("bundle_web_title", o.f32721f);
    public final a X = new a("show_report");
    public final h Y = new h("web_type");
    public final h Z = new h("bundle_download_mode");
    private final d<String> aA = new m("bundle_lynx_bottom_label_data", o.f32721f);
    public final h aa = new h("bundle_link_mode");
    public final a ab = new a("bundle_support_multiple_download");
    public final a ac = new a("bundle_disable_download_dialog", true);
    public final h ad = new h("bundle_webview_background", -2);
    public final d<String> ae = new m("track_url_list", o.f32721f);
    public final d<String> af = new m("second_page_preload_channel_prefix", o.f32721f);
    public final d<String> ag = new m("bundle_full_screen_bg_image", o.f32721f);
    public final d<String> ah = new m("bundle_native_site_custom_data", o.f32721f);
    public final d<String> ai = new m("aweme_id", o.f32721f);
    public final d<String> aj = new m("owner_id", o.f32721f);
    public final d<String> ak = new m("landing_page_info", o.f32721f);
    public final h al = new h("preload_web_status");
    public final h am = new h("preload_is_web_url");
    public final d<String> an = new m("preload_channel_name", o.f32721f);
    public final d<List<String>> ao = new m("bundle_second_page_gecko_channels", o.f32722g);
    public final d<String> ap = new m("bundle_extra_param", o.f32721f);
    private final j aq = new j("ad_id", (byte) 0);
    private final d<String> ar = new m("aweme_group_id", o.f32721f);
    private final d<String> at = new m("bundle_download_app_log_extra", o.f32721f);
    private final d<String> au = new m("bundle_download_url", o.f32721f);
    private final d<String> av = new m("aweme_package_name", o.f32721f);
    private final d<String> aw = new m("bundle_download_app_name", o.f32721f);
    private final a ax = new a("bundle_nav_bar_status_padding");
    private final a ay = new a("bundle_show_lynx_bottom_label");
    private final d<String> az = new m("bundle_lynx_bottom_label_template_url", o.f32721f);

    static {
        Covode.recordClassIndex(42765);
    }

    public final String c() {
        String b2 = this.ar.b();
        if (b2 == null) {
            return "";
        }
        return b2;
    }

    public final String d() {
        String b2 = this.at.b();
        if (b2 == null) {
            return "";
        }
        return b2;
    }

    public final String e() {
        String b2 = this.au.b();
        if (b2 == null) {
            return "";
        }
        return b2;
    }

    public final String f() {
        String b2 = this.av.b();
        if (b2 == null) {
            return "";
        }
        return b2;
    }

    public final String g() {
        String b2 = this.aw.b();
        if (b2 == null) {
            return "";
        }
        return b2;
    }

    public final long b() {
        Long l2 = (Long) this.aq.b();
        if (l2 != null) {
            return l2.longValue();
        }
        return 0;
    }

    public final boolean h() {
        Boolean bool = (Boolean) this.ax.b();
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.ies.bullet.service.f.a.b.q, com.bytedance.ies.bullet.service.f.a.b, com.bytedance.ies.bullet.service.f.a.c
    public final List<d<?>> a() {
        return n.d((Collection) super.a(), (Iterable) n.b(this.aq, this.Q, this.ar, this.R, this.at, this.au, this.av, this.aw, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.aa, this.ab, this.ac, this.ad, this.ax, this.ae, this.af, this.ay, this.az, this.aA, this.ag, this.ah, this.ai, this.aj, this.ak, this.al, this.am, this.an, this.ao, this.ap));
    }
}
