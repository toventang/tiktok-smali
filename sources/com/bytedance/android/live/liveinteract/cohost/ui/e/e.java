package com.bytedance.android.live.liveinteract.cohost.ui.e;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;

public final class e extends j.a.a.c<com.bytedance.android.live.liveinteract.cohost.ui.d.e, c> {

    /* renamed from: a  reason: collision with root package name */
    public final b f10363a;

    public interface b {
        static {
            Covode.recordClassIndex(5478);
        }

        void f();

        void g();
    }

    static {
        Covode.recordClassIndex(5476);
    }

    public final class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final h f10366a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f10367b;

        /* renamed from: c  reason: collision with root package name */
        private final h f10368c;

        static {
            Covode.recordClassIndex(5479);
        }

        public final LiveTextView a() {
            return (LiveTextView) this.f10368c.getValue();
        }

        static final class a extends m implements h.f.a.a<AppCompatImageView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5480);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ AppCompatImageView invoke() {
                return this.$itemView.findViewById(R.id.bk_);
            }
        }

        static final class b extends m implements h.f.a.a<LiveTextView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5481);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LiveTextView invoke() {
                return this.$itemView.findViewById(R.id.f8i);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(e eVar, View view) {
            super(view);
            l.d(view, "");
            this.f10367b = eVar;
            this.f10366a = i.a((h.f.a.a) new a(view));
            this.f10368c = i.a((h.f.a.a) new b(view));
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f10369a;

        static {
            Covode.recordClassIndex(5482);
        }

        d(e eVar) {
            this.f10369a = eVar;
        }

        public final void onClick(View view) {
            this.f10369a.f10363a.f();
        }
    }

    public e(b bVar) {
        l.d(bVar, "");
        this.f10363a = bVar;
    }

    public final class a extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public final View f10364a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f10365b;

        static {
            Covode.recordClassIndex(5477);
        }

        public final void onClick(View view) {
            l.d(view, "");
            com.bytedance.android.live.liveinteract.platform.common.g.h.a(true, "list_view");
            this.f10365b.f10363a.g();
            this.f10365b.f10363a.f();
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(Color.parseColor("#FE2C55"));
            textPaint.setUnderlineText(false);
            textPaint.setFakeBoldText(true);
        }

        public a(e eVar, View view) {
            l.d(view, "");
            this.f10365b = eVar;
            this.f10364a = view;
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // j.a.a.c
    public final /* synthetic */ c a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.bb2, viewGroup, false);
        l.b(a2, "");
        return new c(this, a2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // j.a.a.c
    public final /* synthetic */ void a(c cVar, com.bytedance.android.live.liveinteract.cohost.ui.d.e eVar) {
        c cVar2 = cVar;
        com.bytedance.android.live.liveinteract.cohost.ui.d.e eVar2 = eVar;
        l.d(cVar2, "");
        l.d(eVar2, "");
        ((AppCompatImageView) cVar2.f10366a.getValue()).setOnClickListener(new d(this));
        SpannableString spannableString = new SpannableString(eVar2.f10337a + "\n" + eVar2.f10338b);
        int a2 = p.a((CharSequence) spannableString, eVar2.f10338b, 0, false, 6);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#161823")), 0, a2, 33);
        View view = cVar2.itemView;
        l.b(view, "");
        spannableString.setSpan(new a(this, view), a2, spannableString.length(), 33);
        cVar2.a().setText(spannableString);
        cVar2.a().setMovementMethod(LinkMovementMethod.getInstance());
    }
}
