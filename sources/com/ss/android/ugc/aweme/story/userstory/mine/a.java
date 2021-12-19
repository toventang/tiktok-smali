package com.ss.android.ugc.aweme.story.userstory.mine;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.userstory.b;
import com.ss.android.ugc.aweme.utils.hl;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;
import java.util.ArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Aweme f138515a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f138516b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(90605);
    }

    public static Aweme a() {
        if (f138515a == null) {
            f138515a = b();
        }
        Aweme aweme = f138515a;
        if (aweme == null) {
            l.b();
        }
        Aweme clone = aweme.clone();
        l.b(clone, "");
        return clone;
    }

    private static Aweme b() {
        Aweme aweme = new Aweme();
        User c2 = in.c();
        String str = "";
        l.b(c2, str);
        String uid = c2.getUid();
        if (uid != null) {
            str = uid;
        }
        aweme.setAid(str);
        aweme.setAuthor(c2);
        aweme.setAwemeType(40);
        aweme.setUserStory(new UserStory(new ArrayList(), 0, 0, false, 0, 0, false, false, 0, 0, null, false, true, false, 12284, null));
        return aweme;
    }

    public static void a(UserStory userStory) {
        UserStory userStory2;
        l.d(userStory, "");
        if (!userStory.getFakeAwemeShell()) {
            Aweme aweme = f138515a;
            if (aweme != null) {
                userStory2 = aweme.getUserStory();
            } else {
                userStory2 = null;
            }
            Aweme aweme2 = f138515a;
            if (aweme2 != null) {
                aweme2.setUserStory(userStory);
            }
            b bVar = b.f138510c;
            Aweme aweme3 = f138515a;
            if (aweme3 == null) {
                aweme3 = b();
                aweme3.setUserStory(userStory);
            }
            bVar.a(userStory2, userStory, aweme3);
        }
    }

    public static void a(Aweme aweme) {
        String uid;
        UserStory userStory;
        l.d(aweme, "");
        l.d(aweme, "");
        User author = aweme.getAuthor();
        UserStory userStory2 = null;
        if (author != null && (uid = author.getUid()) != null && hl.a(uid) && (userStory = aweme.getUserStory()) != null && !userStory.getFakeAwemeShell()) {
            Aweme aweme2 = f138515a;
            if (aweme2 != null) {
                userStory2 = aweme2.getUserStory();
            }
            f138515a = aweme;
            b bVar = b.f138510c;
            UserStory userStory3 = aweme.getUserStory();
            if (userStory3 == null) {
                l.b();
            }
            l.b(userStory3, "");
            Aweme aweme3 = f138515a;
            if (aweme3 == null) {
                aweme3 = b();
                aweme3.setUserStory(aweme3.getUserStory());
            }
            bVar.a(userStory2, userStory3, aweme3);
        }
    }
}
