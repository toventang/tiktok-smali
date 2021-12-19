package com.ss.android.ugc.aweme.story.edit.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.editSticker.interact.view.f;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class c extends FrameLayout implements f {

    /* renamed from: a  reason: collision with root package name */
    private final View f137049a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f137050b;

    static {
        Covode.recordClassIndex(89601);
    }

    private View a(int i2) {
        if (this.f137050b == null) {
            this.f137050b = new HashMap();
        }
        View view = (View) this.f137050b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f137050b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.f
    public final void a(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.f
    public final void b(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.f
    public final View getContentView() {
        return this.f137049a;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.f
    public final void c(boolean z) {
        int i2;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Context context) {
        super(context, null, 0);
        l.d(context, "");
        UrlModel urlModel = null;
        MethodCollector.i(1176);
        this.f137049a = this;
        addView(a.a(LayoutInflater.from(context), R.layout.bk7, this, false));
        com.ss.android.ugc.aweme.account.model.a e2 = g.a().A().e();
        if ((e2 != null ? e2.f() : urlModel) != null) {
            UrlModel f2 = e2.f();
            Context context2 = getContext();
            l.b(context2, "");
            int a2 = (int) r.a(context2, 49.0f);
            Context context3 = getContext();
            l.b(context3, "");
            com.ss.android.ugc.tools.c.a.a((SimpleDraweeView) a(R.id.btj), f2, a2, (int) r.a(context3, 49.0f));
        } else {
            com.ss.android.ugc.tools.c.a.a((SimpleDraweeView) a(R.id.btj), 2131232324);
        }
        TuxTextView tuxTextView = (TuxTextView) a(R.id.ev2);
        if (tuxTextView != null) {
            com.ss.android.ugc.aweme.account.model.a e3 = g.a().A().e();
            Resources resources = getResources();
            l.b(resources, "");
            tuxTextView.setText(com.ss.android.ugc.aweme.shortvideo.edit.c.a.a(e3, resources));
            MethodCollector.o(1176);
            return;
        }
        MethodCollector.o(1176);
    }

    public /* synthetic */ c(Context context, byte b2) {
        this(context);
    }
}
