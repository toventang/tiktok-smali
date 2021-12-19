package com.ss.android.ugc.aweme.discover.adapter;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.ss.android.ugc.aweme.discover.model.TrendingTopicOrAd;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import h.f.b.l;
import h.n;
import java.util.List;

public final class h extends j.e<DiscoverSectionItem> {
    static {
        Covode.recordClassIndex(50115);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.j.e
    public final /* synthetic */ boolean a(DiscoverSectionItem discoverSectionItem, DiscoverSectionItem discoverSectionItem2) {
        l.d(discoverSectionItem, "");
        l.d(discoverSectionItem2, "");
        return l.a(discoverSectionItem, discoverSectionItem2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.j.e
    public final /* synthetic */ boolean b(DiscoverSectionItem discoverSectionItem, DiscoverSectionItem discoverSectionItem2) {
        DiscoverSectionItem discoverSectionItem3 = discoverSectionItem;
        DiscoverSectionItem discoverSectionItem4 = discoverSectionItem2;
        l.d(discoverSectionItem3, "");
        l.d(discoverSectionItem4, "");
        Object obj = null;
        if (discoverSectionItem3 instanceof DiscoverSectionItem.SuggestSearchSection) {
            SuggestWordResponse suggestWordResponse = ((DiscoverSectionItem.SuggestSearchSection) discoverSectionItem3).suggestSearch;
            if (!(discoverSectionItem4 instanceof DiscoverSectionItem.SuggestSearchSection)) {
                discoverSectionItem4 = null;
            }
            DiscoverSectionItem.SuggestSearchSection suggestSearchSection = (DiscoverSectionItem.SuggestSearchSection) discoverSectionItem4;
            if (suggestSearchSection != null) {
                obj = suggestSearchSection.suggestSearch;
            }
            return l.a(suggestWordResponse, obj);
        } else if (discoverSectionItem3 instanceof DiscoverSectionItem.BannerSection) {
            List<Banner> list = ((DiscoverSectionItem.BannerSection) discoverSectionItem3).bannerList;
            if (!(discoverSectionItem4 instanceof DiscoverSectionItem.BannerSection)) {
                discoverSectionItem4 = null;
            }
            DiscoverSectionItem.BannerSection bannerSection = (DiscoverSectionItem.BannerSection) discoverSectionItem4;
            if (bannerSection != null) {
                obj = bannerSection.bannerList;
            }
            return l.a(list, obj);
        } else if (discoverSectionItem3 instanceof DiscoverSectionItem.TrendingTopicOrAdSection) {
            TrendingTopicOrAd trendingTopicOrAd = ((DiscoverSectionItem.TrendingTopicOrAdSection) discoverSectionItem3).trendingTopicOrAd;
            if (!(discoverSectionItem4 instanceof DiscoverSectionItem.TrendingTopicOrAdSection)) {
                discoverSectionItem4 = null;
            }
            DiscoverSectionItem.TrendingTopicOrAdSection trendingTopicOrAdSection = (DiscoverSectionItem.TrendingTopicOrAdSection) discoverSectionItem4;
            if (trendingTopicOrAdSection != null) {
                obj = trendingTopicOrAdSection.trendingTopicOrAd;
            }
            return l.a(trendingTopicOrAd, obj);
        } else {
            throw new n();
        }
    }
}
