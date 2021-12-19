package com.ss.android.ugc.aweme.forward.statistics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;

public final class a {
    static {
        Covode.recordClassIndex(61328);
    }

    public static HashMap<String, String> a(String str, Aweme aweme) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("enter_from", str);
        if (aweme != null) {
            hashMap.put("author_id", aweme.getAuthorUid());
            hashMap.put("group_id", aweme.getAid());
        }
        return hashMap;
    }

    public static HashMap<String, String> a(Aweme aweme, String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (aweme != null && aweme.getAwemeType() == 13) {
            hashMap.put("page_type", str);
            hashMap.put("is_reposted", "1");
            hashMap.put("repost_comment_id", aweme.getForwardCommentId());
            hashMap.put("from_group_id", aweme.getFromGroupId());
            hashMap.put("from_user_id", aweme.getFromUserId());
            if (!TextUtils.isEmpty(aweme.getForwardGroupId())) {
                hashMap.put("forward_group_id", aweme.getForwardGroupId());
            }
            if (!TextUtils.isEmpty(aweme.getForwardUserId())) {
                hashMap.put("forward_user_id", aweme.getForwardUserId());
            }
        }
        return hashMap;
    }

    public static c a(c cVar, Aweme aweme, String str) {
        if (cVar == null) {
            cVar = new c();
        }
        if (aweme != null && aweme.getAwemeType() == 13) {
            cVar.a("page_type", str).a("is_reposted", "1").a("repost_comment_id", aweme.getForwardCommentId()).a("from_group_id", aweme.getFromGroupId());
            if (!TextUtils.isEmpty(aweme.getForwardGroupId())) {
                cVar.a("forward_group_id", aweme.getForwardGroupId());
            }
            if (!TextUtils.isEmpty(aweme.getForwardUserId())) {
                cVar.a("forward_user_id", aweme.getForwardUserId());
            }
        }
        return cVar;
    }
}
