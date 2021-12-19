package com.ss.android.ugc.aweme.discover.d.a;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.adapter.z;
import com.ss.android.ugc.aweme.discover.ui.al;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class a extends com.ss.android.ugc.aweme.common.a.b<List<? extends Object>> {

    /* renamed from: b  reason: collision with root package name */
    public static final C1889a f80929b = new C1889a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public al.b f80930a;

    public enum b {
        TYPE_NULL,
        TYPE_NONE,
        TYPE_CLEAR_ALL;

        static {
            Covode.recordClassIndex(50311);
        }
    }

    static {
        Covode.recordClassIndex(50309);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.d.a.a$a  reason: collision with other inner class name */
    public static final class C1889a {
        static {
            Covode.recordClassIndex(50310);
        }

        private C1889a() {
        }

        public /* synthetic */ C1889a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.b
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        z zVar = new z(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.avq, viewGroup, false), this.f80930a);
        l.b(zVar, "");
        return zVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.ss.android.ugc.aweme.common.a.b
    public final /* synthetic */ boolean a(List<? extends Object> list, int i2) {
        List<? extends Object> list2 = list;
        l.d(list2, "");
        return list2.get(i2) instanceof b;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, androidx.recyclerview.widget.RecyclerView$ViewHolder, java.util.List] */
    @Override // com.ss.android.ugc.aweme.common.a.b
    public final /* synthetic */ void a(List<? extends Object> list, int i2, RecyclerView.ViewHolder viewHolder, List list2) {
        List<? extends Object> list3 = list;
        l.d(list3, "");
        l.d(viewHolder, "");
        l.d(list2, "");
        Object obj = list3.get(i2);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.delegate.intermedaite.SearchHistoryAdditionDelegate.HistoryAddition");
        b bVar = (b) obj;
        z zVar = (z) viewHolder;
        zVar.f80687b = bVar;
        if (z.AnonymousClass2.f80691a[bVar.ordinal()] != 1) {
            zVar.itemView.setVisibility(8);
        } else {
            zVar.itemView.setVisibility(0);
        }
    }
}
