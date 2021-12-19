package com.ss.android.ugc.aweme.qrcode;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.powerpage.a.a;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.h;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.metrics.af;
import com.ss.android.ugc.aweme.qrcode.presenter.a.j;
import com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity;
import com.ss.android.ugc.aweme.qrcode.view.b;
import com.ss.android.ugc.aweme.utils.ic;
import com.zhiliaoapp.musically.R;
import java.util.List;

@a
public class QRCodeFragment extends a implements View.OnClickListener, j.a {

    /* renamed from: e  reason: collision with root package name */
    protected j f119681e;

    /* renamed from: f  reason: collision with root package name */
    protected j f119682f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.aweme.qrcode.view.a f119683g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f119684h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f119685i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f119686j;

    /* renamed from: k  reason: collision with root package name */
    private FrameLayout f119687k;

    /* renamed from: l  reason: collision with root package name */
    private b f119688l;

    /* renamed from: m  reason: collision with root package name */
    private View f119689m;
    private TextTitleBar n;
    private TextView o;
    private List<Aweme> p;

    static {
        Covode.recordClassIndex(77746);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.a.j.a, androidx.fragment.app.Fragment
    public View getView() {
        return this.f119688l;
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final void c() {
        com.ss.android.ugc.aweme.qrcode.view.a aVar = this.f119683g;
        if (aVar != null && aVar.isShowing()) {
            this.f119683g.dismiss();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        h.a(this.p);
        j jVar = this.f119682f;
        if (jVar != null) {
            jVar.b();
        }
        c();
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.a.j.a
    public final void d() {
        com.ss.android.ugc.aweme.qrcode.view.a aVar = this.f119683g;
        if (aVar != null && !aVar.isShowing()) {
            this.f119683g.show();
            this.f119683g.a();
        }
        af afVar = new af();
        afVar.f109474a = this.f119681e.enterFrom;
        afVar.f109475b = "normal";
        afVar.f109476c = "shaped";
        afVar.f();
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.a.j.a
    public final void e() {
        if (!getActivity().isFinishing()) {
            c();
            new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(R.string.fgb).a();
            this.f119685i.announceForAccessibility(getString(R.string.fgb));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(e.f119737a);
    }

    public void onClick(View view) {
        boolean z;
        ClickAgent.onClick(view);
        int id = view.getId();
        if (id == R.id.bu7) {
            getActivity().finish();
        } else if (id == R.id.f6d) {
            if (this.f119688l.f119850f) {
                this.f119682f.a();
                return;
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(getString(R.string.bbn)).a();
            view.announceForAccessibility(getString(R.string.bbn));
        } else if (id != R.id.f6e) {
        } else {
            if (MSAdaptionService.c().b(getContext())) {
                Toast makeText = Toast.makeText(getContext(), getString(R.string.bey), 0);
                if (Build.VERSION.SDK_INT == 25) {
                    ic.a(makeText);
                }
                makeText.show();
                return;
            }
            r.a("qr_code_scan_enter", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "qr_code_detail").a("previous_page", this.f119681e.enterFrom).f66730a);
            Context context = getContext();
            if (this.f119681e.type == 4) {
                z = true;
            } else {
                z = false;
            }
            QRCodePermissionActivity.a(context, false, z);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        b aVar;
        MethodCollector.i(1508);
        super.onViewCreated(view, bundle);
        a(d.f119727a);
        this.p = h.f95332b;
        this.f119689m = view.findViewById(R.id.ad9);
        this.n = (TextTitleBar) view.findViewById(R.id.em8);
        this.o = (TextView) view.findViewById(R.id.dsg);
        this.f119685i = (TextView) view.findViewById(R.id.f6d);
        this.f119686j = (TextView) view.findViewById(R.id.f6e);
        this.f119687k = (FrameLayout) view.findViewById(R.id.df3);
        this.f119685i.setOnClickListener(this);
        this.f119686j.setOnClickListener(this);
        this.n.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {
            /* class com.ss.android.ugc.aweme.qrcode.QRCodeFragment.AnonymousClass1 */

            static {
                Covode.recordClassIndex(77747);
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void b(View view) {
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void a(View view) {
                QRCodeFragment.this.getActivity().finish();
            }
        });
        this.n.getBackBtn().setContentDescription(getString(R.string.a2g));
        j jVar = this.f119681e;
        if (jVar == null) {
            getActivity().finish();
            MethodCollector.o(1508);
            return;
        }
        this.n.setTitle(getString(c.a(jVar.type, this.f119681e.objectId)));
        int c2 = n.c(getContext(), (float) n.b(getContext()));
        if (c2 < 660) {
            float f2 = ((float) c2) / 667.0f;
            this.f119687k.setScaleX(f2);
            this.f119687k.setScaleY(f2);
            float f3 = ((1.0f - f2) * 400.0f) / 2.0f;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f119687k.getLayoutParams();
            layoutParams.topMargin = (int) n.b(getContext(), (32.0f * f2) - f3);
            this.f119687k.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.o.getLayoutParams();
            layoutParams2.topMargin = (int) n.b(getContext(), 16.0f - f3);
            this.o.setLayoutParams(layoutParams2);
        }
        j jVar2 = this.f119681e;
        if (jVar2 == null || jVar2.type != 4) {
            aVar = new com.ss.android.ugc.aweme.qrcode.f.a(getContext());
        } else {
            aVar = new com.ss.android.ugc.aweme.qrcode.f.b(getContext());
        }
        this.f119688l = aVar;
        this.f119687k.addView(aVar);
        if (this.f119683g == null) {
            com.ss.android.ugc.aweme.qrcode.view.a a2 = com.ss.android.ugc.aweme.qrcode.view.a.a(getContext(), getResources().getString(R.string.f73));
            this.f119683g = a2;
            a2.setIndeterminate(false);
            this.f119683g.getWindow().addFlags(32);
        }
        this.f119688l.setOnBindQrCodeListener(new b.a() {
            /* class com.ss.android.ugc.aweme.qrcode.QRCodeFragment.AnonymousClass2 */

            static {
                Covode.recordClassIndex(77748);
            }

            @Override // com.ss.android.ugc.aweme.qrcode.view.b.a
            public final void c() {
                QRCodeFragment.this.f119684h = true;
                QRCodeFragment.this.c();
            }

            @Override // com.ss.android.ugc.aweme.qrcode.view.b.a
            public final void a() {
                com.ss.android.ugc.aweme.qrcode.b.a aVar = new com.ss.android.ugc.aweme.qrcode.b.a();
                aVar.f119713a = QRCodeFragment.this.f119681e.enterFrom;
                aVar.f119714b = "shaped";
                aVar.f();
                QRCodeFragment.this.c();
            }

            @Override // com.ss.android.ugc.aweme.qrcode.view.b.a
            public final void b() {
                if (!QRCodeFragment.this.f119684h && QRCodeFragment.this.f119683g != null && QRCodeFragment.this.f119683g.isShowing()) {
                    QRCodeFragment.this.f119683g.dismiss();
                }
            }
        });
        this.f119688l.setData(this.f119681e);
        this.f119689m.setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.v));
        this.n.setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.f159928l));
        this.f119685i.setTextColor(androidx.core.content.b.c(getContext(), R.color.o1));
        this.f119686j.setTextColor(androidx.core.content.b.c(getContext(), R.color.o1));
        this.f119688l.setQRCodeCardTitleColor(androidx.core.content.b.c(getContext(), R.color.bx));
        this.f119688l.setQRCodeCardSubtitleColor(androidx.core.content.b.c(getContext(), R.color.c5));
        MethodCollector.o(1508);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.bz, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        j jVar = this.f119682f;
        if (i2 == 1) {
            for (int i3 : iArr) {
                if (i3 == -1) {
                    jVar.d();
                    return;
                }
            }
            jVar.c();
        }
    }
}
