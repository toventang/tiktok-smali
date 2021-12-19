package com.ss.android.ugc.aweme.profile;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ar;
import com.ss.android.ugc.aweme.bp;
import com.ss.android.ugc.aweme.by;
import com.ss.android.ugc.aweme.bz;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.q;
import com.ss.android.ugc.aweme.profile.presenter.w;
import h.f.b.l;
import h.o;
import java.util.List;

public final class ProfileDowngradeService implements IProfileService {
    static {
        Covode.recordClassIndex(74699);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final int a(User user) {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String a() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String a(boolean z) {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void a(Activity activity, String str, String str2) {
        l.d(activity, "");
        l.d(str, "");
        l.d(str2, "");
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void a(String str, String str2, String str3, int i2, boolean z, View view, f fVar) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(view, "");
        l.d(fVar, "");
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String b() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void b(i iVar, com.ss.android.ugc.aweme.profile.e.a aVar, String str) {
        l.d(iVar, "");
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean b(Context context) {
        l.d(context, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean c() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final int getMessageProfile() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCropActivity(Activity activity, String str, boolean z, float f2, int i2, int i3, int i4, int i5, int i6, boolean z2) {
        l.d(activity, "");
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void mobRefreshInProfileAweme(com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, List<? extends Aweme> list) {
        l.d(aVar, "");
        l.d(list, "");
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean needShowCompleteProfileGuideBar() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean needShowSafeInfoNotice() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Fragment obtainMyProfileFragment() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Fragment obtainUserProfileFragment() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void preloadProfile(e eVar, String str) {
        l.d(eVar, "");
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryProfileResponseWithDoubleId(Handler handler, String str, String str2, String str3, int i2) {
        l.d(handler, "");
        l.d(str3, "");
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean showRemindUserCompleteProfileDialog(Context context, String str, String str2, DialogInterface.OnDismissListener onDismissListener) {
        l.d(context, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePermission(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateUserInfo(Fragment fragment, Aweme aweme) {
    }

    public static final class a implements bp {
        static {
            Covode.recordClassIndex(74700);
        }

        @Override // com.ss.android.ugc.aweme.bp
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.bp
        public final void b() {
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.bp
        public final void a(Intent intent) {
            l.d(intent, "");
            l.d(intent, "");
        }
    }

    public static final class b implements by {
        static {
            Covode.recordClassIndex(74701);
        }

        @Override // com.ss.android.ugc.aweme.by
        public final String U_() {
            return "";
        }

        @Override // com.ss.android.ugc.aweme.by
        public final int a() {
            return -2;
        }

        @Override // com.ss.android.ugc.aweme.by
        public final View a(bz bzVar) {
            l.d(bzVar, "");
            return null;
        }

        @Override // com.ss.android.ugc.aweme.by
        public final String d() {
            return "";
        }

        @Override // com.ss.android.ugc.aweme.by
        public final void h() {
        }

        @Override // com.ss.android.ugc.aweme.by
        public final void i() {
        }

        b() {
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final com.ss.android.ugc.aweme.common.e.a<Aweme, ?> createAwemeModel() {
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final /* synthetic */ q d() {
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final /* synthetic */ Fragment e() {
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void f() {
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Object getPushSettingCallback() {
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final w newUserPresenter() {
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final bp a(Activity activity) {
        l.d(activity, "");
        return new a();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final by a(Context context) {
        l.d(context, "");
        return new b();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final ar c(Context context) {
        l.d(context, "");
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void a(Handler handler) {
        l.d(handler, "");
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String a(Aweme aweme, ac acVar) {
        l.d(aweme, "");
        l.d(acVar, "");
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void a(String str, String str2) {
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final User queryUser(String str, boolean z, String str2) {
        l.d(str, "");
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void a(i iVar, com.ss.android.ugc.aweme.profile.e.a aVar, String str) {
        l.d(iVar, "");
        l.d(str, "");
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String userUrl(String str, String str2, String str3, int i2) {
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void a(Aweme aweme, Integer num, int i2, String str) {
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final com.ss.android.ugc.aweme.profile.ui.b newBasicAwemeListFragment(int i2, int i3, String str, String str2, boolean z, boolean z2) {
        l.d(str, "");
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }
}
