package com.ss.android.ugc.aweme.compliance.business.inference.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.u;
import com.bytedance.tux.input.TuxEditText;
import com.bytedance.tux.input.TuxRadio;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.g;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.business.inference.api.InferenceCategoryApi;
import com.ss.android.ugc.aweme.compliance.business.inference.model.LabelData;
import com.ss.android.ugc.aweme.compliance.business.inference.viewmodel.InferenceCategoryVM;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a extends Fragment implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, com.bytedance.tux.navigation.a {

    /* renamed from: i  reason: collision with root package name */
    public static final C1765a f76955i = new C1765a((byte) 0);
    private String A = "";
    private String B = "";
    private String C = "";
    private String D = "";
    private String E = "";
    private int F;
    private SparseArray G;

    /* renamed from: a  reason: collision with root package name */
    public LabelData f76956a;

    /* renamed from: b  reason: collision with root package name */
    public androidx.fragment.app.e f76957b;

    /* renamed from: c  reason: collision with root package name */
    public InferenceCategoryVM f76958c;

    /* renamed from: d  reason: collision with root package name */
    public InferenceCategoryApi f76959d;

    /* renamed from: e  reason: collision with root package name */
    public int f76960e = -1;

    /* renamed from: f  reason: collision with root package name */
    public String f76961f = "";

    /* renamed from: g  reason: collision with root package name */
    public int f76962g = -1;

    /* renamed from: h  reason: collision with root package name */
    public String f76963h = "";

    /* renamed from: j  reason: collision with root package name */
    private Context f76964j;

    /* renamed from: k  reason: collision with root package name */
    private TuxTextView f76965k;

    /* renamed from: l  reason: collision with root package name */
    private RelativeLayout f76966l;

    /* renamed from: m  reason: collision with root package name */
    private RelativeLayout f76967m;
    private CustomRelativeLayout n;
    private View o;
    private TuxTextView p;
    private TuxTextView q;
    private TuxEditText r;
    private TuxRadio s;
    private TuxRadio t;
    private TuxRadio u;
    private String v = "";
    private String w = "";
    private String x = "";
    private String y = "";
    private String z = "";

    static {
        Covode.recordClassIndex(47564);
    }

    public final View a(int i2) {
        if (this.G == null) {
            this.G = new SparseArray();
        }
        View view = (View) this.G.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.G.put(i2, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.inference.ui.a$a  reason: collision with other inner class name */
    public static final class C1765a {
        static {
            Covode.recordClassIndex(47565);
        }

        private C1765a() {
        }

        public /* synthetic */ C1765a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(47566);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.b();
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.G;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f76968a;

        static {
            Covode.recordClassIndex(47567);
        }

        @Override // com.ss.android.ugc.aweme.compliance.business.inference.ui.b
        public final void a() {
            TuxRadio tuxRadio = (TuxRadio) this.f76968a.a(R.id.f8);
            l.b(tuxRadio, "");
            tuxRadio.setChecked(true);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f76968a = aVar;
        }
    }

    @Override // com.bytedance.tux.navigation.a
    public final TuxNavBar.a a() {
        String interestTagValue;
        LabelData labelData = this.f76956a;
        if (labelData == null) {
            l.a("mLabelData");
        }
        if (labelData.getLabelType() == 0) {
            interestTagValue = this.v;
        } else {
            LabelData labelData2 = this.f76956a;
            if (labelData2 == null) {
                l.a("mLabelData");
            }
            interestTagValue = labelData2.getInterestTagValue();
        }
        TuxNavBar.a aVar = new TuxNavBar.a();
        g gVar = new g();
        if (interestTagValue == null) {
            interestTagValue = this.E;
        }
        TuxNavBar.a b2 = aVar.a(gVar.a(interestTagValue)).b(new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark_small).a((h.f.a.a<z>) new b(this)));
        b2.f45188d = true;
        return b2;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    public final void b() {
        /*
        // Method dump skipped, instructions count: 359
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.inference.ui.a.b():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        Integer num;
        super.onResume();
        LabelData labelData = this.f76956a;
        if (labelData == null) {
            l.a("mLabelData");
        }
        int labelType = labelData.getLabelType();
        if (labelType == 0) {
            TuxTextView tuxTextView = this.p;
            if (tuxTextView == null) {
                l.a("mLabelItemFirstText");
            }
            tuxTextView.setText(this.z);
            TuxTextView tuxTextView2 = this.q;
            if (tuxTextView2 == null) {
                l.a("mLabelItemSecondText");
            }
            tuxTextView2.setText(this.A);
            CustomRelativeLayout customRelativeLayout = this.n;
            if (customRelativeLayout == null) {
                l.a("mLabelItemThirdView");
            }
            customRelativeLayout.setVisibility(0);
            View view = this.o;
            if (view == null) {
                l.a("mLabelItemBottomLine");
            }
            view.setVisibility(0);
            TuxTextView tuxTextView3 = this.f76965k;
            if (tuxTextView3 == null) {
                l.a("mLabelExplainInfoView");
            }
            LabelData labelData2 = this.f76956a;
            if (labelData2 == null) {
                l.a("mLabelData");
            }
            if (l.a((Object) labelData2.getInterestTagActive(), (Object) true)) {
                str = this.w;
            } else {
                str = this.x;
            }
            tuxTextView3.setText(str);
            LabelData labelData3 = this.f76956a;
            if (labelData3 == null) {
                l.a("mLabelData");
            }
            String interestTagId = labelData3.getInterestTagId();
            if (interestTagId != null) {
                num = Integer.valueOf(Integer.parseInt(interestTagId));
            } else {
                num = null;
            }
            if (num != null) {
                if (num.intValue() == 0) {
                    TuxRadio tuxRadio = this.s;
                    if (tuxRadio == null) {
                        l.a("mFirstRadio");
                    }
                    tuxRadio.setChecked(true);
                    TuxEditText tuxEditText = this.r;
                    if (tuxEditText == null) {
                        l.a("mLabelItemThirdText");
                    }
                    tuxEditText.setText("");
                } else if (num.intValue() == 1) {
                    TuxRadio tuxRadio2 = this.t;
                    if (tuxRadio2 == null) {
                        l.a("mSecondRadio");
                    }
                    tuxRadio2.setChecked(true);
                    TuxEditText tuxEditText2 = this.r;
                    if (tuxEditText2 == null) {
                        l.a("mLabelItemThirdText");
                    }
                    tuxEditText2.setText("");
                } else if (num.intValue() == 2) {
                    TuxRadio tuxRadio3 = this.u;
                    if (tuxRadio3 == null) {
                        l.a("mThirdRadio");
                    }
                    tuxRadio3.setChecked(true);
                    TuxEditText tuxEditText3 = this.r;
                    if (tuxEditText3 == null) {
                        l.a("mLabelItemThirdText");
                    }
                    LabelData labelData4 = this.f76956a;
                    if (labelData4 == null) {
                        l.a("mLabelData");
                    }
                    tuxEditText3.setText(labelData4.getInterestTagValue());
                }
            }
        } else if (labelType == 1) {
            TuxTextView tuxTextView4 = this.f76965k;
            if (tuxTextView4 == null) {
                l.a("mLabelExplainInfoView");
            }
            tuxTextView4.setText(this.y);
            TuxTextView tuxTextView5 = this.p;
            if (tuxTextView5 == null) {
                l.a("mLabelItemFirstText");
            }
            tuxTextView5.setText(this.C);
            TuxTextView tuxTextView6 = this.q;
            if (tuxTextView6 == null) {
                l.a("mLabelItemSecondText");
            }
            tuxTextView6.setText(this.D);
            TuxRadio tuxRadio4 = this.s;
            if (tuxRadio4 == null) {
                l.a("mFirstRadio");
            }
            tuxRadio4.setChecked(true);
        } else if (labelType == 2) {
            TuxTextView tuxTextView7 = this.f76965k;
            if (tuxTextView7 == null) {
                l.a("mLabelExplainInfoView");
            }
            tuxTextView7.setText(this.y);
            TuxTextView tuxTextView8 = this.p;
            if (tuxTextView8 == null) {
                l.a("mLabelItemFirstText");
            }
            tuxTextView8.setText(this.C);
            TuxTextView tuxTextView9 = this.q;
            if (tuxTextView9 == null) {
                l.a("mLabelItemSecondText");
            }
            tuxTextView9.setText(this.D);
            TuxRadio tuxRadio5 = this.t;
            if (tuxRadio5 == null) {
                l.a("mSecondRadio");
            }
            tuxRadio5.setChecked(true);
        }
    }

    public static final class d implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f76969a;

        static {
            Covode.recordClassIndex(47568);
        }

        public d(a aVar) {
            this.f76969a = aVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f76969a.b();
        }
    }

    public static final /* synthetic */ LabelData a(a aVar) {
        LabelData labelData = aVar.f76956a;
        if (labelData == null) {
            l.a("mLabelData");
        }
        return labelData;
    }

    public final void a(String str) {
        if (!com.ss.android.ugc.aweme.app.g.a()) {
            InferenceCategoryApi inferenceCategoryApi = this.f76959d;
            if (inferenceCategoryApi == null) {
                l.a("mApi");
            }
            inferenceCategoryApi.setUserLabel(str).enqueue(new e(this, str));
        }
    }

    public final void onClick(View view) {
        Integer num;
        ClickAgent.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == R.id.f1) {
                TuxRadio tuxRadio = (TuxRadio) a(R.id.f2);
                l.b(tuxRadio, "");
                tuxRadio.setChecked(true);
            } else if (num.intValue() == R.id.f4) {
                TuxRadio tuxRadio2 = (TuxRadio) a(R.id.f5);
                l.b(tuxRadio2, "");
                tuxRadio2.setChecked(true);
            } else if (num != null) {
                if (num.intValue() == R.id.f7) {
                    TuxRadio tuxRadio3 = (TuxRadio) a(R.id.f8);
                    l.b(tuxRadio3, "");
                    tuxRadio3.setChecked(true);
                } else if (num.intValue() == R.id.f9) {
                    TuxRadio tuxRadio4 = (TuxRadio) a(R.id.f8);
                    l.b(tuxRadio4, "");
                    tuxRadio4.setChecked(true);
                }
            }
        }
    }

    public static final class e implements com.bytedance.retrofit2.d<BaseResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f76970a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f76971b;

        static {
            Covode.recordClassIndex(47569);
        }

        e(a aVar, String str) {
            this.f76970a = aVar;
            this.f76971b = str;
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<BaseResponse> bVar, Throwable th) {
            if (InferenceCategoryVM.f76972d > 0) {
                InferenceCategoryVM.f76972d--;
                this.f76970a.a(this.f76971b);
            }
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<BaseResponse> bVar, u<BaseResponse> uVar) {
            boolean z;
            if (uVar != null && uVar.f42629a.a() && uVar.f42630b != null) {
                if (uVar.f42630b.status_code == 0) {
                    if (a.a(this.f76970a).getLabelType() == 0) {
                        a.a(this.f76970a).setInterestTagId(String.valueOf(this.f76970a.f76962g));
                        if (this.f76970a.f76962g == 2) {
                            a.a(this.f76970a).setInterestTagValue(this.f76970a.f76963h);
                        }
                    } else {
                        LabelData a2 = a.a(this.f76970a);
                        Boolean interestTagActive = a.a(this.f76970a).getInterestTagActive();
                        if (interestTagActive != null) {
                            z = interestTagActive.booleanValue();
                        } else {
                            z = false;
                        }
                        a2.setInterestTagActive(Boolean.valueOf(!z));
                    }
                    InferenceCategoryVM inferenceCategoryVM = this.f76970a.f76958c;
                    if (inferenceCategoryVM == null) {
                        l.a("inferenceVM");
                    }
                    inferenceCategoryVM.f76975b.setValue(a.a(this.f76970a));
                } else {
                    androidx.fragment.app.e eVar = this.f76970a.f76957b;
                    if (eVar == null) {
                        l.a("mActivity");
                    }
                    new com.bytedance.tux.g.b(eVar).e(R.string.de8).b();
                }
                InferenceCategoryVM.f76972d = 3;
            } else if (InferenceCategoryVM.f76972d > 0) {
                InferenceCategoryVM.f76972d--;
                this.f76970a.a(this.f76971b);
            }
        }
    }

    private final void a(int i2, String str) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(new JSONObject().put("field", "gender_tag_type").put("value", String.valueOf(i2)));
        jSONArray.put(new JSONObject().put("field", "gender_tag_content").put("value", str));
        String jSONArray2 = jSONArray.toString();
        l.b(jSONArray2, "");
        a(jSONArray2);
    }

    private final void a(String str, boolean z2) {
        if (str == null || str.length() == 0) {
            androidx.fragment.app.e eVar = this.f76957b;
            if (eVar == null) {
                l.a("mActivity");
            }
            new com.bytedance.tux.g.b(eVar).e(R.string.de8).b();
            return;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(new JSONObject().put("field", "interest_tag_id").put("value", str));
        jSONArray.put(new JSONObject().put("field", "interest_tag_active").put("value", String.valueOf(z2)));
        String jSONArray2 = jSONArray.toString();
        l.b(jSONArray2, "");
        a(jSONArray2);
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        Integer num;
        if (z2) {
            if (compoundButton != null) {
                num = Integer.valueOf(compoundButton.getId());
            } else {
                num = null;
            }
            if (num != null) {
                if (num.intValue() == R.id.f2) {
                    TuxRadio tuxRadio = (TuxRadio) a(R.id.f5);
                    l.b(tuxRadio, "");
                    tuxRadio.setChecked(false);
                    TuxRadio tuxRadio2 = (TuxRadio) a(R.id.f8);
                    l.b(tuxRadio2, "");
                    tuxRadio2.setChecked(false);
                } else if (num.intValue() == R.id.f5) {
                    TuxRadio tuxRadio3 = (TuxRadio) a(R.id.f2);
                    l.b(tuxRadio3, "");
                    tuxRadio3.setChecked(false);
                    TuxRadio tuxRadio4 = (TuxRadio) a(R.id.f8);
                    l.b(tuxRadio4, "");
                    tuxRadio4.setChecked(false);
                } else if (num.intValue() == R.id.f8) {
                    TuxRadio tuxRadio5 = (TuxRadio) a(R.id.f2);
                    l.b(tuxRadio5, "");
                    tuxRadio5.setChecked(false);
                    TuxRadio tuxRadio6 = (TuxRadio) a(R.id.f5);
                    l.b(tuxRadio6, "");
                    tuxRadio6.setChecked(false);
                } else if (num.intValue() == R.id.f9) {
                    TuxRadio tuxRadio7 = (TuxRadio) a(R.id.f2);
                    l.b(tuxRadio7, "");
                    tuxRadio7.setChecked(false);
                    TuxRadio tuxRadio8 = (TuxRadio) a(R.id.f5);
                    l.b(tuxRadio8, "");
                    tuxRadio8.setChecked(false);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context == null) {
            context = this;
        }
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.content.Context");
        Context context2 = context;
        this.f76964j = context2;
        if (context2 == null) {
            l.a("mContext");
        }
        String string = context2.getString(R.string.fqf);
        l.b(string, "");
        this.v = string;
        String string2 = context2.getString(R.string.fql);
        l.b(string2, "");
        this.w = string2;
        String string3 = context2.getString(R.string.fqj);
        l.b(string3, "");
        this.x = string3;
        String string4 = context2.getString(R.string.fqp);
        l.b(string4, "");
        this.y = string4;
        String string5 = context2.getString(R.string.fqk);
        l.b(string5, "");
        this.z = string5;
        String string6 = context2.getString(R.string.fqm);
        l.b(string6, "");
        this.A = string6;
        String string7 = context2.getString(R.string.fqg);
        l.b(string7, "");
        this.B = string7;
        String string8 = context2.getString(R.string.fqn);
        l.b(string8, "");
        this.E = string8;
        String string9 = context2.getString(R.string.fqr);
        l.b(string9, "");
        this.C = string9;
        String string10 = context2.getString(R.string.fqq);
        l.b(string10, "");
        this.D = string10;
        View findViewById = view.findViewById(R.id.f_);
        l.b(findViewById, "");
        this.f76965k = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.f1);
        l.b(findViewById2, "");
        this.f76966l = (RelativeLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.f4);
        l.b(findViewById3, "");
        this.f76967m = (RelativeLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.f7);
        l.b(findViewById4, "");
        this.n = (CustomRelativeLayout) findViewById4;
        View findViewById5 = view.findViewById(R.id.f0);
        l.b(findViewById5, "");
        this.o = findViewById5;
        View findViewById6 = view.findViewById(R.id.f3);
        l.b(findViewById6, "");
        this.p = (TuxTextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.f6);
        l.b(findViewById7, "");
        this.q = (TuxTextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.f9);
        l.b(findViewById8, "");
        this.r = (TuxEditText) findViewById8;
        View findViewById9 = view.findViewById(R.id.f2);
        l.b(findViewById9, "");
        this.s = (TuxRadio) findViewById9;
        View findViewById10 = view.findViewById(R.id.f5);
        l.b(findViewById10, "");
        this.t = (TuxRadio) findViewById10;
        View findViewById11 = view.findViewById(R.id.f8);
        l.b(findViewById11, "");
        this.u = (TuxRadio) findViewById11;
        CustomRelativeLayout customRelativeLayout = this.n;
        if (customRelativeLayout == null) {
            l.a("mLabelItemThirdView");
        }
        customRelativeLayout.setTouchListener(new c(this));
        TuxRadio tuxRadio = this.s;
        if (tuxRadio == null) {
            l.a("mFirstRadio");
        }
        tuxRadio.setOnCheckedChangeListener(this);
        TuxRadio tuxRadio2 = this.t;
        if (tuxRadio2 == null) {
            l.a("mSecondRadio");
        }
        tuxRadio2.setOnCheckedChangeListener(this);
        TuxRadio tuxRadio3 = this.u;
        if (tuxRadio3 == null) {
            l.a("mThirdRadio");
        }
        tuxRadio3.setOnCheckedChangeListener(this);
        RelativeLayout relativeLayout = this.f76966l;
        if (relativeLayout == null) {
            l.a("mLabelItemFirstView");
        }
        relativeLayout.setOnClickListener(this);
        RelativeLayout relativeLayout2 = this.f76967m;
        if (relativeLayout2 == null) {
            l.a("mLabelItemSecondView");
        }
        relativeLayout2.setOnClickListener(this);
        CustomRelativeLayout customRelativeLayout2 = this.n;
        if (customRelativeLayout2 == null) {
            l.a("mLabelItemThirdView");
        }
        customRelativeLayout2.setOnClickListener(this);
        TuxEditText tuxEditText = this.r;
        if (tuxEditText == null) {
            l.a("mLabelItemThirdText");
        }
        tuxEditText.setOnClickListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.az0, viewGroup, false);
    }
}
