package com.ss.android.ugc.aweme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class ck extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public LinearLayout f71092a;

    /* renamed from: b  reason: collision with root package name */
    public LinearLayout f71093b;

    /* renamed from: c  reason: collision with root package name */
    public TuxIconView f71094c;

    /* renamed from: d  reason: collision with root package name */
    public LinearLayout f71095d;

    /* renamed from: e  reason: collision with root package name */
    public View f71096e;

    /* renamed from: f  reason: collision with root package name */
    public LinearLayout f71097f;

    /* renamed from: g  reason: collision with root package name */
    public int f71098g;

    /* renamed from: h  reason: collision with root package name */
    private View f71099h;

    /* renamed from: i  reason: collision with root package name */
    private RemoteImageView f71100i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f71101j;

    /* renamed from: k  reason: collision with root package name */
    private RemoteImageView f71102k;

    public final /* synthetic */ class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f71129a;

        static {
            Covode.recordClassIndex(43766);
        }

        public d(h.f.a.b bVar) {
            this.f71129a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            l.b(this.f71129a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(43762);
    }

    public final ViewGroup getAnchorListContent() {
        return this.f71093b;
    }

    public final RemoteImageView getLeftIcon() {
        return this.f71100i;
    }

    public final TuxIconView getRightIcon() {
        return this.f71094c;
    }

    public final void b() {
        n.a(this.f71102k, 0);
    }

    public final void c() {
        n.a(this.f71102k, 8);
    }

    public final boolean d() {
        LinearLayout linearLayout = this.f71095d;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinearLayout f71105a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f71106b;

        static {
            Covode.recordClassIndex(43763);
        }

        public a(LinearLayout linearLayout, float f2) {
            this.f71105a = linearLayout;
            this.f71106b = f2;
        }

        public final void run() {
            if (((float) this.f71105a.getMeasuredWidth()) > this.f71106b) {
                ViewGroup.LayoutParams layoutParams = this.f71105a.getLayoutParams();
                layoutParams.width = (int) this.f71106b;
                this.f71105a.setLayoutParams(layoutParams);
            }
        }
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinearLayout f71116a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f71117b;

        static {
            Covode.recordClassIndex(43764);
        }

        public b(LinearLayout linearLayout, float f2) {
            this.f71116a = linearLayout;
            this.f71117b = f2;
        }

        public final void run() {
            if (((float) this.f71116a.getMeasuredWidth()) > this.f71117b) {
                ViewGroup.LayoutParams layoutParams = this.f71116a.getLayoutParams();
                layoutParams.width = (int) this.f71117b;
                this.f71116a.setLayoutParams(layoutParams);
            }
        }
    }

    public final void a() {
        MethodCollector.i(6504);
        LinearLayout linearLayout = this.f71092a;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        this.f71098g = 0;
        MethodCollector.o(6504);
    }

    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ck f71123a;

        static {
            Covode.recordClassIndex(43765);
        }

        public c(ck ckVar) {
            this.f71123a = ckVar;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams;
            LinearLayout linearLayout = this.f71123a.f71093b;
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            if (linearLayout != null) {
                layoutParams = linearLayout.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = layoutParams;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.leftMargin = (int) n.b(this.f71123a.getContext(), 16.0f);
                LinearLayout linearLayout2 = this.f71123a.f71093b;
                if (linearLayout2 != null) {
                    linearLayout2.setLayoutParams(marginLayoutParams2);
                }
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ck(Context context) {
        this(context, (byte) 0);
        l.d(context, "");
    }

    public final void setOnAddClickListener(h.f.a.b<? super View, z> bVar) {
        l.d(bVar, "");
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.h_);
        this.f71097f = linearLayout;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new d(bVar));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private ck(Context context, byte b2) {
        this(context, (char) 0);
        l.d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ck(Context context, char c2) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(6589);
        this.f71099h = LayoutInflater.from(context).inflate(R.layout.aam, this);
        RemoteImageView remoteImageView = (RemoteImageView) findViewById(R.id.d9n);
        this.f71100i = remoteImageView;
        if (remoteImageView != null) {
            remoteImageView.setImageResource(2131232534);
        }
        this.f71101j = (TextView) findViewById(R.id.d9t);
        this.f71094c = (TuxIconView) findViewById(R.id.d9o);
        this.f71092a = (LinearLayout) findViewById(R.id.d9i);
        this.f71093b = (LinearLayout) findViewById(R.id.aeo);
        this.f71095d = (LinearLayout) findViewById(R.id.d9u);
        RemoteImageView remoteImageView2 = (RemoteImageView) findViewById(R.id.d9k);
        this.f71102k = remoteImageView2;
        if (remoteImageView2 != null) {
            remoteImageView2.setImageResource(R.drawable.a_q);
        }
        this.f71096e = findViewById(R.id.awd);
        this.f71097f = (LinearLayout) findViewById(R.id.h_);
        MethodCollector.o(6589);
    }
}
