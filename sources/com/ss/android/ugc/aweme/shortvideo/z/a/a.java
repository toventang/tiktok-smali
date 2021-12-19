package com.ss.android.ugc.aweme.shortvideo.z.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.challenge.model.Segment;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.List;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C3443a f133035d = new C3443a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final User f133036a;

    /* renamed from: b  reason: collision with root package name */
    public final int f133037b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Segment> f133038c;

    static {
        Covode.recordClassIndex(86990);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f133036a, aVar.f133036a) && this.f133037b == aVar.f133037b && l.a(this.f133038c, aVar.f133038c);
    }

    public final int hashCode() {
        User user = this.f133036a;
        int i2 = 0;
        int hashCode = (((user != null ? user.hashCode() : 0) * 31) + this.f133037b) * 31;
        List<Segment> list = this.f133038c;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SessionShareFriendModel(user=" + this.f133036a + ", type=" + this.f133037b + ", segments=" + this.f133038c + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.a.a$a  reason: collision with other inner class name */
    public static final class C3443a {
        static {
            Covode.recordClassIndex(86991);
        }

        private C3443a() {
        }

        public /* synthetic */ C3443a(byte b2) {
            this();
        }
    }

    private a(User user) {
        l.d(user, "");
        this.f133036a = user;
        this.f133037b = 3;
        this.f133038c = null;
    }

    public /* synthetic */ a(User user, byte b2) {
        this(user);
    }
}
