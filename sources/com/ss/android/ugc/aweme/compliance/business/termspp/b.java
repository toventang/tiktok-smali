package com.ss.android.ugc.aweme.compliance.business.termspp;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.business.setting.a.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import h.z;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public a f77246a;

    /* renamed from: b  reason: collision with root package name */
    public a f77247b;

    /* renamed from: c  reason: collision with root package name */
    public a f77248c;

    /* renamed from: d  reason: collision with root package name */
    public TuxButton f77249d;

    /* renamed from: e  reason: collision with root package name */
    public h.f.a.a<z> f77250e;

    /* renamed from: f  reason: collision with root package name */
    public h.f.a.a<z> f77251f;

    /* renamed from: g  reason: collision with root package name */
    public h.f.a.a<z> f77252g;

    /* renamed from: h  reason: collision with root package name */
    public final Activity f77253h;

    static {
        Covode.recordClassIndex(47769);
    }

    public final a a() {
        a aVar = this.f77246a;
        if (aVar == null) {
            l.a("agreeTermsCheckBox");
        }
        return aVar;
    }

    public final a b() {
        a aVar = this.f77247b;
        if (aVar == null) {
            l.a("agreePrivacyCheckBox");
        }
        return aVar;
    }

    public final a c() {
        a aVar = this.f77248c;
        if (aVar == null) {
            l.a("selectAllCheckBox");
        }
        return aVar;
    }

    public final TuxButton d() {
        TuxButton tuxButton = this.f77249d;
        if (tuxButton == null) {
            l.a("continueButton");
        }
        return tuxButton;
    }

    private final void e() {
        this.f77246a = a(R.id.c8x, R.id.a32);
        this.f77247b = a(R.id.c77, R.id.a30);
        this.f77248c = new C1774b(this);
    }

    public static final class a extends a {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AppCompatCheckBox f77254d;

        static {
            Covode.recordClassIndex(47770);
        }

        @Override // com.ss.android.ugc.aweme.compliance.business.termspp.a
        public final void a(boolean z) {
            this.f77245c = z;
            this.f77254d.setChecked(z);
        }

        a(AppCompatCheckBox appCompatCheckBox) {
            this.f77254d = appCompatCheckBox;
            appCompatCheckBox.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.compliance.business.termspp.b.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f77255a;

                static {
                    Covode.recordClassIndex(47771);
                }

                {
                    this.f77255a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    a aVar = this.f77255a;
                    aVar.a(!aVar.f77245c);
                    h.f.a.b<? super Boolean, z> bVar = aVar.f77243a;
                    if (bVar != null) {
                        bVar.invoke(Boolean.valueOf(aVar.f77245c));
                    }
                    h.f.a.a<z> aVar2 = aVar.f77244b;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                }
            });
        }
    }

    private final <T> T a(int i2) {
        return (T) this.f77253h.findViewById(i2);
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f77259a;

        static {
            Covode.recordClassIndex(47774);
        }

        c(b bVar) {
            this.f77259a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.a<z> aVar = this.f77259a.f77252g;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f77260a;

        static {
            Covode.recordClassIndex(47775);
        }

        d(b bVar) {
            this.f77260a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.a<z> aVar = this.f77260a.f77250e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f77261a;

        static {
            Covode.recordClassIndex(47776);
        }

        e(b bVar) {
            this.f77261a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.a<z> aVar = this.f77261a.f77251f;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.b$b  reason: collision with other inner class name */
    public static final class C1774b extends a {

        /* renamed from: d  reason: collision with root package name */
        public boolean f77256d = this.f77245c;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f77257e;

        static {
            Covode.recordClassIndex(47772);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C1774b(b bVar) {
            this.f77257e = bVar;
            bVar.d().setText(R.string.asx);
            bVar.d().setTextColor(androidx.core.content.b.c(bVar.f77253h, R.color.bh));
            bVar.d().setBackground(androidx.core.content.b.a(bVar.f77253h, (int) R.drawable.a2w));
            bVar.d().setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.compliance.business.termspp.b.C1774b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C1774b f77258a;

                static {
                    Covode.recordClassIndex(47773);
                }

                {
                    this.f77258a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C1774b bVar = this.f77258a;
                    if (bVar.f77245c) {
                        h.f.a.a<z> aVar = bVar.f77257e.f77252g;
                        if (aVar != null) {
                            aVar.invoke();
                            return;
                        }
                        return;
                    }
                    bVar.a(!bVar.f77245c);
                    h.f.a.b<? super Boolean, z> bVar2 = bVar.f77243a;
                    if (bVar2 != null) {
                        bVar2.invoke(Boolean.valueOf(bVar.f77245c));
                    }
                    h.f.a.a<z> aVar2 = bVar.f77244b;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                }
            });
        }

        @Override // com.ss.android.ugc.aweme.compliance.business.termspp.a
        public final void a(boolean z) {
            TransitionDrawable transitionDrawable;
            this.f77245c = z;
            if (this.f77256d != this.f77245c) {
                if (this.f77245c) {
                    this.f77257e.d().setText(R.string.asw);
                    this.f77257e.d().setTextColor(androidx.core.content.b.c(this.f77257e.f77253h, R.color.a9));
                    transitionDrawable = new TransitionDrawable(new Drawable[]{androidx.core.content.b.a(this.f77257e.f77253h, (int) R.drawable.a2w), androidx.core.content.b.a(this.f77257e.f77253h, (int) R.drawable.a2u)});
                } else {
                    this.f77257e.d().setText(R.string.asx);
                    this.f77257e.d().setTextColor(androidx.core.content.b.c(this.f77257e.f77253h, R.color.bh));
                    transitionDrawable = new TransitionDrawable(new Drawable[]{androidx.core.content.b.a(this.f77257e.f77253h, (int) R.drawable.a2u), androidx.core.content.b.a(this.f77257e.f77253h, (int) R.drawable.a2w)});
                }
                this.f77257e.d().setBackground(transitionDrawable);
                transitionDrawable.setCrossFadeEnabled(true);
                transitionDrawable.startTransition(200);
                this.f77256d = this.f77245c;
            }
        }
    }

    public b(Activity activity) {
        l.d(activity, "");
        this.f77253h = activity;
        TuxButton tuxButton = (TuxButton) a(R.id.y7);
        this.f77249d = tuxButton;
        if (tuxButton == null) {
            l.a("continueButton");
        }
        tuxButton.setOnClickListener(new c(this));
        a(activity, (TuxTextView) a(R.id.f93), R.string.atf, R.string.at0, new d(this));
        a(activity, (TuxTextView) a(R.id.f4v), R.string.ate, R.string.asz, new e(this));
        int a2 = c.a();
        if (a2 == 1) {
            e();
        } else if (a2 == 2) {
            this.f77248c = a(R.id.c7w, R.id.a3a);
            this.f77246a = a(R.id.c8x, R.id.a32);
            this.f77247b = a(R.id.c77, R.id.a30);
        } else if (a2 == 3) {
            this.f77248c = a(R.id.c7v, R.id.a39);
            this.f77246a = a(R.id.c8x, R.id.a32);
            this.f77247b = a(R.id.c77, R.id.a30);
        } else if (a2 != 4) {
            e();
        } else {
            this.f77248c = a(R.id.c7v, R.id.a3_);
            this.f77246a = a(R.id.c8x, R.id.a33);
            this.f77247b = a(R.id.c77, R.id.a31);
        }
    }

    private final a a(int i2, int i3) {
        ((View) a(i2)).setVisibility(0);
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) a(i3);
        appCompatCheckBox.setVisibility(0);
        return new a(appCompatCheckBox);
    }

    private static void a(Context context, TuxTextView tuxTextView, int i2, int i3, View.OnClickListener onClickListener) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(i3));
        String string = context.getString(i2);
        l.b(string, "");
        int c2 = androidx.core.content.b.c(context, R.color.c4);
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        l.b(spannableStringBuilder2, "");
        int a2 = p.a((CharSequence) spannableStringBuilder2, string, 0, false, 6);
        try {
            spannableStringBuilder.setSpan(new a.C1773a(c2, onClickListener), a2, string.length() + a2, 34);
            tuxTextView.setHighlightColor(androidx.core.content.b.c(context, R.color.c9));
            tuxTextView.setText(spannableStringBuilder);
            tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        } catch (IndexOutOfBoundsException unused) {
        }
    }
}
