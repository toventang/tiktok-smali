package com.ss.android.ugc.aweme.shortvideo.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.e.a;
import com.bytedance.tux.input.TuxRadio;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.i;
import com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.f;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.List;

public final class SelectSaveLocalOptionActivity extends com.ss.android.ugc.aweme.adaptation.b {

    /* renamed from: d  reason: collision with root package name */
    public static VideoPublishEditModel f131143d;

    /* renamed from: e  reason: collision with root package name */
    public static final List<Integer> f131144e = n.c(Integer.valueOf((int) R.string.dlu), Integer.valueOf((int) R.string.a_8), Integer.valueOf((int) R.string.a_7));

    /* renamed from: f  reason: collision with root package name */
    public static final a f131145f = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    private ButtonTitleBar f131146g;

    /* renamed from: h  reason: collision with root package name */
    private RecyclerView f131147h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f131148i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f131149j;

    /* renamed from: k  reason: collision with root package name */
    private HashMap f131150k;

    public interface b {
        static {
            Covode.recordClassIndex(85939);
        }

        void a();

        void a(int i2);

        void b();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final boolean cs_() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final View d_(int i2) {
        if (this.f131150k == null) {
            this.f131150k = new HashMap();
        }
        View view = (View) this.f131150k.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f131150k.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85937);
        }

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity$a$a  reason: collision with other inner class name */
        public static final class C3415a implements i.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Dialog f131151a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ i.b f131152b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f131153c;

            static {
                Covode.recordClassIndex(85938);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.publish.i.b
            public final void a() {
                this.f131151a.dismiss();
                this.f131152b.a();
                i.a.a("", this.f131153c, "video_post_page", "download_with_publish", "download");
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.publish.i.b
            public final void b() {
                this.f131151a.dismiss();
                this.f131152b.b();
                i.a.a("", this.f131153c, "video_post_page", "download_with_publish", "cancel");
            }

            C3415a(Dialog dialog, i.b bVar, String str) {
                this.f131151a = dialog;
                this.f131152b = bVar;
                this.f131153c = str;
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class d implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SelectSaveLocalOptionActivity f131169a;

        static {
            Covode.recordClassIndex(85945);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity.b
        public final void a() {
            this.f131169a.setResult(0);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity.b
        public final void b() {
            this.f131169a.finish();
        }

        d(SelectSaveLocalOptionActivity selectSaveLocalOptionActivity) {
            this.f131169a = selectSaveLocalOptionActivity;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity.b
        public final void a(int i2) {
            this.f131169a.setResult(-1, new Intent().putExtra("extra_save_option", i2));
        }
    }

    public static final class c extends RecyclerView.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView f131154a;

        /* renamed from: b  reason: collision with root package name */
        public final List<Integer> f131155b;

        /* renamed from: c  reason: collision with root package name */
        public int f131156c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f131157d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f131158e;

        /* renamed from: f  reason: collision with root package name */
        public final androidx.fragment.app.e f131159f;

        /* renamed from: g  reason: collision with root package name */
        public final b f131160g;

        static {
            Covode.recordClassIndex(85940);
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return a(viewGroup, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final int getItemCount() {
            List<Integer> list = this.f131155b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
            l.d(recyclerView, "");
            super.onAttachedToRecyclerView(recyclerView);
            this.f131154a = recyclerView;
        }

        public static final class a extends RecyclerView.ViewHolder {

            /* renamed from: a  reason: collision with root package name */
            public final TuxRadio f131161a;

            /* renamed from: b  reason: collision with root package name */
            public final TextView f131162b;

            /* renamed from: c  reason: collision with root package name */
            public final TextView f131163c;

            static {
                Covode.recordClassIndex(85941);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(View view) {
                super(view);
                l.d(view, "");
                View findViewById = view.findViewById(R.id.dgn);
                l.b(findViewById, "");
                this.f131161a = (TuxRadio) findViewById;
                View findViewById2 = view.findViewById(R.id.f17);
                l.b(findViewById2, "");
                this.f131162b = (TextView) findViewById2;
                View findViewById3 = view.findViewById(R.id.eyb);
                l.b(findViewById3, "");
                this.f131163c = (TextView) findViewById3;
            }
        }

        static final class b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f131164a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f131165b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a f131166c;

            static {
                Covode.recordClassIndex(85942);
            }

            b(c cVar, int i2, a aVar) {
                this.f131164a = cVar;
                this.f131165b = i2;
                this.f131166c = aVar;
            }

            public final void onClick(final View view) {
                ClickAgent.onClick(view);
                if (!this.f131164a.f131157d || !com.ss.android.ugc.aweme.shortvideo.k.a.a() || this.f131165b == 0) {
                    c cVar = this.f131164a;
                    cVar.a(this.f131165b, this.f131166c, cVar.f131160g);
                    return;
                }
                androidx.fragment.app.e eVar = this.f131164a.f131159f;
                AnonymousClass1 r4 = new i.b(this) {
                    /* class com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity.c.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f131167a;

                    static {
                        Covode.recordClassIndex(85943);
                    }

                    @Override // com.ss.android.ugc.aweme.shortvideo.publish.i.b
                    public final void b() {
                    }

                    @Override // com.ss.android.ugc.aweme.shortvideo.publish.i.b
                    public final void a() {
                        View view = view;
                        l.b(view, "");
                        view.setAlpha(1.0f);
                        this.f131167a.f131164a.a(this.f131167a.f131165b, this.f131167a.f131166c, this.f131167a.f131164a.f131160g);
                    }

                    {
                        this.f131167a = r1;
                    }
                };
                String str = "";
                l.d(eVar, str);
                l.d(r4, str);
                com.ss.android.ugc.aweme.account.model.a e2 = com.ss.android.ugc.aweme.port.in.c.u.e();
                if (e2 != null) {
                    String c2 = e2.c();
                    l.b(c2, str);
                    str = c2;
                }
                i iVar = new i();
                Dialog a2 = iVar.a(eVar);
                if (a2 != null) {
                    iVar.f129786a = new a.C3415a(a2, r4, str);
                    a2.show();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity$c$c  reason: collision with other inner class name */
        public static final class C3416c extends m implements h.f.a.m<Boolean, Boolean, z> {
            final /* synthetic */ b $callback;
            final /* synthetic */ a $holder;
            final /* synthetic */ int $position;
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(85944);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3416c(c cVar, a aVar, int i2, b bVar) {
                super(2);
                this.this$0 = cVar;
                this.$holder = aVar;
                this.$position = i2;
                this.$callback = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(Boolean bool, Boolean bool2) {
                RecyclerView.ViewHolder viewHolder;
                TuxRadio tuxRadio;
                boolean booleanValue = bool.booleanValue();
                boolean booleanValue2 = bool2.booleanValue();
                RecyclerView recyclerView = this.this$0.f131154a;
                a aVar = null;
                if (recyclerView != null) {
                    viewHolder = recyclerView.f(this.this$0.f131156c);
                } else {
                    viewHolder = null;
                }
                if (viewHolder instanceof a) {
                    aVar = viewHolder;
                }
                a aVar2 = aVar;
                if (!(aVar2 == null || (tuxRadio = aVar2.f131161a) == null)) {
                    tuxRadio.setChecked(!booleanValue2);
                }
                this.$holder.f131161a.setChecked(booleanValue2);
                if (booleanValue) {
                    this.this$0.f131156c = this.$position;
                    this.$callback.a(this.$position);
                    this.$callback.b();
                }
                return z.f158842a;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(a aVar, int i2) {
            int i3;
            boolean z;
            Integer num;
            a aVar2 = aVar;
            l.d(aVar2, "");
            TextView textView = aVar2.f131162b;
            Context a2 = com.ss.android.ugc.aweme.df.b.a();
            List<Integer> list = this.f131155b;
            if (list == null || (num = list.get(i2)) == null) {
                i3 = 0;
            } else {
                i3 = num.intValue();
            }
            textView.setText(a2.getString(i3));
            if (i2 == 2) {
                aVar2.f131163c.setText(com.ss.android.ugc.aweme.port.in.c.f115622a.getString(R.string.a_6));
                aVar2.f131163c.setVisibility(0);
            } else {
                aVar2.f131163c.setVisibility(8);
            }
            TuxRadio tuxRadio = aVar2.f131161a;
            if (this.f131156c == i2) {
                z = true;
            } else {
                z = false;
            }
            tuxRadio.setChecked(z);
            aVar2.f131161a.setClickable(false);
            if (this.f131158e && this.f131157d && com.ss.android.ugc.aweme.shortvideo.k.a.a()) {
                View view = aVar2.itemView;
                l.b(view, "");
                view.setAlpha(0.34f);
            }
            aVar2.itemView.setOnClickListener(new b(this, i2, aVar2));
        }

        private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
            boolean a2;
            MethodCollector.i(10182);
            l.d(viewGroup, "");
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ab_, viewGroup, false);
            l.b(a3, "");
            a aVar = new a(a3);
            try {
                if (aVar.itemView.getParent() != null) {
                    try {
                        a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a2) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                        com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(aVar.itemView);
                        }
                    }
                }
            } catch (Exception e2) {
                ai.a(e2);
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            gg.f143005a = aVar.getClass().getName();
            MethodCollector.o(10182);
            return aVar;
        }

        public final void a(int i2, a aVar, b bVar) {
            if (i2 >= 0 && 2 >= i2) {
                if (this.f131156c != i2) {
                    bd.a(this.f131159f, i2, SelectSaveLocalOptionActivity.f131143d, null, new C3416c(this, aVar, i2, bVar));
                    return;
                }
                bVar.a();
                bVar.b();
            }
        }

        public c(List<Integer> list, int i2, boolean z, boolean z2, androidx.fragment.app.e eVar, b bVar) {
            l.d(eVar, "");
            l.d(bVar, "");
            this.f131155b = list;
            this.f131156c = i2;
            this.f131157d = z;
            this.f131158e = z2;
            this.f131159f = eVar;
            this.f131160g = bVar;
        }
    }

    public final void finish() {
        super.finish();
        if (!SettingsManager.a().a("enable_high_quality_video", false)) {
            overridePendingTransition(R.anim.o, R.anim.f159863m);
        }
    }

    static {
        Covode.recordClassIndex(85936);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
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

    public static final class e implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SelectSaveLocalOptionActivity f131170a;

        static {
            Covode.recordClassIndex(85946);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(SelectSaveLocalOptionActivity selectSaveLocalOptionActivity) {
            this.f131170a = selectSaveLocalOptionActivity;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            this.f131170a.onBackPressed();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public final void onCreate(Bundle bundle) {
        int i2;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f131148i = getIntent().getBooleanExtra("mute_download", false);
        this.f131149j = getIntent().getBooleanExtra("download_gray_tag", false);
        a.C1099a.a(this).a(R.color.f159928l).d(R.color.f159928l).a(true).f44923a.d();
        setContentView(R.layout.ah6);
        View findViewById = findViewById(R.id.em8);
        l.b(findViewById, "");
        ButtonTitleBar buttonTitleBar = (ButtonTitleBar) findViewById;
        this.f131146g = buttonTitleBar;
        if (buttonTitleBar == null) {
            l.a("mTitleBar");
        }
        ViewGroup.LayoutParams layoutParams = buttonTitleBar.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = com.ss.android.ugc.aweme.df.n.a();
        }
        View findViewById2 = findViewById(R.id.dr2);
        l.b(findViewById2, "");
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        this.f131147h = recyclerView;
        if (recyclerView == null) {
            l.a("mRv");
        }
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        if (f.a("android.permission.WRITE_EXTERNAL_STORAGE")) {
            i2 = getIntent().getIntExtra("extra_save_option", 0);
        } else {
            i2 = 0;
        }
        recyclerView.setAdapter(new c(f131144e, i2, this.f131148i, this.f131149j, this, new d(this)));
        ButtonTitleBar buttonTitleBar2 = this.f131146g;
        if (buttonTitleBar2 == null) {
            l.a("mTitleBar");
        }
        buttonTitleBar2.setOnTitleBarClickListener(new e(this));
        if (!SettingsManager.a().a("enable_high_quality_video", false)) {
            ButtonTitleBar buttonTitleBar3 = this.f131146g;
            if (buttonTitleBar3 == null) {
                l.a("mTitleBar");
            }
            buttonTitleBar3.getStartBtn().setImageResource(2131232478);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity", "onCreate", false);
    }
}
