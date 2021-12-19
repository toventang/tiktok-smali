package com.ss.android.ugc.aweme.comment.ui;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;

public final class bs {

    /* renamed from: a  reason: collision with root package name */
    public final View f72610a;

    /* renamed from: b  reason: collision with root package name */
    private final h f72611b = i.a((h.f.a.a) new f(this));

    /* renamed from: c  reason: collision with root package name */
    private final h f72612c = i.a((h.f.a.a) new e(this));

    public interface a {
        static {
            Covode.recordClassIndex(44739);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(44738);
    }

    private TextView a() {
        return (TextView) this.f72611b.getValue();
    }

    private TuxIconView b() {
        return (TuxIconView) this.f72612c.getValue();
    }

    static final class e extends m implements h.f.a.a<TuxIconView> {
        final /* synthetic */ bs this$0;

        static {
            Covode.recordClassIndex(44743);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(bs bsVar) {
            super(0);
            this.this$0 = bsVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxIconView invoke() {
            return this.this$0.f72610a.findViewById(R.id.c_q);
        }
    }

    static final class f extends m implements h.f.a.a<TextView> {
        final /* synthetic */ bs this$0;

        static {
            Covode.recordClassIndex(44744);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(bs bsVar) {
            super(0);
            this.this$0 = bsVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.f72610a.findViewById(R.id.ek7);
        }
    }

    public static final class c extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f72618a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f72619b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ bs f72620c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f72621d;

        static {
            Covode.recordClassIndex(44741);
        }

        public final void onClick(View view) {
            l.d(view, "");
            this.f72621d.f72617e.a();
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }

        c(int i2, int i3, bs bsVar, b bVar) {
            this.f72618a = i2;
            this.f72619b = i3;
            this.f72620c = bsVar;
            this.f72621d = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bs f72622a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f72623b;

        static {
            Covode.recordClassIndex(44742);
        }

        d(bs bsVar, b bVar) {
            this.f72622a = bsVar;
            this.f72623b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f72623b.f72617e.b();
        }
    }

    public bs(View view) {
        l.d(view, "");
        this.f72610a = view;
        view.setTag(this);
    }

    public final void a(boolean z) {
        TuxIconView b2 = b();
        if (z) {
            b2.setIconRes(R.raw.icon_thumbs_up_fill);
            b2.setColorFilter(androidx.core.content.b.c(this.f72610a.getContext(), R.color.bh));
            return;
        }
        b2.setIconRes(R.raw.icon_thumbs_up);
        b2.setColorFilter(androidx.core.content.b.c(this.f72610a.getContext(), R.color.bx));
    }

    public final void a(b bVar) {
        l.d(bVar, "");
        int a2 = p.a((CharSequence) bVar.f72613a, bVar.f72615c, 0, false, 6);
        int length = bVar.f72615c.length() + a2;
        TextView a3 = a();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bVar.f72613a);
        if (a2 > 0) {
            spannableStringBuilder.setSpan(new StyleSpan(1), a2, length, 33);
            spannableStringBuilder.setSpan(new c(a2, length, this, bVar), a2, length, 33);
        }
        a3.setText(spannableStringBuilder);
        a().setMovementMethod(new LinkMovementMethod());
        a(bVar.f72616d);
        b().setOnClickListener(new d(this, bVar));
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f72613a;

        /* renamed from: b  reason: collision with root package name */
        public final String f72614b;

        /* renamed from: c  reason: collision with root package name */
        public final String f72615c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f72616d;

        /* renamed from: e  reason: collision with root package name */
        public final a f72617e;

        static {
            Covode.recordClassIndex(44740);
        }

        public b(String str, String str2, String str3, boolean z, a aVar) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            l.d(aVar, "");
            this.f72613a = str;
            this.f72614b = str2;
            this.f72615c = str3;
            this.f72616d = z;
            this.f72617e = aVar;
        }
    }
}
