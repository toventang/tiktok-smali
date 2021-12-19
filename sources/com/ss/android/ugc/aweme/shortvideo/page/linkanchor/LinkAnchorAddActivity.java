package com.ss.android.ugc.aweme.shortvideo.page.linkanchor;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxCompoundIconTextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.utils.hl;
import com.ss.android.ugc.aweme.wiki.AddWikiActivity;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.v;
import h.z;

public final class LinkAnchorAddActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f129559b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public KeyListener f129560a;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f129561c = h.i.a((h.f.a.a) new k(this));

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f129562d;

    static {
        Covode.recordClassIndex(85039);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f129562d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f129562d == null) {
            this.f129562d = new SparseArray();
        }
        View view = (View) this.f129562d.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f129562d.put(i2, findViewById);
        return findViewById;
    }

    public final LinkAnchorViewModel a() {
        return (LinkAnchorViewModel) this.f129561c.getValue();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85040);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class k extends m implements h.f.a.a<LinkAnchorViewModel> {
        final /* synthetic */ LinkAnchorAddActivity this$0;

        static {
            Covode.recordClassIndex(85054);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(LinkAnchorAddActivity linkAnchorAddActivity) {
            super(0);
            this.this$0 = linkAnchorAddActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinkAnchorViewModel invoke() {
            LinkAnchorAddActivity linkAnchorAddActivity = this.this$0;
            l.d(linkAnchorAddActivity, "");
            ac a2 = ae.a(linkAnchorAddActivity, (ad.b) null).a(LinkAnchorViewModel.class);
            l.b(a2, "");
            return a2;
        }
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

    public static final class c extends com.bytedance.android.livesdk.ui.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinkAnchorAddActivity f129565a;

        static {
            Covode.recordClassIndex(85043);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(LinkAnchorAddActivity linkAnchorAddActivity) {
            this.f129565a = linkAnchorAddActivity;
        }

        @Override // com.bytedance.android.livesdk.ui.d
        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            if (charSequence != null) {
                LinkAnchorViewModel a2 = this.f129565a.a();
                String obj = charSequence.toString();
                l.d(obj, "");
                a2.f129582e = true;
                a2.f129578a.setValue(p.b((CharSequence) obj).toString());
                a2.f129579b.setValue(c.INITIAL);
            }
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinkAnchorAddActivity f129567a;

        static {
            Covode.recordClassIndex(85045);
        }

        e(LinkAnchorAddActivity linkAnchorAddActivity) {
            this.f129567a = linkAnchorAddActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f129567a.finish();
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinkAnchorAddActivity f129568a;

        static {
            Covode.recordClassIndex(85046);
        }

        f(LinkAnchorAddActivity linkAnchorAddActivity) {
            this.f129568a = linkAnchorAddActivity;
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ DmtEditText f129569a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f f129570b;

            static {
                Covode.recordClassIndex(85047);
            }

            a(DmtEditText dmtEditText, f fVar) {
                this.f129569a = dmtEditText;
                this.f129570b = fVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f129569a.setKeyListener(this.f129570b.f129568a.f129560a);
                this.f129569a.setEllipsize(null);
            }
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            DmtEditText dmtEditText = (DmtEditText) this.f129568a._$_findCachedViewById(R.id.k2);
            if (!(dmtEditText == null || dmtEditText.getKeyListener() == null)) {
                this.f129568a.f129560a = dmtEditText.getKeyListener();
                dmtEditText.setKeyListener(null);
                dmtEditText.setEllipsize(TextUtils.TruncateAt.END);
                dmtEditText.setOnClickListener(new a(dmtEditText, this));
            }
            LinkAnchorAddActivity linkAnchorAddActivity = this.f129568a;
            String value = linkAnchorAddActivity.a().f129578a.getValue();
            if (value == null) {
                value = "";
            }
            l.b(value, "");
            AddWikiActivity.a.a(linkAnchorAddActivity, value, ag.a(v.a("anchor_type", "News"), v.a("title", this.f129568a.getString(R.string.tx)), v.a("noRedirect", "true")), ag.a());
        }
    }

    static final class h<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinkAnchorAddActivity f129572a;

        static {
            Covode.recordClassIndex(85049);
        }

        h(LinkAnchorAddActivity linkAnchorAddActivity) {
            this.f129572a = linkAnchorAddActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            String str = (String) obj;
            if (str != null) {
                TuxTextView tuxTextView = (TuxTextView) this.f129572a._$_findCachedViewById(R.id.k4);
                l.b(tuxTextView, "");
                tuxTextView.setText(str);
            }
        }
    }

    static final class i<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinkAnchorAddActivity f129573a;

        static {
            Covode.recordClassIndex(85050);
        }

        i(LinkAnchorAddActivity linkAnchorAddActivity) {
            this.f129573a = linkAnchorAddActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (l.a((Object) bool, (Object) true) && bool != null) {
                bool.booleanValue();
                this.f129573a.finish();
            }
        }
    }

    static final class j extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f129574a = new j();

        static {
            Covode.recordClassIndex(85051);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f129575a);
            baseActivityViewModel2.config(AnonymousClass2.f129576a);
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity", "onCreate", true);
        activityConfiguration(j.f129574a);
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(R.layout.au);
        a().f129579b.observe(this, new b(this));
        ((DmtEditText) _$_findCachedViewById(R.id.k2)).addTextChangedListener(new c(this));
        ((DmtEditText) _$_findCachedViewById(R.id.k2)).setOnFocusChangeListener(new d(this));
        ((TuxTextView) _$_findCachedViewById(R.id.cuy)).setOnClickListener(new e(this));
        ((TuxCompoundIconTextView) _$_findCachedViewById(R.id.k5)).setOnClickListener(new f(this));
        ((LinearLayout) _$_findCachedViewById(R.id.cux)).setOnTouchListener(new g(this));
        a().f129580c.observe(this, new h(this));
        a().f129581d.observe(this, new i(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity", "onCreate", false);
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinkAnchorAddActivity f129563a;

        static {
            Covode.recordClassIndex(85041);
        }

        b(LinkAnchorAddActivity linkAnchorAddActivity) {
            this.f129563a = linkAnchorAddActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            c cVar = (c) obj;
            LinkAnchorAddActivity linkAnchorAddActivity = this.f129563a;
            TuxTextView tuxTextView = (TuxTextView) linkAnchorAddActivity._$_findCachedViewById(R.id.k4);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(8);
            TuxCompoundIconTextView tuxCompoundIconTextView = (TuxCompoundIconTextView) linkAnchorAddActivity._$_findCachedViewById(R.id.k5);
            l.b(tuxCompoundIconTextView, "");
            tuxCompoundIconTextView.setVisibility(8);
            linkAnchorAddActivity._$_findCachedViewById(R.id.k3).setBackgroundColor(androidx.core.content.b.c(linkAnchorAddActivity, R.color.b0));
            ProgressBar progressBar = (ProgressBar) linkAnchorAddActivity._$_findCachedViewById(R.id.k1);
            l.b(progressBar, "");
            progressBar.setVisibility(8);
            ImageView imageView = (ImageView) linkAnchorAddActivity._$_findCachedViewById(R.id.k0);
            l.b(imageView, "");
            imageView.setVisibility(8);
            ((TuxTextView) linkAnchorAddActivity._$_findCachedViewById(R.id.jz)).setTextColor(androidx.core.content.b.c(linkAnchorAddActivity, R.color.bz));
            ((TuxTextView) linkAnchorAddActivity._$_findCachedViewById(R.id.jz)).setOnClickListener(null);
            if (cVar != null) {
                int i2 = a.f129588a[cVar.ordinal()];
                if (i2 == 1) {
                    ProgressBar progressBar2 = (ProgressBar) this.f129563a._$_findCachedViewById(R.id.k1);
                    l.b(progressBar2, "");
                    progressBar2.setVisibility(0);
                    ImageView imageView2 = (ImageView) this.f129563a._$_findCachedViewById(R.id.k0);
                    l.b(imageView2, "");
                    imageView2.setVisibility(8);
                } else if (i2 == 2) {
                    TuxTextView tuxTextView2 = (TuxTextView) this.f129563a._$_findCachedViewById(R.id.k4);
                    l.b(tuxTextView2, "");
                    tuxTextView2.setVisibility(0);
                    this.f129563a._$_findCachedViewById(R.id.k3).setBackgroundColor(androidx.core.content.b.c(this.f129563a, R.color.bd));
                } else if (i2 == 3) {
                    TuxCompoundIconTextView tuxCompoundIconTextView2 = (TuxCompoundIconTextView) this.f129563a._$_findCachedViewById(R.id.k5);
                    l.b(tuxCompoundIconTextView2, "");
                    tuxCompoundIconTextView2.setVisibility(0);
                    ProgressBar progressBar3 = (ProgressBar) this.f129563a._$_findCachedViewById(R.id.k1);
                    l.b(progressBar3, "");
                    progressBar3.setVisibility(8);
                    ImageView imageView3 = (ImageView) this.f129563a._$_findCachedViewById(R.id.k0);
                    l.b(imageView3, "");
                    imageView3.setVisibility(0);
                    ((TuxTextView) this.f129563a._$_findCachedViewById(R.id.jz)).setTextColor(androidx.core.content.b.c(this.f129563a, R.color.bh));
                    ((TuxTextView) this.f129563a._$_findCachedViewById(R.id.jz)).setOnClickListener(new View.OnClickListener(this) {
                        /* class com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity.b.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ b f129564a;

                        static {
                            Covode.recordClassIndex(85042);
                        }

                        {
                            this.f129564a = r1;
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            LinkAnchorViewModel a2 = this.f129564a.f129563a.a();
                            if (hl.a(a2.f129578a.getValue()) && a2.f129579b.getValue() == c.VALIDATED) {
                                String b2 = new com.google.gson.f().b(ag.a(v.a("add_from", 2)));
                                int type = ab.NEWS.getTYPE();
                                l.b(b2, "");
                                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.b.a(new com.ss.android.ugc.aweme.common.a(type, b2, com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.tt), null, 1, null, null, false, a2.f129578a.getValue(), null, null, null, null, 7912, null)));
                                a2.f129581d.postValue(true);
                            }
                        }
                    });
                }
            }
        }
    }

    static final class d implements View.OnFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinkAnchorAddActivity f129566a;

        static {
            Covode.recordClassIndex(85044);
        }

        d(LinkAnchorAddActivity linkAnchorAddActivity) {
            this.f129566a = linkAnchorAddActivity;
        }

        public final void onFocusChange(View view, boolean z) {
            if (!z) {
                com.ss.android.ugc.aweme.commercialize.utils.l.b(this.f129566a, view);
            }
        }
    }

    static final class g implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinkAnchorAddActivity f129571a;

        static {
            Covode.recordClassIndex(85048);
        }

        g(LinkAnchorAddActivity linkAnchorAddActivity) {
            this.f129571a = linkAnchorAddActivity;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            LinkAnchorAddActivity linkAnchorAddActivity = this.f129571a;
            com.ss.android.ugc.aweme.commercialize.utils.l.b(linkAnchorAddActivity, linkAnchorAddActivity._$_findCachedViewById(R.id.k2));
            return true;
        }
    }
}
