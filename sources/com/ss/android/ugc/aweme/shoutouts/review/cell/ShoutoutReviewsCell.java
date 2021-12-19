package com.ss.android.ugc.aweme.shoutouts.review.cell;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.c;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.c.h.a.k;
import com.google.gson.f;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsRatingDeleteApi;
import com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsReviewsViewModel;
import com.ss.android.ugc.aweme.shoutouts.review.a;
import com.ss.android.ugc.aweme.shoutouts.review.view.ShoutOutRatingBar;
import com.ss.android.ugc.aweme.translation.api.TranslationApi;
import com.ss.android.ugc.aweme.utils.av;
import com.ss.android.ugc.aweme.utils.em;
import com.ss.android.ugc.aweme.utils.ib;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.utils.io;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.k.i;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.Objects;

public final class ShoutoutReviewsCell extends PowerCell<com.ss.android.ugc.aweme.shoutouts.review.b.b> implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f133399a = {new y(ShoutoutReviewsCell.class, "reviewControl", "getReviewControl()Lcom/ss/android/ugc/aweme/shoutouts/review/controller/IShoutoutReviewControl;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public static final b f133400b = new b((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    private TextView f133401j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f133402k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f133403l;

    /* renamed from: m  reason: collision with root package name */
    private SmartAvatarImageView f133404m;
    private ShoutOutRatingBar n;
    private final h.h.d o = new a(this);

    static {
        Covode.recordClassIndex(87243);
    }

    public final com.ss.android.ugc.aweme.shoutouts.review.a.a a() {
        return (com.ss.android.ugc.aweme.shoutouts.review.a.a) this.o.a(this, f133399a[0]);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(87245);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void k() {
        super.k();
        this.itemView.setOnLongClickListener(new c(this));
        TextView textView = this.f133401j;
        if (textView == null) {
            l.a("tvUserName");
        }
        textView.setOnClickListener(this);
        SmartAvatarImageView smartAvatarImageView = this.f133404m;
        if (smartAvatarImageView == null) {
            l.a("ivUserAvatar");
        }
        smartAvatarImageView.setOnClickListener(this);
    }

    public static final class a implements h.h.d<Object, com.ss.android.ugc.aweme.shoutouts.review.a.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PowerCell f133405a;

        static {
            Covode.recordClassIndex(87244);
        }

        public a(PowerCell powerCell) {
            this.f133405a = powerCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
            if (r0 == null) goto L_0x004b;
         */
        @Override // h.h.d
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.ss.android.ugc.aweme.shoutouts.review.a.a a(java.lang.Object r6, h.k.i r7) {
            /*
            // Method dump skipped, instructions count: 149
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shoutouts.review.cell.ShoutoutReviewsCell.a.a(java.lang.Object, h.k.i):java.lang.Object");
        }
    }

    public static final class e implements k<com.ss.android.ugc.aweme.translation.a.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutReviewsCell f133413a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shoutouts.review.b.b f133414b;

        static {
            Covode.recordClassIndex(87250);
        }

        @Override // com.google.c.h.a.k
        public final void onFailure(Throwable th) {
            l.d(th, "");
            com.ss.android.ugc.aweme.shoutouts.review.b.c.a(this.f133414b);
            com.ss.android.ugc.aweme.shoutouts.review.a.a a2 = this.f133413a.a();
            if (a2 != null) {
                a2.a(this.f133414b);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.c.h.a.k
        public final /* synthetic */ void onSuccess(com.ss.android.ugc.aweme.translation.a.a aVar) {
            com.ss.android.ugc.aweme.translation.a.a aVar2 = aVar;
            if (aVar2 != null) {
                try {
                    com.ss.android.ugc.aweme.shoutouts.review.b.b bVar = this.f133414b;
                    com.ss.android.ugc.aweme.translation.a.c cVar = aVar2.f141008a.get(0);
                    l.b(cVar, "");
                    bVar.f133372j = cVar.f141015a;
                    com.ss.android.ugc.aweme.shoutouts.review.b.b bVar2 = this.f133414b;
                    l.d(bVar2, "");
                    bVar2.f133374l = 2;
                    this.f133414b.f133373k = true;
                    com.ss.android.ugc.aweme.shoutouts.review.a.a a2 = this.f133413a.a();
                    if (a2 != null) {
                        a2.a(this.f133414b);
                        if (z.f158842a != null) {
                            return;
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    com.ss.android.ugc.aweme.shoutouts.review.b.c.a(this.f133414b);
                    com.ss.android.ugc.aweme.shoutouts.review.a.a a3 = this.f133413a.a();
                    if (a3 != null) {
                        a3.a(this.f133414b);
                        return;
                    }
                    return;
                }
            }
            com.ss.android.ugc.aweme.shoutouts.review.b.c.a(this.f133414b);
            com.ss.android.ugc.aweme.shoutouts.review.a.a a4 = this.f133413a.a();
            if (a4 != null) {
                a4.a(this.f133414b);
            }
        }

        e(ShoutoutReviewsCell shoutoutReviewsCell, com.ss.android.ugc.aweme.shoutouts.review.b.b bVar) {
            this.f133413a = shoutoutReviewsCell;
            this.f133414b = bVar;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b0i, viewGroup, false);
        View findViewById = a2.findViewById(R.id.f_b);
        l.b(findViewById, "");
        this.f133401j = (TextView) findViewById;
        View findViewById2 = a2.findViewById(R.id.ex_);
        l.b(findViewById2, "");
        this.f133402k = (TextView) findViewById2;
        View findViewById3 = a2.findViewById(R.id.ex8);
        l.b(findViewById3, "");
        this.f133403l = (TextView) findViewById3;
        View findViewById4 = a2.findViewById(R.id.c2r);
        l.b(findViewById4, "");
        this.f133404m = (SmartAvatarImageView) findViewById4;
        View findViewById5 = a2.findViewById(R.id.dhb);
        l.b(findViewById5, "");
        this.n = (ShoutOutRatingBar) findViewById5;
        l.b(a2, "");
        return a2;
    }

    public final void onClick(View view) {
        String str;
        ClickAgent.onClick(view);
        if (view != null) {
            TextView textView = this.f133401j;
            if (textView == null) {
                l.a("tvUserName");
            }
            if (!l.a(view, textView)) {
                SmartAvatarImageView smartAvatarImageView = this.f133404m;
                if (smartAvatarImageView == null) {
                    l.a("ivUserAvatar");
                }
                if (!l.a(view, smartAvatarImageView)) {
                    return;
                }
            }
            Context context = view.getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            SmartRoute buildRoute = SmartRouter.buildRoute((Activity) context, "aweme://user/profile/");
            com.ss.android.ugc.aweme.shoutouts.review.b.b bVar = (com.ss.android.ugc.aweme.shoutouts.review.b.b) this.f34234d;
            String str2 = null;
            if (bVar != null) {
                str = bVar.f133368f;
            } else {
                str = null;
            }
            SmartRoute withParam = buildRoute.withParam("uid", str).withParam("extra_from_pre_page", "notification_page");
            com.ss.android.ugc.aweme.shoutouts.review.b.b bVar2 = (com.ss.android.ugc.aweme.shoutouts.review.b.b) this.f34234d;
            if (bVar2 != null) {
                str2 = bVar2.f133369g;
            }
            withParam.withParam("sec_uid", str2).open();
        }
    }

    static final class c implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutReviewsCell f133406a;

        static {
            Covode.recordClassIndex(87246);
        }

        c(ShoutoutReviewsCell shoutoutReviewsCell) {
            this.f133406a = shoutoutReviewsCell;
        }

        public final boolean onLongClick(View view) {
            String str;
            com.ss.android.ugc.aweme.shoutouts.review.b.b bVar = (com.ss.android.ugc.aweme.shoutouts.review.b.b) this.f133406a.f34234d;
            if (bVar != null) {
                l.d(bVar, "");
                if (bVar.f133374l != 1) {
                    ShoutoutReviewsCell shoutoutReviewsCell = this.f133406a;
                    ArrayList arrayList = new ArrayList();
                    ShoutoutsReviewsViewModel shoutoutsReviewsViewModel = (ShoutoutsReviewsViewModel) PowerCell.a(shoutoutReviewsCell, ShoutoutsReviewsViewModel.class);
                    if (shoutoutsReviewsViewModel != null) {
                        View view2 = shoutoutReviewsCell.itemView;
                        l.b(view2, "");
                        arrayList.add(view2.getResources().getString(R.string.aui));
                        com.ss.android.ugc.aweme.shoutouts.review.b.b bVar2 = (com.ss.android.ugc.aweme.shoutouts.review.b.b) shoutoutReviewsCell.f34234d;
                        if (bVar2 != null) {
                            View view3 = shoutoutReviewsCell.itemView;
                            l.b(view3, "");
                            Resources resources = view3.getResources();
                            String str2 = bVar2.f133368f;
                            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                            if (g2 != null) {
                                str = g2.getCurUserId();
                            } else {
                                str = null;
                            }
                            if (l.a((Object) str2, (Object) str)) {
                                arrayList.add(resources.getString(R.string.b5g));
                            } else {
                                if (!bVar2.f133373k) {
                                    arrayList.add(resources.getString(R.string.amo));
                                } else {
                                    arrayList.add(resources.getString(R.string.am7));
                                }
                                arrayList.add(resources.getString(R.string.fcr));
                            }
                            View view4 = shoutoutReviewsCell.itemView;
                            l.b(view4, "");
                            com.ss.android.ugc.aweme.shoutouts.review.a aVar = new com.ss.android.ugc.aweme.shoutouts.review.a(view4.getContext());
                            Object[] array = arrayList.toArray(new CharSequence[0]);
                            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                            CharSequence[] charSequenceArr = (CharSequence[]) array;
                            d dVar = new d(shoutoutReviewsCell, arrayList, resources, bVar2, shoutoutsReviewsViewModel);
                            c.a aVar2 = aVar.f133348a;
                            if (aVar2 != null) {
                                aVar2.a(new a.C3454a(aVar.f133349b, charSequenceArr), dVar);
                            }
                            c.a aVar3 = aVar.f133348a;
                            if (aVar3 != null) {
                                aVar3.b();
                            }
                        }
                    }
                }
            }
            return true;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.shoutouts.review.b.b bVar) {
        String str;
        String str2;
        Long g2;
        com.ss.android.ugc.aweme.shoutouts.review.b.b bVar2 = bVar;
        l.d(bVar2, "");
        String str3 = bVar2.f133366d;
        if (!(str3 == null || (g2 = p.g(str3)) == null)) {
            TextView textView = this.f133402k;
            if (textView == null) {
                l.a("tvCommentTime");
            }
            View view = this.itemView;
            l.b(view, "");
            textView.setText(ib.a(view.getContext(), g2.longValue() * 1000));
        }
        TextView textView2 = this.f133401j;
        if (textView2 == null) {
            l.a("tvUserName");
        }
        textView2.setText(bVar2.f133364b);
        com.ss.android.ugc.aweme.shoutouts.review.b.b bVar3 = (com.ss.android.ugc.aweme.shoutouts.review.b.b) this.f34234d;
        if (bVar3 == null || !bVar3.f133371i) {
            int i2 = Build.VERSION.SDK_INT;
            TextView textView3 = this.f133401j;
            if (textView3 == null) {
                l.a("tvUserName");
            }
            textView3.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            View view2 = this.itemView;
            l.b(view2, "");
            Context context = view2.getContext();
            TextView textView4 = this.f133401j;
            if (textView4 == null) {
                l.a("tvUserName");
            }
            io.a(context, "shoutouts", null, textView4);
        }
        TextView textView5 = this.f133403l;
        if (textView5 == null) {
            l.a("tvCommentContent");
        }
        if (bVar2.f133373k) {
            str = bVar2.f133372j;
        } else {
            str = bVar2.f133365c;
        }
        textView5.setText(str);
        ShoutOutRatingBar shoutOutRatingBar = this.n;
        if (shoutOutRatingBar == null) {
            l.a("ratingBar");
        }
        shoutOutRatingBar.setStar((float) bVar2.f133367e);
        int a2 = n.a(24.0d);
        com.ss.android.ugc.aweme.shoutouts.review.b.b bVar4 = (com.ss.android.ugc.aweme.shoutouts.review.b.b) this.f34234d;
        if (bVar4 != null && (str2 = bVar4.f133370h) != null) {
            v a3 = r.a(str2);
            l.b(a3, "");
            v a4 = a3.b(em.a(100)).a(a2, a2);
            a4.K = true;
            v a5 = a4.a("ShoutoutReviewsCell");
            SmartAvatarImageView smartAvatarImageView = this.f133404m;
            if (smartAvatarImageView == null) {
                l.a("ivUserAvatar");
            }
            a5.E = smartAvatarImageView;
            a5.c();
        }
    }

    static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutReviewsCell f133407a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f133408b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Resources f133409c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shoutouts.review.b.b f133410d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ShoutoutsReviewsViewModel f133411e;

        static {
            Covode.recordClassIndex(87247);
        }

        d(ShoutoutReviewsCell shoutoutReviewsCell, ArrayList arrayList, Resources resources, com.ss.android.ugc.aweme.shoutouts.review.b.b bVar, ShoutoutsReviewsViewModel shoutoutsReviewsViewModel) {
            this.f133407a = shoutoutReviewsCell;
            this.f133408b = arrayList;
            this.f133409c = resources;
            this.f133410d = bVar;
            this.f133411e = shoutoutsReviewsViewModel;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            String str;
            String str2;
            dialogInterface.dismiss();
            Object obj = this.f133408b.get(i2);
            if (l.a(obj, (Object) this.f133409c.getString(R.string.aui))) {
                com.ss.android.ugc.aweme.shoutouts.review.b.b bVar = (com.ss.android.ugc.aweme.shoutouts.review.b.b) this.f133407a.f34234d;
                if (bVar != null) {
                    try {
                        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                        l.b(g2, "");
                        User curUser = g2.getCurUser();
                        StringBuilder append = new StringBuilder().append(com.bytedance.ies.ugc.appcontext.d.a().getResources().getString(R.string.aul, in.a(curUser)));
                        if (bVar.f133373k) {
                            str2 = bVar.f133372j;
                        } else {
                            str2 = bVar.f133365c;
                        }
                        av.a("copy_label", append.append(str2).toString(), com.bytedance.ies.ugc.appcontext.d.a(), PrivacyCert.Builder.Companion.with("bpea-222").usage("Long press the comment content to provide copy function. ").tag("longPressToCopyComment").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            } else if (l.a(obj, (Object) this.f133409c.getString(R.string.amo))) {
                ShoutoutReviewsCell shoutoutReviewsCell = this.f133407a;
                com.ss.android.ugc.aweme.shoutouts.review.b.b bVar2 = this.f133410d;
                try {
                    l.d(bVar2, "");
                    bVar2.f133374l = 1;
                    com.ss.android.ugc.aweme.shoutouts.review.a.a a2 = shoutoutReviewsCell.a();
                    if (a2 != null) {
                        a2.a(bVar2);
                    }
                    com.ss.android.ugc.aweme.comment.n.b bVar3 = new com.ss.android.ugc.aweme.comment.n.b();
                    com.ss.android.ugc.aweme.shoutouts.review.b.b bVar4 = (com.ss.android.ugc.aweme.shoutouts.review.b.b) shoutoutReviewsCell.f34234d;
                    if (bVar4 != null) {
                        str = bVar4.f133365c;
                    } else {
                        str = null;
                    }
                    bVar3.a(str);
                    bVar3.f72121b = SettingServiceImpl.v().h();
                    com.google.c.h.a.l.a(TranslationApi.a(bVar3.f72121b, new f().b(bVar3.f72120a), 2), new e(shoutoutReviewsCell, bVar2), m.f68150a);
                } catch (Exception e3) {
                    e3.printStackTrace();
                    com.ss.android.ugc.aweme.shoutouts.review.b.c.a(bVar2);
                    com.ss.android.ugc.aweme.shoutouts.review.a.a a3 = shoutoutReviewsCell.a();
                    if (a3 != null) {
                        a3.a(bVar2);
                    }
                }
            } else if (l.a(obj, (Object) this.f133409c.getString(R.string.am7))) {
                this.f133410d.f133373k = false;
                com.ss.android.ugc.aweme.shoutouts.review.a.a a4 = this.f133407a.a();
                if (a4 != null) {
                    a4.a(this.f133410d);
                }
            } else if (l.a(obj, (Object) this.f133409c.getString(R.string.fcr))) {
                View view = this.f133407a.itemView;
                l.b(view, "");
                Context context = view.getContext();
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                Activity activity = (Activity) context;
                com.ss.android.ugc.aweme.shoutouts.review.b.b bVar5 = this.f133410d;
                String str3 = this.f133411e.f133336a;
                Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("object_id", bVar5.f133363a).appendQueryParameter("comment_with_emoji", "0").appendQueryParameter("owner_id", bVar5.f133368f).appendQueryParameter("report_type", "shoutout_order_comment");
                appendQueryParameter.appendQueryParameter("locale", SettingServiceImpl.v().h());
                if (!TextUtils.isEmpty(str3)) {
                    appendQueryParameter.appendQueryParameter("video_owner_id", str3);
                }
                Bundle bundle = new Bundle();
                double f2 = (double) com.ss.android.ugc.aweme.base.utils.i.f(activity);
                Double.isNaN(f2);
                bundle.putInt("half_screen_height", (int) (f2 * 0.9d));
                com.ss.android.ugc.aweme.compliance.api.a.a().a(activity, appendQueryParameter, bundle);
            } else if (l.a(obj, (Object) this.f133409c.getString(R.string.b5g))) {
                final com.ss.android.ugc.aweme.shoutouts.review.b.b bVar6 = this.f133410d;
                ShoutoutsReviewsViewModel shoutoutsReviewsViewModel = this.f133411e;
                String str4 = bVar6.f133363a;
                AnonymousClass1 r3 = new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.shoutouts.review.cell.ShoutoutReviewsCell.d.AnonymousClass1 */
                    final /* synthetic */ d this$0;

                    static {
                        Covode.recordClassIndex(87248);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        com.ss.android.ugc.aweme.shoutouts.review.a.a a2 = this.this$0.f133407a.a();
                        if (a2 != null) {
                            a2.a(new a(bVar6));
                        }
                        return z.f158842a;
                    }
                };
                AnonymousClass2 r2 = AnonymousClass2.f133412a;
                Object a5 = RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(ShoutoutsRatingDeleteApi.class);
                l.b(a5, "");
                ((ShoutoutsRatingDeleteApi) a5).deleteRating(shoutoutsReviewsViewModel.f133337b, str4).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a_(new ShoutoutsReviewsViewModel.c(r3, r2));
            }
        }
    }
}
