package com.ss.android.ugc.gamora.editor.toolbar;

import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f147017a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f147018b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f147019c;

    static {
        Covode.recordClassIndex(96839);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f147017a, aVar.f147017a) && this.f147018b == aVar.f147018b && this.f147019c == aVar.f147019c;
    }

    public final int hashCode() {
        Drawable drawable = this.f147017a;
        int hashCode = (drawable != null ? drawable.hashCode() : 0) * 31;
        boolean z = this.f147018b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        if (!this.f147019c) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        return "AutoEnhanceStatus(drawable=" + this.f147017a + ", on=" + this.f147018b + ", showToast=" + this.f147019c + ")";
    }

    public a(Drawable drawable, boolean z, boolean z2) {
        l.d(drawable, "");
        this.f147017a = drawable;
        this.f147018b = z;
        this.f147019c = z2;
    }
}
