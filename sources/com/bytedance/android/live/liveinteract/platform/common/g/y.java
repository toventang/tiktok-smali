package com.bytedance.android.live.liveinteract.platform.common.g;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.api.m;
import com.bytedance.android.live.liveinteract.cohost.ui.d.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import j.a.a.f;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final HashSet<String> f12037a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private final RecyclerView f12038b;

    static {
        Covode.recordClassIndex(6561);
    }

    public final class a extends RecyclerView.n {
        static {
            Covode.recordClassIndex(6562);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            List<?> list;
            m mVar;
            l.d(recyclerView, "");
            if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (linearLayoutManager == null) {
                    l.b();
                }
                int n = linearLayoutManager.n();
                int l2 = linearLayoutManager.l();
                RecyclerView.a adapter = recyclerView.getAdapter();
                if (!(adapter instanceof f)) {
                    adapter = null;
                }
                f fVar = (f) adapter;
                if (fVar != null && (list = fVar.f158845b) != null) {
                    if (i3 == 0) {
                        if (l2 <= n) {
                            while (l2 < list.size()) {
                                Object obj = list.get(l2);
                                if (!(obj instanceof b)) {
                                    obj = null;
                                }
                                b bVar = (b) obj;
                                if (bVar != null) {
                                    mVar = bVar.f10332b;
                                } else {
                                    mVar = null;
                                }
                                if (mVar == m.RECOMMEND_INVITE) {
                                    y.this.f12037a.add(bVar.f10331a.getIdStr());
                                }
                                if (l2 != n) {
                                    l2++;
                                } else {
                                    return;
                                }
                            }
                        }
                    } else if (n < list.size() && (list.get(n) instanceof b)) {
                        Object obj2 = list.get(n);
                        Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.cohost.ui.item.InteractUserItem");
                        b bVar2 = (b) obj2;
                        if (bVar2.f10332b == m.RECOMMEND_INVITE) {
                            y.this.f12037a.add(bVar2.f10331a.getIdStr());
                        }
                    }
                }
            }
        }
    }

    public y(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        this.f12038b = recyclerView;
        recyclerView.a(new a());
    }
}
