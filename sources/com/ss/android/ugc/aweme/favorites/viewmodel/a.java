package com.ss.android.ugc.aweme.favorites.viewmodel;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final C2199a f91000c = new C2199a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Aweme f91001a;

    /* renamed from: b  reason: collision with root package name */
    public final int f91002b;

    static {
        Covode.recordClassIndex(57224);
    }

    public a() {
        this(null, 0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f91001a, aVar.f91001a) && this.f91002b == aVar.f91002b;
    }

    public final int hashCode() {
        Aweme aweme = this.f91001a;
        return ((aweme != null ? aweme.hashCode() : 0) * 31) + this.f91002b;
    }

    public final String toString() {
        return "AwemeWithManage(aweme=" + this.f91001a + ", manageState=" + this.f91002b + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.a$a  reason: collision with other inner class name */
    public static final class C2199a {
        static {
            Covode.recordClassIndex(57225);
        }

        private C2199a() {
        }

        public /* synthetic */ C2199a(byte b2) {
            this();
        }
    }

    public a(Aweme aweme, int i2) {
        l.d(aweme, "");
        this.f91001a = aweme;
        this.f91002b = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Aweme aweme, int i2, int i3) {
        this((i3 & 1) != 0 ? new Aweme() : aweme, (i3 & 2) != 0 ? 0 : i2);
    }
}
