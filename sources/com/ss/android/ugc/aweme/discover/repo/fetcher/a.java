package com.ss.android.ugc.aweme.discover.repo.fetcher;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.discover.model.BannerList;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import f.a.ab;
import f.a.d.g;
import h.f.b.l;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f81996a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(51038);
    }

    static final class b<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final b f81998a = new b();

        static {
            Covode.recordClassIndex(51040);
        }

        b() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            l.d(list, "");
            return new DiscoverSectionItem.BannerSection(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.a$a  reason: collision with other inner class name */
    static final class C1917a<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final C1917a f81997a = new C1917a();

        static {
            Covode.recordClassIndex(51039);
        }

        C1917a() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            String str;
            BannerList bannerList = (BannerList) obj;
            l.d(bannerList, "");
            LogPbBean logPbBean = bannerList.logPb;
            if (logPbBean != null) {
                str = logPbBean.getImprId();
            } else {
                str = null;
            }
            for (Banner banner : bannerList.items) {
                banner.setRequestId(str);
            }
            return ab.a(bannerList.items);
        }
    }
}
