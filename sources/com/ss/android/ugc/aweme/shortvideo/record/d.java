package com.ss.android.ugc.aweme.shortvideo.record;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import org.libsdl.app.AudioRecorderInterface;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Activity> f130094a;

    /* renamed from: b  reason: collision with root package name */
    public volatile long f130095b = -1;

    /* renamed from: c  reason: collision with root package name */
    public final b f130096c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.shortvideo.ui.a.a.a f130097d;

    public interface b {
        static {
            Covode.recordClassIndex(85358);
        }

        void a();

        void a(int i2, int i3, double d2);

        void b();
    }

    static {
        Covode.recordClassIndex(85356);
    }

    public final AudioRecorderInterface a() {
        return new a(this, (byte) 0);
    }

    class a extends e {
        static {
            Covode.recordClassIndex(85357);
        }

        @Override // org.libsdl.app.AudioRecorderInterface
        public final void lackPermission() {
            d.this.f130096c.b();
            Activity activity = d.this.f130094a.get();
            if (activity != null) {
                d.this.f130097d.a(activity);
            }
        }

        private a() {
        }

        @Override // org.libsdl.app.AudioRecorderInterface
        public final int closeWavFile(boolean z) {
            d.this.f130096c.a();
            return 0;
        }

        @Override // org.libsdl.app.AudioRecorderInterface
        public final void recordStatus(boolean z) {
            if (!z && d.this.f130095b == -1) {
                d.this.f130095b = System.currentTimeMillis();
            }
        }

        /* synthetic */ a(d dVar, byte b2) {
            this();
        }

        @Override // org.libsdl.app.AudioRecorderInterface
        public final int initWavFile(int i2, int i3, double d2) {
            d.this.f130095b = -1;
            d.this.f130096c.a(i2, i3, d2);
            return 0;
        }

        @Override // org.libsdl.app.AudioRecorderInterface
        public final int addPCMData(byte[] bArr, int i2, long j2) {
            if (d.this.f130095b != -1) {
                return 0;
            }
            d.this.f130095b = System.currentTimeMillis();
            return 0;
        }
    }

    public d(Activity activity, com.ss.android.ugc.aweme.shortvideo.ui.a.a.a aVar, b bVar) {
        this.f130094a = new WeakReference<>(activity);
        this.f130097d = aVar;
        this.f130096c = bVar;
    }
}
