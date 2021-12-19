package com.ss.android.ugc.aweme.shortvideo.subtitle;

import android.app.Activity;
import android.graphics.drawable.Animatable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.property.ag;
import com.ss.android.ugc.aweme.setting.CaptionConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.utils.hx;
import com.ss.android.ugc.aweme.view.DetectSoftKeyEditText;
import com.ss.android.ugc.tools.utils.s;
import com.ss.android.vesdk.r;
import com.ss.android.vesdk.x;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Objects;

public final class u extends RecyclerView.a<e> {
    public static final b o = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public View f131022a;

    /* renamed from: b  reason: collision with root package name */
    public String f131023b = "";

    /* renamed from: c  reason: collision with root package name */
    public final androidx.fragment.app.e f131024c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.asve.editor.g f131025d;

    /* renamed from: e  reason: collision with root package name */
    public RecyclerView f131026e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<com.ss.android.ugc.aweme.sticker.data.h> f131027f;

    /* renamed from: g  reason: collision with root package name */
    public int f131028g;

    /* renamed from: h  reason: collision with root package name */
    public int f131029h;

    /* renamed from: i  reason: collision with root package name */
    public int f131030i;

    /* renamed from: j  reason: collision with root package name */
    public int f131031j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f131032k;

    /* renamed from: l  reason: collision with root package name */
    public final CaptionConfig f131033l;

    /* renamed from: m  reason: collision with root package name */
    public final h f131034m;
    public final VideoPublishEditModel n;
    private final p p;
    private final f q;

    public interface d {
        static {
            Covode.recordClassIndex(85881);
        }

        boolean a();
    }

    static {
        Covode.recordClassIndex(85877);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ e onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(85879);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static final class f extends com.facebook.drawee.c.c<com.facebook.imagepipeline.j.f> {
        static {
            Covode.recordClassIndex(85883);
        }

        f() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final /* synthetic */ void onFinalImageSet(String str, com.facebook.imagepipeline.j.f fVar, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f131027f.size();
    }

    public static final class p implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f131066a;

        static {
            Covode.recordClassIndex(85893);
        }

        static final class a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ p this$0;

            static {
                Covode.recordClassIndex(85894);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(p pVar) {
                super(0);
                this.this$0 = pVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f131066a.a();
                return z.f158842a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        p(u uVar) {
            this.f131066a = uVar;
        }

        @Override // com.ss.android.vesdk.r
        public final void onCallback(int i2, int i3, float f2, String str) {
            if (i2 == 4098) {
                hx.a(0, new a(this));
            }
        }
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f131043a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f131044b;

        static {
            Covode.recordClassIndex(85884);
        }

        g(u uVar, int i2) {
            this.f131043a = uVar;
            this.f131044b = i2;
        }

        public final void run() {
            this.f131043a.f131032k = false;
            this.f131043a.a(this.f131044b - 1);
        }
    }

    static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f131045a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f131046b;

        static {
            Covode.recordClassIndex(85885);
        }

        h(u uVar, int i2) {
            this.f131045a = uVar;
            this.f131046b = i2;
        }

        public final void run() {
            this.f131045a.f131032k = false;
            this.f131045a.a(this.f131046b - 1);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f131063a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f131064b;

        static {
            Covode.recordClassIndex(85891);
        }

        n(u uVar, int i2) {
            this.f131063a = uVar;
            this.f131064b = i2;
        }

        public final void run() {
            RecyclerView.ViewHolder viewHolder;
            DetectSoftKeyEditText detectSoftKeyEditText;
            RecyclerView recyclerView = this.f131063a.f131026e;
            e eVar = null;
            if (recyclerView != null) {
                viewHolder = recyclerView.f(this.f131064b);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof e) {
                eVar = viewHolder;
            }
            e eVar2 = eVar;
            if (eVar2 != null && (detectSoftKeyEditText = eVar2.f131039a) != null) {
                detectSoftKeyEditText.requestFocus();
                this.f131063a.f131034m.a(detectSoftKeyEditText);
            }
        }
    }

    public final void a() {
        RecyclerView.ViewHolder viewHolder;
        int i2 = this.f131030i;
        if (i2 >= 0 && i2 < this.f131027f.size()) {
            RecyclerView recyclerView = this.f131026e;
            e eVar = null;
            if (recyclerView != null) {
                viewHolder = recyclerView.f(this.f131030i);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof e) {
                eVar = viewHolder;
            }
            e eVar2 = eVar;
            if (eVar2 != null) {
                eVar2.f131041c.d();
                if (this.f131028g == this.f131030i) {
                    eVar2.f131041c.setVisibility(8);
                    eVar2.f131040b.setVisibility(0);
                }
            }
            this.f131030i = -1;
        }
    }

    public static final class m implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f131059a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f131060b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.data.h f131061c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f131062d;

        static {
            Covode.recordClassIndex(85890);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.subtitle.u.d
        public final boolean a() {
            int selectionStart = this.f131060b.f131039a.getSelectionStart();
            int length = this.f131061c.getText().length();
            if (selectionStart <= 0 || selectionStart >= length) {
                return true;
            }
            u uVar = this.f131059a;
            com.ss.android.ugc.aweme.sticker.data.h hVar = this.f131061c;
            int i2 = this.f131062d;
            int length2 = hVar.getText().length();
            if (length2 <= selectionStart) {
                return true;
            }
            String text = hVar.getText();
            Objects.requireNonNull(text, "null cannot be cast to non-null type java.lang.String");
            String substring = text.substring(selectionStart, length2);
            h.f.b.l.b(substring, "");
            long endTime = hVar.getEndTime();
            String text2 = hVar.getText();
            Objects.requireNonNull(text2, "null cannot be cast to non-null type java.lang.String");
            String substring2 = text2.substring(0, selectionStart);
            h.f.b.l.b(substring2, "");
            hVar.setText(substring2);
            hVar.setEndTime(hVar.getStartTime() + (((hVar.getEndTime() - hVar.getStartTime()) * ((long) hVar.getText().length())) / ((long) length2)));
            com.ss.android.ugc.aweme.sticker.data.h hVar2 = new com.ss.android.ugc.aweme.sticker.data.h(hVar.getEndTime() + 1, endTime, substring);
            int i3 = i2 + 1;
            uVar.f131027f.add(i3, hVar2);
            uVar.f131029h = i2;
            uVar.f131028g = i3;
            if (ag.a()) {
                uVar.f131031j = 0;
            } else {
                uVar.f131031j = hVar2.getText().length();
            }
            uVar.notifyItemRangeChanged(i2, uVar.getItemCount() - i2);
            uVar.a(i3);
            return true;
        }

        m(u uVar, e eVar, com.ss.android.ugc.aweme.sticker.data.h hVar, int i2) {
            this.f131059a = uVar;
            this.f131060b = eVar;
            this.f131061c = hVar;
            this.f131062d = i2;
        }
    }

    public static final class o implements DetectSoftKeyEditText.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f131065a;

        static {
            Covode.recordClassIndex(85892);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        o(u uVar) {
            this.f131065a = uVar;
        }

        @Override // com.ss.android.ugc.aweme.view.DetectSoftKeyEditText.b
        public final void a(int i2) {
            if (!this.f131065a.f131032k) {
                this.f131065a.f131031j = i2;
            }
        }
    }

    public final void a(int i2) {
        RecyclerView recyclerView = this.f131026e;
        if (recyclerView != null) {
            recyclerView.post(new n(this, i2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        h.f.b.l.d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        com.ss.android.ugc.asve.editor.g gVar = this.f131025d;
        if (gVar != null) {
            gVar.c(this.p);
        }
        this.f131026e = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        h.f.b.l.d(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f131026e = null;
        com.ss.android.ugc.asve.editor.g gVar = this.f131025d;
        if (gVar != null) {
            gVar.d(this.p);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onViewRecycled(e eVar) {
        e eVar2 = eVar;
        h.f.b.l.d(eVar2, "");
        eVar2.f131039a.setOnSelectionChangedListener(null);
        super.onViewRecycled(eVar2);
    }

    public static final class k implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f131054a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f131055b;

        static {
            Covode.recordClassIndex(85888);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void afterTextChanged(Editable editable) {
            if (editable != null && this.f131054a.f131029h == -1 && this.f131055b.getAdapterPosition() >= 0 && this.f131055b.getAdapterPosition() < this.f131054a.getItemCount()) {
                this.f131054a.f131027f.get(this.f131055b.getAdapterPosition()).setText(String.valueOf(this.f131055b.f131039a.getText()));
            }
        }

        k(u uVar, e eVar) {
            this.f131054a = uVar;
            this.f131055b = eVar;
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f131050a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f131051b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.data.h f131052c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f131053d;

        static {
            Covode.recordClassIndex(85887);
        }

        j(u uVar, int i2, com.ss.android.ugc.aweme.sticker.data.h hVar, e eVar) {
            this.f131050a = uVar;
            this.f131051b = i2;
            this.f131052c = hVar;
            this.f131053d = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f131050a.a();
            this.f131050a.f131030i = this.f131051b;
            com.ss.android.ugc.asve.editor.g gVar = this.f131050a.f131025d;
            if (gVar != null) {
                gVar.a((int) this.f131052c.getStartTime(), (int) this.f131052c.getEndTime(), x.g.EDITOR_TIMERANGE_FLAG_BEFORE_SPEED);
            }
            com.ss.android.ugc.asve.editor.g gVar2 = this.f131050a.f131025d;
            if (gVar2 != null) {
                gVar2.t();
            }
            LottieAnimationView lottieAnimationView = this.f131053d.f131041c;
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.setAnimation("little_audio_wave_anim.json");
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.a();
            this.f131053d.f131040b.setVisibility(8);
            com.ss.android.ugc.aweme.common.r.a("preview_subtitle", new com.ss.android.ugc.tools.f.b().a("enter_from", "video_edit_page").a("shoot_way", this.f131050a.n.mShootWay).a("creation_id", this.f131050a.n.creationId).a("content_source", bl.b(this.f131050a.n)).a("content_type", bl.a(this.f131050a.n)).a("enter_method", this.f131050a.f131023b).f149193a);
        }
    }

    public final class a extends InputFilter.LengthFilter {

        /* renamed from: b  reason: collision with root package name */
        private final int f131036b;

        static {
            Covode.recordClassIndex(85878);
        }

        public a(int i2) {
            super(i2);
            this.f131036b = i2;
        }

        public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
            if (ag.a()) {
                int i6 = this.f131036b;
                if (spanned == null) {
                    h.f.b.l.b();
                }
                if (i3 - i2 > i6 - (spanned.length() - (i5 - i4))) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(com.ss.android.ugc.aweme.df.b.a()).a(com.ss.android.ugc.aweme.df.b.a().getString(R.string.a_4, Integer.valueOf(u.this.f131033l.getWordsPerLine()))).a();
                }
            }
            return super.filter(charSequence, i2, i3, spanned, i4, i5);
        }
    }

    public final class c implements InputFilter {

        /* renamed from: a  reason: collision with root package name */
        public final d f131037a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f131038b;

        static {
            Covode.recordClassIndex(85880);
        }

        public c(u uVar, d dVar) {
            h.f.b.l.d(dVar, "");
            this.f131038b = uVar;
            this.f131037a = dVar;
        }

        public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
            boolean z;
            if ("\n".equals(charSequence) && i2 == 0 && i3 == 1) {
                this.f131037a.a();
                return "";
            }
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || spanned == null || spanned.length() == 0) {
                return null;
            }
            Character ch = '\n';
            h.f.b.l.d(charSequence, "");
            if (charSequence.length() == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            } else if (!ch.equals(Character.valueOf(charSequence.charAt(h.m.p.f(charSequence)))) || !h.m.p.d(spanned.subSequence(i4, i5).toString(), h.m.p.k(charSequence))) {
                return null;
            } else {
                this.f131037a.a();
                return h.m.p.k(charSequence);
            }
        }
    }

    static final class i implements View.OnFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f131047a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f131048b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f131049c;

        static {
            Covode.recordClassIndex(85886);
        }

        i(u uVar, int i2, e eVar) {
            this.f131047a = uVar;
            this.f131048b = i2;
            this.f131049c = eVar;
        }

        public final void onFocusChange(View view, boolean z) {
            bj.d("SubtitleEditAdapter onFocusChanged hasFocus ".concat(String.valueOf(z)));
            if (z) {
                this.f131047a.f131028g = this.f131048b;
            }
            this.f131047a.a(this.f131049c, this.f131048b, z);
        }
    }

    public final class e extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final DetectSoftKeyEditText f131039a;

        /* renamed from: b  reason: collision with root package name */
        public final ImageView f131040b;

        /* renamed from: c  reason: collision with root package name */
        public final LottieAnimationView f131041c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ u f131042d;

        static {
            Covode.recordClassIndex(85882);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(u uVar, View view) {
            super(view);
            h.f.b.l.d(view, "");
            this.f131042d = uVar;
            View findViewById = view.findViewById(R.id.eeb);
            h.f.b.l.b(findViewById, "");
            DetectSoftKeyEditText detectSoftKeyEditText = (DetectSoftKeyEditText) findViewById;
            this.f131039a = detectSoftKeyEditText;
            View findViewById2 = view.findViewById(R.id.eec);
            h.f.b.l.b(findViewById2, "");
            this.f131040b = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.cjl);
            h.f.b.l.b(findViewById3, "");
            this.f131041c = (LottieAnimationView) findViewById3;
            detectSoftKeyEditText.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(e eVar, int i2) {
        boolean z;
        e eVar2 = eVar;
        h.f.b.l.d(eVar2, "");
        eVar2.f131039a.setVisibility(0);
        eVar2.f131039a.setText(this.f131027f.get(i2).getText());
        if (this.f131029h == i2) {
            this.f131029h = -1;
        }
        eVar2.f131039a.setOnFocusChangeListener(new i(this, i2, eVar2));
        if (this.f131028g == i2) {
            z = true;
        } else {
            z = false;
        }
        a(eVar2, i2, z);
        com.ss.android.ugc.aweme.sticker.data.h hVar = this.f131027f.get(i2);
        h.f.b.l.b(hVar, "");
        com.ss.android.ugc.aweme.sticker.data.h hVar2 = hVar;
        s.a(eVar2.f131040b, 0.75f);
        eVar2.f131040b.setOnClickListener(new j(this, i2, hVar2, eVar2));
        m mVar = new m(this, eVar2, hVar2, i2);
        eVar2.f131039a.setFilters(new InputFilter[]{new c(this, mVar), new a(this.f131033l.getWordsPerLine())});
        eVar2.f131039a.addTextChangedListener(new k(this, eVar2));
        eVar2.f131039a.setSoftKeyListener(new l(this, hVar2, i2));
    }

    public static final class l implements View.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f131056a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.data.h f131057b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f131058c;

        static {
            Covode.recordClassIndex(85889);
        }

        l(u uVar, com.ss.android.ugc.aweme.sticker.data.h hVar, int i2) {
            this.f131056a = uVar;
            this.f131057b = hVar;
            this.f131058c = i2;
        }

        public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
            int i3;
            if (!(view instanceof EditText)) {
                view = null;
            }
            EditText editText = (EditText) view;
            if (editText != null) {
                i3 = editText.getSelectionStart();
            } else {
                i3 = 0;
            }
            if (keyEvent == null || keyEvent.getKeyCode() != 67 || keyEvent.getAction() != 0 || i3 != 0 || !ag.a()) {
                return false;
            }
            u uVar = this.f131056a;
            com.ss.android.ugc.aweme.sticker.data.h hVar = this.f131057b;
            int i4 = this.f131058c;
            if (i4 != 0) {
                int i5 = i4 - 1;
                if (uVar.f131027f.get(i5).getText().length() + uVar.f131027f.get(i4).getText().length() <= uVar.f131033l.getWordsPerLine()) {
                    uVar.f131027f.get(i5).setEndTime(hVar.getEndTime());
                    int length = uVar.f131027f.get(i5).getText().length();
                    uVar.f131027f.get(i5).setText(uVar.f131027f.get(i5).getText() + hVar.getText());
                    uVar.f131027f.remove(i4);
                    uVar.f131028g = i5;
                    uVar.f131031j = length;
                    uVar.f131032k = true;
                    uVar.notifyItemRangeChanged(i5, (uVar.getItemCount() - i4) + 2);
                    RecyclerView recyclerView = uVar.f131026e;
                    if (recyclerView != null) {
                        recyclerView.post(new g(uVar, i4));
                    }
                } else if (uVar.f131027f.get(i5).getText().length() == uVar.f131033l.getWordsPerLine()) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(com.ss.android.ugc.aweme.df.b.a()).a(com.ss.android.ugc.aweme.df.b.a().getString(R.string.a_4, Integer.valueOf(uVar.f131033l.getWordsPerLine()))).a();
                } else {
                    int length2 = uVar.f131027f.get(i5).getText().length();
                    int wordsPerLine = uVar.f131033l.getWordsPerLine() - length2;
                    String text = uVar.f131027f.get(i4).getText();
                    Objects.requireNonNull(text, "null cannot be cast to non-null type java.lang.String");
                    String substring = text.substring(0, wordsPerLine);
                    h.f.b.l.b(substring, "");
                    String text2 = uVar.f131027f.get(i4).getText();
                    Objects.requireNonNull(text2, "null cannot be cast to non-null type java.lang.String");
                    String substring2 = text2.substring(wordsPerLine);
                    h.f.b.l.b(substring2, "");
                    long startTime = (long) (((float) uVar.f131027f.get(i4).getStartTime()) + (((((float) (uVar.f131027f.get(i4).getEndTime() - uVar.f131027f.get(i4).getStartTime())) * 1.0f) * ((float) substring.length())) / ((float) uVar.f131027f.get(i4).getText().length())));
                    uVar.f131027f.get(i5).setText(uVar.f131027f.get(i5).getText() + substring);
                    uVar.f131027f.get(i5).setEndTime(startTime);
                    uVar.f131027f.get(i4).setText(substring2);
                    uVar.f131027f.get(i4).setStartTime(startTime + 1);
                    uVar.f131028g = i5;
                    uVar.f131031j = length2;
                    uVar.f131032k = true;
                    uVar.notifyItemRangeChanged(i5, (uVar.getItemCount() - i4) + 1);
                    RecyclerView recyclerView2 = uVar.f131026e;
                    if (recyclerView2 != null) {
                        recyclerView2.post(new h(uVar, i4));
                    }
                }
            }
            return true;
        }
    }

    private final void b(e eVar, int i2, boolean z) {
        if (this.f131030i == i2) {
            if (z) {
                eVar.f131040b.setVisibility(8);
                eVar.f131041c.setVisibility(0);
                return;
            }
        } else if (z) {
            eVar.f131040b.setVisibility(0);
            eVar.f131041c.setVisibility(8);
            return;
        }
        eVar.f131040b.setVisibility(8);
        eVar.f131041c.setVisibility(8);
    }

    public u(h hVar, VideoPublishEditModel videoPublishEditModel, com.ss.android.ugc.aweme.shortvideo.preview.a aVar) {
        h.f.b.l.d(hVar, "");
        h.f.b.l.d(videoPublishEditModel, "");
        h.f.b.l.d(aVar, "");
        this.f131034m = hVar;
        this.n = videoPublishEditModel;
        Activity t = hVar.p.t();
        Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.f131024c = (androidx.fragment.app.e) t;
        this.f131025d = aVar.C().getValue();
        this.f131027f = new ArrayList<>();
        this.f131029h = -1;
        this.f131030i = -1;
        this.f131031j = -1;
        CaptionConfig a2 = com.ss.android.ugc.aweme.setting.f.a();
        if (a2 == null) {
            h.f.b.l.b();
        }
        this.f131033l = a2;
        this.p = new p(this);
        this.q = new f();
    }

    private static RecyclerView.ViewHolder a(u uVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(4354);
        h.f.b.l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(uVar.f131024c), R.layout.b3_, viewGroup, false);
        h.f.b.l.b(a3, "");
        uVar.f131022a = a3;
        View view = uVar.f131022a;
        if (view == null) {
            h.f.b.l.a("view");
        }
        e eVar = new e(uVar, view);
        try {
            if (eVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(eVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) eVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(eVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = eVar.getClass().getName();
        MethodCollector.o(4354);
        return eVar;
    }

    public final void a(e eVar, int i2, boolean z) {
        int i3 = 0;
        if (!z) {
            eVar.itemView.setBackgroundResource(0);
            eVar.f131039a.setTextColor(androidx.core.content.b.c(this.f131024c, R.color.ac));
            eVar.f131039a.clearFocus();
        } else {
            eVar.f131039a.requestFocus();
            eVar.f131039a.setTextColor(androidx.core.content.b.c(this.f131024c, R.color.a9));
            eVar.itemView.setBackgroundColor(androidx.core.content.b.c(this.f131024c, R.color.a0));
            int i4 = this.f131031j;
            if (i4 >= 0) {
                Editable text = eVar.f131039a.getText();
                if (text != null) {
                    i3 = text.length();
                }
                if (i4 <= i3) {
                    bj.d("SubtitleEditAdapter set bind selection focusIndex " + this.f131028g + " selectIndex " + this.f131031j);
                    eVar.f131039a.setSelection(this.f131031j);
                }
            }
            eVar.f131039a.setOnSelectionChangedListener(new o(this));
            this.f131034m.a(eVar.f131039a);
        }
        b(eVar, i2, z);
    }
}
