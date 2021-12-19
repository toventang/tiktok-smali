package com.ss.android.ugc.aweme.share.more.a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.c.c.ab;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.service.c.k;
import com.ss.android.ugc.aweme.share.more.b.b;
import com.ss.android.ugc.aweme.share.more.ui.ShareActionVerticalList;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.bar.ShareActionBar;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.ss.android.ugc.aweme.sharer.ui.f;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.utils.fc;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;
import java.util.Objects;

public final class a extends com.google.android.material.bottomsheet.b implements com.ss.android.ugc.aweme.sharer.ui.bar.c {

    /* renamed from: b  reason: collision with root package name */
    public static final C3229a f124111b = new C3229a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final e f124112a;

    /* renamed from: c  reason: collision with root package name */
    private SparseArray f124113c;

    static {
        Covode.recordClassIndex(81512);
    }

    private View a(int i2) {
        if (this.f124113c == null) {
            this.f124113c = new SparseArray();
        }
        View view = (View) this.f124113c.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f124113c.put(i2, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.more.a.a$a  reason: collision with other inner class name */
    public static final class C3229a {
        static {
            Covode.recordClassIndex(81513);
        }

        private C3229a() {
        }

        public /* synthetic */ C3229a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(81516);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f124113c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        if (isVisible()) {
            dismissAllowingStateLoss();
        }
        super.onPause();
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f124114a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f124115b;

        static {
            Covode.recordClassIndex(81514);
        }

        b(View view, a aVar) {
            this.f124114a = view;
            this.f124115b = aVar;
        }

        public final void run() {
            ViewParent parent = this.f124114a.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
            ViewGroup.LayoutParams layoutParams = ((View) parent).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            CoordinatorLayout.b bVar = ((CoordinatorLayout.e) layoutParams).f2100a;
            Objects.requireNonNull(bVar, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<android.view.View!>");
            BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) bVar;
            bottomSheetBehavior.b((int) (((float) n.b(this.f124114a.getContext())) * this.f124115b.f124112a.p));
            bottomSheetBehavior.o = new BottomSheetBehavior.a(this) {
                /* class com.ss.android.ugc.aweme.share.more.a.a.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f124116a;

                /* renamed from: b  reason: collision with root package name */
                private int f124117b = -1;

                static {
                    Covode.recordClassIndex(81515);
                }

                @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
                public final void a(View view, float f2) {
                    l.d(view, "");
                }

                {
                    this.f124116a = r2;
                }

                @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
                public final void a(View view, int i2) {
                    l.d(view, "");
                    if (i2 != 3) {
                        if (i2 == 5) {
                            this.f124116a.f124115b.dismiss();
                        }
                    } else if (this.f124117b == 2) {
                        r.a("slide_up_full_screen_show", ab.of("action_on", "more_board"));
                    }
                    this.f124117b = i2;
                }
            };
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        View findViewById;
        ViewGroup.LayoutParams layoutParams;
        super.onStart();
        View view = getView();
        if (view != null) {
            view.post(new b(view, this));
        }
        Dialog dialog = getDialog();
        if (dialog != null && (findViewById = dialog.findViewById(R.id.akq)) != null && (layoutParams = findViewById.getLayoutParams()) != null) {
            layoutParams.height = -1;
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f124118a;

        static {
            Covode.recordClassIndex(81517);
        }

        d(a aVar) {
            this.f124118a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f124118a.dismiss();
        }
    }

    public a(e eVar) {
        l.d(eVar, "");
        this.f124112a = eVar;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        ViewParent viewParent;
        super.onActivityCreated(bundle);
        View view = getView();
        View view2 = null;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof View) {
            view2 = viewParent;
        }
        View view3 = view2;
        if (view3 != null) {
            view3.setBackgroundColor(0);
        }
    }

    @Override // androidx.fragment.app.d, com.google.android.material.bottomsheet.b, androidx.appcompat.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        l.b(onCreateDialog, "");
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.c9);
            window.clearFlags(2);
        }
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.d
    public final void onDismiss(DialogInterface dialogInterface) {
        f fVar;
        Context context = getContext();
        if (!(context == null || (fVar = this.f124112a.f124660l) == null)) {
            SharePackage sharePackage = this.f124112a.f124657i;
            l.b(context, "");
            fVar.a(sharePackage, context);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.bar.c
    public final void a(h hVar) {
        l.d(hVar, "");
        Context context = getContext();
        if (context != null) {
            l.b(context, "");
            if (!this.f124112a.f124657i.a(hVar, context)) {
                Context requireContext = requireContext();
                l.b(requireContext, "");
                hVar.a(requireContext, this.f124112a.f124657i);
            }
            f fVar = this.f124112a.f124660l;
            if (fVar != null) {
                SharePackage sharePackage = this.f124112a.f124657i;
                Context requireContext2 = requireContext();
                l.b(requireContext2, "");
                fVar.a(hVar, sharePackage, requireContext2);
            }
            if (hVar.f()) {
                dismiss();
            } else if (hVar.e()) {
                dismiss();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.ss.android.ugc.aweme.share.more.b.b bVar;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            fc.a(activity);
        }
        TuxTextView tuxTextView = (TuxTextView) a(R.id.cnp);
        Context context = tuxTextView.getContext();
        l.b(context, "");
        tuxTextView.setText(context.getResources().getText(R.string.d5u));
        tuxTextView.setTextColor(androidx.core.content.b.c(tuxTextView.getContext(), this.f124112a.f124654f));
        tuxTextView.setAlpha(this.f124112a.f124655g);
        tuxTextView.setVisibility(0);
        if (k.d()) {
            bVar = b.C3230b.f124121a;
        } else {
            bVar = b.a.f124119a;
        }
        List<h> a2 = bVar.a(this.f124112a.f124650b);
        if ((!a2.isEmpty()) && a2 != null) {
            View a3 = a(R.id.cnz);
            l.b(a3, "");
            ViewGroup.LayoutParams layoutParams = a3.getLayoutParams();
            layoutParams.height = (int) n.b(requireContext(), 8.0f);
            View a4 = a(R.id.cnz);
            l.b(a4, "");
            a4.setLayoutParams(layoutParams);
            ShareActionBar shareActionBar = (ShareActionBar) a(R.id.coa);
            l.b(shareActionBar, "");
            shareActionBar.setVisibility(0);
            ((ShareActionBar) a(R.id.coa)).a(a2);
            ((ShareActionBar) a(R.id.coa)).a(this);
        }
        ((ShareActionVerticalList) a(R.id.cod)).a(bVar.b(this.f124112a.f124650b));
        e eVar = this.f124112a;
        Context requireContext = requireContext();
        l.b(requireContext, "");
        ((ShareActionVerticalList) a(R.id.cod)).a(eVar, requireContext, new c(this));
        ((TuxIconView) a(R.id.cny)).setOnClickListener(new d(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.i(12366);
        l.d(layoutInflater, "");
        View inflate = View.inflate(getContext(), R.layout.azl, viewGroup);
        MethodCollector.o(12366);
        return inflate;
    }
}
