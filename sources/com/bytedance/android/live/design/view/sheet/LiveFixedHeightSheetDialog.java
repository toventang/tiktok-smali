package com.bytedance.android.live.design.view.sheet;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

public class LiveFixedHeightSheetDialog extends LiveBaseSheetDialog implements au {
    static {
        Covode.recordClassIndex(4840);
    }

    @Override // com.bytedance.android.live.design.app.LifecycleAwareDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog
    public void onStart() {
        super.onStart();
        b().c(3);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, androidx.appcompat.app.h
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(false);
    }
}
