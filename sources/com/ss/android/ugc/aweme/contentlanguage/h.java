package com.ss.android.ugc.aweme.contentlanguage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.imagepipeline.j.f;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.contentlanguage.k;
import com.ss.android.ugc.aweme.global.config.settings.pojo.ContentLanguageGuideSetting;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class h extends RecyclerView.a<k> {

    /* renamed from: a  reason: collision with root package name */
    public n f78172a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<String> f78173b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private List<ContentLanguageGuideSetting> f78174c;

    /* renamed from: d  reason: collision with root package name */
    private final String f78175d;

    static {
        Covode.recordClassIndex(48471);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ k onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f78174c.size();
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f78179a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f78180b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ContentLanguageGuideSetting f78181c;

        static {
            Covode.recordClassIndex(48473);
        }

        b(h hVar, k kVar, ContentLanguageGuideSetting contentLanguageGuideSetting) {
            this.f78179a = hVar;
            this.f78180b = kVar;
            this.f78181c = contentLanguageGuideSetting;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f78179a.a(this.f78180b, this.f78181c);
        }
    }

    public static final class a extends com.ss.android.ugc.aweme.common.d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f78176a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f78177b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ContentLanguageGuideSetting f78178c;

        static {
            Covode.recordClassIndex(48472);
        }

        @Override // com.ss.android.ugc.aweme.common.d.b
        public final Animator b(View view) {
            View view2;
            if (view != null) {
                view2 = view.findViewById(R.id.c6h);
            } else {
                view2 = null;
            }
            int[] iArr = new int[2];
            iArr[0] = 0;
            if (view == null) {
                l.b();
            }
            Resources resources = view.getResources();
            if (resources == null) {
                l.b();
            }
            iArr[1] = resources.getColor(R.color.f159922f);
            ObjectAnimator ofArgb = ObjectAnimator.ofArgb(view2, "backgroundColor", iArr);
            l.b(ofArgb, "");
            ofArgb.setDuration(150L);
            return ofArgb;
        }

        @Override // com.ss.android.ugc.aweme.common.d.b
        public final Animator c(View view) {
            View view2;
            if (view != null) {
                view2 = view.findViewById(R.id.c6h);
            } else {
                view2 = null;
            }
            int[] iArr = new int[2];
            if (view == null) {
                l.b();
            }
            Resources resources = view.getResources();
            if (resources == null) {
                l.b();
            }
            iArr[0] = resources.getColor(R.color.f159922f);
            iArr[1] = 0;
            ObjectAnimator ofArgb = ObjectAnimator.ofArgb(view2, "backgroundColor", iArr);
            l.b(ofArgb, "");
            ofArgb.setDuration(150L);
            return ofArgb;
        }

        @Override // com.ss.android.ugc.aweme.common.d.b
        public final void a(View view, MotionEvent motionEvent) {
            this.f78176a.a(this.f78177b, this.f78178c);
        }

        a(h hVar, k kVar, ContentLanguageGuideSetting contentLanguageGuideSetting) {
            this.f78176a = hVar;
            this.f78177b = kVar;
            this.f78178c = contentLanguageGuideSetting;
        }
    }

    public static final class c extends com.facebook.drawee.c.c<f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f78182a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ContentLanguageGuideSetting f78183b;

        static {
            Covode.recordClassIndex(48474);
        }

        c(h hVar, ContentLanguageGuideSetting contentLanguageGuideSetting) {
            this.f78182a = hVar;
            this.f78183b = contentLanguageGuideSetting;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
            super.onFinalImageSet(str, fVar, animatable);
            try {
                this.f78182a.f78172a.b(this.f78183b.getCode());
            } catch (com.bytedance.ies.a e2) {
                e2.printStackTrace();
            }
        }
    }

    public h(String str, n nVar) {
        l.d(str, "");
        l.d(nVar, "");
        IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
        l.b(iESSettingsProxy, "");
        List<ContentLanguageGuideSetting> contentLanguageGuideCodes = iESSettingsProxy.getContentLanguageGuideCodes();
        l.b(contentLanguageGuideCodes, "");
        this.f78174c = contentLanguageGuideCodes;
        this.f78172a = nVar;
        this.f78175d = str;
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(6414);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9y, viewGroup, false);
        l.b(a3, "");
        k kVar = new k(a3);
        try {
            if (kVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(kVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) kVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(kVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = kVar.getClass().getName();
        MethodCollector.o(6414);
        return kVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(k kVar, int i2) {
        k kVar2 = kVar;
        l.d(kVar2, "");
        ContentLanguageGuideSetting contentLanguageGuideSetting = this.f78174c.get(i2);
        try {
            kVar2.a().setText(contentLanguageGuideSetting.getLocalName());
            kVar2.b().setText(contentLanguageGuideSetting.getEnName());
            if (TextUtils.isEmpty(contentLanguageGuideSetting.getIcon())) {
                e.a(kVar2.c(), 2131232324);
            } else {
                com.facebook.drawee.a.a.e b2 = com.facebook.drawee.a.a.c.b();
                b2.f47325m = kVar2.c().getController();
                b2.f47315c = (REQUEST) com.facebook.imagepipeline.o.c.a(Uri.parse(contentLanguageGuideSetting.getIcon())).a();
                b2.f47319g = new c(this, contentLanguageGuideSetting);
                kVar2.c().setController(b2.e());
            }
            if (Build.VERSION.SDK_INT >= 21) {
                kVar2.itemView.setOnTouchListener(new a(this, kVar2, contentLanguageGuideSetting));
            } else {
                kVar2.itemView.setOnClickListener(new b(this, kVar2, contentLanguageGuideSetting));
            }
            kVar2.e().setTag(contentLanguageGuideSetting.getHighlightColor());
        } catch (com.bytedance.ies.a e2) {
            e2.printStackTrace();
        }
    }

    public final void a(k kVar, ContentLanguageGuideSetting contentLanguageGuideSetting) {
        try {
            if (this.f78173b.contains(contentLanguageGuideSetting.getCode()) || this.f78173b.size() < c.a()) {
                if (this.f78173b.contains(contentLanguageGuideSetting.getCode())) {
                    this.f78173b.remove(contentLanguageGuideSetting.getCode());
                    r.a("click_content_language_popup", new d().a("enter_from", this.f78175d).a("language_type", contentLanguageGuideSetting.getCode()).a("click_type", "unchoose").f66730a);
                } else {
                    this.f78173b.add(contentLanguageGuideSetting.getCode());
                    r.a("click_content_language_popup", new d().a("enter_from", this.f78175d).a("language_type", contentLanguageGuideSetting.getCode()).a("click_type", "choose").f66730a);
                }
                n nVar = this.f78172a;
                String code = contentLanguageGuideSetting.getCode();
                l.b(code, "");
                nVar.a(code);
                Drawable background = kVar.e().getBackground();
                if (background != null) {
                    GradientDrawable gradientDrawable = (GradientDrawable) background;
                    if (kVar.d().getVisibility() == 8) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            TuxTextView b2 = kVar.b();
                            View view = kVar.itemView;
                            l.b(view, "");
                            View view2 = kVar.itemView;
                            l.b(view2, "");
                            ObjectAnimator.ofArgb(b2, "textColor", view.getResources().getColor(R.color.c4), view2.getResources().getColor(R.color.a9)).setDuration(150L).start();
                            TuxTextView a2 = kVar.a();
                            View view3 = kVar.itemView;
                            l.b(view3, "");
                            View view4 = kVar.itemView;
                            l.b(view4, "");
                            ObjectAnimator.ofArgb(a2, "textColor", view3.getResources().getColor(R.color.bx), view4.getResources().getColor(R.color.a9)).setDuration(150L).start();
                            ObjectAnimator.ofArgb(gradientDrawable, com.bytedance.ies.xelement.pickview.b.b.f37372a, 0, Color.parseColor(kVar.e().getTag().toString())).setDuration(150L).start();
                        } else {
                            TuxTextView b3 = kVar.b();
                            View view5 = kVar.itemView;
                            l.b(view5, "");
                            b3.setTextColor(view5.getResources().getColor(R.color.a9));
                            TuxTextView a3 = kVar.a();
                            View view6 = kVar.itemView;
                            l.b(view6, "");
                            a3.setTextColor(view6.getResources().getColor(R.color.a9));
                            gradientDrawable.setColor(Color.parseColor(kVar.e().getTag().toString()));
                        }
                        kVar.d().setVisibility(0);
                        ObjectAnimator.ofFloat(kVar.d(), "alpha", 0.0f, 1.0f).setDuration(150L).start();
                        ObjectAnimator duration = ObjectAnimator.ofFloat(kVar.c(), "alpha", 1.0f, 0.0f).setDuration(150L);
                        l.b(duration, "");
                        duration.addListener(new k.f(kVar));
                        duration.start();
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 21) {
                        TuxTextView b4 = kVar.b();
                        View view7 = kVar.itemView;
                        l.b(view7, "");
                        View view8 = kVar.itemView;
                        l.b(view8, "");
                        ObjectAnimator.ofArgb(b4, "textColor", view7.getResources().getColor(R.color.a9), view8.getResources().getColor(R.color.c4)).setDuration(150L).start();
                        TuxTextView a4 = kVar.a();
                        View view9 = kVar.itemView;
                        l.b(view9, "");
                        View view10 = kVar.itemView;
                        l.b(view10, "");
                        ObjectAnimator.ofArgb(a4, "textColor", view9.getResources().getColor(R.color.a9), view10.getResources().getColor(R.color.bx)).setDuration(150L).start();
                        ObjectAnimator.ofArgb(gradientDrawable, com.bytedance.ies.xelement.pickview.b.b.f37372a, Color.parseColor(kVar.e().getTag().toString()), 0).setDuration(150L).start();
                    } else {
                        TuxTextView b5 = kVar.b();
                        View view11 = kVar.itemView;
                        l.b(view11, "");
                        b5.setTextColor(view11.getResources().getColor(R.color.c4));
                        TuxTextView a5 = kVar.a();
                        View view12 = kVar.itemView;
                        l.b(view12, "");
                        a5.setTextColor(view12.getResources().getColor(R.color.bx));
                        gradientDrawable.setColor(0);
                    }
                    kVar.c().setVisibility(0);
                    ObjectAnimator.ofFloat(kVar.c(), "alpha", 0.0f, 1.0f).setDuration(150L).start();
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(kVar.d(), "alpha", 1.0f, 0.0f).setDuration(150L);
                    l.b(duration2, "");
                    duration2.addListener(new k.g(kVar));
                    duration2.start();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            }
            View view13 = kVar.itemView;
            l.b(view13, "");
            String string = view13.getContext().getString(R.string.c_e, String.valueOf(c.a()));
            l.b(string, "");
            View view14 = kVar.itemView;
            l.b(view14, "");
            new com.bytedance.tux.g.b(view14).a(string).b();
        } catch (com.bytedance.ies.a e2) {
            e2.printStackTrace();
        }
    }
}
