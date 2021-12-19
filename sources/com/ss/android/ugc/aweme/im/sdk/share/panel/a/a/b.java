package com.ss.android.ugc.aweme.im.sdk.share.panel.a.a;

import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxCheckBox;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f103398a;

    /* renamed from: b  reason: collision with root package name */
    public final TuxCheckBox f103399b;

    static {
        Covode.recordClassIndex(66261);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f103398a, bVar.f103398a) && l.a(this.f103399b, bVar.f103399b);
    }

    public final int hashCode() {
        LinearLayout linearLayout = this.f103398a;
        int i2 = 0;
        int hashCode = (linearLayout != null ? linearLayout.hashCode() : 0) * 31;
        TuxCheckBox tuxCheckBox = this.f103399b;
        if (tuxCheckBox != null) {
            i2 = tuxCheckBox.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ShareCreateGroupPayload(layout=" + this.f103398a + ", checkboxView=" + this.f103399b + ")";
    }

    public b(LinearLayout linearLayout, TuxCheckBox tuxCheckBox) {
        l.d(linearLayout, "");
        l.d(tuxCheckBox, "");
        this.f103398a = linearLayout;
        this.f103399b = tuxCheckBox;
    }
}
