package com.ss.android.ugc.aweme.editSticker.text.view;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.editSticker.text.a.b;
import com.ss.android.ugc.aweme.editSticker.text.a.c;
import com.ss.android.ugc.tools.utils.k;
import com.ss.android.ugc.tools.utils.r;
import java.util.ArrayList;
import java.util.List;

public final class g extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public List<f> f88663a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public String f88664b;

    /* renamed from: c  reason: collision with root package name */
    public c f88665c;

    /* renamed from: d  reason: collision with root package name */
    public int f88666d;

    /* renamed from: e  reason: collision with root package name */
    private List<c> f88667e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private a f88668f;

    /* renamed from: g  reason: collision with root package name */
    private LinearLayout f88669g;

    public interface a {
        static {
            Covode.recordClassIndex(55788);
        }

        void a(c cVar);
    }

    static {
        Covode.recordClassIndex(55786);
    }

    public final void a() {
        for (f fVar : this.f88663a) {
            String b2 = b.a().b(this.f88666d);
            if (TextUtils.isEmpty(b2) || !b2.equals(fVar.getTag())) {
                fVar.setBackground(0);
            } else if (fVar.a()) {
                fVar.setBackground(1);
                fVar.b();
                this.f88665c.a(fVar);
            }
        }
    }

    public final void setClickFontStyleListener(a aVar) {
        this.f88668f = aVar;
    }

    public final void a(c cVar) {
        a aVar = this.f88668f;
        if (aVar != null) {
            aVar.a(cVar);
        }
        a();
    }

    public final void a(List<c> list) {
        MethodCollector.i(3521);
        if (!k.a(this.f88667e)) {
            MethodCollector.o(3521);
        } else if (k.a(list)) {
            b.a().a(getContext());
            MethodCollector.o(3521);
        } else {
            this.f88667e = list;
            for (int i2 = 0; i2 < this.f88667e.size(); i2++) {
                if (this.f88667e.get(i2) != null) {
                    c cVar = this.f88667e.get(i2);
                    f fVar = new f(getContext());
                    if (cVar != null) {
                        fVar.setFontData(cVar);
                        fVar.c();
                        fVar.b();
                    }
                    fVar.setBackground(0);
                    if (!"default".equals(b.a().b(this.f88666d))) {
                        String b2 = b.a().b(this.f88666d);
                        if (!TextUtils.isEmpty(b2) && b2.equals(cVar.f88297e) && fVar.a()) {
                            fVar.setBackground(1);
                        }
                    } else if (i2 == 0 && cVar != null && fVar.a()) {
                        b.a().a(cVar.f88297e, this.f88666d);
                        fVar.setBackground(1);
                    }
                    fVar.setTag(cVar.f88297e);
                    fVar.setOnClickListener(new h(this, fVar));
                    fVar.setDownloadCallback(new com.ss.android.ugc.aweme.editSticker.text.a.a() {
                        /* class com.ss.android.ugc.aweme.editSticker.text.view.g.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(55787);
                        }

                        @Override // com.ss.android.ugc.aweme.editSticker.text.a.a
                        public final void a(boolean z) {
                        }

                        @Override // com.ss.android.ugc.aweme.editSticker.text.a.a
                        public final void a(c cVar, boolean z, boolean z2) {
                            if (z && cVar != null && !TextUtils.isEmpty(cVar.f88297e) && cVar.f88297e.equals(g.this.f88664b)) {
                                g.this.a(cVar);
                            }
                        }
                    });
                    this.f88663a.add(fVar);
                    this.f88669g.addView(fVar);
                }
            }
            MethodCollector.o(3521);
        }
    }

    public g(Context context, int i2) {
        super(context, null);
        MethodCollector.i(3507);
        this.f88666d = i2;
        this.f88669g = new LinearLayout(getContext());
        this.f88665c = new c(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f88669g.setPadding((int) r.a(getContext(), 12.0f), 0, 0, 0);
        this.f88665c.addView(this.f88669g, layoutParams);
        this.f88665c.setHorizontalScrollBarEnabled(false);
        addView(this.f88665c, new FrameLayout.LayoutParams(-1, -1));
        MethodCollector.o(3507);
    }
}
