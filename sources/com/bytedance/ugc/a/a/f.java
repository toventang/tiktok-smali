package com.bytedance.ugc.a.a;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.a.a;
import com.bytedance.ugc.a.b;
import com.bytedance.ugc.a.c;
import h.f.b.l;

public final class f extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final f f45832a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(27917);
    }

    @Override // com.bytedance.ugc.a.c.a
    public final boolean a(b bVar, View view, int i2, int i3, int i4, int i5, int i6, int i7, c.a aVar) {
        l.c(bVar, "");
        l.c(view, "");
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        if (c.a.C1129a.a(view)) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        bVar.a(i4, i5, i6, i7, c.a.C1129a.a(viewGroup.getBackground()));
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = viewGroup.getChildAt(i8);
            if (childAt != null) {
                int left = ((i2 + childAt.getLeft()) - viewGroup.getScrollX()) + ((int) childAt.getTranslationX());
                int top = ((i3 + childAt.getTop()) - viewGroup.getScrollY()) + ((int) childAt.getTranslationY());
                int right = ((i2 + childAt.getRight()) - viewGroup.getScrollX()) + ((int) childAt.getTranslationX());
                int bottom = ((i3 + childAt.getBottom()) - viewGroup.getScrollY()) + ((int) childAt.getTranslationY());
                if (left < i6 && top < i7 && right > i4 && bottom > i5 && left < right && top < bottom) {
                    a.a(bVar, childAt, left, top, Math.max(i4, left), Math.max(i5, top), Math.min(i6, right), Math.min(i7, bottom), aVar);
                }
            }
        }
        return true;
    }
}
