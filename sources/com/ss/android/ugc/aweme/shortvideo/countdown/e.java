package com.ss.android.ugc.aweme.shortvideo.countdown;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public MediaPlayer f125177a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f125178b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    public a f125179c;

    /* renamed from: d  reason: collision with root package name */
    public Runnable f125180d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f125181e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f125182f;

    /* renamed from: g  reason: collision with root package name */
    private final Uri f125183g;

    public interface a {
        static {
            Covode.recordClassIndex(82207);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(82205);
    }

    public final void a() {
        if (!this.f125181e) {
            this.f125181e = true;
            MediaPlayer mediaPlayer = this.f125177a;
            if (mediaPlayer != null) {
                mediaPlayer.release();
                Runnable runnable = this.f125180d;
                if (runnable != null) {
                    this.f125178b.removeCallbacks(runnable);
                }
            }
        }
    }

    public e(Context context, Uri uri) {
        this.f125182f = context;
        this.f125183g = uri;
        this.f125177a = MediaPlayer.create(context, uri);
    }
}
