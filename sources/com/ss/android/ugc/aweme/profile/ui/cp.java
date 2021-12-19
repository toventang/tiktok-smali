package com.ss.android.ugc.aweme.profile.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.f;
import com.bytedance.tux.navigation.a.g;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Objects;

public abstract class cp extends bf {
    public static final a q = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private SparseArray f117073a;
    public TuxNavBar o;
    protected TextView p;

    static {
        Covode.recordClassIndex(75597);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.bf
    public View a(int i2) {
        if (this.f117073a == null) {
            this.f117073a = new SparseArray();
        }
        View view = (View) this.f117073a.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f117073a.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.bf
    public void cc_() {
        SparseArray sparseArray = this.f117073a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void d();

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.profile.ui.bf
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        cc_();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75598);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class d implements com.bytedance.tux.navigation.a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cp f117076a;

        static {
            Covode.recordClassIndex(75601);
        }

        @Override // com.bytedance.tux.navigation.a.d
        public final void a() {
            this.f117076a.ca_();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(cp cpVar) {
            this.f117076a = cpVar;
        }
    }

    /* access modifiers changed from: protected */
    public final TextView g() {
        TextView textView = this.p;
        if (textView == null) {
            l.a("mEditLengthHint");
        }
        return textView;
    }

    public final void h() {
        TuxNavBar tuxNavBar = this.o;
        if (tuxNavBar != null) {
            tuxNavBar.a("save", c.f117075a);
        }
    }

    public final void i() {
        TuxNavBar tuxNavBar = this.o;
        if (tuxNavBar != null) {
            tuxNavBar.a("save", b.f117074a);
        }
    }

    public boolean ca_() {
        Dialog dialog;
        if (getDialog() != null && (dialog = getDialog()) != null && dialog.isShowing() && isResumed()) {
            try {
                dismiss();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final com.bytedance.tux.navigation.a.c j() {
        com.bytedance.tux.navigation.a.e a2 = new com.bytedance.tux.navigation.a.e().a((Object) "cancel");
        String string = getString(R.string.a7u);
        l.b(string, "");
        return a2.a(string).a(f.SECONDARY).a((com.bytedance.tux.navigation.a.d) new d(this));
    }

    /* access modifiers changed from: protected */
    public final void a(TextView textView) {
        l.d(textView, "");
        this.p = textView;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<com.bytedance.tux.navigation.a.c, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f117074a = new b();

        static {
            Covode.recordClassIndex(75599);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.navigation.a.c cVar) {
            com.bytedance.tux.navigation.a.c cVar2 = cVar;
            l.d(cVar2, "");
            ((com.bytedance.tux.navigation.a.e) cVar2).f45203c = false;
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<com.bytedance.tux.navigation.a.c, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f117075a = new c();

        static {
            Covode.recordClassIndex(75600);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.navigation.a.c cVar) {
            com.bytedance.tux.navigation.a.c cVar2 = cVar;
            l.d(cVar2, "");
            ((com.bytedance.tux.navigation.a.e) cVar2).f45203c = true;
            return z.f158842a;
        }
    }

    protected static g b(String str) {
        l.d(str, "");
        return new g().a(str).a((Object) "title");
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i2;
        super.onCreate(bundle);
        if (gb.a()) {
            i2 = R.style.a01;
        } else {
            i2 = R.style.a00;
        }
        setStyle(1, i2);
    }

    @Override // androidx.fragment.app.d
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        l.b(onCreateDialog, "");
        onCreateDialog.setOnKeyListener(new e(this));
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(4);
        }
        return onCreateDialog;
    }

    protected static boolean a(EditText editText, int i2) {
        l.d(editText, "");
        Editable text = editText.getText();
        if (text.length() <= i2) {
            return false;
        }
        int selectionEnd = Selection.getSelectionEnd(text);
        String obj = text.toString();
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
        String substring = obj.substring(0, i2);
        l.b(substring, "");
        editText.setText(substring);
        Editable text2 = editText.getText();
        if (selectionEnd > text2.length()) {
            selectionEnd = text2.length();
        }
        Selection.setSelection(text2, selectionEnd);
        return true;
    }

    static final class e implements DialogInterface.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cp f117077a;

        static {
            Covode.recordClassIndex(75602);
        }

        e(cp cpVar) {
            this.f117077a = cpVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
            if (i2 != 4) {
                return false;
            }
            l.b(keyEvent, "");
            if (keyEvent.getAction() != 1) {
                return false;
            }
            this.f117077a.ca_();
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z, int i2, int i3) {
        int i4;
        ForegroundColorSpan foregroundColorSpan;
        Integer a2;
        if (z) {
            i4 = R.attr.av;
        } else {
            i4 = R.attr.bj;
        }
        Context context = getContext();
        if (context == null || (a2 = com.bytedance.tux.h.d.a(context, i4)) == null) {
            foregroundColorSpan = null;
        } else {
            foregroundColorSpan = new ForegroundColorSpan(a2.intValue());
        }
        com.bytedance.ies.dmt.ui.d.a aVar = new a.C0730a().a(a.b.a(Math.min(i2, i3)), foregroundColorSpan, 33).c("/").a(a.b.a(i3)).f33382a;
        TextView textView = this.p;
        if (textView == null) {
            l.a("mEditLengthHint");
        }
        textView.setText(aVar);
    }
}
