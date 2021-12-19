package com.ss.android.ugc.aweme.comment.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.core.h.v;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.h.i;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.VisualLayout;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class br extends com.ss.android.ugc.aweme.common.f.b {

    /* renamed from: b  reason: collision with root package name */
    public static final c f72595b = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public d f72596a;

    /* renamed from: c  reason: collision with root package name */
    private CommentRethinkPopup f72597c;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f72598d;

    static final class a {

        /* renamed from: c  reason: collision with root package name */
        public static final C1627a f72599c = new C1627a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        final List<b> f72600a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        final Context f72601b;

        static {
            Covode.recordClassIndex(44729);
        }

        /* renamed from: com.ss.android.ugc.aweme.comment.ui.br$a$a  reason: collision with other inner class name */
        public static final class C1627a {
            static {
                Covode.recordClassIndex(44730);
            }

            private C1627a() {
            }

            public /* synthetic */ C1627a(byte b2) {
                this();
            }
        }

        static final class b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f72602a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.bytedance.tux.widget.b f72603b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a f72604c;

            static {
                Covode.recordClassIndex(44731);
            }

            b(b bVar, com.bytedance.tux.widget.b bVar2, a aVar) {
                this.f72602a = bVar;
                this.f72603b = bVar2;
                this.f72604c = aVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                h.f.a.a<z> aVar = this.f72602a.f72607c;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }

        public a(Context context) {
            l.d(context, "");
            this.f72601b = context;
        }

        static TuxButton a(Context context) {
            TuxButton tuxButton = new TuxButton(context, null, 0, 6);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            tuxButton.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, h.g.a.a(TypedValue.applyDimension(1, 47.5f, system.getDisplayMetrics()))));
            tuxButton.setGravity(17);
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            int a2 = h.g.a.a(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            tuxButton.setPadding(a2, 0, h.g.a.a(TypedValue.applyDimension(1, 8.0f, system3.getDisplayMetrics())), 0);
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(androidx.core.content.b.c(context, R.color.f159926j)));
            stateListDrawable.addState(new int[0], new ColorDrawable(androidx.core.content.b.c(context, R.color.f159928l)));
            tuxButton.setBackground(stateListDrawable);
            return tuxButton;
        }
    }

    public interface d {
        static {
            Covode.recordClassIndex(44734);
        }

        void a();

        void b();

        void c();
    }

    static {
        Covode.recordClassIndex(44728);
    }

    public final View a(int i2) {
        if (this.f72598d == null) {
            this.f72598d = new SparseArray();
        }
        View view = (View) this.f72598d.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f72598d.put(i2, findViewById);
        return findViewById;
    }

    public static final class c {
        static {
            Covode.recordClassIndex(44733);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }

        public static br a(CommentRethinkPopup commentRethinkPopup) {
            l.d(commentRethinkPopup, "");
            br brVar = new br();
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_comment_rethink_popup", commentRethinkPopup);
            brVar.setArguments(bundle);
            return brVar;
        }
    }

    @Override // androidx.fragment.app.d, com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f72598d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ br this$0;

        static {
            Covode.recordClassIndex(44735);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(br brVar) {
            super(0);
            this.this$0 = brVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            d dVar = this.this$0.f72596a;
            if (dVar != null) {
                dVar.b();
            }
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.a<z> {
        final /* synthetic */ br this$0;

        static {
            Covode.recordClassIndex(44736);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(br brVar) {
            super(0);
            this.this$0 = brVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            d dVar = this.this$0.f72596a;
            if (dVar != null) {
                dVar.a();
            }
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.d, com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        CommentRethinkPopup commentRethinkPopup = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("key_comment_rethink_popup");
        } else {
            serializable = null;
        }
        if (serializable instanceof CommentRethinkPopup) {
            commentRethinkPopup = serializable;
        }
        this.f72597c = commentRethinkPopup;
    }

    public static final class g extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ br f72608a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentRethinkPopup f72609b;

        static {
            Covode.recordClassIndex(44737);
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            if (this.f72608a.getContext() != null) {
                TuxTextView tuxTextView = (TuxTextView) this.f72608a.a(R.id.eun);
                l.b(tuxTextView, "");
                textPaint.setColor(androidx.core.content.b.c(tuxTextView.getContext(), R.color.bx));
            }
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            l.d(view, "");
            com.ss.android.common.util.g gVar = new com.ss.android.common.util.g(this.f72609b.getLink());
            gVar.a("lang", LocalServiceImpl.a().a(this.f72608a.getActivity()));
            SmartRouter.buildRoute(this.f72608a.getActivity(), "aweme://webview/").withParam("url", gVar.a()).open();
            d dVar = this.f72608a.f72596a;
            if (dVar != null) {
                dVar.c();
            }
        }

        g(br brVar, CommentRethinkPopup commentRethinkPopup) {
            this.f72608a = brVar;
            this.f72609b = commentRethinkPopup;
        }
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog;
        Context context = getContext();
        if (context != null) {
            onCreateDialog = new Dialog(context, R.style.uu);
        } else {
            onCreateDialog = super.onCreateDialog(bundle);
            l.b(onCreateDialog, "");
        }
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.getAttributes().width = -1;
            window.getAttributes().height = -1;
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        return onCreateDialog;
    }

    @Override // com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        TuxButton a2;
        MethodCollector.i(1817);
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context == null) {
            dismiss();
            MethodCollector.o(1817);
            return;
        }
        a aVar = new a(context);
        String string = getString(R.string.f160033l);
        l.b(string, "");
        e eVar = new e(this);
        l.d(string, "");
        aVar.f72600a.add(new b(0, string, eVar));
        String string2 = getString(R.string.f160032k);
        l.b(string2, "");
        f fVar = new f(this);
        l.d(string2, "");
        aVar.f72600a.add(new b(1, string2, fVar));
        LinearLayout linearLayout = (LinearLayout) a(R.id.bp4);
        com.bytedance.tux.widget.b bVar = new com.bytedance.tux.widget.b(aVar.f72601b, (byte) 0);
        bVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        bVar.setForceVertical(false);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        bVar.setDividerLineSize(h.g.a.a(TypedValue.applyDimension(1, 0.5f, system.getDisplayMetrics())));
        bVar.setDividerLine(new ColorDrawable(androidx.core.content.b.c(bVar.getContext(), R.color.b6)));
        Context context2 = bVar.getContext();
        l.b(context2, "");
        if (i.a(context2)) {
            v.b((View) bVar, 0);
        } else {
            v.b((View) bVar, 1);
        }
        int i2 = 0;
        for (T t : aVar.f72600a) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            T t2 = t;
            if (t2.f72605a != 1) {
                a2 = a.a(aVar.f72601b);
                a2.setTextColor(androidx.core.content.b.c(a2.getContext(), R.color.bx));
                a2.setTuxFont(43);
            } else {
                a2 = a.a(aVar.f72601b);
                a2.setTextColor(androidx.core.content.b.c(a2.getContext(), R.color.c4));
                a2.setTuxFont(41);
            }
            a2.setText(t2.f72606b);
            a2.setOnClickListener(new a.b(t2, bVar, aVar));
            bVar.addView(a2);
            i2 = i3;
        }
        linearLayout.addView(bVar);
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        int a3 = h.g.a.a(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()));
        VisualLayout visualLayout = (VisualLayout) a(R.id.dqf);
        l.b(visualLayout, "");
        ViewGroup.LayoutParams layoutParams = visualLayout.getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (com.ss.android.ugc.aweme.comment.d.d.a() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((VisualLayout) a(R.id.dqf)).setRadius(a3);
            if (layoutParams2 != null) {
                int b2 = (int) com.bytedance.common.utility.n.b(getContext(), 360.0f);
                double a4 = (double) com.bytedance.common.utility.n.a(getContext());
                Double.isNaN(a4);
                int i4 = (int) (a4 * 0.8d);
                if (i4 <= b2) {
                    b2 = i4;
                }
                layoutParams2.width = b2;
                layoutParams2.gravity = 17;
                VisualLayout visualLayout2 = (VisualLayout) a(R.id.dqf);
                l.b(visualLayout2, "");
                visualLayout2.setLayoutParams(layoutParams2);
            }
            TuxTextView tuxTextView = (TuxTextView) a(R.id.bgu);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(0);
        } else {
            ((VisualLayout) a(R.id.dqf)).setTopLeftRadius(a3);
            ((VisualLayout) a(R.id.dqf)).setTopRightRadius(a3);
            if (layoutParams2 != null) {
                layoutParams2.gravity = 80;
                VisualLayout visualLayout3 = (VisualLayout) a(R.id.dqf);
                l.b(visualLayout3, "");
                visualLayout3.setLayoutParams(layoutParams2);
            }
            TuxTextView tuxTextView2 = (TuxTextView) a(R.id.bgu);
            l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(4);
            Space space = new Space(context);
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            space.setLayoutParams(new LinearLayout.LayoutParams(-1, h.g.a.a(TypedValue.applyDimension(1, 12.0f, system3.getDisplayMetrics()))));
            ((LinearLayout) a(R.id.bp4)).addView(space);
        }
        CommentRethinkPopup commentRethinkPopup = this.f72597c;
        if (commentRethinkPopup == null) {
            commentRethinkPopup = new CommentRethinkPopup(null, null, null, null, 15, null);
        }
        if (TextUtils.isEmpty(commentRethinkPopup.getTitle()) || TextUtils.isEmpty(commentRethinkPopup.getBody()) || TextUtils.isEmpty(commentRethinkPopup.getHighlight())) {
            String string3 = getString(R.string.alq);
            l.b(string3, "");
            commentRethinkPopup.setTitle(string3);
            String string4 = getString(R.string.alo);
            l.b(string4, "");
            commentRethinkPopup.setBody(string4);
            String string5 = getString(R.string.alp);
            l.b(string5, "");
            commentRethinkPopup.setHighlight(string5);
        }
        String a5 = com.a.a(commentRethinkPopup.getBody(), Arrays.copyOf(new Object[]{commentRethinkPopup.getHighlight()}, 1));
        l.b(a5, "");
        int a6 = p.a((CharSequence) a5, commentRethinkPopup.getHighlight(), 0, false, 6);
        SpannableString spannableString = new SpannableString(a5);
        if (a6 >= 0) {
            int length = commentRethinkPopup.getHighlight().length() + a6;
            spannableString.setSpan(new StyleSpan(1), a6, length, 18);
            if (!TextUtils.isEmpty(commentRethinkPopup.getLink())) {
                spannableString.setSpan(new g(this, commentRethinkPopup), a6, length, 18);
                TuxTextView tuxTextView3 = (TuxTextView) a(R.id.eun);
                l.b(tuxTextView3, "");
                tuxTextView3.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        TuxTextView tuxTextView4 = (TuxTextView) a(R.id.ev1);
        l.b(tuxTextView4, "");
        tuxTextView4.setText(commentRethinkPopup.getTitle());
        TuxTextView tuxTextView5 = (TuxTextView) a(R.id.eun);
        l.b(tuxTextView5, "");
        tuxTextView5.setText(spannableString);
        MethodCollector.o(1817);
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f72605a;

        /* renamed from: b  reason: collision with root package name */
        public final CharSequence f72606b;

        /* renamed from: c  reason: collision with root package name */
        public final h.f.a.a<z> f72607c;

        static {
            Covode.recordClassIndex(44732);
        }

        public b(int i2, CharSequence charSequence, h.f.a.a<z> aVar) {
            l.d(charSequence, "");
            this.f72605a = i2;
            this.f72606b = charSequence;
            this.f72607c = aVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        setCancelable(false);
        return com.a.a(layoutInflater, R.layout.i7, viewGroup, false);
    }
}
