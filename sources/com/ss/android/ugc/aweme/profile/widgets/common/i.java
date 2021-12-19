package com.ss.android.ugc.aweme.profile.widgets.common;

import com.bytedance.assem.arch.service.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class i implements a {

    /* renamed from: a  reason: collision with root package name */
    public final User f117705a;

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.assem.arch.extensions.a<User> f117706b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f117707c;

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.assem.arch.extensions.a<User> f117708d;

    /* renamed from: e  reason: collision with root package name */
    public final g f117709e;

    static {
        Covode.recordClassIndex(76188);
    }

    private static i a(User user, com.bytedance.assem.arch.extensions.a<? extends User> aVar, boolean z, com.bytedance.assem.arch.extensions.a<? extends User> aVar2, g gVar) {
        l.d(gVar, "");
        return new i(user, aVar, z, aVar2, gVar);
    }

    public static /* synthetic */ i a(i iVar, User user, com.bytedance.assem.arch.extensions.a aVar, boolean z, com.bytedance.assem.arch.extensions.a aVar2, g gVar, int i2) {
        if ((i2 & 1) != 0) {
            user = iVar.f117705a;
        }
        if ((i2 & 2) != 0) {
            aVar = iVar.f117706b;
        }
        if ((i2 & 4) != 0) {
            z = iVar.f117707c;
        }
        if ((i2 & 8) != 0) {
            aVar2 = iVar.f117708d;
        }
        if ((i2 & 16) != 0) {
            gVar = iVar.f117709e;
        }
        return a(user, aVar, z, aVar2, gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f117705a, iVar.f117705a) && l.a(this.f117706b, iVar.f117706b) && this.f117707c == iVar.f117707c && l.a(this.f117708d, iVar.f117708d) && l.a(this.f117709e, iVar.f117709e);
    }

    public final int hashCode() {
        User user = this.f117705a;
        int i2 = 0;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        com.bytedance.assem.arch.extensions.a<User> aVar = this.f117706b;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        boolean z = this.f117707c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode2 + i3) * 31;
        com.bytedance.assem.arch.extensions.a<User> aVar2 = this.f117708d;
        int hashCode3 = (i6 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        g gVar = this.f117709e;
        if (gVar != null) {
            i2 = gVar.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "ProfileInfoData(user=" + this.f117705a + ", userUpdateEvent=" + this.f117706b + ", fromSetSimpleUser=" + this.f117707c + ", onUserLoadEvent=" + this.f117708d + ", action=" + this.f117709e + ")";
    }

    public /* synthetic */ i() {
        this(null, null, false, null, g.NORMAL);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    private i(User user, com.bytedance.assem.arch.extensions.a<? extends User> aVar, boolean z, com.bytedance.assem.arch.extensions.a<? extends User> aVar2, g gVar) {
        l.d(gVar, "");
        this.f117705a = user;
        this.f117706b = aVar;
        this.f117707c = z;
        this.f117708d = aVar2;
        this.f117709e = gVar;
    }
}
