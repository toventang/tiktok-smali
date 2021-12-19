package com.ss.android.ugc.aweme.story.interaction.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.c.b;
import com.ss.android.ugc.aweme.story.model.a;
import com.ss.android.ugc.aweme.story.model.h;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d {
    static {
        Covode.recordClassIndex(90176);
    }

    public static final c a(User user, g gVar) {
        l.d(user, "");
        return new c(user, n.a((Object) 1001), gVar);
    }

    public static final c a(h hVar, g gVar) {
        boolean z;
        ArrayList arrayList;
        l.d(hVar, "");
        if (b.a() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new c(hVar.getUser(), n.a((Object) 1002), gVar);
        }
        List<a> emojiList = hVar.getEmojiList();
        if (emojiList == null) {
            emojiList = z.INSTANCE;
        }
        if (emojiList.isEmpty()) {
            arrayList = n.a((Object) 1002);
        } else {
            ArrayList arrayList2 = new ArrayList(n.a((Iterable) emojiList, 10));
            Iterator<T> it = emojiList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(it.next().getEmojiId()));
            }
            arrayList = arrayList2;
        }
        return new c(hVar.getUser(), arrayList, gVar);
    }
}
