package com.ss.android.ugc.aweme.tools.mvtemplate.e;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import com.bytedance.common.utility.e.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import h.f.b.l;

public final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final MvThemeData f140828a;

    /* renamed from: b  reason: collision with root package name */
    private final DialogInterface.OnClickListener f140829b;

    static {
        Covode.recordClassIndex(91959);
    }

    public g(MvThemeData mvThemeData, DialogInterface.OnClickListener onClickListener) {
        this.f140828a = mvThemeData;
        this.f140829b = onClickListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        MvThemeData mvThemeData = this.f140828a;
        DialogInterface.OnClickListener onClickListener = this.f140829b;
        String id = mvThemeData.f140618a.getId();
        l.d(id, "");
        SharedPreferences.Editor edit = d.a(c.f115622a, "mv_template", 0).edit();
        edit.putBoolean(id, true);
        a.a(edit);
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i2);
        }
    }
}
