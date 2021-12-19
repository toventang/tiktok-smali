package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import org.json.JSONObject;

public final class ap {

    /* renamed from: a  reason: collision with root package name */
    public String f74870a;

    /* renamed from: b  reason: collision with root package name */
    public long f74871b;

    /* renamed from: c  reason: collision with root package name */
    public String f74872c;

    /* renamed from: d  reason: collision with root package name */
    public String f74873d;

    /* renamed from: e  reason: collision with root package name */
    public String f74874e;

    /* renamed from: f  reason: collision with root package name */
    public String f74875f;

    /* renamed from: g  reason: collision with root package name */
    public String f74876g;

    /* renamed from: h  reason: collision with root package name */
    public int f74877h;

    /* renamed from: i  reason: collision with root package name */
    public String f74878i;

    /* renamed from: j  reason: collision with root package name */
    public String f74879j;

    /* renamed from: k  reason: collision with root package name */
    public JSONObject f74880k;

    /* renamed from: l  reason: collision with root package name */
    public String f74881l;

    /* renamed from: m  reason: collision with root package name */
    public int f74882m;
    public boolean n;

    static {
        Covode.recordClassIndex(46163);
    }

    public static String a(int i2) {
        switch (i2) {
            case 1:
                return "feed_download_ad";
            case 2:
                return "detail_download_ad";
            case 3:
                return "comment_download_ad";
            case 4:
                return "wap";
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return "landing_ad";
            default:
                return "draw_ad";
        }
    }
}
