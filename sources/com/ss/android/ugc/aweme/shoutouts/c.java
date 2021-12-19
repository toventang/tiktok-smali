package com.ss.android.ugc.aweme.shoutouts;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.sheet.a.a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.internal.IShoutOutApiService;
import com.ss.android.ugc.aweme.internal.ShoutOutServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService;
import com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivityShoutOut;
import com.ss.android.ugc.aweme.shortvideo.view.MentionEditText;
import com.ss.android.ugc.aweme.shoutouts.network.CheckWalletApi;
import com.ss.android.ugc.aweme.shoutouts.network.EditProductApi;
import com.ss.android.ugc.aweme.shoutouts.network.RealShoutoutOutApi;
import com.ss.android.ugc.aweme.shoutouts.network.ShoutoutOrderListApi;
import com.ss.android.ugc.aweme.shoutouts.network.a;
import com.ss.android.ugc.aweme.utils.bp;
import com.ss.android.ugc.aweme.view.b;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.ad;
import com.zhiliaoapp.musically.R;
import h.z;
import java.io.File;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;
import java.util.UUID;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class c extends com.ss.android.ugc.gamora.b.a {
    String A = "";
    public final Stack<String> B = new Stack<>();
    public final VideoPublishEditModel C;
    public final d D;

    /* renamed from: f  reason: collision with root package name */
    public View f133122f;

    /* renamed from: g  reason: collision with root package name */
    public View f133123g;

    /* renamed from: h  reason: collision with root package name */
    public View f133124h;

    /* renamed from: i  reason: collision with root package name */
    public TuxButton f133125i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f133126j;

    /* renamed from: k  reason: collision with root package name */
    public SimpleDraweeView f133127k;

    /* renamed from: l  reason: collision with root package name */
    public View f133128l;
    public TuxButton t;
    public TextView u;
    public View v;
    public d w;
    public MentionEditText x;
    public com.ss.android.ugc.aweme.view.b y;
    boolean z;

    static final class v implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final v f133159a = new v();

        static {
            Covode.recordClassIndex(87078);
        }

        v() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    static final class x implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final x f133161a = new x();

        static {
            Covode.recordClassIndex(87080);
        }

        x() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    static {
        Covode.recordClassIndex(87053);
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        b(false);
    }

    public final SimpleDraweeView E() {
        SimpleDraweeView simpleDraweeView = this.f133127k;
        if (simpleDraweeView == null) {
            h.f.b.l.a("coverView");
        }
        return simpleDraweeView;
    }

    public final TuxButton F() {
        TuxButton tuxButton = this.t;
        if (tuxButton == null) {
            h.f.b.l.a("postView");
        }
        return tuxButton;
    }

    public final d G() {
        d dVar = this.w;
        if (dVar == null) {
            h.f.b.l.a("shoutOutsData");
        }
        return dVar;
    }

    public final void I() {
        com.ss.android.ugc.aweme.view.b bVar;
        Activity t2 = t();
        h.f.b.l.b(t2, "");
        if (!t2.isFinishing() && (bVar = this.y) != null) {
            bVar.dismiss();
        }
    }

    public final void J() {
        H();
        b.i.b(new q(this), b.i.f4824a).a(new r(this), b.i.f4826c, null);
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f133129a = new a();

        static {
            Covode.recordClassIndex(87054);
        }

        a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            T t = ((CheckWalletApi.Api) com.ss.android.ugc.aweme.port.in.g.a().C().createRetrofit(com.ss.android.ugc.aweme.port.in.g.a().C().getApiHost(), true, CheckWalletApi.Api.class)).get().execute().f42630b;
            h.f.b.l.b(t, "");
            return t;
        }
    }

    /* access modifiers changed from: package-private */
    public final void K() {
        d dVar = this.w;
        if (dVar == null) {
            h.f.b.l.a("shoutOutsData");
        }
        g price = dVar.getPrice();
        if (price != null) {
            int coin = price.getCoin();
            TextView textView = this.u;
            if (textView == null) {
                h.f.b.l.a("coinsText");
            }
            textView.setText(String.valueOf(coin));
            View view = this.v;
            if (view == null) {
                h.f.b.l.a("coinsIcon");
            }
            view.setVisibility(0);
        }
    }

    public final void M() {
        if (this.x != null) {
            d dVar = this.w;
            if (dVar == null) {
                h.f.b.l.a("shoutOutsData");
            }
            MentionEditText mentionEditText = this.x;
            if (mentionEditText == null) {
                h.f.b.l.b();
            }
            dVar.setDesc(String.valueOf(mentionEditText.getText()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$c  reason: collision with other inner class name */
    static final class CallableC3450c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133132a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f133133b;

        static {
            Covode.recordClassIndex(87057);
        }

        CallableC3450c(c cVar, JSONObject jSONObject) {
            this.f133132a = cVar;
            this.f133133b = jSONObject;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String productId = this.f133132a.G().getProductId();
            if (productId == null) {
                h.f.b.l.b();
            }
            String jSONObject = this.f133133b.toString();
            h.f.b.l.b(jSONObject, "");
            h.f.b.l.d(productId, "");
            h.f.b.l.d(jSONObject, "");
            T t = ((EditProductApi.Api) com.ss.android.ugc.aweme.port.in.g.a().C().createRetrofit(com.ss.android.ugc.aweme.port.in.g.a().C().getApiHost(), true, EditProductApi.Api.class)).get(productId, jSONObject).execute().f42630b;
            h.f.b.l.b(t, "");
            return t;
        }
    }

    static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133135a;

        static {
            Covode.recordClassIndex(87059);
        }

        e(c cVar) {
            this.f133135a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            d G = this.f133135a.G();
            if (G == null) {
                h.f.b.l.b();
            }
            String productId = G.getProductId();
            if (productId == null) {
                h.f.b.l.b();
            }
            h.f.b.l.d(productId, "");
            T t = ((ShoutoutOrderListApi.Api) com.ss.android.ugc.aweme.port.in.g.a().C().createRetrofit(com.ss.android.ugc.aweme.port.in.g.a().C().getApiHost(), true, ShoutoutOrderListApi.Api.class)).get(6, productId, 1).execute().f42630b;
            h.f.b.l.b(t, "");
            return t;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133149a;

        static {
            Covode.recordClassIndex(87072);
        }

        q(c cVar) {
            this.f133149a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            d G = this.f133149a.G();
            if (G == null) {
                h.f.b.l.b();
            }
            String productId = G.getProductId();
            if (productId == null) {
                h.f.b.l.b();
            }
            h.f.b.l.d(productId, "");
            T t = ((RealShoutoutOutApi.Api) com.ss.android.ugc.aweme.port.in.g.a().C().createRetrofit(com.ss.android.ugc.aweme.port.in.g.a().C().getApiHost(), true, RealShoutoutOutApi.Api.class)).get().execute().f42630b;
            h.f.b.l.b(t, "");
            return t;
        }
    }

    static final class s implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133151a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f133152b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Pair f133153c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ VERecordData f133154d;

        static {
            Covode.recordClassIndex(87074);
        }

        s(c cVar, VideoPublishEditModel videoPublishEditModel, Pair pair, VERecordData vERecordData) {
            this.f133151a = cVar;
            this.f133152b = videoPublishEditModel;
            this.f133153c = pair;
            this.f133154d = vERecordData;
        }

        public final void run() {
            int i2 = (int) (this.f133152b.mVideoCoverStartTm * 1000.0f);
            if (this.f133152b.isUseTimeReverseEffect()) {
                int intValue = ((Number) this.f133153c.second).intValue();
                Object obj = this.f133153c.first;
                h.f.b.l.b(obj, "");
                i2 = (intValue - ((Number) obj).intValue()) - i2;
            }
            int width = this.f133151a.E().getWidth();
            VEUtils.getVideoThumb(this.f133154d, i2, width, (int) (((float) width) / ((((float) this.f133152b.videoWidth()) * 1.0f) / ((float) this.f133152b.videoHeight()))), false, new ad(this) {
                /* class com.ss.android.ugc.aweme.shoutouts.c.s.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ s f133155a;

                static {
                    Covode.recordClassIndex(87075);
                }

                {
                    this.f133155a = r1;
                }

                @Override // com.ss.android.vesdk.ad
                public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
                    MethodCollector.i(13555);
                    h.f.b.l.d(byteBuffer, "");
                    Activity activity = this.f133155a.f133151a.f42913m;
                    if (activity == null) {
                        MethodCollector.o(13555);
                        return false;
                    }
                    h.f.b.l.b(activity, "");
                    Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                    EffectTextModel effectTextModel = this.f133155a.f133152b.getCoverPublishModel().getEffectTextModel();
                    h.f.b.l.b(createBitmap, "");
                    Bitmap mergeCoverText = effectTextModel.mergeCoverText(createBitmap);
                    androidx.core.graphics.drawable.b a2 = androidx.core.graphics.drawable.d.a(activity.getResources(), mergeCoverText);
                    h.f.b.l.b(a2, "");
                    this.f133155a.f133151a.E().setImageDrawable(a2);
                    if (TextUtils.isEmpty(this.f133155a.f133152b.multiEditVideoRecordData.coverImagePath)) {
                        this.f133155a.f133152b.multiEditVideoRecordData.coverImagePath = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a();
                    }
                    String str = this.f133155a.f133152b.multiEditVideoRecordData.coverImagePath;
                    h.f.b.l.b(str, "");
                    com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a(mergeCoverText, str);
                    MethodCollector.o(13555);
                    return false;
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public final void H() {
        Activity t2 = t();
        h.f.b.l.b(t2, "");
        if (!t2.isFinishing()) {
            com.ss.android.ugc.aweme.view.b bVar = this.y;
            if (bVar != null) {
                bVar.cancel();
            }
            Activity t3 = t();
            h.f.b.l.b(t3, "");
            com.ss.android.ugc.aweme.view.b a2 = b.C3836b.a(t3, b.a.GONE, null);
            this.y = a2;
            if (a2 == null) {
                h.f.b.l.b();
            }
            a2.setMessage(t().getString(R.string.g4k));
            com.ss.android.ugc.aweme.view.b bVar2 = this.y;
            if (bVar2 == null) {
                h.f.b.l.b();
            }
            bVar2.show();
        }
    }

    public final void L() {
        VideoPublishEditModel videoPublishEditModel;
        if (this.x != null && (videoPublishEditModel = this.C) != null) {
            d dVar = videoPublishEditModel.mShoutOutsData;
            MentionEditText mentionEditText = this.x;
            if (mentionEditText == null) {
                h.f.b.l.b();
            }
            dVar.setDesc(String.valueOf(mentionEditText.getText()));
            d dVar2 = this.C.mShoutOutsData;
            d dVar3 = this.w;
            if (dVar3 == null) {
                h.f.b.l.a("shoutOutsData");
            }
            dVar2.setPrice(dVar3.getPrice());
            d dVar4 = this.C.mShoutOutsData;
            d dVar5 = this.w;
            if (dVar5 == null) {
                h.f.b.l.a("shoutOutsData");
            }
            dVar4.setBuyerMoneyDes(dVar5.getBuyerMoneyDes());
        }
    }

    public static final class g implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133137a;

        static {
            Covode.recordClassIndex(87061);
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(c cVar) {
            this.f133137a = cVar;
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            this.f133137a.F().setEnabled(true);
        }
    }

    public static final class h extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133138a;

        static {
            Covode.recordClassIndex(87062);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(c cVar) {
            this.f133138a = cVar;
        }

        static final class a extends h.f.b.m implements h.f.a.b<View, z> {
            final /* synthetic */ h this$0;

            static {
                Covode.recordClassIndex(87063);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h hVar) {
                super(1);
                this.this$0 = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(View view) {
                h.f.b.l.d(view, "");
                c cVar = this.this$0.f133138a;
                cVar.H();
                b.i.b(new e(cVar), b.i.f4824a).a(new f(cVar), b.i.f4826c, null);
                return z.f158842a;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.tux.sheet.a.a$e[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            com.bytedance.tux.sheet.a.a b2 = new a.b().a(new a.e().a(R.string.f160037dmt).b(1).a(new a(this))).b();
            Activity t = this.f133138a.t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            b2.show(((androidx.fragment.app.e) t).getSupportFragmentManager(), "shoutout");
        }
    }

    public static final class i extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133139a;

        static {
            Covode.recordClassIndex(87064);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(c cVar) {
            this.f133139a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            c cVar = this.f133139a;
            cVar.H();
            JSONObject jSONObject = new JSONObject();
            com.google.gson.f fVar = new com.google.gson.f();
            d dVar = cVar.w;
            if (dVar == null) {
                h.f.b.l.a("shoutOutsData");
            }
            jSONObject.put("price", new JSONObject(fVar.b(dVar.getPrice())));
            MentionEditText mentionEditText = cVar.x;
            if (mentionEditText == null) {
                h.f.b.l.b();
            }
            jSONObject.put("desc", String.valueOf(mentionEditText.getText()));
            b.i.b(new CallableC3450c(cVar, jSONObject), b.i.f4824a).a(new d(cVar), b.i.f4826c, null);
        }
    }

    public static final class j extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133140a;

        static {
            Covode.recordClassIndex(87065);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(c cVar) {
            this.f133140a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            Float f2;
            this.f133140a.M();
            this.f133140a.B.push("shoutouts_detail_page");
            IShoutOutApiService b2 = ShoutOutServiceImpl.b();
            Activity activity = this.f133140a.f42913m;
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            String desc = this.f133140a.G().getDesc();
            if (desc == null) {
                desc = "";
            }
            g price = this.f133140a.G().getPrice();
            if (price == null) {
                h.f.b.l.b();
            }
            Integer valueOf = Integer.valueOf(price.getCoin());
            a buyerMoneyDes = this.f133140a.G().getBuyerMoneyDes();
            String str = null;
            if (buyerMoneyDes != null) {
                f2 = Float.valueOf((float) buyerMoneyDes.getMoney());
            } else {
                f2 = null;
            }
            a buyerMoneyDes2 = this.f133140a.G().getBuyerMoneyDes();
            if (buyerMoneyDes2 != null) {
                str = buyerMoneyDes2.getCurrencyCharacter();
            }
            b2.a(activity, desc, valueOf, f2, str);
        }
    }

    public static final class k extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133141a;

        static {
            Covode.recordClassIndex(87066);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(c cVar) {
            this.f133141a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            Activity activity = this.f133141a.f42913m;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    public static final class l extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133142a;

        static {
            Covode.recordClassIndex(87067);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        l(c cVar) {
            this.f133142a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            this.f133142a.M();
            Intent intent = new Intent();
            intent.putExtra("shoot_way", d.shootWay);
            intent.putExtra("enter_from", "shoutouts_detail_page");
            intent.putExtra("creation_id", UUID.randomUUID().toString());
            intent.putExtra("shoutouts_mode", "3");
            intent.putExtra("translation_type", 3);
            intent.putExtra("shout_out_data", this.f133142a.G());
            VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(this.f133142a.t(), intent);
            Activity t = this.f133142a.t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity");
            ((ShoutOutsPublishActivity) t).g();
        }
    }

    public static final class m extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133143a;

        static {
            Covode.recordClassIndex(87068);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(c cVar) {
            this.f133143a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            c cVar = this.f133143a;
            cVar.H();
            b.i.b(a.f133129a, b.i.f4824a).a(new b(cVar), b.i.f4826c, null);
        }
    }

    public static final class n extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133144a;

        static {
            Covode.recordClassIndex(87069);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        n(c cVar) {
            this.f133144a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            Activity t = this.f133144a.t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity");
            ShoutOutsPublishActivity shoutOutsPublishActivity = (ShoutOutsPublishActivity) t;
            shoutOutsPublishActivity.h();
            shoutOutsPublishActivity.finish();
        }
    }

    public static final class t implements IEffectService.OnVideoCoverCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133156a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f133157b;

        static {
            Covode.recordClassIndex(87076);
        }

        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverFailed(int i2) {
            new com.bytedance.tux.g.b(this.f133156a.E()).e(R.string.doa).b();
        }

        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
            h.f.b.l.d(bitmap, "");
            if (this.f133156a.E() != null && this.f133156a.t() != null) {
                Bitmap mergeCoverText = this.f133157b.getCoverPublishModel().getEffectTextModel().mergeCoverText(bitmap);
                androidx.core.graphics.drawable.b a2 = androidx.core.graphics.drawable.d.a(this.f133156a.t().getResources(), mergeCoverText);
                h.f.b.l.b(a2, "");
                this.f133156a.E().setImageDrawable(a2);
                com.ss.android.ugc.aweme.shortvideo.u.a.a(mergeCoverText, this.f133157b.getVideoCoverPath());
            }
        }

        t(c cVar, VideoPublishEditModel videoPublishEditModel) {
            this.f133156a = cVar;
            this.f133157b = videoPublishEditModel;
        }
    }

    public static final class p extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133147a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f133148b;

        static {
            Covode.recordClassIndex(87071);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            this.f133147a.M();
            this.f133148b.mShoutOutsData = this.f133147a.G();
            this.f133147a.B.push("shoutouts_detail_page");
            Activity t = this.f133147a.t();
            h.f.b.l.b(t, "");
            VideoPublishEditModel videoPublishEditModel = this.f133148b;
            h.f.b.l.d(t, "");
            h.f.b.l.d(videoPublishEditModel, "");
            Intent intent = new Intent(t, VEVideoPublishPreviewActivityShoutOut.class);
            intent.putExtra("args", (Serializable) videoPublishEditModel);
            com.ss.android.ugc.tools.d.a.c.a(t, intent);
        }

        p(c cVar, VideoPublishEditModel videoPublishEditModel) {
            this.f133147a = cVar;
            this.f133148b = videoPublishEditModel;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133150a;

        static {
            Covode.recordClassIndex(87073);
        }

        r(c cVar) {
            this.f133150a = cVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            h.f.b.l.d(iVar, "");
            if (iVar.c() || iVar.b()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f133150a.t()).a(R.string.g21).a();
                this.f133150a.I();
                return z.f158842a;
            }
            this.f133150a.I();
            ShoutOutServiceImpl.b().a();
            Activity activity = this.f133150a.f42913m;
            if (activity == null) {
                return null;
            }
            activity.finish();
            return z.f158842a;
        }
    }

    private final void b(boolean z2) {
        String str;
        Integer num;
        if (z2 || !this.B.isEmpty()) {
            com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
            if (!this.B.isEmpty()) {
                String pop = this.B.pop();
                h.f.b.l.b(pop, "");
                str = pop;
            } else {
                str = "video_edit_page";
            }
            bVar.a("enter_from", str);
            bVar.a("shoot_entrance", d.shootWay);
            bVar.a("shoot_way", d.shootWay);
            d dVar = this.w;
            if (dVar == null) {
                h.f.b.l.a("shoutOutsData");
            }
            bVar.a("reviewed", dVar.getReviewed());
            d dVar2 = this.w;
            if (dVar2 == null) {
                h.f.b.l.a("shoutOutsData");
            }
            if (dVar2.getPrice() != null) {
                d dVar3 = this.w;
                if (dVar3 == null) {
                    h.f.b.l.a("shoutOutsData");
                }
                g price = dVar3.getPrice();
                if (price != null) {
                    num = Integer.valueOf(price.getCoin());
                } else {
                    num = null;
                }
                bVar.a("setting_price", num);
            }
            com.ss.android.ugc.aweme.common.r.a("enter_shoutouts_post_page", bVar.f149193a);
        }
    }

    static final class d<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133134a;

        static {
            Covode.recordClassIndex(87058);
        }

        d(c cVar) {
            this.f133134a = cVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            h.f.b.l.d(iVar, "");
            if (iVar.c() || iVar.b()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f133134a.t()).a(R.string.g21).a();
                this.f133134a.I();
            } else {
                this.f133134a.I();
                if (this.f133134a.f42913m != null) {
                    Activity activity = this.f133134a.f42913m;
                    if (activity == null) {
                        h.f.b.l.b();
                    }
                    h.f.b.l.b(activity, "");
                    if (!activity.isFinishing()) {
                        c cVar = this.f133134a;
                        if (cVar.f42913m != null) {
                            Activity activity2 = cVar.f42913m;
                            if (activity2 == null) {
                                h.f.b.l.b();
                            }
                            h.f.b.l.b(activity2, "");
                            if (!activity2.isFinishing()) {
                                Intent intent = new Intent(cVar.t(), ShoutOutsEditSuccessActivity.class);
                                MentionEditText mentionEditText = cVar.x;
                                if (mentionEditText == null) {
                                    h.f.b.l.b();
                                }
                                if (!TextUtils.isEmpty(String.valueOf(mentionEditText.getText())) || !TextUtils.isEmpty(cVar.A)) {
                                    MentionEditText mentionEditText2 = cVar.x;
                                    if (mentionEditText2 == null) {
                                        h.f.b.l.b();
                                    }
                                    if (h.f.b.l.a((Object) String.valueOf(mentionEditText2.getText()), (Object) cVar.A)) {
                                        intent.putExtra("shoutout_edit_price", true);
                                    }
                                } else {
                                    h.f.b.l.b(intent.putExtra("shoutout_edit_price", true), "");
                                }
                                d dVar = cVar.w;
                                if (dVar == null) {
                                    h.f.b.l.a("shoutOutsData");
                                }
                                if (TextUtils.isEmpty(dVar.getCoverUrl())) {
                                    intent.putExtra("shoutout_hide_button", true);
                                }
                                Activity t = cVar.t();
                                com.ss.android.ugc.tiktok.security.a.a.a(intent, t);
                                t.startActivity(intent);
                                cVar.t().finish();
                            }
                        }
                    }
                }
            }
            return z.f158842a;
        }
    }

    static final class f<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133136a;

        static {
            Covode.recordClassIndex(87060);
        }

        f(c cVar) {
            this.f133136a = cVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            h.f.b.l.d(iVar, "");
            if (iVar.c() || iVar.b()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f133136a.t()).a(R.string.g21).a();
                this.f133136a.I();
            } else {
                this.f133136a.I();
                if (((com.ss.android.ugc.aweme.shoutouts.network.b) iVar.d()).f133233a > 0) {
                    c cVar = this.f133136a;
                    if (cVar.f42913m != null) {
                        Activity activity = cVar.f42913m;
                        if (activity == null) {
                            h.f.b.l.b();
                        }
                        h.f.b.l.b(activity, "");
                        if (!activity.isFinishing()) {
                            a.C0731a aVar = new a.C0731a(cVar.f42913m);
                            a.C0731a b2 = aVar.a(R.string.dms).b(R.string.dmq).b(R.string.a9e, (DialogInterface.OnClickListener) x.f133161a, false);
                            b2.F = true;
                            b2.a(R.string.dmo, (DialogInterface.OnClickListener) new y(cVar), false);
                            aVar.a().c();
                        }
                    }
                }
                if (((com.ss.android.ugc.aweme.shoutouts.network.b) iVar.d()).f133233a == 0) {
                    c cVar2 = this.f133136a;
                    if (cVar2.f42913m != null) {
                        Activity activity2 = cVar2.f42913m;
                        if (activity2 == null) {
                            h.f.b.l.b();
                        }
                        h.f.b.l.b(activity2, "");
                        if (!activity2.isFinishing()) {
                            a.C0731a aVar2 = new a.C0731a(cVar2.f42913m);
                            a.C0731a b3 = aVar2.a(R.string.dmr).b(R.string.dmp).b(R.string.a9e, (DialogInterface.OnClickListener) v.f133159a, false);
                            b3.F = true;
                            b3.a(R.string.dmo, (DialogInterface.OnClickListener) new w(cVar2), false);
                            aVar2.a().c();
                        }
                    }
                }
            }
            return z.f158842a;
        }
    }

    public static final class o extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133145a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f133146b;

        static {
            Covode.recordClassIndex(87070);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (h.f.b.l.a((Object) d.MODE_EDIT, (Object) this.f133145a.G().getShoutOutsMode())) {
                c cVar = this.f133145a;
                if (cVar.f42913m != null) {
                    Activity activity = cVar.f42913m;
                    if (activity == null) {
                        h.f.b.l.b();
                    }
                    h.f.b.l.b(activity, "");
                    if (!activity.isFinishing()) {
                        a.C0731a aVar = new a.C0731a(cVar.f42913m);
                        a.C0731a a2 = aVar.a(R.string.co6);
                        String c_ = cVar.c_(R.string.co5);
                        h.f.b.l.b(c_, "");
                        String a3 = com.a.a(c_, Arrays.copyOf(new Object[]{AVExternalServiceImpl.a().shoutOutsService().getShoutOutSettingsModel().a()}, 1));
                        h.f.b.l.b(a3, "");
                        a2.f33402b = a3;
                        a2.a(R.string.c7, (DialogInterface.OnClickListener) new u(cVar), false);
                        aVar.a().c();
                        com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
                        bVar.a("enter_from", "shoutouts_post_page");
                        d dVar = cVar.w;
                        if (dVar == null) {
                            h.f.b.l.a("shoutOutsData");
                        }
                        bVar.a("reviewed", dVar.getReviewed());
                        com.ss.android.ugc.aweme.common.r.a("show_review_intro_pop_up", bVar.f149193a);
                        return;
                    }
                    return;
                }
                return;
            }
            d dVar2 = this.f133146b.mShoutOutsData;
            MentionEditText mentionEditText = this.f133145a.x;
            if (mentionEditText == null) {
                h.f.b.l.b();
            }
            dVar2.setDesc(String.valueOf(mentionEditText.getText()));
            this.f133146b.mShoutOutsData = this.f133145a.G();
            IShoutOutsService shoutOutsService = AVExternalServiceImpl.a().shoutOutsService();
            Activity t = this.f133145a.t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            shoutOutsService.publishShoutOuts((androidx.fragment.app.e) t, this.f133146b);
        }

        o(c cVar, VideoPublishEditModel videoPublishEditModel) {
            this.f133145a = cVar;
            this.f133146b = videoPublishEditModel;
        }
    }

    static final class b<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133130a;

        static {
            Covode.recordClassIndex(87055);
        }

        b(c cVar) {
            this.f133130a = cVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            String str;
            String str2;
            h.f.b.l.d(iVar, "");
            if (iVar.c() || iVar.b()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f133130a.t()).a(R.string.g21).a();
                this.f133130a.I();
            } else {
                this.f133130a.I();
                a.C3451a aVar = ((com.ss.android.ugc.aweme.shoutouts.network.a) iVar.d()).f133231a;
                if (aVar == null || aVar.f133232a == null) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.f133130a.t()).a(R.string.g21).a();
                }
                a.C3451a aVar2 = ((com.ss.android.ugc.aweme.shoutouts.network.a) iVar.d()).f133231a;
                if (aVar2 == null) {
                    h.f.b.l.b();
                }
                Boolean bool = aVar2.f133232a;
                if (bool == null) {
                    h.f.b.l.b();
                }
                if (bool.booleanValue()) {
                    StringBuilder sb = new StringBuilder();
                    i a2 = h.a();
                    if (!TextUtils.isEmpty(a2.f133181c)) {
                        str2 = a2.f133181c;
                        if (str2 == null) {
                            h.f.b.l.b();
                        }
                    } else {
                        str2 = "https://www.tiktok.com/web-inapp/income-wallet/tax-flow?business_type=shoutouts&__status_bar=true&hide_nav_bar=1&should_full_screen=1";
                    }
                    Uri build = Uri.parse("aweme://webview").buildUpon().appendQueryParameter("url", sb.append(str2).append("&reviewed=").append(String.valueOf(this.f133130a.G().getReviewed())).toString()).build();
                    IBulletService f2 = BulletService.f();
                    Activity t = this.f133130a.t();
                    h.f.b.l.b(t, "");
                    String uri = build.toString();
                    h.f.b.l.b(uri, "");
                    f2.a(t, uri);
                    this.f133130a.B.push("setting_currency_page");
                } else {
                    i a3 = h.a();
                    if (!TextUtils.isEmpty(a3.f133180b)) {
                        str = a3.f133180b;
                        if (str == null) {
                            h.f.b.l.b();
                        }
                    } else {
                        str = "https://www.tiktok.com/web-inapp/shoutouts/creator/set-price?__status_bar=true&hide_nav_bar=1&should_full_screen=1";
                    }
                    if (this.f133130a.G().getPrice() != null) {
                        StringBuilder append = new StringBuilder().append(str).append("&coin=");
                        g price = this.f133130a.G().getPrice();
                        if (price == null) {
                            h.f.b.l.b();
                        }
                        str = append.append(String.valueOf(price.getCoin())).append("&reviewed=").append(String.valueOf(this.f133130a.G().getReviewed())).toString();
                    }
                    Uri build2 = Uri.parse("aweme://webview").buildUpon().appendQueryParameter("url", str).build();
                    IBulletService f3 = BulletService.f();
                    Activity t2 = this.f133130a.t();
                    h.f.b.l.b(t2, "");
                    String uri2 = build2.toString();
                    h.f.b.l.b(uri2, "");
                    f3.a(t2, uri2);
                    this.f133130a.B.push("setting_price_page");
                }
                com.bytedance.scene.ktx.c.a(this.f133130a, new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.shoutouts.c.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f133131a;

                    static {
                        Covode.recordClassIndex(87056);
                    }

                    {
                        this.f133131a = r1;
                    }

                    public final void run() {
                        if (this.f133131a.f133130a.C == null && this.f133131a.f133130a.G().getPrice() != null) {
                            this.f133131a.f133130a.F().setEnabled(true);
                        }
                    }
                }, 100);
                this.f133130a.I();
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.f
    public final void a(Bundle bundle) {
        boolean z2;
        MentionEditText mentionEditText;
        super.a(bundle);
        View c2 = c(R.id.agq);
        h.f.b.l.b(c2, "");
        this.f133127k = (SimpleDraweeView) c2;
        View c3 = c(R.id.q9);
        h.f.b.l.b(c3, "");
        this.f133122f = c3;
        View c4 = c(R.id.cnk);
        h.f.b.l.b(c4, "");
        this.f133124h = c4;
        View c5 = c(R.id.title);
        h.f.b.l.b(c5, "");
        this.f133126j = (TextView) c5;
        View c6 = c(R.id.f4r);
        h.f.b.l.b(c6, "");
        this.t = (TuxButton) c6;
        this.x = (MentionEditText) c(R.id.arv);
        View c7 = c(R.id.a88);
        h.f.b.l.b(c7, "");
        this.u = (TextView) c7;
        View c8 = c(R.id.ddc);
        h.f.b.l.b(c8, "");
        TuxButton tuxButton = (TuxButton) c8;
        this.f133125i = tuxButton;
        if (tuxButton == null) {
            h.f.b.l.a("reEditView");
        }
        tuxButton.setButtonVariant(1);
        SimpleDraweeView simpleDraweeView = this.f133127k;
        if (simpleDraweeView == null) {
            h.f.b.l.a("coverView");
        }
        simpleDraweeView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        View c9 = c(R.id.a89);
        h.f.b.l.b(c9, "");
        this.f133123g = c9;
        View c10 = c(R.id.d8y);
        h.f.b.l.b(c10, "");
        this.f133128l = c10;
        View c11 = c(R.id.d9a);
        h.f.b.l.b(c11, "");
        this.v = c11;
        MentionEditText mentionEditText2 = this.x;
        if (mentionEditText2 != null) {
            mentionEditText2.setFilters(new j[]{new j(this.x)});
        }
        VideoPublishEditModel videoPublishEditModel = this.C;
        if (videoPublishEditModel == null) {
            d dVar = this.D;
            if (dVar == null) {
                h.f.b.l.b();
            }
            this.w = dVar;
            if (dVar == null) {
                h.f.b.l.a("shoutOutsData");
            }
            this.A = dVar.getDesc();
            TuxButton tuxButton2 = this.t;
            if (tuxButton2 == null) {
                h.f.b.l.a("postView");
            }
            tuxButton2.setEnabled(false);
            MentionEditText mentionEditText3 = this.x;
            if (mentionEditText3 == null) {
                h.f.b.l.b();
            }
            d dVar2 = this.w;
            if (dVar2 == null) {
                h.f.b.l.a("shoutOutsData");
            }
            mentionEditText3.setText(dVar2.getDesc());
            MentionEditText mentionEditText4 = this.x;
            if (mentionEditText4 == null) {
                h.f.b.l.b();
            }
            mentionEditText4.addTextChangedListener(new g(this));
            d dVar3 = this.w;
            if (dVar3 == null) {
                h.f.b.l.a("shoutOutsData");
            }
            if (!TextUtils.isEmpty(dVar3.getCoverUrl())) {
                SimpleDraweeView simpleDraweeView2 = this.f133127k;
                if (simpleDraweeView2 == null) {
                    h.f.b.l.a("coverView");
                }
                d dVar4 = this.w;
                if (dVar4 == null) {
                    h.f.b.l.a("shoutOutsData");
                }
                com.ss.android.ugc.tools.c.a.a(simpleDraweeView2, dVar4.getCoverUrl(), -1, -1);
            } else {
                View view = this.f133128l;
                if (view == null) {
                    h.f.b.l.a("previewLayout");
                }
                view.setVisibility(8);
                this.z = true;
            }
            TuxButton tuxButton3 = this.t;
            if (tuxButton3 == null) {
                h.f.b.l.a("postView");
            }
            tuxButton3.setText(R.string.dj9);
            View view2 = this.f133124h;
            if (view2 == null) {
                h.f.b.l.a("moreView");
            }
            view2.setOnClickListener(new h(this));
            TuxButton tuxButton4 = this.t;
            if (tuxButton4 == null) {
                h.f.b.l.a("postView");
            }
            tuxButton4.setOnClickListener(new i(this));
            View view3 = this.f133128l;
            if (view3 == null) {
                h.f.b.l.a("previewLayout");
            }
            view3.setOnClickListener(new j(this));
            View view4 = this.f133122f;
            if (view4 == null) {
                h.f.b.l.a("backView");
            }
            view4.setOnClickListener(new k(this));
            TuxButton tuxButton5 = this.f133125i;
            if (tuxButton5 == null) {
                h.f.b.l.a("reEditView");
            }
            tuxButton5.setOnClickListener(new l(this));
        } else {
            d dVar5 = videoPublishEditModel.mShoutOutsData;
            h.f.b.l.b(dVar5, "");
            this.w = dVar5;
            VideoPublishEditModel videoPublishEditModel2 = this.C;
            if (videoPublishEditModel2.isMvThemeVideoType()) {
                String str = videoPublishEditModel2.mvCreateVideoData.videoCoverImgPath;
                if (com.ss.android.ugc.aweme.video.e.b(str)) {
                    SimpleDraweeView simpleDraweeView3 = this.f133127k;
                    if (simpleDraweeView3 == null) {
                        h.f.b.l.a("coverView");
                    }
                    com.ss.android.ugc.tools.c.a.a(simpleDraweeView3, Uri.fromFile(new File(str)).toString(), -1, -1);
                }
            } else if (videoPublishEditModel2.isMultiVideoEdit()) {
                MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel2.getCurMultiEditVideoRecordData();
                h.f.b.l.b(curMultiEditVideoRecordData, "");
                VERecordData a2 = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.a(curMultiEditVideoRecordData);
                MultiEditVideoRecordData curMultiEditVideoRecordData2 = videoPublishEditModel2.getCurMultiEditVideoRecordData();
                h.f.b.l.b(curMultiEditVideoRecordData2, "");
                Pair<Integer, Integer> playInOutTime = curMultiEditVideoRecordData2.getPlayInOutTime();
                a2.a(((Number) playInOutTime.first).longValue() * 1000, ((Number) playInOutTime.second).longValue() * 1000);
                SimpleDraweeView simpleDraweeView4 = this.f133127k;
                if (simpleDraweeView4 == null) {
                    h.f.b.l.a("coverView");
                }
                simpleDraweeView4.post(new s(this, videoPublishEditModel2, playInOutTime, a2));
            } else {
                ArrayList arrayList = new ArrayList();
                if (videoPublishEditModel2.mEffectList != null) {
                    arrayList.addAll(videoPublishEditModel2.mEffectList);
                }
                if (videoPublishEditModel2.mTimeEffect != null) {
                    arrayList.add(videoPublishEditModel2.mTimeEffect);
                    EffectPointModel effectPointModel = videoPublishEditModel2.mTimeEffect;
                    h.f.b.l.b(effectPointModel, "");
                    if (h.f.b.l.a((Object) effectPointModel.getKey(), (Object) "1")) {
                        z2 = true;
                        com.ss.android.ugc.aweme.shortvideo.u.a.a(arrayList, es.a(videoPublishEditModel2, com.ss.android.ugc.aweme.port.in.c.C.r().d()).getFilterFolder(), videoPublishEditModel2.mSelectedFilterIntensity, (int) (videoPublishEditModel2.mVideoCoverStartTm * 1000.0f), z2, videoPublishEditModel2.getPreviewInfo(), videoPublishEditModel2.getVideoCoverPath(), new t(this, videoPublishEditModel2));
                    }
                }
                z2 = false;
                com.ss.android.ugc.aweme.shortvideo.u.a.a(arrayList, es.a(videoPublishEditModel2, com.ss.android.ugc.aweme.port.in.c.C.r().d()).getFilterFolder(), videoPublishEditModel2.mSelectedFilterIntensity, (int) (videoPublishEditModel2.mVideoCoverStartTm * 1000.0f), z2, videoPublishEditModel2.getPreviewInfo(), videoPublishEditModel2.getVideoCoverPath(), new t(this, videoPublishEditModel2));
            }
            d dVar6 = this.w;
            if (dVar6 == null) {
                h.f.b.l.a("shoutOutsData");
            }
            if (dVar6.getPrice() == null) {
                TuxButton tuxButton6 = this.t;
                if (tuxButton6 == null) {
                    h.f.b.l.a("postView");
                }
                tuxButton6.setEnabled(false);
            }
            d dVar7 = this.w;
            if (dVar7 == null) {
                h.f.b.l.a("shoutOutsData");
            }
            if (dVar7.getPrice() == null) {
                View view5 = this.f133128l;
                if (view5 == null) {
                    h.f.b.l.a("previewLayout");
                }
                view5.setVisibility(8);
            }
            View view6 = this.f133124h;
            if (view6 == null) {
                h.f.b.l.a("moreView");
            }
            view6.setVisibility(8);
            TuxButton tuxButton7 = this.f133125i;
            if (tuxButton7 == null) {
                h.f.b.l.a("reEditView");
            }
            tuxButton7.setVisibility(8);
            if (!TextUtils.isEmpty(videoPublishEditModel2.mShoutOutsData.getDesc()) && (mentionEditText = this.x) != null) {
                mentionEditText.setText(videoPublishEditModel2.mShoutOutsData.getDesc());
            }
            View view7 = this.f133122f;
            if (view7 == null) {
                h.f.b.l.a("backView");
            }
            view7.setOnClickListener(new n(this));
            TuxButton tuxButton8 = this.t;
            if (tuxButton8 == null) {
                h.f.b.l.a("postView");
            }
            tuxButton8.setOnClickListener(new o(this, videoPublishEditModel2));
            View view8 = this.f133128l;
            if (view8 == null) {
                h.f.b.l.a("previewLayout");
            }
            view8.setOnClickListener(new p(this, videoPublishEditModel2));
        }
        View view9 = this.f133123g;
        if (view9 == null) {
            h.f.b.l.a("coinsLayout");
        }
        view9.setOnClickListener(new m(this));
        d dVar8 = this.w;
        if (dVar8 == null) {
            h.f.b.l.a("shoutOutsData");
        }
        dVar8.getPrice();
        K();
        b(true);
    }

    static final class w implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133160a;

        static {
            Covode.recordClassIndex(87079);
        }

        w(c cVar) {
            this.f133160a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f133160a.J();
        }
    }

    static final class y implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133162a;

        static {
            Covode.recordClassIndex(87081);
        }

        y(c cVar) {
            this.f133162a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f133162a.J();
        }
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    public c(VideoPublishEditModel videoPublishEditModel, d dVar) {
        this.C = videoPublishEditModel;
        this.D = dVar;
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.ahd, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a2;
    }

    static final class u implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133158a;

        static {
            Covode.recordClassIndex(87077);
        }

        u(c cVar) {
            this.f133158a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            VideoPublishEditModel videoPublishEditModel = this.f133158a.C;
            if (videoPublishEditModel == null) {
                h.f.b.l.b();
            }
            d dVar = videoPublishEditModel.mShoutOutsData;
            MentionEditText mentionEditText = this.f133158a.x;
            if (mentionEditText == null) {
                h.f.b.l.b();
            }
            dVar.setDesc(String.valueOf(mentionEditText.getText()));
            IShoutOutsService shoutOutsService = AVExternalServiceImpl.a().shoutOutsService();
            Activity t = this.f133158a.t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            androidx.fragment.app.e eVar = (androidx.fragment.app.e) t;
            VideoPublishEditModel videoPublishEditModel2 = this.f133158a.C;
            if (videoPublishEditModel2 == null) {
                h.f.b.l.b();
            }
            shoutOutsService.publishShoutOuts(eVar, videoPublishEditModel2);
        }
    }
}
