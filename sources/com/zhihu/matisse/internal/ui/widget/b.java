package com.zhihu.matisse.internal.ui.widget;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.c;
import androidx.fragment.app.d;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class b extends d {
    static {
        Covode.recordClassIndex(103925);
    }

    @Override // androidx.fragment.app.d
    public Dialog onCreateDialog(Bundle bundle) {
        String string = getArguments().getString("extra_title");
        String string2 = getArguments().getString("extra_message");
        c.a aVar = new c.a(getActivity());
        if (!TextUtils.isEmpty(string)) {
            aVar.a(string);
        }
        if (!TextUtils.isEmpty(string2)) {
            aVar.b(string2);
        }
        aVar.a(R.string.d2g, new DialogInterface.OnClickListener() {
            /* class com.zhihu.matisse.internal.ui.widget.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(103926);
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
            }
        });
        return aVar.a();
    }

    public static b a(String str, String str2) {
        b bVar = new b();
        Bundle bundle = new Bundle();
        bundle.putString("extra_title", str);
        bundle.putString("extra_message", str2);
        bVar.setArguments(bundle);
        return bVar;
    }
}
