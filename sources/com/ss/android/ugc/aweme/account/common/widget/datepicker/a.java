package com.ss.android.ugc.aweme.account.common.widget.datepicker;

import android.media.AudioManager;
import android.media.SoundPool;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private SoundPool f62923a;

    /* renamed from: b  reason: collision with root package name */
    private AudioManager f62924b;

    /* renamed from: c  reason: collision with root package name */
    private float f62925c;

    /* renamed from: d  reason: collision with root package name */
    private int f62926d;

    static {
        Covode.recordClassIndex(38757);
    }

    public final void a() {
        float streamVolume = (float) this.f62924b.getStreamVolume(1);
        this.f62925c = streamVolume;
        int i2 = this.f62926d;
        if (i2 > 0) {
            this.f62923a.play(i2, streamVolume, streamVolume, 0, 0, 1.0f);
        } else {
            this.f62924b.playSoundEffect(0, streamVolume);
        }
    }
}
