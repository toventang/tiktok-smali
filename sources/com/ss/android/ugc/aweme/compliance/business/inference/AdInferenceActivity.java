package com.ss.android.ugc.aweme.compliance.business.inference;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.business.inference.a.a;
import com.ss.android.ugc.aweme.compliance.business.inference.api.InferenceCategoryApi;
import com.ss.android.ugc.aweme.compliance.business.inference.model.Gender;
import com.ss.android.ugc.aweme.compliance.business.inference.model.InferenceCategory;
import com.ss.android.ugc.aweme.compliance.business.inference.model.LabelData;
import com.ss.android.ugc.aweme.compliance.business.inference.viewmodel.InferenceCategoryVM;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class AdInferenceActivity extends com.bytedance.ies.foundation.activity.a implements a.b {

    /* renamed from: k  reason: collision with root package name */
    public static final a f76919k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f76920a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.compliance.business.inference.a.a f76921b;

    /* renamed from: c  reason: collision with root package name */
    public InferenceCategoryVM f76922c;

    /* renamed from: d  reason: collision with root package name */
    public Gender f76923d;

    /* renamed from: e  reason: collision with root package name */
    public List<LabelData> f76924e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public List<LabelData> f76925f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public List<LabelData> f76926g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public int f76927h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f76928i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f76929j;

    /* renamed from: l  reason: collision with root package name */
    private TuxNavBar f76930l;

    /* renamed from: m  reason: collision with root package name */
    private com.ss.android.ugc.aweme.compliance.business.inference.ui.a f76931m;
    private int n;
    private long o;
    private long p;
    private long q = 500;
    private SparseArray r;

    static {
        Covode.recordClassIndex(47545);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.r;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.r == null) {
            this.r = new SparseArray();
        }
        View view = (View) this.r.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.r.put(i2, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.inference.AdInferenceActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.inference.AdInferenceActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.inference.AdInferenceActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47546);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ AdInferenceActivity this$0;

        static {
            Covode.recordClassIndex(47548);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AdInferenceActivity adInferenceActivity) {
            super(0);
            this.this$0 = adInferenceActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.onBackPressed();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void finish() {
        this.n = this.f76924e.size();
        r.a("exit_ad_inference", new com.ss.android.ugc.aweme.app.f.d().a("page_stay_time", System.currentTimeMillis() - this.o).a("initial_active_interest", this.f76928i).a("final_active_interest", this.n).a("change_interest", this.f76929j ? 1 : 0).f66730a);
        super.finish();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    static final class e extends m implements h.f.a.b<BaseActivityViewModel, z> {
        final /* synthetic */ AdInferenceActivity this$0;

        static {
            Covode.recordClassIndex(47550);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AdInferenceActivity adInferenceActivity) {
            super(1);
            this.this$0 = adInferenceActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            l.d(baseActivityViewModel, "");
            this.this$0.activityConfiguration(AnonymousClass1.f76934a);
            return z.f158842a;
        }
    }

    public static final /* synthetic */ InferenceCategoryVM a(AdInferenceActivity adInferenceActivity) {
        InferenceCategoryVM inferenceCategoryVM = adInferenceActivity.f76922c;
        if (inferenceCategoryVM == null) {
            l.a("inferenceVM");
        }
        return inferenceCategoryVM;
    }

    public static final /* synthetic */ RecyclerView b(AdInferenceActivity adInferenceActivity) {
        RecyclerView recyclerView = adInferenceActivity.f76920a;
        if (recyclerView == null) {
            l.a("mRecyclerView");
        }
        return recyclerView;
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.compliance.business.inference.a.a c(AdInferenceActivity adInferenceActivity) {
        com.ss.android.ugc.aweme.compliance.business.inference.a.a aVar = adInferenceActivity.f76921b;
        if (aVar == null) {
            l.a("adapter");
        }
        return aVar;
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInferenceActivity f76932a;

        static {
            Covode.recordClassIndex(47547);
        }

        b(AdInferenceActivity adInferenceActivity) {
            this.f76932a = adInferenceActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Gender gender;
            String str;
            String str2;
            List<LabelData> list;
            List<LabelData> list2;
            InferenceCategory value = AdInferenceActivity.a(this.f76932a).f76974a.getValue();
            String str3 = null;
            if (value != null) {
                gender = value.getGenderTag();
            } else {
                gender = null;
            }
            AdInferenceActivity adInferenceActivity = this.f76932a;
            if (gender != null) {
                str = gender.getGenderSource();
                str2 = gender.getGenderType();
                str3 = gender.getGenderContent();
            } else {
                str = null;
                str2 = null;
            }
            adInferenceActivity.f76923d = new Gender(str, str2, str3, 0);
            AdInferenceActivity adInferenceActivity2 = this.f76932a;
            InferenceCategory value2 = AdInferenceActivity.a(adInferenceActivity2).f76974a.getValue();
            if (value2 == null || (list = value2.getActiveInterestTags()) == null) {
                list = new ArrayList<>();
            }
            adInferenceActivity2.f76924e = AdInferenceActivity.a(list, 1);
            AdInferenceActivity adInferenceActivity3 = this.f76932a;
            InferenceCategory value3 = AdInferenceActivity.a(adInferenceActivity3).f76974a.getValue();
            if (value3 == null || (list2 = value3.getInactiveInterestTags()) == null) {
                list2 = new ArrayList<>();
            }
            adInferenceActivity3.f76925f = AdInferenceActivity.a(list2, 2);
            AdInferenceActivity adInferenceActivity4 = this.f76932a;
            adInferenceActivity4.f76926g = adInferenceActivity4.a(adInferenceActivity4.f76924e, this.f76932a.f76925f);
            AdInferenceActivity.b(this.f76932a).setLayoutManager(new LinearLayoutManager());
            AdInferenceActivity adInferenceActivity5 = this.f76932a;
            Context applicationContext = this.f76932a.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            l.b(applicationContext, "");
            adInferenceActivity5.f76921b = new com.ss.android.ugc.aweme.compliance.business.inference.a.a(applicationContext, this.f76932a);
            AdInferenceActivity.c(this.f76932a).a(this.f76932a.f76926g);
            AdInferenceActivity.b(this.f76932a).setAdapter(AdInferenceActivity.c(this.f76932a));
            AdInferenceActivity.c(this.f76932a).notifyDataSetChanged();
            AdInferenceActivity adInferenceActivity6 = this.f76932a;
            adInferenceActivity6.f76928i = adInferenceActivity6.f76924e.size();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.inference.AdInferenceActivity", "onCreate", true);
        activityConfiguration(new e(this));
        super.onCreate(bundle);
        setContentView(R.layout.u1);
        View findViewById = findViewById(R.id.bo7);
        l.b(findViewById, "");
        TuxNavBar tuxNavBar = (TuxNavBar) findViewById;
        this.f76930l = tuxNavBar;
        if (tuxNavBar == null) {
            l.a("mTitle");
        }
        g gVar = new g();
        String string = getString(R.string.fqd);
        l.b(string, "");
        tuxNavBar.a(gVar.a(string));
        TuxNavBar tuxNavBar2 = this.f76930l;
        if (tuxNavBar2 == null) {
            l.a("mTitle");
        }
        tuxNavBar2.a((com.bytedance.tux.navigation.a.c) new com.bytedance.tux.navigation.a.b().a(R.raw.icon_arrow_left_ltr).a((h.f.a.a<z>) new c(this)));
        TuxNavBar tuxNavBar3 = this.f76930l;
        if (tuxNavBar3 == null) {
            l.a("mTitle");
        }
        tuxNavBar3.a(true);
        View findViewById2 = findViewById(R.id.fdh);
        l.b(findViewById2, "");
        this.f76920a = (RecyclerView) findViewById2;
        InferenceCategoryVM a2 = InferenceCategoryVM.a.a(this);
        this.f76922c = a2;
        if (a2 == null) {
            l.a("inferenceVM");
        }
        a2.a();
        l.d(this, "");
        com.ss.android.ugc.aweme.compliance.business.inference.ui.a aVar = new com.ss.android.ugc.aweme.compliance.business.inference.ui.a();
        aVar.f76957b = this;
        aVar.f76958c = InferenceCategoryVM.a.a(this);
        aVar.f76959d = InferenceCategoryApi.a.a();
        this.f76931m = aVar;
        InferenceCategoryVM inferenceCategoryVM = this.f76922c;
        if (inferenceCategoryVM == null) {
            l.a("inferenceVM");
        }
        inferenceCategoryVM.f76974a.observe(this, new b(this));
        this.o = System.currentTimeMillis();
        r.onEventV3("show_ad_inference");
        InferenceCategoryVM inferenceCategoryVM2 = this.f76922c;
        if (inferenceCategoryVM2 == null) {
            l.a("inferenceVM");
        }
        inferenceCategoryVM2.f76975b.observe(this, new d(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.inference.AdInferenceActivity", "onCreate", false);
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInferenceActivity f76933a;

        static {
            Covode.recordClassIndex(47549);
        }

        d(AdInferenceActivity adInferenceActivity) {
            this.f76933a = adInferenceActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer valueOf;
            String interestTagId;
            String str;
            LabelData value = AdInferenceActivity.a(this.f76933a).f76975b.getValue();
            String str2 = null;
            if (!(value == null || (valueOf = Integer.valueOf(value.getLabelType())) == null)) {
                if (valueOf.intValue() == 0) {
                    Gender gender = this.f76933a.f76923d;
                    if (gender != null) {
                        gender.setGenderSource("1");
                    }
                    Gender gender2 = this.f76933a.f76923d;
                    if (gender2 != null) {
                        LabelData value2 = AdInferenceActivity.a(this.f76933a).f76975b.getValue();
                        if (value2 != null) {
                            str = value2.getInterestTagId();
                        } else {
                            str = null;
                        }
                        gender2.setGenderType(str);
                    }
                    LabelData value3 = AdInferenceActivity.a(this.f76933a).f76975b.getValue();
                    if (value3 == null || (interestTagId = value3.getInterestTagId()) == null || Integer.parseInt(interestTagId) != 2) {
                        Gender gender3 = this.f76933a.f76923d;
                        if (gender3 != null) {
                            gender3.setGenderContent(null);
                        }
                    } else {
                        Gender gender4 = this.f76933a.f76923d;
                        if (gender4 != null) {
                            LabelData value4 = AdInferenceActivity.a(this.f76933a).f76975b.getValue();
                            if (value4 != null) {
                                str2 = value4.getInterestTagValue();
                            }
                            gender4.setGenderContent(str2);
                        }
                    }
                } else if (valueOf != null) {
                    if (valueOf.intValue() == 1) {
                        if (this.f76933a.f76927h != -1 && this.f76933a.f76927h >= 0 && this.f76933a.f76927h < this.f76933a.f76924e.size()) {
                            LabelData labelData = this.f76933a.f76924e.get(this.f76933a.f76927h);
                            this.f76933a.f76924e.remove(this.f76933a.f76927h);
                            labelData.setLabelType(2);
                            labelData.setInterestTagActive(false);
                            this.f76933a.f76925f.add(0, labelData);
                            this.f76933a.f76929j = true;
                        }
                    } else if (valueOf.intValue() == 2 && this.f76933a.f76927h != -1 && this.f76933a.f76927h >= 0 && this.f76933a.f76927h < this.f76933a.f76925f.size()) {
                        LabelData labelData2 = this.f76933a.f76925f.get(this.f76933a.f76927h);
                        this.f76933a.f76925f.remove(this.f76933a.f76927h);
                        labelData2.setLabelType(1);
                        labelData2.setInterestTagActive(true);
                        this.f76933a.f76924e.add(0, labelData2);
                        this.f76933a.f76929j = true;
                    }
                }
            }
            AdInferenceActivity adInferenceActivity = this.f76933a;
            adInferenceActivity.f76926g = adInferenceActivity.a(adInferenceActivity.f76924e, this.f76933a.f76925f);
            AdInferenceActivity.c(this.f76933a).a(this.f76933a.f76926g);
            AdInferenceActivity.c(this.f76933a).notifyDataSetChanged();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r0 != 2) goto L_0x005c;
     */
    @Override // com.ss.android.ugc.aweme.compliance.business.inference.a.a.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r10) {
        /*
        // Method dump skipped, instructions count: 289
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.inference.AdInferenceActivity.a(int):void");
    }

    public static List<LabelData> a(List<LabelData> list, int i2) {
        if (list == null || list.size() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (LabelData labelData : list) {
            arrayList.add(new LabelData(labelData.getInterestTagId(), labelData.getInterestTagValue(), labelData.getInterestTagActive(), i2));
        }
        return arrayList;
    }

    public final List<LabelData> a(List<LabelData> list, List<LabelData> list2) {
        String str;
        String str2;
        int i2;
        ArrayList arrayList = new ArrayList();
        if (this.f76923d != null) {
            Gender gender = this.f76923d;
            String str3 = null;
            if (gender != null) {
                str = gender.getGenderType();
            } else {
                str = null;
            }
            Gender gender2 = this.f76923d;
            if (gender2 != null) {
                str2 = gender2.getGenderContent();
            } else {
                str2 = null;
            }
            Gender gender3 = this.f76923d;
            if (gender3 != null) {
                str3 = gender3.getGenderSource();
            }
            Boolean valueOf = Boolean.valueOf(l.a((Object) str3, (Object) "0"));
            Gender gender4 = this.f76923d;
            if (gender4 != null) {
                i2 = gender4.getLabelType();
            } else {
                i2 = 0;
            }
            arrayList.add(new LabelData(str, str2, valueOf, i2));
        }
        if (!(list == null || list.size() == 0)) {
            arrayList.addAll(list);
        }
        if (!(list2 == null || list2.size() == 0)) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }
}
