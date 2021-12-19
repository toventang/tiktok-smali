package com.bytedance.android.livesdk.qa;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.model.message.bj;
import com.bytedance.android.livesdk.qa.i;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final i.f f20512a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageView f20513b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f20514c;

    static {
        Covode.recordClassIndex(12105);
    }

    q(i.f fVar, ImageView imageView, TextView textView) {
        this.f20512a = fVar;
        this.f20513b = imageView;
        this.f20514c = textView;
    }

    public final void onClick(View view) {
        i.f fVar = this.f20512a;
        ImageView imageView = this.f20513b;
        TextView textView = this.f20514c;
        if (!fVar.f20494g) {
            fVar.f20494g = true;
            int i2 = !fVar.f20492e.booleanValue();
            if (!fVar.f20492e.booleanValue()) {
                fVar.f20493f++;
                i.f.a(imageView, textView, 2131234832, R.attr.ama, fVar.f20493f);
            } else {
                fVar.f20493f--;
                i.f.a(imageView, textView, 2131234532, R.attr.amv, fVar.f20493f);
            }
            bj bjVar = fVar.f20488a;
            b.a.a(Boolean.valueOf(fVar.f20492e.booleanValue() ^ true).booleanValue() ? "livesdk_qa_question_like" : "livesdk_qa_question_cancel_like").a().a("question_content", bjVar.f19333b).a("question_user_id", bjVar.f19336e.getId()).a("like_enter_from", "qa_list").a("qa_list_enter_from", i.this.o).b();
            fVar.f20495h.a(((QAApi) e.a().a(QAApi.class)).likeQuestion(fVar.f20488a.f19332a, i2, 1).a(new f()).a(new w(fVar), new x(fVar, imageView, textView)));
        }
    }
}
