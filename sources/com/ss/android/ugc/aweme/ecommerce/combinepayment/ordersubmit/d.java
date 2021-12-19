package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.a;
import com.bytedance.tux.dialog.b.e;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.bo;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogContent;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f84858a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(53007);
    }

    static final class c extends m implements h.f.a.b<com.bytedance.tux.dialog.b.d, z> {
        final /* synthetic */ h.f.a.b $buttonRefetchAction$inlined;
        final /* synthetic */ h.f.a.a $closePage$inlined;
        final /* synthetic */ DialogContent $content$inlined;
        final /* synthetic */ Context $context$inlined;
        final /* synthetic */ int $direction$inlined;
        final /* synthetic */ String $errorCode$inlined;
        final /* synthetic */ List $list;
        final /* synthetic */ boolean $needSendLog;
        final /* synthetic */ h.f.a.a $openPaymentAction$inlined;
        final /* synthetic */ com.bytedance.tux.dialog.b $this_apply$inlined;

        static {
            Covode.recordClassIndex(53010);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(List list, boolean z, com.bytedance.tux.dialog.b bVar, int i2, String str, DialogContent dialogContent, Context context, h.f.a.a aVar, h.f.a.b bVar2, h.f.a.a aVar2) {
            super(1);
            this.$list = list;
            this.$needSendLog = z;
            this.$this_apply$inlined = bVar;
            this.$direction$inlined = i2;
            this.$errorCode$inlined = str;
            this.$content$inlined = dialogContent;
            this.$context$inlined = context;
            this.$closePage$inlined = aVar;
            this.$buttonRefetchAction$inlined = bVar2;
            this.$openPaymentAction$inlined = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.d dVar) {
            String str;
            com.bytedance.tux.dialog.b.d dVar2 = dVar;
            String str2 = "";
            l.d(dVar2, str2);
            String str3 = null;
            if (n.h(this.$list) != null) {
                String text = ((DialogButton) n.g(this.$list)).getText();
                if (text == null) {
                    text = str2;
                }
                Context context = this.$context$inlined;
                ButtonAction buttonAction = ((DialogButton) n.g(this.$list)).getButtonAction();
                h.f.a.a aVar = this.$closePage$inlined;
                h.f.a.b bVar = this.$buttonRefetchAction$inlined;
                h.f.a.a aVar2 = this.$openPaymentAction$inlined;
                if (this.$needSendLog) {
                    str = this.$errorCode$inlined;
                } else {
                    str = null;
                }
                dVar2.a(text, new b(context, buttonAction, aVar, bVar, aVar2, str));
            }
            if (n.b(this.$list, 1) != null) {
                String text2 = ((DialogButton) this.$list.get(1)).getText();
                if (text2 != null) {
                    str2 = text2;
                }
                Context context2 = this.$context$inlined;
                ButtonAction buttonAction2 = ((DialogButton) this.$list.get(1)).getButtonAction();
                h.f.a.a aVar3 = this.$closePage$inlined;
                h.f.a.b bVar2 = this.$buttonRefetchAction$inlined;
                h.f.a.a aVar4 = this.$openPaymentAction$inlined;
                if (this.$needSendLog) {
                    str3 = this.$errorCode$inlined;
                }
                dVar2.b(str2, new b(context2, buttonAction2, aVar3, bVar2, aVar4, str3));
            }
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.d$d  reason: collision with other inner class name */
    static final class C2030d extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ h.f.a.b $buttonRefetchAction$inlined;
        final /* synthetic */ h.f.a.a $closePage$inlined;
        final /* synthetic */ DialogContent $content$inlined;
        final /* synthetic */ Context $context$inlined;
        final /* synthetic */ int $direction$inlined;
        final /* synthetic */ String $errorCode$inlined;
        final /* synthetic */ List $list;
        final /* synthetic */ boolean $needSendLog;
        final /* synthetic */ h.f.a.a $openPaymentAction$inlined;
        final /* synthetic */ com.bytedance.tux.dialog.b $this_apply$inlined;

        static {
            Covode.recordClassIndex(53011);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2030d(List list, boolean z, com.bytedance.tux.dialog.b bVar, int i2, String str, DialogContent dialogContent, Context context, h.f.a.a aVar, h.f.a.b bVar2, h.f.a.a aVar2) {
            super(1);
            this.$list = list;
            this.$needSendLog = z;
            this.$this_apply$inlined = bVar;
            this.$direction$inlined = i2;
            this.$errorCode$inlined = str;
            this.$content$inlined = dialogContent;
            this.$context$inlined = context;
            this.$closePage$inlined = aVar;
            this.$buttonRefetchAction$inlined = bVar2;
            this.$openPaymentAction$inlined = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            String str;
            String str2;
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            String str3 = "";
            l.d(bVar2, str3);
            String str4 = null;
            if (n.h(this.$list) != null) {
                String text = ((DialogButton) n.g(this.$list)).getText();
                if (text == null) {
                    text = str3;
                }
                Context context = this.$context$inlined;
                ButtonAction buttonAction = ((DialogButton) n.g(this.$list)).getButtonAction();
                h.f.a.a aVar = this.$closePage$inlined;
                h.f.a.b bVar3 = this.$buttonRefetchAction$inlined;
                h.f.a.a aVar2 = this.$openPaymentAction$inlined;
                if (this.$needSendLog) {
                    str2 = this.$errorCode$inlined;
                } else {
                    str2 = null;
                }
                bVar2.a(text, new b(context, buttonAction, aVar, bVar3, aVar2, str2));
            }
            if (n.b(this.$list, 1) != null) {
                String text2 = ((DialogButton) this.$list.get(1)).getText();
                if (text2 == null) {
                    text2 = str3;
                }
                Context context2 = this.$context$inlined;
                ButtonAction buttonAction2 = ((DialogButton) this.$list.get(1)).getButtonAction();
                h.f.a.a aVar3 = this.$closePage$inlined;
                h.f.a.b bVar4 = this.$buttonRefetchAction$inlined;
                h.f.a.a aVar4 = this.$openPaymentAction$inlined;
                if (this.$needSendLog) {
                    str = this.$errorCode$inlined;
                } else {
                    str = null;
                }
                bVar2.b(text2, new b(context2, buttonAction2, aVar3, bVar4, aVar4, str));
            }
            if (n.b(this.$list, 2) != null) {
                String text3 = ((DialogButton) this.$list.get(2)).getText();
                if (text3 != null) {
                    str3 = text3;
                }
                Context context3 = this.$context$inlined;
                ButtonAction buttonAction3 = ((DialogButton) this.$list.get(2)).getButtonAction();
                h.f.a.a aVar5 = this.$closePage$inlined;
                h.f.a.b bVar5 = this.$buttonRefetchAction$inlined;
                h.f.a.a aVar6 = this.$openPaymentAction$inlined;
                if (this.$needSendLog) {
                    str4 = this.$errorCode$inlined;
                }
                bVar2.c(str3, new b(context3, buttonAction3, aVar5, bVar5, aVar6, str4));
            }
            if (this.$direction$inlined == 1) {
                bVar2.f44820b = true;
            }
            return z.f158842a;
        }
    }

    public static final class b extends com.ss.android.ugc.aweme.secapi.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ExceptionUX f84862a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f84863b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f84864c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f84865d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f84866e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f84867f;

        static {
            Covode.recordClassIndex(53009);
        }

        @Override // com.ss.android.ugc.aweme.secapi.a
        public final void a(boolean z, int i2) {
            if (z) {
                h.f.a.a aVar = this.f84863b;
                if (aVar != null) {
                    aVar.invoke();
                }
            } else if (!this.f84864c) {
                this.f84865d.invoke();
            }
        }

        b(ExceptionUX exceptionUX, h.f.a.a aVar, boolean z, h.f.a.a aVar2, Context context, h.f.a.a aVar3) {
            this.f84862a = exceptionUX;
            this.f84863b = aVar;
            this.f84864c = z;
            this.f84865d = aVar2;
            this.f84866e = context;
            this.f84867f = aVar3;
        }
    }

    static final class a implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f84859a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f84860b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f84861c;

        static {
            Covode.recordClassIndex(53008);
        }

        a(h.f.a.a aVar, boolean z, h.f.a.a aVar2) {
            this.f84859a = aVar;
            this.f84860b = z;
            this.f84861c = aVar2;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i2 == 1 && i3 == 1) {
                h.f.a.a aVar = this.f84859a;
                if (aVar != null) {
                    aVar.invoke();
                }
            } else if (!this.f84860b) {
                this.f84861c.invoke();
            }
        }
    }

    private static void a(Context context, boolean z, h.f.a.a<z> aVar) {
        if (!z) {
            aVar.invoke();
        } else {
            new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.fwt).a();
        }
    }

    public static void a(Context context, String str, ExceptionUX exceptionUX, boolean z, h.f.a.a<z> aVar, h.f.a.a<z> aVar2, h.f.a.a<z> aVar3, h.f.a.b<? super FetchInfo, z> bVar, h.f.a.a<z> aVar4, h.f.a.a<z> aVar5) {
        int parseInt;
        int i2;
        boolean z2;
        boolean booleanValue;
        Context context2 = context;
        l.d(context2, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        if (exceptionUX == null) {
            a(context2, z, aVar);
            return;
        }
        Integer exceptionUXType = exceptionUX.getExceptionUXType();
        if (exceptionUXType != null) {
            if (exceptionUXType.intValue() == 0) {
                if (!z) {
                    aVar.invoke();
                } else if (exceptionUX.getToastContent() != null) {
                    Integer duration = exceptionUX.getToastContent().getDuration();
                    if (duration == null || duration.intValue() <= 0) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(context2).a(exceptionUX.getToastContent().getMessage()).a();
                    } else {
                        new com.ss.android.ugc.aweme.tux.a.i.a(context2).a(exceptionUX.getToastContent().getMessage()).a();
                    }
                } else {
                    a(context2, z, aVar);
                }
            } else if (exceptionUXType != null) {
                if (exceptionUXType.intValue() == 1) {
                    if (exceptionUX.getDialogContent() != null) {
                        DialogContent dialogContent = exceptionUX.getDialogContent();
                        com.bytedance.tux.dialog.b a2 = a.C1094a.a(context2);
                        h.a("server", str, 4);
                        String title = dialogContent.getTitle();
                        if (title != null) {
                            a2.b(title);
                        }
                        a2.d(dialogContent.getMessage());
                        Boolean hasCloseButton = dialogContent.getHasCloseButton();
                        if (hasCloseButton != null && (booleanValue = hasCloseButton.booleanValue())) {
                            com.bytedance.tux.dialog.b.a(a2, booleanValue);
                        }
                        Integer buttonDirection = dialogContent.getButtonDirection();
                        if (buttonDirection != null) {
                            i2 = buttonDirection.intValue();
                        } else {
                            i2 = 0;
                        }
                        List<DialogButton> dialogButtons = dialogContent.getDialogButtons();
                        if (dialogButtons != null) {
                            if (dialogButtons.size() > 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            Integer dialogType = dialogContent.getDialogType();
                            if (dialogType != null && dialogType.intValue() == 1) {
                                e.a(a2, new c(dialogButtons, z2, a2, i2, str, dialogContent, context2, aVar2, bVar, aVar4));
                            } else {
                                com.bytedance.tux.dialog.b.c.a(a2, new C2030d(dialogButtons, z2, a2, i2, str, dialogContent, context2, aVar2, bVar, aVar4));
                            }
                        }
                        a2.a(false);
                        a2.a().b().show();
                        return;
                    }
                    a(context2, z, aVar);
                } else if (exceptionUXType.intValue() != 2) {
                    Activity activity = null;
                    if (exceptionUXType != null) {
                        if (exceptionUXType.intValue() == 3) {
                            if (!(context2 instanceof Activity)) {
                                context2 = null;
                            }
                            Activity activity2 = (Activity) context2;
                            if (activity2 != null) {
                                bo g2 = AccountService.a().g();
                                IAccountService.d dVar = new IAccountService.d();
                                dVar.f62401a = activity2;
                                dVar.f62405e = new a(aVar3, z, aVar2);
                                g2.showLoginAndRegisterView(dVar.a());
                            }
                        } else if (exceptionUXType.intValue() == 4) {
                            if (context2 instanceof Activity) {
                                activity = context2;
                            }
                            Activity activity3 = activity;
                            if (activity3 != null) {
                                String verificationContent = exceptionUX.getVerificationContent();
                                if (verificationContent == null || (parseInt = Integer.parseInt(verificationContent)) == -1) {
                                    a(context2, z, aVar);
                                } else {
                                    SecApiImpl.a().popCaptcha(activity3, parseInt, new b(exceptionUX, aVar3, z, aVar2, context2, aVar));
                                }
                            }
                        } else if (exceptionUXType.intValue() == 5) {
                            aVar5.invoke();
                        }
                    }
                } else if (aVar3 != null) {
                    aVar3.invoke();
                }
            }
        }
    }
}
