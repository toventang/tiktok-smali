package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.CopyWritingInfo;
import com.ss.android.ugc.aweme.compliance.api.model.NewPersAdSettings;
import com.ss.android.ugc.aweme.compliance.api.services.gdpr.IGDPRService;
import com.ss.android.ugc.aweme.compliance.business.personalization.a.a;
import com.ss.android.ugc.aweme.compliance.common.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class GDPRServiceImpl implements IGDPRService {
    static {
        Covode.recordClassIndex(47707);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.gdpr.IGDPRService
    public final void c() {
        b.e();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.gdpr.IGDPRService
    public final int b() {
        return b.f();
    }

    public static IGDPRService d() {
        MethodCollector.i(5969);
        Object a2 = com.ss.android.ugc.b.a(IGDPRService.class, false);
        if (a2 != null) {
            IGDPRService iGDPRService = (IGDPRService) a2;
            MethodCollector.o(5969);
            return iGDPRService;
        }
        if (com.ss.android.ugc.b.aG == null) {
            synchronized (IGDPRService.class) {
                try {
                    if (com.ss.android.ugc.b.aG == null) {
                        com.ss.android.ugc.b.aG = new GDPRServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5969);
                    throw th;
                }
            }
        }
        GDPRServiceImpl gDPRServiceImpl = (GDPRServiceImpl) com.ss.android.ugc.b.aG;
        MethodCollector.o(5969);
        return gDPRServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.gdpr.IGDPRService
    public final boolean a() {
        Boolean bool;
        Boolean bool2;
        AdPersonalitySettings i2 = b.i();
        Boolean bool3 = null;
        if (i2 != null) {
            bool = i2.isShowSettings();
        } else {
            bool = null;
        }
        if (!l.a((Object) bool, (Object) true)) {
            if (b.h() == 2) {
                NewPersAdSettings g2 = b.g();
                if (g2 != null) {
                    bool2 = g2.getShowMode1P();
                } else {
                    bool2 = null;
                }
                if (!l.a((Object) bool2, (Object) true)) {
                    NewPersAdSettings g3 = b.g();
                    if (g3 != null) {
                        bool3 = g3.getShowMode3P();
                    }
                    if (l.a((Object) bool3, (Object) true)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.gdpr.IGDPRService
    public final void a(Activity activity) {
        CopyWritingInfo copyWritingInfo;
        String str;
        String str2;
        Integer promptStyle;
        String title;
        String str3 = "";
        l.d(activity, str3);
        l.d(activity, str3);
        AdPersonalitySettings i2 = b.i();
        String str4 = null;
        if (i2 != null) {
            copyWritingInfo = i2.getCopyWriting();
        } else {
            copyWritingInfo = null;
        }
        SpannableStringBuilder a2 = a.a(activity, copyWritingInfo);
        DmtTextView dmtTextView = new DmtTextView(activity);
        dmtTextView.setHighlightColor(androidx.core.content.b.c(activity, R.color.c9));
        dmtTextView.setText(a2);
        dmtTextView.setMovementMethod(LinkMovementMethod.getInstance());
        dmtTextView.setGravity(17);
        a.C0731a aVar = new a.C0731a(activity);
        aVar.E = true;
        if (copyWritingInfo == null || (str = copyWritingInfo.getConfirm()) == null) {
            str = str3;
        }
        a.C0731a a3 = aVar.a(str, (DialogInterface.OnClickListener) a.d.f77032a, false);
        if (copyWritingInfo == null || (str2 = copyWritingInfo.getCheckSettings()) == null) {
            str2 = str3;
        }
        a.C0731a b2 = a3.b(str2, (DialogInterface.OnClickListener) new a.e(activity), false);
        if (!(copyWritingInfo == null || (title = copyWritingInfo.getTitle()) == null)) {
            str3 = title;
        }
        b2.f33401a = str3;
        b2.J = dmtTextView;
        b2.M = false;
        AdPersonalitySettings i3 = b.i();
        if (i3 != null) {
            str4 = i3.getBusiness();
        }
        if (!l.a((Object) str4, (Object) "lat_strategy_update")) {
            b2.F = true;
        }
        b2.a().c();
        r.a("ads_notify_show", new d().a("enter_from", "homepage_hot").f66730a);
        AdPersonalitySettings i4 = b.i();
        if (i4 != null && (promptStyle = i4.getPromptStyle()) != null && promptStyle.intValue() == 1) {
            r.a("revised_PA_old_prompt_EU_show", new d().f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.gdpr.IGDPRService
    public final void a(Context context, com.ss.android.ugc.aweme.compliance.api.c.b bVar) {
        l.d(context, "");
        com.ss.android.ugc.aweme.compliance.business.personalization.a.a.a(context, bVar);
    }
}
