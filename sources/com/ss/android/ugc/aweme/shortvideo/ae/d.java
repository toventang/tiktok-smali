package com.ss.android.ugc.aweme.shortvideo.ae;

import com.bytedance.covode.number.Covode;
import com.google.c.a.f;
import com.ss.android.ugc.aweme.challenge.model.SearchSugChallengeList;
import com.ss.android.ugc.aweme.common.LogPbBean;
import com.ss.android.ugc.aweme.shortvideo.ae.e;
import com.ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;
import com.ss.android.ugc.aweme.shortvideo.model.RecommendWordMob;

public final class d implements f<SearchSugChallengeList, AVSearchChallengeList> {
    static {
        Covode.recordClassIndex(82056);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.c.a.f
    public final /* bridge */ /* synthetic */ AVSearchChallengeList a(SearchSugChallengeList searchSugChallengeList) {
        return a(searchSugChallengeList);
    }

    public static AVSearchChallengeList a(SearchSugChallengeList searchSugChallengeList) {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (searchSugChallengeList == null) {
            return null;
        }
        AVSearchChallengeList aVSearchChallengeList = new AVSearchChallengeList();
        aVSearchChallengeList.items = e.a.a(searchSugChallengeList.items);
        aVSearchChallengeList.keyword = searchSugChallengeList.keyword;
        LogPbBean logPbBean = new LogPbBean();
        LogPbBean logPbBean2 = searchSugChallengeList.logPb;
        if (logPbBean2 != null) {
            str = logPbBean2.getImprId();
        } else {
            str = null;
        }
        logPbBean.setImprId(str);
        aVSearchChallengeList.logPb = logPbBean;
        aVSearchChallengeList.isMatch = searchSugChallengeList.isMatch;
        RecommendWordMob recommendWordMob = new RecommendWordMob();
        com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob recommendWordMob2 = searchSugChallengeList.recommendWordMob;
        if (recommendWordMob2 != null) {
            str2 = recommendWordMob2.getInfo();
        } else {
            str2 = null;
        }
        recommendWordMob.setInfo(str2);
        com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob recommendWordMob3 = searchSugChallengeList.recommendWordMob;
        if (recommendWordMob3 != null) {
            str3 = recommendWordMob3.getWordsSource();
        } else {
            str3 = null;
        }
        recommendWordMob.setWordsSource(str3);
        com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob recommendWordMob4 = searchSugChallengeList.recommendWordMob;
        if (recommendWordMob4 != null) {
            str4 = recommendWordMob4.getQueryId();
        }
        recommendWordMob.setQueryId(str4);
        aVSearchChallengeList.recommendWordMob = recommendWordMob;
        return aVSearchChallengeList;
    }
}
