package com.ss.android.ugc.aweme.profile;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ar;
import com.ss.android.ugc.aweme.bp;
import com.ss.android.ugc.aweme.by;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.e.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.q;
import com.ss.android.ugc.aweme.profile.presenter.w;
import com.ss.android.ugc.aweme.profile.ui.b;
import java.util.List;

public interface IProfileService {
    static {
        Covode.recordClassIndex(74698);
    }

    int a(User user);

    bp a(Activity activity);

    by a(Context context);

    String a();

    String a(Aweme aweme, ac acVar);

    String a(boolean z);

    void a(Activity activity, String str, String str2);

    void a(Handler handler);

    void a(i iVar, a aVar, String str);

    void a(Aweme aweme, Integer num, int i2, String str);

    void a(String str, String str2);

    void a(String str, String str2, String str3, int i2, boolean z, View view, f fVar);

    String b();

    void b(i iVar, a aVar, String str);

    boolean b(Context context);

    ar c(Context context);

    boolean c();

    com.ss.android.ugc.aweme.common.e.a<Aweme, ?> createAwemeModel();

    q<?, ?> d();

    Fragment e();

    void f();

    int getMessageProfile();

    Object getPushSettingCallback();

    void gotoCropActivity(Activity activity, String str, boolean z, float f2, int i2, int i3, int i4, int i5, int i6, boolean z2);

    void mobRefreshInProfileAweme(com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, List<? extends Aweme> list);

    boolean needShowCompleteProfileGuideBar();

    boolean needShowSafeInfoNotice();

    b newBasicAwemeListFragment(int i2, int i3, String str, String str2, boolean z, boolean z2);

    w newUserPresenter();

    Fragment obtainMyProfileFragment();

    Fragment obtainUserProfileFragment();

    void preloadProfile(e eVar, String str);

    void queryProfileResponseWithDoubleId(Handler handler, String str, String str2, String str3, int i2);

    User queryUser(String str, boolean z, String str2);

    boolean showRemindUserCompleteProfileDialog(Context context, String str, String str2, DialogInterface.OnDismissListener onDismissListener);

    void updateProfilePermission(boolean z);

    void updateUserInfo(Fragment fragment, Aweme aweme);

    String userUrl(String str, String str2, String str3, int i2);
}
