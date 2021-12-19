package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.app.api.c.e;
import com.ss.android.ugc.aweme.app.api.d;
import com.ss.ugc.aweme.proto.aweme_v2_feed_response;
import h.a.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FeedItemList implements e, d, IFeedItemList {
    public volatile boolean appendCache;
    @c(a = "aweme_acl")
    public AwemeACLShare awemeACLShareInfo;
    @c(a = "block_code")
    public int blockCode;
    @c(a = "cursor")
    public long cursor;
    @c(a = "disable_adjust_for_cache")
    public boolean disableAdjustForCache;
    @c(a = "enable_re_rank")
    public boolean enableReRank;
    @c(a = "error_code")
    public int error_code;
    @c(a = "extra")
    public Extra extra;
    public int fetchType;
    @c(a = "has_ad")
    public boolean hasAd;
    @c(a = "has_more")
    public int hasMore;
    @c(a = "is_hiding_invalid_item")
    public int hidingInvalidItem;
    @c(a = "guide_word")
    public HotSearchGuideWord hotSearchGuideWord;
    @c(a = "hotsoon_text")
    public String hotSoonText;
    @c(a = "hotsoon_filtered_count")
    public int hotsoonFilteredCount;
    @c(a = "hotsoon_has_more")
    public int hotsoonHasMore;
    @c(a = "invalid_item_count")
    public int invalidItemCount;
    @c(a = "invalid_item_id_list")
    public List<String> invalidItemIdList;
    @c(a = "invalid_item_text")
    public String invalidItemText;
    @c(a = "is_clear_invalid_item")
    public int isClearInvalidItem;
    public boolean isFromLocalCache;
    public boolean isFromSplitData;
    public boolean isFromUnusedFeed;
    @c(a = "aweme_list")
    public List<Aweme> items;
    public Map<String, String> localExtra = new HashMap();
    @c(a = "log_pb")
    public LogPbBean logPb;
    @c(a = "max_cursor", b = {"max_time"})
    public long maxCursor;
    @c(a = "min_cursor", b = {"min_time"})
    public long minCursor;
    public transient Long networkInfoKey;
    public transient aweme_v2_feed_response pbData;
    @c(a = "preload_ads")
    public List<Aweme> preloadAds;
    @c(a = "refresh_clear")
    public int refreshClear;
    public volatile boolean replaceFake;
    @c(a = "rid")
    public String requestId;
    @c(a = "showtime_gap_rsp_info")
    public com.ss.android.ugc.aweme.commercialize.feed.timegap.c showTimeGapResponse;
    @c(a = "status_code")
    public int status_code;
    @c(a = "status_msg")
    public String status_msg;

    static {
        Covode.recordClassIndex(59379);
    }

    public String getIdlIdentifier() {
        return "";
    }

    public void setIdlIdentifier(String str) {
    }

    public void setReplaceFake() {
        this.replaceFake = true;
    }

    public Long getNetworkInfoKey() {
        return this.networkInfoKey;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public String getRequestId() {
        return this.requestId;
    }

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public boolean isRefreshClear() {
        if (this.refreshClear == 1) {
            return true;
        }
        return false;
    }

    public void resetForceAppend() {
        this.replaceFake = false;
        this.appendCache = false;
    }

    public boolean isForceAppend() {
        if (this.replaceFake || this.appendCache) {
            return true;
        }
        return false;
    }

    private boolean needSetPbToAweme() {
        List<Aweme> list = this.items;
        if (list == null || list.size() == 0 || this.items.get(0).getLogPbBean() != null) {
            return false;
        }
        return true;
    }

    public int size() {
        if (b.a((Collection) this.items)) {
            return 0;
        }
        return this.items.size();
    }

    @Override // com.ss.android.ugc.aweme.feed.model.IFeedItemList
    public List<Aweme> getItems() {
        if (needSetPbToAweme()) {
            for (Aweme aweme : this.items) {
                aweme.setLogPbBean(this.logPb);
            }
        }
        return this.items;
    }

    public FeedItemList clone() {
        ArrayList arrayList;
        FeedItemList feedItemList = new FeedItemList();
        feedItemList.minCursor = this.minCursor;
        feedItemList.maxCursor = this.maxCursor;
        feedItemList.cursor = this.cursor;
        feedItemList.hasMore = this.hasMore;
        List<Aweme> list = this.items;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().clone());
            }
            arrayList = arrayList2;
        } else {
            arrayList = z.INSTANCE;
        }
        feedItemList.items = arrayList;
        feedItemList.requestId = this.requestId;
        feedItemList.refreshClear = this.refreshClear;
        feedItemList.extra = this.extra;
        feedItemList.status_code = this.status_code;
        feedItemList.status_msg = this.status_msg;
        feedItemList.error_code = this.error_code;
        feedItemList.blockCode = this.blockCode;
        feedItemList.hotSearchGuideWord = this.hotSearchGuideWord;
        feedItemList.preloadAds = this.preloadAds;
        feedItemList.fetchType = this.fetchType;
        feedItemList.replaceFake = this.replaceFake;
        feedItemList.appendCache = this.appendCache;
        feedItemList.localExtra = this.localExtra;
        feedItemList.isFromLocalCache = this.isFromLocalCache;
        feedItemList.logPb = this.logPb;
        feedItemList.invalidItemCount = this.invalidItemCount;
        feedItemList.hidingInvalidItem = this.hidingInvalidItem;
        feedItemList.invalidItemText = this.invalidItemText;
        feedItemList.awemeACLShareInfo = this.awemeACLShareInfo;
        return feedItemList;
    }

    @Override // com.ss.android.ugc.aweme.app.api.c.e
    public void setNetworkInfoKey(Long l2) {
        this.networkInfoKey = l2;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setLocalExtra(String str, String str2) {
        this.localExtra.put(str, str2);
    }
}
