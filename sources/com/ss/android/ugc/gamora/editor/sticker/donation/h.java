package com.ss.android.ugc.gamora.editor.sticker.donation;

import android.view.View;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.j;
import com.ss.android.ugc.aweme.editSticker.interact.d;
import com.ss.android.ugc.aweme.editSticker.interact.e;
import com.ss.android.ugc.aweme.editSticker.interact.view.g;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.e.a;
import com.ss.android.ugc.aweme.tools.e.c;
import com.ss.android.ugc.gamora.editor.ab;
import com.ss.android.ugc.gamora.editor.sticker.b;
import com.ss.android.vesdk.VESize;

public interface h extends b {
    static {
        Covode.recordClassIndex(96465);
    }

    InteractStickerStruct E();

    boolean F();

    void G();

    void H();

    void I();

    void J();

    d K();

    boolean L();

    void a(i iVar);

    void a(j jVar);

    void a(e eVar);

    void a(a<g, g> aVar);

    void a(c<View> cVar);

    void a(ab abVar);

    void a(VESize vESize);

    void a(String str);

    void a(boolean z);

    boolean a(View view);

    void b(String str);

    void b(boolean z);

    boolean b(View view);
}
