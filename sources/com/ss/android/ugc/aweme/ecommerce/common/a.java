package com.ss.android.ugc.aweme.ecommerce.common;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.util.i;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonActionInfo;
import com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import com.ss.android.ugc.aweme.ecommerce.router.j;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.a.b;
import h.f.b.l;
import h.p;
import h.z;

public final class a implements b<com.bytedance.tux.dialog.b.a, z> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f85700a;

    /* renamed from: b  reason: collision with root package name */
    public final ButtonAction f85701b;

    /* renamed from: c  reason: collision with root package name */
    public final h.f.a.a<z> f85702c;

    /* renamed from: d  reason: collision with root package name */
    public final b<FetchInfo, z> f85703d;

    /* renamed from: e  reason: collision with root package name */
    public final b<ButtonAction, Boolean> f85704e;

    static {
        Covode.recordClassIndex(53597);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: h.f.a.b<com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.f.a.b
    public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
        b<ButtonAction, Boolean> bVar;
        Integer buttonActionType;
        l.d(aVar, "");
        ButtonAction buttonAction = this.f85701b;
        if (buttonAction != null && (((bVar = this.f85704e) == null || !bVar.invoke(buttonAction).booleanValue()) && ((buttonActionType = buttonAction.getButtonActionType()) == null || buttonActionType.intValue() != 0))) {
            if (buttonActionType != null && buttonActionType.intValue() == 1) {
                this.f85702c.invoke();
            } else {
                Object obj = null;
                if (buttonActionType != null && buttonActionType.intValue() == 2) {
                    b<FetchInfo, z> bVar2 = this.f85703d;
                    if (bVar2 != 0) {
                        ButtonActionInfo buttonActionInfo = buttonAction.getButtonActionInfo();
                        if (buttonActionInfo != null) {
                            obj = buttonActionInfo.getFetchInfo();
                        }
                        bVar2.invoke(obj);
                    }
                } else if (buttonActionType != null) {
                    if (buttonActionType.intValue() == 3) {
                        ButtonActionInfo buttonActionInfo2 = buttonAction.getButtonActionInfo();
                        if (!(buttonActionInfo2 == null || buttonActionInfo2.getSchema() == null)) {
                            ButtonActionInfo buttonActionInfo3 = buttonAction.getButtonActionInfo();
                            if (buttonActionInfo3 != null) {
                                obj = buttonActionInfo3.getSchema();
                            }
                            if (!l.a(obj, (Object) "")) {
                                SmartRouter.buildRoute(this.f85700a, j.c(buttonAction.getButtonActionInfo().getSchema(), ag.c(new p("trackParams", i.a().b(ag.c(new p("previous_page", "order_submit"))))))).open();
                            }
                        }
                    } else if (buttonActionType.intValue() == 4) {
                        ButtonActionInfo buttonActionInfo4 = buttonAction.getButtonActionInfo();
                        if (!(buttonActionInfo4 == null || buttonActionInfo4.getSchema() == null)) {
                            ButtonActionInfo buttonActionInfo5 = buttonAction.getButtonActionInfo();
                            if (buttonActionInfo5 != null) {
                                obj = buttonActionInfo5.getSchema();
                            }
                            if (!l.a(obj, (Object) "")) {
                                SmartRouter.buildRoute(this.f85700a, j.c(buttonAction.getButtonActionInfo().getSchema(), ag.c(new p("trackParams", i.a().b(ag.c(new p("previous_page", "order_submit"))))))).open();
                                h.f.a.a<z> aVar2 = this.f85702c;
                                if (aVar2 != null) {
                                    aVar2.invoke();
                                }
                            }
                        }
                        new com.ss.android.ugc.aweme.tux.a.i.a(this.f85700a).a(R.string.fy7).a();
                    }
                }
            }
        }
        return z.f158842a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, ButtonAction buttonAction, h.f.a.a<z> aVar, b<? super FetchInfo, z> bVar, b<? super ButtonAction, Boolean> bVar2) {
        l.d(context, "");
        l.d(aVar, "");
        this.f85700a = context;
        this.f85701b = buttonAction;
        this.f85702c = aVar;
        this.f85703d = bVar;
        this.f85704e = bVar2;
    }
}
