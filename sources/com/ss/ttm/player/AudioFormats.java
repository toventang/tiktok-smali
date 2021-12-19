package com.ss.ttm.player;

import android.media.audiofx.AudioEffect;
import com.bytedance.covode.number.Covode;

public class AudioFormats {

    /* renamed from: a  reason: collision with root package name */
    static final int[] f151941a = {4000, 8000, 11025, 16000, 22050, 32000, 37800, 44056, 44100, 47250, 48000, 50000, 50400, 88200, 96000, 176400, 192000, 352800, 2822400, 5644800};

    /* renamed from: b  reason: collision with root package name */
    private static boolean f151942b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f151943c;

    static {
        Covode.recordClassIndex(101296);
    }

    public static boolean isLicencedDolbyDevice() {
        if (f151942b) {
            return f151943c;
        }
        AudioEffect.Descriptor[] queryEffects = AudioEffect.queryEffects();
        int length = queryEffects.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (queryEffects[i2].implementor.contains("Dolby Laboratories")) {
                f151943c = true;
                break;
            } else {
                i2++;
            }
        }
        f151942b = true;
        return f151943c;
    }
}
