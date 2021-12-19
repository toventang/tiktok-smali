package com.ss.android.ugc.aweme.shortvideo.record;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.ef;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.widget.ScrollableLinearLayout;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.ss.android.ugc.aweme.shortvideo.widget.n;
import com.ss.android.ugc.aweme.utils.ig;
import com.ss.android.ugc.gamora.recorder.h.d;
import com.ss.android.ugc.tools.f.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final ScrollableLinearLayout f130099a;

    /* renamed from: b  reason: collision with root package name */
    public final d f130100b = new d();

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.tux.tooltip.a f130101c;

    /* renamed from: d  reason: collision with root package name */
    public n f130102d;

    /* renamed from: e  reason: collision with root package name */
    public final Set<String> f130103e = new LinkedHashSet();

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.gamora.recorder.h.a f130104f = new com.ss.android.ugc.gamora.recorder.h.a();

    /* renamed from: g  reason: collision with root package name */
    public final Map<Integer, View> f130105g = new LinkedHashMap();

    /* renamed from: h  reason: collision with root package name */
    public final TabHost f130106h;

    /* renamed from: i  reason: collision with root package name */
    public final ShortVideoContext f130107i;

    static {
        Covode.recordClassIndex(85360);
    }

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f130108a;

        static {
            Covode.recordClassIndex(85361);
        }

        public a(f fVar) {
            this.f130108a = fVar;
        }

        public final void run() {
            String str;
            com.bytedance.tux.tooltip.a aVar = this.f130108a.f130101c;
            if (aVar != null) {
                aVar.a();
            }
            b a2 = new b().a("event_page", "shoot");
            if (ef.a()) {
                str = "before_templates";
            } else {
                str = "after_templates";
            }
            r.a("livesdk_live_tab_popup_show", a2.a("live_tab_position", str).f149193a);
        }
    }

    public f(TabHost tabHost, ShortVideoContext shortVideoContext) {
        l.d(tabHost, "");
        l.d(shortVideoContext, "");
        this.f130106h = tabHost;
        this.f130107i = shortVideoContext;
        this.f130099a = (ScrollableLinearLayout) tabHost.findViewById(R.id.ad7);
    }

    public final void a(int i2, String str, int i3, String str2) {
        l.d(str, "");
        l.d(str2, "");
        ScrollableLinearLayout scrollableLinearLayout = this.f130099a;
        l.b(scrollableLinearLayout, "");
        n nVar = new n(scrollableLinearLayout.getContext());
        nVar.setText(str);
        if (i3 != 0) {
            Context context = nVar.getContext();
            l.b(context, "");
            Drawable drawable = context.getResources().getDrawable(i3);
            l.b(drawable, "");
            drawable.setBounds(0, 1, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight() + 1);
            nVar.getTextView().setCompoundDrawables(drawable, null, null, null);
            TextView textView = nVar.getTextView();
            l.b(textView, "");
            textView.setCompoundDrawablePadding((int) com.bytedance.common.utility.n.b(nVar.getContext(), 3.0f));
        }
        nVar.setTag(str2);
        this.f130103e.add(str2);
        this.f130099a.addView(nVar, i2);
        if (l.a(nVar.getTag(), (Object) ig.a(R.string.f_b))) {
            this.f130102d = nVar;
        }
    }
}
