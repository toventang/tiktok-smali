package com.bytedance.hybrid.spark;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.monitorV2.k.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.a.e;
import com.bytedance.hybrid.spark.e.e;
import com.bytedance.lynx.hybrid.h.c;
import h.f.b.l;
import h.m.p;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public class SparkContext extends com.bytedance.lynx.hybrid.h.a implements Parcelable {
    public static final Parcelable.Creator<SparkContext> CREATOR = new b();

    /* renamed from: d  reason: collision with root package name */
    public static final Map<String, com.bytedance.lynx.hybrid.h.a> f31048d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final a f31049e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f31050a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f31051b;

    /* renamed from: c  reason: collision with root package name */
    public c f31052c;

    /* renamed from: j  reason: collision with root package name */
    private int f31053j;

    /* renamed from: k  reason: collision with root package name */
    private com.bytedance.lynx.a.a.b.c f31054k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f31055l;

    public int describeContents() {
        return 0;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(18033);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements Parcelable.Creator<SparkContext> {
        static {
            Covode.recordClassIndex(18034);
        }

        b() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SparkContext[] newArray(int i2) {
            return new SparkContext[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SparkContext createFromParcel(Parcel parcel) {
            l.c(parcel, "");
            return new SparkContext(parcel);
        }
    }

    static {
        Covode.recordClassIndex(18032);
    }

    public SparkContext() {
        this.f31053j = -1;
        this.f31050a = "";
        this.f31051b = new LinkedHashMap();
        this.f31052c = new c();
    }

    public final e a() {
        return (e) a(e.class);
    }

    public final com.bytedance.lynx.a.a.b.c b() {
        com.bytedance.lynx.a.a.b.b bVar;
        com.bytedance.lynx.hybrid.a.c cVar;
        com.bytedance.lynx.hybrid.a.c cVar2;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        String str;
        com.bytedance.lynx.hybrid.a.c cVar3;
        SparkContext sparkContext = this;
        if (!sparkContext.f31055l) {
            int a2 = e.a.a(sparkContext.f31050a);
            if (sparkContext.f31050a.length() > 0) {
                if (a2 == 1) {
                    String str2 = sparkContext.f31050a;
                    Map<String, String> map = sparkContext.f31051b;
                    l.c(str2, "");
                    Uri parse = Uri.parse(str2);
                    com.bytedance.lynx.a.a.b.a aVar = new com.bytedance.lynx.a.a.b.a(null, 1, null);
                    l.a((Object) parse, "");
                    Map<String, String> a3 = com.bytedance.lynx.a.a.c.a.a(aVar, parse, map);
                    l.c(parse, "");
                    l.c(a3, "");
                    l.c(aVar, "");
                    String str3 = a3.get("should_full_screen");
                    bVar = aVar;
                    if (str3 != null) {
                        aVar.setTransStatusBar(l.a((Object) str3, (Object) "1"));
                    }
                    String str4 = a3.get("status_bar_color");
                    if (str4 != null) {
                        aVar.setStatusBgColor(com.bytedance.lynx.a.a.c.b.d("status_bar_color", str4, a3, parse));
                    }
                    String str5 = a3.get("show_loading");
                    if (str5 != null) {
                        aVar.setHideLoading(l.a((Object) str5, (Object) "0"));
                    }
                    String str6 = a3.get("block_back_press");
                    if (str6 != null) {
                        aVar.setBlockBackPress(com.bytedance.lynx.a.a.c.b.b("block_back_press", str6, a3, parse));
                    }
                    String str7 = a3.get("bundle");
                    if (str7 != null) {
                        aVar.setBundle(com.bytedance.lynx.a.a.c.b.c("bundle", str7, a3, parse));
                    }
                    String str8 = a3.get("channel");
                    if (str8 != null) {
                        aVar.setChannel(com.bytedance.lynx.a.a.c.b.c("channel", str8, a3, parse));
                    }
                    String str9 = a3.get("container_bg_color");
                    if (str9 != null) {
                        aVar.setContainerBgColor(com.bytedance.lynx.a.a.c.b.e("container_bg_color", str9, a3, parse));
                    }
                    String str10 = a3.get("disable_back_press");
                    if (str10 != null) {
                        aVar.setDisableBackPress(com.bytedance.lynx.a.a.c.b.b("disable_back_press", str10, a3, parse));
                    }
                    String str11 = a3.get("disable_builtin");
                    if (str11 != null) {
                        aVar.setDisableBuiltin(com.bytedance.lynx.a.a.c.b.b("disable_builtin", str11, a3, parse));
                    }
                    String str12 = a3.get("disable_gecko");
                    if (str12 != null) {
                        aVar.setDisableGecko(com.bytedance.lynx.a.a.c.b.b("disable_gecko", str12, a3, parse));
                    }
                    String str13 = a3.get("no_hw");
                    if (str13 != null) {
                        aVar.setDisableHardwareAccelerate(com.bytedance.lynx.a.a.c.b.b("no_hw", str13, a3, parse));
                    }
                    String str14 = a3.get("disable_save_image");
                    if (str14 != null) {
                        aVar.setDisableSaveImage(com.bytedance.lynx.a.a.c.b.b("disable_save_image", str14, a3, parse));
                    }
                    String str15 = a3.get("enable_canvas");
                    if (str15 != null) {
                        aVar.setEnableCanvas(com.bytedance.lynx.a.a.c.b.b("enable_canvas", str15, a3, parse));
                    }
                    String str16 = a3.get("fallback_url");
                    if (str16 != null) {
                        aVar.setFallbackUrl(com.bytedance.lynx.a.a.c.b.c("fallback_url", str16, a3, parse));
                    }
                    String str17 = a3.get("force_h5");
                    if (str17 != null) {
                        aVar.setForceH5(com.bytedance.lynx.a.a.c.b.b("force_h5", str17, a3, parse));
                    }
                    String str18 = a3.get("group");
                    if (str18 != null) {
                        aVar.setGroup(com.bytedance.lynx.a.a.c.b.c("group", str18, a3, parse));
                    }
                    String str19 = a3.get("hide_loading");
                    if (str19 != null) {
                        aVar.setHideLoading(com.bytedance.lynx.a.a.c.b.b("hide_loading", str19, a3, parse));
                    }
                    String str20 = a3.get("hide_nav_bar");
                    if (str20 != null) {
                        aVar.setHideNavBar(com.bytedance.lynx.a.a.c.b.b("hide_nav_bar", str20, a3, parse));
                    }
                    String str21 = a3.get("hide_status_bar");
                    if (str21 != null) {
                        aVar.setHideStatusBar(com.bytedance.lynx.a.a.c.b.b("hide_status_bar", str21, a3, parse));
                    }
                    String str22 = a3.get("ignore_cache_policy");
                    if (str22 != null) {
                        aVar.setIgnoreCachePolicy(com.bytedance.lynx.a.a.c.b.a("ignore_cache_policy", str22, a3, parse));
                    }
                    String str23 = a3.get("initial_data");
                    if (str23 != null) {
                        aVar.setInitData(com.bytedance.lynx.a.a.c.b.c("initial_data", str23, a3, parse));
                    }
                    String str24 = a3.get("loading_bg_color");
                    if (str24 != null) {
                        aVar.setLoadingBgColor(com.bytedance.lynx.a.a.c.b.e("loading_bg_color", str24, a3, parse));
                    }
                    String str25 = a3.get("lynxview_height");
                    if (str25 != null) {
                        aVar.setLynxViewHeight(com.bytedance.lynx.a.a.c.b.a("lynxview_height", str25, a3, parse));
                    }
                    String str26 = a3.get("lynxview_width");
                    if (str26 != null) {
                        aVar.setLynxViewWidth(com.bytedance.lynx.a.a.c.b.a("lynxview_width", str26, a3, parse));
                    }
                    String str27 = a3.get("nav_bar_color");
                    if (str27 != null) {
                        aVar.setNavBarColor(com.bytedance.lynx.a.a.c.b.e("nav_bar_color", str27, a3, parse));
                    }
                    String str28 = a3.get("nav_btn_type");
                    if (str28 != null) {
                        aVar.setNavBtnType(com.bytedance.lynx.a.a.c.b.c("nav_btn_type", str28, a3, parse));
                    }
                    String str29 = a3.get("need_sec_link");
                    if (str29 != null) {
                        aVar.setNeedSecLink(com.bytedance.lynx.a.a.c.b.b("need_sec_link", str29, a3, parse));
                    }
                    String str30 = a3.get("preloadFonts");
                    if (str30 != null) {
                        aVar.setPreloadFonts(com.bytedance.lynx.a.a.c.b.c("preloadFonts", str30, a3, parse));
                    }
                    String str31 = a3.get("preset_height");
                    if (str31 != null) {
                        aVar.setPresetHeight(com.bytedance.lynx.a.a.c.b.a("preset_height", str31, a3, parse));
                    }
                    String str32 = a3.get("preset_safe_point");
                    if (str32 != null) {
                        aVar.setPresetSafePoint(com.bytedance.lynx.a.a.c.b.b("preset_safe_point", str32, a3, parse));
                    }
                    String str33 = a3.get("preset_width");
                    if (str33 != null) {
                        aVar.setPresetWidth(com.bytedance.lynx.a.a.c.b.a("preset_width", str33, a3, parse));
                    }
                    String str34 = a3.get("surl");
                    if (str34 != null) {
                        aVar.setSUrl(com.bytedance.lynx.a.a.c.b.c("surl", str34, a3, parse));
                    }
                    String str35 = a3.get("sec_link_scene");
                    if (str35 != null) {
                        aVar.setSecLinkScene(com.bytedance.lynx.a.a.c.b.c("sec_link_scene", str35, a3, parse));
                    }
                    String str36 = a3.get("share_group");
                    if (str36 != null) {
                        aVar.setShareGroup(com.bytedance.lynx.a.a.c.b.b("share_group", str36, a3, parse));
                    }
                    String str37 = a3.get("show_closeall");
                    if (str37 != null) {
                        aVar.setShowCloseAll(com.bytedance.lynx.a.a.c.b.b("show_closeall", str37, a3, parse));
                    }
                    String str38 = a3.get("status_bar_bg_color");
                    if (str38 != null) {
                        aVar.setStatusBgColor(com.bytedance.lynx.a.a.c.b.e("status_bar_bg_color", str38, a3, parse));
                    }
                    String str39 = a3.get("status_font_mode");
                    if (str39 != null) {
                        aVar.setStatusFontMode(com.bytedance.lynx.a.a.c.b.c("status_font_mode", str39, a3, parse));
                    }
                    String str40 = a3.get("thread_strategy");
                    if (str40 != null) {
                        aVar.setThreadStrategy(com.bytedance.lynx.a.a.c.b.a("thread_strategy", str40, a3, parse));
                    }
                    String str41 = a3.get("title");
                    if (str41 != null) {
                        aVar.setTitle(com.bytedance.lynx.a.a.c.b.c("title", str41, a3, parse));
                    }
                    String str42 = a3.get("title_color");
                    if (str42 != null) {
                        aVar.setTitleColor(com.bytedance.lynx.a.a.c.b.e("title_color", str42, a3, parse));
                    }
                    String str43 = a3.get("trans_status_bar");
                    if (str43 != null) {
                        aVar.setTransStatusBar(com.bytedance.lynx.a.a.c.b.b("trans_status_bar", str43, a3, parse));
                    }
                    String str44 = a3.get("ui_running_mode");
                    if (str44 != null) {
                        aVar.setUiRunningMode(com.bytedance.lynx.a.a.c.b.b("ui_running_mode", str44, a3, parse));
                    }
                    String str45 = a3.get("url");
                    if (str45 != null) {
                        aVar.setUrl(com.bytedance.lynx.a.a.c.b.c("url", str45, a3, parse));
                    }
                    String str46 = a3.get("__use_ttnet");
                    if (str46 != null) {
                        aVar.setUseTtnet(com.bytedance.lynx.a.a.c.b.a("__use_ttnet", str46, a3, parse));
                    }
                    String str47 = a3.get("use_webview_title");
                    if (str47 != null) {
                        aVar.setUseWebTitle(com.bytedance.lynx.a.a.c.b.b("use_webview_title", str47, a3, parse));
                    }
                    String host = parse.getHost();
                    if (host == null) {
                        l.a();
                    }
                    l.a((Object) host, "");
                    if (p.a((CharSequence) host, (CharSequence) "webview", false)) {
                        cVar = com.bytedance.lynx.hybrid.a.c.WEB;
                    } else if (p.a((CharSequence) host, (CharSequence) "lynxview", false)) {
                        cVar = com.bytedance.lynx.hybrid.a.c.LYNX;
                    } else {
                        cVar = com.bytedance.lynx.hybrid.a.c.UNKNOWN;
                    }
                    bVar.setEngineType(cVar);
                } else if (a2 != 2) {
                    String str48 = sparkContext.f31050a;
                    Map<String, String> map2 = sparkContext.f31051b;
                    l.c(str48, "");
                    Uri parse2 = Uri.parse(str48);
                    bVar = new com.bytedance.lynx.a.a.b.c(null, 1, null);
                    l.a((Object) parse2, "");
                    Map<String, String> a4 = com.bytedance.lynx.a.a.c.a.a(bVar, parse2, map2);
                    String str49 = a4.get("block_back_press");
                    if (str49 != null) {
                        bVar.setBlockBackPress(com.bytedance.lynx.a.a.c.b.b("block_back_press", str49, a4, parse2));
                    }
                    String str50 = a4.get("bundle");
                    if (str50 != null) {
                        bVar.setBundle(com.bytedance.lynx.a.a.c.b.c("bundle", str50, a4, parse2));
                    }
                    String str51 = a4.get("channel");
                    if (str51 != null) {
                        bVar.setChannel(com.bytedance.lynx.a.a.c.b.c("channel", str51, a4, parse2));
                    }
                    String str52 = a4.get("container_bg_color");
                    if (str52 != null) {
                        bVar.setContainerBgColor(com.bytedance.lynx.a.a.c.b.e("container_bg_color", str52, a4, parse2));
                    }
                    String str53 = a4.get("disable_back_press");
                    if (str53 != null) {
                        bVar.setDisableBackPress(com.bytedance.lynx.a.a.c.b.b("disable_back_press", str53, a4, parse2));
                    }
                    String str54 = a4.get("disable_builtin");
                    if (str54 != null) {
                        bVar.setDisableBuiltin(com.bytedance.lynx.a.a.c.b.b("disable_builtin", str54, a4, parse2));
                    }
                    String str55 = a4.get("disable_gecko");
                    if (str55 != null) {
                        bVar.setDisableGecko(com.bytedance.lynx.a.a.c.b.b("disable_gecko", str55, a4, parse2));
                    }
                    String str56 = a4.get("no_hw");
                    if (str56 != null) {
                        bVar.setDisableHardwareAccelerate(com.bytedance.lynx.a.a.c.b.b("no_hw", str56, a4, parse2));
                    }
                    String str57 = a4.get("disable_save_image");
                    if (str57 != null) {
                        bVar.setDisableSaveImage(com.bytedance.lynx.a.a.c.b.b("disable_save_image", str57, a4, parse2));
                    }
                    String str58 = a4.get("enable_canvas");
                    if (str58 != null) {
                        bVar.setEnableCanvas(com.bytedance.lynx.a.a.c.b.b("enable_canvas", str58, a4, parse2));
                    }
                    String str59 = a4.get("fallback_url");
                    if (str59 != null) {
                        bVar.setFallbackUrl(com.bytedance.lynx.a.a.c.b.c("fallback_url", str59, a4, parse2));
                    }
                    String str60 = a4.get("force_h5");
                    if (str60 != null) {
                        bVar.setForceH5(com.bytedance.lynx.a.a.c.b.b("force_h5", str60, a4, parse2));
                    }
                    String str61 = a4.get("group");
                    if (str61 != null) {
                        bVar.setGroup(com.bytedance.lynx.a.a.c.b.c("group", str61, a4, parse2));
                    }
                    String str62 = a4.get("hide_loading");
                    if (str62 != null) {
                        bVar.setHideLoading(com.bytedance.lynx.a.a.c.b.b("hide_loading", str62, a4, parse2));
                    }
                    String str63 = a4.get("ignore_cache_policy");
                    if (str63 != null) {
                        bVar.setIgnoreCachePolicy(com.bytedance.lynx.a.a.c.b.a("ignore_cache_policy", str63, a4, parse2));
                    }
                    String str64 = a4.get("initial_data");
                    if (str64 != null) {
                        bVar.setInitData(com.bytedance.lynx.a.a.c.b.c("initial_data", str64, a4, parse2));
                    }
                    String str65 = a4.get("loading_bg_color");
                    if (str65 != null) {
                        bVar.setLoadingBgColor(com.bytedance.lynx.a.a.c.b.e("loading_bg_color", str65, a4, parse2));
                    }
                    String str66 = a4.get("lynxview_height");
                    if (str66 != null) {
                        bVar.setLynxViewHeight(com.bytedance.lynx.a.a.c.b.a("lynxview_height", str66, a4, parse2));
                    }
                    String str67 = a4.get("lynxview_width");
                    if (str67 != null) {
                        bVar.setLynxViewWidth(com.bytedance.lynx.a.a.c.b.a("lynxview_width", str67, a4, parse2));
                    }
                    String str68 = a4.get("need_sec_link");
                    if (str68 != null) {
                        bVar.setNeedSecLink(com.bytedance.lynx.a.a.c.b.b("need_sec_link", str68, a4, parse2));
                    }
                    String str69 = a4.get("preloadFonts");
                    if (str69 != null) {
                        bVar.setPreloadFonts(com.bytedance.lynx.a.a.c.b.c("preloadFonts", str69, a4, parse2));
                    }
                    String str70 = a4.get("preset_height");
                    if (str70 != null) {
                        bVar.setPresetHeight(com.bytedance.lynx.a.a.c.b.a("preset_height", str70, a4, parse2));
                    }
                    String str71 = a4.get("preset_safe_point");
                    if (str71 != null) {
                        bVar.setPresetSafePoint(com.bytedance.lynx.a.a.c.b.b("preset_safe_point", str71, a4, parse2));
                    }
                    String str72 = a4.get("preset_width");
                    if (str72 != null) {
                        bVar.setPresetWidth(com.bytedance.lynx.a.a.c.b.a("preset_width", str72, a4, parse2));
                    }
                    String str73 = a4.get("surl");
                    if (str73 != null) {
                        bVar.setSUrl(com.bytedance.lynx.a.a.c.b.c("surl", str73, a4, parse2));
                    }
                    String str74 = a4.get("sec_link_scene");
                    if (str74 != null) {
                        bVar.setSecLinkScene(com.bytedance.lynx.a.a.c.b.c("sec_link_scene", str74, a4, parse2));
                    }
                    String str75 = a4.get("share_group");
                    if (str75 != null) {
                        bVar.setShareGroup(com.bytedance.lynx.a.a.c.b.b("share_group", str75, a4, parse2));
                    }
                    String str76 = a4.get("thread_strategy");
                    if (str76 != null) {
                        bVar.setThreadStrategy(com.bytedance.lynx.a.a.c.b.a("thread_strategy", str76, a4, parse2));
                    }
                    String str77 = a4.get("ui_running_mode");
                    if (str77 != null) {
                        bVar.setUiRunningMode(com.bytedance.lynx.a.a.c.b.b("ui_running_mode", str77, a4, parse2));
                    }
                    String str78 = a4.get("url");
                    if (str78 != null) {
                        bVar.setUrl(com.bytedance.lynx.a.a.c.b.c("url", str78, a4, parse2));
                    }
                    String str79 = a4.get("__use_ttnet");
                    if (str79 != null) {
                        bVar.setUseTtnet(com.bytedance.lynx.a.a.c.b.a("__use_ttnet", str79, a4, parse2));
                    }
                    String host2 = parse2.getHost();
                    if (host2 == null) {
                        l.a();
                    }
                    l.a((Object) host2, "");
                    if (p.a((CharSequence) host2, (CharSequence) "webview", false)) {
                        cVar3 = com.bytedance.lynx.hybrid.a.c.WEB;
                    } else if (p.a((CharSequence) host2, (CharSequence) "lynxview", false)) {
                        cVar3 = com.bytedance.lynx.hybrid.a.c.LYNX;
                    } else {
                        cVar3 = com.bytedance.lynx.hybrid.a.c.UNKNOWN;
                    }
                    bVar.setEngineType(cVar3);
                } else {
                    String str80 = sparkContext.f31050a;
                    Map<String, String> map3 = sparkContext.f31051b;
                    l.c(str80, "");
                    Uri parse3 = Uri.parse(str80);
                    com.bytedance.lynx.a.a.b.b bVar2 = new com.bytedance.lynx.a.a.b.b(null, 1, null);
                    l.a((Object) parse3, "");
                    Map<String, String> a5 = com.bytedance.lynx.a.a.c.a.a(bVar2, parse3, map3);
                    l.c(bVar2, "");
                    l.c(a5, "");
                    l.c(parse3, "");
                    String str81 = a5.get("width_percent");
                    if (str81 != null) {
                        bVar = bVar2;
                        bVar2.setWidth((int) ((Float.parseFloat(str81) / 100.0f) * ((float) com.bytedance.lynx.a.a.f.b.b())));
                    } else {
                        bVar = bVar2;
                    }
                    String str82 = a5.get("height_percent");
                    if (str82 != null) {
                        bVar2.setHeight((int) ((Float.parseFloat(str82) / 100.0f) * ((float) com.bytedance.lynx.a.a.f.b.a())));
                    }
                    String str83 = a5.get("mask_color");
                    if (str83 != null) {
                        bVar2.setMaskBgColor(com.bytedance.lynx.a.a.c.b.d("mask_color", str83, a5, parse3));
                    }
                    String str84 = a5.get("container_bgcolor");
                    if (str84 != null) {
                        bVar2.setContainerBgColor(com.bytedance.lynx.a.a.c.b.d("container_bgcolor", str84, a5, parse3));
                    }
                    bVar2.setDisableMaskClose(!l.a((Object) a5.get("close_by_mask"), (Object) "1"));
                    bVar2.setPullDownClose(l.a((Object) a5.get("close_by_gesture"), (Object) "1"));
                    String str85 = a5.get("popup_enter_type");
                    if (str85 != null) {
                        bVar2.setAnimation(str85);
                    }
                    if (a5.get("drag_height") == null && (str = a5.get("drag_height_percent")) != null) {
                        bVar2.setDragHeight((int) ((Float.parseFloat(str) / 100.0f) * ((float) com.bytedance.lynx.a.a.f.b.a())));
                    }
                    if (bVar2.getPullDownClose()) {
                        String str86 = a5.get("drag_down_threshold");
                        if (str86 == null || (valueOf3 = Integer.valueOf(Integer.parseInt(str86))) == null) {
                            bVar2.setDragDownThreshold(bVar2.getDragHeight() - bVar2.getHeight());
                        } else {
                            bVar2.setDragDownThreshold(valueOf3.intValue());
                        }
                        String str87 = a5.get("drag_down_close_threshold");
                        if (str87 == null || (valueOf2 = Integer.valueOf(Integer.parseInt(str87))) == null) {
                            bVar2.setDragDownCloseThreshold((int) (((float) bVar2.getDragHeight()) - (((float) bVar2.getHeight()) * 0.8f)));
                        } else {
                            bVar2.setDragDownCloseThreshold(valueOf2.intValue());
                        }
                        String str88 = a5.get("peek_down_close_threshold");
                        if (str88 == null || (valueOf = Integer.valueOf(Integer.parseInt(str88))) == null) {
                            bVar2.setPeekDownCloseThreshold((int) (((float) bVar2.getHeight()) * 0.2f));
                        } else {
                            bVar2.setPeekDownCloseThreshold(valueOf.intValue());
                        }
                    }
                    String str89 = a5.get("show_loading");
                    if (str89 != null) {
                        bVar2.setHideLoading(l.a((Object) str89, (Object) "0"));
                    }
                    String str90 = a5.get("transition_animation");
                    if (str90 != null) {
                        bVar2.setAnimation(com.bytedance.lynx.a.a.c.b.c("transition_animation", str90, a5, parse3));
                    }
                    String str91 = a5.get("block_back_press");
                    if (str91 != null) {
                        bVar2.setBlockBackPress(com.bytedance.lynx.a.a.c.b.b("block_back_press", str91, a5, parse3));
                    }
                    String str92 = a5.get("bundle");
                    if (str92 != null) {
                        bVar2.setBundle(com.bytedance.lynx.a.a.c.b.c("bundle", str92, a5, parse3));
                    }
                    String str93 = a5.get("channel");
                    if (str93 != null) {
                        bVar2.setChannel(com.bytedance.lynx.a.a.c.b.c("channel", str93, a5, parse3));
                    }
                    String str94 = a5.get("container_bg_color");
                    if (str94 != null) {
                        bVar2.setContainerBgColor(com.bytedance.lynx.a.a.c.b.e("container_bg_color", str94, a5, parse3));
                    }
                    String str95 = a5.get("disable_back_press");
                    if (str95 != null) {
                        bVar2.setDisableBackPress(com.bytedance.lynx.a.a.c.b.b("disable_back_press", str95, a5, parse3));
                    }
                    String str96 = a5.get("disable_builtin");
                    if (str96 != null) {
                        bVar2.setDisableBuiltin(com.bytedance.lynx.a.a.c.b.b("disable_builtin", str96, a5, parse3));
                    }
                    String str97 = a5.get("disable_gecko");
                    if (str97 != null) {
                        bVar2.setDisableGecko(com.bytedance.lynx.a.a.c.b.b("disable_gecko", str97, a5, parse3));
                    }
                    String str98 = a5.get("no_hw");
                    if (str98 != null) {
                        bVar2.setDisableHardwareAccelerate(com.bytedance.lynx.a.a.c.b.b("no_hw", str98, a5, parse3));
                    }
                    String str99 = a5.get("disable_mask_click_close");
                    if (str99 != null) {
                        bVar2.setDisableMaskClose(com.bytedance.lynx.a.a.c.b.b("disable_mask_click_close", str99, a5, parse3));
                    }
                    String str100 = a5.get("disable_save_image");
                    if (str100 != null) {
                        bVar2.setDisableSaveImage(com.bytedance.lynx.a.a.c.b.b("disable_save_image", str100, a5, parse3));
                    }
                    String str101 = a5.get("drag_back");
                    if (str101 != null) {
                        bVar2.setDragBack(com.bytedance.lynx.a.a.c.b.b("drag_back", str101, a5, parse3));
                    }
                    String str102 = a5.get("drag_by_gesture");
                    if (str102 != null) {
                        bVar2.setDragByGesture(com.bytedance.lynx.a.a.c.b.b("drag_by_gesture", str102, a5, parse3));
                    }
                    String str103 = a5.get("drag_down_close_threshold");
                    if (str103 != null) {
                        bVar2.setDragDownCloseThreshold(com.bytedance.lynx.a.a.c.b.a("drag_down_close_threshold", str103, a5, parse3));
                    }
                    String str104 = a5.get("drag_down_threshold");
                    if (str104 != null) {
                        bVar2.setDragDownThreshold(com.bytedance.lynx.a.a.c.b.a("drag_down_threshold", str104, a5, parse3));
                    }
                    String str105 = a5.get("drag_height");
                    if (str105 != null) {
                        bVar2.setDragHeight(com.bytedance.lynx.a.a.c.b.a("drag_height", str105, a5, parse3));
                    }
                    String str106 = a5.get("drag_up_threshold");
                    if (str106 != null) {
                        bVar2.setDragUpThreshold(com.bytedance.lynx.a.a.c.b.a("drag_up_threshold", str106, a5, parse3));
                    }
                    String str107 = a5.get("enable_canvas");
                    if (str107 != null) {
                        bVar2.setEnableCanvas(com.bytedance.lynx.a.a.c.b.b("enable_canvas", str107, a5, parse3));
                    }
                    String str108 = a5.get("fallback_url");
                    if (str108 != null) {
                        bVar2.setFallbackUrl(com.bytedance.lynx.a.a.c.b.c("fallback_url", str108, a5, parse3));
                    }
                    String str109 = a5.get("force_h5");
                    if (str109 != null) {
                        bVar2.setForceH5(com.bytedance.lynx.a.a.c.b.b("force_h5", str109, a5, parse3));
                    }
                    String str110 = a5.get("gravity");
                    if (str110 != null) {
                        bVar2.setGravity(com.bytedance.lynx.a.a.c.b.c("gravity", str110, a5, parse3));
                    }
                    String str111 = a5.get("group");
                    if (str111 != null) {
                        bVar2.setGroup(com.bytedance.lynx.a.a.c.b.c("group", str111, a5, parse3));
                    }
                    String str112 = a5.get("height");
                    if (str112 != null) {
                        bVar2.setHeight(com.bytedance.lynx.a.a.c.b.a("height", str112, a5, parse3));
                    }
                    String str113 = a5.get("hide_loading");
                    if (str113 != null) {
                        bVar2.setHideLoading(com.bytedance.lynx.a.a.c.b.b("hide_loading", str113, a5, parse3));
                    }
                    String str114 = a5.get("ignore_cache_policy");
                    if (str114 != null) {
                        bVar2.setIgnoreCachePolicy(com.bytedance.lynx.a.a.c.b.a("ignore_cache_policy", str114, a5, parse3));
                    }
                    String str115 = a5.get("initial_data");
                    if (str115 != null) {
                        bVar2.setInitData(com.bytedance.lynx.a.a.c.b.c("initial_data", str115, a5, parse3));
                    }
                    String str116 = a5.get("loading_bg_color");
                    if (str116 != null) {
                        bVar2.setLoadingBgColor(com.bytedance.lynx.a.a.c.b.e("loading_bg_color", str116, a5, parse3));
                    }
                    String str117 = a5.get("lynxview_height");
                    if (str117 != null) {
                        bVar2.setLynxViewHeight(com.bytedance.lynx.a.a.c.b.a("lynxview_height", str117, a5, parse3));
                    }
                    String str118 = a5.get("lynxview_width");
                    if (str118 != null) {
                        bVar2.setLynxViewWidth(com.bytedance.lynx.a.a.c.b.a("lynxview_width", str118, a5, parse3));
                    }
                    String str119 = a5.get("mask_bg_color");
                    if (str119 != null) {
                        bVar2.setMaskBgColor(com.bytedance.lynx.a.a.c.b.e("mask_bg_color", str119, a5, parse3));
                    }
                    String str120 = a5.get("need_sec_link");
                    if (str120 != null) {
                        bVar2.setNeedSecLink(com.bytedance.lynx.a.a.c.b.b("need_sec_link", str120, a5, parse3));
                    }
                    String str121 = a5.get("peek_down_close_threshold");
                    if (str121 != null) {
                        bVar2.setPeekDownCloseThreshold(com.bytedance.lynx.a.a.c.b.a("peek_down_close_threshold", str121, a5, parse3));
                    }
                    String str122 = a5.get("preloadFonts");
                    if (str122 != null) {
                        bVar2.setPreloadFonts(com.bytedance.lynx.a.a.c.b.c("preloadFonts", str122, a5, parse3));
                    }
                    String str123 = a5.get("preset_height");
                    if (str123 != null) {
                        bVar2.setPresetHeight(com.bytedance.lynx.a.a.c.b.a("preset_height", str123, a5, parse3));
                    }
                    String str124 = a5.get("preset_safe_point");
                    if (str124 != null) {
                        bVar2.setPresetSafePoint(com.bytedance.lynx.a.a.c.b.b("preset_safe_point", str124, a5, parse3));
                    }
                    String str125 = a5.get("preset_width");
                    if (str125 != null) {
                        bVar2.setPresetWidth(com.bytedance.lynx.a.a.c.b.a("preset_width", str125, a5, parse3));
                    }
                    String str126 = a5.get("enable_pull_down_close");
                    if (str126 != null) {
                        bVar2.setPullDownClose(com.bytedance.lynx.a.a.c.b.b("enable_pull_down_close", str126, a5, parse3));
                    }
                    String str127 = a5.get("radius");
                    if (str127 != null) {
                        bVar2.setRadius(com.bytedance.lynx.a.a.c.b.a("radius", str127, a5, parse3));
                    }
                    String str128 = a5.get("surl");
                    if (str128 != null) {
                        bVar2.setSUrl(com.bytedance.lynx.a.a.c.b.c("surl", str128, a5, parse3));
                    }
                    String str129 = a5.get("sec_link_scene");
                    if (str129 != null) {
                        bVar2.setSecLinkScene(com.bytedance.lynx.a.a.c.b.c("sec_link_scene", str129, a5, parse3));
                    }
                    String str130 = a5.get("share_group");
                    if (str130 != null) {
                        bVar2.setShareGroup(com.bytedance.lynx.a.a.c.b.b("share_group", str130, a5, parse3));
                    }
                    String str131 = a5.get("show_mask");
                    if (str131 != null) {
                        bVar2.setShowMask(com.bytedance.lynx.a.a.c.b.b("show_mask", str131, a5, parse3));
                    }
                    String str132 = a5.get("thread_strategy");
                    if (str132 != null) {
                        bVar2.setThreadStrategy(com.bytedance.lynx.a.a.c.b.a("thread_strategy", str132, a5, parse3));
                    }
                    String str133 = a5.get("ui_running_mode");
                    if (str133 != null) {
                        bVar2.setUiRunningMode(com.bytedance.lynx.a.a.c.b.b("ui_running_mode", str133, a5, parse3));
                    }
                    String str134 = a5.get("url");
                    if (str134 != null) {
                        bVar2.setUrl(com.bytedance.lynx.a.a.c.b.c("url", str134, a5, parse3));
                    }
                    String str135 = a5.get("__use_ttnet");
                    if (str135 != null) {
                        bVar2.setUseTtnet(com.bytedance.lynx.a.a.c.b.a("__use_ttnet", str135, a5, parse3));
                    }
                    String str136 = a5.get("width");
                    if (str136 != null) {
                        bVar2.setWidth(com.bytedance.lynx.a.a.c.b.a("width", str136, a5, parse3));
                    }
                    String host3 = parse3.getHost();
                    if (host3 == null) {
                        l.a();
                    }
                    l.a((Object) host3, "");
                    if (p.a((CharSequence) host3, (CharSequence) "webview", false)) {
                        cVar2 = com.bytedance.lynx.hybrid.a.c.WEB;
                    } else if (p.a((CharSequence) host3, (CharSequence) "lynxview", false)) {
                        cVar2 = com.bytedance.lynx.hybrid.a.c.LYNX;
                    } else {
                        cVar2 = com.bytedance.lynx.hybrid.a.c.UNKNOWN;
                    }
                    bVar.setEngineType(cVar2);
                }
                sparkContext = this;
                sparkContext.f31054k = bVar;
            }
            sparkContext.f31055l = true;
        }
        return sparkContext.f31054k;
    }

    public final SparkContext a(com.bytedance.hybrid.spark.a.b bVar) {
        l.c(bVar, "");
        a(com.bytedance.hybrid.spark.a.b.class, bVar);
        return this;
    }

    public final SparkContext a(com.bytedance.hybrid.spark.a.c cVar) {
        l.c(cVar, "");
        a(com.bytedance.hybrid.spark.a.c.class, cVar);
        return this;
    }

    public final SparkContext a(String str) {
        l.c(str, "");
        this.f31050a = str;
        this.f31055l = false;
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SparkContext(Parcel parcel) {
        this();
        boolean z;
        l.c(parcel, "");
        this.f31053j = parcel.readInt();
        String readString = parcel.readString();
        this.f31050a = readString == null ? "" : readString;
        parcel.readMap(this.f31051b, Map.class.getClassLoader());
        parcel.readMap(this.f31052c, Map.class.getClassLoader());
        Serializable readSerializable = parcel.readSerializable();
        this.f31054k = (com.bytedance.lynx.a.a.b.c) (!(readSerializable instanceof com.bytedance.lynx.a.a.b.c) ? null : readSerializable);
        String readString2 = parcel.readString();
        readString2 = readString2 == null ? d.a() : readString2;
        l.c(readString2, "");
        this.f40979f = readString2;
        String readString3 = parcel.readString();
        readString3 = readString3 == null ? "default_bid" : readString3;
        l.c(readString3, "");
        this.f40980g = readString3;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f31055l = z;
    }

    public final void a(com.bytedance.hybrid.spark.a.e eVar) {
        l.c(eVar, "");
        a(com.bytedance.hybrid.spark.a.e.class, eVar);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        l.c(parcel, "");
        parcel.writeInt(this.f31053j);
        parcel.writeString(this.f31050a);
        parcel.writeMap(this.f31051b);
        parcel.writeMap(this.f31052c);
        parcel.writeSerializable(this.f31054k);
        parcel.writeString(this.f40979f);
        parcel.writeString(this.f40980g);
        parcel.writeInt(this.f31055l ? 1 : 0);
    }
}
