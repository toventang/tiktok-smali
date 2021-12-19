package com.ss.android.ugc.tools.infosticker.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import h.f.b.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final InfoStickerEffect f149361a;

    /* renamed from: b  reason: collision with root package name */
    public final o f149362b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f149363c;

    /* renamed from: d  reason: collision with root package name */
    public final Exception f149364d;

    static {
        Covode.recordClassIndex(98361);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f149361a, iVar.f149361a) && l.a(this.f149362b, iVar.f149362b) && l.a(this.f149363c, iVar.f149363c) && l.a(this.f149364d, iVar.f149364d);
    }

    public final int hashCode() {
        InfoStickerEffect infoStickerEffect = this.f149361a;
        int i2 = 0;
        int hashCode = (infoStickerEffect != null ? infoStickerEffect.hashCode() : 0) * 31;
        o oVar = this.f149362b;
        int hashCode2 = (hashCode + (oVar != null ? oVar.hashCode() : 0)) * 31;
        Integer num = this.f149363c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Exception exc = this.f149364d;
        if (exc != null) {
            i2 = exc.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "InfoStickerEffectDownloadEvent(sticker=" + this.f149361a + ", info=" + this.f149362b + ", progress=" + this.f149363c + ", exception=" + this.f149364d + ")";
    }

    public /* synthetic */ i(InfoStickerEffect infoStickerEffect, o oVar) {
        this(infoStickerEffect, oVar, null, null);
    }

    public i(InfoStickerEffect infoStickerEffect, o oVar, Integer num, Exception exc) {
        l.d(infoStickerEffect, "");
        l.d(oVar, "");
        this.f149361a = infoStickerEffect;
        this.f149362b = oVar;
        this.f149363c = num;
        this.f149364d = exc;
    }
}
