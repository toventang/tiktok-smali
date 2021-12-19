package com.ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.discover.mixfeed.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.NewFaceSticker;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecom.a.b;
import java.util.Collection;
import java.util.List;

public class SearchUser {
    @c(a = "ad_item")
    public Aweme adItem;
    @c(a = "items")
    public List<Aweme> awemeCards;
    @c(a = "challenges")
    public List<Challenge> challengeList;
    @c(a = "dynamic_patch")
    public d dynamicPatch;
    @c(a = "effects")
    public List<NewFaceSticker> effectCards;
    public LogPbBean logPb;
    public GlobalDoodleConfig mGlobalDoodleConfig;
    @c(a = "mix_cursor")
    public Long mixCursor;
    @c(a = "mix_has_more")
    public Boolean mixHasMore;
    @c(a = "musics")
    public List<Music> musicCards;
    @c(a = "mix_list")
    public List<com.ss.android.ugc.aweme.mix.model.d> playlists;
    @c(a = "position")
    public List<Position> position;
    @c(a = "product")
    public b productGroup;
    public int rank;
    @c(a = "remark_position")
    public List<Position> remarkPosition;
    @c(a = StringSet.type)
    public int type;
    @c(a = "uniqid_position")
    public List<Position> uniqidPosition;
    @c(a = "user_info")
    public User user;

    static {
        Covode.recordClassIndex(50971);
    }

    public boolean isDynamicCard() {
        if (this.dynamicPatch != null) {
            return true;
        }
        return false;
    }

    public int getType() {
        if (isDynamicCard()) {
            return 999;
        }
        return 0;
    }

    public boolean isAladdin() {
        if (cardType() != 0) {
            return true;
        }
        return false;
    }

    public boolean isStar() {
        if (this.awemeCards == null && this.musicCards == null) {
            return false;
        }
        return true;
    }

    public int cardType() {
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.awemeCards)) {
            return 1;
        }
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.musicCards)) {
            return 2;
        }
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.effectCards)) {
            return 3;
        }
        return 0;
    }

    public boolean hasMedia() {
        b bVar;
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.awemeCards) || !com.bytedance.common.utility.collection.b.a((Collection) this.musicCards) || !com.bytedance.common.utility.collection.b.a((Collection) this.effectCards) || ((bVar = this.productGroup) != null && !com.bytedance.common.utility.collection.b.a((Collection) bVar.f121050b))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i2;
        d dVar = this.dynamicPatch;
        int i3 = 0;
        if (dVar != null) {
            i2 = dVar.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = (i2 + 0) * 6;
        User user2 = this.user;
        if (!(user2 == null || user2.getUid() == null)) {
            i3 = this.user.getUid().hashCode();
        }
        return i4 + i3;
    }

    public SearchUser setUser(User user2) {
        this.user = user2;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchUser)) {
            return false;
        }
        SearchUser searchUser = (SearchUser) obj;
        if (!equals(this.dynamicPatch, searchUser.dynamicPatch)) {
            return false;
        }
        User user2 = this.user;
        if (user2 == null || searchUser.user == null) {
            return equals(user2, searchUser.user);
        }
        return TextUtils.equals(user2.getUid(), searchUser.user.getUid());
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }
}
