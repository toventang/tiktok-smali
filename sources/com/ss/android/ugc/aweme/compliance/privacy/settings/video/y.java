package com.ss.android.ugc.aweme.compliance.privacy.settings.video;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.b.b;
import com.bytedance.tux.dialog.c;
import com.ss.android.ugc.aweme.be.h;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f77902a;

    static {
        Covode.recordClassIndex(48287);
    }

    y(a aVar) {
        this.f77902a = aVar;
    }

    public final void onClick(View view) {
        List<InteractStickerStruct> interactStickerStructs;
        ClickAgent.onClick(view);
        a aVar = this.f77902a;
        if (aVar.f77828c != null && (interactStickerStructs = aVar.f77828c.getInteractStickerStructs()) != null && interactStickerStructs.size() != 0) {
            Iterator<InteractStickerStruct> it = interactStickerStructs.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().getType() == 16) {
                    if (((h) aVar.f77835j.f79368m).f68599c) {
                        b bVar = new b(aVar.getContext());
                        bVar.a(aVar.getContext().getResources().getString(R.string.bep), new bb(aVar));
                        bVar.b(aVar.getContext().getResources().getString(R.string.be9), d.f77878a);
                        ((com.bytedance.tux.dialog.b) c.a(aVar.getContext()).a(false).a(R.string.beq).b(R.string.ber)).a(bVar).a().b().show();
                        return;
                    }
                }
            }
        }
        aVar.d();
    }
}
