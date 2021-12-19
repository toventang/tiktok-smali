package com.bytedance.ies.xelement.picker.view;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.c.a;
import com.bytedance.ies.xelement.picker.a.b;
import com.bytedance.ies.xelement.picker.e.c;
import com.bytedance.ies.xelement.picker.e.f;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public final class e {
    private static List<String> o = Arrays.asList("1", "3", "5", "7", "8", "10", "12");
    private static List<String> p = Arrays.asList("4", "6", "9", "11");

    /* renamed from: a  reason: collision with root package name */
    public View f37321a;

    /* renamed from: b  reason: collision with root package name */
    WheelView f37322b;

    /* renamed from: c  reason: collision with root package name */
    public WheelView f37323c;

    /* renamed from: d  reason: collision with root package name */
    public WheelView f37324d;

    /* renamed from: e  reason: collision with root package name */
    public int f37325e = 1900;

    /* renamed from: f  reason: collision with root package name */
    public int f37326f = 2100;

    /* renamed from: g  reason: collision with root package name */
    public int f37327g = 1;

    /* renamed from: h  reason: collision with root package name */
    public int f37328h = 12;

    /* renamed from: i  reason: collision with root package name */
    public int f37329i = 1;

    /* renamed from: j  reason: collision with root package name */
    public int f37330j = 31;

    /* renamed from: k  reason: collision with root package name */
    public int f37331k;

    /* renamed from: l  reason: collision with root package name */
    public int f37332l;

    /* renamed from: m  reason: collision with root package name */
    public int f37333m;
    public c n;

    public final Calendar a() {
        Calendar instance = Calendar.getInstance();
        instance.set(this.f37331k, this.f37332l - 1, this.f37333m);
        return instance;
    }

    static {
        Covode.recordClassIndex(22436);
    }

    public static int a(int i2, int i3, int i4) {
        if (o.contains(String.valueOf(i3))) {
            return Math.min(i4, 31);
        }
        if (p.contains(String.valueOf(i3))) {
            return Math.min(i4, 30);
        }
        if (i2 % 4 != 0 || i2 % 100 == 0) {
            return Math.min(i4, 28);
        }
        return Math.min(i4, 29);
    }

    public final void b(boolean z, int i2, int i3, int i4) {
        this.f37324d.setAdapter(new b(i3, i4));
        if (z) {
            this.f37324d.setCurrentIndex(i2);
        } else if (i2 > this.f37324d.getAdapter().a() - 1) {
            i2 = this.f37324d.getAdapter().a() - 1;
            this.f37324d.setCurrentIndex(i2);
        }
        this.f37333m = i2 + i3;
    }

    public final void a(boolean z, int i2, int i3, int i4) {
        int currentItem;
        int i5 = this.f37325e;
        int i6 = this.f37326f;
        int i7 = 31;
        int i8 = 1;
        if (i5 == i6 && this.f37327g == this.f37328h) {
            i8 = this.f37329i;
            i7 = this.f37330j;
        } else if (i2 == i5 && i3 == this.f37327g) {
            i8 = this.f37329i;
        } else if (i2 == i6 && i3 == this.f37328h) {
            i7 = this.f37330j;
        }
        int a2 = a(i2, i3, i7);
        if (z) {
            currentItem = i4 - i8;
        } else {
            currentItem = this.f37324d.getCurrentItem();
        }
        b(z, currentItem, i8, a2);
    }

    public e(View view, boolean[] zArr, int i2, int i3, a aVar) {
        int i4;
        int i5;
        this.f37321a = view;
        this.f37322b = (WheelView) view.findViewById(R.id.fno);
        this.f37323c = (WheelView) view.findViewById(R.id.cnf);
        this.f37324d = (WheelView) view.findViewById(R.id.aig);
        this.f37322b.setLocalizeAdapter(aVar);
        this.f37323c.setLocalizeAdapter(aVar);
        this.f37324d.setLocalizeAdapter(aVar);
        if (zArr.length == 3) {
            WheelView wheelView = this.f37322b;
            int i6 = 0;
            if (zArr[0]) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            wheelView.setVisibility(i4);
            WheelView wheelView2 = this.f37323c;
            if (zArr[1]) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            wheelView2.setVisibility(i5);
            this.f37324d.setVisibility(!zArr[2] ? 8 : i6);
            this.f37322b.setGravity(i2);
            this.f37323c.setGravity(i2);
            this.f37324d.setGravity(i2);
            float f2 = (float) i3;
            this.f37324d.setTextSize(f2);
            this.f37323c.setTextSize(f2);
            this.f37322b.setTextSize(f2);
            this.f37322b.setOnItemSelectedListener(new f() {
                /* class com.bytedance.ies.xelement.picker.view.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(22437);
                }

                @Override // com.bytedance.ies.xelement.picker.e.f
                public final void a(int i2) {
                    int i3;
                    int currentItem = e.this.f37323c.getCurrentItem();
                    int i4 = i2 + e.this.f37325e;
                    e.this.f37331k = i4;
                    int i5 = 12;
                    if (e.this.f37325e == e.this.f37326f) {
                        i3 = e.this.f37327g;
                        i5 = e.this.f37328h;
                    } else if (i4 == e.this.f37325e) {
                        i3 = e.this.f37327g;
                    } else {
                        if (i4 == e.this.f37326f) {
                            i5 = e.this.f37328h;
                        }
                        i3 = 1;
                    }
                    e.this.f37323c.setAdapter(new b(i3, i5));
                    int a2 = e.this.f37323c.getAdapter().a() - 1;
                    if (currentItem > a2) {
                        e.this.f37323c.setCurrentIndex(a2);
                        currentItem = a2;
                    }
                    int i6 = i3 + currentItem;
                    e.this.f37332l = i6;
                    e eVar = e.this;
                    eVar.a(false, i4, i6, eVar.f37333m);
                    if (e.this.n != null) {
                        e.this.n.a();
                    }
                }
            });
            this.f37323c.setOnItemSelectedListener(new f() {
                /* class com.bytedance.ies.xelement.picker.view.e.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(22438);
                }

                @Override // com.bytedance.ies.xelement.picker.e.f
                public final void a(int i2) {
                    int i3;
                    int i4 = e.this.f37331k;
                    int i5 = 1;
                    if (i4 == e.this.f37325e) {
                        i3 = e.this.f37327g;
                    } else {
                        i3 = 1;
                    }
                    int i6 = i3 + i2;
                    e.this.f37332l = i6;
                    e eVar = e.this;
                    eVar.a(false, i4, i6, eVar.f37333m);
                    int i7 = 31;
                    if (e.this.f37325e == e.this.f37326f && e.this.f37327g == e.this.f37328h) {
                        i5 = e.this.f37329i;
                        i7 = e.this.f37330j;
                    } else if (i4 == e.this.f37325e && i6 == e.this.f37327g) {
                        i5 = e.this.f37329i;
                    } else if (i4 == e.this.f37326f && i6 == e.this.f37328h) {
                        i7 = e.this.f37330j;
                    }
                    int a2 = e.a(i4, i6, i7);
                    e eVar2 = e.this;
                    eVar2.b(false, eVar2.f37324d.getCurrentItem(), i5, a2);
                    if (e.this.n != null) {
                        e.this.n.a();
                    }
                }
            });
            this.f37324d.setOnItemSelectedListener(new f() {
                /* class com.bytedance.ies.xelement.picker.view.e.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(22439);
                }

                @Override // com.bytedance.ies.xelement.picker.e.f
                public final void a(int i2) {
                    if (e.this.f37331k == e.this.f37325e && e.this.f37332l == e.this.f37327g) {
                        e eVar = e.this;
                        eVar.f37333m = i2 + eVar.f37329i;
                    } else {
                        e.this.f37333m = i2 + 1;
                    }
                    if (e.this.n != null) {
                        e.this.n.a();
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("type[] length is not 3");
    }
}
