package com.ss.android.ugc.aweme.compliance.business.commentfilter.ui;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.router.SmartRouter;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.ss.android.ugc.aweme.fe.a.e;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.m.p;
import h.z;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class a extends FrameLayout implements u<com.ss.android.ugc.aweme.arch.widgets.base.b>, com.ss.android.ugc.aweme.setting.serverpush.b.c {

    /* renamed from: d  reason: collision with root package name */
    public static final C1762a f76880d = new C1762a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.fe.a.e f76881a = e.a.f91018a;

    /* renamed from: b  reason: collision with root package name */
    public final String f76882b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f76883c;

    /* renamed from: e  reason: collision with root package name */
    private int f76884e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f76885f;

    /* renamed from: g  reason: collision with root package name */
    private int f76886g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f76887h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f76888i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f76889j = h.i.a((h.f.a.a) new j(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f76890k = h.i.a((h.f.a.a) new k(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h f76891l = h.i.a((h.f.a.a) l.f76905a);

    /* renamed from: m  reason: collision with root package name */
    private final h.h f76892m = h.i.a((h.f.a.a) new i(this));
    private SparseArray n;

    static {
        Covode.recordClassIndex(47522);
    }

    private final int getLayout() {
        return R.layout.tz;
    }

    private final com.ss.android.ugc.aweme.common.c<com.ss.android.ugc.aweme.common.b<com.ss.android.ugc.aweme.setting.serverpush.a.f>, com.ss.android.ugc.aweme.setting.serverpush.b.c> getMPushSettingPresenter() {
        return (com.ss.android.ugc.aweme.common.c) this.f76890k.getValue();
    }

    public final View a(int i2) {
        if (this.n == null) {
            this.n = new SparseArray();
        }
        View view = (View) this.n.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.n.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.c
    public final void a(Exception exc) {
    }

    public final DataCenter getMDataCenter() {
        return (DataCenter) this.f76892m.getValue();
    }

    public final com.ss.android.ugc.aweme.compliance.business.commentfilter.api.a getMModel() {
        return (com.ss.android.ugc.aweme.compliance.business.commentfilter.api.a) this.f76889j.getValue();
    }

    public final com.ss.android.ugc.aweme.compliance.common.d.a getMUserSettingChangePresenter() {
        return (com.ss.android.ugc.aweme.compliance.common.d.a) this.f76891l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.ui.a$a  reason: collision with other inner class name */
    public static final class C1762a {
        static {
            Covode.recordClassIndex(47523);
        }

        private C1762a() {
        }

        public /* synthetic */ C1762a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(47524);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            this.this$0.f76883c = true;
            return z.f158842a;
        }
    }

    public static final class g extends InputFilter.LengthFilter {
        static {
            Covode.recordClassIndex(47531);
        }

        g() {
            super(30);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.compliance.common.d.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f76905a = new l();

        static {
            Covode.recordClassIndex(47536);
        }

        l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.compliance.common.d.a invoke() {
            return new com.ss.android.ugc.aweme.compliance.common.d.a();
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.compliance.business.commentfilter.api.a> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(47534);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.compliance.business.commentfilter.api.a invoke() {
            return new com.ss.android.ugc.aweme.compliance.business.commentfilter.api.a(this.this$0.getMDataCenter());
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.common.c<com.ss.android.ugc.aweme.common.b<com.ss.android.ugc.aweme.setting.serverpush.a.f>, com.ss.android.ugc.aweme.setting.serverpush.b.c>> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(47535);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.common.c<com.ss.android.ugc.aweme.common.b<com.ss.android.ugc.aweme.setting.serverpush.a.f>, com.ss.android.ugc.aweme.setting.serverpush.b.c> invoke() {
            com.ss.android.ugc.aweme.common.c<com.ss.android.ugc.aweme.common.b<com.ss.android.ugc.aweme.setting.serverpush.a.f>, com.ss.android.ugc.aweme.setting.serverpush.b.c> providePushSettingFetchPresenter = com.ss.android.ugc.aweme.setting.services.f.f122672a.providePushSettingFetchPresenter();
            providePushSettingFetchPresenter.a_(this.this$0);
            return providePushSettingFetchPresenter;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<DataCenter> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(47533);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DataCenter invoke() {
            Context context = this.this$0.getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ad a2 = ae.a((androidx.fragment.app.e) context, (ad.b) null);
            Context context2 = this.this$0.getContext();
            Objects.requireNonNull(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return DataCenter.a(a2, (androidx.fragment.app.e) context2).a("list_keywords", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.this$0);
        }
    }

    public final void clearFocus() {
        super.clearFocus();
        DmtEditText dmtEditText = (DmtEditText) a(R.id.hg);
        if (dmtEditText != null) {
            dmtEditText.clearFocus();
        }
        Object a2 = a(getContext(), "input_method");
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) a2).hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public final void a() {
        CommonItemView commonItemView = (CommonItemView) a(R.id.a_b);
        h.f.b.l.b(commonItemView, "");
        if (commonItemView.d()) {
            View a2 = a(R.id.ass);
            h.f.b.l.b(a2, "");
            a2.setVisibility(0);
            DmtEditText dmtEditText = (DmtEditText) a(R.id.hg);
            h.f.b.l.b(dmtEditText, "");
            dmtEditText.setVisibility(0);
            TagMaxHeightRecyclerView tagMaxHeightRecyclerView = (TagMaxHeightRecyclerView) a(R.id.c3u);
            h.f.b.l.b(tagMaxHeightRecyclerView, "");
            tagMaxHeightRecyclerView.setVisibility(0);
            TagMaxHeightRecyclerView tagMaxHeightRecyclerView2 = (TagMaxHeightRecyclerView) a(R.id.c3u);
            RecyclerView.i layoutManager = tagMaxHeightRecyclerView2.getLayoutManager();
            FlexboxLayoutManager flexboxLayoutManager = layoutManager;
            if (layoutManager == null) {
                FlexboxLayoutManager flexboxLayoutManager2 = new FlexboxLayoutManager(tagMaxHeightRecyclerView2.getContext());
                flexboxLayoutManager2.m();
                flexboxLayoutManager2.b(0);
                flexboxLayoutManager2.n();
                int i2 = flexboxLayoutManager2.f49617c;
                flexboxLayoutManager = flexboxLayoutManager2;
                if (i2 != 0) {
                    flexboxLayoutManager2.f49617c = 0;
                    flexboxLayoutManager2.o();
                    flexboxLayoutManager = flexboxLayoutManager2;
                }
            }
            tagMaxHeightRecyclerView2.setLayoutManager(flexboxLayoutManager);
            RecyclerView.a adapter = tagMaxHeightRecyclerView2.getAdapter();
            if (adapter == null) {
                Context context = tagMaxHeightRecyclerView2.getContext();
                h.f.b.l.b(context, "");
                adapter = new com.ss.android.ugc.aweme.compliance.business.commentfilter.a.a(context, new b(this));
            }
            tagMaxHeightRecyclerView2.setAdapter(adapter);
            return;
        }
        View a3 = a(R.id.ass);
        h.f.b.l.b(a3, "");
        a3.setVisibility(8);
        DmtEditText dmtEditText2 = (DmtEditText) a(R.id.hg);
        h.f.b.l.b(dmtEditText2, "");
        dmtEditText2.setVisibility(8);
        TagMaxHeightRecyclerView tagMaxHeightRecyclerView3 = (TagMaxHeightRecyclerView) a(R.id.c3u);
        h.f.b.l.b(tagMaxHeightRecyclerView3, "");
        tagMaxHeightRecyclerView3.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        int i2;
        String str;
        List<String> list;
        if (this.f76888i && this.f76883c) {
            RecyclerView recyclerView = (RecyclerView) a(R.id.c3u);
            h.f.b.l.b(recyclerView, "");
            RecyclerView.a adapter = recyclerView.getAdapter();
            if (!(adapter instanceof com.ss.android.ugc.aweme.compliance.business.commentfilter.a.a)) {
                adapter = null;
            }
            com.ss.android.ugc.aweme.compliance.business.commentfilter.a.a aVar = (com.ss.android.ugc.aweme.compliance.business.commentfilter.a.a) adapter;
            boolean z = true;
            if (aVar == null || (list = aVar.f76857a) == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (T t : list) {
                    T t2 = t;
                    Objects.requireNonNull(t2, "null cannot be cast to non-null type kotlin.CharSequence");
                    if (!h.f.b.l.a((Object) p.c((CharSequence) t2).toString(), (Object) "")) {
                        arrayList2.add(t);
                    }
                }
                ArrayList<String> arrayList3 = arrayList2;
                ArrayList arrayList4 = new ArrayList(n.a((Iterable) arrayList3, 10));
                for (String str2 : arrayList3) {
                    Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.CharSequence");
                    arrayList4.add(p.b((CharSequence) str2).toString());
                }
                arrayList = arrayList4;
            }
            if (!(arrayList instanceof ArrayList)) {
                arrayList = null;
            }
            ArrayList arrayList5 = arrayList;
            if (arrayList5 != null) {
                com.ss.android.ugc.aweme.compliance.business.commentfilter.api.a mModel = getMModel();
                String b2 = new com.google.gson.f().b(arrayList5);
                h.f.b.l.b(b2, "");
                h.f.b.l.d(b2, "");
                b.i<BaseResponse> commentFilterKeywords = mModel.a().setCommentFilterKeywords(b2);
                h.f.b.l.b(commentFilterKeywords, "");
                commentFilterKeywords.a(new m(this, arrayList5), b.i.f4826c, null);
            }
            CommonItemView commonItemView = (CommonItemView) a(R.id.a_b);
            h.f.b.l.b(commonItemView, "");
            if (commonItemView.d() && arrayList5 != null && arrayList5.size() == 0) {
                CommonItemView commonItemView2 = (CommonItemView) a(R.id.a_b);
                h.f.b.l.b(commonItemView2, "");
                CommonItemView commonItemView3 = (CommonItemView) a(R.id.a_b);
                h.f.b.l.b(commonItemView3, "");
                commonItemView2.setChecked(!commonItemView3.d());
            }
            com.ss.android.ugc.aweme.fe.a.e eVar = this.f76881a;
            String str3 = "comment_filter_status_" + this.f76882b;
            CommonItemView commonItemView4 = (CommonItemView) a(R.id.a_b);
            h.f.b.l.b(commonItemView4, "");
            if (commonItemView4.d()) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            eVar.b(str3, Integer.valueOf(i2));
            CommonItemView commonItemView5 = (CommonItemView) a(R.id.a_b);
            h.f.b.l.b(commonItemView5, "");
            if (commonItemView5.d()) {
                str = "filter_on";
            } else {
                str = "filter_off";
            }
            CommonItemView commonItemView6 = (CommonItemView) a(R.id.a_b);
            h.f.b.l.b(commonItemView6, "");
            boolean d2 = commonItemView6.d();
            if (this.f76884e != 1) {
                z = false;
            }
            if (d2 != z) {
                r.a(str, new com.ss.android.ugc.aweme.app.f.d().f66730a);
            }
        }
        super.onDetachedFromWindow();
    }

    static final class m<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f76906a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f76907b;

        static {
            Covode.recordClassIndex(47537);
        }

        m(a aVar, ArrayList arrayList) {
            this.f76906a = aVar;
            this.f76907b = arrayList;
        }

        /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.ui.a$m$a  reason: collision with other inner class name */
        static final class C1763a extends h.f.b.m implements h.f.a.b<String, z> {
            final /* synthetic */ m this$0;

            static {
                Covode.recordClassIndex(47539);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1763a(m mVar) {
                super(1);
                this.this$0 = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(String str) {
                String str2 = str;
                h.f.b.l.d(str2, "");
                if (com.bytedance.x.c.c.a(str2)) {
                    str2 = this.this$0.f76906a.getContext().getString(R.string.akr);
                    h.f.b.l.b(str2, "");
                }
                Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
                if (j2 == null) {
                    return null;
                }
                new com.bytedance.tux.g.b(j2).a(R.style.o1).a().a(str2).b();
                return z.f158842a;
            }
        }

        @Override // b.g
        public final Object then(b.i<BaseResponse> iVar) {
            String errorMsg;
            final C1763a aVar = new C1763a(this);
            String str = "";
            h.f.b.l.b(iVar, str);
            if (iVar.b() || iVar.c()) {
                Exception e2 = iVar.e();
                if (!(e2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
                    e2 = null;
                }
                com.ss.android.ugc.aweme.base.api.a.b.a aVar2 = (com.ss.android.ugc.aweme.base.api.a.b.a) e2;
                if (!(aVar2 == null || (errorMsg = aVar2.getErrorMsg()) == null)) {
                    str = errorMsg;
                }
                aVar.invoke(str);
            } else if (iVar.a()) {
                if (iVar.d().status_code != 0) {
                    String str2 = iVar.d().status_msg;
                    h.f.b.l.b(str2, str);
                    aVar.invoke(str2);
                } else {
                    CommonItemView commonItemView = (CommonItemView) this.f76906a.a(R.id.a_b);
                    h.f.b.l.b(commonItemView, str);
                    if (!commonItemView.d() || this.f76907b.size() != 0) {
                        CommonItemView commonItemView2 = (CommonItemView) this.f76906a.a(R.id.a_b);
                        h.f.b.l.b(commonItemView2, str);
                        if (commonItemView2.d()) {
                            Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
                            if (j2 != null) {
                                new com.bytedance.tux.g.b(j2).a(R.style.o1).a().e(R.string.aks).b();
                            }
                        }
                    }
                    this.f76906a.getMUserSettingChangePresenter().a("comment_filter_status", 2, new com.ss.android.ugc.aweme.compliance.common.d.d(this) {
                        /* class com.ss.android.ugc.aweme.compliance.business.commentfilter.ui.a.m.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ m f76908a;

                        static {
                            Covode.recordClassIndex(47538);
                        }

                        @Override // com.ss.android.ugc.aweme.compliance.common.d.d
                        public final void a() {
                            Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
                            if (j2 != null) {
                                new com.bytedance.tux.g.b(j2).a(R.style.o1).a().e(R.string.aks).b();
                            }
                            this.f76908a.f76906a.f76881a.b("settings_times_" + this.f76908a.f76906a.f76882b, "1");
                            this.f76908a.f76906a.f76881a.b("not_now_times_" + this.f76908a.f76906a.f76882b, "2");
                        }

                        @Override // com.ss.android.ugc.aweme.compliance.common.d.d
                        public final void a(String str) {
                            h.f.b.l.d(str, "");
                            aVar.invoke(str);
                        }

                        {
                            this.f76908a = r1;
                        }
                    });
                }
                return null;
            }
            return null;
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommonItemView f76893a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f76894b;

        static {
            Covode.recordClassIndex(47525);
        }

        c(CommonItemView commonItemView, a aVar) {
            this.f76893a = commonItemView;
            this.f76894b = aVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            this.f76894b.f76883c = true;
            CommonItemView commonItemView = this.f76893a;
            h.f.b.l.b(commonItemView, "");
            CommonItemView commonItemView2 = this.f76893a;
            h.f.b.l.b(commonItemView2, "");
            commonItemView.setChecked(true ^ commonItemView2.d());
            CommonItemView commonItemView3 = this.f76893a;
            h.f.b.l.b(commonItemView3, "");
            if (commonItemView3.d()) {
                str = "manual_filter_on";
            } else {
                str = "manual_filter_off";
            }
            r.a(str, new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "comment_filters").f66730a);
            this.f76894b.a();
            CommonItemView commonItemView4 = this.f76893a;
            h.f.b.l.b(commonItemView4, "");
            if (commonItemView4.d() && this.f76894b.getMDataCenter().a("list_keywords") == null) {
                this.f76894b.getMModel().b();
            }
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommonItemView f76899a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f76900b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Boolean f76901c;

        static {
            Covode.recordClassIndex(47528);
        }

        e(CommonItemView commonItemView, a aVar, Boolean bool) {
            this.f76899a = commonItemView;
            this.f76900b = aVar;
            this.f76901c = bool;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            this.f76900b.f76883c = true;
            CommonItemView commonItemView = this.f76899a;
            h.f.b.l.b(commonItemView, "");
            CommonItemView commonItemView2 = this.f76899a;
            h.f.b.l.b(commonItemView2, "");
            commonItemView.setChecked(true ^ commonItemView2.d());
            CommonItemView commonItemView3 = this.f76899a;
            h.f.b.l.b(commonItemView3, "");
            boolean d2 = commonItemView3.d();
            CommonItemView commonItemView4 = this.f76899a;
            h.f.b.l.b(commonItemView4, "");
            if (commonItemView4.d()) {
                str = "all_filter_on_ck";
            } else {
                str = "all_filter_off_ck";
            }
            r.a(str, new com.ss.android.ugc.aweme.app.f.d().f66730a);
            this.f76900b.getMUserSettingChangePresenter().a("author_review_all_comments", d2 ? 1 : 0, new com.ss.android.ugc.aweme.compliance.common.d.d(this) {
                /* class com.ss.android.ugc.aweme.compliance.business.commentfilter.ui.a.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f76902a;

                static {
                    Covode.recordClassIndex(47529);
                }

                @Override // com.ss.android.ugc.aweme.compliance.common.d.d
                public final void a() {
                    new com.bytedance.tux.g.b(this.f76902a.f76900b).e(R.string.aks).b();
                }

                {
                    this.f76902a = r1;
                }

                @Override // com.ss.android.ugc.aweme.compliance.common.d.d
                public final void a(String str) {
                    h.f.b.l.d(str, "");
                    CommonItemView commonItemView = this.f76902a.f76899a;
                    h.f.b.l.b(commonItemView, "");
                    CommonItemView commonItemView2 = this.f76902a.f76899a;
                    h.f.b.l.b(commonItemView2, "");
                    commonItemView.setChecked(!commonItemView2.d());
                    CommonItemView commonItemView3 = this.f76902a.f76899a;
                    h.f.b.l.b(commonItemView3, "");
                    this.f76902a.f76900b.f76881a.b("author_review_all_comments_" + this.f76902a.f76900b.f76882b, Boolean.valueOf(commonItemView3.d()));
                    com.bytedance.tux.g.b bVar = new com.bytedance.tux.g.b(this.f76902a.f76900b);
                    if (com.bytedance.x.c.c.a(str)) {
                        str = this.f76902a.f76899a.getContext().getString(R.string.akr);
                        h.f.b.l.b(str, "");
                    }
                    bVar.a(str).b();
                }
            });
            CommonItemView commonItemView5 = this.f76899a;
            h.f.b.l.b(commonItemView5, "");
            this.f76900b.f76881a.b("author_review_all_comments_" + this.f76900b.f76882b, Boolean.valueOf(commonItemView5.d()));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        List<String> list;
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = bVar;
        com.ss.android.ugc.aweme.compliance.business.commentfilter.a.a aVar = null;
        if (bVar2 != null) {
            list = (List) bVar2.a();
        } else {
            list = null;
        }
        if (h.f.b.ad.c(list) && list != null) {
            RecyclerView recyclerView = (RecyclerView) a(R.id.c3u);
            h.f.b.l.b(recyclerView, "");
            RecyclerView.a adapter = recyclerView.getAdapter();
            if (adapter instanceof com.ss.android.ugc.aweme.compliance.business.commentfilter.a.a) {
                aVar = adapter;
            }
            com.ss.android.ugc.aweme.compliance.business.commentfilter.a.a aVar2 = aVar;
            if (aVar2 != null) {
                h.f.b.l.d(list, "");
                aVar2.f76857a = list;
            }
            RecyclerView recyclerView2 = (RecyclerView) a(R.id.c3u);
            h.f.b.l.b(recyclerView2, "");
            RecyclerView.a adapter2 = recyclerView2.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyDataSetChanged();
            }
            this.f76888i = true;
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommonItemView f76895a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o f76896b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f76897c;

        static {
            Covode.recordClassIndex(47526);
        }

        d(CommonItemView commonItemView, o oVar, a aVar) {
            this.f76895a = commonItemView;
            this.f76896b = oVar;
            this.f76897c = aVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            o oVar = this.f76896b;
            int i2 = 1;
            if (oVar == null || oVar.getShowType() != 1) {
                this.f76897c.f76883c = true;
                CommonItemView commonItemView = this.f76895a;
                h.f.b.l.b(commonItemView, "");
                CommonItemView commonItemView2 = this.f76895a;
                h.f.b.l.b(commonItemView2, "");
                commonItemView.setChecked(!commonItemView2.d());
                CommonItemView commonItemView3 = this.f76895a;
                h.f.b.l.b(commonItemView3, "");
                if (!commonItemView3.d()) {
                    i2 = 2;
                }
                this.f76897c.getMUserSettingChangePresenter().a("comment_offensive_filter", i2, new com.ss.android.ugc.aweme.compliance.common.d.d(this) {
                    /* class com.ss.android.ugc.aweme.compliance.business.commentfilter.ui.a.d.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ d f76898a;

                    static {
                        Covode.recordClassIndex(47527);
                    }

                    @Override // com.ss.android.ugc.aweme.compliance.common.d.d
                    public final void a() {
                        new com.bytedance.tux.g.b(this.f76898a.f76897c).e(R.string.aks).b();
                    }

                    {
                        this.f76898a = r1;
                    }

                    @Override // com.ss.android.ugc.aweme.compliance.common.d.d
                    public final void a(String str) {
                        h.f.b.l.d(str, "");
                        CommonItemView commonItemView = this.f76898a.f76895a;
                        h.f.b.l.b(commonItemView, "");
                        CommonItemView commonItemView2 = this.f76898a.f76895a;
                        h.f.b.l.b(commonItemView2, "");
                        int i2 = 1;
                        commonItemView.setChecked(!commonItemView2.d());
                        com.ss.android.ugc.aweme.fe.a.e eVar = this.f76898a.f76897c.f76881a;
                        String str2 = "comment_offensive_filter_" + this.f76898a.f76897c.f76882b;
                        CommonItemView commonItemView3 = this.f76898a.f76895a;
                        h.f.b.l.b(commonItemView3, "");
                        if (!commonItemView3.d()) {
                            i2 = 2;
                        }
                        eVar.b(str2, Integer.valueOf(i2));
                        com.bytedance.tux.g.b bVar = new com.bytedance.tux.g.b(this.f76898a.f76897c);
                        if (com.bytedance.x.c.c.a(str)) {
                            str = this.f76898a.f76895a.getContext().getString(R.string.akr);
                            h.f.b.l.b(str, "");
                        }
                        bVar.a(str).b();
                    }
                });
                this.f76897c.f76881a.b("comment_offensive_filter_" + this.f76897c.f76882b, Integer.valueOf(i2));
                CommonItemView commonItemView4 = this.f76895a;
                h.f.b.l.b(commonItemView4, "");
                if (commonItemView4.d()) {
                    str = "ai_filter_on";
                } else {
                    str = "ai_filter_off";
                }
                r.a(str, new com.ss.android.ugc.aweme.app.f.d().f66730a);
            } else if (this.f76896b.getResType() == 1) {
                CommonItemView commonItemView5 = this.f76895a;
                h.f.b.l.b(commonItemView5, "");
                new com.bytedance.tux.g.b(commonItemView5).e(R.string.fn6).b();
            }
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommonItemView f76903a;

        static {
            Covode.recordClassIndex(47530);
        }

        f(CommonItemView commonItemView) {
            this.f76903a = commonItemView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            ArrayList arrayList = new ArrayList();
            View rootView = this.f76903a.getRootView();
            h.f.b.l.b(rootView, "");
            CommonItemView commonItemView = (CommonItemView) rootView.findViewById(R.id.a_a);
            h.f.b.l.b(commonItemView, "");
            if (commonItemView.d()) {
                arrayList.add("all");
            }
            View rootView2 = this.f76903a.getRootView();
            h.f.b.l.b(rootView2, "");
            CommonItemView commonItemView2 = (CommonItemView) rootView2.findViewById(R.id.a__);
            h.f.b.l.b(commonItemView2, "");
            if (commonItemView2.d()) {
                arrayList.add("ai");
            }
            View rootView3 = this.f76903a.getRootView();
            h.f.b.l.b(rootView3, "");
            CommonItemView commonItemView3 = (CommonItemView) rootView3.findViewById(R.id.a_b);
            h.f.b.l.b(commonItemView3, "");
            if (commonItemView3.d()) {
                arrayList.add("keyword");
            }
            r.a("filtered_comment_review_bysetting_ck", dVar.a("filters_condition", arrayList).f66730a);
            SmartRouter.buildRoute(this.f76903a.getContext(), "//webview").withParam("url", "https://www.tiktok.com/inapp/filtered_comments/posts?enable_report_optimization=1").withParam("hide_nav_bar", true).open();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.setting.serverpush.a.f r6) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.commentfilter.ui.a.a(com.ss.android.ugc.aweme.setting.serverpush.a.f):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x01f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r13) {
        /*
        // Method dump skipped, instructions count: 602
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.commentfilter.ui.a.<init>(android.content.Context):void");
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(5405);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(5405);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    static final class h implements TextView.OnEditorActionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f76904a;

        static {
            Covode.recordClassIndex(47532);
        }

        h(a aVar) {
            this.f76904a = aVar;
        }

        public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            boolean z;
            if (i2 == 6) {
                DmtEditText dmtEditText = (DmtEditText) this.f76904a.a(R.id.hg);
                h.f.b.l.b(dmtEditText, "");
                if (String.valueOf(dmtEditText.getText()).length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    RecyclerView recyclerView = (RecyclerView) this.f76904a.a(R.id.c3u);
                    h.f.b.l.b(recyclerView, "");
                    RecyclerView.a adapter = recyclerView.getAdapter();
                    Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.business.commentfilter.adapter.KeyWordTagAdapter");
                    if (((com.ss.android.ugc.aweme.compliance.business.commentfilter.a.a) adapter).f76857a.size() >= 50) {
                        ((DmtEditText) this.f76904a.a(R.id.hg)).clearFocus();
                        new com.bytedance.tux.g.b(this.f76904a).e(R.string.akl).b();
                        r.a("keyword_filter_add_failed_ck", new com.ss.android.ugc.aweme.app.f.d().a("failed_reason", "over").f66730a);
                        return false;
                    }
                    RecyclerView recyclerView2 = (RecyclerView) this.f76904a.a(R.id.c3u);
                    h.f.b.l.b(recyclerView2, "");
                    RecyclerView.a adapter2 = recyclerView2.getAdapter();
                    Objects.requireNonNull(adapter2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.business.commentfilter.adapter.KeyWordTagAdapter");
                    com.ss.android.ugc.aweme.compliance.business.commentfilter.a.a aVar = (com.ss.android.ugc.aweme.compliance.business.commentfilter.a.a) adapter2;
                    DmtEditText dmtEditText2 = (DmtEditText) this.f76904a.a(R.id.hg);
                    h.f.b.l.b(dmtEditText2, "");
                    String valueOf = String.valueOf(dmtEditText2.getText());
                    h.f.b.l.d(valueOf, "");
                    aVar.f76859c.invoke();
                    r.a("keyword_filter_add_ck", new com.ss.android.ugc.aweme.app.f.d().a("keyword", valueOf).f66730a);
                    aVar.f76857a.add(0, valueOf);
                    aVar.notifyItemInserted(0);
                    aVar.notifyItemRangeChanged(1, aVar.getItemCount());
                    ((DmtEditText) this.f76904a.a(R.id.hg)).clearFocus();
                    ((DmtEditText) this.f76904a.a(R.id.hg)).setText("");
                } else {
                    ((DmtEditText) this.f76904a.a(R.id.hg)).clearFocus();
                    r.a("keyword_filter_add_failed_ck", new com.ss.android.ugc.aweme.app.f.d().a("failed_reason", "null").f66730a);
                    new com.bytedance.tux.g.b(this.f76904a).e(R.string.akp).b();
                }
            }
            return false;
        }
    }
}
