package com.bytedance.ies.bullet.ui.common.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.a.f;
import androidx.l.a.a.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.f.a.b.t;
import com.bytedance.ies.bullet.ui.common.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a implements k.b {

    /* renamed from: e  reason: collision with root package name */
    public static final C0723a f33117e = new C0723a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public k.a f33118a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f33119b;

    /* renamed from: c  reason: collision with root package name */
    public Context f33120c;

    /* renamed from: d  reason: collision with root package name */
    public b f33121d;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.ies.bullet.service.f.a.b f33122f;

    public interface b {
        static {
            Covode.recordClassIndex(19786);
        }
    }

    static {
        Covode.recordClassIndex(19784);
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.view.a$a  reason: collision with other inner class name */
    public static final class C0723a {
        static {
            Covode.recordClassIndex(19785);
        }

        private C0723a() {
        }

        public /* synthetic */ C0723a(byte b2) {
            this();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f33123a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.bullet.service.f.a.b f33124b;

        static {
            Covode.recordClassIndex(19787);
        }

        c(a aVar, com.bytedance.ies.bullet.service.f.a.b bVar) {
            this.f33123a = aVar;
            this.f33124b = bVar;
        }

        public final void onClick(View view) {
            if (this.f33123a.f33121d != null) {
                l.a((Object) view, "");
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f33125a;

        static {
            Covode.recordClassIndex(19788);
        }

        d(a aVar) {
            this.f33125a = aVar;
        }

        public final void onClick(View view) {
            if (this.f33125a.f33121d != null) {
                l.a((Object) view, "");
            }
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f33126a;

        static {
            Covode.recordClassIndex(19789);
        }

        e(a aVar) {
            this.f33126a = aVar;
        }

        public final void onClick(View view) {
            if (this.f33126a.f33121d != null) {
                l.a((Object) view, "");
            }
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.k.b
    public final void a(View.OnClickListener onClickListener) {
        l.c(onClickListener, "");
        k.a aVar = this.f33118a;
        if (aVar == null) {
            l.a("bulletTitleBar");
        }
        ImageView backView = aVar.getBackView();
        if (backView != null) {
            backView.setOnClickListener(onClickListener);
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.k.b
    public final void b(View.OnClickListener onClickListener) {
        l.c(onClickListener, "");
        k.a aVar = this.f33118a;
        if (aVar == null) {
            l.a("bulletTitleBar");
        }
        ImageView closeAllView = aVar.getCloseAllView();
        if (closeAllView != null) {
            closeAllView.setOnClickListener(onClickListener);
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.k.b
    public final void a(CharSequence charSequence) {
        l.c(charSequence, "");
        k.a aVar = this.f33118a;
        if (aVar == null) {
            l.a("bulletTitleBar");
        }
        aVar.setDefaultTitle(charSequence);
    }

    @Override // com.bytedance.ies.bullet.ui.common.k.b
    public final View a(Context context, Uri uri, com.bytedance.ies.bullet.service.f.a.b bVar) {
        boolean z;
        i iVar;
        boolean z2;
        l.c(context, "");
        l.c(uri, "");
        if (this.f33119b) {
            k.a aVar = this.f33118a;
            if (aVar == null) {
                l.a("bulletTitleBar");
            }
            return aVar.getTitleBarRoot();
        }
        this.f33119b = true;
        this.f33122f = bVar;
        this.f33120c = context;
        this.f33118a = new d(context);
        if (bVar != null) {
            t b2 = bVar.f32688d.b();
            Drawable drawable = null;
            if (b2 != null) {
                if (b2.f32728a != -2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    b2 = null;
                }
                if (b2 != null) {
                    k.a aVar2 = this.f33118a;
                    if (aVar2 == null) {
                        l.a("bulletTitleBar");
                    }
                    aVar2.setTitleBarBackgroundColor(b2.f32728a);
                }
            }
            k.a aVar3 = this.f33118a;
            if (aVar3 == null) {
                l.a("bulletTitleBar");
            }
            TextView titleView = aVar3.getTitleView();
            if (titleView != null) {
                String b3 = bVar.f32691g.b();
                if (b3 == null) {
                    b3 = "";
                }
                titleView.setText(b3);
            }
            t b4 = bVar.f32692h.b();
            if (b4 != null) {
                if (b4.f32728a != -2) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    b4 = null;
                }
                if (b4 != null) {
                    k.a aVar4 = this.f33118a;
                    if (aVar4 == null) {
                        l.a("bulletTitleBar");
                    }
                    TextView titleView2 = aVar4.getTitleView();
                    if (titleView2 != null) {
                        titleView2.setTextColor(b4.f32728a);
                    }
                    k.a aVar5 = this.f33118a;
                    if (aVar5 == null) {
                        l.a("bulletTitleBar");
                    }
                    ImageView backView = aVar5.getBackView();
                    if (backView != null) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            try {
                                Context context2 = this.f33120c;
                                if (context2 == null) {
                                    l.a("context");
                                }
                                Resources resources = context2.getResources();
                                Context context3 = this.f33120c;
                                if (context3 == null) {
                                    l.a("context");
                                }
                                i a2 = i.a(resources, R.drawable.ajl, context3.getTheme());
                                if (a2 != null) {
                                    a2.setTint(b4.f32728a);
                                    iVar = a2;
                                } else {
                                    iVar = null;
                                }
                            } catch (Resources.NotFoundException unused) {
                                Context context4 = this.f33120c;
                                if (context4 == null) {
                                    l.a("context");
                                }
                                Resources resources2 = context4.getResources();
                                Context context5 = this.f33120c;
                                if (context5 == null) {
                                    l.a("context");
                                }
                                Drawable a3 = f.a(resources2, 2131232471, context5.getTheme());
                                if (a3 != null) {
                                    androidx.core.graphics.drawable.a.a(a3, b4.f32728a);
                                    iVar = a3;
                                }
                            }
                        } else {
                            Context context6 = this.f33120c;
                            if (context6 == null) {
                                l.a("context");
                            }
                            Resources resources3 = context6.getResources();
                            Context context7 = this.f33120c;
                            if (context7 == null) {
                                l.a("context");
                            }
                            Drawable a4 = f.a(resources3, 2131232471, context7.getTheme());
                            if (a4 != null) {
                                androidx.core.graphics.drawable.a.a(a4, b4.f32728a);
                                iVar = a4;
                            }
                            backView.setImageDrawable(drawable);
                        }
                        drawable = iVar;
                        backView.setImageDrawable(drawable);
                    }
                }
            }
            if (l.a((Object) bVar.s.b(), (Object) true)) {
                k.a aVar6 = this.f33118a;
                if (aVar6 == null) {
                    l.a("bulletTitleBar");
                }
                ImageView closeAllView = aVar6.getCloseAllView();
                if (closeAllView != null) {
                    closeAllView.setVisibility(0);
                }
            }
            l.c(bVar, "");
            com.bytedance.ies.bullet.service.f.a.b.k b5 = bVar.f32693i.b();
            int i2 = 8;
            if (b5 != null) {
                int i3 = b.f33127a[b5.ordinal()];
                if (i3 == 1) {
                    k.a aVar7 = this.f33118a;
                    if (aVar7 == null) {
                        l.a("bulletTitleBar");
                    }
                    ImageView shareView = aVar7.getShareView();
                    if (shareView != null) {
                        shareView.setVisibility(8);
                    }
                    k.a aVar8 = this.f33118a;
                    if (aVar8 == null) {
                        l.a("bulletTitleBar");
                    }
                    ImageView reportView = aVar8.getReportView();
                    if (reportView != null) {
                        reportView.setVisibility(8);
                    }
                } else if (i3 == 2) {
                    k.a aVar9 = this.f33118a;
                    if (aVar9 == null) {
                        l.a("bulletTitleBar");
                    }
                    ImageView shareView2 = aVar9.getShareView();
                    if (shareView2 != null) {
                        shareView2.setVisibility(8);
                    }
                    k.a aVar10 = this.f33118a;
                    if (aVar10 == null) {
                        l.a("bulletTitleBar");
                    }
                    ImageView reportView2 = aVar10.getReportView();
                    if (reportView2 != null) {
                        reportView2.setVisibility(0);
                    }
                    k.a aVar11 = this.f33118a;
                    if (aVar11 == null) {
                        l.a("bulletTitleBar");
                    }
                    ImageView reportView3 = aVar11.getReportView();
                    if (reportView3 != null) {
                        reportView3.setOnClickListener(new d(this));
                    }
                } else if (i3 == 3) {
                    k.a aVar12 = this.f33118a;
                    if (aVar12 == null) {
                        l.a("bulletTitleBar");
                    }
                    ImageView reportView4 = aVar12.getReportView();
                    if (reportView4 != null) {
                        reportView4.setVisibility(8);
                    }
                    k.a aVar13 = this.f33118a;
                    if (aVar13 == null) {
                        l.a("bulletTitleBar");
                    }
                    ImageView shareView3 = aVar13.getShareView();
                    if (shareView3 != null) {
                        shareView3.setVisibility(0);
                    }
                    k.a aVar14 = this.f33118a;
                    if (aVar14 == null) {
                        l.a("bulletTitleBar");
                    }
                    ImageView shareView4 = aVar14.getShareView();
                    if (shareView4 != null) {
                        shareView4.setOnClickListener(new e(this));
                    }
                }
            }
            k.a aVar15 = this.f33118a;
            if (aVar15 == null) {
                l.a("bulletTitleBar");
            }
            ImageView moreButtonView = aVar15.getMoreButtonView();
            if (moreButtonView != null) {
                if (l.a(bVar.f32694j.b(), (Object) true)) {
                    i2 = 0;
                }
                moreButtonView.setVisibility(i2);
                moreButtonView.setOnClickListener(new c(this, bVar));
            }
            Integer num = (Integer) bVar.v.b();
            if (num != null && num.intValue() == 1) {
                k.a aVar16 = this.f33118a;
                if (aVar16 == null) {
                    l.a("bulletTitleBar");
                }
                aVar16.setTitleBarBackgroundColor(0);
                k.a aVar17 = this.f33118a;
                if (aVar17 == null) {
                    l.a("bulletTitleBar");
                }
                TextView titleView3 = aVar17.getTitleView();
                if (titleView3 != null) {
                    titleView3.setVisibility(0);
                }
            }
        }
        k.a aVar18 = this.f33118a;
        if (aVar18 == null) {
            l.a("bulletTitleBar");
        }
        return aVar18.getTitleBarRoot();
    }
}
