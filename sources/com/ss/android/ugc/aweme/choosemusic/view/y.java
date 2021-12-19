package com.ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.a.i;
import com.ss.android.ugc.aweme.choosemusic.d.a;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.R;

public final class y extends m<MusicCollectionItem> {
    static {
        Covode.recordClassIndex(43664);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.view.m
    public final f d() {
        i iVar = new i();
        iVar.f70304a = new z(this);
        return iVar;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(MusicCollectionItem musicCollectionItem) {
        if (this.f70846g != null) {
            this.f70846g.b(musicCollectionItem);
        }
    }

    public y(Context context, View view, a aVar, h.a aVar2, int i2) {
        super(context, view, aVar, R.string.dhm, aVar2, null, i2);
    }
}
