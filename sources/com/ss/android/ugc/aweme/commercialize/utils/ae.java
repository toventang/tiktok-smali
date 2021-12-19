package com.ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.splash.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.af;
import com.ss.android.ugc.aweme.utils.j;

public final class ae implements az {
    static {
        Covode.recordClassIndex(46610);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.utils.az
    public final boolean a(Fragment fragment) {
        if (!(fragment instanceof af)) {
            return false;
        }
        return e.a((af) fragment);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.utils.az
    public final boolean a(i iVar) {
        return ad.a(iVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
        if (r3.equals("web") == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
        if (r3.equals("coupon") == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ad, code lost:
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.c(r2) != false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b3, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c4 A[RETURN] */
    @Override // com.ss.android.ugc.aweme.commercialize.utils.az
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.ae.a(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.utils.az
    public final String a(Context context, Aweme aweme) {
        return ad.a(context, aweme, false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.utils.az
    public final void a(View view, int i2, int i3, boolean z) {
        if (view != null) {
            int i4 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            if (z) {
                if (i4 < 0) {
                    j.a(view, i4, i2, i3).start();
                }
            } else if (i4 >= 0) {
                j.a(view, i4, i2, i3).start();
            }
        }
    }
}
