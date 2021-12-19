package com.ss.android.ugc.tools.infosticker.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Effect f149357a;

    /* renamed from: b  reason: collision with root package name */
    public final q f149358b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f149359c;

    /* renamed from: d  reason: collision with root package name */
    public final Exception f149360d;

    static {
        Covode.recordClassIndex(98360);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f149357a, hVar.f149357a) && l.a(this.f149358b, hVar.f149358b) && l.a(this.f149359c, hVar.f149359c) && l.a(this.f149360d, hVar.f149360d);
    }

    public final int hashCode() {
        Effect effect = this.f149357a;
        int i2 = 0;
        int hashCode = (effect != null ? effect.hashCode() : 0) * 31;
        q qVar = this.f149358b;
        int hashCode2 = (hashCode + (qVar != null ? qVar.hashCode() : 0)) * 31;
        Integer num = this.f149359c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Exception exc = this.f149360d;
        if (exc != null) {
            i2 = exc.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "InfoStickerDownloadEvent(effect=" + this.f149357a + ", info=" + this.f149358b + ", progress=" + this.f149359c + ", exception=" + this.f149360d + ")";
    }

    public /* synthetic */ h(Effect effect, q qVar) {
        this(effect, qVar, null, null);
    }

    public h(Effect effect, q qVar, Integer num, Exception exc) {
        l.d(effect, "");
        l.d(qVar, "");
        this.f149357a = effect;
        this.f149358b = qVar;
        this.f149359c = num;
        this.f149360d = exc;
    }
}
