package com.ss.android.ugc.aweme.duet.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import org.xml.sax.XMLReader;

public final class g extends com.google.android.material.bottomsheet.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f84169a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Context f84170b;

    static {
        Covode.recordClassIndex(52481);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52482);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class d implements Html.TagHandler {
        static {
            Covode.recordClassIndex(52485);
        }

        d() {
        }

        public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
            if (z && str != null && str.equals("paragraph") && editable != null) {
                editable.append("\n\n");
                editable.setSpan(new AbsoluteSizeSpan(7, true), editable.length() - 1, editable.length(), 33);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final BottomSheetBehavior<View> b() {
        try {
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.d3l);
            l.b(relativeLayout, "");
            ViewParent parent = relativeLayout.getParent();
            if (parent != null) {
                return BottomSheetBehavior.a((View) parent);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        } catch (Exception unused) {
            return null;
        }
    }

    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f84171a;

        static {
            Covode.recordClassIndex(52483);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(g gVar) {
            this.f84171a = gVar;
        }

        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            l.d(view, "");
            g gVar = this.f84171a;
            int measuredHeight = view.getMeasuredHeight();
            BottomSheetBehavior<View> b2 = gVar.b();
            if (b2 != null) {
                b2.b(measuredHeight);
            }
            view.removeOnLayoutChangeListener(this);
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f84172a;

        static {
            Covode.recordClassIndex(52484);
        }

        c(g gVar) {
            this.f84172a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f84172a.dismiss();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context, R.style.wg);
        l.d(context, "");
        this.f84170b = context;
    }

    @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.h
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.b41);
        ((ImageView) findViewById(R.id.d39)).setOnClickListener(new c(this));
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.d3l);
        l.b(relativeLayout, "");
        relativeLayout.addOnLayoutChangeListener(new b(this));
        int b2 = n.b(this.f84170b) - n.e(getContext());
        Window window = getWindow();
        if (window != null) {
            if (b2 == 0) {
                b2 = -1;
            }
            window.setLayout(-1, b2);
            window.setGravity(80);
            window.setBackgroundDrawableResource(R.color.c9);
            View findViewById = window.findViewById(R.id.akq);
            if (findViewById != null) {
                findViewById.setBackgroundDrawable(new ColorDrawable(0));
            }
        }
        String string = this.f84170b.getString(R.string.bdr);
        l.b(string, "");
        Spanned fromHtml = Html.fromHtml(p.a(string, "\n", "<paragraph>"), null, new d());
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.d3a);
        l.b(tuxTextView, "");
        tuxTextView.setText(fromHtml);
    }
}
