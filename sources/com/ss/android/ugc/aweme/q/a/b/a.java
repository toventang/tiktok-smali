package com.ss.android.ugc.aweme.q.a.b;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.bl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import j.a.a.f;
import java.util.ArrayList;

public final class a extends com.ss.android.ugc.aweme.q.a.a<com.ss.android.ugc.aweme.api.model.a, C3049a> {

    /* renamed from: d  reason: collision with root package name */
    public final f f118930d;

    static {
        Covode.recordClassIndex(77261);
    }

    public static final class b extends RecyclerView.h {

        /* renamed from: a  reason: collision with root package name */
        public final int f118933a;

        static {
            Covode.recordClassIndex(77263);
        }

        public b(int i2) {
            this.f118933a = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
            l.d(rect, "");
            l.d(view, "");
            l.d(recyclerView, "");
            l.d(sVar, "");
            rect.left = this.f118933a;
        }
    }

    public a(bl blVar) {
        super(blVar);
        f fVar = new f();
        this.f118930d = fVar;
        fVar.a(AnchorCell.class, new com.ss.android.ugc.aweme.q.a.a.b(blVar));
    }

    @Override // j.a.a.c
    public final /* synthetic */ RecyclerView.ViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.a9b, viewGroup, false);
        l.b(a2, "");
        return new C3049a(this, a2);
    }

    /* renamed from: com.ss.android.ugc.aweme.q.a.b.a$a  reason: collision with other inner class name */
    public final class C3049a extends com.ss.android.ugc.aweme.q.a.a<com.ss.android.ugc.aweme.api.model.a, C3049a>.C3047a {

        /* renamed from: b  reason: collision with root package name */
        public final RecyclerView f118931b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f118932c;

        static {
            Covode.recordClassIndex(77262);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3049a(a aVar, View view) {
            super(aVar, view);
            l.d(view, "");
            this.f118932c = aVar;
            View findViewById = view.findViewById(R.id.djn);
            l.b(findViewById, "");
            RecyclerView recyclerView = (RecyclerView) findViewById;
            this.f118931b = recyclerView;
            Context context = view.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            recyclerView.a(new b((int) n.b(context, 4.0f)));
            recyclerView.setAdapter(aVar.f118930d);
        }
    }

    @Override // j.a.a.c
    public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder, Object obj) {
        com.ss.android.ugc.aweme.api.model.a aVar = (com.ss.android.ugc.aweme.api.model.a) obj;
        l.d(viewHolder, "");
        l.d(aVar, "");
        ArrayList<AnchorCell> arrayList = aVar.f66467e;
        if (arrayList != null && !arrayList.isEmpty()) {
            f fVar = this.f118930d;
            ArrayList<AnchorCell> arrayList2 = aVar.f66467e;
            if (arrayList2 == null) {
                l.b();
            }
            fVar.a(arrayList2);
            f fVar2 = this.f118930d;
            fVar2.notifyItemRangeChanged(0, fVar2.f158845b.size());
        }
    }
}
