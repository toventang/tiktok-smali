package com.ss.android.ugc.aweme.follow.presenter;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.app.api.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.follow.a;
import java.util.ArrayList;
import java.util.List;

public class FollowFeedList extends BaseResponse implements d, Cloneable {
    @c(a = "blank_panel_text")
    private String blankPanelText;
    @c(a = "snapshot_control")
    private int cacheControl;
    long cursor;
    @c(a = "err_msg")
    private String errMsg;
    @c(a = "feed_type")
    private int feedType;
    @c(a = "fetch_recommend")
    private int fetchRecommend;
    @c(a = "has_more")
    private int hasMore;
    @c(a = "is_recommend")
    int isRecommend;
    @c(a = "last_view")
    a lastViewData;
    int level;
    @c(a = "log_pb")
    private LogPbBean logPb;
    @c(a = "data")
    private List<FollowFeed> mItems;
    @c(a = "max_cursor")
    long maxCursor;
    @c(a = "min_cursor")
    long minCursor;
    @c(a = "need_change_snapshot")
    private int needCache;
    @c(a = "need_delete_snapshot")
    private int needDeleteCache;
    @c(a = "new_item_count")
    private int newItemCount;
    @c(a = "new_room_count")
    private int newLiveCount;
    @c(a = "rid")
    String requestId;
    @c(a = "up_phone_notice")
    int upPhoneNotice;
    @c(a = "update_item_count")
    private int updateItemCount;

    static {
        Covode.recordClassIndex(60962);
    }

    public String getBlankPanelText() {
        return this.blankPanelText;
    }

    public long getCursor() {
        return this.cursor;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public int getFeedType() {
        return this.feedType;
    }

    public int getFetchRecommend() {
        return this.fetchRecommend;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public int getIsRecommend() {
        return this.isRecommend;
    }

    public List<FollowFeed> getItems() {
        return this.mItems;
    }

    public a getLastViewData() {
        return this.lastViewData;
    }

    public int getLevel() {
        return this.level;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public long getMaxCursor() {
        return this.maxCursor;
    }

    public long getMinCursor() {
        return this.minCursor;
    }

    public int getNewItemCount() {
        return this.newItemCount;
    }

    public int getNewLiveCount() {
        return this.newLiveCount;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public String getRequestId() {
        return this.requestId;
    }

    public int getUpPhoneNotice() {
        return this.upPhoneNotice;
    }

    public int getUpdateItemCount() {
        return this.updateItemCount;
    }

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public boolean needCache() {
        if (this.needCache == 1) {
            return true;
        }
        return false;
    }

    public boolean needDeleteCache() {
        if (this.needDeleteCache == 1) {
            return true;
        }
        return false;
    }

    public boolean needUseCache() {
        if (this.cacheControl == 1) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public FollowFeedList clone() {
        try {
            FollowFeedList followFeedList = (FollowFeedList) super.clone();
            followFeedList.errMsg = this.errMsg;
            followFeedList.hasMore = this.hasMore;
            followFeedList.minCursor = this.minCursor;
            followFeedList.maxCursor = this.maxCursor;
            followFeedList.requestId = this.requestId;
            followFeedList.mItems = (ArrayList) ((ArrayList) this.mItems).clone();
            followFeedList.fetchRecommend = this.fetchRecommend;
            followFeedList.logPb = this.logPb;
            followFeedList.cursor = this.cursor;
            followFeedList.level = this.level;
            followFeedList.lastViewData = this.lastViewData;
            followFeedList.newItemCount = this.newItemCount;
            followFeedList.newLiveCount = this.newLiveCount;
            followFeedList.feedType = this.feedType;
            followFeedList.updateItemCount = this.updateItemCount;
            followFeedList.blankPanelText = this.blankPanelText;
            return followFeedList;
        } catch (CloneNotSupportedException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void setBlankPanelText(String str) {
        this.blankPanelText = str;
    }

    public void setCursor(long j2) {
        this.cursor = j2;
    }

    public void setErrMsg(String str) {
        this.errMsg = str;
    }

    public void setFeedType(int i2) {
        this.feedType = i2;
    }

    public void setFetchRecommend(int i2) {
        this.fetchRecommend = i2;
    }

    public void setHasMore(int i2) {
        this.hasMore = i2;
    }

    public void setIsRecommend(int i2) {
        this.isRecommend = i2;
    }

    public void setItems(List<FollowFeed> list) {
        this.mItems = list;
    }

    public void setLastViewData(a aVar) {
        this.lastViewData = aVar;
    }

    public void setLevel(int i2) {
        this.level = i2;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setMaxCursor(long j2) {
        this.maxCursor = j2;
    }

    public void setMinCursor(long j2) {
        this.minCursor = j2;
    }

    public void setNewItemCount(int i2) {
        this.newItemCount = i2;
    }

    public void setNewLiveCount(int i2) {
        this.newLiveCount = i2;
    }

    public void setUpPhoneNotice(int i2) {
        this.upPhoneNotice = i2;
    }

    public void setUpdateItemCount(int i2) {
        this.updateItemCount = i2;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public void setRequestId(String str) {
        this.requestId = str;
        for (FollowFeed followFeed : this.mItems) {
            followFeed.setRequestId(str);
        }
    }
}
