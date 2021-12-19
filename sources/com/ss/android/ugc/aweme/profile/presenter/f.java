package com.ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.profile.a.v;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.d.a;
import f.a.d.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements c {

    /* renamed from: a  reason: collision with root package name */
    private final v.a f116575a;

    static {
        Covode.recordClassIndex(75314);
    }

    private f(v.a aVar) {
        this.f116575a = aVar;
    }

    static c a(v.a aVar) {
        return new f(aVar);
    }

    @Override // f.a.d.c
    public final Object a(Object obj, Object obj2) {
        int i2;
        Aweme aweme = (Aweme) obj;
        FeedItemList feedItemList = (FeedItemList) obj2;
        l.d(aweme, "");
        l.d(feedItemList, "");
        if (aweme.getUserStory() != null) {
            String str = null;
            if (!a.n(aweme)) {
                List<Aweme> items = feedItemList.getItems();
                if (items == null) {
                    items = new ArrayList<>();
                    feedItemList.items = items;
                }
                ListIterator<Aweme> listIterator = items.listIterator(items.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i2 = -1;
                        break;
                    }
                    Aweme previous = listIterator.previous();
                    if (previous.isTop()) {
                        break;
                    }
                    l.b(previous, "");
                    if (previous.isScheduleVideo()) {
                        break;
                    }
                }
                i2 = listIterator.nextIndex();
                int i3 = i2 + 1;
                items.add(i3, aweme);
                StringBuilder append = new StringBuilder("add story item to ").append(i3).append(", uid: ");
                User author = aweme.getAuthor();
                if (author != null) {
                    str = author.getUid();
                }
                com.ss.android.ugc.aweme.story.j.a.a("StoryV5VH", append.append(str).toString());
            }
        }
        return feedItemList;
    }
}
