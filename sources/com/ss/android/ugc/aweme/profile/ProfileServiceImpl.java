package com.ss.android.ugc.aweme.profile;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.ar;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.bp;
import com.ss.android.ugc.aweme.by;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import com.ss.android.ugc.aweme.commercialize.utils.bh;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.ui.d;
import com.ss.android.ugc.aweme.net.preload.PowerPreloadServiceImpl;
import com.ss.android.ugc.aweme.notificationlive.t;
import com.ss.android.ugc.aweme.notificationlive.ui.i;
import com.ss.android.ugc.aweme.profile.api.AwemeApi;
import com.ss.android.ugc.aweme.profile.api.e;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.b;
import com.ss.android.ugc.aweme.profile.presenter.q;
import com.ss.android.ugc.aweme.profile.ui.c.d;
import com.ss.android.ugc.aweme.profile.ui.profiletab.ProfileTab;
import com.ss.android.ugc.aweme.utils.fg;
import com.zhiliaoapp.musically.R;
import f.a.l.c;
import h.f.b.l;
import h.m.p;
import java.util.HashMap;

public final class ProfileServiceImpl extends BaseProfileServiceImpl {
    static {
        Covode.recordClassIndex(74702);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String b() {
        return "/tiktok/user/permission/get/v1/";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        if (r0.intValue() != 0) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a  */
    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ProfileServiceImpl.a(java.lang.String, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void a(String str, String str2, String str3, int i2, boolean z, View view, f fVar) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(view, "");
        l.d(fVar, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(view, "");
        l.d(fVar, "");
        User user = new User();
        user.setUid(str);
        user.setUniqueId(str2);
        user.setFollowStatus(1);
        user.setLivePushNotificationStatus(i2);
        user.setSecUid(str3);
        c<com.ss.android.ugc.aweme.notificationlive.a> a2 = t.a();
        if (a2 != null) {
            a2.onNext(new com.ss.android.ugc.aweme.notificationlive.a(user, o.a(view.getContext()), "", "others_homepage", z, fVar));
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean c() {
        return t.b();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final /* synthetic */ q d() {
        return new b();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final /* synthetic */ Fragment e() {
        return new i();
    }

    public static IProfileService g() {
        Object a2 = com.ss.android.ugc.b.a(IProfileService.class, false);
        if (a2 != null) {
            return (IProfileService) a2;
        }
        return new ProfileServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void f() {
        PowerPreloadServiceImpl.a().a("/aweme/v1/user/profile/other/", null);
        PowerPreloadServiceImpl.a().a("/aweme/v1/aweme/post/", null);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String a() {
        return Uri.parse(com.ss.android.ugc.aweme.profile.api.c.f116006a).buildUpon().toString();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String a(boolean z) {
        return com.ss.android.ugc.aweme.profile.api.c.a(z);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final int a(User user) {
        if (user == null) {
            return 0;
        }
        return user.getCommerceUserLevel();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean b(Context context) {
        l.d(context, "");
        return fg.a(context);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final ar c(Context context) {
        l.d(context, "");
        ar a2 = com.ss.android.ugc.aweme.profile.ui.profiletab.b.a(context);
        l.b(a2, "");
        return a2;
    }

    public static final class a extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Dialog f115796a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f115797b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f115798c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f115799d;

        static {
            Covode.recordClassIndex(74703);
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setColor(androidx.core.content.b.c(this.f115797b, R.color.bx));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            l.d(view, "");
            if (this.f115796a.isShowing()) {
                this.f115796a.dismiss();
            }
            SmartRouter.buildRoute(this.f115797b, "//privacy/suggest_account").withParam("enter_from", this.f115798c).withParam("previous_page", this.f115799d).withParam("is_rec", 1).open();
        }

        a(Dialog dialog, Activity activity, String str, String str2) {
            this.f115796a = dialog;
            this.f115797b = activity;
            this.f115798c = str;
            this.f115799d = str2;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final bp a(Activity activity) {
        l.d(activity, "");
        return new com.ss.android.ugc.aweme.aw.a(activity);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final by a(Context context) {
        l.d(context, "");
        return new ProfileTab(context);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void a(Handler handler) {
        l.d(handler, "");
        e.a();
        e.a(handler, com.ss.android.ugc.aweme.account.b.g().getCurUserId(), com.ss.android.ugc.aweme.account.b.g().getCurSecUserId(), null, 0, false);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String a(Aweme aweme, ac acVar) {
        String aid;
        l.d(aweme, "");
        l.d(acVar, "");
        ac a2 = bh.a(aweme);
        if (a2 == null || aweme == null) {
            aid = "";
        } else {
            HashMap hashMap = new HashMap();
            String str = a2.creativeId;
            String str2 = a2.logExtra;
            aid = aweme.getAid();
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("creative_id", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("log_extra", str2);
            }
            com.ss.android.common.applog.q.b(hashMap, true);
            AwemeApi.f115980e.disLikeAweme(aid, hashMap).execute();
        }
        l.b(aid, "");
        return aid;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void b(androidx.fragment.app.i iVar, com.ss.android.ugc.aweme.profile.e.a aVar, String str) {
        l.d(iVar, "");
        l.d(str, "");
        l.d(iVar, "");
        l.d(str, "");
        a.C1112a aVar2 = new a.C1112a();
        com.ss.android.ugc.aweme.profile.ui.c.a aVar3 = new com.ss.android.ugc.aweme.profile.ui.c.a();
        Bundle bundle = new Bundle();
        if (aVar != null) {
            bundle.putString("enter_from", aVar.f116064a);
            bundle.putString("enter_method", aVar.f116065b);
        }
        aVar3.setArguments(bundle);
        aVar2.a(aVar3).a(1).a(true).b(false).f45299a.show(iVar, str);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void a(Activity activity, String str, String str2) {
        MethodCollector.i(9118);
        l.d(activity, "");
        l.d(str, "");
        l.d(str2, "");
        View inflate = LayoutInflater.from(activity).inflate(R.layout.aqc, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.ezf);
        l.b(findViewById, "");
        TextView textView = (TextView) findViewById;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(androidx.core.content.b.c(activity, R.color.c9));
        l.b(inflate, "");
        Dialog a2 = d.a(activity, inflate, R.style.v_);
        String string = activity.getResources().getString(R.string.cwj);
        l.b(string, "");
        String string2 = activity.getResources().getString(R.string.cab, string);
        l.b(string2, "");
        int a3 = p.a((CharSequence) string2, string, 0, false, 6);
        int length = string.length() + a3;
        SpannableString spannableString = new SpannableString(string2);
        if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string) && a3 >= 0) {
            spannableString.setSpan(new a(a2, activity, str, str2), a3, length, 34);
            spannableString.setSpan(new StyleSpan(1), a3, length, 34);
        }
        textView.setText(spannableString);
        a2.show();
        MethodCollector.o(9118);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void a(androidx.fragment.app.i iVar, com.ss.android.ugc.aweme.profile.e.a aVar, String str) {
        l.d(iVar, "");
        l.d(str, "");
        d.a.a(iVar, aVar, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        if (r10 != null) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a1, code lost:
        if (r10 != null) goto L_0x0017;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.feed.model.Aweme r10, java.lang.Integer r11, int r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ProfileServiceImpl.a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Integer, int, java.lang.String):void");
    }
}
