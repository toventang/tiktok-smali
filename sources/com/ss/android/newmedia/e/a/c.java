package com.ss.android.newmedia.e.a;

import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.ic;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class c implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Context f59969a;

    static {
        Covode.recordClassIndex(37055);
    }

    c(Context context) {
        this.f59969a = context;
    }

    @Override // b.g
    public final Object then(i iVar) {
        Context context = this.f59969a;
        if (!((Boolean) iVar.d()).booleanValue()) {
            return null;
        }
        Toast makeText = Toast.makeText(context, (int) R.string.ghv, 1);
        if (Build.VERSION.SDK_INT == 25) {
            ic.a(makeText);
        }
        makeText.show();
        return null;
    }
}
