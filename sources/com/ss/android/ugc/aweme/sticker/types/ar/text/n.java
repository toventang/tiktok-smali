package com.ss.android.ugc.aweme.sticker.types.ar.text;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

public class n extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    protected EditText f135864a;

    /* renamed from: b  reason: collision with root package name */
    protected View f135865b;

    /* renamed from: c  reason: collision with root package name */
    protected View f135866c;

    /* renamed from: d  reason: collision with root package name */
    protected View f135867d;

    /* renamed from: e  reason: collision with root package name */
    protected InputMethodManager f135868e;

    /* renamed from: f  reason: collision with root package name */
    protected a f135869f;

    /* renamed from: g  reason: collision with root package name */
    protected String f135870g;

    /* renamed from: h  reason: collision with root package name */
    protected int f135871h;

    /* renamed from: i  reason: collision with root package name */
    protected String f135872i;

    /* renamed from: j  reason: collision with root package name */
    protected h.f.a.a<Integer> f135873j;

    public interface a {
        static {
            Covode.recordClassIndex(88796);
        }

        void a(String str);

        void b(String str);
    }

    static {
        Covode.recordClassIndex(88795);
    }

    public void a(int i2) {
    }

    /* access modifiers changed from: package-private */
    public int getLayout() {
        return R.layout.ah_;
    }

    public TextWatcher getTextWatcher() {
        return null;
    }

    public void a() {
        e();
    }

    public final void d() {
        this.f135864a.requestFocus();
        setVisibility(0);
    }

    /* renamed from: b */
    public final void e() {
        InputMethodManager inputMethodManager;
        EditText editText = this.f135864a;
        if (editText != null && (inputMethodManager = this.f135868e) != null) {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    public final void c() {
        EditText editText = this.f135864a;
        if (editText != null && this.f135868e != null) {
            editText.requestFocus();
            this.f135868e.showSoftInput(this.f135864a, 0);
        }
    }

    public String getText() {
        EditText editText = this.f135864a;
        if (editText == null || editText.getEditableText() == null) {
            return null;
        }
        return this.f135864a.getEditableText().toString();
    }

    public void setEffectTextChangeListener(a aVar) {
        this.f135869f = aVar;
    }

    public void setMaxTextCount(int i2) {
        this.f135871h = i2;
    }

    public void setTopMarginSupplier(h.f.a.a<Integer> aVar) {
        this.f135873j = aVar;
    }

    public n(Context context) {
        this(context, null);
    }

    public void setHintText(String str) {
        if (this.f135864a != null && !TextUtils.isEmpty(str)) {
            this.f135864a.setHint(str);
        }
    }

    public void setText(String str) {
        EditText editText = this.f135864a;
        if (editText != null && str != null) {
            editText.setText(str);
            int length = str.length();
            if (length < this.f135864a.getText().length()) {
                this.f135864a.setSelection(length);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(Context context) {
        MethodCollector.i(9052);
        setVisibility(8);
        this.f135866c = LayoutInflater.from(context).inflate(getLayout(), this);
        this.f135864a = (EditText) findViewById(R.id.atq);
        TextWatcher textWatcher = getTextWatcher();
        if (textWatcher != null) {
            this.f135864a.addTextChangedListener(textWatcher);
        }
        View findViewById = findViewById(R.id.ef9);
        this.f135865b = findViewById;
        findViewById.setOnClickListener(new o(this));
        this.f135867d = findViewById(R.id.emo);
        setOnClickListener(new p(this));
        MethodCollector.o(9052);
    }

    public n(Context context, AttributeSet attributeSet) {
        super(context, null);
        MethodCollector.i(8531);
        a(context);
        this.f135868e = (InputMethodManager) a(context, "input_method");
        this.f135870g = context.getResources().getString(R.string.f9t);
        MethodCollector.o(8531);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(8851);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(8851);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
