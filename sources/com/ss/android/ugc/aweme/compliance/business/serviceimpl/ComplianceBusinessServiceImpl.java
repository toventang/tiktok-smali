package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.compliance.business.commentfilter.c.a;
import com.ss.android.ugc.aweme.fe.a.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.List;

public final class ComplianceBusinessServiceImpl implements IComplianceBusinessService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f77161a = new a((byte) 0);

    static {
        Covode.recordClassIndex(47702);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47703);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements com.ss.android.ugc.aweme.setting.serverpush.a {
        static {
            Covode.recordClassIndex(47704);
        }

        @Override // com.ss.android.ugc.aweme.setting.serverpush.a
        public final void a(Exception exc) {
            l.d(exc, "");
        }

        b() {
        }

        @Override // com.ss.android.ugc.aweme.setting.serverpush.a
        public final void a(f fVar) {
            l.d(fVar, "");
            com.ss.android.ugc.aweme.compliance.common.b.a(fVar.ae);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final Object a() {
        return com.ss.android.ugc.aweme.compliance.business.commentfilter.c.a.f76874a;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final List<String> b() {
        return com.ss.android.ugc.aweme.compliance.common.b.j();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final String d() {
        return com.ss.android.ugc.aweme.compliance.common.b.k();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean g() {
        return com.ss.android.ugc.aweme.compliance.common.b.d();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final /* synthetic */ Object j() {
        return new b();
    }

    public static final class c implements com.ss.android.ugc.aweme.setting.serverpush.b.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f77162a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f77163b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f77164c;

        static {
            Covode.recordClassIndex(47705);
        }

        @Override // com.ss.android.ugc.aweme.setting.serverpush.b.b
        public final void av_() {
        }

        @Override // com.ss.android.ugc.aweme.setting.serverpush.b.b
        public final void cf_() {
            com.ss.android.ugc.aweme.compliance.common.b.a(this.f77162a);
            h.f.a.a aVar = this.f77163b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        c(int i2, h.f.a.a aVar, int i3) {
            this.f77162a = i2;
            this.f77163b = aVar;
            this.f77164c = i3;
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final int h() {
        Integer a2 = com.ss.android.ugc.aweme.compliance.common.b.f77288b.a();
        if (a2 != null) {
            return a2.intValue();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final String e() {
        String privacyPolicyUrl;
        ComplianceSetting c2 = com.ss.android.ugc.aweme.compliance.common.b.f77288b.c();
        if (c2 == null || (privacyPolicyUrl = c2.getPrivacyPolicyUrl()) == null) {
            return "";
        }
        return privacyPolicyUrl;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final int i() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (g2.isLogin()) {
            return 2;
        }
        return 0;
    }

    public static IComplianceBusinessService k() {
        MethodCollector.i(6273);
        Object a2 = com.ss.android.ugc.b.a(IComplianceBusinessService.class, false);
        if (a2 != null) {
            IComplianceBusinessService iComplianceBusinessService = (IComplianceBusinessService) a2;
            MethodCollector.o(6273);
            return iComplianceBusinessService;
        }
        if (com.ss.android.ugc.b.aE == null) {
            synchronized (IComplianceBusinessService.class) {
                try {
                    if (com.ss.android.ugc.b.aE == null) {
                        com.ss.android.ugc.b.aE = new ComplianceBusinessServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6273);
                    throw th;
                }
            }
        }
        ComplianceBusinessServiceImpl complianceBusinessServiceImpl = (ComplianceBusinessServiceImpl) com.ss.android.ugc.b.aE;
        MethodCollector.o(6273);
        return complianceBusinessServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean c() {
        Integer enableImpressum;
        ComplianceSetting c2 = com.ss.android.ugc.aweme.compliance.common.b.f77288b.c();
        if (c2 == null || (enableImpressum = c2.getEnableImpressum()) == null || enableImpressum.intValue() == 0 || TextUtils.isEmpty(com.ss.android.ugc.aweme.compliance.common.b.k())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final String f() {
        String str;
        String string;
        com.ss.android.ugc.aweme.compliance.common.b.a aVar = com.ss.android.ugc.aweme.compliance.common.b.f77288b;
        if (aVar.f77305e != null) {
            string = aVar.f77305e;
        } else {
            Keva keva = aVar.f77301a;
            ComplianceSetting c2 = aVar.c();
            if (c2 != null) {
                str = c2.getComplianceEncrypt();
            } else {
                str = null;
            }
            string = keva.getString("cmpl_enc", str);
        }
        if (string == null) {
            return "unknown";
        }
        return string;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final com.ss.android.ugc.aweme.compliance.api.c.c a(Activity activity) {
        l.d(activity, "");
        return new com.ss.android.ugc.aweme.compliance.business.banappeal.b(activity);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final View a(Context context, ViewGroup viewGroup) {
        l.d(context, "");
        l.d(viewGroup, "");
        return new com.ss.android.ugc.aweme.compliance.business.commentfilter.ui.a(context);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final o a(int i2, String str) {
        l.d(str, "");
        return com.ss.android.ugc.aweme.compliance.api.a.s().a(i2, str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void a(int i2, h.f.a.a<z> aVar) {
        int i3;
        Integer a2 = com.ss.android.ugc.aweme.compliance.common.b.f77288b.a();
        if (a2 != null) {
            i3 = a2.intValue();
        } else {
            i3 = 0;
        }
        com.ss.android.ugc.aweme.compliance.common.b.a(i2);
        com.ss.android.ugc.aweme.common.c<com.ss.android.ugc.aweme.common.b<BaseResponse>, com.ss.android.ugc.aweme.setting.serverpush.b.b> providePushSettingChangePresenter = com.ss.android.ugc.aweme.setting.services.f.f122672a.providePushSettingChangePresenter();
        providePushSettingChangePresenter.a_(new c(i3, aVar, i2));
        providePushSettingChangePresenter.a("photosensitive_videos_setting", Integer.valueOf(i2));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void a(Activity activity, Aweme aweme, Comment comment) {
        l.d(aweme, "");
        l.d(comment, "");
        l.d(aweme, "");
        l.d(comment, "");
        if (activity != null && !activity.isFinishing()) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            String curUserId = g2.getCurUserId();
            e eVar = e.a.f91018a;
            StringBuilder sb = new StringBuilder("comment_filter_function_open_");
            IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g3, "");
            Boolean a2 = eVar.a(sb.append(g3.getCurUserId()).toString(), (Boolean) false);
            l.b(a2, "");
            if (a2.booleanValue() && TextUtils.equals(aweme.getAuthorUid(), curUserId)) {
                User user = comment.getUser();
                l.b(user, "");
                if (!TextUtils.equals(user.getUid(), curUserId)) {
                    e eVar2 = e.a.f91018a;
                    String a3 = eVar2.a("settings_times_".concat(String.valueOf(curUserId)), "0");
                    l.b(a3, "");
                    if (Integer.parseInt(a3) <= 0) {
                        String a4 = eVar2.a("not_now_times_".concat(String.valueOf(curUserId)), "0");
                        l.b(a4, "");
                        if (Integer.parseInt(a4) <= 1) {
                            Dialog b2 = new a.C0731a(activity).b(R.string.b67).a(activity.getString(R.string.c5g), (DialogInterface.OnClickListener) new a.b(eVar2, curUserId, activity), false).b(activity.getString(R.string.dj3), (DialogInterface.OnClickListener) new a.c(eVar2, curUserId), false).a().b();
                            b2.setCanceledOnTouchOutside(false);
                            b2.setCancelable(false);
                        }
                    }
                }
            }
        }
    }
}
