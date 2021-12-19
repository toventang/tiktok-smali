package com.ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.a.b;
import com.ss.android.ugc.aweme.choosemusic.b.c;
import com.ss.android.ugc.aweme.choosemusic.d.a;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.music.b.k;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;

public abstract class l extends m<MusicModel> {
    static {
        Covode.recordClassIndex(43648);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.view.m
    public void e() {
        super.e();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.view.m
    public final f d() {
        b bVar = new b(this.f70847h);
        bVar.f70288i = this.f70848i;
        return bVar;
    }

    public final void a(com.ss.android.ugc.aweme.choosemusic.b bVar) {
        if (this.f70845f instanceof b) {
            ((b) this.f70845f).f70284e = bVar;
        }
    }

    public final void a(com.ss.android.ugc.aweme.choosemusic.d.b bVar) {
        if (this.f70845f instanceof b) {
            ((b) this.f70845f).f70280a = bVar;
        }
    }

    public final void a(boolean z) {
        if (this.f70845f instanceof b) {
            ((b) this.f70845f).f70287h = z;
        }
    }

    public l(Context context, View view, a aVar, h.a aVar2, k<c> kVar, int i2) {
        super(context, view, aVar, R.string.dh_, aVar2, kVar, i2);
        this.f70840a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) this.f70841b.getLayoutParams()).topMargin = (int) n.b(this.f70841b.getContext(), 10.0f);
        this.f70841b.setOverScrollMode(2);
    }
}
