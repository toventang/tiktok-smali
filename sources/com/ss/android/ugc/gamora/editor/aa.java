package com.ss.android.ugc.gamora.editor;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.j;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.editSticker.interact.d;
import com.ss.android.ugc.aweme.editSticker.interact.e;
import com.ss.android.ugc.aweme.editSticker.interact.view.g;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.e.a;
import com.ss.android.ugc.aweme.tools.e.c;
import com.ss.android.ugc.gamora.editor.sticker.b;
import com.ss.android.vesdk.VESize;

public interface aa extends b {
    static {
        Covode.recordClassIndex(95681);
    }

    void F();

    void G();

    InteractStickerStruct H();

    void I();

    void J();

    boolean K();

    d L();

    boolean M();

    void N();

    void a(j jVar);

    void a(CommentVideoModel commentVideoModel, boolean z, boolean z2);

    void a(e eVar);

    void a(a<g, g> aVar);

    void a(c<View> cVar);

    void a(VESize vESize);

    void a(String str);

    void a(boolean z);

    void b(String str);

    void b(boolean z);
}
