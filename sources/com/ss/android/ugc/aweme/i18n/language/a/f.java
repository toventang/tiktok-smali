package com.ss.android.ugc.aweme.i18n.language.a;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.i18n.language.i18n.b;
import com.ss.android.ugc.aweme.language.b;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;

final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final e f99777a;

    /* renamed from: b  reason: collision with root package name */
    private final b f99778b;

    static {
        Covode.recordClassIndex(63618);
    }

    f(e eVar, b bVar) {
        this.f99777a = eVar;
        this.f99778b = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        e eVar = this.f99777a;
        b bVar = this.f99778b;
        i.a(3);
        r.a("choose_language_popup", new d().a("enter_from", "homepage_hot").a("language_type", bVar.f()).f66730a);
        if (TextUtils.equals(bVar.f(), SettingServiceImpl.v().a(eVar.f99773a).f())) {
            eVar.f99774b.dismiss();
            return;
        }
        eVar.f99774b.dismiss();
        b.a.f99809a.a(bVar.a(), bVar.f(), eVar.f99773a);
        com.ss.android.ugc.aweme.account.b.g().updateLanguage(null, SettingServiceImpl.v().h(), 0);
    }
}
