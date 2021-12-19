package com.ss.android.ugc.aweme.contentlanguage;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel;
import com.ss.android.ugc.aweme.setting.serverpush.a.a;
import java.util.ArrayList;

final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final d f78170a;

    /* renamed from: b  reason: collision with root package name */
    private final a f78171b;

    static {
        Covode.recordClassIndex(48470);
    }

    g(d dVar, a aVar) {
        this.f78170a = dVar;
        this.f78171b = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        d dVar = this.f78170a;
        a aVar = this.f78171b;
        if (i2 == -2) {
            dialogInterface.dismiss();
        } else if (i2 == -1) {
            dVar.f78162a.remove(aVar);
            ContentPreferenceViewModel contentPreferenceViewModel = dVar.f78164c;
            if (aVar != null) {
                ArrayList<a> value = contentPreferenceViewModel.c().getValue();
                if (value != null) {
                    value.remove(aVar);
                }
                contentPreferenceViewModel.f78217b = true;
            }
            dVar.f78165d.a(aVar, 0);
            dVar.notifyDataSetChanged();
            dialogInterface.dismiss();
        }
    }
}
