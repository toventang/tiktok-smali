package com.bytedance.ies.bullet.kit.lynx;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import javax.xml.transform.Transformer;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f32347a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32348b;

    /* renamed from: c  reason: collision with root package name */
    public final String f32349c;

    /* renamed from: d  reason: collision with root package name */
    public final float f32350d;

    /* renamed from: e  reason: collision with root package name */
    public final float f32351e;

    /* renamed from: f  reason: collision with root package name */
    public final Transformer f32352f;

    static {
        Covode.recordClassIndex(18992);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f32347a, hVar.f32347a) && l.a(this.f32348b, hVar.f32348b) && l.a(this.f32349c, hVar.f32349c) && Float.compare(this.f32350d, hVar.f32350d) == 0 && Float.compare(this.f32351e, hVar.f32351e) == 0 && l.a(this.f32352f, hVar.f32352f);
    }

    public final int hashCode() {
        Context context = this.f32347a;
        int i2 = 0;
        int hashCode = (context != null ? context.hashCode() : 0) * 31;
        String str = this.f32348b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f32349c;
        int hashCode3 = (((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Float.floatToIntBits(this.f32350d)) * 31) + Float.floatToIntBits(this.f32351e)) * 31;
        Transformer transformer = this.f32352f;
        if (transformer != null) {
            i2 = transformer.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "LynxImageInfo(context=" + this.f32347a + ", cacheKey=" + this.f32348b + ", src=" + this.f32349c + ", width=" + this.f32350d + ", height=" + this.f32351e + ", transformer=" + this.f32352f + ")";
    }

    public h(Context context, String str, String str2, float f2, float f3, Transformer transformer) {
        l.c(context, "");
        this.f32347a = context;
        this.f32348b = str;
        this.f32349c = str2;
        this.f32350d = f2;
        this.f32351e = f3;
        this.f32352f = transformer;
    }
}
