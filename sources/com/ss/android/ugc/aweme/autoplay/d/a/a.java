package com.ss.android.ugc.aweme.autoplay.d.a;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.autoplay.d.k;
import com.ss.android.ugc.aweme.autoplay.player.video.SearchVideoView;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.discover.helper.ae;
import com.ss.android.ugc.aweme.discover.m.b;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.flowfeed.utils.g;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a<T> implements b.a<ag> {

    /* renamed from: a  reason: collision with root package name */
    final Map<String, p<Integer, Aweme>> f67319a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f67320b;

    /* renamed from: c  reason: collision with root package name */
    private final h f67321c = i.a((h.f.a.a) C1518a.f67322a);

    static {
        Covode.recordClassIndex(41462);
    }

    /* access modifiers changed from: package-private */
    public final IAwemeService b() {
        return (IAwemeService) this.f67321c.getValue();
    }

    @Override // com.ss.android.ugc.aweme.discover.m.b.a
    public final Class<ag> a() {
        return ag.class;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.a$a  reason: collision with other inner class name */
    static final class C1518a extends m implements h.f.a.a<IAwemeService> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1518a f67322a = new C1518a();

        static {
            Covode.recordClassIndex(41463);
        }

        C1518a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IAwemeService invoke() {
            return AwemeService.b();
        }
    }

    public a(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        this.f67320b = recyclerView;
        ae.f81066a.a((b.a<?>) this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.discover.m.b.a
    public final /* synthetic */ void a(ag agVar) {
        SearchVideoView l2;
        g mScrollStateManager;
        Integer valueOf;
        ag agVar2 = agVar;
        l.d(agVar2, "");
        if (agVar2.f93450a == 13) {
            IAwemeService b2 = b();
            String str = (String) agVar2.f93451b;
            if (str == null) {
                str = "";
            }
            Aweme b3 = b2.b(str);
            Iterator<T> it = this.f67319a.entrySet().iterator();
            while (it.hasNext()) {
                Aweme aweme = (Aweme) ((p) it.next().getValue()).getSecond();
                if (l.a((Object) aweme.getAid(), agVar2.f93451b)) {
                    Bundle bundle = agVar2.f93452c;
                    if (!(bundle == null || (valueOf = Integer.valueOf(bundle.getInt("user_digged"))) == null)) {
                        aweme.setUserDigg(valueOf.intValue());
                    }
                    if (b3 != null) {
                        aweme.setUserDigg(b3.getUserDigg());
                        AwemeStatistics statistics = b3.getStatistics();
                        if (statistics != null) {
                            long diggCount = statistics.getDiggCount();
                            AwemeStatistics statistics2 = aweme.getStatistics();
                            l.b(statistics2, "");
                            statistics2.setDiggCount(diggCount);
                        }
                    }
                }
            }
            p<Integer, Aweme> pVar = this.f67319a.get(agVar2.f93451b);
            if (pVar != null) {
                RecyclerView.ViewHolder f2 = this.f67320b.f(pVar.getFirst().intValue());
                if (!(f2 == null || !(f2 instanceof f) || (l2 = ((k) f2).l()) == null || (mScrollStateManager = l2.getMScrollStateManager()) == null)) {
                    mScrollStateManager.b(l2.getMScrollStateObserver());
                }
                RecyclerView.a adapter = this.f67320b.getAdapter();
                if (adapter != null) {
                    adapter.notifyItemChanged(pVar.getFirst().intValue());
                }
            }
        }
    }
}
