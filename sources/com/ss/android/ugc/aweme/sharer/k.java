package com.ss.android.ugc.aweme.sharer;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class k extends m {

    /* renamed from: b  reason: collision with root package name */
    public final String f124573b;

    /* renamed from: c  reason: collision with root package name */
    public final String f124574c;

    static {
        Covode.recordClassIndex(81870);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(String str, String str2, String str3) {
        super(str, str2);
        l.d(str, "");
        this.f124573b = str;
        this.f124574c = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(String str, String str2, String str3, int i2) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3);
    }
}
