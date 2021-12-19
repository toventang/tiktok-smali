package com.ss.android.ugc.aweme.shortvideo.edit.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: g  reason: collision with root package name */
    public static final a f126942g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f126943a;

    /* renamed from: b  reason: collision with root package name */
    public final int f126944b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f126945c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f126946d;

    /* renamed from: e  reason: collision with root package name */
    public final String f126947e;

    /* renamed from: f  reason: collision with root package name */
    public final e f126948f;

    static {
        Covode.recordClassIndex(83281);
    }

    public b(boolean z, int i2, boolean z2, String str) {
        this(z, i2, true, z2, str, null, 32);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83282);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private b(boolean z, int i2, boolean z2, boolean z3, String str, e eVar) {
        l.d(str, "");
        l.d(eVar, "");
        this.f126943a = z;
        this.f126944b = i2;
        this.f126945c = z2;
        this.f126946d = z3;
        this.f126947e = str;
        this.f126948f = eVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(boolean z, int i2, boolean z2, boolean z3, String str, e eVar, int i3) {
        this(z, i2, (i3 & 4) != 0 ? true : z2, (i3 & 8) != 0 ? false : z3, (i3 & 16) != 0 ? "" : str, (i3 & 32) != 0 ? new e() : eVar);
    }
}
