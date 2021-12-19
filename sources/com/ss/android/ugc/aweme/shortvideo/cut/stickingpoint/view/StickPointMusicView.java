package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class StickPointMusicView extends FrameLayout implements b {

    /* renamed from: a  reason: collision with root package name */
    public d f126049a;

    /* renamed from: b  reason: collision with root package name */
    private View f126050b;

    /* renamed from: c  reason: collision with root package name */
    private RecyclerView f126051c;

    /* renamed from: d  reason: collision with root package name */
    private View f126052d;

    /* renamed from: e  reason: collision with root package name */
    private View f126053e;

    /* renamed from: f  reason: collision with root package name */
    private View f126054f;

    /* renamed from: g  reason: collision with root package name */
    private View f126055g;

    static {
        Covode.recordClassIndex(82787);
    }

    public StickPointMusicView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b
    public final View d() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b
    public final void a() {
        View view = this.f126054f;
        if (view == null) {
            l.a("loadingView");
        }
        view.setVisibility(0);
        View view2 = this.f126055g;
        if (view2 == null) {
            l.a("contentView");
        }
        view2.setVisibility(8);
        View view3 = this.f126052d;
        if (view3 == null) {
            l.a("noDataView");
        }
        view3.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b
    public final void b() {
        View view = this.f126055g;
        if (view == null) {
            l.a("contentView");
        }
        view.setVisibility(0);
        View view2 = this.f126054f;
        if (view2 == null) {
            l.a("loadingView");
        }
        view2.setVisibility(8);
        View view3 = this.f126052d;
        if (view3 == null) {
            l.a("noDataView");
        }
        view3.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b
    public final void c() {
        View view = this.f126052d;
        if (view == null) {
            l.a("noDataView");
        }
        view.setVisibility(0);
        View view2 = this.f126055g;
        if (view2 == null) {
            l.a("contentView");
        }
        view2.setVisibility(8);
        View view3 = this.f126054f;
        if (view3 == null) {
            l.a("loadingView");
        }
        view3.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b
    public final void setStickPointMusicListener(d dVar) {
        l.d(dVar, "");
        this.f126049a = dVar;
    }

    final class a extends LinearLayoutManager {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StickPointMusicView f126056a;

        static {
            Covode.recordClassIndex(82788);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMusicView$a$a  reason: collision with other inner class name */
        final class C3281a extends r {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ a f126057f;

            static {
                Covode.recordClassIndex(82789);
            }

            @Override // androidx.recyclerview.widget.r
            public final float a(DisplayMetrics displayMetrics) {
                l.d(displayMetrics, "");
                return 150.0f / ((float) displayMetrics.densityDpi);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3281a(a aVar, Context context) {
                super(context);
                l.d(context, "");
                this.f126057f = aVar;
            }

            @Override // androidx.recyclerview.widget.r
            public final int a(int i2, int i3, int i4, int i5, int i6) {
                return (i4 + ((i5 - i4) / 2)) - (i2 + ((i3 - i2) / 2));
            }
        }

        public a(StickPointMusicView stickPointMusicView, Context context) {
            l.d(context, "");
            this.f126056a = stickPointMusicView;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
        public final void a(RecyclerView recyclerView, RecyclerView.s sVar, int i2) {
            l.d(recyclerView, "");
            Context context = recyclerView.getContext();
            l.b(context, "");
            C3281a aVar = new C3281a(this, context);
            aVar.f3862g = i2;
            a(aVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b
    public final void a(int i2) {
        RecyclerView recyclerView = this.f126051c;
        if (recyclerView == null) {
            l.a("musicRecyleView");
        }
        recyclerView.d(i2);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b
    public final void setCollectMusicCallback(com.ss.android.ugc.aweme.shortvideo.cut.scene.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StickPointMusicView f126058a;

        static {
            Covode.recordClassIndex(82790);
        }

        b(StickPointMusicView stickPointMusicView) {
            this.f126058a = stickPointMusicView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            d dVar = this.f126058a.f126049a;
            if (dVar != null) {
                l.b(view, "");
                dVar.a(view);
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StickPointMusicView f126059a;

        static {
            Covode.recordClassIndex(82791);
        }

        c(StickPointMusicView stickPointMusicView) {
            this.f126059a = stickPointMusicView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            d dVar = this.f126059a.f126049a;
            if (dVar != null) {
                l.b(view, "");
                dVar.b(view);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b
    public final void setRecyclerViewAdapter(aa.h hVar) {
        l.d(hVar, "");
        RecyclerView recyclerView = this.f126051c;
        if (recyclerView == null) {
            l.a("musicRecyleView");
        }
        recyclerView.setAdapter(hVar);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b
    public final void setButtonClickable(boolean z) {
        if (this.f126050b == null) {
            l.a("rootContentView");
            return;
        }
        View view = this.f126050b;
        if (view == null) {
            l.a("rootContentView");
        }
        View findViewById = view.findViewById(R.id.a4l);
        l.b(findViewById, "");
        findViewById.setClickable(z);
    }

    private /* synthetic */ StickPointMusicView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StickPointMusicView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(6061);
        View inflate = LayoutInflater.from(context).inflate(R.layout.aih, this);
        l.b(inflate, "");
        this.f126050b = inflate;
        if (inflate == null) {
            l.a("rootContentView");
        }
        View findViewById = inflate.findViewById(R.id.ae6);
        l.b(findViewById, "");
        this.f126055g = findViewById;
        View view = this.f126050b;
        if (view == null) {
            l.a("rootContentView");
        }
        View findViewById2 = view.findViewById(R.id.cvh);
        l.b(findViewById2, "");
        this.f126052d = findViewById2;
        View view2 = this.f126050b;
        if (view2 == null) {
            l.a("rootContentView");
        }
        View findViewById3 = view2.findViewById(R.id.dmh);
        l.b(findViewById3, "");
        this.f126053e = findViewById3;
        View view3 = this.f126050b;
        if (view3 == null) {
            l.a("rootContentView");
        }
        View findViewById4 = view3.findViewById(R.id.ci9);
        l.b(findViewById4, "");
        this.f126054f = findViewById4;
        View view4 = this.f126050b;
        if (view4 == null) {
            l.a("rootContentView");
        }
        View findViewById5 = view4.findViewById(R.id.cqz);
        l.b(findViewById5, "");
        this.f126051c = (RecyclerView) findViewById5;
        a aVar = new a(this, context);
        aVar.b(0);
        RecyclerView recyclerView = this.f126051c;
        if (recyclerView == null) {
            l.a("musicRecyleView");
        }
        recyclerView.setLayoutManager(aVar);
        View view5 = this.f126050b;
        if (view5 == null) {
            l.a("rootContentView");
        }
        view5.findViewById(R.id.a4l).setOnClickListener(new b(this));
        View view6 = this.f126053e;
        if (view6 == null) {
            l.a("retryView");
        }
        view6.setOnClickListener(new c(this));
        MethodCollector.o(6061);
    }
}
