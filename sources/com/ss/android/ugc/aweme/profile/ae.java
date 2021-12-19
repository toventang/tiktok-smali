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
import h.f.b.l;
import java.util.List;

public final class ae implements IProfileService {

    /* renamed from: a  reason: collision with root package name */
    public static final ae f115954a = new ae();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IProfileService f115955b;

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final int a(User user) {
        return this.f115955b.a(user);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final bp a(Activity activity) {
        l.d(activity, "");
        return this.f115955b.a(activity);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final by a(Context context) {
        l.d(context, "");
        return this.f115955b.a(context);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String a() {
        return this.f115955b.a();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String a(Aweme aweme, ac acVar) {
        l.d(aweme, "");
        l.d(acVar, "");
        return this.f115955b.a(aweme, acVar);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String a(boolean z) {
        return this.f115955b.a(z);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void a(Activity activity, String str, String str2) {
        l.d(activity, "");
        l.d(str, "");
        l.d(str2, "");
        this.f115955b.a(activity, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void a(Handler handler) {
        l.d(handler, "");
        this.f115955b.a(handler);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void a(i iVar, a aVar, String str) {
        l.d(iVar, "");
        l.d(str, "");
        this.f115955b.a(iVar, aVar, str);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void a(Aweme aweme, Integer num, int i2, String str) {
        this.f115955b.a(aweme, num, i2, str);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void a(String str, String str2) {
        this.f115955b.a(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void a(String str, String str2, String str3, int i2, boolean z, View view, f fVar) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(view, "");
        l.d(fVar, "");
        this.f115955b.a(str, str2, str3, i2, z, view, fVar);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String b() {
        return this.f115955b.b();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void b(i iVar, a aVar, String str) {
        l.d(iVar, "");
        l.d(str, "");
        this.f115955b.b(iVar, aVar, str);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean b(Context context) {
        l.d(context, "");
        return this.f115955b.b(context);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final ar c(Context context) {
        l.d(context, "");
        return this.f115955b.c(context);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean c() {
        return this.f115955b.c();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final com.ss.android.ugc.aweme.common.e.a<Aweme, ?> createAwemeModel() {
        return this.f115955b.createAwemeModel();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final q<?, ?> d() {
        return this.f115955b.d();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Fragment e() {
        return this.f115955b.e();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void f() {
        this.f115955b.f();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final int getMessageProfile() {
        return this.f115955b.getMessageProfile();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Object getPushSettingCallback() {
        return this.f115955b.getPushSettingCallback();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCropActivity(Activity activity, String str, boolean z, float f2, int i2, int i3, int i4, int i5, int i6, boolean z2) {
        l.d(activity, "");
        l.d(str, "");
        this.f115955b.gotoCropActivity(activity, str, z, f2, i2, i3, i4, i5, i6, z2);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void mobRefreshInProfileAweme(com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, List<? extends Aweme> list) {
        l.d(aVar, "");
        l.d(list, "");
        this.f115955b.mobRefreshInProfileAweme(aVar, list);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean needShowCompleteProfileGuideBar() {
        return this.f115955b.needShowCompleteProfileGuideBar();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean needShowSafeInfoNotice() {
        return this.f115955b.needShowSafeInfoNotice();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final b newBasicAwemeListFragment(int i2, int i3, String str, String str2, boolean z, boolean z2) {
        l.d(str, "");
        return this.f115955b.newBasicAwemeListFragment(i2, i3, str, str2, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final w newUserPresenter() {
        return this.f115955b.newUserPresenter();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Fragment obtainMyProfileFragment() {
        return this.f115955b.obtainMyProfileFragment();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Fragment obtainUserProfileFragment() {
        return this.f115955b.obtainUserProfileFragment();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void preloadProfile(e eVar, String str) {
        l.d(eVar, "");
        l.d(str, "");
        this.f115955b.preloadProfile(eVar, str);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryProfileResponseWithDoubleId(Handler handler, String str, String str2, String str3, int i2) {
        l.d(handler, "");
        l.d(str3, "");
        this.f115955b.queryProfileResponseWithDoubleId(handler, str, str2, str3, i2);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final User queryUser(String str, boolean z, String str2) {
        l.d(str, "");
        return this.f115955b.queryUser(str, z, str2);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean showRemindUserCompleteProfileDialog(Context context, String str, String str2, DialogInterface.OnDismissListener onDismissListener) {
        l.d(context, "");
        return this.f115955b.showRemindUserCompleteProfileDialog(context, str, str2, onDismissListener);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePermission(boolean z) {
        this.f115955b.updateProfilePermission(z);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateUserInfo(Fragment fragment, Aweme aweme) {
        this.f115955b.updateUserInfo(fragment, aweme);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String userUrl(String str, String str2, String str3, int i2) {
        return this.f115955b.userUrl(str, str2, str3, i2);
    }

    static {
        Covode.recordClassIndex(74782);
    }

    private ae() {
        IProfileService g2 = ProfileServiceImpl.g();
        l.b(g2, "");
        this.f115955b = g2;
    }
}
