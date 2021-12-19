package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.al;
import com.bytedance.covode.number.Covode;

public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, h.b, p {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f1128a = {16842964, 16843049};

    /* renamed from: b  reason: collision with root package name */
    private h f1129b;

    /* renamed from: c  reason: collision with root package name */
    private int f1130c;

    public final int getWindowAnimations() {
        return this.f1130c;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    static {
        Covode.recordClassIndex(324);
    }

    @Override // androidx.appcompat.view.menu.p
    public final void a(h hVar) {
        this.f1129b = hVar;
    }

    @Override // androidx.appcompat.view.menu.h.b
    public final boolean a(j jVar) {
        return this.f1129b.a(jVar, (o) null, 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ExpandedMenuView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        al a2 = al.a(context, attributeSet, f1128a, 16842868, 0);
        if (a2.f(0)) {
            setBackgroundDrawable(a2.a(0));
        }
        if (a2.f(1)) {
            setDivider(a2.a(1));
        }
        a2.f1549a.recycle();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        a((j) getAdapter().getItem(i2));
    }
}
