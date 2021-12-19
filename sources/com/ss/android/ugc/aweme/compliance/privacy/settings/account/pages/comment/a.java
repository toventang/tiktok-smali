package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.comment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;

public final class a extends com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a<CommentViewModel> {
    static {
        Covode.recordClassIndex(48091);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a
    public final String c() {
        return UGCMonitor.EVENT_COMMENT;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a
    public final void b(int i2) {
        String str;
        super.b(i2);
        d a2 = new d().a("enter_from", "privacy_and_safety_settings");
        if (i2 == 0) {
            str = "public";
        } else if (i2 == 1) {
            str = "friends";
        } else if (i2 != 3) {
            str = "";
        } else {
            str = "no one";
        }
        r.a("disable_account_comment", a2.a("to_status", str).f66730a);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.comment.CommentViewModel r4, androidx.fragment.app.Fragment r5) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.comment.a.<init>(com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.comment.CommentViewModel, androidx.fragment.app.Fragment):void");
    }
}
