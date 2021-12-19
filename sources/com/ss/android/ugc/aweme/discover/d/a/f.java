package com.ss.android.ugc.aweme.discover.d.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.a.b;
import com.ss.android.ugc.aweme.discover.model.TrendingData;
import com.ss.android.ugc.aweme.discover.ui.al;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class f extends b<List<? extends Object>> {

    /* renamed from: a  reason: collision with root package name */
    public al.e f80940a;

    static {
        Covode.recordClassIndex(50318);
    }

    @Override // com.ss.android.ugc.aweme.common.a.b
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        al.e eVar = this.f80940a;
        l.d(viewGroup, "");
        View a2 = a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.awz, viewGroup, false);
        l.b(a2, "");
        return new com.ss.android.ugc.aweme.search.middlepage.a(a2, eVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.ss.android.ugc.aweme.common.a.b
    public final /* synthetic */ boolean a(List<? extends Object> list, int i2) {
        ArrayList<com.ss.android.ugc.aweme.search.l> arrayList;
        List<? extends Object> list2 = list;
        l.d(list2, "");
        Object obj = list2.get(i2);
        if ((obj instanceof TrendingData) && (arrayList = ((TrendingData) obj).billboardInfo) != null && !arrayList.isEmpty()) {
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
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.TrendingData");
        ((com.ss.android.ugc.aweme.search.middlepage.a) viewHolder).a((TrendingData) obj);
    }
}
