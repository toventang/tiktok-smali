package com.ss.android.ugc.aweme.comment.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.bd.a;
import com.ss.android.ugc.aweme.emoji.i.b.b;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.view.f;
import com.ss.android.ugc.aweme.views.MentionTextView;
import java.util.List;

public final class bu implements by {

    /* renamed from: a  reason: collision with root package name */
    public MentionTextView f72632a;

    /* renamed from: b  reason: collision with root package name */
    public Context f72633b;

    static {
        Covode.recordClassIndex(44746);
    }

    @Override // com.ss.android.ugc.aweme.comment.ui.by
    public final m a() {
        return (m) o.a(this.f72633b);
    }

    public bu(Context context, MentionTextView mentionTextView) {
        this.f72633b = context;
        this.f72632a = mentionTextView;
    }

    @Override // com.ss.android.ugc.aweme.comment.ui.by
    public final void a(final CharSequence charSequence, final List<TextExtraStruct> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f72632a, "alpha", 0.0f).setDuration(100L);
        duration.setInterpolator(new a());
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f72632a, "alpha", 0.0f, 1.0f).setDuration(100L);
        duration2.setInterpolator(new a());
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.comment.ui.bu.AnonymousClass1 */

            static {
                Covode.recordClassIndex(44747);
            }

            public final void onAnimationEnd(Animator animator) {
                bu.this.f72632a.setText(charSequence);
                b.a(bu.this.f72632a);
                bu.this.f72632a.a(list, new f(), (MentionTextView.d) null);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(duration, duration2);
        animatorSet.start();
    }
}
