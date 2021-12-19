package com.bytedance.ies.bullet.service.f.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.f.a.b.a;
import com.bytedance.ies.bullet.service.f.a.b.d;
import com.bytedance.ies.bullet.service.f.a.b.h;
import com.bytedance.ies.bullet.service.f.a.b.j;
import com.bytedance.ies.bullet.service.f.a.b.k;
import com.bytedance.ies.bullet.service.f.a.b.l;
import com.bytedance.ies.bullet.service.f.a.b.m;
import com.bytedance.ies.bullet.service.f.a.b.o;
import com.bytedance.ies.bullet.service.f.a.b.r;
import com.bytedance.ies.bullet.service.f.a.b.t;
import com.bytedance.ies.bullet.service.f.a.b.u;
import h.a.n;
import java.util.Collection;
import java.util.List;

public class b extends c {
    public final d<Boolean> A = new a("hide_loading");
    public final a B = new a("show_load_dialog", true);
    public final d<Boolean> C = new a("should_full_screen");
    public final d<t> D = new m("bg_color", u.f32729a, new t(-2));
    public final d<t> E = new m("top_bar_color", u.f32729a, new t(-2));
    public final d<Boolean> F = new a("need_bottom_out");
    public final d<Boolean> G = new a("status_bar_padding");
    public final d<Boolean> H = new a("enable_xschema_interceptor", false);
    public final d<Long> I = new j("load_url_delay_time");
    public final a J = new a("use_ordinary_web", true);
    public final d<String> K = new m("topbar_type", o.f32721f);
    public final d<String> L = new m("disable_pop_gesture", o.f32721f);
    public final a M = new a("hide_more", true);
    public final d<Boolean> N = new a("show_debug_title");
    public final d<Boolean> O = new a("copy_link_action");

    /* renamed from: a  reason: collision with root package name */
    public final d<Boolean> f32685a = new a("hide_status_bar");

    /* renamed from: b  reason: collision with root package name */
    public final d<Boolean> f32686b = new a("hide_nav_bar");

    /* renamed from: c  reason: collision with root package name */
    public final d<Boolean> f32687c = new a("trans_status_bar");

    /* renamed from: d  reason: collision with root package name */
    public final d<t> f32688d = new m("nav_bar_color", u.f32729a, new t(-2));

    /* renamed from: e  reason: collision with root package name */
    public final d<t> f32689e = new m("status_bar_color", u.f32729a, new t(-2));

    /* renamed from: f  reason: collision with root package name */
    public final d<r> f32690f = new m("status_font_mode", u.f32731c, r.AUTO);

    /* renamed from: g  reason: collision with root package name */
    public final d<String> f32691g = new m("title", o.f32721f);

    /* renamed from: h  reason: collision with root package name */
    public final d<t> f32692h = new m("title_color", u.f32729a, new t(-2));

    /* renamed from: i  reason: collision with root package name */
    public final d<k> f32693i = new m("nav_btn_type", u.f32730b, k.NONE);

    /* renamed from: j  reason: collision with root package name */
    public final a f32694j = new a("show_more_button");

    /* renamed from: k  reason: collision with root package name */
    public final d<t> f32695k = new m("container_bgcolor", u.f32729a, new t(-2));

    /* renamed from: l  reason: collision with root package name */
    public final d<t> f32696l = new m("loading_bgcolor", u.f32729a, new t(-2));

    /* renamed from: m  reason: collision with root package name */
    public final d<l> f32697m = new m("need_out_animation", u.f32732d, l.AUTO);
    public final d<Boolean> n = new a("show_loading", true);
    public final d<Boolean> o = new a("show_error", true);
    public final a p = new a("show_keyboard");
    public final d<String> q = new m("report_bid", o.f32721f);
    public final d<String> r = new m("report_pid", o.f32721f);
    public final d<Boolean> s = new a("show_closeall");
    public final d<Boolean> t = new a("is_adjust_pan");
    public final d<Boolean> u = new a("enable_immersion_keyboard_control", true);
    public final h v = new h("title_bar_style");
    public final d<Boolean> w = new a("no_hw");
    public final d<Boolean> x = new a("_need_container_id");
    public final d<Boolean> y = new a("block_back_press");
    public final d<Boolean> z = new a("status_font_dark", true);

    static {
        Covode.recordClassIndex(19438);
    }

    @Override // com.bytedance.ies.bullet.service.f.a.b.q, com.bytedance.ies.bullet.service.f.a.c
    public List<d<?>> a() {
        return n.d((Collection) super.a(), (Iterable) n.b(this.w, this.f32696l, this.f32685a, this.f32687c, this.f32689e, this.f32686b, this.N, this.f32695k, this.f32691g, this.v, this.f32688d, this.f32692h, this.s, this.t, this.u, this.L, this.M, this.f32693i, this.f32694j, this.J, this.K, this.x, this.q, this.r, this.n, this.o, this.p, this.f32690f, this.f32697m, this.y, this.G, this.O, this.z, this.F, this.C, this.A, this.D, this.B, this.E, this.H, this.I));
    }
}
