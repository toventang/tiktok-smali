package com.ss.android.ugc.aweme.commercialize.b.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.b.a.d;
import com.ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.Map;

public final class b extends com.ss.android.ugc.aweme.common.a.b<List<? extends WikipediaInfo>> {

    /* renamed from: a  reason: collision with root package name */
    public final h.f.a.b<WikipediaInfo, z> f73704a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f73705b;

    static {
        Covode.recordClassIndex(45347);
    }

    @Override // com.ss.android.ugc.aweme.common.a.b
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ae8, viewGroup, false);
        l.b(a2, "");
        return new d(a2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.ss.android.ugc.aweme.common.a.b
    public final /* synthetic */ boolean a(List<? extends WikipediaInfo> list, int i2) {
        l.d(list, "");
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.feed.model.WikipediaInfo, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Map<String, String> map, h.f.a.b<? super WikipediaInfo, z> bVar) {
        l.d(map, "");
        l.d(bVar, "");
        this.f73705b = map;
        this.f73704a = bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, androidx.recyclerview.widget.RecyclerView$ViewHolder, java.util.List] */
    @Override // com.ss.android.ugc.aweme.common.a.b
    public final /* synthetic */ void a(List<? extends WikipediaInfo> list, int i2, RecyclerView.ViewHolder viewHolder, List list2) {
        List<? extends WikipediaInfo> list3 = list;
        l.d(list3, "");
        l.d(viewHolder, "");
        l.d(list2, "");
        if (viewHolder instanceof d) {
            d dVar = (d) viewHolder;
            WikipediaInfo wikipediaInfo = (WikipediaInfo) list3.get(i2);
            Map<String, String> map = this.f73705b;
            h.f.a.b<WikipediaInfo, z> bVar = this.f73704a;
            l.d(wikipediaInfo, "");
            l.d(map, "");
            l.d(bVar, "");
            dVar.itemView.setOnClickListener(new d.a(dVar, bVar, wikipediaInfo, map));
            dVar.f73708a.setText(wikipediaInfo.getKeyword());
        }
    }
}
