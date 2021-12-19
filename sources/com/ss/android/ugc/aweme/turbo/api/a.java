package com.ss.android.ugc.aweme.turbo.api;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a implements ITurboApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f141466a = new a();

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void applicationOnCreate(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void bootFinish(Context context) {
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void mainOnCreate() {
    }

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void openCamera() {
    }

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void recordEnd() {
    }

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void recordStart() {
    }

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void startNewPage(String str) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void videoComposeEnd() {
    }

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void videoComposeStart() {
    }

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void videoPlayEnd() {
    }

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void videoPlayStart() {
    }

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void waterMarkEnd() {
    }

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void waterMarkStart() {
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(92392);
    }
}
