package com.ss.android.ugc.aweme.story.edit.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.editSticker.interact.view.f;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.AvatarWithBorderView;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class d extends FrameLayout implements f {

    /* renamed from: a  reason: collision with root package name */
    private final View f137051a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f137052b;

    static {
        Covode.recordClassIndex(89602);
    }

    private View a(int i2) {
        if (this.f137052b == null) {
            this.f137052b = new HashMap();
        }
        View view = (View) this.f137052b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f137052b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.f
    public final void c(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.f
    public final View getContentView() {
        return this.f137051a;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.f
    public final void a(boolean z) {
        int i2;
        LinearLayout linearLayout = (LinearLayout) a(R.id.bd3);
        l.b(linearLayout, "");
        if (z) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        linearLayout.setVisibility(i2);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.f
    public final void b(boolean z) {
        int i2;
        LinearLayout linearLayout = (LinearLayout) a(R.id.bd2);
        l.b(linearLayout, "");
        int i3 = 0;
        if (z) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        linearLayout.setVisibility(i2);
        FrameLayout frameLayout = (FrameLayout) a(R.id.cpj);
        l.b(frameLayout, "");
        if (!z) {
            i3 = 4;
        }
        frameLayout.setVisibility(i3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d(Context context) {
        super(context, null, 0);
        UrlModel urlModel;
        Drawable drawable;
        l.d(context, "");
        MethodCollector.i(1888);
        this.f137051a = this;
        addView(a.a(LayoutInflater.from(context), R.layout.bk8, this, false));
        ((AvatarWithBorderView) a(R.id.fcr)).setBorderColor(R.color.f159928l);
        com.ss.android.ugc.aweme.account.model.a e2 = g.a().A().e();
        if (e2 == null || e2.f() == null) {
            com.ss.android.ugc.tools.c.a.a((SimpleDraweeView) a(R.id.fcr), 2131232324);
        } else {
            UrlModel f2 = e2.f();
            Context context2 = getContext();
            l.b(context2, "");
            int a2 = (int) r.a(context2, 49.0f);
            Context context3 = getContext();
            l.b(context3, "");
            com.ss.android.ugc.tools.c.a.a((SimpleDraweeView) a(R.id.fcr), f2, a2, (int) r.a(context3, 49.0f));
        }
        TuxTextView tuxTextView = (TuxTextView) a(R.id.ev2);
        l.b(tuxTextView, "");
        StringBuilder sb = new StringBuilder("@");
        com.ss.android.ugc.aweme.account.model.a e3 = g.a().A().e();
        Resources resources = getResources();
        l.b(resources, "");
        tuxTextView.setText(sb.append(com.ss.android.ugc.aweme.shortvideo.edit.c.a.a(e3, resources)).toString());
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a(R.id.d0b);
        if (e2 != null) {
            urlModel = e2.f();
        } else {
            urlModel = null;
        }
        com.ss.android.ugc.tools.c.a.a(simpleDraweeView, urlModel, 27, 27);
        com.ss.android.ugc.tools.c.a.a((SimpleDraweeView) a(R.id.cpi), 2131232322);
        if (Build.VERSION.SDK_INT >= 21) {
            drawable = getResources().getDrawable(2131232312, null);
            l.b(drawable, "");
        } else {
            drawable = getResources().getDrawable(2131232312);
            l.b(drawable, "");
        }
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        ((TuxTextView) a(R.id.euv)).setCompoundDrawables(drawable, null, null, null);
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.euv);
        l.b(tuxTextView2, "");
        StringBuilder sb2 = new StringBuilder();
        Context context4 = getContext();
        l.b(context4, "");
        tuxTextView2.setText(sb2.append(com.ss.android.ugc.aweme.shortvideo.edit.c.a.a(context4, g.a().A().e())).toString());
        MethodCollector.o(1888);
    }

    public /* synthetic */ d(Context context, byte b2) {
        this(context);
    }
}
