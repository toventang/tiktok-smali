package com.ss.android.ugc.aweme.sharer;

import android.net.Uri;
import com.bytedance.covode.number.Covode;

public final class l extends h {

    /* renamed from: b  reason: collision with root package name */
    public final Uri f124575b;

    /* renamed from: c  reason: collision with root package name */
    public final String f124576c;

    /* renamed from: d  reason: collision with root package name */
    public final String f124577d;

    /* renamed from: e  reason: collision with root package name */
    public final String f124578e;

    /* renamed from: f  reason: collision with root package name */
    public final String f124579f;

    /* renamed from: g  reason: collision with root package name */
    public final String f124580g;

    static {
        Covode.recordClassIndex(81871);
    }

    public l(Uri uri, String str) {
        this(uri, str, null, 60);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private l(Uri uri, String str, String str2) {
        super((byte) 0);
        h.f.b.l.d(uri, "");
        h.f.b.l.d(str, "");
        this.f124575b = uri;
        this.f124576c = str;
        this.f124577d = null;
        this.f124578e = null;
        this.f124579f = null;
        this.f124580g = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Uri uri, String str, String str2, int i2) {
        this(uri, str, (i2 & 32) != 0 ? null : str2);
    }
}
