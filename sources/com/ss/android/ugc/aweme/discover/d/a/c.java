package com.ss.android.ugc.aweme.discover.d.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.a.b;
import com.ss.android.ugc.aweme.discover.adapter.viewholder.d;
import com.ss.android.ugc.aweme.discover.model.SearchHistory;
import com.ss.android.ugc.aweme.discover.ui.al;
import com.ss.android.ugc.aweme.search.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class c extends b<List<? extends Object>> {

    /* renamed from: a  reason: collision with root package name */
    public al.b f80934a;

    static {
        Covode.recordClassIndex(50314);
    }

    @Override // com.ss.android.ugc.aweme.common.a.b
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        al.b bVar = this.f80934a;
        l.d(viewGroup, "");
        View a2 = a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.awl, viewGroup, false);
        l.b(a2, "");
        return new d(a2, bVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.ss.android.ugc.aweme.common.a.b
    public final /* synthetic */ boolean a(List<? extends Object> list, int i2) {
        List<? extends Object> list2 = list;
        l.d(list2, "");
        Object obj = list2.get(i2);
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list3 = (List) obj;
        if (list3 != null && !com.bytedance.common.utility.collection.b.a((Collection) list3) && (list3.get(0) instanceof SearchHistory)) {
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
        d dVar = (d) viewHolder;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.discover.model.SearchHistory>");
        List list4 = (List) obj;
        l.d(list4, "");
        dVar.f80651b.clear();
        dVar.f80651b.addAll(list4);
        dVar.f80652c.setVisibility(8);
        dVar.f80650a.notifyDataSetChanged();
        h.f121133a.d().a("search_transfer_history_words_show");
    }
}
