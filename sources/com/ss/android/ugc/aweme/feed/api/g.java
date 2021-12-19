package com.ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ItemCommentEggGroup;
import com.ss.android.ugc.aweme.feed.model.RelationLabelExtra;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.utils.GsonHolder;

public final class g {
    static {
        Covode.recordClassIndex(57896);
    }

    public static ac a(String str, ac acVar) {
        if (str == null) {
            return acVar;
        }
        return (ac) GsonHolder.c().b().a(str, ac.class);
    }

    public static AwemeRawAd a(String str, AwemeRawAd awemeRawAd) {
        if (str == null) {
            return awemeRawAd;
        }
        return (AwemeRawAd) GsonHolder.c().b().a(str, AwemeRawAd.class);
    }

    public static ItemCommentEggGroup a(String str, ItemCommentEggGroup itemCommentEggGroup) {
        if (str == null) {
            return itemCommentEggGroup;
        }
        return (ItemCommentEggGroup) GsonHolder.c().b().a(str, ItemCommentEggGroup.class);
    }

    public static RelationLabelExtra a(String str, RelationLabelExtra relationLabelExtra) {
        if (str == null) {
            return relationLabelExtra;
        }
        return (RelationLabelExtra) GsonHolder.c().b().a(str, RelationLabelExtra.class);
    }

    public static NewLiveRoomStruct a(String str, NewLiveRoomStruct newLiveRoomStruct) {
        if (str == null) {
            return newLiveRoomStruct;
        }
        return (NewLiveRoomStruct) GsonHolder.c().b().a(str, NewLiveRoomStruct.class);
    }
}
