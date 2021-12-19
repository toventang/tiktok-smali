package com.ss.android.ugc.aweme.social.widget.card.rec;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.social.widget.card.a.i;
import com.ss.android.ugc.aweme.social.widget.card.e;
import com.ss.android.ugc.aweme.social.widget.card.rec.a;
import com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.bz;

public final class f extends t<com.bytedance.ies.powerlist.b.a, RecyclerView.ViewHolder> implements h {

    /* renamed from: d  reason: collision with root package name */
    public static final a f133868d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.social.widget.a f133869b;

    /* renamed from: c  reason: collision with root package name */
    public final i f133870c;

    /* renamed from: e  reason: collision with root package name */
    private final h f133871e = h.i.a((h.f.a.a) new d(this));

    /* renamed from: f  reason: collision with root package name */
    private final Map<Integer, Class<? extends PowerCell<?>>> f133872f = new LinkedHashMap();

    /* renamed from: g  reason: collision with root package name */
    private View f133873g;

    static {
        Covode.recordClassIndex(87578);
    }

    private final i a() {
        return (i) this.f133871e.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87579);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d extends m implements h.f.a.a<i> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(87582);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ i invoke() {
            return new i(this.this$0.f133869b, this.this$0.f133870c, this.this$0);
        }
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.rec.h
    public final void a(View view) {
        l.d(view, "");
        this.f133873g = view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final long getItemId(int i2) {
        return (long) a(i2).hashCode();
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.rec.h
    public final void a(Map<Integer, Class<? extends PowerCell<?>>> map) {
        l.d(map, "");
        this.f133872f.putAll(map);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof e) {
            ((e) viewHolder).f133867a.l();
        }
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.rec.h
    public final void b(List<? extends com.bytedance.ies.powerlist.b.a> list) {
        l.d(list, "");
        com.ss.android.ugc.aweme.social.widget.card.a.h hVar = this.f133870c.f133752c;
        if (hVar != null && hVar.f133746a == com.ss.android.ugc.aweme.social.widget.card.a.a.RECTANGLE) {
            list = n.g((Collection) list);
            list.add(new com.ss.android.ugc.aweme.social.widget.card.a(-2));
        }
        a(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        com.bytedance.ies.powerlist.b.a aVar = (com.bytedance.ies.powerlist.b.a) a(i2);
        if (aVar instanceof com.ss.android.ugc.aweme.social.widget.card.permission.c) {
            com.ss.android.ugc.aweme.social.widget.card.permission.c cVar = (com.ss.android.ugc.aweme.social.widget.card.permission.c) aVar;
            return e.a(cVar.f133825a, cVar.a()).hashCode();
        } else if (aVar instanceof com.ss.android.ugc.aweme.social.widget.card.rec.cell.a) {
            com.ss.android.ugc.aweme.social.widget.card.a.h hVar = this.f133870c.f133752c;
            if (hVar == null) {
                l.b();
            }
            return e.a(hVar).hashCode();
        } else if (aVar instanceof com.ss.android.ugc.aweme.social.widget.card.a) {
            return ((com.ss.android.ugc.aweme.social.widget.card.a) aVar).f133723a;
        } else {
            return -996;
        }
    }

    public static final class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f133874a;

        static {
            Covode.recordClassIndex(87580);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar, View view) {
            super(view);
            this.f133874a = fVar;
        }
    }

    public static final class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f133875a;

        static {
            Covode.recordClassIndex(87581);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ViewGroup viewGroup, View view) {
            super(view);
            this.f133875a = viewGroup;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(com.ss.android.ugc.aweme.social.widget.a aVar, i iVar) {
        super(new c());
        l.d(aVar, "");
        l.d(iVar, "");
        this.f133869b = aVar;
        this.f133870c = iVar;
        a().c();
        a().a().a((h.c.d<? super com.bytedance.ies.powerlist.page.f<Integer>>) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        com.bytedance.ies.powerlist.b.a aVar = (com.bytedance.ies.powerlist.b.a) a(i2);
        if ((viewHolder instanceof e) && (aVar instanceof com.ss.android.ugc.aweme.social.widget.card.rec.cell.a)) {
            com.ss.android.ugc.aweme.social.widget.card.rec.cell.a aVar2 = (com.ss.android.ugc.aweme.social.widget.card.rec.cell.a) aVar;
            l.d(aVar2, "");
            RecommendUserCell<? extends com.ss.android.ugc.aweme.social.widget.card.rec.cell.a> recommendUserCell = ((e) viewHolder).f133867a;
            l.d(aVar2, "");
            recommendUserCell.a((Object) aVar2);
        } else if ((viewHolder instanceof b) && (aVar instanceof com.ss.android.ugc.aweme.social.widget.card.permission.c)) {
            l.d(aVar, "");
            ((b) viewHolder).f133832a.b(aVar);
        } else if (viewHolder instanceof a) {
            a aVar3 = (a) viewHolder;
            aVar3.a().a();
            bz unused = kotlinx.coroutines.i.a(aVar3.f133828a, null, null, new a.b(aVar3, null), 3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b7 A[Catch:{ Exception -> 0x010d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.recyclerview.widget.RecyclerView.ViewHolder a(com.ss.android.ugc.aweme.social.widget.card.rec.f r6, android.view.ViewGroup r7, int r8) {
        /*
        // Method dump skipped, instructions count: 290
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.widget.card.rec.f.a(com.ss.android.ugc.aweme.social.widget.card.rec.f, android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }
}
