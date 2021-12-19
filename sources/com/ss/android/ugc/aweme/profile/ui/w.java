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

public final class w extends Dialog {

    /* renamed from: c  reason: collision with root package name */
    public static final a f117316c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final Activity f117317a;

    /* renamed from: b  reason: collision with root package name */
    public final String f117318b;

    static {
        Covode.recordClassIndex(75816);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75817);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f117320a;

        static {
            Covode.recordClassIndex(75819);
        }

        c(w wVar) {
            this.f117320a = wVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117320a.dismiss();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f117321a;

        static {
            Covode.recordClassIndex(75820);
        }

        d(w wVar) {
            this.f117321a = wVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117321a.dismiss();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f117322a;

        static {
            Covode.recordClassIndex(75821);
        }

        e(w wVar) {
            this.f117322a = wVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117322a.dismiss();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f117319a;

        static {
            Covode.recordClassIndex(75818);
        }

        b(w wVar) {
            this.f117319a = wVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            w wVar = this.f117319a;
            String str = wVar.f117318b;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("geo:0,0?q=".concat(String.valueOf(str))));
            if (intent.resolveActivity(wVar.f117317a.getPackageManager()) != null) {
                Activity activity = wVar.f117317a;
                com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
                activity.startActivity(intent);
            }
            this.f117319a.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.anf);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, n.b(window.getContext()) - n.e(window.getContext()));
            window.setGravity(80);
            window.getAttributes().gravity = 80;
        }
        setCanceledOnTouchOutside(true);
        ((TuxTextView) findViewById(R.id.evc)).setOnClickListener(new b(this));
        ((TuxTextView) findViewById(R.id.exi)).setOnClickListener(new c(this));
        ((RoundedFrameLayout) findViewById(R.id.b4n)).setOnClickListener(new d(this));
        ((RelativeLayout) findViewById(R.id.b4h)).setOnClickListener(new e(this));
    }

    private w(Activity activity, String str) {
        super(activity, R.style.a05);
        this.f117317a = activity;
        this.f117318b = str;
    }

    public /* synthetic */ w(Activity activity, String str, byte b2) {
        this(activity, str);
    }
}
