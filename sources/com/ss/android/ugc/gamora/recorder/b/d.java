package com.ss.android.ugc.gamora.recorder.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public int f147375a;

    /* renamed from: b  reason: collision with root package name */
    public final String f147376b;

    /* renamed from: c  reason: collision with root package name */
    public final String f147377c;

    /* renamed from: d  reason: collision with root package name */
    public final String f147378d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f147379e;

    /* renamed from: f  reason: collision with root package name */
    public final l f147380f;

    static {
        Covode.recordClassIndex(97119);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f147376b, dVar.f147376b) && l.a(this.f147377c, dVar.f147377c) && l.a(this.f147378d, dVar.f147378d) && this.f147379e == dVar.f147379e && l.a(this.f147380f, dVar.f147380f);
    }

    public final int hashCode() {
        String str = this.f147376b;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f147377c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f147378d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.f147379e;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode3 + i3) * 31;
        l lVar = this.f147380f;
        if (lVar != null) {
            i2 = lVar.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "BottomTabItem(text=" + this.f147376b + ", tag=" + this.f147377c + ", shootMode=" + this.f147378d + ", defaultSelected=" + this.f147379e + ", listener=" + this.f147380f + ")";
    }

    public d(String str, String str2, String str3, boolean z, l lVar) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f147376b = str;
        this.f147377c = str2;
        this.f147378d = str3;
        this.f147379e = z;
        this.f147380f = lVar;
    }
}
