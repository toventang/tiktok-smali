package com.ss.android.ugc.aweme.common.a;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.widget.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;

public abstract class d extends g<Aweme> {
    static {
        Covode.recordClassIndex(47121);
    }

    /* access modifiers changed from: protected */
    public boolean b(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.getItemViewType() == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (b(viewHolder)) {
            ((g) viewHolder).b(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (b(viewHolder)) {
            g gVar = (g) viewHolder;
            gVar.b(false);
            gVar.ak_();
        }
    }

    public final int a(String str) {
        if (this.f76354l != null && !this.f76354l.isEmpty() && !TextUtils.isEmpty(str)) {
            int size = this.f76354l.size();
            for (int i2 = 0; i2 < size; i2++) {
                Aweme aweme = (Aweme) this.f76354l.get(i2);
                if (aweme != null && m.a(str, aweme.getAid())) {
                    if (b() != null) {
                        return i2 + 1;
                    } else {
                        return i2;
                    }
                }
            }
        }
        return -1;
    }

    public void a(FollowStatus followStatus) {
        User author;
        if (!(this.f76354l == null || this.f76354l.isEmpty() || followStatus == null || TextUtils.isEmpty(followStatus.userId))) {
            for (Aweme aweme : this.f76354l) {
                if (!(aweme == null || (author = aweme.getAuthor()) == null || !followStatus.userId.equals(author.getUid()))) {
                    author.setFollowStatus(followStatus.followStatus);
                }
            }
        }
    }
}
