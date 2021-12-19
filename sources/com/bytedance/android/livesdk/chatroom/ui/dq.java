package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import androidx.fragment.app.d;
import com.bytedance.android.livesdk.utils.o;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class dq extends d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f16166a;

    /* renamed from: b  reason: collision with root package name */
    public a f16167b;

    /* renamed from: c  reason: collision with root package name */
    protected EditText f16168c;

    /* renamed from: d  reason: collision with root package name */
    protected View f16169d;

    /* renamed from: e  reason: collision with root package name */
    public View f16170e;

    /* renamed from: f  reason: collision with root package name */
    protected String f16171f;

    /* renamed from: g  reason: collision with root package name */
    protected int f16172g;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f16173h;

    /* renamed from: i  reason: collision with root package name */
    private final View.OnLayoutChangeListener f16174i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f16175j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f16176k;

    public interface a {
        static {
            Covode.recordClassIndex(8946);
        }

        void a();

        void a(String str);
    }

    static {
        Covode.recordClassIndex(8945);
    }

    public final void a() {
        if (this.f16168c != null) {
            o.b(getContext(), this.f16168c);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f16170e.removeOnLayoutChangeListener(this.f16174i);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f16175j) {
            this.f16175j = false;
            b(200, 1, 5);
            return;
        }
        this.f16168c.postDelayed(new dt(this), 50);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        if (isAdded()) {
            o.a(getContext(), this.f16168c);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        String trim;
        if (this.f16167b != null) {
            if (this.f16168c.getText() == null) {
                trim = "";
            } else {
                trim = this.f16168c.getText().toString().trim();
            }
            this.f16167b.a(trim);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f16175j = this.f16166a;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean a(int i2) {
        if (i2 != 6) {
            return false;
        }
        if (!this.f16169d.isEnabled()) {
            return true;
        }
        this.f16169d.performClick();
        return true;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f16171f = getArguments().getString("live.intent.extra.HINT", null);
            this.f16172g = getArguments().getInt("live.intent.extra.MAX_LENGTH", 0);
            this.f16173h = getArguments().getBoolean("live.intent.extra.TOUCH_MODAL", false);
            this.f16176k = getArguments().getBoolean("live.intent.extra.IS_BROADCASTER", false);
        }
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(false);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setSoftInputMode(3);
            if (!this.f16176k && !com.bytedance.android.live.core.f.d.a(getActivity())) {
                window.addFlags(1024);
            }
            if (!this.f16173h) {
                window.addFlags(32);
                window.clearFlags(2);
            }
        }
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.d
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f16167b != null) {
            if (this.f16168c.getText() != null) {
                this.f16168c.getText().toString().trim();
            }
            this.f16167b.a();
            this.f16167b = null;
            this.f16166a = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getArguments() != null) {
            String string = getArguments().getString("live.intent.extra.INPUT");
            if (isAdded() && !TextUtils.isEmpty(string)) {
                this.f16168c.setText(string);
                EditText editText = this.f16168c;
                editText.setSelection(editText.getText().length());
            }
        }
        this.f16168c.setOnEditorActionListener(new dr(this));
        this.f16169d.setOnClickListener(new ds(this));
    }

    private void b(long j2, int i2, int i3) {
        EditText editText = this.f16168c;
        if (editText != null && i2 <= i3) {
            editText.postDelayed(new du(this, j2, i2, i3), j2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(long j2, int i2, int i3) {
        if (isResumed() && this.f16166a) {
            o.a(getContext(), this.f16168c);
            b(j2, i2 + 1, i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        InputFilter[] inputFilterArr;
        View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.b9x, viewGroup, false);
        this.f16170e = a2;
        a2.addOnLayoutChangeListener(this.f16174i);
        this.f16168c = (EditText) this.f16170e.findViewById(R.id.ais);
        this.f16169d = this.f16170e.findViewById(R.id.dyl);
        ((KeyboardShadowView) this.f16170e.findViewById(R.id.fjm)).setActivity(getActivity());
        this.f16168c.setHint(this.f16171f);
        if (this.f16172g > 0) {
            InputFilter[] filters = this.f16168c.getFilters();
            if (filters == null || filters.length == 0) {
                inputFilterArr = new InputFilter[1];
            } else {
                inputFilterArr = new InputFilter[(filters.length + 1)];
                for (int i2 = 0; i2 < filters.length; i2++) {
                    inputFilterArr[i2] = filters[i2];
                }
            }
            inputFilterArr[inputFilterArr.length - 1] = new InputFilter.LengthFilter(this.f16172g);
            this.f16168c.setFilters(inputFilterArr);
        }
        this.f16170e.findViewById(R.id.ait).getLayoutParams().width = getResources().getDisplayMetrics().widthPixels;
        return this.f16170e;
    }
}
