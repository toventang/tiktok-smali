package com.ss.android.ugc.aweme.shortvideo.sticker.question;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class b extends a {
    static {
        Covode.recordClassIndex(85685);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a
    public final List<NormalTrackTimeStamp> a(long j2, InteractStickerStruct interactStickerStruct) {
        l.d(interactStickerStruct, "");
        return c.b(j2, interactStickerStruct);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a
    public final void a(float f2, float f3, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b bVar) {
        l.d(bVar, "");
        if (com.bytedance.ies.abmock.b.a().a(true, "one_click_question_sticker_go_to_qa_page", false)) {
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a aVar = this.f130388d;
            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.question.FeedQaStickerView");
            if (!((a) aVar).c()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f130387c).a(R.string.f6n).a();
                return;
            }
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a aVar2 = this.f130388d;
            Objects.requireNonNull(aVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.question.FeedQaStickerView");
            ((a) aVar2).g();
            return;
        }
        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a aVar3 = this.f130388d;
        Objects.requireNonNull(aVar3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.question.FeedQaStickerView");
        bVar.a(aVar3.a(f2, f3));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, a aVar, InteractStickerStruct interactStickerStruct, j jVar) {
        super(context, aVar, interactStickerStruct, jVar);
        l.d(context, "");
        l.d(aVar, "");
        l.d(interactStickerStruct, "");
    }
}
