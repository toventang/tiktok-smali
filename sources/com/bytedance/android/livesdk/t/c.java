package com.bytedance.android.livesdk.t;

import androidx.fragment.app.i;
import com.bytedance.android.live.g.a;
import com.bytedance.android.livesdk.t.b;
import com.bytedance.covode.number.Covode;

public class c implements a {
    static {
        Covode.recordClassIndex(12776);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.g.a
    public void showGameCategoryListDialog(i iVar) {
        b.a.a(iVar, false);
    }
}
