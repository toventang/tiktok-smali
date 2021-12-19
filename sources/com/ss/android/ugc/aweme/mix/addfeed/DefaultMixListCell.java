package com.ss.android.ugc.aweme.mix.addfeed;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.af;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.q;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment;
import com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel;
import com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM;
import com.ss.android.ugc.aweme.util.h;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import java.lang.reflect.Field;
import java.util.Objects;

public final class DefaultMixListCell extends PowerCell<b> implements com.bytedance.jedi.arch.q {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f109750a = {new h.f.b.y(DefaultMixListCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/mix/addfeed/IMixFeedControl;", 0)};
    public static final p r = new p((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public EditText f109751b;

    /* renamed from: j  reason: collision with root package name */
    View f109752j;

    /* renamed from: k  reason: collision with root package name */
    LinearLayout f109753k;

    /* renamed from: l  reason: collision with root package name */
    public TuxSpinner f109754l;

    /* renamed from: m  reason: collision with root package name */
    public ImageView f109755m;
    TextView n;
    public com.ss.android.ugc.aweme.util.h o;
    public b p;
    public int q = 25;
    private TuxTextView s;
    private final h.h.d t = new o(this);
    private final com.bytedance.assem.arch.viewModel.b u;

    public static final class g extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.mix.editname.a, com.ss.android.ugc.aweme.mix.editname.a> {
        public static final g INSTANCE = new g();

        static {
            Covode.recordClassIndex(70269);
        }

        public g() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.mix.editname.a invoke(com.ss.android.ugc.aweme.mix.editname.a aVar) {
            h.f.b.l.c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(70262);
    }

    public final c a() {
        return (c) this.t.a(this, f109750a[0]);
    }

    public final EditPlayListNameEditTextVM b() {
        return (EditPlayListNameEditTextVM) this.u.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class p {
        static {
            Covode.recordClassIndex(70278);
        }

        private p() {
        }

        public /* synthetic */ p(byte b2) {
            this();
        }
    }

    static final class t extends h.f.b.m implements h.f.a.a<h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f109758a = new t();

        static {
            Covode.recordClassIndex(70282);
        }

        t() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ h.z invoke() {
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final com.bytedance.jedi.arch.v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(70264);
        }

        public b() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.mix.editname.a>> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(70265);
        }

        public c() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.mix.editname.a> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.mix.editname.a>> {
        public static final h INSTANCE = new h();

        static {
            Covode.recordClassIndex(70270);
        }

        public h() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.mix.editname.a> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final k INSTANCE = new k();

        static {
            Covode.recordClassIndex(70273);
        }

        public k() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class l extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.mix.editname.a>> {
        public static final l INSTANCE = new l();

        static {
            Covode.recordClassIndex(70274);
        }

        public l() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.mix.editname.a> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class y implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DefaultMixListCell f109765a;

        static {
            Covode.recordClassIndex(70287);
        }

        y(DefaultMixListCell defaultMixListCell) {
            this.f109765a = defaultMixListCell;
        }

        public final void run() {
            DefaultMixListCell.c(this.f109765a).setVisibility(8);
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(70263);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.core.a> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(70266);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.core.a invoke() {
            if (this.$this_assemViewModel.i() instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i2 = this.$this_assemViewModel.i();
                if (i2 != null) {
                    return (com.bytedance.assem.arch.core.a) i2;
                }
                throw new h.w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<af> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(70267);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final af invoke() {
            if (this.$this_assemViewModel.i() instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i2 = this.$this_assemViewModel.i();
                if (i2 != null) {
                    return ((com.bytedance.assem.arch.core.a) i2).getViewModelStore();
                }
                throw new h.w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.a<ad.b> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(70268);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final ad.b invoke() {
            if (this.$this_assemViewModel.i() instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i2 = this.$this_assemViewModel.i();
                if (i2 != null) {
                    return ((com.bytedance.assem.arch.core.a) i2).q();
                }
                throw new h.w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.a<androidx.lifecycle.m> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(70271);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final androidx.lifecycle.m invoke() {
            View view = this.$this_assemViewModel.itemView;
            h.f.b.l.a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof androidx.fragment.app.e) {
                View view2 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    return (androidx.fragment.app.e) context2;
                }
                throw new h.w("null cannot be cast to non-null type");
            } else if (context instanceof ContextWrapper) {
                View view3 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view3, "");
                Context context3 = view3.getContext();
                if (context3 != null) {
                    Context baseContext = ((ContextWrapper) context3).getBaseContext();
                    if (baseContext != null) {
                        return (androidx.fragment.app.e) baseContext;
                    }
                    throw new h.w("null cannot be cast to non-null type");
                }
                throw new h.w("null cannot be cast to non-null type");
            } else {
                StringBuilder sb = new StringBuilder("can not convert ");
                View view4 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
        }
    }

    public static final class j extends h.f.b.m implements h.f.a.a<af> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(70272);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final af invoke() {
            androidx.fragment.app.e eVar;
            View view = this.$this_assemViewModel.itemView;
            h.f.b.l.a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof androidx.fragment.app.e) {
                View view2 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    eVar = (androidx.fragment.app.e) context2;
                } else {
                    throw new h.w("null cannot be cast to non-null type");
                }
            } else if (context instanceof ContextThemeWrapper) {
                View view3 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view3, "");
                Context context3 = view3.getContext();
                if (context3 != null) {
                    Context baseContext = ((ContextThemeWrapper) context3).getBaseContext();
                    if (baseContext != null) {
                        eVar = (androidx.fragment.app.e) baseContext;
                    } else {
                        throw new h.w("null cannot be cast to non-null type");
                    }
                } else {
                    throw new h.w("null cannot be cast to non-null type");
                }
            } else {
                StringBuilder sb = new StringBuilder("can not convert ");
                View view4 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
            af viewModelStore = eVar.getViewModelStore();
            h.f.b.l.a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    public static final class m extends h.f.b.m implements h.f.a.a<androidx.lifecycle.m> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(70275);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final androidx.lifecycle.m invoke() {
            androidx.lifecycle.m i2 = this.$this_assemViewModel.i();
            if (i2 instanceof Fragment) {
                androidx.lifecycle.m i3 = this.$this_assemViewModel.i();
                if (i3 != null) {
                    return (Fragment) i3;
                }
                throw new h.w("null cannot be cast to non-null type");
            } else if (i2 instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i4 = this.$this_assemViewModel.i();
                if (i4 != null) {
                    Fragment a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) ((com.bytedance.assem.arch.core.a) i4));
                    if (a2 != null) {
                        return a2;
                    }
                    throw new IllegalStateException("can not find fragment.");
                }
                throw new h.w("null cannot be cast to non-null type");
            } else {
                throw new IllegalStateException("can not find fragment.");
            }
        }
    }

    public static final class n extends h.f.b.m implements h.f.a.a<af> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(70276);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final af invoke() {
            Fragment a2;
            af viewModelStore;
            androidx.lifecycle.m i2 = this.$this_assemViewModel.i();
            if (i2 instanceof Fragment) {
                androidx.lifecycle.m i3 = this.$this_assemViewModel.i();
                if (i3 != null) {
                    a2 = (Fragment) i3;
                } else {
                    throw new h.w("null cannot be cast to non-null type");
                }
            } else if (i2 instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i4 = this.$this_assemViewModel.i();
                if (i4 != null) {
                    a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) ((com.bytedance.assem.arch.core.a) i4));
                } else {
                    throw new h.w("null cannot be cast to non-null type");
                }
            } else {
                throw new IllegalStateException("can not find fragment.");
            }
            if (a2 != null && (viewModelStore = a2.getViewModelStore()) != null) {
                return viewModelStore;
            }
            throw new IllegalStateException("can not get viewModelStore due to null fragment.");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class z implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DefaultMixListCell f109766a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f109767b;

        static {
            Covode.recordClassIndex(70288);
        }

        z(DefaultMixListCell defaultMixListCell, boolean z) {
            this.f109766a = defaultMixListCell;
            this.f109767b = z;
        }

        public final void run() {
            View view = this.f109766a.itemView;
            h.f.b.l.b(view, "");
            InputMethodManager inputMethodManager = (InputMethodManager) a(view.getContext(), "input_method");
            DefaultMixListCell.b(this.f109766a).setFocusable(this.f109767b);
            DefaultMixListCell.b(this.f109766a).setFocusableInTouchMode(this.f109767b);
            if (this.f109767b) {
                DefaultMixListCell.b(this.f109766a).requestFocus();
                DefaultMixListCell.b(this.f109766a).setSelection(DefaultMixListCell.b(this.f109766a).getText().toString().length());
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(DefaultMixListCell.b(this.f109766a), 2);
                }
            } else if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(DefaultMixListCell.b(this.f109766a).getWindowToken(), 0);
            }
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(1832);
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
                        MethodCollector.o(1832);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    public final void c() {
        View view = this.f109752j;
        if (view == null) {
            h.f.b.l.a("inputLine");
        }
        View view2 = this.itemView;
        h.f.b.l.b(view2, "");
        view.setBackground(view2.getResources().getDrawable(R.color.b0));
        LinearLayout linearLayout = this.f109753k;
        if (linearLayout == null) {
            h.f.b.l.a("errorHint");
        }
        linearLayout.setVisibility(8);
        TuxSpinner tuxSpinner = this.f109754l;
        if (tuxSpinner == null) {
            h.f.b.l.a("loading");
        }
        tuxSpinner.postDelayed(new y(this), 300);
        ImageView imageView = this.f109755m;
        if (imageView == null) {
            h.f.b.l.a("delete");
        }
        imageView.setVisibility(0);
        TextView textView = this.n;
        if (textView == null) {
            h.f.b.l.a("errorHintText");
        }
        View view3 = this.itemView;
        h.f.b.l.b(view3, "");
        textView.setText(view3.getContext().getText(R.string.drh));
    }

    public final void e() {
        b bVar = this.p;
        if (bVar == null) {
            h.f.b.l.a("defaultMixListItem");
        }
        if (bVar.f109771c) {
            b bVar2 = this.p;
            if (bVar2 == null) {
                h.f.b.l.a("defaultMixListItem");
            }
            View view = this.itemView;
            h.f.b.l.b(view, "");
            DmtEditText dmtEditText = (DmtEditText) view.findViewById(R.id.ajc);
            h.f.b.l.b(dmtEditText, "");
            bVar2.f109736e = String.valueOf(dmtEditText.getText());
            c a2 = a();
            if (a2 != null) {
                View view2 = this.itemView;
                h.f.b.l.b(view2, "");
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view2.findViewById(R.id.aj6);
                h.f.b.l.b(appCompatCheckBox, "");
                boolean isChecked = appCompatCheckBox.isChecked();
                b bVar3 = this.p;
                if (bVar3 == null) {
                    h.f.b.l.a("defaultMixListItem");
                }
                a2.a(new AddFeedToMixFragment.e(isChecked, bVar3.f109736e));
            }
        }
    }

    public static final class q implements h.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DefaultMixListCell f109757a;

        static {
            Covode.recordClassIndex(70279);
        }

        @Override // com.ss.android.ugc.aweme.util.h.a
        public final void a() {
            if (h.f.b.l.a((Object) DefaultMixListCell.b(this.f109757a).getText().toString(), (Object) "")) {
                DefaultMixListCell.c(this.f109757a).setVisibility(8);
                DefaultMixListCell.d(this.f109757a).setVisibility(8);
                DefaultMixListCell.e(this.f109757a).f109771c = false;
                this.f109757a.b(false);
                return;
            }
            String obj = DefaultMixListCell.b(this.f109757a).getText().toString();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            if (h.m.p.b((CharSequence) obj).toString().length() == 0) {
                this.f109757a.c();
                DefaultMixListCell.e(this.f109757a).f109771c = false;
                this.f109757a.b(false);
            } else if (DefaultMixListCell.b(this.f109757a).getText().toString().length() > this.f109757a.q) {
                DefaultMixListCell.e(this.f109757a).f109771c = false;
                this.f109757a.b(false);
            } else {
                DefaultMixListCell.c(this.f109757a).setVisibility(0);
                DefaultMixListCell.d(this.f109757a).setVisibility(8);
                this.f109757a.b().a(DefaultMixListCell.b(this.f109757a).getText().toString());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        q(DefaultMixListCell defaultMixListCell) {
            this.f109757a = defaultMixListCell;
        }
    }

    public DefaultMixListCell() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.a aVar = i.a.f25718a;
        h.k.c a2 = ab.a(EditPlayListNameEditTextVM.class);
        a aVar2 = new a(a2);
        g gVar = g.INSTANCE;
        if (h.f.b.l.a(aVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, h.INSTANCE, new i(this), new j(this), k.INSTANCE, gVar);
        } else if (h.f.b.l.a(aVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, l.INSTANCE, new m(this), new n(this), b.INSTANCE, gVar);
        } else if (aVar == null || h.f.b.l.a(aVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, c.INSTANCE, new d(this), new e(this), new f(this), gVar);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope: " + aVar + " there");
        }
        this.u = bVar;
    }

    public final void d() {
        String str;
        a.C0730a aVar = new a.C0730a();
        EditText editText = this.f109751b;
        if (editText == null) {
            h.f.b.l.a("editText");
        }
        a.C0730a a2 = aVar.a(String.valueOf(editText.getText().length()));
        if (gb.a()) {
            str = "‏\\";
        } else {
            str = "‎/";
        }
        com.bytedance.ies.dmt.ui.d.a aVar2 = a2.a(str).a(String.valueOf(this.q)).f33382a;
        EditText editText2 = this.f109751b;
        if (editText2 == null) {
            h.f.b.l.a("editText");
        }
        if (editText2.getText().length() > this.q) {
            View view = this.itemView;
            h.f.b.l.b(view, "");
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(view.getResources().getColor(R.color.bd));
            EditText editText3 = this.f109751b;
            if (editText3 == null) {
                h.f.b.l.a("editText");
            }
            aVar2.setSpan(foregroundColorSpan, 0, String.valueOf(editText3.getText().length()).length() + 1, 33);
            TuxTextView tuxTextView = this.s;
            if (tuxTextView == null) {
                h.f.b.l.a("lengthHint");
            }
            tuxTextView.setText(aVar2);
            LinearLayout linearLayout = this.f109753k;
            if (linearLayout == null) {
                h.f.b.l.a("errorHint");
            }
            linearLayout.setVisibility(0);
            TextView textView = this.n;
            if (textView == null) {
                h.f.b.l.a("errorHintText");
            }
            View view2 = this.itemView;
            h.f.b.l.b(view2, "");
            textView.setText(view2.getContext().getText(R.string.abq));
            View view3 = this.f109752j;
            if (view3 == null) {
                h.f.b.l.a("inputLine");
            }
            View view4 = this.itemView;
            h.f.b.l.b(view4, "");
            view3.setBackground(view4.getResources().getDrawable(R.color.bd));
            b(false);
            return;
        }
        TuxTextView tuxTextView2 = this.s;
        if (tuxTextView2 == null) {
            h.f.b.l.a("lengthHint");
        }
        tuxTextView2.setText(aVar2);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void k() {
        super.k();
        this.q = com.ss.android.ugc.aweme.mix.f.a.a();
        this.o = new com.ss.android.ugc.aweme.util.h(1000, new q(this));
        View view = this.itemView;
        h.f.b.l.b(view, "");
        DmtEditText dmtEditText = (DmtEditText) view.findViewById(R.id.ajc);
        h.f.b.l.b(dmtEditText, "");
        this.f109751b = dmtEditText;
        View view2 = this.itemView;
        h.f.b.l.b(view2, "");
        TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.ajh);
        h.f.b.l.b(tuxTextView, "");
        this.s = tuxTextView;
        View view3 = this.itemView;
        h.f.b.l.b(view3, "");
        View findViewById = view3.findViewById(R.id.aji);
        h.f.b.l.b(findViewById, "");
        this.f109752j = findViewById;
        View view4 = this.itemView;
        h.f.b.l.b(view4, "");
        LinearLayout linearLayout = (LinearLayout) view4.findViewById(R.id.ajg);
        h.f.b.l.b(linearLayout, "");
        this.f109753k = linearLayout;
        View view5 = this.itemView;
        h.f.b.l.b(view5, "");
        TuxSpinner tuxSpinner = (TuxSpinner) view5.findViewById(R.id.ajk);
        h.f.b.l.b(tuxSpinner, "");
        this.f109754l = tuxSpinner;
        View view6 = this.itemView;
        h.f.b.l.b(view6, "");
        ImageView imageView = (ImageView) view6.findViewById(R.id.ajb);
        h.f.b.l.b(imageView, "");
        this.f109755m = imageView;
        View view7 = this.itemView;
        h.f.b.l.b(view7, "");
        TuxTextView tuxTextView2 = (TuxTextView) view7.findViewById(R.id.ajf);
        h.f.b.l.b(tuxTextView2, "");
        this.n = tuxTextView2;
        EditText editText = this.f109751b;
        if (editText == null) {
            h.f.b.l.a("editText");
        }
        editText.addTextChangedListener(new w(this));
        d();
        c();
        AssemViewModel.a(b(), a.f109768a, null, new s(this), t.f109758a, new r(this), 2);
        ImageView imageView2 = this.f109755m;
        if (imageView2 == null) {
            h.f.b.l.a("delete");
        }
        imageView2.setVisibility(0);
        ImageView imageView3 = this.f109755m;
        if (imageView3 == null) {
            h.f.b.l.a("delete");
        }
        imageView3.setOnClickListener(new x(this));
    }

    public static final class o implements h.h.d<Object, c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PowerCell f109756a;

        static {
            Covode.recordClassIndex(70277);
        }

        public o(PowerCell powerCell) {
            this.f109756a = powerCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
            if (r0 == null) goto L_0x004b;
         */
        @Override // h.h.d
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.ss.android.ugc.aweme.mix.addfeed.c a(java.lang.Object r6, h.k.i r7) {
            /*
            // Method dump skipped, instructions count: 149
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell.o.a(java.lang.Object, h.k.i):java.lang.Object");
        }
    }

    public static final class w implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DefaultMixListCell f109763a;

        static {
            Covode.recordClassIndex(70285);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        w(DefaultMixListCell defaultMixListCell) {
            this.f109763a = defaultMixListCell;
        }

        public final void afterTextChanged(Editable editable) {
            this.f109763a.c();
            this.f109763a.d();
            DefaultMixListCell.a(this.f109763a).a();
            DefaultMixListCell.a(this.f109763a).b();
        }
    }

    static final class x implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DefaultMixListCell f109764a;

        static {
            Covode.recordClassIndex(70286);
        }

        x(DefaultMixListCell defaultMixListCell) {
            this.f109764a = defaultMixListCell;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            DefaultMixListCell.b(this.f109764a).setText("");
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.util.h a(DefaultMixListCell defaultMixListCell) {
        com.ss.android.ugc.aweme.util.h hVar = defaultMixListCell.o;
        if (hVar == null) {
            h.f.b.l.a("timer");
        }
        return hVar;
    }

    public static final /* synthetic */ EditText b(DefaultMixListCell defaultMixListCell) {
        EditText editText = defaultMixListCell.f109751b;
        if (editText == null) {
            h.f.b.l.a("editText");
        }
        return editText;
    }

    public static final /* synthetic */ TuxSpinner c(DefaultMixListCell defaultMixListCell) {
        TuxSpinner tuxSpinner = defaultMixListCell.f109754l;
        if (tuxSpinner == null) {
            h.f.b.l.a("loading");
        }
        return tuxSpinner;
    }

    public static final /* synthetic */ ImageView d(DefaultMixListCell defaultMixListCell) {
        ImageView imageView = defaultMixListCell.f109755m;
        if (imageView == null) {
            h.f.b.l.a("delete");
        }
        return imageView;
    }

    public static final /* synthetic */ b e(DefaultMixListCell defaultMixListCell) {
        b bVar = defaultMixListCell.p;
        if (bVar == null) {
            h.f.b.l.a("defaultMixListItem");
        }
        return bVar;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.akp, viewGroup, false);
        h.f.b.l.b(a2, "");
        return a2;
    }

    static final class s extends h.f.b.m implements h.f.a.b<Throwable, h.z> {
        final /* synthetic */ DefaultMixListCell this$0;

        static {
            Covode.recordClassIndex(70281);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(DefaultMixListCell defaultMixListCell) {
            super(1);
            this.this$0 = defaultMixListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Throwable th) {
            h.f.b.l.d(th, "");
            DefaultMixListCell.e(this.this$0).f109771c = false;
            DefaultMixListCell.c(this.this$0).setVisibility(8);
            DefaultMixListCell.d(this.this$0).setVisibility(0);
            View view = this.this$0.itemView;
            h.f.b.l.b(view, "");
            new com.bytedance.tux.g.b(view).e(R.string.g21).b();
            return h.z.f158842a;
        }
    }

    public final void b(boolean z2) {
        c a2 = a();
        if (a2 != null) {
            a2.a(new AddFeedToMixFragment.a(z2));
        }
    }

    static final class u implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DefaultMixListCell f109759a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f109760b;

        static {
            Covode.recordClassIndex(70283);
        }

        u(DefaultMixListCell defaultMixListCell, b bVar) {
            this.f109759a = defaultMixListCell;
            this.f109760b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.CheckBox");
            CheckBox checkBox = (CheckBox) view;
            if (!checkBox.isChecked()) {
                GetMixListViewModel getMixListViewModel = (GetMixListViewModel) PowerCell.b(this.f109759a, GetMixListViewModel.class);
                if (getMixListViewModel == null || !getMixListViewModel.f109781j) {
                    checkBox.setChecked(!checkBox.isChecked());
                    return;
                }
                GetMixListViewModel getMixListViewModel2 = (GetMixListViewModel) PowerCell.b(this.f109759a, GetMixListViewModel.class);
                if (getMixListViewModel2 != null) {
                    getMixListViewModel2.a(-1, (AddFeedToMixFragment.d) null);
                }
            }
            this.f109759a.e();
            this.f109759a.a(this.f109760b.f109770b);
            this.f109759a.b(this.f109760b.f109771c);
            c a2 = this.f109759a.a();
            if (a2 != null) {
                a2.a(new AddFeedToMixFragment.f(checkBox.isChecked(), this.f109760b.f109769a, this.f109759a.getAdapterPosition(), this.f109760b));
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(b bVar) {
        int i2;
        b bVar2 = bVar;
        h.f.b.l.d(bVar2, "");
        this.p = bVar2;
        View view = this.itemView;
        h.f.b.l.b(view, "");
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view.findViewById(R.id.aj6);
        h.f.b.l.b(appCompatCheckBox, "");
        appCompatCheckBox.setChecked(bVar2.f109770b);
        View view2 = this.itemView;
        h.f.b.l.b(view2, "");
        View findViewById = view2.findViewById(R.id.cun);
        h.f.b.l.b(findViewById, "");
        if (bVar2.f109770b) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
        a(bVar2.f109770b);
        b(bVar2.f109771c);
        e();
        View view3 = this.itemView;
        h.f.b.l.b(view3, "");
        ((TuxIconView) view3.findViewById(R.id.ajj)).setBackgroundResource(2131233213);
        View view4 = this.itemView;
        h.f.b.l.b(view4, "");
        ((AppCompatCheckBox) view4.findViewById(R.id.aj6)).setOnClickListener(new u(this, bVar2));
        this.itemView.setOnClickListener(new v(this, bVar2));
    }

    static final class r extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.mix.api.response.a, h.z> {
        final /* synthetic */ DefaultMixListCell this$0;

        static {
            Covode.recordClassIndex(70280);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(DefaultMixListCell defaultMixListCell) {
            super(1);
            this.this$0 = defaultMixListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.mix.api.response.a aVar) {
            CharSequence charSequence;
            boolean z;
            com.ss.android.ugc.aweme.mix.api.response.a aVar2 = aVar;
            if (DefaultMixListCell.a(this.this$0).c()) {
                if (aVar2 == null || !aVar2.f109795c) {
                    DefaultMixListCell defaultMixListCell = this.this$0;
                    if (aVar2 != null) {
                        charSequence = aVar2.f109796d;
                    } else {
                        charSequence = null;
                    }
                    View view = defaultMixListCell.f109752j;
                    if (view == null) {
                        h.f.b.l.a("inputLine");
                    }
                    View view2 = defaultMixListCell.itemView;
                    h.f.b.l.b(view2, "");
                    view.setBackground(view2.getResources().getDrawable(R.color.bd));
                    LinearLayout linearLayout = defaultMixListCell.f109753k;
                    if (linearLayout == null) {
                        h.f.b.l.a("errorHint");
                    }
                    linearLayout.setVisibility(0);
                    ImageView imageView = defaultMixListCell.f109755m;
                    if (imageView == null) {
                        h.f.b.l.a("delete");
                    }
                    imageView.setVisibility(0);
                    TextView textView = defaultMixListCell.n;
                    if (textView == null) {
                        h.f.b.l.a("errorHintText");
                    }
                    if (TextUtils.isEmpty(charSequence)) {
                        View view3 = defaultMixListCell.itemView;
                        h.f.b.l.b(view3, "");
                        charSequence = view3.getContext().getText(R.string.drh);
                    }
                    textView.setText(charSequence);
                    this.this$0.b(false);
                    DefaultMixListCell.e(this.this$0).f109771c = false;
                } else {
                    DefaultMixListCell defaultMixListCell2 = this.this$0;
                    EditText editText = defaultMixListCell2.f109751b;
                    if (editText == null) {
                        h.f.b.l.a("editText");
                    }
                    Editable text = editText.getText();
                    h.f.b.l.b(text, "");
                    if (text.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        EditText editText2 = defaultMixListCell2.f109751b;
                        if (editText2 == null) {
                            h.f.b.l.a("editText");
                        }
                        if (editText2.getText().length() <= defaultMixListCell2.q) {
                            b bVar = defaultMixListCell2.p;
                            if (bVar == null) {
                                h.f.b.l.a("defaultMixListItem");
                            }
                            bVar.f109771c = true;
                            defaultMixListCell2.b(true);
                            this.this$0.e();
                        }
                    }
                    b bVar2 = defaultMixListCell2.p;
                    if (bVar2 == null) {
                        h.f.b.l.a("defaultMixListItem");
                    }
                    bVar2.f109771c = false;
                    defaultMixListCell2.b(false);
                    this.this$0.e();
                }
            }
            DefaultMixListCell.c(this.this$0).setVisibility(8);
            DefaultMixListCell.d(this.this$0).setVisibility(0);
            return h.z.f158842a;
        }
    }

    static final class v implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DefaultMixListCell f109761a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f109762b;

        static {
            Covode.recordClassIndex(70284);
        }

        v(DefaultMixListCell defaultMixListCell, b bVar) {
            this.f109761a = defaultMixListCell;
            this.f109762b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            View view2 = this.f109761a.itemView;
            h.f.b.l.b(view2, "");
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view2.findViewById(R.id.aj6);
            h.f.b.l.b(appCompatCheckBox, "");
            if (appCompatCheckBox.isChecked()) {
                GetMixListViewModel getMixListViewModel = (GetMixListViewModel) PowerCell.b(this.f109761a, GetMixListViewModel.class);
                if (getMixListViewModel != null && getMixListViewModel.f109781j) {
                    GetMixListViewModel getMixListViewModel2 = (GetMixListViewModel) PowerCell.b(this.f109761a, GetMixListViewModel.class);
                    if (getMixListViewModel2 != null) {
                        getMixListViewModel2.a(-1, (AddFeedToMixFragment.d) null);
                    }
                } else {
                    return;
                }
            }
            View view3 = this.f109761a.itemView;
            h.f.b.l.b(view3, "");
            AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) view3.findViewById(R.id.aj6);
            h.f.b.l.b(appCompatCheckBox2, "");
            View view4 = this.f109761a.itemView;
            h.f.b.l.b(view4, "");
            AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) view4.findViewById(R.id.aj6);
            h.f.b.l.b(appCompatCheckBox3, "");
            appCompatCheckBox2.setChecked(true ^ appCompatCheckBox3.isChecked());
            this.f109761a.e();
            this.f109761a.a(this.f109762b.f109770b);
            this.f109761a.b(this.f109762b.f109771c);
            c a2 = this.f109761a.a();
            if (a2 != null) {
                View view5 = this.f109761a.itemView;
                h.f.b.l.b(view5, "");
                AppCompatCheckBox appCompatCheckBox4 = (AppCompatCheckBox) view5.findViewById(R.id.aj6);
                h.f.b.l.b(appCompatCheckBox4, "");
                a2.a(new AddFeedToMixFragment.f(appCompatCheckBox4.isChecked(), this.f109762b.f109769a, this.f109761a.getAdapterPosition(), this.f109762b));
            }
        }
    }

    public final void a(boolean z2) {
        EditText editText = this.f109751b;
        if (editText == null) {
            h.f.b.l.a("editText");
        }
        editText.postDelayed(new z(this, z2), 300);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends com.bytedance.jedi.arch.af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
