package com.ss.android.ugc.aweme.story.interaction.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.List;

public final class c extends e {

    /* renamed from: a  reason: collision with root package name */
    public final User f137845a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Integer> f137846b;

    /* renamed from: c  reason: collision with root package name */
    public final g f137847c;

    static {
        Covode.recordClassIndex(90175);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f137845a, cVar.f137845a) && l.a(this.f137846b, cVar.f137846b) && l.a(this.f137847c, cVar.f137847c);
    }

    public final int hashCode() {
        User user = this.f137845a;
        int i2 = 0;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        List<Integer> list = this.f137846b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        g gVar = this.f137847c;
        if (gVar != null) {
            i2 = gVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "ReactionBubbleEmojiItem(user=" + this.f137845a + ", emojiId=" + this.f137846b + ", mobEventParam=" + this.f137847c + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(User user, List<Integer> list, g gVar) {
        super(2);
        l.d(user, "");
        l.d(list, "");
        this.f137845a = user;
        this.f137846b = list;
        this.f137847c = gVar;
    }
}
