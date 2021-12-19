package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C2544a f101967d = new C2544a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f101968a;

    /* renamed from: b  reason: collision with root package name */
    public final User f101969b;

    /* renamed from: c  reason: collision with root package name */
    public final int f101970c;

    static {
        Covode.recordClassIndex(65246);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f101968a == aVar.f101968a && l.a(this.f101969b, aVar.f101969b) && this.f101970c == aVar.f101970c;
    }

    public final int hashCode() {
        int i2 = this.f101968a * 31;
        User user = this.f101969b;
        return ((i2 + (user != null ? user.hashCode() : 0)) * 31) + this.f101970c;
    }

    public final String toString() {
        return "RecommendFriendListItemBean(recommendType=" + this.f101968a + ", recommendUser=" + this.f101969b + ", sourceType=" + this.f101970c + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.a.a$a  reason: collision with other inner class name */
    public static final class C2544a {
        static {
            Covode.recordClassIndex(65247);
        }

        private C2544a() {
        }

        public /* synthetic */ C2544a(byte b2) {
            this();
        }
    }

    private a(int i2, User user, int i3) {
        this.f101968a = i2;
        this.f101969b = user;
        this.f101970c = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i2, User user, int i3, int i4) {
        this(i2, (i4 & 2) != 0 ? null : user, (i4 & 4) != 0 ? -1 : i3);
    }
}
