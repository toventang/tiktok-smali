package com.ss.android.ugc.aweme.favorites.api.notice;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import java.util.ArrayList;

public class CollectionNotice implements Serializable {
    @c(a = "collect_notice")
    public ArrayList<a> collectNoticeList;
    @c(a = "status_code")
    public int statusCode;
    @c(a = "status_msg")
    public String statusMsg;

    static {
        Covode.recordClassIndex(56787);
    }

    static class a implements Serializable {
        @c(a = "status")
        public boolean status;
        @c(a = StringSet.type)
        public int type;

        static {
            Covode.recordClassIndex(56788);
        }

        a() {
        }
    }

    public boolean getMixStatus() {
        if (this.collectNoticeList == null) {
            return false;
        }
        for (int i2 = 0; i2 < this.collectNoticeList.size(); i2++) {
            a aVar = this.collectNoticeList.get(i2);
            if (aVar.type == 1) {
                return aVar.status;
            }
        }
        return false;
    }
}
