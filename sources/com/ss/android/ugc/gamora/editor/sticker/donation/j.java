package com.ss.android.ugc.gamora.editor.sticker.donation;

import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.gamora.editor.sticker.donation.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import org.json.JSONObject;

public final class j extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public String f146584a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f146585b;

    /* renamed from: c  reason: collision with root package name */
    private final String f146586c;

    /* renamed from: d  reason: collision with root package name */
    private final String f146587d;

    static {
        Covode.recordClassIndex(96467);
    }

    public final void updateDrawState(TextPaint textPaint) {
        l.d(textPaint, "");
        textPaint.setColor(b.c(this.f146585b, R.color.bh));
    }

    public final void onClick(View view) {
        l.d(view, "");
        if (!com.ss.android.ugc.aweme.df.l.a(view, 1200)) {
            String str = this.f146586c;
            String str2 = this.f146587d;
            JSONObject jSONObject = new JSONObject();
            a.a(jSONObject, new a.f(str, str2));
            d.a("tiltify_about_click", jSONObject);
            Bundle bundle = new Bundle();
            bundle.putString("url", this.f146584a);
            bundle.putString("title", this.f146585b.getString(R.string.bav));
            bundle.putString("enter_from", "tiltify_page");
            SmartRouter.buildRoute(this.f146585b, "aweme://donation/web/page").withParam(bundle).open();
        }
    }

    public j(Context context, String str, String str2) {
        l.d(context, "");
        this.f146585b = context;
        this.f146586c = str;
        this.f146587d = str2;
    }
}
