package com.ss.android.ugc.aweme.user.repository;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.a;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.aq;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.g;
import h.f.b.l;

public final class UserState implements af {
    private final a<FollowStatus> followStatus;
    private final boolean followerIsRemoved;
    private final a<String> remarkName;
    private final Throwable removeFollowerError;
    private final User user;

    static {
        Covode.recordClassIndex(93138);
    }

    public UserState() {
        this(null, false, null, null, null, 31, null);
    }

    public UserState(User user2) {
        this(user2, false, null, null, null, 30, null);
    }

    public UserState(User user2, boolean z) {
        this(user2, z, null, null, null, 28, null);
    }

    public UserState(User user2, boolean z, a<FollowStatus> aVar) {
        this(user2, z, aVar, null, null, 24, null);
    }

    public UserState(User user2, boolean z, a<FollowStatus> aVar, a<String> aVar2) {
        this(user2, z, aVar, aVar2, null, 16, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.user.repository.UserState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserState copy$default(UserState userState, User user2, boolean z, a aVar, a aVar2, Throwable th, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            user2 = userState.user;
        }
        if ((i2 & 2) != 0) {
            z = userState.followerIsRemoved;
        }
        if ((i2 & 4) != 0) {
            aVar = userState.followStatus;
        }
        if ((i2 & 8) != 0) {
            aVar2 = userState.remarkName;
        }
        if ((i2 & 16) != 0) {
            th = userState.removeFollowerError;
        }
        return userState.copy(user2, z, aVar, aVar2, th);
    }

    public final User component1() {
        return this.user;
    }

    public final boolean component2() {
        return this.followerIsRemoved;
    }

    public final a<FollowStatus> component3() {
        return this.followStatus;
    }

    public final a<String> component4() {
        return this.remarkName;
    }

    public final Throwable component5() {
        return this.removeFollowerError;
    }

    public final UserState copy(User user2, boolean z, a<FollowStatus> aVar, a<String> aVar2, Throwable th) {
        l.d(user2, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        return new UserState(user2, z, aVar, aVar2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserState)) {
            return false;
        }
        UserState userState = (UserState) obj;
        return l.a(this.user, userState.user) && this.followerIsRemoved == userState.followerIsRemoved && l.a(this.followStatus, userState.followStatus) && l.a(this.remarkName, userState.remarkName) && l.a(this.removeFollowerError, userState.removeFollowerError);
    }

    public final int hashCode() {
        User user2 = this.user;
        int i2 = 0;
        int hashCode = (user2 != null ? user2.hashCode() : 0) * 31;
        boolean z = this.followerIsRemoved;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        a<FollowStatus> aVar = this.followStatus;
        int hashCode2 = (i6 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        a<String> aVar2 = this.remarkName;
        int hashCode3 = (hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        Throwable th = this.removeFollowerError;
        if (th != null) {
            i2 = th.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "UserState(user=" + this.user + ", followerIsRemoved=" + this.followerIsRemoved + ", followStatus=" + this.followStatus + ", remarkName=" + this.remarkName + ", removeFollowerError=" + this.removeFollowerError + ")";
    }

    public final a<FollowStatus> getFollowStatus() {
        return this.followStatus;
    }

    public final boolean getFollowerIsRemoved() {
        return this.followerIsRemoved;
    }

    public final a<String> getRemarkName() {
        return this.remarkName;
    }

    public final Throwable getRemoveFollowerError() {
        return this.removeFollowerError;
    }

    public final User getUser() {
        return this.user;
    }

    public UserState(User user2, boolean z, a<FollowStatus> aVar, a<String> aVar2, Throwable th) {
        l.d(user2, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        this.user = user2;
        this.followerIsRemoved = z;
        this.followStatus = aVar;
        this.remarkName = aVar2;
        this.removeFollowerError = th;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserState(User user2, boolean z, a aVar, a aVar2, Throwable th, int i2, g gVar) {
        this((i2 & 1) != 0 ? new User() : user2, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? aq.f39400a : aVar, (i2 & 8) != 0 ? aq.f39400a : aVar2, (i2 & 16) != 0 ? null : th);
    }
}
