package com.ss.android.ugc.aweme.discover.adapter;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.a.d;
import com.ss.android.ugc.aweme.discover.a.w;
import com.ss.android.ugc.aweme.discover.b.g;
import com.ss.android.ugc.aweme.discover.helper.t;
import com.ss.android.ugc.aweme.discover.mob.c;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.flowfeed.a.a;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.d.c;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.search.k.p;
import com.ss.android.ugc.aweme.search.k.r;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class q extends d {

    /* renamed from: d  reason: collision with root package name */
    public g f80580d;

    /* renamed from: e  reason: collision with root package name */
    public a f80581e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.search.model.d f80582f;

    /* renamed from: g  reason: collision with root package name */
    private String f80583g;

    /* renamed from: h  reason: collision with root package name */
    private c f80584h;

    /* renamed from: i  reason: collision with root package name */
    private com.ss.android.ugc.aweme.discover.i.c f80585i;

    /* renamed from: j  reason: collision with root package name */
    private com.ss.android.ugc.aweme.common.d.c f80586j;

    /* renamed from: k  reason: collision with root package name */
    private int f80587k;
    private int w;
    private t<Aweme> x = new t<>(this);

    static {
        Covode.recordClassIndex(50131);
    }

    @Override // com.ss.android.ugc.aweme.common.a.h
    public final void b(View view) {
        if (view != null) {
            view.setPadding(0, 0, 0, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void b(List<Aweme> list) {
        super.b(list);
        this.x.a(list, s.f80589a);
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void b_(List<Aweme> list) {
        super.b_(list);
        this.x.a(list, r.f80588a);
    }

    @Override // com.ss.android.ugc.aweme.common.a.h
    public final int c_(View view) {
        if (view == null) {
            return 0;
        }
        return (int) n.b(view.getContext(), 45.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.d, com.ss.android.ugc.aweme.common.a.h
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof p) {
            j.a.b(viewHolder.itemView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.d, com.ss.android.ugc.aweme.common.a.h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        com.ss.android.ugc.aweme.discover.i.c cVar;
        com.ss.android.ugc.aweme.common.d.c cVar2;
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof p) {
            j.a.a(viewHolder.itemView, ((p) viewHolder).F());
        }
        if (viewHolder.getItemViewType() == 0 && (cVar = this.f80585i) != null && cVar.bu && (cVar2 = this.f80586j) != null) {
            cVar2.a(viewHolder);
        }
        if (viewHolder instanceof com.ss.android.ugc.aweme.discover.n.c) {
            ((com.ss.android.ugc.aweme.discover.n.c) viewHolder).a("search_result");
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.d
    public final void a(FollowStatus followStatus) {
        User author;
        if (!(this.f76354l == null || this.f76354l.isEmpty() || followStatus == null || TextUtils.isEmpty(followStatus.userId))) {
            for (Aweme aweme : this.f76354l) {
                if (!(aweme == null || (author = aweme.getAuthor()) == null || !followStatus.userId.equals(author.getUid()))) {
                    author.setFollowStatus(followStatus.followStatus);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.widget.g
    public final RecyclerView.ViewHolder b(ViewGroup viewGroup, int i2) {
        int i3;
        com.ss.android.ugc.aweme.discover.n.c cVar = null;
        if (this.w == 9) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            if (w.a()) {
                i3 = R.layout.axi;
            } else {
                i3 = R.layout.aw4;
            }
            com.ss.android.ugc.aweme.discover.n.c cVar2 = new com.ss.android.ugc.aweme.discover.n.c(com.a.a(from, i3, viewGroup, false), this.f80583g, this.f80584h, null);
            cVar2.a(this.f80580d);
            cVar2.a(this.f80581e);
            cVar = cVar2;
        } else if (this.f80587k == 1) {
            cVar = new com.ss.android.ugc.aweme.discover.n.c(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.avo, viewGroup, false), this.f80583g, this.f80584h);
        }
        g gVar = this.f80580d;
        if (gVar != null) {
            gVar.a(cVar);
        }
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.base.widget.g
    public final void b(RecyclerView.ViewHolder viewHolder, int i2) {
        String str;
        String str2;
        int i3;
        boolean z = false;
        if (viewHolder instanceof p) {
            p pVar = (p) viewHolder;
            Aweme aweme = (Aweme) this.f76354l.get(i2);
            com.ss.android.ugc.aweme.search.k.q a2 = am.a();
            String str3 = "normal";
            String str4 = "";
            if (a2 != null) {
                str4 = a2.c().f121172a;
                str2 = a2.c().f121173b;
                i3 = a2.a();
                str = a2.c().f121174c;
                str3 = a2.c().f121175d;
            } else {
                str = str3;
                str2 = str4;
                i3 = 0;
            }
            if (i2 % 10 == 0) {
                c.a.a("cell");
            }
            String requestId = aweme.getRequestId();
            new LogPbBean().setImprId(requestId);
            String b2 = ac.a.f91473a.b(requestId);
            String a3 = c.b.a.a(4);
            String a4 = c.a.a(4);
            r f2 = r.a.a().f("search_result");
            f2.f121266a = false;
            r i4 = f2.g(str4).h(requestId).i(b2);
            i4.f121267b = i3;
            i4.f121278m = i2;
            r e2 = i4.e(str2);
            e2.f121268c = 4;
            pVar.a(e2.c(a3).d(a4).k(str).l(str3).a(t.f80590a));
        }
        if (this.w == 9) {
            com.ss.android.ugc.aweme.discover.n.c cVar = (com.ss.android.ugc.aweme.discover.n.c) viewHolder;
            Aweme aweme2 = (Aweme) this.f76354l.get(i2);
            com.ss.android.ugc.aweme.discover.i.c cVar2 = this.f80585i;
            if (cVar2 == null || cVar2.bu) {
                z = true;
            }
            cVar.a(aweme2, i2, z);
        } else if (this.f80587k == 1) {
            com.ss.android.ugc.aweme.discover.n.c cVar3 = (com.ss.android.ugc.aweme.discover.n.c) viewHolder;
            Aweme aweme3 = (Aweme) this.f76354l.get(i2);
            com.ss.android.ugc.aweme.discover.i.c cVar4 = this.f80585i;
            if (cVar4 == null || cVar4.bu) {
                z = true;
            }
            cVar3.a(aweme3, i2, z);
        }
    }

    public q(com.ss.android.ugc.aweme.discover.i.c cVar, String str, com.ss.android.ugc.aweme.search.d.c cVar2, com.ss.android.ugc.aweme.common.d.c<com.ss.android.ugc.aweme.discover.n.a> cVar3, int i2) {
        this.f80583g = str;
        this.f80584h = cVar2;
        this.f80585i = cVar;
        this.f80586j = cVar3;
        this.f80587k = 0;
        this.w = i2;
    }
}
