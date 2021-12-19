package com.ss.android.ugc.aweme.music.ui;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import h.f.b.l;
import java.util.ArrayList;

final /* synthetic */ class az implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ah f111906a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList f111907b;

    static {
        Covode.recordClassIndex(71929);
    }

    az(ah ahVar, ArrayList arrayList) {
        this.f111906a = ahVar;
        this.f111907b = arrayList;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ah ahVar = this.f111906a;
        ArrayList arrayList = this.f111907b;
        if (arrayList.size() != 1) {
            a.C1112a aVar = new a.C1112a();
            boolean z = ahVar.ai;
            String str = ahVar.at;
            String str2 = ahVar.ah;
            String str3 = ahVar.an;
            l.d(arrayList, "");
            c cVar = new c();
            Bundle bundle = new Bundle();
            bundle.putSerializable("music_info_list", arrayList);
            bundle.putBoolean("is_exclusive_resso", z);
            bundle.putString("process_id", str);
            bundle.putString("music_id", str2);
            bundle.putString("group_id", str3);
            cVar.setArguments(bundle);
            aVar.a(cVar).a(1).b(false).a(true).f45299a.show(ahVar.getFragmentManager(), "ThirdMusic");
        } else if (ahVar.aw != null) {
            ahVar.aw.a(ahVar.getContext(), (ExternalMusicInfo) arrayList.get(0), false);
        }
        if (ahVar.aw != null) {
            ahVar.aw.b(ahVar.getContext(), arrayList);
        }
    }
}
