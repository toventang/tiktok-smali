package com.ss.android.ugc.aweme.commercialize.tasks.a;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.c.a.c;
import com.bytedance.ies.ugc.aweme.rich.c.a.g;
import com.google.gson.o;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.tasks.a;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.hh;
import h.f.b.l;
import java.util.List;

public final class f extends a {
    private final long O;
    private final String P;
    private final String Q;
    private final int R;
    private final String S;
    private final String T;
    private final String U;
    private final List<String> V;
    private final String W;
    private final String X;

    static {
        Covode.recordClassIndex(46478);
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.b
    public final boolean b() {
        if (!TextUtils.equals(this.P, "lynx") || TextUtils.isEmpty(this.Q)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.a
    public final g a() {
        String str;
        Bundle a2 = a(c());
        if (a2 == null) {
            a2 = new Bundle();
        }
        l.b(a2, "");
        String str2 = this.Q;
        a2.putBoolean("is_lynx_landing_page", true);
        a2.putBoolean("hide_nav_bar", true);
        a2.putBoolean("hide_status_bar", false);
        a2.putBoolean("bundle_nav_bar_status_padding", true);
        a2.putBoolean("need_bottom_out", true);
        if (this.R == 1) {
            if (!TextUtils.isEmpty(this.S)) {
                a2.putString("bundle_full_screen_bg_image", this.S);
            }
            a2.putInt("bundle_webview_background", 0);
        }
        a2.putString("lynx_channel_name", this.T);
        a2.putString("bundle_native_site_custom_data", this.U);
        List<String> list = this.V;
        if (list != null && !list.isEmpty()) {
            IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
            if (f2 == null || (str = f2.b(Long.valueOf(this.O))) == null) {
                str = "";
            }
            a2.putString("second_page_preload_channel_prefix", str);
            f2.a().b(this.V);
        }
        a2.putInt("preset_width", View.MeasureSpec.makeMeasureSpec(n.a(this.f35145b), 1073741824));
        a2.putInt("preset_height", View.MeasureSpec.makeMeasureSpec(n.b(this.f35145b) - hh.b(), 1073741824));
        Uri parse = Uri.parse(str2);
        l.b(parse, "");
        if (parse.isHierarchical()) {
            a2.putString("bundle_origin_url", parse.getQueryParameter("fallback_url"));
            if (TextUtils.equals(parse.getQueryParameter("async_layout"), "1")) {
                a2.putBoolean("preset_safe_point", true);
                a2.putInt("thread_strategy", 2);
            }
        }
        Uri.Builder buildUpon = parse.buildUpon();
        o oVar = new o();
        oVar.a("siteId", this.H);
        oVar.a("adId", String.valueOf(this.O));
        oVar.a("creativeId", String.valueOf(this.f75306j));
        oVar.a("logExtra", this.f75307k);
        oVar.a("groupId", String.valueOf(this.f75308l));
        oVar.a("webUrl", this.v);
        oVar.a("pageData", this.W);
        oVar.a("appData", this.X);
        oVar.a("isRTL", Integer.valueOf(gb.a(this.f35145b) ? 1 : 0));
        oVar.a("topSafeAreaHeight", Integer.valueOf(hh.b()));
        String oVar2 = oVar.toString();
        l.b(oVar2, "");
        buildUpon.appendQueryParameter("lynx_landing_page_data", oVar2);
        buildUpon.appendQueryParameter("lynx_landing_page_title", this.w);
        String builder = buildUpon.toString();
        l.b(builder, "");
        a.f75298a.a(this.f35145b, builder, this.f75301e, a2);
        return new g(true);
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.b
    public final void a(boolean z) {
        com.bytedance.ies.ugc.aweme.rich.b.a b2 = this.f35146c.b();
        if (b2 instanceof AwemeRawAd) {
            com.bytedance.ies.ugc.aweme.rich.a.a.a(this.f75309m, "open_url_h5", (AwemeRawAd) b2).a("render_type", "lynx").b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(c cVar, Bundle bundle) {
        super(cVar, bundle);
        l.d(cVar, "");
        l.d(bundle, "");
        this.O = bundle.getLong("ad_id");
        String string = bundle.getString("render_type", "");
        l.b(string, "");
        this.P = string;
        String string2 = bundle.getString("lynx_scheme", "");
        l.b(string2, "");
        this.Q = string2;
        this.R = bundle.getInt("lynx_landing_style");
        this.S = bundle.getString("video_cover");
        this.T = bundle.getString("lynx_channel_name");
        this.U = bundle.getString("native_site_custom_data");
        this.V = bundle.getStringArrayList("second_page_preload_channels");
        String string3 = bundle.getString("key_native_site_ad_info", "");
        l.b(string3, "");
        this.W = string3;
        String string4 = bundle.getString("native_site_app_data", "");
        l.b(string4, "");
        this.X = string4;
    }
}
