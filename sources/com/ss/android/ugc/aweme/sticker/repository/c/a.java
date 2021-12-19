package com.ss.android.ugc.aweme.sticker.repository.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f135475a;

    /* renamed from: b  reason: collision with root package name */
    public final int f135476b;

    /* renamed from: c  reason: collision with root package name */
    public final int f135477c;

    /* renamed from: d  reason: collision with root package name */
    public final int f135478d;

    /* renamed from: e  reason: collision with root package name */
    public final String f135479e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f135480f;

    static {
        Covode.recordClassIndex(88543);
    }

    private a(String str, String str2, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        this.f135475a = str;
        this.f135476b = 0;
        this.f135477c = 0;
        this.f135478d = 0;
        this.f135479e = str2;
        this.f135480f = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, String str2, boolean z, int i2) {
        this(str, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? false : z);
    }
}
