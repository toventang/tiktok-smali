package com.ss.android.ugc.aweme.sticker.view.internal.search;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import java.util.List;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f136581a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Effect> f136582b;

    /* renamed from: c  reason: collision with root package name */
    public final String f136583c;

    static {
        Covode.recordClassIndex(89204);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f136581a == kVar.f136581a && l.a(this.f136582b, kVar.f136582b) && l.a(this.f136583c, kVar.f136583c);
    }

    public final int hashCode() {
        boolean z = this.f136581a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        List<Effect> list = this.f136582b;
        int i6 = 0;
        int hashCode = (i5 + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.f136583c;
        if (str != null) {
            i6 = str.hashCode();
        }
        return hashCode + i6;
    }

    public final String toString() {
        return "SearchStickerData(recommend=" + this.f136581a + ", effects=" + this.f136582b + ", searchId=" + this.f136583c + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect> */
    /* JADX WARN: Multi-variable type inference failed */
    public k(boolean z, List<? extends Effect> list, String str) {
        l.d(list, "");
        l.d(str, "");
        this.f136581a = z;
        this.f136582b = list;
        this.f136583c = str;
    }
}
