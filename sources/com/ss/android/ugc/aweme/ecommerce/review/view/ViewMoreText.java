package com.ss.android.ugc.aweme.ecommerce.review.view;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.h.v;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class ViewMoreText extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public h.f.a.b<? super Boolean, z> f87098a;

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f87099b;

    static {
        Covode.recordClassIndex(54641);
    }

    public ViewMoreText(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public ViewMoreText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final View a(int i2) {
        if (this.f87099b == null) {
            this.f87099b = new SparseArray();
        }
        View view = (View) this.f87099b.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f87099b.put(i2, findViewById);
        return findViewById;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewMoreText f87102a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f87103b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CharSequence f87104c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f87105d;

        static {
            Covode.recordClassIndex(54644);
        }

        b(ViewMoreText viewMoreText, int i2, CharSequence charSequence, h.f.a.b bVar) {
            this.f87102a = viewMoreText;
            this.f87103b = i2;
            this.f87104c = charSequence;
            this.f87105d = bVar;
        }

        public final void run() {
            try {
                a aVar = new a((TuxTextView) this.f87102a.a(R.id.adh), (this.f87102a.getWidth() - v.f(this.f87102a)) - v.g(this.f87102a), this.f87102a.getContext().getString(R.string.bht), this.f87103b);
                CharSequence charSequence = this.f87104c;
                if (charSequence == null) {
                    charSequence = "";
                }
                SpannableString valueOf = SpannableString.valueOf(charSequence);
                if (aVar.f87110e && aVar.f87106a.getLineCount() > aVar.f87108c) {
                    int i2 = 1;
                    aVar.f87109d = true;
                    float measureText = aVar.f87106a.getPaint().measureText(" ..." + aVar.f87111f);
                    int lineStart = aVar.f87106a.getLayout().getLineStart(aVar.f87108c - 1);
                    int lineStart2 = aVar.f87106a.getLayout().getLineStart(aVar.f87108c) - 1;
                    int i3 = (int) (((float) aVar.f87107b) - measureText);
                    float measureText2 = aVar.f87106a.getPaint().measureText(valueOf.subSequence(lineStart, lineStart2).toString());
                    float f2 = (float) i3;
                    if (measureText2 > f2) {
                        float f3 = measureText2 - f2;
                        while (i2 < Math.min(15, lineStart2) && aVar.f87106a.getPaint().measureText(valueOf.subSequence(lineStart2 - i2, lineStart2).toString()) <= f3) {
                            i2++;
                        }
                    } else {
                        i2 = 0;
                    }
                    valueOf = SpannableString.valueOf(valueOf.subSequence(0, lineStart2 - i2));
                }
                if (aVar.f87109d) {
                    TuxTextView tuxTextView = (TuxTextView) this.f87102a.a(R.id.adh);
                    l.b(tuxTextView, "");
                    h.f.a.b bVar = this.f87105d;
                    l.b(valueOf, "");
                    tuxTextView.setText((CharSequence) bVar.invoke(valueOf));
                    LinearLayout linearLayout = (LinearLayout) this.f87102a.a(R.id.cnk);
                    l.b(linearLayout, "");
                    linearLayout.setVisibility(0);
                    return;
                }
                TuxTextView tuxTextView2 = (TuxTextView) this.f87102a.a(R.id.adh);
                l.b(tuxTextView2, "");
                h.f.a.b bVar2 = this.f87105d;
                l.b(valueOf, "");
                tuxTextView2.setText((CharSequence) bVar2.invoke(valueOf));
                LinearLayout linearLayout2 = (LinearLayout) this.f87102a.a(R.id.cnk);
                l.b(linearLayout2, "");
                linearLayout2.setVisibility(8);
            } catch (Exception unused) {
            }
        }
    }

    public final void setExpandListener(h.f.a.b<? super Boolean, z> bVar) {
        this.f87098a = bVar;
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<CharSequence, SpannableString> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f87101a = new a();

        static {
            Covode.recordClassIndex(54643);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SpannableString invoke(CharSequence charSequence) {
            CharSequence charSequence2 = charSequence;
            l.d(charSequence2, "");
            SpannableString valueOf = SpannableString.valueOf(charSequence2);
            l.b(valueOf, "");
            return valueOf;
        }
    }

    public final void setContentTextColor(int i2) {
        ((TuxTextView) a(R.id.adh)).setTextColor(i2);
        ((TuxTextView) a(R.id.co0)).setTextColor(i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ ViewMoreText(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ViewMoreText(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(5231);
        com.a.a(LayoutInflater.from(context), R.layout.qh, this, true);
        ((LinearLayout) a(R.id.cnk)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.ecommerce.review.view.ViewMoreText.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ViewMoreText f87100a;

            static {
                Covode.recordClassIndex(54642);
            }

            {
                this.f87100a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                h.f.a.b<? super Boolean, z> bVar = this.f87100a.f87098a;
                if (bVar != null) {
                    bVar.invoke(true);
                }
            }
        });
        TuxTextView tuxTextView = (TuxTextView) a(R.id.co0);
        l.b(tuxTextView, "");
        tuxTextView.setText(" ...");
        MethodCollector.o(5231);
    }

    public final void a(CharSequence charSequence, int i2, boolean z, h.f.a.b<? super CharSequence, ? extends CharSequence> bVar) {
        CharSequence charSequence2;
        l.d(bVar, "");
        if (!z) {
            TuxTextView tuxTextView = (TuxTextView) a(R.id.adh);
            l.b(tuxTextView, "");
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            TuxTextView tuxTextView2 = (TuxTextView) a(R.id.adh);
            l.b(tuxTextView2, "");
            if (charSequence == null) {
                charSequence = "";
            }
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            l.b(valueOf, "");
            tuxTextView2.setText((CharSequence) bVar.invoke(valueOf));
            TuxTextView tuxTextView3 = (TuxTextView) a(R.id.adh);
            l.b(tuxTextView3, "");
            tuxTextView3.setMaxLines(i2);
            LinearLayout linearLayout = (LinearLayout) a(R.id.cnk);
            l.b(linearLayout, "");
            linearLayout.setVisibility(8);
            return;
        }
        TuxTextView tuxTextView4 = (TuxTextView) a(R.id.adh);
        l.b(tuxTextView4, "");
        tuxTextView4.setEllipsize(null);
        TuxTextView tuxTextView5 = (TuxTextView) a(R.id.adh);
        l.b(tuxTextView5, "");
        tuxTextView5.setMaxLines(Integer.MAX_VALUE);
        TuxTextView tuxTextView6 = (TuxTextView) a(R.id.adh);
        l.b(tuxTextView6, "");
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence;
        }
        SpannableString valueOf2 = SpannableString.valueOf(charSequence2);
        l.b(valueOf2, "");
        tuxTextView6.setText((CharSequence) bVar.invoke(valueOf2));
        post(new b(this, i2, charSequence, bVar));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.review.view.ViewMoreText */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(ViewMoreText viewMoreText, CharSequence charSequence, int i2, boolean z, h.f.a.b bVar, int i3) {
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            bVar = a.f87101a;
        }
        viewMoreText.a(charSequence, i2, z, bVar);
    }
}
