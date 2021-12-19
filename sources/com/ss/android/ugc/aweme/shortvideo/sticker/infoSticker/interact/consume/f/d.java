package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.tooltip.h;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.n;
import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class d extends a {
    static {
        Covode.recordClassIndex(85518);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a
    public final List<NormalTrackTimeStamp> a(long j2, InteractStickerStruct interactStickerStruct) {
        l.d(interactStickerStruct, "");
        return c.a(interactStickerStruct);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a
    public final void a(float f2, float f3, b bVar) {
        HashtagStruct hashtagInfo;
        InteractStickerStruct interactStickerStruct;
        MentionStruct mentionInfo;
        String userId;
        MentionStruct mentionInfo2;
        UrlModel avatarUrl;
        List<String> urlList;
        String str = "";
        l.d(bVar, str);
        a aVar = this.f130388d;
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.MentionHashTagInteractStickerView");
        n nVar = (n) aVar;
        int[] iArr = new int[2];
        nVar.f130437j.getLocationOnScreen(iArr);
        if (nVar.f130435h == 8 && (interactStickerStruct = nVar.f130433f) != null && interactStickerStruct.getMentionInfo() != null) {
            InteractStickerStruct interactStickerStruct2 = nVar.f130433f;
            if (interactStickerStruct2 != null && (mentionInfo = interactStickerStruct2.getMentionInfo()) != null && (userId = mentionInfo.getUserId()) != null && userId.length() != 0) {
                InteractStickerStruct interactStickerStruct3 = nVar.f130433f;
                if (!(interactStickerStruct3 == null || (mentionInfo2 = interactStickerStruct3.getMentionInfo()) == null || (avatarUrl = mentionInfo2.getAvatarUrl()) == null || (urlList = avatarUrl.getUrlList()) == null || urlList.isEmpty())) {
                    String str2 = urlList.get(0);
                    l.b(str2, str);
                    str = str2;
                }
                com.bytedance.tux.tooltip.a d2 = ((com.bytedance.tux.tooltip.a.a.b) new com.bytedance.tux.tooltip.a.a.b(nVar.f130436i).a(h.TOP).a(((int) f2) + iArr[0], ((int) f3) + iArr[1])).a(new n.e(nVar, str)).d();
                d2.a(true, new n.c(nVar));
                d2.a();
            }
        } else if (nVar.f130435h == 9) {
            InteractStickerStruct interactStickerStruct4 = nVar.f130433f;
            if (interactStickerStruct4 == null || (hashtagInfo = interactStickerStruct4.getHashtagInfo()) == null || hashtagInfo.getStatus() != 0) {
                com.bytedance.tux.tooltip.a d3 = ((com.bytedance.tux.tooltip.a.a.b) new com.bytedance.tux.tooltip.a.a.b(nVar.f130436i).a(h.TOP).a(((int) f2) + iArr[0], ((int) f3) + iArr[1])).a(new n.f(nVar)).a(true, (View.OnClickListener) new n.g(nVar)).d();
                d3.a(true, new n.d(nVar));
                d3.a();
                return;
            }
            new com.bytedance.tux.g.b(nVar.c()).a(nVar.f130436i.getResources().getString(R.string.cax)).b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, n nVar, InteractStickerStruct interactStickerStruct, j jVar) {
        super(context, nVar, interactStickerStruct, jVar);
        l.d(context, "");
        l.d(nVar, "");
        l.d(interactStickerStruct, "");
    }
}
