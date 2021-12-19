package com.ss.android.ugc.aweme.comment.k;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.f.a;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.comment.api.GifEmojiApi;
import com.ss.android.ugc.aweme.comment.model.GifEmoji;
import com.ss.android.ugc.aweme.comment.model.GifEmojiResponse;
import com.ss.android.ugc.aweme.comment.model.StickerBean;
import f.a.t;
import h.a.z;
import h.f.b.l;
import java.util.List;

final class b extends a<d, List<? extends GifEmoji>, d, GifEmojiResponse> {
    static {
        Covode.recordClassIndex(44269);
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object b(Object obj) {
        l.d(obj, "");
        return obj;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t<GifEmojiResponse> a(d dVar) {
        d dVar2 = dVar;
        l.d(dVar2, "");
        t<GifEmojiResponse> b2 = ((GifEmojiApi) GifEmojiApi.a.f71445a.getValue()).searchGifEmoji(dVar2.f72076a, dVar2.f72077b, UGCMonitor.EVENT_COMMENT, dVar2.f72078c).b(f.a.h.a.b(f.a.k.a.f158006c));
        l.b(b2, "");
        return b2;
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        List<GifEmoji> stickerList;
        GifEmojiResponse gifEmojiResponse = (GifEmojiResponse) obj2;
        l.d(obj, "");
        l.d(gifEmojiResponse, "");
        StickerBean stickers = gifEmojiResponse.getStickers();
        if (stickers == null || (stickerList = stickers.getStickerList()) == null) {
            return z.INSTANCE;
        }
        return stickerList;
    }
}
