package com.ss.android.ugc.aweme.discover.helper;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.detail.g.d;
import com.ss.android.ugc.aweme.discover.api.SearchContinuousLoadingApi;
import com.ss.android.ugc.aweme.discover.m.b;
import com.ss.android.ugc.aweme.discover.model.ContinuousLoadingAwemeList;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.ae;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import h.a.n;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

public final class x implements b.a<FollowStatus> {

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<Object, ContinuousLoadingAwemeList> f81194b = new WeakHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static final a f81195c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final b f81196a;

    public interface b {
        static {
            Covode.recordClassIndex(50463);
        }

        boolean a(Aweme aweme);

        Object aJ_();

        List<Aweme> aK_();

        List<Aweme> aL_();

        int aM_();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50462);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static x a(b bVar) {
            l.d(bVar, "");
            return new x(bVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.m.b.a
    public final Class<FollowStatus> a() {
        return FollowStatus.class;
    }

    static {
        Covode.recordClassIndex(50461);
    }

    private final ContinuousLoadingAwemeList b() {
        List<Aweme> arrayList;
        Object aJ_ = this.f81196a.aJ_();
        if (aJ_ == null) {
            return null;
        }
        WeakHashMap<Object, ContinuousLoadingAwemeList> weakHashMap = f81194b;
        ContinuousLoadingAwemeList continuousLoadingAwemeList = weakHashMap.get(aJ_);
        if (continuousLoadingAwemeList != null) {
            return continuousLoadingAwemeList;
        }
        List<Aweme> aK_ = this.f81196a.aK_();
        if (aK_ != null) {
            arrayList = n.g((Collection) aK_);
        } else {
            arrayList = new ArrayList<>();
        }
        ContinuousLoadingAwemeList continuousLoadingAwemeList2 = new ContinuousLoadingAwemeList();
        continuousLoadingAwemeList2.awemeList = arrayList;
        continuousLoadingAwemeList2.cursor = arrayList.size();
        continuousLoadingAwemeList2.hasMore = 1;
        weakHashMap.put(aJ_, continuousLoadingAwemeList2);
        return continuousLoadingAwemeList2;
    }

    public x(b bVar) {
        l.d(bVar, "");
        this.f81196a = bVar;
        ae.f81066a.a((b.a<?>) this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.discover.m.b.a
    public final /* synthetic */ void a(FollowStatus followStatus) {
        FollowStatus followStatus2 = followStatus;
        l.d(followStatus2, "");
        Iterator<T> it = f81194b.entrySet().iterator();
        while (it.hasNext()) {
            List<Aweme> list = ((ContinuousLoadingAwemeList) it.next().getValue()).awemeList;
            if (list != null) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    User author = it2.next().getAuthor();
                    if (author != null && l.a((Object) followStatus2.userId, (Object) author.getUid())) {
                        author.setFollowStatus(followStatus2.followStatus);
                    }
                }
            }
        }
    }

    private final List<Aweme> a(List<Aweme> list, Aweme aweme) {
        int i2;
        int i3 = -1;
        int i4 = 0;
        for (T t : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                n.a();
            }
            if (l.a((Object) aweme.getAid(), (Object) t.getAid())) {
                i3 = i4;
            }
            i4 = i5;
        }
        int i6 = i3 + 1;
        b bVar = this.f81196a;
        List<Aweme> list2 = null;
        int intValue = (bVar != null ? Integer.valueOf(bVar.aM_()) : null).intValue();
        if (i6 >= intValue) {
            i2 = i6 - intValue;
        } else {
            if (list.size() < intValue) {
                intValue = list.size();
            }
            i6 = intValue;
            i2 = 0;
        }
        b bVar2 = this.f81196a;
        if (bVar2 != null) {
            list2 = bVar2.aL_();
        }
        List<Aweme> g2 = n.g((Collection) list.subList(i2, i6));
        if (list2 != null && list2.size() > 0) {
            g2.addAll(0, list2);
        }
        return g2;
    }

    public final void a(ag agVar, Aweme aweme, m<? super Aweme, ? super List<Aweme>, z> mVar) {
        ContinuousLoadingAwemeList b2;
        List<Aweme> list;
        List<Aweme> a2;
        l.d(agVar, "");
        l.d(aweme, "");
        l.d(mVar, "");
        if (!(!l.a((Object) agVar.f93454e, (Object) "from_search_continuous_loading_card")) && (b2 = b()) != null && (list = b2.awemeList) != null) {
            if (this.f81196a.a(aweme)) {
                a2 = null;
            } else {
                a2 = a(list, aweme);
            }
            mVar.invoke(aweme, a2);
        }
    }

    public final void a(Context context, Bundle bundle, SearchContinuousLoadingApi.b bVar) {
        int i2;
        long j2;
        Aweme aweme;
        l.d(context, "");
        l.d(bundle, "");
        l.d(bVar, "");
        ContinuousLoadingAwemeList b2 = b();
        if (b2 != null) {
            List<Aweme> list = b2.awemeList;
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            bVar.f80796d = i2;
            List<Aweme> list2 = b2.awemeList;
            if (list2 == null || (aweme = (Aweme) n.j((List) list2)) == null) {
                j2 = 0;
            } else {
                j2 = aweme.getCreateTime();
            }
            bVar.f80798f = j2;
            d dVar = new d();
            dVar.a(b2);
            dVar.a().a(bVar);
            ae.f95296a = dVar;
            bundle.putString("video_from", "from_search_continuous_loading_card");
            SmartRouter.buildRoute(context, "//aweme/detail").withParam(bundle).open();
        }
    }
}
