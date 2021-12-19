package com.ss.android.ugc.aweme.badge;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.v;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.b.b;
import com.ss.android.ugc.aweme.sharer.ui.bar.ShareChannelBar;
import com.ss.android.ugc.aweme.sharer.ui.f;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.widgetcompat.RemoteImageView;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.c.b.a.k;
import h.f.b.l;
import h.f.b.m;
import h.r;
import h.z;
import java.util.List;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.ci;
import kotlinx.coroutines.i;
import kotlinx.coroutines.internal.o;

public final class b extends com.ss.android.ugc.aweme.sharer.ui.a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f67884d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Activity f67885a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.sharer.ui.e f67886b;

    /* renamed from: c  reason: collision with root package name */
    public final String f67887c;

    /* renamed from: e  reason: collision with root package name */
    private final String f67888e;

    /* renamed from: f  reason: collision with root package name */
    private final UrlModel f67889f;

    public static final class a {
        static {
            Covode.recordClassIndex(41792);
        }

        /* renamed from: com.ss.android.ugc.aweme.badge.b$a$a  reason: collision with other inner class name */
        public static final class C1533a implements f {
            static {
                Covode.recordClassIndex(41793);
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.b
            public final void a(com.ss.android.ugc.aweme.sharer.b bVar, boolean z, SharePackage sharePackage, Context context) {
                l.d(bVar, "");
                l.d(context, "");
            }

            C1533a() {
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.f
            public final void b(SharePackage sharePackage, Context context) {
                l.d(sharePackage, "");
                l.d(context, "");
                f.a.a(sharePackage, context);
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.f
            public final void a(SharePackage sharePackage, Context context) {
                l.d(sharePackage, "");
                l.d(context, "");
                f.a.b(sharePackage, context);
                ProfileBadgeServiceImpl.b().a();
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.f
            public final void a(h hVar, SharePackage sharePackage, Context context) {
                l.d(hVar, "");
                l.d(sharePackage, "");
                l.d(context, "");
                f.a.a(hVar, sharePackage, context);
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(41791);
    }

    public final void dismiss() {
        super.dismiss();
        f fVar = this.f67886b.f124660l;
        if (fVar != null) {
            fVar.a(this.f67886b.f124657i, this.f67885a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.badge.b$b  reason: collision with other inner class name */
    static final class View$OnClickListenerC1534b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f67890a;

        static {
            Covode.recordClassIndex(41794);
        }

        View$OnClickListenerC1534b(b bVar) {
            this.f67890a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f67890a.dismiss();
        }
    }

    static final class d extends m implements h.f.a.b<com.ss.android.ugc.aweme.sharer.b, Boolean> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(41797);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.sharer.b bVar) {
            com.ss.android.ugc.aweme.sharer.b bVar2 = bVar;
            l.d(bVar2, "");
            return Boolean.valueOf(!bVar2.b(this.this$0.f67885a));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        int label;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(41795);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new c(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                final Bitmap a2 = com.ss.android.ugc.aweme.tools.d.a(this.this$0.f67887c, this.this$0.f67885a.getResources().getDimensionPixelOffset(R.dimen.ro), this.this$0.f67885a.getResources().getDimensionPixelOffset(R.dimen.rn));
                ci ciVar = o.f159148a;
                AnonymousClass1 r1 = new h.f.a.m<am, h.c.d<? super z>, Object>(this, null) {
                    /* class com.ss.android.ugc.aweme.badge.b.c.AnonymousClass1 */
                    int label;
                    final /* synthetic */ c this$0;

                    static {
                        Covode.recordClassIndex(41796);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.c.b.a.a
                    public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                        l.d(dVar, "");
                        return 

                        public static final class e extends com.ss.android.ugc.aweme.sharer.ui.bar.e {

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ b f67891a;

                            static {
                                Covode.recordClassIndex(41798);
                            }

                            @Override // com.ss.android.ugc.aweme.sharer.ui.bar.e
                            public final void a(com.ss.android.ugc.aweme.sharer.b bVar) {
                                boolean z;
                                l.d(bVar, "");
                                if (!this.f67891a.f67886b.f124657i.a(bVar, this.f67891a.f67885a)) {
                                    z = bVar.a(this.f67891a.f67886b.f124657i.a(bVar), this.f67891a.f67885a);
                                } else {
                                    z = true;
                                }
                                f fVar = this.f67891a.f67886b.f124660l;
                                if (fVar != null) {
                                    fVar.a(bVar, z, this.f67891a.f67886b.f124657i, this.f67891a.f67885a);
                                }
                                if (!bVar.c()) {
                                    this.f67891a.dismiss();
                                }
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            e(b bVar, Context context, SharePackage sharePackage) {
                                super(context, sharePackage);
                                this.f67891a = bVar;
                            }
                        }

                        @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.h
                        public final void onCreate(Bundle bundle) {
                            List<com.ss.android.ugc.aweme.sharer.b> list;
                            super.onCreate(bundle);
                            setContentView(R.layout.x5);
                            MeasureLinearLayout measureLinearLayout = (MeasureLinearLayout) findViewById(R.id.e1o);
                            l.b(measureLinearLayout, "");
                            b.a.a(this, measureLinearLayout);
                            if (this.f67886b.f124652d) {
                                n.a((List) this.f67886b.f124649a, (h.f.a.b) new d(this));
                            }
                            boolean z = false;
                            if (this.f67886b.f124651c || (list = this.f67886b.f124649a) == null || list.isEmpty()) {
                                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.e1l);
                                l.b(linearLayout, "");
                                linearLayout.setVisibility(8);
                            } else {
                                ((ShareChannelBar) findViewById(R.id.e1p)).a(this.f67886b.f124649a);
                                ((ShareChannelBar) findViewById(R.id.e1p)).a(new e(this, this.f67885a, this.f67886b.f124657i));
                            }
                            ((ImageView) findViewById(R.id.a80)).setOnClickListener(new View$OnClickListenerC1534b(this));
                            String str = this.f67887c;
                            if (str == null || str.length() == 0) {
                                String str2 = this.f67888e;
                                if (str2 == null || str2.length() == 0) {
                                    z = true;
                                }
                                if (!z) {
                                    v a2 = com.bytedance.lighten.a.r.a(this.f67888e);
                                    a2.F = (ImageView) findViewById(R.id.c30);
                                    a2.c();
                                } else if (this.f67889f != null) {
                                    com.ss.android.ugc.tools.c.a.a((SimpleDraweeView) findViewById(R.id.c30), this.f67889f, -1, -1);
                                } else {
                                    RemoteImageView remoteImageView = (RemoteImageView) findViewById(R.id.c30);
                                    l.b(remoteImageView, "");
                                    remoteImageView.setVisibility(8);
                                }
                            } else {
                                bz unused = i.a(an.a(bf.f159041b), null, null, new c(this, null), 3);
                            }
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        private b(Activity activity, com.ss.android.ugc.aweme.sharer.ui.e eVar, UrlModel urlModel) {
                            super(activity, R.style.wk);
                            l.d(activity, "");
                            l.d(eVar, "");
                            this.f67885a = activity;
                            this.f67886b = eVar;
                            this.f67887c = null;
                            this.f67888e = null;
                            this.f67889f = urlModel;
                        }

                        public /* synthetic */ b(Activity activity, com.ss.android.ugc.aweme.sharer.ui.e eVar, UrlModel urlModel, byte b2) {
                            this(activity, eVar, urlModel);
                        }
                    }
