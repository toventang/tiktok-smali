package com.ss.android.ugc.aweme.profile.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.c.a.i;
import com.ss.android.ugc.aweme.common.a.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.fs;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.mix.api.h;
import com.ss.android.ugc.aweme.mix.model.a;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.profile.f.o;
import com.ss.android.ugc.aweme.profile.model.LiveReplayCover;
import com.ss.android.ugc.aweme.profile.model.PostGuideTasks;
import com.ss.android.ugc.aweme.story.g;
import com.ss.android.ugc.aweme.story.model.c;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public final class b extends d {
    public String A;
    public boolean B;
    public String C = "";
    public a D;
    public c E = null;
    public h F;
    public int G = 0;
    protected String H;
    private com.ss.android.ugc.aweme.common.d.c I;
    private RecyclerView.ViewHolder J;
    private PostGuideTasks K;
    private ArrayList<LiveReplayCover> L = new ArrayList<>();
    private boolean M = false;
    private boolean N = false;
    private boolean O = false;
    private boolean P = false;
    private boolean Q = false;
    private int R = 0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f115801d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f115802e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f115803f;

    /* renamed from: g  reason: collision with root package name */
    com.ss.android.ugc.aweme.challenge.d f115804g;

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.draft.model.c f115805h;

    /* renamed from: i  reason: collision with root package name */
    public LiveRoomStruct f115806i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f115807j;

    /* renamed from: k  reason: collision with root package name */
    protected int f115808k;
    public boolean w = true;
    public boolean x = true;
    public e y;
    public String z;

    static {
        Covode.recordClassIndex(74710);
    }

    @Override // com.ss.android.ugc.aweme.common.a.h
    public final boolean g() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final List<Aweme> e() {
        return this.f76354l;
    }

    public final int p() {
        return super.c();
    }

    public final boolean s() {
        if (this.K != null) {
            return true;
        }
        return false;
    }

    private int t() {
        int i2;
        boolean z2 = this.f115801d;
        if (this.f115806i != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        return (z2 ? 1 : 0) + i2;
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void f() {
        this.K = null;
        this.f115806i = null;
        super.f();
    }

    public final boolean n() {
        if (!this.O || !q()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.base.widget.g, com.ss.android.ugc.aweme.common.a.f
    public final int c() {
        int i2;
        int o = o() + super.c();
        if (this.K == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        return o + i2 + (this.Q ? 1 : 0);
    }

    public final int o() {
        return t() + this.L.size() + (this.P ? 1 : 0) + (this.N ? 1 : 0) + (this.O ? 1 : 0);
    }

    public final boolean q() {
        if (!this.f115807j || !g.f137757a.a() || this.f115808k != 14) {
            return false;
        }
        return true;
    }

    public final void r() {
        if (!i.a(this.K, null)) {
            this.K = null;
            d(true);
            notifyDataSetChanged();
        }
    }

    private boolean u() {
        if (this.f115807j && this.f115808k == 0) {
            o.f116433c = o.b(t() + this.L.size() + super.c());
        }
        if (!o.b(t() + this.L.size() + super.c()) || !this.f115807j || this.f115808k != 0) {
            return false;
        }
        return true;
    }

    private boolean v() {
        if (this.f115807j && this.f115808k == 0) {
            o.f116432b = o.a(super.c() + o());
        }
        if (!o.a(super.c() + o()) || !this.f115807j || this.f115808k != 0) {
            return false;
        }
        return true;
    }

    public final void m() {
        if (this.P != u() || this.Q != v() || this.R != o.h()) {
            this.P = u();
            this.Q = v();
            this.R = o.h();
            notifyDataSetChanged();
        }
    }

    public final void l() {
        boolean z2;
        boolean z3 = true;
        if (!this.f115807j ? this.f115808k != 0 || super.c() <= 0 || !this.M : this.f115808k != 0 || super.c() <= 0 || !this.M || !MixFeedService.k().c()) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.N = z2;
        if (this.f115807j) {
            this.P = u();
            this.Q = v();
        }
        if (!this.O || !q()) {
            z3 = false;
        }
        this.O = z3;
    }

    public final String toString() {
        String str;
        int i2 = this.f115808k;
        if (i2 == 0) {
            str = "TYPE_PUBLISH_AWEME";
        } else if (i2 == 1) {
            str = "TYPE_FAVORITE_AWEME";
        } else if (i2 == 2) {
            str = "TYPE_STORY_AWEME";
        } else if (i2 == 3) {
            str = "TYPE_ORIGIN_MUSIC";
        } else if (i2 == 4) {
            str = "TYPE_COLLECT_AWEME";
        } else if (i2 != 5) {
            str = "TYPE_TOOL_MASTER";
        } else {
            str = "TYPE_DYNAMIC_STATE";
        }
        return "profileListType: " + str + ", itemCount: " + getItemCount() + ", baseCount: " + c() + ", mShowDraftBox: " + this.f115801d + ", mShowFooter: " + this.v + ", isMyProfile: " + this.f115807j;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.h
    public final RecyclerView.ViewHolder a_(ViewGroup viewGroup) {
        RecyclerView.ViewHolder a_ = super.a_(viewGroup);
        this.J = a_;
        return a_;
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void b(List<Aweme> list) {
        super.b(list);
        e(list);
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void b_(List<Aweme> list) {
        super.b_(list);
        e(list);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void d(boolean z2) {
        boolean z3;
        if (this.K != null || !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        super.d(z3);
    }

    private Aweme a(int i2) {
        int o = i2 - o();
        if (this.f76354l != null && o >= 0 && o < this.f76354l.size()) {
            return (Aweme) this.f76354l.get(o);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.common.a.d
    public final boolean b(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.getItemViewType() == 0 || viewHolder.getItemViewType() == 7) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        GridLayoutManager.c cVar;
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (cVar = ((GridLayoutManager) layoutManager).f3765g) != null) {
            cVar.f3772c = true;
            cVar.f3773d = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.d, com.ss.android.ugc.aweme.common.a.h
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof r) {
            r rVar = (r) viewHolder;
            rVar.f115907g.isUserProfileFragmentVisible2().removeObserver(rVar);
        }
    }

    public final void b(String str) {
        a((CharSequence) str);
        RecyclerView.ViewHolder viewHolder = this.J;
        if (viewHolder != null) {
            TextView textView = (TextView) ((DmtStatusView) viewHolder.itemView).b(1);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
            layoutParams.gravity = 1;
            textView.setLayoutParams(layoutParams);
            textView.setTextColor(androidx.core.content.b.c(this.y, R.color.c4));
            textView.setText(str);
            ah_();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.d, com.ss.android.ugc.aweme.common.a.h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        com.ss.android.ugc.aweme.common.d.c cVar;
        super.onViewAttachedToWindow(viewHolder);
        if (this.f115803f && b(viewHolder) && (cVar = this.I) != null) {
            cVar.a(viewHolder);
        }
        if (viewHolder instanceof r) {
            r rVar = (r) viewHolder;
            rVar.f115907g.isUserProfileFragmentVisible2().observe(rVar.f115910j, rVar);
        }
    }

    public final void a(c cVar) {
        this.E = cVar;
        boolean z2 = true;
        if (cVar == null || cVar.getItems() == null || cVar.getItems().isEmpty() || !q()) {
            z2 = false;
        }
        this.O = z2;
    }

    private void e(List<Aweme> list) {
        if (this.f115807j && this.f115808k == 0 && list != null) {
            int size = list.size();
            int awemeCount = com.ss.android.ugc.aweme.account.b.g().getCurUser().getAwemeCount();
            if (size > awemeCount) {
                r.a("publish_num_check", new com.ss.android.ugc.aweme.app.f.d().a("error_type", 1).a("num_des", size + "-" + awemeCount).f66730a);
            }
            if (size == 0 && awemeCount == 1) {
                r.a("publish_num_check", new com.ss.android.ugc.aweme.app.f.d().a("error_type", 2).a("num_des", size + "-" + awemeCount).f66730a);
            }
            if (!this.x && size != awemeCount) {
                r.a("publish_num_check", new com.ss.android.ugc.aweme.app.f.d().a("error_type", 3).a("num_des", size + "-" + awemeCount).f66730a);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.base.widget.g
    public final int c(int i2) {
        int i3;
        int t;
        if (!this.O) {
            i3 = 0;
        } else if (i2 == 0) {
            return 11;
        } else {
            i3 = 1;
        }
        if (this.N) {
            if (i2 == i3) {
                return 10;
            }
            i3++;
        }
        if (this.f115808k == 15) {
            return 7;
        }
        if (this.f115801d) {
            if (i3 == i2) {
                return 1;
            }
            i3++;
        }
        if (this.f115806i != null && i3 == i2) {
            return 3;
        }
        if (this.L.size() > 0 && i2 >= (t = t()) && i2 < t + this.L.size()) {
            return 6;
        }
        Aweme a2 = a(i2);
        if (a2 != null) {
            if (a2.getAwemeType() == 40 && a2.getUserStory() != null) {
                return 12;
            }
            if (a2.getAwemeType() == 2) {
                return 2;
            }
            if (a2.isForwardAweme()) {
                return 7;
            }
        }
        if (this.K != null && i2 == c() - 1) {
            return 5;
        }
        if (i2 == 0 && this.f115807j && this.P) {
            return 9;
        }
        if (!this.f115807j || ((this.f76354l != null && i2 != c() - 1) || !this.Q)) {
            return super.c(i2);
        }
        return 8;
    }

    private static boolean a(int i2, boolean z2) {
        if (i2 != 4 || !z2 || com.ss.android.ugc.aweme.profile.service.c.f116620a.isDataSetChangedOnStart()) {
            return false;
        }
        return true;
    }

    public final void a(boolean z2, a aVar) {
        if (this.M != z2) {
            this.M = z2;
            this.D = aVar;
            notifyDataSetChanged();
            return;
        }
        List<com.ss.android.ugc.aweme.mix.model.d> list = null;
        List<com.ss.android.ugc.aweme.mix.model.d> mixList = aVar == null ? null : aVar.getMixList();
        a aVar2 = this.D;
        if (aVar2 != null) {
            list = aVar2.getMixList();
        }
        if (!(mixList == null || list == null || mixList.size() != list.size())) {
            for (int i2 = 0; i2 < mixList.size(); i2++) {
                if (mixList.get(i2).mixId.equals(list.get(i2).mixId) && mixList.get(i2).getMixName().equals(list.get(i2).getMixName())) {
                }
            }
            return;
        }
        this.D = aVar;
        notifyDataSetChanged();
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.base.widget.g
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        String str;
        View a2;
        switch (i2) {
            case 1:
                return new e(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aqo, viewGroup, false));
            case 2:
                return new p(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aou, viewGroup, false), this.H, this.f115804g);
            case 3:
                return new r(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ap1, viewGroup, false), this.y);
            case 4:
            default:
                if (fs.f90078b) {
                    a2 = com.a.b.c.a(this.y, R.layout.aoi, viewGroup, false);
                } else {
                    a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aoi, viewGroup, false);
                }
                this.G++;
                return new c(a2, this.H, this.f115804g);
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return new t(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ap2, viewGroup, false));
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                throw new IllegalArgumentException("not supported in i18n");
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                throw new IllegalArgumentException("not supported in i18n");
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return new n(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aor, viewGroup, false), this.y);
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return new o(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aot, viewGroup, false), this.y);
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                if (this.f115807j) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                return MixFeedService.k().a(viewGroup, this.f115807j, false, str, (com.ss.android.ugc.aweme.mix.api.g) null);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                return new u(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ap6, viewGroup, false), this.y);
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                return new v(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ap7, viewGroup, false), this.H, this);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01f3  */
    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.base.widget.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(final androidx.recyclerview.widget.RecyclerView.ViewHolder r25, final int r26) {
        /*
        // Method dump skipped, instructions count: 1526
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.a.b.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public static void a(int i2, boolean z2, Aweme aweme) {
        if (a(i2, z2) && aweme != null) {
            com.ss.android.ugc.aweme.profile.service.c.f116620a.onVideoItemActionShow(aweme);
        }
    }

    public b(e eVar, String str, boolean z2, int i2, com.ss.android.ugc.aweme.challenge.d dVar, com.ss.android.ugc.aweme.common.d.c cVar, String str2, String str3) {
        this.y = eVar;
        this.H = str;
        this.f115804g = dVar;
        this.f115807j = z2;
        this.f115808k = i2;
        this.I = cVar;
        this.z = str2;
        this.A = str3;
        registerAdapterDataObserver(new RecyclerView.c() {
            /* class com.ss.android.ugc.aweme.profile.a.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(74711);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void a() {
                super.a();
                b.this.l();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void b(int i2, int i3) {
                super.b(i2, i3);
                b.this.l();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void c(int i2, int i3) {
                super.c(i2, i3);
                b.this.l();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void a(int i2, int i3) {
                super.a(i2, i3);
                b.this.l();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void a(int i2, int i3, int i4) {
                super.a(i2, i3, i4);
                b.this.l();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void a(int i2, int i3, Object obj) {
                super.a(i2, i3, obj);
                b.this.l();
            }
        });
    }
}
