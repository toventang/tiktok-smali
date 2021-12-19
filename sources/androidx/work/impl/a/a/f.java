package androidx.work.impl.a.a;

import android.content.Context;
import android.os.Build;
import androidx.work.g;
import androidx.work.h;
import androidx.work.impl.a.b;
import com.bytedance.covode.number.Covode;

public final class f extends c<b> {

    /* renamed from: d  reason: collision with root package name */
    private static final String f4522d = g.a("NetworkNotRoamingCtrlr");

    static {
        Covode.recordClassIndex(1771);
    }

    public f(Context context) {
        super(androidx.work.impl.a.b.g.a(context).f4547c);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.work.impl.a.a.c
    public final boolean a(androidx.work.impl.b.g gVar) {
        if (gVar.f4587j.f4480b == h.NOT_ROAMING) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // androidx.work.impl.a.a.c
    public final /* synthetic */ boolean b(b bVar) {
        b bVar2 = bVar;
        if (Build.VERSION.SDK_INT < 24) {
            g.a();
            if (!bVar2.f4523a) {
                return true;
            }
            return false;
        } else if (!bVar2.f4523a || !bVar2.f4526d) {
            return true;
        } else {
            return false;
        }
    }
}
