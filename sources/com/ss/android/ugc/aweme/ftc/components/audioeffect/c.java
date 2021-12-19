package com.ss.android.ugc.aweme.ftc.components.audioeffect;

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
import com.ss.android.ugc.aweme.ftc.components.audioeffect.b;
import com.ss.android.ugc.aweme.ftc.components.audioeffect.d;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.m;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.f.b;
import com.zhiliaoapp.musically.R;
import dmt.av.video.n;
import h.a.n;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

public final class c extends RecyclerView.a<RecyclerView.ViewHolder> implements d.b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f97617a;

    /* renamed from: b  reason: collision with root package name */
    public CategoryPageModel f97618b;

    /* renamed from: c  reason: collision with root package name */
    public m f97619c;

    /* renamed from: d  reason: collision with root package name */
    public final androidx.appcompat.app.d f97620d;

    /* renamed from: e  reason: collision with root package name */
    final VideoPublishEditModel f97621e;

    /* renamed from: f  reason: collision with root package name */
    private int f97622f;

    /* renamed from: g  reason: collision with root package name */
    private List<? extends Effect> f97623g;

    /* renamed from: h  reason: collision with root package name */
    private RecyclerView f97624h;

    /* renamed from: i  reason: collision with root package name */
    private d.b f97625i = new d.b(this) {
        /* class com.ss.android.ugc.aweme.ftc.components.audioeffect.c.AnonymousClass1 */

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f97629a;

        static {
            Covode.recordClassIndex(62033);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        {
            this.f97629a = r1;
        }

        @Override // com.ss.android.ugc.aweme.ftc.components.audioeffect.d.b
        public final void a(View view, int i2) {
            CategoryPageModel categoryPageModel;
            CategoryEffectModel categoryEffects;
            List<Effect> effects;
            Effect effect;
            String str;
            l.d(view, "");
            if (-1 != i2) {
                this.f97629a.f97617a = true;
                if (i2 == 0) {
                    this.f97629a.a(i2);
                    return;
                }
                c cVar = this.f97629a;
                if (i2 > 0 && (categoryPageModel = cVar.f97618b) != null && (categoryEffects = categoryPageModel.getCategoryEffects()) != null && (effects = categoryEffects.getEffects()) != null && (effect = effects.get(i2 - 1)) != null) {
                    b a2 = new b().a("effect_name", effect.getName()).a("effect_id", effect.getEffectId());
                    VideoPublishEditModel videoPublishEditModel = cVar.f97621e;
                    if (videoPublishEditModel == null || (str = videoPublishEditModel.creationId) == null) {
                        str = "";
                    }
                    r.a("select_voice_effect", a2.a("creation_id", str).f149193a);
                    String unzipPath = effect.getUnzipPath();
                    if (unzipPath == null) {
                        unzipPath = "";
                    }
                    b.a.a();
                    if (b.a(effect)) {
                        cVar.a(c.a(effect), a.b(effect), unzipPath);
                        cVar.b(i2);
                        m mVar = cVar.f97619c;
                        if (mVar != null) {
                            mVar.a(effect);
                            return;
                        }
                        return;
                    }
                    cVar.a(i2, 2);
                    b.a.a();
                    a aVar = new a(cVar, effect, i2);
                    l.d(effect, "");
                    f b2 = b.a.b();
                    if (b2 != null) {
                        b2.a(effect, t.a(new b.e(aVar), "effect"));
                    }
                }
            }
        }
    };

    /* renamed from: j  reason: collision with root package name */
    private final g f97626j;

    /* renamed from: k  reason: collision with root package name */
    private final AudioEffectParam f97627k;

    /* renamed from: l  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.shortvideo.preview.a f97628l;

    static {
        Covode.recordClassIndex(62032);
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
        CategoryPageModel categoryPageModel = this.f97618b;
        if (categoryPageModel == null || (categoryEffects = categoryPageModel.getCategoryEffects()) == null || (effects = categoryEffects.getEffects()) == null) {
            i2 = 0;
        } else {
            i2 = effects.size();
        }
        return i2 + 1;
    }

    public static final class a implements b.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f97630a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Effect f97631b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f97632c;

        static {
            Covode.recordClassIndex(62034);
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.c$a$a  reason: collision with other inner class name */
        static final class CallableC2353a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f97633a;

            static {
                Covode.recordClassIndex(62035);
            }

            CallableC2353a(a aVar) {
                this.f97633a = aVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f97633a.f97630a.f97620d).a(R.string.zg).a();
                this.f97633a.f97630a.a(this.f97633a.f97632c, 3);
                return z.f158842a;
            }
        }

        static final class b<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f97634a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Effect f97635b;

            static {
                Covode.recordClassIndex(62036);
            }

            b(a aVar, Effect effect) {
                this.f97634a = aVar;
                this.f97635b = effect;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                CategoryPageModel categoryPageModel;
                CategoryEffectModel categoryEffects;
                if (!(this.f97635b == null || (categoryPageModel = this.f97634a.f97630a.f97618b) == null || (categoryEffects = categoryPageModel.getCategoryEffects()) == null)) {
                    List<? extends Effect> g2 = n.g((Collection) categoryEffects.getEffects());
                    g2.set(this.f97634a.f97632c - 1, this.f97635b);
                    categoryEffects.setEffects(g2);
                }
                this.f97634a.f97630a.a(this.f97634a.f97632c, 1);
                this.f97634a.f97630a.b(this.f97634a.f97632c);
                m mVar = this.f97634a.f97630a.f97619c;
                if (mVar == null) {
                    return null;
                }
                mVar.a(this.f97634a.f97631b);
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.ftc.components.audioeffect.b.d
        public final void a(Effect effect) {
            String str;
            String str2;
            String str3 = null;
            if (effect != null) {
                str = effect.getEffectId();
            } else {
                str = null;
            }
            if (TextUtils.equals(str, this.f97631b.getEffectId())) {
                i.b(new b(this, effect), i.f4826c);
                c cVar = this.f97630a;
                String a2 = c.a(effect);
                if (effect != null) {
                    str2 = a.b(effect);
                    str3 = effect.getUnzipPath();
                } else {
                    str2 = null;
                }
                cVar.a(a2, str2, str3);
            }
        }

        @Override // com.ss.android.ugc.aweme.ftc.components.audioeffect.b.d
        public final void a(Effect effect, ExceptionResult exceptionResult) {
            String str;
            l.d(exceptionResult, "");
            if (effect != null) {
                str = effect.getEffectId();
            } else {
                str = null;
            }
            if (TextUtils.equals(str, this.f97631b.getEffectId())) {
                i.b(new CallableC2353a(this), i.f4826c);
            }
        }

        a(c cVar, Effect effect, int i2) {
            this.f97630a = cVar;
            this.f97631b = effect;
            this.f97632c = i2;
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
        this.f97624h = recyclerView;
    }

    public final void a(int i2) {
        b(i2);
        this.f97628l.a(n.a.a());
    }

    public final void b(int i2) {
        RecyclerView.ViewHolder viewHolder;
        int itemCount = getItemCount();
        int i3 = this.f97622f;
        RecyclerView.ViewHolder viewHolder2 = null;
        if (i3 >= 0 && itemCount > i3) {
            RecyclerView recyclerView = this.f97624h;
            if (recyclerView != null) {
                viewHolder = recyclerView.f(i3);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof d) {
                ((d) viewHolder).a(false);
            } else {
                notifyItemChanged(this.f97622f);
            }
        }
        this.f97622f = i2;
        if (i2 < getItemCount()) {
            RecyclerView recyclerView2 = this.f97624h;
            if (recyclerView2 != null) {
                viewHolder2 = recyclerView2.f(this.f97622f);
            }
            if (viewHolder2 instanceof d) {
                ((d) viewHolder2).a(true);
            }
        }
    }

    public final void a(int i2, int i3) {
        RecyclerView.ViewHolder viewHolder;
        int itemCount = getItemCount();
        if (i2 >= 0 && itemCount > i2) {
            RecyclerView recyclerView = this.f97624h;
            if (recyclerView != null) {
                viewHolder = recyclerView.f(i2);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof d) {
                ((d) viewHolder).a(i3);
            } else {
                notifyItemChanged(i2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.audioeffect.d.b
    public final void a(View view, int i2) {
        l.d(view, "");
        d.b bVar = this.f97625i;
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
        if (viewHolder instanceof d) {
            Drawable drawable = null;
            if (i2 > 0) {
                List<? extends Effect> list = this.f97623g;
                if (list == null) {
                    l.b();
                }
                effect = (Effect) list.get(i2 - 1);
            } else {
                effect = null;
            }
            d dVar = (d) viewHolder;
            boolean z = true;
            if (dVar.a()) {
                AVDmtImageTextView aVDmtImageTextView = dVar.f97638b;
                if (aVDmtImageTextView != null) {
                    AVDmtImageTextView aVDmtImageTextView2 = dVar.f97638b;
                    if (aVDmtImageTextView2 == null || (context3 = aVDmtImageTextView2.getContext()) == null) {
                        str = null;
                    } else {
                        str = context3.getString(R.string.dig);
                    }
                    aVDmtImageTextView.setText(str);
                }
                AVDmtImageTextView aVDmtImageTextView3 = dVar.f97638b;
                if (aVDmtImageTextView3 != null) {
                    AVDmtImageTextView aVDmtImageTextView4 = dVar.f97638b;
                    if (!(aVDmtImageTextView4 == null || (context2 = aVDmtImageTextView4.getContext()) == null || (resources2 = context2.getResources()) == null)) {
                        drawable = resources2.getDrawable(2131232513);
                    }
                    aVDmtImageTextView3.a(drawable);
                }
                ImageView imageView = dVar.f97637a;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                dVar.a(false);
                dVar.a(1);
            } else if (effect != null) {
                AVDmtImageTextView aVDmtImageTextView5 = dVar.f97638b;
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
                        AVDmtImageTextView aVDmtImageTextView6 = dVar.f97638b;
                        if (aVDmtImageTextView6 != null) {
                            AVDmtImageTextView aVDmtImageTextView7 = dVar.f97638b;
                            if (!(aVDmtImageTextView7 == null || (context = aVDmtImageTextView7.getContext()) == null || (resources = context.getResources()) == null)) {
                                drawable = resources.getDrawable(i3);
                            }
                            aVDmtImageTextView6.a(drawable);
                        }
                    } else {
                        AVDmtImageTextView aVDmtImageTextView8 = dVar.f97638b;
                        if (aVDmtImageTextView8 != null) {
                            if (urlList == null) {
                                l.b();
                            }
                            aVDmtImageTextView8.a(urlList.get(0));
                        }
                    }
                }
                dVar.a(false);
                b.a.a();
                dVar.a(b.a(effect) ? 1 : 0);
            }
            if (i2 != this.f97622f) {
                z = false;
            }
            dVar.a(z);
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.audioeffect.c.a(com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel, boolean):void");
    }

    private static RecyclerView.ViewHolder a(c cVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(4297);
        l.d(viewGroup, "");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        l.b(from, "");
        l.d(from, "");
        l.d(viewGroup, "");
        View a3 = com.a.a(from, R.layout.dr, viewGroup, false);
        if (a3 != null) {
            d dVar = new d((FrameLayout) a3, cVar);
            try {
                if (dVar.itemView.getParent() != null) {
                    try {
                        a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a2) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(dVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                        com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) dVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(dVar.itemView);
                        }
                    }
                }
            } catch (Exception e2) {
                ai.a(e2);
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            gg.f143005a = dVar.getClass().getName();
            MethodCollector.o(4297);
            return dVar;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        MethodCollector.o(4297);
        throw nullPointerException;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r14, java.lang.String r15, java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.audioeffect.c.a(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public c(androidx.appcompat.app.d dVar, g gVar, VideoPublishEditModel videoPublishEditModel, AudioEffectParam audioEffectParam, com.ss.android.ugc.aweme.shortvideo.preview.a aVar) {
        l.d(dVar, "");
        l.d(aVar, "");
        this.f97620d = dVar;
        this.f97626j = gVar;
        this.f97621e = videoPublishEditModel;
        this.f97627k = audioEffectParam;
        this.f97628l = aVar;
    }
}
