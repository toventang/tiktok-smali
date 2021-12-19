package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.effectplatform.t;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import dmt.av.video.n;
import h.a.n;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

public final class d extends RecyclerView.a<RecyclerView.ViewHolder> implements e.b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f126783a;

    /* renamed from: b  reason: collision with root package name */
    public CategoryPageModel f126784b;

    /* renamed from: c  reason: collision with root package name */
    public m f126785c;

    /* renamed from: d  reason: collision with root package name */
    public final androidx.appcompat.app.d f126786d;

    /* renamed from: e  reason: collision with root package name */
    final VideoPublishEditModel f126787e;

    /* renamed from: f  reason: collision with root package name */
    private int f126788f;

    /* renamed from: g  reason: collision with root package name */
    private List<? extends Effect> f126789g;

    /* renamed from: h  reason: collision with root package name */
    private RecyclerView f126790h;

    /* renamed from: i  reason: collision with root package name */
    private e.b f126791i = new e.b(this) {
        /* class com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.d.AnonymousClass1 */

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f126795a;

        static {
            Covode.recordClassIndex(83188);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        {
            this.f126795a = r1;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e.b
        public final void a(View view, int i2) {
            CategoryPageModel categoryPageModel;
            CategoryEffectModel categoryEffects;
            List<Effect> effects;
            Effect effect;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            AVETParameter avetParameter;
            AVETParameter avetParameter2;
            AVETParameter avetParameter3;
            AVETParameter avetParameter4;
            l.d(view, "");
            if (-1 != i2) {
                this.f126795a.f126783a = true;
                if (i2 == 0) {
                    this.f126795a.a(i2);
                    return;
                }
                d dVar = this.f126795a;
                if (i2 > 0 && (categoryPageModel = dVar.f126784b) != null && (categoryEffects = categoryPageModel.getCategoryEffects()) != null && (effects = categoryEffects.getEffects()) != null && (effect = effects.get(i2 - 1)) != null) {
                    com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("enter_from", "video_edit_page").a("effect_name", effect.getName()).a("effect_id", effect.getEffectId());
                    VideoPublishEditModel videoPublishEditModel = dVar.f126787e;
                    if (videoPublishEditModel == null || (avetParameter4 = videoPublishEditModel.getAvetParameter()) == null || (str = avetParameter4.getShootWay()) == null) {
                        str = "";
                    }
                    com.ss.android.ugc.tools.f.b a3 = a2.a("shoot_way", str);
                    VideoPublishEditModel videoPublishEditModel2 = dVar.f126787e;
                    if (videoPublishEditModel2 == null || (str2 = videoPublishEditModel2.creationId) == null) {
                        str2 = "";
                    }
                    com.ss.android.ugc.tools.f.b a4 = a3.a("creation_id", str2);
                    VideoPublishEditModel videoPublishEditModel3 = dVar.f126787e;
                    if (videoPublishEditModel3 == null || (avetParameter3 = videoPublishEditModel3.getAvetParameter()) == null || (str3 = avetParameter3.getContentSource()) == null) {
                        str3 = "";
                    }
                    com.ss.android.ugc.tools.f.b a5 = a4.a("content_source", str3);
                    VideoPublishEditModel videoPublishEditModel4 = dVar.f126787e;
                    if (videoPublishEditModel4 == null || (avetParameter2 = videoPublishEditModel4.getAvetParameter()) == null || (str4 = avetParameter2.getStoryShootEntrance()) == null) {
                        str4 = "";
                    }
                    com.ss.android.ugc.tools.f.b a6 = a5.a("shoot_entrance", str4);
                    VideoPublishEditModel videoPublishEditModel5 = dVar.f126787e;
                    if (videoPublishEditModel5 == null || (avetParameter = videoPublishEditModel5.getAvetParameter()) == null || (str5 = avetParameter.getContentType()) == null) {
                        str5 = "";
                    }
                    r.a("select_voice_effect", a6.a("content_type", str5).a("local_time_ms", System.currentTimeMillis()).f149193a);
                    String unzipPath = effect.getUnzipPath();
                    if (unzipPath == null) {
                        unzipPath = "";
                    }
                    c.a.a();
                    if (c.a(effect)) {
                        dVar.a(effect, d.a(effect), a.b(effect), unzipPath);
                        dVar.b(i2);
                        m mVar = dVar.f126785c;
                        if (mVar != null) {
                            mVar.a(effect);
                            return;
                        }
                        return;
                    }
                    dVar.a(i2, 2);
                    c.a.a();
                    b bVar = new b(dVar, effect, i2);
                    l.d(effect, "");
                    f b2 = c.a.b();
                    if (b2 != null) {
                        b2.a(effect, t.a(new c.f(bVar), "effect"));
                    }
                }
            }
        }
    };

    /* renamed from: j  reason: collision with root package name */
    private final g f126792j;

    /* renamed from: k  reason: collision with root package name */
    private final AudioEffectParam f126793k;

    /* renamed from: l  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.shortvideo.preview.a f126794l;

    static {
        Covode.recordClassIndex(83187);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        int i2;
        CategoryEffectModel categoryEffects;
        List<Effect> effects;
        CategoryPageModel categoryPageModel = this.f126784b;
        if (categoryPageModel == null || (categoryEffects = categoryPageModel.getCategoryEffects()) == null || (effects = categoryEffects.getEffects()) == null) {
            i2 = 0;
        } else {
            i2 = effects.size();
        }
        return i2 + 1;
    }

    public static final class b implements c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f126797a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Effect f126798b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f126799c;

        static {
            Covode.recordClassIndex(83190);
        }

        static final class a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f126800a;

            static {
                Covode.recordClassIndex(83191);
            }

            a(b bVar) {
                this.f126800a = bVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f126800a.f126797a.f126786d).a(R.string.zg).a();
                this.f126800a.f126797a.a(this.f126800a.f126799c, 3);
                return z.f158842a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.d$b$b  reason: collision with other inner class name */
        static final class CallableC3292b<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f126801a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Effect f126802b;

            static {
                Covode.recordClassIndex(83192);
            }

            CallableC3292b(b bVar, Effect effect) {
                this.f126801a = bVar;
                this.f126802b = effect;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                CategoryPageModel categoryPageModel;
                CategoryEffectModel categoryEffects;
                if (!(this.f126802b == null || (categoryPageModel = this.f126801a.f126797a.f126784b) == null || (categoryEffects = categoryPageModel.getCategoryEffects()) == null)) {
                    List<? extends Effect> g2 = n.g((Collection) categoryEffects.getEffects());
                    g2.set(this.f126801a.f126799c - 1, this.f126802b);
                    categoryEffects.setEffects(g2);
                }
                this.f126801a.f126797a.a(this.f126801a.f126799c, 1);
                this.f126801a.f126797a.b(this.f126801a.f126799c);
                m mVar = this.f126801a.f126797a.f126785c;
                if (mVar == null) {
                    return null;
                }
                mVar.a(this.f126801a.f126798b);
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c.d
        public final void a(Effect effect) {
            String str;
            String str2;
            String str3 = null;
            if (effect != null) {
                str = effect.getEffectId();
            } else {
                str = null;
            }
            if (TextUtils.equals(str, this.f126798b.getEffectId())) {
                i.b(new CallableC3292b(this, effect), i.f4826c);
                d dVar = this.f126797a;
                String a2 = d.a(effect);
                if (effect != null) {
                    str2 = a.b(effect);
                    str3 = effect.getUnzipPath();
                } else {
                    str2 = null;
                }
                dVar.a(effect, a2, str2, str3);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c.d
        public final void a(Effect effect, ExceptionResult exceptionResult) {
            String str;
            l.d(exceptionResult, "");
            if (effect != null) {
                str = effect.getEffectId();
            } else {
                str = null;
            }
            if (TextUtils.equals(str, this.f126798b.getEffectId())) {
                i.b(new a(this), i.f4826c);
            }
        }

        b(d dVar, Effect effect, int i2) {
            this.f126797a = dVar;
            this.f126798b = effect;
            this.f126799c = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements com.ss.android.ugc.aweme.infoSticker.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AudioEffectParam f126796a;

        static {
            Covode.recordClassIndex(83189);
        }

        a(AudioEffectParam audioEffectParam) {
            this.f126796a = audioEffectParam;
        }

        @Override // com.ss.android.ugc.aweme.infoSticker.a
        public final void a(AVChallenge aVChallenge) {
            this.f126796a.setChallenge(aVChallenge);
        }
    }

    public static String a(Effect effect) {
        String effectId;
        if (effect == null || (effectId = effect.getEffectId()) == null) {
            return "";
        }
        return effectId;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f126790h = recyclerView;
    }

    public final void a(int i2) {
        b(i2);
        this.f126794l.a(n.a.a());
        b.a(this.f126787e);
    }

    public final void b(int i2) {
        RecyclerView.ViewHolder viewHolder;
        int itemCount = getItemCount();
        int i3 = this.f126788f;
        RecyclerView.ViewHolder viewHolder2 = null;
        if (i3 >= 0 && itemCount > i3) {
            RecyclerView recyclerView = this.f126790h;
            if (recyclerView != null) {
                viewHolder = recyclerView.f(i3);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof e) {
                ((e) viewHolder).a(false);
            } else {
                notifyItemChanged(this.f126788f);
            }
        }
        this.f126788f = i2;
        if (i2 < getItemCount()) {
            RecyclerView recyclerView2 = this.f126790h;
            if (recyclerView2 != null) {
                viewHolder2 = recyclerView2.f(this.f126788f);
            }
            if (viewHolder2 instanceof e) {
                ((e) viewHolder2).a(true);
            }
        }
    }

    public final void a(int i2, int i3) {
        RecyclerView.ViewHolder viewHolder;
        int itemCount = getItemCount();
        if (i2 >= 0 && itemCount > i2) {
            RecyclerView recyclerView = this.f126790h;
            if (recyclerView != null) {
                viewHolder = recyclerView.f(i2);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof e) {
                ((e) viewHolder).a(i3);
            } else {
                notifyItemChanged(i2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e.b
    public final void a(View view, int i2) {
        l.d(view, "");
        e.b bVar = this.f126791i;
        if (bVar != null) {
            bVar.a(view, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        Effect effect;
        List<String> urlList;
        int i3;
        Context context;
        Resources resources;
        Context context2;
        Resources resources2;
        String str;
        Context context3;
        l.d(viewHolder, "");
        if (viewHolder instanceof e) {
            Drawable drawable = null;
            if (i2 > 0) {
                List<? extends Effect> list = this.f126789g;
                if (list == null) {
                    l.b();
                }
                effect = (Effect) list.get(i2 - 1);
            } else {
                effect = null;
            }
            e eVar = (e) viewHolder;
            boolean z = true;
            if (eVar.a()) {
                AVDmtImageTextView aVDmtImageTextView = eVar.f126805b;
                if (aVDmtImageTextView != null) {
                    AVDmtImageTextView aVDmtImageTextView2 = eVar.f126805b;
                    if (aVDmtImageTextView2 == null || (context3 = aVDmtImageTextView2.getContext()) == null) {
                        str = null;
                    } else {
                        str = context3.getString(R.string.dig);
                    }
                    aVDmtImageTextView.setText(str);
                }
                AVDmtImageTextView aVDmtImageTextView3 = eVar.f126805b;
                if (aVDmtImageTextView3 != null) {
                    AVDmtImageTextView aVDmtImageTextView4 = eVar.f126805b;
                    if (!(aVDmtImageTextView4 == null || (context2 = aVDmtImageTextView4.getContext()) == null || (resources2 = context2.getResources()) == null)) {
                        drawable = resources2.getDrawable(2131232513);
                    }
                    aVDmtImageTextView3.a(drawable);
                }
                ImageView imageView = eVar.f126804a;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                eVar.a(false);
                eVar.a(1);
            } else if (effect != null) {
                AVDmtImageTextView aVDmtImageTextView5 = eVar.f126805b;
                if (aVDmtImageTextView5 != null) {
                    aVDmtImageTextView5.setText(effect.getName());
                }
                UrlModel iconUrl = effect.getIconUrl();
                if (!(iconUrl == null || (urlList = iconUrl.getUrlList()) == null || urlList.isEmpty())) {
                    if (a.a(effect)) {
                        if (urlList == null) {
                            l.b();
                        }
                        Integer e2 = p.e(urlList.get(0));
                        if (e2 != null) {
                            i3 = e2.intValue();
                        } else {
                            i3 = 0;
                        }
                        AVDmtImageTextView aVDmtImageTextView6 = eVar.f126805b;
                        if (aVDmtImageTextView6 != null) {
                            AVDmtImageTextView aVDmtImageTextView7 = eVar.f126805b;
                            if (!(aVDmtImageTextView7 == null || (context = aVDmtImageTextView7.getContext()) == null || (resources = context.getResources()) == null)) {
                                drawable = resources.getDrawable(i3);
                            }
                            aVDmtImageTextView6.a(drawable);
                        }
                    } else {
                        AVDmtImageTextView aVDmtImageTextView8 = eVar.f126805b;
                        if (aVDmtImageTextView8 != null) {
                            if (urlList == null) {
                                l.b();
                            }
                            aVDmtImageTextView8.a(urlList.get(0));
                        }
                    }
                }
                eVar.a(false);
                c.a.a();
                eVar.a(c.a(effect) ? 1 : 0);
            }
            if (i2 != this.f126788f) {
                z = false;
            }
            eVar.a(z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a4, code lost:
        if (android.text.TextUtils.equals(r1, r0) != false) goto L_0x00a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.d.a(com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel, boolean):void");
    }

    private static RecyclerView.ViewHolder a(d dVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(4040);
        l.d(viewGroup, "");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        l.b(from, "");
        l.d(from, "");
        l.d(viewGroup, "");
        View a3 = com.a.a(from, R.layout.dr, viewGroup, false);
        if (a3 != null) {
            e eVar = new e((FrameLayout) a3, dVar);
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
            MethodCollector.o(4040);
            return eVar;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        MethodCollector.o(4040);
        throw nullPointerException;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.effectmanager.effect.model.Effect r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.d.a(com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public d(androidx.appcompat.app.d dVar, g gVar, VideoPublishEditModel videoPublishEditModel, AudioEffectParam audioEffectParam, com.ss.android.ugc.aweme.shortvideo.preview.a aVar) {
        l.d(dVar, "");
        l.d(aVar, "");
        this.f126786d = dVar;
        this.f126792j = gVar;
        this.f126787e = videoPublishEditModel;
        this.f126793k = audioEffectParam;
        this.f126794l = aVar;
    }
}
