package com.ss.android.ugc.aweme.profile.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.profile.f.y;
import com.ss.android.ugc.aweme.utils.hg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class bj extends cp {

    /* renamed from: g  reason: collision with root package name */
    public static final a f116934g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f116935a = "";

    /* renamed from: b  reason: collision with root package name */
    public f.a.l.b<Object> f116936b;

    /* renamed from: c  reason: collision with root package name */
    public EditText f116937c;

    /* renamed from: d  reason: collision with root package name */
    public TuxIconView f116938d;

    /* renamed from: f  reason: collision with root package name */
    public TextView f116939f;

    /* renamed from: h  reason: collision with root package name */
    private String f116940h = "";

    /* renamed from: i  reason: collision with root package name */
    private f.a.b.a f116941i;

    /* renamed from: j  reason: collision with root package name */
    private b f116942j;

    /* renamed from: k  reason: collision with root package name */
    private SparseArray f116943k;

    public interface b {
        static {
            Covode.recordClassIndex(75521);
        }

        void a(String str);
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f116947a = new f();

        static {
            Covode.recordClassIndex(75525);
        }

        f() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(75519);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cp, com.ss.android.ugc.aweme.profile.ui.bf
    public final View a(int i2) {
        if (this.f116943k == null) {
            this.f116943k = new SparseArray();
        }
        View view = (View) this.f116943k.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f116943k.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cp, com.ss.android.ugc.aweme.profile.ui.bf
    public final void cc_() {
        SparseArray sparseArray = this.f116943k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cp, androidx.fragment.app.d, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.profile.ui.bf
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        cc_();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75520);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static bj a(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            bj bjVar = new bj();
            Bundle bundle = new Bundle();
            bundle.putString("content_name", str);
            bundle.putString("content_value", str2);
            bjVar.setArguments(bundle);
            return bjVar;
        }
    }

    public final EditText a() {
        EditText editText = this.f116937c;
        if (editText == null) {
            l.a("mEditContentInput");
        }
        return editText;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f116941i.a();
    }

    public bj() {
        f.a.l.b<Object> bVar = new f.a.l.b<>();
        l.b(bVar, "");
        this.f116936b = bVar;
        this.f116941i = new f.a.b.a();
    }

    public static final class c implements com.bytedance.tux.navigation.a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bj f116944a;

        static {
            Covode.recordClassIndex(75522);
        }

        @Override // com.bytedance.tux.navigation.a.d
        public final void a() {
            KeyboardUtils.c(this.f116944a.a());
            y.a("save_profile", "click_save", "bio");
            KeyboardUtils.c(this.f116944a.a());
            this.f116944a.d();
            this.f116944a.dismiss();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(bj bjVar) {
            this.f116944a = bjVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cp
    public final boolean ca_() {
        Dialog dialog;
        EditText editText = this.f116937c;
        if (editText == null) {
            l.a("mEditContentInput");
        }
        KeyboardUtils.c(editText);
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
    @Override // com.ss.android.ugc.aweme.profile.ui.cp
    public final void d() {
        int i2;
        boolean z;
        b bVar = this.f116942j;
        if (bVar != null) {
            EditText editText = this.f116937c;
            if (editText == null) {
                l.a("mEditContentInput");
            }
            String obj = editText.getText().toString();
            int length = obj.length() - 1;
            int i3 = 0;
            boolean z2 = false;
            while (i3 <= length) {
                if (!z2) {
                    i2 = i3;
                } else {
                    i2 = length;
                }
                if (l.a(obj.charAt(i2), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2) {
                    if (!z) {
                        break;
                    }
                    length--;
                } else if (!z) {
                    z2 = true;
                } else {
                    i3++;
                }
            }
            bVar.a(obj.subSequence(i3, length + 1).toString());
        }
    }

    public final void a(b bVar) {
        l.d(bVar, "");
        this.f116942j = bVar;
    }

    public static final class g implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public String f116948a = "";

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bj f116949b;

        static {
            Covode.recordClassIndex(75526);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            l.d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(bj bjVar) {
            this.f116949b = bjVar;
        }

        public final void afterTextChanged(Editable editable) {
            String substring;
            l.d(editable, "");
            if (this.f116949b.a().getLineCount() > 5) {
                String obj = editable.toString();
                int selectionStart = this.f116949b.a().getSelectionStart();
                if (selectionStart != this.f116949b.a().getSelectionEnd() || selectionStart >= obj.length() || selectionStart <= 0) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                    substring = obj.substring(0, editable.length() - 1);
                    l.b(substring, "");
                } else {
                    StringBuilder sb = new StringBuilder();
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                    String substring2 = obj.substring(0, selectionStart - 1);
                    l.b(substring2, "");
                    StringBuilder append = sb.append(substring2);
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                    String substring3 = obj.substring(selectionStart);
                    l.b(substring3, "");
                    substring = append.append(substring3).toString();
                }
                this.f116948a = substring;
                this.f116949b.a().setText(substring);
                this.f116949b.a().setSelection(this.f116949b.a().getText().length());
                return;
            }
            this.f116948a = editable.toString();
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            l.d(charSequence, "");
            boolean a2 = bj.a(this.f116949b.a(), 80);
            if (a2) {
                this.f116949b.f116936b.onNext("");
            }
            bj bjVar = this.f116949b;
            bjVar.a(a2, bjVar.a().length(), 80);
            if (!TextUtils.equals(charSequence.toString(), this.f116949b.f116935a)) {
                this.f116949b.h();
            } else {
                this.f116949b.i();
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bj f116945a;

        static {
            Covode.recordClassIndex(75523);
        }

        d(bj bjVar) {
            this.f116945a = bjVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            EditText editText = this.f116945a.f116937c;
            if (editText == null) {
                l.a("mEditContentInput");
            }
            editText.setText("");
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f116946a;

        static {
            Covode.recordClassIndex(75524);
        }

        e(View view) {
            this.f116946a = view;
        }

        @Override // f.a.d.f
        public final void accept(Object obj) {
            View view = this.f116946a;
            l.b(view, "");
            new com.bytedance.tux.g.b(view).e(R.string.a50).b();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cp, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                l.b();
            }
            String string = arguments.getString("content_name");
            if (string == null) {
                l.b();
            }
            this.f116940h = string;
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                l.b();
            }
            String string2 = arguments2.getString("content_value");
            if (string2 == null) {
                l.b();
            }
            this.f116935a = string2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.ao7, viewGroup, false);
        androidx.fragment.app.e activity = getActivity();
        Dialog dialog = getDialog();
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        hg.a(activity, window, true);
        View findViewById = a2.findViewById(R.id.ay0);
        l.b(findViewById, "");
        this.f116937c = (EditText) findViewById;
        View findViewById2 = a2.findViewById(R.id.bvc);
        l.b(findViewById2, "");
        this.f116938d = (TuxIconView) findViewById2;
        View findViewById3 = a2.findViewById(R.id.ez0);
        l.b(findViewById3, "");
        a((TextView) findViewById3);
        View findViewById4 = a2.findViewById(R.id.eyy);
        l.b(findViewById4, "");
        this.f116939f = (TextView) findViewById4;
        View findViewById5 = a2.findViewById(R.id.bvc);
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new d(this));
        }
        g().setVisibility(0);
        TuxIconView tuxIconView = this.f116938d;
        if (tuxIconView == null) {
            l.a("mClearAllBtn");
        }
        tuxIconView.setVisibility(8);
        TuxIconView tuxIconView2 = this.f116938d;
        if (tuxIconView2 == null) {
            l.a("mClearAllBtn");
        }
        tuxIconView2.setIconRes(R.raw.icon_x_mark_circle_fill);
        f.a.b.b a3 = this.f116936b.g(3000, TimeUnit.MILLISECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new e(a2), f.f116947a);
        l.b(a3, "");
        f.a.j.a.a(a3, this.f116941i);
        EditText editText = this.f116937c;
        if (editText == null) {
            l.a("mEditContentInput");
        }
        editText.addTextChangedListener(new g(this));
        EditText editText2 = this.f116937c;
        if (editText2 == null) {
            l.a("mEditContentInput");
        }
        editText2.setText(this.f116935a);
        EditText editText3 = this.f116937c;
        if (editText3 == null) {
            l.a("mEditContentInput");
        }
        EditText editText4 = this.f116937c;
        if (editText4 == null) {
            l.a("mEditContentInput");
        }
        editText3.setSelection(editText4.getText().length());
        EditText editText5 = this.f116937c;
        if (editText5 == null) {
            l.a("mEditContentInput");
        }
        editText5.setFocusable(true);
        EditText editText6 = this.f116937c;
        if (editText6 == null) {
            l.a("mEditContentInput");
        }
        editText6.setFocusableInTouchMode(true);
        EditText editText7 = this.f116937c;
        if (editText7 == null) {
            l.a("mEditContentInput");
        }
        editText7.requestFocus();
        this.o = (TuxNavBar) a2.findViewById(R.id.csl);
        com.bytedance.tux.navigation.a.c j2 = j();
        com.bytedance.tux.navigation.a.g b2 = b(this.f116940h);
        com.bytedance.tux.navigation.a.e a4 = new com.bytedance.tux.navigation.a.e().a((Object) "save");
        String string = getString(R.string.ku);
        l.b(string, "");
        com.bytedance.tux.navigation.a.e a5 = a4.a(string).a((com.bytedance.tux.navigation.a.d) new c(this));
        TuxNavBar tuxNavBar = this.o;
        if (tuxNavBar != null) {
            TuxNavBar.a b3 = new TuxNavBar.a().a(j2).a(b2).b(a5);
            b3.f45188d = true;
            tuxNavBar.setNavActions(b3);
        }
        i();
        return a2;
    }
}
