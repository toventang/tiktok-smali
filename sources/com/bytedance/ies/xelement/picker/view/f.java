package com.bytedance.ies.xelement.picker.view;

import android.graphics.Typeface;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.picker.c.b;
import com.bytedance.ies.xelement.picker.e.g;
import com.bytedance.ies.xelement.picker.view.WheelView;
import java.util.ArrayList;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public View f37337a;

    /* renamed from: b  reason: collision with root package name */
    List<WheelView> f37338b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<List<String>> f37339c;

    /* renamed from: d  reason: collision with root package name */
    public List<Integer> f37340d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public g f37341e;

    /* renamed from: f  reason: collision with root package name */
    public b f37342f;

    static {
        Covode.recordClassIndex(22440);
    }

    public f(View view) {
        this.f37337a = view;
    }

    public final void a(float f2) {
        for (WheelView wheelView : this.f37338b) {
            wheelView.setLineSpacingMultiplier(f2);
        }
    }

    public final void b(int i2) {
        for (WheelView wheelView : this.f37338b) {
            wheelView.setItemsVisibleCount(i2);
        }
    }

    public final void c(int i2) {
        for (WheelView wheelView : this.f37338b) {
            wheelView.setDividerColor(i2);
        }
    }

    public final void d(int i2) {
        for (WheelView wheelView : this.f37338b) {
            wheelView.setTextColorCenter(i2);
        }
    }

    public final void e(int i2) {
        for (WheelView wheelView : this.f37338b) {
            wheelView.setTextColorOut(i2);
        }
    }

    public final void a(int i2) {
        for (WheelView wheelView : this.f37338b) {
            wheelView.setTextSize((float) i2);
        }
    }

    public final void b(List<String> list) {
        for (WheelView wheelView : this.f37338b) {
            String str = null;
            if (list != null && !list.isEmpty()) {
                str = list.remove(0);
            }
            wheelView.setLabel(str);
        }
    }

    public final void c(List<Integer> list) {
        Integer remove;
        for (WheelView wheelView : this.f37338b) {
            if (!(list == null || list.isEmpty() || (remove = list.remove(0)) == null)) {
                wheelView.setTextXOffset(remove.intValue());
            }
        }
    }

    public final void d(List<Boolean> list) {
        Boolean remove;
        for (WheelView wheelView : this.f37338b) {
            if (list == null || list.isEmpty() || (remove = list.remove(0)) == null) {
                wheelView.setCyclic(false);
            } else {
                wheelView.setCyclic(remove.booleanValue());
            }
        }
    }

    public final void a(Typeface typeface) {
        for (WheelView wheelView : this.f37338b) {
            wheelView.setTypeface(typeface);
        }
    }

    public final void b(boolean z) {
        for (WheelView wheelView : this.f37338b) {
            wheelView.setAlphaGradient(z);
        }
    }

    public final void c(boolean z) {
        for (WheelView wheelView : this.f37338b) {
            wheelView.f37280b = z;
        }
    }

    public final void a(WheelView.b bVar) {
        for (WheelView wheelView : this.f37338b) {
            wheelView.setDividerType(bVar);
        }
    }

    public final void a(List<Integer> list) {
        if (this.f37339c == null) {
            this.f37340d.clear();
            return;
        }
        if (list == null) {
            list = new ArrayList<>();
            for (int i2 = 0; i2 < this.f37339c.size(); i2++) {
                list.add(0);
            }
        }
        for (Integer num : list) {
            if (num == null) {
                throw new IllegalArgumentException("index can not be null");
            }
        }
        for (int i3 = 0; i3 < this.f37338b.size(); i3++) {
            WheelView wheelView = this.f37338b.get(i3);
            if (i3 < list.size()) {
                int intValue = list.get(i3).intValue();
                List<List<String>> list2 = this.f37339c;
                if (list2 == null || i3 >= list2.size() || intValue >= this.f37339c.get(i3).size()) {
                    list.set(i3, 0);
                } else {
                    wheelView.setCurrentIndex(intValue);
                }
            }
            wheelView.setCurrentIndex(0);
        }
        this.f37340d.clear();
        this.f37340d.addAll(list);
    }

    public final void a(boolean z) {
        for (WheelView wheelView : this.f37338b) {
            wheelView.setCyclic(z);
        }
    }
}
