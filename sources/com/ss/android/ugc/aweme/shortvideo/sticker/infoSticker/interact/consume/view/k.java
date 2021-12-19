package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.CountDownStickerApi;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.f;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.ss.android.ugc.aweme.utils.fg;
import com.zhiliaoapp.musically.R;
import f.a.z;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public final class k extends com.google.android.material.bottomsheet.b {

    /* renamed from: h  reason: collision with root package name */
    public static final a f130543h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public CountDownStickerStruct f130544a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f130545b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f130546c;

    /* renamed from: d  reason: collision with root package name */
    public f.a.b.a f130547d;

    /* renamed from: e  reason: collision with root package name */
    public g f130548e;

    /* renamed from: f  reason: collision with root package name */
    String f130549f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f130550g;

    /* renamed from: i  reason: collision with root package name */
    private LinearLayout f130551i;

    /* renamed from: j  reason: collision with root package name */
    private ImageView f130552j;

    /* renamed from: k  reason: collision with root package name */
    private Button f130553k;

    /* renamed from: l  reason: collision with root package name */
    private Button f130554l;

    /* renamed from: m  reason: collision with root package name */
    private b f130555m = b.e.f130560a;
    private final CountDownStickerApi n;
    private String o;
    private String p;
    private SparseArray q;

    static {
        Covode.recordClassIndex(85599);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85600);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static k a(CountDownStickerStruct countDownStickerStruct, Aweme aweme, com.ss.android.ugc.aweme.sticker.j jVar) {
            String str;
            String str2;
            com.ss.android.ugc.aweme.sticker.i iVar;
            com.ss.android.ugc.aweme.sticker.i iVar2;
            com.ss.android.ugc.aweme.sticker.i iVar3;
            String str3 = null;
            if (countDownStickerStruct == null) {
                return null;
            }
            k kVar = new k();
            Bundle bundle = new Bundle();
            bundle.putSerializable("countdown_sticker_data", countDownStickerStruct);
            bundle.putSerializable("countdown_sticker_aweme", aweme);
            if (jVar == null || (iVar3 = jVar.r) == null) {
                str = null;
            } else {
                str = iVar3.f134903c;
            }
            bundle.putString("group_id", str);
            if (jVar == null || (iVar2 = jVar.r) == null) {
                str2 = null;
            } else {
                str2 = iVar2.f134902b;
            }
            bundle.putString("author_id", str2);
            if (!(jVar == null || (iVar = jVar.r) == null)) {
                str3 = iVar.f134901a;
            }
            bundle.putString("enter_from", str3);
            kVar.setArguments(bundle);
            return kVar;
        }
    }

    public static abstract class b {
        static {
            Covode.recordClassIndex(85601);
        }

        private b() {
        }

        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f130556a = new a();

            private a() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(85602);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$b$b  reason: collision with other inner class name */
        public static final class C3408b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C3408b f130557a = new C3408b();

            private C3408b() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(85603);
            }
        }

        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f130558a = new c();

            private c() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(85604);
            }
        }

        public static final class d extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final d f130559a = new d();

            private d() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(85605);
            }
        }

        public static final class e extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final e f130560a = new e();

            private e() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(85606);
            }
        }

        public static final class f extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final f f130561a = new f();

            private f() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(85607);
            }
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static final class l implements z<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f130576a;

        static {
            Covode.recordClassIndex(85617);
        }

        @Override // f.a.z
        public final void onComplete() {
            g gVar = this.f130576a.f130548e;
            if (gVar != null) {
                gVar.dismiss();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        l(k kVar) {
            this.f130576a = kVar;
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            h.f.b.l.d(th, "");
            if (th instanceof com.bytedance.frameworks.baselib.network.http.b.d) {
                new com.bytedance.tux.g.b(this.f130576a).e(R.string.de2).b();
            }
            g gVar = this.f130576a.f130548e;
            if (gVar != null) {
                gVar.dismiss();
            }
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            h.f.b.l.d(bVar, "");
            f.a.b.a a2 = this.f130576a.a();
            if (a2 != null) {
                a2.a(bVar);
            }
            k kVar = this.f130576a;
            Context context = kVar.getContext();
            if (context == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(context, "");
            h.f.b.l.d(context, "");
            kVar.f130548e = g.b.a(context, new g(context));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b bVar) {
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            g gVar = this.f130576a.f130548e;
            if (gVar != null) {
                gVar.dismiss();
            }
            if (bVar2.f130342a) {
                this.f130576a.a((b) b.c.f130558a, false);
                new com.bytedance.tux.g.b(this.f130576a).a(this.f130576a.getResources().getString(R.string.avi)).b();
                return;
            }
            this.f130576a.a((b) b.C3408b.f130557a, false);
            new com.bytedance.tux.g.b(this.f130576a).a(this.f130576a.getResources().getString(R.string.avh)).b();
        }
    }

    private final void g() {
        if (this.f130550g) {
            b();
        } else {
            d();
        }
    }

    public final f.a.b.a a() {
        if (this.f130547d == null) {
            this.f130547d = new f.a.b.a();
        }
        return this.f130547d;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.q;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        f.a.b.a a2 = a();
        if (a2 != null) {
            a2.dispose();
        }
        this.f130547d = null;
    }

    public k() {
        Object a2 = CountDownStickerApi.a.f130305a.a(Api.f66569d).a(CountDownStickerApi.class);
        h.f.b.l.b(a2, "");
        this.n = (CountDownStickerApi) a2;
    }

    private final void c() {
        String str;
        long j2;
        int i2;
        MethodCollector.i(3135);
        LinearLayout linearLayout = this.f130551i;
        if (linearLayout == null) {
            MethodCollector.o(3135);
            return;
        }
        linearLayout.removeViews(1, linearLayout.getChildCount() - 1);
        CountDownStickerStruct countDownStickerStruct = this.f130544a;
        Long l2 = null;
        if (countDownStickerStruct != null) {
            str = countDownStickerStruct.getTitle();
        } else {
            str = null;
        }
        linearLayout.addView(a(linearLayout, str, 22, 20.0f, R.color.bx));
        CountDownStickerStruct countDownStickerStruct2 = this.f130544a;
        if (countDownStickerStruct2 != null) {
            l2 = Long.valueOf(countDownStickerStruct2.getMillSecond());
        }
        linearLayout.addView(a(linearLayout, a(l2), 41, 12.0f, R.color.c4));
        CountDownStickerStruct countDownStickerStruct3 = this.f130544a;
        if (countDownStickerStruct3 != null) {
            j2 = countDownStickerStruct3.getSubscribeNum();
        } else {
            j2 = 0;
        }
        String a2 = com.ss.android.ugc.aweme.i18n.b.a(j2);
        Resources resources = linearLayout.getResources();
        CountDownStickerStruct countDownStickerStruct4 = this.f130544a;
        if (countDownStickerStruct4 != null) {
            i2 = (int) countDownStickerStruct4.getSubscribeNum();
        } else {
            i2 = 0;
        }
        String quantityString = resources.getQuantityString(R.plurals.aj, i2);
        h.f.b.l.b(quantityString, "");
        String a3 = com.a.a(quantityString, Arrays.copyOf(new Object[]{"<b>" + a2 + "</b>"}, 1));
        h.f.b.l.b(a3, "");
        a2.length();
        TuxTextView a4 = a(linearLayout, a3, 41, 32.0f, R.color.c4);
        this.f130546c = a4;
        linearLayout.addView(a4);
        String string = linearLayout.getResources().getString(R.string.avc);
        h.f.b.l.b(string, "");
        int c2 = androidx.core.content.b.c(linearLayout.getContext(), R.color.bx);
        Context context = linearLayout.getContext();
        if (context != null) {
            DmtButton a5 = a(linearLayout, string, c2, androidx.appcompat.a.a.a.b(context, R.drawable.qm));
            this.f130553k = a5;
            if (a5 != null) {
                a5.setOnClickListener(new g(this, linearLayout));
            }
            linearLayout.addView(this.f130553k);
            MethodCollector.o(3135);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.content.Context");
        MethodCollector.o(3135);
        throw nullPointerException;
    }

    private final void d() {
        String str;
        String str2;
        MethodCollector.i(3141);
        LinearLayout linearLayout = this.f130551i;
        if (linearLayout == null) {
            MethodCollector.o(3141);
            return;
        }
        linearLayout.removeViews(1, linearLayout.getChildCount() - 1);
        CountDownStickerStruct countDownStickerStruct = this.f130544a;
        Long l2 = null;
        if (countDownStickerStruct != null) {
            str = countDownStickerStruct.getTitle();
        } else {
            str = null;
        }
        linearLayout.addView(a(linearLayout, str, 22, 20.0f, R.color.bx));
        StringBuilder sb = new StringBuilder();
        CountDownStickerStruct countDownStickerStruct2 = this.f130544a;
        if (countDownStickerStruct2 != null) {
            str2 = countDownStickerStruct2.getTextAlreadyExpired();
        } else {
            str2 = null;
        }
        StringBuilder append = sb.append(str2).append("\n");
        CountDownStickerStruct countDownStickerStruct3 = this.f130544a;
        if (countDownStickerStruct3 != null) {
            l2 = Long.valueOf(countDownStickerStruct3.getMillSecond());
        }
        linearLayout.addView(a(linearLayout, append.append(a(l2)).toString(), 41, 12.0f, R.color.c4));
        String string = linearLayout.getResources().getString(R.string.avc);
        h.f.b.l.b(string, "");
        int c2 = androidx.core.content.b.c(linearLayout.getContext(), R.color.bx);
        Context context = linearLayout.getContext();
        if (context != null) {
            DmtButton a2 = a(linearLayout, string, c2, androidx.appcompat.a.a.a.b(context, R.drawable.qm));
            this.f130553k = a2;
            if (a2 != null) {
                a2.setOnClickListener(new c(this, linearLayout));
            }
            linearLayout.addView(this.f130553k);
            MethodCollector.o(3141);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.content.Context");
        MethodCollector.o(3141);
        throw nullPointerException;
    }

    private final void e() {
        String str;
        Long l2;
        MethodCollector.i(3158);
        LinearLayout linearLayout = this.f130551i;
        if (linearLayout == null) {
            MethodCollector.o(3158);
            return;
        }
        linearLayout.removeViews(1, linearLayout.getChildCount() - 1);
        CountDownStickerStruct countDownStickerStruct = this.f130544a;
        String str2 = null;
        if (countDownStickerStruct != null) {
            str = countDownStickerStruct.getTitle();
        } else {
            str = null;
        }
        linearLayout.addView(a(linearLayout, str, 22, 20.0f, R.color.bx));
        CountDownStickerStruct countDownStickerStruct2 = this.f130544a;
        if (countDownStickerStruct2 != null) {
            l2 = Long.valueOf(countDownStickerStruct2.getMillSecond());
        } else {
            l2 = null;
        }
        linearLayout.addView(a(linearLayout, a(l2), 41, 12.0f, R.color.c4));
        CountDownStickerStruct countDownStickerStruct3 = this.f130544a;
        if (countDownStickerStruct3 != null) {
            str2 = countDownStickerStruct3.getTextTobeSubscribed();
        }
        linearLayout.addView(a(linearLayout, str2, 41, 12.0f, R.color.c4));
        String string = linearLayout.getResources().getString(R.string.avz);
        h.f.b.l.b(string, "");
        int c2 = androidx.core.content.b.c(linearLayout.getContext(), R.color.a9);
        Context context = linearLayout.getContext();
        if (context != null) {
            DmtButton a2 = a(linearLayout, string, c2, androidx.appcompat.a.a.a.b(context, R.drawable.ql));
            this.f130554l = a2;
            if (a2 != null) {
                a2.setOnClickListener(new d(this, linearLayout));
            }
            linearLayout.addView(this.f130554l);
            MethodCollector.o(3158);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.content.Context");
        MethodCollector.o(3158);
        throw nullPointerException;
    }

    private final void f() {
        String str;
        Long l2;
        MethodCollector.i(3175);
        LinearLayout linearLayout = this.f130551i;
        if (linearLayout == null) {
            MethodCollector.o(3175);
            return;
        }
        linearLayout.removeViews(1, linearLayout.getChildCount() - 1);
        CountDownStickerStruct countDownStickerStruct = this.f130544a;
        String str2 = null;
        if (countDownStickerStruct != null) {
            str = countDownStickerStruct.getTitle();
        } else {
            str = null;
        }
        linearLayout.addView(a(linearLayout, str, 22, 20.0f, R.color.bx));
        CountDownStickerStruct countDownStickerStruct2 = this.f130544a;
        if (countDownStickerStruct2 != null) {
            l2 = Long.valueOf(countDownStickerStruct2.getMillSecond());
        } else {
            l2 = null;
        }
        linearLayout.addView(a(linearLayout, a(l2), 41, 12.0f, R.color.c4));
        CountDownStickerStruct countDownStickerStruct3 = this.f130544a;
        if (countDownStickerStruct3 != null) {
            str2 = countDownStickerStruct3.getTextAlreadySubscribed();
        }
        linearLayout.addView(a(linearLayout, str2, 41, 12.0f, R.color.c4));
        String string = linearLayout.getResources().getString(R.string.avj);
        h.f.b.l.b(string, "");
        int c2 = androidx.core.content.b.c(linearLayout.getContext(), R.color.c0);
        Context context = linearLayout.getContext();
        if (context != null) {
            DmtButton a2 = a(linearLayout, string, c2, androidx.appcompat.a.a.a.b(context, R.drawable.qm));
            this.f130554l = a2;
            if (a2 != null) {
                a2.setOnClickListener(new e(this, linearLayout));
            }
            linearLayout.addView(this.f130554l);
            MethodCollector.o(3175);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.content.Context");
        MethodCollector.o(3175);
        throw nullPointerException;
    }

    private final void b() {
        String str;
        String str2;
        long j2;
        int i2;
        MethodCollector.i(3120);
        LinearLayout linearLayout = this.f130551i;
        if (linearLayout == null) {
            MethodCollector.o(3120);
            return;
        }
        linearLayout.removeViews(1, linearLayout.getChildCount() - 1);
        CountDownStickerStruct countDownStickerStruct = this.f130544a;
        Long l2 = null;
        if (countDownStickerStruct != null) {
            str = countDownStickerStruct.getTitle();
        } else {
            str = null;
        }
        linearLayout.addView(a(linearLayout, str, 22, 20.0f, R.color.bx));
        StringBuilder sb = new StringBuilder();
        CountDownStickerStruct countDownStickerStruct2 = this.f130544a;
        if (countDownStickerStruct2 != null) {
            str2 = countDownStickerStruct2.getTextAlreadyExpired();
        } else {
            str2 = null;
        }
        StringBuilder append = sb.append(str2).append("\n");
        CountDownStickerStruct countDownStickerStruct3 = this.f130544a;
        if (countDownStickerStruct3 != null) {
            l2 = Long.valueOf(countDownStickerStruct3.getMillSecond());
        }
        linearLayout.addView(a(linearLayout, append.append(a(l2)).toString(), 41, 12.0f, R.color.c4));
        CountDownStickerStruct countDownStickerStruct4 = this.f130544a;
        if (countDownStickerStruct4 != null) {
            j2 = countDownStickerStruct4.getSubscribeNum();
        } else {
            j2 = 0;
        }
        String a2 = com.ss.android.ugc.aweme.i18n.b.a(j2);
        Resources resources = linearLayout.getResources();
        CountDownStickerStruct countDownStickerStruct5 = this.f130544a;
        if (countDownStickerStruct5 != null) {
            i2 = (int) countDownStickerStruct5.getSubscribeNum();
        } else {
            i2 = 0;
        }
        String quantityString = resources.getQuantityString(R.plurals.af, i2);
        h.f.b.l.b(quantityString, "");
        String a3 = com.a.a(quantityString, Arrays.copyOf(new Object[]{"<b>" + a2 + "</b>"}, 1));
        h.f.b.l.b(a3, "");
        a2.length();
        TuxTextView a4 = a(linearLayout, a3, 41, 32.0f, R.color.c4);
        this.f130546c = a4;
        linearLayout.addView(a4);
        String string = linearLayout.getResources().getString(R.string.avc);
        h.f.b.l.b(string, "");
        int c2 = androidx.core.content.b.c(linearLayout.getContext(), R.color.bx);
        Context context = linearLayout.getContext();
        if (context != null) {
            DmtButton a5 = a(linearLayout, string, c2, androidx.appcompat.a.a.a.b(context, R.drawable.qm));
            this.f130553k = a5;
            if (a5 != null) {
                a5.setOnClickListener(new f(this, linearLayout));
            }
            linearLayout.addView(this.f130553k);
            MethodCollector.o(3120);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.content.Context");
        MethodCollector.o(3120);
        throw nullPointerException;
    }

    public static final class j implements z<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f130574a;

        static {
            Covode.recordClassIndex(85615);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(k kVar) {
            this.f130574a = kVar;
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            h.f.b.l.d(th, "");
            if (th instanceof com.bytedance.frameworks.baselib.network.http.b.d) {
                new com.bytedance.tux.g.b(this.f130574a).e(R.string.de2).b();
            }
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            h.f.b.l.d(bVar, "");
            f.a.b.a a2 = this.f130574a.a();
            if (a2 != null) {
                a2.a(bVar);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a aVar) {
            int i2;
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            if (this.f130574a.isAdded()) {
                CountDownStickerStruct countDownStickerStruct = this.f130574a.f130544a;
                if (countDownStickerStruct != null) {
                    countDownStickerStruct.setSubscribeNum(aVar2.f130341a.getSubscribeNum());
                    countDownStickerStruct.setSubscribe(aVar2.f130341a.getSubscribe());
                }
                if (this.f130574a.f130550g) {
                    String a2 = com.ss.android.ugc.aweme.i18n.b.a(aVar2.f130341a.getSubscribeNum());
                    Resources resources = this.f130574a.getResources();
                    if (System.currentTimeMillis() > aVar2.f130341a.getMillSecond()) {
                        i2 = R.plurals.af;
                    } else {
                        i2 = R.plurals.aj;
                    }
                    String quantityString = resources.getQuantityString(i2, (int) aVar2.f130341a.getSubscribeNum());
                    h.f.b.l.b(quantityString, "");
                    String a3 = com.a.a(quantityString, Arrays.copyOf(new Object[]{"<b>" + a2 + "</b>"}, 1));
                    h.f.b.l.b(a3, "");
                    TextView textView = this.f130574a.f130546c;
                    if (textView != null) {
                        textView.setText(Html.fromHtml(a3));
                    }
                } else if (System.currentTimeMillis() > aVar2.f130341a.getMillSecond()) {
                    this.f130574a.a((b) b.a.f130556a, false);
                } else if (h.f.b.l.a((Object) aVar2.f130341a.getSubscribe(), (Object) true)) {
                    this.f130574a.a((b) b.c.f130558a, false);
                } else {
                    this.f130574a.a((b) b.C3408b.f130557a, false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f130562a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LinearLayout f130563b;

        static {
            Covode.recordClassIndex(85608);
        }

        c(k kVar, LinearLayout linearLayout) {
            this.f130562a = kVar;
            this.f130563b = linearLayout;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130562a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f130568a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LinearLayout f130569b;

        static {
            Covode.recordClassIndex(85611);
        }

        f(k kVar, LinearLayout linearLayout) {
            this.f130568a = kVar;
            this.f130569b = linearLayout;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130568a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f130570a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LinearLayout f130571b;

        static {
            Covode.recordClassIndex(85612);
        }

        g(k kVar, LinearLayout linearLayout) {
            this.f130570a = kVar;
            this.f130571b = linearLayout;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130570a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$k  reason: collision with other inner class name */
    static final class View$OnClickListenerC3409k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f130575a;

        static {
            Covode.recordClassIndex(85616);
        }

        View$OnClickListenerC3409k(k kVar) {
            this.f130575a = kVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130575a.dismiss();
        }
    }

    @Override // androidx.fragment.app.d
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.al.d(false, false));
    }

    private final String a(Long l2) {
        if (l2 == null) {
            return "";
        }
        String formatDateTime = DateUtils.formatDateTime(getContext(), l2.longValue(), 87);
        h.f.b.l.b(formatDateTime, "");
        return formatDateTime;
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f130566a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LinearLayout f130567b;

        static {
            Covode.recordClassIndex(85610);
        }

        e(k kVar, LinearLayout linearLayout) {
            this.f130566a = kVar;
            this.f130567b = linearLayout;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            k kVar = this.f130566a;
            Aweme aweme = kVar.f130545b;
            Long l2 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            CountDownStickerStruct countDownStickerStruct = this.f130566a.f130544a;
            if (countDownStickerStruct != null) {
                l2 = Long.valueOf(countDownStickerStruct.getMillSecond());
            }
            kVar.a(str, l2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f130564a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LinearLayout f130565b;

        static {
            Covode.recordClassIndex(85609);
        }

        d(k kVar, LinearLayout linearLayout) {
            this.f130564a = kVar;
            this.f130565b = linearLayout;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            k kVar = this.f130564a;
            if (!fg.a(kVar.getContext())) {
                a.C0731a aVar = new a.C0731a(kVar.getContext());
                aVar.a(R.string.fro);
                aVar.b(R.string.frr);
                aVar.a(R.string.flt, (DialogInterface.OnClickListener) new h(kVar), false);
                aVar.b(R.string.fls, (DialogInterface.OnClickListener) new i(kVar), false);
                aVar.a().c();
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                String str2 = kVar.f130549f;
                if (str2 == null) {
                    h.f.b.l.a("enterFrom");
                }
                r.a("push_pre_permission_show", dVar.a("enter_from", str2).a("enter_method", "live_cd_sticker").a("enter_reason", "general").f66730a);
                return;
            }
            k kVar2 = this.f130564a;
            Aweme aweme = kVar2.f130545b;
            Long l2 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            CountDownStickerStruct countDownStickerStruct = this.f130564a.f130544a;
            if (countDownStickerStruct != null) {
                l2 = Long.valueOf(countDownStickerStruct.getMillSecond());
            }
            kVar2.a(str, l2);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        Serializable serializable;
        String str5;
        b bVar;
        Serializable serializable2;
        super.onCreate(bundle);
        setStyle(0, R.style.z1);
        Boolean bool = null;
        if (this.f130545b == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                serializable2 = arguments.getSerializable("countdown_sticker_aweme");
            } else {
                serializable2 = null;
            }
            if (!(serializable2 instanceof Aweme)) {
                serializable2 = null;
            }
            this.f130545b = (Aweme) serializable2;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str = arguments2.getString("group_id")) == null) {
            str = "";
        }
        this.o = str;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str2 = arguments3.getString("author_id")) == null) {
            str2 = "";
        }
        this.p = str2;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str3 = arguments4.getString("enter_from")) == null) {
            str3 = "";
        }
        this.f130549f = str3;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        String curUserId = g2.getCurUserId();
        Aweme aweme = this.f130545b;
        if (aweme != null) {
            str4 = aweme.getAuthorUid();
        } else {
            str4 = null;
        }
        this.f130550g = TextUtils.equals(curUserId, str4);
        if (this.f130544a == null) {
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                serializable = arguments5.getSerializable("countdown_sticker_data");
            } else {
                serializable = null;
            }
            if (!(serializable instanceof CountDownStickerStruct)) {
                serializable = null;
            }
            this.f130544a = (CountDownStickerStruct) serializable;
            IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g3, "");
            String curUserId2 = g3.getCurUserId();
            Aweme aweme2 = this.f130545b;
            if (aweme2 != null) {
                str5 = aweme2.getAuthorUid();
            } else {
                str5 = null;
            }
            long j2 = 0;
            if (TextUtils.equals(curUserId2, str5)) {
                long currentTimeMillis = System.currentTimeMillis();
                CountDownStickerStruct countDownStickerStruct = this.f130544a;
                if (countDownStickerStruct != null) {
                    j2 = countDownStickerStruct.getMillSecond();
                }
                if (currentTimeMillis > j2) {
                    bVar = b.d.f130559a;
                } else {
                    bVar = b.e.f130560a;
                }
            } else {
                long currentTimeMillis2 = System.currentTimeMillis();
                CountDownStickerStruct countDownStickerStruct2 = this.f130544a;
                if (countDownStickerStruct2 != null) {
                    j2 = countDownStickerStruct2.getMillSecond();
                }
                if (currentTimeMillis2 > j2) {
                    bVar = b.a.f130556a;
                } else {
                    CountDownStickerStruct countDownStickerStruct3 = this.f130544a;
                    if (countDownStickerStruct3 != null) {
                        bool = countDownStickerStruct3.getSubscribe();
                    }
                    if (h.f.b.l.a((Object) bool, (Object) true)) {
                        bVar = b.c.f130558a;
                    } else {
                        bVar = b.C3408b.f130557a;
                    }
                }
            }
            this.f130555m = bVar;
        }
    }

    static final class i implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f130573a;

        static {
            Covode.recordClassIndex(85614);
        }

        i(k kVar) {
            this.f130573a = kVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            k kVar = this.f130573a;
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            String str = kVar.f130549f;
            if (str == null) {
                h.f.b.l.a("enterFrom");
            }
            r.a("push_pre_permission_deny", dVar.a("enter_from", str).a("enter_method", "live_cd_sticker").a("enter_reason", "general").f66730a);
        }
    }

    static final class h implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f130572a;

        static {
            Covode.recordClassIndex(85613);
        }

        h(k kVar) {
            this.f130572a = kVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            k kVar = this.f130572a;
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            String str = kVar.f130549f;
            if (str == null) {
                h.f.b.l.a("enterFrom");
            }
            r.a("push_pre_permission_auth", dVar.a("enter_from", str).a("enter_method", "live_cd_sticker").a("enter_reason", "general").f66730a);
            try {
                fg.c(this.f130572a.getContext());
            } catch (Exception unused) {
                Context context = this.f130572a.getContext();
                if (context != null) {
                    Intent intent = new Intent("android.settings.SETTINGS");
                    com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
                    context.startActivity(intent);
                }
            }
        }
    }

    @Override // androidx.fragment.app.d
    public final void showNow(androidx.fragment.app.i iVar, String str) {
        long j2;
        String aid;
        super.showNow(iVar, str);
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.al.d(true, false));
        long currentTimeMillis = System.currentTimeMillis();
        CountDownStickerStruct countDownStickerStruct = this.f130544a;
        if (countDownStickerStruct != null) {
            j2 = countDownStickerStruct.getMillSecond();
        } else {
            j2 = 0;
        }
        if (currentTimeMillis > j2) {
            a((b) b.f.f130561a, false);
        }
        Aweme aweme = this.f130545b;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            this.n.getDetail(aid).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new j(this));
        }
    }

    public final void a(b bVar, boolean z) {
        h.f.b.l.d(bVar, "");
        if (!h.f.b.l.a(this.f130555m, bVar) || z) {
            this.f130555m = bVar;
            if (h.f.b.l.a(bVar, b.a.f130556a)) {
                d();
            } else if (h.f.b.l.a(bVar, b.C3408b.f130557a)) {
                e();
            } else if (h.f.b.l.a(bVar, b.c.f130558a)) {
                f();
            } else if (h.f.b.l.a(bVar, b.d.f130559a)) {
                b();
            } else if (h.f.b.l.a(bVar, b.e.f130560a)) {
                c();
            } else if (h.f.b.l.a(bVar, b.f.f130561a)) {
                g();
            }
        }
    }

    public final void a(String str, Long l2) {
        long j2;
        int ordinal;
        if (!TextUtils.isEmpty(str)) {
            if (h.f.b.l.a(this.f130555m, b.C3408b.f130557a)) {
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                String str2 = this.o;
                if (str2 == null) {
                    h.f.b.l.a("groupId");
                }
                com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("group_id", str2);
                String str3 = this.p;
                if (str3 == null) {
                    h.f.b.l.a("authorId");
                }
                com.ss.android.ugc.aweme.app.f.d a3 = a2.a("author_id", str3);
                String str4 = this.f130549f;
                if (str4 == null) {
                    h.f.b.l.a("enterFrom");
                }
                r.a("livesdk_live_subscirbe", a3.a("enter_from", str4).a("countdown_time", f.a.a(this.f130544a)).a("enter_method", "live_cd_sticker").f66730a);
            } else if (h.f.b.l.a(this.f130555m, b.c.f130558a)) {
                com.ss.android.ugc.aweme.app.f.d dVar2 = new com.ss.android.ugc.aweme.app.f.d();
                String str5 = this.o;
                if (str5 == null) {
                    h.f.b.l.a("groupId");
                }
                com.ss.android.ugc.aweme.app.f.d a4 = dVar2.a("group_id", str5);
                String str6 = this.p;
                if (str6 == null) {
                    h.f.b.l.a("authorId");
                }
                com.ss.android.ugc.aweme.app.f.d a5 = a4.a("author_id", str6);
                String str7 = this.f130549f;
                if (str7 == null) {
                    h.f.b.l.a("enterFrom");
                }
                r.a("livesdk_live_unsubscirbe", a5.a("enter_from", str7).a("countdown_time", f.a.a(this.f130544a)).a("enter_method", "live_cd_sticker").f66730a);
            }
            CountDownStickerApi countDownStickerApi = this.n;
            if (str == null) {
                str = "";
            }
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = 0;
            }
            long j3 = j2 / 1000;
            if (h.f.b.l.a(this.f130555m, b.C3408b.f130557a)) {
                ordinal = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.a.Subscribe.ordinal();
            } else {
                ordinal = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.a.CancelSubscribe.ordinal();
            }
            countDownStickerApi.subscribe(str, j3, ordinal).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new l(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ImageView imageView;
        h.f.b.l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.a0u, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) a2;
        this.f130551i = linearLayout;
        if (linearLayout != null) {
            imageView = (ImageView) linearLayout.findViewById(R.id.a7h);
        } else {
            imageView = null;
        }
        this.f130552j = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View$OnClickListenerC3409k(this));
        }
        a(this.f130555m, true);
        return this.f130551i;
    }

    private static DmtButton a(LinearLayout linearLayout, String str, int i2, Drawable drawable) {
        DmtButton dmtButton = new DmtButton(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        dmtButton.setText(str);
        dmtButton.setTextColor(i2);
        dmtButton.setBackground(drawable);
        dmtButton.setTextSize(15.0f);
        if (Build.VERSION.SDK_INT >= 21) {
            dmtButton.setStateListAnimator(null);
        }
        Context context = linearLayout.getContext();
        if (context != null) {
            layoutParams.topMargin = (int) com.ss.android.ugc.tools.utils.r.a(context, 36.0f);
            layoutParams.bottomMargin = (int) com.ss.android.ugc.tools.utils.r.a(context, 46.0f);
            layoutParams.leftMargin = (int) com.ss.android.ugc.tools.utils.r.a(context, 16.0f);
            layoutParams.rightMargin = (int) com.ss.android.ugc.tools.utils.r.a(context, 16.0f);
            dmtButton.setLayoutParams(layoutParams);
        }
        return dmtButton;
    }

    private static TuxTextView a(LinearLayout linearLayout, String str, int i2, float f2, int i3) {
        Context context = linearLayout.getContext();
        h.f.b.l.b(context, "");
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        tuxTextView.setText(Html.fromHtml(str));
        Context context2 = linearLayout.getContext();
        h.f.b.l.b(context2, "");
        tuxTextView.setTextColor(context2.getResources().getColor(i3));
        tuxTextView.setTuxFont(i2);
        Context context3 = linearLayout.getContext();
        if (context3 != null) {
            layoutParams.topMargin = (int) com.ss.android.ugc.tools.utils.r.a(context3, f2);
            layoutParams.bottomMargin = (int) com.ss.android.ugc.tools.utils.r.a(context3, 0.0f);
            int i4 = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart((int) com.ss.android.ugc.tools.utils.r.a(context3, 24.0f));
            layoutParams.setMarginEnd((int) com.ss.android.ugc.tools.utils.r.a(context3, 24.0f));
            tuxTextView.setLayoutParams(layoutParams);
        }
        tuxTextView.setGravity(17);
        return tuxTextView;
    }
}
