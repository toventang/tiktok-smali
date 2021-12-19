package com.ss.android.ugc.aweme.discover.adapter.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.ui.al;
import com.zhiliaoapp.musically.R;

public final class l extends f<Word> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f80678a;

    /* renamed from: b  reason: collision with root package name */
    public final al.d f80679b;

    /* renamed from: c  reason: collision with root package name */
    public final String f80680c;

    /* renamed from: d  reason: collision with root package name */
    public final SearchIntermediateViewModel f80681d;

    /* renamed from: e  reason: collision with root package name */
    public final Fragment f80682e;

    static {
        Covode.recordClassIndex(50180);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        h.f.b.l.d(viewHolder, "");
        Word word = (Word) e().get(i2);
        if (viewHolder instanceof h) {
            h hVar = (h) viewHolder;
            hVar.f80665h = this.f80678a;
            hVar.a(word, this.f80680c);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        h.f.b.l.d(viewGroup, "");
        al.d dVar = this.f80679b;
        SearchIntermediateViewModel searchIntermediateViewModel = this.f80681d;
        Fragment fragment = this.f80682e;
        h.f.b.l.d(viewGroup, "");
        View a2 = a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aw7, viewGroup, false);
        h.f.b.l.b(a2, "");
        return new h(a2, dVar, searchIntermediateViewModel, fragment);
    }

    public l(al.d dVar, String str, SearchIntermediateViewModel searchIntermediateViewModel, Fragment fragment) {
        h.f.b.l.d(str, "");
        this.f80679b = dVar;
        this.f80680c = str;
        this.f80681d = searchIntermediateViewModel;
        this.f80682e = fragment;
    }
}
