package com.ss.android.ugc.aweme.account.common.widget.datepicker;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.account.common.widget.datepicker.NumberPicker;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DatePicker extends LinearLayout implements NumberPicker.b {

    /* renamed from: a  reason: collision with root package name */
    public a f62899a;

    /* renamed from: b  reason: collision with root package name */
    private NumberPicker f62900b = ((NumberPicker) findViewById(R.id.fnp));

    /* renamed from: c  reason: collision with root package name */
    private NumberPicker f62901c = ((NumberPicker) findViewById(R.id.cni));

    /* renamed from: d  reason: collision with root package name */
    private NumberPicker f62902d = ((NumberPicker) findViewById(R.id.aih));

    /* renamed from: e  reason: collision with root package name */
    private LinearLayout f62903e = ((LinearLayout) findViewById(R.id.d1u));

    /* renamed from: f  reason: collision with root package name */
    private Calendar f62904f;

    /* renamed from: g  reason: collision with root package name */
    private Calendar f62905g;

    /* renamed from: h  reason: collision with root package name */
    private final LayoutInflater f62906h;

    public interface a {
        static {
            Covode.recordClassIndex(38753);
        }

        void a(DatePicker datePicker, int i2, int i3, int i4, Calendar calendar, int i5);
    }

    static {
        Covode.recordClassIndex(38752);
    }

    public int getDayOfMonth() {
        return this.f62904f.get(5);
    }

    public int getYear() {
        return this.f62904f.get(1);
    }

    public int getMonth() {
        return this.f62904f.get(2) + 1;
    }

    private void a() {
        MethodCollector.i(9437);
        String pattern = ((SimpleDateFormat) DateFormat.getDateInstance(3, new Locale(((ILanguageService) com.ss.android.ugc.aweme.a.a(ILanguageService.class)).a(), d.a()))).toPattern();
        this.f62903e.removeAllViews();
        char[] a2 = a(pattern);
        int i2 = 0;
        do {
            char c2 = a2[i2];
            if (c2 == 'M') {
                this.f62903e.addView(this.f62901c);
            } else if (c2 == 'd') {
                this.f62903e.addView(this.f62902d);
            } else if (c2 == 'y') {
                this.f62903e.addView(this.f62900b);
            }
            i2++;
        } while (i2 < 3);
        MethodCollector.o(9437);
    }

    public void setNonRecurrentForYear(boolean z) {
        this.f62900b.setNonRecurrent(z);
    }

    public void setStartYear(int i2) {
        this.f62900b.a(i2);
    }

    public void setSoundEffectsEnabled(boolean z) {
        super.setSoundEffectsEnabled(z);
        this.f62900b.setSoundEffectsEnabled(z);
        this.f62901c.setSoundEffectsEnabled(z);
        this.f62902d.setSoundEffectsEnabled(z);
    }

    public final DatePicker a(Date date) {
        if (this.f62904f == null) {
            this.f62904f = Calendar.getInstance();
        }
        this.f62904f.setTime(date);
        this.f62902d.b(this.f62904f.getActualMaximum(5));
        this.f62900b.c(this.f62904f.get(1));
        this.f62901c.c(this.f62904f.get(2) + 1);
        this.f62902d.c(this.f62904f.get(5));
        return this;
    }

    public void setUpperBoundDate(Calendar calendar) {
        this.f62905g = calendar;
        if (calendar != null) {
            this.f62900b.b(calendar.get(1));
            if (this.f62904f.get(1) == this.f62905g.get(1)) {
                this.f62901c.b(this.f62905g.get(2) + 1);
                if (this.f62904f.get(2) == this.f62905g.get(2)) {
                    this.f62902d.b(this.f62905g.get(5));
                }
            }
        }
    }

    private static char[] a(String str) {
        char[] cArr = new char[3];
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (charAt != 'd') {
                if (charAt == 'L' || charAt == 'M') {
                    if (!z2) {
                        cArr[i2] = 'M';
                        i2++;
                        z2 = true;
                    } else if (charAt != 'y') {
                    }
                } else if (charAt != 'y') {
                }
                if (!z3) {
                    cArr[i2] = 'y';
                    i2++;
                    z3 = true;
                }
            } else if (!z) {
                cArr[i2] = 'd';
                i2++;
                z = true;
            }
        }
        if (!z) {
            cArr[i2] = 'd';
            i2++;
        }
        if (!z2) {
            cArr[i2] = 'M';
            i2++;
        }
        if (!z3) {
            cArr[i2] = 'y';
        }
        return cArr;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9237);
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
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(9237);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public DatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(9044);
        LayoutInflater layoutInflater = (LayoutInflater) a(context, "layout_inflater");
        this.f62906h = layoutInflater;
        com.a.a(layoutInflater, R.layout.fu, this, true);
        this.f62900b.a(this);
        this.f62901c.a(this);
        this.f62902d.a(this);
        a();
        String upperCase = d.a().toUpperCase(Locale.US);
        if (!"CN".equals(upperCase) && !"TW".equals(upperCase)) {
            this.f62901c.a(getResources().getStringArray(R.array.a8));
        }
        Calendar instance = Calendar.getInstance();
        this.f62904f = instance;
        a(instance.getTime());
        MethodCollector.o(9044);
    }

    @Override // com.ss.android.ugc.aweme.account.common.widget.datepicker.NumberPicker.b
    public final void a(NumberPicker numberPicker, int i2) {
        int i3;
        if (numberPicker == this.f62900b) {
            int i4 = this.f62904f.get(5);
            int i5 = this.f62904f.get(2);
            Calendar calendar = this.f62905g;
            if (calendar == null || i2 != calendar.get(1)) {
                this.f62901c.b(this.f62904f.getActualMaximum(2) + 1);
            } else {
                if (i5 > this.f62905g.get(2)) {
                    i5 = this.f62905g.get(2);
                }
                this.f62901c.b(this.f62905g.get(2) + 1);
            }
            this.f62904f.set(i2, i5, 1);
            int actualMaximum = this.f62904f.getActualMaximum(5);
            Calendar calendar2 = this.f62905g;
            if (calendar2 != null && i2 == calendar2.get(1) && i5 == this.f62905g.get(2)) {
                actualMaximum = this.f62905g.get(5);
            }
            if (i4 > actualMaximum) {
                i4 = actualMaximum;
            }
            this.f62904f.set(5, i4);
            this.f62902d.b(actualMaximum);
            i3 = 1;
        } else if (numberPicker == this.f62901c) {
            int i6 = this.f62904f.get(5);
            Calendar calendar3 = this.f62904f;
            int i7 = i2 - 1;
            calendar3.set(calendar3.get(1), i7, 1);
            int actualMaximum2 = this.f62904f.getActualMaximum(5);
            if (this.f62905g != null && this.f62904f.get(1) == this.f62905g.get(1) && i7 == this.f62905g.get(2)) {
                actualMaximum2 = this.f62905g.get(5);
            }
            if (i6 > actualMaximum2) {
                i6 = actualMaximum2;
            }
            this.f62904f.set(5, i6);
            this.f62902d.b(actualMaximum2);
            i3 = 2;
        } else if (numberPicker == this.f62902d) {
            this.f62904f.set(5, i2);
            i3 = 3;
        } else {
            i3 = 0;
        }
        a aVar = this.f62899a;
        if (aVar != null) {
            aVar.a(this, getYear(), getMonth(), getDayOfMonth(), this.f62904f, i3);
        }
    }
}
