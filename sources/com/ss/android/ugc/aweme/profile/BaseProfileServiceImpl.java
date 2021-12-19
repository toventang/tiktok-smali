package com.ss.android.ugc.aweme.profile;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.profile.ac;
import com.ss.android.ugc.aweme.profile.api.c;
import com.ss.android.ugc.aweme.profile.d.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.ae;
import com.ss.android.ugc.aweme.profile.presenter.b;
import com.ss.android.ugc.aweme.profile.ui.CropActivity;
import com.ss.android.ugc.aweme.profile.ui.v2.i;
import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseProfileServiceImpl implements IProfileService {
    static {
        Covode.recordClassIndex(74697);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public int getMessageProfile() {
        return 0;
    }

    public boolean needShowCompleteProfileGuide() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public boolean showRemindUserCompleteProfileDialog(Context context, String str, String str2, DialogInterface.OnDismissListener onDismissListener) {
        l.d(context, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public Object getPushSettingCallback() {
        return ah.f115957a;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public a<Aweme, ?> createAwemeModel() {
        return new b();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public boolean needShowSafeInfoNotice() {
        return com.ss.android.ugc.aweme.profile.service.b.f116618a.needShowSafeInfoNotice();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public ae newUserPresenter() {
        return new ae();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public Fragment obtainMyProfileFragment() {
        if (MSAdaptionService.c().a(d.a())) {
            return new com.ss.android.ugc.aweme.profile.ui.v2.b();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public boolean needShowCompleteProfileGuideBar() {
        boolean z;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        User curUser = g2.getCurUser();
        l.b(curUser, "");
        if (curUser.getProfileCompletion() <= 0.0f || curUser.getProfileCompletion() > 0.7f) {
            z = false;
        } else {
            z = true;
        }
        if (!needShowCompleteProfileGuide() || (!z && !curUser.nicknameUpdateReminder() && !curUser.avatarUpdateReminder())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public Fragment obtainUserProfileFragment() {
        if (!MSAdaptionService.c().a(d.a())) {
            return null;
        }
        i iVar = new i();
        if (MSAdaptionService.c().c(d.a())) {
            iVar.a("homepage_hot");
        }
        return iVar;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public void updateProfilePermission(boolean z) {
        MyProfileGuideViewModel myProfileGuideViewModel;
        WeakReference<MyProfileGuideViewModel> weakReference = ac.f115952b;
        if (!(weakReference == null || (myProfileGuideViewModel = weakReference.get()) == null)) {
            myProfileGuideViewModel.g(new ac.a(z));
        }
        ac.f115951a = z;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public void updateUserInfo(Fragment fragment, Aweme aweme) {
        if (MSAdaptionService.c().a(d.a()) && (fragment instanceof com.ss.android.ugc.aweme.profile.ui.d.d)) {
            ((com.ss.android.ugc.aweme.profile.ui.d.d) fragment).b(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public void mobRefreshInProfileAweme(a<?, ?> aVar, List<? extends Aweme> list) {
        l.d(aVar, "");
        l.d(list, "");
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            bVar.setItems(new ArrayList(list));
            ((FeedItemList) bVar.mData).cursor = (long) list.size();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public void preloadProfile(e eVar, String str) {
        l.d(eVar, "");
        l.d(str, "");
        l.d(eVar, "");
        l.d(str, "");
        Aweme aweme = HomePageDataViewModel.a.a(eVar).f99124g;
        if (aweme != null && !aweme.getIsPreloadScroll() && TextUtils.equals(str, "page_profile")) {
            aweme.setIsPreloadScroll(true);
            b.i.b(new b.a(aweme), b.i.f4824a);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public User queryUser(String str, boolean z, String str2) {
        l.d(str, "");
        User a2 = c.a(str, z, str2);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public String userUrl(String str, String str2, String str3, int i2) {
        String a2 = c.a(str, str2, i2, true);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public void queryProfileResponseWithDoubleId(Handler handler, String str, String str2, String str3, int i2) {
        l.d(handler, "");
        l.d(str3, "");
        com.ss.android.ugc.aweme.profile.api.e.a();
        com.ss.android.ugc.aweme.profile.api.e.a(handler, str, str2, str3, i2, true);
    }

    public boolean showRemindUserCompleteProfileDialogAfterFollow(Context context, String str, String str2, User user, int i2) {
        l.d(context, "");
        l.d(user, "");
        if ((!l.a((Object) str2, (Object) "follow") && !l.a((Object) str2, (Object) "follow_guide")) || com.ss.android.ugc.aweme.profile.ui.ae.b(user) >= 1000) {
            return false;
        }
        if (i2 == 1 || i2 == 2 || i2 == 4) {
            return showRemindUserCompleteProfileDialog(context, str, "follow_guide", null);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public com.ss.android.ugc.aweme.profile.ui.b newBasicAwemeListFragment(int i2, int i3, String str, String str2, boolean z, boolean z2) {
        l.d(str, "");
        if (str2 == null) {
            str2 = "";
        }
        Bundle bundle = new Bundle();
        com.ss.android.ugc.aweme.profile.ui.c cVar = new com.ss.android.ugc.aweme.profile.ui.c();
        bundle.putInt(StringSet.type, i3);
        bundle.putString("uid", str);
        bundle.putString("sec_user_id", str2);
        bundle.putBoolean("is_my_profile", z);
        bundle.putBoolean("is_scene_transition_enable", false);
        bundle.putInt("bottom_bar_height", i2);
        bundle.putBoolean("should_refresh_on_init_data", z2);
        cVar.setArguments(bundle);
        l.b(cVar, "");
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public void gotoCropActivity(Activity activity, String str, boolean z, float f2, int i2, int i3, int i4, int i5, int i6, boolean z2) {
        l.d(activity, "");
        l.d(str, "");
        CropActivity.a.a(activity, str, z, f2, i2, i3, i4, i5, i6, z2);
    }
}
