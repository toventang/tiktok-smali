package com.ss.android.ugc.aweme.sticker.types.b;

import android.widget.SeekBar;
import com.bytedance.covode.number.Covode;
import h.f.a.b;

public final class d {
    static {
        Covode.recordClassIndex(88876);
    }

    public static final class a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f136060a;

        static {
            Covode.recordClassIndex(88877);
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
        }

        public a(b bVar) {
            this.f136060a = bVar;
        }

        public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            this.f136060a.invoke(Integer.valueOf(i2));
        }
    }
}
