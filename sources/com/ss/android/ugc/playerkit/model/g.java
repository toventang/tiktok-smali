package com.ss.android.ugc.playerkit.model;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Objects;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public int f148726a;

    /* renamed from: b  reason: collision with root package name */
    public int f148727b;

    /* renamed from: c  reason: collision with root package name */
    public List<Float> f148728c;

    /* renamed from: d  reason: collision with root package name */
    public List<Bitmap> f148729d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f148730e;

    /* renamed from: f  reason: collision with root package name */
    public int f148731f;

    static {
        Covode.recordClassIndex(97996);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f148726a), Integer.valueOf(this.f148727b), this.f148728c, this.f148729d, Boolean.valueOf(this.f148730e), Integer.valueOf(this.f148731f));
    }

    public String toString() {
        return "EffectInfo{action=" + this.f148726a + ", effectType=" + this.f148727b + ", effectValue=" + this.f148728c + ", lutBitmap=" + this.f148729d + ", isUseEffect=" + this.f148730e + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f148726a == gVar.f148726a && this.f148727b == gVar.f148727b && this.f148730e == gVar.f148730e && this.f148731f == gVar.f148731f && Objects.equals(this.f148728c, gVar.f148728c) && Objects.equals(this.f148729d, gVar.f148729d)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
