package com.ss.android.ugc.gamora.recorder.sticker.originalPanel;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.sticker.model.g;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class StickerItemList extends BaseResponse {
    @c(a = "cursor")
    private final int cursor;
    @c(a = "has_more")
    private final boolean hasMore;
    @c(a = "log_pb")
    private final LogPbBean logPb;
    @c(a = "effect")
    private final List<g> stickers;

    static {
        Covode.recordClassIndex(97878);
    }

    public StickerItemList() {
        this(0, false, null, null, 15, null);
    }

    public static int com_ss_android_ugc_gamora_recorder_sticker_originalPanel_StickerItemList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.gamora.recorder.sticker.originalPanel.StickerItemList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StickerItemList copy$default(StickerItemList stickerItemList, int i2, boolean z, List list, LogPbBean logPbBean, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = stickerItemList.cursor;
        }
        if ((i3 & 2) != 0) {
            z = stickerItemList.hasMore;
        }
        if ((i3 & 4) != 0) {
            list = stickerItemList.stickers;
        }
        if ((i3 & 8) != 0) {
            logPbBean = stickerItemList.logPb;
        }
        return stickerItemList.copy(i2, z, list, logPbBean);
    }

    public final int component1() {
        return this.cursor;
    }

    public final boolean component2() {
        return this.hasMore;
    }

    public final List<g> component3() {
        return this.stickers;
    }

    public final LogPbBean component4() {
        return this.logPb;
    }

    public final StickerItemList copy(int i2, boolean z, List<? extends g> list, LogPbBean logPbBean) {
        l.d(list, "");
        return new StickerItemList(i2, z, list, logPbBean);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerItemList)) {
            return false;
        }
        StickerItemList stickerItemList = (StickerItemList) obj;
        return this.cursor == stickerItemList.cursor && this.hasMore == stickerItemList.hasMore && l.a(this.stickers, stickerItemList.stickers) && l.a(this.logPb, stickerItemList.logPb);
    }

    public final int hashCode() {
        int com_ss_android_ugc_gamora_recorder_sticker_originalPanel_StickerItemList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_gamora_recorder_sticker_originalPanel_StickerItemList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.cursor) * 31;
        boolean z = this.hasMore;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (com_ss_android_ugc_gamora_recorder_sticker_originalPanel_StickerItemList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i2) * 31;
        List<g> list = this.stickers;
        int i6 = 0;
        int hashCode = (i5 + (list != null ? list.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i6 = logPbBean.hashCode();
        }
        return hashCode + i6;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "StickerItemList(cursor=" + this.cursor + ", hasMore=" + this.hasMore + ", stickers=" + this.stickers + ", logPb=" + this.logPb + ")";
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final List<g> getStickers() {
        return this.stickers;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.sticker.model.g> */
    /* JADX WARN: Multi-variable type inference failed */
    public StickerItemList(int i2, boolean z, List<? extends g> list, LogPbBean logPbBean) {
        l.d(list, "");
        this.cursor = i2;
        this.hasMore = z;
        this.stickers = list;
        this.logPb = logPbBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StickerItemList(int i2, boolean z, List list, LogPbBean logPbBean, int i3, h.f.b.g gVar) {
        this((i3 & 1) != 0 ? 0 : i2, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? z.INSTANCE : list, (i3 & 8) != 0 ? null : logPbBean);
    }
}
