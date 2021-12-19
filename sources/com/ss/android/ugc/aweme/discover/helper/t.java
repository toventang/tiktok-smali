package com.ss.android.ugc.aweme.discover.helper;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.discover.m.b;
import com.ss.android.ugc.aweme.discover.model.ContinuousLoadingAwemeList;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class t<T> implements b.a<ag> {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView.a<?> f81174a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, p<Integer, Aweme>> f81175b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final h f81176c = i.a((h.f.a.a) a.f81177a);

    static {
        Covode.recordClassIndex(50453);
    }

    private final IAwemeService b() {
        return (IAwemeService) this.f81176c.getValue();
    }

    @Override // com.ss.android.ugc.aweme.discover.m.b.a
    public final Class<ag> a() {
        return ag.class;
    }

    static final class a extends m implements h.f.a.a<IAwemeService> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f81177a = new a();

        static {
            Covode.recordClassIndex(50454);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IAwemeService invoke() {
            return AwemeService.b();
        }
    }

    public t(RecyclerView.a<?> aVar) {
        l.d(aVar, "");
        this.f81174a = aVar;
        ae.f81066a.a((b.a<?>) this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.discover.m.b.a
    public final /* synthetic */ void a(ag agVar) {
        Integer valueOf;
        Integer valueOf2;
        ag agVar2 = agVar;
        l.d(agVar2, "");
        if (agVar2.f93450a == 13) {
            IAwemeService b2 = b();
            String str = (String) agVar2.f93451b;
            if (str == null) {
                str = "";
            }
            Aweme b3 = b2.b(str);
            Iterator<T> it = this.f81175b.entrySet().iterator();
            while (it.hasNext()) {
                Aweme aweme = (Aweme) ((p) it.next().getValue()).getSecond();
                if (l.a((Object) aweme.getAid(), agVar2.f93451b)) {
                    Bundle bundle = agVar2.f93452c;
                    if (!(bundle == null || (valueOf2 = Integer.valueOf(bundle.getInt("user_digged"))) == null)) {
                        aweme.setUserDigg(valueOf2.intValue());
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
            Iterator<T> it2 = x.f81194b.entrySet().iterator();
            while (it2.hasNext()) {
                List<Aweme> list = ((ContinuousLoadingAwemeList) it2.next().getValue()).awemeList;
                if (list != null) {
                    for (T t : list) {
                        if (l.a((Object) t.getAid(), agVar2.f93451b)) {
                            Bundle bundle2 = agVar2.f93452c;
                            if (!(bundle2 == null || (valueOf = Integer.valueOf(bundle2.getInt("user_digged"))) == null)) {
                                t.setUserDigg(valueOf.intValue());
                            }
                            if (b3 != null) {
                                t.setUserDigg(b3.getUserDigg());
                                AwemeStatistics statistics3 = b3.getStatistics();
                                if (statistics3 != null) {
                                    long diggCount2 = statistics3.getDiggCount();
                                    AwemeStatistics statistics4 = t.getStatistics();
                                    l.b(statistics4, "");
                                    statistics4.setDiggCount(diggCount2);
                                }
                            }
                        }
                    }
                }
            }
            p<Integer, Aweme> pVar = this.f81175b.get(agVar2.f93451b);
            if (pVar != null) {
                this.f81174a.notifyItemChanged(pVar.getFirst().intValue());
            }
        }
    }

    public final void a(List<? extends T> list, h.f.a.b<? super T, ? extends Aweme> bVar) {
        l.d(bVar, "");
        this.f81175b.clear();
        if (list != null) {
            int i2 = 0;
            for (T t : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    n.a();
                }
                Aweme aweme = (Aweme) bVar.invoke(t);
                if (aweme != null) {
                    Map<String, p<Integer, Aweme>> map = this.f81175b;
                    String aid = aweme.getAid();
                    l.b(aid, "");
                    map.put(aid, new p<>(Integer.valueOf(i2), aweme));
                    b().a(aweme);
                }
                i2 = i3;
            }
        }
    }
}
