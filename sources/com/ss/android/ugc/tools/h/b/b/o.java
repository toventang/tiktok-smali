package com.ss.android.ugc.tools.h.b.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.b.a.d;
import com.ss.android.ugc.tools.h.a.j;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.ss.ugc.effectplatform.model.net.InfoStickerListModel;
import f.a.ab;
import h.f.a.a;
import h.f.b.l;
import h.p;
import java.util.List;

public final class o extends d implements j<InfoStickerEffect, InfoStickerListModel> {

    /* renamed from: m  reason: collision with root package name */
    private final int f149339m;
    private final String n;
    private final String o;
    private final String p;
    private final int q;

    static {
        Covode.recordClassIndex(98343);
    }

    @Override // com.ss.android.ugc.tools.h.a.j
    public final ab<p<List<InfoStickerEffect>, InfoStickerListModel>> a() {
        return a(this.q);
    }

    @Override // com.ss.android.ugc.tools.h.a.j
    public final ab<List<InfoStickerEffect>> b() {
        return j.a.a(this);
    }

    public /* synthetic */ o(a aVar, String str, String str2, String str3, int i2) {
        this(aVar, str, str2, str3, i2, j.f149328a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private o(a<? extends d> aVar, String str, String str2, String str3, int i2, m mVar) {
        super(aVar, 2, str, str2, str3, mVar);
        l.d(aVar, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(mVar, "");
        this.f149339m = 2;
        this.n = str;
        this.o = str2;
        this.p = str3;
        this.q = i2;
    }
}
