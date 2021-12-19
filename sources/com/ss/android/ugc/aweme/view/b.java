package com.ss.android.ugc.aweme.view;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends ProgressDialog implements DialogInterface.OnKeyListener {

    /* renamed from: d  reason: collision with root package name */
    public static final C3836b f144095d = new C3836b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ImageView f144096a;

    /* renamed from: b  reason: collision with root package name */
    public int f144097b;

    /* renamed from: c  reason: collision with root package name */
    public c f144098c;

    /* renamed from: e  reason: collision with root package name */
    private ViewGroup f144099e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f144100f;

    /* renamed from: g  reason: collision with root package name */
    private DmtStatusView f144101g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f144102h;

    /* renamed from: i  reason: collision with root package name */
    private CharSequence f144103i;

    /* renamed from: j  reason: collision with root package name */
    private final a f144104j;

    public enum a {
        GONE,
        VISIBLE,
        VISIBLE_AFTER_5S;

        static {
            Covode.recordClassIndex(94297);
        }
    }

    public interface c {
        static {
            Covode.recordClassIndex(94299);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(94296);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.view.b$b  reason: collision with other inner class name */
    public static final class C3836b {
        static {
            Covode.recordClassIndex(94298);
        }

        private C3836b() {
        }

        public /* synthetic */ C3836b(byte b2) {
            this();
        }

        public static b a(Context context) {
            l.d(context, "");
            return a(context, new b(context));
        }

        private static b a(Context context, b bVar) {
            bVar.setCancelable(false);
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (com.ss.android.ugc.aweme.activity.a.a(activity, true) && !activity.isFinishing()) {
                    bVar.show();
                }
            }
            return bVar;
        }

        public static b a(Context context, a aVar, c cVar) {
            l.d(context, "");
            l.d(aVar, "");
            b bVar = new b(context, aVar, (byte) 0);
            bVar.f144098c = cVar;
            return a(context, bVar);
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f144126a;

        static {
            Covode.recordClassIndex(94300);
        }

        d(b bVar) {
            this.f144126a = bVar;
        }

        public final void run() {
            ImageView imageView = this.f144126a.f144096a;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        this(context, a.GONE);
        l.d(context, "");
    }

    public final void setMessage(CharSequence charSequence) {
        super.setMessage(charSequence);
        if (this.f144102h) {
            a(charSequence);
        }
        this.f144103i = charSequence;
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f144128a;

        static {
            Covode.recordClassIndex(94301);
        }

        e(b bVar) {
            this.f144128a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            c cVar = this.f144128a.f144098c;
            if (cVar != null) {
                cVar.a();
            }
            this.f144128a.dismiss();
            this.f144128a.f144097b = 0;
        }
    }

    public final void setProgress(int i2) {
        if (i2 >= this.f144097b) {
            if (this.f144102h) {
                StringBuilder sb = new StringBuilder();
                Context context = getContext();
                l.b(context, "");
                a(sb.append(context.getResources().getString(R.string.g4k)).append(i2).append("%").toString());
            }
            this.f144097b = i2;
        }
    }

    private final void a(CharSequence charSequence) {
        ViewGroup.LayoutParams layoutParams;
        int i2;
        TextView textView = this.f144100f;
        if (textView != null) {
            textView.setText(charSequence);
        }
        TextView textView2 = this.f144100f;
        if (textView2 != null) {
            if (TextUtils.isEmpty(charSequence)) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            textView2.setVisibility(i2);
        }
        DmtStatusView dmtStatusView = this.f144101g;
        FrameLayout.LayoutParams layoutParams2 = null;
        if (dmtStatusView != null) {
            layoutParams = dmtStatusView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            layoutParams2 = layoutParams;
        }
        FrameLayout.LayoutParams layoutParams3 = layoutParams2;
        if (layoutParams3 != null) {
            int i3 = 1;
            if (charSequence == null || charSequence.length() == 0) {
                i3 = 17;
            }
            if (layoutParams3.gravity != i3) {
                layoutParams3.gravity = i3;
                DmtStatusView dmtStatusView2 = this.f144101g;
                if (dmtStatusView2 != null) {
                    dmtStatusView2.setLayoutParams(layoutParams3);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        ViewGroup viewGroup;
        super.onCreate(bundle);
        setContentView(R.layout.e4);
        this.f144099e = (ViewGroup) findViewById(R.id.dqe);
        this.f144096a = (ImageView) findViewById(R.id.a1q);
        this.f144100f = (TextView) findViewById(R.id.dcb);
        this.f144101g = (DmtStatusView) findViewById(R.id.e_o);
        int i2 = c.f144132a[this.f144104j.ordinal()];
        if (i2 == 1) {
            ImageView imageView = this.f144096a;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else if (i2 == 2) {
            ImageView imageView2 = this.f144096a;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        } else if (i2 == 3 && (viewGroup = this.f144099e) != null) {
            viewGroup.postDelayed(new d(this), 5000);
        }
        this.f144102h = true;
        setProgress(this.f144097b);
        DmtStatusView dmtStatusView = this.f144101g;
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(new DmtStatusView.a(getContext()).a());
        }
        DmtStatusView dmtStatusView2 = this.f144101g;
        if (dmtStatusView2 != null) {
            dmtStatusView2.f();
        }
        setCanceledOnTouchOutside(false);
        ImageView imageView3 = this.f144096a;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new e(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(Context context, a aVar) {
        super(context, R.style.ve);
        l.d(context, "");
        l.d(aVar, "");
        this.f144104j = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(Context context, a aVar, byte b2) {
        this(context, aVar);
        l.d(context, "");
        l.d(aVar, "");
    }
}
