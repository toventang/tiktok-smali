package com.ss.android.ugc.tools.infosticker.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import h.f.b.l;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final InfoStickerEffect f149365a;

    /* renamed from: b  reason: collision with root package name */
    public final r f149366b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f149367c;

    /* renamed from: d  reason: collision with root package name */
    public final Exception f149368d;

    static {
        Covode.recordClassIndex(98362);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f149365a, jVar.f149365a) && l.a(this.f149366b, jVar.f149366b) && l.a(this.f149367c, jVar.f149367c) && l.a(this.f149368d, jVar.f149368d);
    }

    public final int hashCode() {
        InfoStickerEffect infoStickerEffect = this.f149365a;
        int i2 = 0;
        int hashCode = (infoStickerEffect != null ? infoStickerEffect.hashCode() : 0) * 31;
        r rVar = this.f149366b;
        int hashCode2 = (hashCode + (rVar != null ? rVar.hashCode() : 0)) * 31;
        Integer num = this.f149367c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Exception exc = this.f149368d;
        if (exc != null) {
            i2 = exc.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "InfoStickerNewDownloadEvent(effect=" + this.f149365a + ", info=" + this.f149366b + ", progress=" + this.f149367c + ", exception=" + this.f149368d + ")";
    }
}
