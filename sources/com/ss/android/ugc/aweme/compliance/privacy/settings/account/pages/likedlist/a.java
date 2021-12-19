package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.likedlist;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.app.s;
import h.f.b.l;

public final class a extends com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a<LikedListViewModel> {
    static {
        Covode.recordClassIndex(48136);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a
    public final String c() {
        return "favorite";
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        s sVar = s.a.f66880a;
        l.b(sVar, "");
        aj<Boolean> d2 = sVar.d();
        l.b(d2, "");
        d2.b(true);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.likedlist.LikedListViewModel r4, androidx.fragment.app.Fragment r5) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.likedlist.a.<init>(com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.likedlist.LikedListViewModel, androidx.fragment.app.Fragment):void");
    }
}
