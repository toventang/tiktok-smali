package com.ss.android.ugc.aweme.feed.adapter;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.RelationLabelHelper;
import com.ss.android.ugc.aweme.feed.x.m;
import java.util.Collection;
import org.greenrobot.eventbus.j;

public class ForwardFeedVideoViewHolder extends VideoViewCell implements j {

    /* renamed from: a  reason: collision with root package name */
    private final x f91506a = new x(at(), this.A);

    /* renamed from: b  reason: collision with root package name */
    private Aweme f91507b;

    static {
        Covode.recordClassIndex(57574);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final Aweme P() {
        return this.f91507b;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void bj_() {
        super.bj_();
        x xVar = this.f91506a;
        if (xVar.f91892b == null) {
            return;
        }
        if ((xVar.f91892b.getRelationLabel() != null && xVar.f91892b.getRelationLabel().getType() == 1 && !TextUtils.isEmpty(xVar.f91892b.getRelationLabel().getLabelInfo())) || (xVar.f91892b.getFeedRelationLabel() != null && xVar.f91892b.getFeedRelationLabel().getType().intValue() == 3 && !b.a((Collection) xVar.f91892b.getFeedRelationLabel().getUserList()))) {
            new y(xVar);
            if (xVar.f91891a != null && !RelationLabelHelper.hasDuoShanLabel(xVar.f91892b.getForwardItem()) && !RelationLabelHelper.hasNewRelationLabel(xVar.f91892b.getForwardItem())) {
                if (RelationLabelHelper.hasNewRelationLabel(xVar.f91892b)) {
                    xVar.f91892b.getForwardItem().setNewRelationLabel(xVar.f91892b.getNewRelationLabel());
                    xVar.f91892b.getForwardItem();
                    return;
                }
                xVar.f91892b.getForwardItem();
                xVar.f91892b.getRelationLabel().getLabelInfo();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void a(Aweme aweme) {
        this.f91507b = aweme;
        this.f91506a.f91892b = aweme;
        super.a(m.c(this.f91507b));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final Aweme f(int i2) {
        if (i2 == 7) {
            return this.f91507b;
        }
        return super.f(i2);
    }

    ForwardFeedVideoViewHolder(cf cfVar) {
        super(cfVar);
    }
}
