package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.Html;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.f.a;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel;
import com.ss.android.ugc.aweme.metrics.ab;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.verification.VerificationResponse;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Arrays;

public final class c extends com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h implements com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.g {

    /* renamed from: c  reason: collision with root package name */
    public static final a f77634c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final f.a.b.a f77635a = new f.a.b.a();

    /* renamed from: b  reason: collision with root package name */
    public final PrivacySettingViewModel f77636b;

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f77646a = new f();

        static {
            Covode.recordClassIndex(48042);
        }

        f() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(48034);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(48035);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(User user) {
            if (user == null) {
                return false;
            }
            if (!com.ss.android.ugc.aweme.compliance.privacy.a.b.a()) {
                return user.isProAccount();
            }
            if (user.getAccountType() == 2 || user.getAccountType() == 3 || user.getAccountType() == 1) {
                return true;
            }
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.g
    public final void a() {
        this.f77635a.a();
    }

    /* access modifiers changed from: package-private */
    public final String c() {
        if (this.f77636b.f77450b) {
            return "pop_up";
        }
        return "";
    }

    /* access modifiers changed from: package-private */
    public static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f77649a;

        static {
            Covode.recordClassIndex(48045);
        }

        h(c cVar) {
            this.f77649a = cVar;
        }

        static final class a extends m implements h.f.a.a<z> {
            final /* synthetic */ h this$0;

            static {
                Covode.recordClassIndex(48051);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h hVar) {
                super(0);
                this.this$0 = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                View view = this.this$0.f77649a.itemView;
                l.b(view, "");
                SmartRouter.buildRoute(view.getContext(), "//authmanagement").open();
                return z.f158842a;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v51, resolved type: android.text.Spannable[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Spanned fromHtml;
            Throwable th = (Throwable) obj;
            this.f77649a.f77636b.f77453e.setValue(false);
            this.f77649a.f77636b.f77452d.setValue(Boolean.valueOf(com.ss.android.ugc.aweme.compliance.privacy.a.a.b()));
            if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) th;
                int errorCode = aVar.getErrorCode();
                if (errorCode == -5007) {
                    View view = this.f77649a.itemView;
                    l.b(view, "");
                    Context context = view.getContext();
                    l.b(context, "");
                    ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a(new com.bytedance.tux.dialog.b(context).d(aVar.getErrorMsg()), AnonymousClass2.f77650a).a(false)).a().b().show();
                } else if (errorCode == -5002) {
                    View view2 = this.f77649a.itemView;
                    l.b(view2, "");
                    Context context2 = view2.getContext();
                    l.b(context2, "");
                    ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(context2).a(R.string.n1).b(R.string.nj), new h.f.a.b<com.bytedance.tux.dialog.b.b, z>(this) {
                        /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.c.h.AnonymousClass1 */
                        final /* synthetic */ h this$0;

                        static {
                            Covode.recordClassIndex(48046);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
                            com.bytedance.tux.dialog.b.b bVar2 = bVar;
                            l.d(bVar2, "");
                            bVar2.a(R.string.mz, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                                /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.c.h.AnonymousClass1.AnonymousClass1 */
                                final /* synthetic */ AnonymousClass1 this$0;

                                static {
                                    Covode.recordClassIndex(48047);
                                }

                                {
                                    this.this$0 = r2;
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // h.f.a.b
                                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                                    l.d(aVar, "");
                                    this.this$0.this$0.f77649a.b(!this.this$0.this$0.f77649a.b());
                                    this.this$0.this$0.f77649a.a(true, true);
                                    return z.f158842a;
                                }
                            });
                            bVar2.b(R.string.b6z, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, z>) null);
                            bVar2.f44820b = true;
                            return z.f158842a;
                        }
                    }).a(false)).a().b().show();
                } else if (errorCode == 3026002) {
                    View view3 = this.f77649a.itemView;
                    l.b(view3, "");
                    Context context3 = view3.getContext();
                    l.b(context3, "");
                    com.bytedance.tux.dialog.b bVar = (com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(context3).a(R.string.a37);
                    com.bytedance.tux.f.c a2 = new com.bytedance.tux.f.c().a(R.string.a36);
                    a2.f45052d = 2;
                    a2.f45050b = false;
                    a2.f45051c = 42;
                    a2.f45054f = new a(this);
                    View view4 = this.f77649a.itemView;
                    l.b(view4, "");
                    Context context4 = view4.getContext();
                    l.b(context4, "");
                    CharSequence a3 = a2.a(context4);
                    View view5 = this.f77649a.itemView;
                    l.b(view5, "");
                    Context context5 = view5.getContext();
                    l.b(context5, "");
                    Spannable[] spannableArr = {a3};
                    l.c(context5, "");
                    l.c(spannableArr, "");
                    Spannable[] spannableArr2 = (Spannable[]) Arrays.copyOf(spannableArr, 1);
                    l.c(context5, "");
                    l.c(spannableArr2, "");
                    String string = context5.getString(R.string.a35);
                    l.a((Object) string, "");
                    Spannable[] spannableArr3 = (Spannable[]) Arrays.copyOf(spannableArr2, spannableArr2.length);
                    l.c(string, "");
                    l.c(spannableArr3, "");
                    int length = spannableArr3.length;
                    String[] strArr = new String[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        strArr[i2] = "";
                    }
                    int length2 = spannableArr3.length;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < length2) {
                        strArr[i4] = "<tux-span-" + i4 + '>' + spannableArr3[i3].toString() + "</tux-span-" + i4 + '>';
                        i3++;
                        i4++;
                    }
                    Object[] copyOf = Arrays.copyOf(strArr, length);
                    String a4 = com.a.a(string, Arrays.copyOf(copyOf, copyOf.length));
                    l.a((Object) a4, "");
                    a.C1102a.C1103a aVar2 = new a.C1102a.C1103a(spannableArr3);
                    if (Build.VERSION.SDK_INT >= 24) {
                        fromHtml = Html.fromHtml(a4, 0, null, aVar2);
                    } else {
                        fromHtml = Html.fromHtml(a4, null, aVar2);
                    }
                    l.a((Object) fromHtml, "");
                    bVar.d(fromHtml);
                    com.bytedance.tux.dialog.b.c.a(bVar, AnonymousClass3.f77651a).a().b().show();
                }
            } else {
                View view6 = this.f77649a.itemView;
                l.b(view6, "");
                new com.bytedance.tux.g.b(view6).e(R.string.dmn).b();
                if (th != null) {
                    final String a5 = com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(th);
                    final String b2 = com.ss.android.ugc.aweme.compliance.privacy.utils.a.b(th);
                    com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", new h.f.a.b<com.ss.android.ugc.aweme.app.f.c, com.ss.android.ugc.aweme.app.f.c>() {
                        /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.c.h.AnonymousClass4 */

                        static {
                            Covode.recordClassIndex(48050);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ com.ss.android.ugc.aweme.app.f.c invoke(com.ss.android.ugc.aweme.app.f.c cVar) {
                            com.ss.android.ugc.aweme.app.f.c cVar2 = cVar;
                            l.d(cVar2, "");
                            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "Change private account fail");
                            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "target_value", Boolean.valueOf(!com.ss.android.ugc.aweme.compliance.privacy.a.a.b()));
                            com.ss.android.ugc.aweme.compliance.privacy.utils.a.b(cVar2, a5);
                            return com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "cause", b2);
                        }
                    });
                    com.ss.android.ugc.aweme.compliance.common.c.a.a("/tiktok/privacy/user/private_account/update/v1", a5, b2);
                }
            }
        }
    }

    public final boolean b() {
        return l.a((Object) this.f77636b.f77452d.getValue(), (Object) true);
    }

    public final void a(boolean z) {
        b(z);
        a(z, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.c$c  reason: collision with other inner class name */
    static final class C1800c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f77639a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f77640b;

        static {
            Covode.recordClassIndex(48037);
        }

        C1800c(c cVar, User user) {
            this.f77639a = cVar;
            this.f77640b = user;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", "Business account: quit check success, showPrivacyDialog");
            this.f77639a.a(this.f77640b);
            com.ss.android.ugc.aweme.compliance.common.c.a.a("/aweme/v1/ad/ba/quitcheck/", 0);
        }
    }

    public final void a(DialogInterface dialogInterface) {
        com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", "changeAccountToPersonal: Start switch to personal account");
        com.ss.android.ugc.aweme.compliance.privacy.a.a.f().j().switchProAccount(0, null, null, 0, new b(this, dialogInterface));
    }

    public final void b(boolean z) {
        this.f77636b.f77453e.setValue(true);
        this.f77636b.f77452d.setValue(Boolean.valueOf(z));
    }

    /* access modifiers changed from: package-private */
    public static final class k extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ int $positiveButtonStringID;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(48054);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar, int i2) {
            super(1);
            this.this$0 = cVar;
            this.$positiveButtonStringID = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(this.$positiveButtonStringID, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.c.k.AnonymousClass1 */
                final /* synthetic */ k this$0;

                static {
                    Covode.recordClassIndex(48055);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    com.bytedance.tux.dialog.b.a aVar2 = aVar;
                    l.d(aVar2, "");
                    com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", "Switch to personal account dialog: user confirm");
                    this.this$0.this$0.a(aVar2.a());
                    return z.f158842a;
                }
            });
            bVar2.b(R.string.ew2, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.c.k.AnonymousClass2 */
                final /* synthetic */ k this$0;

                static {
                    Covode.recordClassIndex(48056);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", "Switch to personal account dialog: user cancel");
                    return z.f158842a;
                }
            });
            bVar2.f44820b = true;
            return z.f158842a;
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f77643a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f77644b;

        static {
            Covode.recordClassIndex(48040);
        }

        e(c cVar, Context context) {
            this.f77643a = cVar;
            this.f77644b = context;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.tux.dialog.e a2;
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", "requestVerificationWhenChangePrivate: onSuccess");
            if (((VerificationResponse) obj).shouldShowChangeMobileDialog()) {
                com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", "requestVerificationWhenChangePrivate: onSuccess, shouldShowChangeMobileDialog");
                a2.b(((com.bytedance.tux.dialog.e) new com.bytedance.tux.dialog.e(this.f77644b).a(R.string.fe4).b(R.string.fe5)).a(R.string.fe1, new DialogInterface.OnClickListener(this) {
                    /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.c.e.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ e f77645a;

                    static {
                        Covode.recordClassIndex(48041);
                    }

                    {
                        this.f77645a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        com.ss.android.ugc.aweme.as.a.a();
                        this.f77645a.f77643a.a(true);
                    }
                }).o.getText(R.string.a9e), false, null).a().b().show();
                return;
            }
            com.ss.android.ugc.aweme.as.a.a();
            this.f77643a.a(true);
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", "requestVerificationWhenChangePrivate: onSuccess, updatePrivateAccountOn");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f77647a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f77648b;

        static {
            Covode.recordClassIndex(48043);
        }

        g(c cVar, boolean z) {
            this.f77647a = cVar;
            this.f77648b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f77647a.f77636b.f77452d.setValue(Boolean.valueOf(this.f77648b));
            this.f77647a.f77636b.f77453e.setValue(false);
            this.f77647a.f77636b.a();
            if (this.f77647a.b()) {
                this.f77647a.f77636b.f77454f.setValue(false);
                com.ss.android.ugc.aweme.compliance.privacy.a.a.a(false);
            }
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.profile.b.g());
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", new h.f.a.b<com.ss.android.ugc.aweme.app.f.c, com.ss.android.ugc.aweme.app.f.c>(this) {
                /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.c.g.AnonymousClass1 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(48044);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ com.ss.android.ugc.aweme.app.f.c invoke(com.ss.android.ugc.aweme.app.f.c cVar) {
                    com.ss.android.ugc.aweme.app.f.c cVar2 = cVar;
                    l.d(cVar2, "");
                    com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "Change private account success");
                    return com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "target_value", this.this$0.f77647a.f77636b.f77452d.getValue());
                }
            });
            com.ss.android.ugc.aweme.compliance.common.c.a.a("/tiktok/privacy/user/private_account/update/v1", 0);
        }
    }

    public final void a(User user) {
        int i2;
        int i3;
        if (user == null || user.getAccountType() != 3) {
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", "RebrandCreatorToolExperiment enabled and not business account: changeAccountToPersonal");
            a((DialogInterface) null);
            return;
        }
        if (user.getAccountType() != 3) {
            i2 = R.string.ew3;
        } else if (user.getCommerceUserLevel() == 2) {
            i2 = R.string.gkt;
        } else {
            i2 = R.string.gku;
        }
        if (user.getAccountType() == 3) {
            i3 = R.string.gkz;
        } else {
            i3 = R.string.ew1;
        }
        View view = this.itemView;
        l.b(view, "");
        Context context = view.getContext();
        l.b(context, "");
        com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(context).a(R.string.ew4).b(i2), new k(this, i3)).a().b().show();
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f77641a;

        static {
            Covode.recordClassIndex(48038);
        }

        d(c cVar) {
            this.f77641a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) th;
                if (TextUtils.isEmpty(aVar.getErrorMsg())) {
                    View view = this.f77641a.itemView;
                    l.b(view, "");
                    new com.bytedance.tux.g.b(view).e(R.string.bpa).b();
                } else {
                    View view2 = this.f77641a.itemView;
                    l.b(view2, "");
                    Context context = view2.getContext();
                    l.b(context, "");
                    com.bytedance.tux.dialog.b.c.a(new com.bytedance.tux.dialog.b(context).d(aVar.getErrorMsg()), AnonymousClass1.f77642a).a().b().show();
                }
            } else {
                View view3 = this.f77641a.itemView;
                l.b(view3, "");
                new com.bytedance.tux.g.b(view3).e(R.string.de9).b();
            }
            l.b(th, "");
            String a2 = com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(th);
            String b2 = com.ss.android.ugc.aweme.compliance.privacy.utils.a.b(th);
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", "Business account: quit check error - " + a2 + " - " + b2);
            com.ss.android.ugc.aweme.compliance.common.c.a.a("/aweme/v1/ad/ba/quitcheck/", a2, b2);
        }
    }

    static final class j implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f77653a;

        static {
            Covode.recordClassIndex(48053);
        }

        j(c cVar) {
            this.f77653a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", "Close private account alert dialog: user cancel");
        }
    }

    static final class i implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f77652a;

        static {
            Covode.recordClassIndex(48052);
        }

        i(c cVar) {
            this.f77652a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", "Close private account alert dialog: user confirm");
            this.f77652a.a(false);
            ab.a("change_approve").b(StringSet.type, "account").f();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(View view, PrivacySettingViewModel privacySettingViewModel) {
        super(view);
        l.d(view, "");
        l.d(privacySettingViewModel, "");
        this.f77636b = privacySettingViewModel;
    }

    public final void a(boolean z, boolean z2) {
        this.f77635a.a(a.a(z, z2).a(new g(this, z), new h(this)));
    }

    /* access modifiers changed from: package-private */
    public static final class b implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f77637a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DialogInterface f77638b;

        static {
            Covode.recordClassIndex(48036);
        }

        b(c cVar, DialogInterface dialogInterface) {
            this.f77637a = cVar;
            this.f77638b = dialogInterface;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i2 == 14 && i3 == 1) {
                com.ss.android.ugc.aweme.compliance.privacy.a.a.f().e().queryUser();
                View view = this.f77637a.itemView;
                l.b(view, "");
                new com.bytedance.tux.g.b(view).e(R.string.ew5).b();
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.setting.d.b());
                com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", "changeAccountToPersonal: Switch to personal account success");
            } else {
                View view2 = this.f77637a.itemView;
                l.b(view2, "");
                new com.bytedance.tux.g.b(view2).e(R.string.de9).b();
                com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", "changeAccountToPersonal: Switch to personal account fail");
            }
            DialogInterface dialogInterface = this.f77638b;
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }
}
