package com.ss.android.ugc.aweme.shortvideo.countdown;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Build;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.LinkedList;

public final class c implements i {

    /* renamed from: a  reason: collision with root package name */
    public final SoundPool f125162a;

    /* renamed from: b  reason: collision with root package name */
    public Integer f125163b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f125164c;

    /* renamed from: d  reason: collision with root package name */
    private final int f125165d;

    /* renamed from: e  reason: collision with root package name */
    private final int f125166e;

    /* renamed from: f  reason: collision with root package name */
    private final int f125167f;

    /* renamed from: g  reason: collision with root package name */
    private final Handler f125168g = new Handler();

    /* renamed from: h  reason: collision with root package name */
    private LinkedList<Integer> f125169h;

    static {
        Covode.recordClassIndex(82202);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f125170a;

        static {
            Covode.recordClassIndex(82203);
        }

        a(c cVar) {
            this.f125170a = cVar;
        }

        public final void run() {
            Integer num = this.f125170a.f125163b;
            if (num != null) {
                this.f125170a.f125162a.stop(num.intValue());
                this.f125170a.a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.countdown.i
    public final void b() {
        this.f125168g.removeCallbacksAndMessages(null);
        this.f125162a.release();
        this.f125163b = null;
        this.f125169h.clear();
    }

    public final void a() {
        Integer poll = this.f125169h.poll();
        this.f125163b = poll;
        if (poll != null) {
            this.f125162a.play(poll.intValue(), 1.0f, 1.0f, 1, 0, 1.0f);
            this.f125168g.postDelayed(new a(this), 1000);
        }
    }

    public c(Context context) {
        SoundPool soundPool;
        l.d(context, "");
        this.f125164c = context;
        if (Build.VERSION.SDK_INT >= 21) {
            soundPool = new SoundPool.Builder().setMaxStreams(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).build();
            l.b(soundPool, "");
        } else {
            soundPool = new SoundPool(3, 3, 0);
        }
        this.f125162a = soundPool;
        this.f125165d = soundPool.load(context, R.raw.shot_count_down_a, 1);
        this.f125166e = soundPool.load(context, R.raw.shot_count_down_b, 1);
        this.f125167f = soundPool.load(context, R.raw.shot_count_down_c, 1);
        this.f125169h = new LinkedList<>();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.countdown.i
    public final void a(int i2) {
        if (i2 == 10) {
            int i3 = 0;
            do {
                this.f125169h.offer(Integer.valueOf(this.f125165d));
                i3++;
            } while (i3 < 7);
        }
        this.f125169h.offer(Integer.valueOf(this.f125166e));
        this.f125169h.offer(Integer.valueOf(this.f125166e));
        this.f125169h.offer(Integer.valueOf(this.f125167f));
        a();
    }
}
