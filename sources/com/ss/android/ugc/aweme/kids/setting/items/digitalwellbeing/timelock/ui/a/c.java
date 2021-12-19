package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a;

import android.content.ClipboardManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.base.f.a;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.CheckButton;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

public abstract class c extends a {

    /* renamed from: a  reason: collision with root package name */
    protected EditText f106949a;

    /* renamed from: b  reason: collision with root package name */
    protected CheckButton f106950b;

    /* renamed from: c  reason: collision with root package name */
    protected Button f106951c;

    static {
        Covode.recordClassIndex(68413);
    }

    /* access modifiers changed from: protected */
    public abstract void b(String str);

    /* access modifiers changed from: protected */
    public int c() {
        return R.string.ghc;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(View view) {
        if (getActivity() != null) {
            ((InputMethodManager) a(getActivity(), "input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    private static Object a(e eVar, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    return eVar.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return eVar.getSystemService(str);
        } else if (!i.f107219a) {
            return eVar.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = eVar.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final EditText editText = (EditText) view.findViewById(R.id.atg);
        this.f106949a = editText;
        final View.OnFocusChangeListener onFocusChangeListener = editText.getOnFocusChangeListener();
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.c.AnonymousClass4 */

            static {
                Covode.recordClassIndex(68417);
            }

            public final void onFocusChange(View view, boolean z) {
                view.post(new Runnable() {
                    /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.c.AnonymousClass4.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(68418);
                    }

                    public final void run() {
                        if (c.this.getActivity() != null && c.this.ab_()) {
                            ((InputMethodManager) a(c.this.getActivity(), "input_method")).showSoftInput(editText, 1);
                        }
                    }

                    private static Object a(e eVar, String str) {
                        Object obj;
                        MethodCollector.i(7654);
                        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                            if (!i.f107220b && "connectivity".equals(str)) {
                                try {
                                    new b().a();
                                    i.f107220b = true;
                                    obj = eVar.getSystemService(str);
                                } catch (Throwable unused) {
                                }
                            }
                            obj = eVar.getSystemService(str);
                        } else if (i.f107219a) {
                            synchronized (ClipboardManager.class) {
                                try {
                                    obj = eVar.getSystemService(str);
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
                                    MethodCollector.o(7654);
                                }
                            }
                        } else {
                            obj = eVar.getSystemService(str);
                        }
                        return obj;
                    }
                });
                View.OnFocusChangeListener onFocusChangeListener = onFocusChangeListener;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(view, z);
                }
            }
        });
        editText.post(new Runnable() {
            /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.c.AnonymousClass5 */

            static {
                Covode.recordClassIndex(68419);
            }

            public final void run() {
                editText.requestFocus();
            }
        });
        this.f106950b = (CheckButton) view.findViewById(R.id.z8);
        Button button = (Button) view.findViewById(R.id.cph);
        this.f106951c = button;
        button.setVisibility(0);
        this.f106951c.setAlpha(0.5f);
        this.f106950b.setVisibility(8);
        this.f106950b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(68414);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                String obj = c.this.f106949a.getText().toString();
                if (!c.a(obj)) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(c.this.getContext()).a(c.this.c()).a();
                } else {
                    c.this.b(obj);
                }
            }
        });
        this.f106951c.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(68415);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                String obj = c.this.f106949a.getText().toString();
                if (!c.a(obj)) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(c.this.getContext()).a(c.this.c()).a();
                } else {
                    c.this.b(obj);
                }
            }
        });
        this.f106949a.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.c.AnonymousClass3 */

            static {
                Covode.recordClassIndex(68416);
            }

            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            public final void afterTextChanged(Editable editable) {
                if (editable.length() == 4) {
                    c.this.f106950b.setAlpha(1.0f);
                    c.this.f106951c.setAlpha(1.0f);
                    return;
                }
                c.this.f106950b.setAlpha(0.5f);
                c.this.f106951c.setAlpha(0.5f);
            }
        });
    }
}
