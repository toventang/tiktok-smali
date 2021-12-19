package com.ss.android.ugc.aweme.autoplay.d.a;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.utils.cb;
import com.ss.android.ugc.aweme.utils.eh;
import com.ss.android.ugc.aweme.utils.hk;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class b extends c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f67323c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final View f67324a;

    /* renamed from: b  reason: collision with root package name */
    public final h.f.a.a<z> f67325b;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f67326f = h.i.a((h.f.a.a) new c(this));

    /* renamed from: g  reason: collision with root package name */
    private final h.h f67327g = h.i.a((h.f.a.a) new e(this));

    /* renamed from: h  reason: collision with root package name */
    private final h.h f67328h = h.i.a((h.f.a.a) new f(this));

    /* renamed from: i  reason: collision with root package name */
    private final h.h f67329i = h.i.a((h.f.a.a) new g(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f67330j = h.i.a((h.f.a.a) new i(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f67331k = h.i.a((h.f.a.a) new h(this));

    static {
        Covode.recordClassIndex(41464);
    }

    private final boolean b() {
        return ((Boolean) this.f67326f.getValue()).booleanValue();
    }

    private final ViewGroup c() {
        return (ViewGroup) this.f67327g.getValue();
    }

    private final TextView d() {
        return (TextView) this.f67330j.getValue();
    }

    public final SmartImageView a() {
        return (SmartImageView) this.f67328h.getValue();
    }

    static final class a {
        static {
            Covode.recordClassIndex(41465);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class e extends m implements h.f.a.a<ViewGroup> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(41469);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ViewGroup invoke() {
            return this.this$0.f67324a.findViewById(R.id.bfh);
        }
    }

    static final class f extends m implements h.f.a.a<SmartImageView> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(41470);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SmartImageView invoke() {
            return this.this$0.f67324a.findViewById(R.id.bfi);
        }
    }

    static final class g extends m implements h.f.a.a<TextView> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(41471);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.f67324a.findViewById(R.id.bfj);
        }
    }

    static final class h extends m implements h.f.a.a<TextView> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(41472);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.f67324a.findViewById(R.id.bfs);
        }
    }

    static final class i extends m implements h.f.a.a<TextView> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(41473);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.f67324a.findViewById(R.id.bft);
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(41467);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            Context context = this.this$0.f67324a.getContext();
            l.b(context, "");
            return Boolean.valueOf(com.bytedance.tux.h.i.a(context));
        }
    }

    public static final class d extends eh {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f67333a;

        static {
            Covode.recordClassIndex(41468);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(b bVar) {
            this.f67333a = bVar;
        }

        @Override // com.bytedance.lighten.a.c.k, com.ss.android.ugc.aweme.utils.eh
        public final void a(Uri uri, View view, Throwable th) {
            SmartImageView a2 = this.f67333a.a();
            l.b(a2, "");
            a2.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.b$b  reason: collision with other inner class name */
    static final class View$OnClickListenerC1519b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f67332a;

        static {
            Covode.recordClassIndex(41466);
        }

        View$OnClickListenerC1519b(b bVar) {
            this.f67332a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f67332a.f67325b.invoke();
        }
    }

    public b(ViewStub viewStub, h.f.a.a<z> aVar) {
        l.d(viewStub, "");
        l.d(aVar, "");
        MethodCollector.i(2826);
        this.f67325b = aVar;
        viewStub.setLayoutResource(R.layout.av8);
        View inflate = viewStub.inflate();
        l.b(inflate, "");
        this.f67324a = inflate;
        MethodCollector.o(2826);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.a.c, com.ss.android.ugc.aweme.autoplay.d.a.d
    public final void a(com.ss.android.ugc.aweme.discover.mixfeed.h hVar, r rVar) {
        String str;
        String str2;
        long j2;
        boolean z;
        float applyDimension;
        float applyDimension2;
        float applyDimension3;
        float f2;
        float f3;
        float f4;
        float applyDimension4;
        String str3;
        String str4;
        l.d(hVar, "");
        l.d(rVar, "");
        super.a(hVar, rVar);
        com.ss.android.ugc.aweme.discover.mixfeed.r rVar2 = this.f67335d;
        if (rVar2 == null || (str = rVar2.f81861d) == null || str.length() <= 0) {
            str = null;
        }
        com.ss.android.ugc.aweme.discover.mixfeed.r rVar3 = this.f67335d;
        if (rVar3 != null) {
            Long.valueOf(rVar3.f81860c);
        }
        if (str == null) {
            p.a(c());
            p.a(d());
        } else {
            p.b(c());
            com.ss.android.ugc.aweme.discover.mixfeed.r rVar4 = this.f67335d;
            if (rVar4 != null) {
                str2 = rVar4.f81862e;
            } else {
                str2 = null;
            }
            if (hk.a(str2)) {
                com.ss.android.ugc.aweme.discover.mixfeed.r rVar5 = this.f67335d;
                if (rVar5 == null || (str3 = rVar5.f81862e) == null) {
                    str3 = "";
                }
                v a2 = com.bytedance.lighten.a.r.a(str3).a("AbsCellViewHolder");
                a2.E = a();
                a2.a(new d(this));
                SmartImageView a3 = a();
                l.b(a3, "");
                a3.setVisibility(0);
            } else {
                SmartImageView a4 = a();
                l.b(a4, "");
                a4.setVisibility(8);
            }
            TextView textView = (TextView) this.f67329i.getValue();
            textView.setText(str);
            textView.setTextColor(androidx.core.content.b.c(this.f67324a.getContext(), R.color.a9));
            com.ss.android.ugc.aweme.discover.mixfeed.r rVar6 = this.f67335d;
            if (rVar6 != null) {
                j2 = rVar6.f81860c;
                if (j2 > 0) {
                    z = true;
                }
                z = false;
            } else {
                j2 = 0;
                z = false;
            }
            ViewGroup c2 = c();
            l.b(c2, "");
            float f5 = 0.0f;
            if (z) {
                applyDimension = 0.0f;
            } else {
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                applyDimension = TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics());
            }
            if (b()) {
                applyDimension2 = applyDimension;
            } else {
                Resources system2 = Resources.getSystem();
                l.a((Object) system2, "");
                applyDimension2 = TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics());
            }
            if (b()) {
                applyDimension3 = applyDimension;
            } else {
                Resources system3 = Resources.getSystem();
                l.a((Object) system3, "");
                applyDimension3 = TypedValue.applyDimension(1, 2.0f, system3.getDisplayMetrics());
            }
            if (b()) {
                Resources system4 = Resources.getSystem();
                l.a((Object) system4, "");
                f2 = TypedValue.applyDimension(1, 2.0f, system4.getDisplayMetrics());
            } else {
                f2 = applyDimension;
            }
            if (b()) {
                Resources system5 = Resources.getSystem();
                l.a((Object) system5, "");
                applyDimension = TypedValue.applyDimension(1, 2.0f, system5.getDisplayMetrics());
            }
            c2.setBackground(cb.a(androidx.core.content.b.c(this.f67324a.getContext(), R.color.bh), applyDimension2, f2, applyDimension, applyDimension3));
            TextView d2 = d();
            if (!z) {
                p.a(d2);
            } else {
                p.b(d2);
                if (b()) {
                    Resources system6 = Resources.getSystem();
                    l.a((Object) system6, "");
                    f3 = TypedValue.applyDimension(1, 2.0f, system6.getDisplayMetrics());
                } else {
                    f3 = 0.0f;
                }
                if (b()) {
                    Resources system7 = Resources.getSystem();
                    l.a((Object) system7, "");
                    f4 = TypedValue.applyDimension(1, 2.0f, system7.getDisplayMetrics());
                } else {
                    f4 = 0.0f;
                }
                if (b()) {
                    applyDimension4 = 0.0f;
                } else {
                    Resources system8 = Resources.getSystem();
                    l.a((Object) system8, "");
                    applyDimension4 = TypedValue.applyDimension(1, 2.0f, system8.getDisplayMetrics());
                }
                if (!b()) {
                    Resources system9 = Resources.getSystem();
                    l.a((Object) system9, "");
                    f5 = TypedValue.applyDimension(1, 2.0f, system9.getDisplayMetrics());
                }
                d2.setBackground(cb.a(androidx.core.content.b.c(this.f67324a.getContext(), R.color.f159923g), f3, applyDimension4, f5, f4));
                String string = this.f67324a.getContext().getString(R.string.aat, com.ss.android.ugc.aweme.i18n.b.a(j2));
                l.b(string, "");
                d2.setText(new a.C0730a().a(string).f33382a);
                d2.setTextColor(androidx.core.content.b.c(d2.getContext(), R.color.c5));
            }
        }
        TextView textView2 = (TextView) this.f67331k.getValue();
        l.b(textView2, "");
        com.ss.android.ugc.aweme.discover.mixfeed.r rVar7 = this.f67335d;
        if (rVar7 != null) {
            str4 = rVar7.f81859b;
        } else {
            str4 = null;
        }
        textView2.setText(str4);
        this.f67324a.setOnClickListener(new View$OnClickListenerC1519b(this));
    }
}
