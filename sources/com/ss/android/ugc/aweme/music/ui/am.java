package com.ss.android.ugc.aweme.music.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.b.n;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import java.util.List;

final /* synthetic */ class am implements n.a {

    /* renamed from: a  reason: collision with root package name */
    private final ah f111887a;

    /* renamed from: b  reason: collision with root package name */
    private final List f111888b;

    static {
        Covode.recordClassIndex(71913);
    }

    am(ah ahVar, List list) {
        this.f111887a = ahVar;
        this.f111888b = list;
    }

    @Override // com.ss.android.ugc.aweme.music.b.n.a
    public final void a(int i2) {
        ah ahVar = this.f111887a;
        List list = this.f111888b;
        if (i2 >= 0 && i2 < list.size()) {
            ExternalMusicInfo externalMusicInfo = (ExternalMusicInfo) list.get(i2);
            if (ahVar.aw != null) {
                ahVar.aw.a(ahVar.getContext(), externalMusicInfo, true);
            }
        }
    }
}
