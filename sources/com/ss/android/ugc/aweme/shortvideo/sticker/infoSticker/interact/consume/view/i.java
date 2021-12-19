package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class i extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f130514a;

    /* renamed from: b  reason: collision with root package name */
    private final TuxButton f130515b;

    static {
        Covode.recordClassIndex(85580);
    }

    public final TuxButton getBtnDismiss() {
        return this.f130515b;
    }

    public final ImageView getIvClose() {
        return this.f130514a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private i(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(4127);
        View inflate = View.inflate(context, R.layout.b0c, this);
        View findViewById = inflate.findViewById(R.id.bve);
        l.b(findViewById, "");
        this.f130514a = (ImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.y_);
        l.b(findViewById2, "");
        this.f130515b = (TuxButton) findViewById2;
        MethodCollector.o(4127);
    }

    public /* synthetic */ i(Context context, byte b2) {
        this(context);
    }
}
