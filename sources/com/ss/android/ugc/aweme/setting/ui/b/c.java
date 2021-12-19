package com.ss.android.ugc.aweme.setting.ui.b;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.be.a;
import h.f.b.l;

public final class c extends a {

    /* renamed from: c  reason: collision with root package name */
    public final String f122854c;

    /* renamed from: d  reason: collision with root package name */
    public final View.OnClickListener f122855d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f122856e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f122857f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f122858g;

    static {
        Covode.recordClassIndex(80644);
    }

    public c(String str, byte b2) {
        this(str);
    }

    @Override // com.ss.android.ugc.aweme.be.a
    public final boolean a() {
        return this.f122857f;
    }

    @Override // com.ss.android.ugc.aweme.be.a
    public final boolean b() {
        return this.f122856e;
    }

    @Override // com.ss.android.ugc.aweme.be.a
    public final Object c() {
        return this.f122858g;
    }

    public final int hashCode() {
        int i2;
        int i3;
        String str = this.f122854c;
        int i4 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = i2 * 31;
        boolean z = this.f122856e;
        int i6 = 1;
        if (z) {
            z = true;
        }
        int i7 = z ? 1 : 0;
        int i8 = z ? 1 : 0;
        int i9 = z ? 1 : 0;
        int i10 = (i5 + i7) * 31;
        View.OnClickListener onClickListener = this.f122855d;
        if (onClickListener != null) {
            i3 = onClickListener.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 31;
        if (!this.f122857f) {
            i6 = 0;
        }
        int i12 = (i11 + i6) * 31;
        Object obj = this.f122858g;
        if (obj != null) {
            i4 = obj.hashCode();
        }
        return i12 + i4;
    }

    public final String toString() {
        return "SettingUnLoginItem(text=" + this.f122854c + ", visibility=" + this.f122856e + ", onClickListener=" + this.f122855d + ", divider=" + this.f122857f + ", tag=" + this.f122858g + ")";
    }

    private /* synthetic */ c(String str) {
        this(str, false, null, false, null);
    }

    public final boolean equals(Object obj) {
        String str = this.f122854c;
        String str2 = null;
        if (!(obj instanceof c)) {
            obj = null;
        }
        c cVar = (c) obj;
        if (cVar != null) {
            str2 = cVar.f122854c;
        }
        return l.a((Object) str, (Object) str2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(String str, boolean z, View.OnClickListener onClickListener, boolean z2, Object obj) {
        super(z2, z, obj, null, 8);
        l.d(str, "");
        this.f122854c = str;
        this.f122856e = z;
        this.f122855d = onClickListener;
        this.f122857f = z2;
        this.f122858g = obj;
    }

    public static /* synthetic */ c a(c cVar, String str, boolean z, View.OnClickListener onClickListener, boolean z2, Object obj, int i2) {
        Object obj2 = obj;
        String str2 = str;
        boolean z3 = z;
        View.OnClickListener onClickListener2 = onClickListener;
        boolean z4 = z2;
        if ((i2 & 1) != 0) {
            str2 = cVar.f122854c;
        }
        if ((i2 & 2) != 0) {
            z3 = cVar.f122856e;
        }
        if ((i2 & 4) != 0) {
            onClickListener2 = cVar.f122855d;
        }
        if ((i2 & 8) != 0) {
            z4 = cVar.f122857f;
        }
        if ((i2 & 16) != 0) {
            obj2 = cVar.f122858g;
        }
        l.d(str2, "");
        return new c(str2, z3, onClickListener2, z4, obj2);
    }
}
