package com.ss.android.ugc.aweme.journey.step.a;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import androidx.lifecycle.ad;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxRadio;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.compliance.common.serviceimpl.ComplianceSettingsServiceImpl;
import com.ss.android.ugc.aweme.journey.ae;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class c extends com.ss.android.ugc.aweme.base.f.a implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    final h f104938a = i.a((h.f.a.a) a.f104940a);

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f104939b;

    static {
        Covode.recordClassIndex(67272);
    }

    public final View a(int i2) {
        if (this.f104939b == null) {
            this.f104939b = new SparseArray();
        }
        View view = (View) this.f104939b.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f104939b.put(i2, findViewById);
        return findViewById;
    }

    static final class a extends m implements h.f.a.a<IComplianceSettingsService> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f104940a = new a();

        static {
            Covode.recordClassIndex(67273);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IComplianceSettingsService invoke() {
            return ComplianceSettingsServiceImpl.b();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f104941a;

        static {
            Covode.recordClassIndex(67274);
        }

        b(c cVar) {
            this.f104941a = cVar;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            l.b(view, "");
            view.getContext();
            if (!j.f107229h || !j.b() || j.c()) {
                j.f107229h = a();
            }
            if (!j.f107229h) {
                new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(R.string.de8).a();
            }
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.journey.step.g.b(false));
            TuxRadio tuxRadio = (TuxRadio) this.f104941a.a(R.id.d3v);
            l.b(tuxRadio, "");
            ((IComplianceSettingsService) this.f104941a.f104938a.getValue()).a(tuxRadio.isChecked() ? 1 : 0);
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            TuxRadio tuxRadio2 = (TuxRadio) this.f104941a.a(R.id.d3v);
            l.b(tuxRadio2, "");
            r.a("pa_1p_prompt_click", dVar.a("click_position", tuxRadio2.isChecked() ? 1 : 0).f66730a);
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f104939b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    private static void a(View view) {
        Context context = view.getContext();
        l.b(context, "");
        com.ss.android.ugc.aweme.journey.ui.c cVar = new com.ss.android.ugc.aweme.journey.ui.c(view.getResources().getColor(R.color.f159928l), com.ss.android.ugc.aweme.journey.ui.b.a(context));
        Context context2 = view.getContext();
        l.b(context2, "");
        cVar.a(context2.getResources().getColor(R.color.b6));
        view.setBackground(cVar);
        view.setLayerType(1, null);
    }

    public final void onClick(View view) {
        Integer valueOf;
        ClickAgent.onClick(view);
        TuxButton tuxButton = (TuxButton) a(R.id.cv0);
        l.b(tuxButton, "");
        tuxButton.setEnabled(true);
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.d3u) {
                TuxRadio tuxRadio = (TuxRadio) a(R.id.d3v);
                l.b(tuxRadio, "");
                tuxRadio.setChecked(true);
            } else if (valueOf.intValue() == R.id.b_x) {
                TuxRadio tuxRadio2 = (TuxRadio) a(R.id.b_y);
                l.b(tuxRadio2, "");
                tuxRadio2.setChecked(true);
            }
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Integer valueOf;
        if (z) {
            TuxButton tuxButton = (TuxButton) a(R.id.cv0);
            l.b(tuxButton, "");
            tuxButton.setEnabled(true);
            if (compoundButton != null && (valueOf = Integer.valueOf(compoundButton.getId())) != null) {
                if (valueOf.intValue() == R.id.d3v) {
                    TuxRadio tuxRadio = (TuxRadio) a(R.id.b_y);
                    l.b(tuxRadio, "");
                    tuxRadio.setChecked(false);
                } else if (valueOf.intValue() == R.id.b_y) {
                    TuxRadio tuxRadio2 = (TuxRadio) a(R.id.d3v);
                    l.b(tuxRadio2, "");
                    tuxRadio2.setChecked(false);
                }
            }
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        RelativeLayout relativeLayout = (RelativeLayout) a(R.id.d3u);
        l.b(relativeLayout, "");
        a(relativeLayout);
        RelativeLayout relativeLayout2 = (RelativeLayout) a(R.id.b_x);
        l.b(relativeLayout2, "");
        a(relativeLayout2);
        ae aeVar = ((ComponentDependencies) androidx.lifecycle.ae.a(requireActivity(), (ad.b) null).a(ComponentDependencies.class)).f104917g;
        TuxTextView tuxTextView = (TuxTextView) a(R.id.d1i);
        l.b(tuxTextView, "");
        if (aeVar == null || (string = aeVar.f104821b) == null || string.length() <= 0) {
            string = getString(R.string.f02);
        }
        tuxTextView.setText(string);
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.d3w);
        l.b(tuxTextView2, "");
        if (aeVar == null || (string2 = aeVar.f104822c) == null || string2.length() <= 0) {
            string2 = getString(R.string.ezx);
        }
        tuxTextView2.setText(string2);
        TuxTextView tuxTextView3 = (TuxTextView) a(R.id.d3t);
        l.b(tuxTextView3, "");
        if (aeVar == null || (string3 = aeVar.f104823d) == null || string3.length() <= 0) {
            string3 = getString(R.string.ezy);
        }
        tuxTextView3.setText(string3);
        TuxTextView tuxTextView4 = (TuxTextView) a(R.id.b_z);
        l.b(tuxTextView4, "");
        if (aeVar == null || (string4 = aeVar.f104824e) == null || string4.length() <= 0) {
            string4 = getString(R.string.ezz);
        }
        tuxTextView4.setText(string4);
        TuxTextView tuxTextView5 = (TuxTextView) a(R.id.b_w);
        l.b(tuxTextView5, "");
        if (aeVar == null || (string5 = aeVar.f104825f) == null || string5.length() <= 0) {
            string5 = getString(R.string.f00);
        }
        tuxTextView5.setText(string5);
        TuxTextView tuxTextView6 = (TuxTextView) a(R.id.b8q);
        l.b(tuxTextView6, "");
        if (aeVar == null || (string6 = aeVar.f104826g) == null || string6.length() <= 0) {
            string6 = getString(R.string.f01);
        }
        tuxTextView6.setText(string6);
        ((RelativeLayout) a(R.id.d3u)).setOnClickListener(this);
        ((RelativeLayout) a(R.id.b_x)).setOnClickListener(this);
        ((TuxRadio) a(R.id.d3v)).setOnCheckedChangeListener(this);
        ((TuxRadio) a(R.id.b_y)).setOnCheckedChangeListener(this);
        ((TuxButton) a(R.id.cv0)).setOnClickListener(new b(this));
        r.a("pa_1p_prompt_v1_show", new com.ss.android.ugc.aweme.app.f.d().f66730a);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.abf, viewGroup, false);
    }
}
