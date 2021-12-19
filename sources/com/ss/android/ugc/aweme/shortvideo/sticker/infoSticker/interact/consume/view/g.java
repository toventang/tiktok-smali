package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

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
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class g extends ProgressDialog implements DialogInterface.OnKeyListener {

    /* renamed from: d  reason: collision with root package name */
    public static final b f130500d = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ImageView f130501a;

    /* renamed from: b  reason: collision with root package name */
    public int f130502b;

    /* renamed from: c  reason: collision with root package name */
    public c f130503c;

    /* renamed from: e  reason: collision with root package name */
    private ViewGroup f130504e;

    /* renamed from: f  reason: collision with root package name */
    private DmtTextView f130505f;

    /* renamed from: g  reason: collision with root package name */
    private DmtStatusView f130506g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f130507h;

    /* renamed from: i  reason: collision with root package name */
    private CharSequence f130508i;

    /* renamed from: j  reason: collision with root package name */
    private a f130509j;

    public enum a {
        GONE,
        VISIBLE,
        VISIBLE_AFTER_5S;

        static {
            Covode.recordClassIndex(85574);
        }
    }

    public interface c {
        static {
            Covode.recordClassIndex(85576);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(85573);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        return false;
    }

    public static final class b {
        static {
            Covode.recordClassIndex(85575);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        public static g a(Context context) {
            l.d(context, "");
            return a(context, new g(context, R.style.ve));
        }

        public static g a(Context context, g gVar) {
            gVar.setCancelable(false);
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (com.ss.android.ugc.aweme.activity.a.a(activity, false) && !activity.isFinishing()) {
                    gVar.show();
                }
            }
            return gVar;
        }

        public static g a(Context context, a aVar, c cVar) {
            l.d(context, "");
            l.d(aVar, "");
            l.d(cVar, "");
            g gVar = new g(context, R.style.ve, aVar);
            gVar.f130503c = cVar;
            return a(context, gVar);
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f130511a;

        static {
            Covode.recordClassIndex(85577);
        }

        d(g gVar) {
            this.f130511a = gVar;
        }

        public final void run() {
            ImageView imageView = this.f130511a.f130501a;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }
    }

    public final void a() {
        ViewGroup.LayoutParams layoutParams;
        DmtTextView dmtTextView = this.f130505f;
        if (dmtTextView != null) {
            dmtTextView.setFontWeight(2);
        }
        ImageView imageView = this.f130501a;
        FrameLayout.LayoutParams layoutParams2 = null;
        if (imageView != null) {
            layoutParams = imageView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            layoutParams2 = layoutParams;
        }
        FrameLayout.LayoutParams layoutParams3 = layoutParams2;
        if (layoutParams3 != null) {
            layoutParams3.gravity = 8388661;
        }
        ImageView imageView2 = this.f130501a;
        if (imageView2 != null) {
            imageView2.setLayoutParams(layoutParams3);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        this(context, R.style.ve, a.GONE);
        l.d(context, "");
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f130512a;

        static {
            Covode.recordClassIndex(85578);
        }

        e(g gVar) {
            this.f130512a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            c cVar = this.f130512a.f130503c;
            if (cVar != null) {
                cVar.a();
            }
            this.f130512a.dismiss();
            this.f130512a.f130502b = 0;
        }
    }

    public final void setMessage(CharSequence charSequence) {
        int i2;
        super.setMessage(charSequence);
        if (this.f130507h) {
            DmtTextView dmtTextView = this.f130505f;
            if (dmtTextView != null) {
                dmtTextView.setText(charSequence);
            }
            DmtTextView dmtTextView2 = this.f130505f;
            if (dmtTextView2 != null) {
                if (TextUtils.isEmpty(charSequence)) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                dmtTextView2.setVisibility(i2);
            }
        }
        this.f130508i = charSequence;
    }

    public final void setProgress(int i2) {
        if (i2 >= this.f130502b) {
            if (this.f130507h) {
                DmtTextView dmtTextView = this.f130505f;
                if (dmtTextView == null) {
                    l.b();
                }
                StringBuilder sb = new StringBuilder();
                Context context = getContext();
                l.b(context, "");
                dmtTextView.setText(sb.append(context.getResources().getString(R.string.g4k)).append(i2).append("%").toString());
            }
            this.f130502b = i2;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        ViewGroup viewGroup;
        super.onCreate(bundle);
        setContentView(R.layout.af2);
        this.f130504e = (ViewGroup) findViewById(R.id.dqe);
        this.f130501a = (ImageView) findViewById(R.id.a1q);
        this.f130505f = (DmtTextView) findViewById(R.id.dcb);
        this.f130506g = (DmtStatusView) findViewById(R.id.e_o);
        int i2 = h.f130513a[this.f130509j.ordinal()];
        if (i2 == 1) {
            ImageView imageView = this.f130501a;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else if (i2 == 2) {
            ImageView imageView2 = this.f130501a;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        } else if (i2 == 3 && (viewGroup = this.f130504e) != null) {
            viewGroup.postDelayed(new d(this), 5000);
        }
        this.f130507h = true;
        setProgress(this.f130502b);
        DmtStatusView dmtStatusView = this.f130506g;
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(new DmtStatusView.a(getContext()).a());
        }
        DmtStatusView dmtStatusView2 = this.f130506g;
        if (dmtStatusView2 != null) {
            dmtStatusView2.f();
        }
        setCanceledOnTouchOutside(false);
        ImageView imageView3 = this.f130501a;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new e(this));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public g(Context context, int i2) {
        this(context, R.style.ve, a.GONE);
        l.d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Context context, int i2, a aVar) {
        super(context, i2);
        l.d(context, "");
        l.d(aVar, "");
        this.f130509j = aVar;
    }
}
