package com.ss.android.ugc.aweme.ftc.countdown;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Build;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.LinkedList;

public final class c implements k {

    /* renamed from: a  reason: collision with root package name */
    public final SoundPool f98333a;

    /* renamed from: b  reason: collision with root package name */
    public Integer f98334b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f98335c;

    /* renamed from: d  reason: collision with root package name */
    private final int f98336d;

    /* renamed from: e  reason: collision with root package name */
    private final int f98337e;

    /* renamed from: f  reason: collision with root package name */
    private final int f98338f;

    /* renamed from: g  reason: collision with root package name */
    private final Handler f98339g = new Handler();

    /* renamed from: h  reason: collision with root package name */
    private LinkedList<Integer> f98340h;

    static {
        Covode.recordClassIndex(62539);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f98341a;

        static {
            Covode.recordClassIndex(62540);
        }

        a(c cVar) {
            this.f98341a = cVar;
        }

        public final void run() {
            Integer num = this.f98341a.f98334b;
            if (num != null) {
                this.f98341a.f98333a.stop(num.intValue());
                this.f98341a.a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.countdown.k
    public final void b() {
        this.f98339g.removeCallbacksAndMessages(null);
        this.f98333a.release();
        this.f98334b = null;
        this.f98340h.clear();
    }

    public final void a() {
        Integer poll = this.f98340h.poll();
        this.f98334b = poll;
        if (poll != null) {
            this.f98333a.play(poll.intValue(), 1.0f, 1.0f, 1, 0, 1.0f);
            this.f98339g.postDelayed(new a(this), 1000);
        }
    }

    public c(Context context) {
        SoundPool soundPool;
        l.d(context, "");
        this.f98335c = context;
        if (Build.VERSION.SDK_INT >= 21) {
            soundPool = new SoundPool.Builder().setMaxStreams(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).build();
            l.b(soundPool, "");
        } else {
            soundPool = new SoundPool(3, 3, 0);
        }
        this.f98333a = soundPool;
        this.f98336d = soundPool.load(context, R.raw.shot_count_down_a, 1);
        this.f98337e = soundPool.load(context, R.raw.shot_count_down_b, 1);
        this.f98338f = soundPool.load(context, R.raw.shot_count_down_c, 1);
        this.f98340h = new LinkedList<>();
    }

    @Override // com.ss.android.ugc.aweme.ftc.countdown.k
    public final void a(int i2) {
        if (i2 == 10) {
            int i3 = 0;
            do {
                this.f98340h.offer(Integer.valueOf(this.f98336d));
                i3++;
            } while (i3 < 7);
        }
        this.f98340h.offer(Integer.valueOf(this.f98337e));
        this.f98340h.offer(Integer.valueOf(this.f98337e));
        this.f98340h.offer(Integer.valueOf(this.f98338f));
        a();
    }
}
