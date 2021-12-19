package com.lynx.tasm.navigator;

import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;

public final class e extends LruCache<d, LynxView> {

    /* renamed from: a  reason: collision with root package name */
    private a f56802a;

    public interface a {
        static {
            Covode.recordClassIndex(35371);
        }

        void c(LynxView lynxView);
    }

    static {
        Covode.recordClassIndex(35370);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ LynxView create(d dVar) {
        return null;
    }

    public e(int i2, a aVar) {
        super(i2);
        this.f56802a = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Object, java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // android.util.LruCache
    public final /* synthetic */ void entryRemoved(boolean z, d dVar, LynxView lynxView, LynxView lynxView2) {
        a aVar;
        LynxView lynxView3 = lynxView;
        if (z && (aVar = this.f56802a) != null) {
            aVar.c(lynxView3);
        }
    }
}
