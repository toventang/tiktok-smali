package com.ss.android.ugc.aweme.preload.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public class b<T> extends f.a.g.b<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f115732c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private e f115733a;

    static {
        Covode.recordClassIndex(74671);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(74672);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // f.a.z
    public void onComplete() {
        dispose();
    }

    public String toString() {
        return "RxDisposableObserver{taskInfo='" + this.f115733a + "}";
    }

    @Override // f.a.z
    public void onNext(T t) {
        a(t);
    }

    public b(e eVar) {
        this.f115733a = eVar;
    }

    @Override // f.a.z
    public void onError(Throwable th) {
        l.d(th, "");
        a(null);
    }

    private final String a(T t) {
        String obj;
        e eVar = this.f115733a;
        if (eVar != null) {
            return String.valueOf(eVar);
        }
        if (t == null || (obj = t.toString()) == null) {
            return "missing name";
        }
        return obj;
    }
}
