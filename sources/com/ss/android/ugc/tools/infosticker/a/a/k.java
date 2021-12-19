package com.ss.android.ugc.tools.infosticker.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import h.f.b.l;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final ProviderEffect f149369a;

    /* renamed from: b  reason: collision with root package name */
    public final m f149370b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f149371c;

    /* renamed from: d  reason: collision with root package name */
    public final Exception f149372d;

    static {
        Covode.recordClassIndex(98363);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return l.a(this.f149369a, kVar.f149369a) && l.a(this.f149370b, kVar.f149370b) && l.a(this.f149371c, kVar.f149371c) && l.a(this.f149372d, kVar.f149372d);
    }

    public final int hashCode() {
        ProviderEffect providerEffect = this.f149369a;
        int i2 = 0;
        int hashCode = (providerEffect != null ? providerEffect.hashCode() : 0) * 31;
        m mVar = this.f149370b;
        int hashCode2 = (hashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        Integer num = this.f149371c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Exception exc = this.f149372d;
        if (exc != null) {
            i2 = exc.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "InfoStickerProviderDownloadEvent(sticker=" + this.f149369a + ", info=" + this.f149370b + ", progress=" + this.f149371c + ", exception=" + this.f149372d + ")";
    }

    public /* synthetic */ k(ProviderEffect providerEffect, m mVar) {
        this(providerEffect, mVar, null, null);
    }

    public k(ProviderEffect providerEffect, m mVar, Integer num, Exception exc) {
        l.d(providerEffect, "");
        l.d(mVar, "");
        this.f149369a = providerEffect;
        this.f149370b = mVar;
        this.f149371c = num;
        this.f149372d = exc;
    }
}
