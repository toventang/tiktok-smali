package com.ss.android.ugc.aweme.ecommerce.common;

import android.app.Activity;
import android.content.Context;
import android.view.View;
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
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f85739a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(53620);
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<com.bytedance.tux.dialog.b.d, z> {
        final /* synthetic */ h.f.a.b $buttonRefetchAction$inlined;
        final /* synthetic */ h.f.a.a $closePage$inlined;
        final /* synthetic */ DialogContent $content$inlined;
        final /* synthetic */ h.f.a.b $dealButtonAction$inlined;
        final /* synthetic */ int $direction$inlined;
        final /* synthetic */ List $list;
        final /* synthetic */ com.bytedance.tux.dialog.b $this_apply$inlined;

        static {
            Covode.recordClassIndex(53623);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(List list, com.bytedance.tux.dialog.b bVar, int i2, DialogContent dialogContent, h.f.a.a aVar, h.f.a.b bVar2, h.f.a.b bVar3) {
            super(1);
            this.$list = list;
            this.$this_apply$inlined = bVar;
            this.$direction$inlined = i2;
            this.$content$inlined = dialogContent;
            this.$closePage$inlined = aVar;
            this.$buttonRefetchAction$inlined = bVar2;
            this.$dealButtonAction$inlined = bVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.d dVar) {
            com.bytedance.tux.dialog.b.d dVar2 = dVar;
            String str = "";
            l.d(dVar2, str);
            if (n.h(this.$list) != null) {
                String text = ((DialogButton) n.g(this.$list)).getText();
                if (text == null) {
                    text = str;
                }
                dVar2.a(text, new a(this.$this_apply$inlined.o, ((DialogButton) n.g(this.$list)).getButtonAction(), this.$closePage$inlined, this.$buttonRefetchAction$inlined, this.$dealButtonAction$inlined));
            }
            if (n.b(this.$list, 1) != null) {
                String text2 = ((DialogButton) this.$list.get(1)).getText();
                if (text2 != null) {
                    str = text2;
                }
                dVar2.b(str, new a(this.$this_apply$inlined.o, ((DialogButton) this.$list.get(1)).getButtonAction(), this.$closePage$inlined, this.$buttonRefetchAction$inlined, this.$dealButtonAction$inlined));
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.common.d$d  reason: collision with other inner class name */
    public static final class C2053d extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ h.f.a.b $buttonRefetchAction$inlined;
        final /* synthetic */ h.f.a.a $closePage$inlined;
        final /* synthetic */ DialogContent $content$inlined;
        final /* synthetic */ h.f.a.b $dealButtonAction$inlined;
        final /* synthetic */ int $direction$inlined;
        final /* synthetic */ List $list;
        final /* synthetic */ com.bytedance.tux.dialog.b $this_apply$inlined;

        static {
            Covode.recordClassIndex(53624);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2053d(List list, com.bytedance.tux.dialog.b bVar, int i2, DialogContent dialogContent, h.f.a.a aVar, h.f.a.b bVar2, h.f.a.b bVar3) {
            super(1);
            this.$list = list;
            this.$this_apply$inlined = bVar;
            this.$direction$inlined = i2;
            this.$content$inlined = dialogContent;
            this.$closePage$inlined = aVar;
            this.$buttonRefetchAction$inlined = bVar2;
            this.$dealButtonAction$inlined = bVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            String str = "";
            l.d(bVar2, str);
            if (n.h(this.$list) != null) {
                String text = ((DialogButton) n.g(this.$list)).getText();
                if (text == null) {
                    text = str;
                }
                bVar2.a(text, new a(this.$this_apply$inlined.o, ((DialogButton) n.g(this.$list)).getButtonAction(), this.$closePage$inlined, this.$buttonRefetchAction$inlined, this.$dealButtonAction$inlined));
            }
            if (n.b(this.$list, 1) != null) {
                String text2 = ((DialogButton) this.$list.get(1)).getText();
                if (text2 == null) {
                    text2 = str;
                }
                bVar2.b(text2, new a(this.$this_apply$inlined.o, ((DialogButton) this.$list.get(1)).getButtonAction(), this.$closePage$inlined, this.$buttonRefetchAction$inlined, this.$dealButtonAction$inlined));
            }
            if (n.b(this.$list, 2) != null) {
                String text3 = ((DialogButton) this.$list.get(2)).getText();
                if (text3 != null) {
                    str = text3;
                }
                bVar2.c(str, new a(this.$this_apply$inlined.o, ((DialogButton) this.$list.get(2)).getButtonAction(), this.$closePage$inlined, this.$buttonRefetchAction$inlined, this.$dealButtonAction$inlined));
            }
            if (this.$direction$inlined == 1) {
                bVar2.f44820b = true;
            }
            return z.f158842a;
        }
    }

    public static final class b extends com.ss.android.ugc.aweme.secapi.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ExceptionUX f85743a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f85744b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f85745c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f85746d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View f85747e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f85748f;

        static {
            Covode.recordClassIndex(53622);
        }

        @Override // com.ss.android.ugc.aweme.secapi.a
        public final void a(boolean z, int i2) {
            if (z) {
                h.f.a.a aVar = this.f85744b;
                if (aVar != null) {
                    aVar.invoke();
                }
            } else if (!this.f85745c) {
                this.f85746d.invoke();
            }
        }

        b(ExceptionUX exceptionUX, h.f.a.a aVar, boolean z, h.f.a.a aVar2, View view, h.f.a.a aVar3) {
            this.f85743a = exceptionUX;
            this.f85744b = aVar;
            this.f85745c = z;
            this.f85746d = aVar2;
            this.f85747e = view;
            this.f85748f = aVar3;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f85740a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f85741b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f85742c;

        static {
            Covode.recordClassIndex(53621);
        }

        a(h.f.a.a aVar, boolean z, h.f.a.a aVar2) {
            this.f85740a = aVar;
            this.f85741b = z;
            this.f85742c = aVar2;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i2 == 1 && i3 == 1) {
                h.f.a.a aVar = this.f85740a;
                if (aVar != null) {
                    aVar.invoke();
                }
            } else if (!this.f85741b) {
                this.f85742c.invoke();
            }
        }
    }

    private static void a(View view, boolean z, h.f.a.a<z> aVar) {
        if (!z) {
            aVar.invoke();
        } else if (view != null) {
            new com.bytedance.tux.g.b(view).e(R.string.fwt).b();
        }
    }

    private static void a(Context context, boolean z, h.f.a.a<z> aVar, h.f.a.a<z> aVar2) {
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            bo g2 = AccountService.a().g();
            IAccountService.d dVar = new IAccountService.d();
            dVar.f62401a = activity;
            dVar.f62405e = new a(null, true, aVar);
            g2.showLoginAndRegisterView(dVar.a());
        }
    }

    private static void a(View view, ExceptionUX exceptionUX, boolean z, h.f.a.a<z> aVar) {
        if (exceptionUX.getToastContent() != null) {
            Integer duration = exceptionUX.getToastContent().getDuration();
            if (duration == null || duration.intValue() <= 0) {
                if (view != null) {
                    new com.bytedance.tux.g.b(view).a(exceptionUX.getToastContent().getMessage()).b();
                }
            } else if (view != null) {
                new com.bytedance.tux.g.b(view).a(exceptionUX.getToastContent().getMessage()).b();
            }
        } else {
            a(view, true, aVar);
        }
    }

    public static void a(View view, ExceptionUX exceptionUX, h.f.a.a<z> aVar, h.f.a.a<z> aVar2, h.f.a.b<? super ButtonAction, Boolean> bVar) {
        Context context;
        l.d(aVar, "");
        l.d(aVar2, "");
        if (exceptionUX == null) {
            a(view, true, aVar);
            return;
        }
        Integer exceptionUXType = exceptionUX.getExceptionUXType();
        if (exceptionUXType != null) {
            if (exceptionUXType.intValue() == 0) {
                a(view, exceptionUX, true, aVar);
            } else if (exceptionUXType.intValue() == 1) {
                a(view, exceptionUX, true, aVar, aVar2, null, bVar);
            } else if (exceptionUXType.intValue() != 2) {
                if (exceptionUXType.intValue() == 3) {
                    if (view != null) {
                        context = view.getContext();
                    } else {
                        context = null;
                    }
                    a(context, true, aVar2, (h.f.a.a<z>) null);
                } else if (exceptionUXType.intValue() == 4) {
                    a(view, exceptionUX, true, aVar, aVar2, null);
                }
            }
        }
    }

    private static void a(View view, ExceptionUX exceptionUX, boolean z, h.f.a.a<z> aVar, h.f.a.a<z> aVar2, h.f.a.a<z> aVar3) {
        Context context;
        int parseInt;
        Activity activity = null;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        if (context instanceof Activity) {
            activity = context;
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            String verificationContent = exceptionUX.getVerificationContent();
            if (verificationContent == null || (parseInt = Integer.parseInt(verificationContent)) == -1) {
                a(view, true, aVar);
            } else {
                SecApiImpl.a().popCaptcha(activity2, parseInt, new b(exceptionUX, null, true, aVar2, view, aVar));
            }
        }
    }

    private static void a(View view, ExceptionUX exceptionUX, boolean z, h.f.a.a<z> aVar, h.f.a.a<z> aVar2, h.f.a.b<? super FetchInfo, z> bVar, h.f.a.b<? super ButtonAction, Boolean> bVar2) {
        int i2;
        boolean booleanValue;
        if (exceptionUX.getDialogContent() == null || view == null || view.getContext() == null) {
            a(view, true, aVar);
            return;
        }
        DialogContent dialogContent = exceptionUX.getDialogContent();
        Context context = view.getContext();
        l.b(context, "");
        com.bytedance.tux.dialog.b a2 = a.C1094a.a(context);
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
            Integer dialogType = dialogContent.getDialogType();
            if (dialogType != null && dialogType.intValue() == 1) {
                e.a(a2, new c(dialogButtons, a2, i2, dialogContent, aVar2, null, bVar2));
            } else {
                com.bytedance.tux.dialog.b.c.a(a2, new C2053d(dialogButtons, a2, i2, dialogContent, aVar2, null, bVar2));
            }
        }
        a2.a(false);
        a2.a().b().show();
    }
}
