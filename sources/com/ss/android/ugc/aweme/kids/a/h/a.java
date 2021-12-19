package com.ss.android.ugc.aweme.kids.a.h;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends ProgressDialog implements DialogInterface.OnKeyListener {

    /* renamed from: d  reason: collision with root package name */
    public static final b f105336d = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ImageView f105337a;

    /* renamed from: b  reason: collision with root package name */
    public int f105338b;

    /* renamed from: c  reason: collision with root package name */
    public c f105339c;

    /* renamed from: e  reason: collision with root package name */
    private ViewGroup f105340e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f105341f;

    /* renamed from: g  reason: collision with root package name */
    private TuxDualBallView f105342g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f105343h;

    /* renamed from: i  reason: collision with root package name */
    private CharSequence f105344i;

    /* renamed from: j  reason: collision with root package name */
    private final EnumC2693a f105345j;

    /* renamed from: com.ss.android.ugc.aweme.kids.a.h.a$a  reason: collision with other inner class name */
    public enum EnumC2693a {
        GONE,
        VISIBLE,
        VISIBLE_AFTER_5S;

        static {
            Covode.recordClassIndex(67520);
        }
    }

    public interface c {
        static {
            Covode.recordClassIndex(67522);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(67519);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        return false;
    }

    public static final class b {
        static {
            Covode.recordClassIndex(67521);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f105349a;

        static {
            Covode.recordClassIndex(67523);
        }

        d(a aVar) {
            this.f105349a = aVar;
        }

        public final void run() {
            ImageView imageView = this.f105349a.f105337a;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f105350a;

        static {
            Covode.recordClassIndex(67524);
        }

        e(a aVar) {
            this.f105350a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            c cVar = this.f105350a.f105339c;
            if (cVar != null) {
                cVar.a();
            }
            this.f105350a.dismiss();
            this.f105350a.f105338b = 0;
        }
    }

    public final void setMessage(CharSequence charSequence) {
        int i2;
        super.setMessage(charSequence);
        if (this.f105343h) {
            TextView textView = this.f105341f;
            if (textView != null) {
                textView.setText(charSequence);
            }
            TextView textView2 = this.f105341f;
            if (textView2 != null) {
                if (TextUtils.isEmpty(charSequence)) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                textView2.setVisibility(i2);
            }
        }
        this.f105344i = charSequence;
    }

    public final void setProgress(int i2) {
        if (i2 >= this.f105338b) {
            if (this.f105343h) {
                TextView textView = this.f105341f;
                if (textView == null) {
                    l.b();
                }
                StringBuilder sb = new StringBuilder();
                Context context = getContext();
                l.b(context, "");
                textView.setText(sb.append(context.getResources().getString(R.string.g4k)).append(i2).append("%").toString());
            }
            this.f105338b = i2;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        ViewGroup viewGroup;
        super.onCreate(bundle);
        setContentView(R.layout.ado);
        this.f105340e = (ViewGroup) findViewById(R.id.dqe);
        this.f105337a = (ImageView) findViewById(R.id.a1q);
        this.f105341f = (TextView) findViewById(R.id.dcb);
        this.f105342g = (TuxDualBallView) findViewById(R.id.aq5);
        int i2 = b.f105351a[this.f105345j.ordinal()];
        if (i2 == 1) {
            ImageView imageView = this.f105337a;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else if (i2 == 2) {
            ImageView imageView2 = this.f105337a;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        } else if (i2 == 3 && (viewGroup = this.f105340e) != null) {
            viewGroup.postDelayed(new d(this), 5000);
        }
        this.f105343h = true;
        setProgress(this.f105338b);
        TuxDualBallView tuxDualBallView = this.f105342g;
        if (tuxDualBallView != null) {
            tuxDualBallView.b();
        }
        setCanceledOnTouchOutside(false);
        ImageView imageView3 = this.f105337a;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new e(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context, EnumC2693a aVar) {
        super(context, R.style.zs);
        l.d(context, "");
        l.d(aVar, "");
        this.f105345j = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(Context context, EnumC2693a aVar, byte b2) {
        this(context, aVar);
        l.d(context, "");
        l.d(aVar, "");
    }
}
