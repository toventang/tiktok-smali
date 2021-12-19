package com.ss.android.ugc.aweme.social.widget.card.rec.cell;

import android.content.res.Resources;
import android.graphics.Paint;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.widget.card.view.FollowButtonWithBlock;
import com.ss.android.ugc.aweme.views.MutualRelationView;
import com.ss.android.ugc.aweme.views.SuggestUserAvatarView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.w;
import java.util.List;

public final class RecUserSquareCell extends RecommendUserCell<a> {

    /* renamed from: a  reason: collision with root package name */
    public static int f133845a;

    /* renamed from: b  reason: collision with root package name */
    public static int f133846b = 1;

    /* renamed from: j  reason: collision with root package name */
    public static final Paint f133847j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f133848k = new a((byte) 0);

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell
    public final int a() {
        return R.layout.b14;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87562);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static int a(List<? extends User> list) {
            String quantityString;
            List<MutualUser> userList;
            l.d(list, "");
            RecUserSquareCell.f133846b = 1;
            for (T t : list) {
                if (t.getMutualStruct() == null) {
                    quantityString = t.getRecommendReason();
                } else {
                    List<MutualUser> userList2 = t.getMutualStruct().getUserList();
                    if (userList2 == null || userList2.isEmpty()) {
                        quantityString = d.a().getResources().getQuantityString(R.plurals.fb, t.getMutualStruct().getTotal(), Integer.valueOf(t.getMutualStruct().getTotal()));
                        l.b(quantityString, "");
                    } else {
                        quantityString = MutualRelationView.a.a(d.a(), Integer.valueOf(t.getMutualStruct().getMutualType()));
                    }
                }
                float measureText = RecUserSquareCell.f133847j.measureText(quantityString);
                if (!(t.getMutualStruct() == null || (userList = t.getMutualStruct().getUserList()) == null || userList.isEmpty())) {
                    MutualStruct mutualStruct = t.getMutualStruct();
                    l.b(mutualStruct, "");
                    float a2 = SuggestUserAvatarView.a.a(mutualStruct);
                    Resources system = Resources.getSystem();
                    l.a((Object) system, "");
                    measureText += (float) h.g.a.a(TypedValue.applyDimension(1, a2, system.getDisplayMetrics()));
                }
                int i2 = RecUserSquareCell.f133846b;
                double d2 = (double) measureText;
                Resources system2 = Resources.getSystem();
                l.a((Object) system2, "");
                double a3 = (double) h.g.a.a(TypedValue.applyDimension(1, 114.0f, system2.getDisplayMetrics()));
                Double.isNaN(d2);
                Double.isNaN(a3);
                RecUserSquareCell.f133846b = Math.max(i2, (int) Math.ceil(d2 / a3));
            }
            RecUserSquareCell.f133846b = Math.min(2, RecUserSquareCell.f133846b);
            float f2 = (float) (((RecUserSquareCell.f133846b - 1) * 14) + 176);
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            int a4 = h.g.a.a(TypedValue.applyDimension(1, f2, system3.getDisplayMetrics()));
            RecUserSquareCell.f133845a = a4;
            return a4;
        }
    }

    static {
        Covode.recordClassIndex(87561);
        Paint paint = new Paint();
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        paint.setTextSize(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics()));
        f133847j = paint;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell
    public final void a(View view) {
        l.d(view, "");
        super.a(view);
        if (f133845a != 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = f133845a;
                view.setLayoutParams(layoutParams);
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell
    public final void a(User user, FollowButtonWithBlock followButtonWithBlock) {
        l.d(user, "");
        l.d(followButtonWithBlock, "");
        followButtonWithBlock.setShouldShowMessageText(false);
        super.a(user, followButtonWithBlock);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell
    public final void a(a aVar, TuxTextView tuxTextView, MutualRelationView mutualRelationView) {
        l.d(aVar, "");
        l.d(tuxTextView, "");
        l.d(mutualRelationView, "");
        super.a(aVar, tuxTextView, mutualRelationView);
        User user = aVar.f133855a;
        if (user.getMutualStruct() != null) {
            mutualRelationView.setTuxTextSize(71);
            mutualRelationView.setAllTextColorUseAttrResource(R.attr.bj);
            List<MutualUser> userList = user.getMutualStruct().getUserList();
            if (userList == null || userList.isEmpty()) {
                mutualRelationView.a();
                mutualRelationView.getTvDesc().setMaxLines(2);
                mutualRelationView.getTvDesc().setMinTextSize(10.0f);
                mutualRelationView.getTvDesc().setGravity(17);
                return;
            }
            MutualStruct mutualStruct = user.getMutualStruct();
            l.b(mutualStruct, "");
            mutualRelationView.a(mutualStruct, 130.0f);
        }
    }
}
