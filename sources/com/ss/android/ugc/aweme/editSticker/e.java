package com.ss.android.ugc.aweme.editSticker;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f88137a;

    /* renamed from: b  reason: collision with root package name */
    public final f f88138b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.editSticker.a.e f88139c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f88140d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f88141e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f88142f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f88143g;

    /* renamed from: h  reason: collision with root package name */
    public final List<String> f88144h;

    static {
        Covode.recordClassIndex(55402);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f88137a, eVar.f88137a) && l.a(this.f88138b, eVar.f88138b) && l.a(this.f88139c, eVar.f88139c) && this.f88140d == eVar.f88140d && this.f88141e == eVar.f88141e && this.f88142f == eVar.f88142f && this.f88143g == eVar.f88143g && l.a(this.f88144h, eVar.f88144h);
    }

    public final int hashCode() {
        String str = this.f88137a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        f fVar = this.f88138b;
        int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        com.ss.android.ugc.aweme.editSticker.a.e eVar = this.f88139c;
        int hashCode3 = (hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        boolean z = this.f88140d;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode3 + i4) * 31;
        boolean z2 = this.f88141e;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        boolean z3 = this.f88142f;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (i11 + i12) * 31;
        if (!this.f88143g) {
            i3 = 0;
        }
        int i16 = (i15 + i3) * 31;
        List<String> list = this.f88144h;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i16 + i2;
    }

    public final String toString() {
        return "EditTextStickerConfig(fontPanel=" + this.f88137a + ", funcEnable=" + this.f88138b + ", textBubbleViewFactory=" + this.f88139c + ", optTextStickerMaxScaleSize=" + this.f88140d + ", enableQaSticker=" + this.f88141e + ", isShoutout=" + this.f88142f + ", allowQuestion=" + this.f88143g + ", checkTextIsQuestionRegex=" + this.f88144h + ")";
    }

    public e(String str, f fVar, com.ss.android.ugc.aweme.editSticker.a.e eVar, boolean z, boolean z2, boolean z3, boolean z4, List<String> list) {
        l.d(str, "");
        l.d(fVar, "");
        this.f88137a = str;
        this.f88138b = fVar;
        this.f88139c = eVar;
        this.f88140d = z;
        this.f88141e = z2;
        this.f88142f = z3;
        this.f88143g = z4;
        this.f88144h = list;
    }
}
