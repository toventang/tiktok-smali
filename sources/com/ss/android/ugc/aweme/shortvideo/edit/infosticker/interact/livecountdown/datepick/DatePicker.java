package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.b;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.c;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class DatePicker extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    Calendar f127371a;

    /* renamed from: b  reason: collision with root package name */
    public LiveCDNumberPicker f127372b;

    /* renamed from: c  reason: collision with root package name */
    public LiveCDNumberPicker f127373c;

    /* renamed from: d  reason: collision with root package name */
    public LiveCDNumberPicker f127374d;

    /* renamed from: e  reason: collision with root package name */
    final LayoutInflater f127375e;

    /* renamed from: f  reason: collision with root package name */
    a f127376f;

    static {
        Covode.recordClassIndex(83528);
    }

    public final int getDayOfMonth() {
        Calendar calendar = this.f127371a;
        if (calendar == null) {
            l.a("mCalendar");
        }
        return calendar.get(5);
    }

    public final int getYear() {
        Calendar calendar = this.f127371a;
        if (calendar == null) {
            l.a("mCalendar");
        }
        return calendar.get(1);
    }

    public final int getMonth() {
        Calendar calendar = this.f127371a;
        if (calendar == null) {
            l.a("mCalendar");
        }
        return calendar.get(2) + 1;
    }

    public final e a() {
        e eVar;
        LiveCDNumberPicker liveCDNumberPicker = this.f127372b;
        if (liveCDNumberPicker == null) {
            l.a("mMonthDayPicker");
        }
        int currentPosition = liveCDNumberPicker.getCurrentPosition();
        LiveCDNumberPicker liveCDNumberPicker2 = this.f127373c;
        if (liveCDNumberPicker2 == null) {
            l.a("mHoursPicker");
        }
        int currentPosition2 = liveCDNumberPicker2.getCurrentPosition();
        Calendar calendar = this.f127371a;
        if (calendar == null) {
            l.a("mCalendar");
        }
        l.d(calendar, "");
        int i2 = calendar.get(11);
        int i3 = calendar.get(12);
        if (currentPosition == 0) {
            if (currentPosition2 > i2) {
                i3 = 0;
            }
            eVar = new e(i2, 23, i3, 59);
        } else if (currentPosition != 30) {
            eVar = new e(0, 23, 0, 59);
        } else {
            if (currentPosition2 < i2) {
                i3 = 59;
            }
            eVar = new e(0, i2, 0, i3);
        }
        LiveCDNumberPicker liveCDNumberPicker3 = this.f127373c;
        if (liveCDNumberPicker3 == null) {
            l.a("mHoursPicker");
        }
        liveCDNumberPicker3.setMinValue(eVar.f127402a);
        LiveCDNumberPicker liveCDNumberPicker4 = this.f127373c;
        if (liveCDNumberPicker4 == null) {
            l.a("mHoursPicker");
        }
        liveCDNumberPicker4.setMaxValue(eVar.f127403b);
        LiveCDNumberPicker liveCDNumberPicker5 = this.f127373c;
        if (liveCDNumberPicker5 == null) {
            l.a("mHoursPicker");
        }
        if (liveCDNumberPicker5.getCurrentPosition() < eVar.f127402a) {
            LiveCDNumberPicker liveCDNumberPicker6 = this.f127373c;
            if (liveCDNumberPicker6 == null) {
                l.a("mHoursPicker");
            }
            liveCDNumberPicker6.a(eVar.f127402a);
        }
        LiveCDNumberPicker liveCDNumberPicker7 = this.f127373c;
        if (liveCDNumberPicker7 == null) {
            l.a("mHoursPicker");
        }
        if (liveCDNumberPicker7.getCurrentPosition() > eVar.f127403b) {
            LiveCDNumberPicker liveCDNumberPicker8 = this.f127373c;
            if (liveCDNumberPicker8 == null) {
                l.a("mHoursPicker");
            }
            liveCDNumberPicker8.a(eVar.f127403b);
        }
        LiveCDNumberPicker liveCDNumberPicker9 = this.f127373c;
        if (liveCDNumberPicker9 == null) {
            l.a("mHoursPicker");
        }
        liveCDNumberPicker9.requestLayout();
        LiveCDNumberPicker liveCDNumberPicker10 = this.f127374d;
        if (liveCDNumberPicker10 == null) {
            l.a("mMinutesPicker");
        }
        liveCDNumberPicker10.setMinValue(eVar.f127404c);
        LiveCDNumberPicker liveCDNumberPicker11 = this.f127374d;
        if (liveCDNumberPicker11 == null) {
            l.a("mMinutesPicker");
        }
        liveCDNumberPicker11.setMaxValue(eVar.f127405d);
        LiveCDNumberPicker liveCDNumberPicker12 = this.f127374d;
        if (liveCDNumberPicker12 == null) {
            l.a("mMinutesPicker");
        }
        if (liveCDNumberPicker12.getCurrentPosition() < eVar.f127404c) {
            LiveCDNumberPicker liveCDNumberPicker13 = this.f127374d;
            if (liveCDNumberPicker13 == null) {
                l.a("mMinutesPicker");
            }
            liveCDNumberPicker13.a(eVar.f127404c);
        }
        LiveCDNumberPicker liveCDNumberPicker14 = this.f127374d;
        if (liveCDNumberPicker14 == null) {
            l.a("mMinutesPicker");
        }
        if (liveCDNumberPicker14.getCurrentPosition() > eVar.f127405d) {
            LiveCDNumberPicker liveCDNumberPicker15 = this.f127374d;
            if (liveCDNumberPicker15 == null) {
                l.a("mMinutesPicker");
            }
            liveCDNumberPicker15.a(eVar.f127405d);
        }
        LiveCDNumberPicker liveCDNumberPicker16 = this.f127374d;
        if (liveCDNumberPicker16 == null) {
            l.a("mMinutesPicker");
        }
        liveCDNumberPicker16.requestLayout();
        return eVar;
    }

    public static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DatePicker f127377a;

        static {
            Covode.recordClassIndex(83529);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(DatePicker datePicker) {
            this.f127377a = datePicker;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.f
        public final void a(LiveCDNumberPicker liveCDNumberPicker, String str, String str2) {
            b bVar;
            l.d(liveCDNumberPicker, "");
            l.d(str, "");
            l.d(str2, "");
            this.f127377a.a();
            DatePicker datePicker = this.f127377a;
            LiveCDNumberPicker liveCDNumberPicker2 = datePicker.f127372b;
            if (liveCDNumberPicker2 == null) {
                l.a("mMonthDayPicker");
            }
            int currentPosition = liveCDNumberPicker2.getCurrentPosition();
            LiveCDNumberPicker liveCDNumberPicker3 = this.f127377a.f127373c;
            if (liveCDNumberPicker3 == null) {
                l.a("mHoursPicker");
            }
            int currentPosition2 = liveCDNumberPicker3.getCurrentPosition();
            LiveCDNumberPicker liveCDNumberPicker4 = this.f127377a.f127374d;
            if (liveCDNumberPicker4 == null) {
                l.a("mMinutesPicker");
            }
            int currentPosition3 = liveCDNumberPicker4.getCurrentPosition();
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(System.currentTimeMillis());
            l.d(gregorianCalendar, "");
            float f2 = (((((((float) currentPosition) * 24.0f) * 60.0f) * 60.0f) + ((((float) currentPosition2) * 60.0f) * 60.0f)) + (((float) currentPosition3) * 60.0f)) - ((((((float) gregorianCalendar.get(11)) * 60.0f) * 60.0f) + (((float) gregorianCalendar.get(12)) * 60.0f)) + ((float) gregorianCalendar.get(13)));
            if (f2 > 0.0f) {
                int i2 = (int) (f2 / 86400.0f);
                float f3 = (float) ((int) (f2 - (((((float) i2) * 24.0f) * 60.0f) * 60.0f)));
                int i3 = (int) (f3 / 3600.0f);
                float f4 = (float) ((int) (f3 - ((((float) i3) * 60.0f) * 60.0f)));
                int i4 = (int) (f4 / 60.0f);
                int i5 = (int) (f4 - (((float) i4) * 60.0f));
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
                gregorianCalendar2.setTimeInMillis(gregorianCalendar.getTimeInMillis());
                gregorianCalendar2.add(5, i2);
                gregorianCalendar2.add(11, i3);
                gregorianCalendar2.add(12, i4);
                gregorianCalendar2.add(13, i5);
                bVar = new b(String.valueOf(i2), String.valueOf(i3), String.valueOf(i4), String.valueOf(i5), c.a(gregorianCalendar2.getTimeInMillis()));
            } else {
                bVar = new b("0", "0", "0", "0", c.a(gregorianCalendar.getTimeInMillis()));
            }
            a aVar = datePicker.f127376f;
            if (aVar != null) {
                aVar.a(bVar.f127363a, bVar.f127364b, bVar.f127365c, bVar.f127366d, bVar.f127367e);
            }
        }
    }

    public final void setDateChangedListener(a aVar) {
        l.d(aVar, "");
        this.f127376f = aVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(LiveCDNumberPicker liveCDNumberPicker) {
        liveCDNumberPicker.setOnValueChangedListener(new a(this));
    }

    public final void setSelectTimeMiles(long j2) {
        Calendar calendar = this.f127371a;
        if (calendar == null) {
            l.a("mCalendar");
        }
        long timeInMillis = j2 - calendar.getTimeInMillis();
        Calendar calendar2 = this.f127371a;
        if (calendar2 == null) {
            l.a("mCalendar");
        }
        l.d(calendar2, "");
        float f2 = (float) timeInMillis;
        int i2 = (int) (f2 / 8.64E7f);
        float f3 = (float) ((int) (f2 - (((float) i2) * 8.64E7f)));
        int i3 = (int) (f3 / 3600000.0f);
        int i4 = calendar2.get(12);
        float f4 = (float) (i4 + ((int) (((float) ((int) (f3 - (((float) i3) * 3600000.0f)))) / 60000.0f)));
        float f5 = (float) (((int) (f4 / 60.0f)) + i3 + calendar2.get(11));
        int i5 = (int) (f5 % 24.0f);
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.a aVar = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.a(i2 + ((int) (f5 / 24.0f)), i5, (int) (f4 % 60.0f));
        LiveCDNumberPicker liveCDNumberPicker = this.f127372b;
        if (liveCDNumberPicker == null) {
            l.a("mMonthDayPicker");
        }
        liveCDNumberPicker.a(aVar.f127360a);
        LiveCDNumberPicker liveCDNumberPicker2 = this.f127373c;
        if (liveCDNumberPicker2 == null) {
            l.a("mHoursPicker");
        }
        liveCDNumberPicker2.a(aVar.f127361b);
        LiveCDNumberPicker liveCDNumberPicker3 = this.f127374d;
        if (liveCDNumberPicker3 == null) {
            l.a("mMinutesPicker");
        }
        liveCDNumberPicker3.a(aVar.f127362c);
        a();
    }

    static void a(int i2, LiveCDNumberPicker liveCDNumberPicker) {
        liveCDNumberPicker.setMinValue(0);
        liveCDNumberPicker.setMaxValue(i2);
        liveCDNumberPicker.setPickerItemCount(5);
        liveCDNumberPicker.setWrapSelectorWheel(false);
        liveCDNumberPicker.setSelectedTextColor(R.color.a2);
        liveCDNumberPicker.setUnselectedTextColor(R.color.bk);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(7150);
        Object a2 = a(context, "layout_inflater");
        if (a2 != null) {
            this.f127375e = (LayoutInflater) a2;
            MethodCollector.o(7150);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
        MethodCollector.o(7150);
        throw nullPointerException;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(7158);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
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
                    MethodCollector.o(7158);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
