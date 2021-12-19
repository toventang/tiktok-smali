package com.ss.android.ugc.aweme;

import android.os.Handler;
import android.text.TextUtils;
import androidx.lifecycle.m;
import b.i;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.sdk.a.a.b.d;
import com.bytedance.sdk.a.a.d.f;
import com.ss.android.account.c;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.m.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.dr;
import com.ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.ss.android.ugc.aweme.profile.model.TcmImage;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserPermissionData;
import com.ss.android.ugc.aweme.profile.model.VideoCover;
import com.ss.android.ugc.aweme.services.IAccountHelperService;
import com.ss.android.ugc.aweme.user.a.c;
import com.ss.android.ugc.aweme.user.e;
import com.ss.android.ugc.aweme.user.f;
import h.a.ag;
import h.f.a.b;
import h.f.b.l;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public abstract class ao implements IAccountUserService {

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f66419a;

    static {
        Covode.recordClassIndex(40810);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void fetchLoginHistoryState(m mVar, b<? super Integer, z> bVar) {
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public int getCurrentLoginHistoryState() {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public boolean loginHistoryLegacyEnabled() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void storeUidContactPermisioned(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateLoginHistoryState(m mVar, int i2, b<? super Integer, z> bVar) {
    }

    public static final class a extends d {
        static {
            Covode.recordClassIndex(40811);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
        @Override // com.bytedance.sdk.a.c
        public final /* bridge */ /* synthetic */ void a(f fVar, int i2) {
        }

        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
        @Override // com.bytedance.sdk.a.c
        public final /* synthetic */ void e(f fVar) {
            f fVar2 = fVar;
            if (fVar2 != null) {
                try {
                    if (fVar2.f43071b) {
                        c a2 = c.a.a(fVar2.f43077h);
                        l.b(a2, "");
                        JSONObject optJSONObject = a2.f43475m.optJSONObject("push_challenge_info");
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("challenge_ticket");
                            String optString2 = optJSONObject.optString("o_url");
                            com.ss.android.ugc.aweme.account.b.a();
                            cb m2 = com.ss.android.ugc.aweme.account.b.f62864a.m();
                            l.b(optString, "");
                            l.b(optString2, "");
                            m2.handlePushChallengeInfo(optString, optString2);
                        }
                        if (((Boolean) com.ss.android.ugc.aweme.lego.b.a.f107405h.getValue()).booleanValue()) {
                            g.c().execute(new ds(a2, "async refresh passport user info"));
                        } else {
                            dr.f83126a.a(a2);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public List<String> allUidList() {
        return com.ss.android.ugc.aweme.user.f.l();
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public User getCurUser() {
        return e.f142364k.b();
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public String getCurUserId() {
        return e.f142364k.e();
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public String getLastRecordedSecUid() {
        return com.ss.android.ugc.aweme.user.f.j();
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public int getUidContactPermissionCount() {
        return dl.f82876a.count();
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public boolean hasUpdated() {
        return e.f142364k.f142366a;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public boolean isNewUser() {
        init();
        return dr.f83126a.f82953a;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void accountUserClear() {
        i.b(new dq(dr.f83126a), i.f4824a);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public boolean hasCommerceVideoRights() {
        return e.f142364k.b().isWithItemCommerceEntry();
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public boolean isLogin() {
        return com.ss.android.ugc.aweme.user.f.a(e.f142364k.a());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public boolean isOnCommerceWhiteList() {
        return e.f142364k.b().isWithCommerceEntry();
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public boolean getAuthGoods() {
        if (((e.f142364k.b().getAuthorityStatus() >> 1) & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public String getAvatarUrl() {
        String str;
        com.ss.android.ugc.aweme.user.c e2 = e.e(e.f142364k.e());
        if (e2 == null || (str = e2.f142349e) == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public String getLastUid() {
        e eVar = e.f142364k;
        String str = eVar.f142373h;
        if (str == null) {
            str = com.ss.android.ugc.aweme.user.f.f142379d.i();
        }
        eVar.a(str);
        String str2 = eVar.f142373h;
        if (str2 == null) {
            l.b();
        }
        return str2;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public String getNickName() {
        String str;
        com.ss.android.ugc.aweme.user.c e2 = e.e(e.f142364k.e());
        if (e2 == null || (str = e2.f142348d) == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public String getPhoneCountryCode() {
        String str;
        f.a f2 = e.f(e.f142364k.e());
        if (f2 == null || (str = f2.f142391e) == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public String getSessionKey() {
        String str;
        f.a f2 = e.f(e.f142364k.e());
        if (f2 == null || (str = f2.f142388b) == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void init() {
        if (!this.f66419a) {
            dr.f83126a = new dn();
            IAccountUserService.a aVar = a.f62428c;
            if (aVar == null) {
                l.a("sAccountUserChangeListener");
            }
            addUserChangeListener(aVar);
            this.f66419a = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public boolean isOldUser() {
        User b2 = e.f142364k.b();
        if (b2 == null || b2.getCreateTime() < 1506787200) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void queryUser() {
        init();
        com.ss.android.ugc.aweme.user.b.a.a(e.f142364k.f142369d, ((IAccountHelperService) a.a(IAccountHelperService.class)).selfUserApi());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateFbExpireTime() {
        e eVar = e.f142364k;
        eVar.b().setFbExpireTime((System.currentTimeMillis() / 1000) + 2592000);
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateTwExpireTime() {
        init();
        e eVar = e.f142364k;
        eVar.b().setTwExpireTime((System.currentTimeMillis() / 1000) + 2592000);
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateYoutubeExpireTime() {
        init();
        e eVar = e.f142364k;
        eVar.b().setYoutubeExpireTime((System.currentTimeMillis() / 1000) + 2592000);
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void checkIn() {
        String str;
        init();
        e eVar = e.f142364k;
        WeakHandler weakHandler = eVar.f142369d;
        if (eVar.d()) {
            str = e.f142363j;
        } else {
            str = e.f142362i;
        }
        n.a().a(weakHandler, new Callable(str) {
            /* class com.ss.android.ugc.aweme.user.b.a.AnonymousClass6 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f142341a;

            static {
                Covode.recordClassIndex(93103);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                dr.f83127b.b(this.f142341a);
                return null;
            }

            {
                this.f142341a = r1;
            }
        }, 113);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public String getCurSecUserId() {
        String secUid = e.f142364k.b().getSecUid();
        if (!TextUtils.isEmpty(secUid)) {
            return secUid;
        }
        f.a f2 = e.f(e.f142364k.e());
        if (f2 == null || TextUtils.isEmpty(f2.f142392f)) {
            return "";
        }
        return f2.f142392f;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public boolean hasCurUserSetPassword() {
        return Keva.getRepo("password_status").getBoolean(e.f142364k.e() + "_password_set_status", false);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public UserPermissionData.UserPermissionInfo queryUserPermission() {
        init();
        com.ss.android.common.util.g gVar = new com.ss.android.common.util.g(((IAccountHelperService) a.a(IAccountHelperService.class)).userPermissionApi());
        gVar.a("request_types", UserPermissionData.UserPermissionRequestType.DEFAULT_TYPE.toString());
        UserPermissionData.UserPermissionInfo userPermissionInfo = (UserPermissionData.UserPermissionInfo) dr.f83127b.a().a(dr.f83127b.a(gVar.toString()), UserPermissionData.UserPermissionInfo.class);
        l.b(userPermissionInfo, "");
        return userPermissionInfo;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void refreshPassportUserInfo() {
        if (com.ss.android.ugc.aweme.user.f.a(e.f142364k.a())) {
            init();
        }
        com.bytedance.sdk.a.f.e.a(a.a()).a("polling", new a());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public boolean shouldRefresh() {
        e eVar = e.f142364k;
        if (!eVar.f142366a) {
            return true;
        }
        if ((eVar.f142368c < 0 || System.currentTimeMillis() - eVar.f142368c < 180000) && !eVar.f142367b) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void forceSave() {
        synchronized (com.ss.android.ugc.aweme.user.f.f142376a) {
            for (T t : com.ss.android.ugc.aweme.user.f.c()) {
                t.a().d();
                t.b().d();
                t.c().d();
            }
            com.ss.android.ugc.aweme.user.f.b().edit().putString("current_foreground_uid", com.ss.android.ugc.aweme.user.f.f142379d.e()).apply();
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void logoutAllBackgroundUser() {
        List<String> l2 = com.ss.android.ugc.aweme.user.f.l();
        if (l2.size() >= 2) {
            String e2 = e.f142364k.e();
            int size = l2.size();
            while (true) {
                size--;
                if (size >= 0) {
                    String str = l2.get(size);
                    if (!TextUtils.equals(str, e2)) {
                        long currentTimeMillis = System.currentTimeMillis();
                        bn k2 = AccountService.a().k();
                        k2.updateMethodInfo("update_expire_time", str, Long.valueOf(currentTimeMillis));
                        k2.updateMethodInfo("update_last_active_time", str, Long.valueOf(currentTimeMillis));
                        k2.updateMethodInfo("update_significan_user_info", str, findSignificanUserInfo(str));
                        e.f142364k.c(str);
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public boolean isNullUid(String str) {
        return com.ss.android.ugc.aweme.user.f.h(str);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void addUserChangeListener(IAccountUserService.a aVar) {
        l.d(aVar, "");
        dr.a(aVar);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public com.ss.android.ugc.aweme.user.c findSignificanUserInfo(String str) {
        if (str == null) {
            l.b();
        }
        return e.e(str);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public boolean isMe(String str) {
        return com.bytedance.common.utility.m.a(str, e.f142364k.e());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void queryUserSync(User user) {
        init();
        e.f142364k.b(user);
        dr.a(10, null, user);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateCurUser(User user) {
        init();
        e.f142364k.b(user);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateCurUserId(String str) {
        init();
        e.f142364k.b(str);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void removeUserChangeListener(IAccountUserService.a aVar) {
        l.d(aVar, "");
        synchronized (dr.class) {
            dr.f83128c.remove(aVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void setWithCommerceNewbieTask(boolean z) {
        init();
        e eVar = e.f142364k;
        eVar.b().setWithCommerceNewbieTask(z);
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateCurAdAuthorization(boolean z) {
        init();
        e eVar = e.f142364k;
        eVar.b().setAdAuthorization(z);
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateCurAllowStatus(int i2) {
        init();
        e eVar = e.f142364k;
        eVar.b().setAllowStatus(i2);
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateCurCanChangeSchoolInfo(boolean z) {
        init();
        e eVar = e.f142364k;
        eVar.b().setCanModifySchoolInfo(z);
        eVar.f142366a = true;
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateCurCover(List<? extends UrlModel> list) {
        init();
        e eVar = e.f142364k;
        eVar.b().setCoverUrls(list);
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateCurFavoritingCount(int i2) {
        init();
        e eVar = e.f142364k;
        eVar.b().setFavoritingCount(eVar.b().getFavoritingCount() + i2);
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateCurFollowerCount(int i2) {
        init();
        e eVar = e.f142364k;
        eVar.b().setFollowerCount(eVar.b().getFollowerCount() + i2);
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateCurHideFollowingFollowerList(int i2) {
        init();
        e eVar = e.f142364k;
        eVar.b().setHideFollowingFollowerList(i2);
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateCurHideSearch(boolean z) {
        init();
        e eVar = e.f142364k;
        eVar.b().setHideSearch(z);
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateCurProfileBadge(ProfileBadgeStruct profileBadgeStruct) {
        init();
        e eVar = e.f142364k;
        eVar.b().setProfileBadgeStruct(profileBadgeStruct);
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateCurSupportedNgo(ProfileNgoStruct profileNgoStruct) {
        init();
        e eVar = e.f142364k;
        eVar.b().setProfileNgoStruct(profileNgoStruct);
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateCurVideoCover(VideoCover videoCover) {
        init();
        e eVar = e.f142364k;
        eVar.b().setVideoCover(videoCover);
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateHasFacebookToken(boolean z) {
        init();
        e eVar = e.f142364k;
        eVar.b().setHasFacebookToken(z);
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateHasTwitterToken(boolean z) {
        init();
        e eVar = e.f142364k;
        eVar.b().setHasTwitterToken(z);
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateHasYoutubeToken(boolean z) {
        init();
        e eVar = e.f142364k;
        eVar.b().setHasYoutubeToken(z);
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateInsId(String str) {
        init();
        e eVar = e.f142364k;
        eVar.b().setInsId(str);
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateLeaveTime(long j2) {
        init();
        e eVar = e.f142364k;
        if (eVar.f142368c != -1) {
            j2 = eVar.f142368c;
        }
        eVar.f142368c = j2;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateNotifyPrivateAccount(int i2) {
        init();
        e eVar = e.f142364k;
        eVar.b().setNotifyPrivateAccount(i2);
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateShieldCommentNotice(int i2) {
        init();
        e eVar = e.f142364k;
        eVar.b().setShieldCommentNotice(i2);
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateShieldDiggNotice(int i2) {
        init();
        e eVar = e.f142364k;
        eVar.b().setShieldDiggNotice(i2);
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateShieldFollowNotice(int i2) {
        init();
        e eVar = e.f142364k;
        eVar.b().setShieldFollowNotice(i2);
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateUserInfo(com.bytedance.sdk.a.n.a aVar) {
        init();
        dr.f83126a.a(aVar);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public FollowerDetail getCurUserFollowDetail(String str) {
        e eVar = e.f142364k;
        if (eVar.b().getFollowerDetailList() == null) {
            return null;
        }
        for (FollowerDetail followerDetail : eVar.b().getFollowerDetailList()) {
            l.b(followerDetail, "");
            if (TextUtils.equals(followerDetail.getPackageName(), str)) {
                return followerDetail;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void getSetPasswordStatus(cv cvVar) {
        dr.f83127b.c("/passport/password/has_set/", null).a(c.a.f142319a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c.b(cvVar), new c.C3804c(cvVar));
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public boolean isUserEmpty(User user) {
        if (user == null || user.getUid() == null || user.getAvatarLarger() == null || user.getAvatarMedium() == null || user.getAvatarThumb() == null || user.getShortId() == null || user.getNickname() == null || user.getUniqueId() == null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void setCurUser(User user) {
        l.d(user, "");
        init();
        e eVar = e.f142364k;
        l.d(user, "");
        if (e.a(user)) {
            eVar.f142371f = user;
            eVar.f142370e = user.getUid();
            eVar.f142372g = null;
            com.ss.android.ugc.aweme.user.f.a(user);
            eVar.f142366a = true;
            eVar.f142367b = false;
            eVar.f142368c = -1;
            eVar.a(user.getUid());
            String secUid = user.getSecUid();
            l.b(secUid, "");
            com.ss.android.ugc.aweme.user.f.d(secUid);
            eVar.c();
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateCurAwemeCount(int i2) {
        init();
        e eVar = e.f142364k;
        eVar.b().setAwemeCount(Math.max(0, eVar.b().getAwemeCount() + i2));
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateCurFollowingCount(int i2) {
        init();
        e eVar = e.f142364k;
        eVar.b().setFollowingCount(Math.max(0, eVar.b().getFollowingCount() + i2));
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateCurNickname(String str) {
        init();
        e eVar = e.f142364k;
        if (!TextUtils.equals(eVar.b().getNickname(), str)) {
            eVar.b().setNickname(str);
            eVar.f142366a = true;
            com.ss.android.ugc.aweme.user.f.a(eVar.b());
            dr.a(6, null, eVar.b());
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateCurRepostCount(int i2) {
        init();
        e eVar = e.f142364k;
        eVar.b().setRepostCount(Math.max(0, eVar.b().getRepostCount() + i2));
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateCurSecret(boolean z) {
        init();
        e eVar = e.f142364k;
        if (eVar.b().isSecret() != z) {
            eVar.b().setSecret(z);
            eVar.f142366a = true;
            com.ss.android.ugc.aweme.user.f.a(eVar.b());
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateCurSignature(String str) {
        init();
        e eVar = e.f142364k;
        if (!TextUtils.equals(eVar.b().getSignature(), str)) {
            eVar.b().setSignature(str);
            eVar.f142366a = true;
            com.ss.android.ugc.aweme.user.f.a(eVar.b());
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void queryUser(Handler handler) {
        init();
        com.ss.android.ugc.aweme.user.b.a.a(handler, ((IAccountHelperService) a.a(IAccountHelperService.class)).selfUserApi());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateSchool(Handler handler, Map<String, String> map) {
        init();
        com.ss.android.ugc.aweme.user.b.a.a(handler, map, 8);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateUserInfo(Handler handler, Map<String, String> map) {
        init();
        com.ss.android.ugc.aweme.user.b.a.a(handler, map, 112);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void registerNotice(String str, int i2) {
        init();
        n.a().a(e.f142364k.f142369d, new Callable(str, i2) {
            /* class com.ss.android.ugc.aweme.user.b.a.AnonymousClass7 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f142342a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f142343b;

            static {
                Covode.recordClassIndex(93104);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(this.f142342a)) {
                    hashMap.put("phone_number", this.f142342a);
                }
                hashMap.put("login_type", String.valueOf(this.f142343b));
                dr.f83127b.b(a.f142324a, hashMap);
                return null;
            }

            {
                this.f142342a = r1;
                this.f142343b = r2;
            }
        }, 114);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void delete(String str, String str2) {
        l.d(str2, "");
        init();
        a.C1450a.a(com.ss.android.ugc.aweme.account.m.a.f65142b + "|delete:" + str2);
        e.f142364k.c(str);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public User queryUser(String str, boolean z) {
        init();
        if (str == null || str.length() == 0) {
            str = ((IAccountHelperService) a.a(IAccountHelperService.class)).selfUserApi();
        }
        User a2 = com.ss.android.ugc.aweme.user.d.a(str, z);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateSecret(Handler handler, boolean z, int i2) {
        updateSecret(handler, z, i2, false);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateAllowStatus(Handler handler, int i2, int i3) {
        init();
        com.ss.android.ugc.aweme.user.b.a.a(handler, "allow_status", String.valueOf(i2), i3, 5);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateAvatarUri(Handler handler, String str, int i2) {
        init();
        com.ss.android.ugc.aweme.user.b.a.a(handler, "avatar_uri", str, i2, 4);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateId(Handler handler, String str, int i2) {
        init();
        com.ss.android.ugc.aweme.user.b.a.a(handler, "unique_id", str, i2, 116);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateInsId(Handler handler, String str, int i2) {
        init();
        com.ss.android.ugc.aweme.user.b.a.a(handler, "ins_id", str, i2, 6);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateLanguage(Handler handler, String str, int i2) {
        init();
        com.ss.android.ugc.aweme.user.b.a.a(handler, "language_change", str, i2, 124);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateNickName(Handler handler, String str, int i2) {
        init();
        com.ss.android.ugc.aweme.user.b.a.a(handler, "nickname", str, i2, 0);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateSignature(Handler handler, String str, int i2) {
        init();
        com.ss.android.ugc.aweme.user.b.a.a(handler, "signature", str, i2, 2);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateSupportedNgo(Handler handler, int i2, int i3) {
        init();
        com.ss.android.ugc.aweme.user.b.a.a(handler, "supporting_ngo_id", String.valueOf(i2), i3, 12);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateProfileWidgetShouldShow(Handler handler, boolean z, int i2) {
        String str;
        init();
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        com.ss.android.ugc.aweme.user.b.a.a(handler, "badge_info", str, i2, 13);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public /* synthetic */ void updateProfileWidgetId(Handler handler, Long l2, int i2) {
        long longValue = l2.longValue();
        init();
        com.ss.android.ugc.aweme.user.b.a.a(handler, ag.c(v.a("badge_info", "1"), v.a("profile_badge_id", String.valueOf(longValue)), v.a("page_from", String.valueOf(i2))), 13);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateCurAvatar(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3) {
        init();
        e eVar = e.f142364k;
        if (urlModel != null && urlModel2 != null && urlModel3 != null) {
            User b2 = eVar.b();
            if (!(b2.getAvatarThumb() == null || b2.getAvatarMedium() == null || b2.getAvatarLarger() == null)) {
                UrlModel avatarThumb = b2.getAvatarThumb();
                l.b(avatarThumb, "");
                if (!TextUtils.equals(avatarThumb.getUri(), urlModel.getUri())) {
                    UrlModel avatarMedium = b2.getAvatarMedium();
                    l.b(avatarMedium, "");
                    if (!TextUtils.equals(avatarMedium.getUri(), urlModel2.getUri())) {
                        UrlModel avatarLarger = b2.getAvatarLarger();
                        l.b(avatarLarger, "");
                        if (TextUtils.equals(avatarLarger.getUri(), urlModel3.getUri())) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            b2.setAvatarThumb(urlModel);
            b2.setAvatarMedium(urlModel2);
            b2.setAvatarLarger(urlModel3);
            com.ss.android.ugc.aweme.user.f.a(b2);
            dr.a(7, null, b2);
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void uploadCover(Handler handler, String str, int i2, String str2) {
        init();
        com.ss.android.ugc.aweme.user.b.a.a(handler, str, i2, str2, (List<com.ss.android.http.a.b.d>) null, 126);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateSecret(Handler handler, boolean z, int i2, boolean z2) {
        String str;
        init();
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        com.ss.android.ugc.aweme.user.b.a.a(handler, "secret", str, i2, 122, z2);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateCoverUri(Handler handler, String str, int i2, int i3) {
        l.d(str, "");
        init();
        l.d(str, "");
        com.ss.android.ugc.aweme.user.b.a.a(handler, ag.c(v.a("cover_uri", str), v.a("cover_source", String.valueOf(i2)), v.a("page_from", String.valueOf(i3))), 10);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateNickNameWithSupplementray(Handler handler, String str, List<String> list, int i2) {
        List<String> list2 = list;
        l.d(str, "");
        init();
        if (list2 == null) {
            list2 = h.a.z.INSTANCE;
        }
        l.d(str, "");
        l.d(list2, "");
        List g2 = h.a.n.g((Iterable) list2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : g2) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        com.ss.android.ugc.aweme.user.b.a.a(handler, ag.c(v.a("nickname", str), v.a("supplementary_img_uri", h.a.n.a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (b) null, 62)), v.a("page_from", String.valueOf(i2))), 0);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void uploadAvatar(Handler handler, String str, int i2, String str2, List<? extends com.ss.android.http.a.b.d> list) {
        init();
        com.ss.android.ugc.aweme.user.b.a.a(handler, str, i2, str2, (List<com.ss.android.http.a.b.d>) list, 111);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void uploadVideoAvatar(Handler handler, String str, int i2, String str2, List<? extends com.ss.android.http.a.b.d> list) {
        init();
        com.ss.android.ugc.aweme.user.b.a.a(handler, str, i2, str2, (List<com.ss.android.http.a.b.d>) list, 121);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateCurSchoolInfo(String str, String str2, String str3, int i2, int i3) {
        init();
        e eVar = e.f142364k;
        eVar.b().setEducation(i2);
        eVar.b().setSchoolInfoShowRange(i3);
        eVar.f142366a = true;
        com.ss.android.ugc.aweme.user.f.a(eVar.b());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void uploadCommerceHeadImage(Handler handler, String str, int i2, String str2, String str3) {
        init();
        com.ss.android.ugc.aweme.user.b.a.a(handler, str, i2, str2, h.a.n.a(new com.ss.android.http.a.b.d("source", str3)), 125);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void updateVideoCoverUri(Handler handler, String str, String str2, int i2, int i3) {
        l.d(str, "");
        l.d(str2, "");
        init();
        l.d(str, "");
        l.d(str2, "");
        HashMap c2 = ag.c(v.a("cover_video_id", str), v.a("cover_video_offset", String.valueOf(i2)), v.a("page_from", String.valueOf(i3)));
        if (!TextUtils.isEmpty(str2)) {
            c2.put("cover_item_id", str2);
        }
        com.ss.android.ugc.aweme.user.b.a.a(handler, c2, 11);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public void uploadAvatar(Handler handler, String str, int i2, String str2, List<? extends com.ss.android.http.a.b.d> list, String str3) {
        init();
        n.a().a(handler, new Callable(str, i2, str2, str3, list) {
            /* class com.ss.android.ugc.aweme.user.b.a.AnonymousClass5 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f142336a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f142337b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f142338c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f142339d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ List f142340e;

            static {
                Covode.recordClassIndex(93102);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return dr.f83127b.a(this.f142336a, this.f142337b, this.f142338c, TcmImage.class, this.f142339d, this.f142340e);
            }

            {
                this.f142336a = r1;
                this.f142337b = r2;
                this.f142338c = r3;
                this.f142339d = r4;
                this.f142340e = r5;
            }
        }, 111);
    }
}
