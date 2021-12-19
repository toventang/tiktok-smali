package com.lynx.tasm.behavior.shadow.text;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.c;
import com.lynx.tasm.utils.j;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public int f56007a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f56008b = -1;

    /* renamed from: c  reason: collision with root package name */
    public Integer f56009c;

    /* renamed from: d  reason: collision with root package name */
    public int f56010d = 3;

    /* renamed from: e  reason: collision with root package name */
    public int f56011e;

    /* renamed from: f  reason: collision with root package name */
    public int f56012f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f56013g;

    /* renamed from: h  reason: collision with root package name */
    public int f56014h;

    /* renamed from: i  reason: collision with root package name */
    public int f56015i;

    /* renamed from: j  reason: collision with root package name */
    public int f56016j;

    /* renamed from: k  reason: collision with root package name */
    public float f56017k = 1.0E21f;

    /* renamed from: l  reason: collision with root package name */
    public float f56018l = 1.0E21f;

    /* renamed from: m  reason: collision with root package name */
    public float f56019m;
    public float n = ((float) Math.round(j.a(14.0f)));
    public boolean o = false;
    public boolean p = false;
    public String q = null;
    public c r;
    public int s;

    static {
        Covode.recordClassIndex(35003);
    }

    public final TextDirectionHeuristic c() {
        int i2 = this.f56011e;
        if (i2 == 0) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (i2 == 3) {
            return TextDirectionHeuristics.LTR;
        }
        return TextDirectionHeuristics.RTL;
    }

    public final int a() {
        int i2 = this.f56013g;
        if (i2 == 1) {
            if (this.f56014h == 2) {
                return 3;
            }
            return i2;
        } else if (i2 == 1) {
            return i2;
        } else {
            int i3 = this.f56014h;
            if (i3 == 2) {
                return i3;
            }
            return 0;
        }
    }

    public final Layout.Alignment b() {
        int i2 = this.f56010d;
        if (i2 == 0) {
            int i3 = this.f56011e;
            if (i3 == 3 || i3 == 0) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i2 == 2) {
            int i4 = this.f56011e;
            if (i4 == 3 || i4 == 0) {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        } else if (i2 == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        } else {
            return Layout.Alignment.ALIGN_NORMAL;
        }
    }

    public int hashCode() {
        int i2;
        int hashCode;
        int i3 = ((this.f56007a * 31) + this.f56008b) * 31;
        Integer num = this.f56009c;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -16777216;
        }
        int floatToIntBits = (((((((((((((((((((((((i3 + i2) * 31) + this.f56010d) * 31) + this.f56012f) * 31) + this.f56013g) * 31) + this.f56015i) * 31) + this.f56016j) * 31) + Float.floatToIntBits(this.f56017k)) * 31) + Float.floatToIntBits(this.f56018l)) * 31) + Float.floatToIntBits(this.f56019m)) * 31) + Float.floatToIntBits(this.n)) * 31) + (this.o ? 1 : 0)) * 31) + (this.p ? 1 : 0)) * 31;
        String str = this.q;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (floatToIntBits + hashCode) * 31;
        c cVar = this.r;
        if (cVar != null) {
            i4 = cVar.hashCode();
        }
        return ((((i5 + i4) * 31) + this.s) * 31) + this.f56011e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f56007a == kVar.f56007a && this.f56008b == kVar.f56008b) {
            Integer num = kVar.f56009c;
            Integer num2 = this.f56009c;
            if (num2 == null ? num == null : !(num == null || !num2.equals(num))) {
                if (this.f56010d == kVar.f56010d && this.f56012f == kVar.f56012f && this.f56013g == kVar.f56013g && this.f56014h == kVar.f56014h && this.f56015i == kVar.f56015i && this.f56016j == kVar.f56016j && this.f56017k == kVar.f56017k && this.f56018l == kVar.f56018l && this.f56019m == kVar.f56019m && this.n == kVar.n && this.o == kVar.o && this.p == kVar.p && TextUtils.equals(this.q, kVar.q) && this.r == kVar.r && this.s == kVar.s && this.f56011e == kVar.f56011e) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
