package com.ss.android.ugc.aweme.compliance.api.services.policynotice;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.model.PolicyBodyLinkList;
import java.util.List;

public interface IPolicyNoticeService {
    static {
        Covode.recordClassIndex(47399);
    }

    SpannableStringBuilder a(Context context, String str, List<PolicyBodyLinkList> list);

    View a(View view);

    void a();

    void a(int i2);

    void a(Activity activity);

    void a(String str, String str2);

    void b();

    String c();

    String d();

    List<PolicyBodyLinkList> e();
}
