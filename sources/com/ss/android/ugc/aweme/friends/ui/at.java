package com.ss.android.ugc.aweme.friends.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.z;

public final class at extends RelativeLayout {

    /* renamed from: i  reason: collision with root package name */
    public static final int f97173i = 0;

    /* renamed from: j  reason: collision with root package name */
    public static final int f97174j = 1;

    /* renamed from: k  reason: collision with root package name */
    public static final int f97175k = 2;

    /* renamed from: l  reason: collision with root package name */
    public static final int f97176l = 5;

    /* renamed from: m  reason: collision with root package name */
    public static final int f97177m = 7;
    public static final int n = 972;
    public static final a o = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public View f97178a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f97179b;

    /* renamed from: c  reason: collision with root package name */
    public SmartAvatarImageView f97180c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f97181d;

    /* renamed from: e  reason: collision with root package name */
    public FansFollowUserBtn f97182e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f97183f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f97184g;

    /* renamed from: h  reason: collision with root package name */
    public m<? super Integer, ? super String, z> f97185h;

    private final int getLayoutResId() {
        return R.layout.mm;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61743);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final FansFollowUserBtn getMFollowUserBtn() {
        return this.f97182e;
    }

    static {
        Covode.recordClassIndex(61742);
    }

    public final void setNeedRecommendReason(boolean z) {
        this.f97184g = z;
    }

    public final void setActionEventListener(m<? super Integer, ? super String, z> mVar) {
        l.d(mVar, "");
        this.f97185h = mVar;
    }

    public final void setMFollowUserBtn(FansFollowUserBtn fansFollowUserBtn) {
        l.d(fansFollowUserBtn, "");
        this.f97182e = fansFollowUserBtn;
    }

    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ at f97186a;

        static {
            Covode.recordClassIndex(61744);
        }

        public b(at atVar) {
            this.f97186a = atVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            m<? super Integer, ? super String, z> mVar = this.f97186a.f97185h;
            if (mVar != null) {
                mVar.invoke(Integer.valueOf(at.f97174j), "click_head");
            }
        }
    }

    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ at f97187a;

        static {
            Covode.recordClassIndex(61745);
        }

        public c(at atVar) {
            this.f97187a = atVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            m<? super Integer, ? super String, z> mVar = this.f97187a.f97185h;
            if (mVar != null) {
                mVar.invoke(Integer.valueOf(at.f97173i), "click_name");
            }
        }
    }

    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ at f97188a;

        static {
            Covode.recordClassIndex(61746);
        }

        public d(at atVar) {
            this.f97188a = atVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            m<? super Integer, ? super String, z> mVar = this.f97188a.f97185h;
            if (mVar != null) {
                mVar.invoke(Integer.valueOf(at.f97175k), "");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private at(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(8685);
        this.f97184g = true;
        View inflate = LayoutInflater.from(context).inflate(getLayoutResId(), this);
        l.b(inflate, "");
        this.f97178a = inflate;
        View findViewById = inflate.findViewById(R.id.f_d);
        l.b(findViewById, "");
        this.f97179b = (TextView) findViewById;
        View findViewById2 = this.f97178a.findViewById(R.id.dib);
        l.b(findViewById2, "");
        this.f97180c = (SmartAvatarImageView) findViewById2;
        View findViewById3 = this.f97178a.findViewById(R.id.f3g);
        l.b(findViewById3, "");
        this.f97181d = (TextView) findViewById3;
        View findViewById4 = this.f97178a.findViewById(R.id.yf);
        l.b(findViewById4, "");
        this.f97182e = (FansFollowUserBtn) findViewById4;
        View findViewById5 = this.f97178a.findViewById(R.id.dig);
        l.b(findViewById5, "");
        this.f97183f = (TextView) findViewById5;
        MethodCollector.o(8685);
    }

    public /* synthetic */ at(Context context, byte b2) {
        this(context);
    }
}
