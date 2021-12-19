package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.dialog.b.a;
import com.ss.android.ugc.aweme.account.util.i;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonActionInfo;
import com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h;
import com.ss.android.ugc.aweme.ecommerce.router.j;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.p;
import h.z;

public final class b implements h.f.a.b<a, z> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f84796a;

    /* renamed from: b  reason: collision with root package name */
    public final ButtonAction f84797b;

    /* renamed from: c  reason: collision with root package name */
    public final h.f.a.a<z> f84798c;

    /* renamed from: d  reason: collision with root package name */
    public final h.f.a.b<FetchInfo, z> f84799d;

    /* renamed from: e  reason: collision with root package name */
    public final h.f.a.a<z> f84800e;

    /* renamed from: f  reason: collision with root package name */
    public final String f84801f;

    static {
        Covode.recordClassIndex(52995);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: h.f.a.b<com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.f.a.b
    public final /* synthetic */ z invoke(a aVar) {
        ButtonActionInfo buttonActionInfo;
        String schema;
        l.d(aVar, "");
        ButtonAction buttonAction = this.f84797b;
        if (buttonAction != null) {
            Integer buttonActionType = buttonAction.getButtonActionType();
            if (buttonActionType != null && buttonActionType.intValue() == 0) {
                String str = this.f84801f;
                if (str != null) {
                    h.a("server", "stay", str, 8);
                }
            } else if (buttonActionType != null && buttonActionType.intValue() == 1) {
                String str2 = this.f84801f;
                if (str2 != null) {
                    h.a("server", "quit", str2, 8);
                }
                this.f84798c.invoke();
            } else {
                Object obj = null;
                if (buttonActionType != null && buttonActionType.intValue() == 2) {
                    String str3 = this.f84801f;
                    if (str3 != null) {
                        h.a("server", "retry", str3, 8);
                    }
                    h.f.a.b<FetchInfo, z> bVar = this.f84799d;
                    if (bVar != 0) {
                        ButtonActionInfo buttonActionInfo2 = buttonAction.getButtonActionInfo();
                        if (buttonActionInfo2 != null) {
                            obj = buttonActionInfo2.getFetchInfo();
                        }
                        bVar.invoke(obj);
                    }
                } else if (buttonActionType != null) {
                    if (buttonActionType.intValue() == 3) {
                        String str4 = this.f84801f;
                        if (str4 != null) {
                            h.a("server", "enter", str4, 8);
                        }
                        ButtonActionInfo buttonActionInfo3 = buttonAction.getButtonActionInfo();
                        if (!(buttonActionInfo3 == null || buttonActionInfo3.getSchema() == null)) {
                            ButtonActionInfo buttonActionInfo4 = buttonAction.getButtonActionInfo();
                            if (buttonActionInfo4 != null) {
                                obj = buttonActionInfo4.getSchema();
                            }
                            if (!(!(!l.a(obj, (Object) "")) || (buttonActionInfo = buttonAction.getButtonActionInfo()) == null || (schema = buttonActionInfo.getSchema()) == null)) {
                                SmartRouter.buildRoute(this.f84796a, j.c(schema, ag.c(new p("trackParams", i.a().b(ag.c(new p("previous_page", "order_submit"))))))).open();
                            }
                        }
                    } else if (buttonActionType.intValue() == 4) {
                        String str5 = this.f84801f;
                        if (str5 != null) {
                            h.a("server", "enter", str5, 8);
                        }
                        ButtonActionInfo buttonActionInfo5 = buttonAction.getButtonActionInfo();
                        if (!(buttonActionInfo5 == null || buttonActionInfo5.getSchema() == null)) {
                            ButtonActionInfo buttonActionInfo6 = buttonAction.getButtonActionInfo();
                            if (buttonActionInfo6 != null) {
                                obj = buttonActionInfo6.getSchema();
                            }
                            if (!l.a(obj, (Object) "")) {
                                SmartRouter.buildRoute(this.f84796a, j.c(buttonAction.getButtonActionInfo().getSchema(), ag.c(new p("trackParams", i.a().b(ag.c(new p("previous_page", "order_submit"))))))).open();
                                h.f.a.a<z> aVar2 = this.f84798c;
                                if (aVar2 != null) {
                                    aVar2.invoke();
                                }
                            }
                        }
                        new com.ss.android.ugc.aweme.tux.a.i.a(this.f84796a).a(R.string.fy7).a();
                    } else if (buttonActionType.intValue() == 5) {
                        String str6 = this.f84801f;
                        if (str6 != null) {
                            h.a("server", "enter", str6, 8);
                        }
                        h.f.a.a<z> aVar3 = this.f84800e;
                        if (aVar3 != null) {
                            aVar3.invoke();
                        }
                    }
                }
            }
        }
        return z.f158842a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Context context, ButtonAction buttonAction, h.f.a.a<z> aVar, h.f.a.b<? super FetchInfo, z> bVar, h.f.a.a<z> aVar2, String str) {
        l.d(context, "");
        l.d(aVar, "");
        this.f84796a = context;
        this.f84797b = buttonAction;
        this.f84798c = aVar;
        this.f84799d = bVar;
        this.f84800e = aVar2;
        this.f84801f = str;
    }
}
