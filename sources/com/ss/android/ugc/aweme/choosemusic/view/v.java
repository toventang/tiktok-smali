package com.ss.android.ugc.aweme.choosemusic.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.viewholder.j;
import com.ss.android.ugc.aweme.music.b.a;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class v implements a {

    /* renamed from: a  reason: collision with root package name */
    static final a f70872a = new v();

    static {
        Covode.recordClassIndex(43661);
    }

    private v() {
    }

    @Override // com.ss.android.ugc.aweme.music.b.a
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        return new j(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_w, viewGroup, false));
    }
}
