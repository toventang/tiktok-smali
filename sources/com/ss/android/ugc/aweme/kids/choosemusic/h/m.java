package com.ss.android.ugc.aweme.kids.choosemusic.h;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.kids.a.a.c;
import com.ss.android.ugc.aweme.kids.choosemusic.a;
import com.ss.android.ugc.aweme.kids.choosemusic.a.b;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;

public final class m extends e<MusicModel> {

    /* renamed from: j  reason: collision with root package name */
    boolean f105721j;

    static {
        Covode.recordClassIndex(67694);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.choosemusic.h.e
    public final f d() {
        b bVar = new b(this.f105697g, (byte) 0);
        bVar.f105455f = this.f105721j;
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
        this.f105721j = z;
        if (this.f105695e instanceof b) {
            ((b) this.f105695e).f105455f = this.f105721j;
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.h.e, com.ss.android.ugc.aweme.arch.c
    public final void a(List<MusicModel> list, boolean z) {
        super.a(list, z);
    }

    public m(Context context, View view, com.ss.android.ugc.aweme.kids.choosemusic.d.a aVar, h.a aVar2, c<com.ss.android.ugc.aweme.kids.choosemusic.b.b> cVar, int i2) {
        super(context, view, aVar, aVar2, cVar, i2);
    }

    public m(Context context, View view, com.ss.android.ugc.aweme.kids.choosemusic.d.a aVar, int i2, h.a aVar2, c<com.ss.android.ugc.aweme.kids.choosemusic.b.b> cVar, int i3) {
        super(context, view, aVar, i2, aVar2, cVar, i3);
    }
}
