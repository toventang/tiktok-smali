package com.ss.android.ugc.aweme.notification.bean;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import h.a.n;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class q extends MusNotice {

    /* renamed from: e  reason: collision with root package name */
    public static final List<Integer> f113278e = n.b(Integer.valueOf((int) LiveNetAdaptiveHurryTimeSetting.DEFAULT), 2001, 2011, 2002, 2003, 2004, 2005, 2006);

    /* renamed from: f  reason: collision with root package name */
    public static final List<Integer> f113279f = n.b(2004, 2005);

    /* renamed from: g  reason: collision with root package name */
    public static final a f113280g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f113281a;

    /* renamed from: b  reason: collision with root package name */
    public final User f113282b;

    /* renamed from: c  reason: collision with root package name */
    public final List<User> f113283c;

    /* renamed from: d  reason: collision with root package name */
    public final int f113284d;

    public final String toString() {
        return "RecommendNotice(recommend_type=" + this.f113281a + ", recommend_user=" + this.f113282b + ", aggregateUsers=" + this.f113283c + ", aggregateTotalUserCount=" + this.f113284d + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72830);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(MusNotice musNotice) {
            l.d(musNotice, "");
            return q.f113278e.contains(Integer.valueOf(musNotice.type));
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f113281a), this.f113282b, this.f113283c, Integer.valueOf(this.f113284d));
    }

    static {
        Covode.recordClassIndex(72829);
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f113281a != qVar.f113281a || !Objects.equals(this.f113282b, qVar.f113282b) || !Objects.equals(this.f113283c, qVar.f113283c) || this.f113284d != qVar.f113284d) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    private q(int i2, User user, List<? extends User> list, int i3) {
        super(true);
        this.f113281a = i2;
        this.f113282b = user;
        this.f113283c = list;
        this.f113284d = i3;
        ((MusNotice) this).type = i2;
        ((MusNotice) this).nid = String.valueOf(hashCode());
        ((MusNotice) this).hasRead = true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i2, User user, List list, int i3, int i4) {
        this(i2, (i4 & 2) != 0 ? null : user, (i4 & 4) != 0 ? null : list, (i4 & 8) != 0 ? 0 : i3);
    }
}
