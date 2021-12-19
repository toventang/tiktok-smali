package com.benchmark.mediacodec;

import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.bytedance.covode.number.Covode;
import java.io.IOException;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public MediaMuxer f6286a;

    /* renamed from: b  reason: collision with root package name */
    public int f6287b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6288c;

    /* renamed from: d  reason: collision with root package name */
    public a f6289d = a.UNSET;

    /* renamed from: e  reason: collision with root package name */
    private String f6290e;

    /* renamed from: f  reason: collision with root package name */
    private d f6291f;

    static {
        Covode.recordClassIndex(3021);
    }

    public final void a() {
        if (this.f6289d == a.STARTED) {
            this.f6288c = true;
            MediaMuxer mediaMuxer = this.f6286a;
            if (mediaMuxer != null) {
                mediaMuxer.stop();
            }
            this.f6289d = a.STOPED;
        }
    }

    public final void b() {
        if (this.f6289d != a.UNSET && this.f6289d != a.RELEASED) {
            if (!this.f6288c && this.f6289d != a.STOPED) {
                a();
            }
            MediaMuxer mediaMuxer = this.f6286a;
            if (mediaMuxer != null) {
                mediaMuxer.release();
                this.f6286a = null;
            }
            this.f6289d = a.UNSET;
        }
    }

    public enum a {
        UNSET,
        INITED,
        STARTED,
        STOPED,
        RELEASED;

        static {
            Covode.recordClassIndex(3022);
        }
    }

    public final int a(MediaFormat mediaFormat) {
        if (this.f6289d != a.UNSET) {
            return g.n;
        }
        try {
            MediaMuxer mediaMuxer = new MediaMuxer(this.f6290e, 0);
            this.f6286a = mediaMuxer;
            this.f6287b = mediaMuxer.addTrack(mediaFormat);
            this.f6289d = a.INITED;
            return this.f6287b;
        } catch (IOException unused) {
            return g.f6269d;
        }
    }

    public j(String str, d dVar) {
        this.f6290e = str;
        this.f6291f = dVar;
    }
}
