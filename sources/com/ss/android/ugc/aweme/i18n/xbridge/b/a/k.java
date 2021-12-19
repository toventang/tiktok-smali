package com.ss.android.ugc.aweme.i18n.xbridge.b.a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.depend.ActionSheetBuilder;
import com.bytedance.ies.xbridge.base.runtime.depend.DialogBuilder;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.ShowActionSheetListener;
import com.bytedance.ies.xbridge.base.runtime.depend.ToastBuilder;
import com.bytedance.ies.xbridge.model.b.c;
import com.ss.android.ugc.aweme.bullet.BulletContainerActivity;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class k implements IHostStyleUIDepend {
    static {
        Covode.recordClassIndex(63727);
    }

    static final class b extends m implements h.f.a.b<com.bytedance.tux.dialog.a, z> {
        final /* synthetic */ DialogBuilder $dialogBuilder;

        static {
            Covode.recordClassIndex(63731);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DialogBuilder dialogBuilder) {
            super(1);
            this.$dialogBuilder = dialogBuilder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.a aVar) {
            DialogInterface.OnCancelListener cancelListener;
            com.bytedance.tux.dialog.a aVar2 = aVar;
            l.d(aVar2, "");
            if (aVar2.f44884j == null && (cancelListener = this.$dialogBuilder.getCancelListener()) != null) {
                cancelListener.onCancel(aVar2);
            }
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ String $confirmText;
        final /* synthetic */ DialogBuilder $dialogBuilder;

        static {
            Covode.recordClassIndex(63728);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, DialogBuilder dialogBuilder) {
            super(1);
            this.$confirmText = str;
            this.$dialogBuilder = dialogBuilder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            String str = this.$confirmText;
            if (str == null) {
                str = "confirm";
            }
            bVar2.a(str, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.i18n.xbridge.b.a.k.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(63729);
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
                    DialogInterface.OnClickListener positiveClickListener = this.this$0.$dialogBuilder.getPositiveClickListener();
                    if (positiveClickListener != null) {
                        positiveClickListener.onClick(aVar2.a(), -1);
                    }
                    return z.f158842a;
                }
            });
            if (!(this.$dialogBuilder.getNegativeBtnText() == null || this.$dialogBuilder.getNegativeClickListener() == null)) {
                String negativeBtnText = this.$dialogBuilder.getNegativeBtnText();
                if (negativeBtnText == null) {
                    negativeBtnText = "cancel";
                }
                bVar2.b(negativeBtnText, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                    /* class com.ss.android.ugc.aweme.i18n.xbridge.b.a.k.a.AnonymousClass2 */
                    final /* synthetic */ a this$0;

                    static {
                        Covode.recordClassIndex(63730);
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
                        DialogInterface.OnClickListener negativeClickListener = this.this$0.$dialogBuilder.getNegativeClickListener();
                        if (negativeClickListener != null) {
                            negativeClickListener.onClick(aVar2.a(), -2);
                        }
                        return z.f158842a;
                    }
                });
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public final Boolean hideLoading(c cVar) {
        Context context;
        Activity a2;
        if (cVar == null || (context = (Context) cVar.a(Context.class)) == null || (a2 = com.bytedance.ies.xbridge.o.a.a(context)) == null || !(a2 instanceof BulletContainerActivity)) {
            return false;
        }
        if (!a2.isFinishing()) {
            ((com.bytedance.ies.bullet.ui.common.a) a2).m();
        }
        return true;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public final Boolean showLoading(c cVar) {
        Context context;
        Activity a2;
        if (cVar == null || (context = (Context) cVar.a(Context.class)) == null || (a2 = com.bytedance.ies.xbridge.o.a.a(context)) == null || !(a2 instanceof BulletContainerActivity)) {
            return false;
        }
        if (!a2.isFinishing()) {
            ((com.bytedance.ies.bullet.ui.common.a) a2).l();
        }
        return true;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public final Boolean showDialog(DialogBuilder dialogBuilder) {
        l.d(dialogBuilder, "");
        Activity a2 = com.bytedance.ies.xbridge.o.a.a(dialogBuilder.getContext());
        if (a2 == null) {
            return false;
        }
        ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a(new com.bytedance.tux.dialog.b(a2).b(dialogBuilder.getTitle()).d(dialogBuilder.getMessage()), new a(dialogBuilder.getPositiveBtnText(), dialogBuilder)).a(dialogBuilder.getCancelOnTouchOutside()).a(new b(dialogBuilder))).a().b().show();
        return true;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public final Boolean showToast(ToastBuilder toastBuilder) {
        long j2;
        String str = "";
        l.d(toastBuilder, str);
        Activity a2 = com.bytedance.ies.xbridge.o.a.a(toastBuilder.getContext());
        if (!(a2 instanceof Activity)) {
            return false;
        }
        com.bytedance.tux.g.b bVar = new com.bytedance.tux.g.b(a2);
        String message = toastBuilder.getMessage();
        if (message != null) {
            str = message;
        }
        com.bytedance.tux.g.b a3 = bVar.a(str);
        Integer duration = toastBuilder.getDuration();
        if (duration != null) {
            j2 = (long) duration.intValue();
        } else {
            j2 = 3000;
        }
        a3.a(j2).b();
        return true;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public final Boolean showActionSheet(ActionSheetBuilder actionSheetBuilder, ShowActionSheetListener showActionSheetListener) {
        l.d(actionSheetBuilder, "");
        l.d(showActionSheetListener, "");
        return IHostStyleUIDepend.b.a(actionSheetBuilder, showActionSheetListener);
    }
}
