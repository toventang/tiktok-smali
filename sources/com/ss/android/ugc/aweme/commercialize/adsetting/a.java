package com.ss.android.ugc.aweme.commercialize.adsetting;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

public final class a extends b {

    /* renamed from: f  reason: collision with root package name */
    public static final b f73669f = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f73670a = "";

    /* renamed from: b  reason: collision with root package name */
    public AbstractC1650a f73671b;

    /* renamed from: c  reason: collision with root package name */
    public long f73672c = 30;

    /* renamed from: d  reason: collision with root package name */
    public long f73673d;

    /* renamed from: e  reason: collision with root package name */
    public long f73674e;

    /* renamed from: g  reason: collision with root package name */
    private HashMap f73675g;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.adsetting.a$a  reason: collision with other inner class name */
    public interface AbstractC1650a {
        static {
            Covode.recordClassIndex(45328);
        }

        void a();

        void a(long j2, long j3);
    }

    static {
        Covode.recordClassIndex(45327);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.adsetting.b
    public final View a(int i2) {
        if (this.f73675g == null) {
            this.f73675g = new HashMap();
        }
        View view = (View) this.f73675g.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f73675g.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.adsetting.b
    public final void a() {
        HashMap hashMap = this.f73675g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.commercialize.adsetting.b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(45329);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        public static a a(String str, AbstractC1650a aVar, long j2, long j3) {
            a aVar2 = new a();
            aVar2.f73670a = str;
            aVar2.f73671b = aVar;
            aVar2.f73673d = j2;
            aVar2.f73674e = j3;
            return aVar2;
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f73677a;

        static {
            Covode.recordClassIndex(45331);
        }

        d(a aVar) {
            this.f73677a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC1650a aVar = this.f73677a.f73671b;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f73681a;

        static {
            Covode.recordClassIndex(45334);
        }

        g(a aVar) {
            this.f73681a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f73681a.dismiss();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f73676a;

        static {
            Covode.recordClassIndex(45330);
        }

        c(a aVar) {
            this.f73676a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            long j2 = this.f73676a.f73672c * 24 * 60 * 60;
            AbstractC1650a aVar = this.f73676a.f73671b;
            if (aVar != null) {
                aVar.a(this.f73676a.f73673d, j2);
            }
            this.f73676a.dismiss();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f73678a;

        static {
            Covode.recordClassIndex(45332);
        }

        e(a aVar) {
            this.f73678a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            long j2 = (this.f73678a.f73672c * 24 * 60 * 60) + currentTimeMillis;
            AbstractC1650a aVar = this.f73678a.f73671b;
            if (aVar != null) {
                aVar.a(currentTimeMillis, j2);
            }
            this.f73678a.dismiss();
        }
    }

    private static void a(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = i2;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    static final class f implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f73679a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SimpleDateFormat f73680b;

        static {
            Covode.recordClassIndex(45333);
        }

        f(a aVar, SimpleDateFormat simpleDateFormat) {
            this.f73679a = aVar;
            this.f73680b = simpleDateFormat;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
            long j2;
            a aVar = this.f73679a;
            if (i2 == R.id.dhj) {
                j2 = 7;
            } else if (i2 == R.id.dhh) {
                j2 = 30;
            } else if (i2 == R.id.dhi) {
                j2 = 60;
            } else {
                j2 = 0;
            }
            aVar.f73672c = j2;
            if (this.f73679a.f73673d != 0) {
                TuxTextView tuxTextView = (TuxTextView) this.f73679a.a(R.id.f3e);
                l.b(tuxTextView, "");
                tuxTextView.setText(this.f73679a.getResources().getString(R.string.wn) + ":\n" + this.f73680b.format(Long.valueOf(this.f73679a.f73673d * 1000)) + " - " + this.f73680b.format(new Date((this.f73679a.f73674e + (this.f73679a.f73672c * 24 * 60 * 60)) * 1000)));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.commercialize.adsetting.b
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        TuxTextView tuxTextView = (TuxTextView) a(R.id.f9l);
        l.b(tuxTextView, "");
        tuxTextView.setText(this.f73670a);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        if (this.f73673d != 0) {
            TuxTextView tuxTextView2 = (TuxTextView) a(R.id.f3e);
            l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(0);
            long j2 = this.f73674e + (this.f73672c * 24 * 60 * 60);
            TuxTextView tuxTextView3 = (TuxTextView) a(R.id.f3e);
            l.b(tuxTextView3, "");
            tuxTextView3.setText(getResources().getString(R.string.wn) + ":\n" + simpleDateFormat.format(Long.valueOf(this.f73673d * 1000)) + " - " + simpleDateFormat.format(new Date(j2 * 1000)));
            ((TuxTextView) a(R.id.evt)).setOnClickListener(new c(this));
            ((TuxTextView) a(R.id.ev9)).setOnClickListener(new d(this));
            TuxTextView tuxTextView4 = (TuxTextView) a(R.id.evt);
            l.b(tuxTextView4, "");
            tuxTextView4.setText(getResources().getString(R.string.f1f));
            TuxTextView tuxTextView5 = (TuxTextView) a(R.id.ev9);
            l.b(tuxTextView5, "");
            tuxTextView5.setText(getResources().getString(R.string.fq_));
            TuxTextView tuxTextView6 = (TuxTextView) a(R.id.ev9);
            l.b(tuxTextView6, "");
            ((TuxTextView) a(R.id.ev9)).setTextColor(androidx.core.content.b.c(tuxTextView6.getContext(), R.color.bh));
            TuxTextView tuxTextView7 = (TuxTextView) a(R.id.ev9);
            l.b(tuxTextView7, "");
            tuxTextView7.setGravity(17);
            TuxTextView tuxTextView8 = (TuxTextView) a(R.id.evt);
            l.b(tuxTextView8, "");
            a(tuxTextView8, n.a(6.0d));
            TuxTextView tuxTextView9 = (TuxTextView) a(R.id.ev9);
            l.b(tuxTextView9, "");
            a(tuxTextView9, n.a(12.0d));
        } else {
            TuxTextView tuxTextView10 = (TuxTextView) a(R.id.f3e);
            l.b(tuxTextView10, "");
            tuxTextView10.setVisibility(8);
            ((TuxTextView) a(R.id.evt)).setOnClickListener(new e(this));
            TuxTextView tuxTextView11 = (TuxTextView) a(R.id.evt);
            l.b(tuxTextView11, "");
            tuxTextView11.setText(getResources().getString(R.string.w7));
            TuxTextView tuxTextView12 = (TuxTextView) a(R.id.ev9);
            l.b(tuxTextView12, "");
            tuxTextView12.setText(getResources().getString(R.string.b6m));
            TuxTextView tuxTextView13 = (TuxTextView) a(R.id.ev9);
            l.b(tuxTextView13, "");
            ((TuxTextView) a(R.id.ev9)).setTextColor(androidx.core.content.b.c(tuxTextView13.getContext(), R.color.c5));
            TuxTextView tuxTextView14 = (TuxTextView) a(R.id.ev9);
            l.b(tuxTextView14, "");
            tuxTextView14.setGravity(8388611);
            TuxTextView tuxTextView15 = (TuxTextView) a(R.id.evt);
            l.b(tuxTextView15, "");
            a(tuxTextView15, n.a(16.0d));
            TuxTextView tuxTextView16 = (TuxTextView) a(R.id.ev9);
            l.b(tuxTextView16, "");
            a(tuxTextView16, n.a(16.0d));
        }
        ((RadioGroup) a(R.id.dn0)).setOnCheckedChangeListener(new f(this, simpleDateFormat));
        ((ImageView) view.findViewById(R.id.bve)).setOnClickListener(new g(this));
    }
}
