package com.ss.android.ugc.aweme.shortvideo.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import h.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class ExtraMentionUserModel implements Serializable {
    public static final Companion Companion = new Companion(null);
    private List<p<String, String>> userList = new ArrayList();

    static {
        Covode.recordClassIndex(84436);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(84437);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final ExtraMentionUserModel newInstance(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            ExtraMentionUserModel extraMentionUserModel = new ExtraMentionUserModel();
            extraMentionUserModel.addMentionUser(str, str2);
            return extraMentionUserModel;
        }
    }

    public final List<p<String, String>> getUserList() {
        return this.userList;
    }

    public final void addMentionUser(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.userList.add(new p<>(str, str2));
        }
    }
}
