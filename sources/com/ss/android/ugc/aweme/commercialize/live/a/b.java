package com.ss.android.ugc.aweme.commercialize.live.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import h.f.b.l;

public final class b {
    @c(a = "card_info")

    /* renamed from: a  reason: collision with root package name */
    public final CardStruct f74538a;

    static {
        Covode.recordClassIndex(45963);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f74538a, ((b) obj).f74538a);
        }
        return true;
    }

    public final int hashCode() {
        CardStruct cardStruct = this.f74538a;
        if (cardStruct != null) {
            return cardStruct.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ComponentData(cardInfo=" + this.f74538a + ")";
    }
}
