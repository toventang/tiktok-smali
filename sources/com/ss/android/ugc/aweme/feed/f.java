package com.ss.android.ugc.aweme.feed;

import android.os.CountDownTimer;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;
import java.util.Arrays;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final CountDownTimer f93102a;

    /* renamed from: b  reason: collision with root package name */
    public long f93103b = 4000;

    /* renamed from: c  reason: collision with root package name */
    public long f93104c = 1000;

    /* renamed from: d  reason: collision with root package name */
    public TextView f93105d;

    /* renamed from: e  reason: collision with root package name */
    public String f93106e;

    /* renamed from: f  reason: collision with root package name */
    public h.f.a.a<z> f93107f;

    static {
        Covode.recordClassIndex(59045);
    }

    public static final class a extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f93111a;

        static {
            Covode.recordClassIndex(59046);
        }

        public final void onFinish() {
            this.f93111a.f93107f.invoke();
        }

        public final void onTick(long j2) {
            f fVar = this.f93111a;
            fVar.a(j2 / fVar.f93104c);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar, long j2, long j3) {
            super(j2, j3);
            this.f93111a = fVar;
        }
    }

    public final void a() {
        this.f93103b = 4000;
        a(4);
        this.f93102a.cancel();
        this.f93102a.start();
    }

    public final void a(long j2) {
        TextView textView = this.f93105d;
        String a2 = com.a.a(this.f93106e, Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1));
        l.b(a2, "");
        textView.setText(a2);
    }

    public f(TextView textView, String str, h.f.a.a<z> aVar) {
        l.d(textView, "");
        l.d(str, "");
        l.d(aVar, "");
        this.f93105d = textView;
        this.f93106e = str;
        this.f93107f = aVar;
        this.f93102a = new a(this, this.f93103b, this.f93104c);
    }
}
