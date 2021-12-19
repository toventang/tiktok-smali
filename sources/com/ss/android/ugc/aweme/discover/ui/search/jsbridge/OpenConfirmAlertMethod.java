package com.ss.android.ugc.aweme.discover.ui.search.jsbridge;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.b.c;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class OpenConfirmAlertMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Context> f82645a;

    static {
        Covode.recordClassIndex(51469);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static final class a extends h.f.b.m implements b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ String $cancelText$inlined;
        final /* synthetic */ String $confirmText$inlined;
        final /* synthetic */ String $content$inlined;
        final /* synthetic */ BaseCommonJavaMethod.a $iReturn$inlined;
        final /* synthetic */ String $title$inlined;

        static {
            Covode.recordClassIndex(51470);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, String str2, String str3, BaseCommonJavaMethod.a aVar, String str4) {
            super(1);
            this.$title$inlined = str;
            this.$content$inlined = str2;
            this.$confirmText$inlined = str3;
            this.$iReturn$inlined = aVar;
            this.$cancelText$inlined = str4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(this.$confirmText$inlined, new b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.discover.ui.search.jsbridge.OpenConfirmAlertMethod.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(51471);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    BaseCommonJavaMethod.a aVar2 = this.this$0.$iReturn$inlined;
                    if (aVar2 != null) {
                        aVar2.a("confirm");
                    }
                    return z.f158842a;
                }
            });
            bVar2.b(this.$cancelText$inlined, new b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.discover.ui.search.jsbridge.OpenConfirmAlertMethod.a.AnonymousClass2 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(51472);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    BaseCommonJavaMethod.a aVar2 = this.this$0.$iReturn$inlined;
                    if (aVar2 != null) {
                        aVar2.a("cancel");
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenConfirmAlertMethod(WeakReference<Context> weakReference, com.bytedance.ies.web.a.a aVar) {
        super(aVar);
        l.d(weakReference, "");
        l.d(aVar, "");
        this.f82645a = weakReference;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        Context context;
        if (jSONObject != null) {
            try {
                String optString = jSONObject.optString("title");
                String optString2 = jSONObject.optString("content");
                String optString3 = jSONObject.optString("cancelText");
                String optString4 = jSONObject.optString("confirmText");
                if (optString == null) {
                    optString = "";
                }
                if (optString2 == null) {
                    optString2 = "";
                }
                if (optString3 == null) {
                    optString3 = "";
                }
                if (optString4 == null) {
                    optString4 = "";
                }
                l.d(optString, "");
                l.d(optString2, "");
                l.d(optString3, "");
                l.d(optString4, "");
                WeakReference<Context> weakReference = this.f82645a;
                if (weakReference != null && (context = weakReference.get()) != null) {
                    l.b(context, "");
                    ((com.bytedance.tux.dialog.b) c.a(new com.bytedance.tux.dialog.b(context).b(optString).d(androidx.core.f.b.a(optString2, 0)), new a(optString, optString2, optString4, aVar, optString3)).a(false)).a().b().show();
                }
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.discover.ui.search.b.a(e2, "DisableInterceptMethod");
                if (aVar != null) {
                    aVar.a(0, e2.getMessage());
                }
                e2.printStackTrace();
            }
        }
    }
}
