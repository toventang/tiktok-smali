package com.ss.android.ugc.aweme.notification.b;

import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.notification.utils.a;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.views.MutualRelationView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.g.a;
import java.util.List;

public final class b {
    static {
        Covode.recordClassIndex(72800);
    }

    public static final void a(MutualRelationView mutualRelationView, MatchedFriendStruct matchedFriendStruct, int i2) {
        List<MutualUser> userList;
        if (mutualRelationView != null) {
            a.a(mutualRelationView);
            if (matchedFriendStruct != null) {
                a.b(mutualRelationView);
                MutualStruct mMutualStruct = matchedFriendStruct.getMMutualStruct();
                boolean z = false;
                if (!(mMutualStruct == null || (userList = mMutualStruct.getUserList()) == null || userList.size() <= 0)) {
                    z = true;
                }
                a(mutualRelationView, i2, z);
                if (z) {
                    mutualRelationView.a(matchedFriendStruct.getMMutualStruct(), 4);
                } else {
                    mutualRelationView.a();
                }
                mutualRelationView.getTvDesc().setText(matchedFriendStruct.getRecommendReason());
            }
        }
    }

    public static final void a(MutualRelationView mutualRelationView, int i2, boolean z) {
        if (mutualRelationView != null) {
            if (!z) {
                p.d(mutualRelationView.getTvDesc(), 0);
            } else {
                TuxTextView tvDesc = mutualRelationView.getTvDesc();
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                p.d(tvDesc, a.a(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics())));
            }
            mutualRelationView.b();
            if (i2 == 0) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                Resources system2 = Resources.getSystem();
                l.a((Object) system2, "");
                gradientDrawable.setCornerRadius(TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics()));
                gradientDrawable.setColor(androidx.core.content.b.c(mutualRelationView.getContext(), R.color.f159922f));
                mutualRelationView.setRootBackground(gradientDrawable);
                Resources system3 = Resources.getSystem();
                l.a((Object) system3, "");
                int a2 = a.a(TypedValue.applyDimension(1, 16.0f, system3.getDisplayMetrics()));
                Resources system4 = Resources.getSystem();
                l.a((Object) system4, "");
                mutualRelationView.a(a2, a.a(TypedValue.applyDimension(1, 13.0f, system4.getDisplayMetrics())));
                Resources system5 = Resources.getSystem();
                l.a((Object) system5, "");
                mutualRelationView.setTuxTextSize(a.a(TypedValue.applyDimension(1, 12.0f, system5.getDisplayMetrics())));
                Resources system6 = Resources.getSystem();
                l.a((Object) system6, "");
                Integer valueOf = Integer.valueOf(a.a(TypedValue.applyDimension(1, 5.0f, system6.getDisplayMetrics())));
                Resources system7 = Resources.getSystem();
                l.a((Object) system7, "");
                Integer valueOf2 = Integer.valueOf(a.a(TypedValue.applyDimension(1, 2.0f, system7.getDisplayMetrics())));
                Resources system8 = Resources.getSystem();
                l.a((Object) system8, "");
                Integer valueOf3 = Integer.valueOf(a.a(TypedValue.applyDimension(1, 5.0f, system8.getDisplayMetrics())));
                Resources system9 = Resources.getSystem();
                l.a((Object) system9, "");
                mutualRelationView.a(valueOf, valueOf2, valueOf3, Integer.valueOf(a.a(TypedValue.applyDimension(1, 2.0f, system9.getDisplayMetrics()))));
                mutualRelationView.getTvDesc().setTextColor(androidx.core.content.b.c(mutualRelationView.getContext(), R.color.c5));
                mutualRelationView.getTvDesc().setTuxFont(72);
                mutualRelationView.b(androidx.core.content.b.c(mutualRelationView.getContext(), R.color.n), androidx.core.content.b.c(mutualRelationView.getContext(), R.color.c4));
            } else if (i2 == 1) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                Resources system10 = Resources.getSystem();
                l.a((Object) system10, "");
                gradientDrawable2.setCornerRadius(TypedValue.applyDimension(1, 2.0f, system10.getDisplayMetrics()));
                mutualRelationView.setRootBackground(gradientDrawable2);
                Resources system11 = Resources.getSystem();
                l.a((Object) system11, "");
                int a3 = a.a(TypedValue.applyDimension(1, 16.0f, system11.getDisplayMetrics()));
                Resources system12 = Resources.getSystem();
                l.a((Object) system12, "");
                mutualRelationView.a(a3, a.a(TypedValue.applyDimension(1, 13.0f, system12.getDisplayMetrics())));
                Resources system13 = Resources.getSystem();
                l.a((Object) system13, "");
                mutualRelationView.setTuxTextSize(a.a(TypedValue.applyDimension(1, 14.0f, system13.getDisplayMetrics())));
                Resources system14 = Resources.getSystem();
                l.a((Object) system14, "");
                Integer valueOf4 = Integer.valueOf(a.a(TypedValue.applyDimension(1, 0.0f, system14.getDisplayMetrics())));
                Resources system15 = Resources.getSystem();
                l.a((Object) system15, "");
                Integer valueOf5 = Integer.valueOf(a.a(TypedValue.applyDimension(1, 2.0f, system15.getDisplayMetrics())));
                Resources system16 = Resources.getSystem();
                l.a((Object) system16, "");
                Integer valueOf6 = Integer.valueOf(a.a(TypedValue.applyDimension(1, 0.0f, system16.getDisplayMetrics())));
                Resources system17 = Resources.getSystem();
                l.a((Object) system17, "");
                mutualRelationView.a(valueOf4, valueOf5, valueOf6, Integer.valueOf(a.a(TypedValue.applyDimension(1, 2.0f, system17.getDisplayMetrics()))));
                mutualRelationView.getTvDesc().setTextColor(androidx.core.content.b.c(mutualRelationView.getContext(), R.color.c4));
                mutualRelationView.getTvDesc().setTuxFont(51);
            }
        }
    }

    public static final void a(MutualRelationView mutualRelationView, View view, View view2, boolean z) {
        if (view != null && mutualRelationView != null) {
            ConstraintLayout constraintLayout = null;
            if (view2 != null) {
                constraintLayout = (ConstraintLayout) view2.findViewById(R.id.cxx);
            }
            if ((constraintLayout instanceof ConstraintLayout) && constraintLayout != null) {
                com.ss.android.ugc.aweme.notification.utils.a aVar = new com.ss.android.ugc.aweme.notification.utils.a(constraintLayout);
                if (z) {
                    a.C2917a a2 = aVar.a();
                    if (a2 != null) {
                        a2.a(view.getId(), R.id.cx6);
                        a2.b(view.getId(), -1);
                        a2.a();
                        return;
                    }
                    return;
                }
                a.C2917a a3 = aVar.a();
                if (a3 != null) {
                    a3.a(view.getId(), R.id.be3);
                    a3.b(view.getId(), R.id.be2);
                    a3.a();
                }
            }
        }
    }
}
