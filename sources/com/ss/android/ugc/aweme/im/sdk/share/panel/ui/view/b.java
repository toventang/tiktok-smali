package com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.common.ui.base.Widget;
import com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Arrays;
import java.util.HashMap;

public final class b extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final a f103518a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private Widget f103519b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f103520c;

    static {
        Covode.recordClassIndex(66331);
    }

    public final View a(int i2) {
        if (this.f103520c == null) {
            this.f103520c = new HashMap();
        }
        View view = (View) this.f103520c.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f103520c.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66332);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        com.ss.android.ugc.aweme.im.service.m.a.b("SharePanelTipLayout", "onAttachedToWindow");
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        com.ss.android.ugc.aweme.im.service.m.a.b("SharePanelTipLayout", "onDetachedFromWindow");
        super.onDetachedFromWindow();
        Widget widget = this.f103519b;
        if (widget != null) {
            widget.destroy();
        }
    }

    public final void setWidget(Widget widget) {
        l.d(widget, "");
        this.f103519b = widget;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(6761);
        View.inflate(context, R.layout.a7z, this);
        MethodCollector.o(6761);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i2) {
        Widget widget;
        com.ss.android.ugc.aweme.im.service.m.a.b("SharePanelTipLayout", "onWindowVisibilityChanged: ".concat(String.valueOf(i2)));
        super.onWindowVisibilityChanged(i2);
        if (i2 == 0 && (widget = this.f103519b) != null) {
            widget.resume();
        }
    }

    public final void a(c cVar) {
        String a2;
        l.d(cVar, "");
        int i2 = cVar.f103402b;
        int i3 = R.raw.icon_person_arrow_left_right;
        if (i2 == 1) {
            i3 = R.raw.icon_two_person;
        }
        if (cVar.f103403c == 1 && cVar.f103402b == 1) {
            String string = getContext().getString(R.string.ftg);
            l.b(string, "");
            a2 = com.a.a(string, Arrays.copyOf(new Object[]{"@" + cVar.f103401a}, 1));
            l.b(a2, "");
        } else if (cVar.f103403c == 1 && cVar.f103402b == 2) {
            String string2 = getContext().getString(R.string.fth);
            l.b(string2, "");
            a2 = com.a.a(string2, Arrays.copyOf(new Object[]{"@" + cVar.f103401a}, 1));
            l.b(a2, "");
        } else if (cVar.f103403c == 2 && cVar.f103402b == 1) {
            String string3 = getContext().getString(R.string.can);
            l.b(string3, "");
            a2 = com.a.a(string3, Arrays.copyOf(new Object[]{"@" + cVar.f103401a}, 1));
            l.b(a2, "");
        } else if (cVar.f103403c == 2 && cVar.f103402b == 2) {
            String string4 = getContext().getString(R.string.cao);
            l.b(string4, "");
            a2 = com.a.a(string4, Arrays.copyOf(new Object[]{"@" + cVar.f103401a}, 1));
            l.b(a2, "");
        } else {
            String string5 = getContext().getString(R.string.ftg);
            l.b(string5, "");
            a2 = com.a.a(string5, Arrays.copyOf(new Object[]{"@" + cVar.f103401a}, 1));
            l.b(a2, "");
        }
        ((TuxIconView) a(R.id.elk)).setIconRes(i3);
        TuxTextView tuxTextView = (TuxTextView) a(R.id.ell);
        l.b(tuxTextView, "");
        tuxTextView.setText(a2);
    }

    public /* synthetic */ b(Context context, byte b2) {
        this(context);
    }
}
