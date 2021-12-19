package com.ss.android.ugc.aweme.search.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import h.m.p;
import java.io.Serializable;

public final class i implements Serializable {
    @c(a = "is_rich_sug")
    private String isRichSugValue = "";
    @c(a = "mention_block_type")
    private long mentionBlockType;
    @c(a = "recall_reason")
    private String recallReason = "";
    @c(a = "sug_sec_user_id")
    private String secUserId = "";
    @c(a = "rich_sug_type")
    private String sugTypeString = "";
    @c(a = "rich_sug_follower_count")
    private Long totalFollowers;
    @c(a = "rich_sug_aweme_count")
    private String totalVideos = "";
    @c(a = "rich_sug_avatar_uri")
    private String userAvatarUri = "";
    @c(a = "sug_user_id")
    private String userId = "";
    @c(a = "rich_sug_nickname")
    private String userNickname = "";
    @c(a = "relation_type")
    private String userRelationType = "";
    @c(a = "rich_sug_user_type")
    private String userTypeString = "";
    @c(a = "sug_uniq_id")
    private String username = "";
    @c(a = "words_type")
    private String wordsType = "";

    static {
        Covode.recordClassIndex(79163);
    }

    public static /* synthetic */ void getUserRelationType$annotations() {
    }

    public final long getMentionBlockType() {
        return this.mentionBlockType;
    }

    public final String getSecUserId() {
        return this.secUserId;
    }

    public final Long getTotalFollowers() {
        return this.totalFollowers;
    }

    public final String getTotalVideos() {
        return this.totalVideos;
    }

    public final String getUserAvatarUri() {
        return this.userAvatarUri;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserNickname() {
        return this.userNickname;
    }

    public final String getUserRelationType() {
        return this.userRelationType;
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getWordsType() {
        return this.wordsType;
    }

    public final String isRichSugValue() {
        return this.isRichSugValue;
    }

    public final boolean isRichSug() {
        return l.a((Object) this.isRichSugValue, (Object) "1");
    }

    public final int getUserType() {
        Integer e2;
        String str = this.userTypeString;
        if (str == null || (e2 = p.e(str)) == null) {
            return -1;
        }
        return e2.intValue();
    }

    public final boolean isRegularSugType() {
        Integer e2;
        String str = this.sugTypeString;
        if (str == null || (e2 = p.e(str)) == null || e2.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final boolean isRelationSugType() {
        Integer e2;
        String str = this.sugTypeString;
        if (str == null || (e2 = p.e(str)) == null || e2.intValue() != 2) {
            return false;
        }
        return true;
    }

    public final boolean isVerifiedUser() {
        Integer e2;
        String str = this.userTypeString;
        if (str == null || (e2 = p.e(str)) == null || e2.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final boolean matchQuery() {
        return p.b(this.recallReason, new String[]{"|"}).contains("origin_query");
    }

    public final void setMentionBlockType(long j2) {
        this.mentionBlockType = j2;
    }

    public final void setRichSugValue(String str) {
        this.isRichSugValue = str;
    }

    public final void setSecUserId(String str) {
        this.secUserId = str;
    }

    public final void setTotalFollowers(Long l2) {
        this.totalFollowers = l2;
    }

    public final void setUserAvatarUri(String str) {
        this.userAvatarUri = str;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public final void setUserNickname(String str) {
        this.userNickname = str;
    }

    public final void setUserRelationType(String str) {
        this.userRelationType = str;
    }

    public final void setUsername(String str) {
        this.username = str;
    }

    public final void setWordsType(String str) {
        this.wordsType = str;
    }

    public final void setTotalVideos(String str) {
        l.d(str, "");
        this.totalVideos = str;
    }
}
