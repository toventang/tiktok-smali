package com.google.android.material.a;

import android.util.Property;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class d extends Property<ViewGroup, Float> {

    /* renamed from: a  reason: collision with root package name */
    public static final Property<ViewGroup, Float> f52132a = new d("childrenAlpha");

    static {
        Covode.recordClassIndex(32413);
    }

    private d(String str) {
        super(Float.class, str);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // android.util.Property
    public final /* synthetic */ Float get(ViewGroup viewGroup) {
        Object tag = viewGroup.getTag(R.id.cou);
        if (tag != null) {
            return tag;
        }
        return Float.valueOf(1.0f);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // android.util.Property
    public final /* synthetic */ void set(ViewGroup viewGroup, Float f2) {
        ViewGroup viewGroup2 = viewGroup;
        float floatValue = f2.floatValue();
        viewGroup2.setTag(R.id.cou, Float.valueOf(floatValue));
        int childCount = viewGroup2.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            viewGroup2.getChildAt(i2).setAlpha(floatValue);
        }
    }
}
