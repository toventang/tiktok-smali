package com.ss.android.ugc.aweme.bullet.module.ad;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.f.a.b.a;
import com.bytedance.ies.bullet.service.f.a.b.d;
import com.bytedance.ies.bullet.service.f.a.b.h;
import com.bytedance.ies.bullet.service.f.a.b.m;
import com.bytedance.ies.bullet.service.f.a.b.o;
import com.ss.android.ugc.aweme.bullet.module.base.e;
import h.a.n;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

public final class j extends e {
    public final com.bytedance.ies.bullet.service.f.a.b.j Y = new com.bytedance.ies.bullet.service.f.a.b.j("ad_id", (byte) 0);
    public final h Z = new h("ad_system_origin");
    public final a aA = new a("disable_js_calculate");
    public final d<String> aB = new m("landing_page_info", o.f32721f);
    public final d<String> aC = new m("bundle_extra_param", o.f32721f);
    final h aD = new h("bundle_webview_background", -2);
    public boolean aE;
    private final d<String> aM = new m("ad_type", o.f32721f);
    private final a aN = new a("show_report");
    private final d<String> aO = new m("gd_ext_json", o.f32721f);
    public final h aa = new h("web_type");
    public final a ab = new a("bundle_is_from_app_ad");
    public final a ac = new a("bundle_enable_card_preload", true);
    public final a ad = new a("bundle_forbidden_jump");
    public final a ae = new a("bundle_is_from_comment_app_ad");
    public final a af = new a("enable_web_report");
    public final a ag = new a("bundle_show_download_status_bar", true);
    public final d<String> ah = new m("bundle_download_url", o.f32721f);
    public final d<String> ai = new m("bundle_download_app_name", o.f32721f);
    public final d<String> aj = new m("aweme_package_name", o.f32721f);
    public final d<String> ak = new m("bundle_download_app_extra", o.f32721f);
    public final d<String> al = new m("bundle_download_app_log_extra", o.f32721f);
    final d<String> am = new m("gd_label", o.f32721f);
    public final a an = new a("bundle_disable_download_dialog", true);
    public final d<String> ao = new m("aweme_creative_id", o.f32721f);
    public final d<String> ap = new m("ad_js_url", o.f32721f);
    public final d<String> aq = new m("bundle_ad_quick_app_url", o.f32721f);
    public final h ar = new h("bundle_app_ad_from");
    public final h at = new h("bundle_download_mode");
    public final h au = new h("bundle_link_mode");
    public final a av = new a("bundle_support_multiple_download");
    public final d<String> aw = new m("aweme_json_extra", o.f32721f);
    public final d<String> ax = new m("bundle_open_url", o.f32721f);
    public final d<String> ay = new m("bundle_web_url", o.f32721f);
    public final com.bytedance.ies.bullet.service.f.a.b.j az = new com.bytedance.ies.bullet.service.f.a.b.j("user_click_time", (byte) 0);

    static {
        Covode.recordClassIndex(42775);
    }

    public final String b() {
        String b2 = this.aO.b();
        if (b2 == null) {
            return "";
        }
        return b2;
    }

    public final String c() {
        String b2 = this.al.b();
        if (b2 == null) {
            return "";
        }
        return b2;
    }

    public final void e() {
        if (!a().isEmpty()) {
            for (d<?> dVar : a()) {
                dVar.a();
                dVar.b();
            }
        }
    }

    public final JSONObject d() {
        long j2;
        int i2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cid", this.Y.b());
            jSONObject.put("ad_type", this.Z.b());
            jSONObject.put("log_extra", this.al.b());
            jSONObject.put("download_url", this.ah.b());
            jSONObject.put("package_name", this.aj.b());
            jSONObject.put("app_name", this.ai.b());
            Long l2 = (Long) this.Y.b();
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = 0;
            }
            if (j2 == 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            jSONObject.put("code", i2);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @Override // com.bytedance.ies.bullet.service.f.a.b.q, com.ss.android.ugc.aweme.bullet.module.base.e, com.bytedance.ies.bullet.service.f.a.b, com.bytedance.ies.bullet.service.f.a.c, com.bytedance.ies.bullet.service.f.a.g
    public final List<d<?>> a() {
        return n.d((Collection) super.a(), (Iterable) n.b(this.Y, this.Z, this.aa, this.aM, this.ab, this.ac, this.af, this.ad, this.ag, this.ah, this.ai, this.aj, this.ak, this.al, this.am, this.aA, this.aO, this.an, this.ao, this.ap, this.aq, this.ae, this.ar, this.at, this.au, this.av, this.aw, this.ax, this.ay, this.az, this.aN, this.aD, this.aB, this.aC));
    }
}
