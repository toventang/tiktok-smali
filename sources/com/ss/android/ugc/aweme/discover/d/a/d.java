package com.ss.android.ugc.aweme.discover.d.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.a.b;
import com.ss.android.ugc.aweme.discover.adapter.viewholder.e;
import com.ss.android.ugc.aweme.discover.ui.al;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class d extends b<List<? extends Object>> {

    /* renamed from: a  reason: collision with root package name */
    public al.b f80935a;

    static {
        Covode.recordClassIndex(50315);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f80936a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(50316);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.b
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        al.b bVar = this.f80935a;
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.avt, viewGroup, false);
        l.b(a2, "");
        return new e(a2, bVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.ss.android.ugc.aweme.common.a.b
    public final /* synthetic */ boolean a(List<? extends Object> list, int i2) {
        List<? extends Object> list2 = list;
        l.d(list2, "");
        return list2.get(i2) instanceof a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, androidx.recyclerview.widget.RecyclerView$ViewHolder, java.util.List] */
    @Override // com.ss.android.ugc.aweme.common.a.b
    public final /* synthetic */ void a(List<? extends Object> list, int i2, RecyclerView.ViewHolder viewHolder, List list2) {
        l.d(list, "");
        l.d(viewHolder, "");
        l.d(list2, "");
    }
}
