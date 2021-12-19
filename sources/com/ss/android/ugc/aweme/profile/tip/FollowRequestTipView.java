package com.ss.android.ugc.aweme.profile.tip;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class FollowRequestTipView extends a {

    /* renamed from: d  reason: collision with root package name */
    public h.f.a.a<z> f116705d;

    /* renamed from: e  reason: collision with root package name */
    public h.f.a.a<z> f116706e;

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f116707f;

    static {
        Covode.recordClassIndex(75387);
    }

    public FollowRequestTipView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.profile.tip.a
    public final View a(int i2) {
        if (this.f116707f == null) {
            this.f116707f = new SparseArray();
        }
        View view = (View) this.f116707f.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f116707f.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.profile.tip.a
    public final View a() {
        MethodCollector.i(9767);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.aqf, this);
        l.b(inflate, "");
        MethodCollector.o(9767);
        return inflate;
    }

    public final void setAcceptCallback(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f116705d = aVar;
    }

    public final void setDeleteCallback(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f116706e = aVar;
    }

    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FollowRequestTipView f116708a;

        static {
            Covode.recordClassIndex(75388);
        }

        public a(FollowRequestTipView followRequestTipView) {
            this.f116708a = followRequestTipView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.a<z> aVar = this.f116708a.f116706e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FollowRequestTipView f116709a;

        static {
            Covode.recordClassIndex(75389);
        }

        public b(FollowRequestTipView followRequestTipView) {
            this.f116709a = followRequestTipView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.a<z> aVar = this.f116709a.f116705d;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    private /* synthetic */ FollowRequestTipView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FollowRequestTipView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
    }
}
