package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.util.List;
import java.util.Map;

public class u extends b {
    @c(a = "event_name")
    public String A;
    @c(a = "guide_url")
    public String B;
    @c(a = "business_text")
    public String C;
    @c(a = "app_id")
    public Long D;
    @c(a = "is_gray")
    public Boolean E;
    @c(a = "gray_scheme_url")
    public String F;
    @c(a = "gift_scene")
    public Long G;
    @c(a = "trigger_words")
    public List<String> H;
    @c(a = "gift_panel_banner")
    public w I;
    @c(a = "is_broadcast_gift")
    public boolean J;
    @c(a = "tracker_params")
    public Map<String, String> K;
    @c(a = "lock_info")
    public v L;
    @c(a = StringSet.name)

    /* renamed from: a  reason: collision with root package name */
    public String f19758a;
    @c(a = "image")

    /* renamed from: b  reason: collision with root package name */
    public ImageModel f19759b;
    @c(a = "describe")

    /* renamed from: c  reason: collision with root package name */
    public String f19760c;
    @c(a = "id")

    /* renamed from: d  reason: collision with root package name */
    public long f19761d;
    @c(a = StringSet.type)

    /* renamed from: e  reason: collision with root package name */
    public int f19762e;
    @c(a = "diamond_count")

    /* renamed from: f  reason: collision with root package name */
    public int f19763f;
    @c(a = "combo")

    /* renamed from: g  reason: collision with root package name */
    public boolean f19764g;
    @c(a = "duration")

    /* renamed from: h  reason: collision with root package name */
    public int f19765h;
    @c(a = "for_linkmic")

    /* renamed from: i  reason: collision with root package name */
    public boolean f19766i;
    @c(a = "nameColor")

    /* renamed from: j  reason: collision with root package name */
    public int f19767j = -1;
    @c(a = "describeColor")

    /* renamed from: k  reason: collision with root package name */
    public int f19768k = -1711276033;
    @c(a = "gift_label_icon")

    /* renamed from: l  reason: collision with root package name */
    public ImageModel f19769l;
    @c(a = "is_displayed_on_panel")

    /* renamed from: m  reason: collision with root package name */
    public boolean f19770m;
    @c(a = "primary_effect_id")
    public long n;
    @c(a = "gold_effect")
    public String o;
    @c(a = "preview_image")
    public ImageModel p;
    @c(a = "notify")
    public Boolean q;
    @c(a = "region")
    public String r;
    @c(a = "manual")
    public String s;
    @c(a = "for_custom")
    public Boolean t;
    @c(a = "special_effects")
    public Map<String, Long> u;
    @c(a = "icon")
    public ImageModel v;
    @c(a = "action_type")
    public Integer w;
    @c(a = "item_type")
    public Integer x;
    @c(a = "scheme_url")
    public String y;
    @c(a = "gift_operation")
    public GiftOperation z;

    static {
        Covode.recordClassIndex(11716);
    }

    public final boolean a() {
        int i2 = this.f19762e;
        if (i2 == 2 || i2 == 4 || i2 == 8) {
            return true;
        }
        return false;
    }
}
