package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.e;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.util.List;

public class m {
    @c(a = "image")

    /* renamed from: a  reason: collision with root package name */
    public ImageModel f19092a;
    @c(a = "text_color")

    /* renamed from: b  reason: collision with root package name */
    public String f19093b;
    @c(a = "text_size")

    /* renamed from: c  reason: collision with root package name */
    public int f19094c;
    @c(a = "content")

    /* renamed from: d  reason: collision with root package name */
    public ar f19095d;
    @c(a = "max_length")

    /* renamed from: e  reason: collision with root package name */
    public int f19096e;
    @c(a = "input_rect")

    /* renamed from: f  reason: collision with root package name */
    public int[] f19097f;
    @c(a = StringSet.type)

    /* renamed from: g  reason: collision with root package name */
    public int f19098g;
    @c(a = "id")

    /* renamed from: h  reason: collision with root package name */
    public long f19099h;
    @c(a = "x")

    /* renamed from: i  reason: collision with root package name */
    public int f19100i = -1;
    @c(a = "y")

    /* renamed from: j  reason: collision with root package name */
    public int f19101j = -1;
    @c(a = "w")

    /* renamed from: k  reason: collision with root package name */
    public int f19102k;
    @c(a = "h")

    /* renamed from: l  reason: collision with root package name */
    public int f19103l;
    @c(a = "status")

    /* renamed from: m  reason: collision with root package name */
    public int f19104m;
    @c(a = "kind")
    public int n;
    @c(a = "sit_rect")
    public List<Double> o;

    static {
        Covode.recordClassIndex(11385);
    }

    public final av a() {
        String str;
        av avVar = new av();
        avVar.f18999a = this.f19092a;
        avVar.f19000b = this.f19093b;
        avVar.f19001c = this.f19094c;
        if (this.f19095d != null) {
            str = e.a.f9628b.b(this.f19095d);
        } else {
            str = "";
        }
        avVar.f19002d = str;
        avVar.f19003e = this.f19096e;
        avVar.f19004f = this.f19097f;
        avVar.f19005g = this.f19098g;
        avVar.f19006h = this.f19099h;
        avVar.f19007i = this.f19100i;
        avVar.f19008j = this.f19101j;
        avVar.f19009k = this.f19102k;
        avVar.f19010l = this.f19103l;
        avVar.f19011m = this.f19104m;
        avVar.n = this.n;
        avVar.o = this.o;
        return avVar;
    }
}
