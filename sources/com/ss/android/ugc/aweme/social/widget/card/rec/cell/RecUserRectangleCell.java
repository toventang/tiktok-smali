package com.ss.android.ugc.aweme.social.widget.card.rec.cell;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.widget.card.view.FollowButtonWithBlock;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.g.a;
import h.w;

public final class RecUserRectangleCell extends RecommendUserCell<a> {
    static {
        Covode.recordClassIndex(87555);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell
    public final int a() {
        return R.layout.b12;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell
    public final void a(FollowButtonWithBlock followButtonWithBlock, FollowStatus followStatus) {
        l.d(followButtonWithBlock, "");
        l.d(followStatus, "");
        super.a(followButtonWithBlock, followStatus);
        a(followStatus, followButtonWithBlock);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell
    public final void a(User user, FollowButtonWithBlock followButtonWithBlock) {
        l.d(user, "");
        l.d(followButtonWithBlock, "");
        FollowStatus followStatus = new FollowStatus();
        followStatus.followStatus = user.getFollowStatus();
        a(followStatus, followButtonWithBlock);
        super.a(user, followButtonWithBlock);
    }

    private final void a(FollowStatus followStatus, FollowButtonWithBlock followButtonWithBlock) {
        int i2 = followStatus.followStatus;
        if (i2 == 0) {
            ViewGroup.LayoutParams layoutParams = followButtonWithBlock.getLayoutParams();
            if (layoutParams != null) {
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                layoutParams.width = a.a(TypedValue.applyDimension(1, 88.0f, system.getDisplayMetrics()));
                followButtonWithBlock.setLayoutParams(layoutParams);
                d().setVisibility(0);
                return;
            }
            throw new w("null cannot be cast to non-null type");
        } else if (i2 == 1 || i2 == 2 || i2 == 4) {
            ViewGroup.LayoutParams layoutParams2 = followButtonWithBlock.getLayoutParams();
            if (layoutParams2 != null) {
                Resources system2 = Resources.getSystem();
                l.a((Object) system2, "");
                layoutParams2.width = a.a(TypedValue.applyDimension(1, 120.0f, system2.getDisplayMetrics()));
                followButtonWithBlock.setLayoutParams(layoutParams2);
                d().setVisibility(8);
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }
}
