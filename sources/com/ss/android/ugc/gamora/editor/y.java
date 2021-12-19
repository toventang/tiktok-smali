package com.ss.android.ugc.gamora.editor;

import com.bytedance.covode.number.Covode;
import h.a.n;
import java.util.List;

public final class y {

    /* renamed from: d  reason: collision with root package name */
    public static final List<Integer> f147354d = n.b(1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 13, 15);

    /* renamed from: e  reason: collision with root package name */
    public static final a f147355e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f147356a;

    /* renamed from: b  reason: collision with root package name */
    public final int f147357b;

    /* renamed from: c  reason: collision with root package name */
    public final int f147358c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f147356a == yVar.f147356a && this.f147357b == yVar.f147357b && this.f147358c == yVar.f147358c;
    }

    public final int hashCode() {
        return (((this.f147356a * 31) + this.f147357b) * 31) + this.f147358c;
    }

    public final String toString() {
        return "EditToolbarItemModel(type=" + this.f147356a + ", iconRes=" + this.f147357b + ", textRes=" + this.f147358c + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(97106);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(97105);
    }

    public y(int i2, int i3, int i4) {
        this.f147356a = i2;
        this.f147357b = i3;
        this.f147358c = i4;
    }
}
