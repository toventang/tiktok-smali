package com.ss.android.ugc.aweme.ad.feed.mask;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class i extends d {
    static {
        Covode.recordClassIndex(40589);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ce  */
    @Override // com.ss.android.ugc.aweme.ad.feed.mask.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.mask.i.c():void");
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
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(LinearLayout linearLayout, c cVar) {
        super(linearLayout, cVar);
        l.d(linearLayout, "");
        l.d(cVar, "");
    }
}
