package com.bytedance.android.livesdk.qa;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.a.a.b.a;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.qa.i;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.d.f;

final /* synthetic */ class x implements f {

    /* renamed from: a  reason: collision with root package name */
    private final i.f f20522a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageView f20523b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f20524c;

    static {
        Covode.recordClassIndex(12112);
    }

    x(i.f fVar, ImageView imageView, TextView textView) {
        this.f20522a = fVar;
        this.f20523b = imageView;
        this.f20524c = textView;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        i.f fVar = this.f20522a;
        ImageView imageView = this.f20523b;
        TextView textView = this.f20524c;
        Throwable th = (Throwable) obj;
        if (th instanceof a) {
            a aVar = (a) th;
            if (!TextUtils.isEmpty(aVar.getPrompt())) {
                ao.a(y.e(), aVar.getPrompt(), 0);
            }
        }
        if (fVar.f20492e.booleanValue()) {
            fVar.f20493f++;
            i.f.a(imageView, textView, 2131234832, R.attr.ama, fVar.f20493f);
        } else {
            fVar.f20493f--;
            i.f.a(imageView, textView, 2131234532, R.attr.amv, fVar.f20493f);
        }
        fVar.f20494g = false;
    }
}
