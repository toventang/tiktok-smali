package com.ss.android.ugc.aweme.discover.jedi.a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.arch.ext.list.a;
import com.ss.android.ugc.aweme.discover.helper.t;
import com.ss.android.ugc.aweme.discover.lynx.e.a;
import com.ss.android.ugc.aweme.discover.mixfeed.cs.ClickSearchViewModel;
import com.ss.android.ugc.aweme.discover.mixfeed.e.b;
import com.ss.android.ugc.aweme.discover.mixfeed.e.d;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.ui.aw;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.l.g;
import com.ss.android.ugc.aweme.search.l.i;
import com.ss.android.ugc.aweme.search.l.j;
import com.ss.android.ugc.playerkit.model.v;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class c extends com.ss.android.ugc.aweme.common.a.f<com.ss.android.ugc.aweme.discover.mixfeed.h> implements com.bytedance.jedi.arch.ext.list.a<com.ss.android.ugc.aweme.discover.mixfeed.h>, com.ss.android.ugc.aweme.flowfeed.a.b, i.a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f81317h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.search.model.d f81318a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.discover.b.g f81319b;

    /* renamed from: c  reason: collision with root package name */
    public List<String> f81320c;

    /* renamed from: d  reason: collision with root package name */
    public ClickSearchViewModel f81321d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.search.l.i f81322e;

    /* renamed from: f  reason: collision with root package name */
    public final RecyclerView f81323f;

    /* renamed from: g  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.flowfeed.a.a f81324g;

    /* renamed from: i  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.search.d.d f81325i;

    /* renamed from: j  reason: collision with root package name */
    private t<com.ss.android.ugc.aweme.discover.mixfeed.h> f81326j = new t<>(this);

    /* renamed from: k  reason: collision with root package name */
    private GlobalDoodleConfig f81327k;
    private final com.bytedance.jedi.arch.ext.list.a.b<com.ss.android.ugc.aweme.discover.mixfeed.h> w;
    private com.ss.android.ugc.aweme.search.d.c x;

    static {
        Covode.recordClassIndex(50532);
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.a.b
    public final void a(Aweme aweme) {
    }

    @Override // com.bytedance.jedi.arch.ext.list.a
    public final void a(List<? extends com.ss.android.ugc.aweme.discover.mixfeed.h> list, h.f.a.a<z> aVar) {
        l.d(list, "");
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50534);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class e implements com.ss.android.ugc.aweme.discover.lynx.e.c {
        static {
            Covode.recordClassIndex(50538);
        }

        e() {
        }

        @Override // com.ss.android.ugc.aweme.discover.lynx.e.c
        public final List<com.ss.android.ugc.aweme.discover.lynx.delegate.b> a(com.ss.android.ugc.aweme.discover.lynx.a.b bVar) {
            l.d(bVar, "");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.ss.android.ugc.aweme.discover.lynx.delegate.h(bVar));
            arrayList.add(new com.ss.android.ugc.aweme.discover.lynx.delegate.e(bVar));
            arrayList.add(new com.ss.android.ugc.aweme.discover.lynx.delegate.g(bVar));
            arrayList.add(new com.ss.android.ugc.aweme.discover.lynx.delegate.f(bVar));
            arrayList.add(new com.ss.android.ugc.aweme.discover.lynx.delegate.c(bVar));
            arrayList.add(new com.ss.android.ugc.aweme.discover.lynx.delegate.i(bVar));
            return arrayList;
        }
    }

    public static final class h implements h.f.a.b<com.ss.android.ugc.aweme.discover.mixfeed.h, Aweme> {
        static {
            Covode.recordClassIndex(50541);
        }

        h() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Aweme invoke(com.ss.android.ugc.aweme.discover.mixfeed.h hVar) {
            com.ss.android.ugc.aweme.discover.mixfeed.h hVar2 = hVar;
            if (hVar2 != null) {
                return hVar2.getAweme();
            }
            return null;
        }
    }

    public static final class i implements h.f.a.b<com.ss.android.ugc.aweme.discover.mixfeed.h, Aweme> {
        static {
            Covode.recordClassIndex(50542);
        }

        i() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Aweme invoke(com.ss.android.ugc.aweme.discover.mixfeed.h hVar) {
            com.ss.android.ugc.aweme.discover.mixfeed.h hVar2 = hVar;
            if (hVar2 != null) {
                return hVar2.getAweme();
            }
            return null;
        }
    }

    @Override // com.bytedance.jedi.arch.ext.list.a
    public final com.bytedance.jedi.arch.ext.list.a.b<com.ss.android.ugc.aweme.discover.mixfeed.h> a() {
        return this.w;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final int getItemCount() {
        return super.getItemCount();
    }

    public final void l() {
        this.f81325i.a(c());
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.ViewHolder f81337a;

        static {
            Covode.recordClassIndex(50540);
        }

        g(RecyclerView.ViewHolder viewHolder) {
            this.f81337a = viewHolder;
        }

        public final void run() {
            RecyclerView.ViewHolder viewHolder = this.f81337a;
            if (viewHolder instanceof com.ss.android.ugc.aweme.common.a.e) {
                ((com.ss.android.ugc.aweme.common.a.e) viewHolder).b(true);
            }
            RecyclerView.ViewHolder viewHolder2 = this.f81337a;
            if (viewHolder2 instanceof com.ss.android.ugc.aweme.discover.n.c) {
                ((com.ss.android.ugc.aweme.discover.n.c) viewHolder2).a("general_search");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f81331a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f81332b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f81333c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.core.g.a f81334d;

        static {
            Covode.recordClassIndex(50535);
        }

        b(c cVar, int i2, int i3, androidx.core.g.a aVar) {
            this.f81331a = cVar;
            this.f81332b = i2;
            this.f81333c = i3;
            this.f81334d = aVar;
        }

        public final void run() {
            RecyclerView.ViewHolder f2 = this.f81331a.f81323f.f(this.f81332b);
            if (f2 == null) {
                int i2 = this.f81333c;
                if (i2 < 10) {
                    this.f81331a.a(this.f81332b, i2 + 1, this.f81334d);
                    return;
                }
                return;
            }
            this.f81334d.a(f2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.a.c$c  reason: collision with other inner class name */
    static final class C1893c extends m implements h.f.a.a<z> {
        final /* synthetic */ com.ss.android.ugc.aweme.discover.mixfeed.d.f $it;
        final /* synthetic */ com.ss.android.ugc.aweme.discover.mixfeed.h $mixFeed$inlined;
        final /* synthetic */ int $position$inlined;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(50536);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1893c(com.ss.android.ugc.aweme.discover.mixfeed.d.f fVar, c cVar, int i2, com.ss.android.ugc.aweme.discover.mixfeed.h hVar) {
            super(0);
            this.$it = fVar;
            this.this$0 = cVar;
            this.$position$inlined = i2;
            this.$mixFeed$inlined = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            Integer num;
            ViewGroup.LayoutParams layoutParams;
            int i2;
            View view;
            Fragment g2 = this.this$0.f81324g.g();
            GridLayoutManager.b bVar = null;
            if (g2 != null) {
                num = Integer.valueOf(g2.hashCode());
            } else {
                num = null;
            }
            int i3 = this.$position$inlined;
            com.ss.android.ugc.aweme.discover.mixfeed.d.f fVar = this.$it;
            if (fVar == null || (view = fVar.itemView) == null) {
                layoutParams = null;
            } else {
                layoutParams = view.getLayoutParams();
            }
            if (layoutParams instanceof GridLayoutManager.b) {
                bVar = layoutParams;
            }
            GridLayoutManager.b bVar2 = bVar;
            if (bVar2 != null) {
                i2 = bVar2.f3768a;
            } else {
                i2 = -1;
            }
            if (num != null) {
                num.intValue();
                Map<Integer, Map<Integer, Integer>> a2 = com.ss.android.ugc.aweme.discover.mixfeed.d.d.a();
                Map<Integer, Integer> map = a2.get(num);
                if (map == null) {
                    map = new LinkedHashMap<>();
                    a2.put(num, map);
                }
                map.put(Integer.valueOf(i3), Integer.valueOf(i2));
            }
            return z.f158842a;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.jedi.arch.ext.list.a
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.discover.mixfeed.h a(int i2) {
        return a.C0960a.a((com.bytedance.jedi.arch.ext.list.a) this, i2, false);
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void b(List<com.ss.android.ugc.aweme.discover.mixfeed.h> list) {
        this.f81326j.a(list, new i());
        super.b(list);
    }

    @Override // com.ss.android.ugc.aweme.search.l.i.a
    public final RecyclerView.ViewHolder c(ViewGroup viewGroup) {
        com.ss.android.ugc.aweme.discover.mixfeed.e.e eVar = new com.ss.android.ugc.aweme.discover.mixfeed.e.e(com.ss.android.ugc.aweme.search.l.m.a(viewGroup, R.layout.awu), viewGroup.getContext());
        l.b(eVar, "");
        return eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        j.a(this.f81323f, new g(viewHolder));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof com.ss.android.ugc.aweme.common.a.e) {
            ((com.ss.android.ugc.aweme.common.a.e) viewHolder).b(false);
        }
        View view = viewHolder.itemView;
        l.b(view, "");
        j.a.b(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof com.ss.android.ugc.aweme.discover.mixfeed.e.a) {
            ((com.ss.android.ugc.aweme.discover.mixfeed.e.a) viewHolder).D();
        }
    }

    public final int a(String str) {
        String str2;
        l.d(str, "");
        List<com.ss.android.ugc.aweme.discover.mixfeed.h> list = this.f76354l;
        l.b(list, "");
        int i2 = 0;
        for (com.ss.android.ugc.aweme.discover.mixfeed.h hVar : list) {
            l.b(hVar, "");
            if (hVar.a()) {
                Aweme aweme = hVar.getAweme();
                if (aweme != null) {
                    str2 = aweme.getAid();
                } else {
                    str2 = null;
                }
                if (TextUtils.equals(str, str2)) {
                    return i2;
                }
            }
            i2++;
        }
        return -1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<? extends com.ss.android.ugc.aweme.discover.mixfeed.h>] */
    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void b_(List<com.ss.android.ugc.aweme.discover.mixfeed.h> list) {
        List<T> list2;
        this.f81326j.a(list, new h());
        if (list != null) {
            list2 = n.g((Collection) list);
        } else {
            list2 = null;
        }
        if (list2 == null) {
            list2 = new ArrayList<>();
            d(false);
        }
        this.f81325i.f120995a = Integer.MIN_VALUE;
        List<? extends com.ss.android.ugc.aweme.discover.mixfeed.h> list3 = this.f76354l;
        this.f76354l = list2;
        a(list3, this.f76354l);
        com.ss.android.ugc.aweme.search.l.i.f121401f.set(0);
    }

    @Override // com.ss.android.ugc.aweme.search.l.i.a
    public final RecyclerView.ViewHolder d(ViewGroup viewGroup) {
        if (viewGroup == null) {
            l.b();
        }
        com.ss.android.ugc.aweme.discover.n.c cVar = new com.ss.android.ugc.aweme.discover.n.c(com.ss.android.ugc.aweme.search.l.m.a(viewGroup, aw.a()), "", this.x, this.f81321d);
        cVar.a(this.f81324g);
        cVar.a(this.f81319b);
        com.ss.android.ugc.aweme.discover.b.g gVar = this.f81319b;
        if (gVar != null) {
            gVar.a(cVar);
        }
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        com.ss.android.ugc.aweme.newfollow.b.a aVar = (com.ss.android.ugc.aweme.newfollow.b.a) this.f76354l.get(i2);
        l.b(aVar, "");
        switch (aVar.getFeedType()) {
            case 61:
                return 21;
            case 70:
                return 20;
            case 65280:
                return 16;
            case 65457:
                return 112;
            case 65458:
                return 96;
            case 65465:
                return 144;
            case 65467:
                return 48;
            case 65514:
                return 18;
            case 1048336:
                return 19;
            default:
                return -1;
        }
    }

    public final void e(List<? extends com.ss.android.ugc.aweme.discover.mixfeed.h> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        ArrayList<com.ss.android.ugc.aweme.newfollow.b.a> arrayList2 = new ArrayList();
        for (T t : list) {
            if (t.getFeedType() == 65280) {
                arrayList2.add(t);
            }
        }
        for (com.ss.android.ugc.aweme.newfollow.b.a aVar : arrayList2) {
            Aweme aweme = aVar.getAweme();
            if (aweme != null) {
                String aid = aweme.getAid();
                l.b(aid, "");
                arrayList.add(aid);
            }
        }
        this.f81320c = arrayList;
    }

    public static final class f<T> implements androidx.core.g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ag f81336a;

        static {
            Covode.recordClassIndex(50539);
        }

        public f(ag agVar) {
            this.f81336a = agVar;
        }

        @Override // androidx.core.g.a
        public final /* synthetic */ void a(Object obj) {
            long j2;
            Map<Integer, Integer> map;
            Set<Map.Entry<Integer, Integer>> entrySet;
            Fragment g2;
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj;
            Integer num = null;
            if (!(viewHolder instanceof com.ss.android.ugc.aweme.discover.n.c)) {
                viewHolder = null;
            }
            com.ss.android.ugc.aweme.discover.n.c cVar = (com.ss.android.ugc.aweme.discover.n.c) viewHolder;
            if (cVar != null) {
                ag agVar = this.f81336a;
                l.d(agVar, "");
                if (agVar.f93456g > cVar.v) {
                    j2 = agVar.f93456g;
                } else {
                    j2 = cVar.v;
                }
                cVar.v = System.currentTimeMillis();
                long currentTimeMillis = System.currentTimeMillis() - j2;
                long millis = TimeUnit.SECONDS.toMillis(5);
                if (j2 > 0 && currentTimeMillis > 0 && currentTimeMillis >= millis) {
                    com.ss.android.ugc.aweme.flowfeed.a.a aVar = cVar.f81962f;
                    if (!(aVar == null || (g2 = aVar.g()) == null)) {
                        num = Integer.valueOf(g2.hashCode());
                    }
                    int adapterPosition = cVar.getAdapterPosition();
                    if (!(adapterPosition < 0 || num == null || (map = com.ss.android.ugc.aweme.discover.mixfeed.d.d.a().get(num)) == null)) {
                        Map<Integer, Integer> map2 = map;
                        if (!(map2 == null || (entrySet = map2.entrySet()) == null)) {
                            for (T t : entrySet) {
                                int intValue = ((Number) t.getKey()).intValue();
                                int intValue2 = ((Number) t.getValue()).intValue();
                                if (intValue2 == 0) {
                                    int i2 = intValue + 1;
                                    int i3 = intValue + 2;
                                    if (adapterPosition == intValue - 2 || adapterPosition == i2 || adapterPosition == i3) {
                                        return;
                                    }
                                } else if (intValue2 == 1) {
                                    int i4 = intValue - 1;
                                    int i5 = intValue + 2;
                                    if (adapterPosition == intValue - 2 || adapterPosition == i4 || adapterPosition == i5) {
                                        return;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        com.ss.android.ugc.aweme.discover.mixfeed.cs.a aVar2 = cVar.f81966j;
                        if (aVar2 != null) {
                            aVar2.f81695a = cVar.t;
                            aVar2.b();
                        }
                    }
                }
            }
        }
    }

    public final void a(GlobalDoodleConfig globalDoodleConfig) {
        if (globalDoodleConfig != null) {
            this.f81327k = globalDoodleConfig;
        }
    }

    public final void a(FollowStatus followStatus) {
        if (!(this.f76354l == null || this.f76354l.isEmpty() || followStatus == null || TextUtils.isEmpty(followStatus.userId))) {
            for (com.ss.android.ugc.aweme.discover.mixfeed.h hVar : this.f76354l) {
                if (hVar != null) {
                    if (hVar.getAweme() != null) {
                        Aweme aweme = hVar.getAweme();
                        l.b(aweme, "");
                        a(aweme.getAuthor(), followStatus);
                    } else if (hVar.f81780b != null) {
                        List<SearchUser> list = hVar.f81780b;
                        l.b(list, "");
                        for (T t : list) {
                            l.b(t, "");
                            List<Aweme> list2 = t.awemeCards;
                            if (list2 != null) {
                                for (T t2 : list2) {
                                    l.b(t2, "");
                                    a(t2.getAuthor(), followStatus);
                                }
                            }
                        }
                    } else if (hVar.f81782d != null) {
                        List<SearchChallenge> list3 = hVar.f81782d;
                        l.b(list3, "");
                        for (T t3 : list3) {
                            l.b(t3, "");
                            List<Aweme> awemes = t3.getAwemes();
                            if (awemes != null) {
                                for (T t4 : awemes) {
                                    l.b(t4, "");
                                    a(t4.getAuthor(), followStatus);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static final class d extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f81335a;

        static {
            Covode.recordClassIndex(50537);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ViewGroup viewGroup, View view) {
            super(view);
            this.f81335a = viewGroup;
        }
    }

    private static void a(User user, FollowStatus followStatus) {
        if (user != null && l.a((Object) followStatus.userId, (Object) user.getUid())) {
            user.setFollowStatus(followStatus.followStatus);
        }
    }

    private final void a(List<? extends com.ss.android.ugc.aweme.discover.mixfeed.h> list, List<? extends com.ss.android.ugc.aweme.discover.mixfeed.h> list2) {
        if (list == null || list2 == null) {
            notifyDataSetChanged();
        } else if (list.size() > list2.size()) {
            notifyDataSetChanged();
        } else {
            int i2 = 0;
            while (i2 < list.size() && list.get(i2) == list2.get(i2)) {
                i2++;
            }
            if (i2 == 0) {
                notifyDataSetChanged();
            } else {
                int size = list2.size() - i2;
                int size2 = list.size() - i2;
                if (size2 > 0) {
                    notifyItemRangeRemoved(i2, size2);
                }
                if (size > 0) {
                    notifyItemRangeInserted(i2, size);
                }
            }
            this.f81323f.b(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        Integer num;
        MethodCollector.i(3517);
        l.d(viewGroup, "");
        if (i2 == 16) {
            com.ss.android.ugc.aweme.search.l.i iVar = this.f81322e;
            RecyclerView.ViewHolder b2 = iVar.f121404c.b();
            if (b2 == null) {
                b2 = iVar.f121404c.a();
            }
            l.b(b2, "");
            MethodCollector.o(3517);
            return b2;
        } else if (i2 == 48) {
            com.ss.android.ugc.aweme.discover.mixfeed.e.d a2 = d.a.a(viewGroup);
            MethodCollector.o(3517);
            return a2;
        } else if (i2 == 96) {
            com.ss.android.ugc.aweme.search.l.i iVar2 = this.f81322e;
            RecyclerView.ViewHolder b3 = iVar2.f121403b.b();
            if (b3 == null) {
                b3 = iVar2.f121403b.a();
            }
            l.b(b3, "");
            MethodCollector.o(3517);
            return b3;
        } else if (i2 == 112) {
            com.ss.android.ugc.aweme.discover.mixfeed.e.c cVar = new com.ss.android.ugc.aweme.discover.mixfeed.e.c(com.ss.android.ugc.aweme.search.l.m.a(viewGroup, R.layout.aws), viewGroup.getContext());
            l.b(cVar, "");
            MethodCollector.o(3517);
            return cVar;
        } else if (i2 != 144) {
            switch (i2) {
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    com.ss.android.ugc.aweme.discover.lynx.e.a a3 = a.C1902a.a(viewGroup, new e());
                    Fragment g2 = this.f81324g.g();
                    if (g2 != null) {
                        num = Integer.valueOf(g2.hashCode());
                    } else {
                        num = null;
                    }
                    com.ss.android.ugc.aweme.search.theme.dark.b.a(num, a3);
                    MethodCollector.o(3517);
                    return a3;
                case 19:
                    l.d(viewGroup, "");
                    View a4 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.avn, viewGroup, false);
                    l.b(a4, "");
                    com.ss.android.ugc.aweme.discover.mixfeed.d.f fVar = new com.ss.android.ugc.aweme.discover.mixfeed.d.f(a4);
                    MethodCollector.o(3517);
                    return fVar;
                case v.U /*{ENCODED_INT: 20}*/:
                    com.ss.android.ugc.aweme.search.model.d dVar = this.f81318a;
                    com.ss.android.ugc.aweme.flowfeed.a.a aVar = this.f81324g;
                    l.d(viewGroup, "");
                    l.d(aVar, "");
                    l.d(this, "");
                    com.ss.android.ugc.aweme.autoplay.d.a.i iVar3 = new com.ss.android.ugc.aweme.autoplay.d.a.i(dVar, com.ss.android.ugc.aweme.search.l.m.a(viewGroup, R.layout.awg), aVar, this);
                    com.ss.android.ugc.aweme.discover.b.g gVar = this.f81319b;
                    if (gVar != null) {
                        gVar.a(iVar3);
                    }
                    MethodCollector.o(3517);
                    return iVar3;
                case 21:
                    com.ss.android.ugc.aweme.flowfeed.a.a aVar2 = this.f81324g;
                    com.ss.android.ugc.aweme.discover.b.g gVar2 = this.f81319b;
                    l.d(viewGroup, "");
                    l.d(aVar2, "");
                    l.d(this, "");
                    com.ss.android.ugc.aweme.autoplay.b.g gVar3 = new com.ss.android.ugc.aweme.autoplay.b.g(com.ss.android.ugc.aweme.search.l.m.a(viewGroup, R.layout.awh), aVar2, this, gVar2);
                    com.ss.android.ugc.aweme.discover.b.g gVar4 = this.f81319b;
                    if (gVar4 != null) {
                        gVar4.a(gVar3);
                    }
                    MethodCollector.o(3517);
                    return gVar3;
                default:
                    d dVar2 = new d(viewGroup, new View(viewGroup.getContext()));
                    MethodCollector.o(3517);
                    return dVar2;
            }
        } else {
            com.ss.android.ugc.aweme.discover.mixfeed.e.b a5 = b.a.a(viewGroup);
            MethodCollector.o(3517);
            return a5;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0104, code lost:
        if (r1 == 144) goto L_0x011c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0301 A[Catch:{ all -> 0x0576 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x030b A[Catch:{ all -> 0x0576 }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x030c A[Catch:{ all -> 0x0576 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0314 A[Catch:{ all -> 0x0576 }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0315 A[Catch:{ all -> 0x0576 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0321 A[Catch:{ all -> 0x0576 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0354 A[Catch:{ all -> 0x0576 }] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x05a3  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x05ab  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012d  */
    @Override // com.ss.android.ugc.aweme.common.a.l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.recyclerview.widget.RecyclerView.ViewHolder r24, int r25) {
        /*
        // Method dump skipped, instructions count: 1470
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.jedi.a.c.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public final void a(int i2, int i3, androidx.core.g.a<RecyclerView.ViewHolder> aVar) {
        this.f81323f.postDelayed(new b(this, i2, i3, aVar), (long) (i3 * 10));
    }

    public c(RecyclerView recyclerView, com.ss.android.ugc.aweme.flowfeed.a.a aVar, com.ss.android.ugc.aweme.search.d.c cVar, com.ss.android.ugc.aweme.search.d.b bVar) {
        l.d(recyclerView, "");
        l.d(aVar, "");
        l.d(cVar, "");
        l.d(bVar, "");
        this.f81323f = recyclerView;
        this.f81324g = aVar;
        this.x = cVar;
        this.f81322e = new com.ss.android.ugc.aweme.search.l.i(recyclerView, this);
        this.s = new GridLayoutManager.c(this) {
            /* class com.ss.android.ugc.aweme.discover.jedi.a.c.AnonymousClass1 */

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ c f81328e;

            /* renamed from: f  reason: collision with root package name */
            private final int f81329f = 1;

            /* renamed from: g  reason: collision with root package name */
            private final int f81330g = 2;

            static {
                Covode.recordClassIndex(50533);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f81328e = r2;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public final int a(int i2) {
                if (com.ss.android.ugc.aweme.discover.mixfeed.a.b.f81632a.contains(Integer.valueOf(this.f81328e.c(i2)))) {
                    return this.f81329f;
                }
                return this.f81330g;
            }
        };
        if (com.ss.android.ugc.aweme.search.l.g.a()) {
            com.ss.android.ugc.aweme.search.l.g.f121387a.submit(g.b.f121392a);
        }
        this.f81325i = new com.ss.android.ugc.aweme.search.d.d(SettingsManager.a().a("general_search_load_more_remains", 0), bVar);
        this.w = new com.bytedance.jedi.arch.ext.list.a.b<>(this, new a(), (byte) 0);
    }
}
