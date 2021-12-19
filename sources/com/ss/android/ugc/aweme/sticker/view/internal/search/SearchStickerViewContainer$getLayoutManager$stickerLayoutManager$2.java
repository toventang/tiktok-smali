package com.ss.android.ugc.aweme.sticker.view.internal.search;

import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.covode.number.Covode;

public final class SearchStickerViewContainer$getLayoutManager$stickerLayoutManager$2 extends GridLayoutManager {
    final /* synthetic */ SearchStickerViewContainer L;

    static {
        Covode.recordClassIndex(89144);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final boolean g() {
        return true;
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchStickerViewContainer$getLayoutManager$stickerLayoutManager$2(SearchStickerViewContainer searchStickerViewContainer) {
        super(5, 1, false);
        this.L = searchStickerViewContainer;
    }
}
