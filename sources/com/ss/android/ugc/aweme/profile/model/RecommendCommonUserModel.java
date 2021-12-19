package com.ss.android.ugc.aweme.profile.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.bw.a.a;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.net.g;
import com.ss.android.ugc.aweme.newfollow.c.e;
import com.ss.android.ugc.aweme.social.api.IRecommendUserApi;
import com.ss.android.ugc.aweme.social.api.RecommendUserApiService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class RecommendCommonUserModel extends a<RecommendList> {
    public boolean isNewFindFriendsPage = false;
    private final IRecommendUserApi mRecommendApi = RecommendUserApiService.f133669a;
    private HashSet<String> mShownUserIds = new HashSet<>();
    public int newUserCount;
    private List<String> userIdList;

    static {
        Covode.recordClassIndex(75254);
    }

    private int getScenarioFromRecommendType(int i2) {
        if (i2 == 4) {
            return 1;
        }
        if (i2 != 13) {
            return i2 != 21 ? 0 : 3;
        }
        return 2;
    }

    public void resetShownUserIds() {
        this.mShownUserIds.clear();
        this.newUserCount = 0;
    }

    public void removeFollowedUser() {
        if (this.mData != null && !((RecommendList) this.mData).getUserList().isEmpty()) {
            List<User> userList = ((RecommendList) this.mData).getUserList();
            int size = userList.size();
            int i2 = 0;
            while (i2 < size) {
                if (userList.get(i2).getFollowStatus() != 0) {
                    userList.remove(i2);
                    size--;
                    i2--;
                }
                i2++;
            }
            ((RecommendList) this.mData).setUserList(userList);
        }
    }

    public void setRecommendList(RecommendList recommendList) {
        this.mQueryType = 1;
        handleData(recommendList);
    }

    public int getUserImprOrder(String str) {
        List<String> list = this.userIdList;
        if (list != null) {
            return list.indexOf(str);
        }
        return 0;
    }

    public void setData(List<User> list) {
        if (this.mData != null) {
            ((RecommendList) this.mData).setUserList(list);
        }
    }

    public void recommendUserDialogLoadMore(int i2) {
        int cursor;
        if (!this.mIsLoading) {
            this.mIsLoading = true;
            this.mQueryType = 4;
            IRecommendUserApi iRecommendUserApi = this.mRecommendApi;
            Integer valueOf = Integer.valueOf(i2);
            if (this.mData == null) {
                cursor = 0;
            } else {
                cursor = ((RecommendList) this.mData).getCursor();
            }
            iRecommendUserApi.fetchRecommendUserDialoList(valueOf, Integer.valueOf(cursor), e.a.f112592a.a()).a(new g(this.mHandler));
        }
    }

    public void removeData(User user) {
        if (this.mData != null && !((RecommendList) this.mData).getUserList().isEmpty()) {
            List<User> userList = ((RecommendList) this.mData).getUserList();
            userList.remove(user);
            ((RecommendList) this.mData).setUserList(userList);
        }
    }

    /* access modifiers changed from: protected */
    public void handleData(RecommendList recommendList) {
        if (recommendList != null) {
            LogPbBean logPb = recommendList.getLogPb();
            if (!(recommendList.getUserList() == null || logPb == null)) {
                for (User user : recommendList.getUserList()) {
                    user.setRequestId(logPb.getImprId());
                }
            }
            if (this.mQueryType == 1) {
                this.newUserCount = 0;
                super.handleData((Object) recommendList);
                Iterator<User> it = recommendList.getUserList().iterator();
                while (it.hasNext()) {
                    User next = it.next();
                    if (this.mShownUserIds.contains(next.getUid())) {
                        it.remove();
                    } else {
                        this.mShownUserIds.add(next.getUid());
                    }
                }
            } else if (this.mQueryType == 4) {
                if (this.mData != null) {
                    List<User> userList = ((RecommendList) this.mData).getUserList();
                    List<User> inviterList = ((RecommendList) this.mData).getInviterList();
                    int size = userList.size();
                    for (User user2 : recommendList.getUserList()) {
                        if (!this.mShownUserIds.contains(user2.getUid())) {
                            userList.add(user2);
                            this.mShownUserIds.add(user2.getUid());
                        }
                    }
                    inviterList.addAll(recommendList.getInviterList());
                    this.newUserCount = userList.size() - size;
                    this.mData = recommendList;
                    ((RecommendList) this.mData).setUserList(userList);
                    ((RecommendList) this.mData).setInviterList(inviterList);
                } else {
                    this.mData = recommendList;
                }
            }
            List<String> list = this.userIdList;
            if (list == null) {
                this.userIdList = new ArrayList();
            } else {
                list.clear();
            }
            if (recommendList.getUserList() != null) {
                for (User user3 : recommendList.getUserList()) {
                    this.userIdList.add(user3.getUid());
                }
            }
            ac.a.f91473a.a(recommendList.getRid(), recommendList.getLogPb());
        }
    }

    public void loadMore(int i2, String str, int i3, int i4, int i5, int i6, String str2, String str3) {
        int cursor;
        if (!this.mIsLoading) {
            this.mIsLoading = true;
            this.mQueryType = 4;
            if (this.mData == null) {
                cursor = 0;
            } else {
                cursor = ((RecommendList) this.mData).getCursor();
            }
            fetchData(i2, str, cursor, i3, i4, i5, null, i6, str2, str3, false);
        }
    }

    public void fetchData(int i2, String str, int i3, int i4, int i5, int i6, String str2, int i7) {
        int i8;
        if (!this.mIsLoading) {
            if (b.g().isUidContactPermisioned()) {
                i8 = 1;
            } else {
                i8 = 2;
            }
            this.mIsLoading = true;
            this.mQueryType = 1;
            this.mRecommendApi.recommendList(Integer.valueOf(i2), (Integer) 0, str, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i8), e.a.f112592a.a(), str2, i7).a(new g(this.mHandler));
        }
    }

    public void refreshRecommendUser(int i2, String str, int i3, int i4, int i5, String str2, int i6, String str3, String str4, String str5, boolean z) {
        if (!this.mIsLoading) {
            this.mIsLoading = true;
            this.mQueryType = 1;
            fetchData(i2, str, 0, i3, i4, i5, str2, i6, str3, str4, z);
        }
    }

    private void fetchData(int i2, String str, int i3, int i4, int i5, int i6, String str2, int i7, String str3, String str4, boolean z) {
        int i8;
        if (b.g().isUidContactPermisioned()) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        if (!TextUtils.isEmpty(str2)) {
            this.mRecommendApi.recommendList(Integer.valueOf(i2), Integer.valueOf(i3), str, Integer.valueOf(i4), 1, Integer.valueOf(i8), e.a.f112592a.a(), str2, str3, str4).a(new g(this.mHandler));
        } else if (i4 == 1) {
            this.mRecommendApi.recommendListMT(Integer.valueOf(i2), Integer.valueOf(i3), e.a.f112592a.a(), str, Integer.valueOf(getScenarioFromRecommendType(i4)), false).a(new g(this.mHandler));
        } else if (i4 == 4 || i4 == 13 || i4 == 21) {
            this.mRecommendApi.recommendListMT(Integer.valueOf(i2), Integer.valueOf(i3), e.a.f112592a.a(), str3, Integer.valueOf(getScenarioFromRecommendType(i4)), z).a(new g(this.mHandler));
        } else if (3 == i4) {
            this.mRecommendApi.recommendList4NewFindFriends(Integer.valueOf(i2), Integer.valueOf(i3), e.a.f112592a.a()).a(new g(this.mHandler));
        }
    }
}
