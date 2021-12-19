package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class NewStickerItemList extends BaseResponse {
    @c(a = "cursor")
    public long cursor;
    @c(a = "has_more")
    public int hasMore;
    @c(a = "log_pb")
    public LogPbBean logPb;
    @c(a = "effect")
    public List<NewFaceSticker> stickers;

    static {
        Covode.recordClassIndex(59432);
    }

    public NewStickerItemList() {
        this(0, 0, null, null, 15, null);
    }

    public static int com_ss_android_ugc_aweme_feed_model_NewStickerItemList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_feed_model_NewStickerItemList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feed.model.NewStickerItemList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewStickerItemList copy$default(NewStickerItemList newStickerItemList, long j2, int i2, List list, LogPbBean logPbBean, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j2 = newStickerItemList.cursor;
        }
        if ((i3 & 2) != 0) {
            i2 = newStickerItemList.hasMore;
        }
        if ((i3 & 4) != 0) {
            list = newStickerItemList.stickers;
        }
        if ((i3 & 8) != 0) {
            logPbBean = newStickerItemList.logPb;
        }
        return newStickerItemList.copy(j2, i2, list, logPbBean);
    }

    public final NewStickerItemList copy(long j2, int i2, List<NewFaceSticker> list, LogPbBean logPbBean) {
        return new NewStickerItemList(j2, i2, list, logPbBean);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewStickerItemList)) {
            return false;
        }
        NewStickerItemList newStickerItemList = (NewStickerItemList) obj;
        return this.cursor == newStickerItemList.cursor && this.hasMore == newStickerItemList.hasMore && l.a(this.stickers, newStickerItemList.stickers) && l.a(this.logPb, newStickerItemList.logPb);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_NewStickerItemList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((com_ss_android_ugc_aweme_feed_model_NewStickerItemList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.cursor) * 31) + com_ss_android_ugc_aweme_feed_model_NewStickerItemList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.hasMore)) * 31;
        List<NewFaceSticker> list = this.stickers;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_feed_model_NewStickerItemList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i2 = logPbBean.hashCode();
        }
        return hashCode + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "NewStickerItemList(cursor=" + this.cursor + ", hasMore=" + this.hasMore + ", stickers=" + this.stickers + ", logPb=" + this.logPb + ")";
    }

    public NewStickerItemList(long j2, int i2, List<NewFaceSticker> list, LogPbBean logPbBean) {
        this.cursor = j2;
        this.hasMore = i2;
        this.stickers = list;
        this.logPb = logPbBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewStickerItemList(long j2, int i2, List list, LogPbBean logPbBean, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0 : j2, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : list, (i3 & 8) == 0 ? logPbBean : null);
    }
}
