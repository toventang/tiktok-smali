package androidx.emoji.a;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.core.g.g;
import com.bytedance.covode.number.Covode;

public abstract class d extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public final b f2789a;

    /* renamed from: b  reason: collision with root package name */
    public short f2790b = -1;

    /* renamed from: c  reason: collision with root package name */
    public short f2791c = -1;

    /* renamed from: d  reason: collision with root package name */
    public float f2792d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private final Paint.FontMetricsInt f2793e = new Paint.FontMetricsInt();

    static {
        Covode.recordClassIndex(977);
    }

    d(b bVar) {
        g.a(bVar, "metadata cannot be null");
        this.f2789a = bVar;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f2793e);
        this.f2792d = (((float) Math.abs(this.f2793e.descent - this.f2793e.ascent)) * 1.0f) / ((float) this.f2789a.a().e());
        this.f2791c = (short) ((int) (((float) this.f2789a.a().e()) * this.f2792d));
        this.f2790b = (short) ((int) (((float) this.f2789a.a().d()) * this.f2792d));
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = this.f2793e.ascent;
            fontMetricsInt.descent = this.f2793e.descent;
            fontMetricsInt.top = this.f2793e.top;
            fontMetricsInt.bottom = this.f2793e.bottom;
        }
        return this.f2790b;
    }
}
