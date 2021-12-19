package com.bytedance.android.livesdk.model;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;
import java.util.Map;

public class FansClubData {
    @c(a = "anchor_id")
    public long anchorId;
    @c(a = "available_gift_ids")
    public List<Long> availableGiftIds;
    @c(a = "badge")
    public UserBadge badge;
    @c(a = "club_name")
    public String clubName;
    @c(a = "level")
    public int level;
    @c(a = "user_fans_club_status")
    public int userFansClubStatus;

    public static class UserBadge {
        @c(a = "icons")
        public Map<Integer, ImageModel> icons;
        @c(a = "title")
        public String title;

        static {
            Covode.recordClassIndex(11272);
        }
    }

    static {
        Covode.recordClassIndex(11271);
    }

    public static boolean isValid(FansClubData fansClubData) {
        if (fansClubData == null || TextUtils.isEmpty(fansClubData.clubName)) {
            return false;
        }
        return true;
    }
}
