package com.ss.android.ugc.aweme.kids.choosemusic.h;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.kids.a.a.c;
import com.ss.android.ugc.aweme.kids.choosemusic.a;
import com.ss.android.ugc.aweme.kids.choosemusic.a.b;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;

public abstract class d extends e<MusicModel> {
    static {
        Covode.recordClassIndex(67683);
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.h.e
    public void e() {
        super.e();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.choosemusic.h.e
    public final f d() {
        b bVar = new b(this.f105697g);
        bVar.f105457h = this.f105698h;
        return bVar;
    }

    public final void a(a aVar) {
        if (this.f105695e instanceof b) {
            ((b) this.f105695e).f105454e = aVar;
        }
    }

    public final void a(com.ss.android.ugc.aweme.kids.choosemusic.d.b bVar) {
        if (this.f105695e instanceof b) {
            ((b) this.f105695e).f105450a = bVar;
        }
    }

    public final void a(boolean z) {
        if (this.f105695e instanceof b) {
            ((b) this.f105695e).f105456g = z;
        }
    }

    public d(Context context, View view, com.ss.android.ugc.aweme.kids.choosemusic.d.a aVar, h.a aVar2, c<com.ss.android.ugc.aweme.kids.choosemusic.b.b> cVar, int i2) {
        super(context, view, aVar, R.string.dh_, aVar2, cVar, i2);
        this.f105691a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) this.f105692b.getLayoutParams()).topMargin = (int) n.b(this.f105692b.getContext(), 10.0f);
        this.f105692b.setOverScrollMode(2);
    }
}
