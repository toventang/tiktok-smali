package com.ss.android.ugc.aweme.compliance.api.services.policynotice;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.model.PolicyBodyLinkList;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class a implements IPolicyNoticeService {
    static {
        Covode.recordClassIndex(47400);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final View a(View view) {
        l.d(view, "");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final void a(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final void a(Activity activity) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final String c() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final String d() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final List<PolicyBodyLinkList> e() {
        return z.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final SpannableStringBuilder a(Context context, String str, List<PolicyBodyLinkList> list) {
        l.d(context, "");
        return new SpannableStringBuilder("");
    }
}
