package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.widget.CircularProgressView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends AlertDialog {

    /* renamed from: a  reason: collision with root package name */
    public AbstractC3282a f126063a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f126064b;

    /* renamed from: c  reason: collision with root package name */
    private CharSequence f126065c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f126066d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f126067e;

    /* renamed from: f  reason: collision with root package name */
    private int f126068f;

    /* renamed from: g  reason: collision with root package name */
    private int f126069g = 100;

    /* renamed from: h  reason: collision with root package name */
    private TextView f126070h;

    /* renamed from: i  reason: collision with root package name */
    private CircularProgressView f126071i;

    /* renamed from: j  reason: collision with root package name */
    private ImageView f126072j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f126073k;

    /* renamed from: l  reason: collision with root package name */
    private View f126074l;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a$a  reason: collision with other inner class name */
    public interface AbstractC3282a {
        static {
            Covode.recordClassIndex(82796);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(82795);
    }

    public final void dismiss() {
        CircularProgressView circularProgressView = this.f126071i;
        if (circularProgressView == null) {
            l.a("mLodingProgressView");
        }
        circularProgressView.b();
        super.dismiss();
    }

    public final void a(AbstractC3282a aVar) {
        l.d(aVar, "");
        this.f126063a = aVar;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f126075a;

        static {
            Covode.recordClassIndex(82797);
        }

        b(a aVar) {
            this.f126075a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC3282a aVar = this.f126075a.f126063a;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context, 3);
        l.d(context, "");
    }

    public final void a(boolean z) {
        int i2;
        if (this.f126064b) {
            ImageView imageView = this.f126072j;
            if (imageView == null) {
                l.a("mCancelView");
            }
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
        }
        this.f126067e = z;
    }

    public final void a(int i2) {
        if (this.f126064b) {
            TextView textView = this.f126073k;
            if (textView == null) {
                l.a("mProgressTextView");
            }
            textView.setText(new StringBuilder().append(i2).append('%').toString());
            CircularProgressView circularProgressView = this.f126071i;
            if (circularProgressView == null) {
                l.a("mLodingProgressView");
            }
            circularProgressView.setProgress((float) i2);
        }
        this.f126068f = i2;
    }

    public final void setMessage(CharSequence charSequence) {
        int i2;
        if (this.f126064b) {
            TextView textView = this.f126070h;
            if (textView == null) {
                l.a("mMessageView");
            }
            textView.setText(charSequence);
            TextView textView2 = this.f126070h;
            if (textView2 == null) {
                l.a("mMessageView");
            }
            if (TextUtils.isEmpty(charSequence)) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            textView2.setVisibility(i2);
        }
        this.f126065c = charSequence;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i2;
        super.onCreate(bundle);
        setContentView(R.layout.ail);
        View findViewById = findViewById(R.id.dqe);
        l.b(findViewById, "");
        this.f126074l = findViewById;
        View findViewById2 = findViewById(R.id.clf);
        l.b(findViewById2, "");
        this.f126070h = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.byw);
        l.b(findViewById3, "");
        this.f126071i = (CircularProgressView) findViewById3;
        View findViewById4 = findViewById(R.id.a1q);
        l.b(findViewById4, "");
        this.f126072j = (ImageView) findViewById4;
        View findViewById5 = findViewById(R.id.dby);
        l.b(findViewById5, "");
        this.f126073k = (TextView) findViewById5;
        ImageView imageView = this.f126072j;
        if (imageView == null) {
            l.a("mCancelView");
        }
        imageView.setOnClickListener(new b(this));
        this.f126064b = true;
        setMessage(this.f126065c);
        boolean z = this.f126066d;
        if (this.f126064b) {
            CircularProgressView circularProgressView = this.f126071i;
            if (circularProgressView == null) {
                l.a("mLodingProgressView");
            }
            circularProgressView.setIndeterminate(z);
            TextView textView = this.f126073k;
            if (textView == null) {
                l.a("mProgressTextView");
            }
            if (z) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            textView.setVisibility(i2);
        }
        this.f126066d = z;
        int i3 = this.f126069g;
        if (this.f126064b) {
            CircularProgressView circularProgressView2 = this.f126071i;
            if (circularProgressView2 == null) {
                l.a("mLodingProgressView");
            }
            circularProgressView2.setMaxProgress((float) i3);
        }
        this.f126069g = i3;
        a(this.f126068f);
        setCanceledOnTouchOutside(false);
        a(this.f126067e);
    }
}
