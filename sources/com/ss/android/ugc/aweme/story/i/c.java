package com.ss.android.ugc.aweme.story.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.c.b;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class c {
    static {
        Covode.recordClassIndex(90154);
    }

    public static /* synthetic */ List a(List list, String str, User user, List list2, int i2) {
        List list3 = list2;
        if ((i2 & 4) != 0) {
            list3 = null;
        }
        return a(list, str, user, list3, null, null);
    }

    public static final List<Aweme> a(List<Aweme> list, String str, User user, List<AwemeHybridLabelModel> list2, MutualStruct mutualStruct, AwemeRelationRecommendModel awemeRelationRecommendModel) {
        AwemeStatistics statistics;
        long j2;
        l.d(list, "");
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        int i2 = 0;
        for (T t : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            Aweme a2 = a.f137797a.a((Aweme) t);
            l.b(a2, "");
            list.set(i2, a2);
            arrayList.add(list.get(i2));
            i2 = i3;
        }
        ArrayList<Aweme> arrayList2 = arrayList;
        for (Aweme aweme : arrayList2) {
            if (b.e() && (statistics = aweme.getStatistics()) != null) {
                Story story = aweme.getStory();
                if (story != null) {
                    j2 = story.getTotalComments();
                } else {
                    j2 = 0;
                }
                statistics.setCommentCount(j2);
            }
            if (user != null) {
                aweme.setAuthor(user);
            }
            if (str != null) {
                aweme.setRequestId(str);
            }
            aweme.setUserStory(null);
            if (list2 != null) {
                aweme.setHybridLabels(list2);
            }
            if (mutualStruct != null) {
                aweme.setMutualRelation(mutualStruct);
            }
            if (awemeRelationRecommendModel != null) {
                aweme.setRelationRecommendInfo(awemeRelationRecommendModel);
            }
        }
        return arrayList2;
    }
}
