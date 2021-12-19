package com.bytedance.android.live.broadcast.preview.b;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends Dialog {
    static {
        Covode.recordClassIndex(4068);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8149a;

        static {
            Covode.recordClassIndex(4069);
        }

        a(d dVar) {
            this.f8149a = dVar;
        }

        public final void onClick(View view) {
            this.f8149a.dismiss();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        l.d(context, "");
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        WindowManager.LayoutParams attributes;
        super.onCreate(bundle);
        setContentView(R.layout.b7q);
        k.a((HSImageView) findViewById(R.id.bmj), "tiktok_live_broadcast_resource", "ttlive_bg_preview_setting_update.png");
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.c9);
        }
        Window window2 = getWindow();
        if (!(window2 == null || (attributes = window2.getAttributes()) == null)) {
            attributes.width = y.a(310.0f);
        }
        ((LiveTextView) findViewById(R.id.f3v)).setOnClickListener(new a(this));
    }
}
