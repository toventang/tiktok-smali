package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a;

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
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

public abstract class j extends a {

    /* renamed from: a  reason: collision with root package name */
    protected EditText f78035a;

    /* renamed from: b  reason: collision with root package name */
    protected Button f78036b;

    static {
        Covode.recordClassIndex(48383);
    }

    /* access modifiers changed from: protected */
    public abstract void a(String str);

    /* access modifiers changed from: protected */
    public int c() {
        return R.string.ghc;
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
        this.f78035a = editText;
        final View.OnFocusChangeListener onFocusChangeListener = editText.getOnFocusChangeListener();
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.j.AnonymousClass3 */

            static {
                Covode.recordClassIndex(48386);
            }

            public final void onFocusChange(View view, boolean z) {
                view.post(new Runnable() {
                    /* class com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.j.AnonymousClass3.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(48387);
                    }

                    public final void run() {
                        if (j.this.getActivity() != null && j.this.ab_()) {
                            ((InputMethodManager) a(j.this.getActivity(), "input_method")).showSoftInput(editText, 1);
                        }
                    }

                    private static Object a(e eVar, String str) {
                        Object obj;
                        MethodCollector.i(8539);
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
                                    MethodCollector.o(8539);
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
            /* class com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.j.AnonymousClass4 */

            static {
                Covode.recordClassIndex(48388);
            }

            public final void run() {
                editText.requestFocus();
            }
        });
        Button button = (Button) view.findViewById(R.id.cph);
        this.f78036b = button;
        button.setVisibility(0);
        this.f78036b.setAlpha(0.5f);
        this.f78036b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.j.AnonymousClass1 */

            static {
                Covode.recordClassIndex(48384);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                String obj = j.this.f78035a.getText().toString();
                if (TextUtils.isEmpty(obj) || obj.length() != 4) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(j.this.getContext()).a(j.this.c()).a();
                } else {
                    j.this.a(obj);
                }
            }
        });
        this.f78035a.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.j.AnonymousClass2 */

            static {
                Covode.recordClassIndex(48385);
            }

            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            public final void afterTextChanged(Editable editable) {
                if (editable.length() == 4) {
                    j.this.f78036b.setAlpha(1.0f);
                } else {
                    j.this.f78036b.setAlpha(0.5f);
                }
            }
        });
    }
}
