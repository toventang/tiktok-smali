package com.ss.android.ugc.gamora.editor.sticker.read.a;

import android.content.Context;
import android.graphics.Point;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.lifecycle.u;
import com.bytedance.als.k;
import com.bytedance.als.l;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.internal.IInternalCommerceService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.utils.et;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.m;
import h.f.b.y;
import h.m.p;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public final class c extends com.bytedance.als.j<b> implements com.bytedance.o.a, b {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f146832a = {new y(c.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new y(c.class, "textStickerApi", "getTextStickerApi()Lcom/ss/android/ugc/aweme/editSticker/text/als/EditTextStickerApi;", 0), new y(c.class, "textInputLayout", "getTextInputLayout()Lcom/ss/android/ugc/aweme/editSticker/text/view/TextStickerInputLayout;", 0)};

    /* renamed from: l  reason: collision with root package name */
    public static final a f146833l = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public a f146834b;

    /* renamed from: c  reason: collision with root package name */
    final h.h f146835c = h.i.a((h.f.a.a) new g(this));

    /* renamed from: d  reason: collision with root package name */
    final h.h f146836d = h.i.a((h.f.a.a) new i(this));

    /* renamed from: e  reason: collision with root package name */
    final h.h.d f146837e = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.editSticker.text.view.i.class);

    /* renamed from: f  reason: collision with root package name */
    public final List<com.ss.android.ugc.gamora.editor.sticker.read.b> f146838f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final l<Boolean> f146839g = new l<>(false);

    /* renamed from: h  reason: collision with root package name */
    public final k<List<String>> f146840h = new k<>();

    /* renamed from: i  reason: collision with root package name */
    public final k<List<String>> f146841i = new k<>();

    /* renamed from: j  reason: collision with root package name */
    public com.bytedance.tux.tooltip.a f146842j;

    /* renamed from: k  reason: collision with root package name */
    public final com.bytedance.scene.group.b f146843k;

    /* renamed from: m  reason: collision with root package name */
    private final h.h.d f146844m = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.preview.a.class);
    private final h.h.d n = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.editSticker.text.als.a.class);
    private final h.h o = h.i.a((h.f.a.a) new j(this));
    private final com.bytedance.o.f p;

    static {
        Covode.recordClassIndex(96713);
    }

    public final com.ss.android.ugc.aweme.editSticker.text.als.a c() {
        return (com.ss.android.ugc.aweme.editSticker.text.als.a) this.n.a(this, f146832a[1]);
    }

    public final com.ss.android.ugc.gamora.editor.sticker.read.d d() {
        return (com.ss.android.ugc.gamora.editor.sticker.read.d) this.o.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(96714);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ b getApiComponent() {
        return this;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.p;
    }

    static final class j extends m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.read.d> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96724);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.sticker.read.d invoke() {
            return this.this$0.f146843k.a("ReadTextEffectScene");
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.read.a.b
    public final boolean b() {
        com.ss.android.ugc.gamora.editor.sticker.read.d d2 = d();
        if (d2 != null) {
            return d2.f146859e;
        }
        return false;
    }

    static final class g extends m implements h.f.a.a<com.ss.android.ugc.aweme.effectplatform.f> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96721);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.effectplatform.f invoke() {
            Context u = this.this$0.f146843k.u();
            h.f.b.l.b(u, "");
            return com.ss.android.ugc.aweme.effectplatform.c.a(u, null);
        }
    }

    static final class i extends m implements h.f.a.a<VideoPublishEditModel> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96723);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ VideoPublishEditModel invoke() {
            Object a2 = this.this$0.getDiContainer().a((Type) VideoPublishEditModel.class, (String) null);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.read.a.b
    public final boolean a() {
        T value = this.f146839g.f6468a.getValue();
        h.f.b.l.b(value, "");
        return value.booleanValue();
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        if (d.a()) {
            if ((com.ss.android.ugc.gamora.editor.sticker.read.h.d() == 1 || com.ss.android.ugc.gamora.editor.sticker.read.h.d() == 3) && !com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
                IInternalCommerceService h2 = AVCommerceServiceImpl.h();
                h.f.b.l.b(h2, "");
                if (!h2.b()) {
                    ((com.ss.android.ugc.aweme.shortvideo.preview.a) this.f146844m.a(this, f146832a[0])).f().observe(this, new h(this));
                }
            }
        }
    }

    public static final class b implements IFetchEffectChannelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146845a;

        static {
            Covode.recordClassIndex(96715);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(c cVar) {
            this.f146845a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            this.f146845a.f146838f.clear();
            this.f146845a.f146838f.addAll(com.ss.android.ugc.gamora.editor.sticker.read.c.a(effectChannelResponse));
            com.ss.android.ugc.gamora.editor.sticker.read.d d2 = this.f146845a.d();
            if (d2 != null) {
                d2.b(new ArrayList(this.f146845a.f146838f));
            }
            if (!this.f146845a.f146838f.isEmpty()) {
                c cVar = this.f146845a;
                cVar.b(cVar.f146838f);
            }
        }
    }

    public static final class f implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146851a;

        static {
            Covode.recordClassIndex(96720);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            h.f.b.l.d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(c cVar) {
            this.f146851a = cVar;
        }

        public final void afterTextChanged(Editable editable) {
            h.f.b.l.d(editable, "");
            a aVar = this.f146851a.f146834b;
            if (aVar != null) {
                String obj = editable.toString();
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                char[] charArray = obj.toCharArray();
                h.f.b.l.b(charArray, "");
                StringBuilder sb = new StringBuilder();
                for (char c2 : charArray) {
                    if (!(c2 == ' ' || c2 == '\n')) {
                        sb.append(Character.toLowerCase(c2));
                    }
                }
                String sb2 = sb.toString();
                h.f.b.l.b(sb2, "");
                List<String> b2 = aVar.b(sb2);
                if (!b2.isEmpty()) {
                    this.f146851a.f146840h.a(b2);
                }
            }
        }
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146847a;

        static {
            Covode.recordClassIndex(96717);
        }

        d(c cVar) {
            this.f146847a = cVar;
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f146848a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f146849b;

            static {
                Covode.recordClassIndex(96718);
            }

            a(d dVar, List list) {
                this.f146848a = dVar;
                this.f146849b = list;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                com.bytedance.tux.tooltip.a aVar = this.f146848a.f146847a.f146842j;
                if (aVar != null) {
                    aVar.dismiss();
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.h.d */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            List<String> list = (List) obj;
            a aVar = this.f146847a.f146834b;
            if (aVar != null) {
                String c2 = com.ss.android.ugc.aweme.port.in.g.a().A().c();
                List<String> a2 = aVar.a();
                h.f.b.l.d(c2, "");
                h.f.b.l.d(a2, "");
                Keva keva = com.ss.android.ugc.gamora.editor.sticker.read.k.f146927a;
                String a3 = et.a(c2);
                Object[] array = a2.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                keva.storeStringArray(a3, (String[]) array);
            }
            for (String str : list) {
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.f146847a.f146836d.getValue();
                h.f.b.l.d(str, "");
                h.f.b.l.d(videoPublishEditModel, "");
                r.a("text_reading_voice_unlock", new com.ss.android.ugc.tools.f.b().a("tone_id", str).a("creation_id", videoPublishEditModel.creationId).a("shoot_way", videoPublishEditModel.mShootWay).a("content_source", es.a(videoPublishEditModel)).a("content_type", es.c(videoPublishEditModel)).f149193a);
            }
            c cVar = this.f146847a;
            h.f.b.l.b(list, "");
            cVar.d(list);
            c cVar2 = this.f146847a;
            Point readIconPosition = ((com.ss.android.ugc.aweme.editSticker.text.view.i) cVar2.f146837e.a(cVar2, c.f146832a[2])).getReadIconPosition();
            if (readIconPosition != null) {
                String c3 = this.f146847a.c(list);
                com.bytedance.tux.tooltip.a aVar2 = this.f146847a.f146842j;
                if (aVar2 != null) {
                    aVar2.dismiss();
                }
                this.f146847a.f146842j = new com.bytedance.tux.tooltip.a.b.a(com.bytedance.als.dsl.g.c(this.f146847a)).a(c3).a(readIconPosition.x, readIconPosition.y).a(false).a(true, (View.OnClickListener) new a(this, list)).a(3000L).a(com.bytedance.tux.tooltip.h.TOP).d();
                com.bytedance.tux.tooltip.a aVar3 = this.f146847a.f146842j;
                if (aVar3 != null) {
                    aVar3.a();
                }
            }
        }
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146850a;

        static {
            Covode.recordClassIndex(96719);
        }

        e(c cVar) {
            this.f146850a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                com.ss.android.ugc.gamora.editor.sticker.read.d d2 = this.f146850a.d();
                if (d2 != null) {
                    d2.f146859e = false;
                    return;
                }
                return;
            }
            com.bytedance.tux.tooltip.a aVar = this.f146850a.f146842j;
            if (aVar != null) {
                aVar.dismiss();
            }
        }
    }

    private final List<com.ss.android.ugc.gamora.editor.sticker.read.b> e(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            Iterator<T> it = this.f146838f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (h.f.b.l.a((Object) next.f146854c.f146907c, (Object) t)) {
                    if (next != null) {
                        arrayList.add(next);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.read.a.b
    public final void a(List<com.ss.android.ugc.gamora.editor.sticker.read.b> list) {
        h.f.b.l.d(list, "");
        if (!h.f.b.l.a((Object) this.f146839g.f6468a.getValue(), (Object) false) && !(!this.f146838f.isEmpty())) {
            this.f146838f.addAll(list);
            b(list);
        }
    }

    public final void d(List<String> list) {
        List<com.ss.android.ugc.gamora.editor.sticker.read.b> e2 = e(list);
        com.ss.android.ugc.gamora.editor.sticker.read.d d2 = d();
        if (d2 != null) {
            h.f.b.l.d(e2, "");
            d2.f146859e = true;
            Iterator<T> it = e2.iterator();
            while (it.hasNext()) {
                d2.f146858d.add(0, it.next());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.a.c$c  reason: collision with other inner class name */
    static final class C3939c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146846a;

        static {
            Covode.recordClassIndex(96716);
        }

        C3939c(c cVar) {
            this.f146846a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            List<T> list = (List) obj;
            a aVar = this.f146846a.f146834b;
            if (aVar != null) {
                ArrayList arrayList = new ArrayList();
                h.f.b.l.b(list, "");
                for (T t : list) {
                    String a2 = aVar.a(t);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                this.f146846a.f146841i.a(arrayList);
                if (aVar.a().isEmpty()) {
                    this.f146846a.f146839g.b(false);
                }
            }
        }
    }

    static final class h<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146852a;

        static {
            Covode.recordClassIndex(96722);
        }

        h(c cVar) {
            this.f146852a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f146852a.f146839g.b(true);
            c cVar = this.f146852a;
            ((com.ss.android.ugc.tools.b.a.d) cVar.f146835c.getValue()).a("speaking-voice", false, false, (IFetchEffectChannelListener) new b(cVar));
            c cVar2 = this.f146852a;
            cVar2.f146840h.a(cVar2, new C3939c(cVar2));
            cVar2.f146841i.a(cVar2, new d(cVar2));
            cVar2.c().s().a(cVar2, new e(cVar2));
            this.f146852a.c().a(new f(this.f146852a));
        }
    }

    public final String c(List<String> list) {
        if (list.size() == 1) {
            String str = ((com.ss.android.ugc.gamora.editor.sticker.read.b) n.g((List) e(list))).f146854c.f146906b;
            String string = com.bytedance.als.dsl.g.b(this).getResources().getString(R.string.hd7, str);
            h.f.b.l.b(string, "");
            return string;
        }
        String string2 = com.bytedance.als.dsl.g.b(this).getResources().getString(R.string.hd8);
        h.f.b.l.b(string2, "");
        return string2;
    }

    public final void b(List<com.ss.android.ugc.gamora.editor.sticker.read.b> list) {
        List<String> d2 = com.ss.android.ugc.gamora.editor.sticker.read.k.d(com.ss.android.ugc.aweme.port.in.g.a().A().c());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (com.ss.android.ugc.gamora.editor.sticker.read.b bVar : list) {
            if (!d2.contains(bVar.f146854c.f146907c) && bVar.f146854c.f146909e == 1) {
                String str = bVar.f146854c.f146908d;
                if ((true ^ p.a((CharSequence) str)) && str != null) {
                    for (String str2 : p.c(str, new String[]{","})) {
                        Locale locale = Locale.getDefault();
                        h.f.b.l.b(locale, "");
                        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                        String lowerCase = str2.toLowerCase(locale);
                        h.f.b.l.b(lowerCase, "");
                        linkedHashMap.put(lowerCase, bVar.f146854c.f146907c);
                    }
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            this.f146839g.b(true);
            this.f146834b = new a(linkedHashMap, n.g((Collection) d2));
        }
    }

    public c(com.bytedance.o.f fVar, com.bytedance.scene.group.b bVar) {
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(bVar, "");
        this.p = fVar;
        this.f146843k = bVar;
    }
}
