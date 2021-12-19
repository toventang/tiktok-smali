package com.ss.android.ugc.aweme.discover.i;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.challenge.ui.z;
import com.ss.android.ugc.aweme.common.a.d;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.discover.adapter.q;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.n.o;
import com.ss.android.ugc.aweme.feed.q.v;
import com.ss.android.ugc.aweme.search.d.c;
import com.ss.android.ugc.aweme.utils.gc;
import com.ss.android.ugc.aweme.views.m;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public abstract class a extends v implements i, j {

    /* renamed from: j  reason: collision with root package name */
    private static int f81210j;

    /* renamed from: a  reason: collision with root package name */
    protected c f81211a;

    /* renamed from: b  reason: collision with root package name */
    protected o f81212b;

    /* renamed from: c  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.common.d.a f81213c;

    /* renamed from: d  reason: collision with root package name */
    protected DmtStatusView f81214d;

    /* renamed from: e  reason: collision with root package name */
    public RecyclerView f81215e;

    /* renamed from: f  reason: collision with root package name */
    protected q f81216f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.aweme.discover.c.a f81217g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f81218h;

    /* renamed from: i  reason: collision with root package name */
    private int f81219i;

    static {
        Covode.recordClassIndex(50475);
    }

    public abstract RecyclerView.i a();

    @Override // com.ss.android.ugc.aweme.feed.q.v
    public final boolean aw_() {
        return true;
    }

    public abstract RecyclerView.h c();

    /* access modifiers changed from: protected */
    public abstract q d();

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new g(a.class, "onVideoEvent", ag.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void j() {
        this.f81215e.post(new b(this));
    }

    public final void a(h.a aVar) {
        q qVar = this.f81216f;
        if (qVar != null) {
            qVar.a(aVar);
        }
    }

    @r
    public void onVideoEvent(ag agVar) {
        int a2;
        Aweme aweme;
        if (bD()) {
            int i2 = agVar.f93450a;
            if (i2 == 2) {
                String str = (String) agVar.f93451b;
                if (!(TextUtils.isEmpty(str) || (a2 = this.f81216f.a(str)) < 0 || b.a((Collection) ((d) this.f81216f).f76354l))) {
                    if (this.f81216f.b() != null) {
                        ((d) this.f81216f).f76354l.remove(a2 - 1);
                    } else {
                        ((d) this.f81216f).f76354l.remove(a2);
                    }
                    this.f81216f.notifyItemRemoved(a2);
                    if (this.f81216f.getItemCount() == 0) {
                        this.f81214d.setVisibility(0);
                        this.f81214d.g();
                        this.f81216f.ah_();
                    }
                }
            } else if (i2 == 13) {
                int childCount = this.f81215e.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    RecyclerView.ViewHolder a3 = this.f81215e.a(this.f81215e.getChildAt(i3));
                    if (a3.getItemViewType() == 0) {
                        ((com.ss.android.ugc.aweme.discover.n.a) a3).H();
                    }
                }
            } else if (i2 != 21) {
                if (i2 == 22) {
                    this.f81216f.notifyDataSetChanged();
                    if (this.f81216f.getItemCount() == 0) {
                        this.f81214d.setVisibility(0);
                        this.f81214d.g();
                        this.f81216f.ah_();
                    }
                }
            } else if (this.bu && (aweme = (Aweme) agVar.f93451b) != null) {
                a(agVar, this.f81216f.a(aweme.getAid()), aweme);
            }
        }
    }

    public a(c cVar, o oVar) {
        this.f81211a = cVar;
        this.f81212b = oVar;
    }

    @Override // com.ss.android.ugc.b.a.a.b, com.ss.android.ugc.aweme.feed.q.v
    public void a(View view, Bundle bundle) {
        z zVar;
        this.f81214d = (DmtStatusView) view.findViewById(R.id.e_o);
        this.f81215e = (RecyclerView) view.findViewById(R.id.cbi);
        super.a(view, bundle);
        this.f81215e.setLayoutManager(a());
        this.f81215e.a(c());
        this.f81215e.setItemAnimator(new androidx.recyclerview.widget.i());
        this.f81216f = d();
        com.ss.android.ugc.aweme.discover.c.a aVar = new com.ss.android.ugc.aweme.discover.c.a(this.f81216f);
        this.f81217g = aVar;
        this.f81215e.setAdapter(aVar);
        if (!com.ss.android.ugc.aweme.performance.i.a()) {
            zVar = new z();
            this.f81215e.a(zVar);
        } else {
            zVar = null;
        }
        this.f81215e = gc.a(this.f81215e, this.f81212b, 2);
        this.f81213c = new com.ss.android.ugc.aweme.common.d.a(this.f81215e, zVar);
        this.f81215e.a(new RecyclerView.n() {
            /* class com.ss.android.ugc.aweme.discover.i.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(50476);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2) {
                if (i2 == 0 && a.this.f81216f.getItemCount() > 1 && a.this.f81218h) {
                    a.this.f81216f.notifyItemChanged(1);
                    a.this.f81218h = false;
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void a(ag agVar, int i2, Aweme aweme) {
        RecyclerView recyclerView;
        if (f81210j == 0) {
            f81210j = this.bv.getResources().getDimensionPixelOffset(R.dimen.n5);
        }
        if (i2 != -1 && (this.f81215e.getLayoutManager() instanceof m)) {
            if (this.f81215e.getLayoutManager() instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f81215e.getLayoutManager();
                if (this.f81219i == 0 && (recyclerView = this.f81215e) != null) {
                    this.f81219i = recyclerView.getHeight();
                }
                staggeredGridLayoutManager.a(i2, (this.f81219i - n.a(200.0d)) / 2);
            } else if (this.f81215e.getLayoutManager() instanceof GridLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f81215e.getLayoutManager();
                int k2 = linearLayoutManager.k();
                int m2 = linearLayoutManager.m();
                if (i2 < k2 || i2 > m2) {
                    ((m) this.f81215e.getLayoutManager()).a(i2, 0);
                } else {
                    return;
                }
            }
            this.f81218h = true;
        }
    }
}
