package com.ss.android.ugc.aweme.profile.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.views.RoundedFrameLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class x extends Dialog {

    /* renamed from: c  reason: collision with root package name */
    public static final a f117480c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final Activity f117481a;

    /* renamed from: b  reason: collision with root package name */
    public final String f117482b;

    static {
        Covode.recordClassIndex(75890);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75891);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f117484a;

        static {
            Covode.recordClassIndex(75893);
        }

        c(x xVar) {
            this.f117484a = xVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117484a.dismiss();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f117485a;

        static {
            Covode.recordClassIndex(75894);
        }

        d(x xVar) {
            this.f117485a = xVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117485a.dismiss();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f117483a;

        static {
            Covode.recordClassIndex(75892);
        }

        b(x xVar) {
            this.f117483a = xVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            x xVar = this.f117483a;
            Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(String.valueOf(xVar.f117482b))));
            Activity activity = xVar.f117481a;
            com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
            activity.startActivity(intent);
            this.f117483a.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ang);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, n.b(window.getContext()) - n.e(window.getContext()));
            window.setGravity(80);
            window.getAttributes().gravity = 80;
        }
        setCanceledOnTouchOutside(true);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.f4f);
        l.b(tuxTextView, "");
        tuxTextView.setText(this.f117482b);
        ((RoundedFrameLayout) findViewById(R.id.b64)).setOnClickListener(new b(this));
        ((RoundedFrameLayout) findViewById(R.id.b4n)).setOnClickListener(new c(this));
        ((RelativeLayout) findViewById(R.id.b4h)).setOnClickListener(new d(this));
    }

    private x(Activity activity, String str) {
        super(activity, R.style.a05);
        this.f117481a = activity;
        this.f117482b = str;
    }

    public /* synthetic */ x(Activity activity, String str, byte b2) {
        this(activity, str);
    }
}
