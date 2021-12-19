package com.ss.android.ugc.aweme.comment.i;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.model.s;
import com.ss.android.ugc.aweme.feed.ae;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;

public class h extends d<h> {
    private static final long serialVersionUID = -8706130331733501305L;

    /* renamed from: a  reason: collision with root package name */
    private transient ae f72017a;
    private s adCommentStruct;
    private String commentEnterMethod = "";
    private String creationId;
    private String enterFrom;
    private boolean enterFullScreen;
    private String enterMethod;
    private String eventType;
    private boolean forceHideKeyboard;
    private boolean forceOpenReply;
    private boolean forceRefresh;
    private String fromGroupId;
    private String hintCids;
    private Map<String, String> hotPlayerMap;
    private String insertCids;
    private String insertCidsString;
    private String insertLikeUserIds;
    private String insertVid;
    private boolean isCommentClose;
    private boolean isCommentLimited;
    private boolean isEnableComment;
    private boolean isFromPostList;
    private boolean isHotPlayer;
    private int isLongItem;
    private boolean isMyProfile;
    private boolean isPrivateAweme;
    private boolean isShowLikeUsers;
    private String labelText;
    private int labelType = -1;
    private String lastGroupId = "";
    private int likeUserCount;
    private int locatePageType;
    private long mCommentCount;
    private List<User> mLikeUsers;
    private String mPlayListId;
    private String mPlayListIdKey;
    private String mPlayListType;
    private String mTabName;
    private boolean needAutoLikeComment;
    private boolean needShowReplyPanel;
    private String newsId;
    private int pageType;
    private String parentTagId;
    private String previousPage;
    private String requestId;
    private boolean scrollToTop;
    private String searchId;
    private String searchResultId;
    private boolean showReplyWithInsert;
    private int source;
    private String tagId;
    private String tempEnterMethod;

    static {
        Covode.recordClassIndex(44244);
    }

    public long getCommentCount() {
        return this.mCommentCount;
    }

    public String getCommentEnterMethod() {
        return this.commentEnterMethod;
    }

    public String getCreationId() {
        return this.creationId;
    }

    public String getEnterMethod() {
        return this.enterMethod;
    }

    public String getEventType() {
        return this.eventType;
    }

    public String getFromGroupId() {
        return this.fromGroupId;
    }

    public String getHintCids() {
        return this.hintCids;
    }

    public Map<String, String> getHotPlayerMap() {
        return this.hotPlayerMap;
    }

    public String getInsertCids() {
        return this.insertCids;
    }

    public String getInsertLikeUserIds() {
        return this.insertLikeUserIds;
    }

    public String getInsertVid() {
        return this.insertVid;
    }

    public int getIsLongItem() {
        return this.isLongItem;
    }

    public String getLabelText() {
        return this.labelText;
    }

    public int getLabelType() {
        return this.labelType;
    }

    public String getLastGroupId() {
        return this.lastGroupId;
    }

    public int getLikeUserCount() {
        return this.likeUserCount;
    }

    public List<User> getLikeUsers() {
        return this.mLikeUsers;
    }

    public int getLocatePageType() {
        return this.locatePageType;
    }

    public String getNewsId() {
        return this.newsId;
    }

    public ae getOnShowHeightChangeListener() {
        return this.f72017a;
    }

    public int getPageType() {
        return this.pageType;
    }

    public String getParentTagId() {
        return this.parentTagId;
    }

    public String getPlayListId() {
        return this.mPlayListId;
    }

    public String getPlayListIdKey() {
        return this.mPlayListIdKey;
    }

    public String getPlayListType() {
        return this.mPlayListType;
    }

    public String getPreviousPage() {
        return this.previousPage;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getSearchId() {
        return this.searchId;
    }

    public String getSearchResultId() {
        return this.searchResultId;
    }

    public int getSource() {
        return this.source;
    }

    public String getTabName() {
        return this.mTabName;
    }

    public String getTagId() {
        return this.tagId;
    }

    public String getTempEnterMethod() {
        return this.tempEnterMethod;
    }

    public boolean isCommentClose() {
        return this.isCommentClose;
    }

    public boolean isCommentLimited() {
        return this.isCommentLimited;
    }

    public boolean isEnableComment() {
        return this.isEnableComment;
    }

    public boolean isEnterFullScreen() {
        return this.enterFullScreen;
    }

    public boolean isForceHideKeyboard() {
        return this.forceHideKeyboard;
    }

    public boolean isForceOpenReply() {
        return this.forceOpenReply;
    }

    public boolean isForceRefresh() {
        return this.forceRefresh;
    }

    public boolean isFromPostList() {
        return this.isFromPostList;
    }

    public boolean isHotPlayer() {
        return this.isHotPlayer;
    }

    public boolean isMyProfile() {
        return this.isMyProfile;
    }

    public boolean isNeedAutoLikeComment() {
        return this.needAutoLikeComment;
    }

    public boolean isNeedShowReplyPanel() {
        return this.needShowReplyPanel;
    }

    public boolean isPrivateAweme() {
        return this.isPrivateAweme;
    }

    public boolean isScrollToTop() {
        return this.scrollToTop;
    }

    public boolean isShowLikeUsers() {
        return this.isShowLikeUsers;
    }

    public boolean showReplyWithInsertCid() {
        return this.showReplyWithInsert;
    }

    public s getAdCommentStruct() {
        s sVar = this.adCommentStruct;
        if (sVar == null) {
            return null;
        }
        sVar.setAwemeId(this.aid);
        User user = new User();
        user.setUid(this.authorUid);
        user.setAvatarThumb(this.adCommentStruct.getAvatarIcon());
        this.adCommentStruct.setUser(user);
        this.adCommentStruct.setCommentType(10);
        return this.adCommentStruct;
    }

    public String getCommentTag() {
        String str = this.eventType;
        str.hashCode();
        if (!str.equals("collection") && !str.equals("opus")) {
            return this.eventType;
        }
        if (isMyProfile()) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    public String getEnterFrom() {
        if (!TextUtils.isEmpty(this.enterFrom)) {
            return this.enterFrom;
        }
        int i2 = this.pageType;
        if (i2 == 1000) {
            return "personal_homepage";
        }
        if (i2 == 1001) {
            return "personal_collection";
        }
        if (i2 == 2000) {
            return "others_homepage";
        }
        if (i2 != 2001) {
            return this.eventType;
        }
        return "others_collection";
    }

    public h forceRefresh(boolean z) {
        this.forceRefresh = z;
        return this;
    }

    public h setAdCommentStruct(s sVar) {
        this.adCommentStruct = sVar;
        return this;
    }

    public h setCommentClose(boolean z) {
        this.isCommentClose = z;
        return this;
    }

    public h setCommentCount(long j2) {
        this.mCommentCount = j2;
        return this;
    }

    public h setCommentEnterMethod(String str) {
        this.commentEnterMethod = str;
        return this;
    }

    public h setCommentLimited(boolean z) {
        this.isCommentLimited = z;
        return this;
    }

    public h setCreationId(String str) {
        this.creationId = str;
        return this;
    }

    public h setEnableComment(boolean z) {
        this.isEnableComment = z;
        return this;
    }

    public h setEnterFrom(String str) {
        this.enterFrom = str;
        return this;
    }

    public h setEnterFullScreen(boolean z) {
        this.enterFullScreen = z;
        return this;
    }

    public h setEnterMethod(String str) {
        this.enterMethod = str;
        return this;
    }

    public h setEventType(String str) {
        this.eventType = str;
        return this;
    }

    public h setForceHideKeyboard(boolean z) {
        this.forceHideKeyboard = z;
        return this;
    }

    public h setFromGroupId(String str) {
        this.fromGroupId = str;
        return this;
    }

    public h setFromPostList(boolean z) {
        this.isFromPostList = z;
        return this;
    }

    public h setHintCids(String str) {
        this.hintCids = str;
        return this;
    }

    public h setHotPlayer(boolean z) {
        this.isHotPlayer = z;
        return this;
    }

    public h setHotPlayerMap(Map<String, String> map) {
        this.hotPlayerMap = map;
        return this;
    }

    public h setInsertLikeUserIds(String str) {
        this.insertLikeUserIds = str;
        return this;
    }

    public h setInsertVid(String str) {
        this.insertVid = str;
        return this;
    }

    public h setIsLongItem(int i2) {
        this.isLongItem = i2;
        return this;
    }

    public h setLabelText(String str) {
        this.labelText = str;
        return this;
    }

    public h setLabelType(int i2) {
        this.labelType = i2;
        return this;
    }

    public h setLastGroupId(String str) {
        this.lastGroupId = str;
        return this;
    }

    public h setLikeUserCount(int i2) {
        this.likeUserCount = i2;
        return this;
    }

    public h setLikeUsers(List<User> list) {
        this.mLikeUsers = list;
        return this;
    }

    public h setLocatePageType(int i2) {
        this.locatePageType = i2;
        return this;
    }

    public h setMyProfile(boolean z) {
        this.isMyProfile = z;
        return this;
    }

    public h setNeedAutoLikeComment(boolean z) {
        this.needAutoLikeComment = z;
        return this;
    }

    public h setNeedShowReplyPanel(boolean z) {
        this.needShowReplyPanel = z;
        return this;
    }

    public h setNewsId(String str) {
        this.newsId = str;
        return this;
    }

    public h setOnShowHeightChangeListener(ae aeVar) {
        this.f72017a = aeVar;
        return this;
    }

    public h setPageType(int i2) {
        this.pageType = i2;
        return this;
    }

    public void setParentTagId(String str) {
        this.parentTagId = str;
    }

    public h setPlayListId(String str) {
        this.mPlayListId = str;
        return this;
    }

    public h setPlayListIdKey(String str) {
        this.mPlayListIdKey = str;
        return this;
    }

    public h setPlayListType(String str) {
        this.mPlayListType = str;
        return this;
    }

    public h setPreviousPage(String str) {
        this.previousPage = str;
        return this;
    }

    public h setPrivateAweme(boolean z) {
        this.isPrivateAweme = z;
        return this;
    }

    public h setRequestId(String str) {
        this.requestId = str;
        return this;
    }

    public h setScrollToTop(boolean z) {
        this.scrollToTop = z;
        return this;
    }

    public h setSearchId(String str) {
        this.searchId = str;
        return this;
    }

    public h setSearchResultId(String str) {
        this.searchResultId = str;
        return this;
    }

    public h setShowLikeUsers(boolean z) {
        this.isShowLikeUsers = z;
        return this;
    }

    public h setSource(int i2) {
        this.source = i2;
        return this;
    }

    public h setTabName(String str) {
        this.mTabName = str;
        return this;
    }

    public void setTagId(String str) {
        this.tagId = str;
    }

    public void setTempEnterMethod(String str) {
        this.tempEnterMethod = str;
    }

    public h(String str) {
        super(str);
    }

    public h setInsertCids(String str, boolean z, boolean z2) {
        this.insertCids = str;
        this.showReplyWithInsert = z;
        this.forceOpenReply = z2;
        return this;
    }
}
