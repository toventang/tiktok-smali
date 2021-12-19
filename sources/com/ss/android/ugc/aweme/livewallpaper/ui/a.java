package com.ss.android.ugc.aweme.livewallpaper.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.l;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.ss.android.ugc.aweme.base.utils.n;
import h.m.p;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.tux.sheet.sheet.a f108970a;

    static {
        Covode.recordClassIndex(69765);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.a$a  reason: collision with other inner class name */
    public static final class View$OnClickListenerC2791a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f108971a;

        static {
            Covode.recordClassIndex(69766);
        }

        View$OnClickListenerC2791a(a aVar) {
            this.f108971a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.bytedance.tux.sheet.sheet.a aVar = this.f108971a.f108970a;
            if (aVar != null) {
                aVar.dismiss();
            }
        }
    }

    static void a(l lVar, String str) {
        v a2 = r.a(str);
        a2.E = lVar;
        a2.a("WallPaperGuideDialog").c();
    }

    static void a(Context context, TextView textView, int i2) {
        MethodCollector.i(6154);
        int a2 = n.a(17.0d);
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i2);
        h.f.b.l.b(decodeResource, "");
        int width = decodeResource.getWidth();
        int height = decodeResource.getHeight();
        float f2 = (float) a2;
        Matrix matrix = new Matrix();
        matrix.postScale(f2 / ((float) width), f2 / ((float) height));
        Bitmap createBitmap = Bitmap.createBitmap(decodeResource, 0, 0, width, height, matrix, true);
        h.f.b.l.b(createBitmap, "");
        ImageSpan imageSpan = new ImageSpan(context, createBitmap);
        SpannableString spannableString = new SpannableString(textView.getText());
        CharSequence text = textView.getText();
        h.f.b.l.b(text, "");
        int a3 = p.a(text, "%s", 0, false, 6);
        spannableString.setSpan(imageSpan, a3, a3 + 2, 33);
        textView.setText(spannableString);
        MethodCollector.o(6154);
    }
}
