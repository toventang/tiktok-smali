package com.ss.android.ugc.aweme.story.d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.StoryKt;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.feed.x.m;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.b;
import com.ss.android.ugc.aweme.story.g;
import com.ss.android.ugc.aweme.utils.hk;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.utils.y;
import h.a.n;
import h.f.b.l;
import java.util.List;
import java.util.TimeZone;

public final class a {
    static {
        Covode.recordClassIndex(89558);
    }

    private static boolean a(User user) {
        if (user == null || user.isBlock || user.isBlocked()) {
            return true;
        }
        return false;
    }

    public static final boolean e(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 5457744) {
            return false;
        }
        return true;
    }

    public static final boolean a(String str) {
        String str2;
        User c2 = in.c();
        if (c2 != null) {
            str2 = c2.getUid();
        } else {
            str2 = null;
        }
        return TextUtils.equals(str, str2);
    }

    public static final boolean c(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 40 || aweme.getUserStory() == null) {
            return false;
        }
        return true;
    }

    public static final boolean d(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 40 || aweme.getStory() == null) {
            return false;
        }
        return true;
    }

    public static final boolean f(Aweme aweme) {
        Story story;
        if (!d(aweme) || aweme == null || (story = aweme.getStory()) == null || !story.isOfficial()) {
            return false;
        }
        return true;
    }

    public static final boolean h(Aweme aweme) {
        Story story;
        if (!d(aweme) || aweme == null || (story = aweme.getStory()) == null || !story.isPublishing()) {
            return false;
        }
        return true;
    }

    public static final boolean k(Aweme aweme) {
        if (aweme == null) {
            return true;
        }
        Boolean.valueOf(aweme.isStoryFakeAweme());
        if (aweme.isStoryFakeAweme()) {
            return true;
        }
        return false;
    }

    public static final String a(Aweme aweme) {
        String authorUid;
        l.d(aweme, "");
        if (!hk.a(aweme.getAuthorUid())) {
            String authorUid2 = aweme.getAuthorUid();
            l.b(authorUid2, "");
            return authorUid2;
        }
        UserStory userStory = aweme.getUserStory();
        if (userStory == null) {
            return "";
        }
        l.b(userStory, "");
        if (userStory.getStories().size() <= 0 || (authorUid = userStory.getStories().get(0).getAuthorUid()) == null) {
            return "";
        }
        return authorUid;
    }

    public static final boolean g(Aweme aweme) {
        Integer valueOf;
        if (aweme == null || (valueOf = Integer.valueOf(aweme.getAwemeType())) == null) {
            return false;
        }
        if (valueOf.intValue() == 5457744 || valueOf.intValue() == 40) {
            return true;
        }
        return false;
    }

    public static final Aweme i(Aweme aweme) {
        UserStory userStory;
        if (c(aweme)) {
            if (!(aweme == null || (userStory = aweme.getUserStory()) == null)) {
                l.b(userStory, "");
                if (UserStoryKt.currentStory(userStory) != null) {
                    return UserStoryKt.currentStory(userStory);
                }
                if (userStory.getStories().size() > 0) {
                    return userStory.getStories().get(0);
                }
            }
            return null;
        } else if (d(aweme)) {
            return aweme;
        } else {
            return null;
        }
    }

    public static final boolean j(Aweme aweme) {
        Aweme i2;
        Story story;
        Story story2;
        if (d(aweme)) {
            if (aweme == null || (story2 = aweme.getStory()) == null) {
                return false;
            }
            return StoryKt.isExpired(story2);
        } else if (!c(aweme) || (i2 = i(aweme)) == null || (story = i2.getStory()) == null) {
            return false;
        } else {
            return StoryKt.isExpired(story);
        }
    }

    public static final boolean m(Aweme aweme) {
        if (!g(aweme)) {
            return true;
        }
        if (!m.a(aweme) && !h(aweme) && !f(aweme) && !e(aweme) && !y.f(aweme)) {
            return true;
        }
        return false;
    }

    public static final String a(Throwable th) {
        String concat = "error: ".concat(String.valueOf(th));
        if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            return concat + ", detail: " + ((com.ss.android.ugc.aweme.base.api.a.b.a) th).getResponse();
        }
        return concat;
    }

    public static final String b(Aweme aweme) {
        l.d(aweme, "");
        if (!g(aweme)) {
            return "";
        }
        String a2 = a(aweme);
        TimeZone timeZone = TimeZone.getDefault();
        l.b(timeZone, "");
        long currentTimeMillis = ((System.currentTimeMillis() / 86400000) * 86400000) - ((long) timeZone.getRawOffset());
        String valueOf = String.valueOf(currentTimeMillis - 86400000);
        return a2 + valueOf + String.valueOf(currentTimeMillis + 86400000);
    }

    public static final boolean n(Aweme aweme) {
        String str;
        List<Aweme> stories;
        l.d(aweme, "");
        UserStory userStory = aweme.getUserStory();
        if (userStory != null) {
            User author = aweme.getAuthor();
            if (author != null) {
                str = author.getUid();
            } else {
                str = null;
            }
            if ((!a(str) || !(!g.f137757a.f().a().isEmpty())) && (userStory.getTotalCount() < 1 || ((((stories = userStory.getStories()) == null || stories.isEmpty()) && !userStory.getHasMoreBefore() && !userStory.getHasMoreAfter()) || a(aweme.getAuthor())))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final Aweme l(Aweme aweme) {
        boolean z;
        l.d(aweme, "");
        if (aweme.getAwemeType() != 40 || aweme.getUserStory() != null) {
            return aweme;
        }
        Aweme aweme2 = new Aweme();
        aweme2.setAid(aweme.getAuthorUid());
        Aweme a2 = AwemeService.b().a(aweme);
        l.b(a2, "");
        List c2 = n.c(a2);
        Story story = aweme.getStory();
        if (story != null) {
            z = story.getViewed();
        } else {
            z = false;
        }
        UserStory userStory = new UserStory(c2, 1, 0, z, 0, 0, false, false, 0, 1, null, false, false, true, 7668, null);
        com.ss.android.ugc.aweme.story.j.a.b("huangxin.2020", "origin total count: " + userStory.getOriginTotalCount() + ", user story instance: " + System.identityHashCode(userStory));
        aweme2.setUserStory(userStory);
        aweme2.setAwemeType(40);
        aweme2.setAuthor(aweme.getAuthor());
        aweme2.setRequestId(aweme.getRequestId());
        return aweme2;
    }

    public static final boolean a(UserStory userStory) {
        l.d(userStory, "");
        if (userStory.getTotalCount() != 0 || userStory.getStories().size() != 0 || userStory.getHasMoreAfter() || userStory.getHasMoreBefore() || !g.f137757a.f().a().isEmpty()) {
            return false;
        }
        return true;
    }

    public static final void a(List<? extends Aweme> list, String str) {
        l.d(list, "");
        for (T t : list) {
            if (c(t)) {
                b e2 = g.f137757a.e();
                if (t == null) {
                    l.b();
                }
                e2.a(t, true, str);
                UserStory userStory = t.getUserStory();
                if (userStory != null) {
                    userStory.setShouldShowGuide(g.f137757a.a((Aweme) t));
                }
            }
        }
    }
}
