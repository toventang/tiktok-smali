package androidx.work.impl.a.a;

import android.content.Context;
import android.os.Build;
import androidx.work.h;
import androidx.work.impl.a.b;
import androidx.work.impl.a.b.g;
import com.bytedance.covode.number.Covode;

public final class d extends c<b> {
    static {
        Covode.recordClassIndex(1769);
    }

    public d(Context context) {
        super(g.a(context).f4547c);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.work.impl.a.a.c
    public final boolean a(androidx.work.impl.b.g gVar) {
        if (gVar.f4587j.f4480b == h.CONNECTED) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // androidx.work.impl.a.a.c
    public final /* bridge */ /* synthetic */ boolean b(b bVar) {
        b bVar2 = bVar;
        if (Build.VERSION.SDK_INT >= 26) {
            if (!bVar2.f4523a || !bVar2.f4524b) {
                return true;
            }
            return false;
        } else if (!bVar2.f4523a) {
            return true;
        } else {
            return false;
        }
    }
}
