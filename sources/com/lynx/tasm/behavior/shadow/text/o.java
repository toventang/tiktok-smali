package com.lynx.tasm.behavior.shadow.text;

import android.text.Layout;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.shadow.text.m;
import java.lang.ref.WeakReference;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private LruCache<p, n> f56031a;

    static {
        Covode.recordClassIndex(35010);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static o f56032a = new o((byte) 0);

        static {
            Covode.recordClassIndex(35011);
        }
    }

    private o() {
        this.f56031a = new LruCache<>(500);
    }

    /* synthetic */ o(byte b2) {
        this();
    }

    public final n a(j jVar, p pVar) {
        n nVar = this.f56031a.get(pVar);
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(jVar, pVar);
        this.f56031a.put(pVar, nVar2);
        m mVar = m.a.f56021a;
        Layout layout = nVar2.f56024a;
        if (mVar.f56020a != null) {
            mVar.f56020a.obtainMessage(0, new WeakReference(layout)).sendToTarget();
        }
        return nVar2;
    }
}
