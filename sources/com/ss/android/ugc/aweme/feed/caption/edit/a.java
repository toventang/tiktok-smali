package com.ss.android.ugc.aweme.feed.caption.edit;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class a extends RecyclerView.a<b> {

    /* renamed from: a  reason: collision with root package name */
    public int f92842a = -1;

    /* renamed from: b  reason: collision with root package name */
    public View f92843b;

    /* renamed from: c  reason: collision with root package name */
    public View f92844c;

    /* renamed from: d  reason: collision with root package name */
    public int f92845d = -1;

    /* renamed from: e  reason: collision with root package name */
    boolean f92846e;

    /* renamed from: f  reason: collision with root package name */
    public final EditCaptionViewModel f92847f;

    /* renamed from: g  reason: collision with root package name */
    public final AbstractC2258a f92848g;

    /* renamed from: h  reason: collision with root package name */
    private RecyclerView f92849h;

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.a$a  reason: collision with other inner class name */
    public interface AbstractC2258a {
        static {
            Covode.recordClassIndex(58906);
        }

        void a(int i2);

        void b(int i2);
    }

    static {
        Covode.recordClassIndex(58905);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        List<CaptionData> srcSubtitleItem;
        EditCaptionItem editCaptionItem = this.f92847f.f92794a;
        if (editCaptionItem == null || (srcSubtitleItem = editCaptionItem.getSrcSubtitleItem()) == null) {
            return 0;
        }
        return srcSubtitleItem.size();
    }

    public final void a() {
        RecyclerView.ViewHolder f2;
        View view = this.f92844c;
        if (view != null) {
            KeyboardUtils.c(view);
            view.clearFocus();
        }
        RecyclerView recyclerView = this.f92849h;
        if (recyclerView != null && (f2 = recyclerView.f(this.f92845d)) != null) {
            Objects.requireNonNull(f2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionAdapter.SubtitleViewHolder");
            b bVar = (b) f2;
            bVar.f92853d.e();
            bVar.f92853d.setVisibility(8);
            bVar.f92854e.setVisibility(8);
            bVar.f92855f.setVisibility(8);
            bVar.f92856g.setVisibility(8);
        }
    }

    public final void b() {
        RecyclerView.ViewHolder f2;
        RecyclerView recyclerView = this.f92849h;
        if (recyclerView != null && (f2 = recyclerView.f(this.f92845d)) != null) {
            Objects.requireNonNull(f2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionAdapter.SubtitleViewHolder");
            b bVar = (b) f2;
            if (bVar.f92853d.getVisibility() == 0) {
                bVar.f92853d.e();
                bVar.f92853d.setVisibility(8);
                bVar.f92854e.setVisibility(0);
            }
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92865a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f92866b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f92867c;

        static {
            Covode.recordClassIndex(58910);
        }

        e(a aVar, int i2, b bVar) {
            this.f92865a = aVar;
            this.f92866b = i2;
            this.f92867c = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f92865a.f92848g.a(this.f92866b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f92849h = recyclerView;
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92874a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f92875b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f92876c;

        static {
            Covode.recordClassIndex(58913);
        }

        h(a aVar, int i2, b bVar) {
            this.f92874a = aVar;
            this.f92875b = i2;
            this.f92876c = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Editable text = this.f92876c.f92851b.getText();
            if (text != null) {
                text.clear();
            }
        }
    }

    public static final class c implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditCaptionItem f92858a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f92859b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f92860c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f92861d;

        static {
            Covode.recordClassIndex(58908);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void afterTextChanged(Editable editable) {
            CaptionData captionData;
            List<CaptionData> transSubtitleItem = this.f92858a.getTransSubtitleItem();
            if (transSubtitleItem != null && (captionData = transSubtitleItem.get(this.f92860c)) != null) {
                captionData.setText(String.valueOf(this.f92861d.f92851b.getText()));
            }
        }

        c(EditCaptionItem editCaptionItem, a aVar, int i2, b bVar) {
            this.f92858a = editCaptionItem;
            this.f92859b = aVar;
            this.f92860c = i2;
            this.f92861d = bVar;
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92862a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f92863b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f92864c;

        static {
            Covode.recordClassIndex(58909);
        }

        d(a aVar, int i2, b bVar) {
            this.f92862a = aVar;
            this.f92863b = i2;
            this.f92864c = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f92862a.f92848g.a(this.f92863b);
            this.f92864c.f92851b.requestFocus();
            Editable text = this.f92864c.f92851b.getText();
            if (text != null) {
                this.f92864c.f92851b.setSelection(text.toString().length());
            }
            KeyboardUtils.a(this.f92864c.f92851b);
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92871a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f92872b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f92873c;

        static {
            Covode.recordClassIndex(58912);
        }

        g(a aVar, int i2, b bVar) {
            this.f92871a = aVar;
            this.f92872b = i2;
            this.f92873c = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f92873c.f92854e.setVisibility(8);
            this.f92873c.f92853d.setVisibility(0);
            this.f92873c.f92853d.a();
            this.f92871a.f92848g.b(this.f92872b);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onViewAttachedToWindow(b bVar) {
        b bVar2 = bVar;
        l.d(bVar2, "");
        super.onViewAttachedToWindow(bVar2);
        if (this.f92846e && String.valueOf(bVar2.f92851b.getText()).length() == 0) {
            bVar2.f92851b.requestFocus();
            KeyboardUtils.a(bVar2.f92851b);
            this.f92846e = false;
        }
    }

    public final void a(int i2) {
        RecyclerView.ViewHolder f2;
        RecyclerView.ViewHolder f3;
        if (i2 != -1 && i2 != this.f92842a) {
            a();
            int i3 = this.f92842a;
            this.f92842a = i2;
            RecyclerView recyclerView = this.f92849h;
            if (!(recyclerView == null || (f3 = recyclerView.f(i3)) == null)) {
                Objects.requireNonNull(f3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionAdapter.SubtitleViewHolder");
                b bVar = (b) f3;
                bVar.f92851b.setTextColor(com.bytedance.ies.ugc.appcontext.d.a().getResources().getColor(R.color.ac));
                bVar.f92850a.setTextColor(com.bytedance.ies.ugc.appcontext.d.a().getResources().getColor(R.color.ad));
                bVar.f92852c.setBackgroundColor(com.bytedance.ies.ugc.appcontext.d.a().getResources().getColor(R.color.us));
                bVar.f92853d.e();
                bVar.f92853d.setVisibility(8);
                bVar.f92854e.setVisibility(8);
                bVar.f92855f.setVisibility(8);
                bVar.f92856g.setVisibility(8);
            }
            RecyclerView recyclerView2 = this.f92849h;
            if (recyclerView2 != null && (f2 = recyclerView2.f(i2)) != null) {
                Objects.requireNonNull(f2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionAdapter.SubtitleViewHolder");
                b bVar2 = (b) f2;
                bVar2.f92851b.setTextColor(com.bytedance.ies.ugc.appcontext.d.a().getResources().getColor(R.color.a9));
                bVar2.f92850a.setTextColor(com.bytedance.ies.ugc.appcontext.d.a().getResources().getColor(R.color.ac));
                bVar2.f92852c.setBackgroundColor(com.bytedance.ies.ugc.appcontext.d.a().getResources().getColor(R.color.a0));
                bVar2.f92855f.setVisibility(0);
            }
        }
    }

    public a(EditCaptionViewModel editCaptionViewModel, AbstractC2258a aVar) {
        l.d(editCaptionViewModel, "");
        l.d(aVar, "");
        this.f92847f = editCaptionViewModel;
        this.f92848g = aVar;
    }

    public final class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f92850a;

        /* renamed from: b  reason: collision with root package name */
        public final DetectSoftKeyEditText f92851b;

        /* renamed from: c  reason: collision with root package name */
        public final LinearLayout f92852c;

        /* renamed from: d  reason: collision with root package name */
        public final LottieAnimationView f92853d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f92854e;

        /* renamed from: f  reason: collision with root package name */
        public final ImageView f92855f;

        /* renamed from: g  reason: collision with root package name */
        public final ImageView f92856g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f92857h;

        static {
            Covode.recordClassIndex(58907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar, View view) {
            super(view);
            l.d(view, "");
            this.f92857h = aVar;
            View findViewById = view.findViewById(R.id.e8v);
            l.b(findViewById, "");
            this.f92850a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.ate);
            l.b(findViewById2, "");
            this.f92851b = (DetectSoftKeyEditText) findViewById2;
            View findViewById3 = view.findViewById(R.id.bt0);
            l.b(findViewById3, "");
            this.f92852c = (LinearLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.cjl);
            l.b(findViewById4, "");
            this.f92853d = (LottieAnimationView) findViewById4;
            View findViewById5 = view.findViewById(R.id.eqm);
            l.b(findViewById5, "");
            this.f92854e = (ImageView) findViewById5;
            View findViewById6 = view.findViewById(R.id.d2z);
            l.b(findViewById6, "");
            this.f92855f = (ImageView) findViewById6;
            View findViewById7 = view.findViewById(R.id.a77);
            l.b(findViewById7, "");
            this.f92856g = (ImageView) findViewById7;
        }
    }

    static final class f implements View.OnFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92868a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f92869b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f92870c;

        static {
            Covode.recordClassIndex(58911);
        }

        f(a aVar, int i2, b bVar) {
            this.f92868a = aVar;
            this.f92869b = i2;
            this.f92870c = bVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                this.f92868a.f92848g.a(this.f92869b);
                this.f92868a.f92844c = view;
                this.f92868a.f92845d = this.f92869b;
                this.f92870c.f92855f.setVisibility(8);
                this.f92870c.f92856g.setVisibility(0);
                this.f92870c.f92854e.setVisibility(0);
                KeyboardUtils.a(this.f92870c.f92851b);
                return;
            }
            this.f92870c.f92856g.setVisibility(8);
            this.f92870c.f92854e.setVisibility(8);
            this.f92870c.f92853d.setVisibility(8);
            this.f92870c.f92853d.e();
            KeyboardUtils.c(this.f92870c.f92851b);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(b bVar, int i2) {
        boolean z;
        String str;
        CaptionData captionData;
        String text;
        CaptionData captionData2;
        b bVar2 = bVar;
        String str2 = "";
        l.d(bVar2, str2);
        EditCaptionItem editCaptionItem = this.f92847f.f92794a;
        if (editCaptionItem != null) {
            if (this.f92842a == i2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                bVar2.f92851b.setTextColor(com.bytedance.ies.ugc.appcontext.d.a().getResources().getColor(R.color.a9));
                bVar2.f92850a.setTextColor(com.bytedance.ies.ugc.appcontext.d.a().getResources().getColor(R.color.ac));
                bVar2.f92852c.setBackgroundColor(com.bytedance.ies.ugc.appcontext.d.a().getResources().getColor(R.color.a0));
            } else {
                bVar2.f92851b.setTextColor(com.bytedance.ies.ugc.appcontext.d.a().getResources().getColor(R.color.ac));
                bVar2.f92850a.setTextColor(com.bytedance.ies.ugc.appcontext.d.a().getResources().getColor(R.color.ad));
                bVar2.f92852c.setBackgroundColor(com.bytedance.ies.ugc.appcontext.d.a().getResources().getColor(R.color.us));
            }
            bVar2.f92850a.setVisibility(0);
            bVar2.f92851b.setVisibility(0);
            bVar2.f92851b.setFontType(com.bytedance.ies.dmt.ui.widget.util.d.f33796b);
            TextView textView = bVar2.f92850a;
            List<CaptionData> srcSubtitleItem = editCaptionItem.getSrcSubtitleItem();
            if (srcSubtitleItem == null || (captionData2 = srcSubtitleItem.get(i2)) == null || (str = captionData2.getText()) == null) {
                str = str2;
            }
            textView.setText(str);
            DetectSoftKeyEditText detectSoftKeyEditText = bVar2.f92851b;
            List<CaptionData> transSubtitleItem = editCaptionItem.getTransSubtitleItem();
            if (!(transSubtitleItem == null || (captionData = transSubtitleItem.get(i2)) == null || (text = captionData.getText()) == null)) {
                str2 = text;
            }
            detectSoftKeyEditText.setText(str2);
            bVar2.f92851b.addTextChangedListener(new c(editCaptionItem, this, i2, bVar2));
            bVar2.setIsRecyclable(false);
            LottieAnimationView lottieAnimationView = bVar2.f92853d;
            lottieAnimationView.setAnimation("little_audio_wave_anim.json");
            lottieAnimationView.setRepeatCount(-1);
            bVar2.f92852c.setOnClickListener(new d(this, i2, bVar2));
            bVar2.f92851b.setOnClickListener(new e(this, i2, bVar2));
            bVar2.f92851b.setOnFocusChangeListener(new f(this, i2, bVar2));
            bVar2.f92854e.setOnClickListener(new g(this, i2, bVar2));
            bVar2.f92856g.setOnClickListener(new h(this, i2, bVar2));
        }
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(7677);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.rz, viewGroup, false);
        l.b(a3, "");
        aVar.f92843b = a3;
        View view = aVar.f92843b;
        if (view == null) {
            l.a("contentView");
        }
        b bVar = new b(aVar, view);
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = bVar.getClass().getName();
        MethodCollector.o(7677);
        return bVar;
    }
}
