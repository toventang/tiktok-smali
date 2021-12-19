package com.ss.android.ugc.aweme.follow.presenter;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.newfollow.b.a;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

public class FollowFeed extends a {
    @c(a = "aweme")
    private Aweme aweme;
    private long blockFavoriteTime;
    @c(a = "comment_list")
    private List<Comment> commentList;
    private List<String> favoriteIds;
    @c(a = "favorite_list")
    private List<Aweme> favorites;
    @c(a = "feed_type")
    private int feedType;
    private com.ss.android.ugc.aweme.follow.a lastViewData;
    @c(a = "count")
    private int likeCount;
    @c(a = "like_list")
    private List<User> likeList;
    private boolean mIsMomentStyle;
    private User mRecommendUser;
    @c(a = "recommend_reason")
    private String recommendReason;
    @c(a = "cell_room")
    private RoomFeedCellStruct roomStruct;
    @c(a = "user")
    private List<User> user;

    static {
        Covode.recordClassIndex(60961);
    }

    @Override // com.ss.android.ugc.aweme.newfollow.b.a
    public boolean needUpdateComment() {
        return true;
    }

    public FollowFeed() {
    }

    @Override // com.ss.android.ugc.aweme.newfollow.b.a
    public Aweme getAweme() {
        return this.aweme;
    }

    public long getBlockFavoriteTime() {
        return this.blockFavoriteTime;
    }

    public List<String> getFavoriteIds() {
        return this.favoriteIds;
    }

    public List<Aweme> getFavorites() {
        return this.favorites;
    }

    public com.ss.android.ugc.aweme.follow.a getLastViewData() {
        return this.lastViewData;
    }

    public int getLikeCount() {
        return this.likeCount;
    }

    @Override // com.ss.android.ugc.aweme.newfollow.b.a
    public List<User> getLikeList() {
        return this.likeList;
    }

    public String getRecommendReason() {
        return this.recommendReason;
    }

    public User getRecommendUser() {
        return this.mRecommendUser;
    }

    public RoomFeedCellStruct getRoomStruct() {
        return this.roomStruct;
    }

    public List<User> getUser() {
        return this.user;
    }

    public boolean isMomentStyle() {
        return this.mIsMomentStyle;
    }

    @Override // com.ss.android.ugc.aweme.newfollow.b.a
    public List<Comment> getCommentList() {
        Aweme aweme2;
        if (this.commentList == null || (aweme2 = this.aweme) == null || !aweme2.getAwemeControl().canShowComment()) {
            this.commentList = new ArrayList();
        }
        return this.commentList;
    }

    @Override // com.ss.android.ugc.aweme.newfollow.b.a
    public int getFeedType() {
        int i2 = this.feedType;
        if (i2 == -1) {
            return 65288;
        }
        if (i2 == 1) {
            return 65280;
        }
        if (i2 == 2) {
            return 65281;
        }
        if (i2 != 3) {
            return i2;
        }
        return 65298;
    }

    @Override // com.ss.android.ugc.aweme.newfollow.b.a
    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setBlockFavoriteTime(long j2) {
        this.blockFavoriteTime = j2;
    }

    public void setFavoriteIds(List<String> list) {
        this.favoriteIds = list;
    }

    public void setFavorites(List<Aweme> list) {
        this.favorites = list;
    }

    @Override // com.ss.android.ugc.aweme.newfollow.b.a
    public void setFeedType(int i2) {
        this.feedType = i2;
    }

    public void setIsMomentStyle(boolean z) {
        this.mIsMomentStyle = z;
    }

    public void setLastViewData(com.ss.android.ugc.aweme.follow.a aVar) {
        this.lastViewData = aVar;
    }

    public void setLikeCount(int i2) {
        this.likeCount = i2;
    }

    public void setLikeList(List<User> list) {
        this.likeList = list;
    }

    public void setRecommendReason(String str) {
        this.recommendReason = str;
    }

    public void setRecommendUser(User user2) {
        this.mRecommendUser = user2;
    }

    public void setRoomStruct(RoomFeedCellStruct roomFeedCellStruct) {
        this.roomStruct = roomFeedCellStruct;
    }

    public void setUser(List<User> list) {
        this.user = list;
    }

    public static FollowFeed createLastWatchHistoryItem(com.ss.android.ugc.aweme.follow.a aVar) {
        FollowFeed followFeed = new FollowFeed();
        followFeed.setFeedType(65297);
        followFeed.setLastViewData(aVar);
        return followFeed;
    }

    @Override // com.ss.android.ugc.aweme.newfollow.b.a
    public void setCommentList(List<Comment> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.commentList = list;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d, com.ss.android.ugc.aweme.newfollow.b.a
    public void setRequestId(String str) {
        super.setRequestId(str);
        Aweme aweme2 = this.aweme;
        if (aweme2 != null) {
            aweme2.setRequestId(str);
        }
    }

    public FollowFeed(Aweme aweme2) {
        this.feedType = 65280;
        this.aweme = aweme2;
        this.commentList = new ArrayList();
    }
}
