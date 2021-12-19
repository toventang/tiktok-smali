package com.ss.android.ugc.aweme.comment.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.util.j;
import com.ss.android.ugc.aweme.views.RtlViewPager;
import h.f.b.l;
import java.util.Objects;

public final class FixedCommentViewPager extends RtlViewPager {
    static {
        Covode.recordClassIndex(44978);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FixedCommentViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (getChildCount() > 1) {
            View childAt = getChildAt(0);
            l.b(childAt, "");
            if (childAt.getTag() instanceof String) {
                Object tag = childAt.getTag();
                Objects.requireNonNull(tag, "null cannot be cast to non-null type kotlin.String");
                if (TextUtils.equals((String) tag, "comment_list_page")) {
                    int childCount = getChildCount();
                    for (int i6 = 1; i6 < childCount; i6++) {
                        View childAt2 = getChildAt(i6);
                        View childAt3 = getChildAt(i6 - 1);
                        l.b(childAt2, "");
                        int left = childAt2.getLeft();
                        l.b(childAt3, "");
                        if (left < childAt3.getRight()) {
                            int left2 = childAt2.getLeft();
                            int right = childAt2.getRight();
                            int right2 = childAt3.getRight();
                            childAt2.layout(right2, childAt2.getTop(), childAt2.getMeasuredWidth() + right2, childAt2.getBottom());
                            j.b("Comment ViewPager => child(" + i6 + ") before fix: {" + left2 + ", " + right + "}, after fix: {" + childAt2.getLeft() + ", " + childAt2.getRight() + '}');
                        }
                    }
                    return;
                }
            }
            j.a("Comment ViewPager => child(0) is not CommentList");
        }
    }
}
