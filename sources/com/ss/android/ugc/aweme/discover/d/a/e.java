package com.ss.android.ugc.aweme.discover.d.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.a.b;
import com.ss.android.ugc.aweme.discover.adapter.viewholder.i;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.ui.al;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class e extends b<List<? extends Object>> {

    /* renamed from: a  reason: collision with root package name */
    public al.d f80937a;

    /* renamed from: b  reason: collision with root package name */
    public SearchIntermediateViewModel f80938b;

    /* renamed from: c  reason: collision with root package name */
    public Fragment f80939c;

    static {
        Covode.recordClassIndex(50317);
    }

    @Override // com.ss.android.ugc.aweme.common.a.b
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        al.d dVar = this.f80937a;
        SearchIntermediateViewModel searchIntermediateViewModel = this.f80938b;
        Fragment fragment = this.f80939c;
        l.d(viewGroup, "");
        View a2 = a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aw1, viewGroup, false);
        l.b(a2, "");
        return new i(a2, dVar, searchIntermediateViewModel, fragment);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.ss.android.ugc.aweme.common.a.b
    public final /* synthetic */ boolean a(List<? extends Object> list, int i2) {
        List<? extends Object> list2 = list;
        l.d(list2, "");
        Object obj = list2.get(i2);
        if (!(obj instanceof TypeWords)) {
            return false;
        }
        TypeWords typeWords = (TypeWords) obj;
        if (typeWords.words != null) {
            List<Word> list3 = typeWords.words;
            if (list3 == null) {
                l.b();
            }
            if (list3.size() == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, androidx.recyclerview.widget.RecyclerView$ViewHolder, java.util.List] */
    @Override // com.ss.android.ugc.aweme.common.a.b
    public final /* synthetic */ void a(List<? extends Object> list, int i2, RecyclerView.ViewHolder viewHolder, List list2) {
        List<? extends Object> list3 = list;
        l.d(list3, "");
        l.d(viewHolder, "");
        l.d(list2, "");
        Object obj = list3.get(i2);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.suggest.TypeWords");
        ((i) viewHolder).a((TypeWords) obj);
    }
}
