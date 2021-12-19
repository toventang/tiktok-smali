package com.ss.android.ugc.aweme.profile.editprofile.pronouns.b;

import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.q;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.profile.editprofile.pronouns.views.PronounsEditText;
import com.ss.android.ugc.aweme.profile.ui.cp;
import com.ss.android.ugc.aweme.utils.hg;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.lang.reflect.Field;
import java.util.Objects;

public final class c extends cp implements ViewTreeObserver.OnGlobalLayoutListener, a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f116180d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f116181a = "";

    /* renamed from: b  reason: collision with root package name */
    public String f116182b = "";

    /* renamed from: c  reason: collision with root package name */
    public b f116183c;

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f116184f;

    public interface b {
        static {
            Covode.recordClassIndex(74948);
        }

        void a(String str);
    }

    static {
        Covode.recordClassIndex(74946);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cp, com.ss.android.ugc.aweme.profile.ui.bf
    public final View a(int i2) {
        if (this.f116184f == null) {
            this.f116184f = new SparseArray();
        }
        View view = (View) this.f116184f.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f116184f.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cp, com.ss.android.ugc.aweme.profile.ui.bf
    public final void cc_() {
        SparseArray sparseArray = this.f116184f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cp
    public final void d() {
    }

    @Override // androidx.fragment.app.d, com.ss.android.ugc.aweme.profile.ui.cp, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.profile.ui.bf
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        cc_();
    }

    public final void onGlobalLayout() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(74947);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void c() {
        k();
        ca_();
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.b
    public final /* synthetic */ b e() {
        return new b();
    }

    @Override // com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.a
    public final void b() {
        ((TuxStatusView) a(R.id.dd2)).setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.a
    public final void a() {
        TuxStatusView tuxStatusView = (TuxStatusView) a(R.id.dd2);
        tuxStatusView.setVisibility(0);
        tuxStatusView.a();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.c$c  reason: collision with other inner class name */
    static final class ViewTreeObserver$OnGlobalLayoutListenerC2965c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f116185a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f116186b;

        static {
            Covode.recordClassIndex(74949);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC2965c(c cVar, View view) {
            this.f116185a = cVar;
            this.f116186b = view;
        }

        public final void onGlobalLayout() {
            c cVar = this.f116185a;
            View view = this.f116186b;
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            ((n) com.bytedance.assem.arch.service.d.a(this.f116185a, ab.a(n.class))).b((i.a(cVar.getActivity()) - i.e(cVar.getActivity())) - rect.bottom);
        }
    }

    private final void k() {
        Context context = getContext();
        if (context != null) {
            Object a2 = a(context, "input_method");
            Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            PronounsEditText pronounsEditText = (PronounsEditText) a(R.id.dcu);
            l.b(pronounsEditText, "");
            ((InputMethodManager) a2).hideSoftInputFromWindow(pronounsEditText.getWindowToken(), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.a
    public final void a(String str) {
        l.d(str, "");
        c();
        b bVar = this.f116183c;
        if (bVar != null) {
            bVar.a(str);
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(74950);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.c(R.string.b7r, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.c.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(74951);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    this.this$0.this$0.c();
                    return z.f158842a;
                }
            });
            bVar2.b(R.string.a9e, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, z>) null);
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(74952);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.a(this.this$0, (h.f.a.b<? super com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, z>) new h.f.a.b<com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.c.e.AnonymousClass1 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(74953);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar) {
                    com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar2 = iVar;
                    l.d(iVar2, "");
                    iVar2.a(new d(this.this$0.this$0.f116181a, this.this$0.this$0.f116182b));
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.c.e.AnonymousClass2 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(74954);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    l.d(qVar2, "");
                    qVar2.a(ab.a(e.class));
                    qVar2.f25596b = new e();
                    qVar2.f25599e = (TuxNavBar) this.this$0.this$0.a(R.id.dd0);
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.c.e.AnonymousClass3 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(74955);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    l.d(qVar2, "");
                    qVar2.a(ab.a(k.class));
                    qVar2.f25596b = new k();
                    qVar2.f25599e = (LinearLayout) this.this$0.this$0.a(R.id.dd1);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.d, com.ss.android.ugc.aweme.profile.ui.cp, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f116181a = String.valueOf(arguments.getString("content_name"));
            this.f116182b = String.valueOf(arguments.getString("content_value"));
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.a
    public final void a(boolean z) {
        if (z) {
            Context context = getContext();
            if (context != null) {
                l.b(context, "");
                com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(context).a(R.string.f06).b(R.string.f05), new d(this)).a().b().show();
                return;
            }
            return;
        }
        c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        com.bytedance.assem.arch.extensions.d.a(this, new e(this));
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC2965c(this, view));
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(8751);
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
                    MethodCollector.o(8751);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        l.d(layoutInflater, "");
        androidx.fragment.app.e activity = getActivity();
        Dialog dialog = getDialog();
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        hg.a(activity, window, true);
        return com.a.a(layoutInflater, R.layout.ao9, viewGroup, false);
    }
}
