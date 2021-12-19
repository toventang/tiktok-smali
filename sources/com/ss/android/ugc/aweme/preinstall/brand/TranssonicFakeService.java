package com.ss.android.ugc.aweme.preinstall.brand;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class TranssonicFakeService implements ITranssonicService {
    static {
        Covode.recordClassIndex(74663);
    }

    @Override // com.ss.android.ugc.aweme.preinstall.brand.ITranssonicService
    public final void applicationOnCreate(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.preinstall.brand.ITranssonicService
    public final void mainOnCreate() {
    }

    @Override // com.ss.android.ugc.aweme.preinstall.brand.ITranssonicService
    public final void onVideoPlayBlock() {
    }

    @Override // com.ss.android.ugc.aweme.preinstall.brand.ITranssonicService
    public final void openCamera() {
    }

    @Override // com.ss.android.ugc.aweme.preinstall.brand.ITranssonicService
    public final void recordEnd() {
    }

    @Override // com.ss.android.ugc.aweme.preinstall.brand.ITranssonicService
    public final void recordStart() {
    }

    @Override // com.ss.android.ugc.aweme.preinstall.brand.ITranssonicService
    public final void startNewPage(String str) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.preinstall.brand.ITranssonicService
    public final void videoComposeEnd() {
    }

    @Override // com.ss.android.ugc.aweme.preinstall.brand.ITranssonicService
    public final void videoComposeStart() {
    }

    @Override // com.ss.android.ugc.aweme.preinstall.brand.ITranssonicService
    public final void videoPlayEnd() {
    }

    @Override // com.ss.android.ugc.aweme.preinstall.brand.ITranssonicService
    public final void videoPlayStart() {
    }

    @Override // com.ss.android.ugc.aweme.preinstall.brand.ITranssonicService
    public final void waterMarkEnd() {
    }

    @Override // com.ss.android.ugc.aweme.preinstall.brand.ITranssonicService
    public final void waterMarkStart() {
    }
}
