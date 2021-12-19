package com.bytedance.android.livesdk.widgets;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.gift.u;
import com.bytedance.android.livesdk.bg;
import com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView;
import com.bytedance.android.livesdk.service.b.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.z;

public class LiveNewSpecialGiftWidget extends LiveWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    LiveNewSendGiftAnimationView f22654a;

    /* renamed from: b  reason: collision with root package name */
    d f22655b;

    /* renamed from: c  reason: collision with root package name */
    boolean f22656c;

    /* renamed from: d  reason: collision with root package name */
    private b<d, z> f22657d = new a(this);

    static {
        Covode.recordClassIndex(13370);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bho;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        LiveNewSendGiftAnimationView liveNewSendGiftAnimationView = (LiveNewSendGiftAnimationView) findViewById(R.id.b0b);
        this.f22654a = liveNewSendGiftAnimationView;
        liveNewSendGiftAnimationView.setAnimationType(LiveNewSendGiftAnimationView.a.Special);
        this.f22654a.setVisibility(8);
        if (this.dataChannel != null) {
            this.dataChannel.b(u.class, (Object) false);
        }
        this.f22654a.setOnClickListener(new b(this));
        if (this.dataChannel != null) {
            this.dataChannel.a((m) this, bg.class, (b) this.f22657d);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(d dVar) {
        this.f22655b = dVar;
        this.f22654a.setVisibility(0);
        this.dataChannel.b(u.class, (Object) true);
        if (!this.f22656c) {
            this.f22656c = true;
            this.f22654a.a(new d(this));
        }
        return z.f158842a;
    }
}
