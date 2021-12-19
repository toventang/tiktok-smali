package com.ss.android.ugc.aweme.profile.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.KeyEvent;
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
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.profile.f.y;
import com.ss.android.ugc.aweme.utils.hg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class bl extends cp {
    public static final a n = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f116966a = "";

    /* renamed from: b  reason: collision with root package name */
    public boolean f116967b;

    /* renamed from: c  reason: collision with root package name */
    public String f116968c = "";

    /* renamed from: d  reason: collision with root package name */
    public int f116969d;

    /* renamed from: f  reason: collision with root package name */
    public boolean f116970f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f116971g = true;

    /* renamed from: h  reason: collision with root package name */
    h.f.a.b<? super Editable, Boolean> f116972h;

    /* renamed from: i  reason: collision with root package name */
    public f.a.l.b<Object> f116973i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f116974j;

    /* renamed from: k  reason: collision with root package name */
    public EditText f116975k;

    /* renamed from: l  reason: collision with root package name */
    public TuxIconView f116976l;

    /* renamed from: m  reason: collision with root package name */
    public TextView f116977m;
    private String r = "";
    private f.a.b.a s;
    private b t;
    private SparseArray u;

    public interface b {
        static {
            Covode.recordClassIndex(75536);
        }

        void a(String str);
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f116981a = new f();

        static {
            Covode.recordClassIndex(75540);
        }

        f() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(75534);
    }

    public static final bl a(String str, String str2, String str3, int i2, boolean z) {
        return a.a(str, str2, str3, i2, z);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cp, com.ss.android.ugc.aweme.profile.ui.bf
    public final View a(int i2) {
        if (this.u == null) {
            this.u = new SparseArray();
        }
        View view = (View) this.u.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.u.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cp, com.ss.android.ugc.aweme.profile.ui.bf
    public final void cc_() {
        SparseArray sparseArray = this.u;
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
            Covode.recordClassIndex(75535);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static bl a(String str, String str2, String str3, int i2, boolean z) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            bl blVar = new bl();
            Bundle bundle = new Bundle();
            bundle.putString("content_name", str);
            bundle.putString("content_value", str2);
            bundle.putBoolean("is_edit_enabled", true);
            bundle.putString("edit_hint", str3);
            bundle.putInt("content_max_length", i2);
            bundle.putBoolean("is_enable_null", z);
            blVar.setArguments(bundle);
            return blVar;
        }
    }

    public final EditText a() {
        EditText editText = this.f116975k;
        if (editText == null) {
            l.a("mEditContentInput");
        }
        return editText;
    }

    public final TuxIconView c() {
        TuxIconView tuxIconView = this.f116976l;
        if (tuxIconView == null) {
            l.a("mClearAllBtn");
        }
        return tuxIconView;
    }

    public final TextView e() {
        TextView textView = this.f116977m;
        if (textView == null) {
            l.a("mIdEditHintText");
        }
        return textView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.s.a();
    }

    public static final class c implements com.bytedance.tux.navigation.a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bl f116978a;

        static {
            Covode.recordClassIndex(75537);
        }

        @Override // com.bytedance.tux.navigation.a.d
        public final void a() {
            KeyboardUtils.c(this.f116978a.a());
            y.a("save_profile", "click_save", StringSet.name);
            this.f116978a.d();
            this.f116978a.dismiss();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(bl blVar) {
            this.f116978a = blVar;
        }
    }

    public bl() {
        f.a.l.b<Object> bVar = new f.a.l.b<>();
        l.b(bVar, "");
        this.f116973i = bVar;
        this.s = new f.a.b.a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.profile.ui.cp
    public final void d() {
        b bVar = this.t;
        if (bVar != null) {
            EditText editText = this.f116975k;
            if (editText == null) {
                l.a("mEditContentInput");
            }
            bVar.a(editText.getText().toString());
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cp
    public final boolean ca_() {
        Dialog dialog;
        EditText editText = this.f116975k;
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

    public static final class g implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bl f116982a;

        static {
            Covode.recordClassIndex(75541);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            l.d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(bl blVar) {
            this.f116982a = blVar;
        }

        public final void afterTextChanged(Editable editable) {
            l.d(editable, "");
            if (this.f116982a.f116967b) {
                if (editable.length() <= 0 && !this.f116982a.f116970f) {
                    this.f116982a.i();
                } else if (TextUtils.equals(editable.toString(), this.f116982a.f116966a) || !this.f116982a.a(editable)) {
                    this.f116982a.i();
                } else {
                    this.f116982a.h();
                }
                if (editable.length() > 0) {
                    this.f116982a.c().setVisibility(0);
                } else {
                    this.f116982a.c().setVisibility(8);
                }
                if (this.f116982a.f116971g) {
                    return;
                }
                if (editable.length() != 0 && !this.f116982a.a(editable)) {
                    this.f116982a.e().setVisibility(0);
                    this.f116982a.e().setText(this.f116982a.f116968c);
                    return;
                }
                this.f116982a.e().setVisibility(8);
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            l.d(charSequence, "");
            if (this.f116982a.f116969d != 0) {
                boolean a2 = bl.a(this.f116982a.a(), this.f116982a.f116969d);
                if (a2) {
                    this.f116982a.f116973i.onNext("");
                }
                bl blVar = this.f116982a;
                blVar.a(a2, blVar.a().length(), this.f116982a.f116969d);
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bl f116979a;

        static {
            Covode.recordClassIndex(75538);
        }

        d(bl blVar) {
            this.f116979a = blVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            EditText editText = this.f116979a.f116975k;
            if (editText == null) {
                l.a("mEditContentInput");
            }
            editText.setText("");
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f116980a;

        static {
            Covode.recordClassIndex(75539);
        }

        e(View view) {
            this.f116980a = view;
        }

        @Override // f.a.d.f
        public final void accept(Object obj) {
            View view = this.f116980a;
            l.b(view, "");
            new com.bytedance.tux.g.b(view).e(R.string.a50).b();
        }
    }

    public final void a(b bVar) {
        l.d(bVar, "");
        this.t = bVar;
    }

    public final boolean a(Editable editable) {
        h.f.a.b<? super Editable, Boolean> bVar = this.f116972h;
        if (bVar == null || bVar.invoke(editable).booleanValue()) {
            return true;
        }
        return false;
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
            this.r = string;
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                l.b();
            }
            String string2 = arguments2.getString("content_value");
            if (string2 == null) {
                l.b();
            }
            this.f116966a = string2;
            Bundle arguments3 = getArguments();
            if (arguments3 == null) {
                l.b();
            }
            this.f116967b = arguments3.getBoolean("is_edit_enabled");
            Bundle arguments4 = getArguments();
            if (arguments4 == null) {
                l.b();
            }
            String string3 = arguments4.getString("edit_hint");
            if (string3 == null) {
                l.b();
            }
            this.f116968c = string3;
            Bundle arguments5 = getArguments();
            if (arguments5 == null) {
                l.b();
            }
            this.f116969d = arguments5.getInt("content_max_length");
            Bundle arguments6 = getArguments();
            if (arguments6 == null) {
                l.b();
            }
            this.f116970f = arguments6.getBoolean("is_enable_null");
        }
    }

    static final class h implements TextView.OnEditorActionListener {

        /* renamed from: a  reason: collision with root package name */
        public static final h f116983a = new h();

        static {
            Covode.recordClassIndex(75542);
        }

        h() {
        }

        public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            if (keyEvent == null || keyEvent.getKeyCode() != 66) {
                return false;
            }
            return true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.ao8, viewGroup, false);
        androidx.fragment.app.e activity = getActivity();
        Dialog dialog = getDialog();
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        hg.a(activity, window, true);
        View findViewById = a2.findViewById(R.id.exh);
        l.b(findViewById, "");
        this.f116974j = (TextView) findViewById;
        View findViewById2 = a2.findViewById(R.id.ay0);
        l.b(findViewById2, "");
        this.f116975k = (EditText) findViewById2;
        View findViewById3 = a2.findViewById(R.id.bvc);
        l.b(findViewById3, "");
        this.f116976l = (TuxIconView) findViewById3;
        View findViewById4 = a2.findViewById(R.id.ez0);
        l.b(findViewById4, "");
        a((TextView) findViewById4);
        View findViewById5 = a2.findViewById(R.id.eyy);
        l.b(findViewById5, "");
        this.f116977m = (TextView) findViewById5;
        View findViewById6 = a2.findViewById(R.id.bvc);
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(new d(this));
        }
        TextView textView = this.f116974j;
        if (textView == null) {
            l.a("mTvContentName");
        }
        textView.setText(this.r);
        TuxIconView tuxIconView = this.f116976l;
        if (tuxIconView == null) {
            l.a("mClearAllBtn");
        }
        tuxIconView.setIconRes(R.raw.icon_x_mark_circle_fill);
        f.a.b.b a3 = this.f116973i.g(3000, TimeUnit.MILLISECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new e(a2), f.f116981a);
        l.b(a3, "");
        f.a.j.a.a(a3, this.s);
        EditText editText = this.f116975k;
        if (editText == null) {
            l.a("mEditContentInput");
        }
        editText.addTextChangedListener(new g(this));
        EditText editText2 = this.f116975k;
        if (editText2 == null) {
            l.a("mEditContentInput");
        }
        editText2.setText(this.f116966a);
        EditText editText3 = this.f116975k;
        if (editText3 == null) {
            l.a("mEditContentInput");
        }
        EditText editText4 = this.f116975k;
        if (editText4 == null) {
            l.a("mEditContentInput");
        }
        editText3.setSelection(editText4.getText().length());
        EditText editText5 = this.f116975k;
        if (editText5 == null) {
            l.a("mEditContentInput");
        }
        editText5.setFocusable(true);
        EditText editText6 = this.f116975k;
        if (editText6 == null) {
            l.a("mEditContentInput");
        }
        editText6.setFocusableInTouchMode(true);
        EditText editText7 = this.f116975k;
        if (editText7 == null) {
            l.a("mEditContentInput");
        }
        editText7.requestFocus();
        this.o = (TuxNavBar) a2.findViewById(R.id.csl);
        com.bytedance.tux.navigation.a.c j2 = j();
        com.bytedance.tux.navigation.a.g b2 = b(this.r);
        com.bytedance.tux.navigation.a.e a4 = new com.bytedance.tux.navigation.a.e().a((Object) "save");
        String string = getString(R.string.bkt);
        l.b(string, "");
        com.bytedance.tux.navigation.a.e a5 = a4.a(string).a((com.bytedance.tux.navigation.a.d) new c(this));
        TuxNavBar tuxNavBar = this.o;
        if (tuxNavBar != null) {
            TuxNavBar.a b3 = new TuxNavBar.a().a(j2).a(b2).b(a5);
            b3.f45188d = true;
            tuxNavBar.setNavActions(b3);
        }
        if (!this.f116967b) {
            EditText editText8 = this.f116975k;
            if (editText8 == null) {
                l.a("mEditContentInput");
            }
            editText8.setEnabled(false);
            EditText editText9 = this.f116975k;
            if (editText9 == null) {
                l.a("mEditContentInput");
            }
            editText9.setFocusable(false);
            EditText editText10 = this.f116975k;
            if (editText10 == null) {
                l.a("mEditContentInput");
            }
            editText10.setFocusableInTouchMode(false);
            TuxIconView tuxIconView2 = this.f116976l;
            if (tuxIconView2 == null) {
                l.a("mClearAllBtn");
            }
            tuxIconView2.setVisibility(8);
        }
        i();
        if (!this.f116971g || TextUtils.isEmpty(this.f116968c)) {
            TextView textView2 = this.f116977m;
            if (textView2 == null) {
                l.a("mIdEditHintText");
            }
            textView2.setVisibility(8);
        } else {
            TextView textView3 = this.f116977m;
            if (textView3 == null) {
                l.a("mIdEditHintText");
            }
            textView3.setVisibility(0);
            TextView textView4 = this.f116977m;
            if (textView4 == null) {
                l.a("mIdEditHintText");
            }
            textView4.setText(this.f116968c);
        }
        if (this.f116969d > 0) {
            g().setVisibility(0);
        }
        EditText editText11 = this.f116975k;
        if (editText11 == null) {
            l.a("mEditContentInput");
        }
        editText11.setOnEditorActionListener(h.f116983a);
        return a2;
    }
}
