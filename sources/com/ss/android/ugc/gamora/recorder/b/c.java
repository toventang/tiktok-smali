package com.ss.android.ugc.gamora.recorder.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f147369a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f147370b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f147371c;

    /* renamed from: d  reason: collision with root package name */
    public int f147372d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f147373e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f147374f;

    static {
        Covode.recordClassIndex(97118);
    }

    public final String toString() {
        return "BottomTabIndexChangeEvent{fromTag=" + this.f147370b + ", toTag=" + this.f147371c + '}';
    }

    public c(Object obj, Object obj2, int i2, boolean z, boolean z2) {
        l.d(obj2, "");
        this.f147370b = obj;
        this.f147371c = obj2;
        this.f147372d = i2;
        this.f147373e = z;
        this.f147374f = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, int i2, boolean z, boolean z2, int i3) {
        this(obj, obj2, i2, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? true : z2);
    }
}
