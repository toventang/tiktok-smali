package com.bytedance.android.d;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.d.b;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.android.livesdkapi.depend.model.live.s;
import com.bytedance.android.livesdkapi.view.d;
import com.bytedance.covode.number.Covode;

public interface c extends b {
    static {
        Covode.recordClassIndex(3285);
    }

    void attach(Context context, d dVar, b.a aVar);

    String getPlayerTag();

    void initialize(long j2, a aVar);

    boolean isPlaying();

    boolean preCreatedSurface(Context context);

    void release();

    boolean warmUp();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Context f6845a;

        /* renamed from: b  reason: collision with root package name */
        public String f6846b;

        /* renamed from: c  reason: collision with root package name */
        public String f6847c;

        /* renamed from: d  reason: collision with root package name */
        public String f6848d;

        /* renamed from: e  reason: collision with root package name */
        public String f6849e;

        /* renamed from: f  reason: collision with root package name */
        public i f6850f;

        /* renamed from: g  reason: collision with root package name */
        public s.a f6851g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f6852h = true;

        /* renamed from: i  reason: collision with root package name */
        public int f6853i;

        static {
            Covode.recordClassIndex(3286);
        }

        public static a a(Context context) {
            return new a(context);
        }

        private a(Context context) {
            this.f6845a = context;
        }

        public final a a(String str) {
            this.f6846b = str;
            if (!TextUtils.isEmpty(str)) {
                this.f6853i = 1;
            }
            return this;
        }

        public final a b(String str) {
            this.f6848d = str;
            if (this.f6853i == 0 && !TextUtils.isEmpty(str)) {
                this.f6853i = 2;
            }
            return this;
        }
    }
}
