package com.bytedance.ies.dmt.ui.searchbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Objects;

public final class SearchBar extends LinearLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public b f33500a;

    /* renamed from: b  reason: collision with root package name */
    final Handler f33501b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f33502c;

    static {
        Covode.recordClassIndex(19984);
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final View a(int i2) {
        if (this.f33502c == null) {
            this.f33502c = new HashMap();
        }
        View view = (View) this.f33502c.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f33502c.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchBar f33503a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f33504b;

        static {
            Covode.recordClassIndex(19985);
        }

        a(SearchBar searchBar, String str) {
            this.f33503a = searchBar;
            this.f33504b = str;
        }

        public final void run() {
            b bVar = this.f33503a.f33500a;
            if (bVar != null) {
                bVar.a(this.f33504b);
            }
        }
    }

    public final void c() {
        ((DmtEditText) a(R.id.ay6)).setText("");
    }

    public final void b() {
        this.f33500a = null;
        ((DmtEditText) a(R.id.ay6)).setText("");
        ((DmtEditText) a(R.id.ay6)).clearFocus();
        a();
    }

    public final void a() {
        String str;
        Object obj;
        Context context = getContext();
        if (Build.VERSION.SDK_INT >= 23) {
            obj = context.getSystemService(InputMethodManager.class);
        } else {
            if (Build.VERSION.SDK_INT >= 23) {
                str = context.getSystemServiceName(InputMethodManager.class);
            } else {
                str = b.a.f2290a.get(InputMethodManager.class);
            }
            if (str != null) {
                obj = androidx.core.content.b.b(context, str);
            } else {
                obj = null;
            }
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        DmtEditText dmtEditText = (DmtEditText) a(R.id.ay6);
        l.b(dmtEditText, "");
        ((InputMethodManager) obj).hideSoftInputFromWindow(dmtEditText.getWindowToken(), 0);
    }

    public static final class b implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchBar f33505a;

        static {
            Covode.recordClassIndex(19986);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            l.d(charSequence, "");
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            l.d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(SearchBar searchBar) {
            this.f33505a = searchBar;
        }

        public final void afterTextChanged(Editable editable) {
            l.d(editable, "");
            SearchBar searchBar = this.f33505a;
            String obj = editable.toString();
            if (!TextUtils.isEmpty(obj)) {
                TuxIconView tuxIconView = (TuxIconView) searchBar.a(R.id.y0);
                l.b(tuxIconView, "");
                tuxIconView.setVisibility(0);
            } else {
                TuxIconView tuxIconView2 = (TuxIconView) searchBar.a(R.id.y0);
                l.b(tuxIconView2, "");
                tuxIconView2.setVisibility(8);
            }
            a aVar = new a(searchBar, obj);
            searchBar.f33501b.removeCallbacksAndMessages(null);
            searchBar.f33501b.postDelayed(aVar, 500);
        }
    }

    public final void setSearchBarEventHandler(b bVar) {
        l.d(bVar, "");
        this.f33500a = bVar;
    }

    private final void setSearchBarOnFocusChangeListener(boolean z) {
        ((DmtEditText) a(R.id.ay6)).setOnFocusChangeListener(new c(this, z));
    }

    public final void setOnKeyListener(View.OnKeyListener onKeyListener) {
        l.d(onKeyListener, "");
        ((DmtEditText) a(R.id.ay6)).setOnKeyListener(onKeyListener);
    }

    public final void onClick(View view) {
        l.d(view, "");
        if (view.getId() == R.id.qb) {
            if (this.f33500a == null) {
            }
        } else if (view.getId() == R.id.y0) {
            ((DmtEditText) a(R.id.ay6)).setText("");
            TuxIconView tuxIconView = (TuxIconView) a(R.id.y0);
            if (tuxIconView == null) {
                l.b();
            }
            tuxIconView.setVisibility(8);
            b bVar = this.f33500a;
            if (bVar != null) {
                bVar.b();
            }
        } else if (view.getId() == R.id.duc) {
            if (this.f33500a == null) {
            }
        } else if (l.a(view, a(R.id.a1s))) {
            c();
            ((DmtEditText) a(R.id.ay6)).clearFocus();
            b bVar2 = this.f33500a;
            if (bVar2 != null) {
                bVar2.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchBar f33506a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f33507b;

        static {
            Covode.recordClassIndex(19987);
        }

        c(SearchBar searchBar, boolean z) {
            this.f33506a = searchBar;
            this.f33507b = z;
        }

        public final void onFocusChange(View view, boolean z) {
            int i2;
            DmtTextView dmtTextView = (DmtTextView) this.f33506a.a(R.id.a1s);
            l.b(dmtTextView, "");
            if (!this.f33507b || !z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            dmtTextView.setVisibility(i2);
            if (!z) {
                this.f33506a.a();
            }
            b bVar = this.f33506a.f33500a;
            if (bVar != null) {
                DmtEditText dmtEditText = (DmtEditText) this.f33506a.a(R.id.ay6);
                l.b(dmtEditText, "");
                bVar.a(z, String.valueOf(dmtEditText.getText()));
            }
        }
    }

    private /* synthetic */ SearchBar(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SearchBar(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        int i2;
        int i3;
        l.d(context, "");
        MethodCollector.i(10223);
        this.f33501b = new Handler();
        View.inflate(context, R.layout.bk3, this);
        Context context2 = getContext();
        l.b(context2, "");
        TypedArray obtainStyledAttributes = context2.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.ab3, R.attr.ac9, R.attr.aca, R.attr.acb, R.attr.aci, R.attr.afr}, 0, 0);
        try {
            String string = obtainStyledAttributes.getString(0);
            boolean z = obtainStyledAttributes.getBoolean(2, false);
            if (string != null && string.length() > 0) {
                DmtEditText dmtEditText = (DmtEditText) a(R.id.ay6);
                l.b(dmtEditText, "");
                dmtEditText.setHint(string);
            }
            ((DmtEditText) a(R.id.ay6)).addTextChangedListener(new b(this));
            setSearchBarOnFocusChangeListener(z);
            boolean z2 = obtainStyledAttributes.getBoolean(1, false);
            ((AutoRTLImageView) a(R.id.qb)).setOnClickListener(this);
            AutoRTLImageView autoRTLImageView = (AutoRTLImageView) a(R.id.qb);
            l.b(autoRTLImageView, "");
            if (z2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            autoRTLImageView.setVisibility(i2);
            boolean z3 = obtainStyledAttributes.getBoolean(4, false);
            ((DmtTextView) a(R.id.duc)).setOnClickListener(this);
            DmtTextView dmtTextView = (DmtTextView) a(R.id.duc);
            l.b(dmtTextView, "");
            if (z3) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            dmtTextView.setVisibility(i3);
            if (obtainStyledAttributes.getBoolean(3, true)) {
                TuxIconView tuxIconView = (TuxIconView) a(R.id.y0);
                l.b(tuxIconView, "");
                tuxIconView.setVisibility(0);
                ((TuxIconView) a(R.id.y0)).setOnClickListener(this);
            } else {
                TuxIconView tuxIconView2 = (TuxIconView) a(R.id.y0);
                l.b(tuxIconView2, "");
                tuxIconView2.setVisibility(8);
            }
            ((DmtTextView) a(R.id.a1s)).setOnClickListener(this);
            obtainStyledAttributes.recycle();
            setOrientation(0);
            MethodCollector.o(10223);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            MethodCollector.o(10223);
            throw th;
        }
    }
}
