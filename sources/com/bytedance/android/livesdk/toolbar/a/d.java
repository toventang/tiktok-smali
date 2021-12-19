package com.bytedance.android.livesdk.toolbar.a;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.p.f;
import com.bytedance.android.live.u.g;
import com.bytedance.android.livesdk.ak.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public final class d implements f {

    /* renamed from: a  reason: collision with root package name */
    View f21675a;

    /* renamed from: b  reason: collision with root package name */
    Context f21676b;

    /* renamed from: c  reason: collision with root package name */
    private b f21677c;

    static {
        Covode.recordClassIndex(12784);
    }

    @Override // com.bytedance.android.live.p.f
    public final void a() {
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(boolean z) {
    }

    @Override // com.bytedance.android.live.p.f
    public final void b() {
    }

    public final void onClick(View view) {
    }

    public d(Context context) {
        this.f21676b = context;
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(View view, DataChannel dataChannel) {
        this.f21675a = view;
        g.c(new e(this, dataChannel, view));
    }

    @Override // com.bytedance.android.live.p.f
    public final void b(View view, DataChannel dataChannel) {
        b bVar = this.f21677c;
        if (bVar != null) {
            if (bVar.f13934a != null) {
                bVar.f13934a.dismiss();
            }
            this.f21677c = null;
        }
    }
}
