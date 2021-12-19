package com.bytedance.ies.xelement.d;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.SeekBar;
import androidx.appcompat.widget.p;
import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.a.q;
import h.f.b.l;
import h.v;
import h.z;
import java.util.Map;

public final class a extends p {

    /* renamed from: a  reason: collision with root package name */
    private q<? super String, ? super Map<String, ? extends Object>, ? super a, z> f36827a;

    static {
        Covode.recordClassIndex(22101);
    }

    public final void setStateReporter(q<? super String, ? super Map<String, ? extends Object>, ? super a, z> qVar) {
        this.f36827a = qVar;
    }

    /* renamed from: com.bytedance.ies.xelement.d.a$a  reason: collision with other inner class name */
    public static final class C0894a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f36828a;

        static {
            Covode.recordClassIndex(22102);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C0894a(a aVar) {
            this.f36828a = aVar;
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            int i2;
            if (seekBar != null) {
                i2 = seekBar.getProgress();
            } else {
                i2 = 0;
            }
            this.f36828a.a("seekbegin", ag.a(v.a("currentDuration", Integer.valueOf(i2))));
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            int i2;
            if (seekBar != null) {
                i2 = seekBar.getProgress();
            } else {
                i2 = 0;
            }
            this.f36828a.a("seekend", ag.a(v.a("currentDuration", Integer.valueOf(i2))));
        }

        public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            int i3;
            if (seekBar != null) {
                i3 = seekBar.getProgress();
            } else {
                i3 = 0;
            }
            this.f36828a.a("seekchanged", ag.a(v.a("currentDuration", Integer.valueOf(i3))));
        }
    }

    public a(Context context) {
        super(context);
        getThumb().clearColorFilter();
        getProgressDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        getThumb().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        setOnSeekBarChangeListener(new C0894a(this));
    }

    public final void a(String str, Map<String, ? extends Object> map) {
        l.c(str, "");
        l.c(map, "");
        q<? super String, ? super Map<String, ? extends Object>, ? super a, z> qVar = this.f36827a;
        if (qVar != null) {
            qVar.invoke(str, map, this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
    }
}
