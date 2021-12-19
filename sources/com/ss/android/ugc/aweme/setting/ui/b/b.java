package com.ss.android.ugc.aweme.setting.ui.b;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.be.a;
import h.f.b.l;

public final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    public final String f122844c;

    /* renamed from: d  reason: collision with root package name */
    public final int f122845d;

    /* renamed from: e  reason: collision with root package name */
    public final View.OnClickListener f122846e;

    /* renamed from: f  reason: collision with root package name */
    public final View.OnClickListener f122847f;

    /* renamed from: g  reason: collision with root package name */
    public final String f122848g;

    /* renamed from: h  reason: collision with root package name */
    public final int f122849h;

    /* renamed from: i  reason: collision with root package name */
    public final String f122850i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f122851j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f122852k;

    /* renamed from: l  reason: collision with root package name */
    private final Object f122853l;

    static {
        Covode.recordClassIndex(80643);
    }

    public b(String str, int i2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, byte b2) {
        this(str, i2, onClickListener, onClickListener2);
    }

    @Override // com.ss.android.ugc.aweme.be.a
    public final boolean a() {
        return this.f122851j;
    }

    @Override // com.ss.android.ugc.aweme.be.a
    public final boolean b() {
        return this.f122852k;
    }

    @Override // com.ss.android.ugc.aweme.be.a
    public final Object c() {
        return this.f122853l;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str = this.f122844c;
        int i7 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = ((i2 * 31) + this.f122845d) * 31;
        View.OnClickListener onClickListener = this.f122846e;
        if (onClickListener != null) {
            i3 = onClickListener.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        View.OnClickListener onClickListener2 = this.f122847f;
        if (onClickListener2 != null) {
            i4 = onClickListener2.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        String str2 = this.f122848g;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (((i10 + i5) * 31) + this.f122849h) * 31;
        String str3 = this.f122850i;
        if (str3 != null) {
            i6 = str3.hashCode();
        } else {
            i6 = 0;
        }
        int i12 = (i11 + i6) * 31;
        boolean z = this.f122851j;
        int i13 = 1;
        if (z) {
            z = true;
        }
        int i14 = z ? 1 : 0;
        int i15 = z ? 1 : 0;
        int i16 = z ? 1 : 0;
        int i17 = (i12 + i14) * 31;
        if (!this.f122852k) {
            i13 = 0;
        }
        int i18 = (i17 + i13) * 31;
        Object obj = this.f122853l;
        if (obj != null) {
            i7 = obj.hashCode();
        }
        return i18 + i7;
    }

    public final String toString() {
        return "SettingFooterItem(id=" + this.f122844c + ", backgroundColor=" + this.f122845d + ", onClickListenerOfUserInfo=" + this.f122846e + ", onClickListenerOfVersion=" + this.f122847f + ", versionText=" + this.f122848g + ", userInfoVisibility=" + this.f122849h + ", userInfoText=" + this.f122850i + ", divider=" + this.f122851j + ", visibility=" + this.f122852k + ", tag=" + this.f122853l + ")";
    }

    public final boolean equals(Object obj) {
        String str = this.f122844c;
        String str2 = null;
        if (!(obj instanceof b)) {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar != null) {
            str2 = bVar.f122844c;
        }
        return l.a((Object) str, (Object) str2);
    }

    private /* synthetic */ b(String str, int i2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        this(str, i2, onClickListener, onClickListener2, "", 4, "", false, true, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(String str, int i2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, String str2, int i3, String str3, boolean z, boolean z2, Object obj) {
        super(z, z2, obj, null, 8);
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f122844c = str;
        this.f122845d = i2;
        this.f122846e = onClickListener;
        this.f122847f = onClickListener2;
        this.f122848g = str2;
        this.f122849h = i3;
        this.f122850i = str3;
        this.f122851j = z;
        this.f122852k = z2;
        this.f122853l = obj;
    }

    public static /* synthetic */ b a(b bVar, String str, int i2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, String str2, int i3, String str3, boolean z, boolean z2, Object obj, int i4) {
        View.OnClickListener onClickListener3 = onClickListener2;
        View.OnClickListener onClickListener4 = onClickListener;
        int i5 = i2;
        String str4 = str;
        String str5 = str2;
        int i6 = i3;
        String str6 = str3;
        boolean z3 = z;
        boolean z4 = z2;
        Object obj2 = obj;
        if ((i4 & 1) != 0) {
            str4 = bVar.f122844c;
        }
        if ((i4 & 2) != 0) {
            i5 = bVar.f122845d;
        }
        if ((i4 & 4) != 0) {
            onClickListener4 = bVar.f122846e;
        }
        if ((i4 & 8) != 0) {
            onClickListener3 = bVar.f122847f;
        }
        if ((i4 & 16) != 0) {
            str5 = bVar.f122848g;
        }
        if ((i4 & 32) != 0) {
            i6 = bVar.f122849h;
        }
        if ((i4 & 64) != 0) {
            str6 = bVar.f122850i;
        }
        if ((i4 & 128) != 0) {
            z3 = bVar.f122851j;
        }
        if ((i4 & 256) != 0) {
            z4 = bVar.f122852k;
        }
        if ((i4 & 512) != 0) {
            obj2 = bVar.f122853l;
        }
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        return new b(str4, i5, onClickListener4, onClickListener3, str5, i6, str6, z3, z4, obj2);
    }
}
