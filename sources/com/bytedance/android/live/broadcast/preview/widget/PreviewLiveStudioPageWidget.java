package com.bytedance.android.live.broadcast.preview.widget;

import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class PreviewLiveStudioPageWidget extends LiveWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8377a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private boolean f8378b;

    static {
        Covode.recordClassIndex(4280);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bhh;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4281);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        HSImageView hSImageView = (HSImageView) findViewById(R.id.bys);
        l.b(hSImageView, "");
        ViewGroup.LayoutParams layoutParams = hSImageView.getLayoutParams();
        layoutParams.height = ((y.c() - y.a(32.0f)) * y.a(215.0f)) / y.a(343.0f);
        hSImageView.setLayoutParams(layoutParams);
        k.a(hSImageView, "tiktok_live_interaction_resource", "ttlive_broadcast_live_studio_preview_page_detail.png");
    }

    public final void a(boolean z) {
        String str;
        super.show();
        this.f8378b = z;
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        b.a.a("livesdk_live_studio_intro_show").a("anchor_id", com.bytedance.android.live.broadcast.preview.a.a.a()).a("from_message", str).b();
    }
}
