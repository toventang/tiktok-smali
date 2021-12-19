package com.ss.android.ugc.gamora.recorder.sticker.c.b;

import android.app.Activity;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.e.d;
import h.f.b.l;
import h.z;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f148361a = new Handler();

    /* renamed from: b  reason: collision with root package name */
    public final Activity f148362b;

    static {
        Covode.recordClassIndex(97769);
    }

    @Override // com.ss.android.ugc.tools.view.e.d
    public final void dismiss() {
        super.dismiss();
        this.f148361a.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.b.a$a  reason: collision with other inner class name */
    public static final class RunnableC4006a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f148363a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f148364b;

        static {
            Covode.recordClassIndex(97770);
        }

        RunnableC4006a(a aVar, h.f.a.a aVar2) {
            this.f148363a = aVar;
            this.f148364b = aVar2;
        }

        public final void run() {
            if (!this.f148363a.f148362b.isFinishing()) {
                this.f148363a.dismiss();
                this.f148364b.invoke();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Activity activity) {
        super(activity);
        l.d(activity, "");
        this.f148362b = activity;
        setCancelable(false);
        setIndeterminate(false);
        setMax(100);
    }

    public final void a(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f148361a.postDelayed(new RunnableC4006a(this, aVar), 70);
    }

    public final void a(String str) {
        l.d(str, "");
        if (!this.f148362b.isFinishing()) {
            show();
            setProgress(0);
        }
        setMessage(str);
        a();
    }
}
