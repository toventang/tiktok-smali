package com.ss.android.ugc.aweme.choosemusic.viewholder.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.viewholder.i;
import com.ss.android.ugc.aweme.common.a.b;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class a extends b<List<? extends MusicSearchHistory>> {
    static {
        Covode.recordClassIndex(43670);
    }

    @Override // com.ss.android.ugc.aweme.common.a.b
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9r, viewGroup, false);
        l.b(a2, "");
        return new i(a2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.ss.android.ugc.aweme.common.a.b
    public final /* synthetic */ boolean a(List<? extends MusicSearchHistory> list, int i2) {
        List<? extends MusicSearchHistory> list2 = list;
        l.d(list2, "");
        if (((MusicSearchHistory) list2.get(i2)).type == Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, androidx.recyclerview.widget.RecyclerView$ViewHolder, java.util.List] */
    @Override // com.ss.android.ugc.aweme.common.a.b
    public final /* synthetic */ void a(List<? extends MusicSearchHistory> list, int i2, RecyclerView.ViewHolder viewHolder, List list2) {
        List<? extends MusicSearchHistory> list3 = list;
        l.d(list3, "");
        l.d(viewHolder, "");
        l.d(list2, "");
        l.d(list3.get(i2), "");
        ((i) viewHolder).f70905a.setOnClickListener(i.a.f70906a);
    }
}
