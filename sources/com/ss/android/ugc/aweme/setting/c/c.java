package com.ss.android.ugc.aweme.setting.c;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.b;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.profile.model.StoryBlockInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;

public final class c extends f<User> {

    /* renamed from: a  reason: collision with root package name */
    protected Activity f122150a;

    static {
        Covode.recordClassIndex(80079);
    }

    public c(Activity activity) {
        this.f122150a = activity;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.h
    public final RecyclerView.ViewHolder a_(ViewGroup viewGroup) {
        int c2 = b.c(viewGroup.getContext(), R.color.c5);
        f(c2);
        RecyclerView.ViewHolder a_ = super.a_(viewGroup);
        AppCompatTextView appCompatTextView = new AppCompatTextView(viewGroup.getContext());
        appCompatTextView.setGravity(17);
        appCompatTextView.setTextColor(c2);
        appCompatTextView.setTextSize(13.0f);
        appCompatTextView.setText(R.string.cfo);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(viewGroup.getContext());
        appCompatTextView2.setGravity(17);
        appCompatTextView2.setTextColor(c2);
        appCompatTextView2.setTextSize(13.0f);
        appCompatTextView2.setText(R.string.g2t);
        DmtStatusView dmtStatusView = (DmtStatusView) a_.itemView;
        dmtStatusView.setBuilder(dmtStatusView.c().b(appCompatTextView2));
        return a_;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        return new a(a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ayv, viewGroup, false), this.f122150a);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        String uniqueId;
        a aVar = (a) viewHolder;
        User user = (User) this.f76354l.get(i2);
        if (user != null) {
            boolean z = false;
            aVar.f122144g = 0;
            if (aVar.f122144g != 0) {
                aVar.f122141d.setBackgroundColor(aVar.f122141d.getResources().getColor(R.color.a9));
                aVar.f122139b.setTextColor(aVar.f122141d.getResources().getColor(R.color.ai));
                aVar.f122140c.setTextColor(aVar.f122141d.getResources().getColor(R.color.c2));
            }
            aVar.f122143f = 0;
            if (aVar.f122143f == 1) {
                z = true;
            }
            aVar.f122145h = z;
            aVar.f122142e = user;
            StoryBlockInfo storyBlockInfo = aVar.f122142e.getStoryBlockInfo();
            if (aVar.f122145h) {
                if (storyBlockInfo == null) {
                    StoryBlockInfo storyBlockInfo2 = new StoryBlockInfo();
                    storyBlockInfo2.setBlock(true);
                    aVar.f122142e.setStoryBlockInfo(storyBlockInfo2);
                }
                aVar.a(true);
            } else {
                aVar.a(aVar.f122142e.isBlock);
            }
            e.a(aVar.f122138a, aVar.f122142e.getAvatarThumb());
            aVar.f122139b.setText(aVar.f122142e.getNickname());
            TextView textView = aVar.f122140c;
            StringBuilder sb = new StringBuilder("@");
            if (TextUtils.isEmpty(user.getUniqueId())) {
                uniqueId = user.getShortId();
            } else {
                uniqueId = user.getUniqueId();
            }
            textView.setText(sb.append(uniqueId).toString());
        }
    }
}
