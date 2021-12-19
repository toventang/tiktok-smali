package com.ss.android.ugc.aweme.challenge.a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.challenge.ui.s;
import com.ss.android.ugc.aweme.common.a.d;
import com.ss.android.ugc.aweme.common.a.e;
import com.ss.android.ugc.aweme.common.d.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public final class b extends d {

    /* renamed from: d  reason: collision with root package name */
    public boolean f69871d;

    /* renamed from: e  reason: collision with root package name */
    private String f69872e;

    /* renamed from: f  reason: collision with root package name */
    private com.ss.android.ugc.aweme.challenge.d f69873f;

    /* renamed from: g  reason: collision with root package name */
    private c<e> f69874g;

    /* renamed from: h  reason: collision with root package name */
    private s.b f69875h;

    static {
        Covode.recordClassIndex(43096);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final int getItemCount() {
        if (this.v) {
            return c() + 1;
        }
        return c();
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void b_(List<Aweme> list) {
        this.f76355m = 0;
        if (TextUtils.equals(this.f69872e, "challenge")) {
            this.f76354l = list;
            e(this.f76354l);
            super.b_(this.f76354l);
            return;
        }
        super.b_(list);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.base.widget.g
    public final int c(int i2) {
        int c2 = super.c(i2);
        if (c2 == 0) {
            s.b bVar = this.f69875h;
            if (bVar instanceof s.d) {
                return ((s.d) bVar).getDetailAwemeViewType(i2, (Aweme) this.f76354l.get(i2));
            }
        }
        return c2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.d, com.ss.android.ugc.aweme.common.a.h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        c<e> cVar;
        super.onViewAttachedToWindow(viewHolder);
        if (this.f69871d && viewHolder.getItemViewType() == 0 && (cVar = this.f69874g) != null) {
            cVar.a(viewHolder);
        }
    }

    private List<Integer> e(List<Aweme> list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i2 = 0;
        for (int max = Math.max(0, this.f76355m - 1); max < size; max++) {
            Aweme aweme = list.get(max);
            aweme.setOriginalPos(max);
            if (aweme.getIsTop() == 1) {
                list.remove(aweme);
                list.add(i2, aweme);
                i2++;
                arrayList.add(Integer.valueOf(max));
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void b(List<Aweme> list) {
        if (TextUtils.equals(this.f69872e, "challenge")) {
            this.f76354l = list;
            List<Integer> e2 = e(this.f76354l);
            super.b(list);
            if (e2.size() > 0) {
                notifyItemRangeInserted(0, e2.size());
                return;
            }
            return;
        }
        super.b(list);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.base.widget.g
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        ((a) viewHolder).a((Aweme) this.f76354l.get(i2), i2, this.f69871d);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.base.widget.g
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        a onCreateDetailAwemeViewHolder;
        s.b bVar = this.f69875h;
        if (bVar instanceof s.d) {
            onCreateDetailAwemeViewHolder = ((s.d) bVar).onCreateDetailAwemeViewHolder(viewGroup, i2, this.f69872e, this.f69873f);
        } else {
            onCreateDetailAwemeViewHolder = this.f69875h.onCreateDetailAwemeViewHolder(a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.w5, viewGroup, false), this.f69872e, this.f69873f);
        }
        if (!(onCreateDetailAwemeViewHolder == null || onCreateDetailAwemeViewHolder.itemView.getParent() == null)) {
            ALog.i("DetailAwemeAdapter", onCreateDetailAwemeViewHolder.getClass() + " itemView already attached !!");
        }
        return onCreateDetailAwemeViewHolder;
    }

    public b(String str, com.ss.android.ugc.aweme.challenge.d dVar, c<e> cVar, s.b bVar) {
        this.f69872e = str;
        this.f69873f = dVar;
        this.f69874g = cVar;
        this.f69875h = bVar;
    }
}
