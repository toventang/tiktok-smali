package com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c;
import h.f.b.l;
import java.util.ArrayList;

public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    private int f129441a = -1;

    static {
        Covode.recordClassIndex(84976);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c
    public final void a(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c
    public final void a(ArrayList<CutSameVideoImageExtraData> arrayList) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c
    public final CutSameVideoImageExtraData b() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c
    public final int a() {
        return getItemCount();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c
    public final void b(int i2) {
        int i3 = this.f129446e;
        this.f129441a = i3;
        if (i3 >= 0 && i3 < getItemCount()) {
            notifyItemChanged(this.f129441a, "previewBorder");
        }
        this.f129446e = i2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c
    public final Integer c(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        l.d(myMediaModel, "");
        this.f129441a = this.f129446e;
        this.f129446e = this.f129443b.indexOf(myMediaModel);
        int i2 = this.f129441a;
        if (i2 >= 0 && i2 < getItemCount()) {
            notifyItemChanged(this.f129441a, "previewBorder");
        }
        if (this.f129446e < 0 || this.f129446e >= getItemCount()) {
            return null;
        }
        notifyItemChanged(this.f129446e);
        return Integer.valueOf(this.f129446e);
    }
}
