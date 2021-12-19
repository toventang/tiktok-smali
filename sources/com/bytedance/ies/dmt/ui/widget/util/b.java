package com.bytedance.ies.dmt.ui.widget.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.zhiliaoapp.musically.R;
import java.util.Map;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f33785a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f33786b;

    static {
        Covode.recordClassIndex(20062);
    }

    private b() {
    }

    public static b a() {
        MethodCollector.i(13424);
        if (f33785a == null) {
            synchronized (b.class) {
                try {
                    if (f33785a == null) {
                        f33785a = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13424);
                    throw th;
                }
            }
        }
        b bVar = f33785a;
        MethodCollector.o(13424);
        return bVar;
    }

    public final synchronized Typeface a(String str) {
        MethodCollector.i(13657);
        if (!this.f33786b) {
            MethodCollector.o(13657);
            return null;
        }
        Typeface a2 = a.a().a(str);
        MethodCollector.o(13657);
        return a2;
    }

    public final synchronized void a(TextView textView, String str) {
        MethodCollector.i(13656);
        if (textView == null || !this.f33786b) {
            MethodCollector.o(13656);
            return;
        }
        Typeface a2 = a(str);
        if (a2 != null) {
            textView.setTypeface(a2);
        }
        MethodCollector.o(13656);
    }

    public final synchronized void a(Context context, Map<String, String> map) {
        MethodCollector.i(13516);
        this.f33786b = false;
        if (!(context == null || map == null || map.size() <= 0)) {
            if (a.f33779a != null) {
                a.f33779a.f33784e = null;
                if (a.f33779a.f33783d != null) {
                    a.f33779a.f33783d.clear();
                    a.f33779a.f33783d = null;
                }
                if (a.f33779a.f33782c != null) {
                    a.f33779a.f33782c.clear();
                    a.f33779a.f33782c = null;
                }
                a.f33779a = null;
            }
            a a2 = a.a();
            Context applicationContext = context.getApplicationContext();
            if (a.f107168c) {
                if (applicationContext == null) {
                    applicationContext = a.f107166a;
                }
            }
            a2.f33784e = applicationContext;
            a2.f33783d = map;
            if (a2.f33783d != null && a2.f33783d.size() >= 0) {
                for (String str : a2.f33783d.keySet()) {
                    if (TextUtils.isEmpty(str)) {
                        break;
                    }
                    a2.a(a.f33780b.get(str).intValue());
                }
            }
            this.f33786b = true;
        }
        MethodCollector.o(13516);
    }

    public final synchronized void a(TextView textView, AttributeSet attributeSet) {
        MethodCollector.i(13581);
        int i2 = 1;
        if (attributeSet != null) {
            if (this.f33786b) {
                TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.uq, R.attr.ut, R.attr.uu});
                boolean z = obtainStyledAttributes.getBoolean(2, false);
                obtainStyledAttributes.recycle();
                if (z) {
                    textView.setIncludeFontPadding(true);
                }
            } else {
                TypedArray obtainStyledAttributes2 = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.uq, R.attr.ut, R.attr.uu});
                boolean z2 = obtainStyledAttributes2.getBoolean(1, false);
                obtainStyledAttributes2.recycle();
                if (!z2) {
                    textView.setIncludeFontPadding(true);
                }
            }
        }
        if (!this.f33786b) {
            MethodCollector.o(13581);
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes3 = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.uq, R.attr.ut, R.attr.uu});
            i2 = obtainStyledAttributes3.getInt(0, 1);
            obtainStyledAttributes3.recycle();
        }
        Typeface a2 = a.a().a(i2);
        if (a2 != null) {
            textView.setTypeface(a2);
        }
        MethodCollector.o(13581);
    }
}
