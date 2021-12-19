package com.bytedance.ies.xelement.picker.view;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.c.a;
import com.bytedance.ies.xelement.picker.a.b;
import com.bytedance.ies.xelement.picker.e.c;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public View f37345a;

    /* renamed from: b  reason: collision with root package name */
    public WheelView f37346b;

    /* renamed from: c  reason: collision with root package name */
    public WheelView f37347c;

    /* renamed from: d  reason: collision with root package name */
    public WheelView f37348d;

    /* renamed from: e  reason: collision with root package name */
    public Calendar f37349e = a(0, 0, 0);

    /* renamed from: f  reason: collision with root package name */
    Calendar f37350f = a(23, 59, 59);

    /* renamed from: g  reason: collision with root package name */
    public Calendar f37351g = b(Calendar.getInstance());

    /* renamed from: h  reason: collision with root package name */
    public c f37352h;

    /* renamed from: i  reason: collision with root package name */
    private int f37353i;

    /* renamed from: j  reason: collision with root package name */
    private boolean[] f37354j;

    static {
        Covode.recordClassIndex(22442);
    }

    public static Calendar b(Calendar calendar) {
        calendar.set(LiveNetAdaptiveHurryTimeSetting.DEFAULT, 0, 1);
        return calendar;
    }

    private static Calendar c(Calendar calendar) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(calendar.getTimeInMillis());
        return instance;
    }

    public final void a(Calendar calendar) {
        int i2;
        int i3;
        if (calendar.getTimeInMillis() < this.f37349e.getTimeInMillis()) {
            calendar = c(this.f37349e);
        } else if (calendar.getTimeInMillis() > this.f37350f.getTimeInMillis()) {
            calendar = c(this.f37350f);
        }
        int i4 = calendar.get(11);
        int i5 = calendar.get(12);
        int i6 = calendar.get(13);
        int i7 = this.f37349e.get(11);
        int i8 = this.f37349e.get(12);
        int i9 = this.f37349e.get(13);
        int i10 = this.f37350f.get(11);
        int i11 = this.f37350f.get(12);
        int i12 = this.f37350f.get(13);
        if (i7 == i10) {
            this.f37346b.setAdapter(new b(i7, i10));
            i3 = i4 - i7;
            this.f37347c.setAdapter(new b(i8, i11));
            int i13 = i5 - i8;
            if (i8 == i11) {
                this.f37348d.setAdapter(new b(i9, i12));
            } else if (i5 == i8) {
                this.f37348d.setAdapter(new b(i9, 59));
            } else {
                if (i5 == i11) {
                    this.f37348d.setAdapter(new b(0, i12));
                } else {
                    this.f37348d.setAdapter(new b(0, 59));
                }
                i5 = i13;
            }
            i6 -= i9;
            i5 = i13;
        } else {
            if (i7 < i10) {
                this.f37346b.setAdapter(new b(i7, i10));
                i2 = i4 - i7;
            } else {
                this.f37346b.setAdapter(new com.bytedance.ies.xelement.picker.a.c(i7, i10));
                i2 = i4 - i7;
                if (i2 < 0) {
                    i2 += 24;
                }
            }
            if (i4 == i7) {
                this.f37347c.setAdapter(new b(i8, 59));
                int i14 = i5 - i8;
                if (i5 == i8) {
                    this.f37348d.setAdapter(new b(i9, 59));
                    i6 -= i9;
                } else {
                    this.f37348d.setAdapter(new b(0, 59));
                }
                i5 = i14;
            } else if (i4 == i10) {
                this.f37347c.setAdapter(new b(0, i11));
                if (i5 == i11) {
                    this.f37348d.setAdapter(new b(0, i12));
                } else {
                    this.f37348d.setAdapter(new b(0, 59));
                }
            } else {
                this.f37347c.setAdapter(new b(0, 59));
                this.f37348d.setAdapter(new b(0, 59));
            }
            i3 = i2;
        }
        this.f37351g = calendar;
        this.f37346b.setCurrentIndex(i3);
        this.f37347c.setCurrentIndex(i5);
        this.f37348d.setCurrentIndex(i6);
    }

    private static Calendar a(int i2, int i3, int i4) {
        Calendar instance = Calendar.getInstance();
        instance.set(LiveNetAdaptiveHurryTimeSetting.DEFAULT, 0, 1, i2, i3, i4);
        return instance;
    }

    public g(View view, boolean[] zArr, int i2, int i3, a aVar) {
        int i4;
        int i5;
        int i6 = 0;
        this.f37345a = view;
        this.f37353i = i3;
        this.f37346b = (WheelView) view.findViewById(R.id.bh4);
        this.f37347c = (WheelView) view.findViewById(R.id.cmc);
        this.f37348d = (WheelView) view.findViewById(R.id.dw5);
        this.f37346b.setLocalizeAdapter(aVar);
        this.f37347c.setLocalizeAdapter(aVar);
        this.f37348d.setLocalizeAdapter(aVar);
        this.f37346b.setGravity(i2);
        this.f37347c.setGravity(i2);
        this.f37348d.setGravity(i2);
        if (zArr.length == 3) {
            this.f37354j = zArr;
            WheelView wheelView = this.f37346b;
            if (zArr[0]) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            wheelView.setVisibility(i4);
            WheelView wheelView2 = this.f37347c;
            if (zArr[1]) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            wheelView2.setVisibility(i5);
            this.f37348d.setVisibility(!zArr[2] ? 8 : i6);
            this.f37346b.setTextSize((float) this.f37353i);
            this.f37347c.setTextSize((float) this.f37353i);
            this.f37348d.setTextSize((float) this.f37353i);
            return;
        }
        throw new IllegalArgumentException("type[] length is not 3");
    }
}
