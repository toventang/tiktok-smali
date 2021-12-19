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

public final class r extends g implements j<InfoStickerEffect, InfoStickerListModel> {

    /* renamed from: f  reason: collision with root package name */
    private final int f149342f;

    /* renamed from: g  reason: collision with root package name */
    private final String f149343g;

    /* renamed from: h  reason: collision with root package name */
    private final String f149344h;

    /* renamed from: m  reason: collision with root package name */
    private final int f149345m;

    static {
        Covode.recordClassIndex(98346);
    }

    @Override // com.ss.android.ugc.tools.h.a.j
    public final ab<p<List<InfoStickerEffect>, InfoStickerListModel>> a() {
        return a(this.f149345m);
    }

    @Override // com.ss.android.ugc.tools.h.a.j
    public final ab<List<InfoStickerEffect>> b() {
        return j.a.a(this);
    }

    public /* synthetic */ r(a aVar, int i2, String str, String str2, int i3) {
        this(aVar, i2, str, str2, i3, j.f149328a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private r(a<? extends d> aVar, int i2, String str, String str2, int i3, m mVar) {
        super(aVar, i2, str, str2, mVar);
        l.d(aVar, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(mVar, "");
        this.f149342f = i2;
        this.f149343g = str;
        this.f149344h = str2;
        this.f149345m = i3;
    }
}
