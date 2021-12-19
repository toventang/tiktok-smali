package com.ss.android.ugc.aweme.music.ui;

import android.app.Activity;
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
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.ss.android.ugc.aweme.UIUXBugsExperimentService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e extends ProgressDialog implements DialogInterface.OnKeyListener {

    /* renamed from: d  reason: collision with root package name */
    public static final b f111964d = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ImageView f111965a;

    /* renamed from: b  reason: collision with root package name */
    public int f111966b;

    /* renamed from: c  reason: collision with root package name */
    public c f111967c;

    /* renamed from: e  reason: collision with root package name */
    private ViewGroup f111968e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f111969f;

    /* renamed from: g  reason: collision with root package name */
    private DmtStatusView f111970g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f111971h;

    /* renamed from: i  reason: collision with root package name */
    private CharSequence f111972i;

    /* renamed from: j  reason: collision with root package name */
    private final a f111973j;

    public enum a {
        GONE,
        VISIBLE,
        VISIBLE_AFTER_5S;

        static {
            Covode.recordClassIndex(71963);
        }
    }

    public interface c {
        static {
            Covode.recordClassIndex(71965);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(71962);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        return false;
    }

    public static final class b {
        static {
            Covode.recordClassIndex(71964);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        public static e a(Context context) {
            l.d(context, "");
            return a(context, new e(context));
        }

        private static e a(Context context, e eVar) {
            eVar.setCancelable(false);
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (com.ss.android.ugc.aweme.activity.a.a(activity, true) && !activity.isFinishing()) {
                    eVar.show();
                }
            }
            return eVar;
        }

        public static e a(Context context, a aVar, c cVar) {
            l.d(context, "");
            l.d(aVar, "");
            l.d(cVar, "");
            e eVar = new e(context, aVar, (byte) 0);
            eVar.f111967c = cVar;
            return a(context, eVar);
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f111975a;

        static {
            Covode.recordClassIndex(71966);
        }

        d(e eVar) {
            this.f111975a = eVar;
        }

        public final void run() {
            ImageView imageView = this.f111975a.f111965a;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        this(context, a.GONE);
        l.d(context, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.e$e  reason: collision with other inner class name */
    static final class View$OnClickListenerC2862e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f111976a;

        static {
            Covode.recordClassIndex(71967);
        }

        View$OnClickListenerC2862e(e eVar) {
            this.f111976a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            c cVar = this.f111976a.f111967c;
            if (cVar != null) {
                cVar.a();
            }
            this.f111976a.dismiss();
            this.f111976a.f111966b = 0;
        }
    }

    public final void setMessage(CharSequence charSequence) {
        int i2;
        super.setMessage(charSequence);
        if (this.f111971h) {
            TextView textView = this.f111969f;
            if (textView != null) {
                textView.setText(charSequence);
            }
            TextView textView2 = this.f111969f;
            if (textView2 != null) {
                if (TextUtils.isEmpty(charSequence)) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                textView2.setVisibility(i2);
            }
        }
        this.f111972i = charSequence;
    }

    public final void setProgress(int i2) {
        if (i2 >= this.f111966b) {
            if (this.f111971h) {
                TextView textView = this.f111969f;
                if (textView == null) {
                    l.b();
                }
                StringBuilder sb = new StringBuilder();
                Context context = getContext();
                l.b(context, "");
                textView.setText(sb.append(context.getResources().getString(R.string.g4k)).append(i2).append("%").toString());
            }
            this.f111966b = i2;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        ViewGroup viewGroup;
        super.onCreate(bundle);
        setContentView(R.layout.ala);
        this.f111968e = (ViewGroup) findViewById(R.id.dqe);
        this.f111965a = (ImageView) findViewById(R.id.a1q);
        this.f111969f = (TextView) findViewById(R.id.dcb);
        this.f111970g = (DmtStatusView) findViewById(R.id.e_o);
        int i2 = f.f111977a[this.f111973j.ordinal()];
        if (i2 == 1) {
            ImageView imageView = this.f111965a;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else if (i2 == 2) {
            ImageView imageView2 = this.f111965a;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        } else if (i2 == 3 && (viewGroup = this.f111968e) != null) {
            viewGroup.postDelayed(new d(this), 5000);
        }
        this.f111971h = true;
        if (UIUXBugsExperimentService.b().a()) {
            TextView textView = this.f111969f;
            if (textView == null) {
                l.b();
            }
            Context context = getContext();
            l.b(context, "");
            textView.setText(context.getResources().getString(R.string.g4k));
        } else {
            setProgress(this.f111966b);
        }
        DmtStatusView dmtStatusView = this.f111970g;
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(new DmtStatusView.a(getContext()).a());
        }
        DmtStatusView dmtStatusView2 = this.f111970g;
        if (dmtStatusView2 != null) {
            dmtStatusView2.f();
        }
        setCanceledOnTouchOutside(false);
        ImageView imageView3 = this.f111965a;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View$OnClickListenerC2862e(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private e(Context context, a aVar) {
        super(context, R.style.zs);
        l.d(context, "");
        l.d(aVar, "");
        this.f111973j = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e(Context context, a aVar, byte b2) {
        this(context, aVar);
        l.d(context, "");
        l.d(aVar, "");
    }
}
