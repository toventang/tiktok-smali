package androidx.core.app;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.Set;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final String f2257a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f2258b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence[] f2259c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2260d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2261e;

    /* renamed from: f  reason: collision with root package name */
    public final Bundle f2262f;

    /* renamed from: g  reason: collision with root package name */
    public final Set<String> f2263g;

    static {
        Covode.recordClassIndex(694);
    }

    static RemoteInput[] a(n[] nVarArr) {
        if (nVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[nVarArr.length];
        for (int i2 = 0; i2 < nVarArr.length; i2++) {
            n nVar = nVarArr[i2];
            RemoteInput.Builder addExtras = new RemoteInput.Builder(nVar.f2257a).setLabel(nVar.f2258b).setChoices(nVar.f2259c).setAllowFreeFormInput(nVar.f2260d).addExtras(nVar.f2262f);
            if (Build.VERSION.SDK_INT >= 29) {
                addExtras.setEditChoicesBeforeSending(nVar.f2261e);
            }
            remoteInputArr[i2] = addExtras.build();
        }
        return remoteInputArr;
    }
}
