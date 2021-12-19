package com.ss.android.ugc.aweme.story.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.c.b;
import com.ss.android.ugc.aweme.story.d.a;
import com.ss.android.ugc.aweme.utils.hk;
import h.f.b.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static String f136850a = "system";

    /* renamed from: b  reason: collision with root package name */
    public static String f136851b = "auto";

    /* renamed from: c  reason: collision with root package name */
    public static final h f136852c = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(89438);
    }

    public static void a(String str) {
        l.d(str, "");
        f136850a = str;
    }

    public static void b(String str) {
        l.d(str, "");
        f136851b = str;
    }

    public static int a(User user) {
        if (user == null) {
            return -1;
        }
        if (user.getFollowStatus() == 2) {
            return 2;
        }
        if (user.getFollowStatus() == 1) {
            return 1;
        }
        if (user.getFollowerStatus() == 1) {
            return 3;
        }
        return 0;
    }

    public static void c(String str) {
        l.d(str, "");
        r.a("publish_retry_show", new d().a("creation_id", str).a("is_story", 1).f66730a);
    }

    public static d a(d dVar, Aweme aweme) {
        l.d(dVar, "");
        if (aweme == null) {
            return dVar;
        }
        if (a.g(aweme)) {
            dVar.a("story_type", "story");
            dVar.a("story_collection_id", a.b(aweme));
        } else {
            dVar.a("story_type", UGCMonitor.TYPE_POST);
        }
        dVar.a("follow_status", a(aweme.getAuthor()));
        return dVar;
    }

    public static <T extends c<?>> T a(T t, Aweme aweme) {
        l.d(t, "");
        if (aweme == null || !a.g(aweme)) {
            return t;
        }
        t.a("story_type", "story");
        t.a("story_collection_id", a.b(aweme));
        return t;
    }

    public static void a(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        r.a("publish_retry", new d().a("creation_id", str).a("enter_from", str2).a("action_type", str3).a("is_story", 1).f66730a);
    }

    private static void b(String str, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        r.a("story_post_guide", new d().a("enter_from", str).a("enter_method", str4).a("story_collection_id", (String) null).a(StringSet.type, str2).a("group_id", (String) null).a("action_type", str3).f66730a);
    }

    public static void a(String str, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        r.a("story_post_guide", new d().a("enter_from", str).a(StringSet.type, str2).a("action_type", str4).a("enter_method", str3).f66730a);
    }

    public static /* synthetic */ void a(String str, String str2, String str3, String str4, int i2) {
        if ((i2 & 32) != 0) {
            str4 = f136851b;
        }
        b(str, str2, str3, str4);
    }

    public static <T extends c<?>> T a(T t, Aweme aweme, Aweme aweme2, String str, Boolean bool, String str2) {
        int i2;
        long j2;
        Integer currentIndex;
        l.d(t, "");
        l.d(str, "");
        if (aweme == null || aweme2 == null || !a.c(aweme) || !a.d(aweme2)) {
            return t;
        }
        t.a("story_type", "story");
        UserStory userStory = aweme.getUserStory();
        int i3 = 0;
        if (userStory != null) {
            i2 = (int) userStory.getCurrentPosition();
        } else {
            i2 = 0;
        }
        t.a("story_start_num", i2);
        UserStory userStory2 = aweme.getUserStory();
        if (!(userStory2 == null || (currentIndex = UserStoryKt.currentIndex(userStory2)) == null)) {
            i3 = currentIndex.intValue();
        }
        t.a("story_current_num", i3);
        t.a("story_collection_id", a.b(aweme2));
        UserStory userStory3 = aweme.getUserStory();
        if (userStory3 != null) {
            j2 = userStory3.getTotalCount();
        } else {
            j2 = 0;
        }
        t.a("item_cnt", (int) j2);
        t.a("enter_method", f136851b);
        t.a("enter_position", str);
        if (b.d() && bool != null) {
            t.a("dm_entrance_show", bool.booleanValue() ? 1 : 0);
        }
        if (hk.a(str2)) {
            t.a("enter_play_method", str2);
        }
        return t;
    }
}
