package com.ss.android.ugc.aweme.story.userstory;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.c.b;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class c {
    static {
        Covode.recordClassIndex(90601);
    }

    public static final void a(Aweme aweme, String str) {
        boolean z;
        int currentPosition;
        AwemeStatistics statistics;
        long j2;
        List<Aweme> stories;
        Aweme aweme2;
        List<Aweme> stories2;
        Aweme aweme3;
        UserStory userStory;
        l.d(aweme, "");
        UserStory userStory2 = aweme.getUserStory();
        if (userStory2 == null || userStory2.getFakeAwemeShell() || (userStory = aweme.getUserStory()) == null || userStory.getFakeSelfStoryCollection()) {
            z = false;
        } else {
            z = true;
        }
        if (aweme.getAid() == null) {
            aweme.setAid("");
        }
        Aweme aweme4 = null;
        if (aweme.getAuthor() == null) {
            UserStory userStory3 = aweme.getUserStory();
            aweme.setAuthor((userStory3 == null || (stories2 = userStory3.getStories()) == null || (aweme3 = (Aweme) n.h((List) stories2)) == null) ? null : aweme3.getAuthor());
        }
        if (aweme.getHybridLabels() == null) {
            UserStory userStory4 = aweme.getUserStory();
            aweme.setHybridLabels((userStory4 == null || (stories = userStory4.getStories()) == null || (aweme2 = (Aweme) n.h((List) stories)) == null) ? null : aweme2.getHybridLabels());
        }
        UserStory userStory5 = aweme.getUserStory();
        if (userStory5 != null) {
            List<Aweme> stories3 = userStory5.getStories();
            User author = aweme.getAuthor();
            List<AwemeHybridLabelModel> hybridLabels = aweme.getHybridLabels();
            l.d(stories3, "");
            ArrayList<Aweme> arrayList = new ArrayList(n.a((Iterable) stories3, 10));
            int i2 = 0;
            for (T t : stories3) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    n.a();
                }
                Aweme a2 = a.f138506a.a((Aweme) t);
                l.b(a2, "");
                stories3.set(i2, a2);
                arrayList.add(stories3.get(i2));
                i2 = i3;
            }
            for (Aweme aweme5 : arrayList) {
                if (b.e() && (statistics = aweme5.getStatistics()) != null) {
                    Story story = aweme5.getStory();
                    if (story != null) {
                        j2 = story.getTotalComments();
                    } else {
                        j2 = 0;
                    }
                    statistics.setCommentCount(j2);
                }
                if (author != null) {
                    aweme5.setAuthor(author);
                }
                if (str != null) {
                    aweme5.setRequestId(str);
                }
                aweme5.setUserStory(null);
                if (hybridLabels != null) {
                    aweme5.setHybridLabels(hybridLabels);
                }
            }
            Integer currentIndex = UserStoryKt.currentIndex(userStory5);
            if (currentIndex != null) {
                currentPosition = currentIndex.intValue();
            } else {
                currentPosition = (int) userStory5.getCurrentPosition();
            }
            Integer valueOf = Integer.valueOf(currentPosition);
            if (userStory5.getStories().size() > 0 && (aweme4 = UserStoryKt.currentStory(userStory5)) == null) {
                aweme4 = userStory5.getStories().get(0);
            }
            userStory5.setCurrentInfo(new UserStoryCurrentInfo(valueOf, aweme4));
            if (z) {
                userStory5.setOriginTotalCount(userStory5.getTotalCount());
            }
        }
        if (str != null) {
            aweme.setRequestId(str);
        }
    }
}
