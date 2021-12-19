package com.ss.android.ugc.aweme.shortvideo.ui;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.adaptation.h;

public abstract class ba extends h implements k {

    /* renamed from: e  reason: collision with root package name */
    private boolean f131455e;

    static {
        Covode.recordClassIndex(86112);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final String bt_() {
        return "video_shoot_page";
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.k
    public final boolean bs_() {
        return this.f131455e;
    }

    public void finish() {
        this.f131455e = false;
        super.finish();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d
    public void onDestroy() {
        this.f131455e = false;
        super.onDestroy();
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b, com.ss.android.ugc.aweme.adaptation.h, androidx.appcompat.app.d
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f131455e = true;
    }
}
