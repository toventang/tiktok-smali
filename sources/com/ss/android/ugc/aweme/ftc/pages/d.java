package com.ss.android.ugc.aweme.ftc.pages;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.transition.AutoTransition;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.h.v;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.google.c.c.ap;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.ab.m;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.eu;
import com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder;
import com.ss.android.ugc.aweme.utils.hx;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.ad;
import com.zhiliaoapp.musically.R;
import h.c.f;
import h.m.p;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.av;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.cd;
import kotlinx.coroutines.z;

public final class d extends Fragment {

    /* renamed from: h  reason: collision with root package name */
    public static final b f98877h = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public VideoPublishEditModel f98878a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.widgetcompat.a f98879b;

    /* renamed from: c  reason: collision with root package name */
    final AtomicInteger f98880c = new AtomicInteger(0);

    /* renamed from: d  reason: collision with root package name */
    public final int f98881d = 150;

    /* renamed from: e  reason: collision with root package name */
    public Bitmap f98882e;

    /* renamed from: f  reason: collision with root package name */
    public View.OnTouchListener f98883f = new g(this);

    /* renamed from: g  reason: collision with root package name */
    com.ss.android.ugc.aweme.shortvideo.widget.j f98884g;

    /* renamed from: i  reason: collision with root package name */
    private int f98885i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f98886j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f98887k;

    /* renamed from: l  reason: collision with root package name */
    private final h f98888l = new h(this);

    /* renamed from: m  reason: collision with root package name */
    private final z f98889m;
    private final CoroutineExceptionHandler n;
    private final am o;
    private HashMap p;

    static {
        Covode.recordClassIndex(62863);
    }

    public final View a(int i2) {
        if (this.p == null) {
            this.p = new HashMap();
        }
        View view = (View) this.p.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.p.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class b {
        static {
            Covode.recordClassIndex(62866);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static final class a extends h.c.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98890a;

        static {
            Covode.recordClassIndex(62864);
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.pages.d$a$a  reason: collision with other inner class name */
        static final class C2406a extends h.f.b.m implements h.f.a.a<h.z> {
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(62865);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2406a(a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ h.z invoke() {
                this.this$0.f98890a.a();
                return h.z.f158842a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f.c cVar, d dVar) {
            super(cVar);
            this.f98890a = dVar;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(h.c.f fVar, Throwable th) {
            hx.a(0, new C2406a(this));
            q.a("FTCVideoPublishFragment", th);
        }
    }

    public final void a() {
        com.ss.android.ugc.aweme.shortvideo.widget.j jVar;
        com.ss.android.ugc.aweme.shortvideo.widget.j jVar2 = this.f98884g;
        if (jVar2 != null && jVar2.isShowing() && (jVar = this.f98884g) != null) {
            jVar.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        a(getView(), null);
        super.onDestroyView();
        HashMap hashMap = this.p;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public d() {
        z a2 = cd.a(null);
        this.f98889m = a2;
        a aVar = new a(CoroutineExceptionHandler.f158926c, this);
        this.n = aVar;
        this.o = an.a(com.ss.android.ugc.asve.editor.d.f62009a.plus(a2).plus(aVar));
    }

    public static final class n implements IDraftService.DraftSaveListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98901a;

        static {
            Covode.recordClassIndex(62879);
        }

        @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
        public final void onDraftSaveSuccess() {
            d dVar = this.f98901a;
            dVar.a();
            VideoPublishEditModel videoPublishEditModel = dVar.f98878a;
            if (videoPublishEditModel == null) {
                h.f.b.l.a("mModel");
            }
            Iterator<T> it = videoPublishEditModel.getPreviewInfo().getVideoList().iterator();
            long j2 = 0;
            while (it.hasNext()) {
                j2 += it.next().getVideoFileInfo().getDuration() / 1000;
            }
            com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("duration", j2);
            VideoPublishEditModel videoPublishEditModel2 = dVar.f98878a;
            if (videoPublishEditModel2 == null) {
                h.f.b.l.a("mModel");
            }
            com.ss.android.ugc.tools.f.b a3 = a2.a("creation_id", videoPublishEditModel2.creationId).a("shoot_way", "direct_shoot").a("enter_from", "personal_homepage").a("shoot_entrance", "direct_shoot");
            VideoPublishEditModel videoPublishEditModel3 = dVar.f98878a;
            if (videoPublishEditModel3 == null) {
                h.f.b.l.a("mModel");
            }
            com.ss.android.ugc.tools.f.b a4 = a3.a("prop_list", videoPublishEditModel3.mStickerID);
            VideoPublishEditModel videoPublishEditModel4 = dVar.f98878a;
            if (videoPublishEditModel4 == null) {
                h.f.b.l.a("mModel");
            }
            com.ss.android.ugc.tools.f.b a5 = a4.a("effect_list", videoPublishEditModel4.getEditEffectList());
            VideoPublishEditModel videoPublishEditModel5 = dVar.f98878a;
            if (videoPublishEditModel5 == null) {
                h.f.b.l.a("mModel");
            }
            r.a("video_save_end", a5.a("filter_list", videoPublishEditModel5.mCurFilterIds).f149193a);
            VideoPublishEditModel videoPublishEditModel6 = dVar.f98878a;
            if (videoPublishEditModel6 == null) {
                h.f.b.l.a("mModel");
            }
            if (videoPublishEditModel6.mIsFromDraft) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ftc.c.c(1));
            } else {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ftc.c.c(2));
            }
            SmartRouter.buildRoute(dVar.getActivity(), "//kids/main").withParam("key_init_page_index", 4).open();
            q.a("NewKidsMode, Publish SaveDraft and goto KidsMain.");
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.shortvideo.j.c());
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.shortvideo.j.e());
            Intent intent = new Intent();
            intent.putExtra("publish result", "PublishActivity success");
            androidx.fragment.app.e activity = dVar.getActivity();
            if (activity != null) {
                activity.setResult(-1, intent);
            }
            androidx.fragment.app.e activity2 = dVar.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
            dVar.requireActivity().overridePendingTransition(0, R.anim.x);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        n(d dVar) {
            this.f98901a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
        public final void onDraftSaveFailed(DraftSaveResult draftSaveResult) {
            h.f.b.l.d(draftSaveResult, "");
            d dVar = this.f98901a;
            boolean a2 = com.ss.android.ugc.aweme.draft.i.a(draftSaveResult);
            dVar.a();
            if (a2) {
                new com.ss.android.ugc.aweme.tux.a.i.a(com.ss.android.ugc.aweme.port.in.c.f115622a).a(dVar.getString(R.string.bcz)).a();
            } else {
                new com.ss.android.ugc.aweme.tux.a.i.a(com.ss.android.ugc.aweme.port.in.c.f115622a).a(dVar.getString(R.string.bd0)).a();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x015d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b() {
        /*
        // Method dump skipped, instructions count: 367
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.pages.d.b():void");
    }

    private final void c() {
        boolean z;
        VideoPublishEditModel videoPublishEditModel = this.f98878a;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("mModel");
        }
        if (videoPublishEditModel.mIsFromDraft) {
            b.j jVar = new b.j();
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                h.f.b.l.b(activity, "");
                this.f98880c.incrementAndGet();
                if (this.f98879b == null && !activity.isFinishing()) {
                    this.f98879b = com.ss.android.ugc.aweme.widgetcompat.a.a(activity, getString(R.string.fe8));
                    q.d("FTCVideoPublish prepareEffectPlatformImpl:" + this.f98879b);
                }
            }
            com.ss.android.ugc.aweme.port.in.g.a().u();
            VideoPublishEditModel videoPublishEditModel2 = this.f98878a;
            if (videoPublishEditModel2 == null) {
                h.f.b.l.a("mModel");
            }
            ArrayList<EffectPointModel> arrayList = videoPublishEditModel2.mEffectList;
            if (arrayList == null || arrayList.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                HashSet hashSet = new HashSet();
                VideoPublishEditModel videoPublishEditModel3 = this.f98878a;
                if (videoPublishEditModel3 == null) {
                    h.f.b.l.a("mModel");
                }
                Iterator<EffectPointModel> it = videoPublishEditModel3.mEffectList.iterator();
                while (it.hasNext()) {
                    EffectPointModel next = it.next();
                    h.f.b.l.b(next, "");
                    if (!com.ss.android.ugc.aweme.video.e.b(next.getResDir())) {
                        hashSet.add(next.getKey());
                    }
                }
                if (!hashSet.isEmpty()) {
                    androidx.fragment.app.e requireActivity = requireActivity();
                    h.f.b.l.b(requireActivity, "");
                    com.ss.android.ugc.aweme.effectplatform.f a2 = com.ss.android.ugc.aweme.effectplatform.c.a(requireActivity, null);
                    a2.a(this);
                    a2.a((List<String>) new ArrayList(hashSet), (Map<String, String>) null, true, (IFetchEffectListListener) new i(jVar));
                } else {
                    q.d("All effects needn't download");
                    jVar.a((Object) null);
                }
            } else {
                q.d("ignore fetch specialfilter because of empty effects");
                jVar.a((Object) null);
            }
            b.i a3 = b.i.a((Object) null);
            b.j jVar2 = new b.j();
            jVar2.a((Object) null);
            ArrayList a4 = ap.a(a3, jVar.f4869a, jVar2.f4869a);
            h.f.b.l.b(a4, "");
            b.i.b((Collection<? extends b.i<?>>) a4).a(new j(this), b.i.f4826c, null);
        }
    }

    public static final class c extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98891a;

        static {
            Covode.recordClassIndex(62867);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(d dVar) {
            this.f98891a = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x006d, code lost:
            if (r1 == null) goto L_0x006f;
         */
        @Override // com.ss.android.ugc.aweme.views.d
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.view.View r8) {
            /*
            // Method dump skipped, instructions count: 201
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.pages.d.c.a(android.view.View):void");
        }
    }

    public static final class e extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98893a;

        static {
            Covode.recordClassIndex(62869);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(d dVar) {
            this.f98893a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            androidx.fragment.app.e requireActivity = this.f98893a.requireActivity();
            h.f.b.l.b(requireActivity, "");
            VideoPublishEditModel a2 = d.a(this.f98893a);
            h.f.b.l.d(requireActivity, "");
            h.f.b.l.d(a2, "");
            Intent intent = new Intent(requireActivity, FTCChooseCoverActivity.class);
            intent.addFlags(536870912);
            intent.addFlags(67108864);
            intent.putExtra("KEY_VIDEO_PUBLISH_EDIT_MODEL", (Serializable) a2);
            requireActivity.startActivityForResult(intent, 4);
            requireActivity.overridePendingTransition(R.anim.w, R.anim.x);
            com.ss.android.ugc.tools.f.b a3 = new com.ss.android.ugc.tools.f.b().a("creation_id", d.a(this.f98893a).creationId).a("enter_from", "video_post_page");
            if (d.a(this.f98893a).draftId != 0) {
                a3.a("draft_id", d.a(this.f98893a).draftId);
            }
            r.a("select_cover", a3.f149193a);
            r.a("cover_click", new com.ss.android.ugc.tools.f.b().a("creation_id", d.a(this.f98893a).creationId).a("enter_from", "video_edit_page").a("shoot_entrance", "direct_shoot").a("shoot_way", "direct_shoot").f149193a);
        }
    }

    public static final class f extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98894a;

        static {
            Covode.recordClassIndex(62870);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar) {
            super(600);
            this.f98894a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            MethodCollector.i(12612);
            this.f98894a.getLifecycle().a(new VideoCoverBitmapHolder());
            ImageView imageView = (ImageView) this.f98894a.a(R.id.bt6);
            h.f.b.l.b(imageView, "");
            imageView.buildDrawingCache(true);
            Bitmap copy = imageView.getDrawingCache(true).copy(Bitmap.Config.RGB_565, false);
            imageView.destroyDrawingCache();
            if (this.f98894a.f98882e != null) {
                copy = this.f98894a.f98882e;
            }
            VideoCoverBitmapHolder.f131084a = copy;
            androidx.fragment.app.e requireActivity = this.f98894a.requireActivity();
            h.f.b.l.b(requireActivity, "");
            ImageView imageView2 = (ImageView) this.f98894a.a(R.id.bt6);
            h.f.b.l.b(imageView2, "");
            TuxTextView tuxTextView = (TuxTextView) this.f98894a.a(R.id.euk);
            h.f.b.l.b(tuxTextView, "");
            VideoPublishEditModel a2 = d.a(this.f98894a);
            h.f.b.l.d(requireActivity, "");
            h.f.b.l.d(imageView2, "");
            h.f.b.l.d(tuxTextView, "");
            h.f.b.l.d(a2, "");
            Intent intent = new Intent(requireActivity, FTCVideoPublishPreviewActivity.class);
            intent.putExtra("args", (Serializable) a2);
            v.a(imageView2, "transition_view_v1");
            v.a(tuxTextView, "transition_view_v2");
            androidx.core.g.e a3 = androidx.core.g.e.a(imageView2, "transition_view_v1");
            h.f.b.l.b(a3, "");
            androidx.core.g.e a4 = androidx.core.g.e.a(tuxTextView, "transition_view_v2");
            h.f.b.l.b(a4, "");
            androidx.core.app.b a5 = androidx.core.app.b.a(requireActivity, a3, a4);
            h.f.b.l.b(a5, "");
            Bundle a6 = a5.a();
            com.ss.android.ugc.tiktok.security.a.a.a(intent, requireActivity);
            requireActivity.startActivity(intent, a6);
            MethodCollector.o(12612);
        }
    }

    public static final class h implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98896a;

        static {
            Covode.recordClassIndex(62872);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(d dVar) {
            this.f98896a = dVar;
        }

        public final void afterTextChanged(Editable editable) {
            if (editable != null) {
                int length = editable.length();
                if (length > 0) {
                    int i2 = length - 1;
                    if (editable.charAt(i2) == '\n') {
                        editable.delete(i2, length);
                    }
                }
                DmtEditText dmtEditText = (DmtEditText) this.f98896a.a(R.id.axx);
                h.f.b.l.b(dmtEditText, "");
                Editable text = dmtEditText.getText();
                if (text != null) {
                    h.f.b.l.b(text, "");
                    if (text.length() > this.f98896a.f98881d) {
                        int selectionEnd = Selection.getSelectionEnd(text);
                        String obj = text.toString();
                        int i3 = this.f98896a.f98881d;
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                        String substring = obj.substring(0, i3);
                        h.f.b.l.b(substring, "");
                        ((DmtEditText) this.f98896a.a(R.id.axx)).setText(substring);
                        DmtEditText dmtEditText2 = (DmtEditText) this.f98896a.a(R.id.axx);
                        h.f.b.l.b(dmtEditText2, "");
                        Editable text2 = dmtEditText2.getText();
                        if (text2 != null) {
                            h.f.b.l.b(text2, "");
                            if (selectionEnd > text2.length()) {
                                selectionEnd = text2.length();
                            }
                            Selection.setSelection(text2, selectionEnd);
                            new com.ss.android.ugc.aweme.tux.a.i.a(this.f98896a.requireContext()).a(R.string.hfi).a();
                        }
                    }
                }
            }
        }
    }

    public static final class i implements IFetchEffectListListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.j f98897a;

        static {
            Covode.recordClassIndex(62873);
        }

        i(b.j jVar) {
            this.f98897a = jVar;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
        public final void onFail(ExceptionResult exceptionResult) {
            h.f.b.l.d(exceptionResult, "");
            q.b("uniformFetchList fail : ".concat(String.valueOf(exceptionResult)));
            this.f98897a.a((Object) null);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(List<Effect> list) {
            h.f.b.l.d(list, "");
            q.d("uniformFetchList onSuccess");
            this.f98897a.a((Object) null);
        }
    }

    public static final class m implements IEffectService.OnVideoCoverCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98900a;

        static {
            Covode.recordClassIndex(62878);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(d dVar) {
            this.f98900a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverFailed(int i2) {
            new com.ss.android.ugc.aweme.tux.a.i.a(com.ss.android.ugc.aweme.port.in.c.f115622a).a(R.string.doa).a();
        }

        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
            h.f.b.l.d(bitmap, "");
            if (this.f98900a.a(R.id.bt6) != null && this.f98900a.getContext() != null) {
                Bitmap mergeCoverText = d.a(this.f98900a).getCoverPublishModel().getEffectTextModel().mergeCoverText(bitmap);
                androidx.core.graphics.drawable.b a2 = androidx.core.graphics.drawable.d.a(this.f98900a.getResources(), mergeCoverText);
                h.f.b.l.b(a2, "");
                a2.a(com.bytedance.common.utility.n.b(com.ss.android.ugc.aweme.port.in.c.f115622a, 4.0f));
                ((ImageView) this.f98900a.a(R.id.bt6)).setImageDrawable(a2);
                this.f98900a.f98882e = mergeCoverText;
                com.ss.android.ugc.aweme.shortvideo.u.a.a(mergeCoverText, d.a(this.f98900a).getVideoCoverPath());
            }
        }
    }

    public static final /* synthetic */ VideoPublishEditModel a(d dVar) {
        VideoPublishEditModel videoPublishEditModel = dVar.f98878a;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("mModel");
        }
        return videoPublishEditModel;
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ String $coverFile;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(62875);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(d dVar, String str, h.c.d dVar2) {
            super(2, dVar2);
            this.this$0 = dVar;
            this.$coverFile = str;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            k kVar = new k(this.this$0, this.$coverFile, dVar);
            kVar.L$0 = obj;
            return kVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((k) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        /* access modifiers changed from: package-private */
        public static final class a extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super Bitmap>, Object> {
            int label;
            final /* synthetic */ k this$0;

            static {
                Covode.recordClassIndex(62876);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(k kVar, h.c.d dVar) {
                super(2, dVar);
                this.this$0 = kVar;
            }

            @Override // h.c.b.a.a
            public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                h.f.b.l.d(dVar, "");
                return new a(this.this$0, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super Bitmap> dVar) {
                return ((a) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                MethodCollector.i(12194);
                if (this.label == 0) {
                    h.r.a(obj);
                    Bitmap decodeFile = BitmapFactory.decodeFile(this.this$0.$coverFile);
                    MethodCollector.o(12194);
                    return decodeFile;
                }
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                MethodCollector.o(12194);
                throw illegalStateException;
            }
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            Resources resources;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                h.r.a(obj);
                av avVar = kotlinx.coroutines.i.b((am) this.L$0, bf.f159041b, null, new a(this, null), 2);
                resources = this.this$0.getResources();
                this.L$0 = resources;
                this.label = 1;
                obj = avVar.a(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                resources = (Resources) this.L$0;
                h.r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.core.graphics.drawable.b a2 = androidx.core.graphics.drawable.d.a(resources, (Bitmap) obj);
            h.f.b.l.b(a2, "");
            a2.a(com.bytedance.common.utility.n.b(this.this$0.getContext(), 4.0f));
            ((ImageView) this.this$0.a(R.id.bt6)).setImageDrawable(a2);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98898a;

        static {
            Covode.recordClassIndex(62874);
        }

        j(d dVar) {
            this.f98898a = dVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            q.d("FTCVideoPublish finishPrepareEffectPlatform:" + this.f98898a.f98879b);
            d dVar = this.f98898a;
            androidx.fragment.app.e activity = dVar.getActivity();
            if (activity != null) {
                h.f.b.l.b(activity, "");
                if (dVar.f98880c.decrementAndGet() == 0 && dVar.f98879b != null) {
                    com.ss.android.ugc.aweme.widgetcompat.a aVar = dVar.f98879b;
                    if (aVar == null) {
                        h.f.b.l.b();
                    }
                    if (aVar.isShowing() && !activity.isFinishing()) {
                        com.ss.android.ugc.aweme.widgetcompat.a aVar2 = dVar.f98879b;
                        if (aVar2 != null) {
                            aVar2.dismiss();
                        }
                        dVar.f98879b = null;
                    }
                }
            }
            return null;
        }
    }

    static final class g implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98895a;

        static {
            Covode.recordClassIndex(62871);
        }

        g(d dVar) {
            this.f98895a = dVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            eu.b(this.f98895a.getActivity());
            return false;
        }
    }

    private final void a(View view, View.OnTouchListener onTouchListener) {
        if (!(view instanceof EditText)) {
            if (view == null) {
                h.f.b.l.b();
            }
            view.setOnTouchListener(onTouchListener);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                a(viewGroup.getChildAt(i2), onTouchListener);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.d$d  reason: collision with other inner class name */
    static final class View$OnFocusChangeListenerC2407d implements View.OnFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98892a;

        static {
            Covode.recordClassIndex(62868);
        }

        View$OnFocusChangeListenerC2407d(d dVar) {
            this.f98892a = dVar;
        }

        public final void onFocusChange(View view, boolean z) {
            String str;
            String obj;
            if (z) {
                com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", d.a(this.f98892a).creationId);
                DmtEditText dmtEditText = (DmtEditText) this.f98892a.a(R.id.axx);
                h.f.b.l.b(dmtEditText, "");
                Editable text = dmtEditText.getText();
                if (text == null || (obj = text.toString()) == null) {
                    str = null;
                } else {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                    str = p.b((CharSequence) obj).toString();
                }
                com.ss.android.ugc.tools.f.b a3 = a2.a("desc_detail", str);
                if (d.a(this.f98892a).draftId != 0) {
                    a3.a("draft_id", d.a(this.f98892a).draftId);
                }
                r.a("describe_video", a3.f149193a);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT >= 21) {
            AutoTransition autoTransition = new AutoTransition();
            androidx.fragment.app.e requireActivity = requireActivity();
            h.f.b.l.b(requireActivity, "");
            Window window = requireActivity.getWindow();
            h.f.b.l.b(window, "");
            window.setSharedElementReenterTransition(autoTransition);
            androidx.fragment.app.e requireActivity2 = requireActivity();
            h.f.b.l.b(requireActivity2, "");
            Window window2 = requireActivity2.getWindow();
            h.f.b.l.b(window2, "");
            window2.setSharedElementExitTransition(new AutoTransition());
        }
        a(view, this.f98883f);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("args");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof VideoPublishEditModel)) {
            serializable = null;
        }
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) serializable;
        if (videoPublishEditModel != null) {
            this.f98878a = videoPublishEditModel;
            if (!videoPublishEditModel.isPreviewInfoValid()) {
                androidx.fragment.app.e activity = getActivity();
                if (activity != null) {
                    h.f.b.l.b(activity, "");
                    com.ss.android.ugc.aweme.shortvideo.ab.n.a(new m.a(activity));
                }
                q.b("VideoPublishPage finish because of null EditPreviewInfo");
                return;
            }
            VideoPublishEditModel videoPublishEditModel2 = this.f98878a;
            if (videoPublishEditModel2 == null) {
                h.f.b.l.a("mModel");
            }
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                z = arguments2.getBoolean("fromDraft", false);
            } else {
                z = false;
            }
            videoPublishEditModel2.mIsFromDraft = z;
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                i2 = arguments3.getInt("extra_stick_point_type", 0);
            } else {
                i2 = 0;
            }
            this.f98885i = i2;
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                z2 = arguments4.getBoolean("enter_record_from_other_platform", false);
            } else {
                z2 = false;
            }
            this.f98886j = z2;
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                z3 = arguments5.getBoolean("edit_publish_session_end_together", false);
            } else {
                z3 = false;
            }
            this.f98887k = z3;
            Typeface a2 = com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g);
            if (a2 != null) {
                TuxTextView tuxTextView = (TuxTextView) a(R.id.euj);
                h.f.b.l.b(tuxTextView, "");
                tuxTextView.setTypeface(a2);
            }
            VideoPublishEditModel videoPublishEditModel3 = this.f98878a;
            if (videoPublishEditModel3 == null) {
                h.f.b.l.a("mModel");
            }
            String str = videoPublishEditModel3.title;
            if (!(str == null || str.length() == 0)) {
                ((DmtEditText) a(R.id.axx)).setText(str);
            }
            ((DmtEditText) a(R.id.axx)).setOnFocusChangeListener(new View$OnFocusChangeListenerC2407d(this));
            DmtEditText dmtEditText = (DmtEditText) a(R.id.axx);
            h.f.b.l.b(dmtEditText, "");
            dmtEditText.setFilters(new com.ss.android.ugc.aweme.ftc.m.a[]{new com.ss.android.ugc.aweme.ftc.m.a(this.f98881d)});
            ((DmtEditText) a(R.id.axx)).removeTextChangedListener(this.f98888l);
            ((DmtEditText) a(R.id.axx)).addTextChangedListener(this.f98888l);
            ((TuxTextView) a(R.id.euk)).setOnClickListener(new e(this));
            ImageView imageView = (ImageView) a(R.id.bt6);
            h.f.b.l.b(imageView, "");
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            VideoPublishEditModel videoPublishEditModel4 = this.f98878a;
            if (videoPublishEditModel4 == null) {
                h.f.b.l.a("mModel");
            }
            if (videoPublishEditModel4.mIsFromDraft) {
                VideoPublishEditModel videoPublishEditModel5 = this.f98878a;
                if (videoPublishEditModel5 == null) {
                    h.f.b.l.a("mModel");
                }
                if (videoPublishEditModel5.getVideoCoverPath() != null) {
                    VideoPublishEditModel videoPublishEditModel6 = this.f98878a;
                    if (videoPublishEditModel6 == null) {
                        h.f.b.l.a("mModel");
                    }
                    com.ss.android.ugc.aweme.video.e.c(videoPublishEditModel6.getVideoCoverPath());
                    VideoPublishEditModel videoPublishEditModel7 = this.f98878a;
                    if (videoPublishEditModel7 == null) {
                        h.f.b.l.a("mModel");
                    }
                    videoPublishEditModel7.generateVideoCoverPath();
                }
            }
            b();
            ((ImageView) a(R.id.bt6)).setOnClickListener(new f(this));
            ((FrameLayout) a(R.id.xk)).setOnClickListener(new c(this));
            c();
            eu.b(getActivity());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a14, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        Serializable serializableExtra;
        super.onActivityResult(i2, i3, intent);
        if (i2 == 4 && i3 == -1 && intent != null && (serializableExtra = intent.getSerializableExtra("KEY_VIDEO_COVER_CHOOSE_RESULT")) != null) {
            Objects.requireNonNull(serializableExtra, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
            this.f98878a = (VideoPublishEditModel) serializableExtra;
            b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l implements ad {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98899a;

        static {
            Covode.recordClassIndex(62877);
        }

        l(d dVar) {
            this.f98899a = dVar;
        }

        @Override // com.ss.android.vesdk.ad
        public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
            MethodCollector.i(12199);
            h.f.b.l.d(byteBuffer, "");
            Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
            EffectTextModel effectTextModel = d.a(this.f98899a).getCoverPublishModel().getEffectTextModel();
            h.f.b.l.b(createBitmap, "");
            Bitmap mergeCoverText = effectTextModel.mergeCoverText(createBitmap);
            androidx.core.graphics.drawable.b a2 = androidx.core.graphics.drawable.d.a(this.f98899a.getResources(), mergeCoverText);
            h.f.b.l.b(a2, "");
            a2.a(com.bytedance.common.utility.n.b(this.f98899a.getContext(), 4.0f));
            ((ImageView) this.f98899a.a(R.id.bt6)).setImageDrawable(a2);
            if (TextUtils.isEmpty(d.a(this.f98899a).multiEditVideoRecordData.coverImagePath)) {
                d.a(this.f98899a).multiEditVideoRecordData.coverImagePath = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a();
            }
            String str = d.a(this.f98899a).multiEditVideoRecordData.coverImagePath;
            h.f.b.l.b(str, "");
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a(mergeCoverText, str);
            MethodCollector.o(12199);
            return false;
        }
    }
}
