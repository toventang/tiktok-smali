package com.ss.android.ugc.aweme.discover.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.adapter.am;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.ui.ae;
import com.ss.android.ugc.aweme.following.ui.adapter.d;
import com.ss.android.ugc.aweme.keyword.a;
import com.ss.android.ugc.aweme.search.d.b;
import com.ss.android.ugc.aweme.search.k.r;
import java.util.List;

public final class al extends p<SearchUser> implements ae {

    /* renamed from: g  reason: collision with root package name */
    public r f80394g;

    /* renamed from: h  reason: collision with root package name */
    private d f80395h;

    /* renamed from: i  reason: collision with root package name */
    private RecyclerView.ViewHolder f80396i;

    /* renamed from: j  reason: collision with root package name */
    private String f80397j;

    static {
        Covode.recordClassIndex(50032);
    }

    @Override // com.ss.android.ugc.aweme.common.a.f, com.ss.android.ugc.aweme.discover.ui.ae
    public final void b_(List<SearchUser> list) {
        if (this.f80579f != null) {
            this.f80579f.f120995a = Integer.MIN_VALUE;
        }
        super.b_(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f80396i = b(recyclerView, 0);
    }

    public al(a.b bVar, d dVar) {
        this.f80578e = bVar;
        this.f80395h = dVar;
    }

    @Override // com.ss.android.ugc.aweme.base.widget.g
    public final RecyclerView.ViewHolder b(ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder = this.f80396i;
        if (viewHolder == null) {
            return am.c.a(viewGroup, this.f80395h);
        }
        this.f80396i = null;
        return viewHolder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:195:0x039f, code lost:
        if (r7 == false) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03a3, code lost:
        if (r10.f121571f == 1) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03a5, code lost:
        r6 = r10.f121567b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03a7, code lost:
        if (r6 != null) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03a9, code lost:
        h.f.b.l.a("productListView");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03ae, code lost:
        r6.b(0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x04b6  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0594  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01ec A[ADDED_TO_REGION] */
    @Override // com.ss.android.ugc.aweme.base.widget.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.recyclerview.widget.RecyclerView.ViewHolder r24, int r25) {
        /*
        // Method dump skipped, instructions count: 1651
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.adapter.al.b(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public al(com.ss.android.ugc.aweme.search.model.d dVar, a.b bVar, d dVar2, b bVar2, String str) {
        super(dVar, bVar, bVar2);
        this.f80395h = dVar2;
        this.f80397j = str;
    }
}
