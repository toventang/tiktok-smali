package com.bytedance.android.livesdk.model;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.e;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.util.List;

public class av {
    @c(a = "image")

    /* renamed from: a  reason: collision with root package name */
    public ImageModel f18999a;
    @c(a = "text_color")

    /* renamed from: b  reason: collision with root package name */
    public String f19000b;
    @c(a = "text_size")

    /* renamed from: c  reason: collision with root package name */
    public int f19001c;
    @c(a = "content")

    /* renamed from: d  reason: collision with root package name */
    public String f19002d;
    @c(a = "max_length")

    /* renamed from: e  reason: collision with root package name */
    public int f19003e;
    @c(a = "input_rect")

    /* renamed from: f  reason: collision with root package name */
    public int[] f19004f;
    @c(a = StringSet.type)

    /* renamed from: g  reason: collision with root package name */
    public int f19005g;
    @c(a = "id")

    /* renamed from: h  reason: collision with root package name */
    public long f19006h;
    @c(a = "x")

    /* renamed from: i  reason: collision with root package name */
    public int f19007i = -1;
    @c(a = "y")

    /* renamed from: j  reason: collision with root package name */
    public int f19008j = -1;
    @c(a = "w")

    /* renamed from: k  reason: collision with root package name */
    public int f19009k;
    @c(a = "h")

    /* renamed from: l  reason: collision with root package name */
    public int f19010l;
    @c(a = "status")

    /* renamed from: m  reason: collision with root package name */
    public int f19011m;
    @c(a = "kind")
    public int n;
    @c(a = "sit_rect")
    public List<Double> o;

    static {
        Covode.recordClassIndex(11326);
    }

    public av() {
    }

    public final ar a() {
        if (this.f19005g != 3 || TextUtils.isEmpty(this.f19002d)) {
            return null;
        }
        try {
            return (ar) e.a.f9628b.a(this.f19002d, ar.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public av(av avVar) {
        this.f18999a = avVar.f18999a;
        this.f19000b = avVar.f19000b;
        this.f19001c = avVar.f19001c;
        this.f19002d = avVar.f19002d;
        this.f19003e = avVar.f19003e;
        this.f19004f = avVar.f19004f;
        this.f19005g = avVar.f19005g;
        this.f19006h = avVar.f19006h;
        this.f19007i = avVar.f19007i;
        this.f19008j = avVar.f19008j;
        this.f19009k = avVar.f19009k;
        this.f19010l = avVar.f19010l;
        this.f19011m = avVar.f19011m;
    }
}
