package com.ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import h.a.n;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class a extends MusNotice {

    /* renamed from: c  reason: collision with root package name */
    public static final List<Integer> f113231c = n.b(2009, 2010);

    /* renamed from: d  reason: collision with root package name */
    public static final C2893a f113232d = new C2893a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f113233a;

    /* renamed from: b  reason: collision with root package name */
    public final Friend f113234b;

    public final String toString() {
        return "ContactNotice(contactType=" + this.f113233a + ", friend=" + this.f113234b + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.bean.a$a  reason: collision with other inner class name */
    public static final class C2893a {
        static {
            Covode.recordClassIndex(72809);
        }

        private C2893a() {
        }

        public /* synthetic */ C2893a(byte b2) {
            this();
        }

        public static boolean a(MusNotice musNotice) {
            l.d(musNotice, "");
            return a.f113231c.contains(Integer.valueOf(musNotice.type));
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.type), this.f113234b);
    }

    static {
        Covode.recordClassIndex(72808);
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.type != aVar.type || !Objects.equals(this.f113234b, aVar.f113234b)) {
            return false;
        }
        return true;
    }

    public a(int i2, Friend friend) {
        super(true);
        this.f113233a = i2;
        this.f113234b = friend;
        ((MusNotice) this).type = i2;
        ((MusNotice) this).nid = String.valueOf(hashCode());
        ((MusNotice) this).hasRead = true;
    }
}
