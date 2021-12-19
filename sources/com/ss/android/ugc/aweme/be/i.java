package com.ss.android.ugc.aweme.be;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.a;
import com.bytedance.tux.table.cell.b;
import h.f.b.l;

public class i extends a {

    /* renamed from: c  reason: collision with root package name */
    private final String f68610c;

    /* renamed from: d  reason: collision with root package name */
    private final b f68611d;

    /* renamed from: e  reason: collision with root package name */
    private final a f68612e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f68613f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f68614g;

    /* renamed from: h  reason: collision with root package name */
    private final String f68615h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f68616i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f68617j;

    /* renamed from: k  reason: collision with root package name */
    private final View.OnClickListener f68618k;

    /* renamed from: l  reason: collision with root package name */
    private final View.OnClickListener f68619l;

    /* renamed from: m  reason: collision with root package name */
    private final Object f68620m;

    static {
        Covode.recordClassIndex(42217);
    }

    @Override // com.ss.android.ugc.aweme.be.a
    public boolean a() {
        return this.f68614g;
    }

    @Override // com.ss.android.ugc.aweme.be.a
    public boolean b() {
        return this.f68613f;
    }

    @Override // com.ss.android.ugc.aweme.be.a
    public Object c() {
        return this.f68620m;
    }

    public String d() {
        return this.f68610c;
    }

    public b e() {
        return this.f68611d;
    }

    public a f() {
        return this.f68612e;
    }

    public String g() {
        return this.f68615h;
    }

    public boolean h() {
        return this.f68616i;
    }

    public boolean i() {
        return this.f68617j;
    }

    public View.OnClickListener j() {
        return this.f68619l;
    }

    public boolean equals(Object obj) {
        String str = this.f68539b;
        String str2 = null;
        if (!(obj instanceof i)) {
            obj = null;
        }
        a aVar = (a) obj;
        if (aVar != null) {
            str2 = aVar.f68539b;
        }
        return l.a((Object) str, (Object) str2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private i(String str, b bVar, a aVar, boolean z, boolean z2, String str2, boolean z3, boolean z4, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        super(z2, z, null, null, 8);
        l.d(str, "");
        l.d(bVar, "");
        this.f68610c = str;
        this.f68611d = bVar;
        this.f68612e = aVar;
        this.f68613f = z;
        this.f68614g = z2;
        this.f68615h = str2;
        this.f68616i = z3;
        this.f68617j = z4;
        this.f68618k = onClickListener;
        this.f68619l = onClickListener2;
        this.f68620m = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, b bVar, a aVar, boolean z, boolean z2, String str2, boolean z3, boolean z4, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, int i2) {
        this(str, (i2 & 2) != 0 ? b.NORMAL : bVar, (i2 & 4) != 0 ? null : aVar, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? true : z3, (i2 & 128) != 0 ? false : z4, (i2 & 256) != 0 ? null : onClickListener, (i2 & 512) == 0 ? onClickListener2 : null);
    }
}
