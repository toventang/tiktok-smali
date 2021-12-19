package com.bytedance.tux.input.slider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.widget.p;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class TuxSlider extends p implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f45155a;

    /* renamed from: b  reason: collision with root package name */
    private final b f45156b;

    /* renamed from: c  reason: collision with root package name */
    private SeekBar.OnSeekBarChangeListener f45157c;

    static {
        Covode.recordClassIndex(27533);
    }

    public TuxSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setProgress(int i2) {
        super.setProgress(i2);
    }

    public final void setSecondaryProgress(int i2) {
        super.setSecondaryProgress(i2);
    }

    public final void setProgressColor(int i2) {
        this.f45155a.f45158a = i2;
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f45156b.f45173h = true;
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f45157c;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f45156b.f45173h = false;
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f45157c;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
    }

    public final void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        if (l.a(onSeekBarChangeListener, this)) {
            super.setOnSeekBarChangeListener(onSeekBarChangeListener);
        } else {
            this.f45157c = onSeekBarChangeListener;
        }
    }

    @Override // androidx.appcompat.widget.p
    public final void onDraw(Canvas canvas) {
        float a2 = a(getProgress());
        a aVar = this.f45155a;
        float a3 = a(getSecondaryProgress());
        aVar.f45162e = a2;
        aVar.f45163f = a3;
        super.onDraw(canvas);
    }

    private final float a(int i2) {
        float f2;
        int max;
        if (Build.VERSION.SDK_INT >= 26) {
            max = getMax() - getMin();
            if (max <= 0) {
                return 0.0f;
            }
            f2 = ((float) (i2 - getMin())) * 1.0f;
        } else if (getMax() <= 0) {
            return 0.0f;
        } else {
            f2 = ((float) i2) * 1.0f;
            max = getMax();
        }
        return f2 / ((float) max);
    }

    public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f45157c;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i2, z);
        }
    }

    private /* synthetic */ TuxSlider(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxSlider(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, R.attr.c5);
        l.c(context, "");
        a aVar = new a();
        this.f45155a = aVar;
        b bVar = new b();
        this.f45156b = bVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aob, R.attr.aqb, R.attr.aqc, R.attr.aqo, R.attr.are, R.attr.arf, R.attr.arg, R.attr.arh, R.attr.ari, R.attr.arj, R.attr.ark}, R.attr.c5, 0);
        l.a((Object) obtainStyledAttributes, "");
        setProgressDrawable(aVar);
        aVar.f45160c = obtainStyledAttributes.getColor(0, -16777216);
        aVar.f45158a = obtainStyledAttributes.getColor(1, -16777216);
        aVar.f45159b = obtainStyledAttributes.getColor(3, -16777216);
        aVar.f45161d = obtainStyledAttributes.getDimension(2, 0.0f);
        setThumb(bVar);
        bVar.f45166a = obtainStyledAttributes.getFloat(5, 1.0f);
        bVar.f45167b = obtainStyledAttributes.getDimension(10, 0.0f);
        bVar.f45168c = obtainStyledAttributes.getColor(4, -1);
        bVar.f45169d = obtainStyledAttributes.getDimension(7, 0.0f);
        bVar.f45170e = obtainStyledAttributes.getDimension(8, 0.0f);
        bVar.f45171f = obtainStyledAttributes.getDimension(9, 0.0f);
        bVar.f45172g = obtainStyledAttributes.getColor(6, -16777216);
        obtainStyledAttributes.recycle();
        setOnSeekBarChangeListener(this);
        setLayerType(1, null);
    }
}
