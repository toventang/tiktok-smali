package com.ss.android.ugc.aweme.search.theme;

import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.CardGradientBgData;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.GradientBgData;
import com.ss.android.ugc.aweme.search.theme.a.d;
import com.ss.android.ugc.aweme.search.theme.dark.DarkThemeController;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f121698d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final e f121699a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f121700b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.flowfeed.a.a f121701c;

    /* renamed from: e  reason: collision with root package name */
    private final h f121702e = i.a((h.f.a.a) new C3149b(this));

    /* renamed from: f  reason: collision with root package name */
    private final h f121703f = i.a((h.f.a.a) new c(this));

    static {
        Covode.recordClassIndex(79266);
    }

    private final d b() {
        return (d) this.f121703f.getValue();
    }

    public final DarkThemeController a() {
        return (DarkThemeController) this.f121702e.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(79267);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<d> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(79269);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return new d(this.this$0.f121699a, this.this$0.f121700b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.theme.b$b  reason: collision with other inner class name */
    static final class C3149b extends m implements h.f.a.a<DarkThemeController> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(79268);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3149b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DarkThemeController invoke() {
            return new DarkThemeController(this.this$0.f121699a, this.this$0.f121700b, this.this$0.f121701c);
        }
    }

    private final void a(CardGradientBgData cardGradientBgData) {
        a().d();
        c a2 = d.a(cardGradientBgData);
        if (a2 != null) {
            a().a(a2);
        }
    }

    public final void a(GlobalDoodleConfig globalDoodleConfig) {
        CardGradientBgData cardGradientBgData;
        GradientBgData gradientBgData;
        GradientBgData gradientBgData2 = null;
        if (globalDoodleConfig != null) {
            cardGradientBgData = globalDoodleConfig.getCardBgData();
            gradientBgData = globalDoodleConfig.getGradientBgData();
        } else {
            cardGradientBgData = null;
            gradientBgData = null;
        }
        a(cardGradientBgData);
        if (gradientBgData != null && cardGradientBgData == null) {
            gradientBgData2 = gradientBgData;
        }
        a(gradientBgData2);
    }

    public final void a(GradientBgData gradientBgData) {
        com.ss.android.ugc.aweme.search.theme.a.a.a();
        b().e();
        if (gradientBgData != null) {
            b().a(new com.ss.android.ugc.aweme.search.theme.a.c(gradientBgData.getStartColor(), gradientBgData.getCenterColor(), gradientBgData.getScreens()));
        }
    }

    public b(e eVar, RecyclerView recyclerView, com.ss.android.ugc.aweme.flowfeed.a.a aVar) {
        l.d(eVar, "");
        l.d(recyclerView, "");
        l.d(aVar, "");
        this.f121699a = eVar;
        this.f121700b = recyclerView;
        this.f121701c = aVar;
    }
}
