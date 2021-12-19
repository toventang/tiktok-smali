package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.stitch;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.b;
import com.zhiliaoapp.musically.R;

public final class a extends com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a<StitchViewModel> {
    static {
        Covode.recordClassIndex(48171);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a
    public final String c() {
        return "stitch";
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a
    public final String d() {
        String d2 = super.d();
        if (d2 != null) {
            return d2;
        }
        if (com.ss.android.ugc.aweme.compliance.privacy.a.a.b()) {
            return this.f77467d.getString(R.string.cah);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a
    public final void b(int i2) {
        if (com.ss.android.ugc.aweme.compliance.privacy.a.a.b() && i2 == 3) {
            b.d.a(3);
        }
        super.b(i2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.stitch.StitchViewModel r5, androidx.fragment.app.Fragment r6) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.stitch.a.<init>(com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.stitch.StitchViewModel, androidx.fragment.app.Fragment):void");
    }
}
