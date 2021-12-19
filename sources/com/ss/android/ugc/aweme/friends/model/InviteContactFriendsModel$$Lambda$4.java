package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;
import java.util.Comparator;

/* access modifiers changed from: package-private */
public final /* synthetic */ class InviteContactFriendsModel$$Lambda$4 implements Comparator {
    static final Comparator $instance = new InviteContactFriendsModel$$Lambda$4();

    static {
        Covode.recordClassIndex(61581);
    }

    private InviteContactFriendsModel$$Lambda$4() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return InviteContactFriendsModel.lambda$sortWithContactIndex$4$InviteContactFriendsModel((InviteContactFriendsModel.ContactFriend) obj, (InviteContactFriendsModel.ContactFriend) obj2);
    }
}
