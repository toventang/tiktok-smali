package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.g;
import h.f.b.l;

public final class RecommendContact extends User {
    private final Integer type;

    static {
        Covode.recordClassIndex(61596);
    }

    public RecommendContact() {
        this(null, 1, null);
    }

    public static /* synthetic */ RecommendContact copy$default(RecommendContact recommendContact, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = recommendContact.type;
        }
        return recommendContact.copy(num);
    }

    public final Integer component1() {
        return this.type;
    }

    public final RecommendContact copy(Integer num) {
        return new RecommendContact(num);
    }

    @Override // com.ss.android.ugc.aweme.profile.model.User
    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof RecommendContact) && l.a(this.type, ((RecommendContact) obj).type);
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.profile.model.User
    public final int hashCode() {
        Integer num = this.type;
        if (num != null) {
            return num.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "RecommendContact(type=" + this.type + ")";
    }

    public final Integer getType() {
        return this.type;
    }

    public RecommendContact(Integer num) {
        this.type = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecommendContact(Integer num, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0 : num);
    }
}
