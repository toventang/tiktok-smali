package com.ss.android.ugc.aweme.ug.amplify.ui;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.a.b;
import h.f.b.l;

public final class NotifyBottomButton extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public TextView f141721a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f141722b;

    static {
        Covode.recordClassIndex(92631);
    }

    public NotifyBottomButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NotifyBottomButton f141723a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f141724b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f141725c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f141726d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f141727e;

        static {
            Covode.recordClassIndex(92632);
        }

        a(NotifyBottomButton notifyBottomButton, String str, String str2, b bVar, b bVar2) {
            this.f141723a = notifyBottomButton;
            this.f141724b = str;
            this.f141725c = str2;
            this.f141726d = bVar;
            this.f141727e = bVar2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x00a7  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5  */
        /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 197
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ug.amplify.ui.NotifyBottomButton.a.run():void");
        }
    }

    static Float a(TextView textView) {
        TextPaint paint;
        if (textView == null || (paint = textView.getPaint()) == null) {
            return null;
        }
        return Float.valueOf(paint.measureText(textView.getText().toString()) + ((float) textView.getPaddingLeft()) + ((float) textView.getPaddingRight()));
    }

    private /* synthetic */ NotifyBottomButton(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private NotifyBottomButton(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(4573);
        MethodCollector.o(4573);
    }
}
