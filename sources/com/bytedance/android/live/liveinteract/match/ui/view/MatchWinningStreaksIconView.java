package com.bytedance.android.live.liveinteract.match.ui.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdkapi.depend.model.live.a.d;
import com.bytedance.android.livesdkapi.depend.model.live.a.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class MatchWinningStreaksIconView extends LinearLayout {

    /* renamed from: e  reason: collision with root package name */
    public static final a f10941e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    h.f.a.b<? super String, z> f10942a;

    /* renamed from: b  reason: collision with root package name */
    d f10943b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f10944c = ((TextView) findViewById(R.id.fmm));

    /* renamed from: d  reason: collision with root package name */
    public final TextView f10945d = ((TextView) findViewById(R.id.fmo));

    /* renamed from: f  reason: collision with root package name */
    private final HSImageView f10946f = ((HSImageView) findViewById(R.id.fmp));

    /* renamed from: g  reason: collision with root package name */
    private final View f10947g = findViewById(R.id.fj0);

    /* renamed from: h  reason: collision with root package name */
    private final TextView f10948h = ((TextView) findViewById(R.id.fmn));

    static {
        Covode.recordClassIndex(5854);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5856);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final d getInfo() {
        return this.f10943b;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.String, h.z>, h.f.a.b<java.lang.String, h.z> */
    public final h.f.a.b<String, z> getOnClicked() {
        return this.f10942a;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ MatchWinningStreaksIconView this$0;

        static {
            Covode.recordClassIndex(5857);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(MatchWinningStreaksIconView matchWinningStreaksIconView) {
            super(0);
            this.this$0 = matchWinningStreaksIconView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.bytedance.android.live.core.c.a.a(3, "MatchWinningStreaksIcon", "animation end");
            TextView textView = this.this$0.f10944c;
            l.b(textView, "");
            textView.setVisibility(0);
            TextView textView2 = this.this$0.f10945d;
            l.b(textView2, "");
            textView2.setVisibility(8);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ MatchWinningStreaksIconView this$0;

        static {
            Covode.recordClassIndex(5858);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(MatchWinningStreaksIconView matchWinningStreaksIconView) {
            super(0);
            this.this$0 = matchWinningStreaksIconView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.bytedance.android.live.core.c.a.a(3, "MatchWinningStreaksIcon", "animation end");
            TextView textView = this.this$0.f10944c;
            l.b(textView, "");
            textView.setVisibility(0);
            TextView textView2 = this.this$0.f10945d;
            l.b(textView2, "");
            textView2.setVisibility(8);
            return z.f158842a;
        }
    }

    public final void setOnClicked(h.f.a.b<? super String, z> bVar) {
        this.f10942a = bVar;
    }

    public final void setVisibility(int i2) {
        if (this.f10943b != null) {
            super.setVisibility(i2);
        }
    }

    private final void setCountTv(d dVar) {
        if (dVar.f23068c > 99) {
            TextView textView = this.f10944c;
            l.b(textView, "");
            textView.setText("99+");
            return;
        }
        TextView textView2 = this.f10944c;
        l.b(textView2, "");
        textView2.setText(String.valueOf(dVar.f23068c));
    }

    public final boolean a(d dVar) {
        if (dVar != null) {
            com.bytedance.android.live.core.c.a.a(3, "MatchWinningStreaksIcon", "set data");
            this.f10943b = dVar;
            if (dVar.f23070e == j.ACTIVITY.getType()) {
                HSImageView hSImageView = this.f10946f;
                l.b(hSImageView, "");
                hSImageView.setVisibility(0);
                HSImageView hSImageView2 = this.f10946f;
                String str = dVar.f23069d;
                if (hSImageView2 != null && !TextUtils.isEmpty(str) && p.a(hSImageView2.getContext())) {
                    com.bytedance.android.live.core.f.a.a a2 = com.bytedance.android.live.core.f.a.a.a(hSImageView2.getContext()).a(str).a(2131234888).a(ImageView.ScaleType.CENTER_CROP);
                    a2.f9017b = new k.b(null, null);
                    a2.a(hSImageView2);
                }
                View view = this.f10947g;
                l.b(view, "");
                view.setVisibility(8);
            } else {
                HSImageView hSImageView3 = this.f10946f;
                l.b(hSImageView3, "");
                hSImageView3.setVisibility(8);
                View view2 = this.f10947g;
                l.b(view2, "");
                view2.setVisibility(0);
            }
            setCountTv(dVar);
            a(dVar, new d((byte) 0));
            setVisibility(0);
            return true;
        }
        setVisibility(8);
        return false;
    }

    private final void a(d dVar, d dVar2) {
        long j2;
        String str;
        if (dVar.f23068c > dVar2.f23068c) {
            j2 = dVar.f23068c;
        } else {
            j2 = dVar2.f23068c;
        }
        TextView textView = this.f10948h;
        l.b(textView, "");
        if (j2 > 99) {
            str = "99+";
        } else if (j2 > 9) {
            str = "99";
        } else {
            str = "9";
        }
        textView.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MatchWinningStreaksIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(6556);
        LayoutInflater.from(context).inflate(R.layout.bck, this);
        setOrientation(0);
        setBackgroundResource(R.drawable.c8i);
        setOnClickListener(new View.OnClickListener(this) {
            /* class com.bytedance.android.live.liveinteract.match.ui.view.MatchWinningStreaksIconView.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ MatchWinningStreaksIconView f10949a;

            static {
                Covode.recordClassIndex(5855);
            }

            {
                this.f10949a = r1;
            }

            public final void onClick(View view) {
                String str;
                String str2;
                h.f.a.b<? super String, z> bVar;
                MatchWinningStreaksIconView matchWinningStreaksIconView = this.f10949a;
                d dVar = matchWinningStreaksIconView.f10943b;
                if (dVar == null || (str2 = dVar.f23071f) == null || (bVar = matchWinningStreaksIconView.f10942a) == null || bVar.invoke(str2) == null) {
                    StringBuilder sb = new StringBuilder("no data , cant click, show error; ");
                    d dVar2 = matchWinningStreaksIconView.f10943b;
                    if (dVar2 == null || (str = dVar2.toString()) == null) {
                        str = "";
                    }
                    com.bytedance.android.live.core.c.a.a(6, "MatchWinningStreaksIcon", sb.append(str).toString());
                }
            }
        });
        MethodCollector.o(6556);
    }

    public final void a(d dVar, boolean z) {
        boolean z2;
        Long l2;
        com.bytedance.android.live.core.c.a.a(3, "MatchWinningStreaksIcon", "update count");
        if (dVar == null || this.f10943b == null) {
            com.bytedance.android.live.core.c.a.a(3, "MatchWinningStreaksIcon", "info is empty");
            return;
        }
        long j2 = dVar.f23068c;
        d dVar2 = this.f10943b;
        if (dVar2 == null) {
            l.b();
        }
        if (j2 == dVar2.f23068c) {
            com.bytedance.android.live.core.c.a.a(3, "MatchWinningStreaksIcon", "same count info");
            return;
        }
        d dVar3 = this.f10943b;
        if (dVar3 == null) {
            l.b();
        }
        if (dVar3.f23068c <= 99) {
            z2 = true;
        } else {
            z2 = false;
        }
        TextView textView = this.f10945d;
        l.b(textView, "");
        d dVar4 = this.f10943b;
        if (dVar4 != null) {
            l2 = Long.valueOf(dVar4.f23068c);
        } else {
            l2 = null;
        }
        String valueOf = String.valueOf(l2);
        if (valueOf == null) {
            valueOf = "0";
        }
        textView.setText(valueOf);
        d dVar5 = this.f10943b;
        if (dVar5 == null) {
            l.b();
        }
        a(dVar, dVar5);
        this.f10943b = dVar;
        setCountTv(dVar);
        if (!z2) {
            TextView textView2 = this.f10944c;
            l.b(textView2, "");
            textView2.setVisibility(0);
            TextView textView3 = this.f10945d;
            l.b(textView3, "");
            textView3.setVisibility(8);
        } else if (z) {
            TextView textView4 = this.f10945d;
            l.b(textView4, "");
            TextView textView5 = this.f10944c;
            l.b(textView5, "");
            com.bytedance.android.live.liveinteract.match.a.b.a(textView4, textView5, new b(this));
        } else {
            TextView textView6 = this.f10945d;
            l.b(textView6, "");
            TextView textView7 = this.f10944c;
            l.b(textView7, "");
            com.bytedance.android.live.liveinteract.match.a.b.b(textView6, textView7, new c(this));
        }
    }
}
