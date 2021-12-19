package com.bytedance.android.live.broadcast.b;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.HashMap;

public final class d extends v {

    /* renamed from: b  reason: collision with root package name */
    public static final String f7562b = d.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    public static d f7563c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f7564d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public h.f.a.b<? super Boolean, z> f7565a;

    /* renamed from: e  reason: collision with root package name */
    private TextView f7566e;

    /* renamed from: f  reason: collision with root package name */
    private FrameLayout f7567f;

    /* renamed from: g  reason: collision with root package name */
    private FrameLayout f7568g;

    /* renamed from: h  reason: collision with root package name */
    private FrameLayout f7569h;

    /* renamed from: i  reason: collision with root package name */
    private HashMap f7570i;

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f7570i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f7570i == null) {
            this.f7570i = new HashMap();
        }
        View view = (View) this.f7570i.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f7570i.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(3733);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private d() {
    }

    static {
        Covode.recordClassIndex(3732);
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b8o);
        bVar.f22375b = R.style.a29;
        bVar.f22380g = 80;
        bVar.f22379f = 0.0f;
        bVar.f22382i = -2;
        bVar.a(new ColorDrawable(0));
        return bVar;
    }

    /* renamed from: com.bytedance.android.live.broadcast.b.d$d  reason: collision with other inner class name */
    static final class View$OnClickListenerC0104d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f7573a;

        static {
            Covode.recordClassIndex(3736);
        }

        View$OnClickListenerC0104d(d dVar) {
            this.f7573a = dVar;
        }

        public final void onClick(View view) {
            this.f7573a.dismissAllowingStateLoss();
        }
    }

    public /* synthetic */ d(byte b2) {
        this();
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.a29);
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f7571a;

        static {
            Covode.recordClassIndex(3734);
        }

        b(d dVar) {
            this.f7571a = dVar;
        }

        public final void onClick(View view) {
            h.f.a.b<? super Boolean, z> bVar = this.f7571a.f7565a;
            if (bVar != null) {
                bVar.invoke(false);
            }
            this.f7571a.dismissAllowingStateLoss();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f7572a;

        static {
            Covode.recordClassIndex(3735);
        }

        c(d dVar) {
            this.f7572a = dVar;
        }

        public final void onClick(View view) {
            h.f.a.b<? super Boolean, z> bVar = this.f7572a.f7565a;
            if (bVar != null) {
                bVar.invoke(true);
            }
            this.f7572a.dismissAllowingStateLoss();
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.title);
        l.b(findViewById, "");
        this.f7566e = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.z7);
        l.b(findViewById2, "");
        this.f7567f = (FrameLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.zq);
        l.b(findViewById3, "");
        this.f7568g = (FrameLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.xy);
        l.b(findViewById4, "");
        this.f7569h = (FrameLayout) findViewById4;
        FrameLayout frameLayout = this.f7567f;
        if (frameLayout == null) {
            l.a("neverShowBtnItem");
        }
        frameLayout.setOnClickListener(new b(this));
        FrameLayout frameLayout2 = this.f7568g;
        if (frameLayout2 == null) {
            l.a("showNextTimeItem");
        }
        frameLayout2.setOnClickListener(new c(this));
        FrameLayout frameLayout3 = this.f7569h;
        if (frameLayout3 == null) {
            l.a("cancelBtnItem");
        }
        frameLayout3.setOnClickListener(new View$OnClickListenerC0104d(this));
    }
}
