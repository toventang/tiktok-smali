package com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.im.sdk.common.ui.base.Widget;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final C2631a f103516a = new C2631a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private Widget f103517b;

    static {
        Covode.recordClassIndex(66329);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view.a$a  reason: collision with other inner class name */
    public static final class C2631a {
        static {
            Covode.recordClassIndex(66330);
        }

        private C2631a() {
        }

        public /* synthetic */ C2631a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        com.ss.android.ugc.aweme.im.service.m.a.b("SharePanelHeadLayout", "onAttachedToWindow");
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        com.ss.android.ugc.aweme.im.service.m.a.b("SharePanelHeadLayout", "onDetachedFromWindow");
        super.onDetachedFromWindow();
        Widget widget = this.f103517b;
        if (widget != null) {
            widget.destroy();
        }
    }

    public final void setWidget(Widget widget) {
        l.d(widget, "");
        this.f103517b = widget;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(7311);
        View.inflate(context, R.layout.a7y, this);
        MethodCollector.o(7311);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i2) {
        Widget widget;
        com.ss.android.ugc.aweme.im.service.m.a.b("SharePanelHeadLayout", "onWindowVisibilityChanged: ".concat(String.valueOf(i2)));
        super.onWindowVisibilityChanged(i2);
        if (i2 == 0 && (widget = this.f103517b) != null) {
            widget.resume();
        }
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }
}
