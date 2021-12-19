package com.ss.android.ugc.tools.infosticker.a.b.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.b.a.d;
import com.ss.android.ugc.tools.h.a.j;
import com.ss.android.ugc.tools.h.b.b.o;
import com.ss.android.ugc.tools.h.b.b.r;
import com.ss.android.ugc.tools.infosticker.a.b.h;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.ss.ugc.effectplatform.model.net.InfoStickerListModel;
import h.f.a.a;
import h.f.b.l;

public final class g implements h {

    /* renamed from: a  reason: collision with root package name */
    private final a<d> f149476a;

    /* renamed from: b  reason: collision with root package name */
    private final a<String> f149477b;

    /* renamed from: c  reason: collision with root package name */
    private final int f149478c;

    /* renamed from: d  reason: collision with root package name */
    private final int f149479d;

    static {
        Covode.recordClassIndex(98414);
    }

    @Override // com.ss.android.ugc.tools.infosticker.a.b.h
    public final j<InfoStickerEffect, InfoStickerListModel> a(int i2, String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return new r(this.f149476a, i2, str, str2, this.f149478c);
    }

    @Override // com.ss.android.ugc.tools.infosticker.a.b.h
    public final j<InfoStickerEffect, InfoStickerListModel> a(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return new o(this.f149476a, str, str2, str3, this.f149479d);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public g(a<? extends d> aVar, a<String> aVar2, int i2, int i3) {
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f149476a = aVar;
        this.f149477b = aVar2;
        this.f149478c = i2;
        this.f149479d = i3;
    }
}
