package com.bytedance.android.live.broadcast.preview.widget;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.b.f;
import com.bytedance.android.live.broadcast.ab;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.browser.c.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class PreviewSeeMoreDetailWidget extends LiveWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8386a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8387b;

    static {
        Covode.recordClassIndex(4287);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bhj;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        View view = getView();
        if (!(view instanceof LiveButton)) {
            view = null;
        }
        LiveButton liveButton = (LiveButton) view;
        if (liveButton != null) {
            liveButton.setOnClickListener(new a(this));
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.b(ab.class, (h.f.a.b) new b(this, liveButton));
            }
        }
    }

    public final void a(boolean z) {
        super.show();
        this.f8386a = z;
    }

    static final class b extends h.f.b.m implements h.f.a.b<com.bytedance.android.live.broadcast.model.m, z> {
        final /* synthetic */ LiveButton $mStartButton;
        final /* synthetic */ PreviewSeeMoreDetailWidget this$0;

        static {
            Covode.recordClassIndex(4289);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PreviewSeeMoreDetailWidget previewSeeMoreDetailWidget, LiveButton liveButton) {
            super(1);
            this.this$0 = previewSeeMoreDetailWidget;
            this.$mStartButton = liveButton;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.live.broadcast.model.m mVar) {
            l.d(mVar, "");
            this.$mStartButton.setEnabled(true);
            this.$mStartButton.b(R.style.sn);
            this.this$0.f8387b = true;
            return z.f158842a;
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewSeeMoreDetailWidget f8388a;

        static {
            Covode.recordClassIndex(4288);
        }

        a(PreviewSeeMoreDetailWidget previewSeeMoreDetailWidget) {
            this.f8388a = previewSeeMoreDetailWidget;
        }

        public final void onClick(View view) {
            String str;
            if (!this.f8388a.f8387b) {
                if (this.f8388a.f8386a) {
                    str = "1";
                } else {
                    str = "0";
                }
                b.a.a("livesdk_live_studio_detail_click").a("anchor_id", com.bytedance.android.live.broadcast.preview.a.a.a()).a("from_message", str).b();
                d webViewManager = ((f) com.bytedance.android.live.t.a.a(f.class)).webViewManager();
                Context context = this.f8388a.getContext();
                d.a b2 = e.b("https://www.tiktok.com/studio/download");
                b2.f14291b = y.a((int) R.string.ebt);
                b2.f14298i = false;
                webViewManager.a(context, b2);
            }
        }
    }
}
