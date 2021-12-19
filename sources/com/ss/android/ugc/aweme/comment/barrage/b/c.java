package com.ss.android.ugc.aweme.comment.barrage.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.barrage.a;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.List;

public final class c extends d {

    /* renamed from: a  reason: collision with root package name */
    public final User f71552a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Integer> f71553b;

    /* renamed from: c  reason: collision with root package name */
    public final a f71554c;

    static {
        Covode.recordClassIndex(44026);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f71552a, cVar.f71552a) && l.a(this.f71553b, cVar.f71553b) && l.a(this.f71554c, cVar.f71554c);
    }

    public final int hashCode() {
        User user = this.f71552a;
        int i2 = 0;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        List<Integer> list = this.f71553b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        a aVar = this.f71554c;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "ReactionBubbleEmojiItem(user=" + this.f71552a + ", emojiId=" + this.f71553b + ", mobEventParam=" + this.f71554c + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a, com.ss.android.ugc.aweme.comment.barrage.b.d
    public final boolean b(com.bytedance.ies.powerlist.b.a aVar) {
        l.d(aVar, "");
        return super.b(aVar);
    }

    @Override // com.bytedance.ies.powerlist.b.a, com.ss.android.ugc.aweme.comment.barrage.b.d
    public final boolean a(com.bytedance.ies.powerlist.b.a aVar) {
        l.d(aVar, "");
        if (!(aVar instanceof c)) {
            return super.a(aVar);
        }
        if (!l.a((Object) ((c) aVar).f71552a.getUid(), (Object) this.f71552a.getUid()) || !super.a(aVar)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(User user, List<Integer> list, a aVar) {
        super(2);
        l.d(user, "");
        l.d(list, "");
        this.f71552a = user;
        this.f71553b = list;
        this.f71554c = aVar;
    }
}
