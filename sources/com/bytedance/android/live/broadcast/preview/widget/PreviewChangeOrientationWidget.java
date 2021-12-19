package com.bytedance.android.live.broadcast.preview.widget;

import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.broadcast.k;
import com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.ap.a;
import com.bytedance.android.livesdk.ap.b;
import com.bytedance.android.livesdk.ap.c;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class PreviewChangeOrientationWidget extends PreviewToolBaseWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    private boolean f8342a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8343b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8344c;

    static {
        Covode.recordClassIndex(4252);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final int a() {
        return this.f8343b;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final int b() {
        return this.f8344c;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        c();
    }

    public PreviewChangeOrientationWidget() {
        boolean z;
        b<Boolean> bVar = a.ct;
        l.b(bVar, "");
        Boolean a2 = bVar.a();
        if (a2 != null) {
            z = a2.booleanValue();
        } else {
            z = false;
        }
        this.f8342a = z;
        this.f8343b = R.string.eko;
        this.f8344c = 2131234582;
    }

    private final void c() {
        LiveTextView liveTextView;
        ImageView imageView;
        LiveTextView liveTextView2;
        ImageView imageView2;
        if (this.f8342a) {
            View view = getView();
            if (!(view == null || (imageView2 = (ImageView) view.findViewById(R.id.fmh)) == null)) {
                imageView2.setImageResource(2131234049);
            }
            View view2 = getView();
            if (!(view2 == null || (liveTextView2 = (LiveTextView) view2.findViewById(R.id.fmj)) == null)) {
                liveTextView2.setText(R.string.ekp);
            }
        } else {
            View view3 = getView();
            if (!(view3 == null || (imageView = (ImageView) view3.findViewById(R.id.fmh)) == null)) {
                imageView.setImageResource(2131234050);
            }
            View view4 = getView();
            if (!(view4 == null || (liveTextView = (LiveTextView) view4.findViewById(R.id.fmj)) == null)) {
                liveTextView.setText(R.string.ekr);
            }
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.b(k.class, Boolean.valueOf(this.f8342a));
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final void a(View view) {
        int i2;
        l.d(view, "");
        this.f8342a = !this.f8342a;
        b<Boolean> bVar = a.ct;
        l.b(bVar, "");
        c.a(bVar, Boolean.valueOf(this.f8342a));
        c();
        if (this.f8342a) {
            i2 = R.string.ekq;
        } else {
            i2 = R.string.eks;
        }
        ao.a(y.e(), i2);
    }
}
