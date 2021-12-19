package com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class CommonPopUpWebTitleBar extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public static final a f76227b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f76228a;

    /* renamed from: c  reason: collision with root package name */
    private b f76229c;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f76230d;

    public interface b {
        static {
            Covode.recordClassIndex(47009);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(47007);
    }

    public CommonPopUpWebTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final View a(int i2) {
        if (this.f76230d == null) {
            this.f76230d = new SparseArray();
        }
        View view = (View) this.f76230d.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f76230d.put(i2, findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47008);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String getDefTitle() {
        return this.f76228a;
    }

    public final b getTitleBarListener() {
        return this.f76229c;
    }

    public final void setDefTitle(String str) {
        this.f76228a = str;
    }

    public final void setTitleBarListener(b bVar) {
        this.f76229c = bVar;
    }

    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommonPopUpWebTitleBar f76231a;

        static {
            Covode.recordClassIndex(47010);
        }

        public c(CommonPopUpWebTitleBar commonPopUpWebTitleBar) {
            this.f76231a = commonPopUpWebTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            b titleBarListener = this.f76231a.getTitleBarListener();
            if (titleBarListener != null) {
                titleBarListener.a();
            }
        }
    }

    public final void setSubTitle(String str) {
        l.d(str, "");
        TuxTextView tuxTextView = (TuxTextView) a(R.id.d7e);
        l.b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    private /* synthetic */ CommonPopUpWebTitleBar(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommonPopUpWebTitleBar(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(2768);
        com.a.a(LayoutInflater.from(context), R.layout.bja, this, true);
        MethodCollector.o(2768);
    }
}
