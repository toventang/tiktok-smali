package com.ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.a.aa;
import com.ss.android.ugc.aweme.discover.e.k;
import com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.search.k.ac;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private SearchCorrectTextView f82842a;

    /* renamed from: b  reason: collision with root package name */
    private SearchCorrectTextView f82843b;

    /* renamed from: c  reason: collision with root package name */
    private SearchCorrectTextView f82844c;

    /* renamed from: d  reason: collision with root package name */
    private ViewGroup f82845d;

    /* renamed from: e  reason: collision with root package name */
    private ViewGroup f82846e;

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f82847f;

    static {
        Covode.recordClassIndex(51628);
    }

    private View a(int i2) {
        if (this.f82847f == null) {
            this.f82847f = new SparseArray();
        }
        View view = (View) this.f82847f.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f82847f.put(i2, findViewById);
        return findViewById;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        this(context, (byte) 0);
        l.d(context, "");
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f82848a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f82849b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ QueryCorrectInfo f82850c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f82851d;

        static {
            Covode.recordClassIndex(51629);
        }

        a(c cVar, String str, QueryCorrectInfo queryCorrectInfo, String str2) {
            this.f82848a = cVar;
            this.f82849b = str;
            this.f82850c = queryCorrectInfo;
            this.f82851d = str2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.d.a.c.a(new k(this.f82849b, this.f82850c.getCorrectedLevel()));
            c.a("click", this.f82850c.getCorrectedLevel(), this.f82850c.getCorrectedKeyword(), this.f82851d, this.f82850c.getRequestId(), "original_keyword");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f82852a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ QueryCorrectInfo f82853b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f82854c;

        static {
            Covode.recordClassIndex(51630);
        }

        b(c cVar, QueryCorrectInfo queryCorrectInfo, String str) {
            this.f82852a = cVar;
            this.f82853b = queryCorrectInfo;
            this.f82854c = str;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.d.a.c.a(new k(this.f82853b.getCorrectedKeyword(), this.f82853b.getCorrectedLevel()));
            c.a("click", this.f82853b.getCorrectedLevel(), this.f82853b.getCorrectedKeyword(), this.f82854c, this.f82853b.getRequestId(), "corrected_keyword");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.widget.c$c  reason: collision with other inner class name */
    public static final class View$OnClickListenerC1948c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f82855a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f82856b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ QueryCorrectInfo f82857c;

        static {
            Covode.recordClassIndex(51631);
        }

        View$OnClickListenerC1948c(c cVar, String str, QueryCorrectInfo queryCorrectInfo) {
            this.f82855a = cVar;
            this.f82856b = str;
            this.f82857c = queryCorrectInfo;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.d.a.c.a(new k(this.f82856b, this.f82857c.getCorrectedLevel()));
            c.a("click", this.f82857c.getCorrectedLevel(), this.f82857c.getCorrectedKeyword(), this.f82856b, this.f82857c.getRequestId(), "original_keyword");
        }
    }

    public final void setTopMargin(int i2) {
        SearchCorrectTextView searchCorrectTextView = this.f82842a;
        if (searchCorrectTextView == null) {
            l.a("tvSearchResult");
        }
        SearchCorrectTextView searchCorrectTextView2 = this.f82842a;
        if (searchCorrectTextView2 == null) {
            l.a("tvSearchResult");
        }
        ViewGroup.LayoutParams layoutParams = searchCorrectTextView2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i2;
        }
        searchCorrectTextView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private c(Context context, byte b2) {
        this(context, (char) 0);
        l.d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Context context, char c2) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(2402);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        com.a.a(LayoutInflater.from(getContext()), R.layout.axj, this, true);
        View findViewById = findViewById(R.id.f6n);
        l.b(findViewById, "");
        this.f82842a = (SearchCorrectTextView) findViewById;
        View findViewById2 = findViewById(R.id.exl);
        l.b(findViewById2, "");
        this.f82843b = (SearchCorrectTextView) findViewById2;
        View findViewById3 = findViewById(R.id.exm);
        l.b(findViewById3, "");
        this.f82844c = (SearchCorrectTextView) findViewById3;
        View findViewById4 = findViewById(R.id.ecq);
        l.b(findViewById4, "");
        this.f82845d = (ViewGroup) findViewById4;
        View findViewById5 = findViewById(R.id.fm0);
        l.b(findViewById5, "");
        this.f82846e = (ViewGroup) findViewById5;
        MethodCollector.o(2402);
    }

    private void b(QueryCorrectInfo queryCorrectInfo, String str) {
        l.d(queryCorrectInfo, "");
        l.d(str, "");
        Context context = getContext();
        l.b(context, "");
        Resources resources = context.getResources();
        ViewGroup viewGroup = this.f82845d;
        if (viewGroup == null) {
            l.a("strongContainer");
        }
        viewGroup.setVisibility(8);
        ViewGroup viewGroup2 = this.f82846e;
        if (viewGroup2 == null) {
            l.a("weakContainer");
        }
        viewGroup2.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) a(R.id.cuf);
        l.b(linearLayout, "");
        linearLayout.setVisibility(0);
        TuxTextView tuxTextView = (TuxTextView) a(R.id.exk);
        l.b(tuxTextView, "");
        String correctedKeyword = queryCorrectInfo.getCorrectedKeyword();
        l.b(correctedKeyword, "");
        a.a(tuxTextView, correctedKeyword, resources.getColor(R.color.bh), queryCorrectInfo.getCorrectHighlightPosition().getPositions());
        ((TuxTextView) a(R.id.exk)).setOnClickListener(new b(this, queryCorrectInfo, str));
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.f41);
        l.b(tuxTextView2, "");
        a.a(tuxTextView2, str);
        ((TuxTextView) a(R.id.f41)).setOnClickListener(new View$OnClickListenerC1948c(this, str, queryCorrectInfo));
        a("show", queryCorrectInfo.getCorrectedLevel(), queryCorrectInfo.getCorrectedKeyword(), str, queryCorrectInfo.getRequestId(), "");
    }

    public final void a(QueryCorrectInfo queryCorrectInfo, String str) {
        String correctedKeyword;
        l.d(queryCorrectInfo, "");
        l.d(str, "");
        if (!aa.a() || !queryCorrectInfo.isCorrectHighArrayAvailable()) {
            LinearLayout linearLayout = (LinearLayout) a(R.id.cuf);
            l.b(linearLayout, "");
            linearLayout.setVisibility(8);
            Context context = getContext();
            l.b(context, "");
            Resources resources = context.getResources();
            if (queryCorrectInfo.getCorrectedLevel() == 2) {
                ViewGroup viewGroup = this.f82845d;
                if (viewGroup == null) {
                    l.a("strongContainer");
                }
                viewGroup.setVisibility(0);
                ViewGroup viewGroup2 = this.f82846e;
                if (viewGroup2 == null) {
                    l.a("weakContainer");
                }
                viewGroup2.setVisibility(8);
                SearchCorrectTextView searchCorrectTextView = this.f82842a;
                if (searchCorrectTextView == null) {
                    l.a("tvSearchResult");
                }
                searchCorrectTextView.a(R.string.fhx, " “" + queryCorrectInfo.getCorrectedKeyword() + (char) 8221, resources.getColor(R.color.c4));
                SearchCorrectTextView searchCorrectTextView2 = this.f82843b;
                if (searchCorrectTextView2 == null) {
                    l.a("tvCorrectStrong");
                }
                searchCorrectTextView2.a(R.string.fhy, " “" + str + (char) 8221, resources.getColor(R.color.bh));
                correctedKeyword = str;
            } else {
                ViewGroup viewGroup3 = this.f82845d;
                if (viewGroup3 == null) {
                    l.a("strongContainer");
                }
                viewGroup3.setVisibility(8);
                ViewGroup viewGroup4 = this.f82846e;
                if (viewGroup4 == null) {
                    l.a("weakContainer");
                }
                viewGroup4.setVisibility(0);
                SearchCorrectTextView searchCorrectTextView3 = this.f82844c;
                if (searchCorrectTextView3 == null) {
                    l.a("tvCorrectWeak");
                }
                searchCorrectTextView3.a(R.string.fhz, " “" + queryCorrectInfo.getCorrectedKeyword() + (char) 8221, resources.getColor(R.color.bh));
                correctedKeyword = queryCorrectInfo.getCorrectedKeyword();
                l.b(correctedKeyword, "");
            }
            a("show", queryCorrectInfo.getCorrectedLevel(), queryCorrectInfo.getCorrectedKeyword(), str, queryCorrectInfo.getRequestId(), "");
            setOnClickListener(new a(this, correctedKeyword, queryCorrectInfo, str));
            return;
        }
        b(queryCorrectInfo, str);
    }

    public static void a(String str, int i2, String str2, String str3, String str4, String str5) {
        String str6;
        if (i2 == 2) {
            str6 = "strong";
        } else {
            str6 = "weak";
        }
        ((ac) new ac().q(str).c(ac.a.f91473a.a(str4))).r(str6).s(str2).t(str3).u(str5).f();
    }
}
