package androidx.work.impl.a.a;

import android.content.Context;
import androidx.work.h;
import androidx.work.impl.a.b;
import com.bytedance.covode.number.Covode;

public final class g extends c<b> {
    static {
        Covode.recordClassIndex(1772);
    }

    public g(Context context) {
        super(androidx.work.impl.a.b.g.a(context).f4547c);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.work.impl.a.a.c
    public final boolean a(androidx.work.impl.b.g gVar) {
        if (gVar.f4587j.f4480b == h.UNMETERED) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // androidx.work.impl.a.a.c
    public final /* bridge */ /* synthetic */ boolean b(b bVar) {
        b bVar2 = bVar;
        if (!bVar2.f4523a || bVar2.f4525c) {
            return true;
        }
        return false;
    }
}
