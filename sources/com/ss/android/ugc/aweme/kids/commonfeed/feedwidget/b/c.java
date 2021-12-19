package com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.l;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

public final class c extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private SmartImageView f106106a;

    /* renamed from: b  reason: collision with root package name */
    private SmartImageView f106107b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f106108c;

    static {
        Covode.recordClassIndex(67867);
    }

    private View a(int i2) {
        if (this.f106108c == null) {
            this.f106108c = new HashMap();
        }
        View view = (View) this.f106108c.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f106108c.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final void setOnActionClickListener(View.OnClickListener onClickListener) {
        ((SmartImageView) a(R.id.c3f)).setOnClickListener(onClickListener);
    }

    public final void setActionIcon(l lVar) {
        h.f.b.l.d(lVar, "");
        v a2 = r.a(lVar);
        a2.u = Bitmap.Config.ARGB_8888;
        SmartImageView smartImageView = this.f106107b;
        if (smartImageView == null) {
            h.f.b.l.a("actionIconView");
        }
        a2.E = smartImageView;
        a2.c();
    }

    public final void setIcon(l lVar) {
        h.f.b.l.d(lVar, "");
        v a2 = r.a(lVar);
        a2.u = Bitmap.Config.ARGB_8888;
        SmartImageView smartImageView = this.f106106a;
        if (smartImageView == null) {
            h.f.b.l.a("iconView");
        }
        a2.E = smartImageView;
        a2.c();
    }

    public final void setSubtitle(String str) {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.c3h);
        h.f.b.l.b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    public final void setTitle(String str) {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.c3i);
        h.f.b.l.b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Context context) {
        super(context, null, 0);
        h.f.b.l.d(context, "");
        MethodCollector.i(6485);
        View a2 = a.a(LayoutInflater.from(getContext()), R.layout.acy, this, true);
        View findViewById = a2.findViewById(R.id.c3g);
        h.f.b.l.b(findViewById, "");
        this.f106106a = (SmartImageView) findViewById;
        View findViewById2 = a2.findViewById(R.id.c3f);
        h.f.b.l.b(findViewById2, "");
        this.f106107b = (SmartImageView) findViewById2;
        MethodCollector.o(6485);
    }

    public /* synthetic */ c(Context context, byte b2) {
        this(context);
    }
}
