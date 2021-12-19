package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class CaptionVideoPlayerListModel implements Serializable {
    @c(a = "list")
    private final List<CaptionVideoPlayerItemModel> list;

    static {
        Covode.recordClassIndex(59359);
    }

    public CaptionVideoPlayerListModel() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feed.model.CaptionVideoPlayerListModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CaptionVideoPlayerListModel copy$default(CaptionVideoPlayerListModel captionVideoPlayerListModel, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list2 = captionVideoPlayerListModel.list;
        }
        return captionVideoPlayerListModel.copy(list2);
    }

    public final List<CaptionVideoPlayerItemModel> component1() {
        return this.list;
    }

    public final CaptionVideoPlayerListModel copy(List<CaptionVideoPlayerItemModel> list2) {
        return new CaptionVideoPlayerListModel(list2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CaptionVideoPlayerListModel) && l.a(this.list, ((CaptionVideoPlayerListModel) obj).list);
        }
        return true;
    }

    public final int hashCode() {
        List<CaptionVideoPlayerItemModel> list2 = this.list;
        if (list2 != null) {
            return list2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CaptionVideoPlayerListModel(list=" + this.list + ")";
    }

    public final List<CaptionVideoPlayerItemModel> getList() {
        return this.list;
    }

    public CaptionVideoPlayerListModel(List<CaptionVideoPlayerItemModel> list2) {
        this.list = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CaptionVideoPlayerListModel(List list2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : list2);
    }
}
