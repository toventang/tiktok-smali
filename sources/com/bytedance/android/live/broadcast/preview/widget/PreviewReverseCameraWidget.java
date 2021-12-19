package com.bytedance.android.live.broadcast.preview.widget;

import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget;
import com.bytedance.android.live.effect.d;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdkapi.depend.model.a.e;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.a.a;
import h.f.b.l;

public final class PreviewReverseCameraWidget extends PreviewToolBaseWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    private int f8382a = 1;

    /* renamed from: b  reason: collision with root package name */
    private final int f8383b = R.string.gy9;

    /* renamed from: c  reason: collision with root package name */
    private final int f8384c = 2131234569;

    /* renamed from: d  reason: collision with root package name */
    private final a<e> f8385d;

    static {
        Covode.recordClassIndex(4286);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final int a() {
        return this.f8383b;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final int b() {
        return this.f8384c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.bytedance.android.livesdkapi.depend.model.a.e> */
    /* JADX WARN: Multi-variable type inference failed */
    public PreviewReverseCameraWidget(a<? extends e> aVar) {
        l.d(aVar, "");
        this.f8385d = aVar;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final void a(View view) {
        l.d(view, "");
        int i2 = 1 - this.f8382a;
        PrivacyCert build = PrivacyCert.Builder.Companion.with("bpea-382").usage("").tag("[offline test only] broadcast preview reverse camera").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build();
        this.f8382a = i2;
        b.a.a("camera_switch").a(this.dataChannel).b("live").c("click").b();
        com.bytedance.android.livesdk.ap.b<Integer> bVar = com.bytedance.android.livesdk.ap.a.f14015i;
        l.b(bVar, "");
        bVar.b(Integer.valueOf(this.f8382a));
        e invoke = this.f8385d.invoke();
        if (invoke != null) {
            invoke.a(i2, build);
        }
        d.e().c();
    }
}
