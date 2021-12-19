package com.ss.android.ugc.aweme.im.sdk.chatlist.ui.e;

import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.emoji.widget.EmojiCompatTuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chatlist.a.a;
import com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.f;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.m;
import com.ss.android.ugc.aweme.im.sdk.common.ui.widget.BadgeTextView;
import com.ss.android.ugc.aweme.im.sdk.common.ui.widget.SessionStatusImageView;
import com.ss.android.ugc.aweme.im.service.k.d;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.inbox.widget.a;
import com.ss.android.ugc.aweme.inbox.widget.b;
import com.ss.android.ugc.aweme.utils.io;
import com.zhiliaoapp.musically.R;
import f.a.aa;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class c extends RecyclerView.ViewHolder implements a, i, j {

    /* renamed from: a  reason: collision with root package name */
    private final EmojiCompatTuxTextView f102115a;

    /* renamed from: b  reason: collision with root package name */
    public final AvatarImageView f102116b;

    /* renamed from: c  reason: collision with root package name */
    protected final EmojiCompatTuxTextView f102117c;

    /* renamed from: d  reason: collision with root package name */
    protected final AppCompatTextView f102118d;

    /* renamed from: e  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.im.service.k.a f102119e;

    /* renamed from: f  reason: collision with root package name */
    public int f102120f;

    /* renamed from: g  reason: collision with root package name */
    private final BadgeTextView f102121g;

    /* renamed from: h  reason: collision with root package name */
    private final ImageView f102122h;

    /* renamed from: i  reason: collision with root package name */
    private final ImageView f102123i;

    /* renamed from: j  reason: collision with root package name */
    private final SessionStatusImageView f102124j;

    /* renamed from: k  reason: collision with root package name */
    private final ImageView f102125k;

    /* renamed from: l  reason: collision with root package name */
    private final ViewGroup f102126l;

    /* renamed from: m  reason: collision with root package name */
    private final ViewGroup f102127m;
    private final int n = Math.round(TypedValue.applyDimension(1, 56.0f, Resources.getSystem().getDisplayMetrics()));
    private String o;
    private b p;

    static {
        Covode.recordClassIndex(65343);
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(73, new g(c.class, "onUserUpdate", m.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.a
    public final void a(b bVar) {
        ViewGroup viewGroup;
        if (this.p != bVar) {
            this.p = bVar;
            if (bVar.f104374b != -1) {
                ViewGroup.LayoutParams layoutParams = this.f102116b.getLayoutParams();
                layoutParams.width = bVar.f104374b;
                layoutParams.height = bVar.f104374b;
            }
            if (bVar.f104377e != -1) {
                this.f102115a.setTuxFont(bVar.f104377e);
            }
            if (bVar.f104378f != -1) {
                this.f102115a.a((float) bVar.f104378f);
            }
            if (bVar.f104379g != -1) {
                this.f102117c.setTuxFont(bVar.f104379g);
            }
            if (bVar.f104381i != -1) {
                this.f102117c.setTextColor(bVar.f104381i);
            }
            if (!(bVar.f104382j == -1 || (viewGroup = this.f102127m) == null || !(viewGroup.getLayoutParams() instanceof ViewGroup.MarginLayoutParams))) {
                ((ViewGroup.MarginLayoutParams) this.f102127m.getLayoutParams()).topMargin = bVar.f104382j;
            }
            if (bVar.f104383k != -1) {
                AppCompatTextView appCompatTextView = this.f102118d;
                if (appCompatTextView instanceof TuxTextView) {
                    ((TuxTextView) appCompatTextView).setTuxFont(bVar.f104383k);
                }
            }
        }
    }

    public final void c() {
        if (EventBus.a().a(this)) {
            EventBus.a().b(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.e.c$3  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f102131a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f102132b;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        static {
            /*
                r0 = 65346(0xff42, float:9.1569E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.im.service.k.c[] r0 = com.ss.android.ugc.aweme.im.service.k.c.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.ss.android.ugc.aweme.im.sdk.chatlist.ui.e.c.AnonymousClass3.f102132b = r1
                r4 = 1
                com.ss.android.ugc.aweme.im.service.k.c r0 = com.ss.android.ugc.aweme.im.service.k.c.BLUE     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r1[r0] = r4     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                r3 = 2
                int[] r1 = com.ss.android.ugc.aweme.im.sdk.chatlist.ui.e.c.AnonymousClass3.f102132b     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.im.service.k.c r0 = com.ss.android.ugc.aweme.im.service.k.c.GREY     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                r2 = 3
                int[] r1 = com.ss.android.ugc.aweme.im.sdk.chatlist.ui.e.c.AnonymousClass3.f102132b     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.ugc.aweme.im.service.k.c r0 = com.ss.android.ugc.aweme.im.service.k.c.RED     // Catch:{ NoSuchFieldError -> 0x002e }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                com.ss.android.ugc.aweme.im.service.k.e[] r0 = com.ss.android.ugc.aweme.im.service.k.e.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.ss.android.ugc.aweme.im.sdk.chatlist.ui.e.c.AnonymousClass3.f102131a = r1
                com.ss.android.ugc.aweme.im.service.k.e r0 = com.ss.android.ugc.aweme.im.service.k.e.LEFT_DOT     // Catch:{ NoSuchFieldError -> 0x003f }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
                r1[r0] = r4     // Catch:{ NoSuchFieldError -> 0x003f }
            L_0x003f:
                int[] r1 = com.ss.android.ugc.aweme.im.sdk.chatlist.ui.e.c.AnonymousClass3.f102131a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.ugc.aweme.im.service.k.e r0 = com.ss.android.ugc.aweme.im.service.k.e.RIGHT_DOT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r1 = com.ss.android.ugc.aweme.im.sdk.chatlist.ui.e.c.AnonymousClass3.f102131a     // Catch:{ NoSuchFieldError -> 0x0053 }
                com.ss.android.ugc.aweme.im.service.k.e r0 = com.ss.android.ugc.aweme.im.service.k.e.RIGHT_NUMBER     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.e.c.AnonymousClass3.<clinit>():void");
        }
    }

    public final void b() {
        if (!EventBus.a().a(this)) {
            EventBus.a(EventBus.a(), this);
        }
        int c2 = this.f102119e.c();
        if (c2 == 0) {
            com.ss.android.ugc.aweme.im.service.k.a aVar = this.f102119e;
            com.bytedance.ies.im.core.api.b.a a2 = a.C0745a.a();
            aa b2 = f.a.h.a.b(f.a.k.a.f158006c);
            l.b(b2, "");
            a.g gVar = a.g.f101855a;
            l.d(aVar, "");
            l.d(a2, "");
            l.d(b2, "");
            l.d(gVar, "");
            f.a.b.b(new a.h(a2, aVar, gVar)).b(b2).cG_();
        } else if (c2 == 20) {
            com.ss.android.ugc.aweme.im.service.k.a aVar2 = this.f102119e;
            com.bytedance.ies.im.core.api.b.a a3 = a.C0745a.a();
            aa b3 = f.a.h.a.b(f.a.k.a.f158006c);
            l.b(b3, "");
            a.e eVar = a.e.f101851a;
            l.d(aVar2, "");
            l.d(a3, "");
            l.d(b3, "");
            l.d(eVar, "");
            f.a.b.b(new a.f(a3, aVar2, eVar)).b(b3).cG_();
        }
    }

    public final void a() {
        Long valueOf = Long.valueOf(b.a.c(this.f102119e.bF_()));
        if (valueOf.longValue() > 0) {
            com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.b(valueOf.toString(), com.ss.android.ugc.aweme.im.sdk.common.controller.e.c.a(this.f102119e.bF_()), new com.ss.android.ugc.aweme.im.service.i.a() {
                /* class com.ss.android.ugc.aweme.im.sdk.chatlist.ui.e.c.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(65345);
                }

                @Override // com.ss.android.ugc.aweme.im.service.i.a
                public final void a(IMUser iMUser) {
                    if (iMUser != null) {
                        c.this.a(iMUser.getAvatarThumb());
                    }
                }

                @Override // com.ss.android.ugc.aweme.im.service.i.a
                public final void a(Throwable th) {
                    com.ss.android.ugc.aweme.im.service.m.a.e("SessionListViewHolder", "SessionType.CHAT onQueryError() ");
                    e.a(c.this.f102116b, 2131232324);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean b(com.ss.android.ugc.aweme.im.sdk.chatlist.controller.a.a aVar) {
        com.ss.android.ugc.aweme.im.service.k.a aVar2 = this.f102119e;
        if (aVar2 == null || aVar == null) {
            return true;
        }
        aVar.a(aVar2, 0);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(com.ss.android.ugc.aweme.im.sdk.chatlist.controller.a.a aVar) {
        com.ss.android.ugc.aweme.im.service.k.a aVar2 = this.f102119e;
        if (aVar2 != null && aVar != null) {
            aVar.a(aVar2, 1);
        }
    }

    private void b(d dVar) {
        if (dVar.f103877c) {
            this.f102117c.setTuxFont(62);
            this.f102117c.setTextColor(androidx.core.content.b.c(this.itemView.getContext(), R.color.bx));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.im.sdk.chatlist.controller.a.a aVar) {
        com.ss.android.ugc.aweme.im.service.k.a aVar2 = this.f102119e;
        if (aVar2 != null && aVar != null) {
            aVar.a(aVar2, 2);
        }
    }

    private void a(d dVar) {
        Drawable drawable;
        int i2 = AnonymousClass3.f102132b[dVar.f103876b.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                drawable = androidx.core.content.b.a(this.itemView.getContext(), (int) R.drawable.auc);
                if (dVar.f103875a == com.ss.android.ugc.aweme.im.service.k.e.LEFT_DOT) {
                    this.f102123i.setImageDrawable(drawable);
                    return;
                }
            } else {
                return;
            }
        } else if (dVar.f103875a == com.ss.android.ugc.aweme.im.service.k.e.RIGHT_NUMBER) {
            this.f102121g.setBackgroundDrawable(androidx.core.content.b.a(this.itemView.getContext(), (int) R.drawable.arn));
            return;
        } else if (dVar.f103875a == com.ss.android.ugc.aweme.im.service.k.e.RIGHT_DOT) {
            drawable = androidx.core.content.b.a(this.itemView.getContext(), (int) R.drawable.aub);
        } else {
            return;
        }
        this.f102122h.setImageDrawable(drawable);
    }

    private void b(com.ss.android.ugc.aweme.im.service.k.a aVar) {
        String str;
        int i2 = aVar.q;
        if (i2 > 1 && com.ss.android.ugc.aweme.im.sdk.common.controller.a.g.b()) {
            str = this.itemView.getContext().getResources().getString(R.string.dem, Integer.valueOf(i2));
        } else if (aVar.g() != null) {
            str = aVar.g();
        } else {
            str = "";
        }
        a.C0730a aVar2 = new a.C0730a();
        aVar2.a(str);
        this.f102117c.setText(aVar2.f33382a);
        if (aVar.v) {
            com.ss.android.ugc.aweme.emoji.i.b.b.a(this.f102117c);
        }
    }

    private void c(com.ss.android.ugc.aweme.im.service.k.a aVar) {
        boolean z;
        String str;
        if (aVar.q > 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = aVar.r;
        d dVar = aVar.y;
        StringBuilder append = new StringBuilder("hasUnreadMessages: ").append(z).append("hasUnreadLikes: ").append(z2);
        if (dVar != null) {
            str = "state: " + dVar.toString();
        } else {
            str = "";
        }
        com.ss.android.ugc.aweme.im.service.m.a.c("SessionListViewHolder", append.append(str).append(" sessionID: ").append(aVar.bF_()).toString());
        if (dVar != null && (z || z2)) {
            a(dVar, aVar);
            a(dVar);
            b(dVar);
        } else if (com.ss.android.ugc.aweme.im.sdk.common.controller.a.g.c()) {
            this.f102115a.setTuxFont(41);
        }
    }

    @r
    public void onUserUpdate(m mVar) {
        IMUser a2;
        if (TextUtils.equals(this.o, mVar.f102282a) && (a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.a(mVar.f102282a, mVar.f102283b)) != null) {
            com.ss.android.ugc.aweme.im.service.k.a aVar = this.f102119e;
            if (aVar instanceof f) {
                b(aVar);
                return;
            }
            UrlModel avatarThumb = a2.getAvatarThumb();
            if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0) {
                e.a(this.f102116b, 2131232324);
            } else {
                e.a(this.f102116b, avatarThumb);
            }
            com.ss.android.ugc.aweme.im.service.k.a aVar2 = this.f102119e;
            if (aVar2 != null && !TextUtils.isEmpty(aVar2.bF_())) {
                a(a2, this.f102119e.bF_());
            }
            this.f102115a.setText(a2.getDisplayName());
            io.a(this.itemView.getContext(), a2.getCustomVerify(), a2.getEnterpriseVerifyReason(), this.f102115a);
        }
    }

    public final void a(UrlModel urlModel) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0) {
            com.ss.android.ugc.aweme.im.service.m.a.a("SessionListViewHolder", "User has no avatar");
            e.a(this.f102116b, 2131232324);
            return;
        }
        final String str = urlModel.getUrlList().get(0);
        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(this.f102116b, urlModel, new com.ss.android.ugc.aweme.im.sdk.common.controller.utils.e() {
            /* class com.ss.android.ugc.aweme.im.sdk.chatlist.ui.e.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(65344);
            }

            @Override // com.facebook.drawee.c.d
            public final void onIntermediateImageFailed(String str, Throwable th) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
            @Override // com.facebook.drawee.c.d
            public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, com.facebook.imagepipeline.j.f fVar) {
            }

            @Override // com.facebook.drawee.c.d
            public final void onRelease(String str) {
            }

            @Override // com.facebook.drawee.c.d
            public final void onSubmit(String str, Object obj) {
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.utils.e
            public final void a() {
                if (c.this.f102120f > 0) {
                    com.ss.android.ugc.aweme.im.service.m.a.c("SessionListViewHolder", "SessionType.CHAT onLoadSuccess() refresh count: " + c.this.f102120f + " position: " + c.this.getBindingAdapterPosition() + " url: " + str);
                    c.this.f102120f = 0;
                }
            }

            @Override // com.facebook.drawee.c.d
            public final void onFailure(String str, Throwable th) {
                if (c.this.f102120f < 3) {
                    c.this.a();
                    c.this.f102120f++;
                } else {
                    e.a(c.this.f102116b, 2131232324);
                }
                com.ss.android.ugc.aweme.im.service.m.a.a("SessionListViewHolder", "SessionType.CHAT onLoadFailure()refresh count: " + c.this.f102120f + " position: " + c.this.getBindingAdapterPosition() + " url: " + str, th);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
            @Override // com.facebook.drawee.c.d
            public final /* synthetic */ void onFinalImageSet(String str, com.facebook.imagepipeline.j.f fVar, Animatable animatable) {
                a();
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x014d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.im.service.k.a r17) {
        /*
        // Method dump skipped, instructions count: 779
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.e.c.a(com.ss.android.ugc.aweme.im.service.k.a):void");
    }

    private static void a(IMUser iMUser, String str) {
        if (iMUser != null && TextUtils.isEmpty(iMUser.getSecUid())) {
            com.ss.android.ugc.aweme.im.sdk.common.controller.e.i.a(str);
        }
    }

    private void a(AvatarImageView avatarImageView, com.ss.android.ugc.aweme.im.service.k.a aVar) {
        if (aVar.f103870l instanceof UrlModel) {
            e.a(avatarImageView, (UrlModel) aVar.f103870l);
        } else if (aVar.f103870l instanceof com.ss.android.ugc.aweme.base.model.a) {
            e.a(avatarImageView, (com.ss.android.ugc.aweme.base.model.a) aVar.f103870l);
        }
        if (!TextUtils.isEmpty(aVar.f())) {
            com.ss.android.ugc.aweme.im.sdk.common.controller.utils.a.a(this.f102116b, aVar.f());
        }
    }

    public c(View view, com.ss.android.ugc.aweme.im.sdk.chatlist.controller.a.a aVar) {
        super(view);
        AvatarImageView avatarImageView = (AvatarImageView) view.findViewById(R.id.pd);
        this.f102116b = avatarImageView;
        this.f102115a = (EmojiCompatTuxTextView) view.findViewById(R.id.fdm);
        this.f102117c = (EmojiCompatTuxTextView) view.findViewById(R.id.c4e);
        this.f102118d = (AppCompatTextView) view.findViewById(R.id.c4f);
        this.f102121g = (BadgeTextView) view.findViewById(R.id.f_4);
        this.f102122h = (ImageView) view.findViewById(R.id.c0r);
        this.f102123i = (ImageView) view.findViewById(R.id.bym);
        this.f102125k = (ImageView) view.findViewById(R.id.crr);
        this.f102124j = (SessionStatusImageView) view.findViewById(R.id.c17);
        this.f102126l = (ViewGroup) view.findViewById(R.id.c4n);
        this.f102127m = (ViewGroup) view.findViewById(R.id.ae6);
        view.setOnClickListener(new d(this, aVar));
        view.setOnLongClickListener(new e(this, aVar));
        avatarImageView.setOnClickListener(new f(this, aVar));
        com.facebook.drawee.f.e eVar = new com.facebook.drawee.f.e();
        eVar.f47476b = true;
        ((com.facebook.drawee.f.a) avatarImageView.getHierarchy()).a(eVar);
        ((com.facebook.drawee.f.a) avatarImageView.getHierarchy()).c(2131232324);
    }

    private void a(d dVar, com.ss.android.ugc.aweme.im.service.k.a aVar) {
        int i2 = AnonymousClass3.f102131a[dVar.f103875a.ordinal()];
        if (i2 == 1) {
            this.f102123i.setVisibility(0);
            this.f102124j.setVisibility(8);
        } else if (i2 != 2) {
            this.f102121g.setBadgeCount(aVar.q);
            if (!(aVar instanceof com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.c) || !com.ss.android.ugc.aweme.im.service.c.c.a()) {
                this.f102121g.setVisibility(0);
            } else {
                this.f102121g.setVisibility(8);
            }
        } else if (!(aVar instanceof com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.c) || !com.ss.android.ugc.aweme.im.service.c.c.a()) {
            this.f102122h.setVisibility(0);
        } else {
            this.f102122h.setVisibility(8);
        }
    }
}
