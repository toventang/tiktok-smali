package com.ss.android.ugc.aweme.im.sdk.share.ui.d;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.service.c.k;
import com.ss.android.ugc.aweme.im.service.share.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends com.google.android.material.bottomsheet.a {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f103648a;

    /* renamed from: b  reason: collision with root package name */
    private final c f103649b;

    static {
        Covode.recordClassIndex(66403);
    }

    public /* synthetic */ a(Activity activity) {
        this(activity, null);
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f103651a;

        static {
            Covode.recordClassIndex(66405);
        }

        b(a aVar) {
            this.f103651a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f103651a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.d.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC2639a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f103650a;

        static {
            Covode.recordClassIndex(66404);
        }

        View$OnClickListenerC2639a(a aVar) {
            this.f103650a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.login.c.a(this.f103650a.f103648a, "share_page", "share_page");
            this.f103650a.dismiss();
        }
    }

    @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.h
    public final void onCreate(Bundle bundle) {
        c cVar;
        MethodCollector.i(5651);
        super.onCreate(bundle);
        setContentView(R.layout.a6z);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.setStatusBarColor(0);
            }
            window.setLayout(-1, -1);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.windowAnimations = R.style.yo;
            }
        }
        TuxButton tuxButton = (TuxButton) findViewById(R.id.zr);
        if (tuxButton != null) {
            tuxButton.setOnClickListener(new View$OnClickListenerC2639a(this));
        }
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.cny);
        if (tuxIconView != null) {
            tuxIconView.setOnClickListener(new b(this));
        }
        c cVar2 = this.f103649b;
        if (!(cVar2 == null || cVar2.f103956a == null)) {
            ((FrameLayout) findViewById(R.id.bk5)).addView(this.f103649b.f103956a);
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.bk5);
            l.b(frameLayout, "");
            frameLayout.setVisibility(0);
            View findViewById = findViewById(R.id.bk6);
            l.b(findViewById, "");
            findViewById.setVisibility(0);
        }
        if (!k.b() || (cVar = this.f103649b) == null || cVar.f103959d == null) {
            MethodCollector.o(5651);
            return;
        }
        ((FrameLayout) findViewById(R.id.bk0)).addView(this.f103649b.f103959d);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.bk0);
        l.b(frameLayout2, "");
        frameLayout2.setVisibility(0);
        View findViewById2 = findViewById(R.id.bk1);
        l.b(findViewById2, "");
        findViewById2.setVisibility(0);
        MethodCollector.o(5651);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Activity activity, c cVar) {
        super(activity, R.style.yv);
        l.d(activity, "");
        this.f103648a = activity;
        this.f103649b = cVar;
    }
}
