package com.ss.android.ugc.aweme.live.sdk.chatroom.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.android.livesdkapi.depend.model.a.e;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.LiveHostOuterService;
import com.ss.android.ugc.aweme.live.livehostimpl.ak;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.internal.g;
import com.ss.android.ugc.aweme.services.IAVFilterService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.ss.android.ugc.aweme.shortvideo.x.h;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class TTLiveBroadcastView implements au, a, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    public static final a s = new a((byte) 0);
    private float A;
    private float B;
    private float C;
    private final f D = new f(this);

    /* renamed from: a  reason: collision with root package name */
    public final IRecordingOperationPanel f108533a;

    /* renamed from: b  reason: collision with root package name */
    public FrameLayout f108534b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.depend.model.a.f f108535c;

    /* renamed from: d  reason: collision with root package name */
    public float f108536d;

    /* renamed from: e  reason: collision with root package name */
    public float f108537e;

    /* renamed from: f  reason: collision with root package name */
    public float f108538f;

    /* renamed from: g  reason: collision with root package name */
    public List<String> f108539g;

    /* renamed from: h  reason: collision with root package name */
    public List<String> f108540h;

    /* renamed from: i  reason: collision with root package name */
    public String f108541i;

    /* renamed from: j  reason: collision with root package name */
    public String f108542j;

    /* renamed from: k  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.x.k f108543k;

    /* renamed from: l  reason: collision with root package name */
    public int f108544l = -1;

    /* renamed from: m  reason: collision with root package name */
    public boolean f108545m;
    public boolean n;
    public boolean o = true;
    public boolean p;
    public final List<FilterBean> q = new ArrayList();
    public e.a r;
    private SimpleDraweeView t;
    private b u;
    private com.bytedance.android.livesdkapi.depend.model.a.f v;
    private com.ss.android.ugc.aweme.shortvideo.x.i w;
    private int x;
    private float y;
    private float z;

    static {
        Covode.recordClassIndex(69561);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(59, new org.greenrobot.eventbus.g(TTLiveBroadcastView.class, "onFilterChange", com.ss.android.ugc.aweme.live.model.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(60, new org.greenrobot.eventbus.g(TTLiveBroadcastView.class, "onCameraReverse", com.ss.android.ugc.aweme.story.live.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        this.p = true;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(69562);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.sdk.chatroom.ui.a
    public final /* bridge */ /* synthetic */ View a() {
        return this.f108534b;
    }

    public static final class f implements com.bytedance.android.livesdkapi.depend.model.a.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TTLiveBroadcastView f108550a;

        static {
            Covode.recordClassIndex(69567);
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void a(String str) {
            h.f.b.l.d(str, "");
            IRecordingOperationPanel iRecordingOperationPanel = this.f108550a.f108533a;
            if (iRecordingOperationPanel != null) {
                iRecordingOperationPanel.onHidePanel(str);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void a(com.bytedance.android.livesdkapi.depend.model.a aVar, String str) {
            h.f.b.l.d(aVar, "");
            h.f.b.l.d(str, "");
            IRecordingOperationPanel iRecordingOperationPanel = this.f108550a.f108533a;
            if (iRecordingOperationPanel != null) {
                iRecordingOperationPanel.onStickerCancel(ak.a(aVar), str);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void a(e.a aVar) {
            h.f.b.l.d(aVar, "");
            this.f108550a.r = aVar;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void a(PrivacyCert privacyCert) {
            IRecordingOperationPanel iRecordingOperationPanel = this.f108550a.f108533a;
            if (iRecordingOperationPanel != null) {
                iRecordingOperationPanel.closeCamera(privacyCert);
            }
        }

        static final class b extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ f this$0;

            static {
                Covode.recordClassIndex(69569);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(f fVar) {
                super(0);
                this.this$0 = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f108550a.a(this.this$0.f108550a.f108538f);
                return z.f158842a;
            }
        }

        static final class a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ f this$0;

            static {
                Covode.recordClassIndex(69568);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(0);
                this.this$0 = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                if (this.this$0.f108550a.o && this.this$0.f108550a.f108543k != null) {
                    com.ss.android.ugc.aweme.shortvideo.x.k kVar = this.this$0.f108550a.f108543k;
                    if (kVar != null) {
                        kVar.a(this.this$0.f108550a.f108538f, 0.0f);
                    }
                    this.this$0.f108550a.o = false;
                }
                return z.f158842a;
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void b() {
            this.f108550a.n = true;
            com.bytedance.android.livesdkapi.depend.model.a.f fVar = this.f108550a.f108535c;
            if (fVar != null && fVar.B().isEmpty()) {
                b.i.a(200).a(new e(this), b.i.f4826c, null);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void a() {
            IRecordingOperationPanel iRecordingOperationPanel = this.f108550a.f108533a;
            if (iRecordingOperationPanel != null) {
                iRecordingOperationPanel.closeRecording();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(TTLiveBroadcastView tTLiveBroadcastView) {
            this.f108550a = tTLiveBroadcastView;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void a(int i2) {
            this.f108550a.a(i2);
        }

        static final class c<TTaskResult, TContinuationResult> implements b.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f108551a;

            static {
                Covode.recordClassIndex(69570);
            }

            c(f fVar) {
                this.f108551a = fVar;
            }

            @Override // b.g
            public final /* synthetic */ Object then(b.i iVar) {
                h.f.b.l.d(iVar, "");
                this.f108551a.f108550a.d();
                return z.f158842a;
            }
        }

        static final class d<TTaskResult, TContinuationResult> implements b.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f108552a;

            static {
                Covode.recordClassIndex(69571);
            }

            d(f fVar) {
                this.f108552a = fVar;
            }

            @Override // b.g
            public final /* synthetic */ Object then(b.i iVar) {
                h.f.b.l.d(iVar, "");
                this.f108552a.f108550a.c();
                return z.f158842a;
            }
        }

        static final class e<TTaskResult, TContinuationResult> implements b.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f108553a;

            static {
                Covode.recordClassIndex(69572);
            }

            e(f fVar) {
                this.f108553a = fVar;
            }

            @Override // b.g
            public final /* synthetic */ Object then(b.i iVar) {
                h.f.b.l.d(iVar, "");
                this.f108553a.f108550a.c();
                return z.f158842a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$f$f  reason: collision with other inner class name */
        static final class C2782f<TTaskResult, TContinuationResult> implements b.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f108554a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PrivacyCert f108555b;

            static {
                Covode.recordClassIndex(69573);
            }

            C2782f(f fVar, PrivacyCert privacyCert) {
                this.f108554a = fVar;
                this.f108555b = privacyCert;
            }

            @Override // b.g
            public final /* synthetic */ Object then(b.i iVar) {
                h.f.b.l.d(iVar, "");
                this.f108554a.f108550a.d();
                return z.f158842a;
            }
        }

        static final class g<TTaskResult, TContinuationResult> implements b.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f108556a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PrivacyCert f108557b;

            static {
                Covode.recordClassIndex(69574);
            }

            g(f fVar, PrivacyCert privacyCert) {
                this.f108556a = fVar;
                this.f108557b = privacyCert;
            }

            @Override // b.g
            public final /* synthetic */ Object then(b.i iVar) {
                h.f.b.l.d(iVar, "");
                this.f108556a.f108550a.c();
                return z.f158842a;
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final int a(String[] strArr) {
            h.f.b.l.d(strArr, "");
            a(strArr, (String[]) null);
            return 0;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final int b(String[] strArr) {
            h.f.b.l.d(strArr, "");
            return b(strArr, (String[]) null);
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void c(float f2) {
            this.f108550a.f108537e = f2;
            TTLiveBroadcastView tTLiveBroadcastView = this.f108550a;
            tTLiveBroadcastView.a(tTLiveBroadcastView.f108536d, this.f108550a.f108537e);
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void b(float f2) {
            this.f108550a.f108536d = f2;
            TTLiveBroadcastView tTLiveBroadcastView = this.f108550a;
            tTLiveBroadcastView.a(tTLiveBroadcastView.f108536d, this.f108550a.f108537e);
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final int c(String[] strArr) {
            com.ss.android.ugc.aweme.shortvideo.x.k kVar;
            if (!(strArr == null || strArr.length == 0 || (kVar = this.f108550a.f108543k) == null)) {
                h.f.b.l.b(strArr, "");
                kVar.a(h.a.i.j(strArr));
            }
            return 0;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void d(float f2) {
            com.ss.android.ugc.aweme.shortvideo.x.k kVar;
            String str;
            IAVFilterService filterService;
            if (this.f108550a.f108545m && (kVar = this.f108550a.f108543k) != null) {
                IExternalService a2 = AVExternalServiceImpl.a();
                if (a2 == null || (filterService = a2.filterService()) == null || (str = filterService.getFilterFolder(this.f108550a.q.get(this.f108550a.f108544l))) == null) {
                    str = "";
                }
                kVar.b(str, f2);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void b(PrivacyCert privacyCert) {
            IRecordingOperationPanel iRecordingOperationPanel = this.f108550a.f108533a;
            if (iRecordingOperationPanel != null) {
                iRecordingOperationPanel.openCamera(privacyCert);
                if (this.f108550a.f108545m && this.f108550a.n) {
                    b.i.a(500).a(new C2782f(this, privacyCert), b.i.f4826c, null);
                    b.i.a(500).a(new g(this, privacyCert), b.i.f4826c, null);
                }
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void a(float f2) {
            this.f108550a.f108538f = f2;
            com.bytedance.android.live.u.h.a(new a(this));
            com.bytedance.android.live.u.h.a(new b(this));
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void b(String str) {
            h.f.b.l.d(str, "");
            IRecordingOperationPanel iRecordingOperationPanel = this.f108550a.f108533a;
            if (iRecordingOperationPanel != null) {
                iRecordingOperationPanel.onShowPanel(str);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final int a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            com.ss.android.ugc.aweme.shortvideo.x.k kVar = this.f108550a.f108543k;
            if (kVar == null) {
                return 0;
            }
            this.f108550a.f108541i = str;
            this.f108550a.f108542j = str2;
            return kVar.b(str, str2);
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final int b(String[] strArr, String[] strArr2) {
            h.f.b.l.d(strArr, "");
            com.ss.android.ugc.aweme.shortvideo.x.k kVar = this.f108550a.f108543k;
            if (kVar != null) {
                kVar.f();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int length = strArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    if (strArr2 == null || i2 >= strArr2.length) {
                        arrayList.add(strArr[i2]);
                        arrayList2.add("");
                    } else {
                        arrayList.add(strArr[i2]);
                        arrayList2.add(strArr2[i2]);
                    }
                }
                this.f108550a.f108539g = arrayList;
                this.f108550a.f108540h = arrayList2;
                this.f108550a.f108541i = null;
                this.f108550a.f108542j = null;
                kVar.b(arrayList, arrayList2);
            }
            return 0;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final int a(String[] strArr, String[] strArr2) {
            h.f.b.l.d(strArr, "");
            com.ss.android.ugc.aweme.shortvideo.x.k kVar = this.f108550a.f108543k;
            if (kVar != null) {
                kVar.f();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int length = strArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    if (strArr2 == null || i2 >= strArr2.length) {
                        arrayList.add(strArr[i2]);
                        arrayList2.add("");
                    } else {
                        arrayList.add(strArr[i2]);
                        arrayList2.add(strArr2[i2]);
                    }
                }
                this.f108550a.f108539g = arrayList;
                this.f108550a.f108540h = arrayList2;
                this.f108550a.f108541i = null;
                this.f108550a.f108542j = null;
                kVar.a(arrayList, arrayList2);
            }
            return 0;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void b(com.bytedance.android.livesdkapi.depend.model.a aVar, String str) {
            h.f.b.l.d(aVar, "");
            h.f.b.l.d(str, "");
            IRecordingOperationPanel iRecordingOperationPanel = this.f108550a.f108533a;
            if (iRecordingOperationPanel != null) {
                iRecordingOperationPanel.onStickerChosen(ak.a(aVar), str);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final void a(int i2, PrivacyCert privacyCert) {
            IRecordingOperationPanel iRecordingOperationPanel = this.f108550a.f108533a;
            if (!(iRecordingOperationPanel == null || iRecordingOperationPanel.getCameraPos() == i2)) {
                iRecordingOperationPanel.setCameraPos(i2, privacyCert);
            }
            b.i.a(100).a(new c(this), b.i.f4826c, null);
            b.i.a(100).a(new d(this), b.i.f4826c, null);
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final int a(String str, String str2, float f2) {
            com.ss.android.ugc.aweme.shortvideo.x.k kVar;
            if (!hl.a(str) || !hl.a(str2) || (kVar = this.f108550a.f108543k) == null) {
                return 0;
            }
            kVar.a(str, str2, f2);
            return 0;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e
        public final int a(String str, String str2, int[] iArr) {
            int[] iArr2;
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(iArr, "");
            com.ss.android.ugc.aweme.shortvideo.x.k kVar = this.f108550a.f108543k;
            if (kVar != null) {
                iArr2 = kVar.a(str, str2);
            } else {
                iArr2 = null;
            }
            if (iArr2 == null || iArr2.length != 2) {
                iArr[0] = 0;
            } else {
                iArr[0] = iArr2[1];
            }
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ TTLiveBroadcastView this$0;

        static {
            Covode.recordClassIndex(69577);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(TTLiveBroadcastView tTLiveBroadcastView) {
            super(0);
            this.this$0 = tTLiveBroadcastView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            TTLiveBroadcastView tTLiveBroadcastView = this.this$0;
            tTLiveBroadcastView.a(tTLiveBroadcastView.f108536d, this.this$0.f108537e);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ TTLiveBroadcastView this$0;

        static {
            Covode.recordClassIndex(69578);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(TTLiveBroadcastView tTLiveBroadcastView) {
            super(0);
            this.this$0 = tTLiveBroadcastView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            TTLiveBroadcastView tTLiveBroadcastView = this.this$0;
            tTLiveBroadcastView.a(tTLiveBroadcastView.f108538f);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ TTLiveBroadcastView this$0;

        static {
            Covode.recordClassIndex(69579);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(TTLiveBroadcastView tTLiveBroadcastView) {
            super(0);
            this.this$0 = tTLiveBroadcastView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.aweme.shortvideo.x.k kVar = this.this$0.f108543k;
            if (kVar != null) {
                kVar.c(0.0f, 0.0f);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ TTLiveBroadcastView this$0;

        static {
            Covode.recordClassIndex(69580);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(TTLiveBroadcastView tTLiveBroadcastView) {
            super(0);
            this.this$0 = tTLiveBroadcastView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (this.this$0.f108544l != -1) {
                TTLiveBroadcastView tTLiveBroadcastView = this.this$0;
                tTLiveBroadcastView.b(tTLiveBroadcastView.f108544l);
            }
            return z.f158842a;
        }
    }

    public final void c() {
        if (LiveNewEffectPanelSetting.INSTANCE.useOldPanel() && this.f108543k != null) {
            this.p = false;
            com.bytedance.android.live.u.h.a(new i(this));
            com.bytedance.android.live.u.h.a(new j(this));
            com.bytedance.android.live.u.h.a(new k(this));
        }
        com.bytedance.android.live.u.h.a(new l(this));
    }

    public final void d() {
        String str;
        com.ss.android.ugc.aweme.shortvideo.x.k kVar;
        List<String> list;
        com.ss.android.ugc.aweme.shortvideo.x.k kVar2;
        List<String> list2 = this.f108539g;
        if (!(list2 == null || !(!list2.isEmpty()) || (list = this.f108540h) == null || (kVar2 = this.f108543k) == null)) {
            kVar2.a(this.f108539g, list);
        }
        String str2 = this.f108541i;
        if (str2 != null && (str = this.f108542j) != null && (kVar = this.f108543k) != null) {
            kVar.b(str2, str);
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        int i2;
        com.bytedance.android.livesdkapi.depend.model.a.f fVar = this.f108535c;
        if (fVar != null) {
            fVar.a((com.bytedance.android.livesdkapi.depend.model.a.e) null);
        }
        this.f108543k = null;
        EventBus.a().b(this);
        IRecordingOperationPanel iRecordingOperationPanel = this.f108533a;
        if (iRecordingOperationPanel != null) {
            i2 = iRecordingOperationPanel.getCameraPos();
        } else {
            i2 = 1;
        }
        AVExternalServiceImpl.a().configService().avsettingsConfig().setDefaultFilterForCamera(i2, this.x);
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        if (this.f108545m && this.n) {
            b.i.a(500).a(new g(this), b.i.f4826c, null);
            b.i.a(500).a(new h(this), b.i.f4826c, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.sdk.chatroom.ui.a
    public final void b() {
        com.ss.android.ugc.aweme.shortvideo.x.k kVar;
        float f2;
        if (this.f108545m) {
            this.f108545m = false;
            com.bytedance.android.livesdkapi.depend.model.a.f fVar = this.f108535c;
            if (fVar != null) {
                fVar.E();
            }
            b bVar = this.u;
            if (bVar != null) {
                bVar.f108562a = 2;
                bVar.a();
            }
            SimpleDraweeView simpleDraweeView = this.t;
            if (simpleDraweeView != null) {
                simpleDraweeView.setVisibility(8);
            }
            com.ss.android.ugc.aweme.shortvideo.x.i iVar = this.w;
            if (iVar != null) {
                iVar.a();
            }
            com.ss.android.ugc.aweme.shortvideo.x.k kVar2 = this.f108543k;
            if (kVar2 != null) {
                kVar2.a(this.x);
            }
            if (LiveNewEffectPanelSetting.INSTANCE.useOldPanel() && (kVar = this.f108543k) != null) {
                kVar.b(kVar.c(), kVar.d());
                float e2 = kVar.e();
                if (this.x == 0) {
                    f2 = 0.35f;
                } else {
                    f2 = 0.0f;
                }
                kVar.a(e2, f2);
                kVar.c(kVar.a(), kVar.b());
            }
        }
    }

    private final void e() {
        com.bytedance.android.livesdkapi.depend.model.a.f fVar = this.f108535c;
        if (fVar != null) {
            List<Pair<String, String>> B2 = fVar.B();
            if (!B2.isEmpty() && B2.size() != this.q.size()) {
                this.q.clear();
                List<FilterBean> list = this.q;
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                while (i2 < B2.size()) {
                    String str = (String) B2.get(i2).second;
                    FilterBean filterBean = new FilterBean();
                    i2++;
                    filterBean.setId(i2);
                    filterBean.setName((String) B2.get(i2).first);
                    filterBean.setFilterFilePath(com.ss.android.ugc.aweme.live.f.a.a(str));
                    AVExternalServiceImpl.a().filterService().setFilterFolder(filterBean, str);
                    filterBean.setThumbnailFilePath(str + "/thumbnail.jpg");
                    arrayList.add(filterBean);
                }
                h.f.b.l.b(arrayList, "");
                list.addAll(arrayList);
            }
        }
    }

    public static final class b implements com.ss.android.ugc.aweme.shortvideo.x.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TTLiveBroadcastView f108546a;

        static {
            Covode.recordClassIndex(69563);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(TTLiveBroadcastView tTLiveBroadcastView) {
            this.f108546a = tTLiveBroadcastView;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.x.h
        public final void a(int i2) {
            e.a aVar;
            if (!this.f108546a.p && (aVar = this.f108546a.r) != null) {
                aVar.a(i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TTLiveBroadcastView f108558a;

        static {
            Covode.recordClassIndex(69575);
        }

        g(TTLiveBroadcastView tTLiveBroadcastView) {
            this.f108558a = tTLiveBroadcastView;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            h.f.b.l.d(iVar, "");
            this.f108558a.d();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TTLiveBroadcastView f108559a;

        static {
            Covode.recordClassIndex(69576);
        }

        h(TTLiveBroadcastView tTLiveBroadcastView) {
            this.f108559a = tTLiveBroadcastView;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            h.f.b.l.d(iVar, "");
            this.f108559a.c();
            return z.f158842a;
        }
    }

    static final class m<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TTLiveBroadcastView f108560a;

        static {
            Covode.recordClassIndex(69581);
        }

        m(TTLiveBroadcastView tTLiveBroadcastView) {
            this.f108560a = tTLiveBroadcastView;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            h.f.b.l.d(iVar, "");
            this.f108560a.d();
            return z.f158842a;
        }
    }

    static final class n<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TTLiveBroadcastView f108561a;

        static {
            Covode.recordClassIndex(69582);
        }

        n(TTLiveBroadcastView tTLiveBroadcastView) {
            this.f108561a = tTLiveBroadcastView;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            h.f.b.l.d(iVar, "");
            this.f108561a.c();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.sdk.chatroom.ui.a
    public final void a(g.a aVar) {
        h.f.b.l.d(aVar, "");
        b bVar = this.u;
        if (bVar != null) {
            bVar.f108566e = aVar;
        }
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TTLiveBroadcastView f108547a;

        static {
            Covode.recordClassIndex(69564);
        }

        c(TTLiveBroadcastView tTLiveBroadcastView) {
            this.f108547a = tTLiveBroadcastView;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Float f2 = (Float) obj;
            com.bytedance.android.livesdkapi.depend.model.a.f fVar = this.f108547a.f108535c;
            if (fVar != null) {
                h.f.b.l.b(f2, "");
                fVar.a(f2.floatValue());
            }
        }
    }

    public final void a(int i2) {
        if (!this.f108545m) {
            this.x = i2;
        } else if (this.n && i2 != -1 && this.f108544l != i2) {
            b(i2);
        }
    }

    @r
    public final void onCameraReverse(com.ss.android.ugc.aweme.story.live.a aVar) {
        com.bytedance.android.livesdkapi.depend.model.a.f fVar;
        boolean z2;
        h.f.b.l.d(aVar, "");
        if (this.f108545m && this.n && (fVar = this.f108535c) != null && fVar.C() != (z2 = aVar.f137975a)) {
            fVar.a(z2 ? 1 : 0);
        }
    }

    @r
    public final void onFilterChange(com.ss.android.ugc.aweme.live.model.a aVar) {
        h.f.b.l.d(aVar, "");
        FilterBean filterBean = aVar.f108521a;
        int i2 = aVar.f108522b;
        if (filterBean != null) {
            int size = this.q.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (h.f.b.l.a(filterBean, this.q.get(i3))) {
                    i2 = i3;
                }
            }
        }
        a(i2);
    }

    public final void a(float f2) {
        String str;
        float f3;
        String z2;
        com.ss.android.ugc.aweme.shortvideo.x.k kVar = this.f108543k;
        if (kVar != null) {
            com.bytedance.android.livesdkapi.depend.model.a.f fVar = this.f108535c;
            if (fVar == null || (z2 = fVar.z()) == null || z2.length() != 0) {
                com.bytedance.android.livesdkapi.depend.model.a.f fVar2 = this.f108535c;
                if (fVar2 != null) {
                    str = fVar2.z();
                } else {
                    str = null;
                }
                kVar.a(str, f2);
            } else {
                kVar.a(f2, 0.0f);
            }
            if (f2 > 0.0f) {
                f3 = 0.05f;
            } else {
                f3 = 0.01f;
            }
            kVar.a(f3);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.sdk.chatroom.ui.a
    public final void a(View... viewArr) {
        View[] viewArr2;
        h.f.b.l.d(viewArr, "");
        b bVar = this.u;
        if (!(bVar == null || (viewArr2 = (View[]) Arrays.copyOf(viewArr, viewArr.length)) == null)) {
            for (View view : viewArr2) {
                bVar.f108564c.add(view);
            }
        }
    }

    public final void b(int i2) {
        IAVFilterService filterService;
        String filterFolder;
        float f2;
        IAVFilterService filterService2;
        String filterFolder2;
        this.f108544l = i2;
        e();
        com.ss.android.ugc.aweme.shortvideo.x.i iVar = this.w;
        if (iVar != null) {
            iVar.a(this.q, i2);
        }
        com.bytedance.android.livesdkapi.depend.model.a.f fVar = this.f108535c;
        if (fVar != null) {
            fVar.b(this.f108544l);
        }
        if (this.q.size() > this.f108544l) {
            String str = "";
            if (LiveNewEffectPanelSetting.INSTANCE.useNewPanel()) {
                com.ss.android.ugc.aweme.shortvideo.x.k kVar = this.f108543k;
                if (kVar != null) {
                    IExternalService a2 = AVExternalServiceImpl.a();
                    if (!(a2 == null || (filterService2 = a2.filterService()) == null || (filterFolder2 = filterService2.getFilterFolder(this.q.get(this.f108544l))) == null)) {
                        str = filterFolder2;
                    }
                    com.bytedance.android.livesdkapi.depend.model.a.f fVar2 = this.f108535c;
                    if (fVar2 != null) {
                        f2 = fVar2.c(this.f108544l);
                    } else {
                        f2 = 0.0f;
                    }
                    kVar.b(str, f2);
                    return;
                }
                return;
            }
            com.ss.android.ugc.aweme.shortvideo.x.k kVar2 = this.f108543k;
            if (kVar2 != null) {
                IExternalService a3 = AVExternalServiceImpl.a();
                if (!(a3 == null || (filterService = a3.filterService()) == null || (filterFolder = filterService.getFilterFolder(this.q.get(this.f108544l))) == null)) {
                    str = filterFolder;
                }
                kVar2.a(str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.sdk.chatroom.ui.a
    public final void a(Bundle bundle) {
        boolean z2;
        com.ss.android.ugc.aweme.shortvideo.x.i iVar;
        com.ss.android.ugc.aweme.shortvideo.x.k kVar;
        int i2;
        SimpleDraweeView simpleDraweeView;
        LiveData<Float> zoomEvent;
        androidx.fragment.app.i fragmentManager;
        androidx.fragment.app.n b2;
        h.f.b.l.d(bundle, "");
        if (!this.f108545m) {
            this.f108545m = true;
            try {
                String string = bundle.getString("sourceParams");
                if (string != null) {
                    JSONObject jSONObject = new JSONObject(string);
                    bundle.putString("request_from", jSONObject.optString("request_from"));
                    bundle.putString("hashtag_title", jSONObject.optString("hashtag_title"));
                    bundle.putLong("hashtag_id", jSONObject.optLong("hashtag_id"));
                }
            } catch (Exception unused) {
            }
            if (this.f108535c == null) {
                if (this.v == null) {
                    this.v = Live.getService().a(d.f108548a);
                }
                com.bytedance.android.livesdkapi.depend.model.a.f fVar = this.v;
                this.f108535c = fVar;
                if (fVar != null) {
                    fVar.F().setArguments(bundle);
                    fVar.a(this.D);
                    d dVar = new d();
                    Fragment F = fVar.F();
                    h.f.b.l.b(F, "");
                    h.f.b.l.d(F, "");
                    dVar.f108570a = F;
                    IRecordingOperationPanel iRecordingOperationPanel = this.f108533a;
                    if (!(iRecordingOperationPanel == null || (fragmentManager = iRecordingOperationPanel.fragmentManager()) == null || (b2 = fragmentManager.a().b(R.id.cc2, dVar)) == null)) {
                        b2.e();
                    }
                }
                IRecordingOperationPanel iRecordingOperationPanel2 = this.f108533a;
                if (iRecordingOperationPanel2 == null || (simpleDraweeView = iRecordingOperationPanel2.backgroundView()) == null) {
                    simpleDraweeView = null;
                } else {
                    simpleDraweeView.setVisibility(8);
                }
                this.t = simpleDraweeView;
                e();
                com.bytedance.android.livesdkapi.depend.model.a.f fVar2 = this.f108535c;
                if (fVar2 != null) {
                    Fragment F2 = fVar2.F();
                    IRecordingOperationPanel iRecordingOperationPanel3 = this.f108533a;
                    if (!(iRecordingOperationPanel3 == null || (zoomEvent = iRecordingOperationPanel3.getZoomEvent()) == null)) {
                        zoomEvent.observe(F2, new c(this));
                    }
                }
            }
            IRecordingOperationPanel iRecordingOperationPanel4 = this.f108533a;
            if (iRecordingOperationPanel4 == null || iRecordingOperationPanel4.getCameraPos() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            com.bytedance.android.livesdkapi.depend.model.a.f fVar3 = this.f108535c;
            if (fVar3 != null) {
                if (z2) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                fVar3.a(i2);
            }
            IRecordingOperationPanel iRecordingOperationPanel5 = this.f108533a;
            if (iRecordingOperationPanel5 != null) {
                iVar = iRecordingOperationPanel5.filterModule();
            } else {
                iVar = null;
            }
            this.w = iVar;
            if (LiveNewEffectPanelSetting.INSTANCE.useOldPanel() && (kVar = this.f108543k) != null) {
                this.A = kVar.c();
                this.y = kVar.d();
                this.z = kVar.e();
                this.B = kVar.a();
                this.C = kVar.b();
            }
            com.bytedance.android.livesdkapi.depend.model.a.f fVar4 = this.f108535c;
            if (fVar4 != null) {
                fVar4.D();
            }
            b bVar = this.u;
            if (bVar != null) {
                bVar.f108562a = 1;
                bVar.a();
            }
            b.i.a(100).a(new m(this), b.i.f4826c, null);
            b.i.a(100).a(new n(this), b.i.f4826c, null);
            SimpleDraweeView simpleDraweeView2 = this.t;
            if (simpleDraweeView2 != null) {
                simpleDraweeView2.setVisibility(0);
            }
        }
    }

    public final z a(float f2, float f3) {
        com.ss.android.ugc.aweme.shortvideo.x.k kVar;
        com.bytedance.android.livesdkapi.depend.model.a.f fVar = this.f108535c;
        if (fVar == null || (kVar = this.f108543k) == null) {
            return null;
        }
        String A2 = fVar.A();
        h.f.b.l.b(A2, "");
        if (A2.length() == 0) {
            kVar.b(f2, f3);
        } else {
            kVar.a(fVar.A(), f2, f3);
        }
        return z.f158842a;
    }

    public TTLiveBroadcastView(Context context, IRecordingOperationPanel iRecordingOperationPanel) {
        com.ss.android.ugc.aweme.shortvideo.x.k kVar;
        androidx.lifecycle.i lifecycle;
        h.f.b.l.d(context, "");
        MethodCollector.i(9915);
        this.f108533a = iRecordingOperationPanel;
        this.f108534b = new FrameLayout(context);
        Live.getService();
        EventBus.a(EventBus.a(), this);
        if (!(iRecordingOperationPanel == null || (lifecycle = iRecordingOperationPanel.getLifecycle()) == null)) {
            lifecycle.a(this);
        }
        this.f108534b.setVisibility(4);
        this.f108534b.setId(R.id.cc2);
        this.u = new b(this.f108534b);
        this.v = Live.getService().a(e.f108549a);
        if (iRecordingOperationPanel != null) {
            kVar = iRecordingOperationPanel.videoRecorder();
        } else {
            kVar = null;
        }
        this.f108543k = kVar;
        if (kVar != null) {
            kVar.a(new b(this), h.a.f133001a);
            MethodCollector.o(9915);
            return;
        }
        MethodCollector.o(9915);
    }

    static final class d implements com.bytedance.android.livesdkapi.j.a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f108548a = new d();

        static {
            Covode.recordClassIndex(69565);
        }

        d() {
        }

        @Override // com.bytedance.android.livesdkapi.j.a
        public final void a(Activity activity, com.bytedance.android.livesdkapi.depend.e.c cVar, com.bytedance.android.livesdkapi.depend.e.b bVar) {
            Dialog a2 = LiveHostOuterService.q().a(activity, cVar, bVar);
            if (a2 != null) {
                a2.show();
            }
        }
    }

    static final class e implements com.bytedance.android.livesdkapi.j.a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f108549a = new e();

        static {
            Covode.recordClassIndex(69566);
        }

        e() {
        }

        @Override // com.bytedance.android.livesdkapi.j.a
        public final void a(Activity activity, com.bytedance.android.livesdkapi.depend.e.c cVar, com.bytedance.android.livesdkapi.depend.e.b bVar) {
            Dialog a2 = LiveHostOuterService.q().a(activity, cVar, bVar);
            if (a2 != null) {
                a2.show();
            }
        }
    }
}
