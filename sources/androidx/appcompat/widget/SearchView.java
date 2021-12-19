package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.h.v;
import androidx.customview.view.AbsSavedState;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends LinearLayoutCompat implements androidx.appcompat.view.c {
    static final a u = new a();
    private Rect A;
    private int[] B;
    private int[] C;
    private final ImageView D;
    private final Drawable E;
    private final int F;
    private final int G;
    private final CharSequence H;
    private c I;
    private b J;
    private View.OnClickListener K;
    private CharSequence L;
    private boolean M;
    private int N;
    private boolean O;
    private CharSequence P;
    private CharSequence Q;
    private boolean R;
    private int S;
    private final Runnable T;
    private Runnable U;
    private final WeakHashMap<String, Drawable.ConstantState> V;
    private final View.OnClickListener W;

    /* renamed from: a  reason: collision with root package name */
    final SearchAutoComplete f1408a;
    private final TextView.OnEditorActionListener aa;
    private final AdapterView.OnItemClickListener ab;
    private final AdapterView.OnItemSelectedListener ac;
    private TextWatcher ad;

    /* renamed from: b  reason: collision with root package name */
    final View f1409b;

    /* renamed from: c  reason: collision with root package name */
    final ImageView f1410c;

    /* renamed from: d  reason: collision with root package name */
    final ImageView f1411d;

    /* renamed from: e  reason: collision with root package name */
    final ImageView f1412e;

    /* renamed from: h  reason: collision with root package name */
    final ImageView f1413h;

    /* renamed from: i  reason: collision with root package name */
    final View f1414i;

    /* renamed from: j  reason: collision with root package name */
    final Intent f1415j;

    /* renamed from: k  reason: collision with root package name */
    final Intent f1416k;

    /* renamed from: l  reason: collision with root package name */
    View.OnFocusChangeListener f1417l;

    /* renamed from: m  reason: collision with root package name */
    d f1418m;
    public boolean n;
    public boolean o;
    androidx.d.a.a p;
    public boolean q;
    public boolean r;
    SearchableInfo s;
    Bundle t;
    View.OnKeyListener v;
    private final View w;
    private final View x;
    private e y;
    private Rect z;

    public interface b {
        static {
            Covode.recordClassIndex(427);
        }

        boolean a();
    }

    public interface c {
        static {
            Covode.recordClassIndex(428);
        }

        boolean a();
    }

    public interface d {
        static {
            Covode.recordClassIndex(429);
        }

        boolean a();

        boolean b();
    }

    public int getMaxWidth() {
        return this.N;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.G;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.F;
    }

    public androidx.d.a.a getSuggestionsAdapter() {
        return this.p;
    }

    private void m() {
        post(this.T);
    }

    public int getImeOptions() {
        return this.f1408a.getImeOptions();
    }

    public int getInputType() {
        return this.f1408a.getInputType();
    }

    public CharSequence getQuery() {
        return this.f1408a.getText();
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class androidx.appcompat.widget.SearchView.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(423);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        boolean f1429a;

        static {
            Covode.recordClassIndex(422);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1429a + "}";
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeValue(Boolean.valueOf(this.f1429a));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1429a = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    public static class SearchAutoComplete extends d {

        /* renamed from: a  reason: collision with root package name */
        boolean f1430a;

        /* renamed from: b  reason: collision with root package name */
        final Runnable f1431b;

        /* renamed from: c  reason: collision with root package name */
        private int f1432c;

        /* renamed from: d  reason: collision with root package name */
        private SearchView f1433d;

        static {
            Covode.recordClassIndex(424);
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        public boolean enoughToFilter() {
            if (this.f1432c <= 0 || super.enoughToFilter()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 >= 600) {
                return 192;
            }
            if (i2 < 640 || i3 < 480) {
                return 160;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f1433d = searchView;
        }

        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f1432c = i2;
        }

        @Override // androidx.appcompat.widget.d
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1430a) {
                removeCallbacks(this.f1431b);
                post(this.f1431b);
            }
            return onCreateInputConnection;
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1433d.hasFocus() && getVisibility() == 0) {
                this.f1430a = true;
                if (getContext().getResources().getConfiguration().orientation == 2) {
                    SearchView.u.c(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) a(getContext(), "input_method");
            if (!z) {
                this.f1430a = false;
                removeCallbacks(this.f1431b);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1430a = false;
                removeCallbacks(this.f1431b);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1430a = true;
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, (byte) 0);
        }

        public static Object a(Context context, String str) {
            Object systemService;
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!i.f107220b && "connectivity".equals(str)) {
                    try {
                        new com.bytedance.platform.godzilla.b.b.b().a();
                        i.f107220b = true;
                        return context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                return context.getSystemService(str);
            } else if (!i.f107219a) {
                return context.getSystemService(str);
            } else {
                synchronized (ClipboardManager.class) {
                    systemService = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                }
                return systemService;
            }
        }

        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1433d.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i2, Rect rect) {
            super.onFocusChanged(z, i2, rect);
            this.f1433d.h();
        }

        private SearchAutoComplete(Context context, AttributeSet attributeSet, byte b2) {
            super(context, attributeSet, (byte) 0);
            this.f1431b = new Runnable() {
                /* class androidx.appcompat.widget.SearchView.SearchAutoComplete.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(425);
                }

                public final void run() {
                    SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                    if (searchAutoComplete.f1430a) {
                        ((InputMethodManager) SearchAutoComplete.a(searchAutoComplete.getContext(), "input_method")).showSoftInput(searchAutoComplete, 0);
                        searchAutoComplete.f1430a = false;
                    }
                }
            };
            this.f1432c = getThreshold();
        }
    }

    static {
        Covode.recordClassIndex(411);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.ar);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.as);
    }

    private boolean j() {
        if ((this.q || this.O) && !this.o) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        a aVar = u;
        aVar.a(this.f1408a);
        aVar.b(this.f1408a);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.T);
        post(this.U);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1429a = this.o;
        return savedState;
    }

    private void k() {
        int i2;
        if (!j() || !(this.f1411d.getVisibility() == 0 || this.f1413h.getVisibility() == 0)) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        this.x.setVisibility(i2);
    }

    private void n() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1408a;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(b(queryHint));
    }

    public void clearFocus() {
        this.M = true;
        super.clearFocus();
        this.f1408a.clearFocus();
        this.f1408a.setImeVisibility(false);
        this.M = false;
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        a(false);
        this.f1408a.requestFocus();
        this.f1408a.setImeVisibility(true);
        View.OnClickListener onClickListener = this.K;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        a(this.o);
        m();
        if (this.f1408a.hasFocus()) {
            i();
        }
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private Method f1435a;

        /* renamed from: b  reason: collision with root package name */
        private Method f1436b;

        /* renamed from: c  reason: collision with root package name */
        private Method f1437c;

        static {
            Covode.recordClassIndex(426);
        }

        a() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1435a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1436b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1437c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f1435a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f1436b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void c(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f1437c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, true);
                } catch (Exception unused) {
                }
            }
        }
    }

    private void l() {
        int[] iArr;
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f1408a.getText());
        int i2 = 0;
        if (!z3 && (!this.n || this.R)) {
            z2 = false;
        }
        ImageView imageView = this.f1412e;
        if (!z2) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.f1412e.getDrawable();
        if (drawable != null) {
            if (z3) {
                iArr = ENABLED_STATE_SET;
            } else {
                iArr = EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        int[] iArr;
        if (this.f1408a.hasFocus()) {
            iArr = FOCUSED_STATE_SET;
        } else {
            iArr = EMPTY_STATE_SET;
        }
        Drawable background = this.f1409b.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.x.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        Editable text = this.f1408a.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            c cVar = this.I;
            if (cVar != null) {
                text.toString();
                if (cVar.a()) {
                    return;
                }
            }
            if (this.s != null) {
                a(text.toString());
            }
            this.f1408a.setImeVisibility(false);
            this.f1408a.dismissDropDown();
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        if (!TextUtils.isEmpty(this.f1408a.getText())) {
            this.f1408a.setText("");
            this.f1408a.requestFocus();
            this.f1408a.setImeVisibility(true);
        } else if (this.n) {
            b bVar = this.J;
            if (bVar == null || !bVar.a()) {
                clearFocus();
                a(true);
            }
        }
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.L;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.s;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.H;
        }
        return getContext().getText(this.s.getHintId());
    }

    @Override // androidx.appcompat.view.c
    public final void b() {
        this.f1408a.setText("");
        SearchAutoComplete searchAutoComplete = this.f1408a;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.Q = "";
        clearFocus();
        a(true);
        this.f1408a.setImeOptions(this.S);
        this.R = false;
    }

    @Override // androidx.appcompat.view.c
    public final void a() {
        if (!this.R) {
            this.R = true;
            int imeOptions = this.f1408a.getImeOptions();
            this.S = imeOptions;
            this.f1408a.setImeOptions(imeOptions | 33554432);
            this.f1408a.setText("");
            setIconified(false);
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.t = bundle;
    }

    public void setOnCloseListener(b bVar) {
        this.J = bVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1417l = onFocusChangeListener;
    }

    public void setOnQueryTextListener(c cVar) {
        this.I = cVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.K = onClickListener;
    }

    public void setOnSuggestionListener(d dVar) {
        this.f1418m = dVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        m();
    }

    public void setImeOptions(int i2) {
        this.f1408a.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.f1408a.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.N = i2;
        requestLayout();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.L = charSequence;
        n();
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.q = z2;
        a(this.o);
    }

    public void setSuggestionsAdapter(androidx.d.a.a aVar) {
        this.p = aVar;
        this.f1408a.setAdapter(aVar);
    }

    private void a(Intent intent) {
        if (intent != null) {
            try {
                a(getContext(), intent);
            } catch (RuntimeException unused) {
            }
        }
    }

    public void setIconified(boolean z2) {
        if (z2) {
            f();
        } else {
            g();
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.n != z2) {
            this.n = z2;
            a(z2);
            n();
        }
    }

    private void b(boolean z2) {
        int i2;
        if (!this.q || !j() || !hasFocus() || (!z2 && this.O)) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        this.f1411d.setVisibility(i2);
    }

    private void c(boolean z2) {
        int i2 = 8;
        if (this.O && !this.o && z2) {
            this.f1411d.setVisibility(8);
            i2 = 0;
        }
        this.f1413h.setVisibility(i2);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        a(getContext(), a("android.intent.action.SEARCH", null, null, str, 0, null));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f2667d);
        a(savedState.f1429a);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void setQuery(CharSequence charSequence) {
        int length;
        this.f1408a.setText(charSequence);
        SearchAutoComplete searchAutoComplete = this.f1408a;
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    public void setQueryRefinementEnabled(boolean z2) {
        int i2;
        this.r = z2;
        androidx.d.a.a aVar = this.p;
        if (aVar instanceof ag) {
            ag agVar = (ag) aVar;
            if (z2) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            agVar.f1523a = i2;
        }
    }

    private CharSequence b(CharSequence charSequence) {
        if (!this.n || this.E == null) {
            return charSequence;
        }
        double textSize = (double) this.f1408a.getTextSize();
        Double.isNaN(textSize);
        int i2 = (int) (textSize * 1.25d);
        this.E.setBounds(0, 0, i2, i2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean c(int i2) {
        Cursor a2 = this.p.a();
        if (a2 == null || !a2.moveToPosition(i2)) {
            return false;
        }
        a(a(a2));
        return true;
    }

    static class e extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        private final View f1438a;

        /* renamed from: b  reason: collision with root package name */
        private final Rect f1439b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        private final Rect f1440c = new Rect();

        /* renamed from: d  reason: collision with root package name */
        private final Rect f1441d = new Rect();

        /* renamed from: e  reason: collision with root package name */
        private final int f1442e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1443f;

        static {
            Covode.recordClassIndex(430);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
            if (r7.f1441d.contains(r4, r3) == false) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
            if (1 != 0) goto L_0x002f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.e.onTouchEvent(android.view.MotionEvent):boolean");
        }

        public final void a(Rect rect, Rect rect2) {
            this.f1439b.set(rect);
            this.f1441d.set(rect);
            Rect rect3 = this.f1441d;
            int i2 = this.f1442e;
            rect3.inset(-i2, -i2);
            this.f1440c.set(rect2);
        }

        public e(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1442e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.f1438a = view;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r12.getPosition();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0062 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.content.Intent a(android.database.Cursor r12) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.a(android.database.Cursor):android.content.Intent");
    }

    private void a(boolean z2) {
        int i2;
        int i3;
        this.o = z2;
        int i4 = 0;
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        boolean z3 = !TextUtils.isEmpty(this.f1408a.getText());
        this.f1410c.setVisibility(i2);
        b(z3);
        View view = this.w;
        if (z2) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        view.setVisibility(i3);
        if (this.D.getDrawable() == null || this.n) {
            i4 = 8;
        }
        this.D.setVisibility(i4);
        l();
        c(!z3);
        k();
    }

    /* access modifiers changed from: package-private */
    public final boolean b(int i2) {
        d dVar = this.f1418m;
        if (dVar != null && dVar.b()) {
            return false;
        }
        c(i2);
        this.f1408a.setImeVisibility(false);
        this.f1408a.dismissDropDown();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        if (getContext().getPackageManager().resolveActivity(r1, 65536) != null) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
        // Method dump skipped, instructions count: 177
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(CharSequence charSequence) {
        Editable text = this.f1408a.getText();
        this.Q = text;
        boolean z2 = !TextUtils.isEmpty(text);
        b(z2);
        c(!z2);
        l();
        k();
        if (this.I != null && !TextUtils.equals(charSequence, this.P)) {
            charSequence.toString();
        }
        this.P = charSequence.toString();
    }

    public static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ab2);
    }

    public boolean requestFocus(int i2, Rect rect) {
        if (this.M || !isFocusable()) {
            return false;
        }
        if (this.o) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.f1408a.requestFocus(i2, rect);
        if (requestFocus) {
            a(false);
        }
        return requestFocus;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onMeasure(int i2, int i3) {
        int i4;
        if (this.o) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.N;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.N;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.N) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i2, KeyEvent keyEvent) {
        int i3;
        if (this.s != null && this.p != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return b(this.f1408a.getListSelection());
            }
            if (i2 == 21) {
                i3 = 0;
            } else if (i2 == 22) {
                i3 = this.f1408a.length();
            } else if (i2 != 19 || this.f1408a.getListSelection() == 0) {
                return false;
            }
            this.f1408a.setSelection(i3);
            this.f1408a.setListSelection(0);
            this.f1408a.clearListSelection();
            u.c(this.f1408a);
            return true;
        }
        return false;
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.T = new Runnable() {
            /* class androidx.appcompat.widget.SearchView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(412);
            }

            public final void run() {
                SearchView.this.d();
            }
        };
        this.U = new Runnable() {
            /* class androidx.appcompat.widget.SearchView.AnonymousClass3 */

            static {
                Covode.recordClassIndex(415);
            }

            public final void run() {
                if (SearchView.this.p != null && (SearchView.this.p instanceof ag)) {
                    SearchView.this.p.a((Cursor) null);
                }
            }
        };
        this.V = new WeakHashMap<>();
        AnonymousClass6 r14 = new View.OnClickListener() {
            /* class androidx.appcompat.widget.SearchView.AnonymousClass6 */

            static {
                Covode.recordClassIndex(418);
            }

            public final void onClick(View view) {
                String str;
                String str2;
                if (view == SearchView.this.f1410c) {
                    SearchView.this.g();
                } else if (view == SearchView.this.f1412e) {
                    SearchView.this.f();
                } else if (view == SearchView.this.f1411d) {
                    SearchView.this.e();
                } else if (view == SearchView.this.f1413h) {
                    SearchView searchView = SearchView.this;
                    if (searchView.s != null) {
                        SearchableInfo searchableInfo = searchView.s;
                        try {
                            String str3 = null;
                            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                                Intent intent = new Intent(searchView.f1415j);
                                ComponentName searchActivity = searchableInfo.getSearchActivity();
                                if (searchActivity != null) {
                                    str3 = searchActivity.flattenToShortString();
                                }
                                intent.putExtra("calling_package", str3);
                                SearchView.a(searchView.getContext(), intent);
                            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                                Intent intent2 = searchView.f1416k;
                                ComponentName searchActivity2 = searchableInfo.getSearchActivity();
                                Intent intent3 = new Intent("android.intent.action.SEARCH");
                                intent3.setComponent(searchActivity2);
                                PendingIntent activity = PendingIntent.getActivity(searchView.getContext(), 0, intent3, 1073741824);
                                Bundle bundle = new Bundle();
                                if (searchView.t != null) {
                                    bundle.putParcelable("app_data", searchView.t);
                                }
                                Intent intent4 = new Intent(intent2);
                                String str4 = "free_form";
                                int i2 = 1;
                                Resources resources = searchView.getResources();
                                if (searchableInfo.getVoiceLanguageModeId() != 0) {
                                    str4 = resources.getString(searchableInfo.getVoiceLanguageModeId());
                                }
                                if (searchableInfo.getVoicePromptTextId() != 0) {
                                    str = resources.getString(searchableInfo.getVoicePromptTextId());
                                } else {
                                    str = null;
                                }
                                if (searchableInfo.getVoiceLanguageId() != 0) {
                                    str2 = resources.getString(searchableInfo.getVoiceLanguageId());
                                } else {
                                    str2 = null;
                                }
                                if (searchableInfo.getVoiceMaxResults() != 0) {
                                    i2 = searchableInfo.getVoiceMaxResults();
                                }
                                intent4.putExtra("android.speech.extra.LANGUAGE_MODEL", str4);
                                intent4.putExtra("android.speech.extra.PROMPT", str);
                                intent4.putExtra("android.speech.extra.LANGUAGE", str2);
                                intent4.putExtra("android.speech.extra.MAX_RESULTS", i2);
                                if (searchActivity2 != null) {
                                    str3 = searchActivity2.flattenToShortString();
                                }
                                intent4.putExtra("calling_package", str3);
                                intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
                                intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
                                SearchView.a(searchView.getContext(), intent4);
                            }
                        } catch (ActivityNotFoundException unused) {
                        }
                    }
                } else if (view == SearchView.this.f1408a) {
                    SearchView.this.i();
                }
            }
        };
        this.W = r14;
        this.v = new View.OnKeyListener() {
            /* class androidx.appcompat.widget.SearchView.AnonymousClass7 */

            static {
                Covode.recordClassIndex(419);
            }

            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                if (SearchView.this.s == null) {
                    return false;
                }
                if (SearchView.this.f1408a.isPopupShowing() && SearchView.this.f1408a.getListSelection() != -1) {
                    return SearchView.this.a(i2, keyEvent);
                }
                if (TextUtils.getTrimmedLength(SearchView.this.f1408a.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView = SearchView.this;
                searchView.a(searchView.f1408a.getText().toString());
                return true;
            }
        };
        AnonymousClass8 r13 = new TextView.OnEditorActionListener() {
            /* class androidx.appcompat.widget.SearchView.AnonymousClass8 */

            static {
                Covode.recordClassIndex(420);
            }

            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                SearchView.this.e();
                return true;
            }
        };
        this.aa = r13;
        AnonymousClass9 r12 = new AdapterView.OnItemClickListener() {
            /* class androidx.appcompat.widget.SearchView.AnonymousClass9 */

            static {
                Covode.recordClassIndex(421);
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                SearchView.this.b(i2);
            }
        };
        this.ab = r12;
        AnonymousClass10 r11 = new AdapterView.OnItemSelectedListener() {
            /* class androidx.appcompat.widget.SearchView.AnonymousClass10 */

            static {
                Covode.recordClassIndex(413);
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
                SearchView searchView = SearchView.this;
                if (searchView.f1418m == null || !searchView.f1418m.a()) {
                    Editable text = searchView.f1408a.getText();
                    Cursor a2 = searchView.p.a();
                    if (a2 == null) {
                        return;
                    }
                    if (a2.moveToPosition(i2)) {
                        CharSequence b2 = searchView.p.b(a2);
                        if (b2 != null) {
                            searchView.setQuery(b2);
                        } else {
                            searchView.setQuery(text);
                        }
                    } else {
                        searchView.setQuery(text);
                    }
                }
            }
        };
        this.ac = r11;
        this.ad = new TextWatcher() {
            /* class androidx.appcompat.widget.SearchView.AnonymousClass2 */

            static {
                Covode.recordClassIndex(414);
            }

            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                SearchView.this.a(charSequence);
            }
        };
        al a2 = al.a(context, attributeSet, new int[]{16842970, 16843039, 16843296, 16843364, R.attr.nx, R.attr.pg, R.attr.r6, R.attr.v4, R.attr.w8, R.attr.za, R.attr.a8l, R.attr.a8m, R.attr.ab0, R.attr.ab1, R.attr.afw, R.attr.ag2, R.attr.at6}, i2, 0);
        com.a.a(LayoutInflater.from(context), a2.g(9, R.layout.aq), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.dvo);
        this.f1408a = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.w = findViewById(R.id.dup);
        View findViewById = findViewById(R.id.dvi);
        this.f1409b = findViewById;
        View findViewById2 = findViewById(R.id.edp);
        this.x = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.dud);
        this.f1410c = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.dux);
        this.f1411d = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.duj);
        this.f1412e = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.dw3);
        this.f1413h = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.dv9);
        this.D = imageView5;
        v.a(findViewById, a2.a(10));
        v.a(findViewById2, a2.a(14));
        imageView.setImageDrawable(a2.a(13));
        imageView2.setImageDrawable(a2.a(7));
        imageView3.setImageDrawable(a2.a(4));
        imageView4.setImageDrawable(a2.a(16));
        imageView5.setImageDrawable(a2.a(13));
        this.E = a2.a(12);
        an.a(imageView, getResources().getString(R.string.md));
        this.F = a2.g(15, R.layout.ap);
        this.G = a2.g(5, 0);
        imageView.setOnClickListener(r14);
        imageView3.setOnClickListener(r14);
        imageView2.setOnClickListener(r14);
        imageView4.setOnClickListener(r14);
        searchAutoComplete.setOnClickListener(r14);
        searchAutoComplete.addTextChangedListener(this.ad);
        searchAutoComplete.setOnEditorActionListener(r13);
        searchAutoComplete.setOnItemClickListener(r12);
        searchAutoComplete.setOnItemSelectedListener(r11);
        searchAutoComplete.setOnKeyListener(this.v);
        searchAutoComplete.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class androidx.appcompat.widget.SearchView.AnonymousClass4 */

            static {
                Covode.recordClassIndex(416);
            }

            public final void onFocusChange(View view, boolean z) {
                if (SearchView.this.f1417l != null) {
                    SearchView.this.f1417l.onFocusChange(SearchView.this, z);
                }
            }
        });
        setIconifiedByDefault(a2.a(8, true));
        int e2 = a2.e(1, -1);
        if (e2 != -1) {
            setMaxWidth(e2);
        }
        this.H = a2.c(6);
        this.L = a2.c(11);
        int a3 = a2.a(3, -1);
        if (a3 != -1) {
            setImeOptions(a3);
        }
        int a4 = a2.a(2, -1);
        if (a4 != -1) {
            setInputType(a4);
        }
        setFocusable(a2.a(0, true));
        a2.f1549a.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1415j = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1416k = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1414i = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                /* class androidx.appcompat.widget.SearchView.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(417);
                }

                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    int i10;
                    int i11;
                    SearchView searchView = SearchView.this;
                    if (searchView.f1414i.getWidth() > 1) {
                        Resources resources = searchView.getContext().getResources();
                        int paddingLeft = searchView.f1409b.getPaddingLeft();
                        Rect rect = new Rect();
                        boolean a2 = ar.a(searchView);
                        if (searchView.n) {
                            i10 = resources.getDimensionPixelSize(R.dimen.ah) + resources.getDimensionPixelSize(R.dimen.ai);
                        } else {
                            i10 = 0;
                        }
                        searchView.f1408a.getDropDownBackground().getPadding(rect);
                        if (a2) {
                            i11 = -rect.left;
                        } else {
                            i11 = paddingLeft - (rect.left + i10);
                        }
                        searchView.f1408a.setDropDownHorizontalOffset(i11);
                        searchView.f1408a.setDropDownWidth((((searchView.f1414i.getWidth() + rect.left) + rect.right) + i10) - paddingLeft);
                    }
                }
            });
        }
        a(this.n);
        n();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            SearchAutoComplete searchAutoComplete = this.f1408a;
            Rect rect = this.z;
            searchAutoComplete.getLocationInWindow(this.B);
            getLocationInWindow(this.C);
            int[] iArr = this.B;
            int i6 = iArr[1];
            int[] iArr2 = this.C;
            int i7 = i6 - iArr2[1];
            int i8 = iArr[0] - iArr2[0];
            rect.set(i8, i7, searchAutoComplete.getWidth() + i8, searchAutoComplete.getHeight() + i7);
            this.A.set(this.z.left, 0, this.z.right, i5 - i3);
            e eVar = this.y;
            if (eVar == null) {
                e eVar2 = new e(this.A, this.z, this.f1408a);
                this.y = eVar2;
                setTouchDelegate(eVar2);
                return;
            }
            eVar.a(this.A, this.z);
        }
    }

    private Intent a(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.Q);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.t;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.s.getSearchActivity());
        return intent;
    }
}
