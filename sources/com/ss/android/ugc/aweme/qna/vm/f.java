package com.ss.android.ugc.aweme.qna.vm;

import com.bytedance.assem.arch.extensions.t;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.api.h;
import h.f.b.l;

public final class f implements j {

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.assem.arch.extensions.f<h> f119673a;

    /* renamed from: b  reason: collision with root package name */
    public final Long f119674b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f119675c;

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f119676d;

    /* renamed from: e  reason: collision with root package name */
    public final User f119677e;

    static {
        Covode.recordClassIndex(77740);
    }

    public static f a(com.bytedance.assem.arch.extensions.f<h> fVar, Long l2, Long l3, Boolean bool, User user) {
        l.d(fVar, "");
        return new f(fVar, l2, l3, bool, user);
    }

    public static /* synthetic */ f a(f fVar, com.bytedance.assem.arch.extensions.f fVar2, Long l2, Long l3, Boolean bool, User user, int i2) {
        if ((i2 & 1) != 0) {
            fVar2 = fVar.f119673a;
        }
        if ((i2 & 2) != 0) {
            l2 = fVar.f119674b;
        }
        if ((i2 & 4) != 0) {
            l3 = fVar.f119675c;
        }
        if ((i2 & 8) != 0) {
            bool = fVar.f119676d;
        }
        if ((i2 & 16) != 0) {
            user = fVar.f119677e;
        }
        return a(fVar2, l2, l3, bool, user);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f119673a, fVar.f119673a) && l.a(this.f119674b, fVar.f119674b) && l.a(this.f119675c, fVar.f119675c) && l.a(this.f119676d, fVar.f119676d) && l.a(this.f119677e, fVar.f119677e);
    }

    public final int hashCode() {
        com.bytedance.assem.arch.extensions.f<h> fVar = this.f119673a;
        int i2 = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        Long l2 = this.f119674b;
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.f119675c;
        int hashCode3 = (hashCode2 + (l3 != null ? l3.hashCode() : 0)) * 31;
        Boolean bool = this.f119676d;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        User user = this.f119677e;
        if (user != null) {
            i2 = user.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "QnaBannerState(response=" + this.f119673a + ", answersCount=" + this.f119674b + ", questionsCount=" + this.f119675c + ", allowAskQuestion=" + this.f119676d + ", user=" + this.f119677e + ")";
    }

    public /* synthetic */ f() {
        this(t.f25669a, 0L, 0L, null, null);
    }

    private f(com.bytedance.assem.arch.extensions.f<h> fVar, Long l2, Long l3, Boolean bool, User user) {
        l.d(fVar, "");
        this.f119673a = fVar;
        this.f119674b = l2;
        this.f119675c = l3;
        this.f119676d = bool;
        this.f119677e = user;
    }
}
