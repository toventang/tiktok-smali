package com.ss.android.ugc.aweme.friends.widget.contact;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.model.Friend;
import h.f.b.l;

public final class e extends a implements Comparable<e> {

    /* renamed from: b  reason: collision with root package name */
    public final Friend f97327b;

    static {
        Covode.recordClassIndex(61830);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e) && l.a(this.f97327b, ((e) obj).f97327b);
        }
        return true;
    }

    public final int hashCode() {
        Friend friend = this.f97327b;
        if (friend != null) {
            return friend.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "InviteContactPod(friend=" + this.f97327b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Friend friend) {
        super(1);
        l.d(friend, "");
        this.f97327b = friend;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0098 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c8  */
    @Override // java.lang.Comparable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ int compareTo(com.ss.android.ugc.aweme.friends.widget.contact.e r11) {
        /*
        // Method dump skipped, instructions count: 238
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.widget.contact.e.compareTo(java.lang.Object):int");
    }
}
