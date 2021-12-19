package com.ss.android.ugc.tools.infosticker.view.internal.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.view.SimpleDraweeView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class j extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final View f149729a;

    /* renamed from: b  reason: collision with root package name */
    private final View f149730b;

    /* renamed from: c  reason: collision with root package name */
    private final SimpleDraweeView f149731c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f149732d;

    static {
        Covode.recordClassIndex(98581);
    }

    public final View getContentView() {
        return this.f149730b;
    }

    public final SimpleDraweeView getIconImgView() {
        return this.f149731c;
    }

    public final View getRoot() {
        return this.f149729a;
    }

    public final TextView getTextView() {
        return this.f149732d;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private j(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(6744);
        View a2 = a.a(LayoutInflater.from(context), R.layout.b4k, this, true);
        l.b(a2, "");
        this.f149729a = a2;
        View findViewById = a2.findViewById(R.id.bom);
        l.b(findViewById, "");
        this.f149730b = findViewById;
        View findViewById2 = a2.findViewById(R.id.bon);
        l.b(findViewById2, "");
        this.f149731c = (SimpleDraweeView) findViewById2;
        View findViewById3 = a2.findViewById(R.id.boo);
        l.b(findViewById3, "");
        this.f149732d = (TextView) findViewById3;
        MethodCollector.o(6744);
    }

    public /* synthetic */ j(Context context, byte b2) {
        this(context);
    }
}
