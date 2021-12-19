package com.ss.android.ugc.aweme.story.userstory;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.story.base.distribution.dispatcher.c;
import h.f.b.l;
import h.k.k;
import java.util.List;

public final class b extends c<UserStory, Aweme> {

    /* renamed from: c  reason: collision with root package name */
    public static final b f138510c = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(90600);
    }

    /* Return type fixed from 'java.util.List' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.story.base.distribution.dispatcher.c
    public final /* synthetic */ List<k<UserStory, ?>> b(UserStory userStory, UserStory userStory2) {
        UserStory userStory3 = userStory2;
        l.d(userStory3, "");
        return userStory3.diffProperties(userStory);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.story.base.distribution.dispatcher.c
    public final /* synthetic */ Object a(UserStory userStory, Aweme aweme) {
        Aweme aweme2 = aweme;
        l.d(userStory, "");
        l.d(aweme2, "");
        String authorUid = aweme2.getAuthorUid();
        l.b(authorUid, "");
        return authorUid;
    }
}
