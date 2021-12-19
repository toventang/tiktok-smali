package com.ss.android.ugc.aweme.fe.method.im;

import android.app.Activity;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.share.ImWebSharePackage;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.b.l;
import org.json.JSONObject;

public final class ShareWebToChatMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91308a = new a((byte) 0);

    static {
        Covode.recordClassIndex(57467);
    }

    private ShareWebToChatMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57468);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ ShareWebToChatMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public ShareWebToChatMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    static final class b<T> implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseCommonJavaMethod.a f91309a;

        static {
            Covode.recordClassIndex(57469);
        }

        b(BaseCommonJavaMethod.a aVar) {
            this.f91309a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.base.c
        public final /* synthetic */ void a(Object obj) {
            Boolean bool = (Boolean) obj;
            com.ss.android.ugc.aweme.framework.a.a.a(4, "ShareWebToChatMethod", "success ".concat(String.valueOf(bool)));
            BaseCommonJavaMethod.a aVar = this.f91309a;
            if (aVar != null) {
                l.b(bool, "");
                aVar.a(null, bool.booleanValue() ? 1 : 0, "callback");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: com.ss.android.ugc.aweme.im.service.model.IMConversation */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        IMUser iMUser;
        if (jSONObject != null) {
            int optInt = jSONObject.optInt(StringSet.type);
            if (optInt == 1) {
                String optString = jSONObject.optString("uid");
                IMUser iMUser2 = new IMUser();
                iMUser2.setUid(optString);
                iMUser = iMUser2;
            } else if (optInt == 2) {
                String optString2 = jSONObject.optString("cid");
                IMConversation iMConversation = new IMConversation();
                iMConversation.setConversationId(optString2);
                iMUser = iMConversation;
            } else if (aVar != null) {
                aVar.a(0, "unknown type");
                return;
            } else {
                return;
            }
            Activity j2 = f.j();
            if (j2 != null) {
                try {
                    String string = jSONObject.getString("title");
                    String string2 = jSONObject.getString("desc");
                    String string3 = jSONObject.getString("pic_url");
                    String string4 = jSONObject.getString("web_url");
                    String optString3 = jSONObject.optString("enter_from");
                    String optString4 = jSONObject.optString("message_type");
                    com.ss.android.ugc.aweme.framework.a.a.a(4, "ShareWebToChatMethod", "start to share ");
                    IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                    SharePackage.a a2 = new SharePackage.a().a("web");
                    l.b(string, "");
                    SharePackage.a c2 = a2.c(string);
                    l.b(string2, "");
                    SharePackage.a d2 = c2.d(string2);
                    l.b(string4, "");
                    SharePackage.a e2 = d2.e(string4);
                    l.b(optString3, "");
                    SharePackage.a a3 = e2.a("enter_from", optString3);
                    l.b(optString4, "");
                    ImWebSharePackage imWebSharePackage = new ImWebSharePackage(a3.a("message_type", optString4));
                    imWebSharePackage.f103936a = string3;
                    imWebSharePackage.f103937b = false;
                    imWebSharePackage.f124595i.putString("thumb_url", imWebSharePackage.f103936a);
                    createIIMServicebyMonsterPlugin.shareSingleMsg(j2, iMUser, imWebSharePackage, new b(aVar));
                } catch (Exception e3) {
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e3);
                    if (aVar != null) {
                        aVar.a(0, "catch exception:" + e3.getMessage());
                    }
                }
            } else if (aVar != null) {
                aVar.a(0, "activity is null");
            }
        } else if (aVar != null) {
            aVar.a(0, "no params found");
        }
    }
}
