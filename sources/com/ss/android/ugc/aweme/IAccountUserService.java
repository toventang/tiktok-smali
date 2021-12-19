package com.ss.android.ugc.aweme;

import android.os.Handler;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.http.a.b.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserPermissionData;
import com.ss.android.ugc.aweme.profile.model.VideoCover;
import com.ss.android.ugc.aweme.user.c;
import h.f.a.b;
import h.z;
import java.util.List;
import java.util.Map;

public interface IAccountUserService {

    public interface a {
        static {
            Covode.recordClassIndex(38365);
        }

        void a(int i2, User user, User user2);
    }

    static {
        Covode.recordClassIndex(38364);
    }

    void accountUserClear();

    void addUserChangeListener(a aVar);

    List<String> allUidList();

    void checkIn();

    void clear(String str);

    void delete(String str, String str2);

    void fetchLoginHistoryState(m mVar, b<Integer, z> bVar);

    c findSignificanUserInfo(String str);

    void forceSave();

    boolean getAuthGoods();

    String getAvatarUrl();

    String getCurSecUserId();

    User getCurUser();

    FollowerDetail getCurUserFollowDetail(String str);

    String getCurUserId();

    int getCurrentLoginHistoryState();

    String getLastRecordedSecUid();

    String getLastUid();

    String getNickName();

    String getPhoneCountryCode();

    String getSessionKey();

    void getSetPasswordStatus(cv cvVar);

    int getUidContactPermissionCount();

    boolean hasCommerceVideoRights();

    boolean hasCurUserSetPassword();

    boolean hasUpdated();

    void init();

    boolean isChildrenMode();

    boolean isDeleteByAgeGate();

    boolean isLogin();

    boolean isMe(String str);

    boolean isNewUser();

    boolean isNullUid(String str);

    boolean isOldUser();

    boolean isOnCommerceWhiteList();

    boolean isUidContactPermisioned();

    boolean isUserEmpty(User user);

    boolean loginHistoryLegacyEnabled();

    void logoutAllBackgroundUser();

    User queryUser(String str, boolean z);

    void queryUser();

    void queryUser(Handler handler);

    UserPermissionData.UserPermissionInfo queryUserPermission();

    void queryUserSync(User user);

    void queryVerifyStatus(cw cwVar, boolean z);

    void refreshPassportUserInfo();

    void registerNotice(String str, int i2);

    void removeUserChangeListener(a aVar);

    void setCurUser(User user);

    void setWithCommerceNewbieTask(boolean z);

    boolean shouldRefresh();

    void storeUidContactPermisioned(boolean z);

    void updateAllowStatus(Handler handler, int i2, int i3);

    void updateAvatarUri(Handler handler, String str, int i2);

    void updateCoverUri(Handler handler, String str, int i2, int i3);

    void updateCurAdAuthorization(boolean z);

    void updateCurAllowStatus(int i2);

    void updateCurAvatar(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3);

    void updateCurAwemeCount(int i2);

    void updateCurCanChangeSchoolInfo(boolean z);

    void updateCurCover(List<UrlModel> list);

    void updateCurFavoritingCount(int i2);

    void updateCurFollowerCount(int i2);

    void updateCurFollowingCount(int i2);

    void updateCurHideFollowingFollowerList(int i2);

    void updateCurHideSearch(boolean z);

    void updateCurNickname(String str);

    void updateCurProfileBadge(ProfileBadgeStruct profileBadgeStruct);

    void updateCurRepostCount(int i2);

    void updateCurSchoolInfo(String str, String str2, String str3, int i2, int i3);

    void updateCurSecret(boolean z);

    void updateCurSignature(String str);

    void updateCurSupportedNgo(ProfileNgoStruct profileNgoStruct);

    void updateCurUser(User user);

    void updateCurUserId(String str);

    void updateCurVideoCover(VideoCover videoCover);

    void updateFbExpireTime();

    void updateHasFacebookToken(boolean z);

    void updateHasTwitterToken(boolean z);

    void updateHasYoutubeToken(boolean z);

    void updateId(Handler handler, String str, int i2);

    void updateInsId(Handler handler, String str, int i2);

    void updateInsId(String str);

    void updateLanguage(Handler handler, String str, int i2);

    void updateLeaveTime(long j2);

    void updateLoginHistoryState(m mVar, int i2, b<Integer, z> bVar);

    void updateNickName(Handler handler, String str, int i2);

    void updateNickNameWithSupplementray(Handler handler, String str, List<String> list, int i2);

    void updateNotifyPrivateAccount(int i2);

    void updateProfileWidgetId(Handler handler, Long l2, int i2);

    void updateProfileWidgetShouldShow(Handler handler, boolean z, int i2);

    void updateSchool(Handler handler, Map<String, String> map);

    void updateSecret(Handler handler, boolean z, int i2);

    void updateSecret(Handler handler, boolean z, int i2, boolean z2);

    void updateShieldCommentNotice(int i2);

    void updateShieldDiggNotice(int i2);

    void updateShieldFollowNotice(int i2);

    void updateSignature(Handler handler, String str, int i2);

    void updateSupportedNgo(Handler handler, int i2, int i3);

    void updateTwExpireTime();

    void updateUserInfo(Handler handler, Map<String, String> map);

    void updateUserInfo(com.bytedance.sdk.a.n.a aVar);

    void updateVideoCoverUri(Handler handler, String str, String str2, int i2, int i3);

    void updateYoutubeExpireTime();

    void uploadAvatar(Handler handler, String str, int i2, String str2, List<d> list);

    void uploadAvatar(Handler handler, String str, int i2, String str2, List<d> list, String str3);

    void uploadCommerceHeadImage(Handler handler, String str, int i2, String str2, String str3);

    void uploadCover(Handler handler, String str, int i2, String str2);

    void uploadVideoAvatar(Handler handler, String str, int i2, String str2, List<d> list);
}
