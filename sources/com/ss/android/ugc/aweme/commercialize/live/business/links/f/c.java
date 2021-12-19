package com.ss.android.ugc.aweme.commercialize.live.business.links.f;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class c implements Serializable {
    @com.google.gson.a.c(a = "card_list")
    private final List<b> cardList;

    static {
        Covode.recordClassIndex(46018);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commercialize.live.business.links.f.c */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c copy$default(c cVar, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = cVar.cardList;
        }
        return cVar.copy(list);
    }

    public final List<b> component1() {
        return this.cardList;
    }

    public final c copy(List<b> list) {
        l.d(list, "");
        return new c(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && l.a(this.cardList, ((c) obj).cardList);
        }
        return true;
    }

    public final int hashCode() {
        List<b> list = this.cardList;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "BusinessLinksCardList(cardList=" + this.cardList + ")";
    }

    public final List<b> getCardList() {
        return this.cardList;
    }

    public c(List<b> list) {
        l.d(list, "");
        this.cardList = list;
    }
}
