package com.ss.android.ugc.aweme.feed.caption.edit;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class EditCaptionItem {
    private final List<CaptionData> srcSubtitleItem;
    private final List<CaptionData> transSubtitleItem;

    static {
        Covode.recordClassIndex(58854);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditCaptionItem copy$default(EditCaptionItem editCaptionItem, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = editCaptionItem.transSubtitleItem;
        }
        if ((i2 & 2) != 0) {
            list2 = editCaptionItem.srcSubtitleItem;
        }
        return editCaptionItem.copy(list, list2);
    }

    public final List<CaptionData> component1() {
        return this.transSubtitleItem;
    }

    public final List<CaptionData> component2() {
        return this.srcSubtitleItem;
    }

    public final EditCaptionItem copy(List<CaptionData> list, List<CaptionData> list2) {
        return new EditCaptionItem(list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditCaptionItem)) {
            return false;
        }
        EditCaptionItem editCaptionItem = (EditCaptionItem) obj;
        return l.a(this.transSubtitleItem, editCaptionItem.transSubtitleItem) && l.a(this.srcSubtitleItem, editCaptionItem.srcSubtitleItem);
    }

    public final int hashCode() {
        List<CaptionData> list = this.transSubtitleItem;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<CaptionData> list2 = this.srcSubtitleItem;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "EditCaptionItem(transSubtitleItem=" + this.transSubtitleItem + ", srcSubtitleItem=" + this.srcSubtitleItem + ")";
    }

    public final List<CaptionData> getSrcSubtitleItem() {
        return this.srcSubtitleItem;
    }

    public final List<CaptionData> getTransSubtitleItem() {
        return this.transSubtitleItem;
    }

    public EditCaptionItem(List<CaptionData> list, List<CaptionData> list2) {
        this.transSubtitleItem = list;
        this.srcSubtitleItem = list2;
    }
}
