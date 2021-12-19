package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;

public final class FacebookFriends extends Friend {
    private final int type;

    static {
        Covode.recordClassIndex(61571);
    }

    public static int com_ss_android_ugc_aweme_friends_model_FacebookFriends_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ FacebookFriends copy$default(FacebookFriends facebookFriends, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = facebookFriends.type;
        }
        return facebookFriends.copy(i2);
    }

    public final int component1() {
        return this.type;
    }

    public final FacebookFriends copy(int i2) {
        return new FacebookFriends(i2);
    }

    @Override // com.ss.android.ugc.aweme.friends.model.Friend, com.ss.android.ugc.aweme.profile.model.User
    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FacebookFriends) && this.type == ((FacebookFriends) obj).type;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.friends.model.Friend, com.ss.android.ugc.aweme.profile.model.User
    public final int hashCode() {
        return com_ss_android_ugc_aweme_friends_model_FacebookFriends_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.type);
    }

    public final String toString() {
        return "FacebookFriends(type=" + this.type + ")";
    }

    public final int getType() {
        return this.type;
    }

    public FacebookFriends(int i2) {
        super(null);
        this.type = i2;
    }
}
