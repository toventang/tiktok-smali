package com.ss.android.ugc.aweme.sharer;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class n extends h {

    /* renamed from: b  reason: collision with root package name */
    public final Uri f124583b;

    /* renamed from: c  reason: collision with root package name */
    public final String f124584c;

    /* renamed from: d  reason: collision with root package name */
    public final String f124585d;

    /* renamed from: e  reason: collision with root package name */
    public final String f124586e;

    /* renamed from: f  reason: collision with root package name */
    public final String f124587f;

    /* renamed from: g  reason: collision with root package name */
    public final String f124588g;

    static {
        Covode.recordClassIndex(81873);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private n(Uri uri, String str, String str2, String str3, String str4) {
        super((byte) 0);
        l.d(uri, "");
        this.f124583b = uri;
        this.f124584c = str;
        this.f124585d = str2;
        this.f124586e = null;
        this.f124587f = str3;
        this.f124588g = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Uri uri, String str, String str2, String str3, String str4, int i2) {
        this(uri, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) == 0 ? str4 : null);
    }
}
