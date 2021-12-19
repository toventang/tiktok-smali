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
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.g;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.profile.ak;
import com.ss.android.ugc.aweme.profile.f.y;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.ae;
import com.ss.android.ugc.aweme.profile.presenter.x;
import com.ss.android.ugc.aweme.utils.hg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.Map;
import java.util.Objects;

public final class bk extends cp implements x {
    public static final a n = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f116950a = "";

    /* renamed from: b  reason: collision with root package name */
    public boolean f116951b;

    /* renamed from: c  reason: collision with root package name */
    public int f116952c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f116953d;

    /* renamed from: f  reason: collision with root package name */
    b f116954f;

    /* renamed from: g  reason: collision with root package name */
    public ae f116955g;

    /* renamed from: h  reason: collision with root package name */
    public ak f116956h;

    /* renamed from: i  reason: collision with root package name */
    public DmtStatusView f116957i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f116958j;

    /* renamed from: k  reason: collision with root package name */
    public EditText f116959k;

    /* renamed from: l  reason: collision with root package name */
    public TuxIconView f116960l;

    /* renamed from: m  reason: collision with root package name */
    public TextView f116961m;
    private String r = "";
    private SparseArray s;

    public interface b {
        static {
            Covode.recordClassIndex(75529);
        }

        void a(String str);
    }

    static {
        Covode.recordClassIndex(75527);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cp, com.ss.android.ugc.aweme.profile.ui.bf
    public final View a(int i2) {
        if (this.s == null) {
            this.s = new SparseArray();
        }
        View view = (View) this.s.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.s.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cp, com.ss.android.ugc.aweme.profile.ui.bf
    public final void cc_() {
        SparseArray sparseArray = this.s;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75528);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static bk a(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            bk bkVar = new bk();
            Bundle bundle = new Bundle();
            bundle.putString("content_value", str);
            bundle.putBoolean("is_edit_enabled", true);
            bundle.putString("edit_hint", str2);
            bundle.putInt("content_max_length", 0);
            bundle.putBoolean("is_enable_null", true);
            bkVar.setArguments(bundle);
            return bkVar;
        }
    }

    public final EditText a() {
        EditText editText = this.f116959k;
        if (editText == null) {
            l.a("mEditContentInput");
        }
        return editText;
    }

    public final TuxIconView c() {
        TuxIconView tuxIconView = this.f116960l;
        if (tuxIconView == null) {
            l.a("mClearAllBtn");
        }
        return tuxIconView;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.profile.ui.cp
    public final void d() {
        b bVar = this.f116954f;
        if (bVar != null) {
            EditText editText = this.f116959k;
            if (editText == null) {
                l.a("mEditContentInput");
            }
            bVar.a(editText.getText().toString());
        }
    }

    @Override // androidx.fragment.app.d, com.ss.android.ugc.aweme.profile.ui.cp, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.profile.ui.bf
    public final void onDestroyView() {
        super.onDestroyView();
        ae aeVar = this.f116955g;
        if (aeVar != null) {
            aeVar.f116520c = null;
        }
        DmtStatusView dmtStatusView = this.f116957i;
        if (dmtStatusView == null) {
            l.a("mDmtStatusView");
        } else {
            dmtStatusView.setVisibility(8);
        }
        cc_();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cp
    public final boolean ca_() {
        Dialog dialog;
        EditText editText = this.f116959k;
        if (editText == null) {
            l.a("mEditContentInput");
        }
        KeyboardUtils.c(editText);
        if (getActivity() instanceof ProfileEditBioUrlActivity) {
            androidx.fragment.app.e activity = getActivity();
            if (activity == null) {
                l.b();
            }
            activity.finish();
        } else if (getDialog() != null && (dialog = getDialog()) != null && dialog.isShowing() && isResumed()) {
            try {
                dismiss();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return true;
    }

    public static final class c implements com.bytedance.tux.navigation.a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bk f116962a;

        static {
            Covode.recordClassIndex(75530);
        }

        @Override // com.bytedance.tux.navigation.a.d
        public final void a() {
            Map<String, String> map;
            y.a("save_profile", "click_save", "bio");
            String obj = this.f116962a.a().getText().toString();
            while (p.a((CharSequence) obj, (CharSequence) "\n\n", false)) {
                obj = new h.m.l("\n\n").replace(obj, "\n");
            }
            int length = obj.length() - 1;
            if (length >= 0 && obj.charAt(length) == '\n') {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                obj = obj.substring(0, length);
                l.b(obj, "");
            }
            if (!TextUtils.equals(obj, this.f116962a.f116950a)) {
                KeyboardUtils.c(this.f116962a.a());
                this.f116962a.a().setText(obj);
                ak akVar = this.f116962a.f116956h;
                if (akVar != null) {
                    akVar.f115970k = obj;
                }
                ae aeVar = this.f116962a.f116955g;
                if (aeVar != null) {
                    ak akVar2 = this.f116962a.f116956h;
                    if (akVar2 != null) {
                        map = akVar2.a();
                    } else {
                        map = null;
                    }
                    aeVar.a(map);
                }
                DmtStatusView dmtStatusView = this.f116962a.f116957i;
                if (dmtStatusView == null) {
                    l.a("mDmtStatusView");
                }
                dmtStatusView.f();
                return;
            }
            this.f116962a.ca_();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(bk bkVar) {
            this.f116962a = bkVar;
        }
    }

    public static final class e implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bk f116964a;

        static {
            Covode.recordClassIndex(75532);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            l.d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(bk bkVar) {
            this.f116964a = bkVar;
        }

        public final void afterTextChanged(Editable editable) {
            l.d(editable, "");
            if (this.f116964a.f116951b) {
                if (editable.length() <= 0 && !this.f116964a.f116953d) {
                    this.f116964a.i();
                } else if (!TextUtils.equals(editable.toString(), this.f116964a.f116950a)) {
                    this.f116964a.h();
                } else {
                    this.f116964a.i();
                }
                if (editable.length() > 0) {
                    this.f116964a.c().setVisibility(0);
                } else {
                    this.f116964a.c().setVisibility(8);
                }
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            l.d(charSequence, "");
            if (this.f116964a.f116952c != 0) {
                boolean a2 = bk.a(this.f116964a.a(), this.f116964a.f116952c);
                bk bkVar = this.f116964a;
                bkVar.a(a2, bkVar.a().length(), this.f116964a.f116952c);
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bk f116963a;

        static {
            Covode.recordClassIndex(75531);
        }

        d(bk bkVar) {
            this.f116963a = bkVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            EditText editText = this.f116963a.f116959k;
            if (editText == null) {
                l.a("mEditContentInput");
            }
            editText.setText("");
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(boolean z) {
        if (z) {
            new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.nm).a();
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.profile.b.e());
        }
    }

    @Override // androidx.fragment.app.d, com.ss.android.ugc.aweme.profile.ui.cp, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                l.b();
            }
            String string = arguments.getString("content_value");
            if (string == null) {
                l.b();
            }
            this.f116950a = string;
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                l.b();
            }
            this.f116951b = arguments2.getBoolean("is_edit_enabled");
            Bundle arguments3 = getArguments();
            if (arguments3 == null) {
                l.b();
            }
            String string2 = arguments3.getString("edit_hint");
            if (string2 == null) {
                l.b();
            }
            this.r = string2;
            Bundle arguments4 = getArguments();
            if (arguments4 == null) {
                l.b();
            }
            this.f116952c = arguments4.getInt("content_max_length");
            Bundle arguments5 = getArguments();
            if (arguments5 == null) {
                l.b();
            }
            this.f116953d = arguments5.getBoolean("is_enable_null");
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(User user, int i2) {
        DmtStatusView dmtStatusView = this.f116957i;
        if (dmtStatusView == null) {
            l.a("mDmtStatusView");
        } else {
            dmtStatusView.d();
        }
        if (getActivity() instanceof ProfileEditBioUrlActivity) {
            androidx.fragment.app.e activity = getActivity();
            if (activity == null) {
                l.b();
            }
            activity.finish();
            return;
        }
        d();
        dismiss();
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(Exception exc, int i2) {
        androidx.fragment.app.e activity;
        com.bytedance.tux.dialog.e eVar;
        DmtStatusView dmtStatusView = this.f116957i;
        if (dmtStatusView == null) {
            l.a("mDmtStatusView");
        } else {
            dmtStatusView.setVisibility(8);
        }
        if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((com.ss.android.ugc.aweme.base.api.a.a) exc).getErrorCode() == 2097 && (activity = getActivity()) != null) {
            l.b(activity, "");
            eVar.a(((com.bytedance.tux.dialog.e) new com.bytedance.tux.dialog.e(activity).a(R.string.cwn).b(R.string.cwl)).o.getText(R.string.cwm), false, null).a().b().show();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(String str, boolean z) {
        DmtStatusView dmtStatusView = this.f116957i;
        if (dmtStatusView == null) {
            l.a("mDmtStatusView");
        } else {
            dmtStatusView.setVisibility(8);
        }
        if (str != null && !TextUtils.isEmpty(str)) {
            new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(str).a();
            if (z && getActivity() != null) {
                androidx.fragment.app.e activity = getActivity();
                if (activity == null) {
                    l.b();
                }
                activity.finish();
            }
        }
    }

    static final class f implements TextView.OnEditorActionListener {

        /* renamed from: a  reason: collision with root package name */
        public static final f f116965a = new f();

        static {
            Covode.recordClassIndex(75533);
        }

        f() {
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
        int intValue;
        l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.ao8, viewGroup, false);
        View findViewById = a2.findViewById(R.id.e_o);
        l.b(findViewById, "");
        this.f116957i = (DmtStatusView) findViewById;
        View findViewById2 = a2.findViewById(R.id.exh);
        l.b(findViewById2, "");
        this.f116958j = (TextView) findViewById2;
        View findViewById3 = a2.findViewById(R.id.ay0);
        l.b(findViewById3, "");
        this.f116959k = (EditText) findViewById3;
        View findViewById4 = a2.findViewById(R.id.bvc);
        l.b(findViewById4, "");
        this.f116960l = (TuxIconView) findViewById4;
        View findViewById5 = a2.findViewById(R.id.ez0);
        l.b(findViewById5, "");
        a((TextView) findViewById5);
        View findViewById6 = a2.findViewById(R.id.eyy);
        l.b(findViewById6, "");
        this.f116961m = (TextView) findViewById6;
        View findViewById7 = a2.findViewById(R.id.bvc);
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(new d(this));
        }
        androidx.fragment.app.e activity = getActivity();
        Dialog dialog = getDialog();
        Integer num = null;
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        hg.a(activity, window, true);
        ae aeVar = new ae();
        this.f116955g = aeVar;
        aeVar.f116520c = this;
        this.f116956h = new ak();
        DmtStatusView dmtStatusView = this.f116957i;
        if (dmtStatusView == null) {
            l.a("mDmtStatusView");
        } else {
            dmtStatusView.setBuilder(DmtStatusView.a.a(getActivity()));
        }
        TextView textView = this.f116958j;
        if (textView == null) {
            l.a("mTvContentName");
        }
        textView.setText(getString(R.string.bl1));
        EditText editText = this.f116959k;
        if (editText == null) {
            l.a("mEditContentInput");
        }
        editText.addTextChangedListener(new e(this));
        EditText editText2 = this.f116959k;
        if (editText2 == null) {
            l.a("mEditContentInput");
        }
        editText2.setText(this.f116950a);
        EditText editText3 = this.f116959k;
        if (editText3 == null) {
            l.a("mEditContentInput");
        }
        EditText editText4 = this.f116959k;
        if (editText4 == null) {
            l.a("mEditContentInput");
        }
        editText3.setSelection(editText4.getText().length());
        EditText editText5 = this.f116959k;
        if (editText5 == null) {
            l.a("mEditContentInput");
        }
        editText5.setFocusable(true);
        EditText editText6 = this.f116959k;
        if (editText6 == null) {
            l.a("mEditContentInput");
        }
        editText6.setFocusableInTouchMode(true);
        EditText editText7 = this.f116959k;
        if (editText7 == null) {
            l.a("mEditContentInput");
        }
        editText7.requestFocus();
        this.o = (TuxNavBar) a2.findViewById(R.id.csl);
        com.bytedance.tux.navigation.a.c j2 = j();
        String string = getString(R.string.bl1);
        l.b(string, "");
        g b2 = b(string);
        com.bytedance.tux.navigation.a.e a3 = new com.bytedance.tux.navigation.a.e().a((Object) "save");
        String string2 = getString(R.string.bkt);
        l.b(string2, "");
        com.bytedance.tux.navigation.a.e a4 = a3.a(string2).a((com.bytedance.tux.navigation.a.d) new c(this));
        TuxNavBar tuxNavBar = this.o;
        if (tuxNavBar != null) {
            TuxNavBar.a b3 = new TuxNavBar.a().a(j2).a(b2).b(a4);
            b3.f45188d = true;
            tuxNavBar.setNavActions(b3);
        }
        if (!this.f116951b) {
            EditText editText8 = this.f116959k;
            if (editText8 == null) {
                l.a("mEditContentInput");
            }
            editText8.setEnabled(false);
            EditText editText9 = this.f116959k;
            if (editText9 == null) {
                l.a("mEditContentInput");
            }
            editText9.setFocusable(false);
            EditText editText10 = this.f116959k;
            if (editText10 == null) {
                l.a("mEditContentInput");
            }
            editText10.setFocusableInTouchMode(false);
            TuxIconView tuxIconView = this.f116960l;
            if (tuxIconView == null) {
                l.a("mClearAllBtn");
            }
            tuxIconView.setVisibility(8);
        }
        i();
        if (TextUtils.isEmpty(this.r)) {
            TextView textView2 = this.f116961m;
            if (textView2 == null) {
                l.a("mIdEditHintText");
            }
            textView2.setVisibility(8);
        } else {
            TextView textView3 = this.f116961m;
            if (textView3 == null) {
                l.a("mIdEditHintText");
            }
            textView3.setVisibility(0);
            TextView textView4 = this.f116961m;
            if (textView4 == null) {
                l.a("mIdEditHintText");
            }
            textView4.setText(this.r);
        }
        if (this.f116952c > 0) {
            g().setVisibility(0);
            TextView g2 = g();
            Object[] objArr = new Object[2];
            if (TextUtils.isEmpty(this.f116950a)) {
                intValue = 0;
            } else {
                String str = this.f116950a;
                if (str != null) {
                    num = Integer.valueOf(str.length());
                }
                intValue = num.intValue();
            }
            objArr[0] = Integer.valueOf(intValue);
            objArr[1] = Integer.valueOf(this.f116952c);
            g2.setText(getString(R.string.abr, objArr));
        }
        EditText editText11 = this.f116959k;
        if (editText11 == null) {
            l.a("mEditContentInput");
        }
        editText11.setOnEditorActionListener(f.f116965a);
        return a2;
    }
}
