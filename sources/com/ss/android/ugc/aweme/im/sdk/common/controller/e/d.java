package com.ss.android.ugc.aweme.im.sdk.common.controller.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.f;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.video.i;

public final class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private i f102237a;

    /* renamed from: b  reason: collision with root package name */
    private OnUIPlayListener f102238b;

    static {
        Covode.recordClassIndex(65414);
    }

    @Override // com.ss.android.ugc.aweme.im.service.f
    public final Object a() {
        return this.f102237a;
    }

    @Override // com.ss.android.ugc.aweme.im.service.f
    public final void c() {
        i iVar = this.f102237a;
        if (iVar != null) {
            iVar.G();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.f
    public final void d() {
        i iVar = this.f102237a;
        if (iVar != null) {
            iVar.B();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.f
    public final boolean b() {
        i iVar = this.f102237a;
        if (iVar == null || !iVar.o()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.service.f
    public final void e() {
        i iVar = this.f102237a;
        if (iVar != null) {
            iVar.C();
            this.f102237a = null;
        }
        this.f102238b = null;
    }
}
