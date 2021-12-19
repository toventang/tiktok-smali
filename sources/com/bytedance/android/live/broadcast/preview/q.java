package com.bytedance.android.live.broadcast.preview;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.android.live.b.f;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.browser.c.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final q f8276a = new q();

    private q() {
    }

    static {
        Covode.recordClassIndex(4206);
    }

    public static String a() {
        return " " + y.a((int) R.string.e4w) + " >";
    }

    static final class b extends m implements h.f.a.b<Object, z> {
        final /* synthetic */ SpannableString $this_apply;

        static {
            Covode.recordClassIndex(4208);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SpannableString spannableString) {
            super(1);
            this.$this_apply = spannableString;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            a(obj);
            return z.f158842a;
        }

        public final void a(Object obj) {
            l.d(obj, "");
            SpannableString spannableString = this.$this_apply;
            spannableString.setSpan(obj, spannableString.length() - q.a().length(), this.$this_apply.length(), 17);
        }
    }

    public static final class a extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f8277a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.live.broadcast.model.m f8278b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DataChannel f8279c;

        static {
            Covode.recordClassIndex(4207);
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
        }

        public final void onClick(View view) {
            l.d(view, "");
            Context context = this.f8277a;
            com.bytedance.android.live.broadcast.model.m mVar = this.f8278b;
            d webViewManager = ((f) com.bytedance.android.live.t.a.a(f.class)).webViewManager();
            d.a b2 = e.b(mVar.f7932b + "&enter_from=toast");
            b2.f14292c = true;
            b2.f14291b = y.a((int) R.string.gl9);
            webViewManager.a(context, b2);
            b.a.a("livesdk_appeal_click").a(this.f8279c).a("enter_from", "toast").a("appeal_type", "general").b();
        }

        a(Context context, com.bytedance.android.live.broadcast.model.m mVar, DataChannel dataChannel) {
            this.f8277a = context;
            this.f8278b = mVar;
            this.f8279c = dataChannel;
        }
    }
}
