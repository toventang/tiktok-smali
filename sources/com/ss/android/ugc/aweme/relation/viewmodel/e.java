package com.ss.android.ugc.aweme.relation.viewmodel;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.model.FriendList;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f120573a;

    /* renamed from: b  reason: collision with root package name */
    public FriendList<? extends User> f120574b;

    /* renamed from: c  reason: collision with root package name */
    public final String f120575c;

    /* renamed from: d  reason: collision with root package name */
    public final String f120576d;

    static {
        Covode.recordClassIndex(78509);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f120573a == eVar.f120573a && l.a(this.f120574b, eVar.f120574b) && l.a(this.f120575c, eVar.f120575c) && l.a(this.f120576d, eVar.f120576d);
    }

    public final int hashCode() {
        int i2 = this.f120573a * 31;
        FriendList<? extends User> friendList = this.f120574b;
        int i3 = 0;
        int hashCode = (i2 + (friendList != null ? friendList.hashCode() : 0)) * 31;
        String str = this.f120575c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f120576d;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return hashCode2 + i3;
    }

    public final String toString() {
        return "SocialRecFlowData(nextStep=" + this.f120573a + ", friends=" + this.f120574b + ", platform=" + this.f120575c + ", skipPlatform=" + this.f120576d + ")";
    }

    public e(int i2, FriendList<? extends User> friendList, String str, String str2) {
        this.f120573a = i2;
        this.f120574b = friendList;
        this.f120575c = str;
        this.f120576d = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i2, FriendList friendList, String str, String str2, int i3) {
        this(i2, (i3 & 2) != 0 ? null : friendList, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "" : str2);
    }
}
