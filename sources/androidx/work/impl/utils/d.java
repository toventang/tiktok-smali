package androidx.work.impl.utils;

import androidx.work.WorkerParameters;
import androidx.work.impl.f;
import com.bytedance.covode.number.Covode;

public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private f f4784a;

    /* renamed from: b  reason: collision with root package name */
    private String f4785b;

    /* renamed from: c  reason: collision with root package name */
    private WorkerParameters.a f4786c;

    static {
        Covode.recordClassIndex(1879);
    }

    public final void run() {
        this.f4784a.f4704f.a(this.f4785b, this.f4786c);
    }

    public d(f fVar, String str, WorkerParameters.a aVar) {
        this.f4784a = fVar;
        this.f4785b = str;
        this.f4786c = aVar;
    }
}
