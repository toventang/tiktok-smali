package com.lynx.tasm.behavior.shadow.text;

import android.graphics.Typeface;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.j;

public class n {

    /* renamed from: d  reason: collision with root package name */
    private static final BoringLayout.Metrics f56023d = new BoringLayout.Metrics();

    /* renamed from: a  reason: collision with root package name */
    public Layout f56024a;

    /* renamed from: b  reason: collision with root package name */
    final p f56025b;

    /* renamed from: c  reason: collision with root package name */
    boolean f56026c;

    /* renamed from: e  reason: collision with root package name */
    private Typeface f56027e;

    /* renamed from: f  reason: collision with root package name */
    private float f56028f = -1.0f;

    /* renamed from: g  reason: collision with root package name */
    private int f56029g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f56030h = -1;

    /*  JADX ERROR: Type inference failed with exception
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r9v6 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:107)
        */
    private void a(com.lynx.tasm.behavior.j r31) {
        /*
        // Method dump skipped, instructions count: 3790
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.shadow.text.n.a(com.lynx.tasm.behavior.j):void");
    }

    static {
        Covode.recordClassIndex(35008);
    }

    public static class a extends Exception {
        private String fontFamily;

        static {
            Covode.recordClassIndex(35009);
        }

        public a(String str) {
            this.fontFamily = str;
        }
    }

    n(j jVar, p pVar) {
        h[] hVarArr;
        this.f56025b = pVar;
        a(jVar);
        if (pVar.f56039g) {
            Layout layout = this.f56024a;
            if (layout.getEllipsisCount(layout.getLineCount() - 1) != 0 && (pVar.f56033a.f56040a instanceof SpannableStringBuilder)) {
                int lineCount = this.f56024a.getLineCount() - 1;
                int lineStart = this.f56024a.getLineStart(lineCount) + this.f56024a.getEllipsisStart(lineCount);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(pVar.f56033a.f56040a);
                h[] hVarArr2 = (h[]) spannableStringBuilder.getSpans(0, 1, h.class);
                if (hVarArr2 != null && hVarArr2.length != 0 && (hVarArr = (h[]) spannableStringBuilder.getSpans(lineStart, lineStart + 1, h.class)) != null && hVarArr.length != 0) {
                    h hVar = hVarArr[hVarArr.length - 1];
                    int spanStart = spannableStringBuilder.getSpanStart(hVar);
                    int spanEnd = spannableStringBuilder.getSpanEnd(hVar);
                    spannableStringBuilder.removeSpan(hVar);
                    if (spanStart < lineStart) {
                        spannableStringBuilder.setSpan(hVar, spanStart, lineStart, 33);
                    }
                    spannableStringBuilder.setSpan(new h(hVarArr2[0].f56005a), lineStart, spanEnd, 34);
                    pVar.f56033a.f56040a = spannableStringBuilder;
                    this.f56024a = null;
                    a(jVar);
                }
            }
        }
    }

    private StaticLayout.Builder a(CharSequence charSequence, Layout.Alignment alignment, TextPaint textPaint, float f2) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, (int) Math.floor((double) f2));
        obtain.setAlignment(alignment);
        obtain.setLineSpacing(this.f56025b.f56033a.f56041b.f56019m, 1.0f);
        obtain.setIncludePad(this.f56025b.f56033a.f56041b.p);
        obtain.setTextDirection(this.f56025b.f56033a.f56041b.c());
        obtain.setBreakStrategy(this.f56025b.f56038f);
        if (Build.VERSION.SDK_INT >= 28) {
            obtain.setUseLineSpacingFromFallbacks(true);
        }
        return obtain;
    }
}
