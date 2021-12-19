package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class l extends a {
    @c(a = "discardable")

    /* renamed from: a  reason: collision with root package name */
    public boolean f19643a;
    @c(a = "immediate")

    /* renamed from: f  reason: collision with root package name */
    public boolean f19644f;
    @c(a = "duration")

    /* renamed from: g  reason: collision with root package name */
    public int f19645g;
    @c(a = "background_color_start")

    /* renamed from: h  reason: collision with root package name */
    public String f19646h = "#ff9d5c";
    @c(a = "background_color_end")

    /* renamed from: i  reason: collision with root package name */
    public String f19647i = "#ff9d5c";
    @c(a = "text_color")

    /* renamed from: j  reason: collision with root package name */
    public String f19648j = "#ffffff";
    @c(a = "position")

    /* renamed from: k  reason: collision with root package name */
    public int f19649k = 1;
    @c(a = "top_img")

    /* renamed from: l  reason: collision with root package name */
    public ImageModel f19650l;
    @c(a = "top_img_width")

    /* renamed from: m  reason: collision with root package name */
    public int f19651m;
    @c(a = "top_img_height")
    public int n;
    @c(a = "show_mongolia_layer")
    public boolean o;

    static {
        Covode.recordClassIndex(11688);
    }

    public l() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.COMMON_TOAST;
    }
}
