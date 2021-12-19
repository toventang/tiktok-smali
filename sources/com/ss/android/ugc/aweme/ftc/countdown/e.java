package com.ss.android.ugc.aweme.ftc.countdown;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public MediaPlayer f98348a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f98349b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    public a f98350c;

    /* renamed from: d  reason: collision with root package name */
    Runnable f98351d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f98352e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f98353f;

    /* renamed from: g  reason: collision with root package name */
    private final Uri f98354g;

    public interface a {
        static {
            Covode.recordClassIndex(62544);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(62542);
    }

    public final void a() {
        if (!this.f98352e) {
            this.f98352e = true;
            MediaPlayer mediaPlayer = this.f98348a;
            if (mediaPlayer != null) {
                mediaPlayer.release();
                Runnable runnable = this.f98351d;
                if (runnable != null) {
                    this.f98349b.removeCallbacks(runnable);
                }
            }
        }
    }

    public e(Context context, Uri uri) {
        this.f98353f = context;
        this.f98354g = uri;
        this.f98348a = MediaPlayer.create(context, uri);
    }
}
