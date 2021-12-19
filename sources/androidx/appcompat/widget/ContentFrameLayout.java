package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;

public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private TypedValue f1383a;

    /* renamed from: b  reason: collision with root package name */
    private TypedValue f1384b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f1385c;

    /* renamed from: d  reason: collision with root package name */
    private TypedValue f1386d;

    /* renamed from: e  reason: collision with root package name */
    private TypedValue f1387e;

    /* renamed from: f  reason: collision with root package name */
    private TypedValue f1388f;

    /* renamed from: g  reason: collision with root package name */
    private final Rect f1389g;

    /* renamed from: h  reason: collision with root package name */
    private a f1390h;

    public interface a {
        static {
            Covode.recordClassIndex(405);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(404);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1387e == null) {
            this.f1387e = new TypedValue();
        }
        return this.f1387e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1388f == null) {
            this.f1388f = new TypedValue();
        }
        return this.f1388f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1385c == null) {
            this.f1385c = new TypedValue();
        }
        return this.f1385c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1386d == null) {
            this.f1386d = new TypedValue();
        }
        return this.f1386d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1383a == null) {
            this.f1383a = new TypedValue();
        }
        return this.f1383a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1384b == null) {
            this.f1384b = new TypedValue();
        }
        return this.f1384b;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f1390h;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public void setAttachListener(a aVar) {
        this.f1390h = aVar;
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r12, int r13) {
        /*
        // Method dump skipped, instructions count: 247
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    private ContentFrameLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        this.f1389g = new Rect();
    }

    public final void a(int i2, int i3, int i4, int i5) {
        this.f1389g.set(i2, i3, i4, i5);
        if (v.v(this)) {
            requestLayout();
        }
    }
}
