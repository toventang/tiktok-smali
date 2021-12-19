package com.ss.android.ugc.aweme.story.feed.common.b;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.h.d;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f137656a = new c();

    private c() {
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f137657a;

        static {
            Covode.recordClassIndex(90064);
        }

        a(View view) {
            this.f137657a = view;
        }

        public final void run() {
            this.f137657a.setVisibility(8);
        }
    }

    static {
        Covode.recordClassIndex(90063);
    }

    public static void a(View view, d dVar, float f2, String str) {
        l.d(view, "");
        l.d(dVar, "");
        view.setVisibility(0);
        if (dVar.getShowIcon()) {
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.bi7);
            l.b(tuxIconView, "");
            tuxIconView.setVisibility(0);
            ((TuxIconView) view.findViewById(R.id.bi7)).setIconRes(dVar.getIconRes());
        } else {
            TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.bi7);
            l.b(tuxIconView2, "");
            tuxIconView2.setVisibility(8);
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.text);
        l.b(tuxTextView, "");
        Context context = view.getContext();
        l.b(context, "");
        tuxTextView.setText(dVar.getText(context, f2));
        if (dVar.getShowRetry()) {
            TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.dmf);
            l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(0);
            TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.text);
            l.b(tuxTextView3, "");
            tuxTextView3.setText(str);
        } else {
            TuxTextView tuxTextView4 = (TuxTextView) view.findViewById(R.id.dmf);
            l.b(tuxTextView4, "");
            tuxTextView4.setVisibility(8);
        }
        if (dVar.getShowXIcon()) {
            TuxIconView tuxIconView3 = (TuxIconView) view.findViewById(R.id.fnk);
            l.b(tuxIconView3, "");
            tuxIconView3.setVisibility(0);
        } else {
            TuxIconView tuxIconView4 = (TuxIconView) view.findViewById(R.id.fnk);
            l.b(tuxIconView4, "");
            tuxIconView4.setVisibility(8);
        }
        Context context2 = view.getContext();
        l.b(context2, "");
        Integer a2 = d.a(context2, dVar.getBackgroundColor());
        if (a2 != null) {
            ((RelativeLayout) view.findViewById(R.id.dc2)).setBackgroundColor(a2.intValue());
        }
        if (dVar == d.UPLOAD_SUCCESS) {
            view.postDelayed(new a(view), 3000);
        }
    }
}
