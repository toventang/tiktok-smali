package com.ss.android.ugc.aweme.im.sdk.common.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

public class ShareStateResponse extends BaseResponse {
    @c(a = "share_user")
    public a[] mShareUserStructs;

    static {
        Covode.recordClassIndex(65627);
    }

    public static class a implements Serializable {
        @c(a = "follow_status")
        int mFollowStatus = -1;
        @c(a = "sec_user_id")
        String mSecUserId;
        @c(a = "share_status")
        int mShareStatus = 2;

        static {
            Covode.recordClassIndex(65628);
        }

        public int getFollowStatus() {
            return this.mFollowStatus;
        }

        public String getSecUserId() {
            return this.mSecUserId;
        }

        public int getShareStatus() {
            return this.mShareStatus;
        }

        public String toUidString() {
            return "ShareUserStruct{sec_user_id=" + this.mSecUserId + ", follow_status=" + this.mFollowStatus + ", share_status=" + this.mShareStatus + '}';
        }
    }
}
