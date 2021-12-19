package com.ss.android.ugc.aweme.commercialize.tasks.a;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.c.a.c;
import com.ss.android.ugc.aweme.commercialize.d.a;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.utils.ay;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.landpage.AdLandPageServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import h.n;

public abstract class a extends com.bytedance.ies.ugc.aweme.rich.c.a.a {
    public final String A;
    public final String B;
    public final boolean C;
    public final String D;
    public final String E;
    public final String F;
    public final boolean G;
    public final String H;
    public final int I;
    public final int J;
    public final int K;
    public final boolean L;
    public final int M;
    public final String N;

    /* renamed from: d  reason: collision with root package name */
    public final String f75300d;

    /* renamed from: e  reason: collision with root package name */
    public final String f75301e = AdLandPageServiceImpl.b().a();

    /* renamed from: f  reason: collision with root package name */
    public final String f75302f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f75303g;

    /* renamed from: h  reason: collision with root package name */
    public final int f75304h;

    /* renamed from: i  reason: collision with root package name */
    public final String f75305i;

    /* renamed from: j  reason: collision with root package name */
    public final long f75306j;

    /* renamed from: k  reason: collision with root package name */
    public final String f75307k;

    /* renamed from: l  reason: collision with root package name */
    public final long f75308l;

    /* renamed from: m  reason: collision with root package name */
    public final String f75309m;
    public final String n;
    public final int o;
    public final String p;
    public final boolean q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final int x;
    public final int y;
    public final boolean z;

    static {
        Covode.recordClassIndex(46472);
    }

    /* access modifiers changed from: protected */
    public final Intent c() {
        String str;
        Intent a2 = com.ss.android.ugc.aweme.commercialize.tasks.a.f75298a.a(this.f35145b);
        a2.setData(Uri.parse(this.f75300d));
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f75302f)) {
            a2.putExtra("title", this.f75302f);
        } else {
            a2.putExtra("title", " ");
            a2.putExtra("use_webview_title", true);
        }
        a2.putExtra("show_report", this.f75303g);
        if (!TextUtils.isEmpty(this.f75307k)) {
            a2.putExtra("bundle_download_app_log_extra", this.f75307k);
        }
        a2.putExtra("bundle_app_ad_from", this.f75304h);
        String str2 = this.f75305i;
        if (str2 != null) {
            a2.putExtra("enter_from", str2);
        }
        long j2 = this.f75306j;
        if (j2 != 0) {
            a2.putExtra("ad_id", j2);
            a2.putExtra("ad_type", this.n);
            a2.putExtra("ad_system_origin", this.o);
            a2.putExtra("bundle_download_app_extra", String.valueOf(this.f75306j));
            a2.putExtra("landing_page_info", this.p);
        }
        String a3 = com.ss.android.ugc.aweme.commercialize.tasks.a.f75298a.a();
        if (!TextUtils.isEmpty(a3)) {
            a2.putExtra("ad_js_url", a3);
        }
        a2.putExtra("bundle_disable_download_dialog", this.q);
        if (!TextUtils.isEmpty(this.r)) {
            a2.putExtra("bundle_is_from_app_ad", true);
            a2.putExtra("bundle_download_url", this.r);
            a2.putExtra("aweme_package_name", this.s);
            a2.putExtra("bundle_ad_quick_app_url", this.t);
            boolean isEmpty = TextUtils.isEmpty(this.u);
            if (isEmpty) {
                str = this.w;
            } else if (!isEmpty) {
                str = this.u;
            } else {
                throw new n();
            }
            a2.putExtra("bundle_download_app_name", str);
            a2.putExtra("bundle_download_mode", this.x);
            a2.putExtra("bundle_link_mode", this.y);
            a2.putExtra("bundle_support_multiple_download", this.z);
            a2.putExtra("bundle_web_url", this.v);
            a2.putExtra("bundle_web_title", this.w);
            String str3 = this.A;
            if (b.b(str3)) {
                String builder = Uri.parse(a.AbstractC1652a.f73756a).buildUpon().toString();
                l.b(builder, "");
                str3 = p.a(str3, "__back_url__", builder, false);
            }
            a2.putExtra("bundle_open_url", str3);
        }
        a2.putExtra("aweme_json_extra", this.B);
        long j3 = this.f75308l;
        if (j3 != 0) {
            a2.putExtra("aweme_group_id", String.valueOf(j3));
        }
        long j4 = this.f75306j;
        if (j4 != 0) {
            a2.putExtra("aweme_creative_id", String.valueOf(j4));
        }
        if (!TextUtils.isEmpty(this.s)) {
            a2.putExtra("aweme_package_name", this.s);
        }
        if (this.C) {
            a2.putExtra("bundle_webview_background", androidx.core.content.b.c(this.f35145b, R.color.f159928l));
        } else {
            a2.putExtra("bundle_webview_background", -1);
        }
        a2.putExtra("aweme_id", this.E);
        a2.putExtra("owner_id", this.F);
        a2.putExtra("bundle_forbidden_jump", true);
        a2.putExtra("use_ordinary_web", this.G);
        a2.addFlags(268435456);
        a2.putExtra("preload_channel_name", this.D);
        a2.putExtra("preload_scene", "feed");
        a2.putExtra("preload_web_status", this.I);
        a2.putExtra("preload_is_web_url", this.J);
        a2.putExtra("web_type", this.K);
        a2.putExtra("enable_web_report", this.L);
        if (this.M != 1) {
            z2 = false;
        }
        a2.putExtra("webview_progress_bar", z2);
        a2.putExtra("commerce_enter_from", this.N);
        com.bytedance.ies.ugc.aweme.rich.b.a b2 = this.f35146c.b();
        if (b2 instanceof AwemeRawAd) {
            ay.f75622a = (AwemeRawAd) b2;
        }
        return a2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(c cVar, Bundle bundle) {
        super(cVar, bundle);
        l.d(cVar, "");
        l.d(bundle, "");
        String string = bundle.getString("real_web_url", "");
        l.b(string, "");
        this.f75300d = string;
        this.f75302f = bundle.getString("title");
        this.f75303g = bundle.getBoolean("show_report");
        this.f75304h = bundle.getInt("app_ad_from");
        this.f75305i = bundle.getString("enter_from");
        this.f75306j = bundle.getLong("creative_id", 0);
        String string2 = bundle.getString("log_extra", "");
        l.b(string2, "");
        this.f75307k = string2;
        this.f75308l = bundle.getLong("group_id", 0);
        String string3 = bundle.getString("log_tag", "draw_ad");
        l.b(string3, "");
        this.f75309m = string3;
        this.n = bundle.getString("ad_type");
        this.o = bundle.getInt("ad_system_origin");
        this.p = bundle.getString("landing_page_info");
        this.q = bundle.getBoolean("disable_download_dialog");
        this.r = bundle.getString("download_url");
        this.s = bundle.getString("aweme_package_name");
        this.t = bundle.getString("ad_quick_app_url");
        this.u = bundle.getString("download_app_name");
        String string4 = bundle.getString("web_url", "");
        l.b(string4, "");
        this.v = string4;
        this.w = bundle.getString("web_title");
        this.x = bundle.getInt("download_mode");
        this.y = bundle.getInt("link_mode");
        this.z = bundle.getBoolean("support_multiple_download");
        String string5 = bundle.getString("open_url", "");
        l.b(string5, "");
        this.A = string5;
        String string6 = bundle.getString("aweme_json_extra", "");
        l.b(string6, "");
        this.B = string6;
        this.C = bundle.getBoolean("use_default_color");
        this.D = bundle.getString("channel_name");
        String string7 = bundle.getString("aweme_id", "");
        l.b(string7, "");
        this.E = string7;
        String string8 = bundle.getString("owner_id", "");
        l.b(string8, "");
        this.F = string8;
        this.G = bundle.getBoolean("use_ordinary_web");
        String string9 = bundle.getString("site_id", "");
        l.b(string9, "");
        this.H = string9;
        this.I = bundle.getInt("preload_web_status");
        this.J = bundle.getInt("preload_is_web_url");
        this.K = bundle.getInt("web_type");
        this.L = bundle.getBoolean("enable_web_report");
        this.M = bundle.getInt("webview_progress_bar");
        String string10 = bundle.getString("commerce_enter_from", "feedad");
        l.b(string10, "");
        this.N = string10;
    }
}
