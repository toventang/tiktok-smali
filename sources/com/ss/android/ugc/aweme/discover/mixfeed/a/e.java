package com.ss.android.ugc.aweme.discover.mixfeed.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.profile.model.User;

public final class e {
    static {
        Covode.recordClassIndex(50730);
    }

    public static final String a(User user) {
        MutualStruct mutualStruct = null;
        if (user != null) {
            String relationShip = user.getRelationShip();
            if (relationShip != null && relationShip.length() > 0) {
                return relationShip;
            }
            mutualStruct = user.getMutualStruct();
        }
        return a(mutualStruct);
    }

    private static String a(MutualStruct mutualStruct) {
        Integer valueOf;
        if (mutualStruct == null || (valueOf = Integer.valueOf(mutualStruct.getMutualType())) == null) {
            return "";
        }
        if (valueOf.intValue() == 1) {
            return "Friends with";
        }
        if (valueOf.intValue() == 2) {
            return "Followed by";
        }
        if (valueOf.intValue() == 3) {
            return "Follows";
        }
        return "";
    }
}
