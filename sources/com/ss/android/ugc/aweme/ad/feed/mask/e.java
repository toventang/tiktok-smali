package com.ss.android.ugc.aweme.ad.feed.mask;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e extends d {
    static {
        Covode.recordClassIndex(40584);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012e, code lost:
        if (r0 == null) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0166, code lost:
        if (r0 == null) goto L_0x0168;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0095 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a9  */
    @Override // com.ss.android.ugc.aweme.ad.feed.mask.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
        // Method dump skipped, instructions count: 566
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.mask.e.c():void");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.ad.feed.mask.d
    public final void a(View view) {
        Integer valueOf;
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.ds) {
                this.f65978c.a(12);
            } else if (valueOf.intValue() == R.id.eo) {
                this.f65978c.a(11);
            } else if (valueOf.intValue() == R.id.fg) {
                this.f65978c.a(14);
            } else if (valueOf.intValue() == R.id.fe) {
                this.f65978c.a(13);
            } else if (valueOf.intValue() == R.id.gq) {
                this.f65978c.a(15);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(LinearLayout linearLayout, c cVar) {
        super(linearLayout, cVar);
        l.d(linearLayout, "");
        l.d(cVar, "");
    }
}
