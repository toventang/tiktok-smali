package com.ss.android.ugc.aweme.sticker.view.internal.search;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.covode.number.Covode;

public final class SearchStickerViewContainer$getLayoutManager$stickerLayoutManager$1 extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SearchStickerViewContainer f136492a;

    static {
        Covode.recordClassIndex(89143);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final boolean g() {
        return true;
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchStickerViewContainer$getLayoutManager$stickerLayoutManager$1(SearchStickerViewContainer searchStickerViewContainer) {
        super(1, false);
        this.f136492a = searchStickerViewContainer;
    }
}
